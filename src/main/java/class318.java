import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class318 {
   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4601 = new String[]{method2491(method2490("_D%sg")), method2491(method2490("R\u001e%\u001f2")), method2491(method2490("J\u001fg1")), method2491(method2490("R\u001e%\u001e2")), method2491(method2490("R\u001e%\u00192")), method2491(method2490("R\u001e%\u001c2"))};
   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "Luw;"
   )
   public static class435 field4595 = new class435(70, 3);
   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "Lqg;"
   )
   public static class485 field4600 = new class485(7, 2);
   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "I"
   )
   public static int field4596;
   @OriginalMember(
      owner = "client!vt",
      name = "d",
      descriptor = "I"
   )
   public static int field4597;
   @OriginalMember(
      owner = "client!vt",
      name = "f",
      descriptor = "I"
   )
   public static int field4598;
   @OriginalMember(
      owner = "client!vt",
      name = "e",
      descriptor = "I"
   )
   public static int field4599;

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Lhv;I)[I",
      line = 6
   )
   public static final int[] method2486(class542 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field4597;
         class473 var3 = new class473(518);
         int[] var4 = new int[4];
         int var5 = 0;
         if (var2) {
            var4[var5] = (int)(Math.random() * 9.9999999E7D);
            ++var5;
         }

         while(true) {
            while(~var5 > -5) {
               var4[var5] = (int)(Math.random() * 9.9999999E7D);
               ++var5;
            }

            var3.method3571(255, 10);
            var3.method3540(var4[0], 898075920);
            var3.method3540(var4[1], 898075920);
            var3.method3540(var4[arg1], 898075920);
            var3.method3540(var4[3], 898075920);
            int var6 = 0;
            if (!var2) {
               if (var2) {
                  var3.method3540((int)(9.9999999E7D * Math.random()), 898075920);
                  ++var6;
               }

               while(true) {
                  while(~var6 > -11) {
                     var3.method3540((int)(9.9999999E7D * Math.random()), 898075920);
                     ++var6;
                  }

                  var3.method3550((int)(9.9999999E7D * Math.random()), 29620);
                  var3.method3551(0, class25.field370, class475.field6933);
                  arg0.field7859.method3536(0, var3.field6907, var3.field6889, -13091);
                  if (!var2) {
                     return var4;
                  }

                  ++var6;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4601[1] + (arg0 != null ? field4601[0] : field4601[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(I[FIIIIFBIF[FI)V",
      line = 42
   )
   public static final void method2487(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6, byte arg7, int arg8, float arg9, float[] arg10, int arg11) {
      boolean var12 = client.field4564;

      try {
         int var23 = arg8 - arg2;
         ++field4599;
         int var22 = arg4 - arg0;
         int var24 = arg11 - arg3;
         float var13 = arg1[2] * (float)var24 + arg1[1] * (float)var22 + arg1[0] * (float)var23;
         if (arg7 > -124) {
            field4595 = null;
         }

         float var14 = arg1[5] * (float)var24 + arg1[4] * (float)var22 + arg1[3] * (float)var23;
         float var15 = arg1[8] * (float)var24 + arg1[7] * (float)var22 + arg1[6] * (float)var23;
         float var16 = 0.5F + (float)Math.atan2((double)var13, (double)var15) / 6.2831855F;
         if (arg9 != 1.0F) {
            var16 = arg9 * var16;
         }

         float var17;
         label52: {
            var17 = var14 + 0.5F + arg6;
            if (~arg5 == -2) {
               float var18 = var16;
               var16 = -var17;
               var17 = var18;
               if (!var12) {
                  break label52;
               }
            }

            if (~arg5 != -3) {
               if (arg5 != 3) {
                  break label52;
               }

               float var19 = var16;
               var16 = var17;
               var17 = -var19;
               if (!var12) {
                  break label52;
               }
            }

            var16 = -var16;
            var17 = -var17;
         }

         arg10[1] = var17;
         arg10[0] = var16;
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field4601[5] + arg0 + ',' + (arg1 != null ? field4601[0] : field4601[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field4601[0] : field4601[2]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(IIZ)Z",
      line = 102
   )
   public static final boolean method2488(int arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            return false;
         } else {
            ++field4596;
            return (2048 & arg1) != 0 | class51.method615(arg1, arg0, 32768) || class383.method2980(arg1, 0, arg0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4601[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(I)V",
      line = 113
   )
   public static void method2489(int arg0) {
      try {
         if (arg0 == 70) {
            field4595 = null;
            field4600 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4601[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2490(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2491(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
