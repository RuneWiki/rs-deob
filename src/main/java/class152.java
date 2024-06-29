import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class152 {
   @OriginalMember(
      owner = "client!wk",
      name = "b",
      descriptor = "J"
   )
   public long field2435;
   @OriginalMember(
      owner = "client!wk",
      name = "c",
      descriptor = "[I"
   )
   public int[] field2432;
   @OriginalMember(
      owner = "client!wk",
      name = "k",
      descriptor = "[S"
   )
   public short[] field2427;
   @OriginalMember(
      owner = "client!wk",
      name = "e",
      descriptor = "[S"
   )
   public short[] field2431;
   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2438 = new String[]{method1417(method1416("T;xe")), method1417(method1416("A`:'{")), method1417(method1416("M%:J.")), method1417(method1416("M%:K.")), method1417(method1416("M%:M.")), method1417(method1416("M%:5oT'`7.")), method1417(method1416("M%:H.")), method1417(method1416("R/zmj_")), method1417(method1416("T/yl")), method1417(method1416("I+`HeY+gzoX\"q")), method1417(method1416("\\'zhjS4q")), method1417(method1416("P/bh(V/zn(y\"uzuv!umcH")), method1417(method1416("T/``p_\u0002}kt[<}lu")), method1417(method1416("P/bh(V/zn(H+recY::HeY+gzoX\"qFdP+w}"))};
   @OriginalMember(
      owner = "client!wk",
      name = "d",
      descriptor = "Leb;"
   )
   public static class650 field2434 = new class650(10, -1);
   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "Lgh;"
   )
   public static class572 field2437 = new class572(24, -1);
   @OriginalMember(
      owner = "client!wk",
      name = "g",
      descriptor = "I"
   )
   public static int field2428;
   @OriginalMember(
      owner = "client!wk",
      name = "f",
      descriptor = "I"
   )
   public static int field2429;
   @OriginalMember(
      owner = "client!wk",
      name = "h",
      descriptor = "I"
   )
   public static int field2433;
   @OriginalMember(
      owner = "client!wk",
      name = "j",
      descriptor = "I"
   )
   public static int field2436;
   @OriginalMember(
      owner = "client!wk",
      name = "i",
      descriptor = "[[[S"
   )
   public static short[][][] field2430;

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(IIFBFIIIIII[F[FF)V",
      line = 3
   )
   public static final void method1412(int arg0, int arg1, float arg2, byte arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, float[] arg11, float[] arg12, float arg13) {
      boolean var14 = client.field4564;

      try {
         float var19;
         float var20;
         label71: {
            int var15 = 16 % ((arg3 - -46) / 62);
            int var26 = arg5 - arg6;
            ++field2436;
            int var25 = arg0 - arg1;
            int var27 = arg10 - arg7;
            float var16 = arg12[2] * (float)var27 + arg12[1] * (float)var26 + arg12[0] * (float)var25;
            float var17 = arg12[5] * (float)var27 + arg12[3] * (float)var25 + arg12[4] * (float)var26;
            float var18 = arg12[8] * (float)var27 + arg12[7] * (float)var26 + arg12[6] * (float)var25;
            if (arg9 != 0) {
               if (arg9 == 1) {
                  var19 = arg13 + var18 + 0.5F;
                  var20 = arg2 + var16 + 0.5F;
                  if (!var14) {
                     break label71;
                  }
               }

               if (~arg9 == -3) {
                  var19 = -var17 + arg4 + 0.5F;
                  var20 = -var16 + arg2 + 0.5F;
                  if (!var14) {
                     break label71;
                  }
               }

               if (arg9 != 3) {
                  if (~arg9 == -5) {
                     var19 = -var17 + arg4 + 0.5F;
                     var20 = arg13 + var18 + 0.5F;
                     if (!var14) {
                        break label71;
                     }
                  }

                  var20 = -var18 + arg13 + 0.5F;
                  var19 = -var17 + arg4 + 0.5F;
                  if (!var14) {
                     break label71;
                  }
               }

               var20 = arg2 + var16 + 0.5F;
               var19 = -var17 + arg4 + 0.5F;
               if (!var14) {
                  break label71;
               }
            }

            var19 = -var18 + arg13 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
         }

         label77: {
            if (~arg8 == -2) {
               float var21 = var20;
               var20 = -var19;
               var19 = var21;
               if (!var14) {
                  break label77;
               }
            }

            if (arg8 != 2) {
               if (arg8 != 3) {
                  break label77;
               }

               float var22 = var20;
               var20 = var19;
               var19 = -var22;
               if (!var14) {
                  break label77;
               }
            }

            var20 = -var20;
            var19 = -var19;
         }

         arg11[1] = var19;
         arg11[0] = var20;
      } catch (RuntimeException var24) {
         throw class608.method4462(var24, field2438[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field2438[1] : field2438[0]) + ',' + (arg12 != null ? field2438[1] : field2438[0]) + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(IZLjava/lang/String;II)V",
      line = 95
   )
   public static final void method1413(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
      try {
         class782.method5648(arg2, arg1, (String)null, (byte)-126, false, arg3, arg0);
         if (arg4 != -24482) {
            field2428 = 44;
         }

         ++field2429;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2438[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2438[1] : field2438[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(I)Z",
      line = 109
   )
   public static final boolean method1414(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(B)V",
      line = 210
   )
   public static void method1415(byte arg0) {
      try {
         field2430 = null;
         field2434 = null;
         field2437 = null;
         int var1 = -74 % ((arg0 - 72) / 39);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2438[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "<init>",
      descriptor = "(J[I[S[S)V",
      line = 220
   )
   public class152(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field2435 = arg0;
         this.field2432 = arg1;
         this.field2427 = arg3;
         this.field2431 = arg2;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2438[5] + arg0 + ',' + (arg1 != null ? field2438[1] : field2438[0]) + ',' + (arg2 != null ? field2438[1] : field2438[0]) + ',' + (arg3 != null ? field2438[1] : field2438[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "<init>",
      descriptor = "()V",
      line = 233
   )
   protected class152() {
   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1416(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1417(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
