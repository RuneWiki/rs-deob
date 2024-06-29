import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class99 {
   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1315 = new String[]{method902(method901("\u000bm\u0017z\u0004M")), method902(method901("\u000bm\u0017z\u0007M"))};
   @OriginalMember(
      owner = "client!naa",
      name = "d",
      descriptor = "Lsj;"
   )
   public static class417 field1312 = new class417(0, 0);
   @OriginalMember(
      owner = "client!naa",
      name = "b",
      descriptor = "I"
   )
   public static int field1310;
   @OriginalMember(
      owner = "client!naa",
      name = "c",
      descriptor = "I"
   )
   public static int field1311;
   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "I"
   )
   public static int field1313;
   @OriginalMember(
      owner = "client!naa",
      name = "e",
      descriptor = "I"
   )
   public static int field1314;

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method899(int arg0, int arg1, int arg2) {
      try {
         ++field1311;
         if (arg0 != 0) {
            method899(17, 68, 86);
         }

         return class430.method3324(125, arg2, arg1) | (2048 & arg1) != 0 || class481.method3656(true, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1315[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method900(int arg0) {
      try {
         if (arg0 != 241307872) {
            field1312 = null;
         }

         field1312 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1315[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method901(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method902(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
