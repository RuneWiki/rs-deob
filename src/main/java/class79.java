import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class79 {
   @OriginalMember(
      owner = "client!jba",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field1052;
   @OriginalMember(
      owner = "client!jba",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field1051;
   @OriginalMember(
      owner = "client!jba",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field1057;
   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1058 = new String[]{method745(method744("\u0003V\rd")), method745(method744("\u0007A\u0000&~\u0004M\b||E")), method745(method744("\u0016\rO&?")), method745(method744("\u0007A\u0000&\u0003E"))};
   @OriginalMember(
      owner = "client!jba",
      name = "b",
      descriptor = "I"
   )
   public static int field1054 = 0;
   @OriginalMember(
      owner = "client!jba",
      name = "e",
      descriptor = "I"
   )
   public static int field1053 = 0;
   @OriginalMember(
      owner = "client!jba",
      name = "d",
      descriptor = "I"
   )
   public static int field1056 = 0;
   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "I"
   )
   public static int field1055;

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "([BIII)[B"
   )
   public static final byte[] method743(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1055;
         byte[] var4 = new byte[arg3];
         class107.method1027(arg0, arg1, var4, 0, arg3);
         if (arg2 >= -12) {
            method743((byte[])null, 28, 107, -68);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1058[3] + (arg0 != null ? field1058[2] : field1058[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
   )
   public class79(String arg0, String arg1, String arg2) {
      try {
         this.field1052 = arg2;
         this.field1051 = arg0;
         this.field1057 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1058[1] + (arg0 != null ? field1058[2] : field1058[0]) + ',' + (arg1 != null ? field1058[2] : field1058[0]) + ',' + (arg2 != null ? field1058[2] : field1058[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method744(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method745(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
