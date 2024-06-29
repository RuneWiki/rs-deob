import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {
   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field91 = new String[]{method48(method47("\u000f\tKtN")), method48(method47("\u000f\tKuN")), method48(method47("\u000f\tKwN"))};
   @OriginalMember(
      owner = "client!ff",
      name = "f",
      descriptor = "I"
   )
   public static int field83 = 0;
   @OriginalMember(
      owner = "client!ff",
      name = "h",
      descriptor = "Lqca;"
   )
   public static class127 field85 = new class127(0, 1);
   @OriginalMember(
      owner = "client!ff",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field88 = new String[200];
   @OriginalMember(
      owner = "client!ff",
      name = "c",
      descriptor = "I"
   )
   public static int field90 = 0;
   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "Lwv;"
   )
   public static class37 field89 = new class37(16);
   @OriginalMember(
      owner = "client!ff",
      name = "e",
      descriptor = "I"
   )
   public static int field84;
   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "I"
   )
   public static int field86;
   @OriginalMember(
      owner = "client!ff",
      name = "g",
      descriptor = "I"
   )
   public static int field87;

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static final void method44(byte arg0) {
      try {
         class484.field6927 = 0L;
         class43.field597 = "";
         if (arg0 >= -34) {
            method44((byte)96);
         }

         ++field84;
         class203.field2883 = -1;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field91[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method45(int arg0) {
      try {
         field85 = null;
         if (arg0 < -28) {
            field88 = null;
            field89 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field91[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 37
   )
   public static final void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         ++field86;
         int var12 = arg3 + 1;
         class149.method1249(-7, arg5, arg4, class341.field4631[arg3], arg0);
         int var11 = arg1 - 1;
         class149.method1249(-7, arg5, arg4, class341.field4631[arg1], arg0);
         if (arg2 != 0) {
            method44((byte)100);
         }

         int var7 = var12;
         if (var6 || var12 <= var11) {
            do {
               int[] var8 = class341.field4631[var7];
               var8[arg5] = var8[arg0] = arg4;
               ++var7;
            } while(var7 <= var11);

         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field91[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method47(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method48(char[] arg0) {
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
            var10005 = 111;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
