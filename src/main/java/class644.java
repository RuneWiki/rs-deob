import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class644 extends class673 {
   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9666 = new String[]{method4746(method4745("a;<e\u0019")), method4746(method4745("a;<d\u0019"))};
   @OriginalMember(
      owner = "client!fc",
      name = "n",
      descriptor = "Ll;"
   )
   public static class292 field9662 = new class292("", 11);
   @OriginalMember(
      owner = "client!fc",
      name = "r",
      descriptor = "Lcba;"
   )
   public static class95 field9663 = new class95();
   @OriginalMember(
      owner = "client!fc",
      name = "m",
      descriptor = "Laka;"
   )
   public static class418 field9664 = new class418(97, 6);
   @OriginalMember(
      owner = "client!fc",
      name = "l",
      descriptor = "Laka;"
   )
   public static class418 field9665 = new class418(59, 3);
   @OriginalMember(
      owner = "client!fc",
      name = "q",
      descriptor = "I"
   )
   public static int field9660;
   @OriginalMember(
      owner = "client!fc",
      name = "p",
      descriptor = "Lwc;"
   )
   public static class394 field9661;
   @OriginalMember(
      owner = "client!fc",
      name = "o",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9659;

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4743(int arg0) {
      try {
         field9661 = null;
         field9662 = null;
         if (arg0 == 6) {
            field9663 = null;
            field9664 = null;
            field9665 = null;
            field9659 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9666[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4744(int arg0) {
      try {
         if (class623.field9218 != 0) {
            class223.field2792.method4422((byte)-49);
            class553.method4183(22744);
            class368.method2907((byte)-55);
         }

         if (arg0 == 11) {
            ++field9660;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9666[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public abstract void method111(int arg0, class66 arg1);

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public abstract void method114(int arg0, class790 arg1);

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4745(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4746(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
