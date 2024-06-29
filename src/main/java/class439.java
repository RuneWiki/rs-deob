import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class439 implements class53 {
   @OriginalMember(
      owner = "client!mf",
      name = "d",
      descriptor = "Z"
   )
   private boolean field6694 = false;
   @OriginalMember(
      owner = "client!mf",
      name = "c",
      descriptor = "Lfi;"
   )
   private class582 field6688;
   @OriginalMember(
      owner = "client!mf",
      name = "f",
      descriptor = "Z"
   )
   private boolean field6690;
   @OriginalMember(
      owner = "client!mf",
      name = "e",
      descriptor = "B"
   )
   private byte field6691;
   @OriginalMember(
      owner = "client!mf",
      name = "b",
      descriptor = "I"
   )
   private int field6689;
   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "I"
   )
   private int field6693;
   @OriginalMember(
      owner = "client!mf",
      name = "g",
      descriptor = "Ljagdx/IDirect3DVertexBuffer;"
   )
   public IDirect3DVertexBuffer field6692;

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method422(byte arg0) {
      if (this.field6694 && class508.method3766(this.field6692.Unlock(), (byte)-44)) {
         this.field6694 = false;
         return true;
      } else {
         return arg0 != 98 ? false : false;
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public final boolean method424(int arg0, byte arg1, int arg2) {
      this.field6689 = arg0;
      int var4 = -54 % ((61 - arg1) / 32);
      this.field6691 = (byte)arg2;
      if (this.field6693 < this.field6689) {
         int var5 = 8;
         byte var6;
         if (!this.field6690) {
            var6 = 1;
         } else {
            var5 |= 512;
            var6 = 0;
         }

         if (this.field6692 != null) {
            this.field6692.method5106(true);
         }

         this.field6692 = this.field6688.field8614.method3789(this.field6689, var5, 0, var6, this.field6692);
         this.field6693 = this.field6689;
      }

      return this.field6692 != null;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;II)Z"
   )
   public final boolean method420(int arg0, Source arg1, int arg2, int arg3) {
      if (arg2 != 7491) {
         this.field6688 = (class582)null;
      }

      return this.method424(arg0, (byte)123, arg3) ? this.field6692.method3796(arg1, 0, 0, this.field6689, !this.field6690 ? 0 : 8192) : false;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method421(byte arg0, boolean arg1) {
      if (this.field6692 == null) {
         return null;
      } else {
         boolean var3 = arg1 & this.field6690;
         if (!this.field6694 && class508.method3766(this.field6692.Lock(0, this.field6693, var3 ? 8192 : 0, this.field6688.field8624), (byte)-44)) {
            this.field6694 = true;
            return this.field6688.field8624;
         } else {
            if (arg0 > -86) {
               this.field6694 = false;
            }

            return null;
         }
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method423(int arg0) {
      if (this.field6692 != null) {
         this.field6692.method5106(true);
         this.field6692 = null;
      }

      this.field6689 = 0;
      this.field6693 = 0;
      if (arg0 != -15607) {
         this.method423(-54);
      }

   }

   @OriginalMember(
      owner = "client!mf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3321(int arg0) {
      int var2 = -86 / ((arg0 - -27) / 32);
      return this.field6691;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method927(int arg0) {
      return arg0 != 34962 ? -15 : this.field6689;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "<init>",
      descriptor = "(Lfi;Z)V"
   )
   public class439(class582 arg0, boolean arg1) {
      this.field6688 = arg0;
      this.field6690 = arg1;
   }
}
