import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class770 {
   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11095 = new String[]{method5515(method5514("9\n@?\u0004`")), method5515(method5514("9\n@<\u0004`"))};
   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "J"
   )
   public static long field11093 = 20000000L;
   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "I"
   )
   public static int field11091;
   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "Lefa;"
   )
   public static class195 field11094;
   @OriginalMember(
      owner = "client!ql",
      name = "c",
      descriptor = "Lql;"
   )
   public class770 field11090;
   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "Lql;"
   )
   public class770 field11092;

   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method5512(byte arg0) {
      try {
         int var2 = 51 % ((arg0 - -39) / 57);
         ++field11091;
         if (this.field11090 != null) {
            this.field11090.field11092 = this.field11092;
            this.field11092.field11090 = this.field11090;
            this.field11092 = null;
            this.field11090 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11095[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method5513(byte arg0) {
      try {
         field11094 = null;
         if (arg0 <= 85) {
            field11094 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11095[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5514(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5515(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
