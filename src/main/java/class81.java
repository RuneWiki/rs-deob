import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class81 {
   @OriginalMember(
      owner = "client!wg",
      name = "b",
      descriptor = "Ljava/awt/Robot;"
   )
   private Robot field1263 = new Robot();
   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field1262;

   @OriginalMember(
      owner = "client!wg",
      name = "movemouse",
      descriptor = "(II)V"
   )
   public final void movemouse(int arg0, int arg1) {
      this.field1263.mouseMove(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!wg",
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
      owner = "client!wg",
      name = "showcursor",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public final void showcursor(Component arg0, boolean arg1) {
      if (!arg1) {
         if (arg0 == null) {
            throw new NullPointerException();
         }
      } else {
         arg0 = null;
      }

      if (this.field1262 != arg0) {
         if (this.field1262 != null) {
            this.field1262.setCursor((Cursor)null);
            this.field1262 = null;
         }

         if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String)null));
            this.field1262 = arg0;
         }

      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "<init>",
      descriptor = "()V"
   )
   public class81() throws Exception {
   }
}
