import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class337 {
   @OriginalMember(
      owner = "client!dc",
      name = "m",
      descriptor = "I"
   )
   public int field4611 = -1;
   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4621 = new String[]{method2667(method2666("4o\u0001\fa")), method2667(method2666(">yC!")), method2667(method2666("+\"\u0001c4")), method2667(method2666("4o\u0001\u000fa"))};
   @OriginalMember(
      owner = "client!dc",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field4608 = false;
   @OriginalMember(
      owner = "client!dc",
      name = "c",
      descriptor = "I"
   )
   public static int field4609 = -2;
   @OriginalMember(
      owner = "client!dc",
      name = "j",
      descriptor = "I"
   )
   public int field4610;
   @OriginalMember(
      owner = "client!dc",
      name = "i",
      descriptor = "I"
   )
   public int field4612;
   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "I"
   )
   public int field4613;
   @OriginalMember(
      owner = "client!dc",
      name = "d",
      descriptor = "I"
   )
   public int field4614;
   @OriginalMember(
      owner = "client!dc",
      name = "f",
      descriptor = "I"
   )
   public int field4615;
   @OriginalMember(
      owner = "client!dc",
      name = "h",
      descriptor = "I"
   )
   public int field4616;
   @OriginalMember(
      owner = "client!dc",
      name = "k",
      descriptor = "I"
   )
   public int field4617;
   @OriginalMember(
      owner = "client!dc",
      name = "g",
      descriptor = "I"
   )
   public int field4618;
   @OriginalMember(
      owner = "client!dc",
      name = "l",
      descriptor = "I"
   )
   public static int field4620;
   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "Lha;"
   )
   public static class479 field4619;

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;"
   )
   public static final Class method2664(String arg0, int arg1) throws ClassNotFoundException {
      try {
         ++field4620;
         if (arg0.equals("B")) {
            return Byte.TYPE;
         } else if (arg0.equals("I")) {
            return Integer.TYPE;
         } else if (arg0.equals("S")) {
            return Short.TYPE;
         } else if (arg0.equals("J")) {
            return Long.TYPE;
         } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
         } else if (arg0.equals("F")) {
            return Float.TYPE;
         } else {
            if (arg1 > -122) {
               method2665((byte)71);
            }

            if (arg0.equals("D")) {
               return Double.TYPE;
            } else {
               return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4621[0] + (arg0 != null ? field4621[2] : field4621[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2665(byte arg0) {
      try {
         if (arg0 > -114) {
            method2665((byte)127);
         }

         field4619 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4621[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2666(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2667(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
