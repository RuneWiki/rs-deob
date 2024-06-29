import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class169 extends class347 {
   @OriginalMember(
      owner = "client!jh",
      name = "k",
      descriptor = "S"
   )
   public short field2100;
   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2103 = new String[]{method1364(method1363("2\u0010jyF")), method1364(method1363("2\u0010jzF")), method1364(method1363("2\u0010j\u0007\u00076\u00110\u0005F"))};
   @OriginalMember(
      owner = "client!jh",
      name = "j",
      descriptor = "I"
   )
   public static int field2102;
   @OriginalMember(
      owner = "client!jh",
      name = "i",
      descriptor = "Lgq;"
   )
   public static class540 field2101;

   @OriginalMember(
      owner = "client!jh",
      name = "<init>",
      descriptor = "()V",
      line = 7
   )
   public class169() {
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public static void method1361(int arg0) {
      try {
         field2101 = null;
         if (arg0 != -1) {
            field2101 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2103[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(IB)V",
      line = 21
   )
   public static final void method1362(int arg0, byte arg1) {
      try {
         ++field2102;
         if (class647.method4669(arg0, (byte)-99)) {
            class604.method4412(-1, (byte)98, class136.field1744[arg0]);
            int var2 = 18 / ((-47 - arg1) / 55);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2103[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "<init>",
      descriptor = "(S)V",
      line = 34
   )
   public class169(short arg0) {
      try {
         this.field2100 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2103[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1363(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1364(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
