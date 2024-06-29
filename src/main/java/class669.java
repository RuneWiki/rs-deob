import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class669 extends class673 {
   @OriginalMember(
      owner = "client!gka",
      name = "l",
      descriptor = "I"
   )
   public volatile int field9915 = -1;
   @OriginalMember(
      owner = "client!gka",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   public volatile String field9916;
   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9917 = new String[]{method4884(method4883("\u0000Fg9")), method4884(method4883("\u0015\u001d%{x")), method4884(method4883("\tXj{9\u0007]b!;F")), method4884(method4883("\tXj{DF"))};
   @OriginalMember(
      owner = "client!gka",
      name = "o",
      descriptor = "I"
   )
   public static int field9914 = 0;
   @OriginalMember(
      owner = "client!gka",
      name = "m",
      descriptor = "I"
   )
   public static int field9913;

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4882(int arg0, int arg1, int arg2) {
      try {
         int var3 = 120 % ((arg0 - -34) / 62);
         ++field9913;
         return ~(arg2 & 65536) != -1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9917[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class669(String arg0) {
      try {
         this.field9916 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9917[2] + (arg0 != null ? field9917[1] : field9917[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4883(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4884(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
