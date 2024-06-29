import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class361 {
   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4926 = method2707(method2706("mFGm\u0012"));
   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "[C"
   )
   public static char[] field4923 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "I"
   )
   public static int field4922 = 0;
   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "I"
   )
   public static int field4925 = 0;
   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "Lkf;"
   )
   public static class266 field4924;

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static void method2705(byte arg0) {
      try {
         if (arg0 <= 28) {
            method2705((byte)40);
         }

         field4924 = null;
         field4923 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4926 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(I[B)V"
   )
   public abstract void method2311(int arg0, byte[] arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IBI)[B"
   )
   public abstract byte[] method2312(int arg0, byte arg1, int arg2);

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(B)[B"
   )
   public abstract byte[] method2310(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2706(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2707(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
