import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class207 {
   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3091 = new String[]{method1769(method1768("\u001bf,T")), method1769(method1768("\u000e=n\u0016L")), method1769(method1768("\u0005xny\u0019")), method1769(method1768("\u0005xn{\u0019")), method1769(method1768("\u0005xnz\u0019"))};
   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "I"
   )
   public static int field3089 = 1409;
   @OriginalMember(
      owner = "client!pk",
      name = "d",
      descriptor = "Lqi;"
   )
   public static class591 field3087 = new class591(1);
   @OriginalMember(
      owner = "client!pk",
      name = "e",
      descriptor = "I"
   )
   public static int field3085;
   @OriginalMember(
      owner = "client!pk",
      name = "f",
      descriptor = "I"
   )
   public static int field3086;
   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "I"
   )
   public static int field3088;
   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "[Ltd;"
   )
   public static class476[] field3090;

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(ILdd;)V"
   )
   public static final void method1765(int arg0, class731 arg1) {
      try {
         arg1.field10510 = null;
         ++field3086;
         if (~class381.field5640 > -21) {
            class631.field9204.method1398(true, arg1);
            ++class381.field5640;
         }

         int var2 = 17 / ((52 - arg0) / 58);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3091[2] + arg0 + ',' + (arg1 != null ? field3091[1] : field3091[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1766(boolean arg0) {
      try {
         if (!arg0) {
            field3087 = null;
            field3090 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3091[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Z)Lpq;"
   )
   public static final class203 method1767(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field3088;
            class375.field5575 = 0;
            return class191.method1662((byte)88);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3091[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1768(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1769(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
