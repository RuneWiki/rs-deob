import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class344 {
   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4726 = method2730(method2729("Y\u0003\u001d\u0000Q\u0007"));
   @OriginalMember(
      owner = "client!vja",
      name = "c",
      descriptor = "I"
   )
   public static int field4715 = 50;
   @OriginalMember(
      owner = "client!vja",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field4717 = new int[field4715];
   @OriginalMember(
      owner = "client!vja",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4720 = new int[field4715];
   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field4721 = new int[field4715];
   @OriginalMember(
      owner = "client!vja",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field4722 = new int[field4715];
   @OriginalMember(
      owner = "client!vja",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field4719 = new int[field4715];
   @OriginalMember(
      owner = "client!vja",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field4716 = new int[field4715];
   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4723 = new String[field4715];
   @OriginalMember(
      owner = "client!vja",
      name = "h",
      descriptor = "Lse;"
   )
   public static class6 field4718 = new class6(87, 6);
   @OriginalMember(
      owner = "client!vja",
      name = "j",
      descriptor = "I"
   )
   public static int field4724 = 0;
   @OriginalMember(
      owner = "client!vja",
      name = "d",
      descriptor = "I"
   )
   public static int field4725 = 0;

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2728(int arg0) {
      try {
         field4723 = null;
         field4721 = null;
         field4716 = null;
         field4719 = null;
         field4718 = null;
         if (arg0 >= 109) {
            field4722 = null;
            field4720 = null;
            field4717 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4726 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2729(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2730(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
