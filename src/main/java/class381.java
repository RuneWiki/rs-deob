import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class381 extends class247 {
   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5573 = new String[]{method2978(method2977("mk \u0019<")), method2978(method2977("x0b[")), method2978(method2977("d' ri")), method2978(method2977("_+xV-\u007f!.E r,v\r")), method2978(method2977("d' ui")), method2978(method2977("d' vi")), method2978(method2977("d' si")), method2978(method2977("d' ti"))};
   @OriginalMember(
      owner = "client!rb",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field5564 = true;
   @OriginalMember(
      owner = "client!rb",
      name = "m",
      descriptor = "I"
   )
   public int field5563;
   @OriginalMember(
      owner = "client!rb",
      name = "p",
      descriptor = "I"
   )
   public static int field5565;
   @OriginalMember(
      owner = "client!rb",
      name = "l",
      descriptor = "I"
   )
   public int field5566;
   @OriginalMember(
      owner = "client!rb",
      name = "r",
      descriptor = "I"
   )
   public static int field5567;
   @OriginalMember(
      owner = "client!rb",
      name = "k",
      descriptor = "I"
   )
   public static int field5569;
   @OriginalMember(
      owner = "client!rb",
      name = "o",
      descriptor = "I"
   )
   public static int field5571;
   @OriginalMember(
      owner = "client!rb",
      name = "s",
      descriptor = "I"
   )
   public static int field5572;
   @OriginalMember(
      owner = "client!rb",
      name = "q",
      descriptor = "Lfm;"
   )
   public class164 field5568;
   @OriginalMember(
      owner = "client!rb",
      name = "n",
      descriptor = "Llw;"
   )
   public class408 field5570;

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(Lbt;I)V"
   )
   public static final void method2972(class395 arg0, int arg1) {
      try {
         ++field5571;
         class258 var2 = arg0.field5831;
         if (~class51.field770 == ~arg0.field5836 || !var2.method2201((byte)-39) || var2.method2209((byte)113, 1)) {
            int var3 = -arg0.field5837 + arg0.field5836;
            int var4 = -arg0.field5837 + class51.field770;
            int var5 = arg0.field5849 * 512 - -(arg0.method1507(-91) * 256);
            int var6 = arg0.field5848 * 512 - -(arg0.method1507(-106) * 256);
            int var7 = arg0.field5832 * 512 + 256 * arg0.method1507(arg1 ^ 87);
            int var8 = arg0.field5840 * 512 + arg0.method1507(arg1 ^ 123) * 256;
            arg0.field6832 = ((-var4 + var3) * var5 + var4 * var7) / var3;
            arg0.field6833 = ((var3 - var4) * var6 + var4 * var8) / var3;
         }

         arg0.field5855 = 0;
         if (~arg0.field5850 == arg1) {
            arg0.method3075(false, 8192, -1);
         }

         if (~arg0.field5850 == -2) {
            arg0.method3075(false, 12288, -1);
         }

         if (~arg0.field5850 == -3) {
            arg0.method3075(false, 0, -1);
         }

         if (arg0.field5850 == 3) {
            arg0.method3075(false, 4096, -1);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5573[6] + (arg0 != null ? field5573[0] : field5573[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2973(int arg0) {
      try {
         ++field5569;
         if (class735.field10474 < class186.field2760.length) {
            class186.field2760[class735.field10474++] = this;
            int var2 = -127 % ((arg0 - -82) / 38);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5573[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method2974(int arg0, byte arg1, int arg2) {
      try {
         ++field5572;
         if (arg1 != -70) {
            return false;
         } else {
            return (arg0 & 2048) != 0 | class162.method1528(arg2, arg1 + 70, arg0) || class266.method2276(arg0, arg2, 118);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5573[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(BLsa;)I"
   )
   public static final int method2975(byte arg0, class39 arg1) {
      try {
         ++field5567;
         int var2 = 0;
         if (arg1.method450(0, class703.field10123)) {
            ++var2;
         }

         if (arg1.method450(0, class395.field5789)) {
            ++var2;
         }

         if (arg1.method450(0, class631.field8973)) {
            ++var2;
         }

         if (arg1.method450(0, class122.field1964)) {
            ++var2;
         }

         if (arg1.method450(0, class595.field8390)) {
            ++var2;
         }

         if (arg1.method450(arg0 + -126, class235.field3641)) {
            ++var2;
         }

         if (arg1.method450(0, class69.field1003)) {
            ++var2;
         }

         if (arg1.method450(arg0 + -126, class121.field1939)) {
            ++var2;
         }

         if (arg1.method450(0, class238.field3674)) {
            ++var2;
         }

         if (arg1.method450(0, class692.field9954)) {
            ++var2;
         }

         if (arg1.method450(0, class692.field9977)) {
            ++var2;
         }

         if (arg0 != 126) {
            return 20;
         } else {
            if (arg1.method450(0, class691.field9945)) {
               ++var2;
            }

            if (arg1.method450(0, class521.field7331)) {
               ++var2;
            }

            if (arg1.method450(0, class533.field7517)) {
               ++var2;
            }

            if (arg1.method450(0, class264.field4041)) {
               ++var2;
            }

            if (arg1.method450(0, class589.field8278)) {
               ++var2;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5573[2] + arg0 + ',' + (arg1 != null ? field5573[0] : field5573[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(IZBI)Ljava/lang/String;"
   )
   public static final String method2976(int arg0, boolean arg1, byte arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field5565;
         if (arg0 >= 2 && ~arg0 >= -37) {
            if (arg1 && ~arg3 <= -1) {
               int var5 = 2;
               int var6 = arg3 / arg0;
               if (var4) {
                  var6 /= arg0;
                  ++var5;
               }

               while(true) {
                  int var10000;
                  int var10001;
                  if (var6 == 0) {
                     char[] var7 = new char[var5];
                     var7[0] = '+';
                     int var8 = var5 + -1;
                     var10000 = arg2;
                     var10001 = 58;
                     if (!var4) {
                        if (arg2 <= 58) {
                           return null;
                        }

                        while(~var8 < -1) {
                           label35: {
                              int var9 = arg3;
                              arg3 /= arg0;
                              int var10 = var9 - arg0 * arg3;
                              if (~var10 <= -11) {
                                 var7[var8] = (char)(var10 + 87);
                                 if (!var4) {
                                    break label35;
                                 }
                              }

                              var7[var8] = (char)(var10 + 48);
                           }

                           --var8;
                        }

                        return new String(var7);
                     }
                  } else {
                     var10000 = var6;
                     var10001 = arg0;
                  }

                  var6 = var10000 / var10001;
                  ++var5;
               }
            } else {
               return Integer.toString(arg3, arg0);
            }
         } else {
            throw new IllegalArgumentException(field5573[3] + arg0);
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field5573[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2977(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2978(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
