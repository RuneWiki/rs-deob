import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class360 {
   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "I"
   )
   public int field5397;
   @OriginalMember(
      owner = "client!tk",
      name = "g",
      descriptor = "[I"
   )
   public int[] field5394;
   @OriginalMember(
      owner = "client!tk",
      name = "c",
      descriptor = "[I"
   )
   public int[] field5389;
   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5398 = new String[]{method2832(method2831("\u0006wx\u0001o\u001cu\"\u0003.")), method2832(method2831("\u0006wx\u007f.")), method2832(method2831("\u0006wx|."))};
   @OriginalMember(
      owner = "client!tk",
      name = "h",
      descriptor = "F"
   )
   public static float field5392;
   @OriginalMember(
      owner = "client!tk",
      name = "f",
      descriptor = "I"
   )
   public static int field5390;
   @OriginalMember(
      owner = "client!tk",
      name = "d",
      descriptor = "I"
   )
   public static int field5395;
   @OriginalMember(
      owner = "client!tk",
      name = "i",
      descriptor = "Lhw;"
   )
   public static class141 field5393;
   @OriginalMember(
      owner = "client!tk",
      name = "e",
      descriptor = "Lbh;"
   )
   public static class40 field5396;
   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field5391;

   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2829(int arg0) {
      try {
         class104.method991(4440, false);
         ++field5390;
         if (arg0 <= class85.field1389 && ~class85.field1389 != -1) {
            class363.method2847((byte)34, false, class85.field1389);
            class85.field1389 = -1;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5398[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2830(int arg0) {
      try {
         if (arg0 == 0) {
            field5391 = null;
            field5396 = null;
            field5393 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5398[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class360(int arg0) {
      try {
         this.field5397 = arg0;
         this.field5394 = new int[this.field5397];
         this.field5389 = new int[this.field5397];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5398[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2831(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2832(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
