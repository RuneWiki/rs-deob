import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class795 extends class213 {
   @OriginalMember(
      owner = "client!ms",
      name = "G",
      descriptor = "I"
   )
   private int field11608 = 0;
   @OriginalMember(
      owner = "client!ms",
      name = "J",
      descriptor = "I"
   )
   private int field11614 = 1365;
   @OriginalMember(
      owner = "client!ms",
      name = "N",
      descriptor = "I"
   )
   private int field11616 = 0;
   @OriginalMember(
      owner = "client!ms",
      name = "D",
      descriptor = "I"
   )
   private int field11609 = 20;
   @OriginalMember(
      owner = "client!ms",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11620 = new String[]{method5732(method5731("\u0002d\u001a\u0003T")), method5732(method5731("\u0017?XA")), method5732(method5731("\u00149\u001ai\u0001")), method5732(method5731("\u00149\u001ah\u0001")), method5732(method5731("\u00149\u001aj\u0001")), method5732(method5731("\u00149\u001al\u0001")), method5732(method5731("\u00149\u001an\u0001")), method5732(method5731("\u00149\u001ao\u0001"))};
   @OriginalMember(
      owner = "client!ms",
      name = "L",
      descriptor = "Lbga;"
   )
   public static class378 field11612 = new class378(121, 6);
   @OriginalMember(
      owner = "client!ms",
      name = "O",
      descriptor = "Lo;"
   )
   public static class31 field11615 = new class31(1, -1);
   @OriginalMember(
      owner = "client!ms",
      name = "P",
      descriptor = "[[I"
   )
   public static int[][] field11618 = new int[6][];
   @OriginalMember(
      owner = "client!ms",
      name = "M",
      descriptor = "I"
   )
   public static int field11607;
   @OriginalMember(
      owner = "client!ms",
      name = "Q",
      descriptor = "I"
   )
   public static int field11610;
   @OriginalMember(
      owner = "client!ms",
      name = "F",
      descriptor = "I"
   )
   public static int field11611;
   @OriginalMember(
      owner = "client!ms",
      name = "K",
      descriptor = "I"
   )
   public static int field11613;
   @OriginalMember(
      owner = "client!ms",
      name = "H",
      descriptor = "I"
   )
   public static int field11619;
   @OriginalMember(
      owner = "client!ms",
      name = "E",
      descriptor = "[Lqc;"
   )
   public static class777[] field11617;

   @OriginalMember(
      owner = "client!ms",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5726(byte arg0) {
      try {
         ++field11613;
         class252.field3198.method537(class682.field10007, class288.field3822, class430.field5992);
         int var1 = 48 % ((-71 - arg0) / 42);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11620[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(Lic;)V"
   )
   public static final void method5727(class730 arg0) {
      if (class494.field6789 < 65535) {
         class127 var1 = arg0.field10676;
         class166.field2104[class494.field6789] = arg0;
         class756.field10969[class494.field6789] = false;
         ++class494.field6789;
         int var2 = arg0.field10691;
         if (arg0.field10683) {
            var2 = 0;
         }

         int var3 = arg0.field10691;
         if (arg0.field10684) {
            var3 = class398.field5594 - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = var1.method1067(-1) - var1.method1066(-1) + class187.field2291 >> class76.field965;
            if (var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = var1.method1067(-1) + var1.method1066(-1) - class187.field2291 >> class76.field965;
            if (var7 >= class304.field4042) {
               var7 = class304.field4042 - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = arg0.field10681[var5++];
               int var10 = (var1.method1063(-1) - var1.method1066(-1) + class187.field2291 >> class76.field965) + (var9 >>> 8);
               int var11 = (var9 & 255) + var10 - 1;
               if (var10 < 0) {
                  var10 = 0;
               }

               if (var11 >= class635.field8973) {
                  var11 = class635.field8973 - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = class328.field4698[var4][var12][var8];
                  if ((var13 & 65535L) == 0L) {
                     class328.field4698[var4][var12][var8] = var13 | (long)class494.field6789;
                  } else if ((var13 & 4294901760L) == 0L) {
                     class328.field4698[var4][var12][var8] = var13 | (long)class494.field6789 << 16;
                  } else if ((var13 & 281470681743360L) == 0L) {
                     class328.field4698[var4][var12][var8] = var13 | (long)class494.field6789 << 32;
                  } else if ((var13 & -281474976710656L) == 0L) {
                     class328.field4698[var4][var12][var8] = var13 | (long)class494.field6789 << 48;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "<init>",
      descriptor = "()V"
   )
   public class795() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(ILeb;)V"
   )
   public static final void method5728(int arg0, class657 arg1) {
      try {
         if (arg0 != 0) {
            method5727((class730)null);
         }

         ++field11611;
         if (arg1.field9372 == 5 && ~arg1.field9345 != 0) {
            class523.method3782(-16777216, arg1, class338.field4832);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11620[2] + arg0 + ',' + (arg1 != null ? field11620[0] : field11620[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "b",
      descriptor = "(II)Lsca;"
   )
   public static final class49 method5729(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field11610;
         if (arg1 != 65535) {
            field11612 = null;
         }

         class49[] var3 = class730.method5309((byte)-82);
         int var4 = 0;
         if (!var2 && ~var4 <= ~var3.length) {
            return null;
         } else {
            do {
               class49 var5 = var3[var4];
               if (var5.field558 == arg0) {
                  return var5;
               }

               ++var4;
            } while(~var4 > ~var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11620[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label51: {
            label50: {
               label49: {
                  label48: {
                     if (arg2 != 0) {
                        if (~arg2 == -2) {
                           break label48;
                        }

                        if (~arg2 == -3) {
                           break label49;
                        }

                        if (~arg2 != -4) {
                           break label51;
                        }

                        if (!var4) {
                           break label50;
                        }
                     }

                     this.field11614 = arg0.method4280(-19104);
                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field11609 = arg0.method4280(-19104);
                  if (!var4) {
                     break label51;
                  }
               }

               this.field11616 = arg0.method4280(-19104);
               if (!var4) {
                  break label51;
               }
            }

            this.field11608 = arg0.method4280(-19104);
         }

         ++field11607;
         int var6 = 52 / ((arg1 - 68) / 48);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11620[4] + (arg0 != null ? field11620[0] : field11620[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method5730(int arg0) {
      try {
         field11618 = null;
         field11615 = null;
         field11612 = null;
         if (arg0 <= -64) {
            field11617 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11620[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field11619;
         int[] var4 = super.field2650.method3769(arg0, arg1 ^ -2064866512);
         if (arg1 != 2064866508) {
            method5727((class730)null);
         }

         if (super.field2650.field7140) {
            int var5 = 0;
            int var10000;
            int var10001;
            if (var3 || ~var5 > ~class576.field7916) {
               label67:
               do {
                  do {
                     int var14;
                     label63: {
                        int var6 = (class534.field7301[var5] << 12) / this.field11614 - -this.field11616;
                        int var7 = (class551.field7586[arg0] << 12) / this.field11614 + this.field11608;
                        int var8 = var6;
                        int var9 = var7;
                        int var10 = var6;
                        int var11 = var7;
                        int var12 = var6 * var6 >> 12;
                        int var13 = var7 * var7 >> 12;
                        var14 = 0;
                        if (!var3) {
                           if (var12 + var13 >= 16384) {
                              break label63;
                           }

                           var10000 = ~var14;
                           var10001 = ~this.field11609;
                           if (var3) {
                              continue label67;
                           }

                           if (var10000 <= var10001) {
                              break label63;
                           }
                        }

                        do {
                           var11 = (var10 * var11 >> 12) * 2 + var9;
                           var10 = -var13 + var8 + var12;
                           ++var14;
                           var13 = var11 * var11 >> 12;
                           var12 = var10 * var10 >> 12;
                           if (var12 + var13 >= 16384) {
                              break;
                           }

                           var10000 = ~var14;
                           var10001 = ~this.field11609;
                           if (var3) {
                              continue label67;
                           }
                        } while(var10000 > var10001);
                     }

                     var4[var5] = this.field11609 + -1 <= var14 ? 0 : (var14 << 12) / this.field11609;
                     ++var5;
                  } while(~var5 > ~class576.field7916);

                  return var4;
               } while(var10000 > var10001);
            }
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field11620[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5731(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5732(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
