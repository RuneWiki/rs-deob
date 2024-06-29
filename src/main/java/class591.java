import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class591 extends class723 {
   @OriginalMember(
      owner = "client!k",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8738 = new String[]{method4351(method4350("\tb!*\u00045n.=")), method4351(method4350("/r!0")), method4351(method4350("*)\u000ft")), method4351(method4350(":)cr\u001c")), method4351(method4350("*)\u000et")), method4351(method4350("*)\ft")), method4351(method4350("*)\tt"))};
   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8737 = "";
   @OriginalMember(
      owner = "client!k",
      name = "D",
      descriptor = "I"
   )
   public static int field8732;
   @OriginalMember(
      owner = "client!k",
      name = "F",
      descriptor = "I"
   )
   public static int field8734;
   @OriginalMember(
      owner = "client!k",
      name = "E",
      descriptor = "I"
   )
   public static int field8735;
   @OriginalMember(
      owner = "client!k",
      name = "C",
      descriptor = "I"
   )
   public static int field8736;
   @OriginalMember(
      owner = "client!k",
      name = "A",
      descriptor = "[B"
   )
   private byte[] field8733;

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(BIB)V",
      line = 3
   )
   public final void method1943(byte arg0, int arg1, byte arg2) {
      try {
         ++field8735;
         int var4 = arg1 * 2;
         byte var8 = (byte)(((arg2 & 255) >> 1) + 127);
         int var5 = 28 % ((-77 - arg0) / 37);
         int var10001 = var4;
         int var9 = var4 + 1;
         this.field8733[var10001] = var8;
         this.field8733[var9] = var8;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8738[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "<init>",
      descriptor = "()V",
      line = 17
   )
   public class591() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!k",
      name = "e",
      descriptor = "(I)V",
      line = 20
   )
   public static void method4347(int arg0) {
      try {
         if (arg0 <= -47) {
            field8737 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8738[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(IILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V",
      line = 32
   )
   public static final void method4348(int arg0, int arg1, String arg2, Color arg3, Color arg4, Color arg5) {
      try {
         ++field8734;

         try {
            Graphics var6 = class769.field11271.getGraphics();
            if (class638.field9297 == null) {
               class638.field9297 = new Font(field8738[0], 1, 13);
            }

            if (arg3 == null) {
               arg3 = new Color(140, 17, 17);
            }

            if (arg4 == null) {
               arg4 = new Color(140, 17, 17);
            }

            if (arg5 == null) {
               arg5 = new Color(255, 255, 255);
            }

            try {
               if (class718.field10677 == null) {
                  class718.field10677 = class769.field11271.createImage(class207.field2647, class411.field6305);
               }

               Graphics var7 = class718.field10677.getGraphics();
               var7.setColor(Color.black);
               var7.fillRect(0, 0, class207.field2647, class411.field6305);
               int var8 = class207.field2647 / 2 + -152;
               int var9 = class411.field6305 / 2 + -18;
               var7.setColor(arg4);
               var7.drawRect(var8, var9, 303, 33);
               var7.setColor(arg3);
               var7.fillRect(var8 - -2, var9 + 2, arg0 * 3, 30);
               var7.setColor(Color.black);
               var7.drawRect(var8 - -1, var9 + 1, 301, 31);
               var7.fillRect(var8 - -(arg0 * 3) + 2, var9 - -2, -(arg0 * 3) + 300, 30);
               var7.setFont(class638.field9297);
               var7.setColor(arg5);
               var7.drawString(arg2, var8 + (304 - 6 * arg2.length()) / 2, var9 + 22);
               if (class440.field6699 != null) {
                  var7.setFont(class638.field9297);
                  var7.setColor(arg5);
                  var7.drawString(class440.field6699, class207.field2647 / 2 + -(class440.field6699.length() * 6 / 2), class411.field6305 / 2 + -26);
               }

               var6.drawImage(class718.field10677, 0, 0, (ImageObserver)null);
            } catch (Exception var13) {
               var6.setColor(Color.black);
               var6.fillRect(0, 0, class207.field2647, class411.field6305);
               int var10 = class207.field2647 / 2 + -152;
               int var11 = class411.field6305 / 2 - 18;
               var6.setColor(arg4);
               var6.drawRect(var10, var11, 303, 33);
               var6.setColor(arg3);
               var6.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
               var6.setColor(Color.black);
               var6.drawRect(var10 + 1, var11 + 1, 301, 31);
               var6.fillRect(arg0 * 3 + var10 + 2, var11 + 2, -(arg0 * 3) + 300, 30);
               var6.setFont(class638.field9297);
               var6.setColor(arg5);
               if (class440.field6699 != null) {
                  var6.setFont(class638.field9297);
                  var6.setColor(arg5);
                  var6.drawString(class440.field6699, class207.field2647 / 2 + -(6 * class440.field6699.length() / 2), class411.field6305 / 2 + -26);
               }

               var6.drawString(arg2, (304 + -(6 * arg2.length())) / 2 + var10, var11 - -22);
            }

            if (arg1 != -14687) {
               field8737 = null;
            }
         } catch (Exception var14) {
            class769.field11271.repaint();
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field8738[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8738[3] : field8738[1]) + ',' + (arg3 != null ? field8738[3] : field8738[1]) + ',' + (arg4 != null ? field8738[3] : field8738[1]) + ',' + (arg5 != null ? field8738[3] : field8738[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "b",
      descriptor = "(IIII)[B",
      line = 122
   )
   public final byte[] method4349(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field8733 = new byte[arg0 * arg1 * 2 * arg2];
         ++field8732;
         this.method3429(arg0, arg2, arg1, 26264);
         if (arg3 > -124) {
            this.field8733 = null;
         }

         return this.field8733;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8738[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4350(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4351(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
