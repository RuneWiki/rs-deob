import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class219 {
   @OriginalMember(
      owner = "client!ik",
      name = "d",
      descriptor = "Lbba;"
   )
   private class124 field3307;
   @OriginalMember(
      owner = "client!ik",
      name = "c",
      descriptor = "J"
   )
   public long field3306;
   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3308 = new String[]{method1861(method1860("L>\u0001\u0011")), method1861(method1860("YeCS\u001c")), method1861(method1860("K CA\bL\"\u0019CI")), method1861(method1860("K C\u001b\bL*\u0001\u0014\u001bGc"))};
   @OriginalMember(
      owner = "client!ik",
      name = "b",
      descriptor = "I"
   )
   public static int field3304;
   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "I"
   )
   public static int field3305;

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Lbba;J[Lpaa;)V",
      line = 10
   )
   public class219(class124 arg0, long arg1, class648[] arg2) {
      try {
         this.field3307 = arg0;
         this.field3306 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3308[2] + (arg0 != null ? field3308[1] : field3308[0]) + ',' + arg1 + ',' + (arg2 != null ? field3308[1] : field3308[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "finalize",
      descriptor = "()V",
      line = 21
   )
   protected final void finalize() throws Throwable {
      try {
         ++field3305;
         this.field3307.method1196(34192, this.field3306);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3308[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1860(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1861(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
