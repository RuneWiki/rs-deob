import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class477 extends class546 {
   @OriginalMember(
      owner = "client!ci",
      name = "C",
      descriptor = "I"
   )
   private int field6601;
   @OriginalMember(
      owner = "client!ci",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6603 = new String[]{method3486(method3485("\f.&~d")), method3486(method3485("\f.&zd")), method3486(method3485("\u00012dS")), method3486(method3485("\u0014i&\u00111")), method3486(method3485("\f.&yd")), method3486(method3485("\f.&|d")), method3486(method3485("\f.&{d")), method3486(method3485("\f.&}d")), method3486(method3485("\f.&\u0003%\u0001.|\u0001d"))};
   @OriginalMember(
      owner = "client!ci",
      name = "u",
      descriptor = "I"
   )
   public static int field6595 = 0;
   @OriginalMember(
      owner = "client!ci",
      name = "D",
      descriptor = "I"
   )
   public static int field6593;
   @OriginalMember(
      owner = "client!ci",
      name = "A",
      descriptor = "I"
   )
   public static int field6594;
   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "I"
   )
   public static int field6596;
   @OriginalMember(
      owner = "client!ci",
      name = "x",
      descriptor = "I"
   )
   public static int field6597;
   @OriginalMember(
      owner = "client!ci",
      name = "E",
      descriptor = "I"
   )
   public static int field6599;
   @OriginalMember(
      owner = "client!ci",
      name = "B",
      descriptor = "I"
   )
   public static int field6600;
   @OriginalMember(
      owner = "client!ci",
      name = "y",
      descriptor = "I"
   )
   public static int field6602;
   @OriginalMember(
      owner = "client!ci",
      name = "w",
      descriptor = "Lm;"
   )
   public static class203 field6598;
   @OriginalMember(
      owner = "client!ci",
      name = "v",
      descriptor = "[Lsha;"
   )
   public class761[] field6591;
   @OriginalMember(
      owner = "client!ci",
      name = "t",
      descriptor = "[[B"
   )
   private byte[][] field6592;

   @OriginalMember(
      owner = "client!ci",
      name = "c",
      descriptor = "(II)Z"
   )
   public final boolean method3479(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            return true;
         } else {
            ++field6593;
            return this.field6591[arg0].field11015;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6603[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "b",
      descriptor = "(II)Z"
   )
   public final boolean method3480(int arg0, int arg1) {
      try {
         if (arg1 != 4) {
            this.method3480(119, 80);
         }

         ++field6596;
         return this.field6591[arg0].field11009;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6603[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method3481(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ci",
      name = "d",
      descriptor = "(II)Z"
   )
   public final boolean method3482(int arg0, int arg1) {
      try {
         ++field6597;
         return arg0 != -19443 ? false : this.field6591[arg1].field11014;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6603[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "([FIFZII[FIIFII)V"
   )
   public static final void method3483(float[] arg0, int arg1, float arg2, boolean arg3, int arg4, int arg5, float[] arg6, int arg7, int arg8, float arg9, int arg10, int arg11) {
      boolean var12 = client.field4273;

      try {
         if (arg3) {
            method3483((float[])null, -16, -0.7817094F, true, -108, -114, (float[])null, 106, 38, -1.0122424F, 119, -2);
         }

         ++field6602;
         int var24 = arg5 - arg8;
         int var23 = arg4 - arg7;
         int var22 = arg1 - arg11;
         float var13 = arg0[2] * (float)var22 + arg0[1] * (float)var24 + arg0[0] * (float)var23;
         float var14 = arg0[5] * (float)var22 + arg0[4] * (float)var24 + arg0[3] * (float)var23;
         float var15 = arg0[8] * (float)var22 + arg0[7] * (float)var24 + arg0[6] * (float)var23;
         float var16 = 0.5F + (float)Math.atan2((double)var13, (double)var15) / 6.2831855F;
         if (arg9 != 1.0F) {
            var16 = arg9 * var16;
         }

         float var17;
         label52: {
            var17 = var14 + 0.5F + arg2;
            if (~arg10 == -2) {
               float var18 = var16;
               var16 = -var17;
               var17 = var18;
               if (!var12) {
                  break label52;
               }
            }

            if (~arg10 != -3) {
               if (arg10 != 3) {
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

         arg6[0] = var16;
         arg6[1] = var17;
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field6603[4] + (arg0 != null ? field6603[3] : field6603[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6603[3] : field6603[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3484(int arg0) {
      try {
         if (arg0 < 1) {
            field6594 = 121;
         }

         field6598 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6603[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class477(int arg0) {
      try {
         this.field6601 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6603[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3485(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3486(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
