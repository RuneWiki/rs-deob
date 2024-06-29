import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class294 extends class428 {
   @OriginalMember(
      owner = "client!mm",
      name = "t",
      descriptor = "Z"
   )
   public boolean field4060 = false;
   @OriginalMember(
      owner = "client!mm",
      name = "B",
      descriptor = "Z"
   )
   public boolean field4054 = true;
   @OriginalMember(
      owner = "client!mm",
      name = "D",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4061 = method2218(method2217("b\u000btC\\"));
   @OriginalMember(
      owner = "client!mm",
      name = "A",
      descriptor = "I"
   )
   public static int field4045 = 0;
   @OriginalMember(
      owner = "client!mm",
      name = "x",
      descriptor = "I"
   )
   public static int field4047 = 0;
   @OriginalMember(
      owner = "client!mm",
      name = "y",
      descriptor = "I"
   )
   public int field4044;
   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "I"
   )
   public int field4048;
   @OriginalMember(
      owner = "client!mm",
      name = "o",
      descriptor = "I"
   )
   public int field4049;
   @OriginalMember(
      owner = "client!mm",
      name = "C",
      descriptor = "I"
   )
   public int field4050;
   @OriginalMember(
      owner = "client!mm",
      name = "r",
      descriptor = "I"
   )
   public int field4051;
   @OriginalMember(
      owner = "client!mm",
      name = "w",
      descriptor = "I"
   )
   public int field4052;
   @OriginalMember(
      owner = "client!mm",
      name = "m",
      descriptor = "I"
   )
   public int field4053;
   @OriginalMember(
      owner = "client!mm",
      name = "n",
      descriptor = "I"
   )
   public int field4056;
   @OriginalMember(
      owner = "client!mm",
      name = "p",
      descriptor = "I"
   )
   public int field4057;
   @OriginalMember(
      owner = "client!mm",
      name = "q",
      descriptor = "I"
   )
   public int field4058;
   @OriginalMember(
      owner = "client!mm",
      name = "u",
      descriptor = "Lud;"
   )
   public class39 field4059;
   @OriginalMember(
      owner = "client!mm",
      name = "v",
      descriptor = "Lnu;"
   )
   public static class619 field4055;
   @OriginalMember(
      owner = "client!mm",
      name = "s",
      descriptor = "Llj;"
   )
   public static class635 field4046;

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2216(boolean arg0) {
      try {
         field4055 = null;
         if (!arg0) {
            method2216(true);
         }

         field4046 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4061 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2217(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2218(char[] arg0) {
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
            var10005 = 102;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
