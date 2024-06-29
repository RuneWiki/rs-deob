import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class13 {
   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field172 = new String[]{method99(method98("q`WN<")), method99(method98("q`WM<"))};
   @OriginalMember(
      owner = "client!mo",
      name = "f",
      descriptor = "I"
   )
   public static int field163 = 0;
   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field165 = new class113(49, 3);
   @OriginalMember(
      owner = "client!mo",
      name = "j",
      descriptor = "Lnaa;"
   )
   public static class113 field170 = new class113(23, 3);
   @OriginalMember(
      owner = "client!mo",
      name = "g",
      descriptor = "Luk;"
   )
   public static class498 field171 = new class498(128, 6);
   @OriginalMember(
      owner = "client!mo",
      name = "k",
      descriptor = "F"
   )
   public static float field161;
   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "I"
   )
   public int field162;
   @OriginalMember(
      owner = "client!mo",
      name = "e",
      descriptor = "I"
   )
   public static int field164;
   @OriginalMember(
      owner = "client!mo",
      name = "i",
      descriptor = "I"
   )
   public static int field166;
   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "I"
   )
   public int field167;
   @OriginalMember(
      owner = "client!mo",
      name = "h",
      descriptor = "I"
   )
   public int field168;
   @OriginalMember(
      owner = "client!mo",
      name = "d",
      descriptor = "I"
   )
   public int field169;

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(CZ)Z"
   )
   public static final boolean method96(char arg0, boolean arg1) {
      try {
         ++field164;
         if (!arg1) {
            return false;
         } else if (~arg0 <= -33 && ~arg0 >= -127) {
            return true;
         } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
         } else {
            return ~arg0 == -8365 || ~arg0 == -339 || ~arg0 == -8213 || ~arg0 == -340 || ~arg0 == -377;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field172[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method97(int arg0) {
      try {
         if (arg0 > -118) {
            field170 = null;
         }

         field171 = null;
         field170 = null;
         field165 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field172[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method98(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method99(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
