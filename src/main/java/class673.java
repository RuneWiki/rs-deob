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

@OriginalClass("client!ph")
public class class673 extends class624 {
   @OriginalMember(
      owner = "client!ph",
      name = "v",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9892;
   @OriginalMember(
      owner = "client!ph",
      name = "t",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field9894;
   @OriginalMember(
      owner = "client!ph",
      name = "s",
      descriptor = "Ljava/awt/Rectangle;"
   )
   private Rectangle field9893;
   @OriginalMember(
      owner = "client!ph",
      name = "u",
      descriptor = "Ljava/awt/Shape;"
   )
   private Shape field9891;

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIBI)V"
   )
   public final void method1263(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
      if (arg6 > -71) {
         this.field9892 = (Canvas)null;
      }

      this.field9891 = arg0.getClip();
      this.field9893.x = arg1;
      this.field9893.y = arg5;
      this.field9893.height = arg2;
      this.field9893.width = arg7;
      arg0.setClip(this.field9893);
      arg0.drawImage(this.field9894, -arg3 + arg1, -arg4 + arg5, this.field9892);
      arg0.setClip(this.field9891);
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IIZ)V"
   )
   public final void method1262(Canvas arg0, int arg1, int arg2, boolean arg3) {
      this.field9892 = arg0;
      this.field9893 = new Rectangle();
      this.field8711 = arg1;
      this.field8716 = arg2;
      this.field8712 = new int[this.field8716 * this.field8711];
      DataBufferInt var5 = new DataBufferInt(this.field8712, this.field8712.length);
      if (!arg3) {
         this.field9894 = (Image)null;
      }

      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field8711, this.field8716), var5, (Point)null);
      this.field9894 = new BufferedImage(var6, var7, false, new Hashtable());
   }
}
