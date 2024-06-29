import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class399 extends class347 {
   @OriginalMember(
      owner = "client!oj",
      name = "k",
      descriptor = "I"
   )
   public volatile int field6133 = -1;
   @OriginalMember(
      owner = "client!oj",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public volatile String field6135;
   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6138 = new String[]{method3067(method3066("-1\u0013]Z")), method3067(method3066("-1\u0013\\Z")), method3067(method3066(",.Qs")), method3067(method3066("-1\u0013#\u001b,2I!Z")), method3067(method3066("9u\u00131\u000f")), method3067(method3066("-1\u0013^Z"))};
   @OriginalMember(
      owner = "client!oj",
      name = "i",
      descriptor = "I"
   )
   public static int field6134;
   @OriginalMember(
      owner = "client!oj",
      name = "j",
      descriptor = "I"
   )
   public static int field6137;
   @OriginalMember(
      owner = "client!oj",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6136;

   @OriginalMember(
      owner = "client!oj",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method3063(int arg0, int arg1, int arg2) {
      try {
         ++field6134;
         int var3 = arg1 * 57 + arg2;
         int var4 = var3 << 13 ^ var3;
         int var5 = (var4 * var4 * 15731 + arg0) * var4 + 1376312589 & Integer.MAX_VALUE;
         return (var5 & 134068954) >> 19;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6138[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class399(String arg0) {
      try {
         this.field6135 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6138[3] + (arg0 != null ? field6138[4] : field6138[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3064(boolean arg0) {
      try {
         if (!arg0) {
            field6136 = null;
         }

         ++field6137;
         class434.field6616.method5445(697465426);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6138[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3065(int arg0) {
      try {
         field6136 = null;
         if (arg0 != -49706893) {
            field6136 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6138[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3066(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3067(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
