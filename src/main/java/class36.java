import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!q")
public class class36 extends class17 {
   @OriginalMember(
      owner = "loginapplet!q",
      name = "i",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field267;

   @OriginalMember(
      owner = "loginapplet!q",
      name = "a",
      descriptor = "(IILjava/awt/Graphics;I)V",
      line = 10
   )
   public final void method87(int arg0, int arg1, Graphics arg2, int arg3) {
      try {
         if (arg1 != 17932) {
            this.method88(-106, (Component)null, (byte)123, 38);
         }

         arg2.drawImage(this.c, arg3, arg0, this.field267);
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   @OriginalMember(
      owner = "loginapplet!q",
      name = "a",
      descriptor = "(ILjava/awt/Component;BI)V",
      line = 20
   )
   public final void method88(int arg0, Component arg1, byte arg2, int arg3) {
      try {
         this.e = arg0;
         this.d = arg3;
         this.h = new int[1 + arg0 * arg3];
         DataBufferInt var5 = new DataBufferInt(this.h, this.h.length);
         if (arg2 != -14) {
            this.method88(-75, (Component)null, (byte)-128, -107);
         }

         DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.d, this.e), var5, (Point)null);
         this.c = new BufferedImage(var6, var7, false, new Hashtable());
         this.field267 = arg1;
         this.a(88);
      } catch (RuntimeException var8) {
         throw var8;
      }
   }
}
