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

@OriginalClass("client!cw")
public class class707 extends class633 {
   @OriginalMember(
      owner = "client!cw",
      name = "u",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field10160;
   @OriginalMember(
      owner = "client!cw",
      name = "x",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field10158;
   @OriginalMember(
      owner = "client!cw",
      name = "v",
      descriptor = "Ljava/awt/Rectangle;"
   )
   private Rectangle field10159;
   @OriginalMember(
      owner = "client!cw",
      name = "w",
      descriptor = "Ljava/awt/Shape;"
   )
   private Shape field10157;

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(ILjava/awt/Graphics;IIIIII)V"
   )
   public final void method1194(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.field10157 = arg1.getClip();
      if (arg6 != 1) {
         this.field10160 = (Canvas)null;
      }

      this.field10159.width = arg0;
      this.field10159.y = arg5;
      this.field10159.height = arg4;
      this.field10159.x = arg3;
      arg1.setClip(this.field10159);
      arg1.drawImage(this.field10158, -arg2 + arg3, -arg7 + arg5, this.field10160);
      arg1.setClip(this.field10157);
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;II)V"
   )
   public final void method1196(int arg0, Canvas arg1, int arg2, int arg3) {
      this.field10160 = arg1;
      this.field10159 = new Rectangle();
      this.field8983 = arg0;
      if (arg2 != 12) {
         this.method1196(-119, (Canvas)null, 48, 91);
      }

      this.field8979 = arg3;
      this.field8975 = new int[this.field8983 * this.field8979];
      DataBufferInt var5 = new DataBufferInt(this.field8975, this.field8975.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field8979, this.field8983), var5, (Point)null);
      this.field10158 = new BufferedImage(var6, var7, false, new Hashtable());
   }
}
