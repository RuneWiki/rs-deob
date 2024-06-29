import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class119 implements class227 {
   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "Lqh;"
   )
   private class74 field1448;
   @OriginalMember(
      owner = "client!jja",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   private String field1450;
   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1455 = new String[]{method1012(method1011("@\b(!\u0019")), method1012(method1011("USjc")), method1012(method1011("QLg!XRHo{Z\u0013")), method1012(method1011("QLg!%\u0013")), method1012(method1011("QLg! \u0013")), method1012(method1011("QLg!'\u0013")), method1012(method1011("QLg!&\u0013"))};
   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "I"
   )
   public static int field1451 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field1453 = new int[14];
   @OriginalMember(
      owner = "client!jja",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field1454 = new int[6][];
   @OriginalMember(
      owner = "client!jja",
      name = "h",
      descriptor = "I"
   )
   public static int field1447;
   @OriginalMember(
      owner = "client!jja",
      name = "f",
      descriptor = "I"
   )
   public static int field1449;
   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "I"
   )
   public static int field1452;

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1007(int arg0) {
      try {
         if (arg0 != 2675) {
            method1009(43, -56, 101, (byte)-76, (class65)null, -49, 123);
         }

         field1454 = null;
         field1453 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1455[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(B)Lbf;"
   )
   public final class566 method1008(byte arg0) {
      try {
         int var2 = -32 / ((-46 - arg0) / 53);
         ++field1452;
         return class566.field7719;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1455[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "<init>",
      descriptor = "(Lqh;Ljava/lang/String;)V"
   )
   public class119(class74 arg0, String arg1) {
      try {
         this.field1448 = arg0;
         this.field1450 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1455[2] + (arg0 != null ? field1455[0] : field1455[1]) + ',' + (arg1 != null ? field1455[0] : field1455[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIBLha;II)Lka;"
   )
   public static final class501 method1009(int arg0, int arg1, int arg2, byte arg3, class65 arg4, int arg5, int arg6) {
      try {
         ++field1449;
         long var7 = (long)arg2;
         class501 var9 = (class501)class347.field4992.method4239(var7, 0);
         short var10 = 2055;
         if (var9 == null) {
            class200 var11 = class246.method1854(true, arg2, class66.field763, 0);
            if (var11 == null) {
               return null;
            }

            if (var11.field2433 < 13) {
               var11.method1506(2, (byte)-127);
            }

            var9 = arg4.method573(var11, var10, class27.field336, 64, 768);
            class347.field4992.method4238(107, var9, var7);
         }

         class501 var12 = var9.method338((byte)2, var10, true);
         if (~arg5 != -1) {
            var12.method355(arg5);
         }

         if (~arg6 != -1) {
            var12.method360(arg6);
         }

         if (arg3 >= -102) {
            return null;
         } else {
            if (arg0 != 0) {
               var12.method331(arg0);
            }

            if (~arg1 != -1) {
               var12.method343(0, arg1, 0);
            }

            return var12;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field1455[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1455[0] : field1455[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1010(boolean arg0) {
      try {
         ++field1447;
         if (!arg0) {
            return -42;
         } else {
            return this.field1448.method742(this.field1450, 92) ? 100 : 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1455[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1011(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1012(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
