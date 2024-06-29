import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class76 {
   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field972 = new String[]{method742(method741("|)/rE")), method742(method741("|)/pE"))};
   @OriginalMember(
      owner = "client!sh",
      name = "c",
      descriptor = "Lsd;"
   )
   public static class101 field971 = new class101(23, -2);
   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "I"
   )
   public static int field969;
   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "I"
   )
   public static int field970;

   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method738(int arg0) {
      try {
         if (arg0 != -1) {
            field971 = null;
         }

         field971 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field972[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method739(int arg0) {
      try {
         class175.field2176 = -1;
         if (arg0 > -7) {
            field971 = null;
         }

         class134.field1686 = 0;
         class639.field9316 = -1;
         class637.field9260 = -1;
         ++field969;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field972[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "c",
      descriptor = "(I)J"
   )
   public abstract long method740(int arg0);

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method741(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method742(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
