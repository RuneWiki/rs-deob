import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 extends class756 {
   @OriginalMember(
      owner = "client!bu",
      name = "p",
      descriptor = "I"
   )
   public int field228 = -1;
   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field231 = new String[]{method146(method145("M,\u0004{\u0015")), method146(method145("M,\u0004t\u0015")), method146(method145("A,F_")), method146(method145("Tw\u0004\u001d@"))};
   @OriginalMember(
      owner = "client!bu",
      name = "o",
      descriptor = "I"
   )
   public static int field225;
   @OriginalMember(
      owner = "client!bu",
      name = "l",
      descriptor = "I"
   )
   public int field227;
   @OriginalMember(
      owner = "client!bu",
      name = "n",
      descriptor = "I"
   )
   public static int field230;
   @OriginalMember(
      owner = "client!bu",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field226;
   @OriginalMember(
      owner = "client!bu",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field229;

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(ILck;ILjava/lang/String;)Lmv;"
   )
   public static final class393 method143(int arg0, class667 arg1, int arg2, String arg3) {
      try {
         ++field225;
         int var4 = OpenGL.glGenProgramARB();
         OpenGL.glBindProgramARB(arg0, var4);
         OpenGL.glProgramStringARB(arg0, 34933, arg3);
         OpenGL.glGetIntegerv(34379, class717.field10665, 0);
         if (class717.field10665[0] != arg2) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
         } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class393(arg1, arg0, var4);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field231[1] + arg0 + ',' + (arg1 != null ? field231[3] : field231[2]) + ',' + arg2 + ',' + (arg3 != null ? field231[3] : field231[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "d",
      descriptor = "(I)Lgb;"
   )
   public final class224 method144(int arg0) {
      try {
         ++field230;
         if (arg0 != 34933) {
            this.field228 = 109;
         }

         return class193.field2426[super.field11154];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field231[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method145(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method146(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
