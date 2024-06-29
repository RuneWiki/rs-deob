import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class135 {
   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1905 = new String[]{method1246(method1245("YPSDW")), method1246(method1245("o]\u001cb\u001aN\u0015\u001ei\u0012L\\\u0011c_ZT\u0014j\u001aX\u000f")), method1246(method1245("YPSGW")), method1246(method1245("G\u001bS(\u0002")), method1246(method1245("R@\u0011j"))};
   @OriginalMember(
      owner = "client!ee",
      name = "b",
      descriptor = "Lhka;"
   )
   public static class377 field1903 = new class377(14, 8);
   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "I"
   )
   public static int field1902;
   @OriginalMember(
      owner = "client!ee",
      name = "c",
      descriptor = "Lrr;"
   )
   public static class678 field1904;

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(Ljava/lang/String;IBLc;)Lim;"
   )
   public static final class86 method1243(String arg0, int arg1, byte arg2, class652 arg3) {
      try {
         ++field1902;
         int var4 = -52 / ((arg2 - 51) / 42);
         long var5 = OpenGL.glCreateShaderObjectARB(arg1);
         OpenGL.glShaderSourceARB(var5, arg0);
         OpenGL.glCompileShaderARB(var5);
         OpenGL.glGetObjectParameterivARB(var5, 35713, class656.field9809, 0);
         if (class656.field9809[0] == 0) {
            if (class656.field9809[0] == 0) {
               System.out.println(field1905[1]);
            }

            OpenGL.glGetObjectParameterivARB(var5, 35716, class656.field9809, 1);
            if (~class656.field9809[1] < -2) {
               byte[] var7 = new byte[class656.field9809[1]];
               OpenGL.glGetInfoLogARB(var5, class656.field9809[1], class656.field9809, 0, var7, 0);
               System.out.println(new String(var7));
            }

            if (class656.field9809[0] == 0) {
               OpenGL.glDeleteObjectARB(var5);
               return null;
            }
         }

         return new class86(arg3, var5, arg1);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field1905[2] + (arg0 != null ? field1905[3] : field1905[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1905[3] : field1905[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1244(int arg0) {
      try {
         if (arg0 > -81) {
            field1904 = null;
         }

         field1904 = null;
         field1903 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1905[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1245(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1246(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
