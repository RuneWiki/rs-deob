import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ab")
public abstract class class3 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "Z"
   )
   public boolean field9 = false;
   @OriginalMember(
      owner = "loginapplet!ab",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field10;
   @OriginalMember(
      owner = "loginapplet!ab",
      name = "c",
      descriptor = "I"
   )
   public static int field11 = 0;
   @OriginalMember(
      owner = "loginapplet!ab",
      name = "d",
      descriptor = "I"
   )
   public static int field12;
   @OriginalMember(
      owner = "loginapplet!ab",
      name = "e",
      descriptor = "I"
   )
   public static int field13;

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(B)V",
      line = 8
   )
   private final synchronized void method7(byte arg0) {
      try {
         if (!class37.field270) {
            class37.field270 = true;

            try {
               class8.field70.removeFocusListener(this);
            } catch (Exception var6) {
            }

            try {
               this.method17(arg0 + -100);
            } catch (Exception var5) {
            }

            if (class19.field136 != null) {
               try {
                  System.exit(0);
               } catch (Throwable var4) {
               }
            }

            if (arg0 == 56) {
               if (null != class13.field106) {
                  try {
                     class13.field106.method186((byte)-84);
                  } catch (Exception var3) {
                  }
               }

               this.method10(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "ab.Q(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 59
   )
   public final void windowOpened(WindowEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 61
   )
   public final void windowClosed(WindowEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method8(byte arg0);

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 66
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         this.destroy();
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.windowClosing(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(IB)Lsa;",
      line = 74
   )
   public static final class41 method9(int arg0, byte arg1) {
      try {
         class41 var2 = new class41();
         int var3 = 103 % ((-62 - arg1) / 49);
         var2.field309 = new byte[arg0];
         var2.field316 = 0;
         return var2;
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ab.R(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method10(boolean arg0);

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 91
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         if (this == class4.field44 && !class37.field270) {
            if (null != class38.field281 && class38.field281.startsWith("1.5") && ~(class42.method212(true) - class6.field57) < -1001L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || class34.field216 <= var2.width && var2.height >= loginapplet.field185) {
                  class34.field215 = true;
               }
            }

         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.paint(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "start",
      descriptor = "()V",
      line = 118
   )
   public final void start() {
      try {
         if (this == class4.field44 && !class37.field270) {
            class6.field58 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ab.start()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(IFIF)V",
      line = 128
   )
   public static final void method11(int arg0, float arg1, int arg2, float arg3) {
      try {
         class16.field124 = arg1;
         class37.field269 = arg3;
         class4.field52 = new class7[arg2];

         int var4;
         for(var4 = 0; ~arg2 < ~var4; ++var4) {
            double var5 = 3.141592653589793D * class46.field337.nextDouble() * 2.0D;
            int var7 = Math.abs(class46.field337.nextInt() % 200);
            float var8 = (float)Math.cos(var5);
            float var9 = (float)Math.sin(var5);
            class4.field52[var4] = new class7(var8 * 15.0F + class37.field269, class16.field124 + var9 * 15.0F, var8, var9, var7);
         }

         class16.field126 = new int[255];

         for(var4 = 0; var4 < 255; ++var4) {
            class16.field126[var4] = class22.method112(var4, true);
            if (var4 > 210) {
               class16.field126[var4] = class26.method127(class16.field126[var4], method18(var4, true));
            }
         }

         if (arg0 != -15775) {
            field10 = false;
         }

      } catch (RuntimeException var10) {
         throw class28.method139(var10, "ab.N(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 170
   )
   public final void windowDeactivated(WindowEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(I)V",
      line = 176
   )
   public final synchronized void method12(int arg0) {
      try {
         Container var2;
         if (class19.field136 != null) {
            var2 = class19.field136;
         } else {
            var2 = class13.field106.field272;
         }

         if (class8.field70 != null) {
            class8.field70.removeFocusListener(this);
            var2.remove(class8.field70);
         }

         class8.field70 = new class37(this);
         var2.add(class8.field70);
         class8.field70.setSize(class34.field216, loginapplet.field185);
         class8.field70.setVisible(true);
         if (null != class19.field136) {
            Insets var3 = class19.field136.getInsets();
            class8.field70.setLocation(var3.left, var3.top);
         } else {
            class8.field70.setLocation(0, 0);
         }

         if (arg0 <= 73) {
            method18(126, false);
         }

         class8.field70.addFocusListener(this);
         class8.field70.requestFocus();
         class34.field215 = false;
         class6.field57 = class42.method212(true);
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ab.S(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;",
      line = 215
   )
   public final AppletContext getAppletContext() {
      try {
         if (null == class19.field136) {
            return class13.field106 != null && class13.field106.field272 != this ? class13.field106.field272.getAppletContext() : super.getAppletContext();
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ab.getAppletContext()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "c",
      descriptor = "(B)Z",
      line = 231
   )
   public final boolean method13(byte arg0) {
      try {
         if (arg0 != 69) {
            return true;
         } else {
            String var2 = this.getDocumentBase().getHost().toLowerCase();
            if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
               if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
                  if (var2.endsWith("127.0.0.1")) {
                     return true;
                  } else {
                     while(-1 > ~var2.length() && var2.charAt(-1 + var2.length()) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                        var2 = var2.substring(0, var2.length() + -1);
                     }

                     if (var2.endsWith("192.168.1.")) {
                        return true;
                     } else {
                        this.method21(false, "invalidhost");
                        return false;
                     }
                  }
               } else {
                  return true;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.U(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "b",
      descriptor = "(I)V",
      line = 266
   )
   private final void method14(int arg0) {
      try {
         long var4 = class44.field331[class20.field144];
         long var2 = class42.method212(true);
         class44.field331[class20.field144] = var2;
         class20.field144 = class20.field144 - arg0 & 31;
         if (var4 != 0L && ~var2 >= ~var4) {
         }

         synchronized(this) {
            field10 = class11.field88;
         }

         this.method20((byte)-80);
      } catch (RuntimeException var9) {
         throw class28.method139(var9, "ab.T(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;",
      line = 292
   )
   public final String getParameter(String arg0) {
      try {
         if (class19.field136 != null) {
            return null;
         } else {
            return null != class13.field106 && this != class13.field106.field272 ? class13.field106.field272.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.getParameter(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(IIIII)V",
      line = 306
   )
   public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         try {
            if (null != class4.field44) {
               ++class41.field308;
               if (class41.field308 >= 3) {
                  this.method21(false, "alreadyloaded");
                  return;
               }

               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               return;
            }

            class34.field216 = arg2;
            if (arg4 != -18742) {
               field11 = 96;
            }

            class33.field212 = arg0;
            loginapplet.field185 = arg1;
            class4.field44 = this;
            if (null == class13.field106) {
               class17.field134 = class13.field106 = new class38(false, this, arg3, (String)null, 0);
            }

            class13.field106.method179(this, arg4 + 18744, 1);
         } catch (Exception var7) {
            class14.method78((String)null, var7, -47);
            this.method21(false, "crash");
         }

      } catch (RuntimeException var8) {
         throw class28.method139(var8, "ab.O(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "c",
      descriptor = "(I)V",
      line = 345
   )
   private final void method16(int arg0) {
      try {
         long var2 = class42.method212(true);
         long var4 = class44.field330[class33.field209];
         class44.field330[class33.field209] = var2;
         if (arg0 == 0) {
            class33.field209 = 31 & 1 + class33.field209;
            if (~var4 != -1L && ~var4 > ~var2) {
            }

            if (class10.field78++ > 50) {
               class10.field78 -= 50;
               class8.field70.setSize(class34.field216, loginapplet.field185);
               class8.field70.setVisible(true);
               if (null == class19.field136) {
                  class8.field70.setLocation(0, 0);
               } else {
                  Insets var6 = class19.field136.getInsets();
                  class8.field70.setLocation(var6.left, var6.top);
               }
            }

            this.method8((byte)113);
         }
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "ab.P(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 386
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         class11.field88 = false;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.focusLost(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "providesignlink",
      descriptor = "(Lr;)V",
      line = 393
   )
   public static final void providesignlink(class38 arg0) {
      try {
         class13.field106 = arg0;
         class17.field134 = arg0;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ab.providesignlink(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "run",
      descriptor = "()V",
      line = 401
   )
   public final void run() {
      try {
         try {
            if (null != class38.field279) {
               String var1 = class38.field279.toLowerCase();
               if (0 == ~var1.indexOf("sun") && var1.indexOf("apple") == -1) {
                  if (0 != ~var1.indexOf("ibm") && (class38.field281 == null || class38.field281.equals("1.4.2"))) {
                     this.method21(false, "wrongjava");
                     return;
                  }
               } else {
                  String var2 = class38.field281;
                  if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                     this.method21(false, "wrongjava");
                     return;
                  }

                  class4.field33 = 5;
               }
            }

            if (null != class13.field106.field272) {
               Method var6 = class38.field284;
               if (null != var6) {
                  try {
                     var6.invoke(class13.field106.field272, Boolean.TRUE);
                  } catch (Throwable var3) {
                  }
               }
            }

            this.method12(123);
            class15.field116 = class28.method138((byte)110, loginapplet.field185, class34.field216, class8.field70);
            this.method19(117);
            class39.field295 = class45.method221(50);

            while(~class6.field58 == -1L || class42.method212(true) < class6.field58) {
               class39.field301 = class39.field295.method36(0, class4.field33, class42.field323);

               for(int var7 = 0; ~class39.field301 < ~var7; ++var7) {
                  this.method14(-1);
               }

               this.method16(0);
               class22.method111(class13.field106, (byte)-37, class8.field70);
            }
         } catch (Exception var4) {
            class14.method78((String)null, var4, -17);
            this.method21(false, "crash");
         }

         this.method7((byte)56);
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ab.run()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method17(int arg0);

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 479
   )
   public final void windowActivated(WindowEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 483
   )
   public final void update(Graphics arg0) {
      try {
         this.paint(arg0);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.update(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 492
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         class11.field88 = true;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.focusGained(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(IZ)I",
      line = 501
   )
   private static final int method18(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            method11(-76, 0.7497146F, -26, 0.19570106F);
         }

         return (int)((double)arg0 * 0.25D) << 1985327688;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ab.M(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;",
      line = 511
   )
   public final URL getDocumentBase() {
      try {
         if (class19.field136 != null) {
            return null;
         } else {
            return null != class13.field106 && class13.field106.field272 != this ? class13.field106.field272.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ab.getDocumentBase()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 531
   )
   public final void windowDeiconified(WindowEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 537
   )
   public final void windowIconified(WindowEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "stop",
      descriptor = "()V",
      line = 542
   )
   public final void stop() {
      try {
         if (this == class4.field44 && !class37.field270) {
            class6.field58 = 4000L + class42.method212(true);
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ab.stop()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method19(int arg0);

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "d",
      descriptor = "(B)V"
   )
   public abstract void method20(byte arg0);

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 558
   )
   public void method21(boolean arg0, String arg1) {
      try {
         if (!this.field9) {
            this.field9 = true;
            System.out.println("error_game_" + arg1);

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
            } catch (Exception var4) {
            }

            if (arg0) {
               field10 = true;
            }

         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ab.F(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;",
      line = 579
   )
   public final URL getCodeBase() {
      try {
         if (null == class19.field136) {
            return null != class13.field106 && class13.field106.field272 != this ? class13.field106.field272.getCodeBase() : super.getCodeBase();
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   @OriginalMember(
      owner = "loginapplet!ab",
      name = "destroy",
      descriptor = "()V",
      line = 593
   )
   public final void destroy() {
      try {
         if (this == class4.field44 && !class37.field270) {
            class6.field58 = class42.method212(true);
            class37.method177(5000L, false);
            class17.field134 = null;
            this.method7((byte)56);
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ab.destroy()");
      }
   }
}
