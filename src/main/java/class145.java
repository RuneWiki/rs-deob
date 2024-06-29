import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class145 extends class108 implements ImageProducer {
   @OriginalMember(
      owner = "client!wf",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2377 = new String[]{method1376(method1375("b}?8")), method1376(method1375("w&}zf")), method1376(method1375("{n}'omz'\u0004icl&7oeg=|")), method1376(method1375("{n}\u00163")), method1376(method1375("{n}\u00153")), method1376(method1375("{n}\u00113")), method1376(method1375("{n}5\u007fhK<:hye6&3")), method1376(method1375("{n}=hOg='nam!|")), method1376(method1375("{n}\u00123")), method1376(method1375("{n}&~ag%1Xcf !viz{")), method1376(method1375("{n}&~}}6'oXg#\u0010t{f\u001f1}xZ:3sxZ6'~bl{")), method1376(method1375("{n}\u00173")), method1376(method1375("{n}\u00103")), method1376(method1375("{n}\u00133"))};
   @OriginalMember(
      owner = "client!wf",
      name = "q",
      descriptor = "[Z"
   )
   public static boolean[] field2373 = new boolean[8];
   @OriginalMember(
      owner = "client!wf",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field2374 = new int[2];
   @OriginalMember(
      owner = "client!wf",
      name = "t",
      descriptor = "I"
   )
   public static int field2361;
   @OriginalMember(
      owner = "client!wf",
      name = "C",
      descriptor = "I"
   )
   public static int field2362;
   @OriginalMember(
      owner = "client!wf",
      name = "u",
      descriptor = "I"
   )
   public static int field2363;
   @OriginalMember(
      owner = "client!wf",
      name = "r",
      descriptor = "I"
   )
   public static int field2364;
   @OriginalMember(
      owner = "client!wf",
      name = "v",
      descriptor = "I"
   )
   public static int field2365;
   @OriginalMember(
      owner = "client!wf",
      name = "A",
      descriptor = "I"
   )
   public static int field2366;
   @OriginalMember(
      owner = "client!wf",
      name = "p",
      descriptor = "I"
   )
   public static int field2367;
   @OriginalMember(
      owner = "client!wf",
      name = "w",
      descriptor = "I"
   )
   public static int field2368;
   @OriginalMember(
      owner = "client!wf",
      name = "s",
      descriptor = "I"
   )
   public static int field2371;
   @OriginalMember(
      owner = "client!wf",
      name = "D",
      descriptor = "I"
   )
   public static int field2375;
   @OriginalMember(
      owner = "client!wf",
      name = "F",
      descriptor = "I"
   )
   public static int field2376;
   @OriginalMember(
      owner = "client!wf",
      name = "x",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field2369;
   @OriginalMember(
      owner = "client!wf",
      name = "y",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field2360;
   @OriginalMember(
      owner = "client!wf",
      name = "B",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field2370;
   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field2372;

   @OriginalMember(
      owner = "client!wf",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         this.addConsumer(arg0);
         ++field2371;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2377[2] + (arg0 != null ? field2377[1] : field2377[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z"
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         ++field2365;
         return this.field2372 == arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2377[7] + (arg0 != null ? field2377[1] : field2377[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IBI)V"
   )
   public final void method1037(Canvas arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field2362;
         super.field1780 = arg3;
         super.field1779 = arg1;
         this.field2369 = arg0;
         super.field1778 = new int[super.field1780 * super.field1779];
         this.field2370 = new DirectColorModel(32, 16711680, 65280, 255);
         this.field2360 = this.field2369.createImage(this);
         this.method1373((byte)-109);
         this.field2369.prepareImage(this.field2360, this.field2369);
         this.method1373((byte)-119);
         this.field2369.prepareImage(this.field2360, this.field2369);
         int var5 = 21 % ((arg2 - -76) / 38);
         this.method1373((byte)-125);
         this.field2369.prepareImage(this.field2360, this.field2369);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2377[4] + (arg0 != null ? field2377[1] : field2377[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIII)V"
   )
   public final void method1039(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         this.method1371(arg7, arg4, arg2, arg5, 4081);
         ++field2376;
         Shape var9 = arg0.getClip();
         arg0.clipRect(arg6, arg3, arg5, arg2);
         arg0.drawImage(this.field2360, -arg7 + arg6, -arg4 + arg3, this.field2369);
         arg0.setClip(var9);
         if (arg1 != -24176) {
            this.removeConsumer((ImageConsumer)null);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2377[11] + (arg0 != null ? field2377[1] : field2377[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method1370(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field2367;
         int var4 = arg2 / arg0;
         int var5 = arg0 - 1 & arg2;
         int var6 = arg3 / arg0;
         int var7 = arg3 & arg0 + -1;
         int var8 = class164.method1495(var6, var4, 10260);
         int var9 = class164.method1495(var6, var4 + 1, 10260);
         if (arg1 >= -61) {
            field2374 = null;
         }

         int var10 = class164.method1495(var6 - -1, var4, 10260);
         int var11 = class164.method1495(var6 - -1, var4 + 1, 10260);
         int var12 = class537.method4027(var9, var8, var5, (byte)-107, arg0);
         int var13 = class537.method4027(var11, var10, var5, (byte)55, arg0);
         return class537.method4027(var13, var12, var7, (byte)-105, arg0);
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field2377[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         ++field2366;
         this.field2372 = arg0;
         arg0.setDimensions(super.field1780, super.field1779);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field2370);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2377[6] + (arg0 != null ? field2377[1] : field2377[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final synchronized void method1371(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2364;
         if (this.field2372 != null) {
            this.field2372.setPixels(arg0, arg1, arg3, arg2, this.field2370, super.field1778, super.field1780 * arg1 + arg0, super.field1780);
            this.field2372.imageComplete(2);
            if (arg4 != 4081) {
               this.requestTopDownLeftRightResend((ImageConsumer)null);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2377[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "([J[Ljava/lang/Object;B)V"
   )
   public static final void method1372(long[] arg0, Object[] arg1, byte arg2) {
      try {
         ++field2363;
         class132.method1257((byte)-44, arg0.length + -1, arg1, 0, arg0);
         if (arg2 > -110) {
            method1370(-19, (byte)-121, -35, 50);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2377[12] + (arg0 != null ? field2377[1] : field2377[0]) + ',' + (arg1 != null ? field2377[1] : field2377[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         if (this.field2372 == arg0) {
            this.field2372 = null;
         }

         ++field2361;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2377[9] + (arg0 != null ? field2377[1] : field2377[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
      try {
         ++field2375;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2377[10] + (arg0 != null ? field2377[1] : field2377[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "(B)V"
   )
   private final synchronized void method1373(byte arg0) {
      try {
         ++field2368;
         if (this.field2372 != null) {
            if (arg0 >= -94) {
               method1374((byte)-90);
            }

            this.field2372.setPixels(0, 0, super.field1780, super.field1779, this.field2370, super.field1778, 0, super.field1780);
            this.field2372.imageComplete(2);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2377[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1374(byte arg0) {
      try {
         field2374 = null;
         field2373 = null;
         if (arg0 < 15) {
            method1374((byte)-29);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2377[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1375(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1376(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
