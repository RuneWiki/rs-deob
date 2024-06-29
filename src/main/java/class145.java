import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class145 {
   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1828 = new String[]{method1206(method1205("0(z\f")), method1206(method1205(");8\"\u0018")), method1206(method1205("%s8NM")), method1206(method1205(");8!\u0018"))};
   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "I"
   )
   public static int field1825;
   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "I"
   )
   public static int field1826;
   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "I"
   )
   public static int field1827;

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(BLeaa;I)Lpg;"
   )
   public static final class763 method1203(byte arg0, class526 arg1, int arg2) {
      try {
         ++field1827;
         byte[] var3 = arg1.method3888((byte)40, arg2);
         if (var3 == null) {
            return null;
         } else {
            if (arg0 != 79) {
               field1826 = 127;
            }

            return new class763(var3);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1828[1] + arg0 + ',' + (arg1 != null ? field1828[2] : field1828[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method1204(byte arg0) {
      try {
         ++field1825;
         if (arg0 >= -105) {
            method1203((byte)3, (class526)null, -72);
         }

         class748 var1 = class402.field6170;
         synchronized(class402.field6170) {
            return class402.field6170.method5446(true);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1828[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1205(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1206(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
