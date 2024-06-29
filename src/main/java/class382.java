import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class382 extends class305 {
   @OriginalMember(
      owner = "client!bc",
      name = "w",
      descriptor = "I"
   )
   public int field5657 = 0;
   @OriginalMember(
      owner = "client!bc",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5659 = new String[]{method2978(method2977("fv\f\\D")), method2978(method2977("\u007f;\f0\u0011")), method2978(method2977("fv\fZD")), method2978(method2977("j`Nr")), method2978(method2977("fv\f_D")), method2978(method2977("fv\f]D"))};
   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "Luw;"
   )
   public static class435 field5653 = new class435(81, -1);
   @OriginalMember(
      owner = "client!bc",
      name = "x",
      descriptor = "I"
   )
   public static int field5654;
   @OriginalMember(
      owner = "client!bc",
      name = "A",
      descriptor = "I"
   )
   public static int field5655;
   @OriginalMember(
      owner = "client!bc",
      name = "y",
      descriptor = "I"
   )
   public static int field5656;
   @OriginalMember(
      owner = "client!bc",
      name = "v",
      descriptor = "I"
   )
   public static int field5658;

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(Luda;B)V",
      line = 8
   )
   public final void method2973(class473 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg0.method3564((byte)-87);
            if (var4 != 0) {
               this.method2975(arg0, var4, -122);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != 117) {
               method2974(-8, 65, 19, -37, (class65)null, (class670)null);
            }

            ++field5654;
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5659[5] + (arg0 != null ? field5659[1] : field5659[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IIIILha;Lnia;)V",
      line = 29
   )
   public static final void method2974(int arg0, int arg1, int arg2, int arg3, class65 arg4, class670 arg5) {
      try {
         ++field5656;
         class780 var6 = class126.field2114.method5056(arg5.field9810, 69);
         if (var6.field11432 != -1) {
            label50: {
               if (!arg5.field9843) {
                  arg0 = 0;
                  if (!client.field4564) {
                     break label50;
                  }
               }

               arg0 += arg5.field9791;
               arg0 &= 3;
            }

            if (arg2 > -56) {
               field5653 = null;
            }

            class476 var7 = var6.method5643(arg0, arg4, 1811, arg5.field9836);
            if (var7 != null) {
               int var8 = arg5.field9830;
               int var9 = arg5.field9807;
               if ((1 & arg0) == 1) {
                  var9 = arg5.field9830;
                  var8 = arg5.field9807;
               }

               int var10 = var7.method3009();
               int var11 = var7.method3000();
               if (var6.field11420) {
                  var10 = var8 * 4;
                  var11 = var9 * 4;
               }

               if (var6.field11426 != 0) {
                  var7.method3605(arg3, 4 - (var9 * 4 - arg1), var10, var11, 0, -16777216 | var6.field11426, 1);
               } else {
                  var7.method3602(arg3, -((var9 + -1) * 4) + arg1, var10, var11);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field5659[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5659[1] : field5659[3]) + ',' + (arg5 != null ? field5659[1] : field5659[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 97
   )
   private final void method2975(class473 arg0, int arg1, int arg2) {
      try {
         if (arg2 > -121) {
            field5655 = -102;
         }

         ++field5658;
         if (arg1 == 2) {
            this.field5657 = arg0.method3565(true);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5659[4] + (arg0 != null ? field5659[1] : field5659[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "b",
      descriptor = "(Z)V",
      line = 114
   )
   public static void method2976(boolean arg0) {
      try {
         if (arg0) {
            field5653 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5659[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2977(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2978(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
