import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class161 {
   @OriginalMember(
      owner = "client!vf",
      name = "c",
      descriptor = "Z"
   )
   public boolean field2030;
   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2035 = new String[]{method1327(method1326("g\u001e}{\u000e")), method1327(method1326("g\u001e}z\u000e")), method1327(method1326("g\u001e}y\u000e")), method1327(method1326("g\u001e}\u0004O\u007f\u0011'\u0006\u000e"))};
   @OriginalMember(
      owner = "client!vf",
      name = "e",
      descriptor = "[[I"
   )
   public static int[][] field2031 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!vf",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field2028 = false;
   @OriginalMember(
      owner = "client!vf",
      name = "f",
      descriptor = "I"
   )
   public static int field2027;
   @OriginalMember(
      owner = "client!vf",
      name = "h",
      descriptor = "I"
   )
   public static int field2032;
   @OriginalMember(
      owner = "client!vf",
      name = "g",
      descriptor = "Lgp;"
   )
   public class53 field2029;
   @OriginalMember(
      owner = "client!vf",
      name = "d",
      descriptor = "Lgp;"
   )
   public class53 field2034;
   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "Z"
   )
   public boolean field2033;

   @OriginalMember(
      owner = "client!vf",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1323(int arg0) {
      try {
         ++field2032;
         if (arg0 != 2) {
            this.field2034 = null;
         }

         if (this.field2029 != null) {
            this.field2029.method423(arg0 + -15609);
         }

         this.field2033 = false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2035[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1324(int arg0) {
      try {
         if (arg0 < 83) {
            return true;
         } else {
            ++field2027;
            return this.field2033 && !this.field2030;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2035[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1325(int arg0) {
      try {
         if (arg0 == 0) {
            field2031 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2035[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class161(boolean arg0) {
      try {
         this.field2030 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2035[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
