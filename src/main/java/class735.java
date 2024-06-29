import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class735 extends class76 {
   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "I"
   )
   public int field10737 = 0;
   @OriginalMember(
      owner = "client!ed",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10742 = new String[]{method5347(method5346("{yw\u00122")), method5347(method5346("e3w\u007fg")), method5347(method5346("ph5=")), method5347(method5346("{yw\u00152")), method5347(method5346("{yw\u00132")), method5347(method5346("{yw\u00102"))};
   @OriginalMember(
      owner = "client!ed",
      name = "B",
      descriptor = "[[I"
   )
   public static int[][] field10741 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!ed",
      name = "F",
      descriptor = "I"
   )
   public static int field10738;
   @OriginalMember(
      owner = "client!ed",
      name = "C",
      descriptor = "I"
   )
   public static int field10739;
   @OriginalMember(
      owner = "client!ed",
      name = "E",
      descriptor = "I"
   )
   public static int field10740;

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ZILwf;)V",
      line = 5
   )
   private final void method5342(boolean arg0, int arg1, class147 arg2) {
      try {
         if (arg0) {
            field10741 = null;
         }

         ++field10738;
         if (arg1 == 2) {
            this.field10737 = arg2.method1211(-26166);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10742[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10742[1] : field10742[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(BLwf;)V",
      line = 21
   )
   public final void method5343(byte arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         while(true) {
            int var4 = arg1.method1143(arg0 + -15546);
            if (~var4 != -1) {
               this.method5342(false, var4, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field10739;
            break;
         }

         if (arg0 != 81) {
            field10741 = null;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10742[3] + arg0 + ',' + (arg1 != null ? field10742[1] : field10742[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 44
   )
   public static final void method5344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4360;

      try {
         ++field10740;
         int var9 = 0;
         int var10 = arg6;
         int var11 = 0;
         int var12 = arg4 - arg3;
         int var13 = -arg3 + arg6;
         int var14 = arg4 * arg4;
         int var15 = arg6 * arg6;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg6 << 1;
         int var23 = var13 << 1;
         int var24 = (-var22 + 1) * var14 + var18;
         int var25 = -((var22 - 1) * var19) + var15;
         int var26 = (-var23 + 1) * var16 + var20;
         int var27 = -((var23 + -1) * var21) + var17;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 + -3) * var19;
         int var34 = var20 * 3;
         int var35 = (var23 - 3) * var21;
         int var36 = var29;
         if (arg7 != 4) {
            field10741 = null;
         }

         int var37 = (arg6 + -1) * var28;
         int var38 = var31;
         if (~arg5 <= ~class245.field3374 && class699.field10237 >= arg5) {
            int[] var39 = class341.field4631[arg5];
            int var40 = class298.method2224(-arg4 + arg1, class457.field6528, class348.field4702, -250);
            int var41 = class298.method2224(arg1 + arg4, class457.field6528, class348.field4702, -250);
            int var42 = class298.method2224(-var12 + arg1, class457.field6528, class348.field4702, -250);
            int var43 = class298.method2224(arg1 + var12, class457.field6528, class348.field4702, -250);
            class149.method1249(-7, var40, arg0, var39, var42);
            class149.method1249(-7, var42, arg2, var39, var43);
            class149.method1249(-7, var43, arg0, var39, var41);
         }

         int var44 = (var13 + -1) * var30;
         int var10000;
         if (var8) {
            var10000 = var13 < arg6 ? 0 : 1;
         } else {
            if (~arg6 >= -1) {
               return;
            }

            var10000 = var13 < arg6 ? 0 : 1;
         }

         while(true) {
            while(true) {
               int var45;
               label147: {
                  var45 = var10000;
                  if (var24 < 0) {
                     if (var8) {
                        var24 += var32;
                        var25 += var36;
                        var36 += var29;
                        var32 += var29;
                        ++var9;
                     }
                  } else {
                     var10000 = var45;
                     if (!var8) {
                        break label147;
                     }

                     var32 = var45;
                     ++var9;
                  }

                  while(true) {
                     while(~var24 > -1) {
                        var24 += var32;
                        var25 += var36;
                        var36 += var29;
                        var32 += var29;
                        ++var9;
                     }

                     var10000 = var45;
                     if (!var8) {
                        break;
                     }

                     var32 = var45;
                     ++var9;
                  }
               }

               if (var10000 == 0) {
                  if (var25 < 0) {
                     var24 += var32;
                     var25 += var36;
                     ++var9;
                     var36 += var29;
                     var32 += var29;
                  }
               } else {
                  label222: {
                     if (var26 < 0) {
                        if (var8) {
                           var26 += var34;
                           var27 += var38;
                           var38 += var31;
                           ++var11;
                           var34 += var31;
                        }
                     } else {
                        if (!var8) {
                           if (var27 < 0) {
                              var27 += var38;
                              var26 += var34;
                              var38 += var31;
                              ++var11;
                              var34 += var31;
                           }

                           var27 += -var35;
                           var26 += -var44;
                           var35 -= var30;
                           var44 -= var30;
                           if (var25 < 0) {
                              var24 += var32;
                              var25 += var36;
                              ++var9;
                              var36 += var29;
                              var32 += var29;
                           }
                           break label222;
                        }

                        var34 = var27;
                     }

                     while(true) {
                        while(var26 < 0) {
                           var26 += var34;
                           var27 += var38;
                           var38 += var31;
                           ++var11;
                           var34 += var31;
                        }

                        if (!var8) {
                           if (var27 < 0) {
                              var27 += var38;
                              var26 += var34;
                              var38 += var31;
                              ++var11;
                              var34 += var31;
                           }

                           var27 += -var35;
                           var26 += -var44;
                           var35 -= var30;
                           var44 -= var30;
                           if (var25 < 0) {
                              var24 += var32;
                              var25 += var36;
                              ++var9;
                              var36 += var29;
                              var32 += var29;
                           }
                           break;
                        }

                        var34 = var27;
                     }
                  }
               }

               var24 += -var37;
               var25 += -var33;
               var37 -= var28;
               var33 -= var28;
               --var10;
               int var46 = -var10 + arg5;
               int var47 = arg5 + var10;
               if (~var47 <= ~class245.field3374) {
                  var10000 = ~var46;
                  int var10001 = ~class699.field10237;
                  if (var8) {
                     var10000 = var10000 < var10001 ? 0 : 1;
                     continue;
                  }

                  if (var10000 >= var10001) {
                     label216: {
                        int var48 = class298.method2224(arg1 + var9, class457.field6528, class348.field4702, -250);
                        int var49 = class298.method2224(arg1 - var9, class457.field6528, class348.field4702, -250);
                        if (var45 == 0) {
                           if (var46 >= class245.field3374) {
                              class149.method1249(-7, var49, arg0, class341.field4631[var46], var48);
                           }

                           if (var47 > class699.field10237) {
                              break label216;
                           }

                           class149.method1249(-7, var49, arg0, class341.field4631[var47], var48);
                           if (!var8) {
                              break label216;
                           }
                        }

                        int var50 = class298.method2224(arg1 + var11, class457.field6528, class348.field4702, arg7 ^ -254);
                        int var51 = class298.method2224(-var11 + arg1, class457.field6528, class348.field4702, arg7 + -254);
                        if (~class245.field3374 >= ~var46) {
                           int[] var52 = class341.field4631[var46];
                           class149.method1249(-7, var49, arg0, var52, var51);
                           class149.method1249(-7, var51, arg2, var52, var50);
                           class149.method1249(-7, var50, arg0, var52, var48);
                        }

                        if (class699.field10237 >= var47) {
                           int[] var53 = class341.field4631[var47];
                           class149.method1249(-7, var49, arg0, var53, var51);
                           class149.method1249(-7, var51, arg2, var53, var50);
                           class149.method1249(arg7 ^ -3, var50, arg0, var53, var48);
                        }
                     }
                  }
               }

               if (~var10 >= -1) {
                  return;
               }

               var10000 = var13 < var10 ? 0 : 1;
            }
         }
      } catch (RuntimeException var55) {
         throw class237.method1823(var55, field10742[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(I)V",
      line = 248
   )
   public static void method5345(int arg0) {
      try {
         field10741 = null;
         if (arg0 != 27785) {
            field10741 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10742[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5346(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5347(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
