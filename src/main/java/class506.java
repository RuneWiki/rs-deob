import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class506 {
   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7480 = new String[]{method3758(method3757("&(D\u00125")), method3758(method3757("&(D\u00175")), method3758(method3757("&(D\u00115")), method3758(method3757("&(D\u00105"))};
   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "I"
   )
   public static int field7472 = 0;
   @OriginalMember(
      owner = "client!bi",
      name = "c",
      descriptor = "I"
   )
   public static int field7477 = 0;
   @OriginalMember(
      owner = "client!bi",
      name = "h",
      descriptor = "[Ldq;"
   )
   public static class726[] field7478 = new class726[1024];
   @OriginalMember(
      owner = "client!bi",
      name = "g",
      descriptor = "Lsd;"
   )
   public static class101 field7473 = new class101(34, -2);
   @OriginalMember(
      owner = "client!bi",
      name = "f",
      descriptor = "I"
   )
   public static int field7471;
   @OriginalMember(
      owner = "client!bi",
      name = "d",
      descriptor = "I"
   )
   public static int field7474;
   @OriginalMember(
      owner = "client!bi",
      name = "i",
      descriptor = "I"
   )
   public static int field7475;
   @OriginalMember(
      owner = "client!bi",
      name = "e",
      descriptor = "I"
   )
   public static int field7479;
   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "[Lat;"
   )
   public static class396[] field7476;

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(III)Z",
      line = 11
   )
   public static final boolean method3753(int arg0, int arg1, int arg2) {
      try {
         ++field7475;
         if (arg0 != 13596) {
            field7476 = null;
         }

         return class576.method4256(arg1, arg2, 83) & (~(8192 & arg2) != -1 | class3.method32(arg1, (byte)66, arg2) | class587.method4330(arg2, arg1, -92));
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7480[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(B)V",
      line = 22
   )
   public static void method3754(byte arg0) {
      try {
         field7478 = null;
         field7476 = null;
         field7473 = null;
         int var1 = 126 % ((-35 - arg0) / 63);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7480[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "(III)I",
      line = 34
   )
   public static final int method3755(int arg0, int arg1, int arg2) {
      try {
         ++field7474;
         if (arg2 != 27356) {
            method3755(39, -61, 113);
         }

         int var3 = arg0 >>> 31;
         return (arg0 + var3) / arg1 - var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7480[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(IB)Z",
      line = 59
   )
   public static final boolean method3756(int arg0, byte arg1) {
      try {
         ++field7471;
         if (arg1 != -128) {
            method3753(-77, 26, 87);
         }

         return arg0 == 0 || arg0 == 2;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7480[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3757(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3758(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
