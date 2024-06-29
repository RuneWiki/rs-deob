import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class301 extends class770 {
   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3975 = new String[]{method2269(method2268("LKS\r")), method2269(method2268("Y\u0010\u0011O{")), method2269(method2268("PW^OG\n")), method2269(method2268("PW^OD\n")), method2269(method2268("PW^OE\n")), method2269(method2268("PW^OB\n"))};
   @OriginalMember(
      owner = "client!ria",
      name = "m",
      descriptor = "I"
   )
   public int field3966;
   @OriginalMember(
      owner = "client!ria",
      name = "h",
      descriptor = "I"
   )
   public static int field3967;
   @OriginalMember(
      owner = "client!ria",
      name = "l",
      descriptor = "I"
   )
   public int field3969;
   @OriginalMember(
      owner = "client!ria",
      name = "k",
      descriptor = "I"
   )
   public static int field3970;
   @OriginalMember(
      owner = "client!ria",
      name = "g",
      descriptor = "I"
   )
   public static int field3971;
   @OriginalMember(
      owner = "client!ria",
      name = "i",
      descriptor = "I"
   )
   public static int field3972;
   @OriginalMember(
      owner = "client!ria",
      name = "j",
      descriptor = "I"
   )
   public int field3973;
   @OriginalMember(
      owner = "client!ria",
      name = "f",
      descriptor = "I"
   )
   public int field3974;
   @OriginalMember(
      owner = "client!ria",
      name = "n",
      descriptor = "Lvi;"
   )
   public class569 field3968;

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IIIIIFIIII[F[FFF)V"
   )
   public static final void method2264(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10, float[] arg11, float arg12, float arg13) {
      boolean var14 = client.field4273;

      try {
         if (arg2 != -8021) {
            method2267(20, -116, -76);
         }

         float var18;
         float var19;
         label82: {
            int var25 = arg7 - arg9;
            int var24 = arg4 - arg6;
            int var26 = arg8 - arg1;
            ++field3970;
            float var15 = arg10[2] * (float)var24 + arg10[0] * (float)var25 + arg10[1] * (float)var26;
            float var16 = arg10[5] * (float)var24 + arg10[3] * (float)var25 + arg10[4] * (float)var26;
            float var17 = arg10[8] * (float)var24 + arg10[6] * (float)var25 + arg10[7] * (float)var26;
            if (~arg0 == -1) {
               var18 = arg13 + var15 + 0.5F;
               var19 = -var17 + arg12 + 0.5F;
               if (!var14) {
                  break label82;
               }
            }

            if (~arg0 == -2) {
               var18 = arg13 + var15 + 0.5F;
               var19 = arg12 + var17 + 0.5F;
               if (!var14) {
                  break label82;
               }
            }

            if (arg0 != 2) {
               if (~arg0 == -4) {
                  var19 = -var16 + arg5 + 0.5F;
                  var18 = arg13 + var15 + 0.5F;
                  if (!var14) {
                     break label82;
                  }
               }

               if (~arg0 == -5) {
                  var18 = arg12 + var17 + 0.5F;
                  var19 = -var16 + arg5 + 0.5F;
                  if (!var14) {
                     break label82;
                  }
               }

               var19 = -var16 + arg5 + 0.5F;
               var18 = -var17 + arg12 + 0.5F;
               if (!var14) {
                  break label82;
               }
            }

            var18 = -var15 + arg13 + 0.5F;
            var19 = -var16 + arg5 + 0.5F;
         }

         label84: {
            if (arg3 == 1) {
               float var20 = var18;
               var18 = -var19;
               var19 = var20;
               if (!var14) {
                  break label84;
               }
            }

            if (arg3 != 2) {
               if (arg3 != 3) {
                  break label84;
               }

               float var21 = var18;
               var18 = var19;
               var19 = -var21;
               if (!var14) {
                  break label84;
               }
            }

            var19 = -var19;
            var18 = -var18;
         }

         arg11[0] = var18;
         arg11[1] = var19;
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field3975[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field3975[1] : field3975[0]) + ',' + (arg11 != null ? field3975[1] : field3975[0]) + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2265(byte arg0) {
      try {
         if (arg0 > 107) {
            ++field3967;
            class622.field8690.method4245(true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3975[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(JI)I"
   )
   public static final int method2266(long arg0, int arg1) {
      try {
         class621.method4518((byte)-2, arg0);
         ++field3971;
         int var3 = 29 / ((-33 - arg1) / 38);
         return class624.field8714.get(1);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3975[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2267(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 2) {
            return true;
         } else {
            ++field3972;
            return (arg1 & 52) != 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3975[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2268(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2269(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
