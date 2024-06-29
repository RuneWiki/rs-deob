import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class254 {
   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3860 = new String[]{method2175(method2174("4\u001b+&\u0004\u007f")), method2175(method2174("4\u001b+&\u0007\u007f"))};
   @OriginalMember(
      owner = "client!cba",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field3852 = false;
   @OriginalMember(
      owner = "client!cba",
      name = "m",
      descriptor = "F"
   )
   public static float field3850;
   @OriginalMember(
      owner = "client!cba",
      name = "o",
      descriptor = "I"
   )
   public static int field3846;
   @OriginalMember(
      owner = "client!cba",
      name = "d",
      descriptor = "I"
   )
   public int field3847;
   @OriginalMember(
      owner = "client!cba",
      name = "f",
      descriptor = "I"
   )
   public int field3849;
   @OriginalMember(
      owner = "client!cba",
      name = "b",
      descriptor = "I"
   )
   public int field3851;
   @OriginalMember(
      owner = "client!cba",
      name = "k",
      descriptor = "I"
   )
   public int field3854;
   @OriginalMember(
      owner = "client!cba",
      name = "l",
      descriptor = "I"
   )
   public int field3855;
   @OriginalMember(
      owner = "client!cba",
      name = "j",
      descriptor = "I"
   )
   public int field3856;
   @OriginalMember(
      owner = "client!cba",
      name = "n",
      descriptor = "I"
   )
   public int field3857;
   @OriginalMember(
      owner = "client!cba",
      name = "g",
      descriptor = "I"
   )
   public static int field3859;
   @OriginalMember(
      owner = "client!cba",
      name = "i",
      descriptor = "Lsa;"
   )
   public static class39 field3858;
   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "[B"
   )
   public byte[] field3848;
   @OriginalMember(
      owner = "client!cba",
      name = "e",
      descriptor = "[B"
   )
   public byte[] field3853;
   @OriginalMember(
      owner = "client!cba",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field3845;

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2172(int arg0) {
      try {
         field3845 = null;
         field3858 = null;
         if (arg0 != -6) {
            field3845 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3860[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method2173(int arg0, int arg1, boolean arg2) {
      try {
         ++field3846;
         class544 var3 = class549.field7834.method3850(3917, arg0);
         if (arg1 == 11) {
            arg1 = 10;
         }

         if (arg2) {
            field3850 = 1.7612858F;
         }

         if (~arg1 <= -6 && ~arg1 >= -9) {
            arg1 = 4;
         }

         return var3.method4072((byte)-17, arg1);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3860[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2174(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2175(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
