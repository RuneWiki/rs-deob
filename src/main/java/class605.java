import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class605 {
   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8892 = new String[]{method4421(method4420("\u0011$5P")), method4421(method4420("\u0011$6P"))};
   @OriginalMember(
      owner = "client!v",
      name = "c",
      descriptor = "J"
   )
   public static volatile long field8891 = 0L;
   @OriginalMember(
      owner = "client!v",
      name = "d",
      descriptor = "I"
   )
   public static int field8889;
   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "Lat;"
   )
   public static class396 field8888;
   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "Lbt;"
   )
   public static class48 field8890;

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method4418(byte arg0) {
      try {
         field8890 = null;
         if (arg0 != -119) {
            field8888 = null;
         }

         field8888 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8892[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(IB)I",
      line = 18
   )
   public static final int method4419(int arg0, byte arg1) {
      try {
         if (arg1 >= -99) {
            field8888 = null;
         }

         ++field8889;
         int var2 = arg0 >>> 1;
         int var3 = var2 | var2 >>> 1;
         int var4 = var3 | var3 >>> 2;
         int var5 = var4 | var4 >>> 4;
         int var6 = var5 | var5 >>> 8;
         int var7 = var6 | var6 >>> 16;
         return ~var7 & arg0;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field8892[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4420(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4421(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
