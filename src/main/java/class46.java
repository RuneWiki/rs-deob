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

@OriginalClass("client!lga")
public abstract class class46 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "client!lga",
      name = "S",
      descriptor = "Z"
   )
   private boolean field674 = false;
   @OriginalMember(
      owner = "client!lga",
      name = "u",
      descriptor = "Z"
   )
   private boolean field692 = false;
   @OriginalMember(
      owner = "client!lga",
      name = "db",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field722 = new String[]{method525(method524("\u0018?>%\u0013\u0010")), method525(method524("\u001e9<g63v")), method525(method524("\u001c+1%")), method525(method524("\tpsg\u0007")), method525(method524("\u001e9<g\n\u001373=R")), method525(method524("\u001e9<g\u001c\u001d=(:=\u001373,\u001eZ")), method525(method524("\u001e9<g43v")), method525(method524("\u001e9<g\r\u001b09&\r122:\u001f\u0016v")), method525(method524("\u001e9<g\r\u001b09&\r122:\u0013\u001c9u")), method525(method524("\u001e9<g93v")), method525(method524("!6(=\u001e\u001d)3i\t\u0006?/=Z_~>%\u001f\u00130g")), method525(method524("!6(=\u001e\u001d)3i\u0019\u001d3-%\u001f\u0006;}dZ\u001128(\u0014H")), method525(method524("\u001e9<g03v")), method525(method524("\u001e9<g\r\u001b09&\r6;4*\u0015\u001c7; \u001f\u0016v")), method525(method524("\u001e9<g<3v")), method525(method524("\u0018?:$\u0013\u0001=")), method525(method524("\u001e9<g\u001d\u0017*\u0019&\u0019\u000738'\u000e0?.,R")), method525(method524("\u0017,/&\b-9<$\u001f-")), method525(method524("\\).")), method525(method524("\u001e1:.\u001f\u00161(=")), method525(method524("\u001e9<g13v")), method525(method524("-*29")), method525(method524("\u001e9<g\u000f\u0002:<=\u001fZ")), method525(method524("\u001e9<g23v")), method525(method524("--8%\u001c")), method525(method524("\u0011,<:\u0012")), method525(method524("\u00132/,\u001b\u0016'1&\u001b\u0016;9")), method525(method524("\\-),\u0016\u001e?/-\u001b\u00050s*\u0015\u001f")), method525(method524("\u0000+3,\t\u0011?-,T\u001110")), method525(method524("\\4<.\u001f\np>&\u0017")), method525(method524("\u001b0+(\u0016\u001b:5&\t\u0006")), method525(method524("\u0001*8%\u0016\u0013,9(\r\u001cp>&\u0017")), method525(method524("CljgJ\\nsx")), method525(method524("\u001e9<g33v")), method525(method524("CgogKDfsxT")), method525(method524("\\,('\u001f\u0001=<9\u001f\\=2$")), method525(method524("\u0018?:,\u0002\\=2$")), method525(method524("\u001e9<g\u001d\u0017*\u001c9\n\u001e;)\n\u0015\u001c*81\u000eZ")), method525(method524("8?:,\u0002")), method525(method524("\u001e9<g=3v")), method525(method524("\u001e9<g7Z")), method525(method524("\u001e9<g\t\u0006?/=R")), method525(method524("\u001e9<g6Z")), method525(method524("\u001e9<g\r\u001b09&\r;=2'\u0013\u001478-R")), method525(method524("\u001e9<g\u001c\u001d=(:6\u001d-)a")), method525(method524("\u001e9<g\u001e\u0017-);\u0015\u000bv")), method525(method524("Cpo")), method525(method524("\u0013.-%\u001f")), method525(method524("\u0001+3")), method525(method524("Cp")), method525(method524("CpigH")), method525(method524("Cpl")), method525(method524("\u001e9<g\b\u00070u")), method525(method524("\u001b<0")), method525(method524("Cplg")), method525(method524("Cpog")), method525(method524("\u0005,2'\u001d\u0018?+(")), method525(method524("\u001e9<g?3v")), method525(method524("\u001e9<g\r\u001b09&\r=.8'\u001f\u0016v")), method525(method524("\u001e9<g73v")), method525(method524("\u001e9<g\u001d\u0017*\r(\b\u001338=\u001f\u0000v")), method525(method524("\u001e9<g\r\u001b09&\r3=) \f\u0013*8-R")), method525(method524("\u001e9<g\r\u001b09&\r6;<*\u000e\u001b(<=\u001f\u0016v")), method525(method524("\u001e9<g\n\u00001+ \u001e\u0017\u00122(\u001e\u0017,\u001c9\n\u001e;)a")), method525(method524("\u0018?:=\u0012\u00171/(")), method525(method524("\u001e9<g>3v")), method525(method524("\u001e9<g\t\u00061-a"))};
   @OriginalMember(
      owner = "client!lga",
      name = "N",
      descriptor = "Lhha;"
   )
   public static class724 field688 = new class724(18, 2);
   @OriginalMember(
      owner = "client!lga",
      name = "j",
      descriptor = "I"
   )
   public static int field667;
   @OriginalMember(
      owner = "client!lga",
      name = "k",
      descriptor = "I"
   )
   public static int field668;
   @OriginalMember(
      owner = "client!lga",
      name = "h",
      descriptor = "I"
   )
   public static int field669;
   @OriginalMember(
      owner = "client!lga",
      name = "O",
      descriptor = "I"
   )
   public static int field670;
   @OriginalMember(
      owner = "client!lga",
      name = "P",
      descriptor = "I"
   )
   public static int field671;
   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "I"
   )
   public static int field672;
   @OriginalMember(
      owner = "client!lga",
      name = "Y",
      descriptor = "I"
   )
   public static int field673;
   @OriginalMember(
      owner = "client!lga",
      name = "F",
      descriptor = "I"
   )
   public static int field675;
   @OriginalMember(
      owner = "client!lga",
      name = "I",
      descriptor = "I"
   )
   public static int field676;
   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "I"
   )
   public static int field677;
   @OriginalMember(
      owner = "client!lga",
      name = "o",
      descriptor = "I"
   )
   public static int field678;
   @OriginalMember(
      owner = "client!lga",
      name = "t",
      descriptor = "I"
   )
   public static int field679;
   @OriginalMember(
      owner = "client!lga",
      name = "M",
      descriptor = "I"
   )
   public static int field680;
   @OriginalMember(
      owner = "client!lga",
      name = "s",
      descriptor = "I"
   )
   public static int field681;
   @OriginalMember(
      owner = "client!lga",
      name = "g",
      descriptor = "I"
   )
   public static int field682;
   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "I"
   )
   public static int field683;
   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "I"
   )
   public static int field684;
   @OriginalMember(
      owner = "client!lga",
      name = "i",
      descriptor = "I"
   )
   public static int field685;
   @OriginalMember(
      owner = "client!lga",
      name = "X",
      descriptor = "I"
   )
   public static int field686;
   @OriginalMember(
      owner = "client!lga",
      name = "U",
      descriptor = "I"
   )
   public static int field687;
   @OriginalMember(
      owner = "client!lga",
      name = "p",
      descriptor = "I"
   )
   public static int field689;
   @OriginalMember(
      owner = "client!lga",
      name = "R",
      descriptor = "I"
   )
   public static int field690;
   @OriginalMember(
      owner = "client!lga",
      name = "n",
      descriptor = "I"
   )
   public static int field691;
   @OriginalMember(
      owner = "client!lga",
      name = "bb",
      descriptor = "I"
   )
   public static int field693;
   @OriginalMember(
      owner = "client!lga",
      name = "r",
      descriptor = "I"
   )
   public static int field694;
   @OriginalMember(
      owner = "client!lga",
      name = "A",
      descriptor = "I"
   )
   public static int field695;
   @OriginalMember(
      owner = "client!lga",
      name = "Z",
      descriptor = "I"
   )
   public static int field696;
   @OriginalMember(
      owner = "client!lga",
      name = "K",
      descriptor = "I"
   )
   public static int field697;
   @OriginalMember(
      owner = "client!lga",
      name = "B",
      descriptor = "I"
   )
   public static int field698;
   @OriginalMember(
      owner = "client!lga",
      name = "w",
      descriptor = "I"
   )
   public static int field699;
   @OriginalMember(
      owner = "client!lga",
      name = "J",
      descriptor = "I"
   )
   public static int field700;
   @OriginalMember(
      owner = "client!lga",
      name = "m",
      descriptor = "I"
   )
   public static int field701;
   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "I"
   )
   public static int field702;
   @OriginalMember(
      owner = "client!lga",
      name = "x",
      descriptor = "I"
   )
   public static int field709;
   @OriginalMember(
      owner = "client!lga",
      name = "H",
      descriptor = "I"
   )
   public static int field714;
   @OriginalMember(
      owner = "client!lga",
      name = "Q",
      descriptor = "I"
   )
   public static int field717;
   @OriginalMember(
      owner = "client!lga",
      name = "l",
      descriptor = "I"
   )
   public static int field721;
   @OriginalMember(
      owner = "client!lga",
      name = "G",
      descriptor = "Z"
   )
   public static boolean field703;
   @OriginalMember(
      owner = "client!lga",
      name = "E",
      descriptor = "Z"
   )
   public static boolean field704;
   @OriginalMember(
      owner = "client!lga",
      name = "V",
      descriptor = "Z"
   )
   public static boolean field705;
   @OriginalMember(
      owner = "client!lga",
      name = "T",
      descriptor = "Z"
   )
   public static boolean field706;
   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field707;
   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field708;
   @OriginalMember(
      owner = "client!lga",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field710;
   @OriginalMember(
      owner = "client!lga",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field711;
   @OriginalMember(
      owner = "client!lga",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field712;
   @OriginalMember(
      owner = "client!lga",
      name = "C",
      descriptor = "Z"
   )
   public static boolean field713;
   @OriginalMember(
      owner = "client!lga",
      name = "ab",
      descriptor = "Z"
   )
   public static boolean field715;
   @OriginalMember(
      owner = "client!lga",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field716;
   @OriginalMember(
      owner = "client!lga",
      name = "W",
      descriptor = "Z"
   )
   public static boolean field718;
   @OriginalMember(
      owner = "client!lga",
      name = "cb",
      descriptor = "Z"
   )
   public static boolean field719;
   @OriginalMember(
      owner = "client!lga",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field720;

   @OriginalMember(
      owner = "client!lga",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field668;
         class765.field10968 = true;
         class127.field2045 = true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[5] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field10022;

      try {
         ++field676;

         try {
            if (class82.field1284 != null) {
               label509: {
                  String var2 = class82.field1284.toLowerCase();
                  if (~var2.indexOf(field722[48]) != 0 || ~var2.indexOf(field722[47]) != 0) {
                     String var3 = class82.field1266;
                     if (!var3.equals(field722[51]) && !var3.startsWith(field722[54]) && !var3.equals(field722[46]) && !var3.startsWith(field722[55])) {
                        break label509;
                     }

                     this.method520(field722[56], (byte)127);
                     if (!var1) {
                        return;
                     }
                  }

                  if (var2.indexOf(field722[53]) != -1 && (class82.field1266 == null || class82.field1266.equals(field722[50]))) {
                     this.method520(field722[56], (byte)96);
                     if (!var1) {
                        return;
                     }
                  }
               }
            }

            int var10000;
            if (class82.field1266 != null && class82.field1266.startsWith(field722[49])) {
               label506: {
                  int var4 = 2;
                  int var5 = 0;
                  if (var1) {
                     var10000 = class82.field1266.charAt(var4);
                  } else if (var4 >= class82.field1266.length()) {
                     var10000 = var5;
                     if (!var1) {
                        if (var5 >= 5) {
                           class459.field6699 = true;
                        }
                        break label506;
                     }
                  } else {
                     var10000 = class82.field1266.charAt(var4);
                  }

                  label467:
                  while(true) {
                     while(true) {
                        int var6 = var10000;
                        if (~var6 <= -49) {
                           if (var6 <= 57) {
                              ++var4;
                              var5 = var5 * 10 - (-var6 + 48);
                              if (var4 >= class82.field1266.length()) {
                                 var10000 = var5;
                                 if (!var1) {
                                    if (var5 >= 5) {
                                       class459.field6699 = true;
                                    }
                                    break label467;
                                 }
                              } else {
                                 var10000 = class82.field1266.charAt(var4);
                              }
                           } else {
                              var10000 = var5;
                              if (!var1) {
                                 if (var5 >= 5) {
                                    class459.field6699 = true;
                                 }
                                 break label467;
                              }
                           }
                        } else {
                           var10000 = var5;
                           if (!var1) {
                              if (var5 >= 5) {
                                 class459.field6699 = true;
                              }
                              break label467;
                           }
                        }
                     }
                  }
               }
            }

            Applet var7 = class65.field898;
            if (class289.field4303 != null) {
               var7 = class289.field4303;
            }

            Method var8 = class82.field1286;
            if (var8 != null) {
               try {
                  var8.invoke(var7, Boolean.TRUE);
               } catch (Throwable var21) {
               }
            }

            class150.method1465((byte)76);
            class33.method383(98);
            this.method506(false);
            this.method517(40000);
            class657.field9292 = class384.method2993(5);
            int var9;
            if (var1) {
               class177.field2618 = class657.field9292.method4363(2048, class571.field8095);
               var9 = 0;
               if (var1) {
                  this.method511(-119);
                  ++var9;
               }
            } else if (class587.field8241 != 0L) {
               long var26;
               var10000 = (var26 = class604.method4452(-119) - class587.field8241) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (!var1) {
                  if (var10000 >= 0) {
                     return;
                  }

                  class177.field2618 = class657.field9292.method4363(2048, class571.field8095);
                  var9 = 0;
                  if (var1) {
                     this.method511(-119);
                     ++var9;
                  }
               } else {
                  var9 = var10000;
                  if (var1) {
                     this.method511(-119);
                     ++var9;
                  }
               }
            } else {
               class177.field2618 = class657.field9292.method4363(2048, class571.field8095);
               var9 = 0;
               if (var1) {
                  this.method511(-119);
                  ++var9;
               }
            }

            while(true) {
               while(class177.field2618 > var9) {
                  this.method511(-119);
                  ++var9;
               }

               this.method516(false);
               if (!var1) {
                  class19.method267(class729.field10389, class720.field10318, (byte)-38);
                  if (class587.field8241 != 0L) {
                     long var27;
                     var10000 = (var27 = class604.method4452(-119) - class587.field8241) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                     if (!var1) {
                        if (var10000 >= 0) {
                           break;
                        }

                        class177.field2618 = class657.field9292.method4363(2048, class571.field8095);
                        var9 = 0;
                        if (var1) {
                           this.method511(-119);
                           ++var9;
                        }
                     } else {
                        var9 = var10000;
                        if (var1) {
                           this.method511(-119);
                           ++var9;
                        }
                     }
                  } else {
                     class177.field2618 = class657.field9292.method4363(2048, class571.field8095);
                     var9 = 0;
                     if (var1) {
                        this.method511(-119);
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
            class117.method1138(-123, this.method510((byte)103), var23);
            this.method520(field722[25], (byte)102);
         } finally {
            Object var15 = null;
            this.method509(31770, true);
         }

      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field722[52] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "start",
      descriptor = "()V"
   )
   public final void start() {
      try {
         ++field682;
         if (class65.field898 == this && !class377.field5509) {
            class587.field8241 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field722[41] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         ++field701;
         if (class65.field898 == this && !class377.field5509) {
            class127.field2045 = true;
            if (class459.field6699 && ~(-class352.field5214 + class604.method4452(-107)) < -1001L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || class91.field1368 <= var2.width && var2.height >= class223.field3171) {
                  class784.field11418 = true;
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field722[4] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method505(boolean arg0) {
      try {
         if (arg0) {
            this.field692 = false;
         }

         ++field698;
         return class354.method2785(field722[64], -107);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         this.destroy();
         ++field683;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[8] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "(Z)V"
   )
   public synchronized void method506(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         ++field687;
         if (class729.field10389 != null) {
            class729.field10389.removeFocusListener(this);
            class729.field10389.getParent().setBackground(Color.black);
            class729.field10389.getParent().remove(class729.field10389);
         }

         Container var3;
         label46: {
            if (class687.field9907 != null) {
               var3 = class687.field9907;
               if (!var2) {
                  break label46;
               }
            }

            if (class800.field11642 == null) {
               if (class289.field4303 != null) {
                  var3 = class289.field4303;
                  if (!var2) {
                     break label46;
                  }
               }

               var3 = class65.field898;
               if (!var2) {
                  break label46;
               }
            }

            var3 = class800.field11642;
         }

         label28: {
            var3.setLayout((LayoutManager)null);
            class729.field10389 = new class781(this);
            var3.add(class729.field10389);
            class729.field10389.setSize(class557.field7909, class140.field2243);
            class729.field10389.setVisible(true);
            if (class800.field11642 == var3) {
               Insets var4 = class800.field11642.getInsets();
               class729.field10389.setLocation(var4.left - -class245.field3760, class541.field7634 + var4.top);
               if (!var2) {
                  break label28;
               }
            }

            class729.field10389.setLocation(class245.field3760, class541.field7634);
         }

         class729.field10389.addFocusListener(this);
         class729.field10389.requestFocus();
         class765.field10968 = true;
         class77.field1240 = true;
         class127.field2045 = true;
         class784.field11418 = arg0;
         class352.field5214 = class604.method4452(-114);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field722[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method507(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            field688 = null;
         }

         ++field670;
         return (arg2 & 2048) != 0 && (55 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field722[59] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "provideLoaderApplet",
      descriptor = "(Ljava/applet/Applet;)V"
   )
   public static final void provideLoaderApplet(Applet arg0) {
      try {
         class289.field4303 = arg0;
         ++field699;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field722[63] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
   )
   public final String getParameter(String arg0) {
      try {
         ++field685;
         if (class800.field11642 != null) {
            return null;
         } else {
            return class289.field4303 != null && class289.field4303 != this ? class289.field4303.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[60] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeactivated(WindowEvent arg0) {
      try {
         ++field694;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[62] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "client!lga",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowOpened(WindowEvent arg0) {
      try {
         ++field672;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[58] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         class765.field10968 = false;
         ++field681;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[44] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosed(WindowEvent arg0) {
      try {
         ++field696;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[7] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method508(byte arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method509(int arg0, boolean arg1) {
      try {
         ++field669;
         synchronized(this) {
            if (class377.field5509) {
               return;
            }

            class377.field5509 = true;
         }

         System.out.println(field722[10] + arg1);
         if (class289.field4303 != null) {
            class289.field4303.destroy();
         }

         try {
            this.method513(-38);
         } catch (Exception var10) {
         }

         if (arg0 != 31770) {
            this.stop();
         }

         if (this.field692) {
            try {
               jagmisc.quit();
            } catch (Throwable var9) {
            }

            this.field692 = false;
         }

         class422.method3290(true, (byte)-63);
         class591.method4346(125);
         if (class729.field10389 != null) {
            try {
               class729.field10389.removeFocusListener(this);
               class729.field10389.getParent().remove(class729.field10389);
            } catch (Exception var8) {
            }
         }

         if (class720.field10318 != null) {
            try {
               class720.field10318.method874((byte)-123);
            } catch (Exception var7) {
            }
         }

         this.method508((byte)-65);
         if (class800.field11642 != null) {
            class800.field11642.setVisible(false);
            class800.field11642.dispose();
            class800.field11642 = null;
         }

         System.out.println(field722[11] + arg1);
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field722[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(B)Ljava/lang/String;"
   )
   public String method510(byte arg0) {
      try {
         int var2 = 98 % ((arg0 - 38) / 60);
         ++field680;
         return null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field722[40] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method511(int arg0) {
      try {
         ++field700;
         long var2 = class604.method4452(3);
         long var4 = class732.field10410[class397.field5881];
         class732.field10410[class397.field5881] = var2;
         boolean var10000;
         if (~var4 != -1L && var4 < var2) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         class397.field5881 = 31 & class397.field5881 + 1;
         int var6 = -58 / ((-68 - arg0) / 35);
         synchronized(this) {
            class77.field1240 = class765.field10968;
         }

         this.method514(false);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field722[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method512(int arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method513(int arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method514(boolean arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         ++field684;
         this.paint(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[22] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowIconified(WindowEvent arg0) {
      try {
         ++field697;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[43] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIZLjava/lang/String;II)V"
   )
   public final void method515(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5, int arg6, int arg7) {
      boolean var9 = client.field10022;

      try {
         ++field675;

         try {
            class6.field91 = null;
            class65.field898 = this;
            class557.field7909 = arg0;
            class91.field1368 = arg0;
            class140.field2243 = arg3;
            class223.field3171 = arg3;
            class541.field7634 = 0;
            class245.field3760 = 0;
            class730.field10393 = arg2;
            if (arg6 != 14196) {
               this.field674 = false;
            }

            class800.field11642 = new Frame();
            class800.field11642.setTitle(field722[38]);
            class800.field11642.setResizable(true);
            class800.field11642.addWindowListener(this);
            class800.field11642.setVisible(true);
            class800.field11642.toFront();
            Insets var10 = class800.field11642.getInsets();
            class800.field11642.setSize(class91.field1368 - (-var10.right + -var10.left), var10.top + var10.bottom + class223.field3171);
            class578.field8153 = class720.field10318 = new class82(arg1, arg5, arg7, true);
            class92 var11 = class720.field10318.method883(1, this, arg6 + -14201);
            if (var9) {
               class97.method968(32353, 10L);
            }

            while(var11.field1526 == 0) {
               class97.method968(32353, 10L);
            }

         } catch (Exception var14) {
            class117.method1138(arg6 + -14082, (String)null, var14);
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field722[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field722[3] : field722[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "(Z)V"
   )
   private final void method516(boolean arg0) {
      try {
         ++field679;
         long var2 = class604.method4452(20);
         long var4 = class615.field8757[class7.field127];
         class615.field8757[class7.field127] = var2;
         if (arg0) {
            this.field692 = true;
         }

         if (~var4 != -1L && var2 > var4) {
            int var6 = (int)(-var4 + var2);
            class368.field5433 = ((var6 >> 1) + 32000) / var6;
         }

         class7.field127 = 31 & class7.field127 + 1;
         if (class313.field4706++ > 50) {
            label28: {
               class127.field2045 = true;
               class313.field4706 -= 50;
               class729.field10389.setSize(class557.field7909, class140.field2243);
               class729.field10389.setVisible(true);
               if (class800.field11642 != null && class687.field9907 == null) {
                  Insets var7 = class800.field11642.getInsets();
                  class729.field10389.setLocation(var7.left - -class245.field3760, class541.field7634 + var7.top);
                  if (!client.field10022) {
                     break label28;
                  }
               }

               class729.field10389.setLocation(class245.field3760, class541.field7634);
            }
         }

         this.method512(2);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field722[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeiconified(WindowEvent arg0) {
      try {
         ++field691;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[13] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getDocumentBase() {
      try {
         ++field693;
         if (class800.field11642 != null) {
            return null;
         } else {
            return class289.field4303 != null && class289.field4303 != this ? class289.field4303.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field722[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method517(int arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method518(int arg0) {
      try {
         ++field689;
         if (arg0 != 57) {
            this.windowOpened((WindowEvent)null);
         }

         return class354.method2785(field722[15], -106);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowActivated(WindowEvent arg0) {
      try {
         ++field695;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[61] + (arg0 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "destroy",
      descriptor = "()V"
   )
   public final void destroy() {
      try {
         ++field671;
         if (class65.field898 == this && !class377.field5509) {
            class587.field8241 = class604.method4452(59);
            class97.method968(32353, 5000L);
            class578.field8153 = null;
            this.method509(31770, false);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field722[45] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method519(int arg0) {
      try {
         ++field677;
         if (arg0 <= 47) {
            this.method510((byte)28);
         }

         return class354.method2785(field722[0], -127);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field722[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public final void method520(String arg0, byte arg1) {
      try {
         ++field686;
         if (!this.field674) {
            this.field674 = true;
            if (arg1 <= 91) {
               this.update((Graphics)null);
            }

            System.out.println(field722[17] + arg0);

            try {
               class726.method5254(120, class289.field4303, field722[19]);
            } catch (Throwable var5) {
            }

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), field722[17] + arg0 + field722[18]), field722[21]);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field722[20] + (arg0 != null ? field722[3] : field722[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "stop",
      descriptor = "()V"
   )
   public final void stop() {
      try {
         ++field673;
         if (class65.field898 == this && !class377.field5509) {
            class587.field8241 = 4000L + class604.method4452(48);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field722[66] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIBLjava/lang/String;)V"
   )
   public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, String arg6) {
      boolean var8 = client.field10022;

      try {
         ++field667;

         try {
            if (class65.field898 != null) {
               ++class566.field8049;
               if (class566.field8049 >= 3) {
                  this.method520(field722[26], (byte)113);
               } else {
                  this.getAppletContext().showDocument(this.getDocumentBase(), field722[24]);
               }
            } else {
               if (arg5 != -124) {
                  this.method510((byte)-11);
               }

               class6.field91 = class289.field4303;
               class140.field2243 = arg2;
               class223.field3171 = arg2;
               class557.field7909 = arg1;
               class91.field1368 = arg1;
               class541.field7634 = 0;
               class245.field3760 = 0;
               class730.field10393 = arg0;
               class65.field898 = this;
               class578.field8153 = class720.field10318 = new class82(arg4, arg6, arg3, class289.field4303 != null);
               class92 var9 = class720.field10318.method883(1, this, -5);
               if (var8 || var9.field1526 == 0) {
                  do {
                     class97.method968(arg5 ^ -32283, 10L);
                  } while(var9.field1526 == 0);

               }
            }
         } catch (Throwable var12) {
            class117.method1138(arg5 ^ 85, (String)null, var12);
            this.method520(field722[25], (byte)109);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field722[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field722[3] : field722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method522(boolean arg0) {
      try {
         field688 = null;
         if (!arg0) {
            field688 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field722[57] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method523(byte arg0) {
      boolean var2 = client.field10022;

      try {
         if (arg0 != 93) {
            return false;
         } else {
            ++field702;
            String var3 = this.getDocumentBase().getHost().toLowerCase();
            if (!var3.equals(field722[36]) && !var3.endsWith(field722[29])) {
               if (!var3.equals(field722[28]) && !var3.endsWith(field722[35])) {
                  if (!var3.equals(field722[31]) && !var3.endsWith(field722[27])) {
                     if (var3.endsWith(field722[32])) {
                        return true;
                     } else {
                        char var10000;
                        while(true) {
                           if (~var3.length() < -1) {
                              var10000 = var3.charAt(var3.length() + -1);
                              if (var2) {
                                 break;
                              }

                              if (var10000 >= '0' && var3.charAt(var3.length() + -1) <= '9') {
                                 var3 = var3.substring(0, -1 + var3.length());
                                 continue;
                              }
                           }

                           var10000 = var3.endsWith(field722[34]);
                           break;
                        }

                        if (var10000 != 0) {
                           return true;
                        } else {
                           this.method520(field722[30], (byte)123);
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
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field722[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getCodeBase() {
      ++field678;
      if (class800.field11642 != null) {
         return null;
      } else {
         return class289.field4303 != null && class289.field4303 != this ? class289.field4303.getCodeBase() : super.getCodeBase();
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;"
   )
   public final AppletContext getAppletContext() {
      try {
         ++field690;
         if (class800.field11642 != null) {
            return null;
         } else {
            return class289.field4303 != null && class289.field4303 != this ? class289.field4303.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field722[37] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method524(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method525(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
