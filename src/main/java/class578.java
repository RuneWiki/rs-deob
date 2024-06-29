import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class578 {
   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8581 = new String[]{method4269(method4268("\f\u0001hdH")), method4269(method4268("\f\u0001hfH")), method4269(method4268("\u000e\u0005*K")), method4269(method4268("\b\u0002|K\u0012")), method4269(method4268("\u001b^h\t\u001d")), method4269(method4268("\f\u0001hcH")), method4269(method4268("\f\u0001heH"))};
   @OriginalMember(
      owner = "client!lq",
      name = "c",
      descriptor = "I"
   )
   public static int field8576 = 0;
   @OriginalMember(
      owner = "client!lq",
      name = "e",
      descriptor = "J"
   )
   public static long field8578 = -1L;
   @OriginalMember(
      owner = "client!lq",
      name = "d",
      descriptor = "I"
   )
   public static int field8575;
   @OriginalMember(
      owner = "client!lq",
      name = "f",
      descriptor = "I"
   )
   public static int field8577;
   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "I"
   )
   public static int field8579;
   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "I"
   )
   public static int field8580;

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(ILiaa;B)Z"
   )
   public static final boolean method4264(int arg0, class520 arg1, byte arg2) {
      try {
         ++field8580;
         int var3 = arg1.method3829(-81, 2);
         if (~var3 == -1) {
            if (arg1.method3829(-76, 1) != 0) {
               method4264(arg0, arg1, (byte)100);
            }

            int var4 = arg1.method3829(-52, 6);
            int var5 = arg1.method3829(-84, 6);
            boolean var6 = arg1.method3829(-117, 1) == 1;
            if (var6) {
               class356.field5401[class276.field3852++] = arg0;
            }

            if (class661.field9578[arg0] != null) {
               throw new RuntimeException(field8581[3]);
            } else {
               class757 var7 = class252.field3369[arg0];
               class687 var8 = class661.field9578[arg0] = new class687();
               var8.field6027 = arg0;
               if (class496.field7338[arg0] != null) {
                  var8.method4993(-124, class496.field7338[arg0]);
               }

               var8.method3048(10, var7.field11165, true);
               var8.field6048 = var7.field11169;
               int var9 = var7.field11166;
               int var10 = var9 >> 28;
               int var11 = var9 >> 14 & 255;
               int var12 = 255 & var9;
               int var13 = (var11 << 6) - -var4 + -class718.field10676;
               int var14 = (var12 << 6) + -class669.field10064 + var5;
               var8.field10318 = var7.field11162;
               var8.field10302 = var7.field11164;
               var8.field6113[0] = class790.field11482[arg0];
               var8.field9010 = var8.field9005 = (byte)var10;
               if (class598.method4378(var13, (byte)-64, var14)) {
                  ++var8.field9005;
               }

               var8.method5001(63, var13, var14);
               var8.field10336 = false;
               class252.field3369[arg0] = null;
               return true;
            }
         } else if (~var3 == -2) {
            int var15 = arg1.method3829(-119, 2);
            int var16 = class252.field3369[arg0].field11166;
            class252.field3369[arg0].field11166 = ((var16 >> 28) + var15 << 28 & 805306368) + (268435455 & var16);
            return false;
         } else if (~var3 == -3) {
            int var17 = arg1.method3829(-33, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class252.field3369[arg0].field11166;
            int var21 = 3 & (var20 >> 28) + var18;
            int var22 = 255 & var20 >> 14;
            int var23 = 255 & var20;
            if (var19 == 0) {
               --var22;
               --var23;
            }

            if (var19 == 1) {
               --var23;
            }

            if (~var19 == -3) {
               ++var22;
               --var23;
            }

            if (var19 == 3) {
               --var22;
            }

            if (~var19 == -5) {
               ++var22;
            }

            if (~var19 == -6) {
               --var22;
               ++var23;
            }

            if (var19 == 6) {
               ++var23;
            }

            if (var19 == 7) {
               ++var22;
               ++var23;
            }

            class252.field3369[arg0].field11166 = (var21 << 28) + (var22 << 14) + var23;
            return false;
         } else {
            int var24 = arg1.method3829(-21, 18);
            int var25 = var24 >> 16;
            int var26 = 255 & var24 >> 8;
            int var27 = 255 & var24;
            if (arg2 < 56) {
               return true;
            } else {
               int var28 = class252.field3369[arg0].field11166;
               int var29 = 3 & (var28 >> 28) + var25;
               int var30 = 255 & (var28 >> 14) + var26;
               int var31 = var27 + var28 & 255;
               class252.field3369[arg0].field11166 = (var29 << 28) + (var30 << 14) - -var31;
               return false;
            }
         }
      } catch (RuntimeException var33) {
         throw class670.method4877(var33, field8581[1] + arg0 + ',' + (arg1 != null ? field8581[4] : field8581[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4265(int arg0, int arg1) {
      try {
         class9.field136 = 0;
         class660.field9563 = null;
         ++field8579;
         class357.field5407 = arg1;
         class627.field9106 = 1;
         class660.field9569 = false;
         class67.field837 = null;
         class560.field8372 = -1;
         if (arg0 < 45) {
            field8578 = 56L;
         }

         class668.field10055 = -1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8581[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method4266(byte arg0) {
      try {
         if (arg0 != -71) {
            field8578 = 102L;
         }

         ++field8577;
         return class623.field9082.method3010((byte)116);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8581[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method4267(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 <= 2) {
            return -26;
         } else {
            ++field8575;
            int var3 = -128 + class614.method4464(arg2 + 45365, arg1 - -91923, -1, 4) + ((-128 + class614.method4464(arg2 + 10294, arg1 + 37821, -1, 2) >> 1) - -(-128 + class614.method4464(arg2, arg1, -1, 1) >> 2));
            int var4 = (int)((double)var3 * 0.3D) + 35;
            if (var4 >= 10) {
               if (var4 <= 60) {
                  return var4;
               }

               var4 = 60;
               if (client.field4530 == 0) {
                  return var4;
               }
            }

            var4 = 10;
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8581[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4268(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4269(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
