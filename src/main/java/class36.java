import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 {
   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "Ldw;"
   )
   private class748 field393 = new class748(256);
   @OriginalMember(
      owner = "client!tfa",
      name = "j",
      descriptor = "Ld;"
   )
   private class160 field395;
   @OriginalMember(
      owner = "client!tfa",
      name = "f",
      descriptor = "Lck;"
   )
   private class667 field397;
   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field399 = new String[]{method255(method254("\u0000\u0003YhC\u001d\u000bQ2A\\")), method255(method254("\u001a\u0010T*")), method255(method254("\u000fK\u0016h\u0002")), method255(method254("6\u0010Q*\u001bNE\u000esN")), method255(method254("\u0000\u0003Yh:\\")), method255(method254("YH\u0006f")), method255(method254("\u0000\u0003Yh;\\")), method255(method254("\u0000\u0003Yh=\\")), method255(method254("\u0000\u0003Yh>\\")), method255(method254("\u0000\u0003Yh9\\")), method255(method254("\u0000\u0003Yh<\\"))};
   @OriginalMember(
      owner = "client!tfa",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field394 = new int[2];
   @OriginalMember(
      owner = "client!tfa",
      name = "k",
      descriptor = "Lpia;"
   )
   public static class102 field391 = new class102("", 19);
   @OriginalMember(
      owner = "client!tfa",
      name = "i",
      descriptor = "I"
   )
   public static int field398 = -1;
   @OriginalMember(
      owner = "client!tfa",
      name = "e",
      descriptor = "I"
   )
   public static int field388;
   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "I"
   )
   public static int field389;
   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "I"
   )
   public static int field390;
   @OriginalMember(
      owner = "client!tfa",
      name = "g",
      descriptor = "I"
   )
   public static int field392;
   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "I"
   )
   public static int field396;

   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method248(int arg0) {
      try {
         field394 = null;
         field391 = null;
         int var1 = -9 / ((-4 - arg0) / 48);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field399[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method249(byte arg0) {
      try {
         ++field390;
         if (arg0 != 110) {
            field398 = -17;
         }

         this.field393.method5453(5, false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field399[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method250(byte arg0, class66 arg1) {
      int var2 = client.field4530;

      try {
         ++field388;
         int var3 = 0;
         int var4 = 0;
         if (class446.field6785) {
            var3 = class325.method2458(29461);
            var4 = class319.method2421(true);
         }

         int var10000;
         int var10001;
         label81: {
            arg1.method554(var3, var4, class207.field2647 - -var3, var4 + 350);
            arg1.method645(var3, var4, class207.field2647, 350, 3351159 | class248.field3326 << 24, 1);
            class458.method3442(var4 + 350, 26306, var4, var3, var3 - -class207.field2647);
            int var5 = 350 / class219.field2785;
            if (~class793.field11555 < -1) {
               label87: {
                  int var6 = 346 - (class219.field2785 - -4);
                  int var7 = var5 * var6 / (var5 + -1 + class793.field11555);
                  int var8 = 4;
                  if (~class793.field11555 < -2) {
                     var8 += (class793.field11555 + -1 + -class180.field2220) * (-var7 + var6) / (class793.field11555 + -1);
                  }

                  arg1.method645(var3 + -16 + class207.field2647, var4 + var8, 12, var7, class248.field3326 << 24 | 3351159, 2);
                  int var9 = class180.field2220;
                  if (var2 == 0) {
                     if (~var9 <= ~(class180.field2220 - -var5)) {
                        break label87;
                     }

                     var10000 = var9;
                     var10001 = class793.field11555;
                     if (var2 != 0) {
                        break label81;
                     }

                     if (var9 >= var10001) {
                        break label87;
                     }
                  }

                  do {
                     String[] var10 = class136.method1163('\b', class784.field11421[var9], 87);
                     int var11 = (class207.field2647 + -8 + -16) / var10.length;
                     int var12 = 0;
                     if (var2 != 0 || ~var12 > ~var10.length) {
                        do {
                           int var13 = var11 * var12 + 8;
                           arg1.method554(var3 - -var13, var4, var3 - -var13 - 8 + var11, var4 + 350);
                           class288.field4045.method678(-1, var3 - -var13, -16777216, class483.method3583(var10[var12], 0), -class188.field2347 - 2 - class417.field6389.field11206 + -((-class180.field2220 + var9) * class219.field2785) + 350 + var4, 0);
                           ++var12;
                        } while(~var12 > ~var10.length);
                     }

                     ++var9;
                     if (~var9 <= ~(class180.field2220 - -var5)) {
                        break;
                     }

                     var10000 = var9;
                     var10001 = class793.field11555;
                     if (var2 != 0) {
                        break label81;
                     }
                  } while(var9 < var10001);
               }
            }

            var10000 = arg0;
            var10001 = -127;
         }

         if (var10000 < var10001) {
            class57.field721.method668(-16777216, var3 + -25 - -class207.field2647, -1, field399[3], var4 - 20 + 350, -25049);
            arg1.method554(var3, var4, class207.field2647 + var3, var4 - -350);
            arg1.method626(81, var3, -1, class207.field2647, var4 + 350 + -class188.field2347);
            class524.field7616.method678(-1, var3 + 10, -16777216, field399[5] + class483.method3583(class763.field11211, 0), -class173.field2160.field11206 + -1 + var4 + 350, 0);
            if (class618.field9024) {
               int var14 = -1;
               if (~(class314.field4488 % 30) < -16) {
                  var14 = 16777215;
               }

               arg1.method655(var14, 12, -107, var4 + 350 - (class173.field2160.field11206 + 11), class173.field2160.method5532(field399[5] + class483.method3583(class763.field11211, 0).substring(0, class188.field2348), -124) + var3 + 10);
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field399[4] + arg0 + ',' + (arg1 != null ? field399[2] : field399[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(IB)Ldt;"
   )
   public final class251 method251(int arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field389;
         Object var4 = this.field393.method5454((long)arg0, 18261);
         if (arg1 > -44) {
            this.method253(-38);
         }

         if (var4 != null) {
            return (class251)var4;
         } else if (!this.field395.method1165(arg0, -23239)) {
            return null;
         } else {
            class327 var5;
            class251 var8;
            label62: {
               var5 = this.field395.method1159(arg0, 126);
               int var6 = !var5.field4646 ? this.field397.field9890 : 64;
               if (var5.field4640 && this.field397.method657()) {
                  float[] var7 = this.field395.method1164(arg0, 7795, false, var6, var6, 0.7F);
                  var8 = new class251(this.field397, 3553, 34842, var6, var6, var5.field4634 != 0, var7, 6408);
                  if (var3 == 0) {
                     break label62;
                  }
               }

               int[] var9;
               label44: {
                  if (~var5.field4636 != -3 && class559.method4142(7, var5.field4655)) {
                     var9 = this.field395.method1166((byte)89, 0.7F, var6, var6, true, arg0);
                     if (var3 == 0) {
                        break label44;
                     }
                  }

                  var9 = this.field395.method1168(0.7F, false, var6, 24521, arg0, var6);
               }

               var8 = new class251(this.field397, 3553, 6408, var6, var6, var5.field4634 != 0, var9, 0, 0, false);
            }

            var8.method1893(true, var5.field4631, var5.field4639);
            this.field393.method5455(-2049, var8, (long)arg0);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field399[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method252(int arg0, int arg1, int arg2) {
      try {
         ++field396;
         if (class163.method1333(3)) {
            class149.field1859 = arg2;
            if (class752.field11122 != arg0) {
               class591.field8737 = "";
            }

            class752.field11122 = arg0;
            class317.method2411(arg1, (byte)107);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field399[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method253(int arg0) {
      try {
         this.field393.method5451(84);
         if (arg0 > -109) {
            method248(113);
         }

         ++field392;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field399[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "<init>",
      descriptor = "(Lck;Ld;)V"
   )
   public class36(class667 arg0, class160 arg1) {
      try {
         this.field395 = arg1;
         this.field397 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field399[0] + (arg0 != null ? field399[2] : field399[1]) + ',' + (arg1 != null ? field399[2] : field399[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method254(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method255(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
