import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class517 {
   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "Ljava/awt/Robot;"
   )
   private Robot field7517 = new Robot();
   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field7518;

   @OriginalMember(
      owner = "client!jb",
      name = "showcursor",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public final void showcursor(Component arg0, boolean arg1) {
      if (arg1) {
         arg0 = null;
      } else if (arg0 == null) {
         throw new NullPointerException();
      }

      if (this.field7518 != arg0) {
         if (this.field7518 != null) {
            this.field7518.setCursor((Cursor)null);
            this.field7518 = null;
         }

         if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String)null));
            this.field7518 = arg0;
         }

      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "<init>",
      descriptor = "()V"
   )
   public class517() throws Exception {
   }

   @OriginalMember(
      owner = "client!jb",
      name = "setcustomcursor",
      descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V"
   )
   public final void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
      if (arg1 != null) {
         BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
         var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
         arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, (String)null));
      } else {
         arg0.setCursor((Cursor)null);
      }

   }

   @OriginalMember(
      owner = "client!jb",
      name = "movemouse",
      descriptor = "(II)V"
   )
   public final void movemouse(int arg0, int arg1) {
      this.field7517.mouseMove(arg0, arg1);
   }
}
