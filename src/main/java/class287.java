import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class287 {
   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4297 = new String[]{method2387(method2386(";u1\r[")), method2387(method2386("0<1a\u000e")), method2387(method2386("%gs#")), method2387(method2386("#`%#\u0001")), method2387(method2386(";u1\u000e["))};
   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field4296 = new class724(1, 6);
   @OriginalMember(
      owner = "client!pg",
      name = "b",
      descriptor = "I"
   )
   public static int field4294;
   @OriginalMember(
      owner = "client!pg",
      name = "c",
      descriptor = "I"
   )
   public static int field4295;

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2384(boolean arg0) {
      try {
         if (!arg0) {
            method2385((byte)-52, -100, (class408)null);
         }

         field4296 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4297[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(BILlw;)Z"
   )
   public static final boolean method2385(byte arg0, int arg1, class408 arg2) {
      try {
         ++field4294;
         int var3 = arg2.method3195(114, 2);
         if (~var3 == -1) {
            if (~arg2.method3195(118, 1) != -1) {
               method2385((byte)27, arg1, arg2);
            }

            int var4 = arg2.method3195(112, 6);
            int var5 = arg2.method3195(116, 6);
            boolean var6 = arg2.method3195(127, 1) == 1;
            if (var6) {
               class302.field4541[class36.field527++] = arg1;
            }

            if (class501.field7137[arg1] != null) {
               throw new RuntimeException(field4297[3]);
            } else {
               class653 var7 = class775.field11301[arg1];
               class158 var8 = class501.field7137[arg1] = new class158();
               var8.field5826 = arg1;
               if (class756.field10814[arg1] != null) {
                  var8.method1502(class756.field10814[arg1], -73);
               }

               var8.method3075(true, var7.field9255, -1);
               var8.field5798 = var7.field9252;
               int var9 = var7.field9250;
               int var10 = var9 >> 28;
               int var11 = var9 >> 14 & 255;
               int var12 = var9 & 255;
               int var13 = (var11 << 6) + -class115.field1824 + var4;
               var8.field2394 = var7.field9248;
               int var14 = (var12 << 6) + var5 + -class480.field6903;
               var8.field2399 = var7.field9249;
               var8.field5859[0] = class466.field6768[arg1];
               var8.field6824 = var8.field6826 = (byte)var10;
               if (class172.method1598(var14, var13, 109)) {
                  ++var8.field6826;
               }

               var8.method1504(var13, var14, 126);
               var8.field2397 = false;
               class775.field11301[arg1] = null;
               return true;
            }
         } else if (~var3 == -2) {
            int var15 = arg2.method3195(126, 2);
            int var16 = class775.field11301[arg1].field9250;
            class775.field11301[arg1].field9250 = ((var16 >> 28) + var15 << 28 & 805306368) + (268435455 & var16);
            return false;
         } else if (~var3 == -3) {
            int var17 = arg2.method3195(120, 5);
            int var18 = var17 >> 3;
            int var19 = 7 & var17;
            int var20 = class775.field11301[arg1].field9250;
            int var21 = (var20 >> 28) + var18 & 3;
            int var22 = (4185209 & var20) >> 14;
            int var23 = var20 & 255;
            if (var19 == 0) {
               --var22;
               --var23;
            }

            if (~var19 == -2) {
               --var23;
            }

            if (var19 == 2) {
               --var23;
               ++var22;
            }

            if (~var19 == -4) {
               --var22;
            }

            if (~var19 == -5) {
               ++var22;
            }

            if (~var19 == -6) {
               --var22;
               ++var23;
            }

            if (~var19 == -7) {
               ++var23;
            }

            if (~var19 == -8) {
               ++var22;
               ++var23;
            }

            class775.field11301[arg1].field9250 = (var21 << 28) + (var22 << 14) + var23;
            return false;
         } else {
            int var24 = arg2.method3195(113, 18);
            int var25 = var24 >> 16;
            int var26 = 255 & var24 >> 8;
            if (arg0 <= 2) {
               method2385((byte)65, -103, (class408)null);
            }

            int var27 = var24 & 255;
            int var28 = class775.field11301[arg1].field9250;
            int var29 = 3 & (var28 >> 28) - -var25;
            int var30 = (var28 >> 14) - -var26 & 255;
            int var31 = 255 & var28 - -var27;
            class775.field11301[arg1].field9250 = (var30 << 14) + ((var29 << 28) - -var31);
            return false;
         }
      } catch (RuntimeException var33) {
         throw class612.method4503(var33, field4297[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4297[1] : field4297[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2386(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2387(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
