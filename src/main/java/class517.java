import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class517 implements class215 {
   @OriginalMember(
      owner = "client!mw",
      name = "f",
      descriptor = "Z"
   )
   private boolean field7545 = false;
   @OriginalMember(
      owner = "client!mw",
      name = "e",
      descriptor = "Z"
   )
   private boolean field7547;
   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "Lef;"
   )
   private class513 field7548;
   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "Lfi;"
   )
   private class582 field7549;
   @OriginalMember(
      owner = "client!mw",
      name = "d",
      descriptor = "I"
   )
   private int field7544;
   @OriginalMember(
      owner = "client!mw",
      name = "g",
      descriptor = "I"
   )
   private int field7546;
   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "Ljagdx/IDirect3DIndexBuffer;"
   )
   public IDirect3DIndexBuffer field7550;

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method1625(boolean arg0, boolean arg1) {
      if (!arg0) {
         return (Buffer)null;
      } else if (this.field7550 == null) {
         return null;
      } else {
         boolean var3 = arg1 & this.field7547;
         if (!this.field7545 && class508.method3766(this.field7550.Lock(0, this.field7546, !var3 ? 0 : 8192, this.field7549.field8624), (byte)-44)) {
            this.field7545 = true;
            return this.field7549.field8624;
         } else {
            return null;
         }
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1624(int arg0) {
      if (this.field7545 && class508.method3766(this.field7550.Unlock(), (byte)-44)) {
         this.field7545 = false;
         return true;
      } else {
         if (arg0 != -7695) {
            this.field7546 = -22;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method927(int arg0) {
      if (arg0 != 34962) {
         this.method1625(false, false);
      }

      return this.field7544;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method923(byte arg0, int arg1) {
      this.field7544 = this.field7548.field7515 * arg1;
      if (~this.field7546 > ~this.field7544) {
         int var3 = 8;
         byte var4;
         if (!this.field7547) {
            var4 = 1;
         } else {
            var3 |= 512;
            var4 = 0;
         }

         if (this.field7550 != null) {
            this.field7550.method5106(true);
         }

         this.field7550 = this.field7549.field8614.method3782(this.field7544, var3, class513.field7520 == this.field7548 ? 101 : 102, var4, this.field7550);
         this.field7546 = this.field7544;
      }

      if (arg0 != 77) {
         this.method423(83);
      }

   }

   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "(I)Lef;"
   )
   public final class513 method1623(int arg0) {
      return arg0 <= 81 ? (class513)null : this.field7548;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method423(int arg0) {
      if (this.field7550 != null) {
         this.field7550.method5106(true);
         this.field7550 = null;
      }

      if (arg0 != -15607) {
         this.method927(-16);
      }

      this.field7546 = 0;
      this.field7544 = 0;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "<init>",
      descriptor = "(Lfi;Lef;Z)V"
   )
   public class517(class582 arg0, class513 arg1, boolean arg2) {
      this.field7547 = arg2;
      this.field7548 = arg1;
      this.field7549 = arg0;
   }
}
