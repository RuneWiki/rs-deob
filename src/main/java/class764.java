import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class764 extends class350 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @OriginalMember(
      owner = "client!ww",
      name = "o",
      descriptor = "Lll;"
   )
   private class387 field11280 = new class387();
   @OriginalMember(
      owner = "client!ww",
      name = "i",
      descriptor = "Lll;"
   )
   private class387 field11282 = new class387();
   @OriginalMember(
      owner = "client!ww",
      name = "l",
      descriptor = "Z"
   )
   private boolean field11286;
   @OriginalMember(
      owner = "client!ww",
      name = "j",
      descriptor = "I"
   )
   private int field11278;
   @OriginalMember(
      owner = "client!ww",
      name = "k",
      descriptor = "I"
   )
   private int field11279;
   @OriginalMember(
      owner = "client!ww",
      name = "n",
      descriptor = "I"
   )
   private int field11281;
   @OriginalMember(
      owner = "client!ww",
      name = "m",
      descriptor = "I"
   )
   private int field11283;
   @OriginalMember(
      owner = "client!ww",
      name = "q",
      descriptor = "I"
   )
   private int field11284;
   @OriginalMember(
      owner = "client!ww",
      name = "p",
      descriptor = "I"
   )
   private int field11285;
   @OriginalMember(
      owner = "client!ww",
      name = "h",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field11287;

   @OriginalMember(
      owner = "client!ww",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1656(int arg0) {
      this.method5542(0);
      if (arg0 != 4096) {
         this.field11284 = 69;
      }

   }

   @OriginalMember(
      owner = "client!ww",
      name = "mouseWheelMoved",
      descriptor = "(Ljava/awt/event/MouseWheelEvent;)V"
   )
   public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method5543(var3, var4, 6, var2, 0);
      arg0.consume();
   }

   @OriginalMember(
      owner = "client!ww",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1657(int arg0) {
      if (arg0 != -3964) {
         this.method1659((byte)-53);
      }

      return (2 & this.field11278) != 0;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V"
   )
   private final void method5540(int arg0, Component arg1) {
      this.method5542(0);
      this.field11287 = arg1;
      if (arg0 != 1) {
         this.field11279 = -4;
      }

      this.field11287.addMouseListener(this);
      this.field11287.addMouseMotionListener(this);
      this.field11287.addMouseWheelListener(this);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      this.method5541(arg0.getX(), arg0.getY(), 90);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(III)V"
   )
   private final void method5541(int arg0, int arg1, int arg2) {
      this.field11285 = arg0;
      this.field11284 = arg1;
      if (arg2 > 11) {
         if (this.field11286) {
            this.method5543(arg1, 0, -1, arg0, 0);
         }

      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!ww",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method5542(int arg0) {
      if (this.field11287 != null) {
         this.field11287.removeMouseWheelListener(this);
         this.field11287.removeMouseMotionListener(this);
         this.field11287.removeMouseListener(this);
         this.field11280 = null;
         this.field11279 = this.field11281 = this.field11278 = 0;
         this.field11287 = null;
         this.field11285 = this.field11284 = this.field11283 = arg0;
         this.field11282 = null;
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "b",
      descriptor = "(B)V"
   )
   public final synchronized void method1667(byte arg0) {
      this.field11278 = this.field11283;
      this.field11281 = this.field11284;
      this.field11279 = this.field11285;
      class387 var2 = this.field11280;
      if (arg0 != -2) {
         this.mousePressed((MouseEvent)null);
      }

      this.field11280 = this.field11282;
      this.field11282 = var2;
      this.field11282.method2934(0);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method5544(arg0, 2);
      if (~(var2 & this.field11283) == -1) {
         var2 = this.field11283;
      }

      if (~(1 & var2) != -1) {
         this.method5543(arg0.getY(), arg0.getClickCount(), 3, arg0.getX(), 0);
      }

      if ((var2 & 4) != 0) {
         this.method5543(arg0.getY(), arg0.getClickCount(), 5, arg0.getX(), 0);
      }

      if (~(var2 & 2) != -1) {
         this.method5543(arg0.getY(), arg0.getClickCount(), 4, arg0.getX(), 0);
      }

      this.field11283 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!ww",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method5544(arg0, 2);
      if (~var2 == -2) {
         this.method5543(arg0.getY(), arg0.getClickCount(), 0, arg0.getX(), 0);
      } else if (~var2 != -5) {
         if (var2 == 2) {
            this.method5543(arg0.getY(), arg0.getClickCount(), 1, arg0.getX(), 0);
         }
      } else {
         this.method5543(arg0.getY(), arg0.getClickCount(), 2, arg0.getX(), 0);
      }

      this.field11283 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!ww",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      this.method5541(arg0.getX(), arg0.getY(), 62);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method1660(boolean arg0) {
      return arg0 ? 90 : this.field11279;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      this.method5541(arg0.getX(), arg0.getY(), 127);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method5543(int arg0, int arg1, int arg2, int arg3, int arg4) {
      class63 var6 = new class63();
      if (arg4 != 0) {
         this.method1663(-8);
      }

      var6.field769 = arg3;
      var6.field768 = arg0;
      var6.field770 = arg2;
      var6.field767 = class133.method1054(-29025);
      var6.field766 = arg1;
      this.field11282.method2930((byte)-103, var6);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(I)Lcea;"
   )
   public final class227 method1661(int arg0) {
      if (arg0 != -753011614) {
         this.field11281 = -55;
      }

      return (class227)this.field11280.method2941(arg0 + 752997612);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I"
   )
   private final int method5544(MouseEvent arg0, int arg1) {
      if (arg0.getButton() != 1) {
         if (arg0.getButton() != 2) {
            if (arg0.getButton() == 3) {
               return 4;
            } else {
               return arg1 != 2 ? -33 : 0;
            }
         } else {
            return 2;
         }
      } else {
         return !arg0.isMetaDown() ? 1 : 4;
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method1659(byte arg0) {
      int var2 = 81 / ((68 - arg0) / 53);
      return this.field11281;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method1665(byte arg0) {
      if (arg0 != -109) {
         return true;
      } else {
         return ~(1 & this.field11278) != -1;
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1663(int arg0) {
      if (arg0 != 0) {
         this.field11285 = 119;
      }

      return (4 & this.field11278) != 0;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      this.method5541(arg0.getX(), arg0.getY(), 28);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public class764(Component arg0, boolean arg1) {
      this.method5540(1, arg0);
      this.field11286 = arg1;
   }
}
