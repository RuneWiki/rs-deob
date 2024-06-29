import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class217 {
   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2741 = new String[]{method1643(method1642("\u00068k\u001b\u001b\\")), method1643(method1642("\u001a(fY")), method1643(method1642("\u000fs$\u001b$")), method1643(method1642("\u00068k\u001b\u0018\\"))};
   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2740 = new int[25];
   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "I"
   )
   public static int field2739;

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(Lai;BZZ)V",
      line = 8
   )
   public static final void method1640(class624 param0, byte param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(I)V",
      line = 67
   )
   public static void method1641(int arg0) {
      try {
         field2740 = null;
         int var1 = 86 / ((86 - arg0) / 38);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2741[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1643(char[] arg0) {
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
            var10005 = 93;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
