import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class475 implements class251 {
   @OriginalMember(
      owner = "client!qd",
      name = "c",
      descriptor = "I"
   )
   public int field6831;
   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6837 = new String[]{method3459(method3458("}\u0016\u0014xLb\u001bNz\r")), method3459(method3458("b\u0007V(")), method3459(method3458("w\\\u0014jX")), method3459(method3458("}\u0016\u00140J_\u0006H-KkZ")), method3459(method3458("}\u0016\u0014\u0005\r"))};
   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "Leg;"
   )
   public static class118 field6832 = new class118(120, 0);
   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "I"
   )
   public static int field6836 = 0;
   @OriginalMember(
      owner = "client!qd",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field6834 = new class536(55, 2);
   @OriginalMember(
      owner = "client!qd",
      name = "f",
      descriptor = "D"
   )
   public static double field6833;
   @OriginalMember(
      owner = "client!qd",
      name = "e",
      descriptor = "I"
   )
   public static int field6835;

   @OriginalMember(
      owner = "client!qd",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6835;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6837[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3457(byte arg0) {
      try {
         field6834 = null;
         field6832 = null;
         if (arg0 < 124) {
            method3457((byte)-119);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6837[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class475(String arg0, int arg1) {
      try {
         this.field6831 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6837[0] + (arg0 != null ? field6837[2] : field6837[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3458(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3459(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
