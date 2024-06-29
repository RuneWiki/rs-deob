import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class774 extends OutputStream {
   @OriginalMember(
      owner = "client!oha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11372 = new String[]{method5593(method5592(";TDPp")), method5593(method5592("`F\t\u0011a}\u001c\f\u0018k&\u001cT@")), method5593(method5592("/\u0012\u000bPLh")), method5593(method5592(".\u000f\u0006\u0012")), method5593(method5592("/\u0012\u000bPz2\u0013\u001e\u001b%")), method5593(method5592("/\u0012\u000bPOh"))};
   @OriginalMember(
      owner = "client!oha",
      name = "c",
      descriptor = "Z"
   )
   public static volatile boolean field11367 = true;
   @OriginalMember(
      owner = "client!oha",
      name = "d",
      descriptor = "I"
   )
   public static int field11368 = 0;
   @OriginalMember(
      owner = "client!oha",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field11371 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "I"
   )
   public static int field11369;
   @OriginalMember(
      owner = "client!oha",
      name = "e",
      descriptor = "I"
   )
   public static int field11370;

   @OriginalMember(
      owner = "client!oha",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field11369;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11372[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5590(int arg0) {
      try {
         if (arg0 >= -6) {
            field11368 = -25;
         }

         field11371 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11372[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "(Lim;B)Ljava/lang/String;"
   )
   public static final String method5591(class598 arg0, byte arg1) {
      try {
         ++field11370;
         if (arg1 < 31) {
            field11367 = false;
         }

         return arg0.field8793 + field11372[1];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11372[2] + (arg0 != null ? field11372[0] : field11372[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5592(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5593(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
