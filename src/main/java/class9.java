import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!cb")
public abstract class class9 {
   @OriginalMember(
      owner = "loginapplet!cb",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field75;
   @OriginalMember(
      owner = "loginapplet!cb",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field76;
   @OriginalMember(
      owner = "loginapplet!cb",
      name = "c",
      descriptor = "I"
   )
   public static int field77 = 0;

   @OriginalMember(
      owner = "loginapplet!cb",
      name = "a",
      descriptor = "(B)V",
      line = 23
   )
   public static final void method34(byte arg0) {
      try {
         int var5 = class17.field128;
         int var1;
         int var2;
         if (var5 > class4.field54) {
            var2 = var5;
            var1 = class4.field54;
         } else {
            var1 = var5;
            var2 = class4.field54;
         }

         int var6 = class13.field103;
         int var7 = -var5 + class4.field54;
         var2 = (int)((float)var2 + class14.field112);
         if (arg0 != -27) {
            field77 = 36;
         }

         var1 = (int)((float)var1 - class14.field112);
         int var3;
         int var4;
         if (~var6 < ~class13.field100) {
            var4 = var6;
            var3 = class13.field100;
         } else {
            var4 = class13.field100;
            var3 = var6;
         }

         var3 = (int)((float)var3 - class14.field112);
         var4 = (int)((float)var4 + class14.field112);
         int var8 = class13.field100 + -var6;

         for(int var9 = 0; ~class4.field52.length < ~var9; ++var9) {
            float var13;
            float var14;
            if (!(class4.field52[var9].field62 < (float)var1) && !(class4.field52[var9].field62 > (float)var2) && !((float)var3 > class4.field52[var9].field60) && !((float)var4 < class4.field52[var9].field60) && (0 != ~class4.field54 || 0 != ~class13.field100)) {
               float var10;
               float var11;
               float var12;
               float var15;
               float var16;
               if (class4.field54 == var5 && var6 == class13.field100) {
                  var12 = (float)class4.field54 - class4.field52[var9].field62;
                  var14 = (float)class4.field54 - class37.field269;
                  var13 = (float)class13.field100 - class4.field52[var9].field60;
                  var15 = (float)class13.field100 - class16.field124;
                  if (!class4.field52[var9].field66) {
                     var16 = class12.method52(var14, 1, class4.field52[var9].field60 - class16.field124, var15, class4.field52[var9].field62 - class37.field269);
                     class4.field52[var9].field65 = 0.0F > var16;
                     class4.field52[var9].field66 = true;
                  }

                  var10 = -var13 + class4.field52[var9].field61;
                  var11 = var12 + class4.field52[var9].field63;
                  if (!class4.field52[var9].field65) {
                     var11 *= -1.0F;
                     var10 *= -1.0F;
                     var11 += (-var13 + class14.field112) * -0.15F;
                     var10 += (-var12 + class14.field112) * -0.15F;
                  } else {
                     var10 += (-var12 + class14.field112) * 0.12F;
                     var11 += 0.12F * (-var13 + class14.field112);
                  }

                  double var22 = Math.sqrt((double)(var10 * var10 + var11 * var11));
                  if (var22 > 1.0D) {
                     var22 = 1.0D / var22;
                     var10 = (float)((double)var10 * var22);
                     var11 = (float)((double)var11 * var22);
                  }

                  class4.field52[var9].method29(-117, var10, var11);
               } else if (class28.method140((float)var7, (float)var5, -10343, (float)var8, class4.field52[var9].field62, class4.field52[var9].field60, (float)var6) < class14.field112) {
                  var11 = (float)(-var6) + class4.field52[var9].field62;
                  var10 = class4.field52[var9].field62 - (float)var5;
                  var12 = class20.method95(var10, (float)var8, false, (float)var7, var11);
                  if (!(0.0F >= var12)) {
                     var15 = class20.method95((float)var7, (float)var8, false, (float)var7, (float)var8);
                     if (!(var12 >= var15)) {
                        var16 = var12 / var15;
                        var13 = (float)class4.field54 * var16 + (float)var5;
                        var14 = (float)var6 + var16 * (float)class13.field100;
                     } else {
                        var14 = (float)class13.field100;
                        var13 = (float)class4.field54;
                     }
                  } else {
                     var14 = (float)var6;
                     var13 = (float)var5;
                  }

                  var15 = class4.field52[var9].field62 - var13;
                  var16 = class4.field52[var9].field60 - var14;
                  double var17 = Math.sqrt((double)(var16 * var16 + var15 * var15));
                  if (1.0D < var17) {
                     var17 = (double)((float)(1.0D / var17));
                     var15 = (float)((double)var15 * var17);
                     var16 = (float)((double)var16 * var17);
                  }

                  class4.field52[var9].method29(arg0 ^ 70, -var15, -var16);
               } else {
                  class4.field52[var9].method26((byte)-36);
                  class4.field52[var9].field66 = false;
               }
            } else {
               class4.field52[var9].method26((byte)-36);
               class4.field52[var9].field66 = false;
            }

            ++class4.field52[var9].field67;
            if (~class4.field52[var9].field67 < ~class4.field52[var9].field68) {
               double var20 = 3.141592653589793D * class46.field337.nextDouble() * 2.0D;
               int var21 = 150 - -Math.abs(class46.field337.nextInt() % 50);
               var13 = (float)Math.cos(var20);
               var14 = (float)Math.sin(var20);
               class4.field52[var9].method27(var14 * 15.0F + class16.field124, var14, var13 * 15.0F + class37.field269, var13, var21, -119);
            }
         }

      } catch (RuntimeException var19) {
         throw class28.method139(var19, "cb.E(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!cb",
      name = "a",
      descriptor = "(I)V",
      line = 211
   )
   public static void method35(int arg0) {
      try {
         if (arg0 != 0) {
            field77 = -37;
         }

         field75 = null;
         field76 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "cb.F(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!cb",
      name = "a",
      descriptor = "(III)I"
   )
   public abstract int method36(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "loginapplet!cb",
      name = "b",
      descriptor = "(B)Z",
      line = 226
   )
   public static final boolean method37(byte arg0) {
      try {
         if (arg0 >= -39) {
            field77 = -92;
         }

         class29 var1 = class8.field73;
         synchronized(class8.field73) {
            if (~field77 == ~class33.field207) {
               return false;
            } else {
               class45.field334 = class15.field119[field77];
               class13.field108 = class12.field98[field77];
               field77 = 1 + field77 & 127;
               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "cb.D(" + arg0 + ')');
      }
   }
}
