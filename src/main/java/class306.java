import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class306 implements class576 {
   @OriginalMember(
      owner = "client!bq",
      name = "e",
      descriptor = "Z"
   )
   private boolean field4184 = false;
   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "Lria;"
   )
   private class301 field4186;
   @OriginalMember(
      owner = "client!bq",
      name = "c",
      descriptor = "Z"
   )
   private boolean field4189;
   @OriginalMember(
      owner = "client!bq",
      name = "g",
      descriptor = "Lbb;"
   )
   private class353 field4187;
   @OriginalMember(
      owner = "client!bq",
      name = "d",
      descriptor = "I"
   )
   private int field4185;
   @OriginalMember(
      owner = "client!bq",
      name = "b",
      descriptor = "I"
   )
   private int field4190;
   @OriginalMember(
      owner = "client!bq",
      name = "f",
      descriptor = "Ljagdx/IDirect3DIndexBuffer;"
   )
   public IDirect3DIndexBuffer field4188;

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(II)V",
      line = 7
   )
   public final void method2281(int arg0, int arg1) {
      this.field4190 = this.field4186.field4112 * arg1;
      if (this.field4190 > this.field4185) {
         int var3 = 8;
         byte var4;
         if (this.field4189) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if (this.field4188 != null) {
            this.field4188.method5120(9575);
         }

         this.field4188 = this.field4187.field4742.method3729(this.field4190, var3, class301.field4118 != this.field4186 ? 102 : 101, var4, this.field4188);
         this.field4185 = this.field4190;
      }

      if (arg0 != -4657) {
         this.method2281(-59, -49);
      }

   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(Z)I",
      line = 43
   )
   public final int method1408(boolean arg0) {
      if (!arg0) {
         this.method1412(-44);
      }

      return this.field4190;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "<init>",
      descriptor = "(Lbb;Lria;Z)V",
      line = 127
   )
   public class306(class353 arg0, class301 arg1, boolean arg2) {
      this.field4186 = arg1;
      this.field4189 = arg2;
      this.field4187 = arg0;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "c",
      descriptor = "(I)Z",
      line = 58
   )
   public final boolean method2282(int arg0) {
      int var2 = 93 % ((-9 - arg0) / 36);
      if (this.field4184 && class512.method3730((byte)126, this.field4188.Unlock())) {
         this.field4184 = false;
         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;",
      line = 77
   )
   public final Buffer method2283(boolean arg0, byte arg1) {
      if (this.field4188 != null) {
         if (arg1 < 105) {
            return (Buffer)null;
         } else {
            boolean var3 = arg0 & this.field4189;
            if (!this.field4184 && class512.method3730((byte)-53, this.field4188.Lock(0, this.field4185, var3 ? 8192 : 0, this.field4187.field4754))) {
               this.field4184 = true;
               return this.field4187.field4754;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "b",
      descriptor = "(I)Lria;",
      line = 100
   )
   public final class301 method2284(int arg0) {
      if (arg0 != 10739) {
         this.method2281(36, 110);
      }

      return this.field4186;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(I)V",
      line = 112
   )
   public final void method1412(int arg0) {
      if (this.field4188 != null) {
         this.field4188.method5120(9575);
         this.field4188 = null;
      }

      this.field4185 = 0;
      if (arg0 >= 6) {
         this.field4190 = 0;
      }
   }
}
