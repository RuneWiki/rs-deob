import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class543 extends class264 {
   @OriginalMember(
      owner = "client!gq",
      name = "I",
      descriptor = "I"
   )
   private int field7790 = 819;
   @OriginalMember(
      owner = "client!gq",
      name = "O",
      descriptor = "I"
   )
   private int field7797 = 409;
   @OriginalMember(
      owner = "client!gq",
      name = "H",
      descriptor = "I"
   )
   private int field7803 = 0;
   @OriginalMember(
      owner = "client!gq",
      name = "V",
      descriptor = "I"
   )
   private int field7791 = 0;
   @OriginalMember(
      owner = "client!gq",
      name = "T",
      descriptor = "I"
   )
   private int field7795 = 2048;
   @OriginalMember(
      owner = "client!gq",
      name = "G",
      descriptor = "I"
   )
   private int field7800 = 1024;
   @OriginalMember(
      owner = "client!gq",
      name = "N",
      descriptor = "I"
   )
   private int field7804 = 1024;
   @OriginalMember(
      owner = "client!gq",
      name = "W",
      descriptor = "I"
   )
   private int field7806 = 1024;
   @OriginalMember(
      owner = "client!gq",
      name = "K",
      descriptor = "I"
   )
   private int field7798 = 1024;
   @OriginalMember(
      owner = "client!gq",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7807 = new String[]{method3908(method3907(".#M\u0010M")), method3908(method3907(";x\u000fR")), method3908(method3907("2|Mz\u0018")), method3908(method3907("2|M}\u0018")), method3908(method3907("2|M|\u0018")), method3908(method3907("2|M{\u0018")), method3908(method3907("2|Mu\u0018")), method3908(method3907("2|M\u007f\u0018"))};
   @OriginalMember(
      owner = "client!gq",
      name = "F",
      descriptor = "Lwv;"
   )
   public static class37 field7802 = new class37(16);
   @OriginalMember(
      owner = "client!gq",
      name = "P",
      descriptor = "I"
   )
   public static int field7792;
   @OriginalMember(
      owner = "client!gq",
      name = "J",
      descriptor = "I"
   )
   public static int field7793;
   @OriginalMember(
      owner = "client!gq",
      name = "M",
      descriptor = "I"
   )
   private int field7794;
   @OriginalMember(
      owner = "client!gq",
      name = "S",
      descriptor = "I"
   )
   public static int field7796;
   @OriginalMember(
      owner = "client!gq",
      name = "U",
      descriptor = "I"
   )
   public static int field7799;
   @OriginalMember(
      owner = "client!gq",
      name = "X",
      descriptor = "I"
   )
   public static int field7805;
   @OriginalMember(
      owner = "client!gq",
      name = "R",
      descriptor = "Lrf;"
   )
   public static class92 field7801;

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public final void method413(int arg0) {
      try {
         ++field7799;
         if (arg0 < 49) {
            this.method413(-70);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7807[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(II)[I",
      line = 21
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field7792;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         int var5 = -24 / ((24 - arg1) / 44);
         if (super.field3641.field5922) {
            int[][] var6 = super.field3641.method3078(false);
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            boolean var12 = true;
            byte var13 = 1;
            int var14 = 0;
            int var15 = 0;
            int var16 = class430.field6152 * this.field7800 >> 12;
            int var17 = class430.field6152 * this.field7795 >> 12;
            int var18 = class20.field234 * this.field7797 >> 12;
            int var19 = class20.field234 * this.field7790 >> 12;
            if (~var19 >= -2) {
               return var6[arg0];
            }

            this.field7794 = class430.field6152 / 8 * this.field7804 >> 12;
            int var20 = class430.field6152 / var16 + 1;
            int[][] var21 = new int[var20][3];
            int[][] var22 = new int[var20][3];
            Random var23 = new Random((long)this.field7791);

            do {
               int var24;
               int var25;
               int var26;
               int var31;
               do {
                  int var10000;
                  label89: {
                     var24 = var16 + class258.method1968((byte)-118, var23, -var16 + var17);
                     var25 = var18 - -class258.method1968((byte)-105, var23, var19 - var18);
                     var26 = var10 + var24;
                     if (~class430.field6152 > ~var26) {
                        var26 = class430.field6152;
                        var10000 = -var10 + class430.field6152;
                        if (var3) {
                           break label89;
                        }

                        var24 = var10000;
                     }

                     var10000 = var13;
                  }

                  label147: {
                     if (var10000 == 0) {
                        int var27 = var11;
                        int[] var28 = var22[var11];
                        int var29 = 0;
                        int var30 = var7 + var26;
                        if (var30 < 0) {
                           var30 += class430.field6152;
                        }

                        if (class430.field6152 < var30) {
                           var30 -= class430.field6152;
                        }

                        var31 = var28[2];

                        do {
                           int var10001;
                           label141: {
                              int[] var32 = var22[var27];
                              if (var32[0] <= var30) {
                                 var10000 = ~var30;
                                 var10001 = ~var32[1];
                                 if (var3) {
                                    break label141;
                                 }

                                 if (var10000 >= var10001) {
                                    break;
                                 }
                              }

                              ++var27;
                              var10000 = var27;
                              var10001 = var14;
                           }

                           if (var10000 >= var10001) {
                              var27 = 0;
                           }

                           ++var29;
                        } while(!var3);

                        if (var11 != var27) {
                           int var33 = var7 + var10;
                           if (var33 < 0) {
                              var33 += class430.field6152;
                           }

                           if (class430.field6152 < var33) {
                              var33 -= class430.field6152;
                           }

                           int var34 = 1;
                           if (var3 || ~var34 >= ~var29) {
                              do {
                                 int[] var35 = var22[(var11 + var34) % var14];
                                 var31 = Math.max(var31, var35[2]);
                                 ++var34;
                              } while(~var34 >= ~var29);
                           }

                           int var36 = 0;
                           if (var3 || var29 >= var36) {
                              do {
                                 int[] var37 = var22[(var11 - -var36) % var14];
                                 int var38 = var37[2];
                                 if (var31 == var38) {
                                    ++var36;
                                 } else {
                                    int var41;
                                    int var42;
                                    label122: {
                                       int var39 = var37[0];
                                       int var40 = var37[1];
                                       if (var33 >= var30) {
                                          if (var39 != 0) {
                                             var41 = Math.max(var33, var39);
                                             var42 = class430.field6152;
                                             if (!var3) {
                                                break label122;
                                             }
                                          }

                                          var42 = Math.min(var30, var40);
                                          var41 = 0;
                                          if (!var3) {
                                             break label122;
                                          }
                                       }

                                       var41 = Math.max(var33, var39);
                                       var42 = Math.min(var30, var40);
                                    }

                                    this.method3905(-var41 + var42, var9 + var41, var23, -88, var31 - var38, var38, var6);
                                    ++var36;
                                 }
                              } while(var29 >= var36);
                           }
                        }

                        var11 = var27;
                        if (!var3) {
                           break label147;
                        }
                     }

                     var31 = 0;
                  }

                  label152: {
                     if (~(var31 - -var25) < ~class20.field234) {
                        var25 = -var31 + class20.field234;
                        if (!var3) {
                           break label152;
                        }
                     }

                     var12 = false;
                  }

                  if (class430.field6152 != var26) {
                     break;
                  }

                  this.method3905(var24, var10 - -var8, var23, -83, var25, var31, var6);
                  if (var12) {
                     return var4;
                  }

                  var12 = true;
                  int[] var43 = var21[var15++];
                  var43[1] = var26;
                  var43[0] = var10;
                  var43[2] = var25 + var31;
                  int[][] var44 = var22;
                  var22 = var21;
                  var21 = var44;
                  var14 = var15;
                  var9 = var8;
                  var15 = 0;
                  var8 = class258.method1968((byte)-117, var23, class430.field6152);
                  var7 = -var9 + var8;
                  var10 = 0;
                  int var45 = var7;
                  if (var7 < 0) {
                     var45 = class430.field6152 + var7;
                  }

                  var11 = 0;
                  if (class430.field6152 < var45) {
                     var45 -= class430.field6152;
                  }

                  label169:
                  while(true) {
                     int[] var46 = var22[var11];
                     if (~var46[0] >= ~var45 && var45 <= var46[1]) {
                        break;
                     }

                     var10000 = ~var14;
                     ++var11;

                     while(var10000 >= ~var11) {
                        var10000 = 0;
                        if (!var3) {
                           var11 = 0;
                           if (var3) {
                              break label169;
                           }
                           break;
                        }
                     }
                  }

                  var13 = 0;
               } while(!var3);

               int[] var47 = var21[var15++];
               var47[1] = var26;
               var47[0] = var10;
               var47[2] = var25 + var31;
               this.method3905(var24, var8 + var10, var23, -93, var25, var31, var6);
               var10 = var26;
            } while(!var3);
         }

         return var4;
      } catch (RuntimeException var49) {
         throw class237.method1823(var49, field7807[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 276
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg2 >= 49) {
            label99: {
               label98: {
                  label97: {
                     label96: {
                        label95: {
                           label94: {
                              label93: {
                                 label92: {
                                    label91: {
                                       if (~arg0 != -1) {
                                          if (~arg0 == -2) {
                                             break label91;
                                          }

                                          if (arg0 == 2) {
                                             break label92;
                                          }

                                          if (~arg0 == -4) {
                                             break label93;
                                          }

                                          if (arg0 == 4) {
                                             break label94;
                                          }

                                          if (arg0 == 5) {
                                             break label95;
                                          }

                                          if (~arg0 == -7) {
                                             break label96;
                                          }

                                          if (~arg0 == -8) {
                                             break label97;
                                          }

                                          if (arg0 != 8) {
                                             break label99;
                                          }

                                          if (!var4) {
                                             break label98;
                                          }
                                       }

                                       this.field7791 = arg1.method1143(-15465);
                                       if (!var4) {
                                          break label99;
                                       }
                                    }

                                    this.field7800 = arg1.method1211(-26166);
                                    if (!var4) {
                                       break label99;
                                    }
                                 }

                                 this.field7795 = arg1.method1211(-26166);
                                 if (!var4) {
                                    break label99;
                                 }
                              }

                              this.field7797 = arg1.method1211(-26166);
                              if (!var4) {
                                 break label99;
                              }
                           }

                           this.field7790 = arg1.method1211(-26166);
                           if (!var4) {
                              break label99;
                           }
                        }

                        this.field7804 = arg1.method1211(-26166);
                        if (!var4) {
                           break label99;
                        }
                     }

                     this.field7803 = arg1.method1143(-15465);
                     if (!var4) {
                        break label99;
                     }
                  }

                  this.field7806 = arg1.method1211(-26166);
                  if (!var4) {
                     break label99;
                  }
               }

               this.field7798 = arg1.method1211(-26166);
            }

            ++field7805;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7807[7] + arg0 + ',' + (arg1 != null ? field7807[0] : field7807[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "c",
      descriptor = "(Z)V",
      line = 374
   )
   public static void method3904(boolean arg0) {
      try {
         if (!arg0) {
            field7801 = null;
         }

         field7802 = null;
         field7801 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7807[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "<init>",
      descriptor = "()V",
      line = 402
   )
   public class543() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(IILjava/util/Random;III[[I)V",
      line = 417
   )
   private final void method3905(int arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int[][] arg6) {
      boolean var8 = client.field4360;

      try {
         ++field7793;
         int var9 = this.field7798 > 0 ? 4096 - class258.method1968((byte)-28, arg2, this.field7798) : 4096;
         int var10 = this.field7806 * this.field7794 >> 12;
         int var11 = this.field7794 + -(var10 <= 0 ? 0 : class258.method1968((byte)-39, arg2, var10));
         if (class430.field6152 <= arg1) {
            arg1 -= class430.field6152;
         }

         if (arg3 > -77) {
            this.method413(77);
         }

         if (var11 <= 0) {
            if (~(arg1 - -arg0) < ~class430.field6152) {
               int var12 = -arg1 + class430.field6152;
               int var13 = 0;
               if (var8 || ~arg4 < ~var13) {
                  do {
                     int[] var14 = arg6[arg5 + var13];
                     class242.method1854(var14, arg1, var12, var9);
                     class242.method1854(var14, 0, -var12 + arg0, var9);
                     ++var13;
                  } while(~arg4 < ~var13);

               }
            } else {
               int var15 = 0;
               if (var8) {
                  class242.method1854(arg6[arg5 + var15], arg1, arg0, var9);
                  ++var15;
               }

               while(true) {
                  while(~var15 > ~arg4) {
                     class242.method1854(arg6[arg5 + var15], arg1, arg0, var9);
                     ++var15;
                  }

                  if (!var8) {
                     return;
                  }

                  ++var15;
               }
            }
         } else if (arg4 > 0 && ~arg0 < -1) {
            int var16 = arg0 / 2;
            int var17 = arg4 / 2;
            int var18 = var11 <= var16 ? var11 : var16;
            int var19 = var17 < var11 ? var17 : var11;
            int var20 = arg1 - -var18;
            int var21 = arg0 - var18 * 2;
            int var22 = 0;
            if (var8 || arg4 > var22) {
               do {
                  label291: {
                     int[] var23 = arg6[arg5 + var22];
                     int var10000;
                     int var10001;
                     if (~var19 < ~var22) {
                        int var24;
                        label267: {
                           int var25;
                           label266: {
                              var24 = var9 * var22 / var19;
                              if (~this.field7803 != -1) {
                                 var25 = 0;
                                 if (var8 || ~var25 > ~var18) {
                                    do {
                                       int var26 = var9 * var25 / var18;
                                       var23[class556.method3988(class78.field967, arg1 + var25)] = var23[class556.method3988(class78.field967, -var25 + arg0 + -1 + arg1)] = var24 <= var26 ? var24 : var26;
                                       ++var25;
                                    } while(~var25 > ~var18);
                                 }

                                 if (!var8) {
                                    var10000 = var20 + var21;
                                    var10001 = class430.field6152;
                                    if (!var8) {
                                       break label267;
                                    }
                                    break label266;
                                 }
                              }

                              var25 = 0;
                              if (var8) {
                                 var10000 = var9 * var25;
                                 var10001 = var18;
                              } else if (var25 >= var18) {
                                 var10000 = var20 + var21;
                                 var10001 = class430.field6152;
                                 if (!var8) {
                                    break label267;
                                 }
                              } else {
                                 var10000 = var9 * var25;
                                 var10001 = var18;
                              }
                           }

                           while(true) {
                              int var27 = var10000 / var10001;
                              var23[class556.method3988(class78.field967, arg1 + var25)] = var23[class556.method3988(arg0 - var25 + arg1 + -1, class78.field967)] = var24 * var27 >> 12;
                              ++var25;
                              if (var25 >= var18) {
                                 var10000 = var20 + var21;
                                 var10001 = class430.field6152;
                                 if (!var8) {
                                    break;
                                 }
                              } else {
                                 var10000 = var9 * var25;
                                 var10001 = var18;
                              }
                           }
                        }

                        if (var10000 > var10001) {
                           int var28 = -var20 + class430.field6152;
                           class242.method1854(var23, var20, var28, var24);
                           class242.method1854(var23, 0, -var28 + var21, var24);
                           if (!var8) {
                              break label291;
                           }
                        }

                        class242.method1854(var23, var20, var21, var24);
                        if (!var8) {
                           break label291;
                        }
                     }

                     int var29 = arg4 - 1 + -var22;
                     if (var29 < var19) {
                        int var30;
                        label215: {
                           int var31;
                           label214: {
                              var30 = var9 * var29 / var19;
                              if (~this.field7803 == -1) {
                                 var31 = 0;
                                 if (var8 || ~var31 > ~var18) {
                                    do {
                                       int var32 = var9 * var31 / var18;
                                       var23[class556.method3988(arg1 + var31, class78.field967)] = var23[class556.method3988(class78.field967, -var31 + arg1 - (-arg0 + 1))] = var30 * var32 >> 12;
                                       ++var31;
                                    } while(~var31 > ~var18);
                                 }

                                 if (!var8) {
                                    var10000 = ~class430.field6152;
                                    var10001 = ~(var20 + var21);
                                    if (!var8) {
                                       break label215;
                                    }
                                    break label214;
                                 }
                              }

                              var31 = 0;
                              if (var8) {
                                 var10000 = var9 * var31;
                                 var10001 = var18;
                              } else if (var31 >= var18) {
                                 var10000 = ~class430.field6152;
                                 var10001 = ~(var20 + var21);
                                 if (!var8) {
                                    break label215;
                                 }
                              } else {
                                 var10000 = var9 * var31;
                                 var10001 = var18;
                              }
                           }

                           while(true) {
                              int var33 = var10000 / var10001;
                              var23[class556.method3988(class78.field967, arg1 + var31)] = var23[class556.method3988(class78.field967, arg1 + -1 - (-arg0 - -var31))] = var33 >= var30 ? var30 : var33;
                              ++var31;
                              if (var31 >= var18) {
                                 var10000 = ~class430.field6152;
                                 var10001 = ~(var20 + var21);
                                 if (!var8) {
                                    break;
                                 }
                              } else {
                                 var10000 = var9 * var31;
                                 var10001 = var18;
                              }
                           }
                        }

                        if (var10000 <= var10001) {
                           class242.method1854(var23, var20, var21, var30);
                           if (!var8) {
                              break label291;
                           }
                        }

                        int var34 = class430.field6152 - var20;
                        class242.method1854(var23, var20, var34, var30);
                        class242.method1854(var23, 0, var21 - var34, var30);
                        if (!var8) {
                           break label291;
                        }
                     }

                     int var35 = 0;
                     if (var8) {
                        var23[class556.method3988(class78.field967, arg1 - -var35)] = var23[class556.method3988(arg1 + -1 - (-arg0 + var35), class78.field967)] = var9 * var35 / var18;
                        ++var35;
                     }

                     while(true) {
                        while(~var18 < ~var35) {
                           var23[class556.method3988(class78.field967, arg1 - -var35)] = var23[class556.method3988(arg1 + -1 - (-arg0 + var35), class78.field967)] = var9 * var35 / var18;
                           ++var35;
                        }

                        if (!var8) {
                           if (class430.field6152 < var20 + var21) {
                              int var36 = -var20 + class430.field6152;
                              class242.method1854(var23, var20, var36, var9);
                              class242.method1854(var23, 0, var21 - var36, var9);
                              if (!var8) {
                                 break;
                              }
                           }

                           class242.method1854(var23, var20, var21, var9);
                           break;
                        }

                        ++var35;
                     }
                  }

                  ++var22;
               } while(arg4 > var22);

            }
         }
      } catch (RuntimeException var38) {
         throw class237.method1823(var38, field7807[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7807[0] : field7807[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7807[0] : field7807[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(IIILiha;IIIIIILha;I)V",
      line = 615
   )
   public static final void method3906(int arg0, int arg1, int arg2, class32 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class66 arg10, int arg11) {
      try {
         if (~arg0 > ~arg7 && arg0 + arg4 > arg7 && ~(arg8 + -13) > ~arg1 && ~(arg8 + 3) < ~arg1 && arg3.field469) {
            arg6 = arg9;
         }

         ++field7796;
         int[] var12 = null;
         if (!class743.method5383(0, arg3.field458)) {
            if (~arg3.field463 != 0) {
               var12 = class468.field6728.method2261(-1, arg3.field463).field4867;
            } else if (class606.method4408(arg3.field458, 256)) {
               class529 var13 = (class529)class328.field4479.method329((byte)-108, (long)((int)arg3.field456));
               if (var13 != null) {
                  class506 var14 = var13.field7559;
                  class745 var15 = var14.field7333;
                  if (var15.field10912 != null) {
                     var15 = var15.method5405(class21.field248, 4);
                  }

                  if (var15 != null) {
                     var12 = var15.field10921;
                  }
               }
            } else if (class288.method2178(arg3.field458, -1010)) {
               Object var16 = null;
               class259 var17;
               if (~arg3.field458 != -1011) {
                  var17 = class387.field5618.method3977((int)(arg3.field456 >>> 32 & 2147483647L), (byte)75);
               } else {
                  var17 = class387.field5618.method3977((int)arg3.field456, (byte)75);
               }

               if (var17.field3539 != null) {
                  var17 = var17.method1984(class21.field248, 21723);
               }

               if (var17 != null) {
                  var12 = var17.field3566;
               }
            }
         } else {
            var12 = class468.field6728.method2261(-1, (int)arg3.field456).field4867;
         }

         String var18 = class149.method1239(arg3, true);
         int var19 = 61 / ((arg2 - -73) / 33);
         if (var12 != null) {
            var18 = var18 + class189.method1498(var12, true);
         }

         class455.field6465.method619(arg0 + 3, arg8, var18, 0, 0, class622.field9159, arg6, class352.field4735);
         if (arg3.field461) {
            class438.field6258.method3575(class467.field6723.method1635(var18, (byte)-81) + arg0 + 5, arg8 + -12);
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field7807[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7807[0] : field7807[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field7807[0] : field7807[1]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3907(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3908(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
