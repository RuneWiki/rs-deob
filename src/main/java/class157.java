import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class157 {
   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2393 = new String[]{method1497(method1496("\u0012h-\tL")), method1497(method1496("\u0012h-\nL"))};
   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "I"
   )
   public static int field2390 = 0;
   @OriginalMember(
      owner = "client!oj",
      name = "e",
      descriptor = "I"
   )
   public static int field2391 = 0;
   @OriginalMember(
      owner = "client!oj",
      name = "c",
      descriptor = "I"
   )
   public static int field2389;
   @OriginalMember(
      owner = "client!oj",
      name = "b",
      descriptor = "[Lma;"
   )
   public static class148[] field2388;
   @OriginalMember(
      owner = "client!oj",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field2392;

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method1494(boolean arg0) {
      try {
         if (arg0) {
            return -9;
         } else {
            ++field2389;
            return class679.field9837;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2393[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1495(int arg0) {
      try {
         field2388 = null;
         field2392 = null;
         if (arg0 <= 114) {
            method1495(106);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2393[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1496(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1497(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
