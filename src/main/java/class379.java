import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class379 {
   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5467 = method2868(method2867("$NfK5"));
   @OriginalMember(
      owner = "client!ws",
      name = "h",
      descriptor = "Leg;"
   )
   public static class118 field5458 = new class118(87, 6);
   @OriginalMember(
      owner = "client!ws",
      name = "c",
      descriptor = "[Lwja;"
   )
   public static class281[] field5462 = null;
   @OriginalMember(
      owner = "client!ws",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field5466 = false;
   @OriginalMember(
      owner = "client!ws",
      name = "f",
      descriptor = "D"
   )
   public static double field5461;
   @OriginalMember(
      owner = "client!ws",
      name = "d",
      descriptor = "I"
   )
   public static int field5465;
   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "[B"
   )
   public byte[] field5463;
   @OriginalMember(
      owner = "client!ws",
      name = "g",
      descriptor = "[S"
   )
   public short[] field5459;
   @OriginalMember(
      owner = "client!ws",
      name = "i",
      descriptor = "[S"
   )
   public short[] field5460;
   @OriginalMember(
      owner = "client!ws",
      name = "b",
      descriptor = "[S"
   )
   public short[] field5464;

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2866(int arg0) {
      try {
         int var1 = -22 / ((arg0 - 63) / 45);
         field5458 = null;
         field5462 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5467 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2867(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2868(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
