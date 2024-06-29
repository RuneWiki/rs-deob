import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class339 extends class555 {
   @OriginalMember(
      owner = "client!uea",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5188 = new String[]{method2758(method2757("\u000e7\u0007\t&S")), method2758(method2757("\u000e7\u0007\t'S")), method2758(method2757("\u000e7\u0007\t$S"))};
   @OriginalMember(
      owner = "client!uea",
      name = "H",
      descriptor = "Ltv;"
   )
   public static class311 field5183 = new class311(method2758(method2757("\u001c3\u000bBV")), method2758(method2757("<3\u000bBEH")), 2);
   @OriginalMember(
      owner = "client!uea",
      name = "D",
      descriptor = "I"
   )
   public static int field5182;
   @OriginalMember(
      owner = "client!uea",
      name = "C",
      descriptor = "I"
   )
   public static int field5185;
   @OriginalMember(
      owner = "client!uea",
      name = "G",
      descriptor = "I"
   )
   public int field5186;
   @OriginalMember(
      owner = "client!uea",
      name = "E",
      descriptor = "Llt;"
   )
   public class11 field5184;
   @OriginalMember(
      owner = "client!uea",
      name = "F",
      descriptor = "[B"
   )
   public byte[] field5187;

   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method2754(boolean arg0) {
      try {
         ++field5185;
         if (!arg0) {
            field5183 = null;
         }

         return super.field8287 ? 0 : 100;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5188[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(Z)[B"
   )
   public final byte[] method2755(boolean arg0) {
      try {
         if (!arg0) {
            field5183 = null;
         }

         ++field5182;
         if (super.field8287) {
            throw new RuntimeException();
         } else {
            return this.field5187;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5188[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method2756(int arg0) {
      try {
         if (arg0 >= -76) {
            field5183 = null;
         }

         field5183 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5188[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2757(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2758(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
