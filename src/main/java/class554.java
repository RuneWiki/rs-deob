import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class554 extends class500 {
   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7628 = new String[]{method4001(method4000("\u0017a\u001c\u0016H")), method4001(method4000("\u0017a\u001c\u0017H"))};
   @OriginalMember(
      owner = "client!um",
      name = "m",
      descriptor = "Lnw;"
   )
   public static class616 field7625 = new class616(47, 7);
   @OriginalMember(
      owner = "client!um",
      name = "l",
      descriptor = "I"
   )
   public static int field7624;
   @OriginalMember(
      owner = "client!um",
      name = "k",
      descriptor = "Lqh;"
   )
   public static class74 field7626;
   @OriginalMember(
      owner = "client!um",
      name = "j",
      descriptor = "Lqh;"
   )
   public static class74 field7627;

   @OriginalMember(
      owner = "client!um",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3998(int arg0) {
      try {
         field7626 = null;
         field7627 = null;
         field7625 = null;
         if (arg0 != -1) {
            method3998(12);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7628[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3999(int arg0, int arg1) {
      try {
         ++field7624;
         class231.field2870 = arg0;
         class575.field7911 = arg1;
         class575.field7911 = -1;
         class245.method1842(arg1 ^ -91);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7628[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(B)I"
   )
   public abstract int method3707(byte arg0);

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(Z)I"
   )
   public abstract int method3705(boolean arg0);

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(B)J"
   )
   public abstract long method3702(byte arg0);

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method3706(int arg0);

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method3704(int arg0);

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4000(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4001(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
