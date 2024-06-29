import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class183 implements class191 {
   @OriginalMember(
      owner = "client!tca",
      name = "q",
      descriptor = "I"
   )
   public int field2280;
   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "I"
   )
   public int field2264;
   @OriginalMember(
      owner = "client!tca",
      name = "m",
      descriptor = "I"
   )
   public int field2271;
   @OriginalMember(
      owner = "client!tca",
      name = "g",
      descriptor = "I"
   )
   public int field2263;
   @OriginalMember(
      owner = "client!tca",
      name = "n",
      descriptor = "I"
   )
   public int field2270;
   @OriginalMember(
      owner = "client!tca",
      name = "i",
      descriptor = "I"
   )
   public int field2277;
   @OriginalMember(
      owner = "client!tca",
      name = "o",
      descriptor = "Lwm;"
   )
   public class590 field2262;
   @OriginalMember(
      owner = "client!tca",
      name = "j",
      descriptor = "I"
   )
   public int field2272;
   @OriginalMember(
      owner = "client!tca",
      name = "p",
      descriptor = "I"
   )
   public int field2278;
   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field2265;
   @OriginalMember(
      owner = "client!tca",
      name = "f",
      descriptor = "I"
   )
   public int field2267;
   @OriginalMember(
      owner = "client!tca",
      name = "l",
      descriptor = "I"
   )
   public int field2276;
   @OriginalMember(
      owner = "client!tca",
      name = "c",
      descriptor = "Lvh;"
   )
   public class378 field2273;
   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2281 = new String[]{method1438(method1437(" 7#h\\")), method1438(method1437("5la*")), method1438(method1437("/zlhcs")), method1438(method1437("/zlh`s")), method1438(method1437("/zlh\u001d2wd2\u001fs")), method1438(method1437("/zlhds")), method1438(method1437("/zlhbs")), method1438(method1437("/zlhes"))};
   @OriginalMember(
      owner = "client!tca",
      name = "k",
      descriptor = "I"
   )
   public static int field2266;
   @OriginalMember(
      owner = "client!tca",
      name = "d",
      descriptor = "I"
   )
   public static int field2268;
   @OriginalMember(
      owner = "client!tca",
      name = "r",
      descriptor = "I"
   )
   public static int field2274;
   @OriginalMember(
      owner = "client!tca",
      name = "s",
      descriptor = "I"
   )
   public static int field2275;
   @OriginalMember(
      owner = "client!tca",
      name = "e",
      descriptor = "I"
   )
   public static int field2279;
   @OriginalMember(
      owner = "client!tca",
      name = "h",
      descriptor = "Leaa;"
   )
   public static class526 field2269;

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(Lda;Lha;IZLpg;Ljava/lang/String;)V"
   )
   public static final void method1433(class67 arg0, class66 arg1, int arg2, boolean arg3, class763 arg4, String arg5) {
      try {
         ++field2266;
         boolean var6 = !class165.field2075 || class697.method5057(-32151);
         if (var6) {
            if (arg2 != 0) {
               method1434(-101, 75, 117);
            }

            label102: {
               if (!class165.field2075 || !var6) {
                  int var7 = arg4.method5524((class396[])null, arg5, (byte)-71, 250);
                  int var8 = 13 * arg4.method5531(250, arg2 ^ 67, (class396[])null, arg5);
                  byte var9 = 4;
                  int var10 = 6 - -var9;
                  int var11 = 6 - -var9;
                  arg1.method645(-var9 + var10, -var9 + var11, var7 - -var9 + var9, var8 + var9 + var9, -16777216, 0);
                  arg1.method553(-var9 + var10, -var9 + var11, var7 - -var9 + var9, var8 + var9 + var9, -1, 0);
                  arg0.method664(var10, 0, var11, 0, arg5, 1, -1, (class512)null, (class396[])null, 0, -1, -1, (int[])null, var8, var7, 1);
                  class181.method1420((byte)-39, -var9 + var10, var11 - var9, var8 + var9 + var9, var7 + var9 + var9);
                  if (client.field4530 == 0) {
                     break label102;
                  }
               }

               class763 var24 = class482.field7162;
               class67 var23 = arg1.method570(var24, class589.field8723, true);
               int var12 = var24.method5524((class396[])null, arg5, (byte)-71, 250);
               int var13 = var24.method5529(arg5, (class396[])null, (byte)76, 250, var24.field11209);
               int var14 = class16.field189.field10100;
               int var15 = var14 + 4;
               int var16 = var15 * 2 + var13;
               int var17 = var15 * 2 + var12;
               if (~var17 > ~class633.field9215) {
                  var17 = class633.field9215;
               }

               if (class477.field7094 > var16) {
                  var16 = class477.field7094;
               }

               int var18 = class663.field9605.method4343(15, class189.field2365, var17) + class289.field4051;
               int var19 = class486.field7189.method2922(class663.field9630, arg2 + 121, var16) + class115.field1382;
               if (class446.field6785) {
                  var18 += class325.method2458(arg2 + 29461);
                  var19 += class319.method2421(true);
               }

               arg1.method577(class154.field1942, false).method1974(class409.field6235.field10100 + var18, class409.field6235.field10097 + var19, -(class409.field6235.field10100 * 2) + var17, -(class409.field6235.field10097 * 2) + var16, 1, 0, 0);
               arg1.method577(class409.field6235, true).method3035(var18, var19);
               class409.field6235.method4886();
               arg1.method577(class409.field6235, true).method3035(var18 - -var17 + -var14, var19);
               class409.field6235.method4889();
               arg1.method577(class409.field6235, true).method3035(-var14 + var18 + var17, var19 - var14 + var16);
               class409.field6235.method4886();
               arg1.method577(class409.field6235, true).method3035(var18, -var14 + var19 + var16);
               class409.field6235.method4889();
               arg1.method577(class16.field189, true).method3032(var18, class409.field6235.field10097 + var19, var14, -(class409.field6235.field10097 * 2) + var16);
               class16.field189.method4882();
               arg1.method577(class16.field189, true).method3032(class409.field6235.field10100 + var18, var19, -(class409.field6235.field10100 * 2) + var17, var14);
               class16.field189.method4882();
               arg1.method577(class16.field189, true).method3032(var17 + var18 + -var14, class409.field6235.field10097 + var19, var14, -(class409.field6235.field10097 * 2) + var16);
               class16.field189.method4882();
               arg1.method577(class16.field189, true).method3032(var18 - -class409.field6235.field10100, -var14 + var16 + var19, -(class409.field6235.field10100 * 2) + var17, var14);
               class16.field189.method4882();
               var23.method664(var15 + var18, 0, var15 + var19, 0, arg5, 1, -1, (class512)null, (class396[])null, 0, -16777216 | class763.field11218, -1, (int[])null, -(var15 * 2) + var16, -(var15 * 2) + var17, 1);
               class181.method1420((byte)-39, var18, var19, var16, var17);
            }

            if (arg3) {
               try {
                  if (class446.field6785) {
                     class212.method1606(8);
                  } else {
                     arg1.method617((byte)40);
                  }
               } catch (class280 var21) {
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field2281[2] + (arg0 != null ? field2281[0] : field2281[1]) + ',' + (arg1 != null ? field2281[0] : field2281[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2281[0] : field2281[1]) + ',' + (arg5 != null ? field2281[0] : field2281[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1434(int arg0, int arg1, int arg2) {
      try {
         ++field2279;
         if (arg1 < 126) {
            method1435(-30, -98, -18, -3, false, -74, (byte)52, -14);
         }

         return ~(2048 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2281[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(I)Loi;"
   )
   public final class79 method1311(int arg0) {
      try {
         if (arg0 > -106) {
            this.method1311(109);
         }

         ++field2268;
         return class389.field5946;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2281[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(IIIIZIBI)V"
   )
   public static final void method1435(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7) {
      try {
         if (~(!arg4 ? class261.field3566.field9430.method1271(arg6 + 95) : class261.field3566.field9469.method1271(arg6 + 100)) != -1 && arg2 != 0 && ~class130.field1612 > -51 && ~arg1 != 0) {
            class321.field4575[class130.field1612++] = new class581((byte)(!arg4 ? 2 : 3), arg1, arg2, arg0, arg7, arg5, arg3, (class616)null);
         }

         if (arg6 == 3) {
            ++field2275;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2281[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1436(boolean arg0) {
      try {
         if (!arg0) {
            field2269 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2281[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Lwm;Lvh;IIIIIIIIII)V"
   )
   public class183(String arg0, class590 arg1, class378 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.field2280 = arg10;
         this.field2264 = arg6;
         this.field2271 = arg3;
         this.field2263 = arg9;
         this.field2270 = arg7;
         this.field2277 = arg4;
         this.field2262 = arg1;
         this.field2272 = arg8;
         this.field2278 = arg5;
         this.field2265 = arg0;
         this.field2267 = arg11;
         this.field2276 = arg12;
         this.field2273 = arg2;
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field2281[4] + (arg0 != null ? field2281[0] : field2281[1]) + ',' + (arg1 != null ? field2281[0] : field2281[1]) + ',' + (arg2 != null ? field2281[0] : field2281[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1437(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1438(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
