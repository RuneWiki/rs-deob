import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class334 {
   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5145 = new String[]{method2733(method2732("\u0014-L|~")), method2733(method2732("\u0014-L}~")), method2733(method2732("\u0014-L~~"))};
   @OriginalMember(
      owner = "client!co",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field5139 = new int[1024];
   @OriginalMember(
      owner = "client!co",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field5143 = false;
   @OriginalMember(
      owner = "client!co",
      name = "d",
      descriptor = "I"
   )
   public static int field5142 = 1;
   @OriginalMember(
      owner = "client!co",
      name = "e",
      descriptor = "I"
   )
   public static int field5137;
   @OriginalMember(
      owner = "client!co",
      name = "g",
      descriptor = "I"
   )
   public static int field5140;
   @OriginalMember(
      owner = "client!co",
      name = "f",
      descriptor = "I"
   )
   public int field5141;
   @OriginalMember(
      owner = "client!co",
      name = "b",
      descriptor = "Lfq;"
   )
   public static class374 field5138;
   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field5144;

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public abstract Socket method1877(int arg0) throws IOException;

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;"
   )
   public final Socket method2729(byte arg0) throws IOException {
      try {
         if (arg0 != 52) {
            method2730(-4);
         }

         ++field5140;
         return new Socket(this.field5144, this.field5141);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5145[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method2730(int arg0) {
      try {
         int var1 = -100 / ((arg0 - 48) / 61);
         ++field5137;
         return ~class67.field883 == -2 ? class790.field11557 : class86.field1255;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5145[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2731(int arg0) {
      try {
         field5138 = null;
         if (arg0 >= 66) {
            field5139 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5145[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2732(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2733(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
