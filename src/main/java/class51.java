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

@OriginalClass("client!qga")
public class class51 extends class629 {
   @OriginalMember(
      owner = "client!qga",
      name = "x",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field703;
   @OriginalMember(
      owner = "client!qga",
      name = "w",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field705;
   @OriginalMember(
      owner = "client!qga",
      name = "y",
      descriptor = "Ljava/awt/Rectangle;"
   )
   private Rectangle field704;
   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "Ljava/awt/Shape;"
   )
   private Shape field702;

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(IZILjava/awt/Canvas;)V"
   )
   public final void method381(int arg0, boolean arg1, int arg2, Canvas arg3) {
      this.field703 = arg3;
      this.field704 = new Rectangle();
      this.field9287 = arg0;
      this.field9288 = arg2;
      this.field9291 = new int[this.field9288 * this.field9287];
      DataBufferInt var5 = new DataBufferInt(this.field9291, this.field9291.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field9287, this.field9288), var5, (Point)null);
      this.field705 = new BufferedImage(var6, var7, arg1, new Hashtable());
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(ZIIILjava/awt/Graphics;III)V"
   )
   public final void method382(boolean arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
      this.field702 = arg4.getClip();
      this.field704.x = arg7;
      this.field704.width = arg3;
      this.field704.height = arg2;
      this.field704.y = arg5;
      arg4.setClip(this.field704);
      if (arg0) {
         this.field703 = (Canvas)null;
      }

      arg4.drawImage(this.field705, -arg1 + arg7, arg5 - arg6, this.field703);
      arg4.setClip(this.field702);
   }
}
