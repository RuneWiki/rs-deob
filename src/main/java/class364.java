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

@OriginalClass("client!ow")
public class class364 implements class336 {
   @OriginalMember(
      owner = "client!ow",
      name = "i",
      descriptor = "[[B"
   )
   private byte[][] field5432 = new byte[2][];
   @OriginalMember(
      owner = "client!ow",
      name = "f",
      descriptor = "[I"
   )
   private int[] field5428 = new int[2];
   @OriginalMember(
      owner = "client!ow",
      name = "k",
      descriptor = "[Lcom/ms/directX/DSCursors;"
   )
   private DSCursors[] field5435 = new DSCursors[2];
   @OriginalMember(
      owner = "client!ow",
      name = "b",
      descriptor = "[Lcom/ms/directX/DirectSoundBuffer;"
   )
   private DirectSoundBuffer[] field5439 = new DirectSoundBuffer[2];
   @OriginalMember(
      owner = "client!ow",
      name = "e",
      descriptor = "[Lcom/ms/directX/DSBufferDesc;"
   )
   private DSBufferDesc[] field5437 = new DSBufferDesc[2];
   @OriginalMember(
      owner = "client!ow",
      name = "c",
      descriptor = "[Z"
   )
   private boolean[] field5433 = new boolean[2];
   @OriginalMember(
      owner = "client!ow",
      name = "g",
      descriptor = "[I"
   )
   private int[] field5440 = new int[2];
   @OriginalMember(
      owner = "client!ow",
      name = "j",
      descriptor = "Lcom/ms/directX/DirectSound;"
   )
   private DirectSound field5434 = new DirectSound();
   @OriginalMember(
      owner = "client!ow",
      name = "m",
      descriptor = "Lcom/ms/directX/WaveFormatEx;"
   )
   private WaveFormatEx field5431 = new WaveFormatEx();
   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "I"
   )
   private int field5429;
   @OriginalMember(
      owner = "client!ow",
      name = "l",
      descriptor = "I"
   )
   private int field5436;
   @OriginalMember(
      owner = "client!ow",
      name = "h",
      descriptor = "I"
   )
   private int field5438;
   @OriginalMember(
      owner = "client!ow",
      name = "d",
      descriptor = "[I"
   )
   private int[] field5430;

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method2608(int arg0, int arg1) {
      if (!this.field5433[arg0]) {
         return 0;
      } else {
         this.field5439[arg0].getCurrentPosition(this.field5435[arg0]);
         if (arg1 != 256) {
            this.field5437 = null;
         }

         int var3 = this.field5435[arg0].write / this.field5429;
         int var4 = this.field5428[arg0] - var3 & 65535;
         if (this.field5440[arg0] < var4) {
            for(int var5 = -this.field5428[arg0] + var3 & 65535; ~var5 < -1; var5 -= 256) {
               this.method2607(arg0, this.field5430);
            }

            var4 = this.field5428[arg0] - var3 & 65535;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method2607(int arg0, int[] arg1) {
      int var3 = arg1.length;
      if (this.field5438 * 256 != var3) {
         throw new IllegalArgumentException();
      } else {
         int var4 = this.field5428[arg0] * this.field5429;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & -16777216) != 0) {
               var6 = 8388607 ^ var6 >> 31;
            }

            this.field5432[arg0][var5 * 2 + var4] = (byte)(var6 >> 8);
            this.field5432[arg0][var5 * 2 + var4 + 1] = (byte)(var6 >> 16);
         }

         this.field5439[arg0].writeBuffer(var4, var3 * 2, this.field5432[arg0], 0);
         this.field5428[arg0] = var3 / this.field5438 + this.field5428[arg0] & 65535;
         if (!this.field5433[arg0]) {
            this.field5439[arg0].play(1);
            this.field5433[arg0] = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2610(int arg0, int arg1) {
      this.field5439[arg1].stop();
      this.field5433[arg1] = false;
      this.field5439[arg1].setCurrentPosition(0);
      if (arg0 <= -88) {
         this.field5428[arg1] = 0;
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2611(int arg0, byte arg1) {
      int var3 = 82 % ((85 - arg1) / 38);
      if (this.field5439[arg0] != null) {
         try {
            this.field5439[arg0].stop();
         } catch (ComFailException var4) {
         }

         this.field5439[arg0] = null;
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(IZLjava/awt/Component;I)V"
   )
   public final void method2606(int arg0, boolean arg1, Component arg2, int arg3) throws Exception {
      if (~this.field5436 == -1) {
         if (~arg0 <= -8001 && ~arg0 >= -48001) {
            this.field5438 = !arg1 ? 1 : 2;
            this.field5429 = arg1 ? 4 : 2;
            this.field5430 = new int[this.field5438 * 256];
            this.field5434.initialize((_Guid)null);
            this.field5434.setCooperativeLevel(arg2, 2);

            for(int var5 = 0; var5 < 2; ++var5) {
               this.field5437[var5].flags = 16384;
            }

            this.field5431.blockAlign = this.field5429;
            this.field5431.channels = this.field5438;
            this.field5436 = arg0;
            this.field5431.avgBytesPerSec = this.field5429 * arg0;
            this.field5431.bitsPerSample = 16;
            this.field5431.samplesPerSec = arg0;
            this.field5431.formatTag = arg3;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2609(int arg0, int arg1, int arg2) throws Exception {
      if (this.field5436 != 0 && this.field5439[arg2] == null) {
         int var4 = this.field5429 * 65536;
         if (this.field5432[arg2] == null || ~this.field5432[arg2].length != ~var4) {
            this.field5432[arg2] = new byte[var4];
            this.field5437[arg2].bufferBytes = var4;
         }

         this.field5439[arg2] = this.field5434.createSoundBuffer(this.field5437[arg2], this.field5431);
         this.field5433[arg2] = false;
         this.field5428[arg2] = 0;
         if (arg0 < -63) {
            this.field5440[arg2] = arg1;
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "<init>",
      descriptor = "()V"
   )
   public class364() throws Exception {
      for(int var1 = 0; ~var1 > -3; ++var1) {
         this.field5437[var1] = new DSBufferDesc();
      }

      for(int var2 = 0; ~var2 > -3; ++var2) {
         this.field5435[var2] = new DSCursors();
      }

   }
}
