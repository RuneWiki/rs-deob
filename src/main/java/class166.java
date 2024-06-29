import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class166 extends class758 {
   @OriginalMember(
      owner = "client!wea",
      name = "o",
      descriptor = "J"
   )
   private long field2098 = -1L;
   @OriginalMember(
      owner = "client!wea",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   private String field2100 = null;
   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2106 = new String[]{method1315(method1314("\u0005\n\u0004t]Z")), method1315(method1314("R\u0002\u00007~\u0017\u001d\u000b;q\u0017U")), method1315(method1314("\u001f\n\b8y\u0000\u0007\u0004)tH")), method1315(method1314("\tAKta")), method1315(method1314("\u001c\u001a\t6")), method1315(method1314("\u0005\n\u0004tXZ")), method1315(method1314("\u0005\n\u0004t^Z"))};
   @OriginalMember(
      owner = "client!wea",
      name = "p",
      descriptor = "Lsq;"
   )
   public static class190 field2105 = new class190();
   @OriginalMember(
      owner = "client!wea",
      name = "n",
      descriptor = "B"
   )
   private byte field2099;
   @OriginalMember(
      owner = "client!wea",
      name = "s",
      descriptor = "I"
   )
   private int field2101;
   @OriginalMember(
      owner = "client!wea",
      name = "t",
      descriptor = "I"
   )
   public static int field2102;
   @OriginalMember(
      owner = "client!wea",
      name = "u",
      descriptor = "I"
   )
   public static int field2103;
   @OriginalMember(
      owner = "client!wea",
      name = "q",
      descriptor = "[Lic;"
   )
   public static class730[] field2104;

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(Lob;B)V"
   )
   public final void method1311(class772 arg0, byte arg1) {
      try {
         ++field2103;
         class696 var3 = new class696();
         var3.field10170 = this.field2099;
         var3.field10165 = this.field2101;
         int var4 = -92 / ((54 - arg1) / 57);
         var3.field10164 = this.field2100;
         arg0.method5526(5, var3);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2106[6] + (arg0 != null ? field2106[3] : field2106[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1312(int arg0) {
      try {
         field2104 = null;
         field2105 = null;
         if (arg0 != 19035) {
            field2105 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2106[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method1313(class594 arg0, byte arg1) {
      try {
         ++field2102;
         if (arg0.method4288((byte)113) != 255) {
            --arg0.field8243;
            this.field2098 = arg0.method4304((byte)126);
         }

         this.field2100 = arg0.method4334(4794);
         this.field2101 = arg0.method4280(-19104);
         this.field2099 = arg0.method4340(409855200);
         if (arg1 < -18) {
            arg0.method4304((byte)120);
            if (class346.field4957) {
               System.out.println(field2106[2] + this.field2098 + field2106[1] + this.field2100);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2106[0] + (arg0 != null ? field2106[3] : field2106[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1314(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1315(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
