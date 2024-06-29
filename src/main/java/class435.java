import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class435 implements class99 {
   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "Lqh;"
   )
   private class74 field6044;
   @OriginalMember(
      owner = "client!fr",
      name = "h",
      descriptor = "Lsja;"
   )
   public class11 field6051;
   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6055 = new String[]{method3247(method3246("\u0011\u0007\u001bi<")), method3247(method3246("\u0011\u0007\u001bj<")), method3247(method3246("\u0011\u0007\u001bb<")), method3247(method3246("\f[\u001b\u0005i")), method3247(method3246("\u0019\u0000YG")), method3247(method3246("\u0011\u0007\u001bn<")), method3247(method3246("\u0011\u0007\u001bm<")), method3247(method3246("\u0011\u0007\u001b\u0017}\u0019\u001cA\u0015<"))};
   @OriginalMember(
      owner = "client!fr",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field6049 = true;
   @OriginalMember(
      owner = "client!fr",
      name = "e",
      descriptor = "B"
   )
   public static byte field6052;
   @OriginalMember(
      owner = "client!fr",
      name = "j",
      descriptor = "I"
   )
   public static int field6045;
   @OriginalMember(
      owner = "client!fr",
      name = "c",
      descriptor = "I"
   )
   public static int field6046;
   @OriginalMember(
      owner = "client!fr",
      name = "i",
      descriptor = "I"
   )
   public static int field6048;
   @OriginalMember(
      owner = "client!fr",
      name = "g",
      descriptor = "I"
   )
   public static int field6050;
   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "I"
   )
   public static int field6053;
   @OriginalMember(
      owner = "client!fr",
      name = "k",
      descriptor = "I"
   )
   public static int field6054;
   @OriginalMember(
      owner = "client!fr",
      name = "d",
      descriptor = "Lbo;"
   )
   public class763 field6047;

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public void method906(int arg0, boolean arg1) {
      try {
         ++field6046;
         if (arg1) {
            int var3 = this.field6051.field129.method1433(this.field6047.method2125(), class698.field10190, 1) - -this.field6051.field131;
            int var4 = this.field6051.field128.method1325(this.field6047.method2129(), class420.field5892, arg0 ^ 21231) + this.field6051.field132;
            this.field6047.method5482(var3, var4);
         }

         if (arg0 != 29560) {
            field6052 = -80;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6055[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method905(int arg0) {
      try {
         ++field6045;
         this.field6047 = class583.method4187(this.field6044, this.field6051.field130, 86);
         if (arg0 != -15238) {
            this.field6047 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6055[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method3244(String arg0, byte arg1) {
      try {
         if (arg1 != 18) {
            method3245(-19, -70, -123, (float[])null, -24, 45, 48);
         }

         ++field6048;
         System.exit(1);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6055[6] + (arg0 != null ? field6055[3] : field6055[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method907(boolean arg0) {
      try {
         ++field6054;
         return !arg0 ? true : this.field6044.method717(this.field6051.field130, (byte)-58);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6055[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(III[FIII)V"
   )
   public static final void method3245(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         ++field6053;
         if (~arg6 < -1 && !class685.method5005(arg6, (byte)116)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 < -1 && !class685.method5005(arg2, (byte)110)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class341.method2702(-91, arg1);
            int var9 = 0;
            int var10 = ~arg2 < ~arg6 ? arg6 : arg2;
            if (arg0 != 1) {
               method3244((String)null, (byte)-37);
            }

            int var11 = arg6 >> 1;
            int var12 = arg2 >> 1;
            float[] var13 = arg3;
            float[] var14 = new float[var11 * var12 * var8];

            while(true) {
               OpenGL.glTexImage2Df(arg4, var9, arg5, arg6, arg2, 0, arg1, 5126, var13, 0);
               if (var10 <= 1) {
                  return;
               }

               int var10000;
               label91: {
                  int var15 = arg6 * var8;
                  float[] var16 = var14;
                  int var17 = 0;
                  if (var7) {
                     var10000 = var17;
                  } else if (~var8 >= ~var17) {
                     var14 = var13;
                     arg2 = var12;
                     arg6 = var11;
                     var13 = var16;
                     ++var9;
                     var11 >>= 1;
                     var12 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var7) {
                        break label91;
                     }
                  } else {
                     var10000 = var17;
                  }

                  while(true) {
                     int var18 = var10000;
                     int var19 = var17;
                     int var20 = var17 - -var15;
                     int var21 = 0;
                     if (var7 || ~var21 > ~var12) {
                        do {
                           int var22 = 0;
                           if (var7 || var11 > var22) {
                              do {
                                 float var23 = var13[var19];
                                 int var24 = var8 + var19;
                                 float var25 = var13[var24] + var23;
                                 float var26 = var13[var20] + var25;
                                 var19 = var8 + var24;
                                 int var27 = var8 + var20;
                                 float var28 = var13[var27] + var26;
                                 var20 = var8 + var27;
                                 var14[var18] = var28 * 0.25F;
                                 var18 += var8;
                                 ++var22;
                              } while(var11 > var22);
                           }

                           var19 += var15;
                           var20 += var15;
                           ++var21;
                        } while(~var21 > ~var12);
                     }

                     ++var17;
                     if (~var8 >= ~var17) {
                        var14 = var13;
                        arg2 = var12;
                        arg6 = var11;
                        var13 = var16;
                        ++var9;
                        var11 >>= 1;
                        var12 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var17;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var30) {
         throw class534.method3846(var30, field6055[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6055[3] : field6055[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "<init>",
      descriptor = "(Lqh;Lsja;)V"
   )
   public class435(class74 arg0, class11 arg1) {
      try {
         this.field6044 = arg0;
         this.field6051 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6055[7] + (arg0 != null ? field6055[3] : field6055[4]) + ',' + (arg1 != null ? field6055[3] : field6055[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3246(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3247(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
