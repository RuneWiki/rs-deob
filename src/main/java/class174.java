import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class174 implements class398 {
   @OriginalMember(
      owner = "client!tba",
      name = "d",
      descriptor = "Z"
   )
   private boolean field2407 = false;
   @OriginalMember(
      owner = "client!tba",
      name = "g",
      descriptor = "Lbb;"
   )
   private class353 field2403;
   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "Z"
   )
   private boolean field2404;
   @OriginalMember(
      owner = "client!tba",
      name = "e",
      descriptor = "B"
   )
   private byte field2402;
   @OriginalMember(
      owner = "client!tba",
      name = "c",
      descriptor = "I"
   )
   private int field2405;
   @OriginalMember(
      owner = "client!tba",
      name = "f",
      descriptor = "I"
   )
   private int field2406;
   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "Ljagdx/IDirect3DVertexBuffer;"
   )
   public IDirect3DVertexBuffer field2408;

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method1407(boolean arg0, boolean arg1) {
      if (this.field2408 == null) {
         return null;
      } else {
         boolean var3 = arg0 & this.field2404;
         if (!this.field2407 && class512.method3730((byte)118, this.field2408.Lock(0, this.field2405, !var3 ? 0 : 8192, this.field2403.field4754))) {
            this.field2407 = true;
            return this.field2403.field4754;
         } else {
            if (!arg1) {
               this.field2404 = true;
            }

            return null;
         }
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1408(boolean arg0) {
      return !arg0 ? 80 : this.field2406;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1409(byte arg0) {
      int var2 = 43 / ((-7 - arg0) / 61);
      if (this.field2407 && class512.method3730((byte)122, this.field2408.Unlock())) {
         this.field2407 = false;
         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method1410(int arg0, int arg1, int arg2) {
      if (arg2 < 46) {
         this.method1413((Source)null, -3, 22, -55);
      }

      this.field2402 = (byte)arg1;
      this.field2406 = arg0;
      if (~this.field2405 > ~this.field2406) {
         int var4 = 8;
         byte var5;
         if (this.field2404) {
            var4 |= 512;
            var5 = 0;
         } else {
            var5 = 1;
         }

         if (this.field2408 != null) {
            this.field2408.method5120(9575);
         }

         this.field2408 = this.field2403.field4742.method3728(this.field2406, var4, 0, var5, this.field2408);
         this.field2405 = this.field2406;
      }

      return this.field2408 != null;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1411(int arg0) {
      if (arg0 != -17438) {
         this.field2405 = -74;
      }

      return this.field2402;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1412(int arg0) {
      if (this.field2408 != null) {
         this.field2408.method5120(9575);
         this.field2408 = null;
      }

      this.field2406 = 0;
      if (arg0 <= 6) {
         this.field2404 = true;
      }

      this.field2405 = 0;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;III)Z"
   )
   public final boolean method1413(Source arg0, int arg1, int arg2, int arg3) {
      if (arg3 != -10823) {
         this.field2403 = (class353)null;
      }

      return this.method1410(arg2, arg1, 93) ? this.field2408.method3737(arg0, 0, 0, this.field2406, this.field2404 ? 8192 : 0) : false;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "<init>",
      descriptor = "(Lbb;Z)V"
   )
   public class174(class353 arg0, boolean arg1) {
      this.field2403 = arg0;
      this.field2404 = arg1;
   }
}
