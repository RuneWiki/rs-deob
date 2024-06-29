import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class class128 extends class247 {
   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2051 = new String[]{method1311(method1310("z\u0018\u0004ne")), method1311(method1310("z\u0018\u0004oe"))};
   @OriginalMember(
      owner = "client!kt",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2048 = null;
   @OriginalMember(
      owner = "client!kt",
      name = "l",
      descriptor = "I"
   )
   public static int field2047;
   @OriginalMember(
      owner = "client!kt",
      name = "k",
      descriptor = "I"
   )
   public static int field2049;
   @OriginalMember(
      owner = "client!kt",
      name = "j",
      descriptor = "I"
   )
   public static int field2050;

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public abstract void method608(class65 arg0, int arg1);

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1308(int arg0, int arg1) {
      try {
         class376.field5495 = arg0;
         ++field2050;
         class448.field6532.method1052(true);
         if (arg1 != 9106) {
            field2047 = -16;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2051[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(Lhka;B)V"
   )
   public abstract void method606(class360 arg0, byte arg1);

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1309(boolean arg0) {
      try {
         if (!arg0) {
            method1308(58, -93);
         }

         field2048 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2051[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1310(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1311(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
