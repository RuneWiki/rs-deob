import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class110 {
   @OriginalMember(
      owner = "client!qha",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field1345;
   @OriginalMember(
      owner = "client!qha",
      name = "g",
      descriptor = "I"
   )
   public int field1347;
   @OriginalMember(
      owner = "client!qha",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field1343;
   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "J"
   )
   public long field1344;
   @OriginalMember(
      owner = "client!qha",
      name = "d",
      descriptor = "I"
   )
   public int field1342;
   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1349 = new String[]{method944(method943("Q\u001dCm")), method944(method943("DF\u0001/W")), method944(method943("N\u0000N/\u0016V\u0006Fu\u0014\u0017")), method944(method943("N\u0000N/k\u0017"))};
   @OriginalMember(
      owner = "client!qha",
      name = "b",
      descriptor = "Lhn;"
   )
   public static class751 field1341 = new class751(7, 16);
   @OriginalMember(
      owner = "client!qha",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field1346 = false;
   @OriginalMember(
      owner = "client!qha",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field1348 = false;

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method942(int arg0) {
      try {
         field1341 = null;
         if (arg0 != 16) {
            field1341 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1349[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "<init>",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V"
   )
   public class110(int arg0, String arg1, int arg2, String arg3, long arg4) {
      try {
         this.field1345 = arg3;
         this.field1347 = arg0;
         this.field1343 = arg1;
         this.field1344 = arg4;
         this.field1342 = arg2;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1349[2] + arg0 + ',' + (arg1 != null ? field1349[1] : field1349[0]) + ',' + arg2 + ',' + (arg3 != null ? field1349[1] : field1349[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method943(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method944(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
