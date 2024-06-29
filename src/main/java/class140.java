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

@OriginalClass("client!tl")
public class class140 implements class41 {
   @OriginalMember(
      owner = "client!tl",
      name = "j",
      descriptor = "[Lcom/ms/directX/DSCursors;"
   )
   private DSCursors[] field1766 = new DSCursors[2];
   @OriginalMember(
      owner = "client!tl",
      name = "k",
      descriptor = "[Z"
   )
   private boolean[] field1765 = new boolean[2];
   @OriginalMember(
      owner = "client!tl",
      name = "g",
      descriptor = "[Lcom/ms/directX/DSBufferDesc;"
   )
   private DSBufferDesc[] field1762 = new DSBufferDesc[2];
   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "[[B"
   )
   private byte[][] field1771 = new byte[2][];
   @OriginalMember(
      owner = "client!tl",
      name = "d",
      descriptor = "[I"
   )
   private int[] field1761 = new int[2];
   @OriginalMember(
      owner = "client!tl",
      name = "h",
      descriptor = "[Lcom/ms/directX/DirectSoundBuffer;"
   )
   private DirectSoundBuffer[] field1769 = new DirectSoundBuffer[2];
   @OriginalMember(
      owner = "client!tl",
      name = "m",
      descriptor = "[I"
   )
   private int[] field1773 = new int[2];
   @OriginalMember(
      owner = "client!tl",
      name = "e",
      descriptor = "Lcom/ms/directX/DirectSound;"
   )
   private DirectSound field1767 = new DirectSound();
   @OriginalMember(
      owner = "client!tl",
      name = "f",
      descriptor = "Lcom/ms/directX/WaveFormatEx;"
   )
   private WaveFormatEx field1772 = new WaveFormatEx();
   @OriginalMember(
      owner = "client!tl",
      name = "i",
      descriptor = "I"
   )
   private int field1763;
   @OriginalMember(
      owner = "client!tl",
      name = "c",
      descriptor = "I"
   )
   private int field1768;
   @OriginalMember(
      owner = "client!tl",
      name = "l",
      descriptor = "I"
   )
   private int field1770;
   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "[I"
   )
   private int[] field1764;

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method309(int arg0, int arg1) {
      this.field1769[arg0].stop();
      this.field1765[arg0] = false;
      this.field1769[arg0].setCurrentPosition(arg1);
      this.field1773[arg0] = 0;
   }

   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method311(int arg0, int arg1) {
      if (!this.field1765[arg1]) {
         return 0;
      } else {
         this.field1769[arg1].getCurrentPosition(this.field1766[arg1]);
         if (arg0 != -14408) {
            this.field1772 = null;
         }

         int var3 = this.field1766[arg1].write / this.field1763;
         int var4 = 65535 & this.field1773[arg1] + -var3;
         if (~this.field1761[arg1] > ~var4) {
            for(int var5 = -this.field1773[arg1] + var3 & 65535; ~var5 < -1; var5 -= 256) {
               this.method307(arg1, this.field1764);
            }

            var4 = 65535 & this.field1773[arg1] + -var3;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(Ljava/awt/Component;IZZ)V"
   )
   public final void method308(Component arg0, int arg1, boolean arg2, boolean arg3) throws Exception {
      if (this.field1768 == 0) {
         if (~arg1 <= -8001 && ~arg1 >= -48001) {
            this.field1770 = !arg2 ? 1 : 2;
            this.field1763 = !arg2 ? 2 : 4;
            this.field1764 = new int[this.field1770 * 256];
            this.field1767.initialize((_Guid)null);
            this.field1767.setCooperativeLevel(arg0, 2);

            for(int var5 = 0; ~var5 > -3; ++var5) {
               this.field1762[var5].flags = 16384;
            }

            if (arg3) {
               this.field1769 = null;
            }

            this.field1772.bitsPerSample = 16;
            this.field1772.blockAlign = this.field1763;
            this.field1768 = arg1;
            this.field1772.formatTag = 1;
            this.field1772.avgBytesPerSec = this.field1763 * arg1;
            this.field1772.samplesPerSec = arg1;
            this.field1772.channels = this.field1770;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method310(int arg0, int arg1) {
      if (this.field1769[arg0] != null) {
         try {
            this.field1769[arg0].stop();
         } catch (ComFailException var3) {
         }

         this.field1769[arg0] = null;
      }

      if (arg1 != 2) {
         this.method309(-65, -86);
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method307(int arg0, int[] arg1) {
      int var3 = arg1.length;
      if (this.field1770 * 256 != var3) {
         throw new IllegalArgumentException();
      } else {
         int var4 = this.field1773[arg0] * this.field1763;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & -16777216) != 0) {
               var6 = 8388607 ^ var6 >> 31;
            }

            this.field1771[arg0][var5 * 2 + var4] = (byte)(var6 >> 8);
            this.field1771[arg0][var5 * 2 + var4 + 1] = (byte)(var6 >> 16);
         }

         this.field1769[arg0].writeBuffer(var4, var3 * 2, this.field1771[arg0], 0);
         this.field1773[arg0] = var3 / this.field1770 + this.field1773[arg0] & 65535;
         if (!this.field1765[arg0]) {
            this.field1769[arg0].play(1);
            this.field1765[arg0] = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method306(int arg0, int arg1, int arg2) throws Exception {
      if (~this.field1768 != -1 && this.field1769[arg1] == null) {
         int var4 = this.field1763 * 65536;
         if (this.field1771[arg1] == null || ~this.field1771[arg1].length != ~var4) {
            this.field1771[arg1] = new byte[var4];
            this.field1762[arg1].bufferBytes = var4;
         }

         if (arg2 != 6933) {
            this.method309(-60, -55);
         }

         this.field1769[arg1] = this.field1767.createSoundBuffer(this.field1762[arg1], this.field1772);
         this.field1765[arg1] = false;
         this.field1773[arg1] = 0;
         this.field1761[arg1] = arg0;
      } else {
         throw new IllegalStateException();
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "<init>",
      descriptor = "()V"
   )
   public class140() throws Exception {
      for(int var1 = 0; ~var1 > -3; ++var1) {
         this.field1762[var1] = new DSBufferDesc();
      }

      for(int var2 = 0; ~var2 > -3; ++var2) {
         this.field1766[var2] = new DSCursors();
      }

   }
}
