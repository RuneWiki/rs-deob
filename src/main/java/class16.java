import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 {
   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field284 = new String[]{method132(method131("}\u0013\u001aN^")), method132(method131("bN\u001a!\u000b")), method132(method131("UUU\u0004Ft\u001dW\u000fNvTX\u0005\u0003`\\]\fFb\u0007")), method132(method131("hHX\f"))};
   @OriginalMember(
      owner = "client!ds",
      name = "d",
      descriptor = "I"
   )
   public static int field280 = -1;
   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "I"
   )
   public static int field282 = -1;
   @OriginalMember(
      owner = "client!ds",
      name = "c",
      descriptor = "I"
   )
   public static int field281;
   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "I"
   )
   public static int field283;

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(Llea;B[BI)Lld;"
   )
   public static final class128 method130(class574 arg0, byte arg1, byte[] arg2, int arg3) {
      try {
         ++field281;
         if (arg1 <= 0) {
            return null;
         } else if (arg2 != null && ~arg2.length != -1) {
            long var4 = OpenGL.glCreateShaderObjectARB(arg3);
            OpenGL.glShaderSourceRawARB(var4, arg2);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class390.field5407, 0);
            if (~class390.field5407[0] == -1) {
               if (~class390.field5407[0] == -1) {
                  System.out.println(field284[2]);
               }

               OpenGL.glGetObjectParameterivARB(var4, 35716, class390.field5407, 1);
               if (~class390.field5407[1] < -2) {
                  byte[] var6 = new byte[class390.field5407[1]];
                  OpenGL.glGetInfoLogARB(var4, class390.field5407[1], class390.field5407, 0, var6, 0);
                  System.out.println(new String(var6));
               }

               if (~class390.field5407[0] == -1) {
                  OpenGL.glDeleteObjectARB(var4);
                  return null;
               }
            }

            return new class128(arg0, var4, arg3);
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field284[1] + (arg0 != null ? field284[0] : field284[3]) + ',' + arg1 + ',' + (arg2 != null ? field284[0] : field284[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
