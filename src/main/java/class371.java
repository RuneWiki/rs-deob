import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class371 {
   @OriginalMember(
      owner = "client!ak",
      name = "d",
      descriptor = "I"
   )
   public int field5392;
   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5393 = new String[]{method2835(method2834("e!Pvbj#\nt#")), method2835(method2834("e!P>dW>\f#ecb")), method2835(method2834("e!P\u000b#")), method2835(method2834("e!P\b#"))};
   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "I"
   )
   public static int field5389;
   @OriginalMember(
      owner = "client!ak",
      name = "c",
      descriptor = "I"
   )
   public static int field5390;
   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "I"
   )
   public static int field5391;
   @OriginalMember(
      owner = "client!ak",
      name = "e",
      descriptor = "[[B"
   )
   public static byte[][] field5388;

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2832(int arg0) {
      try {
         field5388 = null;
         if (arg0 != 95) {
            field5388 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5393[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method2833(int arg0, char arg1) {
      try {
         ++field5391;
         if (arg0 > -9) {
            method2832(120);
         }

         return ~arg1 == -161 || arg1 == ' ' || arg1 == '_' || ~arg1 == -46;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5393[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5390;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5393[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class371(int arg0) {
      try {
         this.field5392 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5393[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
