import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class141 extends Canvas {
   @OriginalMember(
      owner = "client!aba",
      name = "g",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field1776;
   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1783 = new String[]{method1163(method1162("BK\u0019o6\u000b")), method1163(method1162("BK\u0019o5\u000b")), method1163(method1162("X\u0007Vo\n")), method1163(method1162("BK\u0019oKJG\u00115I\u000b")), method1163(method1162("M\\\u0014-")), method1163(method1162("BK\u0019o\u0002SM\u00195\u0012\u000b")), method1163(method1162("BK\u0019o4\u000b")), method1163(method1162("BK\u0019o\u0007B@\u00165_"))};
   @OriginalMember(
      owner = "client!aba",
      name = "i",
      descriptor = "I"
   )
   public static int field1779 = 0;
   @OriginalMember(
      owner = "client!aba",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1778 = new String[8];
   @OriginalMember(
      owner = "client!aba",
      name = "c",
      descriptor = "I"
   )
   public static int field1775;
   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "I"
   )
   public static int field1777;
   @OriginalMember(
      owner = "client!aba",
      name = "f",
      descriptor = "I"
   )
   public static int field1780;
   @OriginalMember(
      owner = "client!aba",
      name = "b",
      descriptor = "I"
   )
   public static int field1782;
   @OriginalMember(
      owner = "client!aba",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field1774;
   @OriginalMember(
      owner = "client!aba",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field1781;

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method1159(int arg0, byte arg1) {
      try {
         class727.field10610 = arg0;
         if (arg1 >= 104) {
            ++field1775;
            class551.field8114.method3201((byte)110);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1783[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void paint(Graphics arg0) {
      try {
         this.field1776.paint(arg0);
         ++field1782;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1783[7] + (arg0 != null ? field1783[2] : field1783[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1160(int arg0) {
      try {
         field1778 = null;
         field1781 = null;
         int var1 = 84 % ((arg0 - -26) / 39);
         field1774 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1783[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         this.field1776.update(arg0);
         ++field1777;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1783[5] + (arg0 != null ? field1783[2] : field1783[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class141(Component arg0) {
      try {
         this.field1776 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1783[3] + (arg0 != null ? field1783[2] : field1783[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public static final boolean method1161(int arg0, boolean arg1) {
      try {
         if (arg1) {
            method1161(-87, true);
         }

         ++field1780;
         if (arg0 != 2 && arg0 != 22 && arg0 != 12 && ~arg0 != -58 && ~arg0 != -7) {
            return arg0 == 15 || arg0 == 1012;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1783[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
