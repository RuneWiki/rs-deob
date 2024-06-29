import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class190 {
   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2313 = new String[]{method1436(method1435("jMe\u0003;")), method1436(method1435("jMe\u0004;")), method1436(method1435("jMe\u0001;")), method1436(method1435("b\u0012enn")), method1436(method1435("wI',")), method1436(method1435("jMe4|JH9)}~\u0014")), method1436(method1435("jMe\u0002;"))};
   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2310 = new int[8];
   @OriginalMember(
      owner = "client!sq",
      name = "c",
      descriptor = "I"
   )
   public static int field2308;
   @OriginalMember(
      owner = "client!sq",
      name = "b",
      descriptor = "I"
   )
   public static int field2309;
   @OriginalMember(
      owner = "client!sq",
      name = "d",
      descriptor = "I"
   )
   public static int field2311;
   @OriginalMember(
      owner = "client!sq",
      name = "e",
      descriptor = "I"
   )
   public static int field2312;

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1431(int arg0, int arg1) {
      try {
         ++field2312;
         if (arg1 != 1) {
            field2310 = null;
         }

         return arg0 == 0 || arg0 == 1 || arg0 == 2;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2313[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method1432(int arg0, String arg1) {
      try {
         if (arg0 != 10524) {
            return -126;
         } else {
            ++field2309;
            return 1 + arg1.length();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2313[2] + arg0 + ',' + (arg1 != null ? field2313[3] : field2313[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method1433(int arg0, int arg1, int arg2) {
      try {
         ++field2308;
         int var4 = ~arg1 <= ~class252.field3194 ? arg1 : class252.field3194;
         if (arg2 != 1) {
            field2310 = null;
         }

         if (class118.field1442 == this) {
            return 0;
         } else if (class166.field2105 == this) {
            return -arg0 + var4;
         } else {
            return class387.field5419 == this ? (-arg0 + var4) / 2 : 0;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2313[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2311;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2313[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1434(boolean arg0) {
      try {
         if (arg0) {
            field2310 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2313[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1435(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1436(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
