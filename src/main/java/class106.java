import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class106 {
   @OriginalMember(
      owner = "client!qja",
      name = "d",
      descriptor = "I"
   )
   public int field1473 = 128;
   @OriginalMember(
      owner = "client!qja",
      name = "e",
      descriptor = "I"
   )
   public int field1470 = 128;
   @OriginalMember(
      owner = "client!qja",
      name = "g",
      descriptor = "I"
   )
   public int field1464;
   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "I"
   )
   public int field1478;
   @OriginalMember(
      owner = "client!qja",
      name = "k",
      descriptor = "I"
   )
   public int field1463;
   @OriginalMember(
      owner = "client!qja",
      name = "j",
      descriptor = "I"
   )
   public int field1479;
   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1481 = new String[]{method1021(method1020("\u00117\u0018Z4H")), method1021(method1020("\u00117\u0018Z1H")), method1021(method1020("\u000e(\u0015\u0018")), method1021(method1020("\u001bsWZ\b")), method1021(method1020("\u00117\u0018Z6H")), method1021(method1020("\u00117\u0018Z7H")), method1021(method1020("\u00117\u0018Z0H")), method1021(method1020("\u00117\u0018ZI\t3\u0010\u0000KH"))};
   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "I"
   )
   public static int field1469 = 500;
   @OriginalMember(
      owner = "client!qja",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field1468 = new int[3];
   @OriginalMember(
      owner = "client!qja",
      name = "f",
      descriptor = "[F"
   )
   public static float[] field1466 = new float[4];
   @OriginalMember(
      owner = "client!qja",
      name = "q",
      descriptor = "I"
   )
   public static int field1461;
   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "I"
   )
   public int field1462;
   @OriginalMember(
      owner = "client!qja",
      name = "i",
      descriptor = "I"
   )
   public static int field1465;
   @OriginalMember(
      owner = "client!qja",
      name = "m",
      descriptor = "I"
   )
   public static int field1467;
   @OriginalMember(
      owner = "client!qja",
      name = "l",
      descriptor = "I"
   )
   public int field1471;
   @OriginalMember(
      owner = "client!qja",
      name = "n",
      descriptor = "I"
   )
   public static int field1472;
   @OriginalMember(
      owner = "client!qja",
      name = "t",
      descriptor = "I"
   )
   public int field1475;
   @OriginalMember(
      owner = "client!qja",
      name = "p",
      descriptor = "I"
   )
   public int field1476;
   @OriginalMember(
      owner = "client!qja",
      name = "h",
      descriptor = "I"
   )
   public int field1477;
   @OriginalMember(
      owner = "client!qja",
      name = "o",
      descriptor = "I"
   )
   public static int field1480;
   @OriginalMember(
      owner = "client!qja",
      name = "s",
      descriptor = "Liq;"
   )
   public static class92 field1474;

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(Lvea;ILha;Lkb;)V"
   )
   public static final void method1015(class77 arg0, int arg1, class610 arg2, class28 arg3) {
      boolean var4 = client.field1786;

      try {
         ++field1465;
         class672 var5 = arg0.method728(true, arg2);
         if (var5 != null) {
            int var6 = var5.method2104();
            if (var5.method2095() > var6) {
               var6 = var5.method2095();
            }

            byte var7 = 10;
            int var8 = arg3.field338;
            int var9 = arg3.field339;
            int var10 = arg1;
            int var11 = 0;
            int var12 = 0;
            if (arg0.field1013 != null) {
               var10 = class632.field9131.method5123(false, class259.field4269, (class672[])null, arg0.field1013, (int[])null);
               int var13 = 0;
               if (var4 || ~var13 > ~var10) {
                  do {
                     String var14 = class259.field4269[var13];
                     if (var10 + -1 > var13) {
                        var14 = var14.substring(0, var14.length() + -4);
                     }

                     int var15 = class426.field6581.method2773(var14);
                     if (var15 > var11) {
                        var11 = var15;
                     }

                     ++var13;
                  } while(~var13 > ~var10);
               }

               var12 = var10 * class426.field6581.method2768() + class426.field6581.method2771() / 2;
            }

            int var16;
            label102: {
               var16 = var6 / 2 + arg3.field338;
               if (~(class60.field761 - -var6) < ~var8) {
                  var16 = var6 / 2 + var11 / 2 + class60.field761 + var7 + 5;
                  var8 = class60.field761;
                  if (!var4) {
                     break label102;
                  }
               }

               if (~var8 < ~(class60.field769 - var6)) {
                  var16 = -(var11 / 2) + -var7 + -5 + -(var6 / 2) + class60.field769;
                  var8 = -var6 + class60.field769;
               }
            }

            int var17;
            label97: {
               var17 = arg3.field339;
               if (~(class60.field772 + var6) >= ~var9) {
                  if (~(class60.field767 - var6) <= ~var9) {
                     break label97;
                  }

                  var9 = -var6 + class60.field767;
                  var17 = class60.field767 - (var7 + var12) + -(var6 / 2);
                  if (!var4) {
                     break label97;
                  }
               }

               var17 = class60.field772 - (-(var6 / 2) + -var7);
               var9 = class60.field772;
            }

            int var18 = 65535 & (int)(Math.atan2((double)(-arg3.field338 + var8), (double)(-arg3.field339 + var9)) / 3.141592653589793D * 32767.0D);
            var5.method4951((float)var6 / 2.0F + (float)var8, (float)var6 / 2.0F + (float)var9, 4096, var18);
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            int var22 = -2;
            if (arg0.field1013 != null) {
               var20 = var17;
               var19 = -(var11 / 2) + var16 + -5;
               var21 = var19 - -var11 - -10;
               var22 = 3 + class426.field6581.method2768() * var10 + var17;
               if (arg0.field1022 != 0) {
                  arg2.method4502(var19, 0, arg0.field1022, -var19 + var21, var17, -var17 + var22);
               }

               if (~arg0.field999 != -1) {
                  arg2.method4500(1, -var19 + var21, var19, var17, -var17 + var22, arg0.field999);
               }

               int var23 = 0;
               if (var4 || var23 < var10) {
                  do {
                     String var24 = class259.field4269[var23];
                     if (var23 < var10 + -1) {
                        var24 = var24.substring(0, var24.length() - 4);
                     }

                     class426.field6581.method2770(arg2, var24, var16, var17, arg0.field1029, true);
                     var17 += class426.field6581.method2768();
                     ++var23;
                  } while(var23 < var10);
               }
            }

            if (arg0.field1009 != -1 || arg0.field1013 != null) {
               int var25 = var6 >> 1;
               class719 var26 = new class719(arg3);
               var26.field10771 = var21;
               var26.field10775 = var9 - -var25;
               var26.field10769 = -var25 + var8;
               var26.field10776 = var20;
               var26.field10781 = var8 + var25;
               var26.field10777 = var19;
               var26.field10770 = var22;
               var26.field10773 = -var25 + var9;
               class788.field11542.method4980(var26, arg1);
            }

         }
      } catch (RuntimeException var28) {
         throw class482.method3757(var28, field1481[1] + (arg0 != null ? field1481[3] : field1481[2]) + ',' + arg1 + ',' + (arg2 != null ? field1481[3] : field1481[2]) + ',' + (arg3 != null ? field1481[3] : field1481[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1016(int arg0) {
      try {
         field1474 = null;
         field1466 = null;
         if (arg0 == -1) {
            field1468 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1481[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(I)[Ljw;"
   )
   public static final class779[] method1017(int arg0) {
      try {
         ++field1467;
         if (arg0 != -13578) {
            field1468 = null;
         }

         return new class779[]{class48.field624, class750.field11114, class609.field8869, class265.field4333, class361.field5603, class404.field6308, class417.field6454, class371.field5758, class111.field1536, class793.field11581, class80.field1071, class111.field1537, class25.field313, class695.field10322};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1481[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(ILqja;)V"
   )
   public final void method1018(int arg0, class106 arg1) {
      try {
         this.field1479 = arg1.field1479;
         this.field1470 = arg1.field1470;
         this.field1473 = arg1.field1473;
         this.field1463 = arg1.field1463;
         this.field1464 = arg1.field1464;
         if (arg0 != -5) {
            this.field1463 = -8;
         }

         this.field1478 = arg1.field1478;
         ++field1461;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1481[6] + arg0 + ',' + (arg1 != null ? field1481[3] : field1481[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "(I)Lqja;"
   )
   public final class106 method1019(int arg0) {
      try {
         ++field1472;
         return arg0 != 2 ? null : new class106(this.field1464, this.field1473, this.field1470, this.field1463, this.field1478, this.field1479);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1481[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class106(int arg0) {
      try {
         this.field1464 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1481[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field1478 = arg4;
         this.field1473 = arg1;
         this.field1470 = arg2;
         this.field1463 = arg3;
         this.field1464 = arg0;
         this.field1479 = arg5;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1481[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1020(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1021(char[] arg0) {
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
            var10005 = 93;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
