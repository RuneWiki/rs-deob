import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class373 {
   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5226 = new String[]{method2955(method2954(";5\u0015%8")), method2955(method2954(";5\u0015&8")), method2955(method2954(";5\u0015$8"))};
   @OriginalMember(
      owner = "client!eq",
      name = "c",
      descriptor = "Lsia;"
   )
   public static class407 field5222 = new class407(3000000, 200);
   @OriginalMember(
      owner = "client!eq",
      name = "f",
      descriptor = "Lifa;"
   )
   public static class75 field5224 = new class75(10, 5);
   @OriginalMember(
      owner = "client!eq",
      name = "b",
      descriptor = "I"
   )
   public static int field5220;
   @OriginalMember(
      owner = "client!eq",
      name = "d",
      descriptor = "I"
   )
   public static int field5221;
   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "I"
   )
   public static int field5225;
   @OriginalMember(
      owner = "client!eq",
      name = "e",
      descriptor = "[Ls;"
   )
   public static class423[] field5223;

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method2951(int arg0, int arg1) {
      try {
         if (arg0 < 65) {
            field5225 = 119;
         }

         ++field5220;
         return arg1 >>> 7;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5226[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2952(int arg0, int arg1, int arg2) {
      try {
         ++field5221;
         int var3 = 91 % ((-17 - arg2) / 45);
         return ~(50560 & arg0) != -1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5226[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2953(int arg0) {
      try {
         field5223 = null;
         field5222 = null;
         field5224 = null;
         if (arg0 != 2) {
            field5223 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5226[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
