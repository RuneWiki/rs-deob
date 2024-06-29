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

@OriginalClass("client!bka")
public class class175 extends class108 {
   @OriginalMember(
      owner = "client!bka",
      name = "r",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field2686;
   @OriginalMember(
      owner = "client!bka",
      name = "q",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field2684;
   @OriginalMember(
      owner = "client!bka",
      name = "p",
      descriptor = "Ljava/awt/Rectangle;"
   )
   private Rectangle field2683;
   @OriginalMember(
      owner = "client!bka",
      name = "s",
      descriptor = "Ljava/awt/Shape;"
   )
   private Shape field2685;

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IBI)V",
      line = 12
   )
   public final void method1037(Canvas arg0, int arg1, byte arg2, int arg3) {
      this.field2686 = arg0;
      this.field2683 = new Rectangle();
      this.field1780 = arg3;
      this.field1779 = arg1;
      this.field1778 = new int[this.field1780 * this.field1779];
      DataBufferInt var5 = new DataBufferInt(this.field1778, this.field1778.length);
      int var6 = 30 % ((arg2 - -76) / 38);
      DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field1780, this.field1779), var5, (Point)null);
      this.field2684 = new BufferedImage(var7, var8, false, new Hashtable());
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIII)V",
      line = 32
   )
   public final void method1039(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.field2685 = arg0.getClip();
      this.field2683.y = arg3;
      this.field2683.width = arg5;
      this.field2683.x = arg6;
      if (arg1 != -24176) {
         this.field2685 = (Shape)null;
      }

      this.field2683.height = arg2;
      arg0.setClip(this.field2683);
      arg0.drawImage(this.field2684, -arg7 + arg6, arg3 - arg4, this.field2686);
      arg0.setClip(this.field2685);
   }
}
