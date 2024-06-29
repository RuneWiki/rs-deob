import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class348 {
   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5292 = new String[]{method2729(method2728("3\to\u001a")), method2729(method2728("&R-X\u0000")), method2729(method2728("7\u000f-2U")), method2729(method2728("7\u000f-0U")), method2729(method2728("7\u000f-3U")), method2729(method2728("7\u000f-1U")), method2729(method2728("7\u000f-5U"))};
   @OriginalMember(
      owner = "client!js",
      name = "b",
      descriptor = "I"
   )
   public static int field5289 = -2;
   @OriginalMember(
      owner = "client!js",
      name = "f",
      descriptor = "[Lrja;"
   )
   public static class114[] field5290 = new class114[128];
   @OriginalMember(
      owner = "client!js",
      name = "g",
      descriptor = "I"
   )
   public static int field5284;
   @OriginalMember(
      owner = "client!js",
      name = "i",
      descriptor = "I"
   )
   public static int field5285;
   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "I"
   )
   public static int field5286;
   @OriginalMember(
      owner = "client!js",
      name = "d",
      descriptor = "I"
   )
   public static int field5287;
   @OriginalMember(
      owner = "client!js",
      name = "e",
      descriptor = "I"
   )
   public static int field5288;
   @OriginalMember(
      owner = "client!js",
      name = "h",
      descriptor = "I"
   )
   public static int field5291;
   @OriginalMember(
      owner = "client!js",
      name = "c",
      descriptor = "Lra;"
   )
   public static class117 field5283;

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(IIZIIII)V",
      line = 3
   )
   public static final void method2723(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
      int var7 = client.field4530;

      try {
         ++field5286;
         int var8 = class768.method5559(arg5, class22.field234, class506.field7472, 71);
         int var9 = class768.method5559(arg0, class22.field234, class506.field7472, 71);
         if (!arg2) {
            field5290 = null;
         }

         int var10 = class768.method5559(arg1, class100.field1232, class197.field2442, 71);
         int var11 = class768.method5559(arg4, class100.field1232, class197.field2442, 71);
         int var12 = class768.method5559(arg5 + arg6, class22.field234, class506.field7472, 71);
         int var13 = class768.method5559(-arg6 + arg0, class22.field234, class506.field7472, 71);
         int var14 = var8;
         if (var7 != 0) {
            class47.method372(var11, class292.field4077[var8], arg3, (byte)122, var10);
            var14 = var8 + 1;
         }

         while(true) {
            while(var12 > var14) {
               class47.method372(var11, class292.field4077[var14], arg3, (byte)122, var10);
               ++var14;
            }

            int var15 = var9;
            if (var7 == 0) {
               if (var7 != 0) {
                  class47.method372(var11, class292.field4077[var9], arg3, (byte)112, var10);
                  var15 = var9 - 1;
               }

               while(true) {
                  while(~var13 > ~var15) {
                     class47.method372(var11, class292.field4077[var15], arg3, (byte)112, var10);
                     --var15;
                  }

                  int var16 = class768.method5559(arg1 + arg6, class100.field1232, class197.field2442, 71);
                  int var17 = class768.method5559(-arg6 + arg4, class100.field1232, class197.field2442, 71);
                  int var18 = var12;
                  if (var7 == 0) {
                     if (var7 == 0 && ~var12 < ~var13) {
                        return;
                     }

                     do {
                        int[] var19 = class292.field4077[var18];
                        class47.method372(var16, var19, arg3, (byte)108, var10);
                        class47.method372(var11, var19, arg3, (byte)96, var17);
                        ++var18;
                     } while(~var18 >= ~var13);

                     return;
                  }

                  --var15;
               }
            }

            ++var14;
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field5292[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(IIIIII[F)V",
      line = 58
   )
   public static final void method2724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
      int var7 = client.field4530;

      try {
         ++field5287;
         if (~arg5 < -1 && !class766.method5547(1008, arg5)) {
            throw new IllegalArgumentException("");
         } else if (~arg1 < -1 && !class766.method5547(1008, arg1)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class651.method4697(1, arg3);
            int var9 = 0;
            int var10 = ~arg1 >= ~arg5 ? arg1 : arg5;
            int var11 = arg5 >> 1;
            int var12 = arg1 >> 1;
            float[] var13 = arg6;
            float[] var14 = new float[var11 * var12 * var8];
            if (arg0 != 341) {
               method2724(-83, -53, -12, 118, 127, -105, (float[])null);
            }

            while(true) {
               OpenGL.glTexImage2Df(arg2, var9, arg4, arg5, arg1, 0, arg3, 5126, var13, 0);
               if (var10 <= 1) {
                  return;
               }

               int var10000;
               label89: {
                  int var15 = arg5 * var8;
                  float[] var16 = var14;
                  int var17 = 0;
                  if (var7 != 0) {
                     var10000 = var17;
                  } else if (var17 >= var8) {
                     var14 = var13;
                     var13 = var16;
                     arg5 = var11;
                     arg1 = var12;
                     var12 >>= 1;
                     var11 >>= 1;
                     var10000 = var10 >> 1;
                     if (var7 == 0) {
                        break label89;
                     }
                  } else {
                     var10000 = var17;
                  }

                  while(true) {
                     int var18 = var10000;
                     int var19 = var17;
                     int var20 = var15 + var17;
                     int var21 = 0;
                     if (var7 != 0 || var21 < var12) {
                        do {
                           int var22 = 0;
                           if (var7 != 0 || var22 < var11) {
                              do {
                                 float var23 = var13[var19];
                                 int var24 = var8 + var19;
                                 float var25 = var13[var24] + var23;
                                 float var26 = var13[var20] + var25;
                                 var19 = var8 + var24;
                                 int var27 = var8 + var20;
                                 float var28 = var13[var27] + var26;
                                 var14[var18] = var28 * 0.25F;
                                 var20 = var8 + var27;
                                 var18 += var8;
                                 ++var22;
                              } while(var22 < var11);
                           }

                           var19 += var15;
                           var20 += var15;
                           ++var21;
                        } while(var21 < var12);
                     }

                     ++var17;
                     if (var17 >= var8) {
                        var14 = var13;
                        var13 = var16;
                        arg5 = var11;
                        arg1 = var12;
                        var12 >>= 1;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (var7 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var17;
                     }
                  }
               }

               var10 = var10000;
               ++var9;
            }
         }
      } catch (RuntimeException var30) {
         throw class670.method4877(var30, field5292[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5292[1] : field5292[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(IZ)V",
      line = 159
   )
   public static final void method2725(int arg0, boolean arg1) {
      try {
         class36.field394 = new int[arg0];
         ++field5285;
         class748.field11096 = new int[arg0];
         if (!arg1) {
            method2723(-121, 79, true, -124, -90, 114, 121);
         }

         class507.field7489 = new int[arg0];
         class115.field1383 = new int[arg0];
         class465.field6982 = new int[arg0];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5292[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(B[B)Ljava/lang/String;",
      line = 176
   )
   public static final String method2726(byte arg0, byte[] arg1) {
      try {
         if (arg0 != 7) {
            method2724(-18, -22, -65, 81, 105, -49, (float[])null);
         }

         ++field5284;
         return class29.method207(arg1.length, 0, arg1, 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5292[5] + arg0 + ',' + (arg1 != null ? field5292[1] : field5292[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(B)V",
      line = 189
   )
   public static void method2727(byte arg0) {
      try {
         field5283 = null;
         field5290 = null;
         if (arg0 != 50) {
            field5291 = 108;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5292[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(FIFI[FIIFFII)V"
   )
   public abstract void method2436(float arg0, int arg1, float arg2, int arg3, float[] arg4, int arg5, int arg6, float arg7, float arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2728(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2729(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
