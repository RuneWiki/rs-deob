import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class271 {
   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3746 = method2085(method2084("xm\u0010(c#"));
   @OriginalMember(
      owner = "client!sda",
      name = "c",
      descriptor = "Lqca;"
   )
   public static class127 field3741 = new class127(7, 2);
   @OriginalMember(
      owner = "client!sda",
      name = "b",
      descriptor = "Lep;"
   )
   public static class446 field3743 = new class446(2);
   @OriginalMember(
      owner = "client!sda",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field3745 = new int[250];
   @OriginalMember(
      owner = "client!sda",
      name = "d",
      descriptor = "I"
   )
   public static int field3740;
   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "Ld;"
   )
   public static class162 field3742;
   @OriginalMember(
      owner = "client!sda",
      name = "f",
      descriptor = "Lci;"
   )
   public static class476 field3744;

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method2079(int arg0, int arg1);

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(B)Lik;"
   )
   public abstract class223 method2080(byte arg0);

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2081(int arg0) {
      try {
         field3744 = null;
         field3745 = null;
         if (arg0 != 2) {
            field3745 = null;
         }

         field3742 = null;
         field3741 = null;
         field3743 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3746 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "b",
      descriptor = "(II)[B"
   )
   public abstract byte[] method2082(int arg0, int arg1);

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(IB)I"
   )
   public abstract int method2083(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2084(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2085(char[] arg0) {
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
            var10005 = 9;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
