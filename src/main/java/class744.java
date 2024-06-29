import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class744 {
   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "Ljava/awt/Robot;"
   )
   private Robot field10869 = new Robot();
   @OriginalMember(
      owner = "client!gfa",
      name = "b",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field10868;

   @OriginalMember(
      owner = "client!gfa",
      name = "movemouse",
      descriptor = "(II)V"
   )
   public final void movemouse(int arg0, int arg1) {
      this.field10869.mouseMove(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "setcustomcursor",
      descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V"
   )
   public final void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
      if (arg1 == null) {
         arg0.setCursor((Cursor)null);
      } else {
         BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
         var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
         arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, (String)null));
      }

   }

   @OriginalMember(
      owner = "client!gfa",
      name = "<init>",
      descriptor = "()V"
   )
   public class744() throws Exception {
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "showcursor",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public final void showcursor(Component arg0, boolean arg1) {
      if (arg1) {
         arg0 = null;
      } else if (arg0 == null) {
         throw new NullPointerException();
      }

      if (this.field10868 != arg0) {
         if (this.field10868 != null) {
            this.field10868.setCursor((Cursor)null);
            this.field10868 = null;
         }

         if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String)null));
            this.field10868 = arg0;
         }

      }
   }
}
