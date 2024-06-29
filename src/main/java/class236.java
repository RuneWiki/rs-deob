import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class236 {
   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3606 = method2024(method2023("L\u0006\u0017P\u001c\u0013"));
   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "B"
   )
   public byte field3602;
   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "I"
   )
   public int field3605;
   @OriginalMember(
      owner = "client!waa",
      name = "f",
      descriptor = "Llt;"
   )
   public static class11 field3603;
   @OriginalMember(
      owner = "client!waa",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field3599;
   @OriginalMember(
      owner = "client!waa",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field3600;
   @OriginalMember(
      owner = "client!waa",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field3601;
   @OriginalMember(
      owner = "client!waa",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field3604;

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2022(boolean arg0) {
      try {
         field3603 = null;
         if (!arg0) {
            method2022(false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3606 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2023(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2024(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
