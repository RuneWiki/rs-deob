import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class224 {
   @OriginalMember(
      owner = "client!gb",
      name = "c",
      descriptor = "I"
   )
   public int field3332 = 1;
   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3337 = new String[]{method1880(method1879("u\u0019QK*")), method1880(method1879("iUQ'\u007f")), method1880(method1879("u\u0019QM*")), method1880(method1879("|\u000e\u0013e")), method1880(method1879("u\u0019QJ*")), method1880(method1879("u\u0019QH*"))};
   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "C"
   )
   public char field3336;
   @OriginalMember(
      owner = "client!gb",
      name = "d",
      descriptor = "I"
   )
   public static int field3331;
   @OriginalMember(
      owner = "client!gb",
      name = "f",
      descriptor = "I"
   )
   public static int field3334;
   @OriginalMember(
      owner = "client!gb",
      name = "b",
      descriptor = "I"
   )
   public static int field3335;
   @OriginalMember(
      owner = "client!gb",
      name = "e",
      descriptor = "[Lsaa;"
   )
   public static class344[] field3333;

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(B)Ldd;"
   )
   public static final class731 method1875(byte arg0) {
      try {
         ++field3331;
         if (arg0 != 63) {
            field3333 = null;
         }

         class731 var1 = (class731)class631.field9204.method1397(arg0 ^ 22464);
         if (var1 != null) {
            --class381.field5640;
            return var1;
         } else {
            return new class731();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3337[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(IILuda;)V"
   )
   private final void method1876(int arg0, int arg1, class473 arg2) {
      try {
         ++field3334;
         if (arg1 != 0) {
            this.method1877(25, (class473)null);
         }

         if (arg0 != 1) {
            if (~arg0 == -3) {
               this.field3332 = 0;
               return;
            }
         } else {
            this.field3336 = class85.method847(16, arg2.method3543(-1132613840));
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3337[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3337[1] : field3337[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(ILuda;)V"
   )
   public final void method1877(int arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3335;
         if (arg0 != 17089) {
            this.method1877(-7, (class473)null);
         }

         do {
            int var4 = arg1.method3564((byte)-94);
            if (var4 == 0) {
               break;
            }

            this.method1876(var4, arg0 + -17089, arg1);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3337[5] + arg0 + ',' + (arg1 != null ? field3337[1] : field3337[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1878(int arg0) {
      try {
         field3333 = null;
         if (arg0 >= -106) {
            method1878(-126);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3337[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1879(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1880(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
