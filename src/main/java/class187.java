import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class187 extends class639 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @OriginalMember(
      owner = "client!ei",
      name = "l",
      descriptor = "Liw;"
   )
   private class332 field2823 = new class332();
   @OriginalMember(
      owner = "client!ei",
      name = "h",
      descriptor = "Liw;"
   )
   private class332 field2827 = new class332();
   @OriginalMember(
      owner = "client!ei",
      name = "k",
      descriptor = "Z"
   )
   private boolean field2829;
   @OriginalMember(
      owner = "client!ei",
      name = "j",
      descriptor = "I"
   )
   private int field2821;
   @OriginalMember(
      owner = "client!ei",
      name = "m",
      descriptor = "I"
   )
   private int field2822;
   @OriginalMember(
      owner = "client!ei",
      name = "n",
      descriptor = "I"
   )
   private int field2824;
   @OriginalMember(
      owner = "client!ei",
      name = "p",
      descriptor = "I"
   )
   private int field2825;
   @OriginalMember(
      owner = "client!ei",
      name = "g",
      descriptor = "I"
   )
   private int field2826;
   @OriginalMember(
      owner = "client!ei",
      name = "o",
      descriptor = "I"
   )
   private int field2828;
   @OriginalMember(
      owner = "client!ei",
      name = "i",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field2830;

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(Z)I",
      line = 4
   )
   public final int method1630(boolean arg0) {
      if (!arg0) {
         this.mouseMoved((MouseEvent)null);
      }

      return this.field2821;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 14
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      this.method1635(arg0.getY(), arg0.getX(), 118);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(I)Luv;",
      line = 21
   )
   public final class380 method1631(int arg0) {
      return arg0 != 512 ? (class380)null : (class380)this.field2823.method2577(true);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(I)I",
      line = 31
   )
   public final int method1632(int arg0) {
      if (arg0 >= -91) {
         this.method1632(122);
      }

      return this.field2822;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 42
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      this.method1635(arg0.getY(), arg0.getX(), 127);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(Z)Z",
      line = 49
   )
   public final boolean method1633(boolean arg0) {
      if (!arg0) {
         this.mouseMoved((MouseEvent)null);
      }

      return (2 & this.field2824) != 0;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(B)V",
      line = 59
   )
   public final synchronized void method1634(byte arg0) {
      this.field2824 = this.field2826;
      this.field2821 = this.field2828;
      this.field2822 = this.field2825;
      class332 var2 = this.field2823;
      this.field2823 = this.field2827;
      this.field2827 = var2;
      if (arg0 == -76) {
         this.field2827.method2580((byte)-4);
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(III)V",
      line = 85
   )
   private final void method1635(int arg0, int arg1, int arg2) {
      if (arg2 <= 102) {
         this.field2829 = true;
      }

      this.field2825 = arg0;
      this.field2828 = arg1;
      if (this.field2829) {
         this.method1638(0, arg1, arg0, (byte)-96, -1);
      }

   }

   @OriginalMember(
      owner = "client!ei",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 101
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method1640((byte)-90, arg0);
      if (~var2 == -2) {
         this.method1638(arg0.getClickCount(), arg0.getX(), arg0.getY(), (byte)-123, 0);
      } else if (~var2 != -5) {
         if (~var2 == -3) {
            this.method1638(arg0.getClickCount(), arg0.getX(), arg0.getY(), (byte)-107, 1);
         }
      } else {
         this.method1638(arg0.getClickCount(), arg0.getX(), arg0.getY(), (byte)-110, 2);
      }

      this.field2826 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!ei",
      name = "mouseWheelMoved",
      descriptor = "(Ljava/awt/event/MouseWheelEvent;)V",
      line = 127
   )
   public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method1638(var4, var2, var3, (byte)96, 6);
      arg0.consume();
   }

   @OriginalMember(
      owner = "client!ei",
      name = "c",
      descriptor = "(I)V",
      line = 140
   )
   public final void method1636(int arg0) {
      this.method1641(false);
      if (arg0 != -1) {
         this.field2825 = 101;
      }

   }

   @OriginalMember(
      owner = "client!ei",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 150
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!ei",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 159
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      this.method1635(arg0.getY(), arg0.getX(), 112);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(BLjava/awt/Component;)V",
      line = 166
   )
   private final void method1637(byte arg0, Component arg1) {
      this.method1641(false);
      if (arg0 <= -79) {
         this.field2830 = arg1;
         this.field2830.addMouseListener(this);
         this.field2830.addMouseMotionListener(this);
         this.field2830.addMouseWheelListener(this);
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 181
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method1640((byte)-87, arg0);
      if ((var2 & this.field2826) == 0) {
         var2 = this.field2826;
      }

      if ((1 & var2) != 0) {
         this.method1638(arg0.getClickCount(), arg0.getX(), arg0.getY(), (byte)77, 3);
      }

      if ((var2 & 4) != 0) {
         this.method1638(arg0.getClickCount(), arg0.getX(), arg0.getY(), (byte)121, 5);
      }

      if (~(2 & var2) != -1) {
         this.method1638(arg0.getClickCount(), arg0.getX(), arg0.getY(), (byte)-112, 4);
      }

      this.field2826 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!ei",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 205
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      this.method1635(arg0.getY(), arg0.getX(), 117);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(IIIBI)V",
      line = 213
   )
   private final void method1638(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      class235 var6 = new class235();
      var6.field3429 = arg4;
      int var7 = -46 % ((arg3 - -36) / 58);
      var6.field3426 = arg2;
      var6.field3430 = arg1;
      var6.field3428 = class57.method650(121);
      var6.field3427 = arg0;
      this.field2827.method2585(var6, -90);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "d",
      descriptor = "(I)Z",
      line = 228
   )
   public final boolean method1639(int arg0) {
      if (arg0 < 122) {
         this.field2829 = false;
      }

      return (this.field2824 & 4) != 0;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(BLjava/awt/event/MouseEvent;)I",
      line = 238
   )
   private final int method1640(byte arg0, MouseEvent arg1) {
      if (arg1.getButton() == 1) {
         return arg1.isMetaDown() ? 4 : 1;
      } else {
         int var3 = 32 / ((-30 - arg0) / 40);
         if (arg1.getButton() != 2) {
            return arg1.getButton() != 3 ? 0 : 4;
         } else {
            return 2;
         }
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "c",
      descriptor = "(Z)V",
      line = 265
   )
   private final void method1641(boolean arg0) {
      if (this.field2830 != null) {
         this.field2830.removeMouseWheelListener(this);
         this.field2830.removeMouseMotionListener(this);
         this.field2830.removeMouseListener(this);
         this.field2823 = null;
         if (arg0) {
            this.field2825 = 92;
         }

         this.field2821 = this.field2822 = this.field2824 = 0;
         this.field2828 = this.field2825 = this.field2826 = 0;
         this.field2830 = null;
         this.field2827 = null;
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(B)Z",
      line = 288
   )
   public final boolean method1642(byte arg0) {
      if (arg0 != 88) {
         this.mouseDragged((MouseEvent)null);
      }

      return (this.field2824 & 1) != 0;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 311
   )
   public class187(Component arg0, boolean arg1) {
      this.method1637((byte)-122, arg0);
      this.field2829 = arg1;
   }
}
