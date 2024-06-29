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

@OriginalClass("client!kd")
public class class295 implements class337 {
   @OriginalMember(
      owner = "client!kd",
      name = "l",
      descriptor = "[Lcom/ms/directX/DirectSoundBuffer;"
   )
   private DirectSoundBuffer[] field4097 = new DirectSoundBuffer[2];
   @OriginalMember(
      owner = "client!kd",
      name = "j",
      descriptor = "[[B"
   )
   private byte[][] field4099 = new byte[2][];
   @OriginalMember(
      owner = "client!kd",
      name = "b",
      descriptor = "[I"
   )
   private int[] field4103 = new int[2];
   @OriginalMember(
      owner = "client!kd",
      name = "c",
      descriptor = "[Lcom/ms/directX/DSCursors;"
   )
   private DSCursors[] field4105 = new DSCursors[2];
   @OriginalMember(
      owner = "client!kd",
      name = "h",
      descriptor = "[Lcom/ms/directX/DSBufferDesc;"
   )
   private DSBufferDesc[] field4104 = new DSBufferDesc[2];
   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "[I"
   )
   private int[] field4106 = new int[2];
   @OriginalMember(
      owner = "client!kd",
      name = "d",
      descriptor = "[Z"
   )
   private boolean[] field4096 = new boolean[2];
   @OriginalMember(
      owner = "client!kd",
      name = "g",
      descriptor = "Lcom/ms/directX/DirectSound;"
   )
   private DirectSound field4101 = new DirectSound();
   @OriginalMember(
      owner = "client!kd",
      name = "e",
      descriptor = "Lcom/ms/directX/WaveFormatEx;"
   )
   private WaveFormatEx field4100 = new WaveFormatEx();
   @OriginalMember(
      owner = "client!kd",
      name = "m",
      descriptor = "I"
   )
   private int field4095;
   @OriginalMember(
      owner = "client!kd",
      name = "k",
      descriptor = "I"
   )
   private int field4098;
   @OriginalMember(
      owner = "client!kd",
      name = "i",
      descriptor = "I"
   )
   private int field4102;
   @OriginalMember(
      owner = "client!kd",
      name = "f",
      descriptor = "[I"
   )
   private int[] field4094;

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(ZILjava/awt/Component;I)V",
      line = 4
   )
   public final void method2244(boolean arg0, int arg1, Component arg2, int arg3) throws Exception {
      if (this.field4095 == 0) {
         if (arg1 >= 8000 && ~arg1 >= -48001) {
            this.field4098 = arg0 ? 2 : 1;
            this.field4102 = arg0 ? 4 : 2;
            this.field4094 = new int[this.field4098 * 256];
            this.field4101.initialize((_Guid)null);
            this.field4101.setCooperativeLevel(arg2, 2);

            for(int var5 = 0; ~var5 > -3; ++var5) {
               this.field4104[var5].flags = 16384;
            }

            this.field4100.formatTag = 1;
            this.field4095 = arg1;
            this.field4100.channels = this.field4098;
            this.field4100.avgBytesPerSec = this.field4102 * arg1;
            this.field4100.blockAlign = this.field4102;
            this.field4100.samplesPerSec = arg1;
            this.field4100.bitsPerSample = 16;
            int var6 = 28 % (-arg3 / 49);
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(BI)I",
      line = 44
   )
   public final int method2245(byte arg0, int arg1) {
      if (arg0 != 9) {
         this.field4100 = null;
      }

      if (!this.field4096[arg1]) {
         return 0;
      } else {
         this.field4097[arg1].getCurrentPosition(this.field4105[arg1]);
         int var3 = this.field4105[arg1].write / this.field4102;
         int var4 = 65535 & this.field4106[arg1] - var3;
         if (this.field4103[arg1] < var4) {
            for(int var5 = 65535 & -this.field4106[arg1] + var3; var5 > 0; var5 -= 256) {
               this.method2248(arg1, this.field4094);
            }

            var4 = 65535 & this.field4106[arg1] - var3;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "<init>",
      descriptor = "()V",
      line = 197
   )
   public class295() throws Exception {
      for(int var1 = 0; var1 < 2; ++var1) {
         this.field4104[var1] = new DSBufferDesc();
      }

      for(int var2 = 0; ~var2 > -3; ++var2) {
         this.field4105[var2] = new DSCursors();
      }

   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(IB)V",
      line = 84
   )
   public final void method2246(int arg0, byte arg1) {
      if (this.field4097[arg0] != null) {
         try {
            this.field4097[arg0].stop();
         } catch (ComFailException var3) {
         }

         this.field4097[arg0] = null;
      }

      if (arg1 != 47) {
         this.method2245((byte)96, 105);
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(ZI)V",
      line = 109
   )
   public final void method2247(boolean arg0, int arg1) {
      this.field4097[arg1].stop();
      this.field4096[arg1] = false;
      this.field4097[arg1].setCurrentPosition(0);
      if (arg0) {
         this.field4106[arg1] = 0;
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(I[I)V",
      line = 123
   )
   public final void method2248(int arg0, int[] arg1) {
      int var3 = arg1.length;
      if (this.field4098 * 256 != var3) {
         throw new IllegalArgumentException();
      } else {
         int var4 = this.field4106[arg0] * this.field4102;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & -16777216) != 0) {
               var6 = 8388607 ^ var6 >> 31;
            }

            this.field4099[arg0][var5 * 2 + var4] = (byte)(var6 >> 8);
            this.field4099[arg0][var5 * 2 + var4 + 1] = (byte)(var6 >> 16);
         }

         this.field4097[arg0].writeBuffer(var4, var3 * 2, this.field4099[arg0], 0);
         this.field4106[arg0] = var3 / this.field4098 + this.field4106[arg0] & 65535;
         if (!this.field4096[arg0]) {
            this.field4097[arg0].play(1);
            this.field4096[arg0] = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(IBI)V",
      line = 154
   )
   public final void method2249(int arg0, byte arg1, int arg2) throws Exception {
      if (~this.field4095 != -1 && this.field4097[arg0] == null) {
         int var4 = this.field4102 * 65536;
         if (this.field4099[arg0] == null || this.field4099[arg0].length != var4) {
            this.field4099[arg0] = new byte[var4];
            this.field4104[arg0].bufferBytes = var4;
         }

         this.field4097[arg0] = this.field4101.createSoundBuffer(this.field4104[arg0], this.field4100);
         this.field4096[arg0] = false;
         this.field4106[arg0] = 0;
         if (arg1 >= 30) {
            this.field4103[arg0] = arg2;
         }
      } else {
         throw new IllegalStateException();
      }
   }
}
