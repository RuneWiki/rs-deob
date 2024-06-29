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

@OriginalClass("client!ah")
public abstract class class402 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "client!ah",
      name = "D",
      descriptor = "Z"
   )
   private boolean field5904 = false;
   @OriginalMember(
      owner = "client!ah",
      name = "e",
      descriptor = "Z"
   )
   private boolean field5928 = false;
   @OriginalMember(
      owner = "client!ah",
      name = "hb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5959 = new String[]{method3105(method3104("ZD-[QUHl[{WCpEV\\\u0004")), method3105(method3104("@\u0002-\u0002E")), method3105(method3104("UYo@")), method3105(method3104("ZD-ey\u0013")), method3105(method3104("ZD-_LT\\+")), method3105(method3104("ZD-YH_MwI\u0010")), method3105(method3104("ZD-iy\u0013")), method3105(method3104("ZD-K]Oms\\T^X@CVOI{X\u0010")), method3105(method3104("ZD-[QUHl[{WCpI\\\u0013")), method3105(method3104("ZD-[QUHl[|^M`XQMMwI\\\u0013")), method3105(method3104("ZD-[QUHl[yXXjZYOIg\u0004")), method3105(method3104("ZD-fy\u0013")), method3105(method3104("qMdI@")), method3105(method3104("QMdAQHO")), method3105(method3104("ZD-dy\u0013")), method3105(method3104("\u0015^vB]HOb\\]\u0015OlA")), method3105(method3104("HXf@TZ^gMOU\u0002`CU")), method3105(method3104("IYmIKXMsI\u0016XCn")), method3105(method3104("\u0015_wITWMqHYLB-OWV")), method3105(method3104("QMdI@\u0015OlA")), method3105(method3104("RBuMTRHkCKO")), method3105(method3104("\n\u001e4\u0002\b\u0015\u001c-\u001d")), method3105(method3104("ZD-hy\u0013")), method3105(method3104("\u0015FbK]C\u0002`CU")), method3105(method3104("\n\u00151\u0002\t\r\u0014-\u001d\u0016")), method3105(method3104("ZD-[QUHl[qXCmE^RIg\u0004")), method3105(method3104("ZD-_LZ^w\u0004")), method3105(method3104("ZD-^MU\u0004")), method3105(method3104("X^b_P")), method3105(method3104("RNn")), method3105(method3104("\n\u00021\u0002")), method3105(method3104("\n\u00021")), method3105(method3104("\n\u00022")), method3105(method3104("Z\\s@]")), method3105(method3104("\n\u00027\u0002\n")), method3105(method3104("L^lB_QMuM")), method3105(method3104("\n\u00022\u0002")), method3105(method3104("\n\u0002")), method3105(method3104("HYm")), method3105(method3104("ZD-JWXYp`WHX+")), method3105(method3104("ZD-ay\u0013")), method3105(method3104("d_f@^")), method3105(method3104("Z@qIY_UoCY_Ig")), method3105(method3104("ZD-H]HXqCA\u0013")), method3105(method3104("QM`@QY")), method3105(method3104("ZD-ky\u0013")), method3105(method3104("ZD-JWXYpkYRBfH\u0010")), method3105(method3104("ZD-|\u0010")), method3105(method3104("QMdXP^CqM")), method3105(method3104("ZD-`y\u0013")), method3105(method3104("ZD-oy\u0013")), method3105(method3104("ZD-K]O|b^YVIwIJ\u0013")), method3105(method3104("ZD-d\u0010")), method3105(method3104("ZD-jy\u0013")), method3105(method3104("dXl\\")), method3105(method3104("^^qCJdKbA]d")), method3105(method3104("\u0015[p")), method3105(method3104("WCdK]_CvX")), method3105(method3104("ZD-[QUHl[|^E`CVRJjI\\\u0013")), method3105(method3104("ZD-[QUHl[wKImI\\\u0013")), method3105(method3104("ZD-\\YRBw\u0004")), method3105(method3104("hDvX\\T[m\fKOMqX\u0018\u0016\f`@]ZB9")), method3105(method3104("ZD-gy\u0013")), method3105(method3104("hDvX\\T[m\f[TAs@]OI#\u0001\u0018X@fMV\u0001")), method3105(method3104("ZD-\\JTZjH]wCbH]Ims\\T^X+")), method3105(method3104("ZD-K]OhlOMVImXzZ_f\u0004"))};
   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "Lgw;"
   )
   public static class179 field5910 = new class179(8);
   @OriginalMember(
      owner = "client!ah",
      name = "b",
      descriptor = "I"
   )
   public static int field5936 = -1;
   @OriginalMember(
      owner = "client!ah",
      name = "C",
      descriptor = "Z"
   )
   public static boolean field5935 = false;
   @OriginalMember(
      owner = "client!ah",
      name = "q",
      descriptor = "Lpg;"
   )
   public static class762 field5938 = new class762(method3105(method3104("wc@mt")), "", method3105(method3104("WC`MT")), 4);
   @OriginalMember(
      owner = "client!ah",
      name = "r",
      descriptor = "I"
   )
   public static int field5900;
   @OriginalMember(
      owner = "client!ah",
      name = "U",
      descriptor = "I"
   )
   public static int field5901;
   @OriginalMember(
      owner = "client!ah",
      name = "v",
      descriptor = "I"
   )
   public static int field5902;
   @OriginalMember(
      owner = "client!ah",
      name = "n",
      descriptor = "I"
   )
   public static int field5903;
   @OriginalMember(
      owner = "client!ah",
      name = "o",
      descriptor = "I"
   )
   public static int field5905;
   @OriginalMember(
      owner = "client!ah",
      name = "db",
      descriptor = "I"
   )
   public static int field5906;
   @OriginalMember(
      owner = "client!ah",
      name = "l",
      descriptor = "I"
   )
   public static int field5907;
   @OriginalMember(
      owner = "client!ah",
      name = "W",
      descriptor = "I"
   )
   public static int field5908;
   @OriginalMember(
      owner = "client!ah",
      name = "cb",
      descriptor = "I"
   )
   public static int field5909;
   @OriginalMember(
      owner = "client!ah",
      name = "S",
      descriptor = "I"
   )
   public static int field5911;
   @OriginalMember(
      owner = "client!ah",
      name = "i",
      descriptor = "I"
   )
   public static int field5912;
   @OriginalMember(
      owner = "client!ah",
      name = "bb",
      descriptor = "I"
   )
   public static int field5913;
   @OriginalMember(
      owner = "client!ah",
      name = "F",
      descriptor = "I"
   )
   public static int field5914;
   @OriginalMember(
      owner = "client!ah",
      name = "ab",
      descriptor = "I"
   )
   public static int field5915;
   @OriginalMember(
      owner = "client!ah",
      name = "Q",
      descriptor = "I"
   )
   public static int field5916;
   @OriginalMember(
      owner = "client!ah",
      name = "E",
      descriptor = "I"
   )
   public static int field5917;
   @OriginalMember(
      owner = "client!ah",
      name = "R",
      descriptor = "I"
   )
   public static int field5918;
   @OriginalMember(
      owner = "client!ah",
      name = "j",
      descriptor = "I"
   )
   public static int field5919;
   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "I"
   )
   public static int field5920;
   @OriginalMember(
      owner = "client!ah",
      name = "w",
      descriptor = "I"
   )
   public static int field5921;
   @OriginalMember(
      owner = "client!ah",
      name = "h",
      descriptor = "I"
   )
   public static int field5922;
   @OriginalMember(
      owner = "client!ah",
      name = "X",
      descriptor = "I"
   )
   public static int field5923;
   @OriginalMember(
      owner = "client!ah",
      name = "L",
      descriptor = "I"
   )
   public static int field5924;
   @OriginalMember(
      owner = "client!ah",
      name = "x",
      descriptor = "I"
   )
   public static int field5925;
   @OriginalMember(
      owner = "client!ah",
      name = "G",
      descriptor = "I"
   )
   public static int field5926;
   @OriginalMember(
      owner = "client!ah",
      name = "d",
      descriptor = "I"
   )
   public static int field5927;
   @OriginalMember(
      owner = "client!ah",
      name = "Y",
      descriptor = "I"
   )
   public static int field5929;
   @OriginalMember(
      owner = "client!ah",
      name = "J",
      descriptor = "I"
   )
   public static int field5930;
   @OriginalMember(
      owner = "client!ah",
      name = "M",
      descriptor = "I"
   )
   public static int field5931;
   @OriginalMember(
      owner = "client!ah",
      name = "s",
      descriptor = "I"
   )
   public static int field5932;
   @OriginalMember(
      owner = "client!ah",
      name = "H",
      descriptor = "I"
   )
   public static int field5933;
   @OriginalMember(
      owner = "client!ah",
      name = "y",
      descriptor = "I"
   )
   public static int field5934;
   @OriginalMember(
      owner = "client!ah",
      name = "N",
      descriptor = "I"
   )
   public static int field5937;
   @OriginalMember(
      owner = "client!ah",
      name = "P",
      descriptor = "I"
   )
   public static int field5939;
   @OriginalMember(
      owner = "client!ah",
      name = "K",
      descriptor = "I"
   )
   public static int field5942;
   @OriginalMember(
      owner = "client!ah",
      name = "u",
      descriptor = "I"
   )
   public static int field5943;
   @OriginalMember(
      owner = "client!ah",
      name = "Z",
      descriptor = "I"
   )
   public static int field5946;
   @OriginalMember(
      owner = "client!ah",
      name = "V",
      descriptor = "I"
   )
   public static int field5952;
   @OriginalMember(
      owner = "client!ah",
      name = "eb",
      descriptor = "I"
   )
   public static int field5954;
   @OriginalMember(
      owner = "client!ah",
      name = "B",
      descriptor = "I"
   )
   public static int field5957;
   @OriginalMember(
      owner = "client!ah",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field5940;
   @OriginalMember(
      owner = "client!ah",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field5941;
   @OriginalMember(
      owner = "client!ah",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field5944;
   @OriginalMember(
      owner = "client!ah",
      name = "O",
      descriptor = "Z"
   )
   public static boolean field5945;
   @OriginalMember(
      owner = "client!ah",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field5947;
   @OriginalMember(
      owner = "client!ah",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field5948;
   @OriginalMember(
      owner = "client!ah",
      name = "fb",
      descriptor = "Z"
   )
   public static boolean field5949;
   @OriginalMember(
      owner = "client!ah",
      name = "T",
      descriptor = "Z"
   )
   public static boolean field5950;
   @OriginalMember(
      owner = "client!ah",
      name = "gb",
      descriptor = "Z"
   )
   public static boolean field5951;
   @OriginalMember(
      owner = "client!ah",
      name = "A",
      descriptor = "Z"
   )
   public static boolean field5953;
   @OriginalMember(
      owner = "client!ah",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5955;
   @OriginalMember(
      owner = "client!ah",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field5956;
   @OriginalMember(
      owner = "client!ah",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field5958;

   @OriginalMember(
      owner = "client!ah",
      name = "g",
      descriptor = "(B)Z"
   )
   public final boolean method3093(byte arg0) {
      try {
         int var2 = -63 / ((arg0 - 1) / 60);
         ++field5925;
         return class621.method4548((byte)111, field5959[13]);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5959[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
   )
   public final String getParameter(String arg0) {
      try {
         ++field5922;
         if (class123.field1971 != null) {
            return null;
         } else {
            return class514.field7493 != null && class514.field7493 != this ? class514.field7493.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[51] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method2466(int arg0);

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(IZLjava/lang/String;IIIIB)V"
   )
   public final void method3094(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
      boolean var9 = client.field4564;

      try {
         ++field5903;

         try {
            class78.field1347 = 0;
            class74.field1311 = arg6;
            if (arg7 >= -76) {
               this.field5904 = true;
            }

            class720.field10406 = arg4;
            class693.field10156 = arg4;
            class346.field4928 = this;
            class438.field6315 = 0;
            class218.field3296 = arg3;
            class620.field9009 = arg3;
            class629.field9164 = null;
            class123.field1971 = new Frame();
            class123.field1971.setTitle(field5959[12]);
            class123.field1971.setResizable(true);
            class123.field1971.addWindowListener(this);
            class123.field1971.setVisible(true);
            class123.field1971.toFront();
            Insets var10 = class123.field1971.getInsets();
            class123.field1971.setSize(class693.field10156 + var10.right + var10.left, var10.top - -var10.bottom + class620.field9009);
            class7.field74 = class412.field6033 = new class651(arg0, arg2, arg5, true);
            class789 var11 = class412.field6033.method4792((byte)-97, 1, this);
            if (var9) {
               class624.method4569((byte)98, 10L);
            }

            while(var11.field11542 == 0) {
               class624.method4569((byte)98, 10L);
            }

         } catch (Exception var14) {
            class17.method127((byte)-99, var14, (String)null);
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field5959[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5959[1] : field5959[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowOpened(WindowEvent arg0) {
      try {
         ++field5906;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[59] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "c",
      descriptor = "(I)V"
   )
   public synchronized void method2456(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field5905;
         if (class386.field5692 != null) {
            class386.field5692.removeFocusListener(this);
            class386.field5692.getParent().setBackground(Color.black);
            class386.field5692.getParent().remove(class386.field5692);
         }

         Container var3;
         label51: {
            if (class589.field8507 != null) {
               var3 = class589.field8507;
               if (!var2) {
                  break label51;
               }
            }

            if (class123.field1971 != null) {
               var3 = class123.field1971;
               if (!var2) {
                  break label51;
               }
            }

            if (class514.field7493 == null) {
               var3 = class346.field4928;
               if (!var2) {
                  break label51;
               }
            }

            var3 = class514.field7493;
         }

         var3.setLayout((LayoutManager)null);
         if (arg0 == 9704) {
            label31: {
               class386.field5692 = new class282(this);
               var3.add(class386.field5692);
               class386.field5692.setSize(class720.field10406, class218.field3296);
               class386.field5692.setVisible(true);
               if (class123.field1971 == var3) {
                  Insets var4 = class123.field1971.getInsets();
                  class386.field5692.setLocation(class438.field6315 + var4.left, class78.field1347 + var4.top);
                  if (!var2) {
                     break label31;
                  }
               }

               class386.field5692.setLocation(class438.field6315, class78.field1347);
            }

            class386.field5692.addFocusListener(this);
            class386.field5692.requestFocus();
            class215.field3226 = true;
            class383.field5673 = true;
            class584.field8450 = true;
            class631.field9196 = false;
            class253.field3612 = class57.method650(101);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5959[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V"
   )
   public final void method3095(String arg0, boolean arg1) {
      try {
         ++field5918;
         if (!this.field5928) {
            this.field5928 = true;
            if (arg1) {
               this.windowClosed((WindowEvent)null);
            }

            System.out.println(field5959[55] + arg0);

            try {
               class575.method4254(class514.field7493, (byte)16, field5959[57]);
            } catch (Throwable var5) {
            }

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), field5959[55] + arg0 + field5959[56]), field5959[54]);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5959[53] + (arg0 != null ? field5959[1] : field5959[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "destroy",
      descriptor = "()V"
   )
   public final void destroy() {
      try {
         ++field5919;
         if (class346.field4928 == this && !class12.field133) {
            class209.field3111 = class57.method650(100);
            class624.method4569((byte)98, 5000L);
            class7.field74 = null;
            this.method3099(false, 48);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5959[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeiconified(WindowEvent arg0) {
      try {
         ++field5927;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[58] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "d",
      descriptor = "(B)V"
   )
   public abstract void method2457(byte arg0);

   @OriginalMember(
      owner = "client!ah",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field5902;
         class215.field3226 = true;
         class584.field8450 = true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[46] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         ++field5917;
         this.destroy();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[0] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method2450(int arg0);

   @OriginalMember(
      owner = "client!ah",
      name = "d",
      descriptor = "(I)Ljava/lang/String;"
   )
   public String method2468(int arg0) {
      try {
         ++field5901;
         if (arg0 >= -23) {
            this.update((Graphics)null);
         }

         return null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4564;

      try {
         ++field5924;

         try {
            if (class651.field9455 != null) {
               label528: {
                  String var2 = class651.field9455.toLowerCase();
                  if (var2.indexOf(field5959[38]) != -1 || var2.indexOf(field5959[33]) != -1) {
                     String var3 = class651.field9436;
                     if (!var3.equals(field5959[32]) && !var3.startsWith(field5959[36]) && !var3.equals(field5959[31]) && !var3.startsWith(field5959[30])) {
                        break label528;
                     }

                     this.method3095(field5959[35], false);
                     if (!var1) {
                        return;
                     }
                  }

                  if (var2.indexOf(field5959[29]) != -1 && (class651.field9436 == null || class651.field9436.equals(field5959[34]))) {
                     this.method3095(field5959[35], false);
                     if (!var1) {
                        return;
                     }
                  }
               }
            }

            int var10000;
            if (class651.field9436 != null && class651.field9436.startsWith(field5959[37])) {
               label525: {
                  int var4 = 2;
                  int var5 = 0;
                  if (var1) {
                     var10000 = class651.field9436.charAt(var4);
                  } else if (class651.field9436.length() <= var4) {
                     var10000 = ~var5;
                     if (!var1) {
                        if (var10000 <= -6) {
                           class389.field5745 = true;
                        }
                        break label525;
                     }
                  } else {
                     var10000 = class651.field9436.charAt(var4);
                  }

                  label485:
                  while(true) {
                     while(true) {
                        while(true) {
                           int var6 = var10000;
                           if (~var6 <= -49) {
                              if (~var6 < -58) {
                                 if (!var1) {
                                    var10000 = ~var5;
                                    if (!var1) {
                                       if (var10000 <= -6) {
                                          class389.field5745 = true;
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

                              if (class651.field9436.length() <= var4) {
                                 var10000 = ~var5;
                                 if (!var1) {
                                    if (var10000 <= -6) {
                                       class389.field5745 = true;
                                    }
                                    break label485;
                                 }
                              } else {
                                 var10000 = class651.field9436.charAt(var4);
                              }
                           } else {
                              var10000 = ~var5;
                              if (!var1) {
                                 if (var10000 <= -6) {
                                    class389.field5745 = true;
                                 }
                                 break label485;
                              }
                           }
                        }
                     }
                  }
               }
            }

            Applet var7 = class346.field4928;
            if (class514.field7493 != null) {
               var7 = class514.field7493;
            }

            Method var8 = class651.field9448;
            if (var8 != null) {
               try {
                  var8.invoke(var7, Boolean.TRUE);
               } catch (Throwable var21) {
               }
            }

            class104.method1006(true);
            class305.method2390(0);
            this.method2456(9704);
            this.method2457((byte)64);
            class344.field4894 = class758.method5485(0);
            int var9;
            if (var1) {
               class277.field3905 = class344.field4894.method3227(0, class359.field5369);
               var9 = 0;
               if (var1) {
                  this.method3103(true);
                  ++var9;
               }
            } else if (class209.field3111 != 0L) {
               long var26;
               var10000 = (var26 = class57.method650(112) - class209.field3111) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (!var1) {
                  if (var10000 >= 0) {
                     return;
                  }

                  class277.field3905 = class344.field4894.method3227(0, class359.field5369);
                  var9 = 0;
                  if (var1) {
                     this.method3103(true);
                     ++var9;
                  }
               } else {
                  var9 = var10000;
                  if (var1) {
                     this.method3103(true);
                     ++var9;
                  }
               }
            } else {
               class277.field3905 = class344.field4894.method3227(0, class359.field5369);
               var9 = 0;
               if (var1) {
                  this.method3103(true);
                  ++var9;
               }
            }

            while(true) {
               while(class277.field3905 > var9) {
                  this.method3103(true);
                  ++var9;
               }

               this.method3098((byte)-115);
               if (!var1) {
                  class126.method1224((byte)13, class386.field5692, class412.field6033);
                  if (class209.field3111 != 0L) {
                     long var27;
                     var10000 = (var27 = class57.method650(112) - class209.field3111) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                     if (!var1) {
                        if (var10000 >= 0) {
                           break;
                        }

                        class277.field3905 = class344.field4894.method3227(0, class359.field5369);
                        var9 = 0;
                        if (var1) {
                           this.method3103(true);
                           ++var9;
                        }
                     } else {
                        var9 = var10000;
                        if (var1) {
                           this.method3103(true);
                           ++var9;
                        }
                     }
                  } else {
                     class277.field3905 = class344.field4894.method3227(0, class359.field5369);
                     var9 = 0;
                     if (var1) {
                        this.method3103(true);
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
            class17.method127((byte)-99, var23, this.method2468(-99));
            this.method3095(field5959[28], false);
         } finally {
            Object var15 = null;
            this.method3099(true, 48);
         }

      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field5959[27] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method2461(byte arg0);

   @OriginalMember(
      owner = "client!ah",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;"
   )
   public final AppletContext getAppletContext() {
      try {
         ++field5900;
         if (class123.field1971 != null) {
            return null;
         } else {
            return class514.field7493 != null && class514.field7493 != this ? class514.field7493.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5959[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(IILjava/lang/String;IIII)V"
   )
   public final void method3096(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field5909;

         try {
            if (class346.field4928 != null) {
               ++class420.field6124;
               if (class420.field6124 >= 3) {
                  this.method3095(field5959[42], false);
               } else {
                  this.getAppletContext().showDocument(this.getDocumentBase(), field5959[41]);
               }
            } else {
               class438.field6315 = 0;
               class74.field1311 = arg0;
               class720.field10406 = arg1;
               class693.field10156 = arg1;
               class346.field4928 = this;
               if (arg6 != -1848) {
                  this.focusLost((FocusEvent)null);
               }

               class629.field9164 = class514.field7493;
               class78.field1347 = 0;
               class218.field3296 = arg5;
               class620.field9009 = arg5;
               class7.field74 = class412.field6033 = new class651(arg4, arg2, arg3, class514.field7493 != null);
               class789 var9 = class412.field6033.method4792((byte)-97, 1, this);
               if (var8) {
                  class624.method4569((byte)98, 10L);
               }

               while(~var9.field11542 == -1) {
                  class624.method4569((byte)98, 10L);
               }

            }
         } catch (Throwable var12) {
            class17.method127((byte)-99, var12, (String)null);
            this.method3095(field5959[28], false);
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field5959[40] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5959[1] : field5959[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "e",
      descriptor = "(B)Z"
   )
   public final boolean method3097(byte arg0) {
      try {
         ++field5907;
         if (arg0 > -63) {
            field5910 = null;
         }

         return class621.method4548((byte)103, field5959[48]);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "provideLoaderApplet",
      descriptor = "(Ljava/applet/Applet;)V"
   )
   public static final void provideLoaderApplet(Applet arg0) {
      try {
         class514.field7493 = arg0;
         ++field5911;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5959[64] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowActivated(WindowEvent arg0) {
      try {
         ++field5908;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[10] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         this.paint(arg0);
         ++field5913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[5] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method3098(byte arg0) {
      try {
         ++field5915;
         long var2 = class57.method650(122);
         if (arg0 == -115) {
            long var4 = class368.field5467[class38.field926];
            class368.field5467[class38.field926] = var2;
            if (~var4 != -1L && var2 > var4) {
               int var6 = (int)(-var4 + var2);
               class69.field1245 = ((var6 >> 1) + 32000) / var6;
            }

            class38.field926 = class38.field926 + 1 & 31;
            if (class285.field3976++ > 50) {
               label28: {
                  class584.field8450 = true;
                  class285.field3976 -= 50;
                  class386.field5692.setSize(class720.field10406, class218.field3296);
                  class386.field5692.setVisible(true);
                  if (class123.field1971 != null && class589.field8507 == null) {
                     Insets var7 = class123.field1971.getInsets();
                     class386.field5692.setLocation(class438.field6315 + var7.left, class78.field1347 + var7.top);
                     if (!client.field4564) {
                        break label28;
                     }
                  }

                  class386.field5692.setLocation(class438.field6315, class78.field1347);
               }
            }

            this.method2466(2);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5959[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(ZI)V"
   )
   private final void method3099(boolean arg0, int arg1) {
      try {
         ++field5932;
         synchronized(this) {
            if (class12.field133) {
               return;
            }

            class12.field133 = true;
         }

         System.out.println(field5959[61] + arg0);
         if (class514.field7493 != null) {
            class514.field7493.destroy();
         }

         try {
            this.method2450(0);
         } catch (Exception var10) {
         }

         if (this.field5904) {
            try {
               jagmisc.quit();
            } catch (Throwable var9) {
            }

            this.field5904 = false;
         }

         class350.method2704(true, arg1 ^ -72);
         class152.method1414(0);
         if (arg1 != 48) {
            this.field5904 = false;
         }

         if (class386.field5692 != null) {
            try {
               class386.field5692.removeFocusListener(this);
               class386.field5692.getParent().remove(class386.field5692);
            } catch (Exception var8) {
            }
         }

         if (class412.field6033 != null) {
            try {
               class412.field6033.method4773(-108);
            } catch (Exception var7) {
            }
         }

         this.method2469((byte)3);
         if (class123.field1971 != null) {
            class123.field1971.setVisible(false);
            class123.field1971.dispose();
            class123.field1971 = null;
         }

         System.out.println(field5959[63] + arg0);
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field5959[62] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "client!ah",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowDeactivated(WindowEvent arg0) {
      try {
         ++field5920;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[9] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method3100(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field5916;
         if (arg0 != 4094) {
            this.field5928 = true;
         }

         String var3 = this.getDocumentBase().getHost().toLowerCase();
         if (!var3.equals(field5959[19]) && !var3.endsWith(field5959[23])) {
            if (!var3.equals(field5959[17]) && !var3.endsWith(field5959[15])) {
               if (!var3.equals(field5959[16]) && !var3.endsWith(field5959[18])) {
                  if (var3.endsWith(field5959[21])) {
                     return true;
                  } else {
                     char var10000;
                     while(true) {
                        if (~var3.length() < -1) {
                           var10000 = var3.charAt(var3.length() + -1);
                           if (var2) {
                              break;
                           }

                           if (var10000 >= '0' && ~var3.charAt(var3.length() + -1) >= -58) {
                              var3 = var3.substring(0, -1 + var3.length());
                              continue;
                           }
                        }

                        var10000 = var3.endsWith(field5959[24]);
                        break;
                     }

                     if (var10000 != 0) {
                        return true;
                     } else {
                        this.method3095(field5959[20], false);
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
         throw class608.method4462(var5, field5959[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getCodeBase() {
      ++field5929;
      if (class123.field1971 != null) {
         return null;
      } else {
         return class514.field7493 != null && class514.field7493 != this ? class514.field7493.getCodeBase() : super.getCodeBase();
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;"
   )
   public final URL getDocumentBase() {
      try {
         ++field5933;
         if (class123.field1971 != null) {
            return null;
         } else {
            return class514.field7493 != null && class514.field7493 != this ? class514.field7493.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5959[65] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         class215.field3226 = false;
         ++field5912;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[39] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "stop",
      descriptor = "()V"
   )
   public final void stop() {
      try {
         ++field5930;
         if (class346.field4928 == this && !class12.field133) {
            class209.field3111 = class57.method650(110) + 4000L;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5959[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method2469(byte arg0);

   @OriginalMember(
      owner = "client!ah",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3101(int arg0) {
      try {
         field5910 = null;
         if (arg0 != -6579) {
            provideLoaderApplet((Applet)null);
         }

         field5938 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5959[50] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3102(byte arg0) {
      try {
         if (arg0 != 59) {
            return false;
         } else {
            ++field5937;
            return class621.method4548((byte)83, field5959[44]);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         ++field5931;
         if (class346.field4928 == this && !class12.field133) {
            class584.field8450 = true;
            if (class389.field5745 && class57.method650(102) - class253.field3612 > 1000L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || ~var2.width <= ~class693.field10156 && class620.field9009 <= var2.height) {
                  class631.field9196 = true;
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5959[60] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method3103(boolean arg0) {
      try {
         ++field5914;
         long var2 = class57.method650(103);
         long var4 = class45.field999[class41.field960];
         class45.field999[class41.field960] = var2;
         class41.field960 = class41.field960 + 1 & 31;
         boolean var10000;
         if (~var4 != -1L && ~var2 < ~var4) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         synchronized(this) {
            class383.field5673 = class215.field3226;
         }

         this.method2461((byte)-102);
         if (!arg0) {
            field5910 = null;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5959[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowIconified(WindowEvent arg0) {
      try {
         ++field5921;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[25] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V"
   )
   public final void windowClosed(WindowEvent arg0) {
      try {
         ++field5923;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5959[8] + (arg0 != null ? field5959[1] : field5959[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "start",
      descriptor = "()V"
   )
   public final void start() {
      try {
         ++field5926;
         if (class346.field4928 == this && !class12.field133) {
            class209.field3111 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5959[26] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3104(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3105(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
