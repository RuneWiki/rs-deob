import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class522 extends class347 {
   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7594 = method3849(method3848("`@J`X"));
   @OriginalMember(
      owner = "client!va",
      name = "n",
      descriptor = "Lada;"
   )
   public static class173 field7591 = new class173();
   @OriginalMember(
      owner = "client!va",
      name = "l",
      descriptor = "Lhn;"
   )
   public static class751 field7593 = new class751(3, 4);
   @OriginalMember(
      owner = "client!va",
      name = "r",
      descriptor = "I"
   )
   public int field7583;
   @OriginalMember(
      owner = "client!va",
      name = "p",
      descriptor = "I"
   )
   public int field7588;
   @OriginalMember(
      owner = "client!va",
      name = "j",
      descriptor = "I"
   )
   public static int field7589;
   @OriginalMember(
      owner = "client!va",
      name = "o",
      descriptor = "[I"
   )
   public int[] field7584;
   @OriginalMember(
      owner = "client!va",
      name = "k",
      descriptor = "[I"
   )
   public int[] field7585;
   @OriginalMember(
      owner = "client!va",
      name = "i",
      descriptor = "[I"
   )
   public int[] field7592;
   @OriginalMember(
      owner = "client!va",
      name = "s",
      descriptor = "[Ldaa;"
   )
   public class12[] field7586;
   @OriginalMember(
      owner = "client!va",
      name = "m",
      descriptor = "[Ldaa;"
   )
   public class12[] field7590;
   @OriginalMember(
      owner = "client!va",
      name = "q",
      descriptor = "[[[B"
   )
   public byte[][][] field7587;

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public static void method3847(byte arg0) {
      try {
         field7593 = null;
         if (arg0 <= 43) {
            method3847((byte)36);
         }

         field7591 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7594 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3848(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3849(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
