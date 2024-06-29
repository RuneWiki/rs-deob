import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class192 {
   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2801 = new String[]{method1700(method1699("0\u000e]eo}")), method1700(method1699(".G\u0012eP")), method1700(method1699("3\u0006")), method1700(method1699(";\u001cP'")), method1700(method1699("0\u000e]ei}")), method1700(method1699("0\u000e]el}")), method1700(method1699("0\u000e]en}"))};
   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2797 = new int[32];
   @OriginalMember(
      owner = "client!ega",
      name = "c",
      descriptor = "F"
   )
   public static float field2800;
   @OriginalMember(
      owner = "client!ega",
      name = "d",
      descriptor = "I"
   )
   public static int field2796;
   @OriginalMember(
      owner = "client!ega",
      name = "e",
      descriptor = "I"
   )
   public static int field2798;
   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "I"
   )
   public static int field2799;

   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1695(int arg0) {
      try {
         if (arg0 != 4) {
            field2800 = 0.31911528F;
         }

         field2797 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2801[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1696(int arg0) {
      boolean var1 = client.field10022;

      try {
         if (class384.field5603 != null) {
            class677[] var2 = class384.field5603;
            int var3 = 0;
            if (var1 || var3 < var2.length) {
               do {
                  class677 var4 = var2[var3];
                  var4.method1103(-128);
                  ++var3;
               } while(var3 < var2.length);
            }
         }

         if (arg0 != -10075) {
            method1698((byte)63, false, (String)null);
         }

         ++field2799;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2801[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(ILjava/lang/String;B)Lhe;"
   )
   public static final class174 method1697(int arg0, String arg1, byte arg2) {
      try {
         if (arg2 <= 86) {
            field2800 = -1.9214511F;
         }

         ++field2796;

         class174 var3;
         try {
            var3 = (class174)Class.forName(field2801[2]).newInstance();
         } catch (Throwable var5) {
            var3 = new class450();
         }

         var3.field2595 = arg1;
         var3.field2592 = arg0;
         return var3;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2801[0] + arg0 + ',' + (arg1 != null ? field2801[1] : field2801[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(BZLjava/lang/String;)V"
   )
   public static final void method1698(byte arg0, boolean arg1, String arg2) {
      boolean var3 = client.field10022;

      try {
         ++field2798;
         if (arg2 != null) {
            if (~class265.field4046 <= -101) {
               class249.method2149(67, class765.field10942.method5512(-2, class777.field11340), 4);
            } else {
               String var4 = class197.method1724(true, arg2);
               if (var4 != null) {
                  byte var10000;
                  label99: {
                     int var5 = 0;
                     if (var3) {
                        var10000 = 1;
                     } else if (class265.field4046 <= var5) {
                        var10000 = 0;
                        if (!var3) {
                           break label99;
                        }
                     } else {
                        var10000 = 1;
                     }

                     while(true) {
                        String var6 = class197.method1724((boolean)var10000, class321.field4793[var5]);
                        if (var6 != null && var6.equals(var4)) {
                           class249.method2149(-3, arg2 + class765.field10943.method5512(-2, class777.field11340), 4);
                           return;
                        }

                        if (class169.field2533[var5] != null) {
                           String var7 = class197.method1724(true, class169.field2533[var5]);
                           if (var7 != null && var7.equals(var4)) {
                              class249.method2149(-96, arg2 + class765.field10943.method5512(-2, class777.field11340), 4);
                              return;
                           }
                        }

                        ++var5;
                        if (class265.field4046 <= var5) {
                           var10000 = 0;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = 1;
                        }
                     }
                  }

                  int var8 = var10000;
                  String var9;
                  String var10;
                  if (var3) {
                     var9 = class197.method1724(true, class201.field2879[var8]);
                     if (var9 != null && var9.equals(var4)) {
                        class249.method2149(-106, class765.field10948.method5512(-2, class777.field11340) + arg2 + class765.field10949.method5512(-2, class777.field11340), 4);
                        return;
                     }

                     if (class428.field6276[var8] != null) {
                        var10 = class197.method1724(true, class428.field6276[var8]);
                        if (var10 != null && var10.equals(var4)) {
                           class249.method2149(93, class765.field10948.method5512(-2, class777.field11340) + arg2 + class765.field10949.method5512(-2, class777.field11340), 4);
                           return;
                        }
                     }

                     ++var8;
                  }

                  while(true) {
                     boolean var15;
                     if (~class428.field6272 >= ~var8) {
                        var15 = class197.method1724(true, class117.field1849.field2402).equals(var4);
                        if (!var3) {
                           if (var15) {
                              class249.method2149(60, class765.field10945.method5512(-2, class777.field11340), 4);
                              return;
                           }

                           ++class254.field3859;
                           class242 var11 = class735.method5318(-123);
                           class381 var12 = class801.method5775(class482.field6915, 0, var11.field3718);
                           var12.field5570.method656((byte)30, class519.method3880(false, arg2) + 1);
                           var12.field5570.method658(arg2, -61);
                           if (arg0 >= -22) {
                              return;
                           }

                           var12.field5570.method656((byte)49, arg1 ? 1 : 0);
                           var11.method2111(14024, var12);
                           return;
                        }
                     } else {
                        var15 = true;
                     }

                     var9 = class197.method1724(var15, class201.field2879[var8]);
                     if (var9 != null && var9.equals(var4)) {
                        class249.method2149(-106, class765.field10948.method5512(-2, class777.field11340) + arg2 + class765.field10949.method5512(-2, class777.field11340), 4);
                        return;
                     }

                     if (class428.field6276[var8] != null) {
                        var10 = class197.method1724(true, class428.field6276[var8]);
                        if (var10 != null && var10.equals(var4)) {
                           class249.method2149(93, class765.field10948.method5512(-2, class777.field11340) + arg2 + class765.field10949.method5512(-2, class777.field11340), 4);
                           return;
                        }
                     }

                     ++var8;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field2801[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2801[1] : field2801[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1699(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1700(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
