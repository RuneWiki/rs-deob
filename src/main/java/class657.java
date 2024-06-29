import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class657 extends class673 {
   @OriginalMember(
      owner = "client!ns",
      name = "r",
      descriptor = "[I"
   )
   public int[] field9799 = new int[1];
   @OriginalMember(
      owner = "client!ns",
      name = "n",
      descriptor = "[I"
   )
   public int[] field9798 = new int[]{-1};
   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9804 = new String[]{method4825(method4824("Ff-M\f")), method4825(method4824("Ff-I\f")), method4825(method4824("S;-&Y")), method4825(method4824("F`od")), method4825(method4824("Ff-L\f")), method4825(method4824("Ff-J\f")), method4825(method4824("Ff-K\f"))};
   @OriginalMember(
      owner = "client!ns",
      name = "t",
      descriptor = "I"
   )
   public static int field9800 = 0;
   @OriginalMember(
      owner = "client!ns",
      name = "l",
      descriptor = "I"
   )
   public static int field9795;
   @OriginalMember(
      owner = "client!ns",
      name = "m",
      descriptor = "I"
   )
   public static int field9796;
   @OriginalMember(
      owner = "client!ns",
      name = "o",
      descriptor = "I"
   )
   public static int field9797;
   @OriginalMember(
      owner = "client!ns",
      name = "p",
      descriptor = "I"
   )
   public static int field9801;
   @OriginalMember(
      owner = "client!ns",
      name = "q",
      descriptor = "Lww;"
   )
   public static class339 field9803;
   @OriginalMember(
      owner = "client!ns",
      name = "s",
      descriptor = "Lkia;"
   )
   public static class93 field9802;

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(Z[I[III)J"
   )
   private final long method4819(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field9797;
         long[] var7 = class634.field9334;
         long var8 = -1L;
         long var10 = var7[(int)(255L & (var8 ^ (long)(arg3 >> 8)))] ^ var8 >>> 8;
         long var12 = var7[(int)(((long)arg3 ^ var10) & 255L)] ^ var10 >>> 8;
         if (arg4 != 1849262792) {
            return 37L;
         } else {
            int var14 = 0;
            long var15;
            long var17;
            long var19;
            if (var6) {
               var15 = var7[(int)(((long)(arg1[var14] >> 24) ^ var12) & 255L)] ^ var12 >>> 8;
               var17 = var7[(int)((var15 ^ (long)(arg1[var14] >> 16)) & 255L)] ^ var15 >>> 8;
               var19 = var17 >>> 8 ^ var7[(int)(255L & (var17 ^ (long)(arg1[var14] >> 8)))];
               var12 = var7[(int)(255L & ((long)arg1[var14] ^ var19))] ^ var19 >>> 8;
               ++var14;
            }

            while(true) {
               while(~arg1.length < ~var14) {
                  var15 = var7[(int)(((long)(arg1[var14] >> 24) ^ var12) & 255L)] ^ var12 >>> 8;
                  var17 = var7[(int)((var15 ^ (long)(arg1[var14] >> 16)) & 255L)] ^ var15 >>> 8;
                  var19 = var17 >>> 8 ^ var7[(int)(255L & (var17 ^ (long)(arg1[var14] >> 8)))];
                  var12 = var7[(int)(255L & ((long)arg1[var14] ^ var19))] ^ var19 >>> 8;
                  ++var14;
               }

               if (!var6) {
                  if (arg2 != null) {
                     int var21 = 0;
                     if (var6 || ~var21 > -6) {
                        do {
                           var12 = var12 >>> 8 ^ var7[(int)(((long)arg2[var21] ^ var12) & 255L)];
                           ++var21;
                        } while(~var21 > -6);
                     }
                  }

                  return var7[(int)(255L & (var12 ^ (long)(arg0 ? 1 : 0)))] ^ var12 >>> 8;
               }

               ++var14;
            }
         }
      } catch (RuntimeException var25) {
         throw class93.method866(var25, field9804[4] + arg0 + ',' + (arg1 != null ? field9804[2] : field9804[3]) + ',' + (arg2 != null ? field9804[2] : field9804[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4820(int arg0, int arg1, int arg2) {
      try {
         ++field9801;
         if (arg0 != 0) {
            field9800 = 54;
         }

         return (arg1 & 1024) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9804[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4821(byte arg0) {
      try {
         field9802 = null;
         if (arg0 > -109) {
            field9802 = null;
         }

         field9803 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9804[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(IIIILgm;IZLmn;ILha;)Lka;"
   )
   public final class232 method4822(int arg0, int arg1, int arg2, int arg3, class570 arg4, int arg5, boolean arg6, class238 arg7, int arg8, class479 arg9) {
      boolean var11 = client.field1481;

      try {
         ++field9796;
         class232 var12 = null;
         int var13 = arg3;
         class516 var14 = null;
         if (arg1 != -1) {
            var14 = class754.field11043.method2623(arg1, arg0 + -23043);
         }

         int[] var15 = this.field9798;
         int var16;
         int var10000;
         int var17;
         boolean var18;
         boolean var19;
         int var20;
         int var21;
         int var22;
         class670 var23;
         class670 var24;
         int var25;
         int var26;
         int var27;
         int var28;
         long var29;
         int var31;
         byte var32;
         int var33;
         class167[] var34;
         int var35;
         int var36;
         int var37;
         int var38;
         int var39;
         int var40;
         int var41;
         int var42;
         class167 var43;
         int var44;
         int var45;
         class232 var46;
         if (var14 != null) {
            if (var14.field7223 != null) {
               var15 = new int[var14.field7223.length];
               var16 = 0;
               if (var11) {
                  var17 = var14.field7223[var16];
                  if (var17 >= 0) {
                     if (this.field9798.length <= var17) {
                        var15[var16] = -1;
                        if (var11) {
                           var15[var16] = this.field9798[var17];
                           ++var16;
                        } else {
                           ++var16;
                        }
                     } else {
                        var15[var16] = this.field9798[var17];
                        ++var16;
                     }
                  } else {
                     var15[var16] = -1;
                     if (var11) {
                        var15[var16] = this.field9798[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  }
               }
            } else {
               var16 = 0;
               var17 = 0;
               if (!var11) {
                  if (arg0 != 23555) {
                     this.method4822(-11, 20, 36, 18, (class570)null, 64, false, (class238)null, -64, (class479)null);
                  }

                  var18 = false;
                  var19 = false;
                  var20 = -1;
                  var21 = -1;
                  var22 = 0;
                  var23 = null;
                  var24 = null;
                  if (arg7 != null) {
                     var25 = arg7.field3026[arg2];
                     var13 = arg3 | 32;
                     var26 = var25 >>> 16;
                     var23 = class532.field7812.method2475((byte)97, var26);
                     var20 = var25 & 65535;
                     if (var23 != null) {
                        var17 |= var23.method4889(126, var20);
                        var16 |= var23.method4890(var20, 3);
                        var19 |= var23.method4891(var20, 122);
                        var18 |= arg7.field3020;
                     }

                     if ((arg7.field3018 || class350.field4799) && ~arg8 != 0 && arg7.field3026.length > arg8) {
                        var22 = arg7.field3023[arg2];
                        var27 = arg7.field3026[arg8];
                        var28 = var27 >>> 16;
                        var21 = var27 & 65535;
                        if (~var26 != ~var28) {
                           var24 = class532.field7812.method2475((byte)-104, var21 >>> 16);
                        } else {
                           var24 = var23;
                        }

                        if (var24 != null) {
                           var17 |= var24.method4889(127, var21);
                           var16 |= var24.method4890(var21, 3);
                           var19 |= var24.method4891(var21, 125);
                        }
                     }

                     if (var17 != 0) {
                        var13 |= 128;
                     }

                     if (var16 != 0) {
                        var13 |= 256;
                     }

                     if (var18) {
                        var13 |= 512;
                     }

                     if (var19) {
                        var13 |= 1024;
                     }
                  }

                  var29 = this.method4819(arg6, var15, arg4 == null ? null : arg4.field8389, arg1, 1849262792);
                  if (class551.field8114 != null) {
                     var12 = (class232)class551.field8114.method3192(var29, (byte)-119);
                  }

                  if (var12 == null || ~arg9.method495(var12.method1285(), var13) != -1) {
                     if (var12 != null) {
                        var13 = arg9.method444(var13, var12.method1285());
                     }

                     label837: {
                        var31 = var13;
                        var32 = 0;
                        var33 = 0;
                        if (var11) {
                           var10000 = var15[var33];
                        } else if (var33 >= var15.length) {
                           var10000 = var32;
                           if (!var11) {
                              break label837;
                           }
                        } else {
                           var10000 = var15[var33];
                        }

                        while(true) {
                           if (var10000 != -1 && !class166.field2126.method5576(var15[var33], (byte)-57).method4123(arg6, (byte)-77, (class742)null)) {
                              var32 = 1;
                           }

                           ++var33;
                           if (var33 >= var15.length) {
                              var10000 = var32;
                              if (!var11) {
                                 break;
                              }
                           } else {
                              var10000 = var15[var33];
                           }
                        }
                     }

                     if (var10000 != 0) {
                        return null;
                     }

                     var34 = new class167[var15.length];
                     var35 = 0;
                     if (var11) {
                        if (var15[var35] != -1) {
                           var34[var35] = class166.field2126.method5576(var15[var35], (byte)-79).method4132(-32350, (class742)null, arg6);
                        }

                        ++var35;
                     }

                     while(true) {
                        while(~var15.length < ~var35) {
                           if (var15[var35] != -1) {
                              var34[var35] = class166.field2126.method5576(var15[var35], (byte)-79).method4132(-32350, (class742)null, arg6);
                           }

                           ++var35;
                        }

                        if (!var11) {
                           if (var14 != null && var14.field7219 != null) {
                              var36 = 0;
                              if (var11 || var36 < var14.field7219.length) {
                                 do {
                                    if (var14.field7219[var36] != null) {
                                       if (var34[var36] == null && !var11) {
                                          ++var36;
                                       } else {
                                          var37 = var14.field7219[var36][0];
                                          var38 = var14.field7219[var36][1];
                                          var39 = var14.field7219[var36][2];
                                          var40 = var14.field7219[var36][3];
                                          var41 = var14.field7219[var36][4];
                                          var42 = var14.field7219[var36][5];
                                          if (var40 != 0 || ~var41 != -1 || ~var42 != -1) {
                                             var34[var36].method1444(var42, var40, var41, arg0 ^ 9406);
                                          }

                                          if (~var37 == -1) {
                                             if (var38 == 0) {
                                                if (var39 != 0) {
                                                   var34[var36].method1451(var39, -2, var37, var38);
                                                   ++var36;
                                                } else {
                                                   ++var36;
                                                }
                                             } else {
                                                var34[var36].method1451(var39, -2, var37, var38);
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1451(var39, -2, var37, var38);
                                             ++var36;
                                          }
                                       }
                                    } else {
                                       ++var36;
                                    }
                                 } while(var36 < var14.field7219.length);
                              }
                           }

                           var43 = new class167(var34, var34.length);
                           if (arg4 != null) {
                              var31 = var13 | 16384;
                           }

                           var12 = arg9.method494(var43, var31, class727.field10610, 64, 850);
                           if (arg4 != null) {
                              var44 = 0;
                              if (var11 || var44 < 5) {
                                 do {
                                    var45 = 0;
                                    if (var11) {
                                       if (arg4.field8389[var44] < class608.field8997[var45][var44].length) {
                                          var12.method1270(class755.field11062[var45][var44], class608.field8997[var45][var44][arg4.field8389[var44]]);
                                       }

                                       ++var45;
                                    }

                                    while(true) {
                                       while(~class608.field8997.length < ~var45) {
                                          if (arg4.field8389[var44] < class608.field8997[var45][var44].length) {
                                             var12.method1270(class755.field11062[var45][var44], class608.field8997[var45][var44][arg4.field8389[var44]]);
                                          }

                                          ++var45;
                                       }

                                       if (!var11) {
                                          ++var44;
                                          break;
                                       }

                                       ++var45;
                                    }
                                 } while(var44 < 5);
                              }
                           }

                           if (class551.field8114 != null) {
                              var12.method1298(var13);
                              class551.field8114.method3190(var12, var29, 8);
                           }
                           break;
                        }

                        ++var35;
                     }
                  }

                  if (arg7 != null && var23 != null) {
                     var46 = var12.method1256((byte)1, var13, true);
                     var46.method1836(arg5 + -1, arg7.field3020, (byte)-102, 0, var22, var24, var20, var23, var21);
                     return var46;
                  }

                  return var12;
               }

               if (arg0 <= 23555) {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field9798[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               } else {
                  var15[var16] = this.field9798[var17];
                  ++var16;
               }
            }
         } else {
            var16 = 0;
            var17 = 0;
            if (!var11) {
               if (arg0 != 23555) {
                  this.method4822(-11, 20, 36, 18, (class570)null, 64, false, (class238)null, -64, (class479)null);
               }

               var18 = false;
               var19 = false;
               var20 = -1;
               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg7 != null) {
                  var25 = arg7.field3026[arg2];
                  var13 = arg3 | 32;
                  var26 = var25 >>> 16;
                  var23 = class532.field7812.method2475((byte)97, var26);
                  var20 = var25 & 65535;
                  if (var23 != null) {
                     var17 |= var23.method4889(126, var20);
                     var16 |= var23.method4890(var20, 3);
                     var19 |= var23.method4891(var20, 122);
                     var18 |= arg7.field3020;
                  }

                  if ((arg7.field3018 || class350.field4799) && ~arg8 != 0 && arg7.field3026.length > arg8) {
                     var22 = arg7.field3023[arg2];
                     var27 = arg7.field3026[arg8];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (~var26 != ~var28) {
                        var24 = class532.field7812.method2475((byte)-104, var21 >>> 16);
                     } else {
                        var24 = var23;
                     }

                     if (var24 != null) {
                        var17 |= var24.method4889(127, var21);
                        var16 |= var24.method4890(var21, 3);
                        var19 |= var24.method4891(var21, 125);
                     }
                  }

                  if (var17 != 0) {
                     var13 |= 128;
                  }

                  if (var16 != 0) {
                     var13 |= 256;
                  }

                  if (var18) {
                     var13 |= 512;
                  }

                  if (var19) {
                     var13 |= 1024;
                  }
               }

               var29 = this.method4819(arg6, var15, arg4 == null ? null : arg4.field8389, arg1, 1849262792);
               if (class551.field8114 != null) {
                  var12 = (class232)class551.field8114.method3192(var29, (byte)-119);
               }

               if (var12 == null || ~arg9.method495(var12.method1285(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg9.method444(var13, var12.method1285());
                  }

                  label495: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11) {
                        var10000 = var15[var33];
                     } else if (var33 >= var15.length) {
                        var10000 = var32;
                        if (!var11) {
                           break label495;
                        }
                     } else {
                        var10000 = var15[var33];
                     }

                     while(true) {
                        if (var10000 != -1 && !class166.field2126.method5576(var15[var33], (byte)-57).method4123(arg6, (byte)-77, (class742)null)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (var33 >= var15.length) {
                           var10000 = var32;
                           if (!var11) {
                              break;
                           }
                        } else {
                           var10000 = var15[var33];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     return null;
                  }

                  var34 = new class167[var15.length];
                  var35 = 0;
                  if (var11) {
                     if (var15[var35] != -1) {
                        var34[var35] = class166.field2126.method5576(var15[var35], (byte)-79).method4132(-32350, (class742)null, arg6);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(~var15.length < ~var35) {
                        if (var15[var35] != -1) {
                           var34[var35] = class166.field2126.method5576(var15[var35], (byte)-79).method4132(-32350, (class742)null, arg6);
                        }

                        ++var35;
                     }

                     if (!var11) {
                        if (var14 != null && var14.field7219 != null) {
                           var36 = 0;
                           if (var11 || var36 < var14.field7219.length) {
                              do {
                                 if (var14.field7219[var36] != null) {
                                    if (var34[var36] == null && !var11) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field7219[var36][0];
                                       var38 = var14.field7219[var36][1];
                                       var39 = var14.field7219[var36][2];
                                       var40 = var14.field7219[var36][3];
                                       var41 = var14.field7219[var36][4];
                                       var42 = var14.field7219[var36][5];
                                       if (var40 != 0 || ~var41 != -1 || ~var42 != -1) {
                                          var34[var36].method1444(var42, var40, var41, arg0 ^ 9406);
                                       }

                                       if (~var37 == -1) {
                                          if (var38 == 0) {
                                             if (var39 != 0) {
                                                var34[var36].method1451(var39, -2, var37, var38);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1451(var39, -2, var37, var38);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method1451(var39, -2, var37, var38);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(var36 < var14.field7219.length);
                           }
                        }

                        var43 = new class167(var34, var34.length);
                        if (arg4 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg9.method494(var43, var31, class727.field10610, 64, 850);
                        if (arg4 != null) {
                           var44 = 0;
                           if (var11 || var44 < 5) {
                              do {
                                 var45 = 0;
                                 if (var11) {
                                    if (arg4.field8389[var44] < class608.field8997[var45][var44].length) {
                                       var12.method1270(class755.field11062[var45][var44], class608.field8997[var45][var44][arg4.field8389[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~class608.field8997.length < ~var45) {
                                       if (arg4.field8389[var44] < class608.field8997[var45][var44].length) {
                                          var12.method1270(class755.field11062[var45][var44], class608.field8997[var45][var44][arg4.field8389[var44]]);
                                       }

                                       ++var45;
                                    }

                                    if (!var11) {
                                       ++var44;
                                       break;
                                    }

                                    ++var45;
                                 }
                              } while(var44 < 5);
                           }
                        }

                        if (class551.field8114 != null) {
                           var12.method1298(var13);
                           class551.field8114.method3190(var12, var29, 8);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg7 != null && var23 != null) {
                  var46 = var12.method1256((byte)1, var13, true);
                  var46.method1836(arg5 + -1, arg7.field3020, (byte)-102, 0, var22, var24, var20, var23, var21);
                  return var46;
               }

               return var12;
            }

            if (arg0 <= 23555) {
               var15[var16] = -1;
               if (var11) {
                  var15[var16] = this.field9798[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = this.field9798[var17];
               ++var16;
            }
         }

         while(true) {
            while(~var14.field7223.length < ~var16) {
               var17 = var14.field7223[var16];
               if (var17 >= 0) {
                  if (this.field9798.length <= var17) {
                     var15[var16] = -1;
                     if (var11) {
                        var15[var16] = this.field9798[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  } else {
                     var15[var16] = this.field9798[var17];
                     ++var16;
                  }
               } else {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field9798[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               }
            }

            var16 = 0;
            var17 = 0;
            if (!var11) {
               if (arg0 != 23555) {
                  this.method4822(-11, 20, 36, 18, (class570)null, 64, false, (class238)null, -64, (class479)null);
               }

               var18 = false;
               var19 = false;
               var20 = -1;
               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg7 != null) {
                  var25 = arg7.field3026[arg2];
                  var13 = arg3 | 32;
                  var26 = var25 >>> 16;
                  var23 = class532.field7812.method2475((byte)97, var26);
                  var20 = var25 & 65535;
                  if (var23 != null) {
                     var17 |= var23.method4889(126, var20);
                     var16 |= var23.method4890(var20, 3);
                     var19 |= var23.method4891(var20, 122);
                     var18 |= arg7.field3020;
                  }

                  if ((arg7.field3018 || class350.field4799) && ~arg8 != 0 && arg7.field3026.length > arg8) {
                     var22 = arg7.field3023[arg2];
                     var27 = arg7.field3026[arg8];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (~var26 != ~var28) {
                        var24 = class532.field7812.method2475((byte)-104, var21 >>> 16);
                     } else {
                        var24 = var23;
                     }

                     if (var24 != null) {
                        var17 |= var24.method4889(127, var21);
                        var16 |= var24.method4890(var21, 3);
                        var19 |= var24.method4891(var21, 125);
                     }
                  }

                  if (var17 != 0) {
                     var13 |= 128;
                  }

                  if (var16 != 0) {
                     var13 |= 256;
                  }

                  if (var18) {
                     var13 |= 512;
                  }

                  if (var19) {
                     var13 |= 1024;
                  }
               }

               var29 = this.method4819(arg6, var15, arg4 == null ? null : arg4.field8389, arg1, 1849262792);
               if (class551.field8114 != null) {
                  var12 = (class232)class551.field8114.method3192(var29, (byte)-119);
               }

               if (var12 == null || ~arg9.method495(var12.method1285(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg9.method444(var13, var12.method1285());
                  }

                  label297: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11) {
                        var10000 = var15[var33];
                     } else if (var33 >= var15.length) {
                        var10000 = var32;
                        if (!var11) {
                           break label297;
                        }
                     } else {
                        var10000 = var15[var33];
                     }

                     while(true) {
                        if (var10000 != -1 && !class166.field2126.method5576(var15[var33], (byte)-57).method4123(arg6, (byte)-77, (class742)null)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (var33 >= var15.length) {
                           var10000 = var32;
                           if (!var11) {
                              break;
                           }
                        } else {
                           var10000 = var15[var33];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     return null;
                  }

                  var34 = new class167[var15.length];
                  var35 = 0;
                  if (var11) {
                     if (var15[var35] != -1) {
                        var34[var35] = class166.field2126.method5576(var15[var35], (byte)-79).method4132(-32350, (class742)null, arg6);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(~var15.length < ~var35) {
                        if (var15[var35] != -1) {
                           var34[var35] = class166.field2126.method5576(var15[var35], (byte)-79).method4132(-32350, (class742)null, arg6);
                        }

                        ++var35;
                     }

                     if (!var11) {
                        if (var14 != null && var14.field7219 != null) {
                           var36 = 0;
                           if (var11 || var36 < var14.field7219.length) {
                              do {
                                 if (var14.field7219[var36] != null) {
                                    if (var34[var36] == null && !var11) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field7219[var36][0];
                                       var38 = var14.field7219[var36][1];
                                       var39 = var14.field7219[var36][2];
                                       var40 = var14.field7219[var36][3];
                                       var41 = var14.field7219[var36][4];
                                       var42 = var14.field7219[var36][5];
                                       if (var40 != 0 || ~var41 != -1 || ~var42 != -1) {
                                          var34[var36].method1444(var42, var40, var41, arg0 ^ 9406);
                                       }

                                       if (~var37 == -1) {
                                          if (var38 == 0) {
                                             if (var39 != 0) {
                                                var34[var36].method1451(var39, -2, var37, var38);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1451(var39, -2, var37, var38);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method1451(var39, -2, var37, var38);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(var36 < var14.field7219.length);
                           }
                        }

                        var43 = new class167(var34, var34.length);
                        if (arg4 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg9.method494(var43, var31, class727.field10610, 64, 850);
                        if (arg4 != null) {
                           var44 = 0;
                           if (var11 || var44 < 5) {
                              do {
                                 var45 = 0;
                                 if (var11) {
                                    if (arg4.field8389[var44] < class608.field8997[var45][var44].length) {
                                       var12.method1270(class755.field11062[var45][var44], class608.field8997[var45][var44][arg4.field8389[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~class608.field8997.length < ~var45) {
                                       if (arg4.field8389[var44] < class608.field8997[var45][var44].length) {
                                          var12.method1270(class755.field11062[var45][var44], class608.field8997[var45][var44][arg4.field8389[var44]]);
                                       }

                                       ++var45;
                                    }

                                    if (!var11) {
                                       ++var44;
                                       break;
                                    }

                                    ++var45;
                                 }
                              } while(var44 < 5);
                           }
                        }

                        if (class551.field8114 != null) {
                           var12.method1298(var13);
                           class551.field8114.method3190(var12, var29, 8);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg7 != null && var23 != null) {
                  var46 = var12.method1256((byte)1, var13, true);
                  var46.method1836(arg5 + -1, arg7.field3020, (byte)-102, 0, var22, var24, var20, var23, var21);
                  return var46;
               }

               return var12;
            }

            if (arg0 <= 23555) {
               var15[var16] = -1;
               if (var11) {
                  var15[var16] = this.field9798[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = this.field9798[var17];
               ++var16;
            }
         }
      } catch (RuntimeException var48) {
         throw class93.method866(var48, field9804[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9804[2] : field9804[3]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field9804[2] : field9804[3]) + ',' + arg8 + ',' + (arg9 != null ? field9804[2] : field9804[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(IBZ)V"
   )
   public static final void method4823(int arg0, byte arg1, boolean arg2) {
      try {
         if (arg1 < -47) {
            label19: {
               if (!arg2) {
                  class256.method2059(class364.field5066, arg0, -1);
                  if (!client.field1481) {
                     break label19;
                  }
               }

               class702 var3 = class19.method142(class387.field5365.field8765, class407.field5614, (byte)-83);
               var3.field10264.method611(arg0, -1344798296);
               class387.field5365.method4423(var3, (byte)102);
            }

            ++field9795;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9804[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4824(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4825(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
