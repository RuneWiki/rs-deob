import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class301 {
   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4291 = new String[]{method2296(method2295("k\bjtR")), method2296(method2295("k\bjwR"))};
   @OriginalMember(
      owner = "client!ao",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field4289 = new class101(134, 4);
   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "I"
   )
   public static int field4288;
   @OriginalMember(
      owner = "client!ao",
      name = "c",
      descriptor = "I"
   )
   public static int field4290;

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2293(byte arg0) {
      try {
         field4289 = null;
         if (arg0 <= 41) {
            field4290 = 57;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4291[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public static final void method2294(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg0 != -7208) {
            method2293((byte)123);
         }

         if (arg1) {
            ++class85.field1040;
            class350.method2737(false);
         }

         ++field4288;
         if (arg2) {
            ++class286.field4024;
            class200.method1539(arg0 ^ -7202);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4291[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2295(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2296(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
