import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class165 extends class592 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @OriginalMember(
      owner = "client!vv",
      name = "n",
      descriptor = "Lsb;"
   )
   private class261 field2493 = new class261();
   @OriginalMember(
      owner = "client!vv",
      name = "j",
      descriptor = "Lsb;"
   )
   private class261 field2497 = new class261();
   @OriginalMember(
      owner = "client!vv",
      name = "m",
      descriptor = "Z"
   )
   private boolean field2500;
   @OriginalMember(
      owner = "client!vv",
      name = "p",
      descriptor = "I"
   )
   private int field2492;
   @OriginalMember(
      owner = "client!vv",
      name = "i",
      descriptor = "I"
   )
   private int field2494;
   @OriginalMember(
      owner = "client!vv",
      name = "k",
      descriptor = "I"
   )
   private int field2495;
   @OriginalMember(
      owner = "client!vv",
      name = "h",
      descriptor = "I"
   )
   private int field2496;
   @OriginalMember(
      owner = "client!vv",
      name = "g",
      descriptor = "I"
   )
   private int field2498;
   @OriginalMember(
      owner = "client!vv",
      name = "l",
      descriptor = "I"
   )
   private int field2499;
   @OriginalMember(
      owner = "client!vv",
      name = "o",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field2501;

   @OriginalMember(
      owner = "client!vv",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      this.method1550(arg0.getX(), 0, arg0.getY());
   }

   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1548(int arg0) {
      if (arg0 != 10035) {
         this.method1556(96);
      }

      return (2 & this.field2494) != 0;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!vv",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1549(int arg0) {
      if (arg0 >= -27) {
         this.field2501 = (Component)null;
      }

      return this.field2495;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      this.method1550(arg0.getX(), 0, arg0.getY());
   }

   @OriginalMember(
      owner = "client!vv",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method1553(arg0, 18711);
      if (var2 != 1) {
         if (~var2 == -5) {
            this.method1559(2, false, arg0.getX(), arg0.getY(), arg0.getClickCount());
         } else if (var2 == 2) {
            this.method1559(1, false, arg0.getX(), arg0.getY(), arg0.getClickCount());
         }
      } else {
         this.method1559(0, false, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      this.field2498 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!vv",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      this.method1550(arg0.getX(), 0, arg0.getY());
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(III)V"
   )
   private final void method1550(int arg0, int arg1, int arg2) {
      this.field2499 = arg0;
      this.field2496 = arg2;
      if (arg1 != 0) {
         this.field2493 = (class261)null;
      }

      if (this.field2500) {
         this.method1559(-1, false, arg0, arg2, 0);
      }

   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1551(boolean arg0) {
      if (arg0) {
         this.field2500 = true;
      }

      return (this.field2494 & 4) != 0;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "mouseWheelMoved",
      descriptor = "(Ljava/awt/event/MouseWheelEvent;)V"
   )
   public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method1559(6, false, var2, var3, var4);
      arg0.consume();
   }

   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "(Z)V"
   )
   public final synchronized void method1552(boolean arg0) {
      this.field2492 = this.field2496;
      this.field2495 = this.field2499;
      this.field2494 = this.field2498;
      if (!arg0) {
         this.field2492 = 118;
      }

      class261 var2 = this.field2493;
      this.field2493 = this.field2497;
      this.field2497 = var2;
      this.field2497.method2237(64);
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I"
   )
   private final int method1553(MouseEvent arg0, int arg1) {
      if (arg1 != 18711) {
         return -116;
      } else if (arg0.getButton() == 1) {
         return !arg0.isMetaDown() ? 1 : 4;
      } else if (arg0.getButton() != 2) {
         return arg0.getButton() == 3 ? 4 : 0;
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method1553(arg0, 18711);
      if (~(this.field2498 & var2) == -1) {
         var2 = this.field2498;
      }

      if (~(1 & var2) != -1) {
         this.method1559(3, false, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      if (~(4 & var2) != -1) {
         this.method1559(5, false, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      if ((var2 & 2) != 0) {
         this.method1559(4, false, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      this.field2498 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!vv",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      this.method1550(arg0.getX(), 0, arg0.getY());
   }

   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "(B)Lsc;"
   )
   public final class143 method1554(byte arg0) {
      if (arg0 <= 56) {
         this.field2494 = -92;
      }

      return (class143)this.field2493.method2235(98);
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(Ljava/awt/Component;B)V"
   )
   private final void method1555(Component arg0, byte arg1) {
      this.method1556(0);
      this.field2501 = arg0;
      if (arg1 >= 20) {
         this.field2501.addMouseListener(this);
         this.field2501.addMouseMotionListener(this);
         this.field2501.addMouseWheelListener(this);
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method1556(int arg0) {
      if (this.field2501 != null) {
         this.field2501.removeMouseWheelListener(this);
         this.field2501.removeMouseMotionListener(this);
         this.field2501.removeMouseListener(this);
         this.field2499 = this.field2496 = this.field2498 = arg0;
         this.field2497 = null;
         this.field2495 = this.field2492 = this.field2494 = 0;
         this.field2493 = null;
         this.field2501 = null;
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1557(byte arg0) {
      if (arg0 == -26) {
         this.method1556(arg0 ^ -26);
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1558(int arg0) {
      if (arg0 <= 71) {
         this.method1550(-72, -36, 49);
      }

      return (1 & this.field2494) != 0;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(IZIII)V"
   )
   private final void method1559(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
      class45 var6 = new class45();
      var6.field663 = arg2;
      var6.field664 = arg0;
      var6.field666 = arg3;
      var6.field665 = class604.method4452(29);
      var6.field662 = arg4;
      if (!arg1) {
         this.field2497.method2238(var6, 13);
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1560(byte arg0) {
      int var2 = 14 / ((28 - arg0) / 62);
      return this.field2492;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public class165(Component arg0, boolean arg1) {
      this.method1555(arg0, (byte)32);
      this.field2500 = arg1;
   }
}
