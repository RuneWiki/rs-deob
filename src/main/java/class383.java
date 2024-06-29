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

@OriginalClass("client!rr")
public abstract class class383 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "client!rr",
      name = "db",
      descriptor = "Z"
   )
   private boolean field5510 = false;
   @OriginalMember(
      owner = "client!rr",
      name = "eb",
      descriptor = "Z"
   )
   private boolean field5530 = false;
   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5569 = new String[]{method2905(method2904("\"QhDK")), method2905(method2904(">V*f")), method2905(method2904("+\rh$\u001e")), method2905(method2904("\u001aB!o\u001b")), method2905(method2904("\"QhOK")), method2905(method2904("\"Qhl\f3V5M\u00029M#nK")), method2905(method2904("\"Qhz\u0011?U/n\u0006\u001cL'n\u0006\"b6z\u000f5Wn")), method2905(method2904("\"Qh}\n>G)} <L5o\u0007x")), method2905(method2904("\"Qhn\u0006#W4e\u001ax")), method2905(method2904("\"Qhm\u0006$b6z\u000f5W\u0005e\r$F>~K")), method2905(method2904("\"QhCK")), method2905(method2904(":B!g\n#@")), method2905(method2904("\"Qhm\u0006$s'x\u0002=F2o\u0011x")), method2905(method2904("a\r")), method2905(method2904("\"Qhx\u0016>\u000b")), method2905(method2904("a\rt$")), method2905(method2904("'Q)d\u0004:B0k")), method2905(method2904("a\rw")), method2905(method2904("a\rr$Q")), method2905(method2904("a\rw$")), method2905(method2904("9A+")), method2905(method2904("3Q'y\u000b")), method2905(method2904("1S6f\u0006")), method2905(method2904("#V(")), method2905(method2904("a\rt")), method2905(method2904(":B%f\n2")), method2905(method2904("\"QhLK")), method2905(method2904("\"QhZK")), method2905(method2904("\"Qh\u007f\u00134B2oK")), method2905(method2904("\"QhEK")), method2905(method2904("\u0003K3~\u0007?T(*\u0000?N6f\u0006$Ff'C3O#k\rj")), method2905(method2904("\u0003K3~\u0007?T(*\u0010$B4~C}\u0003%f\u00061M|")), method2905(method2904("\"QhBK")), method2905(method2904("\u000fP#f\u0005")), method2905(method2904("1O4o\u00024Z*e\u00024F\"")), method2905(method2904("\"QhGK")), method2905(method2904(":B!~\u000b5L4k")), method2905(method2904("\"Qh[K")), method2905(method2904("\"QhNK")), method2905(method2904("~Q3d\u0006#@'z\u0006~@)g")), method2905(method2904("a\u0011q$S~\u0013h;")), method2905(method2904("#W#f\u000f1Q\"k\u0014>\r%e\u000e")), method2905(method2904("9M0k\u000f9G.e\u0010$")), method2905(method2904("~P2o\u000f<B4n\u0002'Mhi\f=")), method2905(method2904("~I'm\u0006(\r%e\u000e")), method2905(method2904(":B!o\u001b~@)g")), method2905(method2904("a\u001at$Rf\u001bh;M")), method2905(method2904("\"V(o\u00103B6oM3L+")), method2905(method2904("\"Qhm\u0006$g)i\u0016=F(~!1P#\"")), method2905(method2904("\"Qh}\n>G)} <L5c\r7\u000b")), method2905(method2904("\"Qh}\n>G)}\"3W/|\u0002$F\"\"")), method2905(method2904("\"QhYK")), method2905(method2904("\"Qh}\n>G)}'5B%~\n&B2o\u0007x")), method2905(method2904("5Q4e\u0011\u000fD'g\u0006\u000f")), method2905(method2904("~T5")), method2905(method2904("<L!m\u00064L3~")), method2905(method2904("\"QhKK")), method2905(method2904("\u000fW)z")), method2905(method2904("\"Qhz\u00029M2\"")), method2905(method2904("\"Qhy\u00171Q2\"")), method2905(method2904("\"QhAK")), method2905(method2904("\"Qh}\n>G)}'5J%e\r9E/o\u0007x")), method2905(method2904("\"Qh}\n>G)}*3L(c\u00059F\"\"")), method2905(method2904("\"Qhy\u0017?Sn")), method2905(method2904("\"Qh}\n>G)}, F(o\u0007x")), method2905(method2904("\"Qhl\f3V5F\f#Wn")), method2905(method2904("\"QhIK"))};
   @OriginalMember(
      owner = "client!rr",
      name = "C",
      descriptor = "[F"
   )
   public static float[] field5517 = new float[16384];
   @OriginalMember(
      owner = "client!rr",
      name = "M",
      descriptor = "[F"
   )
   public static float[] field5529 = new float[16384];
   @OriginalMember(
      owner = "client!rr",
      name = "g",
      descriptor = "Leg;"
   )
   public static class118 field5549;
   @OriginalMember(
      owner = "client!rr",
      name = "t",
      descriptor = "I"
   )
   public static int field5511;
   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "I"
   )
   public static int field5512;
   @OriginalMember(
      owner = "client!rr",
      name = "F",
      descriptor = "I"
   )
   public static int field5513;
   @OriginalMember(
      owner = "client!rr",
      name = "i",
      descriptor = "I"
   )
   public static int field5514;
   @OriginalMember(
      owner = "client!rr",
      name = "I",
      descriptor = "I"
   )
   public static int field5515;
   @OriginalMember(
      owner = "client!rr",
      name = "fb",
      descriptor = "I"
   )
   public static int field5516;
   @OriginalMember(
      owner = "client!rr",
      name = "gb",
      descriptor = "I"
   )
   public static int field5518;
   @OriginalMember(
      owner = "client!rr",
      name = "E",
      descriptor = "I"
   )
   public static int field5519;
   @OriginalMember(
      owner = "client!rr",
      name = "bb",
      descriptor = "I"
   )
   public static int field5520;
   @OriginalMember(
      owner = "client!rr",
      name = "S",
      descriptor = "I"
   )
   public static int field5521;
   @OriginalMember(
      owner = "client!rr",
      name = "o",
      descriptor = "I"
   )
   public static int field5522;
   @OriginalMember(
      owner = "client!rr",
      name = "ab",
      descriptor = "I"
   )
   public static int field5523;
   @OriginalMember(
      owner = "client!rr",
      name = "f",
      descriptor = "I"
   )
   public static int field5524;
   @OriginalMember(
      owner = "client!rr",
      name = "l",
      descriptor = "I"
   )
   public static int field5525;
   @OriginalMember(
      owner = "client!rr",
      name = "s",
      descriptor = "I"
   )
   public static int field5526;
   @OriginalMember(
      owner = "client!rr",
      name = "hb",
      descriptor = "I"
   )
   public static int field5527;
   @OriginalMember(
      owner = "client!rr",
      name = "Z",
      descriptor = "I"
   )
   public static int field5528;
   @OriginalMember(
      owner = "client!rr",
      name = "T",
      descriptor = "I"
   )
   public static int field5531;
   @OriginalMember(
      owner = "client!rr",
      name = "H",
      descriptor = "I"
   )
   public static int field5532;
   @OriginalMember(
      owner = "client!rr",
      name = "y",
      descriptor = "I"
   )
   public static int field5533;
   @OriginalMember(
      owner = "client!rr",
      name = "G",
      descriptor = "I"
   )
   public static int field5534;
   @OriginalMember(
      owner = "client!rr",
      name = "D",
      descriptor = "I"
   )
   public static int field5535;
   @OriginalMember(
      owner = "client!rr",
      name = "d",
      descriptor = "I"
   )
   public static int field5536;
   @OriginalMember(
      owner = "client!rr",
      name = "e",
      descriptor = "I"
   )
   public static int field5537;
   @OriginalMember(
      owner = "client!rr",
      name = "n",
      descriptor = "I"
   )
   public static int field5538;
   @OriginalMember(
      owner = "client!rr",
      name = "h",
      descriptor = "I"
   )
   public static int field5539;
   @OriginalMember(
      owner = "client!rr",
      name = "Y",
      descriptor = "I"
   )
   public static int field5540;
   @OriginalMember(
      owner = "client!rr",
      name = "N",
      descriptor = "I"
   )
   public static int field5541;
   @OriginalMember(
      owner = "client!rr",
      name = "O",
      descriptor = "I"
   )
   public static int field5542;
   @OriginalMember(
      owner = "client!rr",
      name = "cb",
      descriptor = "I"
   )
   public static int field5544;
   @OriginalMember(
      owner = "client!rr",
      name = "K",
      descriptor = "I"
   )
   public static int field5545;
   @OriginalMember(
      owner = "client!rr",
      name = "V",
      descriptor = "I"
   )
   public static int field5546;
   @OriginalMember(
      owner = "client!rr",
      name = "u",
      descriptor = "I"
   )
   public static int field5547;
   @OriginalMember(
      owner = "client!rr",
      name = "m",
      descriptor = "I"
   )
   public static int field5548;
   @OriginalMember(
      owner = "client!rr",
      name = "p",
      descriptor = "I"
   )
   public static int field5551;
   @OriginalMember(
      owner = "client!rr",
      name = "w",
      descriptor = "I"
   )
   public static int field5553;
   @OriginalMember(
      owner = "client!rr",
      name = "q",
      descriptor = "I"
   )
   public static int field5554;
   @OriginalMember(
      owner = "client!rr",
      name = "r",
      descriptor = "I"
   )
   public static int field5557;
   @OriginalMember(
      owner = "client!rr",
      name = "j",
      descriptor = "I"
   )
   public static int field5559;
   @OriginalMember(
      owner = "client!rr",
      name = "W",
      descriptor = "I"
   )
   public static int field5561;
   @OriginalMember(
      owner = "client!rr",
      name = "x",
      descriptor = "I"
   )
   public static int field5565;
   @OriginalMember(
      owner = "client!rr",
      name = "X",
      descriptor = "I"
   )
   public static int field5568;
   @OriginalMember(
      owner = "client!rr",
      name = "U",
      descriptor = "Lha;"
   )
   public static class66 field5543;
   @OriginalMember(
      owner = "client!rr",
      name = "A",
      descriptor = "Z"
   )
   public static boolean field5550;
   @OriginalMember(
      owner = "client!rr",
      name = "B",
      descriptor = "Z"
   )
   public static boolean field5552;
   @OriginalMember(
      owner = "client!rr",
      name = "R",
      descriptor = "Z"
   )
   public static boolean field5555;
   @OriginalMember(
      owner = "client!rr",
      name = "J",
      descriptor = "Z"
   )
   public static boolean field5556;
   @OriginalMember(
      owner = "client!rr",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field5558;
   @OriginalMember(
      owner = "client!rr",
      name = "P",
      descriptor = "Z"
   )
   public static boolean field5560;
   @OriginalMember(
      owner = "client!rr",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field5562;
   @OriginalMember(
      owner = "client!rr",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5563;
   @OriginalMember(
      owner = "client!rr",
      name = "Q",
      descriptor = "Z"
   )
   public static boolean field5564;
   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field5566;
   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5567;

   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method2344(int arg0);

   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2892(byte arg0) {
      try {
         ++field5513;
         if (arg0 != 8) {
            field5517 = null;
         }

         return class715.method5188(-19503, field5569[36]);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         ++field5546;
         this.paint(arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[28] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method2893(int arg0) {
      try {
         ++field5533;
         long var2 = class133.method1054(-29025);
         long var4 = class401.field5811[class502.field7282];
         class401.field5811[class502.field7282] = var2;
         if (var4 != 0L && var4 < var2) {
            int var6 = (int)(-var4 + var2);
            class108.field1348 = ((var6 >> 1) + 32000) / var6;
         }

         class502.field7282 = class502.field7282 + 1 & 31;
         if (~(class617.field9100++) < -51) {
            label39: {
               class774.field11367 = true;
               class617.field9100 -= 50;
               class557.field7990.setSize(class237.field3310, class692.field10185);
               class557.field7990.setVisible(true);
               if (class549.field7865 == null || class326.field4414 != null) {
                  class557.field7990.setLocation(class150.field2097, class278.field3787);
                  if (!client.field4360) {
                     break label39;
                  }
               }

               Insets var7 = class549.field7865.getInsets();
               class557.field7990.setLocation(class150.field2097 + var7.left, class278.field3787 + var7.top);
            }
         }

         this.method2342(53);
         if (arg0 != -931810431) {
            this.windowClosed((WindowEvent)null);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5569[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "provideLoaderApplet",
      descriptor = "(Ljava/applet/Applet;)V"
   )
   public static final void provideLoaderApplet(Applet arg0) {
      try {
         ++field5541;
         class216.field3093 = arg0;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5569[6] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(IIZIILjava/lang/String;II)V"
   )
   public final void method2894(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
      boolean var9 = client.field4360;

      try {
         try {
            class362.field4931 = this;
            class229.field3230 = null;
            class150.field2097 = 0;
            class278.field3787 = 0;
            class237.field3310 = arg3;
            class79.field982 = arg3;
            class484.field6924 = arg1;
            class692.field10185 = arg7;
            class689.field10151 = arg7;
            class549.field7865 = new Frame();
            class549.field7865.setTitle(field5569[3]);
            class549.field7865.setResizable(true);
            class549.field7865.addWindowListener(this);
            class549.field7865.setVisible(true);
            class549.field7865.toFront();
            Insets var10 = class549.field7865.getInsets();
            class549.field7865.setSize(class79.field982 + var10.right + var10.left, var10.top + var10.bottom + class689.field10151);
            if (arg0 != -26972) {
               provideLoaderApplet((Applet)null);
            }

            class356.field4789 = class316.field4304 = new class619(arg4, arg5, arg6, true);
            class296 var11 = class316.field4304.method4504(this, 1, 0);
            if (var9) {
               class661.method4825(0, 10L);
            }

            while(~var11.field4078 == -1) {
               class661.method4825(0, 10L);
            }
         } catch (Exception var14) {
            class668.method4876(arg0 + 26880, (String)null, var14);
         }

         ++field5538;
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field5569[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5569[2] : field5569[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         ++field5521;
         class414.field5975 = false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[65] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getDocumentBase() {
      try {
         ++field5520;
         if (class549.field7865 != null) {
            return null;
         } else {
            return class216.field3093 != null && class216.field3093 != this ? class216.field3093.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5569[48] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "client!rr",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4360;

      try {
         ++field5522;

         try {
            if (class619.field9136 != null) {
               label499: {
                  String var2 = class619.field9136.toLowerCase();
                  if (~var2.indexOf(field5569[23]) == 0 && ~var2.indexOf(field5569[22]) == 0) {
                     if (var2.indexOf(field5569[20]) == -1 || class619.field9133 != null && !class619.field9133.equals(field5569[18])) {
                        break label499;
                     }

                     this.method2901(field5569[16], (byte)-94);
                     if (!var1) {
                        return;
                     }
                  }

                  String var3 = class619.field9133;
                  if (var3.equals(field5569[17]) || var3.startsWith(field5569[19]) || var3.equals(field5569[24]) || var3.startsWith(field5569[15])) {
                     this.method2901(field5569[16], (byte)-95);
                     if (!var1) {
                        return;
                     }
                  }
               }
            }

            int var10000;
            if (class619.field9133 != null && class619.field9133.startsWith(field5569[13])) {
               label506: {
                  int var4 = 2;
                  int var5 = 0;
                  if (var1) {
                     var10000 = class619.field9133.charAt(var4);
                  } else if (~var4 <= ~class619.field9133.length()) {
                     var10000 = ~var5;
                     if (!var1) {
                        if (var10000 <= -6) {
                           class655.field9589 = true;
                        }
                        break label506;
                     }
                  } else {
                     var10000 = class619.field9133.charAt(var4);
                  }

                  label467:
                  while(true) {
                     while(true) {
                        int var6 = var10000;
                        if (var6 >= 48) {
                           if (var6 <= 57) {
                              var5 = var5 * 10 - (-var6 + 48);
                              ++var4;
                              if (~var4 <= ~class619.field9133.length()) {
                                 var10000 = ~var5;
                                 if (!var1) {
                                    if (var10000 <= -6) {
                                       class655.field9589 = true;
                                    }
                                    break label467;
                                 }
                              } else {
                                 var10000 = class619.field9133.charAt(var4);
                              }
                           } else {
                              var10000 = ~var5;
                              if (!var1) {
                                 if (var10000 <= -6) {
                                    class655.field9589 = true;
                                 }
                                 break label467;
                              }
                           }
                        } else {
                           var10000 = ~var5;
                           if (!var1) {
                              if (var10000 <= -6) {
                                 class655.field9589 = true;
                              }
                              break label467;
                           }
                        }
                     }
                  }
               }
            }

            Applet var7 = class362.field4931;
            if (class216.field3093 != null) {
               var7 = class216.field3093;
            }

            Method var8 = class619.field9125;
            if (var8 != null) {
               try {
                  var8.invoke(var7, Boolean.TRUE);
               } catch (Throwable var21) {
               }
            }

            class122.method987((byte)-126);
            class639.method4616((byte)-66);
            this.method2348(1);
            this.method2335(0);
            class22.field252 = class651.method4763(-1);
            int var9;
            if (var1) {
               class276.field3775 = class22.field252.method1958(-27577, class743.field10823);
               var9 = 0;
               if (var1) {
                  this.method2897(0);
                  ++var9;
               }
            } else if (~class460.field6632 != -1L) {
               long var26;
               var10000 = (var26 = ~class460.field6632 - ~class133.method1054(-29025)) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (!var1) {
                  if (var10000 >= 0) {
                     return;
                  }

                  class276.field3775 = class22.field252.method1958(-27577, class743.field10823);
                  var9 = 0;
                  if (var1) {
                     this.method2897(0);
                     ++var9;
                  }
               } else {
                  var9 = var10000;
                  if (var1) {
                     this.method2897(0);
                     ++var9;
                  }
               }
            } else {
               class276.field3775 = class22.field252.method1958(-27577, class743.field10823);
               var9 = 0;
               if (var1) {
                  this.method2897(0);
                  ++var9;
               }
            }

            while(true) {
               while(var9 < class276.field3775) {
                  this.method2897(0);
                  ++var9;
               }

               this.method2893(-931810431);
               if (!var1) {
                  class515.method3744(class316.field4304, class557.field7990, 0);
                  if (~class460.field6632 != -1L) {
                     long var27;
                     var10000 = (var27 = ~class460.field6632 - ~class133.method1054(-29025)) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                     if (!var1) {
                        if (var10000 >= 0) {
                           break;
                        }

                        class276.field3775 = class22.field252.method1958(-27577, class743.field10823);
                        var9 = 0;
                        if (var1) {
                           this.method2897(0);
                           ++var9;
                        }
                     } else {
                        var9 = var10000;
                        if (var1) {
                           this.method2897(0);
                           ++var9;
                        }
                     }
                  } else {
                     class276.field3775 = class22.field252.method1958(-27577, class743.field10823);
                     var9 = 0;
                     if (var1) {
                        this.method2897(0);
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
            class668.method4876(-109, this.method2337(81), var23);
            this.method2901(field5569[21], (byte)-99);
         } finally {
            Object var15 = null;
            this.method2900(true, -93);
         }

      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field5569[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getCodeBase() {
      ++field5514;
      if (class549.field7865 != null) {
         return null;
      } else {
         return class216.field3093 != null && class216.field3093 != this ? class216.field3093.getCodeBase() : super.getCodeBase();
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
   )
   public final String getParameter(String arg0) {
      try {
         ++field5528;
         if (class549.field7865 != null) {
            return null;
         } else {
            return class216.field3093 != null && class216.field3093 != this ? class216.field3093.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[12] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field5531;
         class414.field5975 = true;
         class774.field11367 = true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[5] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(IIILcl;B)V"
   )
   public static final void method2895(int arg0, int arg1, int arg2, class279 arg3, byte arg4) {
      boolean var5 = client.field4360;

      try {
         ++field5539;
         if (arg4 == -108) {
            class425 var6 = arg3.method2119(false);
            int var7 = 16383 & -arg3.field3876.field5424 + arg3.field3817;
            if (arg1 == -1) {
               if (var7 == 0 && ~arg3.field3844 >= -26) {
                  if (!arg3.field3791 || !var6.method3145(true, arg3.field3879)) {
                     arg3.field3879 = var6.method3143(arg4 ^ -20872);
                     arg3.field3791 = arg3.field3879 != -1;
                  }

               } else {
                  label333: {
                     if (arg2 < 0 && ~var6.field6073 != 0) {
                        arg3.field3879 = var6.field6073;
                        arg3.field3791 = false;
                        if (!var5) {
                           break label333;
                        }
                     }

                     if (arg2 > 0 && var6.field6078 != -1) {
                        arg3.field3879 = var6.field6078;
                        if (!var5) {
                           break label333;
                        }
                     }

                     arg3.field3879 = var6.field6087;
                  }

                  arg3.field3791 = false;
               }
            } else if (~arg3.field3857 == 0 || var7 < 10240 && var7 > 2048) {
               if (var7 == 0 && arg3.field3844 <= 25) {
                  label361: {
                     if (arg1 == 2 && var6.field6066 != -1) {
                        arg3.field3879 = var6.field6066;
                        if (!var5) {
                           break label361;
                        }
                     }

                     if (arg1 != 0 || var6.field6069 == -1) {
                        arg3.field3879 = var6.field6087;
                        if (!var5) {
                           break label361;
                        }
                     }

                     arg3.field3879 = var6.field6069;
                  }

                  arg3.field3791 = false;
               } else {
                  label362: {
                     if (arg1 != 2 || ~var6.field6066 == 0) {
                        if (~arg1 != -1 || ~var6.field6069 == 0) {
                           if (arg2 >= 0 || ~var6.field6062 == 0) {
                              if (~arg2 >= -1 || ~var6.field6079 == 0) {
                                 arg3.field3879 = var6.field6087;
                                 if (!var5) {
                                    break label362;
                                 }
                              }

                              arg3.field3879 = var6.field6079;
                              if (!var5) {
                                 break label362;
                              }
                           }

                           arg3.field3879 = var6.field6062;
                           if (!var5) {
                              break label362;
                           }
                        }

                        if (~arg2 <= -1 || var6.field6089 == -1) {
                           if (~arg2 >= -1 || ~var6.field6053 == 0) {
                              arg3.field3879 = var6.field6069;
                              if (!var5) {
                                 break label362;
                              }
                           }

                           arg3.field3879 = var6.field6053;
                           if (!var5) {
                              break label362;
                           }
                        }

                        arg3.field3879 = var6.field6089;
                        if (!var5) {
                           break label362;
                        }
                     }

                     if (~arg2 <= -1 || ~var6.field6065 == 0) {
                        if (arg2 <= 0 || var6.field6071 == -1) {
                           arg3.field3879 = var6.field6066;
                           if (!var5) {
                              break label362;
                           }
                        }

                        arg3.field3879 = var6.field6071;
                        if (!var5) {
                           break label362;
                        }
                     }

                     arg3.field3879 = var6.field6065;
                  }

                  arg3.field3791 = false;
               }
            } else {
               int var8 = class408.field5906[arg0] + -arg3.field3876.field5424 & 16383;
               arg3.field3791 = false;
               if (arg1 == 2 && var6.field6066 != -1) {
                  if (~var8 < -2049 && var8 <= 6144 && ~var6.field6093 != 0) {
                     arg3.field3879 = var6.field6093;
                  } else if (~var8 <= -10241 && ~var8 > -14337 && ~var6.field6060 != 0) {
                     arg3.field3879 = var6.field6060;
                  } else if (var8 > 6144 && var8 < 10240 && var6.field6095 != -1) {
                     arg3.field3879 = var6.field6095;
                  } else {
                     arg3.field3879 = var6.field6066;
                  }
               } else if (arg1 == 0 && ~var6.field6069 != 0) {
                  if (var8 > 2048 && var8 <= 6144 && var6.field6097 != -1) {
                     arg3.field3879 = var6.field6097;
                  } else if (~var8 <= -10241 && var8 < 14336 && var6.field6074 != -1) {
                     arg3.field3879 = var6.field6074;
                  } else if (~var8 < -6145 && var8 < 10240 && ~var6.field6059 != 0) {
                     arg3.field3879 = var6.field6059;
                  } else {
                     arg3.field3879 = var6.field6069;
                  }
               } else if (~var8 < -2049 && ~var8 >= -6145 && ~var6.field6096 != 0) {
                  arg3.field3879 = var6.field6096;
               } else if (~var8 <= -10241 && ~var8 > -14337 && var6.field6068 != -1) {
                  arg3.field3879 = var6.field6068;
               } else if (~var8 < -6145 && ~var8 > -10241 && ~var6.field6067 != 0) {
                  arg3.field3879 = var6.field6067;
               } else {
                  arg3.field3879 = var6.field6087;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5569[51] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5569[2] : field5569[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowOpened(WindowEvent arg0) {
      try {
         ++field5525;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[64] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         ++field5540;
         this.destroy();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[49] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeiconified(WindowEvent arg0) {
      try {
         ++field5535;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[61] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowActivated(WindowEvent arg0) {
      try {
         ++field5523;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[50] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(BILjava/lang/String;IIII)V"
   )
   public final void method2896(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field5542;

         try {
            if (arg0 < 0) {
               if (class362.field4931 != null) {
                  ++class83.field1080;
                  if (class83.field1080 >= 3) {
                     this.method2901(field5569[34], (byte)-104);
                  } else {
                     this.getAppletContext().showDocument(this.getDocumentBase(), field5569[33]);
                  }
               } else {
                  class229.field3230 = class216.field3093;
                  class278.field3787 = 0;
                  class484.field6924 = arg3;
                  class362.field4931 = this;
                  class237.field3310 = arg5;
                  class79.field982 = arg5;
                  class150.field2097 = 0;
                  class692.field10185 = arg6;
                  class689.field10151 = arg6;
                  class356.field4789 = class316.field4304 = new class619(arg4, arg2, arg1, class216.field3093 != null);
                  class296 var9 = class316.field4304.method4504(this, 1, 0);
                  if (var8) {
                     class661.method4825(0, 10L);
                  }

                  while(var9.field4078 == 0) {
                     class661.method4825(0, 10L);
                  }

               }
            }
         } catch (Throwable var12) {
            class668.method4876(-55, (String)null, var12);
            this.method2901(field5569[21], (byte)-109);
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field5569[35] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5569[2] : field5569[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method2342(int arg0);

   @OriginalMember(
      owner = "client!rr",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;"
   )
   public final AppletContext getAppletContext() {
      try {
         ++field5537;
         if (class549.field7865 != null) {
            return null;
         } else {
            return class216.field3093 != null && class216.field3093 != this ? class216.field3093.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5569[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "i",
      descriptor = "(I)V"
   )
   private final void method2897(int arg0) {
      try {
         if (arg0 == 0) {
            ++field5518;
            long var2 = class133.method1054(-29025);
            long var4 = class375.field5418[class65.field789];
            class375.field5418[class65.field789] = var2;
            boolean var10000;
            if (~var4 != -1L && var2 > var4) {
               var10000 = true;
            } else {
               var10000 = false;
            }

            class65.field789 = class65.field789 + 1 & 31;
            synchronized(this) {
               class80.field1035 = class414.field5975;
            }

            this.method2358(arg0 + -6494);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5569[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeactivated(WindowEvent arg0) {
      try {
         ++field5536;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[52] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method2898(byte arg0) {
      try {
         if (arg0 != -38) {
            this.getDocumentBase();
         }

         ++field5519;
         return class715.method5188(arg0 ^ 19467, field5569[11]);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method2899(byte arg0) {
      try {
         ++field5516;
         if (arg0 != 80) {
            this.windowOpened((WindowEvent)null);
         }

         return class715.method5188(-19503, field5569[25]);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "destroy",
      descriptor = "()V"
   )
   public final void destroy() {
      try {
         ++field5544;
         if (class362.field4931 == this && !class56.field691) {
            class460.field6632 = class133.method1054(-29025);
            class661.method4825(0, 5000L);
            class356.field4789 = null;
            this.method2900(false, -98);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5569[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method2335(int arg0);

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(ZI)V"
   )
   private final void method2900(boolean arg0, int arg1) {
      try {
         ++field5534;
         synchronized(this) {
            if (class56.field691) {
               return;
            }

            class56.field691 = true;
         }

         System.out.println(field5569[31] + arg0);
         if (class216.field3093 != null) {
            class216.field3093.destroy();
         }

         try {
            this.method2344(-104);
         } catch (Exception var10) {
         }

         if (this.field5510) {
            try {
               jagmisc.quit();
            } catch (Throwable var9) {
            }

            this.field5510 = false;
         }

         class499.method3620((byte)115, true);
         class521.method3782(false);
         if (class557.field7990 != null) {
            try {
               class557.field7990.removeFocusListener(this);
               class557.field7990.getParent().remove(class557.field7990);
            } catch (Exception var8) {
            }
         }

         if (class316.field4304 != null) {
            try {
               class316.field4304.method4495(123);
            } catch (Exception var7) {
            }
         }

         this.method2336(48);
         if (arg1 <= -81) {
            if (class549.field7865 != null) {
               class549.field7865.setVisible(false);
               class549.field7865.dispose();
               class549.field7865 = null;
            }

            System.out.println(field5569[30] + arg0);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field5569[32] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public final void method2901(String arg0, byte arg1) {
      try {
         ++field5545;
         if (!this.field5530) {
            this.field5530 = true;
            System.out.println(field5569[53] + arg0);

            try {
               class548.method3934(class216.field3093, false, field5569[55]);
            } catch (Throwable var5) {
            }

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), field5569[53] + arg0 + field5569[54]), field5569[57]);
               if (arg1 > -73) {
                  this.method2898((byte)105);
               }
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5569[56] + (arg0 != null ? field5569[2] : field5569[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowIconified(WindowEvent arg0) {
      try {
         ++field5511;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[62] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "stop",
      descriptor = "()V"
   )
   public final void stop() {
      try {
         ++field5512;
         if (class362.field4931 == this && !class56.field691) {
            class460.field6632 = class133.method1054(-29025) + 4000L;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5569[63] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "start",
      descriptor = "()V"
   )
   public final void start() {
      try {
         ++field5532;
         if (class362.field4931 == this && !class56.field691) {
            class460.field6632 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5569[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method2902(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5515;
         String var3 = this.getDocumentBase().getHost().toLowerCase();
         if (!var3.equals(field5569[45]) && !var3.endsWith(field5569[44])) {
            if (!var3.equals(field5569[47]) && !var3.endsWith(field5569[39])) {
               if (!var3.equals(field5569[41]) && !var3.endsWith(field5569[43])) {
                  if (var3.endsWith(field5569[40])) {
                     return true;
                  } else {
                     int var10000;
                     label71: {
                        if (arg0) {
                           this.field5510 = false;
                           if (var2) {
                              var3 = var3.substring(0, -1 + var3.length());
                           }
                        }

                        while(var3.length() > 0) {
                           var10000 = ~var3.charAt(-1 + var3.length());
                           if (var2) {
                              break label71;
                           }

                           if (var10000 > -49 || var3.charAt(var3.length() - 1) > '9') {
                              break;
                           }

                           var3 = var3.substring(0, -1 + var3.length());
                        }

                        var10000 = var3.endsWith(field5569[46]);
                     }

                     if (var10000 != 0) {
                        return true;
                     } else {
                        this.method2901(field5569[42], (byte)-120);
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
         throw class237.method1823(var5, field5569[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "d",
      descriptor = "(I)V"
   )
   public synchronized void method2348(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5527;
         if (class557.field7990 != null) {
            class557.field7990.removeFocusListener(this);
            class557.field7990.getParent().setBackground(Color.black);
            class557.field7990.getParent().remove(class557.field7990);
         }

         if (arg0 == 1) {
            Container var3;
            label42: {
               if (class326.field4414 == null) {
                  if (class549.field7865 != null) {
                     var3 = class549.field7865;
                     if (!var2) {
                        break label42;
                     }
                  }

                  if (class216.field3093 != null) {
                     var3 = class216.field3093;
                     if (!var2) {
                        break label42;
                     }
                  }

                  var3 = class362.field4931;
                  if (!var2) {
                     break label42;
                  }
               }

               var3 = class326.field4414;
            }

            label31: {
               var3.setLayout((LayoutManager)null);
               class557.field7990 = new class247(this);
               var3.add(class557.field7990);
               class557.field7990.setSize(class237.field3310, class692.field10185);
               class557.field7990.setVisible(true);
               if (class549.field7865 != var3) {
                  class557.field7990.setLocation(class150.field2097, class278.field3787);
                  if (!var2) {
                     break label31;
                  }
               }

               Insets var4 = class549.field7865.getInsets();
               class557.field7990.setLocation(class150.field2097 + var4.left, var4.top - -class278.field3787);
            }

            class557.field7990.addFocusListener(this);
            class557.field7990.requestFocus();
            class414.field5975 = true;
            class80.field1035 = true;
            class774.field11367 = true;
            class457.field6570 = false;
            class745.field10915 = class133.method1054(-29025);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5569[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         ++field5526;
         if (class362.field4931 == this && !class56.field691) {
            class774.field11367 = true;
            if (class655.field9589 && ~(-class745.field10915 + class133.method1054(-29025)) < -1001L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || var2.width >= class79.field982 && ~var2.height <= ~class689.field10151) {
                  class457.field6570 = true;
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5569[58] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2903(byte arg0) {
      try {
         field5517 = null;
         field5543 = null;
         field5529 = null;
         if (arg0 != -128) {
            method2895(-63, -105, -119, (class279)null, (byte)120);
         }

         field5549 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5569[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosed(WindowEvent arg0) {
      try {
         ++field5524;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[7] + (arg0 != null ? field5569[2] : field5569[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "h",
      descriptor = "(I)Ljava/lang/String;"
   )
   public String method2337(int arg0) {
      try {
         ++field5547;
         return arg0 < 72 ? null : null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5569[66] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method2336(int arg0);

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method2358(int arg0);

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; ~var2 > -16385; ++var2) {
         field5529[var2] = (float)Math.sin((double)var2 * var0);
         field5517[var2] = (float)Math.cos((double)var2 * var0);
      }

      field5549 = new class118(101, -2);
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2904(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2905(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
