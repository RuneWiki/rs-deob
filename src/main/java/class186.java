import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class186 extends class376 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @OriginalMember(
      owner = "client!eea",
      name = "n",
      descriptor = "Lrca;"
   )
   private class37 field2372 = new class37();
   @OriginalMember(
      owner = "client!eea",
      name = "g",
      descriptor = "Lrca;"
   )
   private class37 field2374 = new class37();
   @OriginalMember(
      owner = "client!eea",
      name = "j",
      descriptor = "Z"
   )
   private boolean field2379;
   @OriginalMember(
      owner = "client!eea",
      name = "h",
      descriptor = "I"
   )
   private int field2370;
   @OriginalMember(
      owner = "client!eea",
      name = "k",
      descriptor = "I"
   )
   private int field2371;
   @OriginalMember(
      owner = "client!eea",
      name = "l",
      descriptor = "I"
   )
   private int field2373;
   @OriginalMember(
      owner = "client!eea",
      name = "m",
      descriptor = "I"
   )
   private int field2375;
   @OriginalMember(
      owner = "client!eea",
      name = "o",
      descriptor = "I"
   )
   private int field2376;
   @OriginalMember(
      owner = "client!eea",
      name = "i",
      descriptor = "I"
   )
   private int field2377;
   @OriginalMember(
      owner = "client!eea",
      name = "f",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field2378;

   @OriginalMember(
      owner = "client!eea",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!eea",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method1567(0, arg0);
      if ((var2 & this.field2377) == 0) {
         var2 = this.field2377;
      }

      if (~(var2 & 1) != -1) {
         this.method1561(3, arg0.getY(), false, arg0.getX(), arg0.getClickCount());
      }

      if ((var2 & 4) != 0) {
         this.method1561(5, arg0.getY(), false, arg0.getX(), arg0.getClickCount());
      }

      if ((2 & var2) != 0) {
         this.method1561(4, arg0.getY(), false, arg0.getX(), arg0.getClickCount());
      }

      this.field2377 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!eea",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      this.method1568(-64, arg0.getX(), arg0.getY());
   }

   @OriginalMember(
      owner = "client!eea",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      this.method1568(-90, arg0.getX(), arg0.getY());
   }

   @OriginalMember(
      owner = "client!eea",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      this.method1568(72, arg0.getX(), arg0.getY());
   }

   @OriginalMember(
      owner = "client!eea",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method1558(int arg0) {
      int var2 = -40 % ((arg0 - -24) / 55);
      return (1 & this.field2371) != 0;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method1559(boolean arg0) {
      if (arg0) {
         this.mousePressed((MouseEvent)null);
      }

      return (4 & this.field2371) != 0;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1560(int arg0) {
      this.method1562((byte)80);
      if (arg0 != 0) {
         this.method1565(false);
      }

   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(IIZII)V"
   )
   private final void method1561(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      class185 var6 = new class185();
      var6.field2367 = arg1;
      var6.field2365 = arg3;
      var6.field2369 = arg0;
      var6.field2366 = class163.method1353(-121);
      var6.field2368 = arg4;
      this.field2374.method279(arg2, var6);
   }

   @OriginalMember(
      owner = "client!eea",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method1562(byte arg0) {
      if (this.field2378 != null) {
         this.field2378.removeMouseWheelListener(this);
         this.field2378.removeMouseMotionListener(this);
         this.field2378.removeMouseListener(this);
         this.field2378 = null;
         if (arg0 <= 41) {
            this.field2378 = (Component)null;
         }

         this.field2374 = null;
         this.field2372 = null;
         this.field2370 = this.field2373 = this.field2371 = 0;
         this.field2376 = this.field2375 = this.field2377 = 0;
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "e",
      descriptor = "(I)Lwi;"
   )
   public final class505 method1563(int arg0) {
      if (arg0 != -28145) {
         this.mouseEntered((MouseEvent)null);
      }

      return (class505)this.field2372.method281(true);
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V"
   )
   private final void method1564(int arg0, Component arg1) {
      this.method1562((byte)126);
      this.field2378 = arg1;
      this.field2378.addMouseListener(this);
      this.field2378.addMouseMotionListener(this);
      if (arg0 > -84) {
         this.field2376 = 0;
      }

      this.field2378.addMouseWheelListener(this);
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method1565(boolean arg0) {
      this.field2370 = this.field2376;
      this.field2371 = this.field2377;
      this.field2373 = this.field2375;
      class37 var2 = this.field2372;
      this.field2372 = this.field2374;
      this.field2374 = var2;
      this.field2374.method289(arg0);
   }

   @OriginalMember(
      owner = "client!eea",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1566(int arg0) {
      return arg0 != 0 ? 124 : this.field2373;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(ILjava/awt/event/MouseEvent;)I"
   )
   private final int method1567(int arg0, MouseEvent arg1) {
      if (arg1.getButton() == 1) {
         return arg1.isMetaDown() ? 4 : 1;
      } else {
         if (arg0 != 0) {
            this.method1566(-73);
         }

         if (arg1.getButton() == 2) {
            return 2;
         } else {
            return arg1.getButton() == 3 ? 4 : 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method1567(0, arg0);
      if (var2 != 1) {
         if (var2 == 4) {
            this.method1561(2, arg0.getY(), false, arg0.getX(), arg0.getClickCount());
         } else if (var2 == 2) {
            this.method1561(1, arg0.getY(), false, arg0.getX(), arg0.getClickCount());
         }
      } else {
         this.method1561(0, arg0.getY(), false, arg0.getX(), arg0.getClickCount());
      }

      this.field2377 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!eea",
      name = "mouseWheelMoved",
      descriptor = "(Ljava/awt/event/MouseWheelEvent;)V"
   )
   public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method1561(6, var3, false, var2, var4);
      arg0.consume();
   }

   @OriginalMember(
      owner = "client!eea",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      this.method1568(-57, arg0.getX(), arg0.getY());
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(III)V"
   )
   private final void method1568(int arg0, int arg1, int arg2) {
      this.field2375 = arg2;
      this.field2376 = arg1;
      int var4 = 41 % ((arg0 - 7) / 62);
      if (this.field2379) {
         this.method1561(-1, arg2, false, arg1, 0);
      }

   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1569(byte arg0) {
      if (arg0 != 19) {
         this.field2371 = -96;
      }

      return ~(this.field2371 & 2) != -1;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1570(int arg0) {
      if (arg0 != 29658) {
         this.method1558(101);
      }

      return this.field2370;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public class186(Component arg0, boolean arg1) {
      this.method1564(-117, arg0);
      this.field2379 = arg1;
   }
}
