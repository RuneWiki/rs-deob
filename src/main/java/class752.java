import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class752 {
   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10925 = new String[]{method5431(method5430("\"x\u001f2V")), method5431(method5430("\"x\u001f1V"))};
   @OriginalMember(
      owner = "client!jn",
      name = "b",
      descriptor = "I"
   )
   public static int field10920;
   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "I"
   )
   public static int field10921;
   @OriginalMember(
      owner = "client!jn",
      name = "c",
      descriptor = "Ltha;"
   )
   public static class309 field10924;
   @OriginalMember(
      owner = "client!jn",
      name = "f",
      descriptor = "Lbt;"
   )
   public class47 field10922;
   @OriginalMember(
      owner = "client!jn",
      name = "e",
      descriptor = "Ljn;"
   )
   public class752 field10923;
   @OriginalMember(
      owner = "client!jn",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field10919;

   @OriginalMember(
      owner = "client!jn",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5428(int arg0) {
      try {
         ++field10920;
         if (class12.field138 < arg0) {
            this.field10922 = null;
            this.field10923 = class565.field7712;
            class565.field7712 = this;
            ++class12.field138;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10925[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5429(int arg0) {
      try {
         field10924 = null;
         field10919 = null;
         if (arg0 != 2560) {
            field10919 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10925[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5430(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5431(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
