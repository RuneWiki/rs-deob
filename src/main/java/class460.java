import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class460 extends class54 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @OriginalMember(
      owner = "client!rp",
      name = "k",
      descriptor = "Lum;"
   )
   private class550 field6955 = new class550();
   @OriginalMember(
      owner = "client!rp",
      name = "l",
      descriptor = "Lum;"
   )
   private class550 field6960 = new class550();
   @OriginalMember(
      owner = "client!rp",
      name = "o",
      descriptor = "Z"
   )
   private boolean field6963;
   @OriginalMember(
      owner = "client!rp",
      name = "j",
      descriptor = "I"
   )
   private int field6956;
   @OriginalMember(
      owner = "client!rp",
      name = "m",
      descriptor = "I"
   )
   private int field6957;
   @OriginalMember(
      owner = "client!rp",
      name = "p",
      descriptor = "I"
   )
   private int field6958;
   @OriginalMember(
      owner = "client!rp",
      name = "h",
      descriptor = "I"
   )
   private int field6959;
   @OriginalMember(
      owner = "client!rp",
      name = "n",
      descriptor = "I"
   )
   private int field6961;
   @OriginalMember(
      owner = "client!rp",
      name = "q",
      descriptor = "I"
   )
   private int field6962;
   @OriginalMember(
      owner = "client!rp",
      name = "i",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field6964;

   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "(B)Z",
      line = 7
   )
   public final boolean method377(byte arg0) {
      if (arg0 != -72) {
         return true;
      } else {
         return (this.field6957 & 4) != 0;
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 17
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      this.method3456(28522, arg0.getY(), arg0.getX());
   }

   @OriginalMember(
      owner = "client!rp",
      name = "d",
      descriptor = "(B)V",
      line = 25
   )
   public final synchronized void method374(byte arg0) {
      this.field6957 = this.field6962;
      this.field6958 = this.field6961;
      this.field6956 = this.field6959;
      class550 var2 = this.field6955;
      this.field6955 = this.field6960;
      this.field6960 = var2;
      this.field6960.method4062(0);
      if (arg0 <= 121) {
         this.field6963 = false;
      }

   }

   @OriginalMember(
      owner = "client!rp",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 48
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method3457(arg0, 2282);
      if (~(this.field6962 & var2) == -1) {
         var2 = this.field6962;
      }

      if (~(1 & var2) != -1) {
         this.method3455(arg0.getY(), 3, arg0.getClickCount(), arg0.getX(), false);
      }

      if (~(var2 & 4) != -1) {
         this.method3455(arg0.getY(), 5, arg0.getClickCount(), arg0.getX(), false);
      }

      if (~(var2 & 2) != -1) {
         this.method3455(arg0.getY(), 4, arg0.getClickCount(), arg0.getX(), false);
      }

      this.field6962 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V",
      line = 74
   )
   private final void method3453(int arg0, Component arg1) {
      this.method3454((byte)-25);
      this.field6964 = arg1;
      this.field6964.addMouseListener(this);
      this.field6964.addMouseMotionListener(this);
      this.field6964.addMouseWheelListener(this);
      if (arg0 != 6) {
         this.field6955 = (class550)null;
      }

   }

   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "(I)V",
      line = 89
   )
   public final void method376(int arg0) {
      int var2 = -6 / ((-38 - arg0) / 44);
      this.method3454((byte)103);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Z)I",
      line = 97
   )
   public final int method366(boolean arg0) {
      if (!arg0) {
         this.method379(98);
      }

      return this.field6958;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "(I)Z",
      line = 107
   )
   public final boolean method379(int arg0) {
      if (arg0 != 3) {
         this.mouseDragged((MouseEvent)null);
      }

      return ~(this.field6957 & 1) != -1;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 117
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      this.method3456(28522, arg0.getY(), arg0.getX());
   }

   @OriginalMember(
      owner = "client!rp",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 124
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      this.method3456(28522, arg0.getY(), arg0.getX());
   }

   @OriginalMember(
      owner = "client!rp",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 132
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      this.method3456(28522, arg0.getY(), arg0.getX());
   }

   @OriginalMember(
      owner = "client!rp",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 140
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method3457(arg0, 2282);
      if (~var2 != -2) {
         if (var2 == 4) {
            this.method3455(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), false);
         } else if (~var2 == -3) {
            this.method3455(arg0.getY(), 1, arg0.getClickCount(), arg0.getX(), false);
         }
      } else {
         this.method3455(arg0.getY(), 0, arg0.getClickCount(), arg0.getX(), false);
      }

      this.field6962 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!rp",
      name = "f",
      descriptor = "(B)V",
      line = 164
   )
   private final void method3454(byte arg0) {
      if (this.field6964 != null) {
         this.field6964.removeMouseWheelListener(this);
         this.field6964.removeMouseMotionListener(this);
         this.field6964.removeMouseListener(this);
         this.field6960 = null;
         int var2 = 11 / ((arg0 - 37) / 33);
         this.field6955 = null;
         this.field6956 = this.field6958 = this.field6957 = 0;
         this.field6959 = this.field6961 = this.field6962 = 0;
         this.field6964 = null;
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "(B)I",
      line = 186
   )
   public final int method368(byte arg0) {
      if (arg0 != 106) {
         this.mousePressed((MouseEvent)null);
      }

      return this.field6956;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "mouseWheelMoved",
      descriptor = "(Ljava/awt/event/MouseWheelEvent;)V",
      line = 197
   )
   public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method3455(var3, 6, var4, var2, false);
      arg0.consume();
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(IIIIZ)V",
      line = 211
   )
   private final void method3455(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      class772 var6 = new class772();
      if (arg4) {
         this.field6964 = (Component)null;
      }

      var6.field11311 = arg1;
      var6.field11310 = arg0;
      var6.field11312 = arg3;
      var6.field11314 = class188.method1462(true);
      var6.field11313 = arg2;
      this.field6960.method4060(23, var6);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(III)V",
      line = 227
   )
   private final void method3456(int arg0, int arg1, int arg2) {
      if (arg0 == 28522) {
         this.field6959 = arg2;
         this.field6961 = arg1;
         if (this.field6963) {
            this.method3455(arg1, -1, 0, arg2, false);
         }

      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "d",
      descriptor = "(I)Lbn;",
      line = 244
   )
   public final class467 method375(int arg0) {
      if (arg0 != -1) {
         this.mouseMoved((MouseEvent)null);
      }

      return (class467)this.field6955.method4063(-5);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 254
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!rp",
      name = "e",
      descriptor = "(B)Z",
      line = 264
   )
   public final boolean method369(byte arg0) {
      if (arg0 >= -117) {
         return true;
      } else {
         return ~(2 & this.field6957) != -1;
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 309
   )
   public class460(Component arg0, boolean arg1) {
      this.method3453(6, arg0);
      this.field6963 = arg1;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      line = 286
   )
   private final int method3457(MouseEvent arg0, int arg1) {
      if (arg0.getButton() == 1) {
         return arg0.isMetaDown() ? 4 : 1;
      } else if (arg0.getButton() == 2) {
         return 2;
      } else if (arg0.getButton() == 3) {
         return 4;
      } else {
         return arg1 != 2282 ? -90 : 0;
      }
   }
}
