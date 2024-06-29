import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class495 {
   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "Z"
   )
   public boolean field7253 = false;
   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7258 = new String[]{method3742(method3741("\u0005LD&\u007f")), method3742(method3741("\u0010\u0017\u0006d")), method3742(method3741("\u0015\u0003DD@V")), method3742(method3741("\u0015\u0003DM@V")), method3742(method3741("\u0015\u0003DO@V")), method3742(method3741("\u0015\u0003DA@V")), method3742(method3741("\u0015\u0003DC@V")), method3742(method3741("\u0015\u0003DB@V")), method3742(method3741("\u0015\u0003DK@V")), method3742(method3741("\u0015\u0003DN@V")), method3742(method3741("\u0015\u0003D@@V")), method3742(method3741("\u0015\u0003DE@V")), method3742(method3741("\u0015\u0003DL@V"))};
   @OriginalMember(
      owner = "client!ka",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field7247 = new int[13];
   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "[B"
   )
   public static byte[] field7244 = new byte[2048];
   @OriginalMember(
      owner = "client!ka",
      name = "h",
      descriptor = "I"
   )
   public static int field7243;
   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "I"
   )
   public static int field7245;
   @OriginalMember(
      owner = "client!ka",
      name = "l",
      descriptor = "I"
   )
   public static int field7246;
   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "I"
   )
   public static int field7249;
   @OriginalMember(
      owner = "client!ka",
      name = "n",
      descriptor = "I"
   )
   public static int field7250;
   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "I"
   )
   public static int field7251;
   @OriginalMember(
      owner = "client!ka",
      name = "m",
      descriptor = "I"
   )
   public static int field7252;
   @OriginalMember(
      owner = "client!ka",
      name = "g",
      descriptor = "I"
   )
   public static int field7254;
   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "I"
   )
   public static int field7255;
   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "I"
   )
   public static int field7256;
   @OriginalMember(
      owner = "client!ka",
      name = "j",
      descriptor = "I"
   )
   public static int field7257;
   @OriginalMember(
      owner = "client!ka",
      name = "o",
      descriptor = "Ljava/io/FileOutputStream;"
   )
   public static FileOutputStream field7248;

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIZI[IIZII[I)V",
      line = 45
   )
   private final void method3730(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7, int arg8, int[] arg9) {
      boolean var11 = client.field4564;

      try {
         label123: {
            if (~arg5 != -2) {
               if (arg5 == 2) {
                  if (~arg7 == -1 || ~arg7 == -2) {
                     arg1 = -arg1;
                     arg3 = -arg3;
                     if (!var11) {
                        break label123;
                     }
                  }

                  if (~arg7 != -3) {
                     break label123;
                  }

                  arg1 = 16383 & -arg1;
                  arg3 = 16383 & -arg3;
                  if (!var11) {
                     break label123;
                  }
               }

               if (arg5 != 3) {
                  break label123;
               }

               if (~arg7 == -1 || ~arg7 == -2) {
                  int var12 = arg3;
                  arg3 = -arg1;
                  arg1 = var12;
                  if (!var11) {
                     break label123;
                  }
               }

               if (~arg7 != -4) {
                  if (~arg7 != -3) {
                     break label123;
                  }

                  int var13 = arg3;
                  arg3 = 16383 & arg1;
                  arg1 = -var13 & 16383;
                  if (!var11) {
                     break label123;
                  }
               }

               int var14 = arg3;
               arg3 = arg1;
               arg1 = var14;
               if (!var11) {
                  break label123;
               }
            }

            if (~arg7 == -1 || ~arg7 == -2) {
               int var15 = -arg3;
               arg3 = arg1;
               arg1 = var15;
               if (!var11) {
                  break label123;
               }
            }

            if (arg7 != 3) {
               if (~arg7 != -3) {
                  break label123;
               }

               int var16 = arg3;
               arg3 = -arg1 & 16383;
               arg1 = 16383 & var16;
               if (!var11) {
                  break label123;
               }
            }

            int var17 = arg3;
            arg3 = arg1;
            arg1 = var17;
         }

         if (arg2) {
            field7247 = null;
         }

         ++field7252;
         if (~arg0 != -65536) {
            this.method550(arg7, arg4, arg3, arg8, arg1, arg6, arg0, arg9);
         } else {
            this.method505(arg7, arg4, arg3, arg8, arg1, arg5, arg6);
         }
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field7258[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7258[0] : field7258[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field7258[0] : field7258[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IZ[ZLjk;ZII[IILcfa;Lcfa;I)V",
      line = 146
   )
   private final void method3731(int arg0, boolean arg1, boolean[] arg2, class658 arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8, class177 arg9, class177 arg10, int arg11) {
      boolean var13 = client.field4564;

      try {
         ++field7257;
         if (arg10 != null && arg8 != 0) {
            if (arg6 > -122) {
               this.field7253 = false;
            }

            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            boolean var20;
            boolean var21;
            if (var13) {
               var20 = false;
               if (var17 < arg9.field2732 && arg9.field2726[var17] == var19) {
                  var20 = true;
               }

               var21 = false;
               if (~var18 > ~arg10.field2732 && ~arg10.field2726[var18] == ~var19) {
                  var21 = true;
               }
            } else {
               if (~var19 <= ~arg3.field9603) {
                  return;
               }

               var20 = false;
               if (var17 < arg9.field2732 && arg9.field2726[var17] == var19) {
                  var20 = true;
               }

               var21 = false;
               if (~var18 > ~arg10.field2732 && ~arg10.field2726[var18] == ~var19) {
                  var21 = true;
               }
            }

            while(true) {
               if (!var20 && !var21) {
                  ++var19;
               } else {
                  label383: {
                     if (arg2 != null && !arg2[var19] != !arg4 && ~arg3.field9597[var19] != -1) {
                        if (var21) {
                           ++var18;
                        }

                        if (!var20) {
                           ++var19;
                           break label383;
                        }

                        ++var17;
                        if (!var13) {
                           ++var19;
                           break label383;
                        }
                     }

                     short var22 = 0;
                     int var23 = arg3.field9597[var19];
                     if (~var23 != -4) {
                        if (var23 == 10) {
                           var22 = 128;
                        }
                     } else {
                        var22 = 128;
                     }

                     short var24;
                     byte var25;
                     short var26;
                     short var27;
                     short var28;
                     if (var20) {
                        var24 = arg9.field2725[var17];
                        var25 = arg9.field2721[var17];
                        var26 = arg9.field2735[var17];
                        var27 = arg9.field2722[var17];
                        var28 = arg9.field2728[var17];
                        ++var17;
                        if (var13) {
                           var26 = var22;
                           var24 = var22;
                           var27 = -1;
                           var28 = var22;
                           var25 = 0;
                        }
                     } else {
                        var26 = var22;
                        var24 = var22;
                        var27 = -1;
                        var28 = var22;
                        var25 = 0;
                     }

                     short var29;
                     byte var30;
                     short var31;
                     short var32;
                     short var33;
                     if (!var21) {
                        var29 = var22;
                        var30 = 0;
                        var31 = var22;
                        var32 = -1;
                        var33 = var22;
                        if (var13) {
                           var29 = arg10.field2728[var18];
                           var30 = arg10.field2721[var18];
                           var32 = arg10.field2722[var18];
                           var33 = arg10.field2735[var18];
                           var31 = arg10.field2725[var18];
                           ++var18;
                        }
                     } else {
                        var29 = arg10.field2728[var18];
                        var30 = arg10.field2721[var18];
                        var32 = arg10.field2722[var18];
                        var33 = arg10.field2735[var18];
                        var31 = arg10.field2725[var18];
                        ++var18;
                     }

                     if (((var25 & 2) != 0 || (var30 & 1) != 0) && !var13) {
                        if (var27 == -1) {
                           if (~var32 != 0) {
                              this.method3730(arg3.field9598[var32] & arg5, 0, false, 0, arg3.field9602[var32], arg0, arg1, 0, 0, arg7);
                              if (var13) {
                                 this.method3730(arg5 & arg3.field9598[var27], 0, false, 0, arg3.field9602[var27], arg0, arg1, 0, 0, arg7);
                              }
                           }
                        } else {
                           this.method3730(arg5 & arg3.field9598[var27], 0, false, 0, arg3.field9602[var27], arg0, arg1, 0, 0, arg7);
                        }

                        this.method3730(arg5 & arg3.field9598[var19], var24, false, var28, arg3.field9602[var19], arg0, arg1, var23, var26, arg7);
                        ++var19;
                     } else {
                        label384: {
                           int var34;
                           int var35;
                           int var36;
                           if (var23 == 2) {
                              int var37 = 16383 & -var28 + var29;
                              int var38 = var33 - var26 & 16383;
                              int var39 = -var24 + var31 & 16383;
                              if (~var38 <= -8193) {
                                 var38 -= 16384;
                              }

                              if (var37 >= 8192) {
                                 var37 -= 16384;
                                 if (var39 >= 8192) {
                                    var39 -= 16384;
                                 }
                              } else if (var39 >= 8192) {
                                 var39 -= 16384;
                              }

                              var36 = var26 - -(arg8 * var38 / arg11) & 16383;
                              var34 = arg8 * var37 / arg11 + var28 & 16383;
                              var35 = 16383 & arg8 * var39 / arg11 + var24;
                              if (!var13) {
                                 if (var27 == -1) {
                                    if (~var32 != 0) {
                                       this.method3730(arg3.field9598[var32] & arg5, 0, false, 0, arg3.field9602[var32], arg0, arg1, 0, 0, arg7);
                                       if (var13) {
                                          this.method3730(arg5 & arg3.field9598[var27], 0, false, 0, arg3.field9602[var27], arg0, arg1, 0, 0, arg7);
                                       }
                                    }
                                 } else {
                                    this.method3730(arg5 & arg3.field9598[var27], 0, false, 0, arg3.field9602[var27], arg0, arg1, 0, 0, arg7);
                                 }

                                 this.method3730(arg5 & arg3.field9598[var19], var35, false, var34, arg3.field9602[var19], arg0, arg1, var23, var36, arg7);
                                 ++var19;
                                 break label384;
                              }
                           }

                           int var41;
                           if (var23 == 9) {
                              int var40 = 16383 & -var28 + var29;
                              if (var40 >= 8192) {
                                 var40 -= 16384;
                              }

                              var34 = 16383 & arg8 * var40 / arg11 + var28;
                              var35 = 0;
                              var36 = 0;
                              if (var13) {
                                 if (var23 == 7) {
                                    var41 = -var28 + var29 & 63;
                                    if (var41 >= 32) {
                                       var41 -= 64;
                                    }

                                    var34 = var28 - -(arg8 * var41 / arg11) & 63;
                                    var35 = (-var24 + var31) * arg8 / arg11 + var24;
                                    var36 = (var33 - var26) * arg8 / arg11 + var26;
                                    if (var13) {
                                       var35 = (-var24 + var31) * arg8 / arg11 + var24;
                                       var34 = (-var28 + var29) * arg8 / arg11 + var28;
                                       var36 = (-var26 + var33) * arg8 / arg11 + var26;
                                    }
                                 } else {
                                    var35 = (-var24 + var31) * arg8 / arg11 + var24;
                                    var34 = (-var28 + var29) * arg8 / arg11 + var28;
                                    var36 = (-var26 + var33) * arg8 / arg11 + var26;
                                 }
                              }
                           } else if (var23 == 7) {
                              var41 = -var28 + var29 & 63;
                              if (var41 >= 32) {
                                 var41 -= 64;
                              }

                              var34 = var28 - -(arg8 * var41 / arg11) & 63;
                              var35 = (-var24 + var31) * arg8 / arg11 + var24;
                              var36 = (var33 - var26) * arg8 / arg11 + var26;
                              if (var13) {
                                 var35 = (-var24 + var31) * arg8 / arg11 + var24;
                                 var34 = (-var28 + var29) * arg8 / arg11 + var28;
                                 var36 = (-var26 + var33) * arg8 / arg11 + var26;
                              }
                           } else {
                              var35 = (-var24 + var31) * arg8 / arg11 + var24;
                              var34 = (-var28 + var29) * arg8 / arg11 + var28;
                              var36 = (-var26 + var33) * arg8 / arg11 + var26;
                           }

                           if (var27 == -1) {
                              if (~var32 != 0) {
                                 this.method3730(arg3.field9598[var32] & arg5, 0, false, 0, arg3.field9602[var32], arg0, arg1, 0, 0, arg7);
                                 if (var13) {
                                    this.method3730(arg5 & arg3.field9598[var27], 0, false, 0, arg3.field9602[var27], arg0, arg1, 0, 0, arg7);
                                 }
                              }
                           } else {
                              this.method3730(arg5 & arg3.field9598[var27], 0, false, 0, arg3.field9602[var27], arg0, arg1, 0, 0, arg7);
                           }

                           this.method3730(arg5 & arg3.field9598[var19], var35, false, var34, arg3.field9602[var19], arg0, arg1, var23, var36, arg7);
                           ++var19;
                        }
                     }
                  }
               }

               if (~var19 <= ~arg3.field9603) {
                  return;
               }

               var20 = false;
               if (var17 < arg9.field2732 && arg9.field2726[var17] == var19) {
                  var20 = true;
               }

               var21 = false;
               if (~var18 > ~arg10.field2732 && ~arg10.field2726[var18] == ~var19) {
                  var21 = true;
               }
            }
         } else {
            int var14 = 0;
            if (var13 || ~var14 > ~arg9.field2732) {
               do {
                  short var15 = arg9.field2726[var14];
                  if (arg2 != null && !arg4 != !arg2[var15] && ~arg3.field9597[var15] != -1) {
                     ++var14;
                  } else {
                     short var16 = arg9.field2722[var14];
                     if (~var16 != 0) {
                        this.method3730(arg5 & arg3.field9598[var16], 0, false, 0, arg3.field9602[var16], arg0, arg1, 0, 0, arg7);
                     }

                     this.method3730(arg5 & arg3.field9598[var15], arg9.field2725[var14], false, arg9.field2728[var14], arg3.field9602[var15], arg0, arg1, arg3.field9597[var15], arg9.field2735[var14], arg7);
                     ++var14;
                  }
               } while(~var14 > ~arg9.field2732);

            }
         }
      } catch (RuntimeException var43) {
         throw class608.method4462(var43, field7258[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7258[0] : field7258[1]) + ',' + (arg3 != null ? field7258[0] : field7258[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7258[0] : field7258[1]) + ',' + arg8 + ',' + (arg9 != null ? field7258[0] : field7258[1]) + ',' + (arg10 != null ? field7258[0] : field7258[1]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 354
   )
   public static final void method3732(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILhca;ILhca;ZIII)V",
      line = 475
   )
   public final void method3733(int arg0, int arg1, class513 arg2, int arg3, class513 arg4, boolean arg5, int arg6, int arg7, int arg8) {
      try {
         ++field7254;
         if (arg0 != -1) {
            this.method544();
            if (!this.method542()) {
               this.method523();
            } else {
               if (arg6 != 31972) {
                  field7256 = 124;
               }

               class177 var10 = arg2.field7482[arg0];
               class658 var11 = var10.field2723;
               class177 var12 = null;
               if (arg4 != null) {
                  var12 = arg4.field7482[arg7];
                  if (var12.field2723 != var11) {
                     var12 = null;
                  }
               }

               this.method3731(arg8, arg5, (boolean[])null, var11, false, 65535, -125, (int[])null, arg3, var10, var12, arg1);
               this.method511();
               this.method523();
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7258[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7258[0] : field7258[1]) + ',' + arg3 + ',' + (arg4 != null ? field7258[0] : field7258[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIBIIIIILs;)V",
      line = 515
   )
   public final void method3734(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class293 arg8) {
      boolean var10 = client.field4564;

      try {
         ++field7243;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         int var14 = -arg4 / 2;
         int var15 = 43 / ((arg2 - -15) / 51);
         int var16 = -arg5 / 2;
         int var17 = arg8.method2287(116, arg7 + var16, arg3 + var14);
         int var18 = arg4 / 2;
         int var19 = -arg5 / 2;
         int var20 = arg8.method2287(-122, arg7 + var19, arg3 - -var18);
         int var21 = -arg4 / 2;
         int var22 = arg5 / 2;
         int var23 = arg8.method2287(-77, arg7 - -var22, arg3 + var21);
         int var24 = arg4 / 2;
         int var25 = arg5 / 2;
         int var26 = arg8.method2287(26, arg7 + var25, arg3 + var24);
         int var27 = ~var17 <= ~var20 ? var20 : var17;
         int var28 = ~var26 < ~var23 ? var23 : var26;
         int var29 = ~var20 <= ~var26 ? var26 : var20;
         int var30 = ~var23 < ~var17 ? var17 : var23;
         if (~arg5 != -1) {
            int var31 = 16383 & (int)(Math.atan2((double)(var27 - var28), (double)arg5) * 2607.5945876176133D);
            if (~var31 != -1) {
               if (~arg1 != -1) {
                  label108: {
                     if (~var31 >= -8193) {
                        if (~var31 >= ~arg1) {
                           break label108;
                        }

                        var31 = arg1;
                        if (!var10) {
                           break label108;
                        }
                     }

                     int var32 = 16384 - arg1;
                     if (~var31 > ~var32) {
                        var31 = var32;
                     }
                  }
               }

               this.method524(var31);
            }
         }

         if (arg4 != 0) {
            int var33 = 16383 & (int)(Math.atan2((double)(-var29 + var30), (double)arg4) * 2607.5945876176133D);
            if (var33 != 0) {
               if (~arg0 != -1) {
                  label109: {
                     if (var33 > 8192) {
                        int var34 = -arg0 + 16384;
                        if (~var34 >= ~var33) {
                           break label109;
                        }

                        var33 = var34;
                        if (!var10) {
                           break label109;
                        }
                     }

                     if (var33 > arg0) {
                        var33 = arg0;
                     }
                  }
               }

               this.method538(var33);
            }
         }

         int var35 = var17 - -var26;
         if (var35 > var20 + var23) {
            var35 = var20 + var23;
         }

         int var36 = (var35 >> 1) + -arg6;
         if (~var36 != -1) {
            this.method514(0, var36, 0);
         }
      } catch (RuntimeException var38) {
         throw class608.method4462(var38, field7258[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7258[0] : field7258[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(II)V",
      line = 632
   )
   public static final void method3735(int arg0, int arg1) {
      try {
         ++field7251;
         if (~class376.field5588 == -8) {
            if (~class241.field3483 == -1 && ~class487.field7080 == -1) {
               class475.field6939 = arg1;
               class645.method4735(9, -127);
               if (arg0 < 111) {
                  field7248 = null;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7258[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "([IIIILhca;IIIIZLhca;)V",
      line = 663
   )
   public final void method3736(int[] arg0, int arg1, int arg2, int arg3, class513 arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class513 arg10) {
      try {
         ++field7250;
         if (~arg7 != 0) {
            this.method544();
            if (!this.method542()) {
               this.method523();
            } else {
               class177 var12 = arg10.field7482[arg7];
               class658 var13 = var12.field2723;
               class177 var14 = null;
               if (arg4 != null) {
                  var14 = arg4.field7482[arg1];
                  if (var14.field2723 != var13) {
                     var14 = null;
                  }
               }

               this.method3731(arg6, arg9, (boolean[])null, var13, false, arg2, arg8 ^ 6197, arg0, arg3, var12, var14, arg5);
               this.method511();
               this.method523();
               if (arg8 != -6223) {
                  this.method550(82, (int[])null, 102, 21, 20, true, 82, (int[])null);
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field7258[2] + (arg0 != null ? field7258[0] : field7258[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7258[0] : field7258[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field7258[0] : field7258[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Ljava/lang/String;IBZ)V",
      line = 704
   )
   public static final void method3737(String arg0, int arg1, byte arg2, boolean arg3) {
      try {
         ++field7246;
         class135.method1283(21850);
         if (arg1 == 0) {
            class444.field6473 = class328.method2537(class64.field1169, class386.field5692, 0, class169.field2640, (byte)-113, class510.field7454.field11149.method4644(false) * 2);
            if (arg0 != null) {
               class444.field6473.method421(0);
               class445 var13 = class767.method5548(0, -1253, class329.field4702, class422.field6146);
               class66 var14 = class444.field6473.method414(var13, class94.method917(class392.field5782, class422.field6146, 0), true);
               class330.method2551(-31);
               class263.method2107(var13, arg0, true, var14, 2, class444.field6473);
            }
         } else {
            class65 var4 = null;
            if (arg0 != null) {
               var4 = class328.method2537(class64.field1169, class386.field5692, 0, class169.field2640, (byte)-83, 0);
               var4.method421(0);
               class445 var5 = class767.method5548(0, -1253, class329.field4702, class422.field6146);
               class66 var6 = var4.method414(var5, class94.method917(class392.field5782, class422.field6146, 0), true);
               class330.method2551(-111);
               class263.method2107(var5, arg0, true, var6, 2, var4);
            }

            boolean var26 = false;

            label260: {
               try {
                  var26 = true;
                  class444.field6473 = class328.method2537(class64.field1169, class386.field5692, arg1, class169.field2640, (byte)-78, class510.field7454.field11149.method4644(false) * 2);
                  if (arg0 != null) {
                     var4.method421(0);
                     class445 var7 = class767.method5548(0, -1253, class329.field4702, class422.field6146);
                     class66 var8 = var4.method414(var7, class94.method917(class392.field5782, class422.field6146, 0), true);
                     class330.method2551(-32);
                     class263.method2107(var7, arg0, true, var8, 2, var4);
                  }

                  if (class444.field6473.method416()) {
                     boolean var9 = true;

                     try {
                        var9 = ~class359.field5381.field9635 < -257;
                     } catch (Throwable var30) {
                     }

                     class432 var10;
                     label240: {
                        if (!var9) {
                           var10 = class444.field6473.method300(104857600);
                           if (!client.field4564) {
                              break label240;
                           }
                        }

                        var10 = class444.field6473.method300(146800640);
                     }

                     class444.field6473.method286(var10);
                     var26 = false;
                  } else {
                     var26 = false;
                  }
                  break label260;
               } catch (Throwable var31) {
                  int var11 = class510.field7454.field11145.method2098(false);
                  if (var11 == 2) {
                     class596.field8595 = true;
                  }

                  class510.field7454.method5552(0, 98, class510.field7454.field11145);
                  method3737(arg0, var11, (byte)-100, arg3);
                  Object var10000 = null;
                  var26 = false;
               } finally {
                  if (var26) {
                     Object var18 = null;
                     if (var4 != null) {
                        try {
                           var4.method697(true);
                        } catch (Throwable var27) {
                        }
                     }

                  }
               }

               if (var4 != null) {
                  try {
                     var4.method697(true);
                  } catch (Throwable var28) {
                  }
               }

               return;
            }

            Object var17 = null;
            if (var4 != null) {
               try {
                  var4.method697(true);
               } catch (Throwable var29) {
               }
            }
         }

         class510.field7454.field11145.method2095(!arg3, false);
         class510.field7454.method5552(arg1, 43, class510.field7454.field11145);
         class237.method1943(0);
         class444.field6473.method442(10000);
         class444.field6473.method339(32);
         class734.field10566 = class444.field6473.method432();
         if (arg2 >= -7) {
            field7256 = 98;
         }

         class252.field3603 = class444.field6473.method432();
         class763.method5510(-25909);
         class444.field6473.method394(class510.field7454.field11178.method2184(false) == 1);
         if (class444.field6473.method348()) {
            class292.method2272(false, ~class510.field7454.field11138.method4504(false) == -2);
         }

         class335.method2601(class1.field3 >> 3, true, class209.field3112 >> 3, class444.field6473);
         class681.method4967(-1);
         class26.field391 = true;
         class237.field3437 = null;
         class650.field9430 = false;
         class93.method902(-30146);
      } catch (RuntimeException var33) {
         throw class608.method4462(var33, field7258[5] + (arg0 != null ? field7258[0] : field7258[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIZIIILhca;Lhca;II[ZILhca;ILhca;)V",
      line = 825
   )
   public final void method3738(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class513 arg6, class513 arg7, int arg8, int arg9, boolean[] arg10, int arg11, class513 arg12, int arg13, class513 arg14) {
      try {
         ++field7255;
         if (arg11 != -1) {
            if (arg10 != null && ~arg5 != 0) {
               this.method544();
               if (!this.method542()) {
                  this.method523();
               } else {
                  class177 var16 = arg14.field7482[arg11];
                  class658 var17 = var16.field2723;
                  class177 var18 = null;
                  if (arg12 != null) {
                     var18 = arg12.field7482[arg8];
                     if (var18.field2723 != var17) {
                        var18 = null;
                     }
                  }

                  this.method3731(0, arg2, arg10, var17, false, 65535, -127, (int[])null, arg13, var16, var18, arg1);
                  class177 var19 = arg6.field7482[arg5];
                  class177 var20 = null;
                  if (arg7 != null) {
                     var20 = arg7.field7482[arg0];
                     if (var20.field2723 != var17) {
                        var20 = null;
                     }
                  }

                  this.method505(0, new int[0], 0, 0, 0, 0, arg2);
                  this.method3731(0, arg2, arg10, var19.field2723, true, arg3, -126, (int[])null, arg9, var19, var20, arg4);
                  this.method511();
                  this.method523();
               }
            } else {
               this.method3733(arg11, arg1, arg14, arg13, arg12, arg2, 31972, arg8, 0);
            }
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field7258[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7258[0] : field7258[1]) + ',' + (arg7 != null ? field7258[0] : field7258[1]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field7258[0] : field7258[1]) + ',' + arg11 + ',' + (arg12 != null ? field7258[0] : field7258[1]) + ',' + arg13 + ',' + (arg14 != null ? field7258[0] : field7258[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILhca;)V",
      line = 889
   )
   public final void method3739(int arg0, int arg1, class513 arg2) {
      boolean var4 = client.field4564;

      try {
         ++field7249;
         if (~arg1 != 0) {
            this.method544();
            if (!this.method542()) {
               this.method523();
            } else {
               class177 var5 = arg2.field7482[arg1];
               class658 var6 = var5.field2723;
               int var7 = -61 / ((-33 - arg0) / 39);
               int var8 = 0;
               if (!var4 && var8 >= var5.field2732) {
                  this.method511();
                  this.method523();
               } else {
                  do {
                     short var9 = var5.field2726[var8];
                     if (var6.field9604[var9]) {
                        if (var5.field2722[var8] != -1) {
                           this.method518(0, 0, 0, 0);
                        }

                        this.method518(var6.field9597[var9], var5.field2728[var8], var5.field2735[var8], var5.field2725[var8]);
                     }

                     ++var8;
                  } while(var8 < var5.field2732);

                  this.method511();
                  this.method523();
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field7258[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7258[0] : field7258[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "(I)V",
      line = 944
   )
   public static void method3740(int arg0) {
      try {
         field7247 = null;
         field7248 = null;
         field7244 = null;
         if (arg0 >= -1) {
            method3737((String)null, -77, (byte)-28, true);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7258[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "G",
      descriptor = "()I"
   )
   public abstract int method546();

   @OriginalMember(
      owner = "client!ka",
      name = "s",
      descriptor = "(I)V"
   )
   public abstract void method530(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method506(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "O",
      descriptor = "(III)V"
   )
   public abstract void method512(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public abstract void method505(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "()[Ltf;"
   )
   public abstract class309[] method515();

   @OriginalMember(
      owner = "client!ka",
      name = "ma",
      descriptor = "()I"
   )
   public abstract int method548();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public abstract void method533(class495 arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "fa",
      descriptor = "()I"
   )
   public abstract int method540();

   @OriginalMember(
      owner = "client!ka",
      name = "HA",
      descriptor = "()I"
   )
   public abstract int method517();

   @OriginalMember(
      owner = "client!ka",
      name = "P",
      descriptor = "(IIII)V"
   )
   public abstract void method518(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public abstract class192 method547(class192 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method543(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "NA",
      descriptor = "()Z"
   )
   public abstract boolean method542();

   @OriginalMember(
      owner = "client!ka",
      name = "FA",
      descriptor = "(I)V"
   )
   public abstract void method524(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "()Z"
   )
   public abstract boolean method529();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Ldfa;)V"
   )
   public abstract void method554(class173 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "VA",
      descriptor = "(I)V"
   )
   public abstract void method538(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Ldfa;IZ)V"
   )
   public abstract void method519(class173 arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method513(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "wa",
      descriptor = "()V"
   )
   public abstract void method511();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Ldfa;Lija;I)V"
   )
   public abstract void method503(class173 arg0, class362 arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "V",
      descriptor = "()I"
   )
   public abstract int method528();

   @OriginalMember(
      owner = "client!ka",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public abstract void method520(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "H",
      descriptor = "(III)V"
   )
   public abstract void method514(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "EA",
      descriptor = "()I"
   )
   public abstract int method507();

   @OriginalMember(
      owner = "client!ka",
      name = "RA",
      descriptor = "()I"
   )
   public abstract int method531();

   @OriginalMember(
      owner = "client!ka",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method509();

   @OriginalMember(
      owner = "client!ka",
      name = "da",
      descriptor = "()I"
   )
   public abstract int method535();

   @OriginalMember(
      owner = "client!ka",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public abstract void method550(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!ka",
      name = "LA",
      descriptor = "(I)V"
   )
   public abstract void method534(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "WA",
      descriptor = "()I"
   )
   public abstract int method504();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILdfa;ZII)Z"
   )
   public abstract boolean method551(int arg0, int arg1, class173 arg2, boolean arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "()[Llu;"
   )
   public abstract class740[] method539();

   @OriginalMember(
      owner = "client!ka",
      name = "F",
      descriptor = "()Z"
   )
   public abstract boolean method516();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method522(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Ldfa;Lija;II)V"
   )
   public abstract void method552(class173 arg0, class362 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public abstract class495 method549(byte arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "ia",
      descriptor = "(SS)V"
   )
   public abstract void method526(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "aa",
      descriptor = "(SS)V"
   )
   public abstract void method502(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "()V"
   )
   public abstract void method523();

   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "()V"
   )
   public abstract void method508();

   @OriginalMember(
      owner = "client!ka",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method536();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "()V"
   )
   public abstract void method544();

   @OriginalMember(
      owner = "client!ka",
      name = "na",
      descriptor = "()I"
   )
   public abstract int method553();

   @OriginalMember(
      owner = "client!ka",
      name = "ua",
      descriptor = "()I"
   )
   public abstract int method510();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILdfa;ZI)Z"
   )
   public abstract boolean method521(int arg0, int arg1, class173 arg2, boolean arg3, int arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3741(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3742(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
