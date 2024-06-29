import jaggl.OpenGL;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class92 extends InputStream {
   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1255 = new String[]{method853(method852("IQ&PHCA ")), method853(method852("LPdN")), method853(method852("IQ&a\u0005")), method853(method852("Y\u000b&\fP")), method853(method852("IQ&`\u0005")), method853(method852("IQ&c\u0005"))};
   @OriginalMember(
      owner = "client!kt",
      name = "b",
      descriptor = "I"
   )
   public static int field1248 = 0;
   @OriginalMember(
      owner = "client!kt",
      name = "d",
      descriptor = "[[B"
   )
   public static byte[][] field1250 = new byte[50][];
   @OriginalMember(
      owner = "client!kt",
      name = "g",
      descriptor = "I"
   )
   public static int field1249;
   @OriginalMember(
      owner = "client!kt",
      name = "c",
      descriptor = "I"
   )
   public static int field1251;
   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "I"
   )
   public static int field1252;
   @OriginalMember(
      owner = "client!kt",
      name = "e",
      descriptor = "I"
   )
   public static int field1253;
   @OriginalMember(
      owner = "client!kt",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field1247;
   @OriginalMember(
      owner = "client!kt",
      name = "h",
      descriptor = "[Lma;"
   )
   public static class670[] field1254;

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method849(int arg0) {
      try {
         if (arg0 != -1) {
            field1247 = null;
         }

         field1250 = null;
         field1254 = null;
         field1247 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1255[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method850(byte arg0, int arg1, int arg2) {
      try {
         ++field1252;
         int var3 = -17 % ((-54 - arg0) / 57);
         return (2048 & arg2) != 0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1255[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "([BBLlea;I)Lqia;"
   )
   public static final class575 method851(byte[] arg0, byte arg1, class574 arg2, int arg3) {
      try {
         ++field1253;
         if (arg0 == null) {
            return null;
         } else if (arg1 != 70) {
            return null;
         } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class91.field1234, 0);
            if (~class91.field1234[0] != 0) {
               OpenGL.glBindProgramARB(arg3, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg3, 0);
               return new class575(arg2, arg3, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1255[2] + (arg0 != null ? field1255[3] : field1255[1]) + ',' + arg1 + ',' + (arg2 != null ? field1255[3] : field1255[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         ++field1251;
         class340.method2717(30000L, (byte)-119);
         return -1;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1255[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method852(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method853(char[] arg0) {
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
            var10005 = 37;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
