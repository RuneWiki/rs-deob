import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class779 implements class538 {
   @OriginalMember(
      owner = "client!pn",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11384 = new String[]{method5595(method5594("6~dH\u0002")), method5595(method5594("(e&a")), method5595(method5594("6~dD\u0002")), method5595(method5594("=>d#W")), method5595(method5594("6~dE\u0002")), method5595(method5594("6~dK\u0002")), method5595(method5594("2\u007f:")), method5595(method5594(".u#jB2")), method5595(method5594("$q8")), method5595(method5594("2u2ys\tv,~O2")), method5595(method5594("*r")), method5595(method5594("$\u007f.tl/|&")), method5595(method5594("$\u007f>yE+")), method5595(method5594("4y-e^")), method5595(method5594("$\u007f2ZC\"d\"")), method5595(method5594("1y.yB")), method5595(method5594("$\u007f2Ue v9h^")), method5595(method5594("6~dF\u0002")), method5595(method5594("?]#iN*u")), method5595(method5594("%\u007f&b_4d/u^")), method5595(method5594("$\u007f2Te v9h^")), method5595(method5594("?_,kY#d")), method5595(method5594(")v,~O2@/\u007f~#~\ttI*u9")), method5595(method5594("$q)fM4\u007f?cN")), method5595(method5594("$\u007f.tx/w\"y")), method5595(method5594("$v")), method5595(method5594(">]#iN*u")), method5595(method5594(">_,kY#d")), method5595(method5594("*u,y")), method5595(method5594("$v'")), method5595(method5594("$\u007f.tf#v>")), method5595(method5594("6~dN\u0002")), method5595(method5594("6~d@\u0002")), method5595(method5594("6~dJ\u0002")), method5595(method5594("6~dI\u0002")), method5595(method5594("6~dB\u0002")), method5595(method5594("6~dC\u0002")), method5595(method5594("6~dG\u0002")), method5595(method5594("6~dA\u0002")), method5595(method5594("6~dL\u0002")), method5595(method5594("6~dO\u0002")), method5595(method5594("6~d]\u0002"))};
   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field11362;
   @OriginalMember(
      owner = "client!pn",
      name = "k",
      descriptor = "I"
   )
   public static int field11369;
   @OriginalMember(
      owner = "client!pn",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field11372;
   @OriginalMember(
      owner = "client!pn",
      name = "g",
      descriptor = "I"
   )
   public static int field11341;
   @OriginalMember(
      owner = "client!pn",
      name = "d",
      descriptor = "I"
   )
   public static int field11342;
   @OriginalMember(
      owner = "client!pn",
      name = "j",
      descriptor = "I"
   )
   public static int field11343;
   @OriginalMember(
      owner = "client!pn",
      name = "v",
      descriptor = "I"
   )
   public static int field11344;
   @OriginalMember(
      owner = "client!pn",
      name = "N",
      descriptor = "I"
   )
   private int field11345;
   @OriginalMember(
      owner = "client!pn",
      name = "l",
      descriptor = "I"
   )
   private int field11346;
   @OriginalMember(
      owner = "client!pn",
      name = "A",
      descriptor = "I"
   )
   public static int field11350;
   @OriginalMember(
      owner = "client!pn",
      name = "D",
      descriptor = "I"
   )
   private int field11353;
   @OriginalMember(
      owner = "client!pn",
      name = "o",
      descriptor = "I"
   )
   public static int field11354;
   @OriginalMember(
      owner = "client!pn",
      name = "O",
      descriptor = "I"
   )
   public static int field11357;
   @OriginalMember(
      owner = "client!pn",
      name = "r",
      descriptor = "I"
   )
   public static int field11360;
   @OriginalMember(
      owner = "client!pn",
      name = "m",
      descriptor = "I"
   )
   public static int field11365;
   @OriginalMember(
      owner = "client!pn",
      name = "F",
      descriptor = "I"
   )
   private int field11366;
   @OriginalMember(
      owner = "client!pn",
      name = "H",
      descriptor = "I"
   )
   private int field11367;
   @OriginalMember(
      owner = "client!pn",
      name = "q",
      descriptor = "I"
   )
   public static int field11368;
   @OriginalMember(
      owner = "client!pn",
      name = "B",
      descriptor = "I"
   )
   public static int field11370;
   @OriginalMember(
      owner = "client!pn",
      name = "c",
      descriptor = "I"
   )
   private int field11373;
   @OriginalMember(
      owner = "client!pn",
      name = "w",
      descriptor = "I"
   )
   private int field11375;
   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "I"
   )
   private int field11376;
   @OriginalMember(
      owner = "client!pn",
      name = "t",
      descriptor = "I"
   )
   public static int field11378;
   @OriginalMember(
      owner = "client!pn",
      name = "C",
      descriptor = "I"
   )
   private int field11379;
   @OriginalMember(
      owner = "client!pn",
      name = "G",
      descriptor = "I"
   )
   public static int field11380;
   @OriginalMember(
      owner = "client!pn",
      name = "M",
      descriptor = "I"
   )
   public static int field11382;
   @OriginalMember(
      owner = "client!pn",
      name = "u",
      descriptor = "I"
   )
   public static int field11383;
   @OriginalMember(
      owner = "client!pn",
      name = "h",
      descriptor = "Ljava/awt/Color;"
   )
   private Color field11355;
   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "Ljava/awt/Font;"
   )
   private Font field11381;
   @OriginalMember(
      owner = "client!pn",
      name = "s",
      descriptor = "Ljava/awt/FontMetrics;"
   )
   private FontMetrics field11377;
   @OriginalMember(
      owner = "client!pn",
      name = "J",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11347;
   @OriginalMember(
      owner = "client!pn",
      name = "K",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11348;
   @OriginalMember(
      owner = "client!pn",
      name = "e",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11349;
   @OriginalMember(
      owner = "client!pn",
      name = "I",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11351;
   @OriginalMember(
      owner = "client!pn",
      name = "y",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11352;
   @OriginalMember(
      owner = "client!pn",
      name = "f",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11356;
   @OriginalMember(
      owner = "client!pn",
      name = "L",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11359;
   @OriginalMember(
      owner = "client!pn",
      name = "n",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11361;
   @OriginalMember(
      owner = "client!pn",
      name = "i",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11364;
   @OriginalMember(
      owner = "client!pn",
      name = "P",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field11374;
   @OriginalMember(
      owner = "client!pn",
      name = "Q",
      descriptor = "Z"
   )
   private boolean field11358;
   @OriginalMember(
      owner = "client!pn",
      name = "E",
      descriptor = "Z"
   )
   private boolean field11363;
   @OriginalMember(
      owner = "client!pn",
      name = "x",
      descriptor = "Z"
   )
   private boolean field11371;

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;"
   )
   private final Object method5584(Class arg0, int arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field11370;
         Field var4 = arg0.getDeclaredField(arg2);
         if (arg1 <= 16) {
            this.field11359 = null;
         }

         Object var5 = var4.get(class126.field1586);
         var4.set(class126.field1586, (Object)null);
         return var5;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11384[37] + (arg0 != null ? field11384[3] : field11384[1]) + ',' + arg1 + ',' + (arg2 != null ? field11384[3] : field11384[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "(BI)I"
   )
   public static final int method5585(byte arg0, int arg1) {
      try {
         ++field11365;
         int var5 = (arg1 & 1431655765) - -(-715827883 & arg1 >>> 1);
         int var6 = ((-858993457 & var5) >>> 2) + (var5 & 858993459);
         int var7 = (var6 >>> 4) + var6 & 252645135;
         int var8 = (var7 >>> 8) + var7;
         int var2 = -82 / ((arg0 - 63) / 57);
         int var9 = (var8 >>> 16) + var8;
         return var9 & 255;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11384[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3890(int arg0) {
      try {
         if (arg0 != 11541) {
            this.field11352 = null;
         }

         ++field11350;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11384[39] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(Lu;Lmk;II)V"
   )
   public static final void method5586(class80 arg0, class61 arg1, int arg2, int arg3) {
      try {
         ++field11344;
         if (~class56.field610 > -51) {
            if (arg1 != null && arg1.field659 != null && ~arg2 > ~arg1.field659.length && arg1.field659[arg2] != null) {
               int var4 = arg1.field659[arg2][0];
               int var5 = var4 >> 8;
               int var6 = (241 & var4) >> 5;
               if (arg1.field659[arg2].length > 1) {
                  int var7 = (int)((double)arg1.field659[arg2].length * Math.random());
                  if (var7 > 0) {
                     var5 = arg1.field659[arg2][var7];
                  }
               }

               int var8 = var4 & 31;
               int var9 = 256;
               if (arg1.field663 != null && arg1.field674 != null) {
                  var9 = arg1.field663[arg2] + (int)((double)(arg1.field674[arg2] + -arg1.field663[arg2]) * Math.random());
               }

               int var10 = arg1.field668 != null ? arg1.field668[arg2] : 255;
               if (~var8 == -1) {
                  if (class278.field3709 == arg0) {
                     if (!arg1.field664) {
                        class206.method1559(var9, var6, var10, var5, (byte)1, 0);
                        return;
                     }

                     class108.method957(0, var6, var9, var10, (byte)-88, var5, false);
                  }

               } else if (class674.field9907.field8467.method5190((byte)-70) != 0) {
                  int var11 = arg0.field999 - 256 >> 9;
                  int var12 = arg0.field1003 + -256 >> 9;
                  if (arg3 != -20543) {
                     field11362 = null;
                  }

                  int var13 = class278.field3709 == arg0 ? 0 : (var12 << 8) + (var11 << 16) + ((arg0.field1001 << 24) - -var8);
                  class701.field10206[class56.field610++] = new class693((byte)(arg1.field664 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg0);
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field11384[41] + (arg0 != null ? field11384[3] : field11384[1]) + ',' + (arg1 != null ? field11384[3] : field11384[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(BLjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)I"
   )
   private final int method5587(byte arg0, String arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field11383;
         Field var5 = arg3.getDeclaredField(arg1);
         if (arg0 > -99) {
            this.field11376 = -39;
         }

         return var5.getInt(arg2);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11384[35] + arg0 + ',' + (arg1 != null ? field11384[3] : field11384[1]) + ',' + (arg2 != null ? field11384[3] : field11384[1]) + ',' + (arg3 != null ? field11384[3] : field11384[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(IJ)Z"
   )
   public final boolean method3886(int arg0, long arg1) {
      try {
         if (arg0 < 113) {
            return false;
         } else {
            ++field11357;
            return true;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11384[40] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3889(int arg0) {
      try {
         if (arg0 != 28664) {
            this.field11376 = -67;
         }

         ++field11380;
         return 100;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11384[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5588(byte arg0) {
      try {
         field11362 = null;
         field11372 = null;
         if (arg0 != 44) {
            field11369 = -92;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11384[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method5589(byte arg0) throws IllegalAccessException, NoSuchFieldException {
      try {
         if (arg0 == 77) {
            ++field11342;
            Class var2 = class126.field1586.getClass();
            this.field11361 = (Image)this.method5584(var2, 90, field11384[8]);
            this.field11356 = (Image)this.method5584(var2, 85, field11384[23]);
            this.field11348 = (Image)this.method5584(var2, 81, field11384[28]);
            this.field11347 = (Image)this.method5584(var2, arg0 ^ 25, field11384[13]);
            this.field11352 = (Image)this.method5584(var2, 44, field11384[6]);
            this.field11374 = (Image)this.method5584(var2, 71, field11384[12]);
            this.field11359 = (Image)this.method5584(var2, 106, field11384[30]);
            this.field11349 = (Image)this.method5584(var2, 84, field11384[24]);
            this.field11364 = (Image)this.method5584(var2, 66, field11384[11]);
            this.field11381 = (Font)this.method5584(var2, 57, field11384[25]);
            this.field11377 = (FontMetrics)this.method5584(var2, 60, field11384[29]);
            this.field11355 = (Color)this.method5584(var2, 117, field11384[19]);
            Object var3 = this.method5584(var2, arg0 + -53, field11384[10]);
            Class var4 = var3.getClass();
            this.field11363 = this.method5591((byte)41, var3, var4, field11384[26]);
            this.field11358 = this.method5591((byte)41, var3, var4, field11384[18]);
            this.field11373 = this.method5587((byte)-113, field11384[27], var3, var4);
            this.field11353 = this.method5587((byte)-104, field11384[21], var3, var4);
            this.field11379 = this.method5587((byte)-126, field11384[15], var3, var4);
            this.field11345 = this.method5587((byte)-121, field11384[7], var3, var4);
            this.field11367 = this.method5587((byte)-119, field11384[16], var3, var4);
            this.field11375 = this.method5587((byte)-128, field11384[20], var3, var4);
            this.field11346 = this.method5587((byte)-127, field11384[14], var3, var4);
            this.field11376 = this.method5587((byte)-122, field11384[9], var3, var4);
            this.field11366 = this.method5587((byte)-109, field11384[22], var3, var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11384[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method5590(byte arg0) {
      try {
         ++field11360;
         if (arg0 == 109) {
            class504.method3636(class419.field5888[class600.field8375], class470.field6510[class600.field8375], class444.field6156.method5574(-1312090738), 23291, class444.field6156.method5568(arg0 + 403), class497.field6835[class600.field8375]);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11384[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(BLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Z"
   )
   private final boolean method5591(byte arg0, Object arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field11382;
         Field var5 = arg2.getDeclaredField(arg3);
         return arg0 != 41 ? false : var5.getBoolean(arg1);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11384[2] + arg0 + ',' + (arg1 != null ? field11384[3] : field11384[1]) + ',' + (arg2 != null ? field11384[3] : field11384[1]) + ',' + (arg3 != null ? field11384[3] : field11384[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3888(byte arg0) {
      try {
         if (arg0 != 114) {
            this.field11377 = null;
         }

         ++field11378;
         class219.method1662(true);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11384[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(BI)I"
   )
   private final int method5592(byte arg0, int arg1) {
      try {
         ++field11341;
         if (arg0 != 46) {
            this.method5592((byte)-105, 55);
         }

         return this.field11358 ? (-arg1 + class41.field479) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11384[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3887(byte arg0) {
      try {
         if (arg0 < 61) {
            this.field11361 = null;
         }

         ++field11343;
         return 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11384[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method3885(boolean arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field11368;
         if (!this.field11371) {
            label192: {
               if (class126.field1586 == null) {
                  this.field11371 = true;
                  if (!var3) {
                     break label192;
                  }
               }

               if (this.field11381 == null) {
                  try {
                     this.method5589((byte)77);
                  } catch (Exception var45) {
                     this.field11371 = true;
                  }
               }
            }
         }

         if (this.field11371) {
            this.method5590((byte)109);
         } else {
            label186: {
               Graphics var4 = class204.field2515.getGraphics();
               if (var4 != null) {
                  try {
                     int var5 = class444.field6156.method5568(512);
                     String var6 = class444.field6156.method5574(arg1 ^ -1312090728);
                     if (class616.field8589 == null) {
                        class616.field8589 = class204.field2515.createImage(class252.field3194, class41.field479);
                     }

                     Graphics var7 = class616.field8589.getGraphics();
                     var7.clearRect(0, 0, class252.field3194, class41.field479);
                     int var8 = this.field11359.getWidth((ImageObserver)null);
                     int var9 = this.field11349.getWidth((ImageObserver)null);
                     int var10 = this.field11364.getWidth((ImageObserver)null);
                     int var11 = this.field11359.getHeight((ImageObserver)null);
                     int var12 = this.field11349.getHeight((ImageObserver)null);
                     int var13 = this.field11364.getHeight((ImageObserver)null);
                     var7.drawImage(this.field11359, this.method5593(var8, arg1 ^ 13943) + (this.field11367 - this.field11346 / 2), this.method5592((byte)46, var11) + this.field11375, (ImageObserver)null);
                     int var14 = -(this.field11346 / 2) + var8 + this.field11367;
                     int var15 = this.field11346 / 2 + this.field11367;
                     int var16 = var14;
                     if (var3) {
                        var7.drawImage(this.field11364, this.method5593(var8, 13921) + this.field11367 + var14, this.method5592((byte)46, var13) + this.field11375, (ImageObserver)null);
                        var16 = var10 + var14;
                     }

                     while(true) {
                        while(var15 >= var16) {
                           var7.drawImage(this.field11364, this.method5593(var8, 13921) + this.field11367 + var16, this.method5592((byte)46, var13) + this.field11375, (ImageObserver)null);
                           var16 += var10;
                        }

                        var7.drawImage(this.field11349, this.method5593(var9, 13921) - (-(this.field11346 / 2) + -this.field11367), this.method5592((byte)46, var12) + this.field11375, (ImageObserver)null);
                        int var17 = this.field11348.getWidth((ImageObserver)null);
                        int var18 = this.field11348.getHeight((ImageObserver)null);
                        int var19 = this.field11347.getWidth((ImageObserver)null);
                        int var20 = this.field11347.getHeight((ImageObserver)null);
                        int var21 = this.field11374.getHeight((ImageObserver)null);
                        int var22 = this.field11352.getWidth((ImageObserver)null);
                        int var23 = this.field11352.getHeight((ImageObserver)null);
                        int var24 = this.field11374.getWidth((ImageObserver)null);
                        int var25 = this.field11361.getWidth((ImageObserver)null);
                        int var26 = this.field11356.getWidth((ImageObserver)null);
                        int var27 = this.method5593(this.field11379, arg1 + 13899) + this.field11373;
                        int var28 = this.method5592((byte)46, this.field11345) - -this.field11353;
                        var7.drawImage(this.field11348, var27, var28 - -((-var18 + this.field11345) / 2), (ImageObserver)null);
                        var7.drawImage(this.field11347, this.field11379 + var27 + -var19, (-var20 + this.field11345) / 2 + var28, (ImageObserver)null);
                        if (!var3) {
                           if (this.field11351 == null) {
                              this.field11351 = class204.field2515.createImage(this.field11379 - var17 - var19, this.field11345);
                           }

                           Graphics var29 = this.field11351.getGraphics();
                           int var30 = 0;
                           if (var3) {
                              var29.drawImage(this.field11352, var30, 0, (ImageObserver)null);
                              var30 += var22;
                           }

                           while(true) {
                              while(~(-var19 + this.field11379 - var17) < ~var30) {
                                 var29.drawImage(this.field11352, var30, 0, (ImageObserver)null);
                                 var30 += var22;
                              }

                              int var31 = 0;
                              if (!var3) {
                                 if (var3) {
                                    var29.drawImage(this.field11374, var31, -var21 + this.field11345, (ImageObserver)null);
                                    var31 += var24;
                                 }

                                 while(true) {
                                    while(var31 < -var17 + -var19 + this.field11379) {
                                       var29.drawImage(this.field11374, var31, -var21 + this.field11345, (ImageObserver)null);
                                       var31 += var24;
                                    }

                                    int var32 = (-var17 + this.field11379 + -var19) * var5 / 100;
                                    if (!var3) {
                                       byte var10000;
                                       if (var32 > 0) {
                                          Image var33 = class204.field2515.createImage(var32, -var23 + this.field11345 + -var21);
                                          int var34 = var33.getWidth((ImageObserver)null);
                                          Graphics var35 = var33.getGraphics();
                                          int var36 = this.field11366 * class243.method1822(-30288) / 10 % var25;
                                          int var37 = -var25 + var36;
                                          if (var3) {
                                             var35.drawImage(this.field11361, var37, 0, (ImageObserver)null);
                                             var37 += var25;
                                          }

                                          while(true) {
                                             while(~var37 > ~var34) {
                                                var35.drawImage(this.field11361, var37, 0, (ImageObserver)null);
                                                var37 += var25;
                                             }

                                             var10000 = var29.drawImage(var33, 0, var23, (ImageObserver)null);
                                             if (!var3) {
                                                break;
                                             }

                                             var37 = var10000;
                                          }
                                       }

                                       int var38 = var32;
                                       int var39 = this.field11379 - var17 + -var19 + -var32;
                                       if (~var39 < -1) {
                                          Image var40 = class204.field2515.createImage(var39, -var23 + this.field11345 + -var21);
                                          int var41 = var40.getWidth((ImageObserver)null);
                                          Graphics var42 = var40.getGraphics();
                                          int var43 = 0;
                                          if (var3) {
                                             var42.drawImage(this.field11356, var43, 0, (ImageObserver)null);
                                             var43 += var26;
                                          }

                                          while(true) {
                                             while(~var41 < ~var43) {
                                                var42.drawImage(this.field11356, var43, 0, (ImageObserver)null);
                                                var43 += var26;
                                             }

                                             var10000 = var29.drawImage(var40, var38, var23, (ImageObserver)null);
                                             if (!var3) {
                                                break;
                                             }

                                             var43 = var10000;
                                          }
                                       }

                                       var7.drawImage(this.field11351, var17 + var27, var28, (ImageObserver)null);
                                       var7.setFont(this.field11381);
                                       var7.setColor(this.field11355);
                                       var7.drawString(var6, (this.field11379 + -this.field11377.stringWidth(var6)) / 2 + var27, this.field11345 / 2 + this.field11376 + var28 - -4);
                                       var4.drawImage(class616.field8589, 0, 0, (ImageObserver)null);
                                       break label186;
                                    }

                                    var31 = var32;
                                 }
                              }

                              var30 += var22;
                           }
                        }

                        var16 += var10;
                     }
                  } catch (Exception var46) {
                     this.field11371 = true;
                     if (!var3) {
                        break label186;
                     }
                  }
               }

               class204.field2515.repaint();
            }

            if (arg1 != 22) {
               this.method3889(94);
            }
         }
      } catch (RuntimeException var47) {
         throw class534.method3846(var47, field11384[34] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method5593(int arg0, int arg1) {
      try {
         if (arg1 != 13921) {
            this.field11377 = null;
         }

         ++field11354;
         return this.field11363 ? (-arg0 + class252.field3194) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11384[36] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      new BitSet(65536);
      field11362 = new int[14];
      field11369 = 0;
      field11372 = new int[2];
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5595(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
