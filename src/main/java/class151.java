import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class151 implements class475 {
   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private String field1897;
   @OriginalMember(
      owner = "client!fea",
      name = "e",
      descriptor = "Leaa;"
   )
   private class526 field1894;
   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1899 = new String[]{method1244(method1243("Qd\u000e+\u0012\u001f")), method1244(method1243("Qd\u000e+\u0010\u001f")), method1244(method1243("Yt\u0003i")), method1244(method1243("L/A+,")), method1244(method1243("Qd\u000e+m^o\u0006qo\u001f")), method1244(method1243("Qd\u000e+\u0013\u001f"))};
   @OriginalMember(
      owner = "client!fea",
      name = "d",
      descriptor = "I"
   )
   public static int field1895;
   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "I"
   )
   public static int field1898;
   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "Lvfa;"
   )
   public static class699 field1896;

   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "(I)V",
      line = 6
   )
   public static void method1240(int arg0) {
      try {
         field1896 = null;
         int var1 = 100 / ((arg0 - -15) / 51);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1899[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(I)Lam;",
      line = 18
   )
   public final class658 method1241(int arg0) {
      try {
         if (arg0 != -1321) {
            return null;
         } else {
            ++field1898;
            return class658.field9547;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1899[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(B)I",
      line = 30
   )
   public final int method1242(byte arg0) {
      try {
         ++field1895;
         int var2 = 101 % ((arg0 - 45) / 44);
         return this.field1894.method3891((byte)102, this.field1897) ? 100 : 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1899[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "<init>",
      descriptor = "(Leaa;Ljava/lang/String;)V",
      line = 42
   )
   public class151(class526 arg0, String arg1) {
      try {
         this.field1897 = arg1;
         this.field1894 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1899[4] + (arg0 != null ? field1899[3] : field1899[2]) + ',' + (arg1 != null ? field1899[3] : field1899[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1243(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1244(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
