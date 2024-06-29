import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class389 implements class99 {
   @OriginalMember(
      owner = "client!wp",
      name = "c",
      descriptor = "Z"
   )
   private boolean field5663 = false;
   @OriginalMember(
      owner = "client!wp",
      name = "g",
      descriptor = "Lob;"
   )
   private class779 field5659;
   @OriginalMember(
      owner = "client!wp",
      name = "f",
      descriptor = "Z"
   )
   private boolean field5661;
   @OriginalMember(
      owner = "client!wp",
      name = "d",
      descriptor = "Lmv;"
   )
   private class125 field5665;
   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "I"
   )
   private int field5660;
   @OriginalMember(
      owner = "client!wp",
      name = "e",
      descriptor = "I"
   )
   private int field5664;
   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "Ljagdx/IDirect3DIndexBuffer;"
   )
   public IDirect3DIndexBuffer field5662;

   @OriginalMember(
      owner = "client!wp",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method350(int arg0) {
      return arg0 <= 77 ? -40 : this.field5660;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method982(int arg0) {
      if (arg0 != -23434) {
         this.field5664 = 116;
      }

      if (this.field5663 && class402.method3144(-2005530595, this.field5662.Unlock())) {
         this.field5663 = false;
         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method981(int arg0, byte arg1) {
      if (arg1 < 114) {
         this.field5661 = true;
      }

      this.field5660 = this.field5659.field11369 * arg0;
      if (this.field5660 > this.field5664) {
         int var3 = 8;
         byte var4;
         if (this.field5661) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if (this.field5662 != null) {
            this.field5662.method3157(-99);
         }

         this.field5662 = this.field5665.field2013.method3125(this.field5660, var3, class779.field11372 == this.field5659 ? 101 : 102, var4, this.field5662);
         this.field5664 = this.field5660;
      }

   }

   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "(I)Lob;"
   )
   public final class779 method980(int arg0) {
      if (arg0 != 17651) {
         this.field5665 = (class125)null;
      }

      return this.field5659;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method979(boolean arg0, boolean arg1) {
      if (!arg0) {
         this.field5664 = 25;
      }

      if (this.field5662 != null) {
         boolean var3 = arg1 & this.field5661;
         if (!this.field5663 && class402.method3144(-2005530595, this.field5662.Lock(0, this.field5664, var3 ? 8192 : 0, this.field5665.field2009))) {
            this.field5663 = true;
            return this.field5665.field2009;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method358(boolean arg0) {
      if (this.field5662 != null) {
         this.field5662.method3157(-30);
         this.field5662 = null;
      }

      this.field5660 = 0;
      if (!arg0) {
         this.field5664 = 89;
      }

      this.field5664 = 0;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "<init>",
      descriptor = "(Lmv;Lob;Z)V"
   )
   public class389(class125 arg0, class779 arg1, boolean arg2) {
      this.field5659 = arg1;
      this.field5661 = arg2;
      this.field5665 = arg0;
   }
}
