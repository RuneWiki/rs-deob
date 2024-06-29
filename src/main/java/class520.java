import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class520 {
   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7490 = new String[]{method3780(method3779("nJ\u0010\u0016Y")), method3780(method3779("mHR9")), method3780(method3779("x\u0013\u0010{\f")), method3780(method3779("nJ\u0010\u0017Y")), method3780(method3779("nJ\u0010\u0014Y"))};
   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "[C"
   )
   private static char[] field7488 = new char[64];
   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "I"
   )
   public static int field7487;
   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "I"
   )
   public static int field7489;

   static {
      for(int var0 = 0; ~var0 > -27; ++var0) {
         field7488[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; ~var1 > -53; ++var1) {
         field7488[var1] = (char)(var1 + 71);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field7488[var2] = (char)(var2 + 48 + -52);
      }

      field7488[63] = '/';
      field7488[62] = '+';
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(IIIIIIIILcl;Lcl;)V",
      line = 7
   )
   public static final void method3776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class279 arg8, class279 arg9) {
      try {
         ++field7487;
         int var10 = arg9.method967((byte)123);
         if (var10 != -1) {
            Object var11 = null;
            class492 var12 = (class492)class319.field4374.method725(arg7, (long)var10);
            if (var12 == null) {
               class439[] var13 = class439.method3237(class281.field3904, var10, 0);
               if (var13 == null) {
                  return;
               }

               var12 = class383.field5543.method500(var13[0], true);
               class319.field4374.method723(0, (long)var10, var12);
            }

            class92.method797(arg8.field10701, false, 0, arg8.method972(arg7 + -1) * 256, arg4 >> 1, arg8.field10693, arg0, arg6, arg5 >> 1, arg8.field10694);
            int var14 = arg1 + -18 - -class131.field1678[0];
            int var15 = arg2 - -class131.field1678[1] - 70;
            int var16 = arg3 / 4 * 18 + var14;
            int var17 = arg3 % 4 * 18 + var15;
            var12.method3575(var16, var17);
            if (arg8 == arg9) {
               class383.field5543.method566(var17 - 1, (byte)-115, var16 + -1, 18, -256, 18);
            }

            class193.method1520(var17 + -1, -121, var17 + 18, var16 + 18, var16 + -1);
            class706 var18 = class363.method2716(255);
            var18.field10316 = arg9;
            var18.field10317 = var17 + 16;
            var18.field10313 = var16 - -16;
            var18.field10311 = var17;
            var18.field10309 = var16;
            class134.field1712.method5530(arg7 + 124, var18);
         }
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field7490[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7490[2] : field7490[1]) + ',' + (arg9 != null ? field7490[2] : field7490[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(I[FII[FIIIFFFIII)V",
      line = 57
   )
   public static final void method3777(int arg0, float[] arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, int arg11, int arg12, int arg13) {
      boolean var14 = client.field4360;

      try {
         float var18;
         float var19;
         label80: {
            int var24 = arg2 - arg13;
            ++field7489;
            int var25 = arg3 - arg11;
            int var26 = arg5 - arg12;
            float var15 = arg4[2] * (float)var24 + arg4[1] * (float)var25 + arg4[0] * (float)var26;
            float var16 = arg4[5] * (float)var24 + arg4[3] * (float)var26 + arg4[4] * (float)var25;
            float var17 = arg4[8] * (float)var24 + arg4[7] * (float)var25 + arg4[6] * (float)var26;
            if (~arg0 == arg6) {
               var18 = -var17 + arg10 + 0.5F;
               var19 = arg8 + var15 + 0.5F;
               if (!var14) {
                  break label80;
               }
            }

            if (arg0 == 1) {
               var18 = arg10 + var17 + 0.5F;
               var19 = arg8 + var15 + 0.5F;
               if (!var14) {
                  break label80;
               }
            }

            if (arg0 == 2) {
               var18 = -var16 + arg9 + 0.5F;
               var19 = -var15 + arg8 + 0.5F;
               if (!var14) {
                  break label80;
               }
            }

            if (arg0 == 3) {
               var18 = -var16 + arg9 + 0.5F;
               var19 = arg8 + var15 + 0.5F;
               if (!var14) {
                  break label80;
               }
            }

            if (arg0 != 4) {
               var19 = -var17 + arg10 + 0.5F;
               var18 = -var16 + arg9 + 0.5F;
               if (!var14) {
                  break label80;
               }
            }

            var19 = arg10 + var17 + 0.5F;
            var18 = -var16 + arg9 + 0.5F;
         }

         label81: {
            if (~arg7 == -2) {
               float var20 = var19;
               var19 = -var18;
               var18 = var20;
               if (!var14) {
                  break label81;
               }
            }

            if (~arg7 != -3) {
               if (arg7 != 3) {
                  break label81;
               }

               float var21 = var19;
               var19 = var18;
               var18 = -var21;
               if (!var14) {
                  break label81;
               }
            }

            var19 = -var19;
            var18 = -var18;
         }

         arg1[1] = var18;
         arg1[0] = var19;
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field7490[3] + arg0 + ',' + (arg1 != null ? field7490[2] : field7490[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7490[2] : field7490[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(I)V",
      line = 147
   )
   public static void method3778(int arg0) {
      try {
         field7488 = null;
         if (arg0 <= 64) {
            field7488 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7490[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3779(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3780(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
