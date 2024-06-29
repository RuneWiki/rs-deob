import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public abstract class class213 extends class428 {
   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3043 = method1683(method1682("gtk\u0018Q="));
   @OriginalMember(
      owner = "client!rfa",
      name = "o",
      descriptor = "I"
   )
   public static int field3037 = 0;
   @OriginalMember(
      owner = "client!rfa",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field3036 = false;
   @OriginalMember(
      owner = "client!rfa",
      name = "q",
      descriptor = "I"
   )
   public static int field3041 = 0;
   @OriginalMember(
      owner = "client!rfa",
      name = "m",
      descriptor = "Leg;"
   )
   public static class118 field3040 = new class118(127, 6);
   @OriginalMember(
      owner = "client!rfa",
      name = "r",
      descriptor = "I"
   )
   public static int field3042 = 0;
   @OriginalMember(
      owner = "client!rfa",
      name = "p",
      descriptor = "B"
   )
   public static byte field3039;
   @OriginalMember(
      owner = "client!rfa",
      name = "s",
      descriptor = "Lkf;"
   )
   public static class266 field3038;

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(Lqv;Z)V"
   )
   public abstract void method1343(class472 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1681(int arg0) {
      try {
         field3040 = null;
         field3038 = null;
         if (arg0 != 0) {
            method1681(96);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3043 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public abstract void method1347(class147 arg0, byte arg1);

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1682(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1683(char[] arg0) {
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
            var10005 = 18;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
