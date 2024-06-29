import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class130 implements class644 {
   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "I"
   )
   public int field2164;
   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2167 = new String[]{method1251(method1250("Kb\b\u0018%")), method1251(method1250("Kb\b\u001b%")), method1251(method1250("Kb\bfdFdRd%")), method1251(method1250("FxJ6")), method1251(method1250("Kb\b\u0019%")), method1251(method1250("S#\btp"))};
   @OriginalMember(
      owner = "client!co",
      name = "b",
      descriptor = "I"
   )
   public static int field2163 = 100;
   @OriginalMember(
      owner = "client!co",
      name = "c",
      descriptor = "I"
   )
   public static int field2162;
   @OriginalMember(
      owner = "client!co",
      name = "d",
      descriptor = "I"
   )
   public static int field2165;
   @OriginalMember(
      owner = "client!co",
      name = "e",
      descriptor = "I"
   )
   public static int field2166;

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(B)Lqg;",
      line = 5
   )
   public final class485 method672(byte arg0) {
      try {
         if (arg0 != 83) {
            method1248(121, (char)65421);
         }

         ++field2166;
         return class313.field4510;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2167[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(IC)Z",
      line = 17
   )
   public static final boolean method1248(int arg0, char arg1) {
      try {
         if (arg0 != -1) {
            field2163 = -74;
         }

         ++field2165;
         if (~arg1 <= -33 && arg1 <= '~') {
            return true;
         } else if (arg1 >= 160 && arg1 <= 255) {
            return true;
         } else {
            return arg1 == 8364 || ~arg1 == -339 || arg1 == 8212 || arg1 == 339 || arg1 == 376;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2167[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(Lss;ZB)V",
      line = 40
   )
   public static final void method1249(class452 arg0, boolean arg1, byte arg2) {
      boolean var3 = client.field4564;

      try {
         if (arg2 != -74) {
            field2163 = 11;
         }

         label101: {
            if (arg0.field6619) {
               if (~arg0.field6623 <= -1 && !class654.method4805(0, arg0.field6614, arg0.field6623)) {
                  break label101;
               }

               label97: {
                  if (!arg1) {
                     class690.method5021(arg0.field6616, arg0.field6617, arg0.field6613, -19897, arg0.field6622, arg0.field6625, arg0.field6614, -1, arg0.field6623);
                     if (!var3) {
                        break label97;
                     }
                  }

                  class438.method3287(arg0.field6622, true, arg0.field6625, arg0.field6616, (class152)null, arg0.field6613);
               }

               arg0.method154(arg2 + 162);
               if (!var3) {
                  break label101;
               }
            }

            if (arg0.field6624 && ~arg0.field6622 <= -2 && arg0.field6613 >= 1 && ~(class209.field3112 + -2) <= ~arg0.field6622 && arg0.field6613 <= class1.field3 + -2 && (~arg0.field6618 > -1 || class654.method4805(arg2 ^ -74, arg0.field6612, arg0.field6618))) {
               label112: {
                  label79: {
                     if (arg1) {
                        class438.method3287(arg0.field6622, true, arg0.field6625, arg0.field6616, arg0.field6621, arg0.field6613);
                        if (!var3) {
                           break label79;
                        }
                     }

                     class690.method5021(arg0.field6616, arg0.field6615, arg0.field6613, -19897, arg0.field6622, arg0.field6625, arg0.field6612, -1, arg0.field6618);
                  }

                  arg0.field6624 = false;
                  if (!arg1 && arg0.field6623 == arg0.field6618 && arg0.field6623 == -1) {
                     arg0.method154(-126);
                     if (!var3) {
                        break label112;
                     }
                  }

                  if (!arg1 && arg0.field6623 == arg0.field6618 && ~arg0.field6617 == ~arg0.field6615 && ~arg0.field6614 == ~arg0.field6612) {
                     arg0.method154(arg2 + -52);
                  }
               }
            }
         }

         ++field2162;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2167[4] + (arg0 != null ? field2167[5] : field2167[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "<init>",
      descriptor = "(I)V",
      line = 91
   )
   public class130(int arg0) {
      try {
         this.field2164 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2167[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
