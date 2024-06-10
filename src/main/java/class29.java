import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ma")
public class class29 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "loginapplet!ma",
      name = "a",
      descriptor = "I"
   )
   public static volatile int field198 = 0;
   @OriginalMember(
      owner = "loginapplet!ma",
      name = "b",
      descriptor = "I"
   )
   public static int field199;
   @OriginalMember(
      owner = "loginapplet!ma",
      name = "c",
      descriptor = "Lsa;"
   )
   public static class41 field200 = class8.method31(-127, "box_top");
   @OriginalMember(
      owner = "loginapplet!ma",
      name = "d",
      descriptor = "I"
   )
   public static int field201 = 0;

   @OriginalMember(
      owner = "loginapplet!ma",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 40
   )
   public final void focusGained(FocusEvent arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ma",
      name = "a",
      descriptor = "(Z)V",
      line = 52
   )
   public static void method141(boolean arg0) {
      try {
         field200 = null;
         if (arg0) {
            field198 = 123;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ma.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ma",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 90
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         if (null != class8.field73) {
            int var2 = arg0.getKeyCode();
            if (var2 >= 0 && var2 < class1.field2.length) {
               var2 = class1.field2[var2] & -129;
            } else {
               var2 = -1;
            }

            if (class34.field224 >= 0 && ~var2 <= -1) {
               class34.field229[class34.field224] = ~var2;
               class34.field224 = 127 & 1 + class34.field224;
               if (class11.field87 == class34.field224) {
                  class34.field224 = -1;
               }
            }
         }

         arg0.consume();
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ma.keyReleased(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ma",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 138
   )
   public final void keyTyped(KeyEvent arg0) {
      try {
         int var2 = class19.method90(98, arg0);
         if (0 <= var2) {
            int var3 = class22.field156 - -1 & 127;
            if (~var3 != ~class9.field77) {
               class15.field119[class22.field156] = -1;
               class12.field98[class22.field156] = var2;
               class22.field156 = var3;
            }
         }

         arg0.consume();
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ma.keyTyped(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ma",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 197
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         if (null != class8.field73) {
            int var2 = arg0.getKeyCode();
            if (-1 >= ~var2 && ~var2 > ~class1.field2.length) {
               var2 = class1.field2[var2];
               if (0 != (var2 & 128)) {
                  var2 = -1;
               }
            } else {
               var2 = -1;
            }

            if (0 <= class34.field224 && -1 >= ~var2) {
               class34.field229[class34.field224] = var2;
               class34.field224 = 1 + class34.field224 & 127;
               if (class34.field224 == class11.field87) {
                  class34.field224 = -1;
               }
            }

            int var3;
            if (~var2 <= -1) {
               var3 = class22.field156 - -1 & 127;
               if (~var3 != ~class9.field77) {
                  class15.field119[class22.field156] = var2;
                  class12.field98[class22.field156] = -1;
                  class22.field156 = var3;
               }
            }

            var3 = arg0.getModifiers();
            if (~(var3 & 10) != -1 || -86 == ~var2 || var2 == 10) {
               arg0.consume();
            }
         }

      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ma.keyPressed(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ma",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 253
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         if (class8.field73 != null) {
            class34.field224 = -1;
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ma.focusLost(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }
}
