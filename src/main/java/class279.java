import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class279 extends class247 {
   @OriginalMember(
      owner = "client!rq",
      name = "k",
      descriptor = "Lsb;"
   )
   public class261 field4227 = new class261();
   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4233 = new String[]{method2347(method2346("qbv\u00057")), method2347(method2346("qbv\u00067"))};
   @OriginalMember(
      owner = "client!rq",
      name = "o",
      descriptor = "I"
   )
   public static int field4229 = 0;
   @OriginalMember(
      owner = "client!rq",
      name = "n",
      descriptor = "I"
   )
   public static int field4232 = 0;
   @OriginalMember(
      owner = "client!rq",
      name = "j",
      descriptor = "I"
   )
   public static int field4228;
   @OriginalMember(
      owner = "client!rq",
      name = "m",
      descriptor = "I"
   )
   public static int field4230;
   @OriginalMember(
      owner = "client!rq",
      name = "p",
      descriptor = "I"
   )
   public static int field4231;
   @OriginalMember(
      owner = "client!rq",
      name = "l",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field4226;

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2344(int arg0) {
      try {
         field4226 = null;
         if (arg0 != 0) {
            method2345(-7, 1, -94);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4233[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2345(int arg0, int arg1, int arg2) {
      try {
         ++field4231;
         if (!((arg2 & 65536) != arg1 | class512.method3859(arg2, arg1 + 544, arg0)) && !class479.method3665(63, arg2, arg0)) {
            return (55 & arg0) == 0 && class266.method2276(arg2, arg0, 119);
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4233[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2346(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2347(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
