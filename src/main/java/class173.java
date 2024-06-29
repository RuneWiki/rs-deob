import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class173 extends class247 {
   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2590 = new String[]{method1604(method1603("~-m\u000741")), method1604(method1603("~-m\u000771"))};
   @OriginalMember(
      owner = "client!gia",
      name = "j",
      descriptor = "I"
   )
   public int field2580;
   @OriginalMember(
      owner = "client!gia",
      name = "s",
      descriptor = "I"
   )
   public static int field2581;
   @OriginalMember(
      owner = "client!gia",
      name = "q",
      descriptor = "I"
   )
   public int field2589;
   @OriginalMember(
      owner = "client!gia",
      name = "p",
      descriptor = "[I"
   )
   public int[] field2583;
   @OriginalMember(
      owner = "client!gia",
      name = "r",
      descriptor = "[I"
   )
   public int[] field2585;
   @OriginalMember(
      owner = "client!gia",
      name = "l",
      descriptor = "[I"
   )
   public int[] field2588;
   @OriginalMember(
      owner = "client!gia",
      name = "n",
      descriptor = "[Ljga;"
   )
   public static class91[] field2582;
   @OriginalMember(
      owner = "client!gia",
      name = "k",
      descriptor = "[Ldu;"
   )
   public class92[] field2586;
   @OriginalMember(
      owner = "client!gia",
      name = "o",
      descriptor = "[Ldu;"
   )
   public class92[] field2587;
   @OriginalMember(
      owner = "client!gia",
      name = "m",
      descriptor = "[[[B"
   )
   public byte[][][] field2584;

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1601(int arg0) {
      try {
         int var1 = 102 / ((arg0 - 77) / 47);
         field2582 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2590[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1602(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2581;
         class11.field186 = arg2;
         class160.field2450 = arg0;
         class737.field10514 = arg1;
         class222.field3160 = arg4;
         if (arg3 >= -77) {
            method1602(-7, 24, -88, -23, -48);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2590[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1603(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1604(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
