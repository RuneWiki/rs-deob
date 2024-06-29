import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class613 extends class428 {
   @OriginalMember(
      owner = "client!nw",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9017 = new String[]{method4460(method4459("B:XV5")), method4460(method4459("Wa\u001a\u0014")), method4460(method4459("WcX<`")), method4460(method4459("WcX>`")), method4460(method4459("WcX:`")), method4460(method4459("WcX9`")), method4460(method4459("WcX=`")), method4460(method4459("WcX;`"))};
   @OriginalMember(
      owner = "client!nw",
      name = "M",
      descriptor = "Lek;"
   )
   public static class536 field9013 = new class536(28, 3);
   @OriginalMember(
      owner = "client!nw",
      name = "C",
      descriptor = "Z"
   )
   public static boolean field9015 = false;
   @OriginalMember(
      owner = "client!nw",
      name = "E",
      descriptor = "I"
   )
   public int field8987;
   @OriginalMember(
      owner = "client!nw",
      name = "s",
      descriptor = "I"
   )
   public int field8988;
   @OriginalMember(
      owner = "client!nw",
      name = "G",
      descriptor = "I"
   )
   public int field8989;
   @OriginalMember(
      owner = "client!nw",
      name = "r",
      descriptor = "I"
   )
   public int field8990;
   @OriginalMember(
      owner = "client!nw",
      name = "D",
      descriptor = "I"
   )
   public static int field8991;
   @OriginalMember(
      owner = "client!nw",
      name = "F",
      descriptor = "I"
   )
   public int field8992;
   @OriginalMember(
      owner = "client!nw",
      name = "m",
      descriptor = "I"
   )
   public static int field8993;
   @OriginalMember(
      owner = "client!nw",
      name = "y",
      descriptor = "I"
   )
   public int field8994;
   @OriginalMember(
      owner = "client!nw",
      name = "I",
      descriptor = "I"
   )
   public int field8995;
   @OriginalMember(
      owner = "client!nw",
      name = "P",
      descriptor = "I"
   )
   public int field8996;
   @OriginalMember(
      owner = "client!nw",
      name = "w",
      descriptor = "I"
   )
   public static int field8997;
   @OriginalMember(
      owner = "client!nw",
      name = "x",
      descriptor = "I"
   )
   public int field8998;
   @OriginalMember(
      owner = "client!nw",
      name = "N",
      descriptor = "I"
   )
   public int field9000;
   @OriginalMember(
      owner = "client!nw",
      name = "p",
      descriptor = "I"
   )
   public static int field9001;
   @OriginalMember(
      owner = "client!nw",
      name = "J",
      descriptor = "I"
   )
   public int field9002;
   @OriginalMember(
      owner = "client!nw",
      name = "K",
      descriptor = "I"
   )
   public int field9003;
   @OriginalMember(
      owner = "client!nw",
      name = "A",
      descriptor = "I"
   )
   public static int field9004;
   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "I"
   )
   public int field9006;
   @OriginalMember(
      owner = "client!nw",
      name = "o",
      descriptor = "I"
   )
   public int field9009;
   @OriginalMember(
      owner = "client!nw",
      name = "t",
      descriptor = "I"
   )
   public static int field9010;
   @OriginalMember(
      owner = "client!nw",
      name = "v",
      descriptor = "I"
   )
   public int field9011;
   @OriginalMember(
      owner = "client!nw",
      name = "B",
      descriptor = "I"
   )
   public int field9012;
   @OriginalMember(
      owner = "client!nw",
      name = "n",
      descriptor = "I"
   )
   public int field9014;
   @OriginalMember(
      owner = "client!nw",
      name = "Q",
      descriptor = "Lpj;"
   )
   public class158 field9005;
   @OriginalMember(
      owner = "client!nw",
      name = "H",
      descriptor = "Lec;"
   )
   public class248 field9007;
   @OriginalMember(
      owner = "client!nw",
      name = "q",
      descriptor = "Lvea;"
   )
   public class289 field9008;
   @OriginalMember(
      owner = "client!nw",
      name = "u",
      descriptor = "Lmca;"
   )
   public class33 field8999;
   @OriginalMember(
      owner = "client!nw",
      name = "L",
      descriptor = "[[[B"
   )
   public static byte[][][] field9016;

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4453(byte arg0) {
      try {
         if (arg0 < 124) {
            method4453((byte)49);
         }

         field9013 = null;
         field9016 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9017[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method4454(byte arg0, int arg1, int arg2) {
      try {
         ++field9004;
         if (arg0 != -116) {
            field9013 = null;
         }

         return class763.method5536(arg1, arg2, arg0 ^ -32884) | ~(2048 & arg2) != -1 || class387.method2929(arg1, 0, arg2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9017[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4455(int arg0) {
      try {
         this.field9005 = null;
         if (arg0 < -54) {
            this.field8999 = null;
            this.field9007 = null;
            this.field9008 = null;
            ++field8997;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9017[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(ILcl;)I"
   )
   public static final int method4456(int arg0, class279 arg1) {
      try {
         ++field9010;
         if (~arg1.field3842 == -1) {
            return 0;
         } else if (arg0 != -32769) {
            return -126;
         } else {
            if (~arg1.field3857 != 0) {
               class279 var2 = null;
               if (~arg1.field3857 > -32769) {
                  class529 var3 = (class529)class328.field4479.method329((byte)-50, (long)arg1.field3857);
                  if (var3 != null) {
                     var2 = var3.field7559;
                  }
               } else if (~arg1.field3857 <= -32769) {
                  var2 = class380.field5483[arg1.field3857 + -32768];
               }

               if (var2 != null) {
                  int var4 = -var2.field10694 + arg1.field10694;
                  int var5 = -var2.field10693 + arg1.field10693;
                  if (~var4 != -1 || ~var5 != -1) {
                     arg1.method2114(arg0 ^ 45048, (int)(2607.5945876176133D * Math.atan2((double)var4, (double)var5)) & 16383);
                  }
               }
            }

            if (!(arg1 instanceof class121)) {
               if (!(arg1 instanceof class506)) {
                  return arg1.method2115(-86);
               }

               class506 var6 = (class506)arg1;
               if (~var6.field7337 == 0 || ~var6.field3891 != -1 && var6.field3887 <= 0) {
                  return arg1.method2115(-86);
               }

               int var7 = -((-class672.field9740 + -class672.field9740 + var6.field7337) * 256) + var6.field10694;
               int var8 = -((-class533.field7595 + var6.field7353 + -class533.field7595) * 256) + var6.field10693;
               if (var7 != 0 || var8 != 0) {
                  var6.method2114(-12281, (int)(2607.5945876176133D * Math.atan2((double)var7, (double)var8)) & 16383);
               }

               var6.field7337 = -1;
               if (!client.field4360) {
                  return arg1.method2115(-86);
               }
            }

            class121 var9 = (class121)arg1;
            if (var9.field1545 != -1 && (~var9.field3891 == -1 || var9.field3887 > 0)) {
               var9.method2114(-12281, var9.field1545);
               var9.field1545 = -1;
            }

            return arg1.method2115(-86);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field9017[7] + arg0 + ',' + (arg1 != null ? field9017[0] : field9017[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Lcl;I)V"
   )
   public static final void method4457(class279 arg0, int arg1) {
      try {
         if (arg1 != -1) {
            field9016 = null;
         }

         boolean var2;
         label57: {
            ++field8991;
            var2 = false;
            if (~class96.field1234 != ~arg0.field3832 && ~arg0.field3866 != 0 && ~arg0.field3813 == -1) {
               class85 var3 = class190.field2702.method4411(arg0.field3866, 90);
               if (!var3.field1125 && ~var3.field1123[arg0.field3804] <= ~(arg0.field3874 - -1)) {
                  break label57;
               }

               var2 = true;
               if (!client.field4360) {
                  break label57;
               }
            }

            var2 = true;
         }

         if (var2) {
            int var4 = arg0.field3832 - arg0.field3795;
            int var5 = -arg0.field3795 + class96.field1234;
            int var6 = arg0.field3873 * 512 + arg0.method972(-1) * 256;
            int var7 = arg0.field3835 * 512 - -(arg0.method972(arg1) * 256);
            int var8 = arg0.field3853 * 512 - -(arg0.method972(arg1) * 256);
            int var9 = arg0.field3818 * 512 - -(256 * arg0.method972(-1));
            arg0.field10694 = ((-var5 + var4) * var6 + var5 * var8) / var4;
            arg0.field10693 = ((-var5 + var4) * var7 + var5 * var9) / var4;
         }

         arg0.field3887 = 0;
         if (arg0.field3848 == 0) {
            arg0.method2122(-73, false, 8192);
         }

         if (~arg0.field3848 == -2) {
            arg0.method2122(arg1 + -88, false, 12288);
         }

         if (~arg0.field3848 == -3) {
            arg0.method2122(-71, false, 0);
         }

         if (~arg0.field3848 == -4) {
            arg0.method2122(-87, false, 4096);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field9017[2] + (arg0 != null ? field9017[0] : field9017[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Lij;I)[I"
   )
   public static final int[] method4458(class447 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field9001;
         class147 var3 = new class147(518);
         int[] var4 = new int[4];
         int var5 = 0;
         if (var2) {
            var4[var5] = (int)(9.9999999E7D * Math.random());
            ++var5;
         }

         while(true) {
            while(~var5 > -5) {
               var4[var5] = (int)(9.9999999E7D * Math.random());
               ++var5;
            }

            var3.method1186(10, arg1 ^ arg1);
            var3.method1160(114, var4[0]);
            var3.method1160(98, var4[1]);
            var3.method1160(89, var4[2]);
            var3.method1160(91, var4[3]);
            int var6 = 0;
            if (!var2) {
               if (var2) {
                  var3.method1160(109, (int)(9.9999999E7D * Math.random()));
                  ++var6;
               }

               while(true) {
                  while(~var6 > -11) {
                     var3.method1160(109, (int)(9.9999999E7D * Math.random()));
                     ++var6;
                  }

                  var3.method1185((int)(9.9999999E7D * Math.random()), true);
                  var3.method1152(class140.field1790, class498.field7219, 0);
                  arg0.field6359.method1193((byte)-128, var3.field1889, 0, var3.field1856);
                  if (!var2) {
                     return var4;
                  }

                  ++var6;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9017[4] + (arg0 != null ? field9017[0] : field9017[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4459(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4460(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
