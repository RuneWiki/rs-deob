import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class345 extends IOException {
   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5264 = new String[]{method2709(method2708("z\"H#z")), method2709(method2708("oy\na")), method2709(method2708("i|HL/")), method2709(method2708("Rd\u0007ibs,\u0005bjqe\nh'gm\u000fabe6")), method2709(method2708("i|HO/")), method2709(method2708("i|HN/")), method2709(method2708("rd\tzQhh\u0003bFe"))};
   @OriginalMember(
      owner = "client!hp",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field5261 = new int[]{1, -1, -1, 1};
   @OriginalMember(
      owner = "client!hp",
      name = "c",
      descriptor = "I"
   )
   public static int field5260;
   @OriginalMember(
      owner = "client!hp",
      name = "b",
      descriptor = "I"
   )
   public static int field5262;
   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "I"
   )
   public static int field5263;

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method2705(int arg0) {
      try {
         if (arg0 != -1) {
            field5261 = null;
         }

         ++field5262;
         if (client.field4512) {
            try {
               class359.method2803(field5264[6], class238.field3003, (byte)-98);
               return true;
            } catch (Throwable var2) {
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5264[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2706(byte arg0) {
      try {
         if (arg0 != 122) {
            field5260 = 0;
         }

         field5261 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5264[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(I[BLeh;I)Lwl;"
   )
   public static final class429 method2707(int arg0, byte[] arg1, class379 arg2, int arg3) {
      try {
         ++field5263;
         if (arg1 != null && ~arg1.length != -1) {
            long var4 = OpenGL.glCreateShaderObjectARB(arg3);
            OpenGL.glShaderSourceRawARB(var4, arg1);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class134.field1687, 0);
            if (class134.field1687[0] == 0) {
               if (~class134.field1687[0] == -1) {
                  System.out.println(field5264[3]);
               }

               OpenGL.glGetObjectParameterivARB(var4, 35716, class134.field1687, 1);
               if (~class134.field1687[1] < -2) {
                  byte[] var6 = new byte[class134.field1687[1]];
                  OpenGL.glGetInfoLogARB(var4, class134.field1687[1], class134.field1687, 0, var6, 0);
                  System.out.println(new String(var6));
               }

               if (class134.field1687[0] == 0) {
                  OpenGL.glDeleteObjectARB(var4);
                  return null;
               }
            }

            int var7 = -116 / ((arg0 - -83) / 41);
            return new class429(arg2, var4, arg3);
         } else {
            return null;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5264[2] + arg0 + ',' + (arg1 != null ? field5264[0] : field5264[1]) + ',' + (arg2 != null ? field5264[0] : field5264[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class345(String arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2708(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2709(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
