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

@OriginalClass("client!uh")
public class class176 implements class541 {
   @OriginalMember(
      owner = "client!uh",
      name = "h",
      descriptor = "[I"
   )
   private int[] field2184 = new int[2];
   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "[[B"
   )
   private byte[][] field2183 = new byte[2][];
   @OriginalMember(
      owner = "client!uh",
      name = "f",
      descriptor = "[Lcom/ms/directX/DSBufferDesc;"
   )
   private DSBufferDesc[] field2186 = new DSBufferDesc[2];
   @OriginalMember(
      owner = "client!uh",
      name = "i",
      descriptor = "[Z"
   )
   private boolean[] field2191 = new boolean[2];
   @OriginalMember(
      owner = "client!uh",
      name = "d",
      descriptor = "[I"
   )
   private int[] field2192 = new int[2];
   @OriginalMember(
      owner = "client!uh",
      name = "j",
      descriptor = "[Lcom/ms/directX/DirectSoundBuffer;"
   )
   private DirectSoundBuffer[] field2194 = new DirectSoundBuffer[2];
   @OriginalMember(
      owner = "client!uh",
      name = "e",
      descriptor = "[Lcom/ms/directX/DSCursors;"
   )
   private DSCursors[] field2193 = new DSCursors[2];
   @OriginalMember(
      owner = "client!uh",
      name = "c",
      descriptor = "Lcom/ms/directX/DirectSound;"
   )
   private DirectSound field2190 = new DirectSound();
   @OriginalMember(
      owner = "client!uh",
      name = "k",
      descriptor = "Lcom/ms/directX/WaveFormatEx;"
   )
   private WaveFormatEx field2185 = new WaveFormatEx();
   @OriginalMember(
      owner = "client!uh",
      name = "m",
      descriptor = "I"
   )
   private int field2182;
   @OriginalMember(
      owner = "client!uh",
      name = "g",
      descriptor = "I"
   )
   private int field2188;
   @OriginalMember(
      owner = "client!uh",
      name = "l",
      descriptor = "I"
   )
   private int field2189;
   @OriginalMember(
      owner = "client!uh",
      name = "b",
      descriptor = "[I"
   )
   private int[] field2187;

   @OriginalMember(
      owner = "client!uh",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method1363(int arg0, int arg1) {
      if (arg1 != -32290) {
         this.field2183 = null;
      }

      if (this.field2194[arg0] != null) {
         try {
            this.field2194[arg0].stop();
         } catch (ComFailException var3) {
         }

         this.field2194[arg0] = null;
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method1364(byte arg0, int arg1) {
      this.field2194[arg1].stop();
      this.field2191[arg1] = false;
      this.field2194[arg1].setCurrentPosition(0);
      if (arg0 >= 94) {
         this.field2192[arg1] = 0;
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method1365(int arg0, int[] arg1) {
      int var3 = arg1.length;
      if (this.field2188 * 256 != var3) {
         throw new IllegalArgumentException();
      } else {
         int var4 = this.field2192[arg0] * this.field2182;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & -16777216) != 0) {
               var6 = 8388607 ^ var6 >> 31;
            }

            this.field2183[arg0][var5 * 2 + var4] = (byte)(var6 >> 8);
            this.field2183[arg0][var5 * 2 + var4 + 1] = (byte)(var6 >> 16);
         }

         this.field2194[arg0].writeBuffer(var4, var3 * 2, this.field2183[arg0], 0);
         this.field2192[arg0] = var3 / this.field2188 + this.field2192[arg0] & 65535;
         if (!this.field2191[arg0]) {
            this.field2194[arg0].play(1);
            this.field2191[arg0] = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(Ljava/awt/Component;IZI)V"
   )
   public final void method1366(Component arg0, int arg1, boolean arg2, int arg3) throws Exception {
      if (this.field2189 == 0) {
         int var5 = -10 / ((arg1 - -5) / 58);
         if (arg3 >= 8000 && ~arg3 >= -48001) {
            this.field2182 = !arg2 ? 2 : 4;
            this.field2188 = !arg2 ? 1 : 2;
            this.field2187 = new int[this.field2188 * 256];
            this.field2190.initialize((_Guid)null);
            this.field2190.setCooperativeLevel(arg0, 2);

            for(int var6 = 0; ~var6 > -3; ++var6) {
               this.field2186[var6].flags = 16384;
            }

            this.field2185.formatTag = 1;
            this.field2185.avgBytesPerSec = this.field2182 * arg3;
            this.field2185.bitsPerSample = 16;
            this.field2185.channels = this.field2188;
            this.field2185.blockAlign = this.field2182;
            this.field2189 = arg3;
            this.field2185.samplesPerSec = arg3;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method1367(int arg0, int arg1, byte arg2) throws Exception {
      if (~this.field2189 != -1 && this.field2194[arg0] == null) {
         int var4 = this.field2182 * 65536;
         if (this.field2183[arg0] == null || this.field2183[arg0].length != var4) {
            this.field2183[arg0] = new byte[var4];
            this.field2186[arg0].bufferBytes = var4;
         }

         this.field2194[arg0] = this.field2190.createSoundBuffer(this.field2186[arg0], this.field2185);
         this.field2191[arg0] = false;
         this.field2192[arg0] = 0;
         this.field2184[arg0] = arg1;
         if (arg2 > -64) {
            this.method1363(-99, -5);
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method1368(int arg0, int arg1) {
      if (!this.field2191[arg0]) {
         return 0;
      } else {
         this.field2194[arg0].getCurrentPosition(this.field2193[arg0]);
         int var3 = this.field2193[arg0].write / this.field2182;
         int var4 = 65535 & this.field2192[arg0] - var3;
         if (~this.field2184[arg0] > ~var4) {
            for(int var5 = var3 - this.field2192[arg0] & 65535; var5 > 0; var5 -= 256) {
               this.method1365(arg0, this.field2187);
            }

            var4 = this.field2192[arg0] + -var3 & 65535;
         }

         return arg1 != 256 ? -119 : var4;
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "<init>",
      descriptor = "()V"
   )
   public class176() throws Exception {
      for(int var1 = 0; var1 < 2; ++var1) {
         this.field2186[var1] = new DSBufferDesc();
      }

      for(int var2 = 0; ~var2 > -3; ++var2) {
         this.field2193[var2] = new DSCursors();
      }

   }
}
