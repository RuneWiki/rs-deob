import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class89 extends class502 {
   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1083 = new String[]{method820(method819("\u000bC@\t\u0018H")), method820(method819("\u000bC@\t\u0019H")), method820(method819("\u000eUMK")), method820(method819("\u001b\u000e\u000f\t-")), method820(method819("\u000bC@\t\u0017H")), method820(method819("\u000bC@\t\u0016H"))};
   @OriginalMember(
      owner = "client!kca",
      name = "k",
      descriptor = "I"
   )
   public static int field1079;
   @OriginalMember(
      owner = "client!kca",
      name = "j",
      descriptor = "I"
   )
   public static int field1081;
   @OriginalMember(
      owner = "client!kca",
      name = "m",
      descriptor = "I"
   )
   public static int field1082;
   @OriginalMember(
      owner = "client!kca",
      name = "l",
      descriptor = "Lua;"
   )
   public static class693 field1080;

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method815(byte arg0) {
      try {
         if (arg0 >= -66) {
            method815((byte)-11);
         }

         field1080 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1083[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "([BLeh;II)Lrda;",
      line = 20
   )
   public static final class690 method816(byte[] arg0, class379 arg1, int arg2, int arg3) {
      try {
         ++field1079;
         if (arg0 == null) {
            return null;
         } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg0);
            if (arg2 != -5602) {
               field1080 = null;
            }

            OpenGL.glGetIntegerv(34379, class243.field3109, 0);
            if (class243.field3109[0] != -1) {
               OpenGL.glBindProgramARB(arg3, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg3, 0);
               return new class690(arg1, arg3, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1083[4] + (arg0 != null ? field1083[3] : field1083[2]) + ',' + (arg1 != null ? field1083[3] : field1083[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(JI)V",
      line = 53
   )
   public static final void method817(long arg0, int arg1) {
      try {
         if (arg1 == 2535) {
            ++field1081;
            if (arg0 > 0L) {
               if (arg0 % 10L == 0L) {
                  class193.method1486(arg0 - 1L, -124);
                  class193.method1486(1L, -122);
               } else {
                  class193.method1486(arg0, -127);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1083[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "d",
      descriptor = "(I)Z",
      line = 74
   )
   public static final boolean method818(int arg0) {
      try {
         ++field1082;
         return arg0 != 10 ? false : class792.field11511;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1083[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method819(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method820(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
