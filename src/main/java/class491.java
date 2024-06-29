import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class491 extends class544 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @OriginalMember(
      owner = "client!qg",
      name = "m",
      descriptor = "Lod;"
   )
   private class536 field6755 = new class536();
   @OriginalMember(
      owner = "client!qg",
      name = "i",
      descriptor = "Lod;"
   )
   private class536 field6759 = new class536();
   @OriginalMember(
      owner = "client!qg",
      name = "l",
      descriptor = "Z"
   )
   private boolean field6763;
   @OriginalMember(
      owner = "client!qg",
      name = "k",
      descriptor = "I"
   )
   private int field6754;
   @OriginalMember(
      owner = "client!qg",
      name = "j",
      descriptor = "I"
   )
   private int field6756;
   @OriginalMember(
      owner = "client!qg",
      name = "q",
      descriptor = "I"
   )
   private int field6757;
   @OriginalMember(
      owner = "client!qg",
      name = "h",
      descriptor = "I"
   )
   private int field6758;
   @OriginalMember(
      owner = "client!qg",
      name = "o",
      descriptor = "I"
   )
   private int field6760;
   @OriginalMember(
      owner = "client!qg",
      name = "p",
      descriptor = "I"
   )
   private int field6761;
   @OriginalMember(
      owner = "client!qg",
      name = "n",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field6762;

   @OriginalMember(
      owner = "client!qg",
      name = "e",
      descriptor = "(I)V"
   )
   public final synchronized void method1579(int arg0) {
      this.field6757 = this.field6758;
      this.field6754 = this.field6760;
      this.field6756 = this.field6761;
      class536 var2 = this.field6755;
      this.field6755 = this.field6759;
      this.field6759 = var2;
      this.field6759.method3861(116);
      if (arg0 != 85) {
         this.method3567((Component)null, 94);
      }

   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1572(boolean arg0) {
      if (arg0) {
         this.mouseWheelMoved((MouseWheelEvent)null);
      }

      return this.field6754;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method3565(int arg0, int arg1, int arg2, int arg3, int arg4) {
      class689 var6 = new class689();
      if (arg0 == 14611) {
         var6.field10087 = arg2;
         var6.field10083 = arg3;
         var6.field10085 = arg1;
         var6.field10084 = class792.method5708(-25005);
         var6.field10086 = arg4;
         this.field6759.method3859(2, var6);
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      this.method3569(arg0.getX(), arg0.getY(), -46);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method3566((byte)5, arg0);
      if ((this.field6758 & var2) == 0) {
         var2 = this.field6758;
      }

      if (~(1 & var2) != -1) {
         this.method3565(14611, 3, arg0.getY(), arg0.getX(), arg0.getClickCount());
      }

      if ((4 & var2) != 0) {
         this.method3565(14611, 5, arg0.getY(), arg0.getX(), arg0.getClickCount());
      }

      if ((2 & var2) != 0) {
         this.method3565(14611, 4, arg0.getY(), arg0.getX(), arg0.getClickCount());
      }

      this.field6758 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(BLjava/awt/event/MouseEvent;)I"
   )
   private final int method3566(byte arg0, MouseEvent arg1) {
      if (arg1.getButton() != 1) {
         if (arg1.getButton() != 2) {
            if (arg1.getButton() != 3) {
               if (arg0 != 5) {
                  this.field6757 = 89;
               }

               return 0;
            } else {
               return 4;
            }
         } else {
            return 2;
         }
      } else {
         return !arg1.isMetaDown() ? 1 : 4;
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      this.method3569(arg0.getX(), arg0.getY(), -25);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method3566((byte)5, arg0);
      if (~var2 == -2) {
         this.method3565(14611, 0, arg0.getY(), arg0.getX(), arg0.getClickCount());
      } else if (~var2 == -5) {
         this.method3565(14611, 2, arg0.getY(), arg0.getX(), arg0.getClickCount());
      } else if (var2 == 2) {
         this.method3565(14611, 1, arg0.getY(), arg0.getX(), arg0.getClickCount());
      }

      this.field6758 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(B)Lum;"
   )
   public final class554 method1573(byte arg0) {
      if (arg0 != -109) {
         this.field6759 = (class536)null;
      }

      return (class554)this.field6755.method3869((byte)79);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1574(int arg0) {
      if (arg0 != -16009) {
         return true;
      } else {
         return (this.field6757 & 2) != 0;
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method1581(int arg0) {
      return arg0 != 69 ? -114 : this.field6756;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V"
   )
   private final void method3567(Component arg0, int arg1) {
      this.method3568(-118);
      if (arg1 != -1) {
         this.method3565(-93, 49, 23, 61, -30);
      }

      this.field6762 = arg0;
      this.field6762.addMouseListener(this);
      this.field6762.addMouseMotionListener(this);
      this.field6762.addMouseWheelListener(this);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1575(int arg0) {
      if (arg0 != 13361) {
         this.mouseMoved((MouseEvent)null);
      }

      this.method3568(-125);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      this.method3569(arg0.getX(), arg0.getY(), -107);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "j",
      descriptor = "(I)V"
   )
   private final void method3568(int arg0) {
      if (this.field6762 != null) {
         this.field6762.removeMouseWheelListener(this);
         if (arg0 >= -3) {
            this.field6760 = 33;
         }

         this.field6762.removeMouseMotionListener(this);
         this.field6762.removeMouseListener(this);
         this.field6762 = null;
         this.field6755 = null;
         this.field6761 = this.field6760 = this.field6758 = 0;
         this.field6756 = this.field6754 = this.field6757 = 0;
         this.field6759 = null;
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(III)V"
   )
   private final void method3569(int arg0, int arg1, int arg2) {
      this.field6761 = arg0;
      this.field6760 = arg1;
      if (arg2 >= -18) {
         this.field6762 = (Component)null;
      }

      if (this.field6763) {
         this.method3565(14611, -1, arg1, arg0, 0);
      }

   }

   @OriginalMember(
      owner = "client!qg",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1576(int arg0) {
      int var2 = 17 % ((-8 - arg0) / 62);
      return ~(1 & this.field6757) != -1;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mouseWheelMoved",
      descriptor = "(Ljava/awt/event/MouseWheelEvent;)V"
   )
   public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method3565(14611, 6, var3, var2, var4);
      arg0.consume();
   }

   @OriginalMember(
      owner = "client!qg",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method1582(int arg0) {
      int var2 = 25 % ((arg0 - -36) / 45);
      return (this.field6757 & 4) != 0;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      this.method3569(arg0.getX(), arg0.getY(), -90);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!qg",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public class491(Component arg0, boolean arg1) {
      this.method3567(arg0, -1);
      this.field6763 = arg1;
   }
}
