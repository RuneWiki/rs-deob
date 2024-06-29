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

@OriginalClass("client!nl")
public class class471 extends class202 implements ImageProducer {
   @OriginalMember(
      owner = "client!nl",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7174 = new String[]{method3667(method3666("\u0011:TU")), method3667(method3666("\u0011#\u0016J\u001c\u001e=Li\u001a\u0010+MZ\u001c\u0016 V\u0011")), method3667(method3666("\u0004a\u0016\u0017\u0015")), method3667(method3666("\u0011#\u0016X\f\u001b\fWW\u001b\n\"]K@")), method3667(method3666("\u0011#\u0016|@")), method3667(method3666("\u0011#\u0016\u007f@")), method3667(method3666("\u0011#\u0016{@")), method3667(method3666("\u0011#\u0016x@")), method3667(method3666("\u0011#\u0016P\u001b< VJ\u001d\u0012*J\u0011")), method3667(method3666("\u0011#\u0016K\r\u0012 N\\+\u0010!KL\u0005\u001a=\u0010")), method3667(method3666("\u0011#\u0016~@")), method3667(method3666("\u0011#\u0016K\r\u000e:]J\u001c+ H}\u0007\b!t\\\u000e\u000b\u001dQ^\u0000\u000b\u001d]J\r\u0011+\u0010")), method3667(method3666("\u0011#\u0016z@"))};
   @OriginalMember(
      owner = "client!nl",
      name = "D",
      descriptor = "Luk;"
   )
   public static class498 field7164 = new class498(140, 6);
   @OriginalMember(
      owner = "client!nl",
      name = "I",
      descriptor = "[Loj;"
   )
   public static class564[] field7172 = null;
   @OriginalMember(
      owner = "client!nl",
      name = "w",
      descriptor = "I"
   )
   public static int field7156;
   @OriginalMember(
      owner = "client!nl",
      name = "y",
      descriptor = "I"
   )
   public static int field7159;
   @OriginalMember(
      owner = "client!nl",
      name = "F",
      descriptor = "I"
   )
   public static int field7162;
   @OriginalMember(
      owner = "client!nl",
      name = "K",
      descriptor = "I"
   )
   public static int field7163;
   @OriginalMember(
      owner = "client!nl",
      name = "H",
      descriptor = "I"
   )
   public static int field7166;
   @OriginalMember(
      owner = "client!nl",
      name = "E",
      descriptor = "I"
   )
   public static int field7167;
   @OriginalMember(
      owner = "client!nl",
      name = "x",
      descriptor = "I"
   )
   public static int field7168;
   @OriginalMember(
      owner = "client!nl",
      name = "A",
      descriptor = "I"
   )
   public static int field7169;
   @OriginalMember(
      owner = "client!nl",
      name = "C",
      descriptor = "I"
   )
   public static int field7170;
   @OriginalMember(
      owner = "client!nl",
      name = "v",
      descriptor = "I"
   )
   public static int field7171;
   @OriginalMember(
      owner = "client!nl",
      name = "L",
      descriptor = "I"
   )
   public static int field7173;
   @OriginalMember(
      owner = "client!nl",
      name = "t",
      descriptor = "Liba;"
   )
   public static class343 field7160;
   @OriginalMember(
      owner = "client!nl",
      name = "G",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field7158;
   @OriginalMember(
      owner = "client!nl",
      name = "B",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7161;
   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field7165;
   @OriginalMember(
      owner = "client!nl",
      name = "u",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field7157;

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(III)Lmja;"
   )
   public static final class269 method3661(int arg0, int arg1, int arg2) {
      class190 var3 = class711.field10694[arg0][arg1][arg2];
      return var3 == null ? null : var3.field2960;
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(IBIII)V"
   )
   private final synchronized void method3662(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7171;
         if (this.field7157 != null) {
            this.field7157.setPixels(arg0, arg2, arg3, arg4, this.field7165, super.field3088, super.field3084 * arg2 - -arg0, super.field3084);
            this.field7157.imageComplete(2);
            if (arg1 != 92) {
               this.field7161 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7174[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         if (this.field7157 == arg0) {
            this.field7157 = null;
         }

         ++field7159;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7174[9] + (arg0 != null ? field7174[2] : field7174[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
      try {
         ++field7166;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7174[11] + (arg0 != null ? field7174[2] : field7174[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         ++field7167;
         this.field7157 = arg0;
         arg0.setDimensions(super.field3084, super.field3090);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field7165);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7174[3] + (arg0 != null ? field7174[2] : field7174[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3663(int arg0, int arg1) {
      try {
         ++field7162;
         if (arg0 != 0) {
            return false;
         } else {
            return ~arg1 == -1 || ~arg1 == -3;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7174[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(BIILjava/awt/Canvas;)V"
   )
   public final void method1767(byte arg0, int arg1, int arg2, Canvas arg3) {
      try {
         if (arg0 >= 33) {
            ++field7173;
            super.field3084 = arg1;
            this.field7158 = arg3;
            super.field3090 = arg2;
            super.field3088 = new int[super.field3090 * super.field3084];
            this.field7165 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field7161 = this.field7158.createImage(this);
            this.method3664(0);
            this.field7158.prepareImage(this.field7161, this.field7158);
            this.method3664(0);
            this.field7158.prepareImage(this.field7161, this.field7158);
            this.method3664(0);
            this.field7158.prepareImage(this.field7161, this.field7158);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7174[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7174[2] : field7174[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "b",
      descriptor = "(I)V"
   )
   private final synchronized void method3664(int arg0) {
      try {
         ++field7163;
         if (this.field7157 != null) {
            this.field7157.setPixels(0, arg0, super.field3084, super.field3090, this.field7165, super.field3088, 0, super.field3084);
            this.field7157.imageComplete(2);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7174[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z"
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         ++field7156;
         return this.field7157 == arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7174[8] + (arg0 != null ? field7174[2] : field7174[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         ++field7168;
         this.addConsumer(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7174[1] + (arg0 != null ? field7174[2] : field7174[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(IIIIILjava/awt/Graphics;BI)V"
   )
   public final void method1766(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, byte arg6, int arg7) {
      try {
         this.method3662(arg2, (byte)92, arg1, arg0, arg7);
         ++field7170;
         if (arg6 < 50) {
            this.removeConsumer((ImageConsumer)null);
         }

         Shape var9 = arg5.getClip();
         arg5.clipRect(arg3, arg4, arg0, arg7);
         arg5.drawImage(this.field7161, arg3 - arg2, arg4 - arg1, this.field7158);
         arg5.setClip(var9);
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field7174[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7174[2] : field7174[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3665(int arg0) {
      try {
         field7172 = null;
         field7164 = null;
         field7160 = null;
         if (arg0 != 2) {
            field7164 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7174[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3666(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3667(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
