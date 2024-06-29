import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class320 {
   @OriginalMember(
      owner = "client!ca",
      name = "h",
      descriptor = "I"
   )
   public int field4608;
   @OriginalMember(
      owner = "client!ca",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field4617;
   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4620 = new String[]{method2500(method2499("\u0007-4Qu78hLt\u0003d")), method2500(method2499("\u0007-4\u0019s\n%n\u001b2")), method2500(method2499("\u001fb4\u000bg")), method2500(method2499("\n9vI")), method2500(method2499("\u0007-4d2")), method2500(method2499("\u0007-4g2"))};
   @OriginalMember(
      owner = "client!ca",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field4609 = new int[3];
   @OriginalMember(
      owner = "client!ca",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field4616 = true;
   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "Lgh;"
   )
   public static class572 field4614 = new class572(46, 6);
   @OriginalMember(
      owner = "client!ca",
      name = "g",
      descriptor = "[J"
   )
   public static long[] field4619 = new long[100];
   @OriginalMember(
      owner = "client!ca",
      name = "f",
      descriptor = "I"
   )
   public static int field4610;
   @OriginalMember(
      owner = "client!ca",
      name = "d",
      descriptor = "I"
   )
   public static int field4611;
   @OriginalMember(
      owner = "client!ca",
      name = "c",
      descriptor = "I"
   )
   public static int field4612;
   @OriginalMember(
      owner = "client!ca",
      name = "e",
      descriptor = "I"
   )
   public static int field4615;
   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4613;
   @OriginalMember(
      owner = "client!ca",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field4618;

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(B)V",
      line = 10
   )
   public static final void method2497(byte arg0) {
      try {
         ++field4612;
         class179 var1 = class774.field11334;
         synchronized(class774.field11334) {
            class774.field11334.method1591((byte)58);
         }

         if (arg0 != 74) {
            field4615 = -11;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4620[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 25
   )
   public final String toString() {
      try {
         ++field4610;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4620[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(I)V",
      line = 36
   )
   public static void method2498(int arg0) {
      try {
         field4618 = null;
         field4609 = null;
         field4614 = null;
         if (arg0 != 46) {
            field4614 = null;
         }

         field4613 = null;
         field4619 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4620[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      line = 58
   )
   public class320(String arg0, String arg1, int arg2) {
      try {
         this.field4608 = arg2;
         this.field4617 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4620[1] + (arg0 != null ? field4620[2] : field4620[3]) + ',' + (arg1 != null ? field4620[2] : field4620[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2499(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2500(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
