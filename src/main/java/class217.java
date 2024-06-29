import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class217 extends class673 {
   @OriginalMember(
      owner = "client!lg",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field2751;
   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2756 = new String[]{method1772(method1771("c\u001fL\u0010-")), method1772(method1771("vD\u000eR")), method1772(method1771("tVL\u00029vX\u0016\u0000x")), method1772(method1771("tVL|x")), method1772(method1771("tVL\u007fx"))};
   @OriginalMember(
      owner = "client!lg",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field2754 = false;
   @OriginalMember(
      owner = "client!lg",
      name = "l",
      descriptor = "Lav;"
   )
   public static class283 field2750 = new class283();
   @OriginalMember(
      owner = "client!lg",
      name = "q",
      descriptor = "I"
   )
   public static int field2752;
   @OriginalMember(
      owner = "client!lg",
      name = "o",
      descriptor = "I"
   )
   public static int field2755;
   @OriginalMember(
      owner = "client!lg",
      name = "n",
      descriptor = "[Lnl;"
   )
   public static class713[] field2753;

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1769(byte arg0) {
      try {
         field2750 = null;
         field2753 = null;
         int var1 = 33 % ((arg0 - 31) / 34);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2756[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(ILjava/io/File;)[B"
   )
   public static final byte[] method1770(int arg0, File arg1) {
      try {
         ++field2752;
         if (arg0 >= -124) {
            field2755 = -62;
         }

         return class454.method3480(0, arg1, (int)arg1.length());
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2756[3] + arg0 + ',' + (arg1 != null ? field2756[0] : field2756[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "<init>",
      descriptor = "()V"
   )
   public class217() {
   }

   @OriginalMember(
      owner = "client!lg",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class217(String arg0) {
      try {
         this.field2751 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2756[2] + (arg0 != null ? field2756[0] : field2756[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1771(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1772(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
