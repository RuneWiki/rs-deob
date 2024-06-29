import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class362 implements class99 {
   @OriginalMember(
      owner = "client!ng",
      name = "b",
      descriptor = "Lqh;"
   )
   private class74 field5135;
   @OriginalMember(
      owner = "client!ng",
      name = "j",
      descriptor = "Lqh;"
   )
   private class74 field5138;
   @OriginalMember(
      owner = "client!ng",
      name = "i",
      descriptor = "Lhu;"
   )
   private class141 field5128;
   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5139 = new String[]{method2818(method2817("T\u000fP\u0011")), method2818(method2817("AT\u0012S\u0011")), method2818(method2817("T\u001d\u0012A\u0005T\u0013HCD")), method2818(method2817("T\u001d\u0012<D")), method2818(method2817("T\u001d\u0012>D")), method2818(method2817("T\u001d\u00124D")), method2818(method2817("T\u001d\u00128D")), method2818(method2817("T\u001d\u00129D")), method2818(method2817("T\u001d\u0012?D"))};
   @OriginalMember(
      owner = "client!ng",
      name = "f",
      descriptor = "Ljava/lang/Object;"
   )
   public static volatile Object field5132 = null;
   @OriginalMember(
      owner = "client!ng",
      name = "h",
      descriptor = "I"
   )
   public static int field5131 = 0;
   @OriginalMember(
      owner = "client!ng",
      name = "k",
      descriptor = "I"
   )
   public static int field5129;
   @OriginalMember(
      owner = "client!ng",
      name = "d",
      descriptor = "I"
   )
   public static int field5130;
   @OriginalMember(
      owner = "client!ng",
      name = "g",
      descriptor = "I"
   )
   public static int field5134;
   @OriginalMember(
      owner = "client!ng",
      name = "e",
      descriptor = "I"
   )
   public static int field5136;
   @OriginalMember(
      owner = "client!ng",
      name = "c",
      descriptor = "I"
   )
   public static int field5137;
   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "Lda;"
   )
   private class66 field5133;

   @OriginalMember(
      owner = "client!ng",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2814(int arg0) {
      try {
         field5132 = null;
         if (arg0 > -20) {
            method2814(32);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5139[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(CI)Z"
   )
   public static final boolean method2815(char arg0, int arg1) {
      try {
         ++field5129;
         if (arg1 >= -90) {
            method2814(127);
         }

         return ~arg0 == -161 || arg0 == ' ' || ~arg0 == -96 || ~arg0 == -46;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5139[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method905(int arg0) {
      try {
         ++field5134;
         class663 var2 = class287.method2176(this.field5128.field1888, arg0 ^ -15262, this.field5138);
         this.field5133 = class338.field4832.method496(var2, class267.method2046(this.field5135, this.field5128.field1888), true);
         if (arg0 != -15238) {
            method2815((char)65487, 86);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5139[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2816(byte arg0) {
      try {
         ++field5130;
         int var1 = -10 % ((-83 - arg0) / 43);
         class561.field7692.method1851(-62);
         class507.field7016.method1851(126);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5139[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method907(boolean arg0) {
      try {
         ++field5136;
         boolean var2 = arg0;
         if (!this.field5135.method717(this.field5128.field1888, (byte)-58)) {
            var2 = false;
         }

         if (!this.field5138.method717(this.field5128.field1888, (byte)-58)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5139[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method906(int arg0, boolean arg1) {
      try {
         if (arg1) {
            int var3 = this.field5128.field1883.method1433(this.field5128.field1877, class698.field10190, arg0 ^ 29561) + this.field5128.field1880;
            int var4 = this.field5128.field1882.method1325(this.field5128.field1884, class420.field5892, arg0 ^ 21231) + this.field5128.field1885;
            this.field5133.method628((class763[])null, this.field5128.field1879, var4, this.field5128.field1877, (byte)92, (int[])null, this.field5128.field1881, (class516)null, this.field5128.field1891, this.field5128.field1889, this.field5128.field1876, var3, 0, this.field5128.field1875, this.field5128.field1884, 0);
         }

         ++field5137;
         if (arg0 != 29560) {
            this.field5128 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5139[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "<init>",
      descriptor = "(Lqh;Lqh;Lhu;)V"
   )
   public class362(class74 arg0, class74 arg1, class141 arg2) {
      try {
         this.field5135 = arg0;
         this.field5138 = arg1;
         this.field5128 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5139[2] + (arg0 != null ? field5139[1] : field5139[0]) + ',' + (arg1 != null ? field5139[1] : field5139[0]) + ',' + (arg2 != null ? field5139[1] : field5139[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2817(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2818(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
