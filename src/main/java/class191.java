import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class191 {
   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2328 = new String[]{method1444(method1443("\u0011\u0003\u0010-u")), method1444(method1443("\u0011\u0003\u0010,u")), method1444(method1443("\u0011\u0003\u0010(u")), method1444(method1443("\u0011\u0003\u0010*u")), method1444(method1443("\u001d]\u0010@ ")), method1444(method1443("\b\u0006R\u0002")), method1444(method1443("\u0011\u0003\u0010/u")), method1444(method1443("\u0011\u0003\u0010+u"))};
   @OriginalMember(
      owner = "client!wp",
      name = "l",
      descriptor = "[F"
   )
   public static float[] field2314 = new float[4];
   @OriginalMember(
      owner = "client!wp",
      name = "c",
      descriptor = "I"
   )
   public static int field2316;
   @OriginalMember(
      owner = "client!wp",
      name = "f",
      descriptor = "I"
   )
   public static int field2317;
   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "I"
   )
   public int field2318;
   @OriginalMember(
      owner = "client!wp",
      name = "j",
      descriptor = "I"
   )
   public int field2319;
   @OriginalMember(
      owner = "client!wp",
      name = "m",
      descriptor = "I"
   )
   public static int field2320;
   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "I"
   )
   public int field2321;
   @OriginalMember(
      owner = "client!wp",
      name = "i",
      descriptor = "I"
   )
   public static int field2322;
   @OriginalMember(
      owner = "client!wp",
      name = "d",
      descriptor = "I"
   )
   public int field2323;
   @OriginalMember(
      owner = "client!wp",
      name = "k",
      descriptor = "I"
   )
   public int field2324;
   @OriginalMember(
      owner = "client!wp",
      name = "h",
      descriptor = "I"
   )
   public int field2325;
   @OriginalMember(
      owner = "client!wp",
      name = "e",
      descriptor = "I"
   )
   public static int field2326;
   @OriginalMember(
      owner = "client!wp",
      name = "n",
      descriptor = "I"
   )
   public static int field2327;
   @OriginalMember(
      owner = "client!wp",
      name = "g",
      descriptor = "Lqh;"
   )
   public static class74 field2315;

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1437(byte arg0) {
      try {
         class624.method4535(255, -1, false);
         ++field2316;
         int var1 = 73 / ((arg0 - -14) / 55);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2328[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1438(int arg0) {
      try {
         field2315 = null;
         field2314 = null;
         if (arg0 != -4003) {
            method1440(false, 113, -27, 67, 46, 48, -40);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2328[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(ILor;)V"
   )
   public static final void method1439(int arg0, class670 arg1) {
      try {
         ++field2320;
         if (class617.field8603 == null) {
            class226 var2 = new class226();
            byte[] var3 = var2.method1727(true, 16, 128, 128);
            class617.field8603 = class622.method4524(var3, false, -126);
         }

         int var4 = -10 % ((arg0 - 59) / 49);
         if (class605.field8433 == null) {
            class560 var5 = new class560();
            byte[] var6 = var5.method4031(128, (byte)-111, 16, 128);
            class605.field8433 = class622.method4524(var6, false, 91);
         }

         class762 var7 = arg1.field9713;
         if (var7.method5473(false) && class59.field620 == null) {
            byte[] var8 = method1441(0.5F, new class744(419684), 4.0F, 4.0F, 8, 0.6F, 16.0F, 128, (byte)-75, 16, 128);
            class59.field620 = class622.method4524(var8, false, -73);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field2328[3] + arg0 + ',' + (arg1 != null ? field2328[4] : field2328[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(ZIIIIII)V"
   )
   public static final void method1440(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         ++field2327;
         int var8 = -arg1 + arg4;
         int var9 = arg1 + arg3;
         int var10 = arg3;
         if (var7) {
            class125.method1046(-23355, arg6, class17.field236[arg3], arg5, arg2);
            var10 = arg3 + 1;
         }

         while(true) {
            short var10000;
            int var10001;
            if (var9 <= var10) {
               var10000 = arg0;
               var10001 = 1;
               if (!var7) {
                  if (arg0 != 1) {
                     field2315 = null;
                  }

                  int var11 = arg4;
                  if (var7) {
                     class125.method1046(-23355, arg6, class17.field236[arg4], arg5, arg2);
                     var11 = arg4 - 1;
                  }

                  while(true) {
                     while(var8 < var11) {
                        class125.method1046(-23355, arg6, class17.field236[var11], arg5, arg2);
                        --var11;
                     }

                     int var12 = arg6 - arg1;
                     int var13 = arg1 + arg2;
                     int var14 = var9;
                     if (!var7) {
                        if (!var7 && ~var9 < ~var8) {
                           return;
                        }

                        do {
                           int[] var15 = class17.field236[var14];
                           class125.method1046(-23355, var13, var15, arg5, arg2);
                           class125.method1046(-23355, arg6, var15, arg5, var12);
                           ++var14;
                        } while(~var14 >= ~var8);

                        return;
                     }

                     --var11;
                  }
               }
            } else {
               var10000 = -23355;
               var10001 = arg6;
            }

            class125.method1046(var10000, var10001, class17.field236[var10], arg5, arg2);
            ++var10;
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field2328[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(FLrca;FFIFFIBII)[B"
   )
   public static final byte[] method1441(float arg0, class483 arg1, float arg2, float arg3, int arg4, float arg5, float arg6, int arg7, byte arg8, int arg9, int arg10) {
      try {
         ++field2326;
         byte[] var11 = new byte[arg7 * arg10 * arg9];
         if (arg8 >= -61) {
            return null;
         } else {
            class473.method3466(arg1, arg2, arg9, var11, arg7, arg0, arg6, arg5, -121, arg10, arg4, arg3, 0);
            return var11;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2328[6] + arg0 + ',' + (arg1 != null ? field2328[4] : field2328[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method1442(int arg0, int arg1, byte arg2) {
      try {
         ++field2322;
         if (arg2 < 50) {
            return 45;
         } else {
            int var3 = arg1 - -(arg0 * 57);
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 - -1376312589;
            return (134007944 & var5) >> 19;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2328[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1443(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1444(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
