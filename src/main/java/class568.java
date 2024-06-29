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

@OriginalClass("client!mia")
public class class568 implements class475 {
   @OriginalMember(
      owner = "client!mia",
      name = "l",
      descriptor = "[I"
   )
   private int[] field8056 = new int[2];
   @OriginalMember(
      owner = "client!mia",
      name = "f",
      descriptor = "[Lcom/ms/directX/DirectSoundBuffer;"
   )
   private DirectSoundBuffer[] field8061 = new DirectSoundBuffer[2];
   @OriginalMember(
      owner = "client!mia",
      name = "m",
      descriptor = "[Z"
   )
   private boolean[] field8063 = new boolean[2];
   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "[Lcom/ms/directX/DSBufferDesc;"
   )
   private DSBufferDesc[] field8065 = new DSBufferDesc[2];
   @OriginalMember(
      owner = "client!mia",
      name = "i",
      descriptor = "[[B"
   )
   private byte[][] field8060 = new byte[2][];
   @OriginalMember(
      owner = "client!mia",
      name = "h",
      descriptor = "[I"
   )
   private int[] field8064 = new int[2];
   @OriginalMember(
      owner = "client!mia",
      name = "e",
      descriptor = "[Lcom/ms/directX/DSCursors;"
   )
   private DSCursors[] field8062 = new DSCursors[2];
   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "Lcom/ms/directX/DirectSound;"
   )
   private DirectSound field8058 = new DirectSound();
   @OriginalMember(
      owner = "client!mia",
      name = "k",
      descriptor = "Lcom/ms/directX/WaveFormatEx;"
   )
   private WaveFormatEx field8059 = new WaveFormatEx();
   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "I"
   )
   private int field8055;
   @OriginalMember(
      owner = "client!mia",
      name = "j",
      descriptor = "I"
   )
   private int field8066;
   @OriginalMember(
      owner = "client!mia",
      name = "d",
      descriptor = "I"
   )
   private int field8067;
   @OriginalMember(
      owner = "client!mia",
      name = "g",
      descriptor = "[I"
   )
   private int[] field8057;

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method3648(int arg0, int arg1, int arg2) throws Exception {
      if (~this.field8066 != -1 && this.field8061[arg0] == null) {
         if (arg1 >= -93) {
            this.method3649(38, 123);
         }

         int var4 = this.field8067 * 65536;
         if (this.field8060[arg0] == null || ~this.field8060[arg0].length != ~var4) {
            this.field8060[arg0] = new byte[var4];
            this.field8065[arg0].bufferBytes = var4;
         }

         this.field8061[arg0] = this.field8058.createSoundBuffer(this.field8065[arg0], this.field8059);
         this.field8063[arg0] = false;
         this.field8056[arg0] = 0;
         this.field8064[arg0] = arg2;
      } else {
         throw new IllegalStateException();
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method3649(int arg0, int arg1) {
      if (!this.field8063[arg1]) {
         return 0;
      } else {
         this.field8061[arg1].getCurrentPosition(this.field8062[arg1]);
         int var3 = this.field8062[arg1].write / this.field8067;
         if (arg0 <= 18) {
            return -64;
         } else {
            int var4 = this.field8056[arg1] + -var3 & 65535;
            if (~this.field8064[arg1] > ~var4) {
               int var5 = 65535 & -this.field8056[arg1] + var3;

               while(var5 > 0) {
                  var5 -= 256;
                  this.method3650(arg1, this.field8057);
               }

               var4 = 65535 & this.field8056[arg1] - var3;
            }

            return var4;
         }
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method3650(int arg0, int[] arg1) {
      int var3 = arg1.length;
      if (this.field8055 * 256 != var3) {
         throw new IllegalArgumentException();
      } else {
         int var4 = this.field8056[arg0] * this.field8067;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & -16777216) != 0) {
               var6 = 8388607 ^ var6 >> 31;
            }

            this.field8060[arg0][var5 * 2 + var4] = (byte)(var6 >> 8);
            this.field8060[arg0][var5 * 2 + var4 + 1] = (byte)(var6 >> 16);
         }

         this.field8061[arg0].writeBuffer(var4, var3 * 2, this.field8060[arg0], 0);
         this.field8056[arg0] = var3 / this.field8055 + this.field8056[arg0] & 65535;
         if (!this.field8063[arg0]) {
            this.field8061[arg0].play(1);
            this.field8063[arg0] = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3646(int arg0, int arg1) {
      this.field8061[arg1].stop();
      this.field8063[arg1] = false;
      this.field8061[arg1].setCurrentPosition(arg0);
      this.field8056[arg1] = 0;
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(BZILjava/awt/Component;)V"
   )
   public final void method3647(byte arg0, boolean arg1, int arg2, Component arg3) throws Exception {
      if (~this.field8066 == -1) {
         if (~arg2 <= -8001 && arg2 <= 48000) {
            this.field8067 = !arg1 ? 2 : 4;
            this.field8055 = arg1 ? 2 : 1;
            this.field8057 = new int[this.field8055 * 256];
            this.field8058.initialize((_Guid)null);
            this.field8058.setCooperativeLevel(arg3, 2);

            for(int var5 = 0; var5 < 2; ++var5) {
               this.field8065[var5].flags = 16384;
            }

            this.field8059.channels = this.field8055;
            this.field8059.blockAlign = this.field8067;
            this.field8066 = arg2;
            int var6 = 59 / ((arg0 - 21) / 54);
            this.field8059.bitsPerSample = 16;
            this.field8059.avgBytesPerSec = this.field8067 * arg2;
            this.field8059.samplesPerSec = arg2;
            this.field8059.formatTag = 1;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3645(int arg0, byte arg1) {
      if (this.field8061[arg0] != null) {
         try {
            this.field8061[arg0].stop();
         } catch (ComFailException var4) {
         }

         this.field8061[arg0] = null;
      }

      int var3 = -31 % ((arg1 - -36) / 50);
   }

   @OriginalMember(
      owner = "client!mia",
      name = "<init>",
      descriptor = "()V"
   )
   public class568() throws Exception {
      for(int var1 = 0; ~var1 > -3; ++var1) {
         this.field8065[var1] = new DSBufferDesc();
      }

      for(int var2 = 0; var2 < 2; ++var2) {
         this.field8062[var2] = new DSCursors();
      }

   }
}
