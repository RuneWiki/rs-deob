import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class232 {
   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "Z"
   )
   public boolean field2885 = false;
   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2892 = new String[]{method1846(method1845(";OpVsx")), method1846(method1845(";OpPsx")), method1846(method1845(";OpRsx")), method1846(method1845("+\u0000p=M")), method1846(method1845(">[2\u007f")), method1846(method1845(";OpUsx")), method1846(method1845(";OpDrx")), method1846(method1845(";OpWsx")), method1846(method1845(";OpErx")), method1846(method1845(";OpTsx")), method1846(method1845(";OpQsx"))};
   @OriginalMember(
      owner = "client!ka",
      name = "j",
      descriptor = "F"
   )
   public static float field2886;
   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "I"
   )
   public static int field2881;
   @OriginalMember(
      owner = "client!ka",
      name = "g",
      descriptor = "I"
   )
   public static int field2882;
   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "I"
   )
   public static int field2883;
   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "I"
   )
   public static int field2884;
   @OriginalMember(
      owner = "client!ka",
      name = "i",
      descriptor = "I"
   )
   public static int field2887;
   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "I"
   )
   public static int field2888;
   @OriginalMember(
      owner = "client!ka",
      name = "h",
      descriptor = "I"
   )
   public static int field2889;
   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "I"
   )
   public static int field2890;
   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "I"
   )
   public static int field2891;

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IZBIILma;ILma;I)V"
   )
   public final void method1836(int arg0, boolean arg1, byte arg2, int arg3, int arg4, class670 arg5, int arg6, class670 arg7, int arg8) {
      try {
         ++field2883;
         if (~arg6 != 0) {
            this.method1234();
            if (!this.method1293()) {
               this.method1228();
            } else {
               class451 var10 = arg7.field9920[arg6];
               if (arg2 != -102) {
                  this.method1248(63, -98, 25, -40);
               }

               class235 var11 = var10.field6110;
               class451 var12 = null;
               if (arg5 != null) {
                  var12 = arg5.field9920[arg8];
                  if (var12.field6110 != var11) {
                     var12 = null;
                  }
               }

               this.method1839(arg1, var12, 65535, 11950, arg4, (int[])null, var10, false, var11, (boolean[])null, arg3, arg0);
               this.method1258();
               this.method1228();
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field2892[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2892[3] : field2892[4]) + ',' + arg6 + ',' + (arg7 != null ? field2892[3] : field2892[4]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method1266(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public abstract void method1225(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method1243();

   @OriginalMember(
      owner = "client!ka",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public abstract class114 method1253(class114 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkia;Lmia;I)V"
   )
   public abstract void method1305(class93 arg0, class687 arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "da",
      descriptor = "()I"
   )
   public abstract int method1236();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method1837(int arg0, boolean arg1) {
      try {
         ++field2881;
         class487 var2 = class2.method12((long)arg0, 11, (byte)43);
         if (!arg1) {
            var2.method3696(-11118);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2892[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IZZ)Lwo;"
   )
   public static final class328 method1838(int arg0, boolean arg1, boolean arg2) {
      boolean var3 = client.field1481;

      try {
         ++field2882;
         if (arg2) {
            method1837(46, true);
         }

         class627[] var4 = class381.field5304;
         synchronized(class381.field5304) {
            class328 var5;
            label45: {
               if (class381.field5304.length > arg0 && !class381.field5304[arg0].method4634(503)) {
                  var5 = (class328)class381.field5304[arg0].method4640(503);
                  var5.method797((byte)96);
                  int var10002 = class210.field2679[arg0]--;
                  if (!var3) {
                     break label45;
                  }
               }

               var5 = new class328();
               var5.field4538 = new class687[arg0];
               int var6 = 0;
               if (var3 || ~arg0 < ~var6) {
                  do {
                     var5.field4538[var6] = new class687();
                     ++var6;
                  } while(~arg0 < ~var6);
               }
            }

            var5.field4535 = arg1;
            return var5;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field2892[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "s",
      descriptor = "(I)V"
   )
   public abstract void method1298(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZLvk;III[ILvk;ZLer;[ZII)V"
   )
   private final void method1839(boolean arg0, class451 arg1, int arg2, int arg3, int arg4, int[] arg5, class451 arg6, boolean arg7, class235 arg8, boolean[] arg9, int arg10, int arg11) {
      boolean var13 = client.field1481;

      try {
         ++field2890;
         if (arg1 == null || arg11 == 0) {
            int var14 = 0;
            if (var13 || arg6.field6113 > var14) {
               do {
                  short var15 = arg6.field6112[var14];
                  if (arg9 != null && arg7 == !arg9[var15] && arg8.field2953[var15] != 0) {
                     ++var14;
                  } else {
                     short var16 = arg6.field6116[var14];
                     if (var16 != -1) {
                        this.method1841(arg8.field2956[var16], 0, 0, (byte)-127, arg2 & arg8.field2951[var16], 0, 0, arg10, arg5, arg0);
                     }

                     this.method1841(arg8.field2956[var15], arg8.field2953[var15], arg6.field6108[var14], (byte)-128, arg2 & arg8.field2951[var15], arg6.field6109[var14], arg6.field6124[var14], arg10, arg5, arg0);
                     ++var14;
                  }
               } while(arg6.field6113 > var14);

            }
         } else {
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var10000;
            int var20;
            boolean var21;
            if (var13) {
               var20 = 0;
               if (~arg6.field6113 < ~var17) {
                  if (arg6.field6112[var17] == var19) {
                     var20 = 1;
                  }

                  var21 = false;
                  if (~var18 > ~arg1.field6113 && arg1.field6112[var18] == var19) {
                     var21 = true;
                  }
               } else {
                  var21 = false;
                  if (~var18 > ~arg1.field6113 && arg1.field6112[var18] == var19) {
                     var21 = true;
                  }
               }
            } else {
               if (arg8.field2957 <= var19) {
                  var10000 = arg3;
                  if (!var13) {
                     if (arg3 != 11950) {
                        field2886 = 0.6753505F;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = 0;
               }

               var20 = var10000;
               if (~arg6.field6113 < ~var17) {
                  if (arg6.field6112[var17] == var19) {
                     var20 = 1;
                  }

                  var21 = false;
                  if (~var18 > ~arg1.field6113 && arg1.field6112[var18] == var19) {
                     var21 = true;
                  }
               } else {
                  var21 = false;
                  if (~var18 > ~arg1.field6113 && arg1.field6112[var18] == var19) {
                     var21 = true;
                  }
               }
            }

            while(true) {
               if (var20 == 0 && !var21) {
                  ++var19;
               } else {
                  label512: {
                     if (arg9 != null && arg7 == !arg9[var19] && arg8.field2953[var19] != 0) {
                        if (var20 != 0) {
                           ++var17;
                        }

                        if (!var21) {
                           ++var19;
                           break label512;
                        }

                        ++var18;
                        if (!var13) {
                           ++var19;
                           break label512;
                        }
                     }

                     short var22 = 0;
                     int var23 = arg8.field2953[var19];
                     if (~var23 != -4) {
                        if (~var23 == -11) {
                           var22 = 128;
                        }
                     } else {
                        var22 = 128;
                     }

                     byte var24;
                     short var25;
                     short var26;
                     short var27;
                     short var28;
                     if (var20 != 0) {
                        var24 = arg6.field6120[var17];
                        var25 = arg6.field6116[var17];
                        var26 = arg6.field6108[var17];
                        var27 = arg6.field6109[var17];
                        var28 = arg6.field6124[var17];
                        ++var17;
                        if (var13) {
                           var25 = -1;
                           var27 = var22;
                           var24 = 0;
                           var28 = var22;
                           var26 = var22;
                        }
                     } else {
                        var25 = -1;
                        var27 = var22;
                        var24 = 0;
                        var28 = var22;
                        var26 = var22;
                     }

                     short var29;
                     short var30;
                     short var31;
                     short var32;
                     byte var33;
                     if (!var21) {
                        var29 = -1;
                        var30 = var22;
                        var31 = var22;
                        var32 = var22;
                        var33 = 0;
                        if (var13) {
                           var33 = arg1.field6120[var18];
                           var32 = arg1.field6124[var18];
                           var29 = arg1.field6116[var18];
                           var31 = arg1.field6108[var18];
                           var30 = arg1.field6109[var18];
                           ++var18;
                        }
                     } else {
                        var33 = arg1.field6120[var18];
                        var32 = arg1.field6124[var18];
                        var29 = arg1.field6116[var18];
                        var31 = arg1.field6108[var18];
                        var30 = arg1.field6109[var18];
                        ++var18;
                     }

                     if (~var25 != 0) {
                        this.method1841(arg8.field2956[var25], 0, 0, (byte)-110, arg2 & arg8.field2951[var25], 0, 0, arg10, arg5, arg0);
                        if (var13 && ~var29 != 0) {
                           this.method1841(arg8.field2956[var29], 0, 0, (byte)-120, arg8.field2951[var29] & arg2, 0, 0, arg10, arg5, arg0);
                        }
                     } else if (~var29 != 0) {
                        this.method1841(arg8.field2956[var29], 0, 0, (byte)-120, arg8.field2951[var29] & arg2, 0, 0, arg10, arg5, arg0);
                     }

                     if (~(var24 & 2) == -1) {
                        if ((1 & var33) == 0) {
                           int var35;
                           int var39;
                           int var40;
                           int var41;
                           int var44;
                           int var45;
                           if (var23 != 2) {
                              int var38;
                              if (var23 == 9) {
                                 int var34 = 16383 & -var28 + var32;
                                 if (var34 >= 8192) {
                                    var34 -= 16384;
                                 }

                                 var35 = var28 - -(arg11 * var34 / arg4) & 16383;
                                 byte var36 = 0;
                                 byte var37 = 0;
                                 if (var13) {
                                    if (~var23 == -8) {
                                       var38 = -var28 + var32 & 63;
                                       if (var38 >= 32) {
                                          var38 -= 64;
                                       }

                                       var44 = (var31 - var26) * arg11 / arg4 + var26;
                                       var45 = (-var27 + var30) * arg11 / arg4 + var27;
                                       var35 = 63 & var28 - -(arg11 * var38 / arg4);
                                       if (var13) {
                                          var35 = (-var28 + var32) * arg11 / arg4 + var28;
                                          var44 = (-var26 + var31) * arg11 / arg4 + var26;
                                          var45 = var27 - -((-var27 + var30) * arg11 / arg4);
                                          if (var13) {
                                             var39 = 16383 & -var28 + var32;
                                             var40 = -var27 + var30 & 16383;
                                             if (~var40 <= -8193) {
                                                var40 -= 16384;
                                             }

                                             if (var39 >= 8192) {
                                                var39 -= 16384;
                                             }

                                             var41 = 16383 & -var26 + var31;
                                             var35 = 16383 & var28 - -(arg11 * var39 / arg4);
                                             var45 = 16383 & arg11 * var40 / arg4 + var27;
                                             if (~var41 <= -8193) {
                                                var41 -= 16384;
                                             }

                                             var44 = 16383 & var26 - -(arg11 * var41 / arg4);
                                             if (var13) {
                                                var35 = var28;
                                                var45 = var27;
                                                var44 = var26;
                                             }
                                          }

                                          this.method1841(arg8.field2956[var19], var23, var44, (byte)-117, arg2 & arg8.field2951[var19], var45, var35, arg10, arg5, arg0);
                                          ++var19;
                                       } else {
                                          this.method1841(arg8.field2956[var19], var23, var44, (byte)-117, arg2 & arg8.field2951[var19], var45, var35, arg10, arg5, arg0);
                                          ++var19;
                                       }
                                    } else {
                                       var35 = (-var28 + var32) * arg11 / arg4 + var28;
                                       var44 = (-var26 + var31) * arg11 / arg4 + var26;
                                       var45 = var27 - -((-var27 + var30) * arg11 / arg4);
                                       if (var13) {
                                          var39 = 16383 & -var28 + var32;
                                          var40 = -var27 + var30 & 16383;
                                          if (~var40 <= -8193) {
                                             var40 -= 16384;
                                          }

                                          if (var39 >= 8192) {
                                             var39 -= 16384;
                                          }

                                          var41 = 16383 & -var26 + var31;
                                          var35 = 16383 & var28 - -(arg11 * var39 / arg4);
                                          var45 = 16383 & arg11 * var40 / arg4 + var27;
                                          if (~var41 <= -8193) {
                                             var41 -= 16384;
                                          }

                                          var44 = 16383 & var26 - -(arg11 * var41 / arg4);
                                          if (var13) {
                                             var35 = var28;
                                             var45 = var27;
                                             var44 = var26;
                                          }
                                       }

                                       this.method1841(arg8.field2956[var19], var23, var44, (byte)-117, arg2 & arg8.field2951[var19], var45, var35, arg10, arg5, arg0);
                                       ++var19;
                                    }
                                 } else {
                                    this.method1841(arg8.field2956[var19], var23, var36, (byte)-117, arg2 & arg8.field2951[var19], var37, var35, arg10, arg5, arg0);
                                    ++var19;
                                 }
                              } else if (~var23 == -8) {
                                 var38 = -var28 + var32 & 63;
                                 if (var38 >= 32) {
                                    var38 -= 64;
                                 }

                                 var44 = (var31 - var26) * arg11 / arg4 + var26;
                                 var45 = (-var27 + var30) * arg11 / arg4 + var27;
                                 var35 = 63 & var28 - -(arg11 * var38 / arg4);
                                 if (var13) {
                                    var35 = (-var28 + var32) * arg11 / arg4 + var28;
                                    var44 = (-var26 + var31) * arg11 / arg4 + var26;
                                    var45 = var27 - -((-var27 + var30) * arg11 / arg4);
                                    if (var13) {
                                       var39 = 16383 & -var28 + var32;
                                       var40 = -var27 + var30 & 16383;
                                       if (~var40 <= -8193) {
                                          var40 -= 16384;
                                       }

                                       if (var39 >= 8192) {
                                          var39 -= 16384;
                                       }

                                       var41 = 16383 & -var26 + var31;
                                       var35 = 16383 & var28 - -(arg11 * var39 / arg4);
                                       var45 = 16383 & arg11 * var40 / arg4 + var27;
                                       if (~var41 <= -8193) {
                                          var41 -= 16384;
                                       }

                                       var44 = 16383 & var26 - -(arg11 * var41 / arg4);
                                       if (var13) {
                                          var35 = var28;
                                          var45 = var27;
                                          var44 = var26;
                                       }
                                    }

                                    this.method1841(arg8.field2956[var19], var23, var44, (byte)-117, arg2 & arg8.field2951[var19], var45, var35, arg10, arg5, arg0);
                                    ++var19;
                                 } else {
                                    this.method1841(arg8.field2956[var19], var23, var44, (byte)-117, arg2 & arg8.field2951[var19], var45, var35, arg10, arg5, arg0);
                                    ++var19;
                                 }
                              } else {
                                 var35 = (-var28 + var32) * arg11 / arg4 + var28;
                                 var44 = (-var26 + var31) * arg11 / arg4 + var26;
                                 var45 = var27 - -((-var27 + var30) * arg11 / arg4);
                                 if (var13) {
                                    var39 = 16383 & -var28 + var32;
                                    var40 = -var27 + var30 & 16383;
                                    if (~var40 <= -8193) {
                                       var40 -= 16384;
                                    }

                                    if (var39 >= 8192) {
                                       var39 -= 16384;
                                    }

                                    var41 = 16383 & -var26 + var31;
                                    var35 = 16383 & var28 - -(arg11 * var39 / arg4);
                                    var45 = 16383 & arg11 * var40 / arg4 + var27;
                                    if (~var41 <= -8193) {
                                       var41 -= 16384;
                                    }

                                    var44 = 16383 & var26 - -(arg11 * var41 / arg4);
                                    if (var13) {
                                       var35 = var28;
                                       var45 = var27;
                                       var44 = var26;
                                    }
                                 }

                                 this.method1841(arg8.field2956[var19], var23, var44, (byte)-117, arg2 & arg8.field2951[var19], var45, var35, arg10, arg5, arg0);
                                 ++var19;
                              }
                           } else {
                              var39 = 16383 & -var28 + var32;
                              var40 = -var27 + var30 & 16383;
                              if (~var40 <= -8193) {
                                 var40 -= 16384;
                              }

                              if (var39 >= 8192) {
                                 var39 -= 16384;
                              }

                              var41 = 16383 & -var26 + var31;
                              var35 = 16383 & var28 - -(arg11 * var39 / arg4);
                              var45 = 16383 & arg11 * var40 / arg4 + var27;
                              if (~var41 <= -8193) {
                                 var41 -= 16384;
                              }

                              var44 = 16383 & var26 - -(arg11 * var41 / arg4);
                              if (var13) {
                                 var35 = var28;
                                 var45 = var27;
                                 var44 = var26;
                              }

                              this.method1841(arg8.field2956[var19], var23, var44, (byte)-117, arg2 & arg8.field2951[var19], var45, var35, arg10, arg5, arg0);
                              ++var19;
                           }
                        } else {
                           this.method1841(arg8.field2956[var19], var23, var26, (byte)-117, arg2 & arg8.field2951[var19], var27, var28, arg10, arg5, arg0);
                           ++var19;
                        }
                     } else {
                        this.method1841(arg8.field2956[var19], var23, var26, (byte)-117, arg2 & arg8.field2951[var19], var27, var28, arg10, arg5, arg0);
                        ++var19;
                     }
                  }
               }

               if (arg8.field2957 <= var19) {
                  var10000 = arg3;
                  if (!var13) {
                     if (arg3 != 11950) {
                        field2886 = 0.6753505F;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = 0;
               }

               var20 = var10000;
               if (~arg6.field6113 < ~var17) {
                  if (arg6.field6112[var17] == var19) {
                     var20 = 1;
                  }

                  var21 = false;
                  if (~var18 > ~arg1.field6113 && arg1.field6112[var18] == var19) {
                     var21 = true;
                  }
               } else {
                  var21 = false;
                  if (~var18 > ~arg1.field6113 && arg1.field6112[var18] == var19) {
                     var21 = true;
                  }
               }
            }
         }
      } catch (RuntimeException var43) {
         throw class93.method866(var43, field2892[5] + arg0 + ',' + (arg1 != null ? field2892[3] : field2892[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2892[3] : field2892[4]) + ',' + (arg6 != null ? field2892[3] : field2892[4]) + ',' + arg7 + ',' + (arg8 != null ? field2892[3] : field2892[4]) + ',' + (arg9 != null ? field2892[3] : field2892[4]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "FA",
      descriptor = "(I)V"
   )
   public abstract void method1224(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIIZILs;II)V"
   )
   public final void method1840(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class423 arg6, int arg7, int arg8) {
      boolean var10 = client.field1481;

      try {
         ++field2891;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         if (arg4) {
            int var14 = -arg3 / 2;
            int var15 = -arg7 / 2;
            int var16 = arg6.method3288(arg0 + var14, (byte)121, arg5 + var15);
            int var17 = arg3 / 2;
            int var18 = -arg7 / 2;
            int var19 = arg6.method3288(arg0 + var17, (byte)121, arg5 + var18);
            int var20 = -arg3 / 2;
            int var21 = arg7 / 2;
            int var22 = arg6.method3288(arg0 + var20, (byte)121, arg5 - -var21);
            int var23 = arg3 / 2;
            int var24 = arg7 / 2;
            int var25 = arg6.method3288(arg0 + var23, (byte)121, arg5 + var24);
            int var26 = ~var16 > ~var19 ? var16 : var19;
            int var27 = ~var25 >= ~var22 ? var25 : var22;
            int var28 = var25 <= var19 ? var25 : var19;
            int var29 = ~var16 > ~var22 ? var16 : var22;
            if (arg7 != 0) {
               int var30 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)(var26 - var27), (double)arg7));
               if (var30 != 0) {
                  if (arg2 != 0) {
                     label113: {
                        if (var30 <= 8192) {
                           if (~var30 >= ~arg2) {
                              break label113;
                           }

                           var30 = arg2;
                           if (!var10) {
                              break label113;
                           }
                        }

                        int var31 = -arg2 + 16384;
                        if (var31 > var30) {
                           var30 = var31;
                        }
                     }
                  }

                  this.method1224(var30);
               }
            }

            int var32 = var16 + var25;
            if (arg3 != 0) {
               int var33 = (int)(Math.atan2((double)(-var28 + var29), (double)arg3) * 2607.5945876176133D) & 16383;
               if (var33 != 0) {
                  if (arg8 != 0) {
                     label114: {
                        if (~var33 < -8193) {
                           int var34 = -arg8 + 16384;
                           if (var33 >= var34) {
                              break label114;
                           }

                           var33 = var34;
                           if (!var10) {
                              break label114;
                           }
                        }

                        if (arg8 < var33) {
                           var33 = arg8;
                        }
                     }
                  }

                  this.method1289(var33);
               }
            }

            if (~(var19 + var22) > ~var32) {
               var32 = var19 + var22;
            }

            int var35 = (var32 >> 1) + -arg1;
            if (var35 != 0) {
               this.method1279(0, var35, 0);
            }
         }
      } catch (RuntimeException var37) {
         throw class93.method866(var37, field2892[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2892[3] : field2892[4]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "()V"
   )
   public abstract void method1234();

   @OriginalMember(
      owner = "client!ka",
      name = "VA",
      descriptor = "(I)V"
   )
   public abstract void method1289(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkia;Lmia;II)V"
   )
   public abstract void method1297(class93 arg0, class687 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "aa",
      descriptor = "(SS)V"
   )
   public abstract void method1280(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "()[Llba;"
   )
   public abstract class224[] method1231();

   @OriginalMember(
      owner = "client!ka",
      name = "ua",
      descriptor = "()I"
   )
   public abstract int method1285();

   @OriginalMember(
      owner = "client!ka",
      name = "V",
      descriptor = "()I"
   )
   public abstract int method1226();

   @OriginalMember(
      owner = "client!ka",
      name = "G",
      descriptor = "()I"
   )
   public abstract int method1250();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkia;)V"
   )
   public abstract void method1232(class93 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method1248(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "()[Lmha;"
   )
   public abstract class426[] method1272();

   @OriginalMember(
      owner = "client!ka",
      name = "O",
      descriptor = "(III)V"
   )
   public abstract void method1262(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "ma",
      descriptor = "()I"
   )
   public abstract int method1252();

   @OriginalMember(
      owner = "client!ka",
      name = "wa",
      descriptor = "()V"
   )
   public abstract void method1258();

   @OriginalMember(
      owner = "client!ka",
      name = "RA",
      descriptor = "()I"
   )
   public abstract int method1295();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1260(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "H",
      descriptor = "(III)V"
   )
   public abstract void method1279(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public abstract void method1275(int arg0, int arg1, class423 arg2, class423 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "na",
      descriptor = "()I"
   )
   public abstract int method1303();

   @OriginalMember(
      owner = "client!ka",
      name = "NA",
      descriptor = "()Z"
   )
   public abstract boolean method1293();

   @OriginalMember(
      owner = "client!ka",
      name = "fa",
      descriptor = "()I"
   )
   public abstract int method1287();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "([IIIBIIII[IZ)V"
   )
   private final void method1841(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, boolean arg9) {
      boolean var11 = client.field1481;

      try {
         if (arg3 >= -108) {
            this.method1279(72, -15, 16);
         }

         label105: {
            if (~arg7 != -2) {
               if (~arg7 == -3) {
                  if (~arg1 != -1 && ~arg1 != -2) {
                     if (~arg1 != -3) {
                        break label105;
                     }

                     arg6 = -arg6 & 16383;
                     arg2 = 16383 & -arg2;
                     if (!var11) {
                        break label105;
                     }
                  }

                  arg6 = -arg6;
                  arg2 = -arg2;
                  if (!var11) {
                     break label105;
                  }
               }

               if (arg7 != 3) {
                  break label105;
               }

               if (arg1 == 0 || arg1 == 1) {
                  int var12 = arg6;
                  arg6 = -arg2;
                  arg2 = var12;
                  if (!var11) {
                     break label105;
                  }
               }

               if (arg1 == 3) {
                  int var13 = arg6;
                  arg6 = arg2;
                  arg2 = var13;
                  if (!var11) {
                     break label105;
                  }
               }

               if (arg1 != 2) {
                  break label105;
               }

               int var14 = arg6;
               arg6 = arg2 & 16383;
               arg2 = 16383 & -var14;
               if (!var11) {
                  break label105;
               }
            }

            if (arg1 != 0 && arg1 != 1) {
               if (arg1 != 3) {
                  if (~arg1 != -3) {
                     break label105;
                  }

                  int var15 = arg6;
                  arg6 = -arg2 & 16383;
                  arg2 = var15 & 16383;
                  if (!var11) {
                     break label105;
                  }
               }

               int var16 = arg6;
               arg6 = arg2;
               arg2 = var16;
               if (!var11) {
                  break label105;
               }
            }

            int var17 = -arg6;
            arg6 = arg2;
            arg2 = var17;
         }

         ++field2889;
         if (~arg4 != -65536) {
            this.method1255(arg1, arg0, arg6, arg5, arg2, arg9, arg4, arg8);
         } else {
            this.method1225(arg1, arg0, arg6, arg5, arg2, arg7, arg9);
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field2892[6] + (arg0 != null ? field2892[3] : field2892[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field2892[3] : field2892[4]) + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "HA",
      descriptor = "()I"
   )
   public abstract int method1261();

   @OriginalMember(
      owner = "client!ka",
      name = "WA",
      descriptor = "()I"
   )
   public abstract int method1300();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lkia;IZ)V"
   )
   public abstract void method1276(class93 arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public abstract class232 method1256(byte arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "()Z"
   )
   public abstract boolean method1246();

   @OriginalMember(
      owner = "client!ka",
      name = "EA",
      descriptor = "()I"
   )
   public abstract int method1286();

   @OriginalMember(
      owner = "client!ka",
      name = "ia",
      descriptor = "(SS)V"
   )
   public abstract void method1270(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public abstract void method1255(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!ka",
      name = "F",
      descriptor = "()Z"
   )
   public abstract boolean method1259();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIIILma;[ZLma;Lma;Lma;IIIBZ)V"
   )
   public final void method1842(int arg0, int arg1, int arg2, int arg3, int arg4, class670 arg5, boolean[] arg6, class670 arg7, class670 arg8, class670 arg9, int arg10, int arg11, int arg12, byte arg13, boolean arg14) {
      try {
         ++field2888;
         if (arg11 != -1) {
            if (arg6 != null && arg2 != -1) {
               this.method1234();
               if (!this.method1293()) {
                  this.method1228();
               } else {
                  class451 var16 = arg7.field9920[arg11];
                  class235 var17 = var16.field6110;
                  class451 var18 = null;
                  if (arg9 != null) {
                     var18 = arg9.field9920[arg10];
                     if (var18.field6110 != var17) {
                        var18 = null;
                     }
                  }

                  this.method1839(arg14, var18, 65535, 11950, arg4, (int[])null, var16, false, var17, arg6, 0, arg0);
                  class451 var19 = arg5.field9920[arg2];
                  class451 var20 = null;
                  if (arg8 != null) {
                     var20 = arg8.field9920[arg3];
                     if (var20.field6110 != var17) {
                        var20 = null;
                     }
                  }

                  this.method1225(0, new int[0], 0, 0, 0, 0, arg14);
                  this.method1839(arg14, var20, 65535, 11950, arg12, (int[])null, var19, true, var19.field6110, arg6, 0, arg1);
                  this.method1258();
                  if (arg13 <= -120) {
                     this.method1228();
                  }
               }
            } else {
               this.method1836(arg0, arg14, (byte)-102, 0, arg4, arg9, arg11, arg7, arg10);
            }
         }
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field2892[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2892[3] : field2892[4]) + ',' + (arg6 != null ? field2892[3] : field2892[4]) + ',' + (arg7 != null ? field2892[3] : field2892[4]) + ',' + (arg8 != null ? field2892[3] : field2892[4]) + ',' + (arg9 != null ? field2892[3] : field2892[4]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILkia;ZII)Z"
   )
   public abstract boolean method1304(int arg0, int arg1, class93 arg2, boolean arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ka",
      name = "LA",
      descriptor = "(I)V"
   )
   public abstract void method1269(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILkia;ZI)Z"
   )
   public abstract boolean method1273(int arg0, int arg1, class93 arg2, boolean arg3, int arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "P",
      descriptor = "(IIII)V"
   )
   public abstract void method1230(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "()V"
   )
   public abstract void method1244();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public abstract void method1238(class232 arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method1242(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "()V"
   )
   public abstract void method1228();

   @OriginalMember(
      owner = "client!ka",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method1237();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lma;[IBIIIILma;ZII)V"
   )
   public final void method1843(class670 arg0, int[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class670 arg7, boolean arg8, int arg9, int arg10) {
      try {
         ++field2887;
         if (~arg4 != 0) {
            this.method1234();
            if (!this.method1293()) {
               this.method1228();
            } else {
               class451 var12 = arg0.field9920[arg4];
               class235 var13 = var12.field6110;
               class451 var14 = null;
               if (arg7 != null) {
                  var14 = arg7.field9920[arg10];
                  if (var14.field6110 != var13) {
                     var14 = null;
                  }
               }

               if (arg2 <= 77) {
                  this.method1285();
               }

               this.method1839(arg8, var14, arg9, 11950, arg3, arg1, var12, false, var13, (boolean[])null, arg5, arg6);
               this.method1258();
               this.method1228();
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field2892[8] + (arg0 != null ? field2892[3] : field2892[4]) + ',' + (arg1 != null ? field2892[3] : field2892[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2892[3] : field2892[4]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lma;II)V"
   )
   public final void method1844(class670 arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field2884;
         if (~arg1 != arg2) {
            this.method1234();
            if (!this.method1293()) {
               this.method1228();
            } else {
               class451 var5 = arg0.field9920[arg1];
               class235 var6 = var5.field6110;
               int var7 = 0;
               if (!var4 && var7 >= var5.field6113) {
                  this.method1258();
                  this.method1228();
               } else {
                  do {
                     short var8 = var5.field6112[var7];
                     if (var6.field2958[var8]) {
                        if (~var5.field6116[var7] != 0) {
                           this.method1230(0, 0, 0, 0);
                        }

                        this.method1230(var6.field2953[var8], var5.field6124[var7], var5.field6109[var7], var5.field6108[var7]);
                     }

                     ++var7;
                  } while(var7 < var5.field6113);

                  this.method1258();
                  this.method1228();
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2892[9] + (arg0 != null ? field2892[3] : field2892[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1845(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1846(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
