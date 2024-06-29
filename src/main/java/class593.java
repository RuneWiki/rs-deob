import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class593 extends class67 {
   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8739 = new String[]{method4420(method4419("M^J\u000e\u0014")), method4420(method4419("M^J\u000f\u0014")), method4420(method4419("M^J\u0005\u0014")), method4420(method4419("QN\b!")), method4420(method4419("M^J\t\u0014")), method4420(method4419("D\u0015JcA")), method4420(method4419("M^J\u0007\u0014")), method4420(method4419("M^J\u0006\u0014")), method4420(method4419("wR\u0000)YQ\u0016\u0011>Y")), method4420(method4419("M^J\n\u0014")), method4420(method4419("`H\u0010,HVX\u0001!YR^\n9O")), method4420(method4419("M^J\f\u0014")), method4420(method4419("M^J\u0004\u0014")), method4420(method4419("M^J\b\u0014")), method4420(method4419("M^J\u000b\u0014"))};
   @OriginalMember(
      owner = "client!re",
      name = "l",
      descriptor = "[[I"
   )
   public static int[][] field8728 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
   @OriginalMember(
      owner = "client!re",
      name = "p",
      descriptor = "Luk;"
   )
   public static class498 field8737 = new class498(141, -1);
   @OriginalMember(
      owner = "client!re",
      name = "n",
      descriptor = "I"
   )
   public static int field8726;
   @OriginalMember(
      owner = "client!re",
      name = "k",
      descriptor = "I"
   )
   public static int field8727;
   @OriginalMember(
      owner = "client!re",
      name = "o",
      descriptor = "I"
   )
   public static int field8729;
   @OriginalMember(
      owner = "client!re",
      name = "m",
      descriptor = "I"
   )
   public static int field8730;
   @OriginalMember(
      owner = "client!re",
      name = "q",
      descriptor = "I"
   )
   public static int field8731;
   @OriginalMember(
      owner = "client!re",
      name = "s",
      descriptor = "I"
   )
   public static int field8732;
   @OriginalMember(
      owner = "client!re",
      name = "t",
      descriptor = "I"
   )
   public static int field8733;
   @OriginalMember(
      owner = "client!re",
      name = "r",
      descriptor = "I"
   )
   public static int field8734;
   @OriginalMember(
      owner = "client!re",
      name = "w",
      descriptor = "I"
   )
   public static int field8735;
   @OriginalMember(
      owner = "client!re",
      name = "v",
      descriptor = "I"
   )
   public static int field8736;
   @OriginalMember(
      owner = "client!re",
      name = "u",
      descriptor = "I"
   )
   public static int field8738;

   @OriginalMember(
      owner = "client!re",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class593(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method4412(int param0, class610 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!re",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4413(int arg0) {
      try {
         field8728 = null;
         int var1 = -95 % ((-58 - arg0) / 62);
         field8737 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8739[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field8734;
         if (arg1 > -74) {
            return -8;
         } else if (super.field881.method292((byte)117) == class619.field9004) {
            if (super.field881.method298(96)) {
               return 3;
            } else {
               return arg0 != 0 && super.field881.field529.method1918(480102311) != 1 ? 2 : 1;
            }
         } else {
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8739[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method4414(int arg0) {
      try {
         ++field8732;
         return arg0 != 480102311 ? -111 : super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8739[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(Ld;ZLha;)V"
   )
   public static final void method4415(class150 arg0, boolean arg1, class610 arg2) {
      boolean var3 = client.field1786;

      try {
         ++field8726;
         if (class60.field737 != null) {
            if (class598.field8777 < 10) {
               if (!class60.field740.method5009(class60.field737.field2965, 29704)) {
                  class598.field8777 = class293.field4641.method5012((byte)114, class60.field737.field2965) / 10;
                  return;
               }

               class720.method5323((byte)5);
               class598.field8777 = 10;
            }

            if (class598.field8777 == 10) {
               class60.field774 = class60.field737.field2967 >> 6 << 6;
               class60.field763 = class60.field737.field2970 >> 6 << 6;
               class60.field759 = (class60.field737.field2966 >> 6 << 6) - (class60.field763 + -64);
               class60.field757 = (class60.field737.field2972 >> 6 << 6) + 64 - class60.field774;
               int[] var4 = new int[3];
               int var5 = -1;
               int var6 = -1;
               if (class60.field737.method1698((byte)70, (class476.field7251.field1494 >> 9) + class119.field1606, class120.field1694 - -(class476.field7251.field1505 >> 9), class476.field7251.field1506, var4)) {
                  var6 = var4[2] + -class60.field763;
                  var5 = var4[1] - class60.field774;
               }

               label216: {
                  if (class541.field8149 || ~var5 > -1 || var5 >= class60.field757 || var6 < 0 || ~var6 <= ~class60.field759) {
                     if (class388.field6092 != -1 && class237.field3608 != -1) {
                        class60.field737.method1700(var4, class237.field3608, 0, class388.field6092);
                        class237.field3608 = -1;
                        class388.field6092 = -1;
                        if (var4 != null) {
                           class354.field5389 = var4[1] + -class60.field774;
                           class546.field8195 = var4[2] + -class60.field763;
                        }

                        class541.field8149 = false;
                        if (!var3) {
                           break label216;
                        }
                     }

                     class60.field737.method1700(var4, class60.field737.field2973 & 16383, 0, class60.field737.field2973 >> 14 & 16383);
                     class354.field5389 = var4[1] + -class60.field774;
                     class546.field8195 = var4[2] + -class60.field763;
                     if (!var3) {
                        break label216;
                     }
                  }

                  int var7 = var6 + (int)(Math.random() * 10.0D) + -5;
                  int var8 = var5 + -5 + (int)(10.0D * Math.random());
                  class546.field8195 = var7;
                  class354.field5389 = var8;
               }

               label157: {
                  if (class60.field737.field2982 != 37) {
                     if (class60.field737.field2982 == 50) {
                        class60.field751 = 4.0F;
                        class60.field748 = 4.0F;
                        if (!var3) {
                           break label157;
                        }
                     }

                     if (class60.field737.field2982 == 75) {
                        class60.field751 = 6.0F;
                        class60.field748 = 6.0F;
                        if (!var3) {
                           break label157;
                        }
                     }

                     if (~class60.field737.field2982 == -101) {
                        class60.field751 = 8.0F;
                        class60.field748 = 8.0F;
                        if (!var3) {
                           break label157;
                        }
                     }

                     if (~class60.field737.field2982 == -201) {
                        class60.field751 = 16.0F;
                        class60.field748 = 16.0F;
                        if (!var3) {
                           break label157;
                        }
                     }

                     class60.field751 = 8.0F;
                     class60.field748 = 8.0F;
                     if (!var3) {
                        break label157;
                     }
                  }

                  class60.field751 = 3.0F;
                  class60.field748 = 3.0F;
               }

               class60.field749 = (int)class60.field751 >> 1;
               class60.field746 = class329.method2684(true, class60.field749);
               class240.method2043(-1);
               class60.method445();
               class788.field11542 = new class675();
               class60.field755 += (int)(Math.random() * 5.0D) - 2;
               if (~class60.field755 > 7) {
                  class60.field755 = -8;
               }

               class60.field753 += (int)(Math.random() * 5.0D) + -2;
               if (~class60.field755 < -9) {
                  class60.field755 = 8;
               }

               if (class60.field753 < -16) {
                  class60.field753 = -16;
               }

               if (class60.field753 > 16) {
                  class60.field753 = 16;
               }

               class60.method443(arg0, class60.field755 >> 2 << 10, class60.field753 >> 1);
               class60.field744.method136(256, 22865, 1024);
               class60.field745.method4011(256, 14906, 256);
               class60.field738.method1416(!arg1, 4096);
               class228.field3467.method1031(109, 256);
               class598.field8777 = 20;
            } else if (class598.field8777 == 20) {
               class337.method2749((byte)106, true);
               class60.method463(arg2, class60.field755, class60.field753);
               class598.field8777 = 60;
               class337.method2749((byte)106, true);
               class56.method415((byte)115);
            } else if (~class598.field8777 != -61) {
               if (~class598.field8777 == -71) {
                  class92.field1322 = new class343(arg2, 11, true, class544.field8183);
                  class598.field8777 = 73;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)-90);
               } else if (class598.field8777 == 73) {
                  class391.field6147 = new class343(arg2, 12, true, class544.field8183);
                  class598.field8777 = 76;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)125);
               } else if (~class598.field8777 == -77) {
                  class426.field6581 = new class343(arg2, 14, true, class544.field8183);
                  class598.field8777 = 79;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)111);
               } else if (class598.field8777 == 79) {
                  class722.field10804 = new class343(arg2, 17, true, class544.field8183);
                  class598.field8777 = 82;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)-87);
               } else if (~class598.field8777 == -83) {
                  class175.field2752 = new class343(arg2, 19, true, class544.field8183);
                  class598.field8777 = 85;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)118);
               } else if (class598.field8777 == 85) {
                  class706.field10632 = new class343(arg2, 22, true, class544.field8183);
                  class598.field8777 = 88;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)-41);
               } else if (~class598.field8777 == -89) {
                  class68.field901 = new class343(arg2, 26, true, class544.field8183);
                  class598.field8777 = 91;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)-113);
               } else {
                  class471.field7160 = new class343(arg2, 30, arg1, class544.field8183);
                  class598.field8777 = 100;
                  class337.method2749((byte)106, true);
                  class56.method415((byte)118);
                  System.gc();
               }
            } else {
               label196: {
                  if (!class60.field740.method5011(class60.field737.field2965 + field8739[10], arg1)) {
                     class60.field750 = new class794(0);
                     if (!var3) {
                        break label196;
                     }
                  }

                  if (!class60.field740.method5009(class60.field737.field2965 + field8739[10], 29704)) {
                     return;
                  }

                  class60.field750 = class361.method2954(class60.field737.field2965 + field8739[10], class373.field5773, class60.field740, 0);
               }

               class60.method450();
               class598.field8777 = 70;
               class337.method2749((byte)106, true);
               class56.method415((byte)122);
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8739[11] + (arg0 != null ? field8739[5] : field8739[3]) + ',' + arg1 + ',' + (arg2 != null ? field8739[5] : field8739[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method4416(int arg0) {
      try {
         ++field8736;
         if (arg0 != 3343) {
            return false;
         } else if (super.field881.method292((byte)125) == class619.field9004) {
            return !super.field881.method298(arg0 ^ 3439);
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8739[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field8735;
         return arg0 != 0 ? 83 : 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8739[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field8733;
         if (!arg1) {
            field8737 = null;
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8739[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(Lpha;Lpha;Z)V"
   )
   public static final void method4417(class391 arg0, class391 arg1, boolean arg2) {
      try {
         if (arg2) {
            method4415((class150)null, true, (class610)null);
         }

         if (arg0.field6140 != null) {
            arg0.method3159(true);
         }

         ++field8727;
         arg0.field6140 = arg1.field6140;
         arg0.field6144 = arg1;
         arg0.field6140.field6144 = arg0;
         arg0.field6144.field6140 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8739[14] + (arg0 != null ? field8739[5] : field8739[3]) + ',' + (arg1 != null ? field8739[5] : field8739[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         label30: {
            ++field8729;
            if (super.field881.method292((byte)120) != class619.field9004) {
               super.field877 = 1;
               if (!client.field1786) {
                  break label30;
               }
            }

            if (super.field881.method298(96)) {
               super.field877 = 0;
            }
         }

         if (~super.field877 != -1 && ~super.field877 != -2) {
            super.field877 = this.method162(0);
         }

         if (arg0 != -69) {
            field8728 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8739[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(ILfq;)Ljava/lang/String;"
   )
   public static final String method4418(int arg0, class374 arg1) {
      try {
         ++field8731;
         int var2 = -76 / ((-64 - arg0) / 60);
         if (client.method1148(arg1).method520((byte)42) == 0) {
            return null;
         } else if (arg1.field5847 != null && ~arg1.field5847.trim().length() != -1) {
            return arg1.field5847;
         } else {
            return class351.field5351 ? field8739[8] : null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8739[7] + arg0 + ',' + (arg1 != null ? field8739[5] : field8739[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class593(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4419(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4420(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
