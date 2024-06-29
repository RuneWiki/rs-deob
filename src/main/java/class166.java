import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class166 extends class70 {
   @OriginalMember(
      owner = "client!v",
      name = "Q",
      descriptor = "I"
   )
   private int field2115 = 2048;
   @OriginalMember(
      owner = "client!v",
      name = "K",
      descriptor = "I"
   )
   private int field2122 = 1024;
   @OriginalMember(
      owner = "client!v",
      name = "O",
      descriptor = "I"
   )
   private int field2120 = 0;
   @OriginalMember(
      owner = "client!v",
      name = "X",
      descriptor = "I"
   )
   private int field2124 = 1024;
   @OriginalMember(
      owner = "client!v",
      name = "I",
      descriptor = "I"
   )
   private int field2123 = 1024;
   @OriginalMember(
      owner = "client!v",
      name = "S",
      descriptor = "I"
   )
   private int field2127 = 819;
   @OriginalMember(
      owner = "client!v",
      name = "U",
      descriptor = "I"
   )
   private int field2116 = 409;
   @OriginalMember(
      owner = "client!v",
      name = "N",
      descriptor = "I"
   )
   private int field2129 = 0;
   @OriginalMember(
      owner = "client!v",
      name = "ab",
      descriptor = "I"
   )
   private int field2131 = 1024;
   @OriginalMember(
      owner = "client!v",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2132 = new String[]{method1437(method1436("kW0\u0011")), method1437(method1436("s\f\u0010U")), method1437(method1436("kW?\u0011")), method1437(method1436("fWR\u0017$")), method1437(method1436("kW9\u0011")), method1437(method1436("kW8\u0011")), method1437(method1436("kW3\u0011")), method1437(method1436("kW;\u0011"))};
   @OriginalMember(
      owner = "client!v",
      name = "T",
      descriptor = "Z"
   )
   public static boolean field2125 = false;
   @OriginalMember(
      owner = "client!v",
      name = "P",
      descriptor = "I"
   )
   private int field2117;
   @OriginalMember(
      owner = "client!v",
      name = "L",
      descriptor = "I"
   )
   public static int field2118;
   @OriginalMember(
      owner = "client!v",
      name = "Z",
      descriptor = "I"
   )
   public static int field2119;
   @OriginalMember(
      owner = "client!v",
      name = "R",
      descriptor = "I"
   )
   public static int field2121;
   @OriginalMember(
      owner = "client!v",
      name = "Y",
      descriptor = "I"
   )
   public static int field2128;
   @OriginalMember(
      owner = "client!v",
      name = "W",
      descriptor = "I"
   )
   public static int field2130;
   @OriginalMember(
      owner = "client!v",
      name = "V",
      descriptor = "Lsi;"
   )
   public static class772 field2126;

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != -63) {
            this.method550(-6, (class66)null, -34);
         }

         ++field2119;
         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int[][] var5 = super.field940.method117((byte)-101);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            byte var12 = 1;
            int var13 = 0;
            int var14 = 0;
            int var15 = class262.field3328 * this.field2123 >> 12;
            int var16 = class262.field3328 * this.field2115 >> 12;
            int var17 = class99.field1313 * this.field2116 >> 12;
            int var18 = class99.field1313 * this.field2127 >> 12;
            if (~var18 >= -2) {
               return var5[arg1];
            }

            this.field2117 = class262.field3328 / 8 * this.field2122 >> 12;
            int var19 = class262.field3328 / var15 + 1;
            int[][] var20 = new int[var19][3];
            int[][] var21 = new int[var19][3];
            Random var22 = new Random((long)this.field2129);

            label182:
            do {
               int var10000;
               int var23;
               int var24;
               int var25;
               int var30;
               do {
                  label90: {
                     var23 = var15 + class145.method1178(5733, -var15 + var16, var22);
                     var24 = var17 + class145.method1178(5733, -var17 + var18, var22);
                     var25 = var9 + var23;
                     if (var25 > class262.field3328) {
                        var23 = -var9 + class262.field3328;
                        var10000 = class262.field3328;
                        if (var3) {
                           break label90;
                        }

                        var25 = var10000;
                     }

                     var10000 = var12;
                  }

                  label152: {
                     if (var10000 == 0) {
                        int var26 = var10;
                        int[] var27 = var21[var10];
                        int var28 = 0;
                        int var29 = var6 + var25;
                        if (~var29 > -1) {
                           var29 += class262.field3328;
                        }

                        if (~var29 < ~class262.field3328) {
                           var29 -= class262.field3328;
                        }

                        var30 = var27[2];

                        label148:
                        do {
                           while(true) {
                              int[] var31 = var21[var26];
                              if (var31[0] <= var29 && ~var31[1] <= ~var29) {
                                 break label148;
                              }

                              ++var28;
                              ++var26;

                              while(var26 >= var13) {
                                 var26 = 0;
                                 if (!var3) {
                                    continue label148;
                                 }
                              }
                           }
                        } while(!var3);

                        if (var10 != var26) {
                           int var32 = var6 + var9;
                           if (~var32 > -1) {
                              var32 += class262.field3328;
                           }

                           if (class262.field3328 < var32) {
                              var32 -= class262.field3328;
                           }

                           int var33 = 1;
                           if (var3 || var33 <= var28) {
                              do {
                                 int[] var34 = var21[(var10 + var33) % var13];
                                 var30 = Math.max(var30, var34[2]);
                                 ++var33;
                              } while(var33 <= var28);
                           }

                           int var35 = 0;
                           if (var3 || var28 >= var35) {
                              do {
                                 int[] var36 = var21[(var10 + var35) % var13];
                                 int var37 = var36[2];
                                 if (~var30 == ~var37) {
                                    ++var35;
                                 } else {
                                    int var40;
                                    int var41;
                                    label124: {
                                       int var38 = var36[0];
                                       int var39 = var36[1];
                                       if (~var32 > ~var29) {
                                          var40 = Math.max(var32, var38);
                                          var41 = Math.min(var29, var39);
                                          if (!var3) {
                                             break label124;
                                          }
                                       }

                                       if (var38 != 0) {
                                          var40 = Math.max(var32, var38);
                                          var41 = class262.field3328;
                                          if (var3) {
                                             var40 = 0;
                                             var41 = Math.min(var29, var39);
                                          }
                                       } else {
                                          var40 = 0;
                                          var41 = Math.min(var29, var39);
                                       }
                                    }

                                    this.method1434(var8 + var40, -var40 + var41, arg0 + 146, -var37 + var30, var37, var5, var22);
                                    ++var35;
                                 }
                              } while(var28 >= var35);
                           }
                        }

                        var10 = var26;
                        if (!var3) {
                           break label152;
                        }
                     }

                     var30 = 0;
                  }

                  label157: {
                     if (class99.field1313 >= var24 + var30) {
                        var11 = false;
                        if (!var3) {
                           break label157;
                        }
                     }

                     var24 = -var30 + class99.field1313;
                  }

                  if (class262.field3328 == var25) {
                     break;
                  }

                  int[] var42 = var20[var14++];
                  var42[2] = var24 + var30;
                  var42[1] = var25;
                  var42[0] = var9;
                  this.method1434(var7 + var9, var23, 112, var24, var30, var5, var22);
                  var9 = var25;
               } while(!var3);

               this.method1434(var7 + var9, var23, 88, var24, var30, var5, var22);
               if (var11) {
                  break;
               }

               var11 = true;
               int[] var43 = var20[var14++];
               var43[2] = var24 + var30;
               var43[1] = var25;
               var43[0] = var9;
               int[][] var44 = var21;
               var21 = var20;
               var13 = var14;
               var20 = var44;
               var14 = 0;
               var8 = var7;
               var7 = class145.method1178(5733, class262.field3328, var22);
               var9 = 0;
               var6 = -var8 + var7;
               int var45 = var6;
               if (var6 < 0) {
                  var45 = class262.field3328 + var6;
               }

               var10 = 0;
               if (~var45 < ~class262.field3328) {
                  var45 -= class262.field3328;
               }

               var12 = 0;

               label179:
               do {
                  while(true) {
                     int[] var46 = var21[var10];
                     if (var45 >= var46[0] && var45 <= var46[1]) {
                        continue label182;
                     }

                     var10000 = var13;
                     ++var10;

                     while(var10000 <= var10) {
                        var10000 = 0;
                        if (!var3) {
                           var10 = 0;
                           continue label179;
                        }
                     }
                  }
               } while(!var3);
            } while(!var3);
         }

         return var4;
      } catch (RuntimeException var48) {
         throw class93.method866(var48, field2132[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1433(int arg0, int arg1) {
      try {
         class16.field282 = -1;
         if (arg1 == 0) {
            ++field2128;
            class768.field11204 = 3;
            class204.field2600 = arg0;
            class495.field6905 = 100;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2132[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         ++field2130;
         if (arg0 >= -36) {
            this.method331((byte)38, 57);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2132[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label100: {
            label99: {
               label98: {
                  label97: {
                     label96: {
                        label95: {
                           label94: {
                              label93: {
                                 label92: {
                                    if (~arg2 != -1) {
                                       if (arg2 == 1) {
                                          break label92;
                                       }

                                       if (~arg2 == -3) {
                                          break label93;
                                       }

                                       if (~arg2 == -4) {
                                          break label94;
                                       }

                                       if (~arg2 == -5) {
                                          break label95;
                                       }

                                       if (~arg2 == -6) {
                                          break label96;
                                       }

                                       if (~arg2 == -7) {
                                          break label97;
                                       }

                                       if (~arg2 == -8) {
                                          break label98;
                                       }

                                       if (arg2 != 8) {
                                          break label100;
                                       }

                                       if (!var4) {
                                          break label99;
                                       }
                                    }

                                    this.field2129 = arg1.method640(255);
                                    if (!var4) {
                                       break label100;
                                    }
                                 }

                                 this.field2123 = arg1.method603(-2);
                                 if (!var4) {
                                    break label100;
                                 }
                              }

                              this.field2115 = arg1.method603(-2);
                              if (!var4) {
                                 break label100;
                              }
                           }

                           this.field2116 = arg1.method603(-2);
                           if (!var4) {
                              break label100;
                           }
                        }

                        this.field2127 = arg1.method603(-2);
                        if (!var4) {
                           break label100;
                        }
                     }

                     this.field2122 = arg1.method603(-2);
                     if (!var4) {
                        break label100;
                     }
                  }

                  this.field2120 = arg1.method640(255);
                  if (!var4) {
                     break label100;
                  }
               }

               this.field2124 = arg1.method603(-2);
               if (!var4) {
                  break label100;
               }
            }

            this.field2131 = arg1.method603(-2);
         }

         ++field2121;
         if (arg0 >= -34) {
            this.field2129 = 48;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2132[2] + arg0 + ',' + (arg1 != null ? field2132[3] : field2132[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(IIIII[[ILjava/util/Random;)V"
   )
   private final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, Random arg6) {
      boolean var8 = client.field1481;

      try {
         ++field2118;
         if (arg2 >= 80) {
            int var9 = this.field2131 > 0 ? -class145.method1178(5733, this.field2131, arg6) + 4096 : 4096;
            int var10 = this.field2124 * this.field2117 >> 12;
            int var11 = this.field2117 + -(~var10 < -1 ? class145.method1178(5733, var10, arg6) : 0);
            if (~arg0 <= ~class262.field3328) {
               arg0 -= class262.field3328;
            }

            if (var11 <= 0) {
               if (arg0 + arg1 > class262.field3328) {
                  int var12 = class262.field3328 - arg0;
                  int var13 = 0;
                  if (var8 || ~arg3 < ~var13) {
                     do {
                        int[] var14 = arg5[arg4 - -var13];
                        class349.method2764(var14, arg0, var12, var9);
                        class349.method2764(var14, 0, -var12 + arg1, var9);
                        ++var13;
                     } while(~arg3 < ~var13);

                  }
               } else {
                  int var15 = 0;
                  if (var8) {
                     class349.method2764(arg5[arg4 + var15], arg0, arg1, var9);
                     ++var15;
                  }

                  while(true) {
                     while(var15 < arg3) {
                        class349.method2764(arg5[arg4 + var15], arg0, arg1, var9);
                        ++var15;
                     }

                     if (!var8) {
                        return;
                     }

                     ++var15;
                  }
               }
            } else if (~arg3 < -1 && arg1 > 0) {
               int var16 = arg1 / 2;
               int var17 = arg3 / 2;
               int var18 = ~var16 > ~var11 ? var16 : var11;
               int var19 = var11 <= var17 ? var11 : var17;
               int var20 = arg0 + var18;
               int var21 = arg1 - var18 * 2;
               int var22 = 0;
               if (var8 || arg3 > var22) {
                  do {
                     label291: {
                        int[] var23 = arg5[arg4 + var22];
                        int var10000;
                        int var10001;
                        if (var22 < var19) {
                           int var24;
                           label268: {
                              int var25;
                              label267: {
                                 var24 = var9 * var22 / var19;
                                 if (~this.field2120 != -1) {
                                    var25 = 0;
                                    if (var8 || var18 > var25) {
                                       do {
                                          int var26 = var9 * var25 / var18;
                                          var23[class109.method974(arg0 - -var25, class174.field2249)] = var23[class109.method974(-var25 + arg0 + arg1 - 1, class174.field2249)] = var26 >= var24 ? var24 : var26;
                                          ++var25;
                                       } while(var18 > var25);
                                    }

                                    if (!var8) {
                                       var10000 = var20 - -var21;
                                       var10001 = class262.field3328;
                                       if (!var8) {
                                          break label268;
                                       }
                                       break label267;
                                    }
                                 }

                                 var25 = 0;
                                 if (var8) {
                                    var10000 = var9 * var25;
                                    var10001 = var18;
                                 } else if (~var25 <= ~var18) {
                                    var10000 = var20 - -var21;
                                    var10001 = class262.field3328;
                                    if (!var8) {
                                       break label268;
                                    }
                                 } else {
                                    var10000 = var9 * var25;
                                    var10001 = var18;
                                 }
                              }

                              while(true) {
                                 int var27 = var10000 / var10001;
                                 var23[class109.method974(class174.field2249, arg0 + var25)] = var23[class109.method974(class174.field2249, arg0 + -1 - (-arg1 - -var25))] = var24 * var27 >> 12;
                                 ++var25;
                                 if (~var25 <= ~var18) {
                                    var10000 = var20 - -var21;
                                    var10001 = class262.field3328;
                                    if (!var8) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var9 * var25;
                                    var10001 = var18;
                                 }
                              }
                           }

                           if (var10000 <= var10001) {
                              class349.method2764(var23, var20, var21, var24);
                              if (!var8) {
                                 break label291;
                              }
                           }

                           int var28 = -var20 + class262.field3328;
                           class349.method2764(var23, var20, var28, var24);
                           class349.method2764(var23, 0, -var28 + var21, var24);
                           if (!var8) {
                              break label291;
                           }
                        }

                        int var29 = arg3 + -1 + -var22;
                        if (~var29 > ~var19) {
                           int var30;
                           label218: {
                              int var31;
                              label217: {
                                 var30 = var9 * var29 / var19;
                                 if (this.field2120 == 0) {
                                    var31 = 0;
                                    if (var8 || var31 < var18) {
                                       do {
                                          int var32 = var9 * var31 / var18;
                                          var23[class109.method974(class174.field2249, arg0 - -var31)] = var23[class109.method974(arg0 + arg1 + -var31 + -1, class174.field2249)] = var30 * var32 >> 12;
                                          ++var31;
                                       } while(var31 < var18);
                                    }

                                    if (!var8) {
                                       var10000 = class262.field3328;
                                       var10001 = var20 - -var21;
                                       if (!var8) {
                                          break label218;
                                       }
                                       break label217;
                                    }
                                 }

                                 var31 = 0;
                                 if (var8) {
                                    var10000 = var9 * var31;
                                    var10001 = var18;
                                 } else if (~var18 >= ~var31) {
                                    var10000 = class262.field3328;
                                    var10001 = var20 - -var21;
                                    if (!var8) {
                                       break label218;
                                    }
                                 } else {
                                    var10000 = var9 * var31;
                                    var10001 = var18;
                                 }
                              }

                              while(true) {
                                 int var33 = var10000 / var10001;
                                 var23[class109.method974(class174.field2249, arg0 - -var31)] = var23[class109.method974(class174.field2249, -var31 + arg1 + -1 + arg0)] = var30 <= var33 ? var30 : var33;
                                 ++var31;
                                 if (~var18 >= ~var31) {
                                    var10000 = class262.field3328;
                                    var10001 = var20 - -var21;
                                    if (!var8) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var9 * var31;
                                    var10001 = var18;
                                 }
                              }
                           }

                           if (var10000 >= var10001) {
                              class349.method2764(var23, var20, var21, var30);
                              if (!var8) {
                                 break label291;
                              }
                           }

                           int var34 = -var20 + class262.field3328;
                           class349.method2764(var23, var20, var34, var30);
                           class349.method2764(var23, 0, -var34 + var21, var30);
                           if (!var8) {
                              break label291;
                           }
                        }

                        int var35 = 0;
                        if (var8) {
                           var23[class109.method974(arg0 + var35, class174.field2249)] = var23[class109.method974(class174.field2249, arg0 - -arg1 + -var35 + -1)] = var9 * var35 / var18;
                           ++var35;
                        }

                        while(true) {
                           while(var35 < var18) {
                              var23[class109.method974(arg0 + var35, class174.field2249)] = var23[class109.method974(class174.field2249, arg0 - -arg1 + -var35 + -1)] = var9 * var35 / var18;
                              ++var35;
                           }

                           if (!var8) {
                              if (~class262.field3328 > ~(var20 + var21)) {
                                 int var36 = -var20 + class262.field3328;
                                 class349.method2764(var23, var20, var36, var9);
                                 class349.method2764(var23, 0, var21 - var36, var9);
                                 if (!var8) {
                                    break;
                                 }
                              }

                              class349.method2764(var23, var20, var21, var9);
                              break;
                           }

                           ++var35;
                        }
                     }

                     ++var22;
                  } while(arg3 > var22);

               }
            }
         }
      } catch (RuntimeException var38) {
         throw class93.method866(var38, field2132[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2132[3] : field2132[1]) + ',' + (arg6 != null ? field2132[3] : field2132[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1435(byte arg0) {
      try {
         field2126 = null;
         if (arg0 != -92) {
            method1435((byte)89);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2132[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "<init>",
      descriptor = "()V"
   )
   public class166() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1436(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1437(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
