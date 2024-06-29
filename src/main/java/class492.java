import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class492 {
   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7273 = new String[]{method3649(method3648("C\u0010\u0001\u0003\u000f")), method3649(method3648("[O\u0001lZ")), method3649(method3648("N\u0014C.")), method3649(method3648("C\u0010\u0001\u0000\u000f")), method3649(method3648("C\u0010\u0001\u0006\u000f"))};
   @OriginalMember(
      owner = "client!cq",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field7269 = new int[]{104, 120, 136, 168};
   @OriginalMember(
      owner = "client!cq",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field7272 = false;
   @OriginalMember(
      owner = "client!cq",
      name = "d",
      descriptor = "I"
   )
   public static int field7270;
   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "I"
   )
   public static int field7271;

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3644(int arg0) {
      try {
         field7269 = null;
         if (arg0 != -27997) {
            method3647((class128)null, true);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7273[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3645(byte arg0) {
      try {
         class261.field3566.method4677(class261.field3566.field9466, arg0 + 5, 1);
         ++field7270;
         class261.field3566.method4677(class261.field3566.field9428, 71, 1);
         class261.field3566.method4677(class261.field3566.field9455, 110, 1);
         class261.field3566.method4677(class261.field3566.field9442, 58, 1);
         class261.field3566.method4677(class261.field3566.field9461, 121, 1);
         class261.field3566.method4677(class261.field3566.field9451, 109, 1);
         class261.field3566.method4677(class261.field3566.field9432, 71, 0);
         class261.field3566.method4677(class261.field3566.field9450, 75, 0);
         class261.field3566.method4677(class261.field3566.field9427, 58, 0);
         class261.field3566.method4677(class261.field3566.field9453, 110, 0);
         class261.field3566.method4677(class261.field3566.field9467, 64, 0);
         class261.field3566.method4677(class261.field3566.field9431, 73, 0);
         class261.field3566.method4677(class261.field3566.field9456, 103, 0);
         class261.field3566.method4677(class261.field3566.field9439, arg0 + 4, 0);
         class261.field3566.method4677(class261.field3566.field9474, 76, 0);
         if (arg0 == 116) {
            class261.field3566.method4677(class261.field3566.field9435, 86, 0);
            class261.field3566.method4677(class261.field3566.field9468, 101, 0);
            class261.field3566.method4677(class261.field3566.field9446, 49, 0);
            class261.field3566.method4677(class261.field3566.field9443, 126, 0);
            class136.method1161(true);
            class261.field3566.method4677(class261.field3566.field9449, 48, 2);
            class261.field3566.method4677(class261.field3566.field9472, 51, 2);
            class157.method1304(-100);
            class239.method1784(arg0 + -115);
            class352.field5349 = true;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7273[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3646(int arg0) {
      class779.field11373 = arg0;
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Ljj;Z)Lqf;"
   )
   public static final class709 method3647(class128 arg0, boolean arg1) {
      try {
         ++field7271;
         if (arg1) {
            method3646(-10);
         }

         class450 var2 = class246.method1842(arg0, (byte)-125);
         int var3 = arg0.method1052((byte)-66);
         return new class709(var2.field6835, var2.field6837, var2.field6833, var2.field6842, var2.field6834, var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7273[0] + (arg0 != null ? field7273[1] : field7273[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3648(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3649(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
