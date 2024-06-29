import com.ms.com.ComFailException;
import com.ms.com._Guid;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class448 implements class323 {
   @OriginalMember(
      owner = "client!un",
      name = "m",
      descriptor = "[Z"
   )
   private boolean[] field6362 = new boolean[2];
   @OriginalMember(
      owner = "client!un",
      name = "d",
      descriptor = "[I"
   )
   private int[] field6363 = new int[2];
   @OriginalMember(
      owner = "client!un",
      name = "g",
      descriptor = "[I"
   )
   private int[] field6365 = new int[2];
   @OriginalMember(
      owner = "client!un",
      name = "i",
      descriptor = "[[B"
   )
   private byte[][] field6366 = new byte[2][];
   @OriginalMember(
      owner = "client!un",
      name = "e",
      descriptor = "[Lcom/ms/directX/DSBufferDesc;"
   )
   private DSBufferDesc[] field6370 = new DSBufferDesc[2];
   @OriginalMember(
      owner = "client!un",
      name = "f",
      descriptor = "[Lcom/ms/directX/DSCursors;"
   )
   private DSCursors[] field6367 = new DSCursors[2];
   @OriginalMember(
      owner = "client!un",
      name = "k",
      descriptor = "[Lcom/ms/directX/DirectSoundBuffer;"
   )
   private DirectSoundBuffer[] field6373 = new DirectSoundBuffer[2];
   @OriginalMember(
      owner = "client!un",
      name = "c",
      descriptor = "Lcom/ms/directX/DirectSound;"
   )
   private DirectSound field6372 = new DirectSound();
   @OriginalMember(
      owner = "client!un",
      name = "j",
      descriptor = "Lcom/ms/directX/WaveFormatEx;"
   )
   private WaveFormatEx field6361 = new WaveFormatEx();
   @OriginalMember(
      owner = "client!un",
      name = "l",
      descriptor = "I"
   )
   private int field6364;
   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "I"
   )
   private int field6368;
   @OriginalMember(
      owner = "client!un",
      name = "h",
      descriptor = "I"
   )
   private int field6369;
   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "[I"
   )
   private int[] field6371;

   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method2398(int arg0, int arg1) {
      if (!this.field6362[arg1]) {
         return 0;
      } else {
         this.field6373[arg1].getCurrentPosition(this.field6367[arg1]);
         int var3 = this.field6367[arg1].write / this.field6368;
         int var4 = this.field6363[arg1] - var3 & 65535;
         if (arg0 != 8) {
            return -35;
         } else {
            if (this.field6365[arg1] < var4) {
               int var5 = 65535 & -this.field6363[arg1] + var3;

               while(var5 > 0) {
                  var5 -= 256;
                  this.method2396(arg1, this.field6371);
               }

               var4 = 65535 & this.field6363[arg1] + -var3;
            }

            return var4;
         }
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2397(int arg0, int arg1, int arg2) throws Exception {
      if (this.field6369 != 0 && this.field6373[arg2] == null) {
         int var4 = this.field6368 * 65536;
         if (this.field6366[arg2] == null || this.field6366[arg2].length != var4) {
            this.field6366[arg2] = new byte[var4];
            this.field6370[arg2].bufferBytes = var4;
         }

         this.field6373[arg2] = this.field6372.createSoundBuffer(this.field6370[arg2], this.field6361);
         if (arg0 < 50) {
            this.method2398(-123, -99);
         }

         this.field6362[arg2] = false;
         this.field6363[arg2] = 0;
         this.field6365[arg2] = arg1;
      } else {
         throw new IllegalStateException();
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method2394(int arg0, boolean arg1) {
      if (!arg1) {
         this.method2394(-22, true);
      }

      if (this.field6373[arg0] != null) {
         try {
            this.field6373[arg0].stop();
         } catch (ComFailException var3) {
         }

         this.field6373[arg0] = null;
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2395(int arg0, int arg1) {
      this.field6373[arg0].stop();
      this.field6362[arg0] = false;
      if (arg1 > 10) {
         this.field6373[arg0].setCurrentPosition(0);
         this.field6363[arg0] = 0;
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(IILjava/awt/Component;Z)V"
   )
   public final void method2393(int arg0, int arg1, Component arg2, boolean arg3) throws Exception {
      if (this.field6369 == 0) {
         if (~arg1 <= -8001 && ~arg1 >= -48001) {
            this.field6368 = arg3 ? 4 : 2;
            this.field6364 = !arg3 ? 1 : 2;
            this.field6371 = new int[this.field6364 * 256];
            this.field6372.initialize((_Guid)null);
            this.field6372.setCooperativeLevel(arg2, 2);
            int var5 = -30 % ((arg0 - -3) / 44);

            for(int var6 = 0; var6 < 2; ++var6) {
               this.field6370[var6].flags = 16384;
            }

            this.field6361.samplesPerSec = arg1;
            this.field6361.channels = this.field6364;
            this.field6361.bitsPerSample = 16;
            this.field6361.avgBytesPerSec = this.field6368 * arg1;
            this.field6369 = arg1;
            this.field6361.formatTag = 1;
            this.field6361.blockAlign = this.field6368;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "<init>",
      descriptor = "()V"
   )
   public class448() throws Exception {
      for(int var1 = 0; var1 < 2; ++var1) {
         this.field6370[var1] = new DSBufferDesc();
      }

      for(int var2 = 0; var2 < 2; ++var2) {
         this.field6367[var2] = new DSCursors();
      }

   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method2396(int arg0, int[] arg1) {
      int var3 = arg1.length;
      if (this.field6364 * 256 != var3) {
         throw new IllegalArgumentException();
      } else {
         int var4 = this.field6363[arg0] * this.field6368;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & -16777216) != 0) {
               var6 = 8388607 ^ var6 >> 31;
            }

            this.field6366[arg0][var5 * 2 + var4] = (byte)(var6 >> 8);
            this.field6366[arg0][var5 * 2 + var4 + 1] = (byte)(var6 >> 16);
         }

         this.field6373[arg0].writeBuffer(var4, var3 * 2, this.field6366[arg0], 0);
         this.field6363[arg0] = var3 / this.field6364 + this.field6363[arg0] & 65535;
         if (!this.field6362[arg0]) {
            this.field6373[arg0].play(1);
            this.field6362[arg0] = true;
         }

      }
   }
}
