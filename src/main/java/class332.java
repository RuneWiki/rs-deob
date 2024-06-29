import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class332 {
   @OriginalMember(
      owner = "client!uba",
      name = "b",
      descriptor = "I"
   )
   public int field4574 = -1;
   @OriginalMember(
      owner = "client!uba",
      name = "k",
      descriptor = "I"
   )
   public int field4576 = -1;
   @OriginalMember(
      owner = "client!uba",
      name = "c",
      descriptor = "I"
   )
   public int field4577 = -1;
   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4587 = method2632(method2631("m8<1y0"));
   @OriginalMember(
      owner = "client!uba",
      name = "f",
      descriptor = "Laka;"
   )
   public static class418 field4582 = new class418(122, -2);
   @OriginalMember(
      owner = "client!uba",
      name = "g",
      descriptor = "[Ldda;"
   )
   public static class411[] field4584 = new class411[1024];
   @OriginalMember(
      owner = "client!uba",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field4585 = new int[1];
   @OriginalMember(
      owner = "client!uba",
      name = "d",
      descriptor = "I"
   )
   public int field4575;
   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "I"
   )
   public int field4578;
   @OriginalMember(
      owner = "client!uba",
      name = "m",
      descriptor = "I"
   )
   public int field4579;
   @OriginalMember(
      owner = "client!uba",
      name = "e",
      descriptor = "I"
   )
   public int field4580;
   @OriginalMember(
      owner = "client!uba",
      name = "j",
      descriptor = "I"
   )
   public int field4581;
   @OriginalMember(
      owner = "client!uba",
      name = "i",
      descriptor = "I"
   )
   public int field4583;
   @OriginalMember(
      owner = "client!uba",
      name = "h",
      descriptor = "[Lpd;"
   )
   public static class648[] field4586;

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2630(int arg0) {
      try {
         field4582 = null;
         if (arg0 < 89) {
            field4585 = null;
         }

         field4584 = null;
         field4585 = null;
         field4586 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4587 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "<init>",
      descriptor = "(Lkw;)V"
   )
   public class332(class9 arg0) {
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2631(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2632(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
