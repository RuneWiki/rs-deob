import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class339 {
   @OriginalMember(
      owner = "client!en",
      name = "c",
      descriptor = "I"
   )
   public int field4613 = -1;
   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4617 = method2495(method2494("\u0014\u001e\u001d&*"));
   @OriginalMember(
      owner = "client!en",
      name = "e",
      descriptor = "[[I"
   )
   public static int[][] field4616 = new int[][]{{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
   @OriginalMember(
      owner = "client!en",
      name = "f",
      descriptor = "I"
   )
   public int field4607;
   @OriginalMember(
      owner = "client!en",
      name = "j",
      descriptor = "I"
   )
   public int field4608;
   @OriginalMember(
      owner = "client!en",
      name = "d",
      descriptor = "I"
   )
   public int field4609;
   @OriginalMember(
      owner = "client!en",
      name = "g",
      descriptor = "I"
   )
   public int field4610;
   @OriginalMember(
      owner = "client!en",
      name = "b",
      descriptor = "I"
   )
   public int field4611;
   @OriginalMember(
      owner = "client!en",
      name = "h",
      descriptor = "I"
   )
   public int field4612;
   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "I"
   )
   public int field4614;
   @OriginalMember(
      owner = "client!en",
      name = "i",
      descriptor = "I"
   )
   public int field4615;

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2493(byte arg0) {
      try {
         int var1 = 91 % ((arg0 - 30) / 43);
         field4616 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4617 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2494(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2495(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
