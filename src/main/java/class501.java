import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class501 {
   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "Z"
   )
   public boolean field6872 = false;
   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6887 = new String[]{method3625(method3624("L[\u0003\u0002T\u000f")), method3625(method3624("\\\u0014\u0003hj")), method3625(method3624("IOA*")), method3625(method3624("L[\u0003\u0003T\u000f")), method3625(method3624("L[\u0003\u0010U\u000f")), method3625(method3624("L[\u0003\u0005T\u000f")), method3625(method3624("L[\u0003\u0007T\u000f")), method3625(method3624("L[\u0003\u0004T\u000f")), method3625(method3624("L[\u0003\u0000T\u000f")), method3625(method3624("L[\u0003\u0011U\u000f")), method3625(method3624("L[\u0003\u000eT\u000f")), method3625(method3624("L[\u0003\u0001T\u000f"))};
   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "Lbga;"
   )
   public static class378 field6880 = new class378(56, 0);
   @OriginalMember(
      owner = "client!ka",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field6884 = true;
   @OriginalMember(
      owner = "client!ka",
      name = "l",
      descriptor = "I"
   )
   public static int field6882 = -1;
   @OriginalMember(
      owner = "client!ka",
      name = "j",
      descriptor = "Lnw;"
   )
   public static class616 field6881 = new class616(5, 4);
   @OriginalMember(
      owner = "client!ka",
      name = "g",
      descriptor = "Ltv;"
   )
   public static class590 field6886 = new class590(30);
   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "I"
   )
   public static int field6873;
   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "I"
   )
   public static int field6874;
   @OriginalMember(
      owner = "client!ka",
      name = "m",
      descriptor = "I"
   )
   public static int field6875;
   @OriginalMember(
      owner = "client!ka",
      name = "h",
      descriptor = "I"
   )
   public static int field6876;
   @OriginalMember(
      owner = "client!ka",
      name = "n",
      descriptor = "I"
   )
   public static int field6877;
   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "I"
   )
   public static int field6878;
   @OriginalMember(
      owner = "client!ka",
      name = "i",
      descriptor = "I"
   )
   public static int field6879;
   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "I"
   )
   public static int field6883;
   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "I"
   )
   public static int field6885;

   @OriginalMember(
      owner = "client!ka",
      name = "NA",
      descriptor = "()Z"
   )
   public abstract boolean method324();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BILsha;[IZIILfl;[ZLsha;IZ)V"
   )
   private final void method3614(byte arg0, int arg1, class761 arg2, int[] arg3, boolean arg4, int arg5, int arg6, class773 arg7, boolean[] arg8, class761 arg9, int arg10, boolean arg11) {
      boolean var13 = client.field4273;

      try {
         ++field6875;
         if (arg9 == null || ~arg1 == -1) {
            int var14 = 0;
            if (var13 || arg2.field11016 > var14) {
               do {
                  short var15 = arg2.field11011[var14];
                  if (arg8 != null && arg11 == !arg8[var15] && ~arg7.field11155[var15] != -1) {
                     ++var14;
                  } else {
                     short var16 = arg2.field11004[var14];
                     if (~var16 != 0) {
                        this.method3616(arg4, 0, 0, 0, arg3, arg10, arg7.field11151[var16], (byte)-85, arg7.field11150[var16] & arg6, 0);
                     }

                     this.method3616(arg4, arg7.field11155[var15], arg2.field11013[var14], arg2.field11002[var14], arg3, arg10, arg7.field11151[var15], (byte)-117, arg6 & arg7.field11150[var15], arg2.field11012[var14]);
                     ++var14;
                  }
               } while(arg2.field11016 > var14);

            }
         } else {
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            byte var10000;
            byte var20;
            boolean var21;
            if (var13) {
               var20 = 0;
               if (arg2.field11016 > var17) {
                  if (~arg2.field11011[var17] == ~var19) {
                     var20 = 1;
                  }

                  var21 = false;
                  if (~var18 > ~arg9.field11016 && ~arg9.field11011[var18] == ~var19) {
                     var21 = true;
                  }
               } else {
                  var21 = false;
                  if (~var18 > ~arg9.field11016 && ~arg9.field11011[var18] == ~var19) {
                     var21 = true;
                  }
               }
            } else {
               if (~var19 <= ~arg7.field11156) {
                  var10000 = arg0;
                  if (!var13) {
                     if (arg0 != -28) {
                        field6882 = -115;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = 0;
               }

               var20 = var10000;
               if (arg2.field11016 > var17) {
                  if (~arg2.field11011[var17] == ~var19) {
                     var20 = 1;
                  }

                  var21 = false;
                  if (~var18 > ~arg9.field11016 && ~arg9.field11011[var18] == ~var19) {
                     var21 = true;
                  }
               } else {
                  var21 = false;
                  if (~var18 > ~arg9.field11016 && ~arg9.field11011[var18] == ~var19) {
                     var21 = true;
                  }
               }
            }

            while(true) {
               if (var20 == 0 && !var21) {
                  ++var19;
               } else {
                  label462: {
                     if (arg8 != null && !arg8[var19] == arg11 && arg7.field11155[var19] != 0) {
                        if (var21) {
                           ++var18;
                        }

                        if (var20 == 0) {
                           ++var19;
                           break label462;
                        }

                        ++var17;
                        if (!var13) {
                           ++var19;
                           break label462;
                        }
                     }

                     short var22 = 0;
                     int var23 = arg7.field11155[var19];
                     if (~var23 != -4) {
                        if (var23 == 10) {
                           var22 = 128;
                        }
                     } else {
                        var22 = 128;
                     }

                     short var24;
                     short var25;
                     short var26;
                     byte var27;
                     short var28;
                     if (var20 == 0) {
                        var24 = var22;
                        var25 = var22;
                        var26 = var22;
                        var27 = 0;
                        var28 = -1;
                        if (var13) {
                           var26 = arg2.field11013[var17];
                           var27 = arg2.field11001[var17];
                           var24 = arg2.field11012[var17];
                           var25 = arg2.field11002[var17];
                           var28 = arg2.field11004[var17];
                           ++var17;
                        }
                     } else {
                        var26 = arg2.field11013[var17];
                        var27 = arg2.field11001[var17];
                        var24 = arg2.field11012[var17];
                        var25 = arg2.field11002[var17];
                        var28 = arg2.field11004[var17];
                        ++var17;
                     }

                     short var29;
                     byte var30;
                     short var31;
                     short var32;
                     short var33;
                     if (var21) {
                        var29 = arg9.field11012[var18];
                        var30 = arg9.field11001[var18];
                        var31 = arg9.field11004[var18];
                        var32 = arg9.field11002[var18];
                        var33 = arg9.field11013[var18];
                        ++var18;
                        if (var13) {
                           var33 = var22;
                           var30 = 0;
                           var31 = -1;
                           var29 = var22;
                           var32 = var22;
                        }
                     } else {
                        var33 = var22;
                        var30 = 0;
                        var31 = -1;
                        var29 = var22;
                        var32 = var22;
                     }

                     int var37;
                     int var38;
                     int var39;
                     if (~(2 & var27) == -1) {
                        if ((var30 & 1) == 0) {
                           int var40;
                           int var41;
                           if (var23 == 2) {
                              int var34 = -var26 + var33 & 16383;
                              int var35 = -var24 + var29 & 16383;
                              if (~var35 <= -8193) {
                                 var35 -= 16384;
                              }

                              int var36;
                              if (~var34 <= -8193) {
                                 var34 -= 16384;
                                 var36 = 16383 & var32 - var25;
                                 if (var36 >= 8192) {
                                    var36 -= 16384;
                                 }
                              } else {
                                 var36 = 16383 & var32 - var25;
                                 if (var36 >= 8192) {
                                    var36 -= 16384;
                                 }
                              }

                              var37 = arg1 * var35 / arg5 + var24 & 16383;
                              var38 = 16383 & arg1 * var34 / arg5 + var26;
                              var39 = var25 - -(arg1 * var36 / arg5) & 16383;
                              if (var13) {
                                 if (~var23 == -10) {
                                    var40 = var33 - var26 & 16383;
                                    if (var40 >= 8192) {
                                       var40 -= 16384;
                                    }

                                    var39 = 0;
                                    var37 = 0;
                                    var38 = 16383 & arg1 * var40 / arg5 + var26;
                                    if (var13) {
                                       if (~var23 != -8) {
                                          var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                          var38 = (var33 - var26) * arg1 / arg5 + var26;
                                          var37 = (var29 - var24) * arg1 / arg5 + var24;
                                          if (var13) {
                                             var41 = var33 - var26 & 63;
                                             if (var41 >= 32) {
                                                var41 -= 64;
                                             }

                                             var38 = 63 & arg1 * var41 / arg5 + var26;
                                             var37 = (-var24 + var29) * arg1 / arg5 + var24;
                                             var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                             if (var13) {
                                                var39 = var25;
                                                var38 = var26;
                                                var37 = var24;
                                             }
                                          }
                                       } else {
                                          var41 = var33 - var26 & 63;
                                          if (var41 >= 32) {
                                             var41 -= 64;
                                          }

                                          var38 = 63 & arg1 * var41 / arg5 + var26;
                                          var37 = (-var24 + var29) * arg1 / arg5 + var24;
                                          var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                          if (var13) {
                                             var39 = var25;
                                             var38 = var26;
                                             var37 = var24;
                                          }
                                       }
                                    }
                                 } else if (~var23 != -8) {
                                    var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                    var38 = (var33 - var26) * arg1 / arg5 + var26;
                                    var37 = (var29 - var24) * arg1 / arg5 + var24;
                                    if (var13) {
                                       var41 = var33 - var26 & 63;
                                       if (var41 >= 32) {
                                          var41 -= 64;
                                       }

                                       var38 = 63 & arg1 * var41 / arg5 + var26;
                                       var37 = (-var24 + var29) * arg1 / arg5 + var24;
                                       var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                       if (var13) {
                                          var39 = var25;
                                          var38 = var26;
                                          var37 = var24;
                                       }
                                    }
                                 } else {
                                    var41 = var33 - var26 & 63;
                                    if (var41 >= 32) {
                                       var41 -= 64;
                                    }

                                    var38 = 63 & arg1 * var41 / arg5 + var26;
                                    var37 = (-var24 + var29) * arg1 / arg5 + var24;
                                    var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                    if (var13) {
                                       var39 = var25;
                                       var38 = var26;
                                       var37 = var24;
                                    }
                                 }
                              }
                           } else if (~var23 == -10) {
                              var40 = var33 - var26 & 16383;
                              if (var40 >= 8192) {
                                 var40 -= 16384;
                              }

                              var39 = 0;
                              var37 = 0;
                              var38 = 16383 & arg1 * var40 / arg5 + var26;
                              if (var13) {
                                 if (~var23 != -8) {
                                    var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                    var38 = (var33 - var26) * arg1 / arg5 + var26;
                                    var37 = (var29 - var24) * arg1 / arg5 + var24;
                                    if (var13) {
                                       var41 = var33 - var26 & 63;
                                       if (var41 >= 32) {
                                          var41 -= 64;
                                       }

                                       var38 = 63 & arg1 * var41 / arg5 + var26;
                                       var37 = (-var24 + var29) * arg1 / arg5 + var24;
                                       var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                       if (var13) {
                                          var39 = var25;
                                          var38 = var26;
                                          var37 = var24;
                                       }
                                    }
                                 } else {
                                    var41 = var33 - var26 & 63;
                                    if (var41 >= 32) {
                                       var41 -= 64;
                                    }

                                    var38 = 63 & arg1 * var41 / arg5 + var26;
                                    var37 = (-var24 + var29) * arg1 / arg5 + var24;
                                    var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                    if (var13) {
                                       var39 = var25;
                                       var38 = var26;
                                       var37 = var24;
                                    }
                                 }
                              }
                           } else if (~var23 != -8) {
                              var39 = (-var25 + var32) * arg1 / arg5 + var25;
                              var38 = (var33 - var26) * arg1 / arg5 + var26;
                              var37 = (var29 - var24) * arg1 / arg5 + var24;
                              if (var13) {
                                 var41 = var33 - var26 & 63;
                                 if (var41 >= 32) {
                                    var41 -= 64;
                                 }

                                 var38 = 63 & arg1 * var41 / arg5 + var26;
                                 var37 = (-var24 + var29) * arg1 / arg5 + var24;
                                 var39 = (-var25 + var32) * arg1 / arg5 + var25;
                                 if (var13) {
                                    var39 = var25;
                                    var38 = var26;
                                    var37 = var24;
                                 }
                              }
                           } else {
                              var41 = var33 - var26 & 63;
                              if (var41 >= 32) {
                                 var41 -= 64;
                              }

                              var38 = 63 & arg1 * var41 / arg5 + var26;
                              var37 = (-var24 + var29) * arg1 / arg5 + var24;
                              var39 = (-var25 + var32) * arg1 / arg5 + var25;
                              if (var13) {
                                 var39 = var25;
                                 var38 = var26;
                                 var37 = var24;
                              }
                           }
                        } else {
                           var39 = var25;
                           var38 = var26;
                           var37 = var24;
                        }
                     } else {
                        var39 = var25;
                        var38 = var26;
                        var37 = var24;
                     }

                     if (~var28 != 0) {
                        this.method3616(arg4, 0, 0, 0, arg3, arg10, arg7.field11151[var28], (byte)-78, arg7.field11150[var28] & arg6, 0);
                        if (var13) {
                           if (var31 != -1) {
                              this.method3616(arg4, 0, 0, 0, arg3, arg10, arg7.field11151[var31], (byte)-115, arg6 & arg7.field11150[var31], 0);
                           }

                           this.method3616(arg4, var23, var38, var39, arg3, arg10, arg7.field11151[var19], (byte)-106, arg7.field11150[var19] & arg6, var37);
                           ++var19;
                        } else {
                           this.method3616(arg4, var23, var38, var39, arg3, arg10, arg7.field11151[var19], (byte)-106, arg7.field11150[var19] & arg6, var37);
                           ++var19;
                        }
                     } else {
                        if (var31 != -1) {
                           this.method3616(arg4, 0, 0, 0, arg3, arg10, arg7.field11151[var31], (byte)-115, arg6 & arg7.field11150[var31], 0);
                        }

                        this.method3616(arg4, var23, var38, var39, arg3, arg10, arg7.field11151[var19], (byte)-106, arg7.field11150[var19] & arg6, var37);
                        ++var19;
                     }
                  }
               }

               if (~var19 <= ~arg7.field11156) {
                  var10000 = arg0;
                  if (!var13) {
                     if (arg0 != -28) {
                        field6882 = -115;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = 0;
               }

               var20 = var10000;
               if (arg2.field11016 > var17) {
                  if (~arg2.field11011[var17] == ~var19) {
                     var20 = 1;
                  }

                  var21 = false;
                  if (~var18 > ~arg9.field11016 && ~arg9.field11011[var18] == ~var19) {
                     var21 = true;
                  }
               } else {
                  var21 = false;
                  if (~var18 > ~arg9.field11016 && ~arg9.field11011[var18] == ~var19) {
                     var21 = true;
                  }
               }
            }
         }
      } catch (RuntimeException var43) {
         throw class534.method3846(var43, field6887[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6887[1] : field6887[2]) + ',' + (arg3 != null ? field6887[1] : field6887[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field6887[1] : field6887[2]) + ',' + (arg8 != null ? field6887[1] : field6887[2]) + ',' + (arg9 != null ? field6887[1] : field6887[2]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method323(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "V",
      descriptor = "()I"
   )
   public abstract int method334();

   @OriginalMember(
      owner = "client!ka",
      name = "P",
      descriptor = "(IIII)V"
   )
   public abstract void method359(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method355(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "F",
      descriptor = "()Z"
   )
   public abstract boolean method328();

   @OriginalMember(
      owner = "client!ka",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method358();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Ls;IIIIIIBI)V"
   )
   public final void method3615(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
      boolean var10 = client.field4273;

      try {
         ++field6874;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         int var14 = -arg2 / 2;
         int var15 = -arg4 / 2;
         int var16 = arg0.method2220(121, arg3 + var14, arg6 + var15);
         int var17 = arg2 / 2;
         int var18 = -arg4 / 2;
         int var19 = arg0.method2220(126, arg3 + var17, arg6 + var18);
         int var20 = -arg2 / 2;
         int var21 = arg4 / 2;
         int var22 = arg0.method2220(126, arg3 + var20, arg6 - -var21);
         int var23 = arg2 / 2;
         int var24 = arg4 / 2;
         int var25 = arg0.method2220(120, arg3 - -var23, arg6 + var24);
         int var26 = ~var19 >= ~var16 ? var19 : var16;
         int var27 = var22 < var25 ? var22 : var25;
         if (arg7 == 27) {
            int var28 = ~var19 > ~var25 ? var19 : var25;
            if (arg4 != 0) {
               int var29 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)(-var27 + var26), (double)arg4));
               if (~var29 != -1) {
                  if (~arg5 != -1) {
                     label111: {
                        if (var29 > 8192) {
                           int var30 = 16384 - arg5;
                           if (var30 <= var29) {
                              break label111;
                           }

                           var29 = var30;
                           if (!var10) {
                              break label111;
                           }
                        }

                        if (arg5 < var29) {
                           var29 = arg5;
                        }
                     }
                  }

                  this.method360(var29);
               }
            }

            int var31 = var16 < var22 ? var16 : var22;
            if (arg2 != 0) {
               int var32 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)(var31 - var28), (double)arg2));
               if (var32 != 0) {
                  if (~arg1 != -1) {
                     label114: {
                        if (~var32 < -8193) {
                           int var33 = -arg1 + 16384;
                           if (var33 <= var32) {
                              break label114;
                           }

                           var32 = var33;
                           if (!var10) {
                              break label114;
                           }
                        }

                        if (~arg1 > ~var32) {
                           var32 = arg1;
                        }
                     }
                  }

                  this.method331(var32);
               }
            }

            int var34 = var16 + var25;
            if (~var34 < ~(var19 + var22)) {
               var34 = var19 + var22;
            }

            int var35 = (var34 >> 1) - arg8;
            if (~var35 != -1) {
               this.method343(0, var35, 0);
            }
         }
      } catch (RuntimeException var37) {
         throw class534.method3846(var37, field6887[6] + (arg0 != null ? field6887[1] : field6887[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkh;Lgp;II)V"
   )
   public abstract void method321(class17 arg0, class52 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public abstract class501 method338(byte arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "s",
      descriptor = "(I)V"
   )
   public abstract void method352(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "FA",
      descriptor = "(I)V"
   )
   public abstract void method360(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "ma",
      descriptor = "()I"
   )
   public abstract int method369();

   @OriginalMember(
      owner = "client!ka",
      name = "da",
      descriptor = "()I"
   )
   public abstract int method335();

   @OriginalMember(
      owner = "client!ka",
      name = "RA",
      descriptor = "()I"
   )
   public abstract int method329();

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "()[Lub;"
   )
   public abstract class22[] method351();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkh;IZ)V"
   )
   public abstract void method362(class17 arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZIII[II[IBII)V"
   )
   private final void method3616(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, byte arg7, int arg8, int arg9) {
      boolean var11 = client.field4273;

      try {
         label114: {
            if (arg5 != 1) {
               if (arg5 == 2) {
                  if (arg1 != 0 && ~arg1 != -2) {
                     if (~arg1 != -3) {
                        break label114;
                     }

                     arg2 = -arg2 & 16383;
                     arg3 = 16383 & -arg3;
                     if (!var11) {
                        break label114;
                     }
                  }

                  arg3 = -arg3;
                  arg2 = -arg2;
                  if (!var11) {
                     break label114;
                  }
               }

               if (~arg5 != -4) {
                  break label114;
               }

               if (arg1 != 0 && arg1 != 1) {
                  if (arg1 != 3) {
                     if (~arg1 != -3) {
                        break label114;
                     }

                     int var12 = arg2;
                     arg2 = arg3 & 16383;
                     arg3 = 16383 & -var12;
                     if (!var11) {
                        break label114;
                     }
                  }

                  int var13 = arg2;
                  arg2 = arg3;
                  arg3 = var13;
                  if (!var11) {
                     break label114;
                  }
               }

               int var14 = arg2;
               arg2 = -arg3;
               arg3 = var14;
               if (!var11) {
                  break label114;
               }
            }

            if (~arg1 == -1 || arg1 == 1) {
               int var15 = -arg2;
               arg2 = arg3;
               arg3 = var15;
               if (!var11) {
                  break label114;
               }
            }

            if (arg1 != 3) {
               if (arg1 != 2) {
                  break label114;
               }

               int var16 = arg2;
               arg2 = 16383 & -arg3;
               arg3 = 16383 & var16;
               if (!var11) {
                  break label114;
               }
            }

            int var17 = arg2;
            arg2 = arg3;
            arg3 = var17;
         }

         if (arg7 >= -66) {
            field6881 = null;
         }

         ++field6877;
         if (~arg8 == -65536) {
            this.method320(arg1, arg6, arg2, arg9, arg3, arg5, arg0);
         } else {
            this.method332(arg1, arg6, arg2, arg9, arg3, arg0, arg8, arg4);
         }
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field6887[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6887[1] : field6887[2]) + ',' + arg5 + ',' + (arg6 != null ? field6887[1] : field6887[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZI)Ldd;"
   )
   public static final class735 method3617(boolean arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         if (arg0) {
            field6884 = false;
         }

         ++field6883;
         class735[] var3 = class12.method97((byte)-100);
         int var4 = 0;
         if (var2) {
            if (~var3[var4].field10741 == ~arg1) {
               return var3[var4];
            }

            ++var4;
         }

         while(true) {
            while(~var3.length < ~var4) {
               if (~var3[var4].field10741 == ~arg1) {
                  return var3[var4];
               }

               ++var4;
            }

            if (!var2) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6887[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[ZLci;IBIZILci;Lci;IIIILci;)V"
   )
   public final void method3618(int arg0, boolean[] arg1, class477 arg2, int arg3, byte arg4, int arg5, boolean arg6, int arg7, class477 arg8, class477 arg9, int arg10, int arg11, int arg12, int arg13, class477 arg14) {
      try {
         ++field6879;
         if (arg4 != -7) {
            field6881 = null;
         }

         if (arg0 != -1) {
            if (arg1 != null && arg3 != -1) {
               this.method326();
               if (!this.method324()) {
                  this.method356();
               } else {
                  class761 var16 = arg8.field6591[arg0];
                  class773 var17 = var16.field11007;
                  class761 var18 = null;
                  if (arg14 != null) {
                     var18 = arg14.field6591[arg5];
                     if (var18.field11007 != var17) {
                        var18 = null;
                     }
                  }

                  this.method3614((byte)-28, arg11, var16, (int[])null, arg6, arg7, 65535, var17, arg1, var18, 0, false);
                  class761 var19 = arg9.field6591[arg3];
                  class761 var20 = null;
                  if (arg2 != null) {
                     var20 = arg2.field6591[arg13];
                     if (var20.field11007 != var17) {
                        var20 = null;
                     }
                  }

                  this.method320(0, new int[0], 0, 0, 0, 0, arg6);
                  this.method3614((byte)-28, arg10, var19, (int[])null, arg6, arg12, 65535, var19.field11007, arg1, var20, 0, true);
                  this.method327();
                  this.method356();
               }
            } else {
               this.method3623(arg5, arg0, arg11, 8353, 0, arg14, arg8, arg7, arg6);
            }
         }
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field6887[5] + arg0 + ',' + (arg1 != null ? field6887[1] : field6887[2]) + ',' + (arg2 != null ? field6887[1] : field6887[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field6887[1] : field6887[2]) + ',' + (arg9 != null ? field6887[1] : field6887[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field6887[1] : field6887[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "()V"
   )
   public abstract void method364();

   @OriginalMember(
      owner = "client!ka",
      name = "ua",
      descriptor = "()I"
   )
   public abstract int method341();

   @OriginalMember(
      owner = "client!ka",
      name = "na",
      descriptor = "()I"
   )
   public abstract int method368();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lpl;Z)V"
   )
   public static final void method3619(class680 arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         ++field6878;
         class775 var3 = (class775)class358.field5094.method3855(-49);
         if (var2) {
            if (var3.field11281 == arg0) {
               if (var3.field11262 != null) {
                  class717.field10509.method2175(var3.field11262);
                  var3.field11262 = null;
               }

               var3.method3609(125);
               return;
            }

            var3 = (class775)class358.field5094.method3866((byte)116);
         }

         while(true) {
            while(var3 != null) {
               if (var3.field11281 == arg0) {
                  if (var3.field11262 != null) {
                     class717.field10509.method2175(var3.field11262);
                     var3.field11262 = null;
                  }

                  var3.method3609(125);
                  return;
               }

               var3 = (class775)class358.field5094.method3866((byte)116);
            }

            if (!var2) {
               if (arg1) {
                  field6884 = false;
                  return;
               }

               return;
            }

            var3 = (class775)class358.field5094.method3866((byte)116);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6887[3] + (arg0 != null ? field6887[1] : field6887[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILkh;ZII)Z"
   )
   public abstract boolean method363(int arg0, int arg1, class17 arg2, boolean arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ka",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public abstract void method332(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3620(int arg0) {
      try {
         field6880 = null;
         field6881 = null;
         field6886 = null;
         if (arg0 != 904) {
            field6884 = false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6887[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILkh;ZI)Z"
   )
   public abstract boolean method339(int arg0, int arg1, class17 arg2, boolean arg3, int arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method348(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "G",
      descriptor = "()I"
   )
   public abstract int method357();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZIIIIILci;Lci;II[I)V"
   )
   public final void method3621(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class477 arg6, class477 arg7, int arg8, int arg9, int[] arg10) {
      try {
         ++field6885;
         if (~arg3 != 0) {
            this.method326();
            if (!this.method324()) {
               this.method356();
            } else {
               class761 var12 = arg6.field6591[arg3];
               class773 var13 = var12.field11007;
               if (arg4 <= 42) {
                  method3619((class680)null, false);
               }

               class761 var14 = null;
               if (arg7 != null) {
                  var14 = arg7.field6591[arg8];
                  if (var14.field11007 != var13) {
                     var14 = null;
                  }
               }

               this.method3614((byte)-28, arg2, var12, arg10, arg0, arg1, arg5, var13, (boolean[])null, var14, arg9, false);
               this.method327();
               this.method356();
            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field6887[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6887[1] : field6887[2]) + ',' + (arg7 != null ? field6887[1] : field6887[2]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field6887[1] : field6887[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "wa",
      descriptor = "()V"
   )
   public abstract void method327();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "()[Luo;"
   )
   public abstract class606[] method337();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkh;)V"
   )
   public abstract void method340(class17 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "WA",
      descriptor = "()I"
   )
   public abstract int method346();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lci;II)V"
   )
   public final void method3622(class477 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field6876;
         if (~arg2 != 0) {
            this.method326();
            if (!this.method324()) {
               this.method356();
            } else {
               class761 var5 = arg0.field6591[arg2];
               class773 var6 = var5.field11007;
               if (arg1 != 514937473) {
                  this.method320(-78, (int[])null, 31, -53, 120, -56, false);
               }

               int var7 = 0;
               if (!var4 && ~var5.field11016 >= ~var7) {
                  this.method327();
                  this.method356();
               } else {
                  do {
                     short var8 = var5.field11011[var7];
                     if (var6.field11152[var8]) {
                        if (~var5.field11004[var7] != 0) {
                           this.method359(0, 0, 0, 0);
                        }

                        this.method359(var6.field11155[var8], var5.field11013[var7], var5.field11012[var7], var5.field11002[var7]);
                     }

                     ++var7;
                  } while(~var5.field11016 < ~var7);

                  this.method327();
                  this.method356();
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6887[4] + (arg0 != null ? field6887[1] : field6887[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public abstract class194 method361(class194 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "fa",
      descriptor = "()I"
   )
   public abstract int method366();

   @OriginalMember(
      owner = "client!ka",
      name = "ia",
      descriptor = "(SS)V"
   )
   public abstract void method349(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method330(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "VA",
      descriptor = "(I)V"
   )
   public abstract void method331(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "LA",
      descriptor = "(I)V"
   )
   public abstract void method365(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIIILci;Lci;IZ)V"
   )
   public final void method3623(int arg0, int arg1, int arg2, int arg3, int arg4, class477 arg5, class477 arg6, int arg7, boolean arg8) {
      try {
         ++field6873;
         if (~arg1 != 0) {
            this.method326();
            if (!this.method324()) {
               this.method356();
            } else {
               class761 var10 = arg6.field6591[arg1];
               class773 var11 = var10.field11007;
               class761 var12 = null;
               if (arg5 != null) {
                  var12 = arg5.field6591[arg0];
                  if (var12.field11007 != var11) {
                     var12 = null;
                  }
               }

               this.method3614((byte)-28, arg2, var10, (int[])null, arg8, arg7, 65535, var11, (boolean[])null, var12, arg4, false);
               this.method327();
               if (arg3 != 8353) {
                  field6886 = null;
               }

               this.method356();
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field6887[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6887[1] : field6887[2]) + ',' + (arg6 != null ? field6887[1] : field6887[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "aa",
      descriptor = "(SS)V"
   )
   public abstract void method347(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkh;Lgp;I)V"
   )
   public abstract void method370(class17 arg0, class52 arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "()Z"
   )
   public abstract boolean method322();

   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "()V"
   )
   public abstract void method326();

   @OriginalMember(
      owner = "client!ka",
      name = "O",
      descriptor = "(III)V"
   )
   public abstract void method342(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "EA",
      descriptor = "()I"
   )
   public abstract int method344();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public abstract void method320(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method372();

   @OriginalMember(
      owner = "client!ka",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public abstract void method353(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "H",
      descriptor = "(III)V"
   )
   public abstract void method343(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "HA",
      descriptor = "()I"
   )
   public abstract int method345();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public abstract void method325(class501 arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "()V"
   )
   public abstract void method356();

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3624(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3625(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
