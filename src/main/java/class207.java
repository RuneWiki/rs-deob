import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class207 implements class99 {
   @OriginalMember(
      owner = "client!vb",
      name = "e",
      descriptor = "Lkaa;"
   )
   private class51 field2542;
   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "Lqh;"
   )
   private class74 field2541;
   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2548 = new String[]{method1571(method1570("Y3`\u0017:")), method1571(method1570("Y3`\u001c:")), method1571(method1570("Y3`\u0016:")), method1571(method1570("Y3`i{A8:k:")), method1571(method1570("A$\"9")), method1571(method1570("T\u007f`{o")), method1571(method1570("Y3`\u0014:"))};
   @OriginalMember(
      owner = "client!vb",
      name = "d",
      descriptor = "I"
   )
   public static int field2543;
   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "I"
   )
   public static int field2544;
   @OriginalMember(
      owner = "client!vb",
      name = "f",
      descriptor = "I"
   )
   public static int field2545;
   @OriginalMember(
      owner = "client!vb",
      name = "c",
      descriptor = "I"
   )
   public static int field2546;
   @OriginalMember(
      owner = "client!vb",
      name = "g",
      descriptor = "Lbo;"
   )
   private class763 field2547;

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method905(int arg0) {
      try {
         if (arg0 == -15238) {
            this.field2547 = class583.method4187(this.field2541, this.field2542.field566, -84);
            ++field2546;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2548[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method907(boolean arg0) {
      try {
         ++field2544;
         if (!arg0) {
            this.method906(-71, true);
         }

         return this.field2541.method717(this.field2542.field566, (byte)-58);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2548[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method906(int arg0, boolean arg1) {
      try {
         ++field2543;
         if (arg0 != 29560) {
            method1569(-41, 100);
         }

         if (arg1) {
            int var3 = ~class252.field3194 >= ~class698.field10190 ? class698.field10190 : class252.field3194;
            int var4 = class41.field479 <= class420.field5892 ? class420.field5892 : class41.field479;
            int var5 = this.field2547.method2125();
            int var6 = this.field2547.method2129();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (-var9 + var4) / 2;
            if (var4 < var9) {
               var10 = 0;
               var9 = var4;
               var8 = var4 * var5 / var6;
               var7 = (-var8 + var3) / 2;
            }

            this.field2547.method5477(var7, var10, var8, var9);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2548[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(II)Llca;"
   )
   public static final class674 method1569(int arg0, int arg1) {
      try {
         ++field2545;
         class674 var2 = (class674)class199.field2404.method4239((long)arg0, arg1 + -23258);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class20.field249.method732(arg0, 0, (byte)117);
            class674 var4 = new class674();
            if (arg1 != 23258) {
               return null;
            } else {
               if (var3 != null) {
                  var4.method4941(new class594(var3), arg0, arg1 ^ -28927);
               }

               class199.field2404.method4238(86, var4, (long)arg0);
               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2548[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "<init>",
      descriptor = "(Lqh;Lkaa;)V"
   )
   public class207(class74 arg0, class51 arg1) {
      try {
         this.field2542 = arg1;
         this.field2541 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2548[3] + (arg0 != null ? field2548[5] : field2548[4]) + ',' + (arg1 != null ? field2548[5] : field2548[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1570(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1571(char[] arg0) {
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
            var10005 = 81;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
