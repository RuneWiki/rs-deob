import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class497 {
   @OriginalMember(
      owner = "client!ka",
      name = "m",
      descriptor = "Z"
   )
   public boolean field7365 = false;
   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7373 = new String[]{method3712(method3711("\u001c!\u0001E=_")), method3712(method3711("\u00195Co")), method3712(method3711("\u001c!\u0001@=_")), method3712(method3711("\fn\u0001-\u0002")), method3712(method3711("\u001c!\u0001H=_")), method3712(method3711("\u001c!\u0001O=_")), method3712(method3711("\u0014/@h\u0016\u0012(@p\u000b")), method3712(method3711("L`Yf\r\u0004)@mBF{\u000fs\u001e\u0003(\u0012,DW$@n\u001e\u001e.\u0012")), method3712(method3711("\u001c!\u0001J=_")), method3712(method3711("\u0013/Lv\u0012\u0012.[-\u001c\u0018/Dj\u001aJb")), method3712(method3711("\u00023]g\u0010\u0015}")), method3712(method3711("\u001c!\u0001I=_")), method3712(method3711("\u001c!\u0001G=_")), method3712(method3711("\u001c!\u0001D=_")), method3712(method3711("\u001c!\u0001F=_")), method3712(method3711("\u001c!\u0001K=_"))};
   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "Lsda;"
   )
   public static class269 field7361 = new class269(83, 5);
   @OriginalMember(
      owner = "client!ka",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field7369 = null;
   @OriginalMember(
      owner = "client!ka",
      name = "g",
      descriptor = "I"
   )
   public static int field7371 = 0;
   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "S"
   )
   public static short field7372 = 320;
   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "I"
   )
   public static int field7358;
   @OriginalMember(
      owner = "client!ka",
      name = "o",
      descriptor = "I"
   )
   public static int field7360;
   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "I"
   )
   public static int field7362;
   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "I"
   )
   public static int field7363;
   @OriginalMember(
      owner = "client!ka",
      name = "i",
      descriptor = "I"
   )
   public static int field7364;
   @OriginalMember(
      owner = "client!ka",
      name = "l",
      descriptor = "I"
   )
   public static int field7366;
   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "I"
   )
   public static int field7367;
   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "I"
   )
   public static int field7368;
   @OriginalMember(
      owner = "client!ka",
      name = "h",
      descriptor = "I"
   )
   public static int field7370;
   @OriginalMember(
      owner = "client!ka",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field7359;

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lri;IZZI[ZI[IILri;ILsi;)V",
      line = 3
   )
   private final void method3701(class121 arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean[] arg5, int arg6, int[] arg7, int arg8, class121 arg9, int arg10, class585 arg11) {
      int var13 = client.field4530;

      try {
         if (arg4 == 27103) {
            ++field7370;
            if (arg0 != null && arg10 != 0) {
               int var17 = 0;
               int var18 = 0;
               int var19 = 0;
               if (var13 != 0 || arg11.field8686 > var19) {
                  do {
                     boolean var20 = false;
                     if (arg9.field1470 > var17 && ~arg9.field1467[var17] == ~var19) {
                        var20 = true;
                     }

                     boolean var21 = false;
                     if (arg0.field1470 > var18 && ~arg0.field1467[var18] == ~var19) {
                        var21 = true;
                     }

                     if (!var20 && !var21) {
                        ++var19;
                     } else {
                        if (arg5 != null && arg5[var19] != arg3 && arg11.field8687[var19] != 0) {
                           if (var20) {
                              ++var17;
                           }

                           if (!var21) {
                              ++var19;
                              continue;
                           }

                           ++var18;
                           if (var13 == 0) {
                              ++var19;
                              continue;
                           }
                        }

                        short var22 = 0;
                        int var23 = arg11.field8687[var19];
                        if (var23 != 3) {
                           if (var23 == 10) {
                              var22 = 128;
                           }
                        } else {
                           var22 = 128;
                        }

                        short var24;
                        short var25;
                        short var26;
                        short var27;
                        byte var28;
                        label218: {
                           if (!var20) {
                              var24 = -1;
                              var25 = var22;
                              var26 = var22;
                              var27 = var22;
                              var28 = 0;
                              if (var13 == 0) {
                                 break label218;
                              }
                           }

                           var28 = arg9.field1471[var17];
                           var27 = arg9.field1466[var17];
                           var24 = arg9.field1478[var17];
                           var25 = arg9.field1479[var17];
                           var26 = arg9.field1464[var17];
                           ++var17;
                        }

                        byte var29;
                        short var30;
                        short var31;
                        short var32;
                        short var33;
                        if (var21) {
                           var29 = arg0.field1471[var18];
                           var30 = arg0.field1466[var18];
                           var31 = arg0.field1479[var18];
                           var32 = arg0.field1464[var18];
                           var33 = arg0.field1478[var18];
                           ++var18;
                           if (var13 != 0) {
                              var33 = -1;
                              var30 = var22;
                              var29 = 0;
                              var32 = var22;
                              var31 = var22;
                           }
                        } else {
                           var33 = -1;
                           var30 = var22;
                           var29 = 0;
                           var32 = var22;
                           var31 = var22;
                        }

                        label212: {
                           if (~var24 == 0) {
                              if (var33 == -1) {
                                 break label212;
                              }

                              this.method3702(2, 0, arg8, arg11.field8685[var33] & arg6, 0, arg11.field8682[var33], 0, arg7, arg2, 0);
                              if (var13 == 0) {
                                 break label212;
                              }
                           }

                           this.method3702(2, 0, arg8, arg11.field8685[var24] & arg6, 0, arg11.field8682[var24], 0, arg7, arg2, 0);
                        }

                        int var37;
                        int var38;
                        int var39;
                        if ((2 & var28) == 0) {
                           if (~(var29 & 1) == -1) {
                              label255: {
                                 if (var23 == 2) {
                                    int var34 = -var25 + var31 & 16383;
                                    int var35 = -var26 + var32 & 16383;
                                    if (var35 >= 8192) {
                                       var35 -= 16384;
                                    }

                                    if (~var34 <= -8193) {
                                       var34 -= 16384;
                                    }

                                    int var36 = -var27 + var30 & 16383;
                                    var37 = 16383 & var26 - -(arg10 * var35 / arg1);
                                    var38 = arg10 * var34 / arg1 + var25 & 16383;
                                    if (~var36 <= -8193) {
                                       var36 -= 16384;
                                    }

                                    var39 = var27 - -(arg10 * var36 / arg1) & 16383;
                                    if (var13 == 0) {
                                       break label255;
                                    }
                                 }

                                 if (var23 == 9) {
                                    int var40 = 16383 & -var25 + var31;
                                    if (var40 >= 8192) {
                                       var40 -= 16384;
                                    }

                                    var38 = 16383 & arg10 * var40 / arg1 + var25;
                                    var39 = 0;
                                    var37 = 0;
                                    if (var13 == 0) {
                                       break label255;
                                    }
                                 }

                                 if (var23 == 7) {
                                    int var41 = var31 - var25 & 63;
                                    if (~var41 <= -33) {
                                       var41 -= 64;
                                    }

                                    var37 = (-var26 + var32) * arg10 / arg1 + var26;
                                    var38 = 63 & arg10 * var41 / arg1 + var25;
                                    var39 = (-var27 + var30) * arg10 / arg1 + var27;
                                    if (var13 == 0) {
                                       break label255;
                                    }
                                 }

                                 var37 = (-var26 + var32) * arg10 / arg1 + var26;
                                 var39 = (-var27 + var30) * arg10 / arg1 + var27;
                                 var38 = (-var25 + var31) * arg10 / arg1 + var25;
                                 if (var13 != 0) {
                                    var39 = var27;
                                    var37 = var26;
                                    var38 = var25;
                                 }
                              }
                           } else {
                              var39 = var27;
                              var37 = var26;
                              var38 = var25;
                           }
                        } else {
                           var39 = var27;
                           var37 = var26;
                           var38 = var25;
                        }

                        this.method3702(2, var38, arg8, arg11.field8685[var19] & arg6, var39, arg11.field8682[var19], var37, arg7, arg2, var23);
                        ++var19;
                     }
                  } while(arg11.field8686 > var19);

               }
            } else {
               int var14 = 0;
               if (var13 != 0 || arg9.field1470 > var14) {
                  do {
                     short var15 = arg9.field1467[var14];
                     if (arg5 != null && !arg3 != !arg5[var15] && ~arg11.field8687[var15] != -1) {
                        ++var14;
                     } else {
                        short var16 = arg9.field1478[var14];
                        if (var16 != -1) {
                           this.method3702(arg4 ^ 27101, 0, arg8, arg6 & arg11.field8685[var16], 0, arg11.field8682[var16], 0, arg7, arg2, 0);
                        }

                        this.method3702(2, arg9.field1479[var14], arg8, arg6 & arg11.field8685[var15], arg9.field1466[var14], arg11.field8682[var15], arg9.field1464[var14], arg7, arg2, arg11.field8687[var15]);
                        ++var14;
                     }
                  } while(arg9.field1470 > var14);

               }
            }
         }
      } catch (RuntimeException var43) {
         throw class670.method4877(var43, field7373[15] + (arg0 != null ? field7373[3] : field7373[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7373[3] : field7373[1]) + ',' + arg6 + ',' + (arg7 != null ? field7373[3] : field7373[1]) + ',' + arg8 + ',' + (arg9 != null ? field7373[3] : field7373[1]) + ',' + arg10 + ',' + (arg11 != null ? field7373[3] : field7373[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIII[II[IZI)V",
      line = 229
   )
   private final void method3702(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, boolean arg8, int arg9) {
      int var11 = client.field4530;

      try {
         label105: {
            if (arg2 != 1) {
               if (~arg2 == -3) {
                  if (~arg9 != -1 && arg9 != 1) {
                     if (arg9 != 2) {
                        break label105;
                     }

                     arg1 = 16383 & -arg1;
                     arg4 = 16383 & -arg4;
                     if (var11 == 0) {
                        break label105;
                     }
                  }

                  arg4 = -arg4;
                  arg1 = -arg1;
                  if (var11 == 0) {
                     break label105;
                  }
               }

               if (~arg2 != -4) {
                  break label105;
               }

               if (arg9 == 0 || arg9 == 1) {
                  int var12 = arg1;
                  arg1 = -arg4;
                  arg4 = var12;
                  if (var11 == 0) {
                     break label105;
                  }
               }

               if (arg9 == 3) {
                  int var13 = arg1;
                  arg1 = arg4;
                  arg4 = var13;
                  if (var11 == 0) {
                     break label105;
                  }
               }

               if (~arg9 != -3) {
                  break label105;
               }

               int var14 = arg1;
               arg1 = 16383 & arg4;
               arg4 = -var14 & 16383;
               if (var11 == 0) {
                  break label105;
               }
            }

            if (arg9 != 0 && arg9 != 1) {
               if (~arg9 == -4) {
                  int var15 = arg1;
                  arg1 = arg4;
                  arg4 = var15;
                  if (var11 == 0) {
                     break label105;
                  }
               }

               if (arg9 != 2) {
                  break label105;
               }

               int var16 = arg1;
               arg1 = -arg4 & 16383;
               arg4 = var16 & 16383;
               if (var11 == 0) {
                  break label105;
               }
            }

            int var17 = -arg1;
            arg1 = arg4;
            arg4 = var17;
         }

         ++field7360;
         if (arg0 == 2) {
            if (arg3 != 65535) {
               this.method330(arg9, arg5, arg1, arg6, arg4, arg8, arg3, arg7);
            } else {
               this.method309(arg9, arg5, arg1, arg6, arg4, arg2, arg8);
            }
         }
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field7373[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7373[3] : field7373[1]) + ',' + arg6 + ',' + (arg7 != null ? field7373[3] : field7373[1]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ILmba;I)V",
      line = 337
   )
   public final void method3703(int arg0, class441 arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field7363;
         if (~arg0 != 0) {
            this.method345();
            if (!this.method334()) {
               this.method307();
            } else {
               class121 var5 = arg1.field6724[arg0];
               class585 var6 = var5.field1473;
               int var7 = 0;
               int var10000;
               if (var4 != 0) {
                  var10000 = var5.field1467[var7];
               } else if (~var5.field1470 >= ~var7) {
                  this.method317();
                  var10000 = arg2;
                  if (var4 == 0) {
                     if (arg2 != -14080) {
                        this.field7365 = true;
                     }

                     this.method307();
                     return;
                  }
               } else {
                  var10000 = var5.field1467[var7];
               }

               while(true) {
                  int var8 = var10000;
                  if (var6.field8683[var8]) {
                     if (~var5.field1478[var7] != 0) {
                        this.method308(0, 0, 0, 0);
                     }

                     this.method308(var6.field8687[var8], var5.field1479[var7], var5.field1464[var7], var5.field1466[var7]);
                  }

                  ++var7;
                  if (~var5.field1470 >= ~var7) {
                     this.method317();
                     var10000 = arg2;
                     if (var4 == 0) {
                        if (arg2 != -14080) {
                           this.field7365 = true;
                        }

                        this.method307();
                        return;
                     }
                  } else {
                     var10000 = var5.field1467[var7];
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7373[11] + arg0 + ',' + (arg1 != null ? field7373[3] : field7373[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(B)V",
      line = 387
   )
   public static final void method3704(byte arg0) {
      try {
         ++field7362;
         if (class238.field3003 != null) {
            try {
               String var1 = class238.field3003.getParameter(field7373[6]);
               int var2 = -11745 + (int)(class188.method1462(true) / 86400000L);
               if (arg0 == 19) {
                  String var3 = field7373[10] + var2 + field7373[7] + var1;
                  class359.method2805(class238.field3003, arg0 ^ -21830, field7373[9] + var3 + "\"");
               }
            } catch (Throwable var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7373[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIILhg;I)Ljava/awt/Frame;",
      line = 421
   )
   public static final Frame method3705(int arg0, int arg1, int arg2, int arg3, class719 arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field7366;
         if (!arg4.method5197((byte)115)) {
            return null;
         } else {
            if (arg3 == 0) {
               class625[] var7 = class58.method485(86, arg4);
               if (var7 == null) {
                  return null;
               }

               int var10000;
               label122: {
                  byte var8 = 0;
                  int var9 = 0;
                  if (var6 != 0) {
                     var10000 = ~arg2;
                  } else if (var7.length <= var9) {
                     var10000 = var8;
                     if (var6 == 0) {
                        break label122;
                     }
                  } else {
                     var10000 = ~arg2;
                  }

                  while(true) {
                     if (var10000 == ~var7[var9].field9098) {
                        if (var7[var9].field9093 == arg1) {
                           if (~arg0 != -1) {
                              if (var7[var9].field9096 == arg0) {
                                 if (var8 != 0) {
                                    if (~var7[var9].field9091 < ~arg3) {
                                       arg3 = var7[var9].field9091;
                                       var8 = 1;
                                       ++var9;
                                    } else {
                                       ++var9;
                                    }
                                 } else {
                                    arg3 = var7[var9].field9091;
                                    var8 = 1;
                                    ++var9;
                                 }
                              } else {
                                 ++var9;
                              }
                           } else if (var8 != 0) {
                              if (~var7[var9].field9091 < ~arg3) {
                                 arg3 = var7[var9].field9091;
                                 var8 = 1;
                                 ++var9;
                              } else {
                                 ++var9;
                              }
                           } else {
                              arg3 = var7[var9].field9091;
                              var8 = 1;
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        ++var9;
                     }

                     if (var7.length <= var9) {
                        var10000 = var8;
                        if (var6 == 0) {
                           break;
                        }
                     } else {
                        var10000 = ~arg2;
                     }
                  }
               }

               if (var10000 == 0) {
                  return null;
               }
            }

            if (arg5 != 15397) {
               method3705(122, 40, -116, -39, (class719)null, -122);
            }

            class12 var10 = arg4.method5211(arg0, arg3, arg2, (byte)-2, arg1);
            if (var6 != 0) {
               class89.method817(10L, 2535);
            }

            while(~var10.field159 == -1) {
               class89.method817(10L, 2535);
            }

            Frame var11 = (Frame)var10.field160;
            if (var11 == null) {
               return null;
            } else if (~var10.field159 == -3) {
               class209.method1589(arg4, var11, 55);
               return null;
            } else {
               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field7373[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7373[3] : field7373[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lmba;IIILmba;II[IZII)V",
      line = 499
   )
   public final void method3706(class441 arg0, int arg1, int arg2, int arg3, class441 arg4, int arg5, int arg6, int[] arg7, boolean arg8, int arg9, int arg10) {
      try {
         ++field7358;
         if (~arg9 != 0) {
            this.method345();
            if (!this.method334()) {
               this.method307();
            } else {
               class121 var12 = arg4.field6724[arg9];
               class585 var13 = var12.field1473;
               if (arg3 == -6073) {
                  class121 var14 = null;
                  if (arg0 != null) {
                     var14 = arg0.field6724[arg2];
                     if (var14.field1473 != var13) {
                        var14 = null;
                     }
                  }

                  this.method3701(var14, arg10, arg8, false, arg3 + 33176, (boolean[])null, arg1, arg7, arg6, var12, arg5, var13);
                  this.method317();
                  this.method307();
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field7373[14] + (arg0 != null ? field7373[3] : field7373[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7373[3] : field7373[1]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7373[3] : field7373[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "(I)V",
      line = 555
   )
   public static void method3707(int arg0) {
      try {
         if (arg0 == 0) {
            field7361 = null;
            field7369 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7373[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIILs;IIII)V",
      line = 566
   )
   public final void method3708(int arg0, int arg1, int arg2, int arg3, class293 arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = client.field4530;

      try {
         ++field7368;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         int var14 = -arg3 / 2;
         int var15 = -arg0 / 2;
         int var16 = arg4.method2236((byte)122, arg1 + var14, arg7 - -var15);
         int var17 = arg3 / 2;
         int var18 = -arg0 / 2;
         int var19 = arg4.method2236((byte)106, arg1 + var17, arg7 - -var18);
         int var20 = -arg3 / 2;
         int var21 = arg0 / 2;
         int var22 = arg4.method2236((byte)116, arg1 + var20, arg7 - -var21);
         int var23 = arg3 / 2;
         int var24 = arg0 / 2;
         int var25 = arg4.method2236((byte)116, arg1 + var23, arg7 + var24);
         int var26 = ~var16 > ~var19 ? var16 : var19;
         int var27 = var25 > var22 ? var22 : var25;
         int var28 = ~var25 < ~var19 ? var19 : var25;
         if (arg0 != 0) {
            int var29 = 16383 & (int)(Math.atan2((double)(-var27 + var26), (double)arg0) * 2607.5945876176133D);
            if (~var29 != -1) {
               if (~arg6 != -1) {
                  label110: {
                     if (~var29 < -8193) {
                        int var30 = -arg6 + 16384;
                        if (var30 <= var29) {
                           break label110;
                        }

                        var29 = var30;
                        if (var10 == 0) {
                           break label110;
                        }
                     }

                     if (~var29 < ~arg6) {
                        var29 = arg6;
                     }
                  }
               }

               this.method340(var29);
            }
         }

         int var31 = ~var22 >= ~var16 ? var22 : var16;
         if (arg3 != 0) {
            int var32 = (int)(Math.atan2((double)(var31 - var28), (double)arg3) * 2607.5945876176133D) & 16383;
            if (~var32 != -1) {
               if (~arg8 != -1) {
                  label113: {
                     if (~var32 >= -8193) {
                        if (~var32 >= ~arg8) {
                           break label113;
                        }

                        var32 = arg8;
                        if (var10 == 0) {
                           break label113;
                        }
                     }

                     int var33 = -arg8 + 16384;
                     if (~var32 > ~var33) {
                        var32 = var33;
                     }
                  }
               }

               this.method310(var32);
            }
         }

         if (arg5 >= -123) {
            field7359 = true;
         }

         int var34 = var16 + var25;
         if (var34 > var19 - -var22) {
            var34 = var19 + var22;
         }

         int var35 = (var34 >> 1) + -arg2;
         if (var35 != 0) {
            this.method303(0, var35, 0);
         }
      } catch (RuntimeException var37) {
         throw class670.method4877(var37, field7373[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7373[3] : field7373[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lmba;Lmba;ILmba;IIZ[ZIIIIIILmba;)V",
      line = 697
   )
   public final void method3709(class441 arg0, class441 arg1, int arg2, class441 arg3, int arg4, int arg5, boolean arg6, boolean[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class441 arg14) {
      try {
         ++field7364;
         if (~arg8 != 0) {
            if (arg7 != null && ~arg13 != 0) {
               this.method345();
               if (!this.method334()) {
                  this.method307();
               } else {
                  class121 var16 = arg1.field6724[arg8];
                  class585 var17 = var16.field1473;
                  class121 var18 = null;
                  if (arg14 != null) {
                     var18 = arg14.field6724[arg5];
                     if (var18.field1473 != var17) {
                        var18 = null;
                     }
                  }

                  this.method3701(var18, arg2, arg6, false, arg11 + -38432, arg7, arg11, (int[])null, 0, var16, arg4, var17);
                  class121 var19 = arg3.field6724[arg13];
                  class121 var20 = null;
                  if (arg0 != null) {
                     var20 = arg0.field6724[arg9];
                     if (var20.field1473 != var17) {
                        var20 = null;
                     }
                  }

                  this.method309(0, new int[0], 0, 0, 0, 0, arg6);
                  this.method3701(var20, arg10, arg6, true, 27103, arg7, 65535, (int[])null, 0, var19, arg12, var19.field1473);
                  this.method317();
                  this.method307();
               }
            } else {
               this.method3710(18158, arg5, arg14, arg6, arg4, arg2, 0, arg1, arg8);
            }
         }
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field7373[2] + (arg0 != null ? field7373[3] : field7373[1]) + ',' + (arg1 != null ? field7373[3] : field7373[1]) + ',' + arg2 + ',' + (arg3 != null ? field7373[3] : field7373[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7373[3] : field7373[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field7373[3] : field7373[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILmba;ZIIILmba;I)V",
      line = 766
   )
   public final void method3710(int arg0, int arg1, class441 arg2, boolean arg3, int arg4, int arg5, int arg6, class441 arg7, int arg8) {
      try {
         ++field7367;
         if (~arg8 != 0) {
            this.method345();
            if (!this.method334()) {
               this.method307();
            } else {
               class121 var10 = arg7.field6724[arg8];
               class585 var11 = var10.field1473;
               class121 var12 = null;
               if (arg2 != null) {
                  var12 = arg2.field6724[arg1];
                  if (var12.field1473 != var11) {
                     var12 = null;
                  }
               }

               if (arg0 != 18158) {
                  this.method342();
               }

               this.method3701(var12, arg5, arg3, false, 27103, (boolean[])null, 65535, (int[])null, arg6, var10, arg4, var11);
               this.method317();
               this.method307();
            }
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field7373[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7373[3] : field7373[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7373[3] : field7373[1]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "()Z"
   )
   public abstract boolean method298();

   @OriginalMember(
      owner = "client!ka",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public abstract void method322(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method316(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method328(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method327();

   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "()V"
   )
   public abstract void method307();

   @OriginalMember(
      owner = "client!ka",
      name = "ia",
      descriptor = "(SS)V"
   )
   public abstract void method320(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "ma",
      descriptor = "()I"
   )
   public abstract int method299();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgq;Lpda;II)V"
   )
   public abstract void method338(class540 arg0, class655 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "aa",
      descriptor = "(SS)V"
   )
   public abstract void method324(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public abstract void method330(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!ka",
      name = "RA",
      descriptor = "()I"
   )
   public abstract int method306();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "()[Lhka;"
   )
   public abstract class57[] method297();

   @OriginalMember(
      owner = "client!ka",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method336(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "s",
      descriptor = "(I)V"
   )
   public abstract void method333(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "F",
      descriptor = "()Z"
   )
   public abstract boolean method295();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgq;IZ)V"
   )
   public abstract void method335(class540 arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "NA",
      descriptor = "()Z"
   )
   public abstract boolean method334();

   @OriginalMember(
      owner = "client!ka",
      name = "LA",
      descriptor = "(I)V"
   )
   public abstract void method314(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public abstract void method312(class540 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "fa",
      descriptor = "()I"
   )
   public abstract int method339();

   @OriginalMember(
      owner = "client!ka",
      name = "G",
      descriptor = "()I"
   )
   public abstract int method300();

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "()V"
   )
   public abstract void method296();

   @OriginalMember(
      owner = "client!ka",
      name = "H",
      descriptor = "(III)V"
   )
   public abstract void method303(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "na",
      descriptor = "()I"
   )
   public abstract int method302();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public abstract void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "P",
      descriptor = "(IIII)V"
   )
   public abstract void method308(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "VA",
      descriptor = "(I)V"
   )
   public abstract void method310(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "()[Lria;"
   )
   public abstract class299[] method323();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public abstract void method341(class497 arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public abstract class497 method343(byte arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "FA",
      descriptor = "(I)V"
   )
   public abstract void method340(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public abstract class193 method313(class193 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "V",
      descriptor = "()I"
   )
   public abstract int method344();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgq;Lpda;I)V"
   )
   public abstract void method301(class540 arg0, class655 arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "HA",
      descriptor = "()I"
   )
   public abstract int method342();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILgq;ZII)Z"
   )
   public abstract boolean method331(int arg0, int arg1, class540 arg2, boolean arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ka",
      name = "WA",
      descriptor = "()I"
   )
   public abstract int method315();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method329(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "wa",
      descriptor = "()V"
   )
   public abstract void method317();

   @OriginalMember(
      owner = "client!ka",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method332();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILgq;ZI)Z"
   )
   public abstract boolean method318(int arg0, int arg1, class540 arg2, boolean arg3, int arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "EA",
      descriptor = "()I"
   )
   public abstract int method304();

   @OriginalMember(
      owner = "client!ka",
      name = "ua",
      descriptor = "()I"
   )
   public abstract int method326();

   @OriginalMember(
      owner = "client!ka",
      name = "O",
      descriptor = "(III)V"
   )
   public abstract void method346(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "()V"
   )
   public abstract void method345();

   @OriginalMember(
      owner = "client!ka",
      name = "da",
      descriptor = "()I"
   )
   public abstract int method311();

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3711(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3712(char[] arg0) {
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
            var10005 = 64;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
