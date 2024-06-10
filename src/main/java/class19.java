import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ha")
public class class19 extends class17 implements ImageProducer, ImageObserver {
   @OriginalMember(
      owner = "loginapplet!ha",
      name = "i",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field136;
   @OriginalMember(
      owner = "loginapplet!ha",
      name = "j",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field137;
   @OriginalMember(
      owner = "loginapplet!ha",
      name = "k",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field138;

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 4
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         if (this.field138 == arg0) {
            this.field138 = null;
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ha.removeConsumer(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "a",
      descriptor = "(ILjava/awt/event/KeyEvent;)I",
      line = 14
   )
   public static final int method90(int arg0, KeyEvent arg1) {
      try {
         int var2 = 122 / ((arg0 - 37) / 54);
         int var3 = arg1.getKeyChar();
         if (~var3 == -8365) {
            return 128;
         } else {
            if (0 >= var3 || 256 <= var3) {
               var3 = -1;
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ha.G(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "a",
      descriptor = "([BBI)I",
      line = 32
   )
   public static final int method91(byte[] arg0, byte arg1, int arg2) {
      try {
         return arg1 < 9 ? -90 : class20.method98(arg0, 58, arg2, 0);
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ha.F(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 45
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         this.field138 = arg0;
         arg0.setDimensions(super.field131, super.field132);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field137);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ha.addConsumer(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "b",
      descriptor = "(I)V",
      line = 57
   )
   private final synchronized void method92(int arg0) {
      try {
         if (this.field138 != null) {
            this.field138.setPixels(0, 0, super.field131, super.field132, this.field137, super.field135, 0, super.field131);
            if (arg0 != 14) {
               this.addConsumer((ImageConsumer)null);
            }

            this.field138.imageComplete(2);
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ha.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "c",
      descriptor = "(I)V",
      line = 72
   )
   public static void method93(int arg0) {
      try {
         int var1 = -15 % ((58 - arg0) / 61);
         field136 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ha.C(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 79
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "imageUpdate",
      descriptor = "(Ljava/awt/Image;IIIII)Z",
      line = 84
   )
   public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         return true;
      } catch (RuntimeException var8) {
         throw class28.method139(var8, "ha.imageUpdate(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 92
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         this.addConsumer(arg0);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ha.startProduction(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "a",
      descriptor = "(IILjava/awt/Graphics;I)V",
      line = 102
   )
   public final void method87(int arg0, int arg1, Graphics arg2, int arg3) {
      try {
         this.method92(14);
         if (arg1 != 17932) {
            this.method92(65);
         }

         arg2.drawImage(super.field130, arg3, arg0, this);
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "ha.D(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "d",
      descriptor = "(I)I",
      line = 113
   )
   public static final int method94(int arg0) {
      try {
         if (arg0 != -12118) {
            field136 = (Frame)null;
         }

         return 8282943;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ha.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "a",
      descriptor = "(ILjava/awt/Component;BI)V",
      line = 123
   )
   public final void method88(int arg0, Component arg1, byte arg2, int arg3) {
      try {
         super.field135 = new int[1 + arg0 * arg3];
         super.field131 = arg3;
         super.field132 = arg0;
         if (arg2 == -14) {
            this.field137 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field130 = arg1.createImage(this);
            this.method92(14);
            arg1.prepareImage(super.field130, this);
            this.method92(14);
            arg1.prepareImage(super.field130, this);
            this.method92(arg2 ^ -4);
            arg1.prepareImage(super.field130, this);
            this.method86(94);
         }
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "ha.E(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ha",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z",
      line = 148
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         return this.field138 == arg0;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ha.isConsumer(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }
}
