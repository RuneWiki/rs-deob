import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class430 implements class280 {
   @OriginalMember(
      owner = "client!dg",
      name = "g",
      descriptor = "Z"
   )
   private boolean field6204 = false;
   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "Lrfa;"
   )
   private class209 field6206;
   @OriginalMember(
      owner = "client!dg",
      name = "e",
      descriptor = "Lvea;"
   )
   private class287 field6209;
   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "Z"
   )
   private boolean field6207;
   @OriginalMember(
      owner = "client!dg",
      name = "d",
      descriptor = "I"
   )
   private int field6203;
   @OriginalMember(
      owner = "client!dg",
      name = "f",
      descriptor = "I"
   )
   private int field6205;
   @OriginalMember(
      owner = "client!dg",
      name = "c",
      descriptor = "Ljagdx/IDirect3DIndexBuffer;"
   )
   public IDirect3DIndexBuffer field6208;

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method2188(byte arg0, boolean arg1) {
      if (this.field6208 == null) {
         return null;
      } else {
         boolean var3 = arg1 & this.field6207;
         if (!this.field6204 && class507.method3795(this.field6208.Lock(0, this.field6205, var3 ? 8192 : 0, this.field6209.field4013), -61)) {
            this.field6204 = true;
            return this.field6209.field4013;
         } else {
            if (arg0 != -46) {
               this.field6208 = (IDirect3DIndexBuffer)null;
            }

            return null;
         }
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2189(int arg0, int arg1) {
      if (arg0 != 27288) {
         this.field6209 = (class287)null;
      }

      this.field6203 = this.field6206.field3103 * arg1;
      if (this.field6203 > this.field6205) {
         int var3 = 8;
         byte var4;
         if (this.field6207) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if (this.field6208 != null) {
            this.field6208.method5108((byte)7);
         }

         this.field6208 = this.field6209.field4018.method3803(this.field6203, var3, class209.field3107 == this.field6206 ? 101 : 102, var4, this.field6208);
         this.field6205 = this.field6203;
      }

   }

   @OriginalMember(
      owner = "client!dg",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method574(int arg0) {
      if (this.field6208 != null) {
         this.field6208.method5108((byte)7);
         this.field6208 = null;
      }

      this.field6203 = 0;
      if (arg0 == 29079) {
         this.field6205 = 0;
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "(I)Lrfa;"
   )
   public final class209 method2191(int arg0) {
      int var2 = 42 / ((-78 - arg0) / 42);
      return this.field6206;
   }

   @OriginalMember(
      owner = "client!dg",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method2190(int arg0) {
      if (this.field6204 && class507.method3795(this.field6208.Unlock(), -107)) {
         this.field6204 = false;
         return true;
      } else {
         if (arg0 != -28008) {
            this.field6208 = (IDirect3DIndexBuffer)null;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method570(int arg0) {
      return arg0 != 1 ? 56 : this.field6203;
   }

   @OriginalMember(
      owner = "client!dg",
      name = "<init>",
      descriptor = "(Lvea;Lrfa;Z)V"
   )
   public class430(class287 arg0, class209 arg1, boolean arg2) {
      this.field6206 = arg1;
      this.field6209 = arg0;
      this.field6207 = arg2;
   }
}
