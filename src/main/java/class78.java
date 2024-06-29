import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class78 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "client!dl",
      name = "B",
      descriptor = "Z"
   )
   private boolean field1063 = false;
   @OriginalMember(
      owner = "client!dl",
      name = "V",
      descriptor = "Z"
   )
   private boolean field1058 = false;
   @OriginalMember(
      owner = "client!dl",
      name = "nb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1092 = new String[]{method765(method764("#9m+t")), method765(method764("#9m\u000f93\u00143\u00180\"!\u0000\u0007230;\u001ct")), method765(method764("#9m!\u001do")), method765(method764("-4 \u00045%")), method765(method764("#9m9\u001do")), method765(method764("#9m+\u001do")), method765(method764("<{mF!")), method765(method764("#9m\u000e3$ 0$34!k")), method765(method764(") /\u0004")), method765(method764("$'\"\u001b4")), method765(method764("\u0018&&\u0004:")), method765(method764("&91\r=#,/\u0007=#0'")), method765(method764("#9m\"\u001do")), method765(method764("#9m\u001f5)1,\u001f\u0018\"4 \u001c5147\r8o")), method765(method764("#9m'\u001do")), method765(method764("+:$\u000f9#:6\u001c")), method765(method764("\"'1\u0007.\u00182\"\u00059\u0018")), method765(method764("\u0018!,\u0018")), method765(method764("i\"0")), method765(method764("#9m/\u001do")), method765(method764("#9m\u001b((%k")), method765(method764("#9m8\u001do")), method765(method764("-4$\u001c4\":1\t")), method765(method764("i&7\r0+41\f=0;m\u000b3*")), method765(method764("vgtFliemY")), method765(method764("i'6\u0006946\"\u00189i6,\u0005")), method765(method764("i?\"\u000f9?{ \u00071")), method765(method764("-4$\r$i6,\u0005")), method765(method764("vlqFmqmmYr")), method765(method764("5 -\r/$43\rr$:.")), method765(method764("4!&\u00040&''\t+){ \u00071")), method765(method764(".;5\t0.1+\u0007/3")), method765(method764("#9m \u001do")), method765(method764("#9m\u001f5)1,\u001f\u001370-\r8o")), method765(method764("#9m%\u001do")), method765(method764("#9m't")), method765(method764("#9m\u000f93\u0011,\u000b)*0-\u001c\u001e&&&@")), method765(method764("#9m\u000f93\u0005\"\u001a=*07\r.o")), method765(method764("#9m\u001f5)1,\u001f\u0018\"< \u00072.3*\r8o")), method765(method764("#9m\u000e3$ 0/=.;&\ft")), method765(method764("0',\u0006;-45\t")), method765(method764("4 -")), method765(method764("v{")), method765(method764("v{qF")), method765(method764("v{q")), method765(method764("v{r")), method765(method764("#9m\u001a))}")), method765(method764("&%3\u00049")), method765(method764(".7.")), method765(method764("v{rF")), method765(method764("v{wFn")), method765(method764("#9m\u001f5)1,\u001f\u0015$:-\u0001:.0'@")), method765(method764("#9m\u0018.(#*\f9\u000b:\"\f95\u00143\u00180\"!k")), method765(method764("#9m\f94!1\u0007%o")), method765(method764("#9m-\u001do")), method765(method764("-4$\u0005546")), method765(method764("#9m\u001f5)1,\u001f\u001f+:0\r8o")), method765(method764("\u0014=6\u001c8(\"-H/341\u001c|ju \u00049&;y")), method765(method764("\u0014=6\u001c8(\"-H?(83\u0004930cE|$9&\t2}")), method765(method764("#9m,\u001do")), method765(method764("#9m$\u001do")), method765(method764("#9m\u001b(&'7@")), method765(method764("#9m\u001f5)1,\u001f\u001d$!*\u001e=30'@")), method765(method764("32\"")), method765(method764("#9m#\u001do")), method765(method764("#9m&\u001do")), method765(method764("\r4$\r$")), method765(method764("#9m.\u001do")), method765(method764("#9m\u001f5)1,\u001f\u001f+:0\u00012 }")), method765(method764("#9m\u001d,#47\rt")), method765(method764("#9m\u0018=.;7@"))};
   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field1042 = true;
   @OriginalMember(
      owner = "client!dl",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field1051 = new int[16];
   @OriginalMember(
      owner = "client!dl",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1049 = new String[]{method765(method764("\u0014 -")), method765(method764("\n:-")), method765(method764("\u0013 &")), method765(method764("\u00100'")), method765(method764("\u0013=6")), method765(method764("\u0001'*")), method765(method764("\u001447"))};
   @OriginalMember(
      owner = "client!dl",
      name = "jb",
      descriptor = "I"
   )
   public static int field1027;
   @OriginalMember(
      owner = "client!dl",
      name = "J",
      descriptor = "I"
   )
   public static int field1028;
   @OriginalMember(
      owner = "client!dl",
      name = "ab",
      descriptor = "I"
   )
   public static int field1029;
   @OriginalMember(
      owner = "client!dl",
      name = "O",
      descriptor = "I"
   )
   public static int field1030;
   @OriginalMember(
      owner = "client!dl",
      name = "eb",
      descriptor = "I"
   )
   public static int field1031;
   @OriginalMember(
      owner = "client!dl",
      name = "X",
      descriptor = "I"
   )
   public static int field1032;
   @OriginalMember(
      owner = "client!dl",
      name = "S",
      descriptor = "I"
   )
   public static int field1033;
   @OriginalMember(
      owner = "client!dl",
      name = "s",
      descriptor = "I"
   )
   public static int field1034;
   @OriginalMember(
      owner = "client!dl",
      name = "A",
      descriptor = "I"
   )
   public static int field1035;
   @OriginalMember(
      owner = "client!dl",
      name = "k",
      descriptor = "I"
   )
   public static int field1036;
   @OriginalMember(
      owner = "client!dl",
      name = "u",
      descriptor = "I"
   )
   public static int field1037;
   @OriginalMember(
      owner = "client!dl",
      name = "t",
      descriptor = "I"
   )
   public static int field1038;
   @OriginalMember(
      owner = "client!dl",
      name = "g",
      descriptor = "I"
   )
   public static int field1039;
   @OriginalMember(
      owner = "client!dl",
      name = "w",
      descriptor = "I"
   )
   public static int field1040;
   @OriginalMember(
      owner = "client!dl",
      name = "db",
      descriptor = "I"
   )
   public static int field1041;
   @OriginalMember(
      owner = "client!dl",
      name = "F",
      descriptor = "I"
   )
   public static int field1043;
   @OriginalMember(
      owner = "client!dl",
      name = "Q",
      descriptor = "I"
   )
   public static int field1044;
   @OriginalMember(
      owner = "client!dl",
      name = "x",
      descriptor = "I"
   )
   public static int field1045;
   @OriginalMember(
      owner = "client!dl",
      name = "T",
      descriptor = "I"
   )
   public static int field1046;
   @OriginalMember(
      owner = "client!dl",
      name = "j",
      descriptor = "I"
   )
   public static int field1047;
   @OriginalMember(
      owner = "client!dl",
      name = "o",
      descriptor = "I"
   )
   public static int field1050;
   @OriginalMember(
      owner = "client!dl",
      name = "q",
      descriptor = "I"
   )
   public static int field1052;
   @OriginalMember(
      owner = "client!dl",
      name = "C",
      descriptor = "I"
   )
   public static int field1053;
   @OriginalMember(
      owner = "client!dl",
      name = "K",
      descriptor = "I"
   )
   public static int field1054;
   @OriginalMember(
      owner = "client!dl",
      name = "r",
      descriptor = "I"
   )
   public static int field1055;
   @OriginalMember(
      owner = "client!dl",
      name = "U",
      descriptor = "I"
   )
   public static int field1056;
   @OriginalMember(
      owner = "client!dl",
      name = "c",
      descriptor = "I"
   )
   public static int field1057;
   @OriginalMember(
      owner = "client!dl",
      name = "i",
      descriptor = "I"
   )
   public static int field1059;
   @OriginalMember(
      owner = "client!dl",
      name = "G",
      descriptor = "I"
   )
   public static int field1060;
   @OriginalMember(
      owner = "client!dl",
      name = "e",
      descriptor = "I"
   )
   public static int field1061;
   @OriginalMember(
      owner = "client!dl",
      name = "bb",
      descriptor = "I"
   )
   public static int field1062;
   @OriginalMember(
      owner = "client!dl",
      name = "y",
      descriptor = "I"
   )
   public static int field1065;
   @OriginalMember(
      owner = "client!dl",
      name = "cb",
      descriptor = "I"
   )
   public static int field1066;
   @OriginalMember(
      owner = "client!dl",
      name = "Z",
      descriptor = "I"
   )
   public static int field1067;
   @OriginalMember(
      owner = "client!dl",
      name = "N",
      descriptor = "I"
   )
   public static int field1068;
   @OriginalMember(
      owner = "client!dl",
      name = "kb",
      descriptor = "I"
   )
   public static int field1069;
   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "I"
   )
   public static int field1070;
   @OriginalMember(
      owner = "client!dl",
      name = "M",
      descriptor = "I"
   )
   public static int field1071;
   @OriginalMember(
      owner = "client!dl",
      name = "f",
      descriptor = "I"
   )
   public static int field1074;
   @OriginalMember(
      owner = "client!dl",
      name = "P",
      descriptor = "I"
   )
   public static int field1075;
   @OriginalMember(
      owner = "client!dl",
      name = "h",
      descriptor = "I"
   )
   public static int field1076;
   @OriginalMember(
      owner = "client!dl",
      name = "v",
      descriptor = "I"
   )
   public static int field1078;
   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "I"
   )
   public static int field1084;
   @OriginalMember(
      owner = "client!dl",
      name = "D",
      descriptor = "I"
   )
   public static int field1085;
   @OriginalMember(
      owner = "client!dl",
      name = "gb",
      descriptor = "I"
   )
   public static int field1086;
   @OriginalMember(
      owner = "client!dl",
      name = "d",
      descriptor = "I"
   )
   public static int field1090;
   @OriginalMember(
      owner = "client!dl",
      name = "H",
      descriptor = "I"
   )
   public static int field1091;
   @OriginalMember(
      owner = "client!dl",
      name = "mb",
      descriptor = "Lbu;"
   )
   public static class596 field1048;
   @OriginalMember(
      owner = "client!dl",
      name = "l",
      descriptor = "Lbaa;"
   )
   public static class649 field1064;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!dl",
      name = "E",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1072;
   @OriginalMember(
      owner = "client!dl",
      name = "lb",
      descriptor = "Z"
   )
   public static boolean field1073;
   @OriginalMember(
      owner = "client!dl",
      name = "fb",
      descriptor = "Z"
   )
   public static boolean field1077;
   @OriginalMember(
      owner = "client!dl",
      name = "Y",
      descriptor = "Z"
   )
   public static boolean field1079;
   @OriginalMember(
      owner = "client!dl",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field1080;
   @OriginalMember(
      owner = "client!dl",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field1081;
   @OriginalMember(
      owner = "client!dl",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field1082;
   @OriginalMember(
      owner = "client!dl",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field1083;
   @OriginalMember(
      owner = "client!dl",
      name = "W",
      descriptor = "Z"
   )
   public static boolean field1087;
   @OriginalMember(
      owner = "client!dl",
      name = "ib",
      descriptor = "Z"
   )
   public static boolean field1088;
   @OriginalMember(
      owner = "client!dl",
      name = "hb",
      descriptor = "Z"
   )
   public static boolean field1089;

   @OriginalMember(
      owner = "client!dl",
      name = "g",
      descriptor = "(I)[Lae;"
   )
   public static final class285[] method741(int arg0) {
      try {
         ++field1028;
         int var1 = -113 / ((arg0 - 21) / 33);
         return new class285[]{class87.field1189, class585.field8633, class428.field5820};
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method742(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field1045;
         String var3 = this.getDocumentBase().getHost().toLowerCase();
         if (!var3.equals(field1092[27]) && !var3.endsWith(field1092[26])) {
            if (!var3.equals(field1092[29]) && !var3.endsWith(field1092[25])) {
               if (!var3.equals(field1092[30]) && !var3.endsWith(field1092[23])) {
                  if (arg0 != -1) {
                     return false;
                  } else if (var3.endsWith(field1092[24])) {
                     return true;
                  } else {
                     char var10000;
                     while(true) {
                        if (var3.length() > 0) {
                           var10000 = var3.charAt(-1 + var3.length());
                           if (var2) {
                              break;
                           }

                           if (var10000 >= '0' && ~var3.charAt(var3.length() - 1) >= -58) {
                              var3 = var3.substring(0, -1 + var3.length());
                              continue;
                           }
                        }

                        var10000 = var3.endsWith(field1092[28]);
                        break;
                     }

                     if (var10000 != 0) {
                        return true;
                     } else {
                        this.method746(true, field1092[31]);
                        return false;
                     }
                  }
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1092[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(IIIILjava/lang/String;II)V"
   )
   public final void method743(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         ++field1037;

         try {
            if (class329.field4545 != null) {
               ++class276.field3524;
               if (class276.field3524 >= 3) {
                  this.method746(true, field1092[11]);
               } else {
                  this.getAppletContext().showDocument(this.getDocumentBase(), field1092[10]);
               }
            } else {
               class543.field7943 = 0;
               class204.field2605 = arg6;
               class282.field3917 = arg6;
               class549.field8088 = 0;
               class428.field5816 = class152.field1893;
               class91.field1242 = arg5;
               class315.field4358 = arg5;
               class329.field4545 = this;
               class391.field5422 = arg1;
               class171.field2224 = class366.field5092 = new class736(arg0, arg4, arg2, class152.field1893 != null);
               class769 var9 = class366.field5092.method5338(0, 1, this);
               if (var8) {
                  class340.method2717(10L, (byte)-119);
               }

               while(~var9.field11210 == -1) {
                  class340.method2717(10L, (byte)-119);
               }

               int var10 = -122 % ((-77 - arg3) / 39);
            }
         } catch (Throwable var13) {
            class668.method4877((byte)-13, var13, (String)null);
            this.method746(true, field1092[9]);
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field1092[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1092[6] : field1092[8]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosed(WindowEvent arg0) {
      try {
         ++field1031;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[56] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;"
   )
   public final AppletContext getAppletContext() {
      try {
         ++field1070;
         if (class570.field8391 != null) {
            return null;
         } else {
            return class152.field1893 != null && class152.field1893 != this ? class152.field1893.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1092[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "destroy",
      descriptor = "()V"
   )
   public final void destroy() {
      try {
         ++field1062;
         if (class329.field4545 == this && !class355.field4955) {
            class25.field389 = class163.method1353(-120);
            class340.method2717(5000L, (byte)-119);
            class171.field2224 = null;
            this.method750(-256, false);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1092[53] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowOpened(WindowEvent arg0) {
      try {
         ++field1032;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[33] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(CZ)C"
   )
   public static final char method744(char arg0, boolean arg1) {
      try {
         ++field1029;
         if (!arg1) {
            return '\u0018';
         } else if (arg0 != ' ' && arg0 != 160 && ~arg0 != -96 && arg0 != '-') {
            if (arg0 != '[' && arg0 != ']' && arg0 != '#') {
               if (~arg0 != -225 && ~arg0 != -226 && ~arg0 != -227 && ~arg0 != -229 && ~arg0 != -228 && ~arg0 != -193 && ~arg0 != -194 && arg0 != 194 && arg0 != 196 && arg0 != 195) {
                  if (~arg0 != -233 && arg0 != 233 && arg0 != 234 && ~arg0 != -236 && arg0 != 200 && ~arg0 != -202 && ~arg0 != -203 && ~arg0 != -204) {
                     if (arg0 != 237 && ~arg0 != -239 && arg0 != 239 && ~arg0 != -206 && arg0 != 206 && arg0 != 207) {
                        if (arg0 != 242 && arg0 != 243 && ~arg0 != -245 && arg0 != 246 && ~arg0 != -246 && ~arg0 != -211 && arg0 != 211 && ~arg0 != -213 && ~arg0 != -215 && arg0 != 213) {
                           if (arg0 != 249 && arg0 != 250 && ~arg0 != -252 && ~arg0 != -253 && arg0 != 217 && arg0 != 218 && arg0 != 219 && ~arg0 != -221) {
                              if (~arg0 != -232 && arg0 != 199) {
                                 if (~arg0 != -256 && arg0 != 376) {
                                    if (arg0 != 241 && arg0 != 209) {
                                       if (~arg0 != -224) {
                                          return Character.toLowerCase(arg0);
                                       } else if (!client.field1481) {
                                          return 'b';
                                       } else {
                                          return '_';
                                       }
                                    } else {
                                       return 'n';
                                    }
                                 } else {
                                    return 'y';
                                 }
                              } else {
                                 return 'c';
                              }
                           } else {
                              return 'u';
                           }
                        } else {
                           return 'o';
                        }
                     } else {
                        return 'i';
                     }
                  } else {
                     return 'e';
                  }
               } else {
                  return 'a';
               }
            } else {
               return arg0;
            }
         } else {
            return '_';
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1092[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method745(int arg0) {
      try {
         ++field1067;
         long var2 = class163.method1353(arg0 ^ -19645);
         if (arg0 != 19648) {
            method758(false);
         }

         long var4 = class699.field10234[class114.field1512];
         class699.field10234[class114.field1512] = var2;
         class114.field1512 = class114.field1512 + 1 & 31;
         if (var4 != 0L && ~var4 > ~var2) {
            int var6 = (int)(-var4 + var2);
            class618.field9102 = (32000 - -(var6 >> 1)) / var6;
         }

         if (class176.field2273++ > 50) {
            label39: {
               class176.field2273 -= 50;
               class402.field5528 = true;
               class590.field8691.setSize(class204.field2605, class91.field1242);
               class590.field8691.setVisible(true);
               if (class570.field8391 == null || class233.field2900 != null) {
                  class590.field8691.setLocation(class543.field7943, class549.field8088);
                  if (!client.field1481) {
                     break label39;
                  }
               }

               Insets var7 = class570.field8391.getInsets();
               class590.field8691.setLocation(class543.field7943 + var7.left, class549.field8088 + var7.top);
            }
         }

         this.method751(111);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1092[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V"
   )
   public final void method746(boolean arg0, String arg1) {
      try {
         ++field1035;
         if (!this.field1058) {
            this.field1058 = arg0;
            System.out.println(field1092[16] + arg1);

            try {
               class537.method4076(field1092[15], class152.field1893, false);
            } catch (Throwable var5) {
            }

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), field1092[16] + arg1 + field1092[18]), field1092[17]);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1092[14] + arg0 + ',' + (arg1 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowActivated(WindowEvent arg0) {
      try {
         ++field1057;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[62] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method747(boolean arg0);

   @OriginalMember(
      owner = "client!dl",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
   )
   public final String getParameter(String arg0) {
      try {
         ++field1050;
         if (class570.field8391 != null) {
            return null;
         } else {
            return class152.field1893 != null && class152.field1893 != this ? class152.field1893.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[37] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeiconified(WindowEvent arg0) {
      try {
         ++field1044;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[38] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field1481;

      try {
         ++field1066;

         try {
            if (class736.field10732 != null) {
               label517: {
                  String var2 = class736.field10732.toLowerCase();
                  if (var2.indexOf(field1092[41]) == -1 && ~var2.indexOf(field1092[47]) == 0) {
                     if (~var2.indexOf(field1092[48]) == 0 || class736.field10751 != null && !class736.field10751.equals(field1092[50])) {
                        break label517;
                     }

                     this.method746(true, field1092[40]);
                     if (!var1) {
                        return;
                     }
                  }

                  String var3 = class736.field10751;
                  if (var3.equals(field1092[45]) || var3.startsWith(field1092[49]) || var3.equals(field1092[44]) || var3.startsWith(field1092[43])) {
                     this.method746(true, field1092[40]);
                     if (!var1) {
                        return;
                     }
                  }
               }
            }

            int var10000;
            if (class736.field10751 != null && class736.field10751.startsWith(field1092[42])) {
               label525: {
                  int var4 = 2;
                  int var5 = 0;
                  if (var1) {
                     var10000 = class736.field10751.charAt(var4);
                  } else if (class736.field10751.length() <= var4) {
                     var10000 = var5;
                     if (!var1) {
                        if (var5 >= 5) {
                           class624.field9227 = true;
                        }
                        break label525;
                     }
                  } else {
                     var10000 = class736.field10751.charAt(var4);
                  }

                  label485:
                  while(true) {
                     while(true) {
                        while(true) {
                           int var6 = var10000;
                           if (~var6 <= -49) {
                              if (~var6 < -58) {
                                 if (!var1) {
                                    var10000 = var5;
                                    if (!var1) {
                                       if (var5 >= 5) {
                                          class624.field9227 = true;
                                       }
                                       break label485;
                                    }
                                    continue;
                                 }

                                 ++var4;
                                 var5 = var5 * 10 + var6 + -48;
                              } else {
                                 ++var4;
                                 var5 = var5 * 10 + var6 + -48;
                              }

                              if (class736.field10751.length() <= var4) {
                                 var10000 = var5;
                                 if (!var1) {
                                    if (var5 >= 5) {
                                       class624.field9227 = true;
                                    }
                                    break label485;
                                 }
                              } else {
                                 var10000 = class736.field10751.charAt(var4);
                              }
                           } else {
                              var10000 = var5;
                              if (!var1) {
                                 if (var5 >= 5) {
                                    class624.field9227 = true;
                                 }
                                 break label485;
                              }
                           }
                        }
                     }
                  }
               }
            }

            Applet var7 = class329.field4545;
            if (class152.field1893 != null) {
               var7 = class152.field1893;
            }

            Method var8 = class736.field10744;
            if (var8 != null) {
               try {
                  var8.invoke(var7, Boolean.TRUE);
               } catch (Throwable var21) {
               }
            }

            class647.method4753(-11750);
            class773.method5581(false);
            this.method753(-66);
            this.method747(false);
            class569.field8365 = class355.method2814(-95);
            int var9;
            if (var1) {
               class363.field5045 = class569.field8365.method1491(class111.field1492, -122);
               var9 = 0;
               if (var1) {
                  this.method749(2);
                  ++var9;
               }
            } else if (~class25.field389 != -1L) {
               long var26;
               var10000 = (var26 = ~class163.method1353(-125) - ~class25.field389) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (!var1) {
                  if (var10000 <= 0) {
                     return;
                  }

                  class363.field5045 = class569.field8365.method1491(class111.field1492, -122);
                  var9 = 0;
                  if (var1) {
                     this.method749(2);
                     ++var9;
                  }
               } else {
                  var9 = var10000;
                  if (var1) {
                     this.method749(2);
                     ++var9;
                  }
               }
            } else {
               class363.field5045 = class569.field8365.method1491(class111.field1492, -122);
               var9 = 0;
               if (var1) {
                  this.method749(2);
                  ++var9;
               }
            }

            while(true) {
               while(class363.field5045 > var9) {
                  this.method749(2);
                  ++var9;
               }

               this.method745(19648);
               if (!var1) {
                  class574.method4307(class590.field8691, 1, class366.field5092);
                  if (~class25.field389 != -1L) {
                     long var27;
                     var10000 = (var27 = ~class163.method1353(-125) - ~class25.field389) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                     if (!var1) {
                        if (var10000 <= 0) {
                           break;
                        }

                        class363.field5045 = class569.field8365.method1491(class111.field1492, -122);
                        var9 = 0;
                        if (var1) {
                           this.method749(2);
                           ++var9;
                        }
                     } else {
                        var9 = var10000;
                        if (var1) {
                           this.method749(2);
                           ++var9;
                        }
                     }
                  } else {
                     class363.field5045 = class569.field8365.method1491(class111.field1492, -122);
                     var9 = 0;
                     if (var1) {
                        this.method749(2);
                        ++var9;
                     }
                  }
               } else {
                  ++var9;
               }
            }
         } catch (ThreadDeath var22) {
            throw var22;
         } catch (Throwable var23) {
            class668.method4877((byte)126, var23, this.method754(26519));
            this.method746(true, field1092[9]);
         } finally {
            Object var15 = null;
            this.method750(-256, true);
         }

      } catch (RuntimeException var25) {
         throw class93.method866(var25, field1092[46] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowIconified(WindowEvent arg0) {
      try {
         ++field1040;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[51] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "i",
      descriptor = "(I)V"
   )
   public abstract void method748(int arg0);

   @OriginalMember(
      owner = "client!dl",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         ++field1033;
         if (class329.field4545 == this && !class355.field4955) {
            class402.field5528 = true;
            if (class624.field9227 && -class204.field2596 + class163.method1353(-122) > 1000L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || ~var2.width <= ~class282.field3917 && var2.height >= class315.field4358) {
                  class300.field4186 = true;
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1092[70] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "j",
      descriptor = "(I)V"
   )
   private final void method749(int arg0) {
      try {
         ++field1046;
         long var2 = class163.method1353(-123);
         long var4 = class145.field1817[class62.field788];
         class145.field1817[class62.field788] = var2;
         class62.field788 = 31 & class62.field788 + 1;
         boolean var10000;
         if (var4 != 0L && ~var2 < ~var4) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         synchronized(this) {
            class479.field6672 = class472.field6509;
         }

         this.method756(108);
         if (arg0 != 2) {
            field1049 = null;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1092[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method750(int arg0, boolean arg1) {
      try {
         if (arg0 != -256) {
            field1068 = 120;
         }

         ++field1052;
         synchronized(this) {
            if (class355.field4955) {
               return;
            }

            class355.field4955 = true;
         }

         System.out.println(field1092[57] + arg1);
         if (class152.field1893 != null) {
            class152.field1893.destroy();
         }

         try {
            this.method748(-21264);
         } catch (Exception var10) {
         }

         if (this.field1063) {
            try {
               jagmisc.quit();
            } catch (Throwable var9) {
            }

            this.field1063 = false;
         }

         class611.method4508(true, -1);
         class584.method4361((byte)-55);
         if (class590.field8691 != null) {
            try {
               class590.field8691.removeFocusListener(this);
               class590.field8691.getParent().remove(class590.field8691);
            } catch (Exception var8) {
            }
         }

         if (class366.field5092 != null) {
            try {
               class366.field5092.method5337(1);
            } catch (Exception var7) {
            }
         }

         this.method762(7455);
         if (class570.field8391 != null) {
            class570.field8391.setVisible(false);
            class570.field8391.dispose();
            class570.field8391 = null;
         }

         System.out.println(field1092[58] + arg1);
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field1092[59] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method751(int arg0);

   @OriginalMember(
      owner = "client!dl",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getDocumentBase() {
      try {
         ++field1054;
         if (class570.field8391 != null) {
            return null;
         } else {
            return class152.field1893 != null && class152.field1893 != this ? class152.field1893.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1092[36] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(Lkea;I)V"
   )
   public static final void method752(class614 arg0, int arg1) {
      try {
         ++field1047;
         if (class548.field8080 != null) {
            if (arg1 >= -64) {
               method758(true);
            }

            class660 var2 = null;
            if (~arg0.field9050 == -1) {
               var2 = (class660)class776.method5607(arg0.field9044, arg0.field9040, arg0.field9035);
            }

            if (~arg0.field9050 == -2) {
               var2 = (class660)class623.method4610(arg0.field9044, arg0.field9040, arg0.field9035);
            }

            if (~arg0.field9050 == -3) {
               var2 = (class660)class338.method2672(arg0.field9044, arg0.field9040, arg0.field9035, field1072 != null ? field1072 : (field1072 = method763(field1092[63])));
            }

            if (~arg0.field9050 == -4) {
               var2 = (class660)class688.method5028(arg0.field9044, arg0.field9040, arg0.field9035);
            }

            if (var2 != null) {
               arg0.field9049 = var2.method175((byte)9);
               arg0.field9043 = var2.method181(-6696);
               arg0.field9034 = var2.method184(true);
            } else {
               arg0.field9043 = 0;
               arg0.field9049 = -1;
               arg0.field9034 = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1092[64] + (arg0 != null ? field1092[6] : field1092[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field1027;
         class472.field6509 = true;
         class402.field5528 = true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[39] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "h",
      descriptor = "(I)V"
   )
   public synchronized void method753(int arg0) {
      boolean var2 = client.field1481;

      try {
         if (arg0 > -55) {
            this.method750(-85, true);
         }

         if (class590.field8691 != null) {
            class590.field8691.removeFocusListener(this);
            class590.field8691.getParent().setBackground(Color.black);
            class590.field8691.getParent().remove(class590.field8691);
         }

         Container var3;
         label42: {
            ++field1043;
            if (class233.field2900 == null) {
               if (class570.field8391 == null) {
                  if (class152.field1893 != null) {
                     var3 = class152.field1893;
                     if (!var2) {
                        break label42;
                     }
                  }

                  var3 = class329.field4545;
                  if (!var2) {
                     break label42;
                  }
               }

               var3 = class570.field8391;
               if (!var2) {
                  break label42;
               }
            }

            var3 = class233.field2900;
         }

         label31: {
            var3.setLayout((LayoutManager)null);
            class590.field8691 = new class141(this);
            var3.add(class590.field8691);
            class590.field8691.setSize(class204.field2605, class91.field1242);
            class590.field8691.setVisible(true);
            if (class570.field8391 != var3) {
               class590.field8691.setLocation(class543.field7943, class549.field8088);
               if (!var2) {
                  break label31;
               }
            }

            Insets var4 = class570.field8391.getInsets();
            class590.field8691.setLocation(class543.field7943 + var4.left, var4.top - -class549.field8088);
         }

         class590.field8691.addFocusListener(this);
         class590.field8691.requestFocus();
         class479.field6672 = true;
         class472.field6509 = true;
         class402.field5528 = true;
         class300.field4186 = false;
         class204.field2596 = class163.method1353(-121);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1092[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "l",
      descriptor = "(I)Ljava/lang/String;"
   )
   public String method754(int arg0) {
      try {
         ++field1060;
         if (arg0 != 26519) {
            field1049 = null;
         }

         return null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method755(String param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dl",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         ++field1065;
         this.destroy();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[68] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method756(int arg0);

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method757(byte arg0) {
      try {
         if (arg0 > -48) {
            return false;
         } else {
            ++field1055;
            return class52.method385(field1092[22], 68);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method758(boolean arg0) {
      try {
         field1051 = null;
         field1048 = null;
         field1049 = null;
         field1064 = null;
         if (!arg0) {
            method741(65);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1092[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "client!dl",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method759(int arg0) {
      try {
         if (arg0 != 5) {
            field1042 = true;
         }

         ++field1039;
         return class52.method385(field1092[55], arg0 ^ -42);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method760(int arg0) {
      try {
         ++field1061;
         return arg0 != 243 ? false : class52.method385(field1092[3], -60);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "provideLoaderApplet",
      descriptor = "(Ljava/applet/Applet;)V"
   )
   public static final void provideLoaderApplet(Applet arg0) {
      try {
         class152.field1893 = arg0;
         ++field1034;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1092[52] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         this.paint(arg0);
         ++field1038;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[69] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         class472.field6509 = false;
         ++field1059;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[7] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeactivated(WindowEvent arg0) {
      try {
         ++field1030;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1092[13] + (arg0 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "stop",
      descriptor = "()V"
   )
   public final void stop() {
      try {
         ++field1056;
         if (class329.field4545 == this && !class355.field4955) {
            class25.field389 = class163.method1353(-125) - -4000L;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1092[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getCodeBase() {
      ++field1041;
      if (class570.field8391 != null) {
         return null;
      } else {
         return class152.field1893 != null && class152.field1893 != this ? class152.field1893.getCodeBase() : super.getCodeBase();
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(IIZIIIILjava/lang/String;)V"
   )
   public final void method761(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
      boolean var9 = client.field1481;

      try {
         try {
            class543.field7943 = 0;
            class549.field8088 = 0;
            class91.field1242 = arg4;
            class315.field4358 = arg4;
            class391.field5422 = arg0;
            class329.field4545 = this;
            class204.field2605 = arg3;
            class282.field3917 = arg3;
            class428.field5816 = null;
            class570.field8391 = new Frame();
            class570.field8391.setTitle(field1092[66]);
            class570.field8391.setResizable(true);
            class570.field8391.addWindowListener(this);
            class570.field8391.setVisible(true);
            class570.field8391.toFront();
            Insets var10 = class570.field8391.getInsets();
            class570.field8391.setSize(class282.field3917 + var10.left + var10.right, class315.field4358 + var10.bottom + var10.top);
            class171.field2224 = class366.field5092 = new class736(arg1, arg7, arg6, true);
            class769 var11 = class366.field5092.method5338(0, 1, this);
            if (arg5 != -1) {
               field1042 = false;
               if (var9) {
                  class340.method2717(10L, (byte)-119);
               }
            }

            while(var11.field11210 == 0) {
               class340.method2717(10L, (byte)-119);
            }
         } catch (Exception var14) {
            class668.method4877((byte)-72, var14, (String)null);
         }

         ++field1071;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field1092[67] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1092[6] : field1092[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "start",
      descriptor = "()V"
   )
   public final void start() {
      try {
         ++field1069;
         if (class329.field4545 == this && !class355.field4955) {
            class25.field389 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1092[61] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method762(int arg0);

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method763(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method764(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method765(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
