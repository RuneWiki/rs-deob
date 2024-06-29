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

@OriginalClass("client!om")
public class class773 implements class216 {
   @OriginalMember(
      owner = "client!om",
      name = "j",
      descriptor = "[I"
   )
   private int[] field11363 = new int[2];
   @OriginalMember(
      owner = "client!om",
      name = "e",
      descriptor = "[Lcom/ms/directX/DSCursors;"
   )
   private DSCursors[] field11365 = new DSCursors[2];
   @OriginalMember(
      owner = "client!om",
      name = "g",
      descriptor = "[Z"
   )
   private boolean[] field11366 = new boolean[2];
   @OriginalMember(
      owner = "client!om",
      name = "h",
      descriptor = "[[B"
   )
   private byte[][] field11371 = new byte[2][];
   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "[I"
   )
   private int[] field11367 = new int[2];
   @OriginalMember(
      owner = "client!om",
      name = "m",
      descriptor = "[Lcom/ms/directX/DirectSoundBuffer;"
   )
   private DirectSoundBuffer[] field11372 = new DirectSoundBuffer[2];
   @OriginalMember(
      owner = "client!om",
      name = "i",
      descriptor = "[Lcom/ms/directX/DSBufferDesc;"
   )
   private DSBufferDesc[] field11375 = new DSBufferDesc[2];
   @OriginalMember(
      owner = "client!om",
      name = "k",
      descriptor = "Lcom/ms/directX/DirectSound;"
   )
   private DirectSound field11373 = new DirectSound();
   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "Lcom/ms/directX/WaveFormatEx;"
   )
   private WaveFormatEx field11374 = new WaveFormatEx();
   @OriginalMember(
      owner = "client!om",
      name = "f",
      descriptor = "I"
   )
   private int field11364;
   @OriginalMember(
      owner = "client!om",
      name = "c",
      descriptor = "I"
   )
   private int field11368;
   @OriginalMember(
      owner = "client!om",
      name = "l",
      descriptor = "I"
   )
   private int field11369;
   @OriginalMember(
      owner = "client!om",
      name = "d",
      descriptor = "[I"
   )
   private int[] field11370;

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method1876(int arg0, byte arg1, int arg2) throws Exception {
      if (~this.field11364 != -1 && this.field11372[arg0] == null) {
         if (arg1 >= -65) {
            this.field11368 = 7;
         }

         int var4 = this.field11368 * 65536;
         if (this.field11371[arg0] == null || ~this.field11371[arg0].length != ~var4) {
            this.field11371[arg0] = new byte[var4];
            this.field11375[arg0].bufferBytes = var4;
         }

         this.field11372[arg0] = this.field11373.createSoundBuffer(this.field11375[arg0], this.field11374);
         this.field11366[arg0] = false;
         this.field11367[arg0] = 0;
         this.field11363[arg0] = arg2;
      } else {
         throw new IllegalStateException();
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method1871(int arg0, int arg1) {
      if (!this.field11366[arg0]) {
         return 0;
      } else {
         if (arg1 != 24632) {
            this.field11368 = 60;
         }

         this.field11372[arg0].getCurrentPosition(this.field11365[arg0]);
         int var3 = this.field11365[arg0].write / this.field11368;
         int var4 = 65535 & this.field11367[arg0] + -var3;
         if (this.field11363[arg0] < var4) {
            for(int var5 = var3 - this.field11367[arg0] & 65535; ~var5 < -1; var5 -= 256) {
               this.method1875(arg0, this.field11370);
            }

            var4 = this.field11367[arg0] + -var3 & 65535;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method1872(int arg0, byte arg1) {
      if (arg1 != -50) {
         this.method1875(-101, (int[])null);
      }

      if (this.field11372[arg0] != null) {
         try {
            this.field11372[arg0].stop();
         } catch (ComFailException var3) {
         }

         this.field11372[arg0] = null;
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method1873(byte arg0, int arg1) {
      this.field11372[arg1].stop();
      this.field11366[arg1] = false;
      this.field11372[arg1].setCurrentPosition(0);
      this.field11367[arg1] = 0;
      if (arg0 > -39) {
         this.method1871(-25, 44);
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method1875(int arg0, int[] arg1) {
      int var3 = arg1.length;
      if (this.field11369 * 256 != var3) {
         throw new IllegalArgumentException();
      } else {
         int var4 = this.field11367[arg0] * this.field11368;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & -16777216) != 0) {
               var6 = 8388607 ^ var6 >> 31;
            }

            this.field11371[arg0][var5 * 2 + var4] = (byte)(var6 >> 8);
            this.field11371[arg0][var5 * 2 + var4 + 1] = (byte)(var6 >> 16);
         }

         this.field11372[arg0].writeBuffer(var4, var3 * 2, this.field11371[arg0], 0);
         this.field11367[arg0] = var3 / this.field11369 + this.field11367[arg0] & 65535;
         if (!this.field11366[arg0]) {
            this.field11372[arg0].play(1);
            this.field11366[arg0] = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(IIZLjava/awt/Component;)V"
   )
   public final void method1874(int arg0, int arg1, boolean arg2, Component arg3) throws Exception {
      if (this.field11364 == 0) {
         if (arg1 >= 8000 && ~arg1 >= -48001) {
            this.field11369 = !arg2 ? 1 : 2;
            this.field11368 = arg2 ? 4 : 2;
            this.field11370 = new int[this.field11369 * arg0];
            this.field11373.initialize((_Guid)null);
            this.field11373.setCooperativeLevel(arg3, 2);

            for(int var5 = 0; ~var5 > -3; ++var5) {
               this.field11375[var5].flags = 16384;
            }

            this.field11374.blockAlign = this.field11368;
            this.field11374.avgBytesPerSec = this.field11368 * arg1;
            this.field11374.samplesPerSec = arg1;
            this.field11374.channels = this.field11369;
            this.field11374.bitsPerSample = 16;
            this.field11364 = arg1;
            this.field11374.formatTag = 1;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "<init>",
      descriptor = "()V"
   )
   public class773() throws Exception {
      for(int var1 = 0; var1 < 2; ++var1) {
         this.field11375[var1] = new DSBufferDesc();
      }

      for(int var2 = 0; var2 < 2; ++var2) {
         this.field11365[var2] = new DSCursors();
      }

   }
}
