import java.awt.Canvas;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class512 extends OutputStream {
   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7275 = new String[]{method3861(method3860("XkSYk")), method3861(method3860("^|\u0011w")), method3861(method3860("XkSZk")), method3861(method3860("K'S5>")), method3861(method3860("XkSl1Y}\u00183"))};
   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "I"
   )
   public static int field7272;
   @OriginalMember(
      owner = "client!hb",
      name = "c",
      descriptor = "I"
   )
   public static int field7273;
   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "I"
   )
   public static int field7274;

   @OriginalMember(
      owner = "client!hb",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field7273;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7275[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ld;II)Lha;"
   )
   public static final class17 method3858(int arg0, Canvas arg1, class672 arg2, int arg3, int arg4) {
      try {
         if (arg3 != 0) {
            method3858(-96, (Canvas)null, (class672)null, 4, 71);
         }

         ++field7274;
         return new class473(arg1, arg2, arg4, arg0);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7275[2] + arg0 + ',' + (arg1 != null ? field7275[3] : field7275[1]) + ',' + (arg2 != null ? field7275[3] : field7275[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3859(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 544) {
            return true;
         } else {
            ++field7272;
            return (544 & arg0) == 544 | (24 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7275[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3860(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3861(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
