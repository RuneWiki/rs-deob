import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class405 extends class302 {
   @OriginalMember(
      owner = "client!bp",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6214 = new String[]{method3111(method3110("R\u007f:\u001eD")), method3111(method3110("^zx0")), method3111(method3110("R\u007f:\u0019D")), method3111(method3110("K!:r\u0011")), method3111(method3110("R\u007f:\rD")), method3111(method3110("R\u007f:\u001bD")), method3111(method3110("R\u007f:\u001fD")), method3111(method3110("R\u007f:\u001aD")), method3111(method3110("R\u007f:\u001dD"))};
   @OriginalMember(
      owner = "client!bp",
      name = "I",
      descriptor = "I"
   )
   public static int field6212 = 0;
   @OriginalMember(
      owner = "client!bp",
      name = "L",
      descriptor = "Lsd;"
   )
   public static class101 field6209 = new class101(126, -1);
   @OriginalMember(
      owner = "client!bp",
      name = "K",
      descriptor = "I"
   )
   public static int field6213 = 100;
   @OriginalMember(
      owner = "client!bp",
      name = "N",
      descriptor = "F"
   )
   public static float field6204;
   @OriginalMember(
      owner = "client!bp",
      name = "P",
      descriptor = "I"
   )
   public static int field6205;
   @OriginalMember(
      owner = "client!bp",
      name = "H",
      descriptor = "I"
   )
   public static int field6206;
   @OriginalMember(
      owner = "client!bp",
      name = "M",
      descriptor = "I"
   )
   public static int field6207;
   @OriginalMember(
      owner = "client!bp",
      name = "Q",
      descriptor = "I"
   )
   public static int field6208;
   @OriginalMember(
      owner = "client!bp",
      name = "J",
      descriptor = "I"
   )
   public static int field6210;
   @OriginalMember(
      owner = "client!bp",
      name = "O",
      descriptor = "I"
   )
   public static int field6211;

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field6208;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 > -37) {
            field6204 = 1.4893007F;
         }

         if (super.field4298.field6356) {
            int var5 = 0;
            if (var3 != 0 || var5 < class344.field5238) {
               do {
                  this.method3107(var5, false, arg0);
                  int[] var6 = this.method2299(class380.field5846, false, 0);
                  var4[var5] = var6[class658.field9551];
                  ++var5;
               } while(var5 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6214[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "(II)[[[B"
   )
   public static final byte[][][] method3106(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "(IZI)V"
   )
   private final void method3107(int arg0, boolean arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field6207;
         if (arg1) {
            field6213 = 62;
         }

         label109: {
            int var5 = class757.field11167[arg0];
            int var6 = class23.field241[arg2];
            float var7 = (float)Math.atan2((double)(var5 + -2048), (double)(var6 + -2048));
            if (!((double)var7 >= -3.141592653589793D) || !((double)var7 <= -2.356194490192345D)) {
               if ((double)var7 <= -1.5707963267948966D && (double)var7 >= -2.356194490192345D) {
                  class658.field9551 = arg2;
                  class380.field5846 = arg0;
                  if (var4 == 0) {
                     break label109;
                  }
               }

               if (!((double)var7 <= -0.7853981633974483D) || !((double)var7 >= -1.5707963267948966D)) {
                  if (var7 <= 0.0F && (double)var7 >= -0.7853981633974483D) {
                     class658.field9551 = arg0;
                     class380.field5846 = -arg2 + class501.field7439;
                     if (var4 == 0) {
                        break label109;
                     }
                  }

                  if (!(var7 >= 0.0F) || !((double)var7 <= 0.7853981633974483D)) {
                     if ((double)var7 >= 0.7853981633974483D && (double)var7 <= 1.5707963267948966D) {
                        class658.field9551 = -arg2 + class344.field5238;
                        class380.field5846 = -arg0 + class501.field7439;
                        if (var4 == 0) {
                           break label109;
                        }
                     }

                     if ((double)var7 >= 1.5707963267948966D && (double)var7 <= 2.356194490192345D) {
                        class380.field5846 = -arg0 + class501.field7439;
                        class658.field9551 = arg2;
                        if (var4 == 0) {
                           break label109;
                        }
                     }

                     if (!((double)var7 >= 2.356194490192345D) || !((double)var7 <= 3.141592653589793D)) {
                        break label109;
                     }

                     class658.field9551 = -arg0 + class344.field5238;
                     class380.field5846 = arg2;
                     if (var4 == 0) {
                        break label109;
                     }
                  }

                  class658.field9551 = -arg0 + class344.field5238;
                  class380.field5846 = -arg2 + class501.field7439;
                  if (var4 == 0) {
                     break label109;
                  }
               }

               class658.field9551 = -arg2 + class344.field5238;
               class380.field5846 = arg0;
               if (var4 == 0) {
                  break label109;
               }
            }

            class380.field5846 = arg2;
            class658.field9551 = arg0;
         }

         class380.field5846 &= class275.field3837;
         class658.field9551 &= class264.field3612;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6214[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public static final void method3108(class66 arg0, boolean arg1) {
      try {
         class57.field721 = class611.method4453(true, -23653, arg0, class87.field1058);
         ++field6205;
         class595.field8772 = class299.method2284(class87.field1058, 0, arg0);
         class288.field4045 = class611.method4453(true, -23653, arg0, class78.field979);
         class417.field6389 = class299.method2284(class78.field979, 0, arg0);
         class524.field7616 = class611.method4453(true, -23653, arg0, class374.field5671);
         if (!arg1) {
            class173.field2160 = class299.method2284(class374.field5671, 0, arg0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6214[2] + (arg0 != null ? field6214[3] : field6214[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 != -90) {
            return null;
         } else {
            ++field6210;
            int[][] var4 = super.field4292.method3409(arg1, 0);
            if (super.field4292.field6892) {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = 0;
               if (var3 != 0 || ~var8 > ~class344.field5238) {
                  do {
                     this.method3107(var8, false, arg1);
                     int[][] var9 = this.method2297(0, class380.field5846, arg0 ^ -90);
                     var5[var8] = var9[0][class658.field9551];
                     var6[var8] = var9[1][class658.field9551];
                     var7[var8] = var9[2][class658.field9551];
                     ++var8;
                  } while(~var8 > ~class344.field5238);
               }
            }

            return var4;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field6214[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "<init>",
      descriptor = "()V"
   )
   public class405() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         if (~arg0 == -1) {
            super.field4313 = arg2.method1104(arg1 + 255) == 1;
         }

         ++field6206;
         if (arg1 != 0) {
            field6209 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6214[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6214[3] : field6214[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3109(int arg0) {
      try {
         int var1 = 19 / ((arg0 - -24) / 39);
         field6209 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6214[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3110(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3111(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
