import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class421 extends class428 {
   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6023 = method3126(method3125("FKtJZ"));
   @OriginalMember(
      owner = "client!sg",
      name = "p",
      descriptor = "Lek;"
   )
   public static class536 field6019 = new class536(64, 7);
   @OriginalMember(
      owner = "client!sg",
      name = "v",
      descriptor = "I"
   )
   public int field6013;
   @OriginalMember(
      owner = "client!sg",
      name = "t",
      descriptor = "I"
   )
   public int field6015;
   @OriginalMember(
      owner = "client!sg",
      name = "o",
      descriptor = "I"
   )
   public int field6016;
   @OriginalMember(
      owner = "client!sg",
      name = "y",
      descriptor = "I"
   )
   public int field6018;
   @OriginalMember(
      owner = "client!sg",
      name = "x",
      descriptor = "I"
   )
   public int field6020;
   @OriginalMember(
      owner = "client!sg",
      name = "m",
      descriptor = "I"
   )
   public static int field6021;
   @OriginalMember(
      owner = "client!sg",
      name = "r",
      descriptor = "I"
   )
   public int field6022;
   @OriginalMember(
      owner = "client!sg",
      name = "n",
      descriptor = "Lbl;"
   )
   public class678 field6014;
   @OriginalMember(
      owner = "client!sg",
      name = "w",
      descriptor = "Lbl;"
   )
   public class678 field6017;
   @OriginalMember(
      owner = "client!sg",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   public String field6012;
   @OriginalMember(
      owner = "client!sg",
      name = "q",
      descriptor = "Z"
   )
   public boolean field6011;
   @OriginalMember(
      owner = "client!sg",
      name = "s",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field6010;

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method3124(int arg0) {
      try {
         if (arg0 == -29833) {
            field6019 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6023 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3125(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3126(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
