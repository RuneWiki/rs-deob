import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class617 extends class500 {
   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8607 = new String[]{method4479(method4478("yP'5t")), method4479(method4478("yP'6t"))};
   @OriginalMember(
      owner = "client!lk",
      name = "u",
      descriptor = "Lnw;"
   )
   public static class616 field8601 = new class616(8, -1);
   @OriginalMember(
      owner = "client!lk",
      name = "s",
      descriptor = "I"
   )
   public static int field8606 = 0;
   @OriginalMember(
      owner = "client!lk",
      name = "m",
      descriptor = "I"
   )
   public int field8595;
   @OriginalMember(
      owner = "client!lk",
      name = "j",
      descriptor = "I"
   )
   public int field8597;
   @OriginalMember(
      owner = "client!lk",
      name = "k",
      descriptor = "I"
   )
   public static int field8600;
   @OriginalMember(
      owner = "client!lk",
      name = "q",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field8603;
   @OriginalMember(
      owner = "client!lk",
      name = "p",
      descriptor = "[I"
   )
   public int[] field8598;
   @OriginalMember(
      owner = "client!lk",
      name = "l",
      descriptor = "[I"
   )
   public int[] field8599;
   @OriginalMember(
      owner = "client!lk",
      name = "t",
      descriptor = "[I"
   )
   public int[] field8602;
   @OriginalMember(
      owner = "client!lk",
      name = "o",
      descriptor = "[Lvea;"
   )
   public class289[] field8604;
   @OriginalMember(
      owner = "client!lk",
      name = "n",
      descriptor = "[Lvea;"
   )
   public class289[] field8605;
   @OriginalMember(
      owner = "client!lk",
      name = "r",
      descriptor = "[[[B"
   )
   public byte[][][] field8596;

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4476(byte arg0) {
      try {
         field8601 = null;
         if (arg0 != -87) {
            field8601 = null;
         }

         field8603 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8607[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method4477(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class338.field4837 = arg3;
         class278.field3711 = arg1;
         ++field8600;
         if (arg0 != 25258) {
            method4476((byte)-54);
         }

         class663.field9446 = arg4;
         class691.field10099 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8607[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4478(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4479(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
