import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class674 extends class191 {
   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9453 = new String[]{method4882(method4881("h\u0001C\u0006")), method4882(method4881("}Z\u0001D&")), method4882(method4881("t\u0000\u0001(s")), method4882(method4881("t\u0000\u0001.s")), method4882(method4881("t\u0000\u0001/s")), method4882(method4881("t\u0000\u0001)s"))};
   @OriginalMember(
      owner = "client!rt",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field9449;
   @OriginalMember(
      owner = "client!rt",
      name = "m",
      descriptor = "I"
   )
   public static int field9448;
   @OriginalMember(
      owner = "client!rt",
      name = "t",
      descriptor = "Lfm;"
   )
   public static class164 field9450;
   @OriginalMember(
      owner = "client!rt",
      name = "o",
      descriptor = "[[B"
   )
   public static byte[][] field9451;
   @OriginalMember(
      owner = "client!rt",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field9452;
   @OriginalMember(
      owner = "client!rt",
      name = "v",
      descriptor = "I"
   )
   public static int field9440;
   @OriginalMember(
      owner = "client!rt",
      name = "w",
      descriptor = "I"
   )
   private int field9441;
   @OriginalMember(
      owner = "client!rt",
      name = "u",
      descriptor = "I"
   )
   public static int field9442;
   @OriginalMember(
      owner = "client!rt",
      name = "s",
      descriptor = "I"
   )
   private int field9443;
   @OriginalMember(
      owner = "client!rt",
      name = "p",
      descriptor = "I"
   )
   public static int field9444;
   @OriginalMember(
      owner = "client!rt",
      name = "l",
      descriptor = "I"
   )
   public static int field9445;
   @OriginalMember(
      owner = "client!rt",
      name = "q",
      descriptor = "I"
   )
   public static int field9446;
   @OriginalMember(
      owner = "client!rt",
      name = "r",
      descriptor = "I"
   )
   public static int field9447;

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4879(int arg0) {
      try {
         field9452 = null;
         field9451 = null;
         field9449 = null;
         field9450 = null;
         if (arg0 != -2) {
            method4879(46);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9453[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;I)V"
   )
   public static final void method4880(Canvas arg0, int arg1) {
      try {
         ++field9445;
         Dimension var2 = arg0.getSize();
         class235.method2081(var2.height, (byte)119, var2.width);
         if (~class217.field3113 != arg1) {
            class712.field10231.method148(arg0, class517.field7313, class682.field9878);
         } else {
            class712.field10231.method148(arg0, class690.field9938, class515.field7310);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9453[3] + (arg0 != null ? field9453[1] : field9453[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         ++field9440;
         if (arg1 <= -97) {
            this.field9443 = arg0.method701(255);
            this.field9441 = arg0.method701(255);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9453[5] + (arg0 != null ? field9453[1] : field9453[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         arg1.method3529(this.field9441, 0, this.field9443);
         ++field9444;
         if (arg0 > -106) {
            field9449 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9453[2] + arg0 + ',' + (arg1 != null ? field9453[1] : field9453[0]) + ')');
      }
   }

   static {
      new class198("", 76);
      field9449 = new int[4];
      field9448 = -1;
      field9450 = new class164(43, 3);
      field9451 = new byte[250][];
      field9452 = new int[3];
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4881(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4882(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
