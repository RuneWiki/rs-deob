import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class50 {
   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field661 = new String[]{method408(method407("= S\fof")), method408(method407("= S\flf"))};
   @OriginalMember(
      owner = "client!sca",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field656 = new class118(26, -1);
   @OriginalMember(
      owner = "client!sca",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field657 = new class118(108, -2);
   @OriginalMember(
      owner = "client!sca",
      name = "e",
      descriptor = "Lek;"
   )
   public static class536 field659 = new class536(42, -1);
   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "I"
   )
   public static int field655;
   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "I"
   )
   public static int field658;
   @OriginalMember(
      owner = "client!sca",
      name = "d",
      descriptor = "Lha;"
   )
   public static class66 field660;

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method405(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field655;
         if (class696.field10207 && class273.field3754) {
            if (class330.field4497 < 100) {
               return false;
            } else {
               int var4 = class147.field1929[arg3][arg0][arg2];
               if (-class500.field7247 == var4) {
                  return false;
               } else if (class500.field7247 == var4) {
                  return true;
               } else if (class757.field11220 == class731.field10698) {
                  return false;
               } else {
                  int var5 = 48 % ((arg1 - 78) / 40);
                  int var6 = arg0 << class773.field11359;
                  int var7 = arg2 << class773.field11359;
                  if (class247.method1873(var6 + 1, class729.field10681 + var6 + -1, class731.field10698[arg3].method2219(true, arg0, arg2 + 1), class731.field10698[arg3].method2219(true, arg0 + 1, arg2 + 1), class731.field10698[arg3].method2219(true, arg0, arg2), class729.field10681 + -1 + var7, class729.field10681 + var7 - 1, false, var6 - -1, var7 + 1) && class247.method1873(var6 + 1, var6 + -1 + class729.field10681, class731.field10698[arg3].method2219(true, arg0 + 1, arg2 + 1), class731.field10698[arg3].method2219(true, arg0 + 1, arg2), class731.field10698[arg3].method2219(true, arg0, arg2), var7 + 1, var7 - (-class729.field10681 - -1), false, var6 + -1 - -class729.field10681, var7 + 1)) {
                     ++class216.field3088;
                     class147.field1929[arg3][arg0][arg2] = class500.field7247;
                     return true;
                  } else {
                     class147.field1929[arg3][arg0][arg2] = -class500.field7247;
                     return false;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field661[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method406(byte arg0) {
      try {
         field657 = null;
         field660 = null;
         field656 = null;
         if (arg0 == 59) {
            field659 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field661[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method408(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
