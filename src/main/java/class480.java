import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class480 extends class465 {
   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7139 = new String[]{method3568(method3567("Z_'.n")), method3568(method3567("Z_')n")), method3568(method3567("S^e\u0007")), method3568(method3567("F\u0005'E;")), method3568(method3567("Z_',n")), method3568(method3567("bX}\n2THl\u0007#PNg\u001f5")), method3568(method3567("Z_'(n")), method3568(method3567("Z_'*n")), method3568(method3567("Z_'/n")), method3568(method3567("Z_'-n"))};
   @OriginalMember(
      owner = "client!gt",
      name = "k",
      descriptor = "I"
   )
   public static int field7131;
   @OriginalMember(
      owner = "client!gt",
      name = "g",
      descriptor = "I"
   )
   public static int field7132;
   @OriginalMember(
      owner = "client!gt",
      name = "l",
      descriptor = "I"
   )
   public static int field7133;
   @OriginalMember(
      owner = "client!gt",
      name = "j",
      descriptor = "I"
   )
   public static int field7134;
   @OriginalMember(
      owner = "client!gt",
      name = "h",
      descriptor = "I"
   )
   public static int field7135;
   @OriginalMember(
      owner = "client!gt",
      name = "i",
      descriptor = "I"
   )
   public static int field7136;
   @OriginalMember(
      owner = "client!gt",
      name = "m",
      descriptor = "I"
   )
   public static int field7137;
   @OriginalMember(
      owner = "client!gt",
      name = "f",
      descriptor = "I"
   )
   public static int field7138;

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(I)I",
      line = 3
   )
   public final int method78(int arg0) {
      try {
         ++field7135;
         return arg0 != 16726277 ? -35 : 2;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7139[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 14
   )
   public class480(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!gt",
      name = "c",
      descriptor = "(Z)Z",
      line = 17
   )
   public final boolean method3564(boolean arg0) {
      try {
         ++field7134;
         if (arg0) {
            this.method70(-13, (byte)101);
         }

         if (super.field6980.method4680(-17721)) {
            return false;
         } else {
            return super.field6980.field9467.method2369(106) != 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7139[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Ld;Lha;Z)V",
      line = 40
   )
   public static final void method3565(class160 arg0, class66 arg1, boolean arg2) {
      int var3 = client.field4530;

      try {
         ++field7132;
         if (class329.field4667 != null) {
            if (class180.field2223 < 10) {
               if (!class329.field4669.method3886(125, class329.field4667.field6713)) {
                  class180.field2223 = class665.field9670.method3900(true, class329.field4667.field6713) / 10;
                  return;
               }

               class197.method1506(8669);
               class180.field2223 = 10;
            }

            if (!arg2) {
               if (class180.field2223 == 10) {
                  class329.field4696 = class329.field4667.field6708 >> 6 << 6;
                  class329.field4688 = class329.field4667.field6697 >> 6 << 6;
                  class329.field4687 = (class329.field4667.field6712 >> 6 << 6) + 64 - class329.field4696;
                  class329.field4706 = (class329.field4667.field6698 >> 6 << 6) + -class329.field4688 + 64;
                  int[] var4 = new int[3];
                  int var5 = -1;
                  int var6 = -1;
                  if (class329.field4667.method3328(var4, class693.field10418.field9010, (class693.field10418.field9003 >> 9) + class718.field10676, class669.field10064 - -(class693.field10418.field9007 >> 9), 2)) {
                     var6 = var4[2] - class329.field4696;
                     var5 = var4[1] + -class329.field4688;
                  }

                  label214: {
                     if (!class259.field3505 && ~var5 <= -1 && ~class329.field4706 < ~var5 && var6 >= 0 && ~class329.field4687 < ~var6) {
                        int var7 = var5 + -5 + (int)(Math.random() * 10.0D);
                        int var8 = var6 + -5 + (int)(Math.random() * 10.0D);
                        class729.field10834 = var7;
                        class670.field10075 = var8;
                        if (var3 == 0) {
                           break label214;
                        }
                     }

                     if (~class237.field2999 == 0 || class560.field8374 == -1) {
                        class329.field4667.method3330(class329.field4667.field6700 >> 14 & 16383, 16383 & class329.field4667.field6700, Integer.MAX_VALUE, var4);
                        class670.field10075 = var4[2] + -class329.field4696;
                        class729.field10834 = var4[1] - class329.field4688;
                        if (var3 == 0) {
                           break label214;
                        }
                     }

                     class329.field4667.method3330(class237.field2999, class560.field8374, Integer.MAX_VALUE, var4);
                     class259.field3505 = false;
                     if (var4 != null) {
                        class729.field10834 = var4[1] + -class329.field4688;
                        class670.field10075 = var4[2] + -class329.field4696;
                     }

                     class560.field8374 = -1;
                     class237.field2999 = -1;
                  }

                  label194: {
                     if (class329.field4667.field6696 == 37) {
                        class329.field4678 = 3.0F;
                        class329.field4680 = 3.0F;
                        if (var3 == 0) {
                           break label194;
                        }
                     }

                     if (class329.field4667.field6696 != 50) {
                        if (class329.field4667.field6696 == 75) {
                           class329.field4678 = 6.0F;
                           class329.field4680 = 6.0F;
                           if (var3 == 0) {
                              break label194;
                           }
                        }

                        if (~class329.field4667.field6696 == -101) {
                           class329.field4678 = 8.0F;
                           class329.field4680 = 8.0F;
                           if (var3 == 0) {
                              break label194;
                           }
                        }

                        if (~class329.field4667.field6696 == -201) {
                           class329.field4678 = 16.0F;
                           class329.field4680 = 16.0F;
                           if (var3 == 0) {
                              break label194;
                           }
                        }

                        class329.field4678 = 8.0F;
                        class329.field4680 = 8.0F;
                        if (var3 == 0) {
                           break label194;
                        }
                     }

                     class329.field4678 = 4.0F;
                     class329.field4680 = 4.0F;
                  }

                  class329.field4675 = (int)class329.field4678 >> 1;
                  class329.field4684 = class405.method3106(class329.field4675, 3);
                  class351.method2743(-1);
                  class329.method2479();
                  class100.field1216 = new class550();
                  class329.field4679 += -2 + (int)(Math.random() * 5.0D);
                  if (~class329.field4679 > 7) {
                     class329.field4679 = -8;
                  }

                  class329.field4682 += -2 + (int)(5.0D * Math.random());
                  if (class329.field4679 > 8) {
                     class329.field4679 = 8;
                  }

                  if (~class329.field4682 > 15) {
                     class329.field4682 = -16;
                  }

                  if (~class329.field4682 < -17) {
                     class329.field4682 = 16;
                  }

                  class329.method2497(arg0, class329.field4679 >> 2 << 10, class329.field4682 >> 1);
                  class329.field4666.method3292(1024, (byte)83, 256);
                  class329.field4672.method4154(256, 64, 256);
                  class329.field4670.method5075(4096, (byte)78);
                  class639.field9324.method3989(-90, 256);
                  class180.field2223 = 20;
               } else if (~class180.field2223 == -21) {
                  class662.method4752(111, true);
                  class329.method2481(arg1, class329.field4679, class329.field4682);
                  class180.field2223 = 60;
                  class662.method4752(87, true);
                  class252.method1903(32);
               } else if (~class180.field2223 != -61) {
                  if (class180.field2223 == 70) {
                     class46.field529 = new class464(arg1, 11, true, class769.field11271);
                     class180.field2223 = 73;
                     class662.method4752(80, true);
                     class252.method1903(32);
                  } else if (~class180.field2223 == -74) {
                     class547.field8116 = new class464(arg1, 12, true, class769.field11271);
                     class180.field2223 = 76;
                     class662.method4752(106, true);
                     class252.method1903(32);
                  } else if (class180.field2223 == 76) {
                     class189.field2359 = new class464(arg1, 14, true, class769.field11271);
                     class180.field2223 = 79;
                     class662.method4752(71, true);
                     class252.method1903(32);
                  } else if (~class180.field2223 == -80) {
                     class573.field8531 = new class464(arg1, 17, true, class769.field11271);
                     class180.field2223 = 82;
                     class662.method4752(96, true);
                     class252.method1903(32);
                  } else if (class180.field2223 == 82) {
                     class302.field4295 = new class464(arg1, 19, true, class769.field11271);
                     class180.field2223 = 85;
                     class662.method4752(122, true);
                     class252.method1903(32);
                  } else if (~class180.field2223 == -86) {
                     class231.field2942 = new class464(arg1, 22, true, class769.field11271);
                     class180.field2223 = 88;
                     class662.method4752(84, true);
                     class252.method1903(32);
                  } else if (class180.field2223 == 88) {
                     class137.field1782 = new class464(arg1, 26, true, class769.field11271);
                     class180.field2223 = 91;
                     class662.method4752(127, true);
                     class252.method1903(32);
                  } else {
                     class601.field8828 = new class464(arg1, 30, true, class769.field11271);
                     class180.field2223 = 100;
                     class662.method4752(121, true);
                     class252.method1903(32);
                     System.gc();
                  }
               } else {
                  label180: {
                     if (class329.field4669.method3904(79, class329.field4667.field6713 + field7139[5])) {
                        if (!class329.field4669.method3886(124, class329.field4667.field6713 + field7139[5])) {
                           return;
                        }

                        class329.field4683 = class629.method4533((byte)114, class329.field4669, class71.field894, class329.field4667.field6713 + field7139[5]);
                        if (var3 == 0) {
                           break label180;
                        }
                     }

                     class329.field4683 = new class560(0);
                  }

                  class329.method2489();
                  class180.field2223 = 70;
                  class662.method4752(73, true);
                  class252.method1903(32);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7139[4] + (arg0 != null ? field7139[3] : field7139[2]) + ',' + (arg1 != null ? field7139[3] : field7139[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(I)I",
      line = 270
   )
   public final int method3566(int arg0) {
      try {
         if (arg0 <= 81) {
            this.method70(-128, (byte)39);
         }

         ++field7137;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7139[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(IB)I",
      line = 281
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = -14 / ((arg1 - -51) / 60);
         ++field7131;
         if (super.field6980.method4680(-17721)) {
            return 3;
         } else {
            return super.field6980.field9467.method2369(96) == 0 ? 3 : 1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7139[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Z)V",
      line = 299
   )
   public final void method69(boolean arg0) {
      try {
         if (super.field6980.method4680(-17721)) {
            super.field6984 = 0;
         }

         if (!arg0) {
            ++field7133;
            if (super.field6980.field9467.method2369(115) == 0) {
               super.field6984 = 0;
            }

            if (~super.field6984 > -1 || super.field6984 > 2) {
               super.field6984 = this.method78(16726277);
            }

         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7139[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 319
   )
   public class480(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(II)V",
      line = 322
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field7138;
         if (arg0 == -14812) {
            super.field6984 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7139[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3567(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3568(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
