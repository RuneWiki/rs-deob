import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class15 {
   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field215 = new String[]{method130(method129("}\u001cM\u0017\u0003")), method130(method129("hG\u000fU")), method130(method129("eSM|V")), method130(method129("eSM\u007fV")), method130(method129("eSM{V")), method130(method129("eSM}V")), method130(method129("eSMxV"))};
   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "[Z"
   )
   public static boolean[] field210 = new boolean[100];
   @OriginalMember(
      owner = "client!ca",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field212 = new class724(100, -2);
   @OriginalMember(
      owner = "client!ca",
      name = "g",
      descriptor = "I"
   )
   public static int field208;
   @OriginalMember(
      owner = "client!ca",
      name = "d",
      descriptor = "I"
   )
   public static int field209;
   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "I"
   )
   public static int field211;
   @OriginalMember(
      owner = "client!ca",
      name = "e",
      descriptor = "I"
   )
   public static int field213;
   @OriginalMember(
      owner = "client!ca",
      name = "c",
      descriptor = "I"
   )
   public static int field214;

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method123(int arg0) {
      try {
         int var1 = 107 % ((12 - arg0) / 50);
         ++field209;
         class448.field6532.method1045(3);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field215[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method124(byte arg0) {
      try {
         field212 = null;
         field210 = null;
         if (arg0 != -101) {
            field214 = -82;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field215[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method125(int arg0, int arg1) {
      return class175.field2603 != null ? class175.field2603[arg0][arg1] & 65535 : 0;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(ILbt;)I"
   )
   public static final int method126(int arg0, class395 arg1) {
      try {
         ++field208;
         if (~arg1.field5839 == -1) {
            return 0;
         } else {
            if (~arg1.field5798 != arg0) {
               class395 var2 = null;
               if (arg1.field5798 < 32768) {
                  class432 var3 = (class432)class573.field8110.method3101(-1, (long)arg1.field5798);
                  if (var3 != null) {
                     var2 = var3.field6345;
                  }
               } else if (~arg1.field5798 <= -32769) {
                  var2 = class501.field7137[arg1.field5798 - 32768];
               }

               if (var2 != null) {
                  int var4 = -var2.field6832 + arg1.field6832;
                  int var5 = -var2.field6833 + arg1.field6833;
                  if (~var4 != -1 || var5 != 0) {
                     arg1.method3071(16383 & (int)(2607.5945876176133D * Math.atan2((double)var4, (double)var5)), 16384);
                  }
               }
            }

            if (arg1 instanceof class158) {
               class158 var6 = (class158)arg1;
               if (~var6.field2419 == 0 || var6.field5860 != 0 && ~var6.field5855 >= -1) {
                  return arg1.method3081(false);
               }

               var6.method3071(var6.field2419, 16384);
               var6.field2419 = -1;
               if (!client.field10022) {
                  return arg1.method3081(false);
               }
            }

            if (arg1 instanceof class799) {
               class799 var7 = (class799)arg1;
               if (~var7.field11624 != 0 && (~var7.field5860 == -1 || ~var7.field5855 < -1)) {
                  int var8 = var7.field6832 - (var7.field11624 - (class115.field1824 - -class115.field1824)) * 256;
                  int var9 = -((-class480.field6903 + -class480.field6903 + var7.field11626) * 256) + var7.field6833;
                  if (~var8 != -1 || var9 != 0) {
                     var7.method3071((int)(Math.atan2((double)var8, (double)var9) * 2607.5945876176133D) & 16383, 16384);
                  }

                  var7.field11624 = -1;
               }
            }

            return arg1.method3081(false);
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field215[2] + arg0 + ',' + (arg1 != null ? field215[0] : field215[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(BI)Ljava/lang/String;"
   )
   public static final String method127(byte arg0, int arg1) {
      try {
         ++field213;
         int var2 = -46 / ((arg0 - 80) / 35);
         return (255 & arg1 >> 24) + "." + (arg1 >> 16 & 255) + "." + (255 & arg1 >> 8) + "." + (255 & arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field215[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method128(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 == 56) {
            ++field211;
            if (class613.method4509(arg2 + 62)) {
               if (~class777.field11335 != ~arg1) {
                  class704.field10134 = "";
               }

               class585.field8203 = arg0;
               class777.field11335 = arg1;
               class755.method5457(6, false);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field215[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method129(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method130(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
