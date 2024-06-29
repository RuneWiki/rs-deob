import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 {
   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field246 = new String[]{method165(method164("\n[Z\u001a~")), method165(method164("\n[Z\u001b~")), method165(method164("\n[Z\u0019~"))};
   @OriginalMember(
      owner = "client!qk",
      name = "c",
      descriptor = "I"
   )
   public static int field242 = 0;
   @OriginalMember(
      owner = "client!qk",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field244 = new class378(32, 5);
   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "I"
   )
   public static int field241;
   @OriginalMember(
      owner = "client!qk",
      name = "d",
      descriptor = "I"
   )
   public static int field243;
   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "I"
   )
   public static int field245;

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method161(int arg0, int arg1) {
      try {
         ++field243;
         return arg1 != 4095 ? 14 : arg0 & 127;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field246[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method162(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field241;
         int var6 = arg0 & 3;
         if (arg1 != 59) {
            return 21;
         } else if (var6 == 0) {
            return arg2;
         } else if (~var6 == -2) {
            return -arg3 + 4095;
         } else {
            return ~var6 == -3 ? -arg2 + 4095 : arg3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field246[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method163(boolean arg0) {
      try {
         field244 = null;
         if (arg0) {
            field244 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field246[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method164(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method165(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
