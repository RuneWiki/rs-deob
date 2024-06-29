import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class342 {
   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4859 = new String[]{method2643(method2642("\u001a\u0006\u0000\t")), method2643(method2642("\u000f]BKl")), method2643(method2642("\u0002\u0005B'9")), method2643(method2642("\u0002\u0005B$9"))};
   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "I"
   )
   public static int field4855 = 0;
   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field4857 = new int[2048];
   @OriginalMember(
      owner = "client!vv",
      name = "d",
      descriptor = "I"
   )
   public static int field4856;
   @OriginalMember(
      owner = "client!vv",
      name = "c",
      descriptor = "Loo;"
   )
   public static class651 field4858;

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(B)V",
      line = 8
   )
   public static void method2640(byte arg0) {
      try {
         field4857 = null;
         field4858 = null;
         if (arg0 < 34) {
            method2641((String)null, -95);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4859[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      line = 19
   )
   public static final String method2641(String param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
