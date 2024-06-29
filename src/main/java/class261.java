import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class261 {
   @OriginalMember(
      owner = "client!gca",
      name = "c",
      descriptor = "[I"
   )
   public int[] field3683 = new int[257];
   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "[Z"
   )
   public boolean[] field3692 = new boolean[256];
   @OriginalMember(
      owner = "client!gca",
      name = "K",
      descriptor = "[B"
   )
   public byte[] field3694 = new byte[18002];
   @OriginalMember(
      owner = "client!gca",
      name = "t",
      descriptor = "[I"
   )
   public int[] field3690 = new int[6];
   @OriginalMember(
      owner = "client!gca",
      name = "h",
      descriptor = "I"
   )
   public int field3700 = 0;
   @OriginalMember(
      owner = "client!gca",
      name = "D",
      descriptor = "I"
   )
   public int field3691 = 0;
   @OriginalMember(
      owner = "client!gca",
      name = "B",
      descriptor = "[B"
   )
   public byte[] field3699 = new byte[18002];
   @OriginalMember(
      owner = "client!gca",
      name = "d",
      descriptor = "[[I"
   )
   public int[][] field3706 = new int[6][258];
   @OriginalMember(
      owner = "client!gca",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field3708 = new byte[4096];
   @OriginalMember(
      owner = "client!gca",
      name = "G",
      descriptor = "[[I"
   )
   public int[][] field3707 = new int[6][258];
   @OriginalMember(
      owner = "client!gca",
      name = "L",
      descriptor = "[I"
   )
   public int[] field3709 = new int[16];
   @OriginalMember(
      owner = "client!gca",
      name = "e",
      descriptor = "[[I"
   )
   public int[][] field3713 = new int[6][258];
   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "[B"
   )
   public byte[] field3693 = new byte[256];
   @OriginalMember(
      owner = "client!gca",
      name = "w",
      descriptor = "[Z"
   )
   public boolean[] field3715 = new boolean[16];
   @OriginalMember(
      owner = "client!gca",
      name = "k",
      descriptor = "[I"
   )
   public int[] field3710 = new int[256];
   @OriginalMember(
      owner = "client!gca",
      name = "F",
      descriptor = "[[B"
   )
   public byte[][] field3716 = new byte[6][258];
   @OriginalMember(
      owner = "client!gca",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3717 = new String[]{method2092(method2091("N\u0015Qpu\u0001")), method2092(method2091("N\u0015Qpt\u0001")), method2092(method2091("RX\u001epK")), method2092(method2091("N\u0015Qpw\u0001")), method2092(method2091("a\u0013\\(S]\u001fS?")), method2092(method2091("G\u0003\\2"))};
   @OriginalMember(
      owner = "client!gca",
      name = "f",
      descriptor = "[[B"
   )
   public static byte[][] field3679 = new byte[250][];
   @OriginalMember(
      owner = "client!gca",
      name = "r",
      descriptor = "Lsf;"
   )
   public static class547 field3680 = new class547(0, 0);
   @OriginalMember(
      owner = "client!gca",
      name = "q",
      descriptor = "Luw;"
   )
   public static class435 field3712 = new class435(64, 2);
   @OriginalMember(
      owner = "client!gca",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field3714 = true;
   @OriginalMember(
      owner = "client!gca",
      name = "l",
      descriptor = "B"
   )
   public byte field3695;
   @OriginalMember(
      owner = "client!gca",
      name = "i",
      descriptor = "I"
   )
   public int field3681;
   @OriginalMember(
      owner = "client!gca",
      name = "g",
      descriptor = "I"
   )
   public int field3682;
   @OriginalMember(
      owner = "client!gca",
      name = "H",
      descriptor = "I"
   )
   public int field3684;
   @OriginalMember(
      owner = "client!gca",
      name = "s",
      descriptor = "I"
   )
   public int field3685;
   @OriginalMember(
      owner = "client!gca",
      name = "I",
      descriptor = "I"
   )
   public int field3686;
   @OriginalMember(
      owner = "client!gca",
      name = "A",
      descriptor = "I"
   )
   public int field3687;
   @OriginalMember(
      owner = "client!gca",
      name = "n",
      descriptor = "I"
   )
   public int field3688;
   @OriginalMember(
      owner = "client!gca",
      name = "o",
      descriptor = "I"
   )
   public static int field3689;
   @OriginalMember(
      owner = "client!gca",
      name = "J",
      descriptor = "I"
   )
   public int field3696;
   @OriginalMember(
      owner = "client!gca",
      name = "E",
      descriptor = "I"
   )
   public int field3697;
   @OriginalMember(
      owner = "client!gca",
      name = "y",
      descriptor = "I"
   )
   public int field3698;
   @OriginalMember(
      owner = "client!gca",
      name = "u",
      descriptor = "I"
   )
   public int field3701;
   @OriginalMember(
      owner = "client!gca",
      name = "C",
      descriptor = "I"
   )
   public int field3703;
   @OriginalMember(
      owner = "client!gca",
      name = "j",
      descriptor = "I"
   )
   public int field3704;
   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "I"
   )
   public static int field3711;
   @OriginalMember(
      owner = "client!gca",
      name = "v",
      descriptor = "[B"
   )
   public byte[] field3702;
   @OriginalMember(
      owner = "client!gca",
      name = "x",
      descriptor = "[B"
   )
   public byte[] field3705;

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2088(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2089(boolean arg0) {
      try {
         field3680 = null;
         if (arg0) {
            field3714 = true;
         }

         field3679 = null;
         field3712 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3717[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Ljava/lang/String;BLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V"
   )
   public static final void method2090(String arg0, byte arg1, Color arg2, Color arg3, Color arg4, int arg5) {
      try {
         try {
            Graphics var6 = class386.field5692.getGraphics();
            if (class613.field8905 == null) {
               class613.field8905 = new Font(field3717[4], 1, 13);
            }

            if (arg4 == null) {
               arg4 = new Color(140, 17, 17);
            }

            if (arg3 == null) {
               arg3 = new Color(140, 17, 17);
            }

            if (arg2 == null) {
               arg2 = new Color(255, 255, 255);
            }

            try {
               if (class729.field10493 == null) {
                  class729.field10493 = class386.field5692.createImage(class720.field10406, class218.field3296);
               }

               Graphics var7 = class729.field10493.getGraphics();
               var7.setColor(Color.black);
               var7.fillRect(0, 0, class720.field10406, class218.field3296);
               int var8 = class720.field10406 / 2 + -152;
               int var9 = class218.field3296 / 2 + -18;
               var7.setColor(arg3);
               var7.drawRect(var8, var9, 303, 33);
               var7.setColor(arg4);
               var7.fillRect(var8 + 2, var9 - -2, arg5 * 3, 30);
               var7.setColor(Color.black);
               var7.drawRect(var8 + 1, var9 - -1, 301, 31);
               var7.fillRect(var8 - (-(arg5 * 3) + -2), var9 - -2, 300 - arg5 * 3, 30);
               var7.setFont(class613.field8905);
               var7.setColor(arg2);
               var7.drawString(arg0, (304 + -(6 * arg0.length())) / 2 + var8, var9 + 22);
               if (class343.field4878 != null) {
                  var7.setFont(class613.field8905);
                  var7.setColor(arg2);
                  var7.drawString(class343.field4878, class720.field10406 / 2 + -(6 * class343.field4878.length() / 2), class218.field3296 / 2 + -26);
               }

               var6.drawImage(class729.field10493, 0, 0, (ImageObserver)null);
            } catch (Exception var14) {
               var6.setColor(Color.black);
               var6.fillRect(0, 0, class720.field10406, class218.field3296);
               int var10 = class720.field10406 / 2 - 152;
               int var11 = class218.field3296 / 2 + -18;
               var6.setColor(arg3);
               var6.drawRect(var10, var11, 303, 33);
               var6.setColor(arg4);
               var6.fillRect(var10 + 2, var11 + 2, arg5 * 3, 30);
               var6.setColor(Color.black);
               var6.drawRect(var10 + 1, var11 - -1, 301, 31);
               var6.fillRect(arg5 * 3 + var10 + 2, var11 + 2, -(arg5 * 3) + 300, 30);
               var6.setFont(class613.field8905);
               var6.setColor(arg2);
               if (class343.field4878 != null) {
                  var6.setFont(class613.field8905);
                  var6.setColor(arg2);
                  var6.drawString(class343.field4878, class720.field10406 / 2 - 6 * class343.field4878.length() / 2, class218.field3296 / 2 + -26);
               }

               var6.drawString(arg0, (304 + -(arg0.length() * 6)) / 2 + var10, var11 + 22);
            }
         } catch (Exception var15) {
            class386.field5692.repaint();
         }

         int var12 = 1 / ((arg1 - 38) / 45);
         ++field3689;
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field3717[3] + (arg0 != null ? field3717[2] : field3717[5]) + ',' + arg1 + ',' + (arg2 != null ? field3717[2] : field3717[5]) + ',' + (arg3 != null ? field3717[2] : field3717[5]) + ',' + (arg4 != null ? field3717[2] : field3717[5]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2091(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2092(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
