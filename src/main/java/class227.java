import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class227 extends class775 {
   @OriginalMember(
      owner = "client!ri",
      name = "B",
      descriptor = "I"
   )
   private int field3451 = -1;
   @OriginalMember(
      owner = "client!ri",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3456 = new String[]{method1968(method1967("x\u000598\u0000")), method1968(method1967("m^{z")), method1968(method1967("qB9WU")), method1968(method1967("qB9TU")), method1968(method1967("qB9SU")), method1968(method1967("qB9UU")), method1968(method1967("qB9RU")), method1968(method1967("qB9^U")), method1968(method1967(".\u0006)6")), method1968(method1967("qB9QU")), method1968(method1967("qB9PU"))};
   @OriginalMember(
      owner = "client!ri",
      name = "x",
      descriptor = "Z"
   )
   public static boolean field3443 = true;
   @OriginalMember(
      owner = "client!ri",
      name = "C",
      descriptor = "Lac;"
   )
   public static class303 field3447 = new class303();
   @OriginalMember(
      owner = "client!ri",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field3454 = new int[6];
   @OriginalMember(
      owner = "client!ri",
      name = "w",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field3455 = new String[]{method1968(method1967("fE")), method1968(method1967("gN")), method1968(method1967("eY")), method1968(method1967("s_")), method1968(method1967("mG"))};
   @OriginalMember(
      owner = "client!ri",
      name = "E",
      descriptor = "F"
   )
   public static float field3452;
   @OriginalMember(
      owner = "client!ri",
      name = "v",
      descriptor = "I"
   )
   public static int field3444;
   @OriginalMember(
      owner = "client!ri",
      name = "y",
      descriptor = "I"
   )
   public static int field3445;
   @OriginalMember(
      owner = "client!ri",
      name = "F",
      descriptor = "I"
   )
   public static int field3446;
   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "I"
   )
   public static int field3448;
   @OriginalMember(
      owner = "client!ri",
      name = "A",
      descriptor = "I"
   )
   public static int field3449;
   @OriginalMember(
      owner = "client!ri",
      name = "D",
      descriptor = "I"
   )
   public static int field3450;
   @OriginalMember(
      owner = "client!ri",
      name = "t",
      descriptor = "I"
   )
   public static int field3453;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(BILrr;)Lqda;",
      line = 3
   )
   public static final class697 method1961(byte arg0, int arg1, class678 arg2) {
      try {
         int var3 = -75 / ((-34 - arg0) / 52);
         ++field3446;
         byte[] var4 = arg2.method5025(0, arg1);
         return var4 == null ? null : new class697(var4);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3456[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3456[0] : field3456[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(Lgv;B)Z",
      line = 20
   )
   public static final boolean method1962(class12 arg0, byte arg1) {
      try {
         if (arg1 <= 80) {
            method1966((byte)0);
         }

         ++field3449;
         return class462.field7027 == arg0 || class169.field2583 == arg0 || class658.field9840 == arg0 || class734.field10934 == arg0 || class691.field10260 == arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3456[6] + (arg0 != null ? field3456[0] : field3456[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(Z)V",
      line = 33
   )
   public static final void method1963(boolean arg0) {
      boolean var1 = client.field1786;

      try {
         label61: {
            if (~class590.field8700 < -1) {
               int var2 = 0;
               int var3 = 0;
               if (var1) {
                  if (~class168.field2568[var3].indexOf(field3456[8]) != 0) {
                     ++var2;
                     if (class590.field8700 == var2) {
                        class552.field8265 = class168.field2568[var3].substring(class168.field2568[var3].indexOf(">") - -2);
                        if (!var1) {
                           break label61;
                        }
                     }
                  }

                  ++var3;
               }

               while(true) {
                  while(~class168.field2568.length < ~var3) {
                     if (~class168.field2568[var3].indexOf(field3456[8]) != 0) {
                        ++var2;
                        if (class590.field8700 == var2) {
                           class552.field8265 = class168.field2568[var3].substring(class168.field2568[var3].indexOf(">") - -2);
                           if (!var1) {
                              break label61;
                           }
                        }
                     }

                     ++var3;
                  }

                  if (!var1) {
                     if (!var1) {
                        break label61;
                     }
                     break;
                  }

                  ++var3;
               }
            }

            class552.field8265 = "";
         }

         ++field3445;
         if (arg0) {
            field3447 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3456[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "b",
      descriptor = "(B)V",
      line = 69
   )
   public static void method1964(byte arg0) {
      try {
         field3455 = null;
         field3447 = null;
         if (arg0 < -52) {
            field3454 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3456[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 81
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         int var3 = 127 / ((-23 - arg1) / 45);
         arg0.method1941(this.field3451, -108);
         ++field3448;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3456[2] + (arg0 != null ? field3456[0] : field3456[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(IIIIIIBI)V",
      line = 92
   )
   public static final void method1965(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 266
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         ++field3444;
         this.field3451 = arg0.method2848(-119);
         int var3 = -86 % ((arg1 - -84) / 34);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3456[5] + (arg0 != null ? field3456[0] : field3456[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "c",
      descriptor = "(B)V",
      line = 276
   )
   public static final void method1966(byte arg0) {
      try {
         if (class55.field683 == 1 || class55.field683 == 3 || class55.field683 != class320.field4910 && (~class55.field683 == -1 || ~class320.field4910 == -1)) {
            class522.field7961 = 0;
            class615.field8929 = 0;
            class501.field7665.method3149(arg0 ^ 110);
         }

         if (arg0 != -1) {
            field3452 = -1.0418731F;
         }

         ++field3450;
         class320.field4910 = class55.field683;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3456[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1967(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1968(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
