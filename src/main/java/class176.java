import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class176 {
   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2276 = new String[]{method1508(method1507("'Qop\u0012")), method1508(method1507("'U-]")), method1508(method1507("$S")), method1508(method1507("2\u000eo\u001fG")), method1508(method1507("'Qor\u0012")), method1508(method1507("'Qos\u0012"))};
   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "I"
   )
   public static int field2273 = 500;
   @OriginalMember(
      owner = "client!nq",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field2271 = new class418(40, 8);
   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "Lse;"
   )
   public static class6 field2275 = new class6(30, -1);
   @OriginalMember(
      owner = "client!nq",
      name = "d",
      descriptor = "I"
   )
   public static int field2270;
   @OriginalMember(
      owner = "client!nq",
      name = "e",
      descriptor = "I"
   )
   public static int field2272;
   @OriginalMember(
      owner = "client!nq",
      name = "f",
      descriptor = "Lst;"
   )
   public static class706 field2274;

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1504(int arg0) {
      try {
         int var1 = 18 % ((64 - arg0) / 54);
         field2274 = null;
         field2275 = null;
         field2271 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2276[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1505(int arg0) {
      try {
         ++field2272;
         if (class783.field11426 == null) {
            class54 var1 = new class54();
            byte[] var2 = var1.method523(arg0 ^ -6744, 16, 128, 128);
            class783.field11426 = method1506(var2, false, -69);
         }

         if (arg0 != -1) {
            field2274 = null;
         }

         if (class381.field5298 == null) {
            class425 var3 = new class425();
            byte[] var4 = var3.method3296(128, 16, (byte)4, 128);
            class381.field5298 = method1506(var4, false, -25);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2276[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "([BZI)Ljava/lang/Object;"
   )
   public static final Object method1506(byte[] arg0, boolean arg1, int arg2) {
      try {
         ++field2270;
         if (arg0 == null) {
            return null;
         } else if (arg2 >= -7) {
            return null;
         } else {
            if (~arg0.length < -137 && !class282.field3916) {
               try {
                  class413 var3 = (class413)Class.forName(field2276[2]).newInstance();
                  var3.method528(109, arg0);
                  return var3;
               } catch (Throwable var5) {
                  class282.field3916 = true;
               }
            }

            return arg1 ? class154.method1308(0, arg0) : arg0;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2276[0] + (arg0 != null ? field2276[3] : field2276[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1508(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
