import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class780 extends class763 {
   @OriginalMember(
      owner = "client!kr",
      name = "F",
      descriptor = "Lnda;"
   )
   public class587 field11412;
   @OriginalMember(
      owner = "client!kr",
      name = "y",
      descriptor = "I"
   )
   public int field11407;
   @OriginalMember(
      owner = "client!kr",
      name = "f",
      descriptor = "I"
   )
   public int field11393;
   @OriginalMember(
      owner = "client!kr",
      name = "A",
      descriptor = "I"
   )
   public static int field11387 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "l",
      descriptor = "I"
   )
   public static int field11386 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "h",
      descriptor = "I"
   )
   public static int field11391 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "e",
      descriptor = "I"
   )
   public static int field11389 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "o",
      descriptor = "I"
   )
   private static int field11410 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "s",
      descriptor = "I"
   )
   public static int field11398 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "d",
      descriptor = "I"
   )
   private static int field11390 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "c",
      descriptor = "I"
   )
   public static int field11413 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "E",
      descriptor = "I"
   )
   public static int field11385;
   @OriginalMember(
      owner = "client!kr",
      name = "t",
      descriptor = "I"
   )
   public static int field11388;
   @OriginalMember(
      owner = "client!kr",
      name = "B",
      descriptor = "I"
   )
   public static int field11392;
   @OriginalMember(
      owner = "client!kr",
      name = "C",
      descriptor = "I"
   )
   public int field11394;
   @OriginalMember(
      owner = "client!kr",
      name = "x",
      descriptor = "I"
   )
   public static int field11396;
   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "I"
   )
   private static int field11397;
   @OriginalMember(
      owner = "client!kr",
      name = "w",
      descriptor = "I"
   )
   public static int field11399;
   @OriginalMember(
      owner = "client!kr",
      name = "j",
      descriptor = "I"
   )
   public static int field11400;
   @OriginalMember(
      owner = "client!kr",
      name = "p",
      descriptor = "I"
   )
   public int field11401;
   @OriginalMember(
      owner = "client!kr",
      name = "v",
      descriptor = "I"
   )
   public static int field11402;
   @OriginalMember(
      owner = "client!kr",
      name = "k",
      descriptor = "I"
   )
   public static int field11403;
   @OriginalMember(
      owner = "client!kr",
      name = "u",
      descriptor = "I"
   )
   public int field11404;
   @OriginalMember(
      owner = "client!kr",
      name = "g",
      descriptor = "I"
   )
   private static int field11405;
   @OriginalMember(
      owner = "client!kr",
      name = "m",
      descriptor = "I"
   )
   private static int field11406;
   @OriginalMember(
      owner = "client!kr",
      name = "i",
      descriptor = "I"
   )
   public static int field11408;
   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "I"
   )
   public static int field11409;
   @OriginalMember(
      owner = "client!kr",
      name = "r",
      descriptor = "I"
   )
   public static int field11411;
   @OriginalMember(
      owner = "client!kr",
      name = "q",
      descriptor = "I"
   )
   private static int field11414;
   @OriginalMember(
      owner = "client!kr",
      name = "G",
      descriptor = "I"
   )
   public static int field11415;
   @OriginalMember(
      owner = "client!kr",
      name = "D",
      descriptor = "I"
   )
   public int field11416;
   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "I"
   )
   public static int field11417;
   @OriginalMember(
      owner = "client!kr",
      name = "n",
      descriptor = "[I"
   )
   private int[] field11395;

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method2135(int[] arg0) {
      arg0[0] = this.field11416;
      arg0[1] = this.field11394;
      arg0[2] = this.field11401;
      arg0[3] = this.field11404;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "([I[III)V"
   )
   public abstract void method1628(int[] arg0, int[] arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!kr",
      name = "c",
      descriptor = "()I"
   )
   public final int method2137() {
      return this.field11393;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "()I"
   )
   public final int method2129() {
      return this.field11394 + this.field11393 + this.field11404;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method1627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method2127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field11412.method4207()) {
         throw new IllegalStateException();
      } else {
         if (this.field11395 == null) {
            this.field11395 = new int[4];
         }

         this.field11412.method582(this.field11395);
         this.field11412.method530(this.field11412.field8099, this.field11412.field8073, arg0 + arg2, arg1 + arg3);
         int var8 = this.method2125();
         int var9 = this.method2129();
         int var10 = (arg2 + var8 - 1) / var8;
         int var11 = (arg3 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var9 * var12;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method1631(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
         }

         this.field11412.method577(this.field11395[0], this.field11395[1], this.field11395[2], this.field11395[3]);
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "()I"
   )
   public final int method2126() {
      return this.field11407;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method1631(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method2132(int arg0, int arg1, int arg2, int arg3) {
      this.field11416 = arg0;
      this.field11394 = arg1;
      this.field11401 = arg2;
      this.field11404 = arg3;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method1630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!kr",
      name = "d",
      descriptor = "()I"
   )
   public final int method2125() {
      return this.field11416 + this.field11407 + this.field11401;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method2138(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field11412.method4207()) {
         throw new IllegalStateException();
      } else if (this.method5596(arg0, arg1, arg2, arg3, arg4, arg5)) {
         field11415 = arg7;
         if (arg6 != 1) {
            field11386 = arg7 >>> 24;
            field11391 = 256 - field11386;
            if (arg6 == 0) {
               field11413 = (arg7 & 16711680) >> 16;
               field11398 = (arg7 & 65280) >> 8;
               field11389 = arg7 & 255;
            } else if (arg6 == 2) {
               field11390 = arg7 >>> 24;
               field11410 = 256 - field11390;
               int var11 = (arg7 & 16711935) * field11410 & -16711936;
               int var12 = (arg7 & 65280) * field11410 & 16711680;
               field11387 = (var11 | var12) >>> 8;
            }
         }

         if (arg6 == 1) {
            if (arg8 == 0) {
               this.method1632(1, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1632(1, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1632(1, 2);
               return;
            }
         } else if (arg6 == 0) {
            if (arg8 == 0) {
               this.method1632(0, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1632(0, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1632(0, 2);
               return;
            }
         } else if (arg6 == 3) {
            if (arg8 == 0) {
               this.method1632(3, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1632(3, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1632(3, 2);
               return;
            }
         } else if (arg6 == 2) {
            if (arg8 == 0) {
               this.method1632(2, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1632(2, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1632(2, 2);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method1626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method1632(int arg0, int arg1);

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method1629(int arg0, int arg1, class516 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method2128(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class516 arg7, int arg8, int arg9) {
      if (this.field11412.method4207()) {
         throw new IllegalStateException();
      } else if (this.method5596(arg0, arg1, arg2, arg3, arg4, arg5)) {
         class155 var11 = (class155)arg7;
         this.method1628(var11.field2000, var11.field2003, field11414 - arg8, -arg9 - (field11396 - field11405));
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(FFFFFF)Z"
   )
   private final boolean method5596(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      int var7 = this.field11416 + this.field11407 + this.field11401;
      int var8 = this.field11394 + this.field11393 + this.field11404;
      if (this.field11407 != var7 || this.field11393 != var8) {
         float var9 = (arg2 - arg0) / (float)var7;
         float var10 = (arg3 - arg1) / (float)var7;
         float var11 = (arg4 - arg0) / (float)var8;
         float var12 = (arg5 - arg1) / (float)var8;
         float var13 = (float)this.field11394 * var11;
         float var14 = (float)this.field11394 * var12;
         float var15 = (float)this.field11416 * var9;
         float var16 = (float)this.field11416 * var10;
         float var17 = (float)this.field11401 * -var9;
         float var18 = (float)this.field11401 * -var10;
         float var19 = (float)this.field11404 * -var11;
         float var20 = (float)this.field11404 * -var12;
         arg0 += var13 + var15;
         arg1 += var14 + var16;
         arg2 += var13 + var17;
         arg3 += var14 + var18;
         arg4 += var15 + var19;
         arg5 += var16 + var20;
      }

      float var21 = arg2 - arg0 + arg4;
      float var22 = arg5 - arg1 + arg3;
      float var23;
      float var24;
      if (arg0 < arg2) {
         var23 = arg0;
         var24 = arg2;
      } else {
         var23 = arg2;
         var24 = arg0;
      }

      if (arg4 < var23) {
         var23 = arg4;
      }

      if (var21 < var23) {
         var23 = var21;
      }

      if (arg4 > var24) {
         var24 = arg4;
      }

      if (var21 > var24) {
         var24 = var21;
      }

      float var25;
      float var26;
      if (arg1 < arg3) {
         var25 = arg1;
         var26 = arg3;
      } else {
         var25 = arg3;
         var26 = arg1;
      }

      if (arg5 < var25) {
         var25 = arg5;
      }

      if (var22 < var25) {
         var25 = var22;
      }

      if (arg5 > var26) {
         var26 = arg5;
      }

      if (var22 > var26) {
         var26 = var22;
      }

      if (var23 < (float)this.field11412.field8099) {
         var23 = (float)this.field11412.field8099;
      }

      if (var24 > (float)this.field11412.field8083) {
         var24 = (float)this.field11412.field8083;
      }

      if (var25 < (float)this.field11412.field8073) {
         var25 = (float)this.field11412.field8073;
      }

      if (var26 > (float)this.field11412.field8062) {
         var26 = (float)this.field11412.field8062;
      }

      float var27 = var23 - var24;
      if (var27 >= 0.0F) {
         return false;
      } else {
         float var28 = var25 - var26;
         if (var28 >= 0.0F) {
            return false;
         } else {
            field11392 = this.field11412.field8091;
            field11408 = (int)((float)((int)var25 * field11392) + var23);
            float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
            float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
            field11409 = (int)((arg5 - arg1) * 4096.0F * (float)this.field11407 / var29);
            field11403 = (int)((arg3 - arg1) * 4096.0F * (float)this.field11393 / var30);
            field11399 = (int)((arg4 - arg0) * 4096.0F * (float)this.field11407 / var30);
            field11388 = (int)((arg2 - arg0) * 4096.0F * (float)this.field11393 / var29);
            field11397 = (int)(var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
            field11406 = (int)(var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
            field11402 = (this.field11407 >> 1 << 12) + (field11406 * field11399 >> 4);
            field11400 = (this.field11393 >> 1 << 12) + (field11406 * field11388 >> 4);
            field11411 = field11409 * field11397 >> 4;
            field11417 = field11403 * field11397 >> 4;
            field11414 = (int)var23;
            field11385 = (int)var27;
            field11405 = (int)var25;
            field11396 = (int)var28;
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "<init>",
      descriptor = "(Lnda;II)V"
   )
   public class780(class587 arg0, int arg1, int arg2) {
      this.field11412 = arg0;
      this.field11407 = arg1;
      this.field11393 = arg2;
   }
}
