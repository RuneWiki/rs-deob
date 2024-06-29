import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class663 extends class22 {
   @OriginalMember(
      owner = "client!wda",
      name = "G",
      descriptor = "I"
   )
   private int field9630;
   @OriginalMember(
      owner = "client!wda",
      name = "r",
      descriptor = "Z"
   )
   private boolean field9633;
   @OriginalMember(
      owner = "client!wda",
      name = "j",
      descriptor = "I"
   )
   private int field9638;
   @OriginalMember(
      owner = "client!wda",
      name = "y",
      descriptor = "I"
   )
   private int field9641;
   @OriginalMember(
      owner = "client!wda",
      name = "C",
      descriptor = "I"
   )
   public int field9634;
   @OriginalMember(
      owner = "client!wda",
      name = "n",
      descriptor = "I"
   )
   private int field9652;
   @OriginalMember(
      owner = "client!wda",
      name = "v",
      descriptor = "I"
   )
   public int field9647;
   @OriginalMember(
      owner = "client!wda",
      name = "o",
      descriptor = "I"
   )
   private int field9643;
   @OriginalMember(
      owner = "client!wda",
      name = "m",
      descriptor = "I"
   )
   private int field9640;
   @OriginalMember(
      owner = "client!wda",
      name = "w",
      descriptor = "Z"
   )
   private boolean field9642;
   @OriginalMember(
      owner = "client!wda",
      name = "F",
      descriptor = "I"
   )
   public int field9635;
   @OriginalMember(
      owner = "client!wda",
      name = "E",
      descriptor = "I"
   )
   private int field9627;
   @OriginalMember(
      owner = "client!wda",
      name = "q",
      descriptor = "I"
   )
   private int field9646;
   @OriginalMember(
      owner = "client!wda",
      name = "L",
      descriptor = "I"
   )
   private int field9626;
   @OriginalMember(
      owner = "client!wda",
      name = "s",
      descriptor = "I"
   )
   private int field9632;
   @OriginalMember(
      owner = "client!wda",
      name = "I",
      descriptor = "Ljava/lang/String;"
   )
   private String field9651;
   @OriginalMember(
      owner = "client!wda",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field9629;
   @OriginalMember(
      owner = "client!wda",
      name = "H",
      descriptor = "Ljava/lang/String;"
   )
   private String field9639;
   @OriginalMember(
      owner = "client!wda",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   private String field9637;
   @OriginalMember(
      owner = "client!wda",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9654 = new String[]{method4855(method4854("\u0003Y\u0006QT\\")), method4855(method4854("\u0003Y\u0006QU\\")), method4855(method4854("\u001aH\u000b\u0013")), method4855(method4854("\u000f\u0013IQl")), method4855(method4854("\u0019T\u0004\r~\u0007R\u0001\u000b")), method4855(method4854("B\u0013V")), method4855(method4854("\u0019\\\u0004")), method4855(method4854("A\u0013W")), method4855(method4854("\u0015M\u0017\u0013t")), method4855(method4854("@\u0013V")), method4855(method4854("A\u0013V")), method4855(method4854("\f\u0005Q '@")), method4855(method4854("E\rIK")), method4855(method4854("@\u0013W")), method4855(method4854("\u0003Y\u0006Q-\u001dS\u000e\u000b/\\")), method4855(method4854("\u0007H\t")), method4855(method4854("E\rIJ")), method4855(method4854("@\u0013^")), method4855(method4854("\u0018T\t\ni")), method4855(method4854("E\rII")), method4855(method4854("B\u0013W")), method4855(method4854("\u0003T\t")), method4855(method4854("\u0015P\u0003I%")), method4855(method4854("\u0003Y\u0006QR\\")), method4855(method4854("\u0003Y\u0006QP\\")), method4855(method4854("\u0003Y\u0006QS\\"))};
   @OriginalMember(
      owner = "client!wda",
      name = "J",
      descriptor = "Lkea;"
   )
   public static class248 field9636 = new class248("", 11);
   @OriginalMember(
      owner = "client!wda",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field9653 = new int[14];
   @OriginalMember(
      owner = "client!wda",
      name = "l",
      descriptor = "Lgh;"
   )
   public static class572 field9649 = new class572(42, -1);
   @OriginalMember(
      owner = "client!wda",
      name = "u",
      descriptor = "I"
   )
   private int field9625;
   @OriginalMember(
      owner = "client!wda",
      name = "D",
      descriptor = "I"
   )
   public static int field9628;
   @OriginalMember(
      owner = "client!wda",
      name = "B",
      descriptor = "I"
   )
   public static int field9631;
   @OriginalMember(
      owner = "client!wda",
      name = "A",
      descriptor = "I"
   )
   public static int field9644;
   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "I"
   )
   public static int field9645;
   @OriginalMember(
      owner = "client!wda",
      name = "p",
      descriptor = "I"
   )
   public static int field9648;
   @OriginalMember(
      owner = "client!wda",
      name = "k",
      descriptor = "I"
   )
   private int field9650;

   @OriginalMember(
      owner = "client!wda",
      name = "b",
      descriptor = "(Z)V"
   )
   private final void method4849(boolean arg0) {
      try {
         if (arg0) {
            this.field9630 = 100;
         }

         if (this.field9629.length() > 40) {
            this.field9629 = this.field9629.substring(0, 40);
         }

         ++field9644;
         if (this.field9651.length() > 40) {
            this.field9651 = this.field9651.substring(0, 40);
         }

         if (~this.field9639.length() < -11) {
            this.field9639 = this.field9639.substring(0, 10);
         }

         if (this.field9637.length() > 10) {
            this.field9637 = this.field9637.substring(0, 10);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9654[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(ILuda;)V"
   )
   public final void method4850(int arg0, class473 arg1) {
      try {
         arg1.method3571(255, 5);
         ++field9645;
         arg1.method3571(255, this.field9630);
         arg1.method3571(255, !this.field9633 ? 0 : 1);
         arg1.method3571(255, this.field9638);
         arg1.method3571(255, this.field9641);
         arg1.method3571(255, this.field9634);
         arg1.method3571(255, this.field9652);
         arg1.method3571(255, this.field9647);
         arg1.method3571(255, this.field9642 ? 1 : 0);
         arg1.method3550(this.field9640, 29620);
         arg1.method3571(255, this.field9643);
         if (arg0 <= -39) {
            arg1.method3573(-52, this.field9635);
            arg1.method3550(this.field9627, 29620);
            arg1.method3571(255, this.field9632);
            arg1.method3571(255, this.field9646);
            arg1.method3571(255, this.field9626);
            arg1.method3578(false, this.field9629);
            arg1.method3578(false, this.field9651);
            arg1.method3578(false, this.field9639);
            arg1.method3578(false, this.field9637);
            arg1.method3571(255, this.field9625);
            arg1.method3550(this.field9650, 29620);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9654[1] + arg0 + ',' + (arg1 != null ? field9654[3] : field9654[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4851(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9628;
         if (class269.field3810 == null) {
            return 0;
         } else {
            int var4 = arg1 >> 9;
            int var5 = arg0 >> 9;
            if (~var4 <= -1 && ~var5 <= -1 && class209.field3112 + -1 >= var4 && class1.field3 - 1 >= var5) {
               if (arg3 < 100) {
                  method4851(-42, 68, 60, 103);
               }

               int var6 = arg2;
               if (arg2 < 3 && (class608.field8732[1][var4][var5] & 2) != 0) {
                  var6 = arg2 + 1;
               }

               return class269.field3810[var6].method2287(-87, arg0, arg1);
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9654[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4852(int arg0) {
      try {
         int var1 = 30 / ((arg0 - -5) / 58);
         field9649 = null;
         field9636 = null;
         field9653 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9654[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method4853(int arg0) {
      try {
         ++field9631;
         byte var2 = 23;
         int var3 = var2 + class471.method3515(121, this.field9629);
         int var4 = var3 + class471.method3515(120, this.field9651);
         int var5 = var4 + class471.method3515(arg0 ^ 3885, this.field9639);
         if (arg0 != 3912) {
            this.field9629 = null;
         }

         return var5 + class471.method3515(114, this.field9637);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9654[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "<init>",
      descriptor = "()V"
   )
   public class663() {
   }

   @OriginalMember(
      owner = "client!wda",
      name = "<init>",
      descriptor = "(ZLoo;)V"
   )
   public class663(boolean arg0, class651 arg1) {
      boolean var3 = client.field4564;
      super();

      try {
         if (arg0) {
            label293: {
               if (!class651.field9433.startsWith(field9654[21])) {
                  if (class651.field9433.startsWith(field9654[6])) {
                     this.field9630 = 2;
                     if (!var3) {
                        break label293;
                     }
                  }

                  if (class651.field9433.startsWith(field9654[18])) {
                     this.field9630 = 3;
                     if (!var3) {
                        break label293;
                     }
                  }

                  this.field9630 = 4;
                  if (!var3) {
                     break label293;
                  }
               }

               this.field9630 = 1;
            }

            label282: {
               if (!class651.field9439.startsWith(field9654[22]) && !class651.field9439.startsWith(field9654[11])) {
                  this.field9633 = false;
                  if (!var3) {
                     break label282;
                  }
               }

               this.field9633 = true;
            }

            label302: {
               if (this.field9630 == 1) {
                  if (~class651.field9458.indexOf(field9654[13]) != 0) {
                     this.field9638 = 1;
                     if (!var3) {
                        break label302;
                     }
                  }

                  if (~class651.field9458.indexOf(field9654[9]) != 0) {
                     this.field9638 = 2;
                     if (!var3) {
                        break label302;
                     }
                  }

                  if (~class651.field9458.indexOf(field9654[17]) != 0) {
                     this.field9638 = 3;
                     if (!var3) {
                        break label302;
                     }
                  }

                  if (class651.field9458.indexOf(field9654[7]) == -1) {
                     if (class651.field9458.indexOf(field9654[10]) != -1) {
                        this.field9638 = 5;
                        if (!var3) {
                           break label302;
                        }
                     }

                     if (class651.field9458.indexOf(field9654[20]) != -1) {
                        this.field9638 = 6;
                        if (!var3) {
                           break label302;
                        }
                     }

                     if (~class651.field9458.indexOf(field9654[5]) == 0) {
                        break label302;
                     }

                     this.field9638 = 7;
                     if (!var3) {
                        break label302;
                     }
                  }

                  this.field9638 = 4;
                  if (!var3) {
                     break label302;
                  }
               }

               if (this.field9630 == 2) {
                  label310: {
                     if (class651.field9458.indexOf(field9654[12]) == -1) {
                        if (class651.field9458.indexOf(field9654[16]) != -1) {
                           this.field9638 = 21;
                           if (!var3) {
                              break label310;
                           }
                        }

                        if (~class651.field9458.indexOf(field9654[19]) == 0) {
                           break label310;
                        }

                        this.field9638 = 22;
                        if (!var3) {
                           break label310;
                        }
                     }

                     this.field9638 = 20;
                  }
               }
            }

            label306: {
               if (~class651.field9455.toLowerCase().indexOf(field9654[15]) != 0) {
                  this.field9641 = 1;
                  if (!var3) {
                     break label306;
                  }
               }

               if (~class651.field9455.toLowerCase().indexOf(field9654[4]) == 0) {
                  if (class651.field9455.toLowerCase().indexOf(field9654[8]) != -1) {
                     this.field9641 = 3;
                     if (!var3) {
                        break label306;
                     }
                  }

                  this.field9641 = 4;
                  if (!var3) {
                     break label306;
                  }
               }

               this.field9641 = 2;
            }

            int var4 = 2;
            int var5 = 0;

            label229: {
               label228: {
                  try {
                     if (var3 || class651.field9436.length() > var4) {
                        do {
                           char var6 = class651.field9436.charAt(var4);
                           if (var6 < '0' || ~var6 < -58) {
                              break label228;
                           }

                           ++var4;
                           var5 = var5 * 10 + -48 + var6;
                        } while(class651.field9436.length() > var4);
                     }
                  } catch (Exception var14) {
                     break label228;
                  }

                  if (var3) {
                     break label229;
                  }
               }

               this.field9634 = var5;
               var5 = 0;
               var4 = 1 + class651.field9436.indexOf(46, 2);
            }

            label209: {
               label208: {
                  try {
                     if (var3 || ~var4 > ~class651.field9436.length()) {
                        do {
                           char var7 = class651.field9436.charAt(var4);
                           if (~var7 > -49 || ~var7 < -58 && !var3) {
                              break label208;
                           }

                           ++var4;
                           var5 = var5 * 10 - (-var7 + 48);
                        } while(~var4 > ~class651.field9436.length());
                     }
                  } catch (Exception var13) {
                     break label208;
                  }

                  if (var3) {
                     break label209;
                  }
               }

               this.field9652 = var5;
               var5 = 0;
               var4 = class651.field9436.indexOf(95, 4) - -1;
            }

            label188: {
               label187: {
                  try {
                     if (var3 || var4 < class651.field9436.length()) {
                        do {
                           char var8 = class651.field9436.charAt(var4);
                           if (~var8 > -49 || var8 > '9') {
                              break label187;
                           }

                           ++var4;
                           var5 = var5 * 10 + var8 + -48;
                        } while(var4 < class651.field9436.length());
                     }
                  } catch (Exception var12) {
                     break label187;
                  }

                  if (var3) {
                     break label188;
                  }
               }

               this.field9647 = var5;
            }

            label168: {
               if (this.field9634 > 3) {
                  this.field9643 = class463.field6773;
                  if (!var3) {
                     break label168;
                  }
               }

               this.field9643 = 0;
            }

            label163: {
               this.field9640 = class73.field1307;
               if (!arg1.field9456) {
                  this.field9642 = true;
                  if (!var3) {
                     break label163;
                  }
               }

               this.field9642 = false;
            }

            try {
               int[] var9 = HardwareInfo.getCPUInfo();
               if (var9 != null && ~var9.length == -8) {
                  this.field9635 = var9[6];
                  this.field9627 = var9[2];
                  this.field9646 = var9[4];
                  this.field9626 = var9[5];
                  this.field9632 = var9[3];
               }
            } catch (Throwable var11) {
               this.field9635 = 0;
            }
         }

         if (this.field9651 == null) {
            this.field9651 = "";
         }

         if (this.field9629 == null) {
            this.field9629 = "";
         }

         if (this.field9639 == null) {
            this.field9639 = "";
         }

         if (this.field9637 == null) {
            this.field9637 = "";
         }

         this.method4849(false);
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field9654[14] + arg0 + ',' + (arg1 != null ? field9654[3] : field9654[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4854(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4855(char[] arg0) {
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
            var10005 = 61;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
