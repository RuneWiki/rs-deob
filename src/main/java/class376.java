import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class376 implements class96 {
   @OriginalMember(
      owner = "client!jp",
      name = "d",
      descriptor = "Z"
   )
   private boolean field5281 = false;
   @OriginalMember(
      owner = "client!jp",
      name = "b",
      descriptor = "Z"
   )
   private boolean field5277;
   @OriginalMember(
      owner = "client!jp",
      name = "f",
      descriptor = "Lvn;"
   )
   private class332 field5275;
   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "Liw;"
   )
   private class335 field5278;
   @OriginalMember(
      owner = "client!jp",
      name = "g",
      descriptor = "I"
   )
   private int field5276;
   @OriginalMember(
      owner = "client!jp",
      name = "c",
      descriptor = "I"
   )
   private int field5279;
   @OriginalMember(
      owner = "client!jp",
      name = "e",
      descriptor = "Ljagdx/IDirect3DIndexBuffer;"
   )
   public IDirect3DIndexBuffer field5280;

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method895(byte arg0, int arg1) {
      this.field5279 = this.field5278.field4797 * arg1;
      if (~this.field5276 > ~this.field5279) {
         int var3 = 8;
         byte var4;
         if (!this.field5277) {
            var4 = 1;
         } else {
            var4 = 0;
            var3 |= 512;
         }

         if (this.field5280 != null) {
            this.field5280.method5123(-1928);
         }

         this.field5280 = this.field5275.field4766.method3726(this.field5279, var3, class335.field4804 != this.field5278 ? 102 : 101, var4, this.field5280);
         this.field5276 = this.field5279;
      }

      if (arg0 <= 91) {
         this.field5278 = (class335)null;
      }

   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method788(byte arg0) {
      if (this.field5280 != null) {
         this.field5280.method5123(-1928);
         this.field5280 = null;
      }

      this.field5279 = 0;
      this.field5276 = 0;
      if (arg0 <= 21) {
         this.field5275 = (class332)null;
      }

   }

   @OriginalMember(
      owner = "client!jp",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method898(byte arg0) {
      if (arg0 != 56) {
         return false;
      } else if (this.field5281 && class512.method3718(this.field5280.Unlock(), 2005530519)) {
         this.field5281 = false;
         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   public final Buffer method896(boolean arg0, int arg1) {
      if (arg1 != -24730) {
         this.field5279 = -24;
      }

      if (this.field5280 != null) {
         boolean var3 = arg0 & this.field5277;
         if (!this.field5281 && class512.method3718(this.field5280.Lock(0, this.field5276, !var3 ? 0 : 8192, this.field5275.field4758), 2005530519)) {
            this.field5281 = true;
            return this.field5275.field4758;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method794(int arg0) {
      return arg0 != 1143968105 ? 97 : this.field5279;
   }

   @OriginalMember(
      owner = "client!jp",
      name = "<init>",
      descriptor = "(Lvn;Liw;Z)V"
   )
   public class376(class332 arg0, class335 arg1, boolean arg2) {
      this.field5277 = arg2;
      this.field5275 = arg0;
      this.field5278 = arg1;
   }

   @OriginalMember(
      owner = "client!jp",
      name = "b",
      descriptor = "(B)Liw;"
   )
   public final class335 method897(byte arg0) {
      if (arg0 != -71) {
         this.method897((byte)-119);
      }

      return this.field5278;
   }
}
