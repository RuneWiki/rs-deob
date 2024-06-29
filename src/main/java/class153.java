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

@OriginalClass("client!mr")
public class class153 extends class624 implements ImageProducer {
   @OriginalMember(
      owner = "client!mr",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1989 = new String[]{method1265(method1264("X\u007f,-\u0019")), method1265(method1264("[xn\u0004")), method1265(method1264("N#,FL")), method1265(method1264("X\u007f,/\u0019")), method1265(method1264("X\u007f,!\u0019")), method1265(method1264("X\u007f,\"\u0019")), method1265(method1264("X\u007f,+\u0019")), method1265(method1264("X\u007f,\u0001Bvbl\u001bDXhp@")), method1265(method1264("X\u007f,\tUQNm\u0006B@`g\u001a\u0019")), method1265(method1264("X\u007f,.\u0019")), method1265(method1264("X\u007f,\u001bET\u007fv8CZiw\u000bE\\bl@")), method1265(method1264("X\u007f, \u0019")), method1265(method1264("X\u007f,\u001aTXbt\rrZcq\u001d\\P\u007f*")), method1265(method1264("X\u007f,\u001aTDxg\u001bEabr,^BcN\rWA_k\u000fYA_g\u001bT[i*"))};
   @OriginalMember(
      owner = "client!mr",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field1984 = false;
   @OriginalMember(
      owner = "client!mr",
      name = "s",
      descriptor = "I"
   )
   public static int field1972;
   @OriginalMember(
      owner = "client!mr",
      name = "A",
      descriptor = "I"
   )
   public static int field1973;
   @OriginalMember(
      owner = "client!mr",
      name = "C",
      descriptor = "I"
   )
   public static int field1976;
   @OriginalMember(
      owner = "client!mr",
      name = "E",
      descriptor = "I"
   )
   public static int field1977;
   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "I"
   )
   public static int field1979;
   @OriginalMember(
      owner = "client!mr",
      name = "G",
      descriptor = "I"
   )
   public static int field1980;
   @OriginalMember(
      owner = "client!mr",
      name = "F",
      descriptor = "I"
   )
   public static int field1981;
   @OriginalMember(
      owner = "client!mr",
      name = "D",
      descriptor = "I"
   )
   public static int field1982;
   @OriginalMember(
      owner = "client!mr",
      name = "v",
      descriptor = "I"
   )
   public static int field1983;
   @OriginalMember(
      owner = "client!mr",
      name = "w",
      descriptor = "I"
   )
   public static int field1985;
   @OriginalMember(
      owner = "client!mr",
      name = "y",
      descriptor = "I"
   )
   public static int field1986;
   @OriginalMember(
      owner = "client!mr",
      name = "H",
      descriptor = "I"
   )
   public static int field1988;
   @OriginalMember(
      owner = "client!mr",
      name = "I",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field1987;
   @OriginalMember(
      owner = "client!mr",
      name = "x",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1975;
   @OriginalMember(
      owner = "client!mr",
      name = "B",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field1978;
   @OriginalMember(
      owner = "client!mr",
      name = "u",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field1974;

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field1972;
         if (~arg3 == ~arg4) {
            class735.method5330(arg2, arg0, true, arg3, arg6, arg5, arg1);
         } else {
            label40: {
               if (class265.field3451 > -arg3 + arg5 || arg3 + arg5 > class663.field9442 || -arg4 + arg1 < class478.field6604 || arg1 + arg4 > class313.field4171) {
                  class95.method891(arg6, arg0, arg1, arg4, arg5, arg2, arg3, arg7 + 1997187742);
                  if (!client.field4273) {
                     break label40;
                  }
               }

               class529.method3819(arg6, arg4, arg2, arg3, arg5, arg0, arg1, arg7 + 1997188132);
            }

            if (arg7 != -1997187742) {
               method1260(-53, 91, 91);
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1989[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         ++field1986;
         this.addConsumer(arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1989[10] + (arg0 != null ? field1989[2] : field1989[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final synchronized void method1258(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 != 10294) {
            this.field1978 = null;
         }

         ++field1977;
         if (this.field1974 != null) {
            this.field1974.setPixels(arg3, arg4, arg2, arg1, this.field1978, super.field8712, super.field8711 * arg4 + arg3, super.field8711);
            this.field1974.imageComplete(2);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1989[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z"
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         ++field1981;
         return this.field1974 == arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1989[7] + (arg0 != null ? field1989[2] : field1989[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method1259(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 262144) {
            field1984 = false;
         }

         ++field1982;
         return (arg1 & 262144) != 0 | class544.method3929(arg1, arg0, arg2 ^ 262254) || class302.method2276(arg0, (byte)-96, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1989[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1260(int arg0, int arg1, int arg2) {
      try {
         ++field1988;
         if (arg2 != -3152) {
            method1260(-90, -40, -121);
         }

         int var3 = class553.method3991(arg0 + 45365, -1, arg1 + 91923, 4) + -128 + (class553.method3991(arg0 + 10294, -1, arg1 + 37821, 2) + -128 >> 1) + (-128 + class553.method3991(arg0, -1, arg1, 1) >> 2);
         int var4 = (int)((double)var3 * 0.3D) + 35;
         if (var4 >= 10) {
            if (var4 <= 60) {
               return var4;
            }

            var4 = 60;
            if (!client.field4273) {
               return var4;
            }
         }

         var4 = 10;
         return var4;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1989[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
      try {
         ++field1973;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1989[13] + (arg0 != null ? field1989[2] : field1989[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "b",
      descriptor = "(B)V"
   )
   private final synchronized void method1261(byte arg0) {
      try {
         ++field1979;
         if (this.field1974 != null) {
            this.field1974.setPixels(0, 0, super.field8711, super.field8716, this.field1978, super.field8712, 0, super.field8711);
            this.field1974.imageComplete(2);
            if (arg0 >= -44) {
               method1259(35, 9, -29);
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1989[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         this.field1974 = arg0;
         ++field1985;
         arg0.setDimensions(super.field8711, super.field8716);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field1978);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1989[8] + (arg0 != null ? field1989[2] : field1989[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IIZ)V"
   )
   public final void method1262(Canvas arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field1987 = arg0;
         super.field8711 = arg1;
         ++field1980;
         super.field8716 = arg2;
         super.field8712 = new int[super.field8716 * super.field8711];
         this.field1978 = new DirectColorModel(32, 16711680, 65280, 255);
         this.field1975 = this.field1987.createImage(this);
         this.method1261((byte)-54);
         if (arg3) {
            this.field1987.prepareImage(this.field1975, this.field1987);
            this.method1261((byte)-91);
            this.field1987.prepareImage(this.field1975, this.field1987);
            this.method1261((byte)-110);
            this.field1987.prepareImage(this.field1975, this.field1987);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1989[0] + (arg0 != null ? field1989[2] : field1989[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIBI)V"
   )
   public final void method1263(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
      try {
         this.method1258(10294, arg2, arg7, arg3, arg4);
         ++field1976;
         Shape var9 = arg0.getClip();
         if (arg6 >= -71) {
            this.startProduction((ImageConsumer)null);
         }

         arg0.clipRect(arg1, arg5, arg7, arg2);
         arg0.drawImage(this.field1975, -arg3 + arg1, arg5 - arg4, this.field1987);
         arg0.setClip(var9);
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field1989[6] + (arg0 != null ? field1989[2] : field1989[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         if (this.field1974 == arg0) {
            this.field1974 = null;
         }

         ++field1983;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1989[12] + (arg0 != null ? field1989[2] : field1989[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1264(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1265(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
