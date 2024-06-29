import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class601 extends class546 {
   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "[I"
   )
   private int[] field8381;
   @OriginalMember(
      owner = "client!im",
      name = "B",
      descriptor = "[I"
   )
   private int[] field8389;
   @OriginalMember(
      owner = "client!im",
      name = "E",
      descriptor = "Lfq;"
   )
   private class213 field8388;
   @OriginalMember(
      owner = "client!im",
      name = "v",
      descriptor = "Lfq;"
   )
   private class213 field8383;
   @OriginalMember(
      owner = "client!im",
      name = "D",
      descriptor = "Lfq;"
   )
   private class213 field8390;
   @OriginalMember(
      owner = "client!im",
      name = "t",
      descriptor = "[Lfq;"
   )
   private class213[] field8382;
   @OriginalMember(
      owner = "client!im",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8393 = new String[]{method4391(method4390("M1\u0001+")), method4391(method4390("XjCi^")), method4391(method4390("J)C\u0004\u000b")), method4391(method4390("J)C{JM-\u0019y\u000b")), method4391(method4390("J)C\u0003\u000b")), method4391(method4390("J)C\u0001\u000b")), method4391(method4390("J)C\u0006\u000b")), method4391(method4390("J)C\u0002\u000b")), method4391(method4390("J)C\u0005\u000b"))};
   @OriginalMember(
      owner = "client!im",
      name = "C",
      descriptor = "I"
   )
   public static int field8384;
   @OriginalMember(
      owner = "client!im",
      name = "y",
      descriptor = "I"
   )
   public static int field8386;
   @OriginalMember(
      owner = "client!im",
      name = "x",
      descriptor = "I"
   )
   public static int field8387;
   @OriginalMember(
      owner = "client!im",
      name = "u",
      descriptor = "I"
   )
   public static int field8391;
   @OriginalMember(
      owner = "client!im",
      name = "w",
      descriptor = "I"
   )
   public static int field8392;
   @OriginalMember(
      owner = "client!im",
      name = "F",
      descriptor = "Ljk;"
   )
   public static class663 field8385;

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IIIIIIZII)V"
   )
   public static final void method4384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
      try {
         if (arg6) {
            class169.method1326(arg3, arg5, arg7, (byte)-127, arg0, arg8, 0, arg2, arg1, arg4);
            ++field8386;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field8393[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Lqh;Ld;B)Z"
   )
   public final boolean method4385(class74 arg0, class160 arg1, byte arg2) {
      boolean var4 = client.field4273;

      try {
         ++field8387;
         int var5;
         int var6;
         if (~class483.field6662 > -1) {
            var5 = 0;
            if (var4) {
               if (!arg0.method717(this.field8381[var5], (byte)-58)) {
                  return false;
               }

               ++var5;
            }

            while(true) {
               while(~var5 > ~this.field8381.length) {
                  if (!arg0.method717(this.field8381[var5], (byte)-58)) {
                     return false;
                  }

                  ++var5;
               }

               if (!var4) {
                  if (var4) {
                     var5 = 0;
                     if (var4) {
                        if (!arg0.method724(-25048, class483.field6662, this.field8381[var5])) {
                           return false;
                        }

                        ++var5;
                     }
                  } else {
                     if (!var4) {
                        if (arg2 != 65) {
                           return true;
                        }

                        var6 = 0;
                        if (var4) {
                           if (!arg1.method1289((byte)-108, this.field8389[var6])) {
                              return false;
                           }

                           ++var6;
                        }

                        while(true) {
                           while(~var6 > ~this.field8389.length) {
                              if (!arg1.method1289((byte)-108, this.field8389[var6])) {
                                 return false;
                              }

                              ++var6;
                           }

                           if (!var4) {
                              return true;
                           }

                           if (false) {
                              return false;
                           }

                           ++var6;
                        }
                     }

                     if (arg2 == 0) {
                        return false;
                     }

                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var4) {
               if (!arg0.method724(-25048, class483.field6662, this.field8381[var5])) {
                  return false;
               }

               ++var5;
            }
         }

         while(true) {
            while(var5 < this.field8381.length) {
               if (!arg0.method724(-25048, class483.field6662, this.field8381[var5])) {
                  return false;
               }

               ++var5;
            }

            if (!var4) {
               if (arg2 != 65) {
                  return true;
               }

               var6 = 0;
               if (var4) {
                  if (!arg1.method1289((byte)-108, this.field8389[var6])) {
                     return false;
                  }

                  ++var6;
               }

               while(true) {
                  while(~var6 > ~this.field8389.length) {
                     if (!arg1.method1289((byte)-108, this.field8389[var6])) {
                        return false;
                     }

                     ++var6;
                  }

                  if (!var4) {
                     return true;
                  }

                  if (false) {
                     return false;
                  }

                  ++var6;
               }
            }

            if (arg2 == 0) {
               return false;
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8393[5] + (arg0 != null ? field8393[1] : field8393[0]) + ',' + (arg1 != null ? field8393[1] : field8393[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Ld;Lqh;ZIIZDI)[I"
   )
   public final int[] method4386(class160 arg0, class74 arg1, boolean arg2, int arg3, int arg4, boolean arg5, double arg6, int arg7) {
      boolean var10 = client.field4273;

      try {
         class375.field5272 = arg0;
         ++field8384;
         class170.field2139 = arg1;
         int var11 = 0;
         if (var10) {
            this.field8382[var11].method1621(arg7, -30173, arg4);
            ++var11;
         }

         while(true) {
            while(~var11 > ~this.field8382.length) {
               this.field8382[var11].method1621(arg7, -30173, arg4);
               ++var11;
            }

            class616.method4472(arg6, -97);
            class368.method2841(arg4, 1159665196, arg7);
            int[] var12 = new int[arg4 * arg7];
            if (!var10) {
               int var13;
               int var14;
               byte var15;
               label147: {
                  if (!arg2) {
                     var13 = 0;
                     var14 = arg4;
                     var15 = 1;
                     if (!var10) {
                        break label147;
                     }
                  }

                  var14 = -1;
                  var15 = -1;
                  var13 = arg4 + -1;
               }

               int var10000;
               int var31;
               label122: {
                  int var16 = 0;
                  int var17 = 0;
                  if (var10) {
                     var10000 = this.field8383.field2645;
                  } else if (~var17 <= ~arg7) {
                     var31 = 0;
                     var10000 = arg3;
                     if (!var10) {
                        break label122;
                     }
                  } else {
                     var10000 = this.field8383.field2645;
                  }

                  while(true) {
                     int[] var19;
                     int[] var20;
                     int[] var21;
                     label174: {
                        if (var10000 != 0) {
                           int[] var18 = this.field8383.method215(var17, 2064866508);
                           var19 = var18;
                           var20 = var18;
                           var21 = var18;
                           if (!var10) {
                              if (arg5) {
                                 var16 = var17;
                              }
                              break label174;
                           }
                        }

                        int[][] var22 = this.field8383.method212(var17, (byte)34);
                        var19 = var22[2];
                        var20 = var22[1];
                        var21 = var22[0];
                        if (arg5) {
                           var16 = var17;
                        }
                     }

                     int var23 = var13;
                     if (var10 || ~var14 != ~var13) {
                        do {
                           int var24 = var21[var23] >> 4;
                           if (var24 > 255) {
                              var24 = 255;
                           }

                           if (~var24 > -1) {
                              var24 = 0;
                           }

                           int var25 = var20[var23] >> 4;
                           if (~var25 < -256) {
                              var25 = 255;
                           }

                           if (var25 < 0) {
                              var25 = 0;
                           }

                           int var26 = var19[var23] >> 4;
                           if (~var26 < -256) {
                              var26 = 255;
                           }

                           if (~var26 > -1) {
                              var26 = 0;
                           }

                           int var27 = class196.field2375[var25];
                           int var28 = class196.field2375[var24];
                           int var29 = class196.field2375[var26];
                           int var30 = (var28 << 16) + (var27 << 8) + var29;
                           if (~var30 != -1) {
                              var30 |= -16777216;
                           }

                           var12[var16++] = var30;
                           if (arg5) {
                              var16 += arg4 + -1;
                           }

                           var23 += var15;
                        } while(~var14 != ~var23);
                     }

                     ++var17;
                     if (~var17 <= ~arg7) {
                        var31 = 0;
                        var10000 = arg3;
                        if (!var10) {
                           break;
                        }
                     } else {
                        var10000 = this.field8383.field2645;
                     }
                  }
               }

               if (var10000 <= 58) {
                  this.field8389 = null;
                  if (var10) {
                     this.field8382[var31].method1537(-79);
                     ++var31;
                  }
               }

               while(true) {
                  while(~var31 > ~this.field8382.length) {
                     this.field8382[var31].method1537(-79);
                     ++var31;
                  }

                  if (!var10) {
                     return var12;
                  }

                  ++var31;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var33) {
         throw class534.method3846(var33, field8393[7] + (arg0 != null ? field8393[1] : field8393[0]) + ',' + (arg1 != null ? field8393[1] : field8393[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(ZBDLqh;ILd;I)[I"
   )
   public final int[] method4387(boolean arg0, byte arg1, double arg2, class74 arg3, int arg4, class160 arg5, int arg6) {
      boolean var9 = client.field4273;

      try {
         class170.field2139 = arg3;
         if (arg1 > -67) {
            this.field8388 = null;
         }

         class375.field5272 = arg5;
         ++field8392;
         int var10 = 0;
         if (var9) {
            this.field8382[var10].method1621(arg6, -30173, arg4);
            ++var10;
         }

         while(true) {
            while(this.field8382.length > var10) {
               this.field8382[var10].method1621(arg6, -30173, arg4);
               ++var10;
            }

            class616.method4472(arg2, -96);
            class368.method2841(arg4, 1159665196, arg6);
            int[] var11 = new int[arg4 * arg6];
            int var12 = 0;
            int var13 = 0;
            if (!var9) {
               int var28;
               label386: {
                  int[][] var14;
                  int[] var15;
                  int[] var16;
                  int[] var17;
                  int[] var18;
                  int[] var19;
                  if (var9) {
                     if (!this.field8383.field2645) {
                        var14 = this.field8383.method212(var13, (byte)74);
                        var15 = var14[1];
                        var16 = var14[0];
                        var17 = var14[2];
                        if (var9) {
                           var18 = this.field8383.method215(var13, 2064866508);
                           var17 = var18;
                           var15 = var18;
                           var16 = var18;
                        }
                     } else {
                        var18 = this.field8383.method215(var13, 2064866508);
                        var17 = var18;
                        var15 = var18;
                        var16 = var18;
                     }

                     if (!this.field8390.field2645) {
                        var19 = this.field8390.method212(var13, (byte)51)[0];
                        if (var9) {
                           var19 = this.field8390.method215(var13, 2064866508);
                           if (arg0) {
                              var12 = var13;
                           }
                        } else if (arg0) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field8390.method215(var13, 2064866508);
                        if (arg0) {
                           var12 = var13;
                        }
                     }
                  } else if (~arg6 >= ~var13) {
                     var28 = 0;
                     if (!var9) {
                        break label386;
                     }

                     var18 = this.field8383.method215(var13, 2064866508);
                     var17 = var18;
                     var15 = var18;
                     var16 = var18;
                     if (!this.field8390.field2645) {
                        var19 = this.field8390.method212(var13, (byte)51)[0];
                        if (var9) {
                           var19 = this.field8390.method215(var13, 2064866508);
                           if (arg0) {
                              var12 = var13;
                           }
                        } else if (arg0) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field8390.method215(var13, 2064866508);
                        if (arg0) {
                           var12 = var13;
                        }
                     }
                  } else {
                     if (!this.field8383.field2645) {
                        var14 = this.field8383.method212(var13, (byte)74);
                        var15 = var14[1];
                        var16 = var14[0];
                        var17 = var14[2];
                        if (var9) {
                           var18 = this.field8383.method215(var13, 2064866508);
                           var17 = var18;
                           var15 = var18;
                           var16 = var18;
                        }
                     } else {
                        var18 = this.field8383.method215(var13, 2064866508);
                        var17 = var18;
                        var15 = var18;
                        var16 = var18;
                     }

                     if (!this.field8390.field2645) {
                        var19 = this.field8390.method212(var13, (byte)51)[0];
                        if (var9) {
                           var19 = this.field8390.method215(var13, 2064866508);
                           if (arg0) {
                              var12 = var13;
                           }
                        } else if (arg0) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field8390.method215(var13, 2064866508);
                        if (arg0) {
                           var12 = var13;
                        }
                     }
                  }

                  while(true) {
                     int var20 = arg4 + -1;
                     if (var9 || ~var20 <= -1) {
                        do {
                           int var21 = var16[var20] >> 4;
                           int var22;
                           int var23;
                           int var24;
                           if (~var21 < -256) {
                              short var31 = 255;
                              if (~var31 > -1) {
                                 var31 = 0;
                              }

                              var22 = var15[var20] >> 4;
                              if (~var22 < -256) {
                                 var22 = 255;
                                 if (var22 < 0) {
                                    var22 = 0;
                                 }
                              } else if (var22 < 0) {
                                 var22 = 0;
                              }

                              var23 = var17[var20] >> 4;
                              if (~var23 < -256) {
                                 var23 = 255;
                                 var24 = class196.field2375[var31];
                                 if (var23 < 0) {
                                    var23 = 0;
                                 }
                              } else {
                                 var24 = class196.field2375[var31];
                                 if (var23 < 0) {
                                    var23 = 0;
                                 }
                              }
                           } else {
                              if (~var21 > -1) {
                                 var21 = 0;
                              }

                              var22 = var15[var20] >> 4;
                              if (~var22 < -256) {
                                 var22 = 255;
                                 if (var22 < 0) {
                                    var22 = 0;
                                 }
                              } else if (var22 < 0) {
                                 var22 = 0;
                              }

                              var23 = var17[var20] >> 4;
                              if (~var23 < -256) {
                                 var23 = 255;
                                 var24 = class196.field2375[var21];
                                 if (var23 < 0) {
                                    var23 = 0;
                                 }
                              } else {
                                 var24 = class196.field2375[var21];
                                 if (var23 < 0) {
                                    var23 = 0;
                                 }
                              }
                           }

                           int var25 = class196.field2375[var22];
                           int var26 = class196.field2375[var23];
                           int var27;
                           if (var24 == 0) {
                              if (var25 == 0) {
                                 if (var26 != 0) {
                                    var27 = var19[var20] >> 4;
                                    if (var27 > 255) {
                                       var27 = 255;
                                    }

                                    if (~var27 > -1) {
                                       var27 = 0;
                                       if (var9) {
                                          var27 = 0;
                                       }
                                    }

                                    var11[var12++] = (var27 << 24) - (-(var25 << 8) + -var26 + -(var24 << 16));
                                    if (arg0) {
                                       var12 += arg4 + -1;
                                    }

                                    --var20;
                                 } else {
                                    byte var32 = 0;
                                    var11[var12++] = (var32 << 24) - (-(var25 << 8) + -var26 + -(var24 << 16));
                                    if (arg0) {
                                       var12 += arg4 + -1;
                                    }

                                    --var20;
                                 }
                              } else {
                                 var27 = var19[var20] >> 4;
                                 if (var27 > 255) {
                                    var27 = 255;
                                 }

                                 if (~var27 > -1) {
                                    var27 = 0;
                                    if (var9) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var27 << 24) - (-(var25 << 8) + -var26 + -(var24 << 16));
                                 if (arg0) {
                                    var12 += arg4 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (var27 > 255) {
                                 var27 = 255;
                              }

                              if (~var27 > -1) {
                                 var27 = 0;
                                 if (var9) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var27 << 24) - (-(var25 << 8) + -var26 + -(var24 << 16));
                              if (arg0) {
                                 var12 += arg4 + -1;
                              }

                              --var20;
                           }
                        } while(~var20 <= -1);
                     }

                     ++var13;
                     if (~arg6 >= ~var13) {
                        var28 = 0;
                        if (!var9) {
                           break;
                        }

                        var18 = this.field8383.method215(var13, 2064866508);
                        var17 = var18;
                        var15 = var18;
                        var16 = var18;
                        if (!this.field8390.field2645) {
                           var19 = this.field8390.method212(var13, (byte)51)[0];
                           if (var9) {
                              var19 = this.field8390.method215(var13, 2064866508);
                              if (arg0) {
                                 var12 = var13;
                              }
                           } else if (arg0) {
                              var12 = var13;
                           }
                        } else {
                           var19 = this.field8390.method215(var13, 2064866508);
                           if (arg0) {
                              var12 = var13;
                           }
                        }
                     } else {
                        if (!this.field8383.field2645) {
                           var14 = this.field8383.method212(var13, (byte)74);
                           var15 = var14[1];
                           var16 = var14[0];
                           var17 = var14[2];
                           if (var9) {
                              var18 = this.field8383.method215(var13, 2064866508);
                              var17 = var18;
                              var15 = var18;
                              var16 = var18;
                           }
                        } else {
                           var18 = this.field8383.method215(var13, 2064866508);
                           var17 = var18;
                           var15 = var18;
                           var16 = var18;
                        }

                        if (!this.field8390.field2645) {
                           var19 = this.field8390.method212(var13, (byte)51)[0];
                           if (var9) {
                              var19 = this.field8390.method215(var13, 2064866508);
                              if (arg0) {
                                 var12 = var13;
                              }
                           } else if (arg0) {
                              var12 = var13;
                           }
                        } else {
                           var19 = this.field8390.method215(var13, 2064866508);
                           if (arg0) {
                              var12 = var13;
                           }
                        }
                     }
                  }
               }

               if (var9) {
                  this.field8382[var28].method1537(-116);
                  ++var28;
               }

               while(true) {
                  while(~this.field8382.length < ~var28) {
                     this.field8382[var28].method1537(-116);
                     ++var28;
                  }

                  if (!var9) {
                     return var11;
                  }

                  ++var28;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var30) {
         throw class534.method3846(var30, field8393[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8393[1] : field8393[0]) + ',' + arg4 + ',' + (arg5 != null ? field8393[1] : field8393[0]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "()V"
   )
   public class601() {
      try {
         this.field8381 = new int[0];
         this.field8389 = new int[0];
         this.field8388 = new class128(0);
         this.field8388.field2643 = 1;
         this.field8383 = new class128();
         this.field8383.field2643 = 1;
         this.field8390 = new class128();
         this.field8382 = new class213[]{this.field8383, this.field8390, this.field8388};
         this.field8390.field2643 = 1;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8393[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(Lwm;)V"
   )
   public class601(class594 arg0) {
      boolean var2 = client.field4273;
      super();

      try {
         int var3;
         int var4;
         int var5;
         int[][] var6;
         byte var10000;
         label97: {
            var3 = arg0.method4288((byte)113);
            var4 = 0;
            var5 = 0;
            this.field8382 = new class213[var3];
            var6 = new int[var3][];
            int var7 = 0;
            if (var2) {
               var10000 = -112;
            } else if (var7 >= var3) {
               this.field8381 = new int[var4];
               var4 = 0;
               this.field8389 = new int[var5];
               var5 = 0;
               var10000 = 0;
               if (!var2) {
                  break label97;
               }
            } else {
               var10000 = -112;
            }

            label96:
            while(true) {
               class213 var8 = class542.method3910(var10000, arg0);
               if (var8.method1541((byte)62) >= 0) {
                  ++var4;
                  if (var8.method1616(-1) >= 0) {
                     ++var5;
                  }
               } else if (var8.method1616(-1) >= 0) {
                  ++var5;
               }

               int var9 = var8.field2653.length;
               var6[var7] = new int[var9];
               int var10 = 0;
               if (var2) {
                  var6[var7][var10] = arg0.method4288((byte)70);
                  ++var10;
               }

               while(true) {
                  while(var10 < var9) {
                     var6[var7][var10] = arg0.method4288((byte)70);
                     ++var10;
                  }

                  this.field8382[var7] = var8;
                  if (!var2) {
                     ++var7;
                     if (var7 >= var3) {
                        this.field8381 = new int[var4];
                        var4 = 0;
                        this.field8389 = new int[var5];
                        var5 = 0;
                        var10000 = 0;
                        if (!var2) {
                           break label96;
                        }
                     } else {
                        var10000 = -112;
                     }
                     break;
                  }

                  ++var10;
               }
            }
         }

         int var11 = var10000;
         class213 var12;
         int var13;
         int var14;
         Object var17;
         class601 var20;
         if (var2) {
            var12 = this.field8382[var11];
            var13 = var12.field2653.length;
            var14 = 0;
            if (var2) {
               var12.field2653[var14] = this.field8382[var6[var11][var14]];
               ++var14;
            }
         } else {
            if (var11 >= var3) {
               this.field8383 = this.field8382[arg0.method4288((byte)119)];
               this.field8390 = this.field8382[arg0.method4288((byte)69)];
               var20 = this;
               if (!var2) {
                  this.field8388 = this.field8382[arg0.method4288((byte)103)];
                  var17 = null;
                  return;
               }
            } else {
               var20 = this;
            }

            var12 = var20.field8382[var11];
            var13 = var12.field2653.length;
            var14 = 0;
            if (var2) {
               var12.field2653[var14] = this.field8382[var6[var11][var14]];
               ++var14;
            }
         }

         while(true) {
            while(~var14 > ~var13) {
               var12.field2653[var14] = this.field8382[var6[var11][var14]];
               ++var14;
            }

            int var15 = var12.method1541((byte)60);
            int var16 = var12.method1616(-1);
            if (!var2) {
               if (~var15 < -1) {
                  this.field8381[var4++] = var15;
               }

               if (var16 > 0) {
                  this.field8389[var5++] = var16;
               }

               var6[var11] = null;
               ++var11;
               if (var11 >= var3) {
                  this.field8383 = this.field8382[arg0.method4288((byte)119)];
                  this.field8390 = this.field8382[arg0.method4288((byte)69)];
                  var20 = this;
                  if (!var2) {
                     this.field8388 = this.field8382[arg0.method4288((byte)103)];
                     var17 = null;
                     return;
                  }
               } else {
                  var20 = this;
               }

               var12 = var20.field8382[var11];
               var13 = var12.field2653.length;
               var14 = 0;
               if (var2) {
                  var12.field2653[var14] = this.field8382[var6[var11][var14]];
                  ++var14;
               }
            } else {
               ++var14;
            }
         }
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field8393[3] + (arg0 != null ? field8393[1] : field8393[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4388(int arg0) {
      try {
         if (arg0 != 255) {
            method4388(61);
         }

         field8385 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8393[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(ILd;ZBILqh;)[F"
   )
   public final float[] method4389(int arg0, class160 arg1, boolean arg2, byte arg3, int arg4, class74 arg5) {
      boolean var7 = client.field4273;

      try {
         class170.field2139 = arg5;
         ++field8391;
         class375.field5272 = arg1;
         int var8 = 0;
         if (var7) {
            this.field8382[var8].method1621(arg0, -30173, arg4);
            ++var8;
         }

         while(true) {
            while(var8 < this.field8382.length) {
               this.field8382[var8].method1621(arg0, -30173, arg4);
               ++var8;
            }

            class368.method2841(arg4, 1159665196, arg0);
            float[] var9 = new float[arg0 * arg4 * 4];
            int var10 = 0;
            int var11 = 0;
            if (!var7) {
               byte var10000;
               int var22;
               label116: {
                  if (var7) {
                     var10000 = this.field8383.field2645;
                  } else if (arg0 <= var11) {
                     var22 = 0;
                     var10000 = arg3;
                     if (!var7) {
                        break label116;
                     }
                  } else {
                     var10000 = this.field8383.field2645;
                  }

                  while(true) {
                     int[] var13;
                     int[] var14;
                     int[] var15;
                     label101: {
                        if (var10000 == 0) {
                           int[][] var12 = this.field8383.method212(var11, (byte)119);
                           var13 = var12[2];
                           var14 = var12[1];
                           var15 = var12[0];
                           if (!var7) {
                              break label101;
                           }
                        }

                        int[] var16 = this.field8383.method215(var11, 2064866508);
                        var15 = var16;
                        var13 = var16;
                        var14 = var16;
                     }

                     int[] var17;
                     if (this.field8390.field2645) {
                        var17 = this.field8390.method215(var11, 2064866508);
                        if (var7) {
                           var17 = this.field8390.method212(var11, (byte)118)[0];
                        }
                     } else {
                        var17 = this.field8390.method212(var11, (byte)118)[0];
                     }

                     int[] var18;
                     if (!this.field8388.field2645) {
                        var18 = this.field8388.method212(var11, (byte)101)[0];
                        if (var7) {
                           var18 = this.field8388.method215(var11, 2064866508);
                        }
                     } else {
                        var18 = this.field8388.method215(var11, 2064866508);
                     }

                     if (arg2) {
                        var10 = var11 << 2;
                     }

                     int var19 = arg4 + -1;
                     if (var7 || ~var19 <= -1) {
                        do {
                           float var20 = (float)var17[var19] / 4096.0F;
                           if (var20 < 0.0F) {
                              var20 = 0.0F;
                              if (var7 && var20 > 1.0F) {
                                 var20 = 1.0F;
                              }
                           } else if (var20 > 1.0F) {
                              var20 = 1.0F;
                           }

                           float var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                           var9[var10++] = (float)var15[var19] * var21;
                           var9[var10++] = (float)var14[var19] * var21;
                           var9[var10++] = (float)var13[var19] * var21;
                           var9[var10++] = var20;
                           if (arg2) {
                              var10 += (arg4 << 2) + -4;
                           }

                           --var19;
                        } while(~var19 <= -1);
                     }

                     ++var11;
                     if (arg0 <= var11) {
                        var22 = 0;
                        var10000 = arg3;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = this.field8383.field2645;
                     }
                  }
               }

               if (var10000 >= -81) {
                  method4384(-3, 96, 43, -115, -70, -81, false, -112, -81);
                  if (var7) {
                     this.field8382[var22].method1537(-63);
                     ++var22;
                  }
               }

               while(true) {
                  while(~this.field8382.length < ~var22) {
                     this.field8382[var22].method1537(-63);
                     ++var22;
                  }

                  if (!var7) {
                     return var9;
                  }

                  ++var22;
               }
            }

            ++var8;
         }
      } catch (RuntimeException var24) {
         throw class534.method3846(var24, field8393[6] + arg0 + ',' + (arg1 != null ? field8393[1] : field8393[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8393[1] : field8393[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4390(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4391(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
