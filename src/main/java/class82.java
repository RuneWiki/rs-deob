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

@OriginalClass("client!aw")
public abstract class class82 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "client!aw",
      name = "M",
      descriptor = "Z"
   )
   private boolean field1030 = false;
   @OriginalMember(
      owner = "client!aw",
      name = "J",
      descriptor = "Z"
   )
   private boolean field1028 = false;
   @OriginalMember(
      owner = "client!aw",
      name = "fb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1079 = new String[]{method816(method815("b<M?Ew\n\u0013(Lf? 7Nw.\u001b,\b")), method816(method815("b<M<Ep?\u00117Y+")), method816(method815("b<M/Im/\f/a`?\n.Aw.\u0007p")), method816(method815("xeMv]")), method816(method815("m>\u000f4")), method816(method815("b<M?Ew\u001b\u0002*An.\u0017=R+")), method816(method815("b<M?Ew\u000f\f;Un.\r,bb8\u0006p")), method816(method815("b<M/Im/\f/os.\r=D+")), method816(method815("b<M\u001f\b")), method816(method815("b'\u0011=Ag2\u000f7Ag.\u0007")), method816(method815("`9\u0002+H")), method816(method815("b<M\u0015\b")), method816(method815("\\8\u00064F")), method816(method815("b<M/Im/\f/co$\u0010=D+")), method816(method815("b<M/Im/\f/i`$\r1Fj.\u0007p")), method816(method815("b<M/Im/\f/co$\u00101Ndc")), method816(method815("b<M>O`>\u0010\u0014Op?K")), method816(method815("b<M\u001d\b")), method816(method815("b<M/Im/\f/df*\u0000,Iu*\u0017=D+")), method816(method815("b<M(Aj%\u0017p")), method816(method815("P#\u0016,Dl<\rxSw*\u0011,\u0000.k\u00004Eb%Y")), method816(method815("P#\u0016,Dl<\rxCl&\u00134Ew.Cu\u0000`'\u00069N9")), method816(method815("b<M\u001e\b")), method816(method815("i*\u00045Ip(")), method816(method815("b<M\u0016\b")), method816(method815("b<M(Rl=\n<EO$\u0002<Eq\n\u0013(Lf?K")), method816(method815("b<M-Pg*\u0017=\b")), method816(method815("b<M/Im/\f/df\"\u00007Nj-\n=D+")), method816(method815("b<M\b\b")), method816(method815("b<M\u0019\b")), method816(method815("i*\u00004Ia")), method816(method815("b<M\t\b")), method816(method815("t9\f6Gi*\u00159")), method816(method815("j)\u000e")), method816(method815("p>\r")), method816(method815("2eRv")), method816(method815("2eQv")), method816(method815("2e")), method816(method815("2eQ")), method816(method815("b<M*Umc")), method816(method815("b;\u00134E")), method816(method815("2eWv\u0012")), method816(method815("2eR")), method816(method815("b<M>O`>\u0010\u001fAj%\u0006<\b")), method816(method815("b<M\u0011\b")), method816(method815("b<M\u0017\b")), method816(method815("i*\u0004,Hf$\u00119")), method816(method815("b<M\u001b\b")), method816(method815("I*\u0004=X")), method816(method815("2rQv\u00115sMi\u000e")), method816(method815("i*\u0004=X-(\f5")), method816(method815("q>\r=S`*\u0013=\u000e`$\u000e")), method816(method815("-!\u0002?E{e\u00007M")), method816(method815("-9\u00166Ep(\u0002(E-(\f5")), method816(method815("j%\u00159Lj/\u000b7Sw")), method816(method815("p?\u00064Lb9\u00079Wme\u00007M")), method816(method815("-8\u0017=Lo*\u0011<At%M;On")), method816(method815("2yTv\u0010-{Mi")), method816(method815("b<M\u0012\b")), method816(method815("b<M+Tl;K")), method816(method815("b<M+Tb9\u0017p")), method816(method815("-<\u0010")), method816(method815("b<M\u0013\b")), method816(method815("\\?\f(")), method816(method815("o$\u0004?Eg$\u0016,")), method816(method815("f9\u00117R\\,\u00025E\\"))};
   @OriginalMember(
      owner = "client!aw",
      name = "j",
      descriptor = "Lnw;"
   )
   public static class616 field1023 = new class616(90, -1);
   @OriginalMember(
      owner = "client!aw",
      name = "cb",
      descriptor = "I"
   )
   public static int field1022;
   @OriginalMember(
      owner = "client!aw",
      name = "d",
      descriptor = "I"
   )
   public static int field1024;
   @OriginalMember(
      owner = "client!aw",
      name = "ab",
      descriptor = "I"
   )
   public static int field1025;
   @OriginalMember(
      owner = "client!aw",
      name = "K",
      descriptor = "I"
   )
   public static int field1026;
   @OriginalMember(
      owner = "client!aw",
      name = "S",
      descriptor = "I"
   )
   public static int field1027;
   @OriginalMember(
      owner = "client!aw",
      name = "X",
      descriptor = "I"
   )
   public static int field1029;
   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "I"
   )
   public static int field1031;
   @OriginalMember(
      owner = "client!aw",
      name = "h",
      descriptor = "I"
   )
   public static int field1032;
   @OriginalMember(
      owner = "client!aw",
      name = "D",
      descriptor = "I"
   )
   public static int field1033;
   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "I"
   )
   public static int field1034;
   @OriginalMember(
      owner = "client!aw",
      name = "e",
      descriptor = "I"
   )
   public static int field1035;
   @OriginalMember(
      owner = "client!aw",
      name = "m",
      descriptor = "I"
   )
   public static int field1036;
   @OriginalMember(
      owner = "client!aw",
      name = "eb",
      descriptor = "I"
   )
   public static int field1038;
   @OriginalMember(
      owner = "client!aw",
      name = "f",
      descriptor = "I"
   )
   public static int field1039;
   @OriginalMember(
      owner = "client!aw",
      name = "bb",
      descriptor = "I"
   )
   public static int field1040;
   @OriginalMember(
      owner = "client!aw",
      name = "F",
      descriptor = "I"
   )
   public static int field1041;
   @OriginalMember(
      owner = "client!aw",
      name = "r",
      descriptor = "I"
   )
   public static int field1042;
   @OriginalMember(
      owner = "client!aw",
      name = "w",
      descriptor = "I"
   )
   public static int field1043;
   @OriginalMember(
      owner = "client!aw",
      name = "Z",
      descriptor = "I"
   )
   public static int field1044;
   @OriginalMember(
      owner = "client!aw",
      name = "db",
      descriptor = "I"
   )
   public static int field1045;
   @OriginalMember(
      owner = "client!aw",
      name = "W",
      descriptor = "I"
   )
   public static int field1046;
   @OriginalMember(
      owner = "client!aw",
      name = "U",
      descriptor = "I"
   )
   public static int field1047;
   @OriginalMember(
      owner = "client!aw",
      name = "H",
      descriptor = "I"
   )
   public static int field1048;
   @OriginalMember(
      owner = "client!aw",
      name = "T",
      descriptor = "I"
   )
   public static int field1049;
   @OriginalMember(
      owner = "client!aw",
      name = "o",
      descriptor = "I"
   )
   public static int field1050;
   @OriginalMember(
      owner = "client!aw",
      name = "C",
      descriptor = "I"
   )
   public static int field1051;
   @OriginalMember(
      owner = "client!aw",
      name = "v",
      descriptor = "I"
   )
   public static int field1052;
   @OriginalMember(
      owner = "client!aw",
      name = "x",
      descriptor = "I"
   )
   public static int field1053;
   @OriginalMember(
      owner = "client!aw",
      name = "B",
      descriptor = "I"
   )
   public static int field1054;
   @OriginalMember(
      owner = "client!aw",
      name = "I",
      descriptor = "I"
   )
   public static int field1055;
   @OriginalMember(
      owner = "client!aw",
      name = "O",
      descriptor = "I"
   )
   public static int field1057;
   @OriginalMember(
      owner = "client!aw",
      name = "t",
      descriptor = "I"
   )
   public static int field1058;
   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "I"
   )
   public static int field1059;
   @OriginalMember(
      owner = "client!aw",
      name = "E",
      descriptor = "I"
   )
   public static int field1060;
   @OriginalMember(
      owner = "client!aw",
      name = "k",
      descriptor = "I"
   )
   public static int field1062;
   @OriginalMember(
      owner = "client!aw",
      name = "p",
      descriptor = "I"
   )
   public static int field1064;
   @OriginalMember(
      owner = "client!aw",
      name = "c",
      descriptor = "I"
   )
   public static int field1065;
   @OriginalMember(
      owner = "client!aw",
      name = "g",
      descriptor = "I"
   )
   public static int field1066;
   @OriginalMember(
      owner = "client!aw",
      name = "y",
      descriptor = "I"
   )
   public static int field1067;
   @OriginalMember(
      owner = "client!aw",
      name = "l",
      descriptor = "I"
   )
   public static int field1068;
   @OriginalMember(
      owner = "client!aw",
      name = "V",
      descriptor = "I"
   )
   public static int field1069;
   @OriginalMember(
      owner = "client!aw",
      name = "i",
      descriptor = "I"
   )
   public static int field1070;
   @OriginalMember(
      owner = "client!aw",
      name = "n",
      descriptor = "I"
   )
   public static int field1074;
   @OriginalMember(
      owner = "client!aw",
      name = "N",
      descriptor = "I"
   )
   public static int field1075;
   @OriginalMember(
      owner = "client!aw",
      name = "s",
      descriptor = "I"
   )
   public static int field1076;
   @OriginalMember(
      owner = "client!aw",
      name = "A",
      descriptor = "I"
   )
   public static int field1078;
   @OriginalMember(
      owner = "client!aw",
      name = "P",
      descriptor = "Z"
   )
   public static boolean field1061;
   @OriginalMember(
      owner = "client!aw",
      name = "G",
      descriptor = "Z"
   )
   public static boolean field1063;
   @OriginalMember(
      owner = "client!aw",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field1071;
   @OriginalMember(
      owner = "client!aw",
      name = "R",
      descriptor = "Z"
   )
   public static boolean field1072;
   @OriginalMember(
      owner = "client!aw",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field1073;
   @OriginalMember(
      owner = "client!aw",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field1077;
   @OriginalMember(
      owner = "client!aw",
      name = "Y",
      descriptor = "[I"
   )
   public static int[] field1056;
   @OriginalMember(
      owner = "client!aw",
      name = "Q",
      descriptor = "[Lmq;"
   )
   public static class538[] field1037;

   @OriginalMember(
      owner = "client!aw",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowActivated(WindowEvent arg0) {
      try {
         ++field1033;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[2] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method797(int arg0) {
      try {
         ++field1034;
         int var2 = 76 / ((28 - arg0) / 40);
         return class280.method2139(108, field1079[23]);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1079[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getCodeBase() {
      ++field1047;
      if (class533.field7289 != null) {
         return null;
      } else {
         return class126.field1586 != null && class126.field1586 != this ? class126.field1586.getCodeBase() : super.getCodeBase();
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method798(byte arg0);

   @OriginalMember(
      owner = "client!aw",
      name = "destroy",
      descriptor = "()V"
   )
   public final void destroy() {
      try {
         ++field1042;
         if (class186.field2284 == this && !class785.field11468) {
            class223.field2775 = class792.method5708(-25005);
            class173.method1347(112, 5000L);
            class648.field9092 = null;
            this.method801(false, true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1079[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;"
   )
   public final AppletContext getAppletContext() {
      try {
         ++field1045;
         if (class533.field7289 != null) {
            return null;
         } else {
            return class126.field1586 != null && class126.field1586 != this ? class126.field1586.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1079[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method799(int arg0) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field1058;
            return class280.method2139(103, field1079[46]);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeactivated(WindowEvent arg0) {
      try {
         ++field1036;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[18] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method800(byte arg0) {
      try {
         if (arg0 != -90) {
            return true;
         } else {
            ++field1053;
            return class280.method2139(arg0 ^ -33, field1079[30]);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(ZZ)V"
   )
   private final void method801(boolean arg0, boolean arg1) {
      try {
         ++field1040;
         synchronized(this) {
            if (class785.field11468) {
               return;
            }

            class785.field11468 = arg1;
         }

         System.out.println(field1079[20] + arg0);
         if (class126.field1586 != null) {
            class126.field1586.destroy();
         }

         try {
            this.method798((byte)31);
         } catch (Exception var10) {
         }

         if (this.field1028) {
            try {
               jagmisc.quit();
            } catch (Throwable var9) {
            }

            this.field1028 = false;
         }

         class629.method4574(-1, true);
         class312.method2344((byte)114);
         if (class204.field2515 != null) {
            try {
               class204.field2515.removeFocusListener(this);
               class204.field2515.getParent().remove(class204.field2515);
            } catch (Exception var8) {
            }
         }

         if (class61.field671 != null) {
            try {
               class61.field671.method1954(-87);
            } catch (Exception var7) {
            }
         }

         this.method806(92);
         if (class533.field7289 != null) {
            class533.field7289.setVisible(false);
            class533.field7289.dispose();
            class533.field7289 = null;
         }

         System.out.println(field1079[21] + arg0);
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field1079[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         ++field1029;
         if (class186.field2284 == this && !class785.field11468) {
            class604.field8416 = true;
            if (class359.field5118 && ~(-class394.field5564 + class792.method5708(-25005)) < -1001L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || ~var2.width <= ~class682.field10003 && ~class434.field6038 >= ~var2.height) {
                  class101.field1308 = true;
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1079[19] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public final void method802(String arg0, byte arg1) {
      try {
         if (arg1 < 11) {
            field1057 = 127;
         }

         ++field1024;
         if (!this.field1030) {
            this.field1030 = true;
            System.out.println(field1079[65] + arg0);

            try {
               class164.method1307(-22955, class126.field1586, field1079[64]);
            } catch (Throwable var5) {
            }

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), field1079[65] + arg0 + field1079[61]), field1079[63]);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1079[62] + (arg0 != null ? field1079[3] : field1079[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4273;

      try {
         ++field1026;

         try {
            if (class255.field3263 != null) {
               label517: {
                  String var2 = class255.field3263.toLowerCase();
                  if (~var2.indexOf(field1079[34]) == 0 && var2.indexOf(field1079[40]) == -1) {
                     if (var2.indexOf(field1079[33]) == -1 || class255.field3258 != null && !class255.field3258.equals(field1079[41])) {
                        break label517;
                     }

                     this.method802(field1079[32], (byte)92);
                     if (!var1) {
                        return;
                     }
                  }

                  String var3 = class255.field3258;
                  if (var3.equals(field1079[42]) || var3.startsWith(field1079[35]) || var3.equals(field1079[38]) || var3.startsWith(field1079[36])) {
                     this.method802(field1079[32], (byte)103);
                     if (!var1) {
                        return;
                     }
                  }
               }
            }

            int var10000;
            if (class255.field3258 != null && class255.field3258.startsWith(field1079[37])) {
               label525: {
                  int var4 = 2;
                  int var5 = 0;
                  if (var1) {
                     var10000 = class255.field3258.charAt(var4);
                  } else if (~var4 <= ~class255.field3258.length()) {
                     var10000 = var5;
                     if (!var1) {
                        if (var5 >= 5) {
                           class359.field5118 = true;
                        }
                        break label525;
                     }
                  } else {
                     var10000 = class255.field3258.charAt(var4);
                  }

                  label485:
                  while(true) {
                     while(true) {
                        while(true) {
                           int var6 = var10000;
                           if (var6 >= 48) {
                              if (var6 > 57) {
                                 if (!var1) {
                                    var10000 = var5;
                                    if (!var1) {
                                       if (var5 >= 5) {
                                          class359.field5118 = true;
                                       }
                                       break label485;
                                    }
                                    continue;
                                 }

                                 ++var4;
                                 var5 = var5 * 10 - (-var6 + 48);
                              } else {
                                 ++var4;
                                 var5 = var5 * 10 - (-var6 + 48);
                              }

                              if (~var4 <= ~class255.field3258.length()) {
                                 var10000 = var5;
                                 if (!var1) {
                                    if (var5 >= 5) {
                                       class359.field5118 = true;
                                    }
                                    break label485;
                                 }
                              } else {
                                 var10000 = class255.field3258.charAt(var4);
                              }
                           } else {
                              var10000 = var5;
                              if (!var1) {
                                 if (var5 >= 5) {
                                    class359.field5118 = true;
                                 }
                                 break label485;
                              }
                           }
                        }
                     }
                  }
               }
            }

            Applet var7 = class186.field2284;
            if (class126.field1586 != null) {
               var7 = class126.field1586;
            }

            Method var8 = class255.field3247;
            if (var8 != null) {
               try {
                  var8.invoke(var7, Boolean.TRUE);
               } catch (Throwable var21) {
               }
            }

            class674.method4939(-9);
            class539.method3893(0);
            this.method810(false);
            this.method814(113);
            class770.field11094 = class445.method3302((byte)-64);
            int var9;
            if (var1) {
               class342.field4899 = class770.field11094.method1471(0, class770.field11093);
               var9 = 0;
               if (var1) {
                  this.method807((byte)-9);
                  ++var9;
               }
            } else if (~class223.field2775 != -1L) {
               long var26;
               var10000 = (var26 = ~class223.field2775 - ~class792.method5708(-25005)) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (!var1) {
                  if (var10000 >= 0) {
                     return;
                  }

                  class342.field4899 = class770.field11094.method1471(0, class770.field11093);
                  var9 = 0;
                  if (var1) {
                     this.method807((byte)-9);
                     ++var9;
                  }
               } else {
                  var9 = var10000;
                  if (var1) {
                     this.method807((byte)-9);
                     ++var9;
                  }
               }
            } else {
               class342.field4899 = class770.field11094.method1471(0, class770.field11093);
               var9 = 0;
               if (var1) {
                  this.method807((byte)-9);
                  ++var9;
               }
            }

            while(true) {
               while(class342.field4899 > var9) {
                  this.method807((byte)-9);
                  ++var9;
               }

               this.method813(8538);
               if (!var1) {
                  class219.method1660(-27299, class61.field671, class204.field2515);
                  if (~class223.field2775 != -1L) {
                     long var27;
                     var10000 = (var27 = ~class223.field2775 - ~class792.method5708(-25005)) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                     if (!var1) {
                        if (var10000 >= 0) {
                           break;
                        }

                        class342.field4899 = class770.field11094.method1471(0, class770.field11093);
                        var9 = 0;
                        if (var1) {
                           this.method807((byte)-9);
                           ++var9;
                        }
                     } else {
                        var9 = var10000;
                        if (var1) {
                           this.method807((byte)-9);
                           ++var9;
                        }
                     }
                  } else {
                     class342.field4899 = class770.field11094.method1471(0, class770.field11093);
                     var9 = 0;
                     if (var1) {
                        this.method807((byte)-9);
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
            class106.method940(this.method804(-12281), var23, (byte)-33);
            this.method802(field1079[10], (byte)90);
         } finally {
            Object var15 = null;
            this.method801(true, true);
         }

      } catch (RuntimeException var25) {
         throw class534.method3846(var25, field1079[39] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method803(byte arg0);

   @OriginalMember(
      owner = "client!aw",
      name = "g",
      descriptor = "(I)Ljava/lang/String;"
   )
   public String method804(int arg0) {
      try {
         if (arg0 != -12281) {
            this.field1030 = true;
         }

         ++field1048;
         return null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "stop",
      descriptor = "()V"
   )
   public final void stop() {
      try {
         ++field1055;
         if (class186.field2284 == this && !class785.field11468) {
            class223.field2775 = 4000L + class792.method5708(-25005);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1079[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "client!aw",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeiconified(WindowEvent arg0) {
      try {
         ++field1051;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[27] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         ++field1054;
         this.destroy();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[15] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         this.paint(arg0);
         ++field1027;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[26] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "h",
      descriptor = "(I)V"
   )
   public abstract void method805(int arg0);

   @OriginalMember(
      owner = "client!aw",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method806(int arg0);

   @OriginalMember(
      owner = "client!aw",
      name = "provideLoaderApplet",
      descriptor = "(Ljava/applet/Applet;)V"
   )
   public static final void provideLoaderApplet(Applet arg0) {
      try {
         ++field1050;
         class126.field1586 = arg0;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1079[25] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method807(byte arg0) {
      try {
         if (arg0 == -9) {
            ++field1052;
            long var2 = class792.method5708(-25005);
            long var4 = class125.field1562[class676.field9921];
            class125.field1562[class676.field9921] = var2;
            class676.field9921 = 31 & class676.field9921 + 1;
            boolean var10000;
            if (var4 != 0L && ~var4 > ~var2) {
               var10000 = true;
            } else {
               var10000 = false;
            }

            synchronized(this) {
               class308.field4094 = class595.field8294;
            }

            this.method805(1428854857);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1079[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method808(int arg0) {
      try {
         field1023 = null;
         int var1 = -121 % ((arg0 - -54) / 52);
         field1037 = null;
         field1056 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         class595.field8294 = true;
         ++field1043;
         class604.field8416 = true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[43] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(ILjava/lang/String;IIIII)V"
   )
   public final void method809(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         ++field1025;

         try {
            if (class186.field2284 != null) {
               ++class683.field10025;
               if (~class683.field10025 <= -4) {
                  this.method802(field1079[9], (byte)40);
               } else {
                  this.getAppletContext().showDocument(this.getDocumentBase(), field1079[12]);
               }
            } else {
               class439.field6098 = class126.field1586;
               class41.field479 = arg4;
               class434.field6038 = arg4;
               class186.field2284 = this;
               class682.field10009 = 0;
               if (arg5 != -4) {
                  this.windowIconified((WindowEvent)null);
               }

               class252.field3194 = arg6;
               class682.field10003 = arg6;
               class477.field6594 = arg0;
               class322.field4298 = 0;
               class648.field9092 = class61.field671 = new class255(arg3, arg1, arg2, class126.field1586 != null);
               class289 var9 = class61.field671.method1956(this, arg5 + -76, 1);
               if (var8) {
                  class173.method1347(99, 10L);
               }

               while(var9.field3826 == 0) {
                  class173.method1347(99, 10L);
               }

            }
         } catch (Throwable var12) {
            class106.method940((String)null, var12, (byte)-33);
            this.method802(field1079[10], (byte)50);
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field1079[11] + arg0 + ',' + (arg1 != null ? field1079[3] : field1079[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(Z)V"
   )
   public synchronized void method810(boolean arg0) {
      boolean var2 = client.field4273;

      try {
         if (class204.field2515 != null) {
            class204.field2515.removeFocusListener(this);
            class204.field2515.getParent().setBackground(Color.black);
            class204.field2515.getParent().remove(class204.field2515);
         }

         Container var3;
         label47: {
            ++field1049;
            if (class85.field1098 != null) {
               var3 = class85.field1098;
               if (!var2) {
                  break label47;
               }
            }

            if (class533.field7289 != null) {
               var3 = class533.field7289;
               if (!var2) {
                  break label47;
               }
            }

            if (class126.field1586 == null) {
               var3 = class186.field2284;
               if (!var2) {
                  break label47;
               }
            }

            var3 = class126.field1586;
         }

         label28: {
            var3.setLayout((LayoutManager)null);
            class204.field2515 = new class489(this);
            var3.add(class204.field2515);
            class204.field2515.setSize(class252.field3194, class41.field479);
            class204.field2515.setVisible(true);
            if (class533.field7289 == var3) {
               Insets var4 = class533.field7289.getInsets();
               class204.field2515.setLocation(class322.field4298 + var4.left, var4.top - -class682.field10009);
               if (!var2) {
                  break label28;
               }
            }

            class204.field2515.setLocation(class322.field4298, class682.field10009);
         }

         class204.field2515.addFocusListener(this);
         class204.field2515.requestFocus();
         class308.field4094 = true;
         class595.field8294 = true;
         class604.field8416 = true;
         class101.field1308 = arg0;
         class394.field5564 = class792.method5708(-25005);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1079[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "start",
      descriptor = "()V"
   )
   public final void start() {
      try {
         ++field1031;
         if (class186.field2284 == this && !class785.field11468) {
            class223.field2775 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1079[60] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method811(boolean arg0) {
      boolean var2 = client.field4273;

      try {
         ++field1041;
         String var3 = this.getDocumentBase().getHost().toLowerCase();
         if (!var3.equals(field1079[50]) && !var3.endsWith(field1079[52])) {
            if (!var3.equals(field1079[51]) && !var3.endsWith(field1079[53])) {
               if (!var3.equals(field1079[55]) && !var3.endsWith(field1079[56])) {
                  if (arg0) {
                     return false;
                  } else if (var3.endsWith(field1079[57])) {
                     return true;
                  } else {
                     char var10000;
                     while(true) {
                        if (~var3.length() < -1) {
                           var10000 = var3.charAt(-1 + var3.length());
                           if (var2) {
                              break;
                           }

                           if (var10000 >= '0' && ~var3.charAt(var3.length() + -1) >= -58) {
                              var3 = var3.substring(0, -1 + var3.length());
                              continue;
                           }
                        }

                        var10000 = var3.endsWith(field1079[49]);
                        break;
                     }

                     if (var10000 != 0) {
                        return true;
                     } else {
                        this.method802(field1079[54], (byte)120);
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
         throw class534.method3846(var5, field1079[58] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(IIILjava/lang/String;IIIZ)V"
   )
   public final void method812(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, boolean arg7) {
      boolean var9 = client.field4273;

      try {
         try {
            class41.field479 = arg0;
            class434.field6038 = arg0;
            class186.field2284 = this;
            class322.field4298 = arg6;
            class682.field10009 = 0;
            class252.field3194 = arg2;
            class682.field10003 = arg2;
            class439.field6098 = null;
            class477.field6594 = arg1;
            class533.field7289 = new Frame();
            class533.field7289.setTitle(field1079[48]);
            class533.field7289.setResizable(true);
            class533.field7289.addWindowListener(this);
            class533.field7289.setVisible(true);
            class533.field7289.toFront();
            Insets var10 = class533.field7289.getInsets();
            class533.field7289.setSize(var10.right + var10.left + class682.field10003, class434.field6038 - -var10.top + var10.bottom);
            class648.field9092 = class61.field671 = new class255(arg5, arg3, arg4, true);
            class289 var11 = class61.field671.method1956(this, arg6 + -103, 1);
            if (var9) {
               class173.method1347(arg6 ^ -123, 10L);
            }

            while(~var11.field3826 == -1) {
               class173.method1347(arg6 ^ -123, 10L);
            }
         } catch (Exception var14) {
            class106.method940((String)null, var14, (byte)-33);
         }

         ++field1039;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field1079[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1079[3] : field1079[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowIconified(WindowEvent arg0) {
      try {
         ++field1044;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[14] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getDocumentBase() {
      try {
         ++field1038;
         if (class533.field7289 != null) {
            return null;
         } else {
            return class126.field1586 != null && class126.field1586 != this ? class126.field1586.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1079[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method813(int arg0) {
      try {
         ++field1032;
         long var2 = class792.method5708(-25005);
         long var4 = class480.field6637[class288.field3820];
         class480.field6637[class288.field3820] = var2;
         if (~var4 != -1L && ~var4 > ~var2) {
            int var6 = (int)(-var4 + var2);
            class118.field1444 = ((var6 >> 1) + 32000) / var6;
         }

         class288.field3820 = 31 & class288.field3820 + 1;
         if (~(class33.field390++) < -51) {
            label39: {
               class604.field8416 = true;
               class33.field390 -= 50;
               class204.field2515.setSize(class252.field3194, class41.field479);
               class204.field2515.setVisible(true);
               if (class533.field7289 == null || class85.field1098 != null) {
                  class204.field2515.setLocation(class322.field4298, class682.field10009);
                  if (!client.field4273) {
                     break label39;
                  }
               }

               Insets var7 = class533.field7289.getInsets();
               class204.field2515.setLocation(class322.field4298 + var7.left, class682.field10009 + var7.top);
            }
         }

         if (arg0 == 8538) {
            this.method803((byte)99);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1079[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosed(WindowEvent arg0) {
      try {
         ++field1035;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[13] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method814(int arg0);

   @OriginalMember(
      owner = "client!aw",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         class595.field8294 = false;
         ++field1046;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[16] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowOpened(WindowEvent arg0) {
      try {
         ++field1022;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[7] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
   )
   public final String getParameter(String arg0) {
      try {
         ++field1059;
         if (class533.field7289 != null) {
            return null;
         } else {
            return class126.field1586 != null && class126.field1586 != this ? class126.field1586.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1079[5] + (arg0 != null ? field1079[3] : field1079[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method815(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method816(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
