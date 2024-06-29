import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class71;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class403 implements class800 {
   @OriginalMember(
      owner = "client!vaa",
      name = "e",
      descriptor = "Z"
   )
   private boolean field6297 = false;
   @OriginalMember(
      owner = "client!vaa",
      name = "f",
      descriptor = "Lpc;"
   )
   private class650 field6300;
   @OriginalMember(
      owner = "client!vaa",
      name = "b",
      descriptor = "Z"
   )
   private boolean field6296;
   @OriginalMember(
      owner = "client!vaa",
      name = "c",
      descriptor = "Leb;"
   )
   private class163 field6299;
   @OriginalMember(
      owner = "client!vaa",
      name = "d",
      descriptor = "I"
   )
   private int field6295;
   @OriginalMember(
      owner = "client!vaa",
      name = "g",
      descriptor = "I"
   )
   private int field6298;
   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "Ljagdx/IDirect3DIndexBuffer;"
   )
   public IDirect3DIndexBuffer field6294;

   @OriginalMember(
      owner = "client!vaa",
      name = "b",
      descriptor = "(I)Lpc;",
      line = 4
   )
   public final class650 method2522(int arg0) {
      if (arg0 < 84) {
         this.field6299 = (class163)null;
      }

      return this.field6300;
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;",
      line = 14
   )
   public final Buffer method2519(boolean arg0, int arg1) {
      if (this.field6294 != null) {
         boolean var3 = arg0 & this.field6296;
         if (arg1 <= 9) {
            this.method2519(true, 68);
         }

         if (!this.field6297 && class71.method550(this.field6294.Lock(0, this.field6295, !var3 ? 0 : 8192, this.field6299.field2443), (byte)-80)) {
            this.field6297 = true;
            return this.field6299.field2443;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "d",
      descriptor = "(I)I",
      line = 36
   )
   public final int method1538(int arg0) {
      if (arg0 < 13) {
         this.field6300 = (class650)null;
      }

      return this.field6298;
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(II)V",
      line = 49
   )
   public final void method2269(int arg0, int arg1) {
      this.field6298 = this.field6300.field9366 * arg0;
      if (arg1 != 32198) {
         this.field6295 = -61;
      }

      if (this.field6295 < this.field6298) {
         int var3 = 8;
         byte var4;
         if (!this.field6296) {
            var4 = 1;
         } else {
            var4 = 0;
            var3 |= 512;
         }

         if (this.field6294 != null) {
            this.field6294.method5223(-18900);
         }

         this.field6294 = this.field6299.field2447.method576(this.field6298, var3, class650.field9372 != this.field6300 ? 102 : 101, var4, this.field6294);
         this.field6295 = this.field6298;
      }

   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(I)V",
      line = 82
   )
   public final void method1533(int arg0) {
      if (arg0 == 16966) {
         if (this.field6294 != null) {
            this.field6294.method5223(-18900);
            this.field6294 = null;
         }

         this.field6295 = 0;
         this.field6298 = 0;
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "c",
      descriptor = "(I)Z",
      line = 101
   )
   public final boolean method2517(int arg0) {
      if (this.field6297 && class71.method550(this.field6294.Unlock(), (byte)-80)) {
         this.field6297 = false;
         return true;
      } else {
         if (arg0 != -21369) {
            this.field6296 = true;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "<init>",
      descriptor = "(Leb;Lpc;Z)V",
      line = 126
   )
   public class403(class163 arg0, class650 arg1, boolean arg2) {
      this.field6300 = arg1;
      this.field6296 = arg2;
      this.field6299 = arg0;
   }
}
