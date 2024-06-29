import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class504 extends class141 {
   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7322 = new String[]{method3660(method3659("wW=\u007f")), method3660(method3659("hS\u007fV@")), method3660(method3659("b\f\u007f=\u0015")), method3660(method3659("hS\u007fZ@")), method3660(method3659("hS\u007fW@")), method3660(method3659("hS\u007fU@")), method3660(method3659("hS\u007fR@")), method3660(method3659("hS\u007fY@")), method3660(method3659("hS\u007fP@")), method3660(method3659("hS\u007fT@")), method3660(method3659("hS\u007f[@")), method3660(method3659("hS\u007fQ@"))};
   @OriginalMember(
      owner = "client!qq",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field7311 = new int[1];
   @OriginalMember(
      owner = "client!qq",
      name = "t",
      descriptor = "[F"
   )
   public static float[] field7316 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   @OriginalMember(
      owner = "client!qq",
      name = "n",
      descriptor = "I"
   )
   public static int field7317 = -1;
   @OriginalMember(
      owner = "client!qq",
      name = "o",
      descriptor = "I"
   )
   public static int field7310;
   @OriginalMember(
      owner = "client!qq",
      name = "q",
      descriptor = "I"
   )
   public static int field7312;
   @OriginalMember(
      owner = "client!qq",
      name = "s",
      descriptor = "I"
   )
   public static int field7313;
   @OriginalMember(
      owner = "client!qq",
      name = "w",
      descriptor = "I"
   )
   public static int field7314;
   @OriginalMember(
      owner = "client!qq",
      name = "v",
      descriptor = "I"
   )
   public static int field7315;
   @OriginalMember(
      owner = "client!qq",
      name = "p",
      descriptor = "I"
   )
   public static int field7318;
   @OriginalMember(
      owner = "client!qq",
      name = "u",
      descriptor = "I"
   )
   public static int field7319;
   @OriginalMember(
      owner = "client!qq",
      name = "r",
      descriptor = "I"
   )
   public static int field7320;
   @OriginalMember(
      owner = "client!qq",
      name = "m",
      descriptor = "I"
   )
   public static int field7321;

   @OriginalMember(
      owner = "client!qq",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3655(int arg0) {
      try {
         field7311 = null;
         field7316 = null;
         if (arg0 != 27791) {
            field7316 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7322[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method3656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         class672.method4890(arg6, arg0 ^ -14860);
         ++field7313;
         if (arg0 == 14864) {
            int var8 = 0;
            int var9 = -arg1 + arg6;
            if (~var9 > -1) {
               var9 = 0;
            }

            int var10 = arg6;
            int var11 = -arg6;
            int var12 = var9;
            int var13 = -var9;
            byte var14 = -1;
            if (class245.field3374 <= arg5 && ~class699.field10237 <= ~arg5) {
               int[] var15 = class341.field4631[arg5];
               int var16 = class298.method2224(-arg6 + arg4, class457.field6528, class348.field4702, -250);
               int var17 = class298.method2224(arg4 + arg6, class457.field6528, class348.field4702, arg0 + -15114);
               int var18 = class298.method2224(arg4 - var9, class457.field6528, class348.field4702, -250);
               int var19 = class298.method2224(arg4 + var9, class457.field6528, class348.field4702, -250);
               class149.method1249(-7, var16, arg2, var15, var18);
               class149.method1249(arg0 + -14871, var18, arg3, var15, var19);
               class149.method1249(-7, var19, arg2, var15, var17);
            }

            byte var20 = -1;
            int var10000;
            int var10001;
            int var45;
            int var46;
            if (var7) {
               var46 = var20 + 2;
               var45 = var14 + 2;
               var13 += var46;
               var10000 = var11;
               var10001 = var45;
            } else {
               if (~var8 <= ~arg6) {
                  return;
               }

               var46 = var20 + 2;
               var45 = var14 + 2;
               var13 += var46;
               var10000 = var11;
               var10001 = var45;
            }

            while(true) {
               while(true) {
                  var11 = var10000 + var10001;
                  if (var13 >= 0 && ~var12 <= -2) {
                     --var12;
                     var13 -= var12 << 1;
                     class147.field1874[var12] = var8;
                  }

                  ++var8;
                  if (~var11 <= -1) {
                     --var10;
                     var11 -= var10 << 1;
                     int var21 = arg5 - var10;
                     int var22 = arg5 + var10;
                     if (class245.field3374 <= var22 && class699.field10237 >= var21) {
                        label144: {
                           if (~var9 < ~var10) {
                              int var23 = class147.field1874[var10];
                              int var24 = class298.method2224(arg4 - -var8, class457.field6528, class348.field4702, -250);
                              int var25 = class298.method2224(-var8 + arg4, class457.field6528, class348.field4702, -250);
                              int var26 = class298.method2224(arg4 + var23, class457.field6528, class348.field4702, -250);
                              int var27 = class298.method2224(arg4 - var23, class457.field6528, class348.field4702, -250);
                              if (~var22 >= ~class699.field10237) {
                                 int[] var28 = class341.field4631[var22];
                                 class149.method1249(-7, var25, arg2, var28, var27);
                                 class149.method1249(-7, var27, arg3, var28, var26);
                                 class149.method1249(arg0 + -14871, var26, arg2, var28, var24);
                              }

                              if (class245.field3374 > var21) {
                                 break label144;
                              }

                              int[] var29 = class341.field4631[var21];
                              class149.method1249(-7, var25, arg2, var29, var27);
                              class149.method1249(arg0 + -14871, var27, arg3, var29, var26);
                              class149.method1249(-7, var26, arg2, var29, var24);
                              if (!var7) {
                                 break label144;
                              }
                           }

                           int var30 = class298.method2224(arg4 + var8, class457.field6528, class348.field4702, -250);
                           int var31 = class298.method2224(arg4 - var8, class457.field6528, class348.field4702, -250);
                           if (class699.field10237 >= var22) {
                              class149.method1249(arg0 + -14871, var31, arg2, class341.field4631[var22], var30);
                           }

                           if (~var21 <= ~class245.field3374) {
                              class149.method1249(-7, var31, arg2, class341.field4631[var21], var30);
                           }
                        }
                     }
                  }

                  int var32 = -var8 + arg5;
                  int var33 = arg5 - -var8;
                  if (var33 < class245.field3374) {
                     break;
                  }

                  var10000 = ~class699.field10237;
                  var10001 = ~var32;
                  if (!var7) {
                     if (var10000 <= var10001) {
                        int var34 = arg4 + var10;
                        int var35 = arg4 - var10;
                        if (~var34 <= ~class457.field6528 && ~var35 >= ~class348.field4702) {
                           int var36 = class298.method2224(var34, class457.field6528, class348.field4702, arg0 + -15114);
                           int var37 = class298.method2224(var35, class457.field6528, class348.field4702, -250);
                           if (~var9 < ~var8) {
                              int var38 = var8 <= var12 ? var12 : class147.field1874[var8];
                              int var39 = class298.method2224(arg4 - -var38, class457.field6528, class348.field4702, -250);
                              int var40 = class298.method2224(-var38 + arg4, class457.field6528, class348.field4702, -250);
                              if (~var33 >= ~class699.field10237) {
                                 int[] var41 = class341.field4631[var33];
                                 class149.method1249(arg0 + -14871, var37, arg2, var41, var40);
                                 class149.method1249(-7, var40, arg3, var41, var39);
                                 class149.method1249(arg0 + -14871, var39, arg2, var41, var36);
                              }

                              if (class245.field3374 <= var32) {
                                 int[] var42 = class341.field4631[var32];
                                 class149.method1249(arg0 ^ -14871, var37, arg2, var42, var40);
                                 class149.method1249(-7, var40, arg3, var42, var39);
                                 class149.method1249(arg0 + -14871, var39, arg2, var42, var36);
                                 if (var7) {
                                    if (~class699.field10237 <= ~var33) {
                                       class149.method1249(-7, var37, arg2, class341.field4631[var33], var36);
                                    }

                                    if (class245.field3374 <= var32) {
                                       class149.method1249(-7, var37, arg2, class341.field4631[var32], var36);
                                    }
                                 }
                              }
                           } else {
                              if (~class699.field10237 <= ~var33) {
                                 class149.method1249(-7, var37, arg2, class341.field4631[var33], var36);
                              }

                              if (class245.field3374 <= var32) {
                                 class149.method1249(-7, var37, arg2, class341.field4631[var32], var36);
                              }
                           }
                        }
                     }
                     break;
                  }
               }

               if (~var8 <= ~var10) {
                  return;
               }

               var46 += 2;
               var45 += 2;
               var13 += var46;
               var10000 = var11;
               var10001 = var45;
            }
         }
      } catch (RuntimeException var44) {
         throw class237.method1823(var44, field7322[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "b",
      descriptor = "(III)Lbl;"
   )
   public static final class678 method3657(int arg0, int arg1, int arg2) {
      try {
         ++field7318;
         class678 var3 = class602.method4379((byte)-123, arg2);
         if (arg0 >= -68) {
            return null;
         } else if (arg1 == -1) {
            return var3;
         } else {
            return var3 != null && var3.field9824 != null && ~var3.field9824.length < ~arg1 ? var3.field9824[arg1] : null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7322[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(Lrv;Z)V"
   )
   public static final void method3658(class121 arg0, boolean arg1) {
      try {
         if (!arg1) {
            field7311 = null;
         }

         ++field7320;
         class460 var2 = (class460)class9.field89.method329((byte)-38, (long)arg0.field3862);
         if (var2 == null) {
            class695.method5062(arg0, (class259)null, arg0.field10701, arg0.field3884[0], arg0.field3888[0], (class506)null, 256, 0);
         } else {
            var2.method3350(0);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7322[1] + (arg0 != null ? field7322[2] : field7322[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method317(int arg0, int arg1, int arg2) {
      try {
         ++field7314;
         if (arg0 != 0) {
            field7311 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7322[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "<init>",
      descriptor = "(Lsc;)V"
   )
   public class504(class369 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(Lm;II)V"
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         super.field1801.method2804(arg0, -2);
         if (arg2 != 0) {
            field7317 = -84;
         }

         ++field7310;
         super.field1801.method2747((byte)-108, arg1);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7322[11] + (arg0 != null ? field7322[2] : field7322[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            ++field7315;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7322[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method307(byte arg0) {
      try {
         super.field1801.method2755(-3800, false);
         if (arg0 <= 102) {
            field7316 = null;
         }

         ++field7319;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7322[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method309(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            ++field7321;
            super.field1801.method2755(-3800, true);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7322[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method313(boolean arg0) {
      try {
         ++field7312;
         if (!arg0) {
            this.method313(false);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7322[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3659(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3660(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
