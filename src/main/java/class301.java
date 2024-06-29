import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class301 extends class261 implements class800 {
   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "Lpc;"
   )
   private class650 field4718;
   @OriginalMember(
      owner = "client!tg",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4723 = new String[]{method2524(method2523("amy\u0018~")), method2524(method2523("amy\u001e~")), method2524(method2523("amy\u001c~")), method2524(method2523("n$y~+")), method2524(method2523("{\u007f;<")), method2524(method2523("amy\u001f~")), method2524(method2523("amy\u0000~")), method2524(method2523("amy\u0001~")), method2524(method2523("amy\u0019~")), method2524(method2523("amyl?{c#n~")), method2524(method2523("amy\u001d~")), method2524(method2523("amy\u001b~"))};
   @OriginalMember(
      owner = "client!tg",
      name = "F",
      descriptor = "Ltm;"
   )
   public static class406 field4717 = new class406(method2524(method2523("YC\u0001\u0015")), 0);
   @OriginalMember(
      owner = "client!tg",
      name = "y",
      descriptor = "I"
   )
   public static int field4712;
   @OriginalMember(
      owner = "client!tg",
      name = "E",
      descriptor = "I"
   )
   public static int field4713;
   @OriginalMember(
      owner = "client!tg",
      name = "v",
      descriptor = "I"
   )
   public static int field4714;
   @OriginalMember(
      owner = "client!tg",
      name = "B",
      descriptor = "I"
   )
   public static int field4715;
   @OriginalMember(
      owner = "client!tg",
      name = "A",
      descriptor = "I"
   )
   public static int field4716;
   @OriginalMember(
      owner = "client!tg",
      name = "C",
      descriptor = "I"
   )
   public static int field4720;
   @OriginalMember(
      owner = "client!tg",
      name = "D",
      descriptor = "I"
   )
   public static int field4721;
   @OriginalMember(
      owner = "client!tg",
      name = "w",
      descriptor = "I"
   )
   public static int field4722;
   @OriginalMember(
      owner = "client!tg",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field4719;

   @OriginalMember(
      owner = "client!tg",
      name = "<init>",
      descriptor = "(Lcka;Lpc;Z)V"
   )
   public class301(class174 arg0, class650 arg1, boolean arg2) {
      super(arg0, 34963, arg2);

      try {
         this.field4718 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4723[9] + (arg0 != null ? field4723[3] : field4723[4]) + ',' + (arg1 != null ? field4723[3] : field4723[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method2517(int arg0) {
      try {
         ++field4713;
         return arg0 != -21369 ? true : super.method2270(124, super.field4280.field2724);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4723[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1533(int arg0) {
      try {
         ++field4720;
         super.method1533(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4723[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2518(int arg0) {
      try {
         field4719 = null;
         if (arg0 < 102) {
            method2521(-66);
         }

         field4717 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4723[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   public final Buffer method2519(boolean arg0, int arg1) {
      try {
         if (arg1 < 9) {
            this.field4718 = null;
         }

         ++field4716;
         return super.method2264(super.field4280.field2724, arg0, 35001);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4723[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2269(int arg0, int arg1) {
      try {
         ++field4712;
         super.method2269(this.field4718.field9366 * arg0, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4723[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(ILica;)Luba;"
   )
   public static final class594 method2520(int arg0, class354 arg1) {
      try {
         ++field4722;
         class598 var2 = class571.method4294((byte)111, arg1);
         int var3 = arg1.method2869(false);
         return arg0 != -2 ? null : new class594(var2.field8810, var2.field8815, var2.field8819, var2.field8823, var2.field8820, var2.field8811, var2.field8818, var2.field8822, var2.field8814, var2.field8771, var2.field8769, var2.field8776, var2.field8767, var2.field8770, var2.field8774, var3);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4723[5] + arg0 + ',' + (arg1 != null ? field4723[3] : field4723[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method2521(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field4721;
         if (~class306.field4788 != 0 && class735.field10948 != -1) {
            label87: {
               int var2 = ((-class461.field7015 + class90.field1292) * class720.field10793 >> 16) + class461.field7015;
               class720.field10793 += var2;
               if (~class720.field10793 > -65536) {
                  class480.field7295 = false;
                  class425.field6565 = false;
                  if (!var1) {
                     break label87;
                  }
               }

               label74: {
                  class720.field10793 = 65535;
                  if (class425.field6565) {
                     class480.field7295 = false;
                     if (!var1) {
                        break label74;
                     }
                  }

                  class480.field7295 = true;
               }

               class425.field6565 = true;
            }

            float var3;
            float[] var4;
            int var5;
            float[] var14;
            int var15;
            int var10000;
            label50: {
               var3 = (float)class720.field10793 / 65535.0F;
               var4 = new float[arg0];
               var5 = class729.field10885 * 2;
               int var6 = 0;
               if (var1) {
                  var10000 = class415.field6437[class306.field4788][var5][var6] * 3;
               } else if (~var6 <= -4) {
                  class653.field9780 = (int)var4[1] * -1;
                  class691.field10259 = (int)var4[2] + -(class119.field1606 * 512);
                  class401.field6288 = (int)var4[0] - class120.field1694 * 512;
                  var14 = new float[3];
                  var15 = class404.field6307 * 2;
                  var10000 = 0;
                  if (!var1) {
                     break label50;
                  }
               } else {
                  var10000 = class415.field6437[class306.field4788][var5][var6] * 3;
               }

               while(true) {
                  int var7 = var10000;
                  int var8 = class415.field6437[class306.field4788][var5 + 1][var6] * 3;
                  int var9 = (class415.field6437[class306.field4788][var5 + 2][var6] - class415.field6437[class306.field4788][var5 + 3][var6] + class415.field6437[class306.field4788][var5 - -2][var6]) * 3;
                  int var10 = class415.field6437[class306.field4788][var5][var6];
                  int var11 = -var7 + var8;
                  int var12 = -(var8 * 2) + var7 + var9;
                  int var13 = class415.field6437[class306.field4788][var5 + 2][var6] - -var8 + -var9 + -var10;
                  var4[var6] = (((float)var13 * var3 + (float)var12) * var3 + (float)var11) * var3 + (float)var10;
                  ++var6;
                  if (~var6 <= -4) {
                     class653.field9780 = (int)var4[1] * -1;
                     class691.field10259 = (int)var4[2] + -(class119.field1606 * 512);
                     class401.field6288 = (int)var4[0] - class120.field1694 * 512;
                     var14 = new float[3];
                     var15 = class404.field6307 * 2;
                     var10000 = 0;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var10000 = class415.field6437[class306.field4788][var5][var6] * 3;
                  }
               }
            }

            int var16 = var10000;
            float var24;
            float var25;
            float var26;
            double var27;
            if (var1) {
               var10000 = class415.field6437[class735.field10948][var15][var16] * 3;
            } else if (var16 >= 3) {
               var24 = var14[0] - var4[0];
               var25 = (var14[1] + -var4[1]) * -1.0F;
               var26 = var14[2] - var4[2];
               var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
               class703.field10589 = (int)(2607.5945876176133D * Math.atan2((double)var25, var27)) & 16383;
               class317.field4895 = (int)(2607.5945876176133D * -Math.atan2((double)var24, (double)var26)) & 16383;
               var10000 = ((class415.field6437[class306.field4788][var5 - -2][3] + -class415.field6437[class306.field4788][var5][3]) * class720.field10793 >> 16) + class415.field6437[class306.field4788][var5][3];
               if (!var1) {
                  class674.field10029 = var10000;
                  return;
               }
            } else {
               var10000 = class415.field6437[class735.field10948][var15][var16] * 3;
            }

            while(true) {
               int var17 = var10000;
               int var18 = class415.field6437[class735.field10948][var15 + 1][var16] * 3;
               int var19 = (class415.field6437[class735.field10948][var15 - -2][var16] - (class415.field6437[class735.field10948][var15 - -3][var16] + -class415.field6437[class735.field10948][var15 + 2][var16])) * 3;
               int var20 = class415.field6437[class735.field10948][var15][var16];
               int var21 = -var17 + var18;
               int var22 = var17 - var18 * 2 + var19;
               int var23 = class415.field6437[class735.field10948][var15 - -2][var16] - -var18 + -var20 + -var19;
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
               if (var16 >= 3) {
                  var24 = var14[0] - var4[0];
                  var25 = (var14[1] + -var4[1]) * -1.0F;
                  var26 = var14[2] - var4[2];
                  var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                  class703.field10589 = (int)(2607.5945876176133D * Math.atan2((double)var25, var27)) & 16383;
                  class317.field4895 = (int)(2607.5945876176133D * -Math.atan2((double)var24, (double)var26)) & 16383;
                  var10000 = ((class415.field6437[class306.field4788][var5 - -2][3] + -class415.field6437[class306.field4788][var5][3]) * class720.field10793 >> 16) + class415.field6437[class306.field4788][var5][3];
                  if (!var1) {
                     class674.field10029 = var10000;
                     return;
                  }
               } else {
                  var10000 = class415.field6437[class735.field10948][var15][var16] * 3;
               }
            }
         }
      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field4723[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1538(int arg0) {
      try {
         ++field4715;
         if (arg0 <= 13) {
            method2521(59);
         }

         return super.method1538(38);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4723[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "b",
      descriptor = "(I)Lpc;"
   )
   public final class650 method2522(int arg0) {
      try {
         if (arg0 <= 84) {
            return null;
         } else {
            ++field4714;
            return this.field4718;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4723[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
