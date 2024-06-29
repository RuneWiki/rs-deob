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

@OriginalClass("client!rca")
public class class482 extends class224 {
   @OriginalMember(
      owner = "client!rca",
      name = "x",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field6896;
   @OriginalMember(
      owner = "client!rca",
      name = "y",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field6897;
   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "Ljava/awt/Rectangle;"
   )
   private Rectangle field6894;
   @OriginalMember(
      owner = "client!rca",
      name = "w",
      descriptor = "Ljava/awt/Shape;"
   )
   private Shape field6895;

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(BIILjava/awt/Canvas;)V",
      line = 9
   )
   public final void method1698(byte arg0, int arg1, int arg2, Canvas arg3) {
      this.field6896 = arg3;
      this.field6894 = new Rectangle();
      this.field3197 = arg2;
      this.field3192 = arg1;
      if (arg0 > -57) {
         this.field6894 = (Rectangle)null;
      }

      this.field3196 = new int[this.field3197 * this.field3192];
      DataBufferInt var5 = new DataBufferInt(this.field3196, this.field3196.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3197, this.field3192), var5, (Point)null);
      this.field6897 = new BufferedImage(var6, var7, false, new Hashtable());
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIII)V",
      line = 37
   )
   public final void method1700(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.field6895 = arg0.getClip();
      this.field6894.x = arg6;
      this.field6894.y = arg4;
      this.field6894.height = arg7;
      this.field6894.width = arg3;
      arg0.setClip(this.field6894);
      int var9 = 55 % ((arg1 - 62) / 48);
      arg0.drawImage(this.field6897, arg6 - arg5, arg4 - arg2, this.field6896);
      arg0.setClip(this.field6895);
   }
}
