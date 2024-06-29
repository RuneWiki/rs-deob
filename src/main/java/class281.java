import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class281 {
   @OriginalMember(
      owner = "client!wja",
      name = "d",
      descriptor = "Lda;"
   )
   public class67 field3906 = null;
   @OriginalMember(
      owner = "client!wja",
      name = "b",
      descriptor = "Lru;"
   )
   public class206 field3908 = null;
   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3910 = new String[]{method2141(method2140("[\u001fdT")), method2141(method2140("B\u0000i\u0016/\\\u0004aL-\u001d")), method2141(method2140("ND&\u0016n")), method2141(method2140("B\u0000i\u0016Q\u001d")), method2141(method2140("B\u0000i\u0016R\u001d"))};
   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "I"
   )
   public static int field3905 = 13156520;
   @OriginalMember(
      owner = "client!wja",
      name = "e",
      descriptor = "I"
   )
   public static int field3907;
   @OriginalMember(
      owner = "client!wja",
      name = "c",
      descriptor = "I"
   )
   public static int field3909;
   @OriginalMember(
      owner = "client!wja",
      name = "f",
      descriptor = "Lkf;"
   )
   public static class266 field3904;

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method2138(byte arg0, int arg1) {
      try {
         if (arg0 < 19) {
            field3907 = -23;
         }

         ++field3909;
         return 127 & arg1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3910[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2139(int arg0) {
      try {
         field3904 = null;
         if (arg0 != 13156520) {
            field3904 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3910[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "<init>",
      descriptor = "(Lda;)V"
   )
   public class281(class67 arg0) {
      try {
         this.field3906 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3910[1] + (arg0 != null ? field3910[2] : field3910[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "<init>",
      descriptor = "(Lda;Lru;)V"
   )
   public class281(class67 arg0, class206 arg1) {
      try {
         this.field3908 = arg1;
         this.field3906 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3910[1] + (arg0 != null ? field3910[2] : field3910[0]) + ',' + (arg1 != null ? field3910[2] : field3910[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2140(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2141(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
