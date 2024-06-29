import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class161 {
   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "Ljava/awt/Robot;"
   )
   private Robot field2417 = new Robot();
   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field2416;

   @OriginalMember(
      owner = "client!jd",
      name = "movemouse",
      descriptor = "(II)V",
      line = 7
   )
   public final void movemouse(int arg0, int arg1) {
      this.field2417.mouseMove(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jd",
      name = "<init>",
      descriptor = "()V",
      line = 13
   )
   public class161() throws Exception {
   }

   @OriginalMember(
      owner = "client!jd",
      name = "showcursor",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 22
   )
   public final void showcursor(Component arg0, boolean arg1) {
      if (!arg1) {
         if (arg0 == null) {
            throw new NullPointerException();
         }
      } else {
         arg0 = null;
      }

      if (this.field2416 != arg0) {
         if (this.field2416 != null) {
            this.field2416.setCursor((Cursor)null);
            this.field2416 = null;
         }

         if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String)null));
            this.field2416 = arg0;
         }

      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "setcustomcursor",
      descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V",
      line = 53
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
}
