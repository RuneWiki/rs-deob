import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class715 {
   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10408 = new String[]{method5191(method5190("\u000edM[o")), method5191(method5190("\u001b?\u000f\u0019")), method5191(method5190("\u0003\"\u0002[S]")), method5191(method5190("\u001b(\u0002"))};
   @OriginalMember(
      owner = "client!vha",
      name = "d",
      descriptor = "I"
   )
   public static int field10401 = 0;
   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "I"
   )
   public static int field10406 = -1;
   @OriginalMember(
      owner = "client!vha",
      name = "e",
      descriptor = "I"
   )
   public static int field10402;
   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "I"
   )
   public int field10403;
   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "I"
   )
   public int field10404;
   @OriginalMember(
      owner = "client!vha",
      name = "f",
      descriptor = "I"
   )
   public int field10405;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!vha",
      name = "g",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10407;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method5189(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z",
      line = 4
   )
   public static final boolean method5188(int arg0, String arg1) {
      try {
         ++field10402;
         if (arg0 != -19503) {
            method5188(29, (String)null);
         }

         return class740.method5366(arg1, arg0 + 3786, field10407 != null ? field10407 : (field10407 = method5189(field10408[3])));
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10408[2] + arg0 + ',' + (arg1 != null ? field10408[0] : field10408[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5190(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5191(char[] arg0) {
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
            var10005 = 74;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
