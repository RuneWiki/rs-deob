import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class237 {
   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3669 = new String[]{method2094(method2093("\u000f\\;\u0000V")), method2094(method2093("\u000f\\;\u0003V")), method2094(method2093("\u0001Uc P\u0007U{&P8@g(\u0010\f")), method2094(method2093("#Qt1:\u001eYea\u001b\u0019Fz3D")), method2094(method2093("\u0005Ay-")), method2094(method2093("\b[xo\r\u001eZ;,\u001f\u0005Ur$\u0013\u000eZao6\u0004@F1\u0011\u001fp| \u0019\u0005[f5\u0017\byM\u0003\u001b\nZ")), method2094(method2093("\u000f\\;\u0002V")), method2094(method2093("\u0010\u001a;o\u0003")), method2094(method2093("\u000fAx16\u000eUe"))};
   @OriginalMember(
      owner = "client!dh",
      name = "e",
      descriptor = "I"
   )
   public static int field3665 = 0;
   @OriginalMember(
      owner = "client!dh",
      name = "f",
      descriptor = "I"
   )
   public static int field3662;
   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "I"
   )
   public static int field3663;
   @OriginalMember(
      owner = "client!dh",
      name = "c",
      descriptor = "I"
   )
   public static int field3667;
   @OriginalMember(
      owner = "client!dh",
      name = "g",
      descriptor = "Lsu;"
   )
   public static class113 field3664;
   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "Lsa;"
   )
   public static class39 field3666;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3668;

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2089(int arg0) {
      try {
         field3664 = null;
         field3666 = null;
         if (arg0 > -127) {
            method2091(-120, 123, -81);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3669[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljava/io/File;IZ)V"
   )
   public static final void method2090(File arg0, int arg1, boolean arg2) {
      try {
         if (class609.field8677 == null) {
            class325.method2611(true);
         }

         if (arg1 == 0) {
            ++field3663;

            try {
               Class var3 = Class.forName(field3669[5]);
               Method var4 = var3.getDeclaredMethod(field3669[8], field3668 != null ? field3668 : (field3668 = method2092(field3669[2])), Boolean.TYPE);
               var4.invoke(class609.field8677, arg0.getAbsolutePath(), new Boolean(arg2));
            } catch (Exception var7) {
               System.out.println(field3669[3]);
               var7.printStackTrace();
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3669[6] + (arg0 != null ? field3669[7] : field3669[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2091(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -19540) {
            method2089(-45);
         }

         ++field3667;
         return ~(arg1 & 34) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3669[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2092(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2093(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2094(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
