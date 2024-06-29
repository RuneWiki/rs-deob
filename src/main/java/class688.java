import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class688 {
   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10368 = new String[]{method5010(method5009("]X.GD\u001f")), method5010(method5009("]X.GF\u001f")), method5010(method5009("]X.GG\u001f"))};
   @OriginalMember(
      owner = "client!jka",
      name = "g",
      descriptor = "Loi;"
   )
   public static class79 field10363 = new class79(0, 1);
   @OriginalMember(
      owner = "client!jka",
      name = "e",
      descriptor = "I"
   )
   public static int field10366 = 0;
   @OriginalMember(
      owner = "client!jka",
      name = "h",
      descriptor = "I"
   )
   public static int field10360;
   @OriginalMember(
      owner = "client!jka",
      name = "f",
      descriptor = "I"
   )
   public static int field10361;
   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "I"
   )
   public static int field10362;
   @OriginalMember(
      owner = "client!jka",
      name = "d",
      descriptor = "I"
   )
   public static int field10364;
   @OriginalMember(
      owner = "client!jka",
      name = "c",
      descriptor = "Lmr;"
   )
   public static class153 field10365;
   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "[Laha;"
   )
   public static class400[] field10367;

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method5006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field10362;
         int var9 = 0;
         int var10 = arg1;
         int var11 = 0;
         int var12 = -arg4 + arg6;
         int var13 = arg1 - arg4;
         int var14 = arg6 * arg6;
         int var15 = arg1 * arg1;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg1 << 1;
         int var23 = var13 << 1;
         int var24 = (-var22 + 1) * var14 + var18;
         int var25 = -((var22 + -1) * var19) + var15;
         int var26 = (-var23 + 1) * var16 - -var20;
         int var27 = var17 - (var23 + -1) * var21;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 + -3) * var19;
         int var34 = var20 * 3;
         int var35 = (var23 + -3) * var21;
         int var36 = var29;
         int var37 = (arg1 + -1) * var28;
         int var38 = var31;
         int var39 = (var13 + -1) * var30;
         int[] var40 = class292.field4077[arg3];
         class47.method372(-var12 + arg7, var40, arg2, (byte)96, arg7 - arg6);
         class47.method372(arg7 + var12, var40, arg0, (byte)102, -var12 + arg7);
         class47.method372(arg6 + arg7, var40, arg2, (byte)117, arg7 + var12);
         int var10000;
         if (var8 != 0) {
            var10000 = ~var13 > ~arg1 ? 0 : 1;
         } else if (arg1 <= 0) {
            if (var8 == 0) {
               if (arg5 <= 60) {
                  method5007(-73, (byte)-113);
                  return;
               }

               return;
            }

            var10000 = arg5 > 60 ? 0 : 1;
         } else {
            var10000 = ~var13 > ~arg1 ? 0 : 1;
         }

         while(true) {
            int var41;
            label147: {
               var41 = var10000;
               if (var24 < 0) {
                  if (var8 != 0) {
                     var24 += var32;
                     var25 += var36;
                     var36 += var29;
                     ++var9;
                     var32 += var29;
                  }
               } else {
                  var10000 = var41;
                  if (var8 == 0) {
                     break label147;
                  }

                  var32 = var41;
               }

               while(true) {
                  while(var24 < 0) {
                     var24 += var32;
                     var25 += var36;
                     var36 += var29;
                     ++var9;
                     var32 += var29;
                  }

                  var10000 = var41;
                  if (var8 == 0) {
                     break;
                  }

                  var32 = var41;
               }
            }

            if (var10000 != 0) {
               label194: {
                  if (var26 < 0) {
                     if (var8 != 0) {
                        var26 += var34;
                        var27 += var38;
                        var34 += var31;
                        var38 += var31;
                        ++var11;
                     }
                  } else {
                     if (var8 == 0) {
                        if (var27 < 0) {
                           var26 += var34;
                           var27 += var38;
                           ++var11;
                           var34 += var31;
                           var38 += var31;
                        }

                        var27 += -var35;
                        var26 += -var39;
                        var35 -= var30;
                        var39 -= var30;
                        break label194;
                     }

                     var38 = var27;
                     ++var11;
                  }

                  while(true) {
                     while(var26 < 0) {
                        var26 += var34;
                        var27 += var38;
                        var34 += var31;
                        var38 += var31;
                        ++var11;
                     }

                     if (var8 == 0) {
                        if (var27 < 0) {
                           var26 += var34;
                           var27 += var38;
                           ++var11;
                           var34 += var31;
                           var38 += var31;
                        }

                        var27 += -var35;
                        var26 += -var39;
                        var35 -= var30;
                        var39 -= var30;
                        break;
                     }

                     var38 = var27;
                     ++var11;
                  }
               }
            }

            if (var25 < 0) {
               var24 += var32;
               var25 += var36;
               ++var9;
               var32 += var29;
               var36 += var29;
            }

            var24 += -var37;
            var25 += -var33;
            --var10;
            var33 -= var28;
            var37 -= var28;
            int var42 = -var10 + arg3;
            int var43 = arg3 + var10;
            int var44 = arg7 - -var9;
            int var45 = -var9 + arg7;
            if (var41 != 0) {
               int var46 = arg7 - -var11;
               int var47 = -var11 + arg7;
               class47.method372(var47, class292.field4077[var42], arg2, (byte)96, var45);
               class47.method372(var46, class292.field4077[var42], arg0, (byte)123, var47);
               class47.method372(var44, class292.field4077[var42], arg2, (byte)109, var46);
               class47.method372(var47, class292.field4077[var43], arg2, (byte)118, var45);
               class47.method372(var46, class292.field4077[var43], arg0, (byte)105, var47);
               class47.method372(var44, class292.field4077[var43], arg2, (byte)111, var46);
               if (var8 != 0) {
                  class47.method372(var44, class292.field4077[var42], arg2, (byte)126, var45);
                  class47.method372(var44, class292.field4077[var43], arg2, (byte)95, var45);
               }
            } else {
               class47.method372(var44, class292.field4077[var42], arg2, (byte)126, var45);
               class47.method372(var44, class292.field4077[var43], arg2, (byte)95, var45);
            }

            if (var10 <= 0) {
               if (var8 == 0) {
                  if (arg5 <= 60) {
                     method5007(-73, (byte)-113);
                     return;
                  }

                  return;
               }

               var10000 = arg5 > 60 ? 0 : 1;
            } else {
               var10000 = ~var13 > ~var10 ? 0 : 1;
            }
         }
      } catch (RuntimeException var49) {
         throw class670.method4877(var49, field10368[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5007(int arg0, byte arg1) {
      try {
         if (arg1 >= 30) {
            ++field10360;
            class434.field6616.method5453(arg0, false);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10368[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5008(int arg0) {
      try {
         field10367 = null;
         int var1 = -72 % ((arg0 - -31) / 42);
         field10363 = null;
         field10365 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10368[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5009(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5010(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
