import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class346 {
   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5309 = new String[]{method2800(method2799(";)fF|")), method2800(method2799(";)f@|")), method2800(method2799("24$h")), method2800(method2799("'of*)")), method2800(method2799(";)fG|"))};
   @OriginalMember(
      owner = "client!gh",
      name = "e",
      descriptor = "Ltia;"
   )
   public static class208 field5304 = new class208();
   @OriginalMember(
      owner = "client!gh",
      name = "c",
      descriptor = "I"
   )
   public static int field5307 = 100;
   @OriginalMember(
      owner = "client!gh",
      name = "d",
      descriptor = "I"
   )
   public static int field5303;
   @OriginalMember(
      owner = "client!gh",
      name = "f",
      descriptor = "I"
   )
   public static int field5305;
   @OriginalMember(
      owner = "client!gh",
      name = "b",
      descriptor = "I"
   )
   public static int field5306;
   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "Lv;"
   )
   public static class410 field5308;

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(Lefa;Lwo;IIBLru;II)V",
      line = 6
   )
   public static final void method2795(class466 arg0, class9 arg1, int arg2, int arg3, byte arg4, class333 arg5, int arg6, int arg7) {
      try {
         ++field5303;
         class168 var8 = new class168();
         var8.field2576 = arg6 << 9;
         var8.field2571 = arg2;
         if (arg4 < 81) {
            method2797(114);
         }

         var8.field2566 = arg7 << 9;
         if (arg5 == null) {
            if (arg0 != null) {
               var8.field2562 = arg0;
               class344 var9 = arg0.field7072;
               if (var9.field5221 != null) {
                  var8.field2574 = true;
                  var9 = var9.method2782((byte)-125, class45.field599);
               }

               if (var9 != null) {
                  var8.field2547 = var9.field5250 + arg7 << 9;
                  var8.field2559 = arg6 - -var9.field5250 << 9;
                  var8.field2549 = class281.method2352(0, arg0);
                  var8.field2570 = var9.field5259;
                  var8.field2553 = var9.field5257;
                  var8.field2552 = var9.field5231;
                  var8.field2561 = var9.field5247;
                  var8.field2563 = var9.field5270 << 9;
                  var8.field2554 = var9.field5263 << 9;
               }

               class497.field7567.method4980(var8, 0);
               return;
            }

            if (arg1 != null) {
               var8.field2555 = arg1;
               var8.field2559 = arg6 + arg1.method61((byte)70) << 9;
               var8.field2547 = arg7 + arg1.method61((byte)70) << 9;
               var8.field2549 = class437.method3439(arg1, -1);
               var8.field2563 = 0;
               var8.field2553 = arg1.field117;
               var8.field2554 = arg1.field101 << 9;
               var8.field2561 = 256;
               var8.field2570 = 256;
               var8.field2552 = arg1.field104;
               class211.field3195.method3143(52, var8, (long)arg1.field1640);
               return;
            }
         } else {
            var8.field2577 = arg5;
            int var10 = arg5.field5097;
            int var11 = arg5.field5104;
            if (~arg3 == -2 || ~arg3 == -4) {
               var10 = arg5.field5104;
               var11 = arg5.field5097;
            }

            var8.field2549 = arg5.field5123;
            var8.field2558 = arg5.field5121;
            var8.field2547 = arg7 + var11 << 9;
            var8.field2552 = arg5.field5084;
            var8.field2561 = arg5.field5072;
            var8.field2564 = arg5.field5058;
            var8.field2559 = arg6 + var10 << 9;
            var8.field2563 = arg5.field5070 << 9;
            var8.field2554 = arg5.field5122 << 9;
            var8.field2570 = arg5.field5110;
            var8.field2569 = arg5.field5075;
            var8.field2546 = arg5.field5128;
            var8.field2553 = arg5.field5049;
            if (arg5.field5088 != null) {
               var8.field2574 = true;
               var8.method1564(126);
            }

            if (var8.field2546 != null) {
               var8.field2572 = var8.field2564 - -((int)(Math.random() * (double)(-var8.field2564 + var8.field2569)));
            }

            class327.field4982.method4980(var8, 0);
         }

      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field5309[1] + (arg0 != null ? field5309[3] : field5309[2]) + ',' + (arg1 != null ? field5309[3] : field5309[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5309[3] : field5309[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "b",
      descriptor = "(I)V",
      line = 108
   )
   public static void method2797(int arg0) {
      try {
         field5308 = null;
         if (arg0 == 5) {
            field5304 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5309[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(I)I",
      line = 125
   )
   public static final int method2798(int arg0) {
      try {
         if (arg0 > -53) {
            field5306 = -90;
         }

         ++field5305;
         if (class304.field4759) {
            return 6;
         } else if (class305.field4780 == null) {
            return 0;
         } else {
            int var1 = class305.field4780.field2896;
            if (class746.method5481(31769, var1)) {
               return 1;
            } else if (class656.method4832(var1, (byte)123)) {
               return 2;
            } else if (class225.method1953(-128, var1)) {
               return 3;
            } else if (class115.method1069(var1, (byte)-82)) {
               return 4;
            } else if (class752.method5520(-19842, var1)) {
               return 7;
            } else {
               return var1 == 10 ? 8 : 5;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5309[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(Lkj;I)Lkj;"
   )
   public abstract class33 method2796(class33 arg0, int arg1);

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2799(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2800(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
