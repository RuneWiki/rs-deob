import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class72 {
   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field958 = new String[]{method707(method706("(l@8z")), method707(method706("(l@;z"))};
   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field956 = new class6(33, 8);
   @OriginalMember(
      owner = "client!kc",
      name = "c",
      descriptor = "I"
   )
   public static int field955;
   @OriginalMember(
      owner = "client!kc",
      name = "b",
      descriptor = "Lit;"
   )
   public static class769 field957;

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method704(byte arg0) {
      try {
         int var1 = 127 / ((2 - arg0) / 62);
         field956 = null;
         field957 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field958[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method705(int arg0, boolean arg1) {
      try {
         ++field955;
         if (!arg1) {
            class487 var2 = class2.method12((long)arg0, 8, (byte)43);
            var2.method3696(-11118);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field958[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method706(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method707(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
