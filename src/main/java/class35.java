import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class35 {
   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field496 = new String[]{method275(method274("$]\u0014cF")), method275(method274("$]\u0014`F"))};
   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "Lhv;"
   )
   public static class227 field493 = new class227(64);
   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field495 = new String[200];
   @OriginalMember(
      owner = "client!ml",
      name = "d",
      descriptor = "F"
   )
   public static float field490;
   @OriginalMember(
      owner = "client!ml",
      name = "c",
      descriptor = "I"
   )
   public static int field491;
   @OriginalMember(
      owner = "client!ml",
      name = "e",
      descriptor = "Lr;"
   )
   public class114 field492;
   @OriginalMember(
      owner = "client!ml",
      name = "f",
      descriptor = "Lka;"
   )
   public class232 field494;

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(CB)Z"
   )
   public static final boolean method272(char arg0, byte arg1) {
      try {
         ++field491;
         if (arg1 < 49) {
            field493 = null;
         }

         return ~arg0 <= -49 && ~arg0 >= -58;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field496[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method273(int arg0) {
      try {
         field495 = null;
         field493 = null;
         if (arg0 != -23589) {
            method272((char)65499, (byte)101);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field496[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method274(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method275(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
