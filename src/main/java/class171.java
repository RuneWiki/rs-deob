import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class171 extends class673 {
   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2228 = method1479(method1478("b\u0005g\u007f"));
   @OriginalMember(
      owner = "client!q",
      name = "n",
      descriptor = "Lse;"
   )
   public static class6 field2223 = new class6(1, -1);
   @OriginalMember(
      owner = "client!q",
      name = "o",
      descriptor = "[Ldk;"
   )
   public static class715[] field2225 = new class715[75];
   @OriginalMember(
      owner = "client!q",
      name = "m",
      descriptor = "I"
   )
   public static int field2227 = -1;
   @OriginalMember(
      owner = "client!q",
      name = "p",
      descriptor = "Lse;"
   )
   public static class6 field2226 = new class6(31, 4);
   @OriginalMember(
      owner = "client!q",
      name = "l",
      descriptor = "Lgj;"
   )
   public static class736 field2224;

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(Lfu;I)V"
   )
   public abstract void method1106(class80 arg0, int arg1);

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1477(int arg0) {
      try {
         if (arg0 != 2232) {
            field2223 = null;
         }

         field2223 = null;
         field2225 = null;
         field2226 = null;
         field2224 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2228 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(Lgea;B)V"
   )
   public abstract void method1104(class66 arg0, byte arg1);

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1478(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1479(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
