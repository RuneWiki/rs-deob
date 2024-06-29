import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class410 {
   @OriginalMember(
      owner = "client!client",
      name = "yb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4531 = new String[]{method2405(method2404("\u0007\u001eM1?\u0010\\n|")), method2405(method2404("\u001f\\\nz,")), method2405(method2404("\n\u0007H8")), method2405(method2404("DZv12\u000b\u0004A&4\u0000[\u0004")), method2405(method2404("A[")), method2405(method2404("X\u0010Vj")), method2405(method2404("\u0007\u001eM1?\u0010\\b|")), method2405(method2404("X\u0010Vjy")), method2405(method2404("\u0000\u0017I;0\u0000\u0016V1\"\u0017")), method2405(method2404("\u0011\u001c@1#")), method2405(method2404("\u0005\u0014B=5")), method2405(method2404("\b\u0013J3")), method2405(method2404("\u0011\u0001A&\u0017\b\u001dS")), method2405(method2404("\u0013\u001dV85\u0002\u001eE3\"")), method2405(method2404("\u0002\u001dV74RFI6")), method2405(method2404("\u0017\u0001O1(")), method2405(method2404("\u0010\u0000Q1")), method2405(method2404("\u000b\u0010N12\u0010\u0006E3")), method2405(method2404("\u0005\u0016R1#\u0010")), method2405(method2404("\b\u001dF6(\u0005\u0016@&4\u0017\u0001")), method2405(method2404("\u0003\u0013I1")), method2405(method2404("\u0007\u001dQ:%\u0016\u000b")), method2405(method2404("\b\u001dF6(\r\u0016")), method2405(method2404("\u000e\u0001")), method2405(method2404("\u0000\u0017I;8\u0000")), method2405(method2404("\u0013\u001dV85\r\u0016")), method2405(method2404("\t\u001d@1&\f\u0013P")), method2405(method2404("\u0005\u0016@=%\r\u001dJ5=-\u001cB;")), method2405(method2404("\u0007\u001dH;$\u0016\u001b@")), method2405(method2404("\u0007\u001eM1?\u0010\\M:8\u0010Z")), method2405(method2404("\t\u001d@1&\f\u0017V1")), method2405(method2404("\u0002\u0000K93\r\u001eH=?\u0003")), method2405(method2404("\u0017\u001bP1\"\u0001\u0006P=?\u0003\u0001{94\t\u0010A&")), method2405(method2404("\u0017\u0017P 8\n\u0015W")), method2405(method2404("\u0015\u0007M $\u0016\u001e")), method2405(method2404("\u0007\u001eM1?\u0010\\u|")), method2405(method2404("\u000e\u0001\u00117>\n\u001cA7%")), method2405(method2404("\u000e\u0001\u0011$#\u000b\n]\u000b")), method2405(method2404("\u000e\u0001\u00117>\n\u001cA7%;\u0014Q8=")), method2405(method2404("\u000e\u0001\u0011=>")), method2405(method2404("\u000e\u0001\u00117#\u0007")), method2405(method2404("\u000e\u0001\u00117>\n\u001cA7%;\u001dQ >\u0002\u0016E 4")), method2405(method2404("\u0007\u001eM1?\u0010\\h|")), method2405(method2404("\u0007\u001eM1?\u0010\\j|")), method2405(method2404("\u0007\u001eM1?\u0010\\s|")), method2405(method2404("\u0007\u001eM1?\u0010\\p|")), method2405(method2404("\u0003\u0013I1a")), method2405(method2404("\u0003\u0013I1c")), method2405(method2404("\u0003\u0013I1b")), method2405(method2404("\u0016\u0011")), method2405(method2404("\u0013\u001bT")), method2405(method2404("\u0001\u001cC88\u0017\u001a")), method2405(method2404("\b\u001bR1")), method2405(method2404("\b\u0013J3$\u0005\u0015A")), method2405(method2404("\u0003\u0017V90\n")), method2405(method2404("\u0007\u001eM1?\u0010\\I58\nZ")), method2405(method2404("\u0003\u0013I1`")), method2405(method2404("%\u0000C!<\u0001\u001cPt2\u000b\u0007J ")), method2405(method2404("\u0007\u001eM1?\u0010\\o|")), method2405(method2404("X\u0011K8l\u0002\u0014B27\u0002L")), method2405(method2404("*\u0007H8")), method2405(method2404("D_\u001a")), method2405(method2404("\u0007\u001eM1?\u0010\\w|")), method2405(method2404("V[")), method2405(method2404("S[")), method2405(method2404("UA\r")), method2405(method2404("\u0018F\r")), method2405(method2404("][")), method2405(method2404("\n\u0013I1")), method2405(method2404("\\[")), method2405(method2404("\u000e\u0013R5\u007f\b\u0013J3\u007f'\u001eE'\"(\u001dE04\u0016")), method2405(method2404("\u0007\u001eM1?\u0010")), method2405(method2404("?C\r")), method2405(method2404("\u000e\u0013R5\u007f\b\u0013J3\u007f\u0016\u0017B84\u0007\u0006\n\u00152\u0007\u0017W'8\u0006\u001eA\u001b3\u000e\u0017G ")), method2405(method2404("\u0018C\u0012}")), method2405(method2404("UC\r")), method2405(method2404("\u0018C\u0011}")), method2405(method2404("UB\r")), method2405(method2404("\u0018G\r")), method2405(method2404("\f\u0013J0=\u0001")), method2405(method2404("\u0017\u0005\u00170\u007f\u0000\u001eH")), method2405(method2404("W[")), method2405(method2404("\u0007\u001eM1?\u0010\\q|")), method2405(method2404("\u0017\u0017P\u00152\u0007\u0017W'8\u0006\u001eA")), method2405(method2404("\n\u0013P='\u0001>M6#\u0005\u0000M1\"")), method2405(method2404("U@\r")), method2405(method2404("UF\r")), method2405(method2404("\u0018D\r")), method2405(method2404("\u0007\u001eM1?\u0010\\k|")), method2405(method2404("\u0007\u001eM1?\u0010\\f|")), method2405(method2404("U@\u0013zaJB\ne")), method2405(method2404(".\u0013C1)")), method2405(method2404("\u0007\u001eM1?\u0010\\e|")), method2405(method2404("\u0007\u0013J\"0\u0017")), method2405(method2404("\u0007\u001eM1?\u0010\\e\u0015y"))};
   @OriginalMember(
      owner = "client!client",
      name = "lb",
      descriptor = "Z"
   )
   public static boolean field4512 = false;
   @OriginalMember(
      owner = "client!client",
      name = "jb",
      descriptor = "I"
   )
   public static int field4511;
   @OriginalMember(
      owner = "client!client",
      name = "mb",
      descriptor = "I"
   )
   public static int field4513;
   @OriginalMember(
      owner = "client!client",
      name = "kb",
      descriptor = "I"
   )
   public static int field4514;
   @OriginalMember(
      owner = "client!client",
      name = "qb",
      descriptor = "I"
   )
   public static int field4515;
   @OriginalMember(
      owner = "client!client",
      name = "gb",
      descriptor = "I"
   )
   public static int field4516;
   @OriginalMember(
      owner = "client!client",
      name = "nb",
      descriptor = "I"
   )
   public static int field4517;
   @OriginalMember(
      owner = "client!client",
      name = "eb",
      descriptor = "I"
   )
   public static int field4518;
   @OriginalMember(
      owner = "client!client",
      name = "sb",
      descriptor = "I"
   )
   public static int field4519;
   @OriginalMember(
      owner = "client!client",
      name = "rb",
      descriptor = "I"
   )
   public static int field4520;
   @OriginalMember(
      owner = "client!client",
      name = "xb",
      descriptor = "I"
   )
   public static int field4521;
   @OriginalMember(
      owner = "client!client",
      name = "fb",
      descriptor = "I"
   )
   public static int field4522;
   @OriginalMember(
      owner = "client!client",
      name = "wb",
      descriptor = "I"
   )
   public static int field4523;
   @OriginalMember(
      owner = "client!client",
      name = "ib",
      descriptor = "I"
   )
   public static int field4524;
   @OriginalMember(
      owner = "client!client",
      name = "pb",
      descriptor = "I"
   )
   public static int field4525;
   @OriginalMember(
      owner = "client!client",
      name = "hb",
      descriptor = "I"
   )
   public static int field4526;
   @OriginalMember(
      owner = "client!client",
      name = "tb",
      descriptor = "I"
   )
   public static int field4527;
   @OriginalMember(
      owner = "client!client",
      name = "ob",
      descriptor = "I"
   )
   public static int field4528;
   @OriginalMember(
      owner = "client!client",
      name = "ub",
      descriptor = "I"
   )
   public static int field4530;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!client",
      name = "vb",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4529;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method2403(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Lhv;)Z",
      line = 3
   )
   public static final boolean method2379(class544 arg0) {
      if (class384.field5876) {
         if (method2388(arg0).field7097 != 0) {
            return false;
         }

         if (arg0.field7920 == 0) {
            return false;
         }
      }

      return arg0.field7995;
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(Lhv;)Lhv;",
      line = 17
   )
   public static final class544 method2380(class544 arg0) {
      int var1 = method2388(arg0).method3547((byte)-96);
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            arg0 = class543.method4011(arg0.field7968, (byte)127);
            if (arg0 == null) {
               return null;
            }
         }

         return arg0;
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(Z)V",
      line = 39
   )
   private final void method2381(boolean arg0) {
      int var2 = field4530;

      try {
         ++field4521;
         if (~class672.field10112 != -15) {
            if (!arg0) {
               ++class314.field4488;
               if (class314.field4488 % 1000 == 1) {
                  GregorianCalendar var3 = new GregorianCalendar();
                  class429.field6548 = var3.get(11) * 600 - -(10 * var3.get(12)) - -(var3.get(13) / 6);
                  class5.field92.setSeed((long)class429.field6548);
               }

               if (class314.field4488 % 50 == 0) {
                  class501.field7456 = class498.field7378;
                  class360.field5432 = class32.field351;
                  class498.field7378 = 0;
                  class32.field351 = 0;
               }

               this.method2394(true);
               if (class594.field8757 != null) {
                  class594.field8757.method2089((byte)123);
               }

               class370.method2877(-25803);
               class502.method3743(11088);
               class597.field8785.method1534(!arg0);
               class723.field10766.method374((byte)122);
               if (class786.field11439 != null) {
                  class786.field11439.method555((int)class188.method1462(true));
               }

               int var10000;
               label219: {
                  class593.method4357((byte)114);
                  class123.field1494 = 0;
                  class165.field2078 = 0;
                  class114 var4 = class597.field8785.method1542((byte)-128);
                  if (var2 != 0) {
                     var10000 = var4.method956(!arg0);
                  } else if (var4 == null) {
                     var10000 = 0;
                     if (var2 == 0) {
                        break label219;
                     }
                  } else {
                     var10000 = var4.method956(!arg0);
                  }

                  while(true) {
                     label346: {
                        int var5 = var10000;
                        if (~var5 == -3 || ~var5 == -4) {
                           char var6 = var4.method958(22585);
                           if (class119.method997(32) && (var6 == '`' || ~var6 == -168 || ~var6 == -179)) {
                              if (class89.method818(10)) {
                                 class569.method4219(-1056576788);
                                 if (var2 == 0) {
                                    break label346;
                                 }
                              }

                              class119.method999(-106);
                              if (var2 == 0) {
                                 break label346;
                              }
                           }

                           if (~class123.field1494 <= -129) {
                              break label346;
                           }

                           class348.field5290[class123.field1494] = var4;
                           ++class123.field1494;
                           if (var2 == 0) {
                              break label346;
                           }
                        }

                        if (var5 == 0 && ~class165.field2078 > -76) {
                           class312.field4463[class165.field2078] = var4;
                           ++class165.field2078;
                        }
                     }

                     var4 = class597.field8785.method1542((byte)-128);
                     if (var4 == null) {
                        var10000 = 0;
                        if (var2 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var4.method956(!arg0);
                     }
                  }
               }

               class26.field287 = var10000;
               class467 var7 = class723.field10766.method375(-1);
               int var8;
               if (var2 != 0) {
                  var8 = var7.method3489((byte)50);
                  if (~var8 == 0) {
                     class260.field3524.method4060(23, var7);
                     if (var2 != 0) {
                        if (var8 != 6) {
                           if (class279.method2142(var8, -78)) {
                              class356.field5394.method4060(23, var7);
                              if (class356.field5394.method4072(false) > 10) {
                                 class356.field5394.method4063(-5);
                                 if (var2 != 0) {
                                    class26.field287 += var7.method3493((byte)110);
                                 }
                              }
                           }
                        } else {
                           class26.field287 += var7.method3493((byte)110);
                        }

                        var7 = class723.field10766.method375(-1);
                     } else {
                        var7 = class723.field10766.method375(-1);
                     }
                  } else {
                     if (var8 != 6) {
                        if (class279.method2142(var8, -78)) {
                           class356.field5394.method4060(23, var7);
                           if (class356.field5394.method4072(false) > 10) {
                              class356.field5394.method4063(-5);
                              if (var2 != 0) {
                                 class26.field287 += var7.method3493((byte)110);
                              }
                           }
                        }
                     } else {
                        class26.field287 += var7.method3493((byte)110);
                     }

                     var7 = class723.field10766.method375(-1);
                  }
               }

               while(true) {
                  if (var7 == null) {
                     var10000 = class89.method818(10);
                     if (var2 == 0) {
                        if (var10000 != 0) {
                           class515.method3813((byte)101);
                        }

                        label161: {
                           if (class525.method3871(class672.field10112, 0)) {
                              class231.method1743((byte)25);
                              class252.method1903(32);
                              if (var2 == 0) {
                                 break label161;
                              }
                           }

                           if (class117.method980(-123, class672.field10112)) {
                              class427.method3255((byte)107);
                           }
                        }

                        label341: {
                           if (!class766.method5543((byte)-124, class672.field10112) || class117.method980(-50, class672.field10112)) {
                              if (!class677.method4944(class672.field10112, 0) || class117.method980(-100, class672.field10112)) {
                                 if (~class672.field10112 == -13) {
                                    class361.method2814((byte)111);
                                    if (var2 == 0) {
                                       break label341;
                                    }
                                 }

                                 if (!class1.method21((byte)-85, class672.field10112) || class117.method980(-60, class672.field10112)) {
                                    if (~class672.field10112 != -14) {
                                       break label341;
                                    }

                                    class361.method2814((byte)111);
                                    if (~class348.field5289 == 2 || ~class348.field5289 == -3 || ~class348.field5289 == -16) {
                                       break label341;
                                    }

                                    class434.method3301(false, 0);
                                    if (var2 == 0) {
                                       break label341;
                                    }
                                 }

                                 class75.method732(-1);
                                 if (var2 == 0) {
                                    break label341;
                                 }
                              }

                              this.method2384(-22053);
                              class361.method2814((byte)111);
                              if (var2 == 0) {
                                 break label341;
                              }
                           }

                           this.method2384(-22053);
                           class200.method1543(-5);
                           class361.method2814((byte)111);
                        }

                        class574.method4251((byte)-107, class786.field11439);
                        class356.field5394.method4063(-5);
                        return;
                     }
                  } else {
                     var10000 = var7.method3489((byte)50);
                  }

                  var8 = var10000;
                  if (~var8 == 0) {
                     class260.field3524.method4060(23, var7);
                     if (var2 != 0) {
                        if (var8 != 6) {
                           if (class279.method2142(var8, -78)) {
                              class356.field5394.method4060(23, var7);
                              if (class356.field5394.method4072(false) > 10) {
                                 class356.field5394.method4063(-5);
                                 if (var2 != 0) {
                                    class26.field287 += var7.method3493((byte)110);
                                 }
                              }
                           }
                        } else {
                           class26.field287 += var7.method3493((byte)110);
                        }

                        var7 = class723.field10766.method375(-1);
                     } else {
                        var7 = class723.field10766.method375(-1);
                     }
                  } else {
                     if (var8 != 6) {
                        if (class279.method2142(var8, -78)) {
                           class356.field5394.method4060(23, var7);
                           if (class356.field5394.method4072(false) > 10) {
                              class356.field5394.method4063(-5);
                              if (var2 != 0) {
                                 class26.field287 += var7.method3493((byte)110);
                              }
                           }
                        }
                     } else {
                        class26.field287 += var7.method3493((byte)110);
                     }

                     var7 = class723.field10766.method375(-1);
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field4531[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "m",
      descriptor = "(I)V",
      line = 208
   )
   public static final void method2382(int arg0) {
      int var1 = class287.field4026;
      int[] var2 = class33.field372;

      for(int var3 = 0; var3 < class159.field2021 + var1; ++var3) {
         class397 var4;
         if (var3 < var1) {
            var4 = class661.field9578[var2[var3]];
         } else {
            var4 = ((class726)class259.field3509.method5681((long)class115.field1381[var3 - var1], -1)).field10794;
         }

         if (var4.field9010 == arg0 && var4.field6020 >= 0) {
            int var5 = var4.method3046(114);
            if ((var5 & 1) == 0) {
               if ((var4.field9003 & 511) != 0 || (var4.field9007 & 511) != 0) {
                  continue;
               }
            } else if ((var4.field9003 & 511) != 256 || (var4.field9007 & 511) != 256) {
               continue;
            }

            int var10002;
            if (var5 == 1) {
               int var6 = var4.field9003 >> 9;
               int var7 = var4.field9007 >> 9;
               if (var4.field6020 > class726.field10789[var6][var7]) {
                  class726.field10789[var6][var7] = var4.field6020;
                  class364.field5461[var6][var7] = 1;
               } else if (class726.field10789[var6][var7] == var4.field6020) {
                  var10002 = class364.field5461[var6][var7]++;
               }
            } else {
               int var8 = (var5 - 1) * 256 + 60;
               int var9 = var4.field9003 - var8 >> 9;
               int var10 = var4.field9007 - var8 >> 9;
               int var11 = var4.field9003 + var8 >> 9;
               int var12 = var4.field9007 + var8 >> 9;

               for(int var13 = var9; var13 <= var11; ++var13) {
                  for(int var14 = var10; var14 <= var12; ++var14) {
                     if (var4.field6020 > class726.field10789[var13][var14]) {
                        class726.field10789[var13][var14] = var4.field6020;
                        class364.field5461[var13][var14] = 1;
                     } else if (class726.field10789[var13][var14] == var4.field6020) {
                        var10002 = class364.field5461[var13][var14]++;
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Z)V",
      line = 305
   )
   public final void method2383(boolean arg0) {
      try {
         label26: {
            ++field4524;
            if (class261.field3566.field9464.method4225(87) == 2) {
               try {
                  this.method2400((byte)-55);
                  break label26;
               } catch (ThreadDeath var5) {
                  throw var5;
               } catch (Throwable var6) {
                  class238.method1776(-45, var6, var6.getMessage() + field4531[3] + this.method2387(-37));
                  class255.field3392 = true;
                  class428.method3261(false, -124, 0);
                  if (field4530 == 0) {
                     break label26;
                  }
               }
            }

            this.method2400((byte)0);
         }

         if (!arg0) {
            method2380((class544)null);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4531[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "init",
      descriptor = "()V",
      line = 333
   )
   public final void init() {
      int var1 = field4530;

      try {
         ++field4517;
         if (this.method3135(-1)) {
            label199: {
               class478.field7106 = new class693();
               class478.field7106.field10414 = Integer.parseInt(this.getParameter(field4531[25]));
               class330.field4710 = new class693();
               class330.field4710.field10414 = Integer.parseInt(this.getParameter(field4531[22]));
               class330.field4710.field10410 = this.getParameter(field4531[19]);
               class89.field1080 = new class693();
               class89.field1080.field10414 = Integer.parseInt(this.getParameter(field4531[24]));
               class89.field1080.field10410 = this.getParameter(field4531[8]);
               class487.field7208 = class598.method4377(true, Integer.parseInt(this.getParameter(field4531[30])));
               if (class487.field7208 == class266.field3653) {
                  class487.field7208 = class366.field5503;
                  if (var1 == 0) {
                     break label199;
                  }
               }

               if (!class235.method1765(-83, class487.field7208) && class487.field7208 != class281.field3917) {
                  class487.field7208 = class281.field3917;
               }
            }

            class457.field6929 = class317.method2412(Integer.parseInt(this.getParameter(field4531[26])), (byte)-59);
            if (class457.field6929 != class358.field5415 && class663.field9636 != class457.field6929 && class498.field7376 != class457.field6929) {
               class457.field6929 = class498.field7376;
            }

            try {
               class728.field10827 = Integer.parseInt(this.getParameter(field4531[11]));
            } catch (Exception var17) {
               class728.field10827 = 0;
            }

            label191: {
               String var2 = this.getParameter(field4531[17]);
               if (var2 != null && var2.equals("1")) {
                  class238.field3004 = true;
                  if (var1 == 0) {
                     break label191;
                  }
               }

               class238.field3004 = false;
            }

            label207: {
               String var3 = this.getParameter(field4531[23]);
               if (var3 == null || !var3.equals("1")) {
                  field4512 = false;
                  if (var1 == 0) {
                     break label207;
                  }
               }

               field4512 = true;
            }

            label208: {
               String var4 = this.getParameter(field4531[18]);
               if (var4 == null || !var4.equals("1")) {
                  class712.field10628 = false;
                  if (var1 == 0) {
                     break label208;
                  }
               }

               class712.field10628 = true;
            }

            String var5 = this.getParameter(field4531[20]);
            if (var5 != null) {
               label168: {
                  if (!var5.equals("0")) {
                     if (!var5.equals("1")) {
                        if (!var5.equals("2")) {
                           if (!var5.equals("3")) {
                              break label168;
                           }

                           class489.field7224 = class289.field4054;
                           if (var1 == 0) {
                              break label168;
                           }
                        }

                        class489.field7224 = class764.field11227;
                        if (var1 == 0) {
                           break label168;
                        }
                     }

                     class489.field7224 = class180.field2219;
                     if (var1 == 0) {
                        break label168;
                     }
                  }

                  class489.field7224 = class382.field5860;
               }
            }

            try {
               class225.field2894 = Integer.parseInt(this.getParameter(field4531[10]));
            } catch (Exception var16) {
               class225.field2894 = 0;
            }

            class400.field6146 = this.getParameter(field4531[34]);
            class37.field401 = this.getParameter(field4531[33]);
            if (class37.field401 == null) {
               class37.field401 = "";
            }

            class479.field7128 = "1".equals(this.getParameter(field4531[9]));
            String var6 = this.getParameter(field4531[21]);
            if (var6 != null) {
               try {
                  class68.field855 = Integer.parseInt(var6);
               } catch (Exception var15) {
                  class68.field855 = 0;
               }
            }

            class779.field11370 = Integer.parseInt(this.getParameter(field4531[28]));
            if (class779.field11370 < 0 || class779.field11370 >= class336.field4808.length) {
               class779.field11370 = 0;
            }

            if (Integer.parseInt(this.getParameter(field4531[32])) == 1) {
               class134.field1692 = true;
               class739.field10966 = true;
            }

            String var7 = this.getParameter(field4531[31]);
            if (var7 != null && var7.equals(field4531[16])) {
               class520.field7563 = true;
            }

            String var8 = this.getParameter(field4531[15]);
            if (var8 != null) {
               class402.field6179 = class309.method2334(false, class315.method2373(var8, (byte)-42));
               if (~class402.field6179.length > -17) {
                  class402.field6179 = null;
               }
            }

            String var9 = this.getParameter(field4531[14]);
            if (var9 != null && var9.equals(field4531[16])) {
               class110.field1346 = true;
            }

            String var10 = this.getParameter(field4531[13]);
            if (var10 != null) {
               try {
                  class120.field1461 = Integer.parseInt(var10);
               } catch (Exception var14) {
               }
            }

            String var11 = this.getParameter(field4531[12]);
            if (var11 != null) {
               try {
                  class768.field11265 = Long.parseLong(var11);
               } catch (NumberFormatException var13) {
               }
            }

            class365.field5474 = this.getParameter(field4531[27]);
            if (class365.field5474 != null && ~class365.field5474.length() < -51) {
               class365.field5474 = null;
            }

            label136: {
               class158.field2008 = this;
               if (class489.field7224 == class382.field5860) {
                  class189.field2365 = 765;
                  class663.field9630 = 503;
                  if (var1 == 0) {
                     break label136;
                  }
               }

               if (class489.field7224 == class180.field2219) {
                  class189.field2365 = 640;
                  class663.field9630 = 480;
               }
            }

            this.method3138(37, class189.field2365, class663.field9630, 124, 651, class457.field6929.method2450(0) + 32, class489.field7224.field254);
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field4531[29] + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "k",
      descriptor = "(I)V",
      line = 507
   )
   private final void method2384(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(I)V",
      line = 794
   )
   public final void method2385(int arg0) {
      int var2 = field4530;

      try {
         if (class173.field2161) {
            class190.method1476((byte)-63);
         }

         ++field4523;
         class350.method2735(20);
         if (class786.field11439 != null) {
            class786.field11439.method653(-124);
         }

         if (class628.field9136 != null) {
            class209.method1589(class755.field11144, class628.field9136, 96);
            class628.field9136 = null;
         }

         if (class429.field6546 != null) {
            class429.field6546.method812(2035738378);
            class429.field6546 = null;
         }

         class165.method1341(true);
         class481.field7144.method1933((byte)16);
         class726.field10790.method767(75);
         if (class351.field5316 != null) {
            class351.field5316.method5171(false);
            class351.field5316 = null;
         }

         boolean var10001;
         int var3;
         try {
            class712.field10629.method3973(false);
            var3 = 0;
            if (arg0 < 79) {
               return;
            }
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         while(true) {
            label44: {
               try {
                  if (var3 < 37) {
                     class503.field7468[var3].method3973(false);
                     break label44;
                  }

                  class663.field9634.method3973(false);
                  class561.field8395.method3973(false);
                  class23.method154(-8070);
               } catch (Exception var6) {
                  var10001 = false;
                  break;
               }

               if (var2 == 0) {
                  return;
               }
            }

            try {
               ++var3;
            } catch (Exception var5) {
               var10001 = false;
               break;
            }
         }

      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4531[89] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "main",
      descriptor = "([Ljava/lang/String;)V",
      line = 849
   )
   public static final void main(String[] arg0) {
      int var1 = field4530;

      try {
         try {
            if (arg0.length != 6) {
               class627.method4519(field4531[57], (byte)111);
            }

            label95: {
               class478.field7106 = new class693();
               class478.field7106.field10414 = Integer.parseInt(arg0[0]);
               class330.field4710 = new class693();
               class330.field4710.field10414 = Integer.parseInt(arg0[1]);
               class89.field1080 = new class693();
               class89.field1080.field10414 = Integer.parseInt(arg0[2]);
               class487.field7208 = class266.field3653;
               if (!arg0[3].equals(field4531[52])) {
                  if (!arg0[3].equals(field4531[49])) {
                     if (arg0[3].equals(field4531[50])) {
                        class457.field6929 = class358.field5415;
                        if (var1 == 0) {
                           break label95;
                        }
                     }

                     class627.method4519(field4531[26], (byte)115);
                     if (var1 == 0) {
                        break label95;
                     }
                  }

                  class457.field6929 = class663.field9636;
                  if (var1 == 0) {
                     break label95;
                  }
               }

               class457.field6929 = class498.field7376;
            }

            class728.field10827 = class8.method74(arg0[4], 108);
            if (~class728.field10827 == 0) {
               label105: {
                  if (arg0[4].equals(field4531[51])) {
                     class728.field10827 = 0;
                     if (var1 == 0) {
                        break label105;
                     }
                  }

                  if (arg0[4].equals(field4531[54])) {
                     class728.field10827 = 1;
                     if (var1 == 0) {
                        break label105;
                     }
                  }

                  class627.method4519(field4531[53], (byte)-114);
               }
            }

            label104: {
               field4512 = false;
               class238.field3004 = false;
               if (arg0[5].equals(field4531[46])) {
                  class489.field7224 = class382.field5860;
                  if (var1 == 0) {
                     break label104;
                  }
               }

               if (arg0[5].equals(field4531[56])) {
                  class489.field7224 = class180.field2219;
                  if (var1 == 0) {
                     break label104;
                  }
               }

               if (arg0[5].equals(field4531[47])) {
                  class489.field7224 = class764.field11227;
                  if (var1 == 0) {
                     break label104;
                  }
               }

               if (arg0[5].equals(field4531[48])) {
                  class489.field7224 = class289.field4054;
                  if (var1 == 0) {
                     break label104;
                  }
               }

               class627.method4519(field4531[20], (byte)-46);
            }

            class120.field1461 = 0;
            class110.field1346 = false;
            class779.field11370 = class489.field7224.field256;
            class768.field11265 = 0L;
            class365.field5474 = null;
            class402.field6179 = null;
            class68.field855 = 0;
            class37.field401 = "";
            class520.field7563 = false;
            class134.field1692 = true;
            class739.field10966 = true;
            class225.field2894 = 0;
            client var2 = new client();
            class158.field2008 = var2;
            var2.method3140(1024, class489.field7224.field254, (byte)-125, class457.field6929.method2450(0) + 32, 37, 651, false, 768);
            class691.field10404.setLocation(40, 40);
         } catch (Exception var5) {
            class238.method1776(-7, var5, (String)null);
         }

         ++field4511;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4531[55] + (arg0 != null ? field4531[1] : field4531[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(IB)V",
      line = 939
   )
   private final void method2386(int arg0, byte arg1) {
      try {
         class682.field10238 = null;
         ++field4519;
         if (arg1 >= 116) {
            class481.field7144.field3475 = arg0;
            class180.field2222 = null;
            class501.field7454 = 0;
            ++class481.field7144.field3476;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4531[62] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(I)Ljava/lang/String;",
      line = 959
   )
   public final String method2387(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Lhv;)Ltd;",
      line = 1044
   )
   public static final class478 method2388(class544 arg0) {
      class478 var1 = (class478)class417.field6385.method5681(((long)arg0.field8054 << 32) + (long)arg0.field8048, -1);
      return var1 != null ? var1 : arg0.field8033;
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "([Lhv;IIIIIIIIIII)V",
      line = 1051
   )
   public static final void method2389(class544[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      label824:
      for(int var12 = 0; var12 < arg0.length; ++var12) {
         class544 var13 = arg0[var12];
         if (var13 != null && var13.field7968 == arg1) {
            int var14 = var13.field7948 + arg6;
            int var15 = var13.field7963 + arg7;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var13.field7920 == 2) {
               var16 = arg2;
               var17 = arg3;
               var18 = arg4;
               var19 = arg5;
            } else {
               int var20 = var13.field7986 + var14;
               int var21 = var13.field7954 + var15;
               if (var13.field7920 == 9) {
                  ++var20;
                  ++var21;
               }

               var16 = var14 > arg2 ? var14 : arg2;
               var17 = var15 > arg3 ? var15 : arg3;
               var18 = var20 < arg4 ? var20 : arg4;
               var19 = var21 < arg5 ? var21 : arg5;
            }

            if (var13.field7920 != 0 && !var13.field8024 && method2388(var13).field7097 == 0 && class741.field11002 != var13 && class565.field8429 != var13.field7994 && class429.field6550 != var13.field7994) {
               if (var16 < var18 && var17 < var19) {
                  class551.method4077(var13, true);
               }
            } else if (!method2379(var13)) {
               int var22 = 0;
               int var23 = 0;
               if (class446.field6785) {
                  var22 = class325.method2458(29461);
                  var23 = class319.method2421(true);
               }

               if (class331.field4741 == var13 && class581.method4280(true, class331.field4741) != null) {
                  class388.field5935 = true;
                  class137.field1781 = var14;
                  class751.field11118 = var15;
               }

               if (var13.field8082 || var16 < var18 && var17 < var19) {
                  if (var13.field8043 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     for(class662 var24 = (class662)class676.field10177.method4071((byte)126); var24 != null; var24 = (class662)class676.field10177.method4059((byte)-101)) {
                        if (var24.field9597) {
                           var24.method2720(0);
                           var24.field9589.field7923 = false;
                        }
                     }

                     if (class204.field2630 == 0) {
                        class331.field4741 = null;
                        class741.field11002 = null;
                     }

                     class298.field4257 = 0;
                     class247.field3250 = false;
                     class789.field11470 = false;
                     if (!class750.field11111) {
                        class495.method3666((byte)-48);
                     }
                  }

                  boolean var25;
                  if (class723.field10766.method368((byte)106) + var22 >= var16 && class723.field10766.method366(true) + var23 >= var17 && class723.field10766.method368((byte)106) + var22 < var18 && class723.field10766.method366(true) + var23 < var19) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  if (!class367.field5530 && var25) {
                     if (var13.field7943 >= 0) {
                        class444.field6754 = var13.field7943;
                     } else if (var13.field8043) {
                        class444.field6754 = -1;
                     }
                  }

                  if (!class750.field11111 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     class685.method4979(arg11 - var15, arg10 - var14, var13, true);
                  }

                  boolean var26 = false;
                  if (class723.field10766.method379(3) && var25) {
                     var26 = true;
                  }

                  boolean var27 = false;
                  class467 var28 = (class467)class356.field5394.method4071((byte)127);
                  if (var28 != null && var28.method3489((byte)79) == 0 && var28.method3490(107) + var22 >= var16 && var28.method3491(-5) + var23 >= var17 && var28.method3490(-111) + var22 < var18 && var28.method3491(-5) + var23 < var19) {
                     var27 = true;
                  }

                  if (var13.field7930 != null && !class89.method818(10)) {
                     for(int var29 = 0; var29 < var13.field7930.length; ++var29) {
                        if (!class597.field8785.method1535(var13.field7930[var29], (byte)-114)) {
                           if (var13.field8016 != null) {
                              var13.field8016[var29] = 0;
                           }
                        } else if (var13.field8016 == null || class314.field4488 >= var13.field8016[var29]) {
                           byte var30 = var13.field8046[var29];
                           if (var30 == 0 || ((var30 & 8) == 0 || !class597.field8785.method1535(86, (byte)-109) && !class597.field8785.method1535(82, (byte)-96) && !class597.field8785.method1535(81, (byte)-106)) && ((var30 & 2) == 0 || class597.field8785.method1535(86, (byte)-102)) && ((var30 & 1) == 0 || class597.field8785.method1535(82, (byte)-73)) && ((var30 & 4) == 0 || class597.field8785.method1535(81, (byte)-81))) {
                              if (var29 < 10) {
                                 class338.method2600("", var29 + 1, -1, var13.field8054, false);
                              } else if (var29 == 10) {
                                 class8.method76(30687);
                                 class478 var31 = method2388(var13);
                                 class400.method3068(var13, var31.field7103, 0, var31.method3546(-2220));
                                 class84.field1033 = class205.method1569((byte)-86, var13);
                                 if (class84.field1033 == null) {
                                    class84.field1033 = field4531[60];
                                 }

                                 class769.field11280 = var13.field8000 + field4531[59];
                              }

                              int var32 = var13.field8055[var29];
                              if (var13.field8016 == null) {
                                 var13.field8016 = new int[var13.field7930.length];
                              }

                              if (var32 != 0) {
                                 var13.field8016[var29] = class314.field4488 + var32;
                              } else {
                                 var13.field8016[var29] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if (var27) {
                     class355.method2772(6691, var13, var22 + var28.method3490(-85) - var14, var23 + var28.method3491(-5) - var15);
                  }

                  if (class331.field4741 != null && class331.field4741 != var13 && var25 && method2388(var13).method3542((byte)-111)) {
                     class416.field6361 = var13;
                  }

                  if (class741.field11002 == var13) {
                     class660.field9562 = true;
                     class49.field595 = var14;
                     class78.field978 = var15;
                  }

                  if (var13.field8024 || var13.field7994 != 0) {
                     if (var25 && class26.field287 != 0 && var13.field8052 != null) {
                        class662 var33 = new class662();
                        var33.field9597 = true;
                        var33.field9589 = var13;
                        var33.field9591 = class26.field287;
                        var33.field9595 = var13.field8052;
                        class676.field10177.method4060(23, var33);
                     }

                     if (class331.field4741 != null || class750.field11111 || class738.field10957 != var13.field7994 && class298.field4257 > 0) {
                        var27 = false;
                        var26 = false;
                        var25 = false;
                     }

                     if (var13.field7994 != 0) {
                        if (class365.field5471 == var13.field7994 || class442.field6741 == var13.field7994) {
                           class715.field10655 = var13;
                           if (class264.field3610 != null) {
                              class264.field3610.method2965(var13.field7954, (byte)126, class786.field11439);
                           }

                           if (class365.field5471 == var13.field7994) {
                              if (class750.field11111 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                 continue;
                              }

                              class641.method4608(0, class786.field11439, arg8, arg9);
                              class41 var34 = (class41)class742.field11009.method102(19230);

                              while(true) {
                                 if (var34 == null) {
                                    continue label824;
                                 }

                                 if (arg10 >= var34.field443 && arg10 < var34.field439 && arg11 >= var34.field447 && arg11 < var34.field440) {
                                    class495.method3666((byte)-48);
                                    class668.method4861(6, var34.field437);
                                 }

                                 var34 = (class41)class742.field11009.method95((byte)118);
                              }
                           }
                        }

                        if (class565.field8429 == var13.field7994) {
                           if (var13.method4025(15, class786.field11439) == null || class134.field1686 != 0 && class134.field1686 != 3 || class750.field11111 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                              continue;
                           }

                           int var35 = arg10 - var14;
                           int var36 = arg11 - var15;
                           int var37 = var13.field8026[var36];
                           if (var35 < var37 || var35 > var13.field7976[var36] + var37) {
                              continue;
                           }

                           int var38 = var35 - var13.field7986 / 2;
                           int var39 = var36 - var13.field7954 / 2;
                           int var40;
                           if (class675.field10142 == 4) {
                              var40 = (int)class56.field706 & 16383;
                           } else {
                              var40 = (int)class56.field706 + class241.field3071 & 16383;
                           }

                           int var41 = class689.field10389[var40];
                           int var42 = class689.field10391[var40];
                           if (class675.field10142 != 4) {
                              var41 = (class606.field8898 + 256) * var41 >> 8;
                              var42 = (class606.field8898 + 256) * var42 >> 8;
                           }

                           int var43 = var38 * var42 + var39 * var41 >> 14;
                           int var44 = var39 * var42 - var38 * var41 >> 14;
                           int var45;
                           int var46;
                           if (class675.field10142 == 4) {
                              var45 = (class537.field7853 >> 9) + (var43 >> 2);
                              var46 = (class650.field9486 >> 9) - (var44 >> 2);
                           } else {
                              int var47 = (class693.field10418.method3046(108) - 1) * 256;
                              var45 = (class693.field10418.field9003 - var47 >> 9) + (var43 >> 2);
                              var46 = (class693.field10418.field9007 - var47 >> 9) - (var44 >> 2);
                           }

                           if (class367.field5530 && (class427.field6529 & 64) != 0) {
                              class544 var48 = class241.method1793(-1, class200.field2500, class209.field2658);
                              if (var48 != null) {
                                 class466.method3485(class84.field1033, 57, var46, true, class30.field330, true, field4531[61], false, true, var13.field7969, (long)(var13.field8048 << 0 | var13.field8054), 1L, var45);
                              } else {
                                 class8.method76(30687);
                              }
                              continue;
                           }

                           if (class489.field7224 == class180.field2219) {
                              class466.method3485(class204.field2591.method1562((byte)-95, class728.field10827), 25, var46, true, -1, true, "", false, true, -1, 0L, 1L, var45);
                           }

                           class466.method3485(class187.field2341, 48, var46, true, class149.field1861, true, "", false, true, -1, 0L, 1L, var45);
                           continue;
                        }

                        if (class738.field10957 == var13.field7994) {
                           class468.field7009 = var13;
                           if (var25) {
                              class247.field3250 = true;
                           }

                           if (var27) {
                              int var49 = (int)((double)(var22 + var28.method3490(30) - var14 - var13.field7986 / 2) * 2.0D / (double)class329.field4678);
                              int var50 = (int)(-((double)(var23 + var28.method3491(-5) - var15 - var13.field7954 / 2) * 2.0D / (double)class329.field4678));
                              int var51 = class729.field10834 + var49 + class329.field4688;
                              int var52 = class670.field10075 + var50 + class329.field4696;
                              class440 var53 = class357.method2791(1);
                              if (var53 == null) {
                                 continue;
                              }

                              int[] var54 = new int[3];
                              var53.method3329(var54, var51, var52, (byte)19);
                              if (var54 != null) {
                                 if (class597.field8785.method1535(82, (byte)-82) && class445.field6773 > 0) {
                                    class30.method213(var54[2], -464686778, var54[0], var54[1]);
                                    continue;
                                 }

                                 class789.field11470 = true;
                                 class87.field1059 = var54[0];
                                 class282.field3921 = var54[1];
                                 class676.field10170 = var54[2];
                              }

                              class298.field4257 = 1;
                              class354.field5377 = false;
                              class430.field6583 = class723.field10766.method368((byte)106);
                              class64.field792 = class723.field10766.method366(true);
                              continue;
                           }

                           if (var26 && class298.field4257 > 0) {
                              if (class298.field4257 == 1 && (class430.field6583 != class723.field10766.method368((byte)106) || class64.field792 != class723.field10766.method366(true))) {
                                 class590.field8728 = class729.field10834;
                                 class646.field9395 = class670.field10075;
                                 class298.field4257 = 2;
                              }

                              if (class298.field4257 == 2) {
                                 class354.field5377 = true;
                                 class290.method2203(class590.field8728 + (int)((double)(class430.field6583 - class723.field10766.method368((byte)106)) * 2.0D / (double)class329.field4680), -1);
                                 class128.method1070(class646.field9395 - (int)((double)(class64.field792 - class723.field10766.method366(true)) * 2.0D / (double)class329.field4680), (byte)-55);
                              }
                              continue;
                           }

                           if (class298.field4257 > 0 && !class354.field5377) {
                              if ((class315.field4500 == 1 || class154.method1272(true)) && class354.field5375 > 2) {
                                 class328.method2470(21385, class430.field6583, class64.field792);
                              } else if (class352.method2749((byte)11)) {
                                 class328.method2470(21385, class430.field6583, class64.field792);
                              }
                           }

                           class298.field4257 = 0;
                           continue;
                        }

                        if (class162.field2043 == var13.field7994) {
                           if (var26) {
                              class197.method1504(6078, var22 + class723.field10766.method368((byte)106) - var14, var13.field7986, var13.field7954, var23 + class723.field10766.method366(true) - var15);
                           }
                           continue;
                        }

                        if (class429.field6550 == var13.field7994) {
                           class634.method4567(-126, var14, var13, var15);
                           continue;
                        }
                     }

                     if (!var13.field7984 && var27) {
                        var13.field7984 = true;
                        if (var13.field7922 != null) {
                           class662 var55 = new class662();
                           var55.field9597 = true;
                           var55.field9589 = var13;
                           var55.field9594 = var22 + var28.method3490(102) - var14;
                           var55.field9591 = var23 + var28.method3491(-5) - var15;
                           var55.field9595 = var13.field7922;
                           class676.field10177.method4060(23, var55);
                        }
                     }

                     if (var13.field7984 && var26 && var13.field8080 != null) {
                        class662 var56 = new class662();
                        var56.field9597 = true;
                        var56.field9589 = var13;
                        var56.field9594 = var22 + class723.field10766.method368((byte)106) - var14;
                        var56.field9591 = var23 + class723.field10766.method366(true) - var15;
                        var56.field9595 = var13.field8080;
                        class676.field10177.method4060(23, var56);
                     }

                     if (var13.field7984 && !var26) {
                        var13.field7984 = false;
                        if (var13.field8009 != null) {
                           class662 var57 = new class662();
                           var57.field9597 = true;
                           var57.field9589 = var13;
                           var57.field9594 = var22 + class723.field10766.method368((byte)106) - var14;
                           var57.field9591 = var23 + class723.field10766.method366(true) - var15;
                           var57.field9595 = var13.field8009;
                           class681.field10227.method4060(23, var57);
                        }
                     }

                     if (var26 && var13.field7941 != null) {
                        class662 var58 = new class662();
                        var58.field9597 = true;
                        var58.field9589 = var13;
                        var58.field9594 = var22 + class723.field10766.method368((byte)106) - var14;
                        var58.field9591 = var23 + class723.field10766.method366(true) - var15;
                        var58.field9595 = var13.field7941;
                        class676.field10177.method4060(23, var58);
                     }

                     if (!var13.field7923 && var25) {
                        var13.field7923 = true;
                        if (var13.field7934 != null) {
                           class662 var59 = new class662();
                           var59.field9597 = true;
                           var59.field9589 = var13;
                           var59.field9594 = var22 + class723.field10766.method368((byte)106) - var14;
                           var59.field9591 = var23 + class723.field10766.method366(true) - var15;
                           var59.field9595 = var13.field7934;
                           class676.field10177.method4060(23, var59);
                        }
                     }

                     if (var13.field7923 && var25 && var13.field7952 != null) {
                        class662 var60 = new class662();
                        var60.field9597 = true;
                        var60.field9589 = var13;
                        var60.field9594 = var22 + class723.field10766.method368((byte)106) - var14;
                        var60.field9591 = var23 + class723.field10766.method366(true) - var15;
                        var60.field9595 = var13.field7952;
                        class676.field10177.method4060(23, var60);
                     }

                     if (var13.field7923 && !var25) {
                        var13.field7923 = false;
                        if (var13.field8001 != null) {
                           class662 var61 = new class662();
                           var61.field9597 = true;
                           var61.field9589 = var13;
                           var61.field9594 = var22 + class723.field10766.method368((byte)106) - var14;
                           var61.field9591 = var23 + class723.field10766.method366(true) - var15;
                           var61.field9595 = var13.field8001;
                           class681.field10227.method4060(23, var61);
                        }
                     }

                     if (var13.field7957 != null) {
                        class662 var62 = new class662();
                        var62.field9589 = var13;
                        var62.field9595 = var13.field7957;
                        class787.field11448.method4060(23, var62);
                     }

                     if (var13.field7988 != null && class319.field4564 > var13.field7970) {
                        if (var13.field8012 != null && class319.field4564 - var13.field7970 <= 32) {
                           label711:
                           for(int var63 = var13.field7970; var63 < class319.field4564; ++var63) {
                              int var64 = class641.field9340[var63 & 31];

                              for(int var65 = 0; var65 < var13.field8012.length; ++var65) {
                                 if (var13.field8012[var65] == var64) {
                                    class662 var66 = new class662();
                                    var66.field9589 = var13;
                                    var66.field9595 = var13.field7988;
                                    class676.field10177.method4060(23, var66);
                                    break label711;
                                 }
                              }
                           }
                        } else {
                           class662 var67 = new class662();
                           var67.field9589 = var13;
                           var67.field9595 = var13.field7988;
                           class676.field10177.method4060(23, var67);
                        }

                        var13.field7970 = class319.field4564;
                     }

                     if (var13.field7955 != null && class308.field4376 > var13.field7933) {
                        if (var13.field8073 != null && class308.field4376 - var13.field7933 <= 32) {
                           label687:
                           for(int var68 = var13.field7933; var68 < class308.field4376; ++var68) {
                              int var69 = class274.field3825[var68 & 31];

                              for(int var70 = 0; var70 < var13.field8073.length; ++var70) {
                                 if (var13.field8073[var70] == var69) {
                                    class662 var71 = new class662();
                                    var71.field9589 = var13;
                                    var71.field9595 = var13.field7955;
                                    class676.field10177.method4060(23, var71);
                                    break label687;
                                 }
                              }
                           }
                        } else {
                           class662 var72 = new class662();
                           var72.field9589 = var13;
                           var72.field9595 = var13.field7955;
                           class676.field10177.method4060(23, var72);
                        }

                        var13.field7933 = class308.field4376;
                     }

                     if (var13.field7927 != null && class241.field3057 > var13.field7980) {
                        if (var13.field8003 != null && class241.field3057 - var13.field7980 <= 32) {
                           label663:
                           for(int var73 = var13.field7980; var73 < class241.field3057; ++var73) {
                              int var74 = class367.field5529[var73 & 31];

                              for(int var75 = 0; var75 < var13.field8003.length; ++var75) {
                                 if (var13.field8003[var75] == var74) {
                                    class662 var76 = new class662();
                                    var76.field9589 = var13;
                                    var76.field9595 = var13.field7927;
                                    class676.field10177.method4060(23, var76);
                                    break label663;
                                 }
                              }
                           }
                        } else {
                           class662 var77 = new class662();
                           var77.field9589 = var13;
                           var77.field9595 = var13.field7927;
                           class676.field10177.method4060(23, var77);
                        }

                        var13.field7980 = class241.field3057;
                     }

                     if (var13.field8083 != null && class327.field4652 > var13.field8071) {
                        if (var13.field8091 != null && class327.field4652 - var13.field8071 <= 32) {
                           label639:
                           for(int var78 = var13.field8071; var78 < class327.field4652; ++var78) {
                              int var79 = class457.field6931[var78 & 31];

                              for(int var80 = 0; var80 < var13.field8091.length; ++var80) {
                                 if (var13.field8091[var80] == var79) {
                                    class662 var81 = new class662();
                                    var81.field9589 = var13;
                                    var81.field9595 = var13.field8083;
                                    class676.field10177.method4060(23, var81);
                                    break label639;
                                 }
                              }
                           }
                        } else {
                           class662 var82 = new class662();
                           var82.field9589 = var13;
                           var82.field9595 = var13.field8083;
                           class676.field10177.method4060(23, var82);
                        }

                        var13.field8071 = class327.field4652;
                     }

                     if (var13.field7977 != null && class405.field6212 > var13.field7998) {
                        if (var13.field8051 != null && class405.field6212 - var13.field7998 <= 32) {
                           label615:
                           for(int var83 = var13.field7998; var83 < class405.field6212; ++var83) {
                              int var84 = class379.field5804[var83 & 31];

                              for(int var85 = 0; var85 < var13.field8051.length; ++var85) {
                                 if (var13.field8051[var85] == var84) {
                                    class662 var86 = new class662();
                                    var86.field9589 = var13;
                                    var86.field9595 = var13.field7977;
                                    class676.field10177.method4060(23, var86);
                                    break label615;
                                 }
                              }
                           }
                        } else {
                           class662 var87 = new class662();
                           var87.field9589 = var13;
                           var87.field9595 = var13.field7977;
                           class676.field10177.method4060(23, var87);
                        }

                        var13.field7998 = class405.field6212;
                     }

                     if (class553.field8200 > var13.field7940 && var13.field8014 != null) {
                        class662 var88 = new class662();
                        var88.field9589 = var13;
                        var88.field9595 = var13.field8014;
                        class676.field10177.method4060(23, var88);
                     }

                     if (class310.field4417 > var13.field7940 && var13.field8018 != null) {
                        class662 var89 = new class662();
                        var89.field9589 = var13;
                        var89.field9595 = var13.field8018;
                        class676.field10177.method4060(23, var89);
                     }

                     if (class623.field9083 > var13.field7940 && var13.field8064 != null) {
                        class662 var90 = new class662();
                        var90.field9589 = var13;
                        var90.field9595 = var13.field8064;
                        class676.field10177.method4060(23, var90);
                     }

                     if (class757.field11170 > var13.field7940 && var13.field7982 != null) {
                        class662 var91 = new class662();
                        var91.field9589 = var13;
                        var91.field9595 = var13.field7982;
                        class676.field10177.method4060(23, var91);
                     }

                     if (class50.field608 > var13.field7940 && var13.field8087 != null) {
                        class662 var92 = new class662();
                        var92.field9589 = var13;
                        var92.field9595 = var13.field8087;
                        class676.field10177.method4060(23, var92);
                     }

                     if (class757.field11168 > var13.field7940 && var13.field7926 != null) {
                        class662 var93 = new class662();
                        var93.field9589 = var13;
                        var93.field9595 = var13.field7926;
                        class676.field10177.method4060(23, var93);
                     }

                     if (class176.field2179 > var13.field7940 && var13.field8032 != null) {
                        class662 var94 = new class662();
                        var94.field9589 = var13;
                        var94.field9595 = var13.field8032;
                        class676.field10177.method4060(23, var94);
                     }

                     var13.field7940 = class456.field6922;
                     if (var13.field8092 != null) {
                        for(int var95 = 0; var95 < class123.field1494; ++var95) {
                           class662 var96 = new class662();
                           var96.field9589 = var13;
                           var96.field9590 = class348.field5290[var95].method959((byte)-112);
                           var96.field9586 = class348.field5290[var95].method958(22585);
                           var96.field9595 = var13.field8092;
                           class676.field10177.method4060(23, var96);
                        }
                     }

                     if (class784.field11427 && var13.field7961 != null) {
                        class662 var97 = new class662();
                        var97.field9589 = var13;
                        var97.field9595 = var13.field7961;
                        class676.field10177.method4060(23, var97);
                     }
                  }

                  if (var13.field7920 == 5 && var13.field8085 != -1) {
                     var13.method4036(class530.field7707, class127.field1526, (byte)-105).method2965(var13.field7954, (byte)50, class786.field11439);
                  }

                  class551.method4077(var13, true);
                  if (var13.field7920 == 0) {
                     method2389(arg0, var13.field8054, var16, var17, var18, var19, var14 - var13.field8060, var15 - var13.field7962, arg8, arg9, arg10, arg11);
                     if (var13.field8061 != null) {
                        method2389(var13.field8061, var13.field8054, var16, var17, var18, var19, var14 - var13.field8060, var15 - var13.field7962, arg8, arg9, arg10, arg11);
                     }

                     class624 var98 = (class624)class573.field8525.method5681((long)var13.field8054, -1);
                     if (var98 != null) {
                        if (class489.field7224 == class382.field5860 && var98.field9086 == 0 && !class750.field11111 && var25 && !class384.field5876) {
                           class495.method3666((byte)-48);
                        }

                        class221.method1681(var14, var18, arg11, arg10, var98.field9087, var16, var15, (byte)-49, arg8, arg9, var17, var19);
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Lhv;I)V",
      line = 1979
   )
   public static final void method2390(class544 arg0, int arg1) {
      try {
         ++field4525;
         if (arg1 != -15) {
            method2380((class544)null);
         }

         int var3;
         int var4;
         label25: {
            class544 var2 = class610.method4447(arg1 + 15193, arg0);
            if (var2 == null) {
               var3 = class207.field2647;
               var4 = class411.field6305;
               if (field4530 == 0) {
                  break label25;
               }
            }

            var3 = var2.field7986;
            var4 = var2.field7954;
         }

         class11.method91(arg0, var4, (byte)-128, var3, false);
         class358.method2798(var4, var3, arg0, 105);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4531[0] + (arg0 != null ? field4531[1] : field4531[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(I)V",
      line = 2007
   )
   public final void method2391(int arg0) {
      try {
         ++field4528;
         if (arg0 != -13580) {
            field4512 = true;
         }

         if (class261.field3566.field9464.method4225(94) == 2) {
            try {
               this.method2381(false);
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               class238.method1776(-15, var6, var6.getMessage() + field4531[3] + this.method2387(-14));
               class255.field3392 = true;
               class428.method3261(false, -127, 0);
            }
         } else {
            this.method2381(false);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4531[58] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "()V",
      line = 2034
   )
   public static final void method2392() {
      int var0 = class287.field4026;
      int[] var1 = class33.field372;
      int var2 = class261.field3566.field9432.method3125(127);
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      for(int var4 = 0; var4 < var0; ++var4) {
         class687 var14 = class661.field9578[var1[var4]];
         if (!var14.method5000((byte)113)) {
            var14.field6020 = -1;
         } else if (var14.field10341) {
            var14.field6020 = -1;
         } else {
            var14.method14(-44);
            if (var14.field10995 >= 0 && var14.field11000 >= 0 && var14.field10990 < class323.field4603 && var14.field10992 < class178.field2197) {
               var14.field10314 = var14.field6106 ? var3 : false;
               if (class693.field10418 == var14) {
                  var14.field6020 = Integer.MAX_VALUE;
               } else {
                  int var15 = 0;
                  if (!var14.field6025) {
                     ++var15;
                  }

                  if (var14.field6041 > class314.field4488) {
                     var15 += 2;
                  }

                  int var16 = var15 + (5 - var14.method3046(100) << 2);
                  if (!var14.field10318 && !var14.field10302) {
                     if (class365.field5489 == 0) {
                        var16 += 32;
                     } else {
                        var16 += 128;
                     }

                     var16 += 256;
                  } else {
                     var16 += 512;
                  }

                  var14.field6020 = var16 + 1;
               }
            } else {
               var14.field6020 = -1;
            }
         }
      }

      for(int var5 = 0; var5 < class159.field2021; ++var5) {
         class155 var11 = ((class726)class259.field3509.method5681((long)class115.field1381[var5], -1)).field10794;
         if (var11.method1277((byte)-99) && var11.field1971.method2869(class597.field8793, (byte)4)) {
            var11.method14(-38);
            if (var11.field10995 >= 0 && var11.field11000 >= 0 && var11.field10990 < class323.field4603 && var11.field10992 < class178.field2197) {
               int var12 = 0;
               if (!var11.field6025) {
                  ++var12;
               }

               if (var11.field6041 > class314.field4488) {
                  var12 += 2;
               }

               int var13 = var12 + (5 - var11.method3046(109) << 2);
               if (class365.field5489 == 0) {
                  if (var11.field1971.field5561) {
                     var13 += 64;
                  } else {
                     var13 += 128;
                  }
               } else if (class365.field5489 == 1) {
                  if (var11.field1971.field5561) {
                     var13 += 32;
                  } else {
                     var13 += 64;
                  }
               }

               if (var11.field1971.field5551) {
                  var13 += 1024;
               } else if (!var11.field1971.field5569) {
                  var13 += 256;
               }

               var11.field6020 = var13 + 1;
            } else {
               var11.field6020 = -1;
            }
         } else {
            var11.field6020 = -1;
         }
      }

      for(int var6 = 0; var6 < class594.field8758.length; ++var6) {
         class263 var7 = class594.field8758[var6];
         if (var7 != null) {
            if (var7.field3593 == 1) {
               class726 var8 = (class726)class259.field3509.method5681((long)var7.field3592, -1);
               if (var8 != null) {
                  class155 var9 = var8.field10794;
                  if (var9.field6020 >= 0) {
                     var9.field6020 += 2048;
                  }
               }
            } else if (var7.field3593 == 10) {
               class687 var10 = class661.field9578[var7.field3592];
               if (var10 != null && class693.field10418 != var10 && var10.field6020 >= 0) {
                  var10.field6020 += 2048;
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(B)V",
      line = 2208
   )
   public final synchronized void method2393(byte arg0) {
      try {
         int var2 = -88 / ((arg0 - 10) / 35);
         ++field4513;
         if (class238.field3003 != null && class769.field11271 == null && !class755.field11144.field10706) {
            try {
               Class var3 = class238.field3003.getClass();
               Field var4 = var3.getDeclaredField(field4531[93]);
               class769.field11271 = (Canvas)var4.get(class238.field3003);
               var4.set(class238.field3003, (Object)null);
               if (class769.field11271 != null) {
                  return;
               }
            } catch (Exception var6) {
            }
         }

         super.method2393((byte)84);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4531[94] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(Z)V",
      line = 2237
   )
   private final void method2394(boolean arg0) {
      try {
         ++field4527;
         boolean var2 = class481.field7144.method1937(0);
         if (!var2) {
            this.method2398((byte)124);
         }

         if (!arg0) {
            this.method2396(79);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4531[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "()V",
      line = 2254
   )
   public static final void method2395() {
      int var0 = class287.field4026;
      int[] var1 = class33.field372;
      int var2 = class100.field1230 ? var0 : class159.field2021 + var0;

      for(int var3 = 0; var3 < var2; ++var3) {
         class397 var4;
         if (var3 < var0) {
            var4 = class661.field9578[var1[var3]];
         } else {
            var4 = ((class726)class259.field3509.method5681((long)class115.field1381[var3 - var0], -1)).field10794;
         }

         if (var4.field6020 >= 0) {
            int var5 = var4.method3046(-101);
            if ((var5 & 1) == 0) {
               if ((var4.field9003 & 511) == 0 && (var4.field9007 & 511) == 0) {
                  continue;
               }
            } else if ((var4.field9003 & 511) == 256 && (var4.field9007 & 511) == 256) {
               continue;
            }

            var4.field8998 = class368.method2858(var4.field9007, (byte)-11, var4.field9003, var4.field9010);
            class117.method978(var4, true);
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(I)V",
      line = 2295
   )
   public final void method2396(int arg0) {
      try {
         ++field4516;
         class716.method5182((byte)-10);
         class403.method3098((byte)-104);
         class204.method1564(-30583);
         class54.method425(1);
         class668.method4860((byte)-127);
         class301.method2293((byte)73);
         class442.method3346(-327767576);
         class471.method3511(true);
         class499.method3727((byte)-89);
         class356.method2783(arg0 ^ -390);
         class553.method4092(127);
         class545.method4041(4);
         class524.method3862(-1);
         class70.method694(arg0 ^ -19287);
         class712.method5160(arg0 + -430);
         class791.method5678(true);
         class410.method3137(-51);
         class324.method2446(1339971298);
         class436.method3307(0);
         class66.method650((byte)-33);
         class633.method4554(-16674);
         class263.method1996(true);
         class152.method1250((byte)121);
         class550.method4067(-16080);
         class256.method1935(false);
         class270.method2085(2);
         class646.method4660((byte)-80);
         class536.method3969(0);
         class332.method2521(true);
         class748.method5457(true);
         class219.method1656(-52);
         class532.method3945(95);
         class724.method5251(-49);
         class276.method2124(arg0 + -397);
         class264.method2003((byte)127);
         class420.method3205((byte)78);
         class427.method3253((byte)87);
         class699.method5067((byte)114);
         class432.method3290(4);
         class561.method4152(true);
         class222.method1685(arg0 + 24787);
         class417.method3187(arg0 ^ -403);
         class259.method1960(arg0 ^ -404);
         class466.method3486(14977);
         class491.method3639(2069);
         class674.method4917((byte)-68);
         class48.method384((byte)-93);
         class538.method3991((byte)-126);
         class325.method2453((byte)125);
         class196.method1498(true);
         class221.method1680(32767);
         class726.method5261(0);
         class214.method1620(-1378109744);
         class128.method1087(arg0 + -11437);
         class634.method4565(arg0 ^ -16334);
         class520.method3831((byte)40);
         class101.method884(-124);
         class399.method3065(arg0 ^ -49706612);
         class739.method5381(false);
         class440.method3326(-1);
         class386.method2966(arg0 ^ 510);
         class14.method104(arg0 + -511);
         class544.method4022(true);
         class625.method4511(12288);
         class687.method4998((byte)81);
         class234.method1753(false);
         class212.method1604(1);
         class244.method1821((byte)90);
         class275.method2118(arg0 + -519);
         class180.method1414(11317);
         class397.method3053(123);
         class72.method715((byte)-68);
         class751.method5471(-96);
         class624.method4506((byte)59);
         class478.method3550((byte)-76);
         class175.method1390(-4221);
         class492.method3644(-27997);
         class205.method1570(arg0 ^ 419);
         class525.method3867(-128);
         class604.method4415((byte)-80);
         class217.method1641(126);
         class188.method1463((byte)115);
         class384.method2952(24);
         class6.method53(false);
         class746.method5433(1);
         class693.method5035(true);
         class503.method3749(37);
         class236.method1768((byte)54);
         class111.method947(arg0 ^ 10852);
         class279.method2143(false);
         class773.method5573(0);
         class131.method1126(arg0 ^ 469);
         class258.method1953(121);
         class441.method3340((byte)48);
         class676.method4931(arg0 ^ 65024);
         class497.method3707(0);
         class306.method2318((byte)108);
         class284.method2168((byte)123);
         class126.method1031(true);
         class732.method5323(-386);
         class474.method3525(-3);
         class557.method4123(960);
         class134.method1150((byte)-69);
         class630.method4541(32);
         class293.method2234(arg0 + -11496);
         class661.method4745(arg0 + -512);
         class369.method2864((byte)105);
         class91.method838((byte)-32);
         class67.method673(-31816);
         class438.method3316((byte)-69);
         class8.method75(true);
         class530.method3924(true);
         class122.method1009((byte)-115);
         class139.method1179(121);
         class428.method3264(true);
         class715.method5179(1);
         class409.method3122((byte)-83);
         class230.method1736(arg0 ^ 429);
         class178.method1405((byte)55);
         class731.method5318((byte)121);
         class252.method1902(arg0 + 27513);
         class314.method2367(0);
         class570.method4222(arg0 + -507);
         class749.method5465(true);
         class320.method2427(arg0 + -404);
         class787.method5650(65535);
         class353.method2755(-3);
         class637.method4585(-11973);
         class154.method1274(28618);
         class197.method1503((byte)126);
         class465.method3475(true);
         class110.method942(arg0 + -495);
         class280.method2146((byte)-71);
         class434.method3302(arg0 + -392);
         class763.method5533(0);
         class127.method1034(83);
         class744.method5417(-73);
         class767.method5553(61);
         class741.method5400(0);
         class616.method4471(arg0 ^ -512);
         class55.method435((byte)-14);
         class157.method1300(96);
         class265.method2020();
         class269.method2078((byte)-62);
         class102.method891((byte)109);
         class189.method1466(true);
         class555.method4102(96);
         class213.method1616((byte)-19);
         class430.method3278(arg0 ^ -18415);
         class610.method4443(-1065556191);
         class26.method186(false);
         class9.method82(121);
         class444.method3357(true);
         class32.method225(true);
         class172.method1381(-120);
         class387.method2969(true);
         class136.method1160(19722);
         class15.method110((byte)-117);
         class462.method3459(77);
         class23.method152(102);
         class307.method2324(80);
         class29.method204(15844);
         class132.method1132(-16);
         class329.method2482();
         class394.method3008((byte)-93);
         class470.method3502(-123);
         class506.method3754((byte)101);
         class786.method5644((byte)-123);
         class374.method2901(arg0 + -511);
         class117.method979(-101);
         class96.method850(arg0 ^ 261);
         class647.method4670(-23720);
         class590.method4342(-125);
         class688.method5008(49);
         class710.method5147(94);
         class185.method1441((byte)-101);
         class677.method4943(4484);
         class784.method5633((byte)-75);
         class737.method5369();
         class283.method2163(110);
         class669.method4865((byte)-122);
         class642.method4613(arg0 ^ 511);
         class377.method2913((byte)-30);
         class740.method5396(118);
         class519.method3825((byte)-104);
         class123.method1016(-112);
         class144.method1199((byte)-48);
         class446.method3369(false);
         class426.method3245((byte)-128);
         class464.method3468();
         class785.method5641(arg0 + -513);
         class658.method4731(0);
         class680.method4958((byte)115);
         class472.method3515((byte)127);
         class662.method4751((byte)-126);
         class40.method276(0);
         class659.method4737(0);
         class31.method221(1);
         class76.method738(-1);
         class33.method233((byte)-83);
         if (arg0 == 511) {
            class400.method3075(false);
            class249.method1885(false);
            class742.method5407((byte)56);
            class411.method3143(arg0 + -10119);
            class707.method5135(-98);
            class389.method2988(7729);
            class193.method1485((byte)67);
            class414.method3160();
            class299.method2285((byte)-60);
            class57.method477(arg0 + -511);
            class556.method4120(-92);
            class585.method4326((byte)-117);
            class121.method1007();
            class623.method4500(false);
            class330.method2509(-6);
            class789.method5662(false);
            class5.method45(-21104);
            class80.method754(false);
            class552.method4082(21144);
            class116.method968();
            class455.method3425(-1);
            class757.method5498(-92);
            class165.method1340(true);
            class468.method3499((byte)105);
            class261.method1985((byte)-125);
            class274.method2112(false);
            class564.method4178(arg0 ^ -512);
            class678.method4951(false);
            class187.method1456((byte)100);
            class622.method4495((byte)109);
            class574.method4245(arg0 + -622);
            class457.method3435(115);
            class431.method3284(true);
            class401.method3080((byte)86);
            class243.method1806(-2);
            class344.method2699(arg0 + 1984333673);
            class225.method1702(4293);
            class626.method4515((byte)50);
            class779.method5611((byte)-58);
            class691.method5028(0);
            class643.method4620(-124);
            class518.method3821((byte)4);
            class352.method2751(-27501);
            class458.method3444((byte)-12);
            class292.method2229(false);
            class170.method1368(52);
            class41.method282(-59);
            class1.method9(-1);
            class793.method5698(-1);
            class237.method1770(-84);
            class167.method1350((byte)86);
            class605.method4418((byte)-119);
            class296.method2253(arg0 + -609);
            class496.method3696(arg0 ^ 511);
            class208.method1586(true);
            class777.method5596(2);
            class135.method1155((byte)-117);
            class628.method4527(arg0 + -511);
            class365.method2834(109);
            class568.method4206(-1);
            class718.method5192(0);
            class451.method3398((byte)-87);
            class74.method725(-575021495);
            class412.method3148((byte)-103);
            class339.method2691(0);
            class47.method378(46);
            class79.method749((byte)93);
            class73.method719(-122);
            class607.method4427((byte)125);
            class317.method2410((byte)-116);
            class448.method3379(-115);
            class158.method1312(0);
            class281.method2151((byte)-128);
            class709.method5140(-12602);
            class665.method4764(0);
            class450.method3392(1);
            class576.method4257(arg0 + -456);
            class183.method1436(false);
            class402.method3089(114);
            class327.method2466(1206427460);
            class248.method1874((byte)-95);
            class752.method5477((byte)-107);
            class571.method4232((byte)-29);
            class759.method5505(0);
            class537.method3984((byte)117);
            class778.method5604(-31328);
            class246.method1839(74);
            class745.method5430(128);
            class345.method2706((byte)122);
            class705.method5126(16105);
            class326.method2461((byte)-3);
            class547.method4049(-5601);
            class629.method4531((byte)-85);
            class87.method804(54);
            class65.method531(123);
            class608.method4436();
            class46.method361(arg0 ^ 505);
            class300.method2290(-22304);
            class88.method808(7);
            class309.method2331(true);
            class137.method1171(0);
            class45.method356(arg0 ^ 394);
            class312.method2354((byte)-84);
            class75.method735(-1);
            class201.method1547((byte)102);
            class449.method3383(16957);
            class10.method87(78);
            class224.method1698(1);
            class554.method4096(false);
            class49.method393((byte)-61);
            class351.method2742(3);
            class673.method4905();
            class614.method4466(arg0 + -612);
            class360.method2808((byte)-83);
            class375.method2908();
            class211.method1600();
            class164.method1337(false);
            class602.method4399();
            class18.method124(-2);
            class755.method5486(-12066);
            class761.method5513((byte)-113);
            class302.method2298(arg0 ^ -512);
            class346.method2712(arg0 + -512);
            class288.method2194(0);
            class151.method1240(-105);
            class594.method4360(8);
            class660.method4740(-119);
            class235.method1764(3);
            class551.method4075((byte)-106);
            class11.method92(-127);
            class64.method528(arg0 ^ -416);
            class370.method2882((byte)90);
            class543.method4010(-13622);
            class641.method4609(59);
            class597.method4371(arg0 ^ -21548);
            class682.method4969(2852);
            class656.method4717(arg0 + -420);
            class388.method2982(2671);
            class717.method5185(arg0 + -400);
            class231.method1742((byte)115);
            class493.method3654();
            class603.method4408((byte)-126);
            class350.method2738((byte)62);
            class611.method4452(arg0 ^ 449);
            class238.method1775((byte)-49);
            class63.method521((byte)-126);
            class190.method1475(arg0 ^ -2813);
            class456.method3430((byte)-21);
            class453.method3411((byte)-120);
            class171.method1375((byte)117);
            class743.method5411((byte)-128);
            class522.method3847((byte)55);
            class34.method238((byte)120);
            class149.method1225((byte)-123);
            class159.method1317((byte)3);
            class593.method4356((byte)99);
            class199.method1517(arg0 + -5197);
            class667.method4826(4617);
            class36.method248(52);
            class734.method5337(false);
            class30.method212(arg0 + -630);
            class638.method4592((byte)-39);
            class105.method897((byte)-46);
            class689.method5016(15589);
            class251.method1892(true);
            class596.method4368((byte)74);
            class247.method1854(-25263);
            class380.method2938((byte)122);
            class764.method5538(-112);
            class355.method2773((byte)123);
            class697.method5059(false);
            class513.method3808(arg0 ^ -409);
            class482.method3577(-119);
            class776.method5590(arg0 + 23917);
            class358.method2795(91);
            class681.method4962(-123);
            class331.method2514(0);
            class408.method3118(arg0 + -598);
            class186.method1452(arg0 ^ -17884);
            class163.method1334(70);
            class298.method2278(587751470);
            class579.method4270(124);
            class173.method1385(2);
            class713.method5167((byte)-56);
            class354.method2766((byte)67);
            class583.method4300(109);
            class379.method2929((byte)21);
            class534.method3959(false);
            class28.method198();
            class368.method2855(false);
            class421.method3211(arg0 + -419);
            class762.method5518(94);
            class489.method3627(arg0 ^ -2081);
            class433.method3297(arg0 + -509);
            class182.method1429(4096);
            class71.method704((byte)93);
            class50.method402(-122);
            class459.method3447((byte)-74);
            class770.method5568(arg0 + -484);
            class704.method5122((byte)96);
            class563.method4166((byte)-122);
            class601.method4393(-377);
            class573.method4242(arg0 + 3585);
            class541.method4003((byte)75);
            class747.method5442(false);
            class569.method4218(arg0 ^ 1047858);
            class507.method3760(82);
            class672.method4896((byte)-86);
            class587.method4331(0);
            class405.method3109(-72);
            class140.method1185(-15028);
            class278.method2138((byte)41);
            class790.method5668(50);
            class416.method3182(-18166);
            class685.method4977(-1913378432);
            class589.method4339(0);
            class42.method289((byte)-102);
            class240.method1788(-2461);
            class273.method2105((byte)-86);
            class272.method2100(0);
            class266.method2031(arg0 + 27800);
            class632.method4551();
            class85.method796(-77);
            class645.method4655(false);
            class425.method3231(67);
            class109.method939(-9);
            class177.method1400(21808);
            class2.method25(true);
            class367.method2850((byte)-45);
            class150.method1233(arg0 ^ -22297);
            class318.method2416(33);
            class663.method4757(-578913695);
            class323.method2442(false);
            class483.method3590(0);
            class529.method3915(1);
            class262.method1989((byte)-110);
            class242.method1799(false);
            class277.method2133(arg0 + -474);
            class613.method4460(arg0 ^ 507);
            class290.method2204((byte)88);
            class311.method2348(0);
            class364.method2827(56);
            class639.method4600(true);
            class393.method3003((byte)92);
            class357.method2790(arg0 ^ 509);
            class115.method961(-117);
            class487.method3612((byte)-95);
            class119.method993((byte)-120);
            class334.method2531((byte)98);
            class362.method2820(-64);
            class753.method5483(0);
            class100.method880((byte)87);
            class695.method5049(3);
            class500.method3733((byte)21);
            class16.method114(true);
            class232.method1748((byte)87);
            class515.method3814(10);
            class336.method2545((byte)-99);
            class595.method4364(true);
            class241.method1795(arg0 ^ 510);
            class481.method3569(false);
            class289.method2198((byte)-125);
            class179.method1410((byte)58);
            class486.method3604(64);
            class490.method3631(58);
            class366.method2842(false);
            class125.method1026(-26);
            class322.method2435(29036);
            class260.method1966(-2143);
            class69.method690((byte)-76);
            class192.method1479((byte)-54);
            class792.method5690(-2614);
            class124.method1021(-56);
            class68.method684(16395);
            class286.method2179((byte)114);
            class130.method1112(20866);
            class198.method1509(124);
            class313.method2358((byte)73);
            class723.method5247(arg0 ^ -434);
            class348.method2727((byte)50);
            class413.method3151(arg0 ^ -2147483137);
            class61.method507((byte)-117);
            class703.method5116(55);
            class447.method3374(true);
            class501.method3740((byte)-3);
            class690.method5025((byte)116);
            class437.method3311((byte)-111);
            class112.method951(false);
            class706.method5130(-118);
            class766.method5548((byte)120);
            class37.method256(-14894);
            class89.method815((byte)-74);
            class539.method3999(true);
            class521.method3843(0);
            class619.method4477((byte)11);
            class169.method1361(-1);
            class181.method1424(3);
            class711.method5154((byte)92);
            class670.method4871(1);
            class429.method3268((byte)86);
            class97.method854((byte)-121);
            class372.method2890(arg0 ^ 2559);
            class467.method3495((byte)-89);
            class664.method4761(arg0 + 23559);
            class407.method3114(0);
            class729.method5313((byte)-42);
            class473.method3519((byte)73);
            class768.method5558(71);
            class443.method3351(8);
            class310.method2343(false);
            class488.method3618(arg0 ^ 511);
            class303.method2304(-2001);
            class207.method1581(8336);
            class147.method1214(-123);
            class651.method4698(false);
            class675.method4927(true);
            class84.method792((byte)47);
            class650.method4688(arg0 + -495);
            class599.method4383(90);
            class774.method5577(-120);
            class382.method2941((byte)-84);
            class580.method4273(arg0 ^ -512);
            class62.method515(24416);
            class226.method1710(arg0 ^ -12250);
            class321.method2432(-1);
            class769.method5564(20);
            class686.method4985(arg0 + 11760);
            class239.method1783(-28831);
            class271.method2094(arg0 ^ 1535);
            class106.method918(98);
            class653.method4704(-73);
            class788.method5653(true);
            class635.method4574(-16711936);
            class104.method894(-29092);
            class783.method5628(-123);
            class591.method4347(-105);
            class161.method1325(0);
            class3.method34(107);
            class498.method3714(78);
            class335.method2538(arg0 + -511);
            class535.method3963((byte)-102);
            class728.method5304(19887);
            class781.method5619(2);
            class618.method4474((byte)116);
            class349.method2730(arg0 + -381);
            class257.method1949(arg0 + 10637);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4531[88] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "()V",
      line = 2853
   )
   public static final void method2397() {
      class127.field1527 = 0;

      for(int var0 = 0; var0 < class159.field2021; ++var0) {
         class155 var1 = ((class726)class259.field3509.method5681((long)class115.field1381[var0], -1)).field10794;
         if (var1.field6025 && var1.method1280(-1) != -1) {
            int var2 = (var1.method3046(-35) - 1) * 256 + 252;
            int var3 = var1.field9003 - var2 >> 9;
            int var4 = var1.field9007 - var2 >> 9;
            class397 var5 = class541.method4005(109, var4, var1.field9010, var3);
            if (var5 != null) {
               int var6 = var5.field6027;
               if (var5 instanceof class155) {
                  var6 += 2048;
               }

               if (var5.field6108 == 0 && var5.method1280(-1) != -1) {
                  class284.field3998[class127.field1527] = var6;
                  class69.field866[class127.field1527] = var6;
                  ++class127.field1527;
                  ++var5.field6108;
               }

               class284.field3998[class127.field1527] = var6;
               class69.field866[class127.field1527] = var1.field6027 + 2048;
               ++class127.field1527;
               ++var5.field6108;
            }
         }
      }

      class331.method2513(class69.field866, 0, class127.field1527 - 1, class284.field3998, 0);
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(B)V",
      line = 2901
   )
   private final void method2398(byte arg0) {
      int var2 = field4530;

      try {
         ++field4520;
         if (class154.field1940 < class481.field7144.field3476) {
            class351.field5344.method5034(3455);
            class536.field7826 = (class481.field7144.field3476 * 50 + -50) * 5;
            if (class536.field7826 > 3000) {
               class536.field7826 = 3000;
            }

            if (~class481.field7144.field3476 <= -3 && class481.field7144.field3475 == 6) {
               this.method3130(true, field4531[41]);
               class672.field10112 = 14;
               return;
            }

            if (class481.field7144.field3476 >= 4 && ~class481.field7144.field3475 == 0) {
               this.method3130(true, field4531[40]);
               class672.field10112 = 14;
               return;
            }

            if (~class481.field7144.field3476 <= -5 && class525.method3871(class672.field10112, 0)) {
               label116: {
                  if (~class481.field7144.field3475 != -8 && ~class481.field7144.field3475 != -10) {
                     if (class481.field7144.field3475 <= 0) {
                        this.method3130(true, field4531[39]);
                        if (var2 == 0) {
                           break label116;
                        }
                     }

                     if (class67.field842 == null) {
                        this.method3130(true, field4531[36]);
                        if (var2 == 0) {
                           break label116;
                        }
                     }

                     this.method3130(true, field4531[37] + class67.field842.trim());
                     if (var2 == 0) {
                        break label116;
                     }
                  }

                  this.method3130(true, field4531[38]);
               }

               class672.field10112 = 14;
               return;
            }
         }

         class154.field1940 = class481.field7144.field3476;
         int var3 = 81 % ((arg0 - -8) / 63);
         if (class536.field7826 > 0) {
            --class536.field7826;
         } else {
            try {
               if (~class501.field7454 == -1) {
                  class682.field10238 = class351.field5344.method5036(class755.field11144, 443);
                  ++class501.field7454;
               }

               if (~class501.field7454 == -2) {
                  if (~class682.field10238.field159 == -3) {
                     if (class682.field10238.field160 != null) {
                        class67.field842 = (String)class682.field10238.field160;
                     }

                     this.method2386(1000, (byte)126);
                     return;
                  }

                  if (~class682.field10238.field159 == -2) {
                     ++class501.field7454;
                  }
               }

               if (~class501.field7454 == -3) {
                  class180.field2222 = new class424((Socket)class682.field10238.field160, class755.field11144, 25000);
                  class128 var4 = new class128(5);
                  var4.method1085(class185.field2297.field11435, (byte)-11);
                  var4.method1094(-120, 651);
                  class180.field2222.method3226(var4.field1552, 5, 0, 1);
                  ++class501.field7454;
                  class745.field11048 = class188.method1462(true);
               }

               if (~class501.field7454 == -4) {
                  if (!class525.method3871(class672.field10112, 0) && ~class180.field2222.method3223(0) >= -1) {
                     if (~(-class745.field11048 + class188.method1462(true)) < -30001L) {
                        this.method2386(1001, (byte)125);
                        return;
                     }
                  } else {
                     int var5 = class180.field2222.method3220(0);
                     if (~var5 != -1) {
                        this.method2386(var5, (byte)123);
                        return;
                     }

                     ++class501.field7454;
                  }
               }

               if (class501.field7454 == 4) {
                  boolean var6 = class525.method3871(class672.field10112, 0) || class766.method5543((byte)-80, class672.field10112) || class677.method4944(class672.field10112, 0);
                  class471[] var7 = class471.method3508(false);
                  class128 var8 = new class128(var7.length * 4);
                  class180.field2222.method3219(-455, 0, var8.field1552, var8.field1552.length);
                  int var9 = 0;
                  if (var2 != 0) {
                     var7[var9].method3505(var8.method1041(4758), true);
                     ++var9;
                  }

                  while(true) {
                     while(var9 < var7.length) {
                        var7[var9].method3505(var8.method1041(4758), true);
                        ++var9;
                     }

                     if (var2 == 0) {
                        class481.field7144.method1932(class180.field2222, !var6, true);
                        class180.field2222 = null;
                        class501.field7454 = 0;
                        class682.field10238 = null;
                        return;
                     }

                     ++var9;
                  }
               }
            } catch (IOException var11) {
               this.method2386(1002, (byte)124);
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field4531[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(I)V",
      line = 3067
   )
   public final void method2399(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(B)V",
      line = 3193
   )
   private final void method2400(byte arg0) {
      int var2 = field4530;

      try {
         ++field4514;
         if (class672.field10112 != 14) {
            long var3 = class109.method937((byte)43) / 1000000L + -class626.field9101;
            class626.field9101 = class109.method937((byte)43) / 1000000L;
            boolean var5 = class41.method285(-31165);
            if (var5 && class107.field1306 && class336.field4807 != null) {
               class336.field4807.method1664((byte)-27);
            }

            int var6 = -37 % ((48 - arg0) / 32);
            if (class157.method1301(124, class672.field10112)) {
               label363: {
                  if (class739.field10980 != 0L && ~class739.field10980 > ~class188.method1462(true)) {
                     class734.method5339(57, class241.field3070, class694.method5042(true), class581.field8597, false);
                     if (var2 == 0) {
                        break label363;
                     }
                  }

                  if (!class786.field11439.method644() && class618.field9022) {
                     class64.method525(false);
                  }
               }
            }

            if (class628.field9136 == null) {
               Container var7;
               label373: {
                  if (class691.field10404 != null) {
                     var7 = class691.field10404;
                     if (var2 == 0) {
                        break label373;
                     }
                  }

                  if (class238.field3003 == null) {
                     var7 = class754.field11141;
                     if (var2 == 0) {
                        break label373;
                     }
                  }

                  var7 = class238.field3003;
               }

               int var8 = var7.getSize().width;
               int var9 = var7.getSize().height;
               if (class691.field10404 == var7) {
                  Insets var10 = class691.field10404.getInsets();
                  var8 -= var10.right + var10.left;
                  var9 -= var10.top + var10.bottom;
               }

               if (class88.field1075 != var8 || class332.field4758 != var9 || class352.field5349) {
                  label387: {
                     if (class786.field11439 == null || class786.field11439.method573()) {
                        class280.method2147(false);
                        if (var2 == 0) {
                           break label387;
                        }
                     }

                     class332.field4758 = var9;
                     class88.field1075 = var8;
                  }

                  class739.field10980 = 500L + class188.method1462(true);
                  class352.field5349 = false;
               }
            }

            if (class628.field9136 != null && !class618.field9024 && class157.method1301(124, class672.field10112)) {
               class734.method5339(116, -1, class261.field3566.field9448.method4352(99), -1, false);
            }

            boolean var11 = false;
            if (class524.field7601) {
               var11 = true;
               class524.field7601 = false;
            }

            if (var11) {
               class415.method3172(-1);
            }

            if (class786.field11439 != null && class786.field11439.method644() || class694.method5042(true) != 1) {
               class491.method3635((byte)-19);
            }

            label321: {
               if (!class525.method3871(class672.field10112, 0)) {
                  if (class411.method3144(class672.field10112, -4)) {
                     class778.method5602((byte)0);
                     if (var2 == 0) {
                        break label321;
                     }
                  }

                  if (class407.method3112(class672.field10112, (byte)114)) {
                     class778.method5602((byte)0);
                     if (var2 == 0) {
                        break label321;
                     }
                  }

                  if (class117.method980(-81, class672.field10112)) {
                     if (~class767.field11252 != -2) {
                        if (class767.field11252 != 2) {
                           class183.method1433(class288.field4045, class786.field11439, 0, true, class417.field6389, class204.field2576.method1562((byte)-74, class728.field10827));
                           if (var2 == 0) {
                              break label321;
                           }
                        }

                        if (~class574.field8549 > ~class69.field873) {
                           class574.field8549 = class69.field873;
                        }

                        int var12 = (-class69.field873 + class574.field8549) * 50 / class574.field8549 + 50;
                        class183.method1433(class288.field4045, class786.field11439, 0, true, class417.field6389, class204.field2576.method1562((byte)-91, class728.field10827) + field4531[7] + var12 + field4531[4]);
                        if (var2 == 0) {
                           break label321;
                        }
                     }

                     if (class787.field11449 < class573.field8529) {
                        class787.field11449 = class573.field8529;
                     }

                     int var13 = (-class573.field8529 + class787.field11449) * 50 / class787.field11449;
                     class183.method1433(class288.field4045, class786.field11439, 0, true, class417.field6389, class204.field2576.method1562((byte)-107, class728.field10827) + field4531[7] + var13 + field4531[4]);
                     if (var2 == 0) {
                        break label321;
                     }
                  }

                  if (~class672.field10112 != -11) {
                     if (class672.field10112 != 13) {
                        break label321;
                     }

                     class183.method1433(class288.field4045, class786.field11439, 0, false, class417.field6389, class204.field2578.method1562((byte)-113, class728.field10827) + field4531[5] + class204.field2579.method1562((byte)-86, class728.field10827));
                     if (var2 == 0) {
                        break label321;
                     }
                  }

                  class144.method1200(var3, 10);
                  if (var2 == 0) {
                     break label321;
                  }
               }

               class443.method3352((byte)108, var11);
            }

            if (~class67.field829 == -4) {
               int var14 = 0;
               if (var2 != 0 || class117.field1428 > var14) {
                  do {
                     Rectangle var15 = class521.field7579[var14];
                     if (class482.field7157[var14]) {
                        class786.field11439.method637(var15.x, var15.width, -65281, var15.y, 1, var15.height);
                        if (var2 == 0) {
                           ++var14;
                           continue;
                        }
                     }

                     if (class446.field6781[var14]) {
                        class786.field11439.method637(var15.x, var15.width, -65536, var15.y, 1, var15.height);
                        if (var2 == 0) {
                           ++var14;
                           continue;
                        }
                     }

                     class786.field11439.method637(var15.x, var15.width, -16711936, var15.y, 1, var15.height);
                     ++var14;
                  } while(class117.field1428 > var14);
               }
            }

            if (class89.method818(10)) {
               class36.method250((byte)-128, class786.field11439);
            }

            label391: {
               if (!class755.field11144.field10706 || !class157.method1301(98, class672.field10112) || class67.field829 != 0 || ~class694.method5042(true) != -2 || var11) {
                  if (class525.method3871(class672.field10112, 0)) {
                     break label391;
                  }

                  int var16 = 0;
                  if (var2 != 0) {
                     class446.field6781[var16] = false;
                     ++var16;
                  }

                  while(true) {
                     while(~class117.field1428 < ~var16) {
                        class446.field6781[var16] = false;
                        ++var16;
                     }

                     try {
                        if (var2 == 0) {
                           if (class446.field6785) {
                              class212.method1606(8);
                              if (var2 == 0) {
                                 break label391;
                              }
                           }

                           class786.field11439.method617((byte)52);
                           break label391;
                        }
                     } catch (class280 var23) {
                        class238.method1776(-113, var23, var23.getMessage() + field4531[3] + this.method2387(-41));
                        class428.method3261(false, -122, 0);
                        if (var2 == 0) {
                           break label391;
                        }
                        break;
                     }

                     ++var16;
                  }
               }

               int var18 = 0;
               int var19 = 0;
               if (var2 != 0) {
                  if (class446.field6781[var19]) {
                     class446.field6781[var19] = false;
                     class713.field10635[var18++] = class521.field7579[var19];
                  }

                  ++var19;
               }

               while(true) {
                  boolean var10000;
                  if (class117.field1428 <= var19) {
                     try {
                        var10000 = class446.field6785;
                        if (var2 == 0) {
                           if (!var10000) {
                              class786.field11439.method619(class713.field10635, -113, var18);
                              if (var2 == 0) {
                                 break;
                              }
                           }

                           class434.method3300(2, var18, class713.field10635);
                           break;
                        }
                     } catch (class280 var22) {
                        break;
                     }
                  } else {
                     var10000 = class446.field6781[var19];
                  }

                  if (var10000) {
                     class446.field6781[var19] = false;
                     class713.field10635[var18++] = class521.field7579[var19];
                  }

                  ++var19;
               }
            }

            label384: {
               class606.method4423(256);
               int var20 = class261.field3566.field9433.method5647(97);
               if (var20 == 0) {
                  class89.method817(15L, 2535);
                  if (var2 == 0) {
                     break label384;
                  }
               }

               if (var20 == 1) {
                  class89.method817(10L, 2535);
                  if (var2 == 0) {
                     break label384;
                  }
               }

               if (~var20 == -3) {
                  class89.method817(5L, 2535);
                  if (var2 == 0) {
                     break label384;
                  }
               }

               if (var20 == 3) {
                  class89.method817(2L, 2535);
               }
            }

            if (class87.field1056) {
               class153.method1267(-100);
            }

            if (class261.field3566.field9437.method4584(115) == 1 && ~class672.field10112 == -4 && ~class198.field2452 != 0) {
               class261.field3566.method4677(class261.field3566.field9437, 102, 0);
               class471.method3510((byte)118);
            }
         }
      } catch (RuntimeException var24) {
         throw class670.method4877(var24, field4531[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "()V",
      line = 3454
   )
   public static final void method2401() {
      for(int var0 = 0; var0 < class323.field4603; ++var0) {
         int[] var1 = class726.field10789[var0];

         for(int var2 = 0; var2 < class178.field2197; ++var2) {
            var1[var2] = 0;
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "l",
      descriptor = "(I)V",
      line = 3472
   )
   public static final void method2402(int arg0) {
      int var1 = class287.field4026;
      int[] var2 = class33.field372;
      int var3 = class100.field1230 ? var1 : class159.field2021 + var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         class397 var5;
         if (var4 < var1) {
            var5 = class661.field9578[var2[var4]];
         } else {
            var5 = ((class726)class259.field3509.method5681((long)class115.field1381[var4 - var1], -1)).field10794;
         }

         if (var5.field9010 == arg0) {
            var5.field6108 = 0;
            if (var5.field6020 < 0) {
               var5.field6025 = false;
            } else {
               int var6 = var5.method3046(-66);
               if ((var6 & 1) == 0) {
                  if ((var5.field9003 & 511) != 0 || (var5.field9007 & 511) != 0) {
                     var5.field6025 = false;
                     continue;
                  }
               } else if ((var5.field9003 & 511) != 256 || (var5.field9007 & 511) != 256) {
                  var5.field6025 = false;
                  continue;
               }

               int var10002;
               if (var6 == 1) {
                  int var7 = var5.field9003 >> 9;
                  int var8 = var5.field9007 >> 9;
                  if (class726.field10789[var7][var8] != var5.field6020) {
                     var5.field6025 = true;
                     continue;
                  }

                  if (class364.field5461[var7][var8] > 1) {
                     var10002 = class364.field5461[var7][var8]--;
                     var5.field6025 = true;
                     continue;
                  }
               } else {
                  int var9 = (var6 - 1) * 256 + 252;
                  int var10 = var5.field9003 - var9 >> 9;
                  int var11 = var5.field9007 - var9 >> 9;
                  int var12 = var5.field9003 + var9 >> 9;
                  int var13 = var5.field9007 + var9 >> 9;
                  if (!class732.method5322(var5.field6020, var12, var13, (byte)-61, var11, var10)) {
                     for(int var14 = var10; var14 <= var12; ++var14) {
                        for(int var15 = var11; var15 <= var13; ++var15) {
                           if (class726.field10789[var14][var15] == var5.field6020) {
                              var10002 = class364.field5461[var14][var15]--;
                           }
                        }
                     }

                     var5.field6025 = true;
                     continue;
                  }
               }

               var5.field6025 = false;
               var5.field8998 = class368.method2858(var5.field9007, (byte)-11, var5.field9003, var5.field9010);
               class117.method978(var5, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2404(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2405(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
