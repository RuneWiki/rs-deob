import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class182 {
   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2254 = new String[]{method1398(method1397("T\u0001\f5C\u001f")), method1398(method1397("T\u0001\f5A\u001f")), method1398(method1397("T\u0001\f5@\u001f"))};
   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field2251 = false;
   @OriginalMember(
      owner = "client!cda",
      name = "c",
      descriptor = "[Lnaa;"
   )
   public static class78[] field2252 = new class78[0];
   @OriginalMember(
      owner = "client!cda",
      name = "e",
      descriptor = "I"
   )
   public static int field2246;
   @OriginalMember(
      owner = "client!cda",
      name = "g",
      descriptor = "I"
   )
   public static int field2247;
   @OriginalMember(
      owner = "client!cda",
      name = "b",
      descriptor = "I"
   )
   public static int field2249;
   @OriginalMember(
      owner = "client!cda",
      name = "f",
      descriptor = "I"
   )
   public static int field2250;
   @OriginalMember(
      owner = "client!cda",
      name = "h",
      descriptor = "I"
   )
   public static int field2253;
   @OriginalMember(
      owner = "client!cda",
      name = "d",
      descriptor = "[J"
   )
   public static long[] field2248;

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1394(int arg0, int arg1) {
      try {
         ++field2250;
         class446 var2 = class635.method4607(124, (long)arg1, arg0);
         var2.method3312(-117);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2254[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1395(int arg0) {
      try {
         field2252 = null;
         field2248 = null;
         if (arg0 > -21) {
            field2246 = -91;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2254[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1396(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -1) {
            method1394(-77, -27);
         }

         ++field2253;
         return ~(arg1 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2254[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1397(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1398(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
