import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class348 extends class510 {
   @OriginalMember(
      owner = "client!js",
      name = "g",
      descriptor = "[I"
   )
   public int[] field4947;
   @OriginalMember(
      owner = "client!js",
      name = "k",
      descriptor = "[I"
   )
   public int[] field4952;
   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4955 = new String[]{method2689(method2688("$4\u001e_y")), method2689(method2688(" 2\\w")), method2689(method2688("$4\u001eXy")), method2689(method2688("5i\u001e5,")), method2689(method2688("$4\u001e'8 .D%y")), method2689(method2688("$4\u001e^y"))};
   @OriginalMember(
      owner = "client!js",
      name = "h",
      descriptor = "F"
   )
   public static float field4948 = 0.0F;
   @OriginalMember(
      owner = "client!js",
      name = "l",
      descriptor = "Lhm;"
   )
   public static class230 field4951 = new class230(9, 0, 4, 1);
   @OriginalMember(
      owner = "client!js",
      name = "m",
      descriptor = "I"
   )
   public static int field4946;
   @OriginalMember(
      owner = "client!js",
      name = "i",
      descriptor = "I"
   )
   public static int field4949;
   @OriginalMember(
      owner = "client!js",
      name = "n",
      descriptor = "I"
   )
   public static int field4950;
   @OriginalMember(
      owner = "client!js",
      name = "f",
      descriptor = "I"
   )
   public static int field4953;
   @OriginalMember(
      owner = "client!js",
      name = "j",
      descriptor = "I"
   )
   public static int field4954;

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(ZBILha;)Lda;"
   )
   public static final class66 method2685(boolean arg0, byte arg1, int arg2, class65 arg3) {
      try {
         int var4 = -61 / ((-24 - arg1) / 32);
         ++field4954;
         class300 var5 = class532.method3985(arg3, -27775, arg2, arg0);
         return var5 == null ? null : var5.field4196;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4955[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4955[3] : field4955[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2686(int arg0) {
      try {
         class625.field9095.method424(class753.field10845, ~class510.field7454.field11181.method1262(false) == -2 ? class272.field3853 + 256 << 2 : -1, 0);
         ++field4949;
         if (arg0 != 9771) {
            method2686(-121);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4955[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2687(byte arg0) {
      try {
         field4951 = null;
         int var1 = -1 % ((9 - arg0) / 35);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4955[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "<init>",
      descriptor = "(II[I[I)V"
   )
   public class348(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         this.field4947 = arg3;
         this.field4952 = arg2;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4955[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4955[3] : field4955[1]) + ',' + (arg3 != null ? field4955[3] : field4955[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2688(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2689(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
