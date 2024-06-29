import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class95 {
   @OriginalMember(
      owner = "client!tn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1230 = new String[]{method817(method816("\"j-&b\u0005pq;c1,")), method817(method816("\"j-\u0013%"))};
   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "I"
   )
   public static int field1226 = 0;
   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field1227 = false;
   @OriginalMember(
      owner = "client!tn",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field1228 = new int[128][128];
   @OriginalMember(
      owner = "client!tn",
      name = "c",
      descriptor = "I"
   )
   public static int field1229;

   @OriginalMember(
      owner = "client!tn",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1229;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1230[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method815(int arg0) {
      try {
         field1228 = null;
         if (arg0 >= -44) {
            method815(-57);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1230[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method816(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method817(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
