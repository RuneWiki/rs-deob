import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class547 implements class775 {
   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private String field7849;
   @OriginalMember(
      owner = "client!hv",
      name = "i",
      descriptor = "Lkf;"
   )
   private class266 field7850;
   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7852 = new String[]{method3931(method3930("cv*U\u0013")), method3931(method3930("v-h\u0017")), method3931(method3930("p.*G\u0007v1pEF")), method3931(method3930("p.*<F")), method3931(method3930("p.*?F")), method3931(method3930("p.*=F")), method3931(method3930("\u007f6tONm3>")), method3931(method3930("\u007f6tINh7wA")), method3931(method3930("8(w\u0012\u0014}b")), method3931(method3930("\u007f6tJNh7wA")), method3931(method3930("p.*8F")), method3931(method3930("\u007f6tHNu1wA")), method3931(method3930("8+m\u0001\u000b\"")), method3931(method3930("p.*:F")), method3931(method3930("p.*9F")), method3931(method3930("p.*>F"))};
   @OriginalMember(
      owner = "client!hv",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field7848 = false;
   @OriginalMember(
      owner = "client!hv",
      name = "h",
      descriptor = "Lada;"
   )
   public static class175 field7843 = new class175();
   @OriginalMember(
      owner = "client!hv",
      name = "g",
      descriptor = "I"
   )
   public static int field7841;
   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "I"
   )
   public static int field7842;
   @OriginalMember(
      owner = "client!hv",
      name = "j",
      descriptor = "I"
   )
   public static int field7844;
   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "I"
   )
   public static int field7845;
   @OriginalMember(
      owner = "client!hv",
      name = "k",
      descriptor = "I"
   )
   public static int field7846;
   @OriginalMember(
      owner = "client!hv",
      name = "f",
      descriptor = "I"
   )
   public static int field7847;
   @OriginalMember(
      owner = "client!hv",
      name = "d",
      descriptor = "[[Lbl;"
   )
   public static class678[][] field7851;

   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "(I)V",
      line = 5
   )
   public static void method3925(int arg0) {
      try {
         field7843 = null;
         field7851 = null;
         if (arg0 < 59) {
            method3926(-82, 10);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7852[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(II)I",
      line = 19
   )
   public static final int method3926(int arg0, int arg1) {
      try {
         ++field7841;
         int var4 = ((arg1 & -1431655765) >>> 1) + (arg1 & 1431655765);
         int var5 = (858993459 & var4) - -(var4 >>> 2 & 858993459);
         int var6 = var5 - -(var5 >>> 4) & 252645135;
         int var7 = (var6 >>> 8) + var6;
         int var8 = (var7 >>> 16) + var7;
         return arg0 != 2 ? 18 : var8 & 255;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7852[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(I)I",
      line = 35
   )
   public final int method2561(int arg0) {
      try {
         ++field7845;
         if (this.field7850.method2033(false, this.field7849)) {
            return 100;
         } else {
            if (arg0 != -29119) {
               method3926(-44, 116);
            }

            return this.field7850.method2042((byte)-63, this.field7849);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7852[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(II)I",
      line = 55
   )
   public static final int method3927(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         byte var3;
         label42: {
            ++field7847;
            if (~arg0 < -12001) {
               class540.method3889((byte)77);
               var3 = 4;
               if (!var2) {
                  break label42;
               }
            }

            if (arg0 > 5000) {
               var3 = 3;
               class417.method3116((byte)-78);
               if (!var2) {
                  break label42;
               }
            }

            if (~arg0 < -2001) {
               var3 = 2;
               class692.method5049((byte)106);
               if (!var2) {
                  break label42;
               }
            }

            class794.method5723((byte)-112, true);
            var3 = 1;
         }

         if (~class300.field4107.field6419.method391(79) != -3) {
            class300.field4107.method3301(25349, class300.field4107.field6406, 2);
            class42.method358(2, -3, false);
         }

         if (arg1 != 2) {
            field7851 = null;
         }

         class441.method3246(0);
         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7852[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "d",
      descriptor = "(I)V",
      line = 101
   )
   public static final void method3928(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(I)Ltfa;",
      line = 189
   )
   public final class36 method2559(int arg0) {
      try {
         if (arg0 != -24883) {
            field7848 = true;
         }

         ++field7842;
         return class36.field514;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7852[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(I[FFZI[FIIIII)V",
      line = 200
   )
   public static final void method3929(int arg0, float[] arg1, float arg2, boolean arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field4360;

      try {
         ++field7846;
         if (!arg3) {
            field7851 = null;
         }

         float var16;
         float var17;
         label41: {
            int var22 = arg6 - arg9;
            int var23 = arg8 - arg4;
            int var24 = arg10 - arg7;
            float var12 = arg1[2] * (float)var24 + arg1[1] * (float)var23 + arg1[0] * (float)var22;
            float var13 = arg1[5] * (float)var24 + arg1[4] * (float)var23 + arg1[3] * (float)var22;
            float var14 = arg1[8] * (float)var24 + arg1[7] * (float)var23 + arg1[6] * (float)var22;
            float var15 = (float)Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
            var16 = (float)Math.atan2((double)var12, (double)var14) / 6.2831855F + 0.5F;
            var17 = arg2 + (float)Math.asin((double)(var13 / var15)) / 3.1415927F + 0.5F;
            if (~arg0 != -2) {
               if (arg0 == 2) {
                  var16 = -var16;
                  var17 = -var17;
                  if (!var11) {
                     break label41;
                  }
               }

               if (arg0 != 3) {
                  break label41;
               }

               float var18 = var16;
               var16 = var17;
               var17 = -var18;
               if (!var11) {
                  break label41;
               }
            }

            float var19 = var16;
            var16 = -var17;
            var17 = var19;
         }

         arg5[1] = var17;
         arg5[0] = var16;
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field7852[13] + arg0 + ',' + (arg1 != null ? field7852[0] : field7852[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7852[0] : field7852[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "<init>",
      descriptor = "(Lkf;Ljava/lang/String;)V",
      line = 254
   )
   public class547(class266 arg0, String arg1) {
      try {
         this.field7849 = arg1;
         this.field7850 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7852[2] + (arg0 != null ? field7852[0] : field7852[1]) + ',' + (arg1 != null ? field7852[0] : field7852[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3930(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3931(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
