import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!o")
public class class32 implements MouseListener, MouseMotionListener, FocusListener {
   @OriginalMember(
      owner = "loginapplet!o",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field204 = new int[256];
   @OriginalMember(
      owner = "loginapplet!o",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field205;

   @OriginalMember(
      owner = "loginapplet!o",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static final void method151(int arg0) {
      try {
         class29 var1 = class8.field73;
         synchronized(class8.field73) {
            class9.field77 = class33.field207;
            if (arg0 != -21414) {
               method151(-79);
            }

            int var2;
            if (0 <= class34.field224) {
               while(class11.field87 != class34.field224) {
                  var2 = class34.field229[class11.field87];
                  class11.field87 = 1 + class11.field87 & 127;
                  if (~var2 <= -1) {
                     class25.field174[var2] = true;
                  } else {
                     class25.field174[~var2] = false;
                  }
               }
            } else {
               for(var2 = 0; ~var2 > -113; ++var2) {
                  class25.field174[var2] = false;
               }

               class34.field224 = class11.field87;
            }

            class33.field207 = class22.field156;
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "o.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 49
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         if (class14.field111 != null) {
            class26.field179 = arg0.getX();
            class8.field74 = arg0.getY();
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.mouseEntered(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 66
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      try {
         if (null != class14.field111) {
            class29.field198 = arg0.getX();
            class28.field197 = arg0.getY();
            if (!arg0.isMetaDown()) {
               class10.field80 = 1;
            } else {
               class10.field80 = 2;
            }
         }

         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.mousePressed(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 101
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         if (null != class14.field111) {
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.focusLost(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "a",
      descriptor = "(B)V",
      line = 120
   )
   public static void method152(byte arg0) {
      try {
         field204 = null;
         field205 = null;
         if (arg0 != -79) {
            method151(-53);
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "o.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 132
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         if (class14.field111 == null) {
         }

         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.mouseReleased(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 152
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         if (class14.field111 != null) {
            class26.field179 = arg0.getX();
            class8.field74 = arg0.getY();
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.mouseMoved(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 170
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         if (null != class14.field111) {
            class26.field179 = arg0.getX();
            class8.field74 = arg0.getY();
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.mouseDragged(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 186
   )
   public final void focusGained(FocusEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 190
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         if (class14.field111 != null) {
            class26.field179 = -1;
            class8.field74 = -1;
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.mouseExited(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!o",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 211
   )
   public final void mouseClicked(MouseEvent arg0) {
      try {
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "o.mouseClicked(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   static {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(int var2 = 0; ~var2 > -9; ++var2) {
            if (~(1 & var0) == -2) {
               var0 = var0 >>> 1558718049 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field204[var1] = var0;
      }

   }
}
