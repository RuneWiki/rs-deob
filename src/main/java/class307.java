import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class307 extends class736 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @OriginalMember(
      owner = "client!pm",
      name = "q",
      descriptor = "Lsn;"
   )
   private class675 field4790 = new class675();
   @OriginalMember(
      owner = "client!pm",
      name = "i",
      descriptor = "Lsn;"
   )
   private class675 field4796 = new class675();
   @OriginalMember(
      owner = "client!pm",
      name = "n",
      descriptor = "Z"
   )
   private boolean field4799;
   @OriginalMember(
      owner = "client!pm",
      name = "h",
      descriptor = "I"
   )
   private int field4791;
   @OriginalMember(
      owner = "client!pm",
      name = "l",
      descriptor = "I"
   )
   private int field4792;
   @OriginalMember(
      owner = "client!pm",
      name = "m",
      descriptor = "I"
   )
   private int field4793;
   @OriginalMember(
      owner = "client!pm",
      name = "j",
      descriptor = "I"
   )
   private int field4794;
   @OriginalMember(
      owner = "client!pm",
      name = "o",
      descriptor = "I"
   )
   private int field4795;
   @OriginalMember(
      owner = "client!pm",
      name = "k",
      descriptor = "I"
   )
   private int field4797;
   @OriginalMember(
      owner = "client!pm",
      name = "p",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field4798;

   @OriginalMember(
      owner = "client!pm",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 4
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      this.method2581(arg0.getX(), -46, arg0.getY());
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(I)Z",
      line = 11
   )
   public final boolean method2570(int arg0) {
      if (arg0 != 25) {
         this.mouseDragged((MouseEvent)null);
      }

      return ~(this.field4792 & 4) != -1;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "c",
      descriptor = "(I)I",
      line = 21
   )
   public final int method2571(int arg0) {
      if (arg0 < 53) {
         this.mouseExited((MouseEvent)null);
      }

      return this.field4793;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(IIIBI)V",
      line = 31
   )
   private final void method2572(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      if (arg3 != -97) {
         this.mouseWheelMoved((MouseWheelEvent)null);
      }

      class488 var6 = new class488();
      var6.field7411 = arg1;
      var6.field7412 = arg4;
      var6.field7415 = arg0;
      var6.field7413 = class162.method1442(14080);
      var6.field7414 = arg2;
      this.field4796.method4980(var6, 0);
   }

   @OriginalMember(
      owner = "client!pm",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 48
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      this.method2581(arg0.getX(), -71, arg0.getY());
   }

   @OriginalMember(
      owner = "client!pm",
      name = "c",
      descriptor = "(B)Z",
      line = 56
   )
   public final boolean method2573(byte arg0) {
      int var2 = -66 % ((-70 - arg0) / 36);
      return (2 & this.field4792) != 0;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      line = 64
   )
   private final int method2574(MouseEvent arg0, int arg1) {
      if (arg0.getButton() != 1) {
         if (arg0.getButton() == 2) {
            return 2;
         } else {
            if (arg1 != 2) {
               this.field4793 = -20;
            }

            return arg0.getButton() != 3 ? 0 : 4;
         }
      } else {
         return !arg0.isMetaDown() ? 1 : 4;
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 92
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V",
      line = 103
   )
   private final void method2575(Component arg0, int arg1) {
      this.method2580(true);
      this.field4798 = arg0;
      if (arg1 < 111) {
         this.method2576(-18);
      }

      this.field4798.addMouseListener(this);
      this.field4798.addMouseMotionListener(this);
      this.field4798.addMouseWheelListener(this);
   }

   @OriginalMember(
      owner = "client!pm",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 118
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method2574(arg0, 2);
      if ((var2 & this.field4797) == 0) {
         var2 = this.field4797;
      }

      if ((1 & var2) != 0) {
         this.method2572(arg0.getY(), arg0.getX(), arg0.getClickCount(), (byte)-97, 3);
      }

      if ((var2 & 4) != 0) {
         this.method2572(arg0.getY(), arg0.getX(), arg0.getClickCount(), (byte)-97, 5);
      }

      if ((2 & var2) != 0) {
         this.method2572(arg0.getY(), arg0.getX(), arg0.getClickCount(), (byte)-97, 4);
      }

      this.field4797 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!pm",
      name = "d",
      descriptor = "(I)Luw;",
      line = 145
   )
   public final class670 method2576(int arg0) {
      if (arg0 < 59) {
         this.field4795 = 47;
      }

      return (class670)this.field4790.method4974(92);
   }

   @OriginalMember(
      owner = "client!pm",
      name = "e",
      descriptor = "(I)V",
      line = 156
   )
   public final void method2577(int arg0) {
      this.method2580(true);
      if (arg0 != -6457) {
         this.field4790 = (class675)null;
      }

   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(Z)I",
      line = 167
   )
   public final int method2578(boolean arg0) {
      return !arg0 ? -105 : this.field4791;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 178
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method2574(arg0, 2);
      if (~var2 == -2) {
         this.method2572(arg0.getY(), arg0.getX(), arg0.getClickCount(), (byte)-97, 0);
      } else if (var2 == 4) {
         this.method2572(arg0.getY(), arg0.getX(), arg0.getClickCount(), (byte)-97, 2);
      } else if (~var2 == -3) {
         this.method2572(arg0.getY(), arg0.getX(), arg0.getClickCount(), (byte)-97, 1);
      }

      this.field4797 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   @OriginalMember(
      owner = "client!pm",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 203
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      this.method2581(arg0.getX(), -83, arg0.getY());
   }

   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "(I)V",
      line = 211
   )
   public final synchronized void method2579(int arg0) {
      this.field4791 = this.field4795;
      this.field4792 = this.field4797;
      this.field4793 = this.field4794;
      class675 var2 = this.field4790;
      this.field4790 = this.field4796;
      this.field4796 = var2;
      this.field4796.method4981((byte)-125);
      if (arg0 > -41) {
         this.mouseClicked((MouseEvent)null);
      }

   }

   @OriginalMember(
      owner = "client!pm",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 231
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      this.method2581(arg0.getX(), -51, arg0.getY());
   }

   @OriginalMember(
      owner = "client!pm",
      name = "mouseWheelMoved",
      descriptor = "(Ljava/awt/event/MouseWheelEvent;)V",
      line = 240
   )
   public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method2572(var3, var2, var4, (byte)-97, 6);
      arg0.consume();
   }

   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "(Z)V",
      line = 253
   )
   private final void method2580(boolean arg0) {
      if (this.field4798 != null) {
         if (arg0) {
            this.field4798.removeMouseWheelListener(this);
            this.field4798.removeMouseMotionListener(this);
            this.field4798.removeMouseListener(this);
            this.field4794 = this.field4795 = this.field4797 = 0;
            this.field4790 = null;
            this.field4796 = null;
            this.field4793 = this.field4791 = this.field4792 = 0;
            this.field4798 = null;
         }
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(III)V",
      line = 275
   )
   private final void method2581(int arg0, int arg1, int arg2) {
      this.field4794 = arg0;
      if (arg1 > -43) {
         this.field4795 = -5;
      }

      this.field4795 = arg2;
      if (this.field4799) {
         this.method2572(arg2, arg0, 0, (byte)-97, -1);
      }

   }

   @OriginalMember(
      owner = "client!pm",
      name = "d",
      descriptor = "(B)Z",
      line = 292
   )
   public final boolean method2582(byte arg0) {
      if (arg0 >= -95) {
         this.field4793 = 127;
      }

      return (this.field4792 & 1) != 0;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 313
   )
   public class307(Component arg0, boolean arg1) {
      this.method2575(arg0, 126);
      this.field4799 = arg1;
   }
}
