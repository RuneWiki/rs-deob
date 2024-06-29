import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class663 {
   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9353 = new String[]{method4825(method4824("qG\u0010;[")), method4825(method4824("qG\u00100[")), method4825(method4824("qG\u00103[")), method4825(method4824("qG\u0010?[")), method4825(method4824("qG\u00104[")), method4825(method4824("qG\u0010<[")), method4825(method4824("qG\u00101[")), method4825(method4824("qG\u00106[")), method4825(method4824("qG\u0010=[")), method4825(method4824("qG\u0010:[")), method4825(method4824("qG\u00105[")), method4825(method4824("qG\u00102[")), method4825(method4824("qG\u00107[")), method4825(method4824("qG\u00108[")), method4825(method4824("qG\u0010)[")), method4825(method4824("qG\u0010(["))};
   @OriginalMember(
      owner = "client!bc",
      name = "g",
      descriptor = "I"
   )
   public int field9331;
   @OriginalMember(
      owner = "client!bc",
      name = "q",
      descriptor = "I"
   )
   public static int field9332;
   @OriginalMember(
      owner = "client!bc",
      name = "s",
      descriptor = "I"
   )
   public static int field9333;
   @OriginalMember(
      owner = "client!bc",
      name = "r",
      descriptor = "I"
   )
   public static int field9334;
   @OriginalMember(
      owner = "client!bc",
      name = "j",
      descriptor = "I"
   )
   public static int field9335;
   @OriginalMember(
      owner = "client!bc",
      name = "v",
      descriptor = "I"
   )
   public static int field9336;
   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "I"
   )
   public static int field9337;
   @OriginalMember(
      owner = "client!bc",
      name = "d",
      descriptor = "I"
   )
   public static int field9338;
   @OriginalMember(
      owner = "client!bc",
      name = "k",
      descriptor = "I"
   )
   public static int field9339;
   @OriginalMember(
      owner = "client!bc",
      name = "t",
      descriptor = "I"
   )
   public static int field9340;
   @OriginalMember(
      owner = "client!bc",
      name = "n",
      descriptor = "I"
   )
   public int field9341;
   @OriginalMember(
      owner = "client!bc",
      name = "c",
      descriptor = "I"
   )
   public static int field9342;
   @OriginalMember(
      owner = "client!bc",
      name = "f",
      descriptor = "I"
   )
   public static int field9343;
   @OriginalMember(
      owner = "client!bc",
      name = "l",
      descriptor = "I"
   )
   public int field9344;
   @OriginalMember(
      owner = "client!bc",
      name = "m",
      descriptor = "I"
   )
   public static int field9345;
   @OriginalMember(
      owner = "client!bc",
      name = "o",
      descriptor = "I"
   )
   public static int field9346;
   @OriginalMember(
      owner = "client!bc",
      name = "b",
      descriptor = "I"
   )
   public static int field9347;
   @OriginalMember(
      owner = "client!bc",
      name = "p",
      descriptor = "I"
   )
   public int field9348;
   @OriginalMember(
      owner = "client!bc",
      name = "h",
      descriptor = "I"
   )
   public static int field9349;
   @OriginalMember(
      owner = "client!bc",
      name = "u",
      descriptor = "I"
   )
   public static int field9350;
   @OriginalMember(
      owner = "client!bc",
      name = "i",
      descriptor = "I"
   )
   public static int field9351;
   @OriginalMember(
      owner = "client!bc",
      name = "e",
      descriptor = "[[I"
   )
   public int[][] field9352;

   @OriginalMember(
      owner = "client!bc",
      name = "b",
      descriptor = "(IIIIIIII)Z"
   )
   public final boolean method4807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field9337;
         if (arg5 == 1) {
            if (~arg3 == ~arg6 && ~arg2 == ~arg4) {
               return true;
            }
         } else if (~arg6 >= ~arg3 && ~(arg5 + arg6 - 1) <= ~arg3 && arg4 >= arg4 && ~arg4 >= ~(arg4 + arg5 + -1)) {
            return true;
         }

         int var15 = arg3 - this.field9344;
         int var9 = 40 % ((66 - arg7) / 51);
         int var17 = arg6 - this.field9344;
         int var14 = arg2 - this.field9348;
         int var16 = arg4 - this.field9348;
         if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
               if (arg1 == 7) {
                  arg0 = 3 & arg0 + 2;
               }

               if (~arg0 == -1) {
                  if (var15 - -1 == var17 && ~var14 == ~var16 && ~(this.field9352[var17][var14] & 128) == -1) {
                     return true;
                  }

                  if (var15 == var17 && ~(var16 + -1) == ~var14 && ~(2 & this.field9352[var17][var14]) == -1) {
                     return true;
                  }
               } else if (arg0 != 1) {
                  if (arg0 == 2) {
                     if (var15 + -1 == var17 && ~var14 == ~var16 && ~(this.field9352[var17][var14] & 8) == -1) {
                        return true;
                     }

                     if (var15 == var17 && var16 + 1 == var14 && (this.field9352[var17][var14] & 32) == 0) {
                        return true;
                     }
                  } else if (~arg0 == -4) {
                     if (~(var15 - -1) == ~var17 && var14 == var16 && (128 & this.field9352[var17][var14]) == 0) {
                        return true;
                     }

                     if (var15 == var17 && ~(var16 + 1) == ~var14 && ~(32 & this.field9352[var17][var14]) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (~(var15 + -1) == ~var17 && var14 == var16 && (this.field9352[var17][var14] & 8) == 0) {
                     return true;
                  }

                  if (var15 == var17 && var16 + -1 == var14 && ~(2 & this.field9352[var17][var14]) == -1) {
                     return true;
                  }
               }
            }

            if (~arg1 == -9) {
               if (var15 == var17 && var16 + 1 == var14 && (this.field9352[var17][var14] & 32) == 0) {
                  return true;
               }

               if (var15 == var17 && var16 + -1 == var14 && ~(this.field9352[var17][var14] & 2) == -1) {
                  return true;
               }

               if (~(var15 + -1) == ~var17 && var14 == var16 && (8 & this.field9352[var17][var14]) == 0) {
                  return true;
               }

               if (var15 - -1 == var17 && var14 == var16 && (this.field9352[var17][var14] & 128) == 0) {
                  return true;
               }
            }
         } else {
            int var10 = var17 + -1 + arg5;
            int var11 = var14 + arg5 + -1;
            if (arg1 == 6 || arg1 == 7) {
               if (arg1 == 7) {
                  arg0 = 3 & arg0 + 2;
               }

               if (arg0 == 0) {
                  if (var15 + 1 == var17 && ~var14 >= ~var16 && var11 >= var16 && ~(this.field9352[var17][var16] & 128) == -1) {
                     return true;
                  }

                  if (var15 >= var17 && var10 >= var15 && ~(var16 - arg5) == ~var14 && (this.field9352[var15][var11] & 2) == 0) {
                     return true;
                  }
               } else if (~arg0 != -2) {
                  if (~arg0 == -3) {
                     if (~(-arg5 + var15) == ~var17 && var16 >= var14 && var11 >= var16 && ~(8 & this.field9352[var10][var16]) == -1) {
                        return true;
                     }

                     if (~var15 <= ~var17 && var10 >= var15 && ~(var16 - -1) == ~var14 && (this.field9352[var15][var14] & 32) == 0) {
                        return true;
                     }
                  } else if (arg0 == 3) {
                     if (~(var15 + 1) == ~var17 && var16 >= var14 && var11 >= var16 && ~(128 & this.field9352[var17][var16]) == -1) {
                        return true;
                     }

                     if (~var17 >= ~var15 && ~var10 <= ~var15 && var16 + 1 == var14 && (32 & this.field9352[var15][var14]) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (~(-arg5 + var15) == ~var17 && var14 <= var16 && var16 <= var11 && ~(8 & this.field9352[var10][var16]) == -1) {
                     return true;
                  }

                  if (~var15 <= ~var17 && var10 >= var15 && ~(-arg5 + var16) == ~var14 && (this.field9352[var15][var11] & 2) == 0) {
                     return true;
                  }
               }
            }

            if (~arg1 == -9) {
               if (var15 >= var17 && var10 >= var15 && var16 - -1 == var14 && (32 & this.field9352[var15][var14]) == 0) {
                  return true;
               }

               if (var15 >= var17 && ~var15 >= ~var10 && ~(-arg5 + var16) == ~var14 && (2 & this.field9352[var15][var11]) == 0) {
                  return true;
               }

               if (~(-arg5 + var15) == ~var17 && var14 <= var16 && ~var11 <= ~var16 && (8 & this.field9352[var10][var16]) == 0) {
                  return true;
               }

               if (var15 - -1 == var17 && ~var16 <= ~var14 && var16 <= var11 && (128 & this.field9352[var17][var16]) == 0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field9353[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "b",
      descriptor = "(IBI)V"
   )
   public final void method4808(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -60) {
            this.field9341 = -114;
         }

         ++field9333;
         int var7 = arg2 - this.field9348;
         int var6 = arg0 - this.field9344;
         this.field9352[var6][var7] = class697.method5101(this.field9352[var6][var7], -2097153);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9353[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(BIII)V"
   )
   private final void method4809(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9351;
         this.field9352[arg1][arg3] = class697.method5101(this.field9352[arg1][arg3], ~arg2);
         if (arg0 != 74) {
            this.method4811(27, (byte)-96, -13);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9353[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IIBI)V"
   )
   private final void method4810(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field9336;
         this.field9352[arg3][arg0] = class91.method932(this.field9352[arg3][arg0], arg1);
         if (arg2 > -97) {
            method4815(39, -4, -105, 19);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9353[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method4811(int arg0, byte arg1, int arg2) {
      try {
         int var6 = arg0 - this.field9348;
         if (arg1 >= -29) {
            this.method4807(46, -114, -126, -69, -99, -11, 98, 39);
         }

         int var7 = arg2 - this.field9344;
         ++field9349;
         this.field9352[var7][var6] = class91.method932(this.field9352[var7][var6], 262144);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9353[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4812(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field9342;
         if (arg0 != -13) {
            this.field9341 = -111;
         }

         int var3 = 0;
         if (var2 || ~var3 > ~this.field9331) {
            do {
               int var4 = 0;
               if (var2) {
                  if (~var3 != -1) {
                     if (~var4 != -1) {
                        if (var3 < this.field9331 + -5) {
                           if (~var4 <= ~(this.field9341 - 5)) {
                              this.field9352[var3][var4] = -1;
                              if (var2) {
                                 this.field9352[var3][var4] = 2097152;
                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           } else {
                              this.field9352[var3][var4] = 2097152;
                              ++var4;
                           }
                        } else {
                           this.field9352[var3][var4] = -1;
                           if (var2) {
                              this.field9352[var3][var4] = 2097152;
                              ++var4;
                           } else {
                              ++var4;
                           }
                        }
                     } else {
                        this.field9352[var3][var4] = -1;
                        if (var2) {
                           this.field9352[var3][var4] = 2097152;
                           ++var4;
                        } else {
                           ++var4;
                        }
                     }
                  } else {
                     this.field9352[var3][var4] = -1;
                     if (var2) {
                        this.field9352[var3][var4] = 2097152;
                        ++var4;
                     } else {
                        ++var4;
                     }
                  }
               }

               while(true) {
                  while(~var4 > ~this.field9341) {
                     if (~var3 != -1) {
                        if (~var4 != -1) {
                           if (var3 < this.field9331 + -5) {
                              if (~var4 <= ~(this.field9341 - 5)) {
                                 this.field9352[var3][var4] = -1;
                                 if (var2) {
                                    this.field9352[var3][var4] = 2097152;
                                    ++var4;
                                 } else {
                                    ++var4;
                                 }
                              } else {
                                 this.field9352[var3][var4] = 2097152;
                                 ++var4;
                              }
                           } else {
                              this.field9352[var3][var4] = -1;
                              if (var2) {
                                 this.field9352[var3][var4] = 2097152;
                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           }
                        } else {
                           this.field9352[var3][var4] = -1;
                           if (var2) {
                              this.field9352[var3][var4] = 2097152;
                              ++var4;
                           } else {
                              ++var4;
                           }
                        }
                     } else {
                        this.field9352[var3][var4] = -1;
                        if (var2) {
                           this.field9352[var3][var4] = 2097152;
                           ++var4;
                        } else {
                           ++var4;
                        }
                     }
                  }

                  if (!var2) {
                     ++var3;
                     break;
                  }

                  if (var2) {
                     this.field9352[var3][var4] = 2097152;
                     ++var4;
                  } else {
                     ++var4;
                  }
               }
            } while(~var3 > ~this.field9331);

         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9353[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IIIIIIII)Z"
   )
   public final boolean method4813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field9338;
         if (~arg2 != -2) {
            if (arg0 >= arg7 && arg0 <= arg7 - -arg2 + -1 && arg1 >= arg1 && ~arg1 >= ~(arg1 + -1 + arg2)) {
               return true;
            }
         } else if (arg0 == arg7 && ~arg1 == ~arg3) {
            return true;
         }

         if (arg5 != 633) {
            this.method4811(-99, (byte)-122, -106);
         }

         int var16 = arg7 - this.field9344;
         int var13 = arg0 - this.field9344;
         int var15 = arg3 - this.field9348;
         int var14 = arg1 - this.field9348;
         if (arg2 != 1) {
            int var9 = arg2 + var16 - 1;
            int var10 = arg2 + var15 + -1;
            if (arg4 == 0) {
               if (arg6 != 0) {
                  if (~arg6 == -2) {
                     if (var13 >= var16 && var13 <= var9 && var14 + 1 == var15) {
                        return true;
                     }

                     if (-arg2 + var13 == var16 && var14 >= var15 && var10 >= var14 && ~(this.field9352[var9][var14] & 2883848) == -1) {
                        return true;
                     }

                     if (~(var13 - -1) == ~var16 && ~var14 <= ~var15 && ~var14 >= ~var10 && (2883968 & this.field9352[var16][var14]) == 0) {
                        return true;
                     }
                  } else if (arg6 != 2) {
                     if (~arg6 == -4) {
                        if (var13 >= var16 && var13 <= var9 && -arg2 + var14 == var15) {
                           return true;
                        }

                        if (~(-arg2 + var13) == ~var16 && ~var15 >= ~var14 && ~var10 <= ~var14 && (2883848 & this.field9352[var9][var14]) == 0) {
                           return true;
                        }

                        if (var13 + 1 == var16 && ~var15 >= ~var14 && var14 <= var10 && ~(this.field9352[var16][var14] & 2883968) == -1) {
                           return true;
                        }
                     }
                  } else {
                     if (~(var13 - -1) == ~var16 && ~var15 >= ~var14 && ~var10 <= ~var14) {
                        return true;
                     }

                     if (var16 <= var13 && ~var9 <= ~var13 && ~(var14 + 1) == ~var15 && (this.field9352[var13][var15] & 2883872) == 0) {
                        return true;
                     }

                     if (~var16 >= ~var13 && var13 <= var9 && var14 - arg2 == var15 && ~(this.field9352[var13][var10] & 2883842) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (~(-arg2 + var13) == ~var16 && var15 <= var14 && var10 >= var14) {
                     return true;
                  }

                  if (~var16 >= ~var13 && var9 >= var13 && var14 + 1 == var15 && (this.field9352[var13][var15] & 2883872) == 0) {
                     return true;
                  }

                  if (var13 >= var16 && ~var9 <= ~var13 && ~(-arg2 + var14) == ~var15 && ~(this.field9352[var13][var10] & 2883842) == -1) {
                     return true;
                  }
               }
            }

            if (~arg4 == -3) {
               if (~arg6 == -1) {
                  if (-arg2 + var13 == var16 && var14 >= var15 && ~var14 >= ~var10) {
                     return true;
                  }

                  if (var16 <= var13 && var13 <= var9 && ~(var14 + 1) == ~var15) {
                     return true;
                  }

                  if (~(var13 + 1) == ~var16 && var15 <= var14 && ~var14 >= ~var10 && (this.field9352[var16][var14] & 2883968) == 0) {
                     return true;
                  }

                  if (var16 <= var13 && ~var13 >= ~var9 && var14 - arg2 == var15 && ~(2883842 & this.field9352[var13][var10]) == -1) {
                     return true;
                  }
               } else if (~arg6 == -2) {
                  if (~(-arg2 + var13) == ~var16 && var14 >= var15 && ~var10 <= ~var14 && ~(this.field9352[var9][var14] & 2883848) == -1) {
                     return true;
                  }

                  if (var13 >= var16 && ~var9 <= ~var13 && ~(var14 + 1) == ~var15) {
                     return true;
                  }

                  if (var13 + 1 == var16 && ~var15 >= ~var14 && ~var14 >= ~var10) {
                     return true;
                  }

                  if (~var13 <= ~var16 && var13 <= var9 && -arg2 + var14 == var15 && ~(this.field9352[var13][var10] & 2883842) == -1) {
                     return true;
                  }
               } else if (arg6 != 2) {
                  if (~arg6 == -4) {
                     if (var13 - arg2 == var16 && var14 >= var15 && var14 <= var10) {
                        return true;
                     }

                     if (~var13 <= ~var16 && var13 <= var9 && ~(var14 + 1) == ~var15 && (2883872 & this.field9352[var13][var15]) == 0) {
                        return true;
                     }

                     if (var13 - -1 == var16 && var14 >= var15 && var14 <= var10 && ~(2883968 & this.field9352[var16][var14]) == -1) {
                        return true;
                     }

                     if (~var16 >= ~var13 && ~var9 <= ~var13 && -arg2 + var14 == var15) {
                        return true;
                     }
                  }
               } else {
                  if (var13 - arg2 == var16 && ~var14 <= ~var15 && var10 >= var14 && ~(this.field9352[var9][var14] & 2883848) == -1) {
                     return true;
                  }

                  if (~var13 <= ~var16 && ~var13 >= ~var9 && var14 + 1 == var15 && ~(2883872 & this.field9352[var13][var15]) == -1) {
                     return true;
                  }

                  if (var13 - -1 == var16 && var14 >= var15 && var10 >= var14) {
                     return true;
                  }

                  if (~var16 >= ~var13 && ~var9 <= ~var13 && ~(-arg2 + var14) == ~var15) {
                     return true;
                  }
               }
            }

            if (~arg4 == -10) {
               if (~var16 >= ~var13 && ~var9 <= ~var13 && ~(var14 - -1) == ~var15 && ~(this.field9352[var13][var15] & 2883872) == -1) {
                  return true;
               }

               if (var16 <= var13 && ~var13 >= ~var9 && ~(-arg2 + var14) == ~var15 && ~(2883842 & this.field9352[var13][var10]) == -1) {
                  return true;
               }

               if (-arg2 + var13 == var16 && var14 >= var15 && var10 >= var14 && (2883848 & this.field9352[var9][var14]) == 0) {
                  return true;
               }

               if (var13 - -1 == var16 && var15 <= var14 && var10 >= var14 && (this.field9352[var16][var14] & 2883968) == 0) {
                  return true;
               }
            }
         } else {
            if (arg4 == 0) {
               if (~arg6 == -1) {
                  if (var13 - 1 == var16 && var14 == var15) {
                     return true;
                  }

                  if (var13 == var16 && var14 - -1 == var15 && ~(2883872 & this.field9352[var16][var15]) == -1) {
                     return true;
                  }

                  if (~var13 == ~var16 && ~(var14 - 1) == ~var15 && ~(2883842 & this.field9352[var16][var15]) == -1) {
                     return true;
                  }
               } else if (arg6 != 1) {
                  if (~arg6 != -3) {
                     if (~arg6 == -4) {
                        if (~var13 == ~var16 && var14 - 1 == var15) {
                           return true;
                        }

                        if (var13 - 1 == var16 && ~var14 == ~var15 && ~(this.field9352[var16][var15] & 2883848) == -1) {
                           return true;
                        }

                        if (~(var13 - -1) == ~var16 && ~var14 == ~var15 && (2883968 & this.field9352[var16][var15]) == 0) {
                           return true;
                        }
                     }
                  } else {
                     if (~(var13 - -1) == ~var16 && ~var14 == ~var15) {
                        return true;
                     }

                     if (var13 == var16 && ~(var14 + 1) == ~var15 && (2883872 & this.field9352[var16][var15]) == 0) {
                        return true;
                     }

                     if (~var13 == ~var16 && var14 - 1 == var15 && (2883842 & this.field9352[var16][var15]) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (var13 == var16 && var14 + 1 == var15) {
                     return true;
                  }

                  if (~(var13 + -1) == ~var16 && var14 == var15 && (this.field9352[var16][var15] & 2883848) == 0) {
                     return true;
                  }

                  if (~(var13 + 1) == ~var16 && var14 == var15 && (this.field9352[var16][var15] & 2883968) == 0) {
                     return true;
                  }
               }
            }

            if (arg4 == 2) {
               if (arg6 != 0) {
                  if (~arg6 != -2) {
                     if (arg6 != 2) {
                        if (~arg6 == -4) {
                           if (var13 + -1 == var16 && var14 == var15) {
                              return true;
                           }

                           if (~var13 == ~var16 && ~(var14 + 1) == ~var15 && (2883872 & this.field9352[var16][var15]) == 0) {
                              return true;
                           }

                           if (var13 + 1 == var16 && ~var14 == ~var15 && (2883968 & this.field9352[var16][var15]) == 0) {
                              return true;
                           }

                           if (var13 == var16 && ~(var14 + -1) == ~var15) {
                              return true;
                           }
                        }
                     } else {
                        if (~(var13 + -1) == ~var16 && ~var14 == ~var15 && ~(2883848 & this.field9352[var16][var15]) == -1) {
                           return true;
                        }

                        if (~var13 == ~var16 && var14 - -1 == var15 && ~(this.field9352[var16][var15] & 2883872) == -1) {
                           return true;
                        }

                        if (~(var13 + 1) == ~var16 && ~var14 == ~var15) {
                           return true;
                        }

                        if (var13 == var16 && var14 + -1 == var15) {
                           return true;
                        }
                     }
                  } else {
                     if (var13 + -1 == var16 && ~var14 == ~var15 && (2883848 & this.field9352[var16][var15]) == 0) {
                        return true;
                     }

                     if (~var13 == ~var16 && ~(var14 + 1) == ~var15) {
                        return true;
                     }

                     if (var13 - -1 == var16 && ~var14 == ~var15) {
                        return true;
                     }

                     if (var13 == var16 && var14 - 1 == var15 && ~(2883842 & this.field9352[var16][var15]) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (~(var13 + -1) == ~var16 && ~var14 == ~var15) {
                     return true;
                  }

                  if (var13 == var16 && var14 - -1 == var15) {
                     return true;
                  }

                  if (~(var13 + 1) == ~var16 && var14 == var15 && (2883968 & this.field9352[var16][var15]) == 0) {
                     return true;
                  }

                  if (~var13 == ~var16 && var14 - 1 == var15 && ~(2883842 & this.field9352[var16][var15]) == -1) {
                     return true;
                  }
               }
            }

            if (arg4 == 9) {
               if (var13 == var16 && ~(var14 + 1) == ~var15 && ~(32 & this.field9352[var16][var15]) == -1) {
                  return true;
               }

               if (var13 == var16 && ~(var14 + -1) == ~var15 && ~(this.field9352[var16][var15] & 2) == -1) {
                  return true;
               }

               if (~(var13 - 1) == ~var16 && var14 == var15 && (8 & this.field9352[var16][var15]) == 0) {
                  return true;
               }

               if (var13 + 1 == var16 && var14 == var15 && ~(128 & this.field9352[var16][var15]) == -1) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field9353[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IIIIIIIIIB)Z"
   )
   public final boolean method4814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
      boolean var11 = client.field10022;

      try {
         ++field9346;
         int var12 = arg0 - -arg6;
         int var13 = arg3 - -arg2;
         int var14 = arg1 + arg4;
         int var15 = arg7 + arg8;
         int var16 = -37 % ((9 - arg9) / 33);
         if (arg0 != var14 || (2 & arg5) != 0) {
            if (arg4 != var12 || ~(arg5 & 8) != -1) {
               if (~arg3 == ~var15 && ~(arg5 & 1) == -1) {
                  int var17 = arg4 >= arg0 ? arg4 : arg0;
                  int var18 = ~var14 >= ~var12 ? var14 : var12;
                  if (var11) {
                     if (~(2 & this.field9352[var17 - this.field9344][var15 + -1 + -this.field9348]) == -1) {
                        return true;
                     }

                     ++var17;
                  }

                  while(true) {
                     while(var18 > var17) {
                        if (~(2 & this.field9352[var17 - this.field9344][var15 + -1 + -this.field9348]) == -1) {
                           return true;
                        }

                        ++var17;
                     }

                     if (!var11) {
                        if (!var11) {
                           return false;
                        }
                        break;
                     }

                     ++var17;
                  }
               }

               if (arg7 != var13 || (arg5 & 4) != 0) {
                  return false;
               }

               int var19 = ~arg4 > ~arg0 ? arg0 : arg4;
               int var20 = var14 > var12 ? var12 : var14;
               if (var11) {
                  if (~(this.field9352[-this.field9344 + var19][-this.field9348 + arg7] & 32) == -1) {
                     return true;
                  }

                  ++var19;
               }

               while(true) {
                  while(var19 < var20) {
                     if (~(this.field9352[-this.field9344 + var19][-this.field9348 + arg7] & 32) == -1) {
                        return true;
                     }

                     ++var19;
                  }

                  if (!var11) {
                     if (!var11) {
                        return false;
                     }
                     break;
                  }

                  ++var19;
               }
            }

            int var21 = arg7 < arg3 ? arg3 : arg7;
            int var22 = var13 >= var15 ? var15 : var13;
            if (var11) {
               if (~(128 & this.field9352[-this.field9344 + arg4][-this.field9348 + var21]) == -1) {
                  return true;
               }

               ++var21;
            }

            while(true) {
               while(var21 < var22) {
                  if (~(128 & this.field9352[-this.field9344 + arg4][-this.field9348 + var21]) == -1) {
                     return true;
                  }

                  ++var21;
               }

               if (!var11) {
                  if (!var11) {
                     return false;
                  }
                  break;
               }

               ++var21;
            }
         }

         int var23 = ~arg3 < ~arg7 ? arg3 : arg7;
         int var24 = ~var13 <= ~var15 ? var15 : var13;
         if (var11 || ~var23 > ~var24) {
            do {
               if (~(8 & this.field9352[var14 - 1 + -this.field9344][-this.field9348 + var23]) == -1) {
                  return true;
               }

               ++var23;
            } while(~var23 > ~var24);
         }

         return false;
      } catch (RuntimeException var26) {
         throw class612.method4503(var26, field9353[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method4815(int arg0, int arg1, int arg2, int arg3) {
      class312 var4 = class324.field4826[arg0][arg1][arg2];
      if (var4 != null) {
         class566 var5 = var4.field4679;
         class566 var6 = var4.field4690;
         if (var5 != null) {
            var5.field8045 = (short)(var5.field8045 * arg3 / (16 << class313.field4707 - 7));
            var5.field8044 = (short)(var5.field8044 * arg3 / (16 << class313.field4707 - 7));
         }

         if (var6 != null) {
            var6.field8045 = (short)(var6.field8045 * arg3 / (16 << class313.field4707 - 7));
            var6.field8044 = (short)(var6.field8044 * arg3 / (16 << class313.field4707 - 7));
         }

      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(BZIIIIZ)V"
   )
   public final void method4816(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      try {
         if (arg0 <= 61) {
            this.method4818(true, false, 59, 95, -63, -35, -26);
         }

         int var11 = arg5 - this.field9344;
         int var10 = arg3 - this.field9348;
         ++field9339;
         if (arg2 == 0) {
            if (~arg4 == -1) {
               this.method4810(var10, 128, (byte)-125, var11);
               this.method4810(var10, 8, (byte)-117, var11 + -1);
            }

            if (arg4 == 1) {
               this.method4810(var10, 2, (byte)-113, var11);
               this.method4810(var10 + 1, 32, (byte)-109, var11);
            }

            if (arg4 == 2) {
               this.method4810(var10, 8, (byte)-101, var11);
               this.method4810(var10, 128, (byte)-106, var11 - -1);
            }

            if (arg4 == 3) {
               this.method4810(var10, 32, (byte)-119, var11);
               this.method4810(var10 + -1, 2, (byte)-122, var11);
            }
         }

         if (arg2 == 1 || arg2 == 3) {
            if (~arg4 == -1) {
               this.method4810(var10, 1, (byte)-100, var11);
               this.method4810(var10 + 1, 16, (byte)-108, var11 - 1);
            }

            if (arg4 == 1) {
               this.method4810(var10, 4, (byte)-124, var11);
               this.method4810(var10 + 1, 64, (byte)-104, var11 - -1);
            }

            if (arg4 == 2) {
               this.method4810(var10, 16, (byte)-119, var11);
               this.method4810(var10 + -1, 1, (byte)-127, var11 + 1);
            }

            if (~arg4 == -4) {
               this.method4810(var10, 64, (byte)-109, var11);
               this.method4810(var10 + -1, 4, (byte)-98, var11 + -1);
            }
         }

         if (~arg2 == -3) {
            if (~arg4 == -1) {
               this.method4810(var10, 130, (byte)-116, var11);
               this.method4810(var10, 8, (byte)-110, var11 + -1);
               this.method4810(var10 + 1, 32, (byte)-114, var11);
            }

            if (~arg4 == -2) {
               this.method4810(var10, 10, (byte)-118, var11);
               this.method4810(var10 + 1, 32, (byte)-98, var11);
               this.method4810(var10, 128, (byte)-104, var11 + 1);
            }

            if (~arg4 == -3) {
               this.method4810(var10, 40, (byte)-113, var11);
               this.method4810(var10, 128, (byte)-126, var11 + 1);
               this.method4810(var10 + -1, 2, (byte)-128, var11);
            }

            if (arg4 == 3) {
               this.method4810(var10, 160, (byte)-100, var11);
               this.method4810(var10 + -1, 2, (byte)-99, var11);
               this.method4810(var10, 8, (byte)-112, var11 + -1);
            }
         }

         if (arg1) {
            if (~arg2 == -1) {
               if (arg4 == 0) {
                  this.method4810(var10, 65536, (byte)-110, var11);
                  this.method4810(var10, 4096, (byte)-100, var11 + -1);
               }

               if (arg4 == 1) {
                  this.method4810(var10, 1024, (byte)-110, var11);
                  this.method4810(var10 + 1, 16384, (byte)-119, var11);
               }

               if (arg4 == 2) {
                  this.method4810(var10, 4096, (byte)-115, var11);
                  this.method4810(var10, 65536, (byte)-108, var11 - -1);
               }

               if (~arg4 == -4) {
                  this.method4810(var10, 16384, (byte)-103, var11);
                  this.method4810(var10 - 1, 1024, (byte)-104, var11);
               }
            }

            if (~arg2 == -2 || arg2 == 3) {
               if (arg4 == 0) {
                  this.method4810(var10, 512, (byte)-127, var11);
                  this.method4810(var10 + 1, 8192, (byte)-109, var11 - 1);
               }

               if (~arg4 == -2) {
                  this.method4810(var10, 2048, (byte)-121, var11);
                  this.method4810(var10 - -1, 32768, (byte)-103, var11 + 1);
               }

               if (~arg4 == -3) {
                  this.method4810(var10, 8192, (byte)-118, var11);
                  this.method4810(var10 + -1, 512, (byte)-125, var11 - -1);
               }

               if (~arg4 == -4) {
                  this.method4810(var10, 32768, (byte)-123, var11);
                  this.method4810(var10 - 1, 2048, (byte)-125, var11 + -1);
               }
            }

            if (~arg2 == -3) {
               if (arg4 == 0) {
                  this.method4810(var10, 66560, (byte)-109, var11);
                  this.method4810(var10, 4096, (byte)-107, var11 - 1);
                  this.method4810(var10 + 1, 16384, (byte)-120, var11);
               }

               if (arg4 == 1) {
                  this.method4810(var10, 5120, (byte)-127, var11);
                  this.method4810(var10 + 1, 16384, (byte)-104, var11);
                  this.method4810(var10, 65536, (byte)-126, var11 + 1);
               }

               if (~arg4 == -3) {
                  this.method4810(var10, 20480, (byte)-119, var11);
                  this.method4810(var10, 65536, (byte)-128, var11 + 1);
                  this.method4810(var10 + -1, 1024, (byte)-124, var11);
               }

               if (arg4 == 3) {
                  this.method4810(var10, 81920, (byte)-107, var11);
                  this.method4810(var10 + -1, 1024, (byte)-103, var11);
                  this.method4810(var10, 4096, (byte)-103, var11 + -1);
               }
            }
         }

         if (arg6) {
            if (~arg2 == -1) {
               if (~arg4 == -1) {
                  this.method4810(var10, 536870912, (byte)-121, var11);
                  this.method4810(var10, 33554432, (byte)-113, var11 - 1);
               }

               if (~arg4 == -2) {
                  this.method4810(var10, 8388608, (byte)-122, var11);
                  this.method4810(var10 - -1, 134217728, (byte)-127, var11);
               }

               if (~arg4 == -3) {
                  this.method4810(var10, 33554432, (byte)-106, var11);
                  this.method4810(var10, 536870912, (byte)-121, var11 + 1);
               }

               if (arg4 == 3) {
                  this.method4810(var10, 134217728, (byte)-126, var11);
                  this.method4810(var10 + -1, 8388608, (byte)-123, var11);
               }
            }

            if (~arg2 == -2 || ~arg2 == -4) {
               if (arg4 == 0) {
                  this.method4810(var10, 4194304, (byte)-105, var11);
                  this.method4810(var10 + 1, 67108864, (byte)-107, var11 + -1);
               }

               if (~arg4 == -2) {
                  this.method4810(var10, 16777216, (byte)-117, var11);
                  this.method4810(var10 - -1, 268435456, (byte)-112, var11 + 1);
               }

               if (arg4 == 2) {
                  this.method4810(var10, 67108864, (byte)-121, var11);
                  this.method4810(var10 - 1, 4194304, (byte)-124, var11 - -1);
               }

               if (~arg4 == -4) {
                  this.method4810(var10, 268435456, (byte)-100, var11);
                  this.method4810(var10 + -1, 16777216, (byte)-124, var11 - 1);
               }
            }

            if (arg2 == 2) {
               if (~arg4 == -1) {
                  this.method4810(var10, 545259520, (byte)-102, var11);
                  this.method4810(var10, 33554432, (byte)-100, var11 + -1);
                  this.method4810(var10 + 1, 134217728, (byte)-128, var11);
               }

               if (arg4 == 1) {
                  this.method4810(var10, 41943040, (byte)-112, var11);
                  this.method4810(var10 - -1, 134217728, (byte)-99, var11);
                  this.method4810(var10, 536870912, (byte)-128, var11 - -1);
               }

               if (~arg4 == -3) {
                  this.method4810(var10, 167772160, (byte)-128, var11);
                  this.method4810(var10, 536870912, (byte)-109, var11 + 1);
                  this.method4810(var10 - 1, 8388608, (byte)-101, var11);
               }

               if (arg4 == 3) {
                  this.method4810(var10, 671088640, (byte)-100, var11);
                  this.method4810(var10 - 1, 8388608, (byte)-117, var11);
                  this.method4810(var10, 33554432, (byte)-111, var11 + -1);
                  return;
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9353[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IIIIIIIII)Z"
   )
   public final boolean method4817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field9345;
         if (arg6 > 1) {
            return class380.method2965(arg0, arg6, arg7, arg6, arg1, arg8, arg2, arg4, true) ? true : this.method4814(arg8, arg0, arg6, arg2, arg4, arg3, arg6, arg7, arg1, (byte)-123);
         } else {
            int var10 = arg4 - -arg0 + -1;
            int var11 = arg1 + -1 + arg7;
            if (~arg4 >= ~arg8 && ~var10 <= ~arg8 && ~arg2 <= ~arg7 && ~arg2 >= ~var11) {
               return true;
            } else if (arg4 + -1 == arg8 && arg2 >= arg7 && arg2 <= var11 && (this.field9352[arg8 - this.field9344][-this.field9348 + arg2] & 8) == 0 && ~(8 & arg3) == -1) {
               return true;
            } else if (arg5 != 2665) {
               return false;
            } else if (~(var10 - -1) == ~arg8 && ~arg7 >= ~arg2 && ~arg2 >= ~var11 && ~(this.field9352[arg8 - this.field9344][-this.field9348 + arg2] & 128) == -1 && ~(2 & arg3) == -1) {
               return true;
            } else if (~(arg7 - 1) == ~arg2 && arg8 >= arg4 && var10 >= arg8 && (this.field9352[-this.field9344 + arg8][arg2 - this.field9348] & 2) == 0 && ~(4 & arg3) == -1) {
               return true;
            } else {
               return ~(var11 - -1) == ~arg2 && ~arg8 <= ~arg4 && arg8 <= var10 && (32 & this.field9352[arg8 - this.field9344][-this.field9348 + arg2]) == 0 && (1 & arg3) == 0;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field9353[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ZZIIIII)V"
   )
   public final void method4818(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field9335;
         int var10 = arg3 - this.field9344;
         int var11 = arg6 - this.field9348;
         if (~arg2 == -1) {
            if (arg4 == 0) {
               this.method4809((byte)74, var10, 128, var11);
               this.method4809((byte)74, var10 + -1, 8, var11);
            }

            if (~arg4 == -2) {
               this.method4809((byte)74, var10, 2, var11);
               this.method4809((byte)74, var10, 32, var11 + 1);
            }

            if (arg4 == 2) {
               this.method4809((byte)74, var10, 8, var11);
               this.method4809((byte)74, var10 + 1, 128, var11);
            }

            if (~arg4 == -4) {
               this.method4809((byte)74, var10, 32, var11);
               this.method4809((byte)74, var10, 2, var11 + -1);
            }
         }

         if (~arg2 == -2 || arg2 == 3) {
            if (~arg4 == -1) {
               this.method4809((byte)74, var10, 1, var11);
               this.method4809((byte)74, var10 + -1, 16, var11 + 1);
            }

            if (arg4 == 1) {
               this.method4809((byte)74, var10, 4, var11);
               this.method4809((byte)74, var10 - -1, 64, var11 + 1);
            }

            if (~arg4 == -3) {
               this.method4809((byte)74, var10, 16, var11);
               this.method4809((byte)74, var10 + 1, 1, var11 - 1);
            }

            if (~arg4 == -4) {
               this.method4809((byte)74, var10, 64, var11);
               this.method4809((byte)74, var10 + -1, 4, var11 - 1);
            }
         }

         if (arg5 == -29417) {
            if (arg2 == 2) {
               if (~arg4 == -1) {
                  this.method4809((byte)74, var10, 130, var11);
                  this.method4809((byte)74, var10 - 1, 8, var11);
                  this.method4809((byte)74, var10, 32, var11 + 1);
               }

               if (arg4 == 1) {
                  this.method4809((byte)74, var10, 10, var11);
                  this.method4809((byte)74, var10, 32, var11 + 1);
                  this.method4809((byte)74, var10 - -1, 128, var11);
               }

               if (arg4 == 2) {
                  this.method4809((byte)74, var10, 40, var11);
                  this.method4809((byte)74, var10 - -1, 128, var11);
                  this.method4809((byte)74, var10, 2, var11 + -1);
               }

               if (~arg4 == -4) {
                  this.method4809((byte)74, var10, 160, var11);
                  this.method4809((byte)74, var10, 2, var11 - 1);
                  this.method4809((byte)74, var10 - 1, 8, var11);
               }
            }

            if (arg0) {
               if (~arg2 == -1) {
                  if (arg4 == 0) {
                     this.method4809((byte)74, var10, 65536, var11);
                     this.method4809((byte)74, var10 + -1, 4096, var11);
                  }

                  if (~arg4 == -2) {
                     this.method4809((byte)74, var10, 1024, var11);
                     this.method4809((byte)74, var10, 16384, var11 + 1);
                  }

                  if (arg4 == 2) {
                     this.method4809((byte)74, var10, 4096, var11);
                     this.method4809((byte)74, var10 - -1, 65536, var11);
                  }

                  if (arg4 == 3) {
                     this.method4809((byte)74, var10, 16384, var11);
                     this.method4809((byte)74, var10, 1024, var11 - 1);
                  }
               }

               if (arg2 == 1 || ~arg2 == -4) {
                  if (arg4 == 0) {
                     this.method4809((byte)74, var10, 512, var11);
                     this.method4809((byte)74, var10 + -1, 8192, var11 - -1);
                  }

                  if (~arg4 == -2) {
                     this.method4809((byte)74, var10, 2048, var11);
                     this.method4809((byte)74, var10 + 1, 32768, var11 + 1);
                  }

                  if (arg4 == 2) {
                     this.method4809((byte)74, var10, 8192, var11);
                     this.method4809((byte)74, var10 + 1, 512, var11 + -1);
                  }

                  if (~arg4 == -4) {
                     this.method4809((byte)74, var10, 32768, var11);
                     this.method4809((byte)74, var10 + -1, 2048, var11 + -1);
                  }
               }

               if (~arg2 == -3) {
                  if (~arg4 == -1) {
                     this.method4809((byte)74, var10, 66560, var11);
                     this.method4809((byte)74, var10 + -1, 4096, var11);
                     this.method4809((byte)74, var10, 16384, var11 + 1);
                  }

                  if (arg4 == 1) {
                     this.method4809((byte)74, var10, 5120, var11);
                     this.method4809((byte)74, var10, 16384, var11 - -1);
                     this.method4809((byte)74, var10 + 1, 65536, var11);
                  }

                  if (~arg4 == -3) {
                     this.method4809((byte)74, var10, 20480, var11);
                     this.method4809((byte)74, var10 + 1, 65536, var11);
                     this.method4809((byte)74, var10, 1024, var11 + -1);
                  }

                  if (~arg4 == -4) {
                     this.method4809((byte)74, var10, 81920, var11);
                     this.method4809((byte)74, var10, 1024, var11 + -1);
                     this.method4809((byte)74, var10 + -1, 4096, var11);
                  }
               }
            }

            if (arg1) {
               if (~arg2 == -1) {
                  if (arg4 == 0) {
                     this.method4809((byte)74, var10, 536870912, var11);
                     this.method4809((byte)74, var10 + -1, 33554432, var11);
                  }

                  if (~arg4 == -2) {
                     this.method4809((byte)74, var10, 8388608, var11);
                     this.method4809((byte)74, var10, 134217728, var11 + 1);
                  }

                  if (~arg4 == -3) {
                     this.method4809((byte)74, var10, 33554432, var11);
                     this.method4809((byte)74, var10 + 1, 536870912, var11);
                  }

                  if (~arg4 == -4) {
                     this.method4809((byte)74, var10, 134217728, var11);
                     this.method4809((byte)74, var10, 8388608, var11 + -1);
                  }
               }

               if (arg2 == 1 || ~arg2 == -4) {
                  if (~arg4 == -1) {
                     this.method4809((byte)74, var10, 4194304, var11);
                     this.method4809((byte)74, var10 + -1, 67108864, var11 + 1);
                  }

                  if (arg4 == 1) {
                     this.method4809((byte)74, var10, 16777216, var11);
                     this.method4809((byte)74, var10 + 1, 268435456, var11 + 1);
                  }

                  if (arg4 == 2) {
                     this.method4809((byte)74, var10, 67108864, var11);
                     this.method4809((byte)74, var10 - -1, 4194304, var11 + -1);
                  }

                  if (~arg4 == -4) {
                     this.method4809((byte)74, var10, 268435456, var11);
                     this.method4809((byte)74, var10 + -1, 16777216, var11 + -1);
                  }
               }

               if (arg2 == 2) {
                  if (~arg4 == -1) {
                     this.method4809((byte)74, var10, 545259520, var11);
                     this.method4809((byte)74, var10 + -1, 33554432, var11);
                     this.method4809((byte)74, var10, 134217728, var11 + 1);
                  }

                  if (~arg4 == -2) {
                     this.method4809((byte)74, var10, 41943040, var11);
                     this.method4809((byte)74, var10, 134217728, var11 + 1);
                     this.method4809((byte)74, var10 + 1, 536870912, var11);
                  }

                  if (arg4 == 2) {
                     this.method4809((byte)74, var10, 167772160, var11);
                     this.method4809((byte)74, var10 - -1, 536870912, var11);
                     this.method4809((byte)74, var10, 8388608, var11 + -1);
                  }

                  if (~arg4 == -4) {
                     this.method4809((byte)74, var10, 671088640, var11);
                     this.method4809((byte)74, var10, 8388608, var11 + -1);
                     this.method4809((byte)74, var10 + -1, 33554432, var11);
                     return;
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9353[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method4819(byte arg0, int arg1, int arg2) {
      try {
         ++field9347;
         int var7 = arg2 - this.field9344;
         int var6 = arg1 - this.field9348;
         if (arg0 == -25) {
            this.field9352[var7][var6] = class697.method5101(this.field9352[var7][var6], -262145);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9353[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4820(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ZZIIIIIB)V"
   )
   public final void method4821(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
      boolean var9 = client.field10022;

      try {
         ++field9343;
         int var10 = 256;
         if (arg0) {
            var10 |= 131072;
         }

         int var17 = arg4 - this.field9344;
         if (arg2 == 1 || ~arg2 == -4) {
            int var11 = arg5;
            arg5 = arg6;
            arg6 = var11;
         }

         int var16 = arg3 - this.field9348;
         if (arg1) {
            var10 |= 1073741824;
         }

         int var12 = var17;
         int var10000;
         byte var10001;
         if (var9) {
            var10000 = ~var17;
            var10001 = -1;
         } else if (var17 >= var17 + arg5) {
            var10000 = arg7;
            var10001 = 38;
            if (!var9) {
               if (arg7 != 38) {
                  this.method4817(-55, -68, 50, 98, 99, -90, -22, 20, 56);
                  return;
               }

               return;
            }
         } else {
            var10000 = ~var17;
            var10001 = -1;
         }

         while(true) {
            if (var10000 > var10001) {
               ++var12;
            } else if (this.field9331 <= var12) {
               ++var12;
            } else {
               int var13 = var16;
               if (var9) {
                  if (var16 >= 0 && this.field9341 > var16) {
                     this.method4809((byte)74, var12, var10, var16);
                  }

                  var13 = var16 + 1;
               }

               while(var16 - -arg6 > var13) {
                  if (var13 >= 0 && this.field9341 > var13) {
                     this.method4809((byte)74, var12, var10, var13);
                  }

                  ++var13;
               }

               ++var12;
            }

            if (var12 >= var17 + arg5) {
               var10000 = arg7;
               var10001 = 38;
               if (!var9) {
                  if (arg7 != 38) {
                     this.method4817(-55, -68, 50, 98, 99, -90, -22, 20, 56);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = ~var12;
               var10001 = -1;
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field9353[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method4822(boolean arg0, int arg1, int arg2) {
      try {
         int var6 = arg1 - this.field9348;
         ++field9334;
         int var7 = arg2 - this.field9344;
         this.field9352[var7][var6] = class91.method932(this.field9352[var7][var6], 2097152);
         if (!arg0) {
            this.method4819((byte)21, -3, -39);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9353[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ZIIZIZI)V"
   )
   public final void method4823(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
      boolean var8 = client.field10022;

      RuntimeException var10000;
      label65: {
         int var9;
         int var10;
         boolean var10001;
         try {
            ++field9340;
            var9 = 256;
            if (arg0) {
               var9 |= 131072;
            }

            arg1 -= this.field9348;
            if (arg5) {
               var9 |= 1073741824;
            }

            arg2 -= this.field9344;
            var10 = arg2;
            if (arg3) {
               return;
            }
         } catch (RuntimeException var15) {
            var10000 = var15;
            var10001 = false;
            break label65;
         }

         while(true) {
            label60: {
               try {
                  if (~(arg2 + arg4) < ~var10) {
                     if (var10 >= 0 && this.field9331 > var10) {
                        int var11 = arg1;
                        if (var8 || arg1 < arg1 + arg6) {
                           do {
                              if (~var11 <= -1 && var11 < this.field9341) {
                                 this.method4810(var11, var9, (byte)-128, var10);
                              }

                              ++var11;
                           } while(var11 < arg1 + arg6);
                        }
                     }
                     break label60;
                  }
               } catch (RuntimeException var14) {
                  var10000 = var14;
                  var10001 = false;
                  break;
               }

               if (!var8) {
                  return;
               }
            }

            try {
               ++var10;
            } catch (RuntimeException var13) {
               var10000 = var13;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var12 = var10000;
      throw class612.method4503(var12, field9353[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4824(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bc",
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
            var10005 = 19;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
