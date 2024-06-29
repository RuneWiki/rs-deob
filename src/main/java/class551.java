import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class551 {
   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8116 = new String[]{method4173(method4172("|AS &")), method4173(method4172("|AS#&"))};
   @OriginalMember(
      owner = "client!wq",
      name = "b",
      descriptor = "Lsia;"
   )
   public static class407 field8114 = new class407(10);
   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "I"
   )
   public static int field8115;

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4170(int arg0) {
      try {
         ++field8115;
         class757.field11093.method5438(true, class757.field11093.field10983, 1);
         class757.field11093.method5438(true, class757.field11093.field10978, 1);
         class757.field11093.method5438(true, class757.field11093.field11004, 1);
         class757.field11093.method5438(true, class757.field11093.field11018, 1);
         class757.field11093.method5438(true, class757.field11093.field11011, 1);
         class757.field11093.method5438(true, class757.field11093.field10967, 1);
         class757.field11093.method5438(true, class757.field11093.field10987, arg0);
         class757.field11093.method5438(true, class757.field11093.field10998, 0);
         class757.field11093.method5438(true, class757.field11093.field11015, 0);
         class757.field11093.method5438(true, class757.field11093.field11003, 0);
         class757.field11093.method5438(true, class757.field11093.field10973, 0);
         class757.field11093.method5438(true, class757.field11093.field11016, 0);
         class757.field11093.method5438(true, class757.field11093.field11005, 0);
         class757.field11093.method5438(true, class757.field11093.field10999, 0);
         class757.field11093.method5438(true, class757.field11093.field11019, 0);
         class757.field11093.method5438(true, class757.field11093.field10969, 0);
         class757.field11093.method5438(true, class757.field11093.field10972, 0);
         class757.field11093.method5438(true, class757.field11093.field11009, 0);
         class757.field11093.method5438(true, class757.field11093.field11000, 0);
         class315.method2498((byte)23);
         class757.field11093.method5438(true, class757.field11093.field11010, 2);
         class757.field11093.method5438(true, class757.field11093.field10966, 2);
         class281.method2266(true);
         class274.method2167(-1662);
         class187.field2382 = true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8116[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4171(byte arg0) {
      try {
         if (arg0 > 25) {
            field8114 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8116[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4172(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4173(char[] arg0) {
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
            var10005 = 48;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
