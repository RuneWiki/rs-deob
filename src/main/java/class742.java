import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class742 {
   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11034 = new String[]{method5449(method5448("}\u0012k]C")), method5449(method5448("}\u0012kh\u0004]\u00017u\u0005i]"))};
   @OriginalMember(
      owner = "client!sg",
      name = "e",
      descriptor = "I"
   )
   public static int field11029 = 0;
   @OriginalMember(
      owner = "client!sg",
      name = "d",
      descriptor = "I"
   )
   public static int field11030 = 0;
   @OriginalMember(
      owner = "client!sg",
      name = "b",
      descriptor = "F"
   )
   public static float field11028;
   @OriginalMember(
      owner = "client!sg",
      name = "c",
      descriptor = "I"
   )
   public static int field11032;
   @OriginalMember(
      owner = "client!sg",
      name = "f",
      descriptor = "I"
   )
   public static int field11033;
   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "Lrr;"
   )
   public static class678 field11031;

   @OriginalMember(
      owner = "client!sg",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 10
   )
   public final String toString() {
      try {
         ++field11033;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11034[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(I)V",
      line = 31
   )
   public static void method5447(int arg0) {
      try {
         if (arg0 != -9946) {
            method5447(122);
         }

         field11031 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11034[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5448(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5449(char[] arg0) {
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
            var10005 = 117;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
