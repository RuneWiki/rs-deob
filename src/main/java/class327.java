import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class327 extends class241 {
   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4687 = new String[]{method2536(method2535("9\u0012kPU")), method2536(method2535(" \u0013)\u007f")), method2536(method2535("5Hk=\u0000")), method2536(method2535("9\u0012kQU"))};
   @OriginalMember(
      owner = "client!wt",
      name = "j",
      descriptor = "I"
   )
   public static int field4685;
   @OriginalMember(
      owner = "client!wt",
      name = "i",
      descriptor = "J"
   )
   public static long field4686;
   @OriginalMember(
      owner = "client!wt",
      name = "k",
      descriptor = "[[Ljfa;"
   )
   public static class303[][] field4684;

   @OriginalMember(
      owner = "client!wt",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2533(int arg0) {
      try {
         field4684 = null;
         if (arg0 != 1) {
            field4686 = -83L;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4687[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(Loha;Z)V"
   )
   public static final void method2534(class771 arg0, boolean arg1) {
      try {
         boolean var2;
         label65: {
            ++field4685;
            var2 = arg1;
            if (class29.field458 == arg0.field11274 || arg0.field11224 == -1 || arg0.field11295 != 0) {
               var2 = true;
               if (!client.field4564) {
                  break label65;
               }
            }

            class295 var3 = class588.field8496.method3781(5, arg0.field11224);
            if (var3.field4131 || ~(arg0.field11250 + 1) < ~var3.field4128[arg0.field11267]) {
               var2 = true;
            }
         }

         if (var2) {
            int var4 = -arg0.field11239 + arg0.field11274;
            int var5 = -arg0.field11239 + class29.field458;
            int var6 = arg0.field11309 * 512 - -(256 * arg0.method3438(false));
            int var7 = arg0.field11244 * 512 - -(256 * arg0.method3438(false));
            int var8 = arg0.field11292 * 512 - -(256 * arg0.method3438(false));
            int var9 = arg0.field11232 * 512 - -(arg0.method3438(arg1) * 256);
            arg0.field4096 = ((-var5 + var4) * var7 + var5 * var9) / var4;
            arg0.field4101 = ((-var5 + var4) * var6 + var5 * var8) / var4;
         }

         arg0.field11315 = 0;
         if (~arg0.field11256 == -1) {
            arg0.method5577(-31308, 8192, false);
         }

         if (~arg0.field11256 == -2) {
            arg0.method5577(-31308, 12288, false);
         }

         if (arg0.field11256 == 2) {
            arg0.method5577(-31308, 0, false);
         }

         if (arg0.field11256 == 3) {
            arg0.method5577(-31308, 4096, false);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field4687[0] + (arg0 != null ? field4687[2] : field4687[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2535(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2536(char[] arg0) {
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
            var10005 = 102;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
