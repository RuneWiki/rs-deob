import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class80 {
   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field992 = method756(method755("5D&|"));
   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public static String field990;
   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field991;

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method754(boolean arg0) {
      try {
         if (arg0) {
            field991 = null;
         }

         field991 = null;
         field990 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field992 + arg0 + ')');
      }
   }

   static {
      String var0 = method756(method755("\u0015\u0004\f:\u007f7\u0004"));

      try {
         var0 = System.getProperty(method756(method755("*\u000b\u00115>6\u000f\t0\u007f2"))).toLowerCase();
      } catch (Exception var11) {
      }

      var0.toLowerCase();
      String var1 = method756(method755("\u0015\u0004\f:\u007f7\u0004"));

      try {
         var1 = System.getProperty(method756(method755("*\u000b\u00115>6\u000f\u0015'y/\u0004"))).toLowerCase();
      } catch (Exception var10) {
      }

      var1.toLowerCase();
      String var2 = method756(method755("\u0015\u0004\f:\u007f7\u0004"));

      try {
         var2 = System.getProperty(method756(method755("/\u0019I:q-\u000f"))).toLowerCase();
      } catch (Exception var9) {
      }

      field990 = var2.toLowerCase();
      String var3 = method756(method755("\u0015\u0004\f:\u007f7\u0004"));

      try {
         var3 = System.getProperty(method756(method755("/\u0019I5b#\u0002"))).toLowerCase();
      } catch (Exception var8) {
      }

      field991 = var3.toLowerCase();
      String var4 = method756(method755("\u0015\u0004\f:\u007f7\u0004"));

      try {
         var4 = System.getProperty(method756(method755("/\u0019I\"u2\u0019\u000e;~"))).toLowerCase();
      } catch (Exception var7) {
      }

      var4.toLowerCase();
      String var5 = method756(method755(">E"));

      try {
         var5 = System.getProperty(method756(method755("5\u0019\u0002&>(\u0005\n1"))).toLowerCase();
      } catch (Exception var6) {
      }

      new File(var5);
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method755(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method756(char[] arg0) {
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
            var10005 = 106;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
