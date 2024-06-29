import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class652 extends class593 {
   @OriginalMember(
      owner = "client!oo",
      name = "r",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9501;
   @OriginalMember(
      owner = "client!oo",
      name = "q",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field9502;
   @OriginalMember(
      owner = "client!oo",
      name = "p",
      descriptor = "Ljava/awt/Rectangle;"
   )
   private Rectangle field9503;
   @OriginalMember(
      owner = "client!oo",
      name = "o",
      descriptor = "Ljava/awt/Shape;"
   )
   private Shape field9504;

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIIIILjava/awt/Graphics;II)V"
   )
   public final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7) {
      this.field9504 = arg5.getClip();
      if (arg0 > -22) {
         this.field9504 = (Shape)null;
      }

      this.field9503.x = arg7;
      this.field9503.height = arg4;
      this.field9503.y = arg2;
      this.field9503.width = arg6;
      arg5.setClip(this.field9503);
      arg5.drawImage(this.field9502, -arg1 + arg7, -arg3 + arg2, this.field9501);
      arg5.setClip(this.field9504);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IILjava/awt/Canvas;B)V"
   )
   public final void method986(int arg0, int arg1, Canvas arg2, byte arg3) {
      this.field9501 = arg2;
      this.field9503 = new Rectangle();
      this.field8749 = arg0;
      if (arg3 > 96) {
         this.field8750 = arg1;
         this.field8751 = new int[this.field8750 * this.field8749];
         DataBufferInt var5 = new DataBufferInt(this.field8751, this.field8751.length);
         DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field8750, this.field8749), var5, (Point)null);
         this.field9502 = new BufferedImage(var6, var7, false, new Hashtable());
      }
   }
}
