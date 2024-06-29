import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class613 {
   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8723 = new String[]{method4512(method4511("!`\u007flx")), method4512(method4511("!`\u007fkx")), method4512(method4511("!`\u007fix")), method4512(method4511("!`\u007fjx"))};
   @OriginalMember(
      owner = "client!al",
      name = "h",
      descriptor = "Lhha;"
   )
   public static class724 field8719 = new class724(132, 6);
   @OriginalMember(
      owner = "client!al",
      name = "e",
      descriptor = "F"
   )
   public static float field8720;
   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "I"
   )
   public static int field8715;
   @OriginalMember(
      owner = "client!al",
      name = "g",
      descriptor = "I"
   )
   public static int field8716;
   @OriginalMember(
      owner = "client!al",
      name = "f",
      descriptor = "I"
   )
   public static int field8717;
   @OriginalMember(
      owner = "client!al",
      name = "c",
      descriptor = "I"
   )
   public static int field8718;
   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "I"
   )
   public static int field8721;
   @OriginalMember(
      owner = "client!al",
      name = "d",
      descriptor = "Ldu;"
   )
   public static class92 field8722;

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4507(int arg0, int arg1) {
      try {
         ++field8718;
         if (arg0 != -1) {
            return false;
         } else {
            return ~arg1 <= -5 && arg1 <= 8;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8723[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4508(byte arg0) {
      try {
         field8722 = null;
         field8719 = null;
         if (arg0 <= 16) {
            method4508((byte)105);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8723[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method4509(int arg0) {
      try {
         ++field8715;
         if (class394.field5712 != 3) {
            return false;
         } else {
            if (arg0 < 106) {
               field8719 = null;
            }

            return ~class528.field7463 == -1 && ~class467.field6773 == -1;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8723[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4510(int arg0, int arg1) {
      try {
         class784.field11423 = arg1;
         class644.field9063 = -1;
         ++field8717;
         class348.field5114 = arg0;
         class111.method1082(0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8723[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4511(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4512(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
