import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class226 extends class124 {
   @OriginalMember(
      owner = "client!gb",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2845 = new String[]{method1729(method1728("zU\u0017s@")), method1729(method1728("zU\u0017y@")), method1729(method1728("zU\u0017u@"))};
   @OriginalMember(
      owner = "client!gb",
      name = "G",
      descriptor = "I"
   )
   public static int field2837 = -1;
   @OriginalMember(
      owner = "client!gb",
      name = "L",
      descriptor = "Lbga;"
   )
   public static class378 field2839 = new class378(33, 0);
   @OriginalMember(
      owner = "client!gb",
      name = "I",
      descriptor = "I"
   )
   public static int field2841 = -1;
   @OriginalMember(
      owner = "client!gb",
      name = "H",
      descriptor = "Lo;"
   )
   public static class31 field2840 = new class31(5, 3);
   @OriginalMember(
      owner = "client!gb",
      name = "Q",
      descriptor = "[I"
   )
   public static int[] field2843 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
   @OriginalMember(
      owner = "client!gb",
      name = "P",
      descriptor = "Lbga;"
   )
   public static class378 field2844 = new class378(3, 3);
   @OriginalMember(
      owner = "client!gb",
      name = "N",
      descriptor = "I"
   )
   public static int field2834;
   @OriginalMember(
      owner = "client!gb",
      name = "M",
      descriptor = "I"
   )
   public static int field2836;
   @OriginalMember(
      owner = "client!gb",
      name = "K",
      descriptor = "Lqh;"
   )
   public static class74 field2842;
   @OriginalMember(
      owner = "client!gb",
      name = "O",
      descriptor = "Z"
   )
   public static boolean field2838;
   @OriginalMember(
      owner = "client!gb",
      name = "J",
      descriptor = "[B"
   )
   private byte[] field2835;

   @OriginalMember(
      owner = "client!gb",
      name = "<init>",
      descriptor = "()V"
   )
   public class226() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!gb",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method1726(int arg0) {
      try {
         if (arg0 != 11493) {
            method1726(25);
         }

         field2844 = null;
         field2842 = null;
         field2843 = null;
         field2840 = null;
         field2839 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2845[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(ZIII)[B"
   )
   public final byte[] method1727(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2834;
         if (!arg0) {
            return null;
         } else {
            this.field2835 = new byte[arg1 * 2 * arg2 * arg3];
            this.method1350(arg2, arg3, arg1, (byte)-10);
            return this.field2835;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2845[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method1039(int arg0, int arg1, byte arg2) {
      try {
         ++field2836;
         int var4 = arg0 * 2;
         int var5 = 255 & arg2;
         int var6 = -55 % ((39 - arg1) / 62);
         int var10001 = var4;
         int var9 = var4 + 1;
         this.field2835[var10001] = (byte)(var5 * 3 >> 5);
         this.field2835[var9] = (byte)(var5 * 3 >> 5);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2845[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1728(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1729(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
