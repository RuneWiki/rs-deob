import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class368 {
   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5468 = new String[]{method2874(method2873("\u001b,{[\u0002")), method2874(method2873("\u001b,{X\u0002"))};
   @OriginalMember(
      owner = "client!rq",
      name = "i",
      descriptor = "I"
   )
   public static int field5459 = 1405;
   @OriginalMember(
      owner = "client!rq",
      name = "d",
      descriptor = "F"
   )
   public static float field5462 = 0.25F;
   @OriginalMember(
      owner = "client!rq",
      name = "b",
      descriptor = "Lgh;"
   )
   public static class572 field5461 = new class572(31, 2);
   @OriginalMember(
      owner = "client!rq",
      name = "f",
      descriptor = "Lej;"
   )
   public static class133 field5464 = new class133();
   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5465 = false;
   @OriginalMember(
      owner = "client!rq",
      name = "c",
      descriptor = "[J"
   )
   public static long[] field5467 = new long[32];
   @OriginalMember(
      owner = "client!rq",
      name = "e",
      descriptor = "I"
   )
   public static int field5466 = -1;
   @OriginalMember(
      owner = "client!rq",
      name = "g",
      descriptor = "I"
   )
   public static int field5460;
   @OriginalMember(
      owner = "client!rq",
      name = "h",
      descriptor = "I"
   )
   public static int field5463;

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static final void method2871(byte arg0) {
      try {
         class270.field3814 = null;
         class202.field3020 = null;
         class207.field3090 = null;
         class515.field7505 = null;
         ++field5460;
         class377.field5597 = null;
         class587.field8493 = null;
         class375.field5578 = null;
         class15.field288 = null;
         int var1 = -126 % ((arg0 - -66) / 56);
         class689.field10130 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5468[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "b",
      descriptor = "(B)V",
      line = 21
   )
   public static void method2872(byte arg0) {
      try {
         if (arg0 < -68) {
            field5464 = null;
            field5461 = null;
            field5467 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5468[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2873(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2874(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
