import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class382 extends class207 {
   @OriginalMember(
      owner = "client!uv",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5865 = new String[]{method2943(method2942("\u001b=7\u0007T")), method2943(method2942("\u000efuE")), method2943(method2942("\u0015e7h\u0001")), method2943(method2942("\u0015e7k\u0001")), method2943(method2942("\u0015e7j\u0001"))};
   @OriginalMember(
      owner = "client!uv",
      name = "s",
      descriptor = "Lum;"
   )
   public static class550 field5855 = new class550();
   @OriginalMember(
      owner = "client!uv",
      name = "r",
      descriptor = "I"
   )
   public static int field5857 = -1;
   @OriginalMember(
      owner = "client!uv",
      name = "t",
      descriptor = "[Lmba;"
   )
   public static class441[] field5856 = new class441[14];
   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field5859 = false;
   @OriginalMember(
      owner = "client!uv",
      name = "x",
      descriptor = "Lsda;"
   )
   public static class269 field5858 = new class269(53, 7);
   @OriginalMember(
      owner = "client!uv",
      name = "v",
      descriptor = "Lqo;"
   )
   public static class24 field5860 = new class24(method2943(method2942("\u0012fwLZ\u0003riL")), method2943(method2942("2fwLz\u0003riL")), 0);
   @OriginalMember(
      owner = "client!uv",
      name = "o",
      descriptor = "[Lml;"
   )
   public static class407[] field5863 = null;
   @OriginalMember(
      owner = "client!uv",
      name = "y",
      descriptor = "F"
   )
   public static float field5864;
   @OriginalMember(
      owner = "client!uv",
      name = "p",
      descriptor = "I"
   )
   public static int field5851;
   @OriginalMember(
      owner = "client!uv",
      name = "u",
      descriptor = "I"
   )
   public static int field5853;
   @OriginalMember(
      owner = "client!uv",
      name = "n",
      descriptor = "I"
   )
   private int field5854;
   @OriginalMember(
      owner = "client!uv",
      name = "w",
      descriptor = "I"
   )
   public static int field5862;
   @OriginalMember(
      owner = "client!uv",
      name = "q",
      descriptor = "Leaa;"
   )
   public static class526 field5861;
   @OriginalMember(
      owner = "client!uv",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   private String field5852;

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(Lfa;Z)V",
      line = 3
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         if (!arg1) {
            field5860 = null;
         }

         ++field5853;
         arg0.method1824(this.field5852, (byte)69, this.field5854);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5865[3] + (arg0 != null ? field5865[0] : field5865[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(Ljj;Z)V",
      line = 16
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         this.field5854 = arg0.method1041(4758);
         if (!arg1) {
            this.method793((class128)null, true);
         }

         ++field5851;
         this.field5852 = arg0.method1083((byte)77);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5865[2] + (arg0 != null ? field5865[0] : field5865[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(B)V",
      line = 33
   )
   public static void method2941(byte arg0) {
      try {
         field5855 = null;
         field5863 = null;
         field5858 = null;
         if (arg0 == -84) {
            field5861 = null;
            field5856 = null;
            field5860 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5865[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2942(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2943(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
