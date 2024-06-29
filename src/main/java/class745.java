import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class745 {
   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11053 = new String[]{method5432(method5431("C\u001d\u0017nK\u001b")), method5432(method5431("]\u000b\u001a,")), method5432(method5431("C\u001d\u0017nI\u001b")), method5432(method5431("HPXnw")), method5432(method5431("C\u001d\u0017nH\u001b"))};
   @OriginalMember(
      owner = "client!pca",
      name = "f",
      descriptor = "[S"
   )
   private static short[] field11046 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field11047 = new short[]{-10304, 9104, 25485, 4620, 4540};
   @OriginalMember(
      owner = "client!pca",
      name = "h",
      descriptor = "[S"
   )
   private static short[] field11051 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!pca",
      name = "e",
      descriptor = "[[S"
   )
   public static short[][] field11045 = new short[][]{field11051, field11047, field11046};
   @OriginalMember(
      owner = "client!pca",
      name = "d",
      descriptor = "I"
   )
   public static int field11049;
   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "I"
   )
   public static int field11050;
   @OriginalMember(
      owner = "client!pca",
      name = "g",
      descriptor = "I"
   )
   public static int field11052;
   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "J"
   )
   public static long field11048;

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lhv;Lha;III)V"
   )
   public static final void method5428(class544 param0, class66 param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Ld;ILeaa;Ljava/awt/Canvas;IZ)Lha;"
   )
   public static final class66 method5429(class160 arg0, int arg1, class526 arg2, Canvas arg3, int arg4, boolean arg5) {
      try {
         if (arg5) {
            return null;
         } else {
            ++field11049;
            int var6 = 0;
            int var7 = 0;
            if (arg3 != null) {
               Dimension var8 = arg3.getSize();
               var7 = var8.height;
               var6 = var8.width;
            }

            return class66.method579(var7, arg3, var6, -25321, arg4, arg1, arg2, arg0);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field11053[4] + (arg0 != null ? field11053[3] : field11053[1]) + ',' + arg1 + ',' + (arg2 != null ? field11053[3] : field11053[1]) + ',' + (arg3 != null ? field11053[3] : field11053[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5430(int arg0) {
      try {
         if (arg0 != 128) {
            field11046 = null;
         }

         field11045 = null;
         field11051 = null;
         field11047 = null;
         field11046 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11053[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5431(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5432(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
