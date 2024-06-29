import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class592 {
   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8186 = new String[]{method4262(method4261("Na\t\u00138")), method4262(method4261("[:KQ")), method4262(method4261("E:\t|m"))};
   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "F"
   )
   public static float field8184;
   @OriginalMember(
      owner = "client!pu",
      name = "b",
      descriptor = "I"
   )
   public static int field8185;

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(IIIIBI[II)V"
   )
   public static final void method4259(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int[] arg6, int arg7) {
      boolean var8 = client.field4273;

      try {
         ++field8185;
         if (arg7 > 0 && !class685.method5005(arg7, (byte)119)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 < -1 && !class685.method5005(arg2, (byte)113)) {
            throw new IllegalArgumentException("");
         } else if (~arg3 != -32994) {
            throw new IllegalArgumentException("");
         } else {
            int var9 = 0;
            int var10 = ~arg7 > ~arg2 ? arg7 : arg2;
            int var11 = arg7 >> 1;
            int var12 = arg2 >> 1;
            if (arg4 < -119) {
               int[] var13 = arg6;
               int[] var14 = new int[var11 * var12];

               while(true) {
                  OpenGL.glTexImage2Di(arg5, var9, arg1, arg7, arg2, 0, arg3, arg0, var13, 0);
                  if (var10 <= 1) {
                     return;
                  }

                  int var10000;
                  label92: {
                     int var15 = 0;
                     int var16 = 0;
                     int var17 = arg7 + var16;
                     int[] var18 = var14;
                     int var19 = 0;
                     if (var8) {
                        var10000 = 0;
                     } else if (~var19 <= ~var12) {
                        var14 = var13;
                        var13 = var18;
                        arg2 = var12;
                        arg7 = var11;
                        var12 >>= 1;
                        var10 >>= 1;
                        var10000 = var11 >> 1;
                        if (!var8) {
                           break label92;
                        }
                     } else {
                        var10000 = 0;
                     }

                     while(true) {
                        label89: {
                           int var20 = var10000;
                           if (var8) {
                              var10000 = var13[var16++];
                           } else if (var20 >= var11) {
                              var16 += arg7;
                              var10000 = arg7 + var17;
                              if (!var8) {
                                 break label89;
                              }
                           } else {
                              var10000 = var13[var16++];
                           }

                           while(true) {
                              int var21 = var10000;
                              int var22 = var13[var16++];
                              int var23 = var13[var17++];
                              int var24 = var13[var17++];
                              int var25 = 255 & var21;
                              int var26 = var21 >> 24 & 255;
                              int var27 = var21 >> 16 & 255;
                              int var28 = (65437 & var21) >> 8;
                              int var29 = (var22 & 255) + var25;
                              int var30 = (255 & var22 >> 24) + var26;
                              int var31 = ((65376 & var22) >> 8) + var28;
                              int var32 = ((16715278 & var22) >> 16) + var27;
                              int var33 = (var23 >> 24 & 255) + var30;
                              int var34 = (255 & var23) + var29;
                              int var35 = (var23 >> 8 & 255) + var31;
                              int var36 = (255 & var23 >> 16) + var32;
                              int var37 = ((var24 & 65315) >> 8) + var35;
                              int var38 = (var24 >> 16 & 255) + var36;
                              int var39 = (255 & var24) + var34;
                              int var40 = (255 & var24 >> 24) + var33;
                              var14[var15++] = class283.method2155(class743.method5375(var39, 1020) >> 2, class283.method2155(class743.method5375(1020, var37) << 6, class283.method2155(class743.method5375(1020, var38) << 14, class743.method5375(var40, 1020) << 22)));
                              ++var20;
                              if (var20 >= var11) {
                                 var16 += arg7;
                                 var10000 = arg7 + var17;
                                 if (!var8) {
                                    break;
                                 }
                              } else {
                                 var10000 = var13[var16++];
                              }
                           }
                        }

                        var17 = var10000;
                        ++var19;
                        if (~var19 <= ~var12) {
                           var14 = var13;
                           var13 = var18;
                           arg2 = var12;
                           arg7 = var11;
                           var12 >>= 1;
                           var10 >>= 1;
                           var10000 = var11 >> 1;
                           if (!var8) {
                              break;
                           }
                        } else {
                           var10000 = 0;
                        }
                     }
                  }

                  var11 = var10000;
                  ++var9;
               }
            }
         }
      } catch (RuntimeException var42) {
         throw class534.method3846(var42, field8186[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8186[0] : field8186[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(Lu;IIIII)V"
   )
   public static final void method4260(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = true;
      int var7 = arg2;
      int var8 = arg2 + arg4;
      int var9 = arg3 - 1;
      int var10 = arg3 + arg5;

      for(int var11 = arg1; var11 <= arg1 + 1; ++var11) {
         if (class398.field5594 != var11) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if (var12 >= 0 && var12 < class635.field8973) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if (var13 >= 0 && var13 < class304.field4042 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                        class225 var14 = class111.field1404[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (class93.field1241[var11].method2221(false, var13, var12) + class93.field1241[var11].method2221(false, var13, var12 + 1) + class93.field1241[var11].method2221(false, var13 + 1, var12) + class93.field1241[var11].method2221(false, var13 + 1, var12 + 1)) / 4 - (class93.field1241[arg1].method2221(false, arg3, arg2) + class93.field1241[arg1].method2221(false, arg3, arg2 + 1) + class93.field1241[arg1].method2221(false, arg3 + 1, arg2) + class93.field1241[arg1].method2221(false, arg3 + 1, arg2 + 1)) / 4;
                           class718 var16 = var14.field2831;
                           class718 var17 = var14.field2830;
                           if (var16 != null && var16.method771(116)) {
                              arg0.method783((var13 - arg3) * class212.field2635 + (1 - arg5) * class187.field2291, var16, var15, -1, var6, (var12 - arg2) * class212.field2635 + (1 - arg4) * class187.field2291, class292.field3851);
                           }

                           if (var17 != null && var17.method771(63)) {
                              arg0.method783((var13 - arg3) * class212.field2635 + (1 - arg5) * class187.field2291, var17, var15, -1, var6, (var12 - arg2) * class212.field2635 + (1 - arg4) * class187.field2291, class292.field3851);
                           }

                           for(class752 var18 = var14.field2821; var18 != null; var18 = var18.field10923) {
                              class47 var19 = var18.field10922;
                              if (var19 != null && var19.method771(48) && (var19.field547 == var12 || var7 == var12) && (var19.field540 == var13 || var9 == var13)) {
                                 int var20 = var19.field548 - var19.field547 + 1;
                                 int var21 = var19.field541 - var19.field540 + 1;
                                 arg0.method783((var19.field540 - arg3) * class212.field2635 + (var21 - arg5) * class187.field2291, var19, var15, -1, var6, (var19.field547 - arg2) * class212.field2635 + (var20 - arg4) * class187.field2291, class292.field3851);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4261(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4262(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
