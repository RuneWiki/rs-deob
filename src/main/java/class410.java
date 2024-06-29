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

@OriginalClass("client!fu")
public abstract class class410 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "client!fu",
      name = "X",
      descriptor = "Z"
   )
   private boolean field6276 = false;
   @OriginalMember(
      owner = "client!fu",
      name = "w",
      descriptor = "Z"
   )
   private boolean field6271 = false;
   @OriginalMember(
      owner = "client!fu",
      name = "eb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6299 = new String[]{method3142(method3141("y\u0007t=R7")), method3142(method3141("u\u0013=\u0015zl\u0011")), method3142(method3141("q\u00076\u0014")), method3142(method3141("y\u0007t\brv\u001c.P")), method3142(method3141("d\\tVn")), method3142(method3141("y\u0007t\u001fvk3*\b\u007fz\u0006\u0019\u0017}k\u0017\"\f;")), method3142(method3141("y\u0007t3R7")), method3142(method3141("m\u00074\u001d`|\u0013*\u001d=|\u001d7")), method3142(method3141("1\u0018;\u001fvg\\9\u0017~")), method3142(method3141("1\u0000/\u0016vl\u0011;\bv1\u00115\u0015")), method3142(method3141("l\u0006?\u0014\u007f~\u0000>\u0019dq\\9\u0017~")), method3142(method3141("y\u0007t4R7")), method3142(method3141("1\u0001.\u001d\u007fs\u0013(\u001crh\u001ct\u001b|r")), method3142(method3141(".KhV\")JtI=")), method3142(method3141("v\u001c,\u0019\u007fv\u00162\u0017`k")), method3142(method3141(".@mV#1BtI")), method3142(method3141("u\u0013=\u001dk1\u00115\u0015")), method3142(method3141("y\u0007t0R7")), method3142(method3141("U\u0013=\u001dk")), method3142(method3141("u\u00139\u0014z}")), method3142(method3141("y\u0007t<R7")), method3142(method3141("y\u0007t\u001fvk\";\nrr\u0017.\u001da7")), method3142(method3141("y\u0007t>R7")), method3142(method3141("y\u0007t\u001cvl\u0006(\u0017j7")), method3142(method3141("y\u0007t9R7")), method3142(method3141("y\u0007t2R7")), method3142(method3141("y\u0007t?R7")), method3142(method3141("L\u001a/\fwp\u00054X`k\u0013(\f32R9\u0014v~\u001c`")), method3142(method3141("L\u001a/\fwp\u00054Xpp\u001f*\u0014vk\u0017zU3|\u001e?\u0019}%")), method3142(method3141("y\u0007t5R7")), method3142(method3141("u\u0013=\f{z\u001d(\u0019")), method3142(method3141("|\u0000;\u000b{")), method3142(method3141("@\u0001?\u0014u")), method3142(method3141("~\u001e(\u001dr{\u000b6\u0017r{\u0017>")), method3142(method3141("y\u0007t6R7")), method3142(method3141("y\u0007t\u000fzq\u00165\u000fZ|\u001d4\u0011uv\u0017>P")), method3142(method3141("z\u0000(\u0017a@\u0015;\u0015v@")), method3142(method3141("s\u001d=\u001fv{\u001d/\f")), method3142(method3141("y\u0007t:R7")), method3142(method3141("@\u00065\b")), method3142(method3141("1\u0005)")), method3142(method3141("y\u0007t-;")), method3142(method3141("y\u0007t\u001e||\u0007)?rv\u001c?\u001c;")), method3142(method3141("y\u0007t\u000bg~\u0000.P")), method3142(method3141(".\\")), method3142(method3141(".\\k")), method3142(method3141(".\\hV")), method3142(method3141("h\u00005\u0016tu\u0013,\u0019")), method3142(method3141(".\\h")), method3142(method3141(".\\nV!")), method3142(method3141("~\u0002*\u0014v")), method3142(method3141(".\\kV")), method3142(method3141("y\u0007t\nfqZ")), method3142(method3141("l\u00074")), method3142(method3141("v\u00107")), method3142(method3141("y\u0007t\u000fzq\u00165\u000f\\o\u00174\u001dw7")), method3142(method3141("y\u0007t\u001e||\u0007)4|l\u0006r")), method3142(method3141("y\u0007t\u000fzq\u00165\u000fWz\u001b9\u0017}v\u00143\u001dw7")), method3142(method3141("y\u0007t\bap\u00043\u001cvS\u001d;\u001cvm3*\b\u007fz\u0006r")), method3142(method3141("y\u0007t\u000fzq\u00165\u000fWz\u00139\fzi\u0013.\u001dw7")), method3142(method3141("y\u0007t;R7")), method3142(method3141("y\u0007t\u000fzq\u00165\u000fR|\u00063\u000erk\u0017>P")), method3142(method3141("y\u0007t\u000fzq\u00165\u000fPs\u001d)\u0011}xZ")), method3142(method3141("y\u0007t\u000bgp\u0002r")), method3142(method3141("y\u0007t1R7")), method3142(method3141("y\u0007t\u001fvk65\u001bfr\u00174\fQ~\u0001?P")), method3142(method3141("y\u0007t\u000fzq\u00165\u000fPs\u001d)\u001dw7")), method3142(method3141("y\u0007t\rc{\u0013.\u001d;"))};
   @OriginalMember(
      owner = "client!fu",
      name = "P",
      descriptor = "[Z"
   )
   public static boolean[] field6252 = new boolean[8];
   @OriginalMember(
      owner = "client!fu",
      name = "C",
      descriptor = "I"
   )
   public static int field6243;
   @OriginalMember(
      owner = "client!fu",
      name = "R",
      descriptor = "I"
   )
   public static int field6244;
   @OriginalMember(
      owner = "client!fu",
      name = "Q",
      descriptor = "I"
   )
   public static int field6245;
   @OriginalMember(
      owner = "client!fu",
      name = "r",
      descriptor = "I"
   )
   public static int field6246;
   @OriginalMember(
      owner = "client!fu",
      name = "ab",
      descriptor = "I"
   )
   public static int field6247;
   @OriginalMember(
      owner = "client!fu",
      name = "g",
      descriptor = "I"
   )
   public static int field6248;
   @OriginalMember(
      owner = "client!fu",
      name = "S",
      descriptor = "I"
   )
   public static int field6249;
   @OriginalMember(
      owner = "client!fu",
      name = "D",
      descriptor = "I"
   )
   public static int field6250;
   @OriginalMember(
      owner = "client!fu",
      name = "i",
      descriptor = "I"
   )
   public static int field6251;
   @OriginalMember(
      owner = "client!fu",
      name = "bb",
      descriptor = "I"
   )
   public static int field6253;
   @OriginalMember(
      owner = "client!fu",
      name = "N",
      descriptor = "I"
   )
   public static int field6254;
   @OriginalMember(
      owner = "client!fu",
      name = "db",
      descriptor = "I"
   )
   public static int field6255;
   @OriginalMember(
      owner = "client!fu",
      name = "T",
      descriptor = "I"
   )
   public static int field6256;
   @OriginalMember(
      owner = "client!fu",
      name = "G",
      descriptor = "I"
   )
   public static int field6257;
   @OriginalMember(
      owner = "client!fu",
      name = "n",
      descriptor = "I"
   )
   public static int field6258;
   @OriginalMember(
      owner = "client!fu",
      name = "M",
      descriptor = "I"
   )
   public static int field6259;
   @OriginalMember(
      owner = "client!fu",
      name = "V",
      descriptor = "I"
   )
   public static int field6260;
   @OriginalMember(
      owner = "client!fu",
      name = "E",
      descriptor = "I"
   )
   public static int field6261;
   @OriginalMember(
      owner = "client!fu",
      name = "s",
      descriptor = "I"
   )
   public static int field6262;
   @OriginalMember(
      owner = "client!fu",
      name = "Y",
      descriptor = "I"
   )
   public static int field6263;
   @OriginalMember(
      owner = "client!fu",
      name = "u",
      descriptor = "I"
   )
   public static int field6264;
   @OriginalMember(
      owner = "client!fu",
      name = "W",
      descriptor = "I"
   )
   public static int field6265;
   @OriginalMember(
      owner = "client!fu",
      name = "I",
      descriptor = "I"
   )
   public static int field6266;
   @OriginalMember(
      owner = "client!fu",
      name = "y",
      descriptor = "I"
   )
   public static int field6267;
   @OriginalMember(
      owner = "client!fu",
      name = "m",
      descriptor = "I"
   )
   public static int field6268;
   @OriginalMember(
      owner = "client!fu",
      name = "O",
      descriptor = "I"
   )
   public static int field6269;
   @OriginalMember(
      owner = "client!fu",
      name = "x",
      descriptor = "I"
   )
   public static int field6270;
   @OriginalMember(
      owner = "client!fu",
      name = "p",
      descriptor = "I"
   )
   public static int field6272;
   @OriginalMember(
      owner = "client!fu",
      name = "L",
      descriptor = "I"
   )
   public static int field6273;
   @OriginalMember(
      owner = "client!fu",
      name = "J",
      descriptor = "I"
   )
   public static int field6274;
   @OriginalMember(
      owner = "client!fu",
      name = "t",
      descriptor = "I"
   )
   public static int field6275;
   @OriginalMember(
      owner = "client!fu",
      name = "f",
      descriptor = "I"
   )
   public static int field6277;
   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "I"
   )
   public static int field6278;
   @OriginalMember(
      owner = "client!fu",
      name = "A",
      descriptor = "I"
   )
   public static int field6279;
   @OriginalMember(
      owner = "client!fu",
      name = "j",
      descriptor = "I"
   )
   public static int field6281;
   @OriginalMember(
      owner = "client!fu",
      name = "H",
      descriptor = "I"
   )
   public static int field6282;
   @OriginalMember(
      owner = "client!fu",
      name = "o",
      descriptor = "I"
   )
   public static int field6285;
   @OriginalMember(
      owner = "client!fu",
      name = "cb",
      descriptor = "I"
   )
   public static int field6286;
   @OriginalMember(
      owner = "client!fu",
      name = "c",
      descriptor = "I"
   )
   public static int field6287;
   @OriginalMember(
      owner = "client!fu",
      name = "F",
      descriptor = "I"
   )
   public static int field6291;
   @OriginalMember(
      owner = "client!fu",
      name = "v",
      descriptor = "I"
   )
   public static int field6292;
   @OriginalMember(
      owner = "client!fu",
      name = "U",
      descriptor = "I"
   )
   public static int field6294;
   @OriginalMember(
      owner = "client!fu",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field6280;
   @OriginalMember(
      owner = "client!fu",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field6283;
   @OriginalMember(
      owner = "client!fu",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field6284;
   @OriginalMember(
      owner = "client!fu",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field6288;
   @OriginalMember(
      owner = "client!fu",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field6289;
   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field6290;
   @OriginalMember(
      owner = "client!fu",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field6293;
   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field6295;
   @OriginalMember(
      owner = "client!fu",
      name = "B",
      descriptor = "Z"
   )
   public static boolean field6296;
   @OriginalMember(
      owner = "client!fu",
      name = "K",
      descriptor = "Z"
   )
   public static boolean field6297;
   @OriginalMember(
      owner = "client!fu",
      name = "Z",
      descriptor = "Z"
   )
   public static boolean field6298;

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public synchronized void method2393(byte arg0) {
      int var2 = client.field4530;

      try {
         if (class769.field11271 != null) {
            class769.field11271.removeFocusListener(this);
            class769.field11271.getParent().setBackground(Color.black);
            class769.field11271.getParent().remove(class769.field11271);
         }

         Container var3;
         label40: {
            ++field6275;
            if (class628.field9136 == null) {
               if (class691.field10404 != null) {
                  var3 = class691.field10404;
                  if (var2 == 0) {
                     break label40;
                  }
               }

               if (class238.field3003 != null) {
                  var3 = class238.field3003;
                  if (var2 == 0) {
                     break label40;
                  }
               }

               var3 = class754.field11141;
               if (var2 == 0) {
                  break label40;
               }
            }

            var3 = class628.field9136;
         }

         label29: {
            var3.setLayout((LayoutManager)null);
            class769.field11271 = new class108(this);
            var3.add(class769.field11271);
            class769.field11271.setSize(class207.field2647, class411.field6305);
            class769.field11271.setVisible(true);
            if (class691.field10404 != var3) {
               class769.field11271.setLocation(class562.field8401, class787.field11447);
               if (var2 == 0) {
                  break label29;
               }
            }

            Insets var4 = class691.field10404.getInsets();
            class769.field11271.setLocation(var4.left - -class562.field8401, class787.field11447 + var4.top);
         }

         class769.field11271.addFocusListener(this);
         class769.field11271.requestFocus();
         class618.field9024 = true;
         int var5 = -15 / ((arg0 - 10) / 35);
         class146.field1829 = true;
         class524.field7601 = true;
         class618.field9022 = false;
         class605.field8891 = class188.method1462(true);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6299[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 56
   )
   public final void windowDeactivated(WindowEvent arg0) {
      try {
         ++field6265;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[59] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 66
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         ++field6256;
         class146.field1829 = false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[56] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "h",
      descriptor = "(I)V",
      line = 74
   )
   private final void method3128(int arg0) {
      try {
         ++field6246;
         long var2 = class188.method1462(true);
         long var4 = class793.field11550[class9.field135];
         class793.field11550[class9.field135] = var2;
         boolean var10000;
         if (var4 != 0L && var4 < var2) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         class9.field135 = class9.field135 + 1 & 31;
         synchronized(this) {
            if (arg0 != 4000) {
               field6252 = null;
            }

            class618.field9024 = class146.field1829;
         }

         this.method2391(-13580);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6299[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 109
   )
   public final void windowIconified(WindowEvent arg0) {
      try {
         ++field6245;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[35] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(IB)I",
      line = 117
   )
   public static final int method3129(int arg0, byte arg1) {
      try {
         ++field6254;
         return arg1 != -93 ? -126 : arg0 >>> 7;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 129
   )
   public final void method3130(boolean arg0, String arg1) {
      try {
         ++field6264;
         if (!this.field6271) {
            this.field6271 = arg0;
            System.out.println(field6299[36] + arg1);

            try {
               class359.method2803(field6299[37], class238.field3003, (byte)-82);
            } catch (Throwable var5) {
            }

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), field6299[36] + arg1 + field6299[40]), field6299[39]);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6299[38] + arg0 + ',' + (arg1 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "f",
      descriptor = "(I)Ljava/lang/String;",
      line = 153
   )
   public String method2387(int arg0) {
      try {
         ++field6255;
         return arg0 >= -7 ? null : null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 165
   )
   public final void update(Graphics arg0) {
      try {
         this.paint(arg0);
         ++field6262;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[67] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Lha;Z)V",
      line = 175
   )
   public static final void method3131(class66 arg0, boolean arg1) {
      try {
         ++field6274;
         if (arg1) {
            method3137(71);
         }

         if (class175.field2176 != class693.field10418.field9010) {
            if (class353.field5360 != null) {
               if (class309.method2336(class693.field10418.field9010, 2, arg0)) {
                  class175.field2176 = class693.field10418.field9010;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[6] + (arg0 != null ? field6299[4] : field6299[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(ZZ)V",
      line = 199
   )
   private final void method3132(boolean arg0, boolean arg1) {
      try {
         ++field6267;
         synchronized(this) {
            if (class299.field4279) {
               return;
            }

            class299.field4279 = true;
         }

         System.out.println(field6299[27] + arg0);
         if (class238.field3003 != null) {
            class238.field3003.destroy();
         }

         try {
            this.method2385(92);
         } catch (Exception var10) {
         }

         if (this.field6276) {
            try {
               jagmisc.quit();
            } catch (Throwable var9) {
            }

            this.field6276 = false;
         }

         class206.method1577(arg1, true);
         class178.method1406((byte)-123);
         if (class769.field11271 != null) {
            try {
               class769.field11271.removeFocusListener(this);
               class769.field11271.getParent().remove(class769.field11271);
            } catch (Exception var8) {
            }
         }

         if (class755.field11144 != null) {
            try {
               class755.field11144.method5209(0);
            } catch (Exception var7) {
            }
         }

         this.method2396(511);
         if (class691.field10404 != null) {
            class691.field10404.setVisible(false);
            class691.field10404.dispose();
            class691.field10404 = null;
         }

         System.out.println(field6299[28] + arg0);
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field6299[26] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;",
      line = 272
   )
   public final URL getDocumentBase() {
      try {
         ++field6260;
         if (class691.field10404 != null) {
            return null;
         } else {
            return class238.field3003 != null && class238.field3003 != this ? class238.field3003.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6299[65] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(Z)V",
      line = 291
   )
   private final void method3133(boolean arg0) {
      try {
         if (!arg0) {
            ++field6249;
            long var2 = class188.method1462(true);
            long var4 = class430.field6580[class27.field301];
            class430.field6580[class27.field301] = var2;
            if (var4 != 0L && var2 > var4) {
               int var6 = (int)(-var4 + var2);
               class280.field3898 = (32000 - -(var6 >> 1)) / var6;
            }

            class27.field301 = 31 & class27.field301 + 1;
            if (~(class518.field7553++) < -51) {
               label28: {
                  class518.field7553 -= 50;
                  class524.field7601 = true;
                  class769.field11271.setSize(class207.field2647, class411.field6305);
                  class769.field11271.setVisible(true);
                  if (class691.field10404 != null && class628.field9136 == null) {
                     Insets var7 = class691.field10404.getInsets();
                     class769.field11271.setLocation(var7.left - -class562.field8401, class787.field11447 + var7.top);
                     if (client.field4530 == 0) {
                        break label28;
                     }
                  }

                  class769.field11271.setLocation(class562.field8401, class787.field11447);
               }
            }

            this.method2383(true);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6299[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 335
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         this.destroy();
         ++field6273;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[62] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;",
      line = 345
   )
   public final String getParameter(String arg0) {
      try {
         ++field6258;
         if (class691.field10404 != null) {
            return null;
         } else {
            return class238.field3003 != null && class238.field3003 != this ? class238.field3003.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[21] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 363
   )
   public final void windowDeiconified(WindowEvent arg0) {
      try {
         ++field6269;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[57] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 372
   )
   public final void windowClosed(WindowEvent arg0) {
      try {
         ++field6261;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[66] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "provideLoaderApplet",
      descriptor = "(Ljava/applet/Applet;)V",
      line = 381
   )
   public static final void provideLoaderApplet(Applet arg0) {
      try {
         ++field6268;
         class238.field3003 = arg0;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6299[58] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(B)Z",
      line = 389
   )
   public final boolean method3134(byte arg0) {
      try {
         if (arg0 <= 93) {
            this.method3132(false, false);
         }

         ++field6277;
         return class298.method2280(0, field6299[19]);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 403
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         ++field6259;
         if (class754.field11141 == this && !class299.field4279) {
            class524.field7601 = true;
            if (class336.field4806 && ~(-class605.field8891 + class188.method1462(true)) < -1001L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || var2.width >= class88.field1075 && ~class332.field4758 >= ~var2.height) {
                  class618.field9022 = true;
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6299[3] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;",
      line = 427
   )
   public final AppletContext getAppletContext() {
      try {
         ++field6272;
         if (class691.field10404 != null) {
            return null;
         } else {
            return class238.field3003 != null && class238.field3003 != this ? class238.field3003.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6299[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 442
   )
   public final void windowOpened(WindowEvent arg0) {
      try {
         ++field6278;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[55] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "run",
      descriptor = "()V",
      line = 449
   )
   public final void run() {
      int var1 = client.field4530;

      try {
         ++field6251;

         try {
            if (class719.field10708 != null) {
               label517: {
                  String var2 = class719.field10708.toLowerCase();
                  if (~var2.indexOf(field6299[53]) == 0 && ~var2.indexOf(field6299[50]) == 0) {
                     if (var2.indexOf(field6299[54]) == -1 || class719.field10705 != null && !class719.field10705.equals(field6299[49])) {
                        break label517;
                     }

                     this.method3130(true, field6299[47]);
                     if (var1 == 0) {
                        return;
                     }
                  }

                  String var3 = class719.field10705;
                  if (var3.equals(field6299[45]) || var3.startsWith(field6299[51]) || var3.equals(field6299[48]) || var3.startsWith(field6299[46])) {
                     this.method3130(true, field6299[47]);
                     if (var1 == 0) {
                        return;
                     }
                  }
               }
            }

            int var10000;
            if (class719.field10705 != null && class719.field10705.startsWith(field6299[44])) {
               label525: {
                  int var4 = 2;
                  int var5 = 0;
                  if (var1 != 0) {
                     var10000 = class719.field10705.charAt(var4);
                  } else if (class719.field10705.length() <= var4) {
                     var10000 = ~var5;
                     if (var1 == 0) {
                        if (var10000 <= -6) {
                           class336.field4806 = true;
                        }
                        break label525;
                     }
                  } else {
                     var10000 = class719.field10705.charAt(var4);
                  }

                  label485:
                  while(true) {
                     while(true) {
                        while(true) {
                           int var6 = var10000;
                           if (var6 >= 48) {
                              if (var6 > 57) {
                                 if (var1 == 0) {
                                    var10000 = ~var5;
                                    if (var1 == 0) {
                                       if (var10000 <= -6) {
                                          class336.field4806 = true;
                                       }
                                       break label485;
                                    }
                                    continue;
                                 }

                                 ++var4;
                                 var5 = var5 * 10 - -var6 - 48;
                              } else {
                                 ++var4;
                                 var5 = var5 * 10 - -var6 - 48;
                              }

                              if (class719.field10705.length() <= var4) {
                                 var10000 = ~var5;
                                 if (var1 == 0) {
                                    if (var10000 <= -6) {
                                       class336.field4806 = true;
                                    }
                                    break label485;
                                 }
                              } else {
                                 var10000 = class719.field10705.charAt(var4);
                              }
                           } else {
                              var10000 = ~var5;
                              if (var1 == 0) {
                                 if (var10000 <= -6) {
                                    class336.field4806 = true;
                                 }
                                 break label485;
                              }
                           }
                        }
                     }
                  }
               }
            }

            Applet var7 = class754.field11141;
            if (class238.field3003 != null) {
               var7 = class238.field3003;
            }

            Method var8 = class719.field10720;
            if (var8 != null) {
               try {
                  var8.invoke(var7, Boolean.TRUE);
               } catch (Throwable var21) {
               }
            }

            class158.method1309(96);
            class153.method1260(-61);
            this.method2393((byte)65);
            this.method2399(0);
            class401.field6167 = class39.method270(81);
            int var9;
            if (var1 != 0) {
               class45.field475 = class401.field6167.method4238(15297, class63.field782);
               var9 = 0;
               if (var1 != 0) {
                  this.method3128(4000);
                  ++var9;
               }
            } else if (~class544.field8068 != -1L) {
               long var26;
               var10000 = (var26 = class188.method1462(true) - class544.field8068) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (var1 == 0) {
                  if (var10000 >= 0) {
                     return;
                  }

                  class45.field475 = class401.field6167.method4238(15297, class63.field782);
                  var9 = 0;
                  if (var1 != 0) {
                     this.method3128(4000);
                     ++var9;
                  }
               } else {
                  var9 = var10000;
                  if (var1 != 0) {
                     this.method3128(4000);
                     ++var9;
                  }
               }
            } else {
               class45.field475 = class401.field6167.method4238(15297, class63.field782);
               var9 = 0;
               if (var1 != 0) {
                  this.method3128(4000);
                  ++var9;
               }
            }

            while(true) {
               while(~class45.field475 < ~var9) {
                  this.method3128(4000);
                  ++var9;
               }

               this.method3133(false);
               if (var1 == 0) {
                  class580.method4275(1001, class755.field11144, class769.field11271);
                  if (~class544.field8068 != -1L) {
                     long var27;
                     var10000 = (var27 = class188.method1462(true) - class544.field8068) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                     if (var1 == 0) {
                        if (var10000 >= 0) {
                           break;
                        }

                        class45.field475 = class401.field6167.method4238(15297, class63.field782);
                        var9 = 0;
                        if (var1 != 0) {
                           this.method3128(4000);
                           ++var9;
                        }
                     } else {
                        var9 = var10000;
                        if (var1 != 0) {
                           this.method3128(4000);
                           ++var9;
                        }
                     }
                  } else {
                     class45.field475 = class401.field6167.method4238(15297, class63.field782);
                     var9 = 0;
                     if (var1 != 0) {
                        this.method3128(4000);
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
            class238.method1776(-98, var23, this.method2387(-94));
            this.method3130(true, field6299[31]);
         } finally {
            Object var15 = null;
            this.method3132(true, false);
         }

      } catch (RuntimeException var25) {
         throw class670.method4877(var25, field6299[52] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "j",
      descriptor = "(I)Z",
      line = 574
   )
   public final boolean method3135(int arg0) {
      int var2 = client.field4530;

      try {
         ++field6244;
         String var3 = this.getDocumentBase().getHost().toLowerCase();
         if (!var3.equals(field6299[16]) && !var3.endsWith(field6299[8])) {
            if (!var3.equals(field6299[7]) && !var3.endsWith(field6299[9])) {
               if (!var3.equals(field6299[10]) && !var3.endsWith(field6299[12])) {
                  if (arg0 != -1) {
                     this.field6276 = false;
                  }

                  if (var3.endsWith(field6299[15])) {
                     return true;
                  } else {
                     int var10000;
                     while(true) {
                        if (var3.length() > 0) {
                           var10000 = ~var3.charAt(-1 + var3.length());
                           if (var2 != 0) {
                              break;
                           }

                           if (var10000 <= -49 && var3.charAt(var3.length() + -1) <= '9') {
                              var3 = var3.substring(0, -1 + var3.length());
                              continue;
                           }
                        }

                        var10000 = var3.endsWith(field6299[13]);
                        break;
                     }

                     if (var10000 != 0) {
                        return true;
                     } else {
                        this.method3130(true, field6299[14]);
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
         throw class670.method4877(var5, field6299[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "start",
      descriptor = "()V",
      line = 613
   )
   public final void start() {
      try {
         ++field6248;
         if (class754.field11141 == this && !class299.field4279) {
            class544.field8068 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6299[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "i",
      descriptor = "(I)Z",
      line = 630
   )
   public final boolean method3136(int arg0) {
      try {
         if (arg0 != -1682) {
            field6252 = null;
         }

         ++field6247;
         return class298.method2280(arg0 ^ -1682, field6299[30]);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "stop",
      descriptor = "()V",
      line = 644
   )
   public final void stop() {
      try {
         ++field6270;
         if (class754.field11141 == this && !class299.field4279) {
            class544.field8068 = 4000L + class188.method1462(true);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6299[63] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "destroy",
      descriptor = "()V",
      line = 657
   )
   public final void destroy() {
      try {
         ++field6243;
         if (class754.field11141 == this && !class299.field4279) {
            class544.field8068 = class188.method1462(true);
            class89.method817(5000L, 2535);
            class785.field11433 = null;
            this.method3132(false, false);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6299[23] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "e",
      descriptor = "(I)V",
      line = 675
   )
   public static void method3137(int arg0) {
      try {
         field6252 = null;
         if (arg0 != -51) {
            method3129(-67, (byte)-10);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6299[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 686
   )
   public final void windowActivated(WindowEvent arg0) {
      try {
         ++field6279;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[61] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(IIIIIILjava/lang/String;)V",
      line = 693
   )
   public final void method3138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
      int var8 = client.field4530;

      try {
         ++field6266;

         try {
            if (class754.field11141 != null) {
               ++class565.field8430;
               if (class565.field8430 >= 3) {
                  this.method3130(true, field6299[33]);
               } else {
                  this.getAppletContext().showDocument(this.getDocumentBase(), field6299[32]);
               }
            } else {
               class787.field11447 = 0;
               if (arg3 <= 94) {
                  field6252 = null;
               }

               class754.field11141 = this;
               class207.field2647 = arg1;
               class88.field1075 = arg1;
               class411.field6305 = arg2;
               class332.field4758 = arg2;
               class562.field8401 = 0;
               class459.field6948 = class238.field3003;
               class440.field6706 = arg4;
               class785.field11433 = class755.field11144 = new class719(arg5, arg6, arg0, class238.field3003 != null);
               class12 var9 = class755.field11144.method5214(this, -117, 1);
               if (var8 != 0) {
                  class89.method817(10L, 2535);
               }

               while(~var9.field159 == -1) {
                  class89.method817(10L, 2535);
               }

            }
         } catch (Throwable var12) {
            class238.method1776(-68, var12, (String)null);
            this.method3130(true, field6299[31]);
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6299[34] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 740
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field6263;
         class146.field1829 = true;
         class524.field7601 = true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[42] + (arg0 != null ? field6299[4] : field6299[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;",
      line = 749
   )
   public final URL getCodeBase() {
      ++field6253;
      if (class691.field10404 != null) {
         return null;
      } else {
         return class238.field3003 != null && class238.field3003 != this ? class238.field3003.getCodeBase() : super.getCodeBase();
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "g",
      descriptor = "(I)Z",
      line = 771
   )
   public final boolean method3139(int arg0) {
      try {
         ++field6257;
         return arg0 != 1 ? false : class298.method2280(0, field6299[1]);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6299[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(ILjava/lang/String;BIIIZI)V",
      line = 789
   )
   public final void method3140(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
      int var9 = client.field4530;

      try {
         ++field6250;

         try {
            class207.field2647 = arg0;
            class88.field1075 = arg0;
            class459.field6948 = null;
            class562.field8401 = 0;
            class754.field11141 = this;
            class411.field6305 = arg7;
            class332.field4758 = arg7;
            class440.field6706 = arg5;
            class787.field11447 = 0;
            class691.field10404 = new Frame();
            class691.field10404.setTitle(field6299[18]);
            class691.field10404.setResizable(true);
            class691.field10404.addWindowListener(this);
            class691.field10404.setVisible(true);
            class691.field10404.toFront();
            Insets var10 = class691.field10404.getInsets();
            if (arg2 != -125) {
               this.windowDeiconified((WindowEvent)null);
            }

            class691.field10404.setSize(class88.field1075 - -var10.left + var10.right, class332.field4758 + var10.bottom + var10.top);
            class785.field11433 = class755.field11144 = new class719(arg3, arg1, arg4, true);
            class12 var11 = class755.field11144.method5214(this, -54, 1);
            if (var9 != 0) {
               class89.method817(10L, 2535);
            }

            while(~var11.field159 == -1) {
               class89.method817(10L, 2535);
            }

         } catch (Exception var14) {
            class238.method1776(-80, var14, (String)null);
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field6299[17] + arg0 + ',' + (arg1 != null ? field6299[4] : field6299[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method2399(int arg0);

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method2385(int arg0);

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method2396(int arg0);

   @OriginalMember(
      owner = "client!fu",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method2383(boolean arg0);

   @OriginalMember(
      owner = "client!fu",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method2391(int arg0);

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3141(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3142(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
