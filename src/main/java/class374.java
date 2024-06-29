import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class374 {
   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5237 = new String[]{method2959(method2958("\u000b7sW7")), method2959(method2958("\u000b7sT7")), method2959(method2958("\u000b7sap,$/|q\u0018x"))};
   @OriginalMember(
      owner = "client!tg",
      name = "f",
      descriptor = "Ltg;"
   )
   public static class374 field5228 = new class374();
   @OriginalMember(
      owner = "client!tg",
      name = "c",
      descriptor = "Ltg;"
   )
   public static class374 field5229 = new class374();
   @OriginalMember(
      owner = "client!tg",
      name = "g",
      descriptor = "Ltg;"
   )
   public static class374 field5232 = new class374();
   @OriginalMember(
      owner = "client!tg",
      name = "b",
      descriptor = "Ltg;"
   )
   public static class374 field5233 = new class374();
   @OriginalMember(
      owner = "client!tg",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field5234 = false;
   @OriginalMember(
      owner = "client!tg",
      name = "h",
      descriptor = "[S"
   )
   public static short[] field5236 = new short[256];
   @OriginalMember(
      owner = "client!tg",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field5235 = new int[4];
   @OriginalMember(
      owner = "client!tg",
      name = "j",
      descriptor = "I"
   )
   public static int field5227;
   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "I"
   )
   public static int field5230;
   @OriginalMember(
      owner = "client!tg",
      name = "e",
      descriptor = "I"
   )
   public static int field5231;

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2956(int arg0) {
      try {
         if (arg0 == 1585) {
            ++field5231;
            class48.field615 = class368.method2906(0.4F, true, 8, 2048, (byte)-2, 4, 8, 35);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5237[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5227;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5237[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2957(byte arg0) {
      try {
         field5235 = null;
         field5228 = null;
         field5229 = null;
         if (arg0 < 0) {
            field5236 = null;
         }

         field5236 = null;
         field5233 = null;
         field5232 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5237[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2958(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2959(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
