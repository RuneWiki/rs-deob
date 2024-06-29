import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class288 implements class475 {
   @OriginalMember(
      owner = "client!vja",
      name = "h",
      descriptor = "Leaa;"
   )
   private class526 field4040;
   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4048 = new String[]{method2197(method2196("*ec\u001d\u00125akG\u0010t")), method2197(method2196("2zn_")), method2197(method2196("'!,\u001dS")), method2197(method2196("*ec\u001djt")), method2197(method2196("*ec\u001dlt")), method2197(method2196("*ec\u001dmt")), method2197(method2196("*ec\u001dot"))};
   @OriginalMember(
      owner = "client!vja",
      name = "g",
      descriptor = "Lnda;"
   )
   public static class583 field4042 = new class583();
   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4046 = new String[5];
   @OriginalMember(
      owner = "client!vja",
      name = "e",
      descriptor = "I"
   )
   public static int field4041;
   @OriginalMember(
      owner = "client!vja",
      name = "d",
      descriptor = "I"
   )
   public static int field4043;
   @OriginalMember(
      owner = "client!vja",
      name = "f",
      descriptor = "I"
   )
   public static int field4044;
   @OriginalMember(
      owner = "client!vja",
      name = "c",
      descriptor = "Leaa;"
   )
   public static class526 field4047;
   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "Lda;"
   )
   public static class67 field4045;

   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public static void method2194(int arg0) {
      try {
         field4047 = null;
         field4045 = null;
         field4046 = null;
         field4042 = null;
         if (arg0 != 0) {
            method2194(-19);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4048[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(I)Lam;",
      line = 17
   )
   public final class658 method1241(int arg0) {
      try {
         if (arg0 != -1321) {
            this.method1241(-14);
         }

         ++field4041;
         return class658.field9544;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4048[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(B)I",
      line = 28
   )
   public final int method1242(byte arg0) {
      try {
         int var2 = 84 % ((45 - arg0) / 44);
         ++field4043;
         return this.field4040.method3882(-121) ? 100 : this.field4040.method3893(-58);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4048[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "<init>",
      descriptor = "(Leaa;)V",
      line = 43
   )
   public class288(class526 arg0) {
      try {
         this.field4040 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4048[0] + (arg0 != null ? field4048[2] : field4048[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(Leaa;Lha;I)V",
      line = 56
   )
   public static final void method2195(class526 param0, class66 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2196(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2197(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
