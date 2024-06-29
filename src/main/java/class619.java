import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class619 extends class37 {
   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9031 = new String[]{method4480(method4479("\u0015^~ t")), method4480(method4479("\u0015^~#t"))};
   @OriginalMember(
      owner = "client!et",
      name = "e",
      descriptor = "Lma;"
   )
   public static class14 field9027 = new class14();
   @OriginalMember(
      owner = "client!et",
      name = "h",
      descriptor = "I"
   )
   public static int field9030 = -1;
   @OriginalMember(
      owner = "client!et",
      name = "g",
      descriptor = "I"
   )
   public static int field9028;
   @OriginalMember(
      owner = "client!et",
      name = "f",
      descriptor = "Lwi;"
   )
   public static class491 field9029;

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4477(byte arg0) {
      try {
         if (arg0 != 11) {
            method4477((byte)-27);
         }

         field9029 = null;
         field9027 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9031[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4478(int arg0) {
      try {
         if (arg0 != -1) {
            method4477((byte)101);
         }

         class488.field7220.method5680(true);
         ++field9028;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9031[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4479(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4480(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
