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

@OriginalClass("client!jja")
public class class118 extends class593 implements ImageProducer {
   @OriginalMember(
      owner = "client!jja",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1445 = new String[]{method990(method989("M\u0001`\u001fm\u000f")), method990(method989("\\E/\u001fR")), method990(method989("I\u001em]")), method990(method989("M\u0001`\u001fFT(n_\\R\u0006dC\u0007")), method990(method989("M\u0001`\u001fNC\u000fB^AT\u001elT]\u000f")), method990(method989("M\u0001`\u001fi\u000f")), method990(method989("M\u0001`\u001f\\S\nsE\u007fU\u0004eDLS\u0002n_\u0007")), method990(method989("M\u0001`\u001fj\u000f")), method990(method989("M\u0001`\u001f]B\u0006nGJd\u0004oBZJ\u000es\u0019")), method990(method989("M\u0001`\u001fl\u000f")), method990(method989("M\u0001`\u001f]B\u001atT\\S?nAkH\u001co}JA\u001fSXHO\u001fST\\B\u0005e\u0019")), method990(method989("M\u0001`\u001fn\u000f")), method990(method989("M\u0001`\u001fk\u000f"))};
   @OriginalMember(
      owner = "client!jja",
      name = "A",
      descriptor = "I"
   )
   public static int field1431;
   @OriginalMember(
      owner = "client!jja",
      name = "s",
      descriptor = "I"
   )
   public static int field1432;
   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "I"
   )
   public static int field1433;
   @OriginalMember(
      owner = "client!jja",
      name = "u",
      descriptor = "I"
   )
   public static int field1434;
   @OriginalMember(
      owner = "client!jja",
      name = "x",
      descriptor = "I"
   )
   public static int field1437;
   @OriginalMember(
      owner = "client!jja",
      name = "B",
      descriptor = "I"
   )
   public static int field1439;
   @OriginalMember(
      owner = "client!jja",
      name = "w",
      descriptor = "I"
   )
   public static int field1440;
   @OriginalMember(
      owner = "client!jja",
      name = "q",
      descriptor = "I"
   )
   public static int field1441;
   @OriginalMember(
      owner = "client!jja",
      name = "t",
      descriptor = "I"
   )
   public static int field1442;
   @OriginalMember(
      owner = "client!jja",
      name = "y",
      descriptor = "I"
   )
   public static int field1443;
   @OriginalMember(
      owner = "client!jja",
      name = "p",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field1444;
   @OriginalMember(
      owner = "client!jja",
      name = "v",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1436;
   @OriginalMember(
      owner = "client!jja",
      name = "r",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field1435;
   @OriginalMember(
      owner = "client!jja",
      name = "o",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field1438;

   @OriginalMember(
      owner = "client!jja",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 5
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         ++field1439;
         this.addConsumer(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1445[6] + (arg0 != null ? field1445[1] : field1445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(JJ)J",
      line = 13
   )
   public static long method983(long arg0, long arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1445[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(I)V",
      line = 21
   )
   public static final void method984(int arg0) {
      try {
         label122: {
            ++field1442;
            int var1 = class552.field8167 * 512 + 256;
            int var2 = class513.field7524 * 512 - -256;
            int var3 = class368.method2858(var2, (byte)-11, var1, class551.field8158) - class506.field7479;
            if (class261.field3563 < 100) {
               if (class731.field10844 < var1) {
                  class731.field10844 += (-class731.field10844 + var1) * class261.field3563 / 1000 + class132.field1655;
                  if (var1 < class731.field10844) {
                     class731.field10844 = var1;
                  }
               }

               if (~var3 < ~class733.field10871) {
                  class733.field10871 += (-class733.field10871 + var3) * class261.field3563 / 1000 + class132.field1655;
                  if (var3 < class733.field10871) {
                     class733.field10871 = var3;
                  }
               }

               if (class731.field10844 > var1) {
                  class731.field10844 -= (class731.field10844 - var1) * class261.field3563 / 1000 + class132.field1655;
                  if (~class731.field10844 > ~var1) {
                     class731.field10844 = var1;
                  }
               }

               if (var3 < class733.field10871) {
                  class733.field10871 -= (class733.field10871 - var3) * class261.field3563 / 1000 + class132.field1655;
                  if (~class733.field10871 > ~var3) {
                     class733.field10871 = var3;
                  }
               }

               if (~var2 < ~class232.field2947) {
                  class232.field2947 += (-class232.field2947 + var2) * class261.field3563 / 1000 + class132.field1655;
                  if (var2 < class232.field2947) {
                     class232.field2947 = var2;
                  }
               }

               if (var2 >= class232.field2947) {
                  break label122;
               }

               class232.field2947 -= class132.field1655 - -((-var2 + class232.field2947) * class261.field3563 / 1000);
               if (class232.field2947 >= var2) {
                  break label122;
               }

               class232.field2947 = var2;
               if (client.field4530 == 0) {
                  break label122;
               }
            }

            class232.field2947 = class513.field7524 * 512 + 256;
            class731.field10844 = class552.field8167 * 512 + 256;
            class733.field10871 = class368.method2858(class232.field2947, (byte)-11, class731.field10844, class551.field8158) - class506.field7479;
         }

         int var4 = class29.field320 * 512 + 256;
         int var5 = class310.field4418 * 512 + 256;
         int var6 = class368.method2858(var5, (byte)-11, var4, class551.field8158) - class42.field453;
         int var7 = -class731.field10844 + var4;
         int var8 = -class733.field10871 + var6;
         int var9 = -class232.field2947 + var5;
         int var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
         int var11 = 16383 & (int)(Math.atan2((double)var8, (double)var10) * 2607.5945876176133D);
         if (~var11 > -1025) {
            var11 = 1024;
         }

         int var12 = 16383 & (int)(-2607.5945876176133D * Math.atan2((double)var7, (double)var9));
         if (var11 > 3072) {
            var11 = 3072;
         }

         if (~var11 < ~class713.field10637) {
            class713.field10637 += (-class713.field10637 + var11 >> 3) * class547.field8114 / 1000 + class580.field8589 << 3;
            if (class713.field10637 > var11) {
               class713.field10637 = var11;
            }
         }

         if (class713.field10637 > var11) {
            class713.field10637 -= (-var11 + class713.field10637 >> 3) * class547.field8114 / 1000 + class580.field8589 << 3;
            if (var11 > class713.field10637) {
               class713.field10637 = var11;
            }
         }

         int var13 = 88 % ((arg0 - 12) / 61);
         int var14 = -class292.field4078 + var12;
         if (~var14 < -8193) {
            var14 -= 16384;
         }

         if (~var14 > 8191) {
            var14 += 16384;
         }

         int var15 = var14 >> 3;
         if (~var15 < -1) {
            class292.field4078 += class580.field8589 - -(class547.field8114 * var15 / 1000) << 3;
            class292.field4078 &= 16383;
         }

         if (~var15 > -1) {
            class292.field4078 -= -var15 * class547.field8114 / 1000 + class580.field8589 << 3;
            class292.field4078 &= 16383;
         }

         int var16 = -class292.field4078 + var12;
         if (~var16 < -8193) {
            var16 -= 16384;
         }

         if (var16 < -8192) {
            var16 += 16384;
         }

         class503.field7464 = 0;
         if (var16 < 0 && var15 > 0 || ~var16 < -1 && ~var15 > -1) {
            class292.field4078 = var12;
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field1445[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 176
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
      try {
         ++field1432;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1445[10] + (arg0 != null ? field1445[1] : field1445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 189
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         ++field1441;
         this.field1438 = arg0;
         arg0.setDimensions(super.field8750, super.field8749);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field1435);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1445[4] + (arg0 != null ? field1445[1] : field1445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIIILjava/awt/Graphics;II)V",
      line = 203
   )
   public final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7) {
      try {
         ++field1443;
         this.method988(-125, arg6, arg3, arg1, arg4);
         Shape var9 = arg5.getClip();
         arg5.clipRect(arg7, arg2, arg6, arg4);
         arg5.drawImage(this.field1436, -arg1 + arg7, -arg3 + arg2, this.field1444);
         if (arg0 >= -22) {
            this.field1435 = null;
         }

         arg5.setClip(var9);
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1445[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1445[1] : field1445[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IILjava/awt/Canvas;B)V",
      line = 221
   )
   public final void method986(int arg0, int arg1, Canvas arg2, byte arg3) {
      try {
         super.field8749 = arg0;
         if (arg3 > 96) {
            this.field1444 = arg2;
            ++field1437;
            super.field8750 = arg1;
            super.field8751 = new int[super.field8750 * super.field8749];
            this.field1435 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field1436 = this.field1444.createImage(this);
            this.method987((byte)-128);
            this.field1444.prepareImage(this.field1436, this.field1444);
            this.method987((byte)-126);
            this.field1444.prepareImage(this.field1436, this.field1444);
            this.method987((byte)-127);
            this.field1444.prepareImage(this.field1436, this.field1444);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1445[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1445[1] : field1445[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 244
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         ++field1431;
         if (this.field1438 == arg0) {
            this.field1438 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1445[8] + (arg0 != null ? field1445[1] : field1445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z",
      line = 255
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         ++field1440;
         return this.field1438 == arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1445[3] + (arg0 != null ? field1445[1] : field1445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "(B)V",
      line = 264
   )
   private final synchronized void method987(byte arg0) {
      try {
         ++field1433;
         if (this.field1438 != null) {
            if (arg0 <= -124) {
               this.field1438.setPixels(0, 0, super.field8750, super.field8749, this.field1435, super.field8751, 0, super.field8750);
               this.field1438.imageComplete(2);
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1445[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIII)V",
      line = 280
   )
   private final synchronized void method988(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var6 = -68 % ((-50 - arg0) / 34);
         ++field1434;
         if (this.field1438 != null) {
            this.field1438.setPixels(arg3, arg2, arg1, arg4, this.field1435, super.field8751, super.field8750 * arg2 + arg3, super.field8750);
            this.field1438.imageComplete(2);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1445[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method989(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method990(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
