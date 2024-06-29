import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class99 {
   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1276 = new String[]{method836(method835("F\u0011o\u001f}")), method836(method835("A\n-2")), method836(method835("TQop(")), method836(method835("F\u0011o\u001c}"))};
   @OriginalMember(
      owner = "client!in",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field1273 = new int[]{2047, 16383, 65535};
   @OriginalMember(
      owner = "client!in",
      name = "h",
      descriptor = "Leg;"
   )
   public static class118 field1270 = new class118(123, 2);
   @OriginalMember(
      owner = "client!in",
      name = "c",
      descriptor = "B"
   )
   public byte field1267;
   @OriginalMember(
      owner = "client!in",
      name = "g",
      descriptor = "I"
   )
   public static int field1265;
   @OriginalMember(
      owner = "client!in",
      name = "b",
      descriptor = "I"
   )
   public int field1269;
   @OriginalMember(
      owner = "client!in",
      name = "j",
      descriptor = "I"
   )
   public static int field1274;
   @OriginalMember(
      owner = "client!in",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field1266;
   @OriginalMember(
      owner = "client!in",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field1268;
   @OriginalMember(
      owner = "client!in",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field1271;
   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field1272;
   @OriginalMember(
      owner = "client!in",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1275;

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(BLjava/lang/String;Lwf;)I",
      line = 6
   )
   public static final int method833(byte arg0, String arg1, class147 arg2) {
      try {
         ++field1274;
         int var3 = arg2.field1856;
         byte[] var4 = class525.method3801(false, arg1);
         arg2.method1209(128, var4.length);
         if (arg0 < 49) {
            field1273 = null;
         }

         arg2.field1856 += class566.field8070.method5520(var4, true, arg2.field1856, var4.length, arg2.field1889, 0);
         return -var3 + arg2.field1856;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1276[3] + arg0 + ',' + (arg1 != null ? field1276[2] : field1276[1]) + ',' + (arg2 != null ? field1276[2] : field1276[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(I)V",
      line = 38
   )
   public static void method834(int arg0) {
      try {
         field1275 = null;
         field1270 = null;
         field1273 = null;
         if (arg0 > -61) {
            method833((byte)-127, (String)null, (class147)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1276[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method835(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method836(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
