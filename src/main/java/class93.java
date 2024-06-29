import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class93 {
   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "Ljava/awt/Robot;"
   )
   private Robot field1185 = new Robot();
   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field1184;

   @OriginalMember(
      owner = "client!tn",
      name = "movemouse",
      descriptor = "(II)V",
      line = 6
   )
   public final void movemouse(int arg0, int arg1) {
      this.field1185.mouseMove(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tn",
      name = "showcursor",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 13
   )
   public final void showcursor(Component arg0, boolean arg1) {
      if (!arg1) {
         if (arg0 == null) {
            throw new NullPointerException();
         }
      } else {
         arg0 = null;
      }

      if (this.field1184 != arg0) {
         if (this.field1184 != null) {
            this.field1184.setCursor((Cursor)null);
            this.field1184 = null;
         }

         if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String)null));
            this.field1184 = arg0;
         }

      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "setcustomcursor",
      descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V",
      line = 43
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
      owner = "client!tn",
      name = "<init>",
      descriptor = "()V",
      line = 58
   )
   public class93() throws Exception {
   }
}
