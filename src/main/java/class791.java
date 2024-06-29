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

@OriginalClass("client!ih")
public class class791 extends class202 {
   @OriginalMember(
      owner = "client!ih",
      name = "v",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field11565;
   @OriginalMember(
      owner = "client!ih",
      name = "t",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11566;
   @OriginalMember(
      owner = "client!ih",
      name = "w",
      descriptor = "Ljava/awt/Rectangle;"
   )
   private Rectangle field11564;
   @OriginalMember(
      owner = "client!ih",
      name = "u",
      descriptor = "Ljava/awt/Shape;"
   )
   private Shape field11563;

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(BIILjava/awt/Canvas;)V"
   )
   public final void method1767(byte arg0, int arg1, int arg2, Canvas arg3) {
      this.field11565 = arg3;
      this.field11564 = new Rectangle();
      this.field3090 = arg2;
      this.field3084 = arg1;
      if (arg0 < 33) {
         this.method1766(-87, 84, 9, 97, 52, (Graphics)null, (byte)-100, -81);
      }

      this.field3088 = new int[this.field3090 * this.field3084];
      DataBufferInt var5 = new DataBufferInt(this.field3088, this.field3088.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3084, this.field3090), var5, (Point)null);
      this.field11566 = new BufferedImage(var6, var7, false, new Hashtable());
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IIIIILjava/awt/Graphics;BI)V"
   )
   public final void method1766(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, byte arg6, int arg7) {
      this.field11563 = arg5.getClip();
      this.field11564.y = arg4;
      this.field11564.x = arg3;
      this.field11564.width = arg0;
      if (arg6 <= 50) {
         this.field11563 = (Shape)null;
      }

      this.field11564.height = arg7;
      arg5.setClip(this.field11564);
      arg5.drawImage(this.field11566, -arg2 + arg3, -arg1 + arg4, this.field11565);
      arg5.setClip(this.field11563);
   }
}
