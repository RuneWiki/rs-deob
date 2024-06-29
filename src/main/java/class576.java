import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class576 extends class213 {
   @OriginalMember(
      owner = "client!ea",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7920 = new String[]{method4147(method4146(")J(bj")), method4147(method4146(")J(`j")), method4147(method4146(")J(aj")), method4147(method4146(")J(gj"))};
   @OriginalMember(
      owner = "client!ea",
      name = "F",
      descriptor = "I"
   )
   public static int field7915;
   @OriginalMember(
      owner = "client!ea",
      name = "E",
      descriptor = "I"
   )
   public static int field7916;
   @OriginalMember(
      owner = "client!ea",
      name = "H",
      descriptor = "I"
   )
   public static int field7917;
   @OriginalMember(
      owner = "client!ea",
      name = "D",
      descriptor = "I"
   )
   public static int field7919;
   @OriginalMember(
      owner = "client!ea",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field7918;

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method4142(int arg0, int arg1, int arg2) {
      try {
         ++field7919;
         return arg1 != 1 ? true : class658.method4779(arg1 ^ 113, arg0, arg2) & class458.method3364(-13851, arg0, arg2);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7920[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(III)Ljn;"
   )
   public static final class752 method4143(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      return var3 == null ? null : var3.field2821;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "<init>",
      descriptor = "()V"
   )
   public class576() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field7917;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int[][] var5 = this.method1615(true, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int var9 = 0;
            if (var3 || var9 < field7916) {
               do {
                  var4[var9] = (var6[var9] - (-var7[var9] + -var8[var9])) / 3;
                  ++var9;
               } while(var9 < field7916);
            }
         }

         if (arg1 != 2064866508) {
            method4145(-42);
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field7920[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method4144(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field7915;
         if (arg0 == arg2) {
            class547.method3956(arg0, arg5, arg3, (byte)86, arg4);
         } else {
            if (arg1) {
               method4144(-33, false, -9, 32, -42, -76);
            }

            if (~(-arg0 + arg5) <= ~class265.field3451 && ~(arg5 - -arg0) >= ~class663.field9442 && -arg2 + arg3 >= class478.field6604 && class313.field4171 >= arg2 + arg3) {
               class696.method5060(arg5, arg2, arg0, arg4, arg3, !arg1);
            } else {
               class585.method4198(arg1, arg5, arg0, arg2, arg3, arg4);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7920[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4145(int arg0) {
      try {
         if (arg0 != 0) {
            method4144(95, true, -51, 101, 93, 126);
         }

         field7918 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7920[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4146(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4147(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
