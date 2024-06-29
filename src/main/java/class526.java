import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class526 extends class643 {
   @OriginalMember(
      owner = "client!va",
      name = "u",
      descriptor = "B"
   )
   public byte field7197 = 5;
   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7203 = new String[]{method3799(method3798("}6'\u0012H")), method3799(method3798("}6'\u0013H"))};
   @OriginalMember(
      owner = "client!va",
      name = "t",
      descriptor = "Liha;"
   )
   public static class32 field7199 = new class32(true);
   @OriginalMember(
      owner = "client!va",
      name = "o",
      descriptor = "Lwj;"
   )
   public static class418 field7201 = new class418(0, -1);
   @OriginalMember(
      owner = "client!va",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field7202 = false;
   @OriginalMember(
      owner = "client!va",
      name = "s",
      descriptor = "I"
   )
   public int field7191;
   @OriginalMember(
      owner = "client!va",
      name = "x",
      descriptor = "I"
   )
   public int field7192;
   @OriginalMember(
      owner = "client!va",
      name = "n",
      descriptor = "I"
   )
   public int field7194;
   @OriginalMember(
      owner = "client!va",
      name = "p",
      descriptor = "I"
   )
   public int field7195;
   @OriginalMember(
      owner = "client!va",
      name = "w",
      descriptor = "I"
   )
   public int field7196;
   @OriginalMember(
      owner = "client!va",
      name = "y",
      descriptor = "I"
   )
   public static int field7198;
   @OriginalMember(
      owner = "client!va",
      name = "r",
      descriptor = "I"
   )
   public int field7200;
   @OriginalMember(
      owner = "client!va",
      name = "v",
      descriptor = "Z"
   )
   public boolean field7193;

   @OriginalMember(
      owner = "client!va",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method3796(byte arg0) {
      try {
         ++field7198;
         return arg0 > -104 ? 59 : class82.field1057;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7203[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method3797(byte arg0) {
      try {
         field7199 = null;
         field7201 = null;
         if (arg0 != 100) {
            field7202 = false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7203[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3798(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3799(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
