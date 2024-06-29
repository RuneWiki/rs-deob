import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class30 {
   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field368 = new String[]{method251(method250("-C\u0015cx")), method251(method250("6UWN")), method251(method250("-C\u0015ax")), method251(method250("#\u000e\u0015\f-")), method251(method250("-C\u0015`x")), method251(method250("-C\u0015gx")), method251(method250("-C\u0015fx"))};
   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "I"
   )
   public static int field367 = 0;
   @OriginalMember(
      owner = "client!uc",
      name = "e",
      descriptor = "Lod;"
   )
   public static class536 field366 = new class536();
   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "I"
   )
   public static int field362;
   @OriginalMember(
      owner = "client!uc",
      name = "d",
      descriptor = "I"
   )
   public static int field363;
   @OriginalMember(
      owner = "client!uc",
      name = "f",
      descriptor = "I"
   )
   public static int field364;
   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "I"
   )
   public static int field365;

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(ILkn;ILaha;IILpl;Z)V"
   )
   public static final void method245(int arg0, class774 arg1, int arg2, class404 arg3, int arg4, int arg5, class680 arg6, boolean arg7) {
      try {
         if (arg7) {
            ++field363;
            class775 var8 = new class775();
            var8.field11258 = arg5 << 9;
            var8.field11263 = arg0 << 9;
            var8.field11260 = arg2;
            if (arg1 == null) {
               if (arg6 == null) {
                  if (arg3 != null) {
                     var8.field11261 = arg3;
                     var8.field11293 = arg5 + arg3.method3060((byte)38) << 9;
                     var8.field11275 = arg3.method3060((byte)38) + arg0 << 9;
                     var8.field11272 = class391.method2973(arg3, true);
                     var8.field11277 = 0;
                     var8.field11288 = arg3.field5682;
                     var8.field11287 = 256;
                     var8.field11280 = arg3.field5697;
                     var8.field11266 = arg3.field5681 << 9;
                     var8.field11265 = 256;
                     class128.field1610.method1841((long)arg3.field7843, arg7, var8);
                     return;
                  }
               } else {
                  var8.field11281 = arg6;
                  class392 var11 = arg6.field9989;
                  if (var11.field5516 != null) {
                     var8.field11292 = true;
                     var11 = var11.method2986(93, class259.field3320);
                  }

                  if (var11 != null) {
                     var8.field11293 = var11.field5538 + arg5 << 9;
                     var8.field11275 = var11.field5538 + arg0 << 9;
                     var8.field11272 = class415.method3143(arg6, 14);
                     var8.field11287 = var11.field5528;
                     var8.field11280 = var11.field5491;
                     var8.field11277 = var11.field5533 << 9;
                     var8.field11266 = var11.field5501 << 9;
                     var8.field11265 = var11.field5484;
                     var8.field11288 = var11.field5521;
                  }

                  class358.field5094.method3859(2, var8);
               }

            } else {
               var8.field11279 = arg1;
               int var9 = arg1.field11251;
               int var10 = arg1.field11168;
               if (~arg4 == -2 || arg4 == 3) {
                  var10 = arg1.field11251;
                  var9 = arg1.field11168;
               }

               var8.field11280 = arg1.field11166;
               var8.field11275 = arg0 + var10 << 9;
               var8.field11293 = arg5 + var9 << 9;
               var8.field11268 = arg1.field11241;
               var8.field11266 = arg1.field11234 << 9;
               var8.field11287 = arg1.field11224;
               var8.field11265 = arg1.field11159;
               var8.field11271 = arg1.field11250;
               var8.field11277 = arg1.field11247 << 9;
               var8.field11288 = arg1.field11203;
               var8.field11272 = arg1.field11215;
               var8.field11290 = arg1.field11254;
               var8.field11291 = arg1.field11174;
               if (arg1.field11186 != null) {
                  var8.field11292 = true;
                  var8.method5560((byte)103);
               }

               if (var8.field11291 != null) {
                  var8.field11294 = var8.field11290 + (int)((double)(-var8.field11290 + var8.field11271) * Math.random());
               }

               field366.method3859(2, var8);
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field368[4] + arg0 + ',' + (arg1 != null ? field368[3] : field368[1]) + ',' + arg2 + ',' + (arg3 != null ? field368[3] : field368[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field368[3] : field368[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method246(byte arg0) {
      try {
         field366 = null;
         int var1 = 25 % ((-35 - arg0) / 60);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field368[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(IBIIIII)I"
   )
   public static final int method247(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         int var11 = arg3 & 3;
         if ((1 & arg6) == 1) {
            int var7 = arg2;
            arg2 = arg0;
            arg0 = var7;
         }

         ++field365;
         int var8 = -102 % ((arg1 - -16) / 58);
         if (var11 == 0) {
            return arg5;
         } else if (var11 == 1) {
            return -arg2 + 1 + -arg4 + 7;
         } else {
            return ~var11 == -3 ? -arg5 + 7 + 1 + -arg0 : arg4;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field368[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;)V"
   )
   public static final void method248(int arg0, String arg1, int arg2, String arg3) {
      try {
         ++field364;
         if (arg1.length() <= 320) {
            if (class521.method3770(true)) {
               class149.method1245(arg2 ^ -8035);
               class616.field8591 = arg3;
               class766.field11046 = arg0;
               if (arg2 == 0) {
                  class631.field8834 = arg1;
                  class397.method3019(arg2 ^ 67, 6);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field368[2] + arg0 + ',' + (arg1 != null ? field368[3] : field368[1]) + ',' + arg2 + ',' + (arg3 != null ? field368[3] : field368[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method249(int arg0, boolean arg1) {
      try {
         class604.field8418 = class605.field8474;
         ++field362;
         class766.field11046 = arg0;
         class619.field8658 = 2;
         String var2 = null;
         if (class280.field3748 != null) {
            class594 var3 = new class594(class280.field3748);
            var2 = class263.method2023(-125, var3.method4304((byte)114));
            class436.field6059 = var3.method4304((byte)126);
         }

         if (var2 == null) {
            class365.method2827(35, true);
         } else {
            class396.method3008(arg1, var2, (byte)-86, true, "");
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field368[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
