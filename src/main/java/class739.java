import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class739 {
   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10983 = new String[]{method5395(method5394("1f\u001eP\t|")), method5395(method5394("1f\u001eP\u0005|")), method5395(method5394("1f\u001eP\u001d|")), method5395(method5394("1f\u001eP\u0003|")), method5395(method5394("1f\u001eP\u0006|")), method5395(method5394("1f\u001eP\u0002|")), method5395(method5394("1f\u001eP\f|")), method5395(method5394("1f\u001eP\u000b|")), method5395(method5394("1f\u001eP\u000f|")), method5395(method5394("1f\u001eP\u0004|")), method5395(method5394("1f\u001eP\n|")), method5395(method5394("1f\u001eP\u0000|")), method5395(method5394("1f\u001eP\u0001|")), method5395(method5394("1f\u001eP\u0007|")), method5395(method5394("1f\u001eP\b|")), method5395(method5394("1f\u001eP\u000e|"))};
   @OriginalMember(
      owner = "client!ega",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field10966 = false;
   @OriginalMember(
      owner = "client!ega",
      name = "q",
      descriptor = "J"
   )
   public static long field10980 = 0L;
   @OriginalMember(
      owner = "client!ega",
      name = "e",
      descriptor = "Lcha;"
   )
   public static class227 field10971 = new class227();
   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "I"
   )
   public static int field10959;
   @OriginalMember(
      owner = "client!ega",
      name = "o",
      descriptor = "I"
   )
   public static int field10960;
   @OriginalMember(
      owner = "client!ega",
      name = "c",
      descriptor = "I"
   )
   public int field10961;
   @OriginalMember(
      owner = "client!ega",
      name = "x",
      descriptor = "I"
   )
   public int field10962;
   @OriginalMember(
      owner = "client!ega",
      name = "n",
      descriptor = "I"
   )
   public int field10963;
   @OriginalMember(
      owner = "client!ega",
      name = "g",
      descriptor = "I"
   )
   public static int field10964;
   @OriginalMember(
      owner = "client!ega",
      name = "l",
      descriptor = "I"
   )
   public static int field10965;
   @OriginalMember(
      owner = "client!ega",
      name = "t",
      descriptor = "I"
   )
   public static int field10967;
   @OriginalMember(
      owner = "client!ega",
      name = "f",
      descriptor = "I"
   )
   public static int field10968;
   @OriginalMember(
      owner = "client!ega",
      name = "s",
      descriptor = "I"
   )
   public static int field10969;
   @OriginalMember(
      owner = "client!ega",
      name = "r",
      descriptor = "I"
   )
   public static int field10970;
   @OriginalMember(
      owner = "client!ega",
      name = "d",
      descriptor = "I"
   )
   public static int field10972;
   @OriginalMember(
      owner = "client!ega",
      name = "w",
      descriptor = "I"
   )
   public static int field10973;
   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "I"
   )
   public static int field10974;
   @OriginalMember(
      owner = "client!ega",
      name = "m",
      descriptor = "I"
   )
   public static int field10975;
   @OriginalMember(
      owner = "client!ega",
      name = "k",
      descriptor = "I"
   )
   public static int field10976;
   @OriginalMember(
      owner = "client!ega",
      name = "i",
      descriptor = "I"
   )
   public static int field10977;
   @OriginalMember(
      owner = "client!ega",
      name = "p",
      descriptor = "I"
   )
   public static int field10978;
   @OriginalMember(
      owner = "client!ega",
      name = "j",
      descriptor = "I"
   )
   public int field10981;
   @OriginalMember(
      owner = "client!ega",
      name = "u",
      descriptor = "I"
   )
   public static int field10982;
   @OriginalMember(
      owner = "client!ega",
      name = "h",
      descriptor = "[[I"
   )
   public int[][] field10979;

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIIIIIII)Z",
      line = 3
   )
   public final boolean method5378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg5 != -1) {
            return false;
         } else {
            ++field10969;
            if (~arg1 == -2) {
               if (arg0 == arg7 && ~arg3 == ~arg4) {
                  return true;
               }
            } else if (arg7 >= arg0 && ~(arg0 + arg1 + -1) <= ~arg7 && arg3 <= arg3 && arg1 + arg3 + -1 >= arg3) {
               return true;
            }

            int var16 = arg7 - this.field10981;
            int var15 = arg4 - this.field10962;
            int var13 = arg0 - this.field10981;
            int var14 = arg3 - this.field10962;
            if (arg1 != 1) {
               int var9 = var13 + arg1 + -1;
               int var10 = arg1 - 1 + var15;
               if (arg6 == 6 || ~arg6 == -8) {
                  if (arg6 == 7) {
                     arg2 = 3 & arg2 + 2;
                  }

                  if (arg2 != 0) {
                     if (~arg2 != -2) {
                        if (arg2 == 2) {
                           if (-arg1 + var16 == var13 && var14 >= var15 && ~var10 <= ~var14 && (this.field10979[var9][var14] & 8) == 0) {
                              return true;
                           }

                           if (~var16 <= ~var13 && ~var16 >= ~var9 && ~(var14 + 1) == ~var15 && (32 & this.field10979[var16][var15]) == 0) {
                              return true;
                           }
                        } else if (arg2 == 3) {
                           if (var16 + 1 == var13 && var14 >= var15 && ~var10 <= ~var14 && (128 & this.field10979[var13][var14]) == 0) {
                              return true;
                           }

                           if (~var13 >= ~var16 && ~var9 <= ~var16 && var14 - -1 == var15 && ~(this.field10979[var16][var15] & 32) == -1) {
                              return true;
                           }
                        }
                     } else {
                        if (var16 - arg1 == var13 && ~var15 >= ~var14 && ~var10 <= ~var14 && ~(8 & this.field10979[var9][var14]) == -1) {
                           return true;
                        }

                        if (~var16 <= ~var13 && var16 <= var9 && ~(var14 - arg1) == ~var15 && ~(this.field10979[var16][var10] & 2) == -1) {
                           return true;
                        }
                     }
                  } else {
                     if (~(var16 + 1) == ~var13 && var14 >= var15 && var10 >= var14 && (128 & this.field10979[var13][var14]) == 0) {
                        return true;
                     }

                     if (~var16 <= ~var13 && ~var9 <= ~var16 && ~(var14 - arg1) == ~var15 && (this.field10979[var16][var10] & 2) == 0) {
                        return true;
                     }
                  }
               }

               if (~arg6 == -9) {
                  if (~var16 <= ~var13 && ~var9 <= ~var16 && var14 - -1 == var15 && (32 & this.field10979[var16][var15]) == 0) {
                     return true;
                  }

                  if (~var13 >= ~var16 && var16 <= var9 && var14 - arg1 == var15 && (this.field10979[var16][var10] & 2) == 0) {
                     return true;
                  }

                  if (~(var16 - arg1) == ~var13 && ~var15 >= ~var14 && ~var10 <= ~var14 && (8 & this.field10979[var9][var14]) == 0) {
                     return true;
                  }

                  if (~(var16 - -1) == ~var13 && var14 >= var15 && var14 <= var10 && ~(this.field10979[var13][var14] & 128) == -1) {
                     return true;
                  }
               }
            } else {
               if (arg6 == 6 || ~arg6 == -8) {
                  if (~arg6 == -8) {
                     arg2 = arg2 + 2 & 3;
                  }

                  if (arg2 != 0) {
                     if (~arg2 != -2) {
                        if (arg2 != 2) {
                           if (arg2 == 3) {
                              if (var16 + 1 == var13 && var14 == var15 && ~(128 & this.field10979[var13][var15]) == -1) {
                                 return true;
                              }

                              if (~var13 == ~var16 && ~(var14 - -1) == ~var15 && ~(this.field10979[var13][var15] & 32) == -1) {
                                 return true;
                              }
                           }
                        } else {
                           if (~(var16 + -1) == ~var13 && ~var14 == ~var15 && ~(8 & this.field10979[var13][var15]) == -1) {
                              return true;
                           }

                           if (var13 == var16 && var14 + 1 == var15 && ~(this.field10979[var13][var15] & 32) == -1) {
                              return true;
                           }
                        }
                     } else {
                        if (~(var16 - 1) == ~var13 && ~var14 == ~var15 && (this.field10979[var13][var15] & 8) == 0) {
                           return true;
                        }

                        if (var13 == var16 && ~(var14 + -1) == ~var15 && (this.field10979[var13][var15] & 2) == 0) {
                           return true;
                        }
                     }
                  } else {
                     if (~(var16 + 1) == ~var13 && ~var14 == ~var15 && ~(this.field10979[var13][var15] & 128) == -1) {
                        return true;
                     }

                     if (var13 == var16 && ~(var14 + -1) == ~var15 && ~(2 & this.field10979[var13][var15]) == -1) {
                        return true;
                     }
                  }
               }

               if (arg6 == 8) {
                  if (var13 == var16 && ~(var14 + 1) == ~var15 && (32 & this.field10979[var13][var15]) == 0) {
                     return true;
                  }

                  if (var13 == var16 && ~(var14 + -1) == ~var15 && ~(this.field10979[var13][var15] & 2) == -1) {
                     return true;
                  }

                  if (~(var16 - 1) == ~var13 && ~var14 == ~var15 && ~(this.field10979[var13][var15] & 8) == -1) {
                     return true;
                  }

                  if (var16 + 1 == var13 && ~var14 == ~var15 && (128 & this.field10979[var13][var15]) == 0) {
                     return true;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10983[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "(III)V",
      line = 197
   )
   public final void method5379(int arg0, int arg1, int arg2) {
      try {
         ++field10970;
         int var6 = arg0 - this.field10962;
         if (arg2 != -31066) {
            field10966 = true;
         }

         int var7 = arg1 - this.field10981;
         this.field10979[var7][var6] = class379.method2928(this.field10979[var7][var6], 262144);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10983[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIZZIIII)V",
      line = 212
   )
   public final void method5380(int param1, int param2, boolean param3, boolean param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(Z)V",
      line = 267
   )
   public static void method5381(boolean arg0) {
      try {
         if (!arg0) {
            field10971 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10983[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "c",
      descriptor = "(III)V",
      line = 283
   )
   public final void method5382(int arg0, int arg1, int arg2) {
      try {
         int var7 = arg2 - this.field10981;
         if (arg0 != 15645) {
            this.method5388(true, false, -19, 64, -99, -94, (byte)126);
         }

         int var6 = arg1 - this.field10962;
         ++field10972;
         this.field10979[var7][var6] = class379.method2928(this.field10979[var7][var6], 2097152);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10983[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIII)V",
      line = 298
   )
   private final void method5383(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10979[arg1][arg3] = class379.method2928(this.field10979[arg1][arg3], arg2);
         if (arg0 > 5) {
            ++field10965;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10983[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIZI)V",
      line = 309
   )
   private final void method5384(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg2) {
            this.field10961 = 12;
         }

         ++field10973;
         this.field10979[arg3][arg1] = class153.method1262(this.field10979[arg3][arg1], ~arg0);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10983[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(ZIIIBIZ)V",
      line = 320
   )
   public final void method5385(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
      try {
         ++field10977;
         int var11 = arg2 - this.field10962;
         if (arg4 <= -107) {
            int var10 = arg1 - this.field10981;
            if (arg3 == 0) {
               if (~arg5 == -1) {
                  this.method5384(128, var11, false, var10);
                  this.method5384(8, var11, false, var10 + -1);
               }

               if (arg5 == 1) {
                  this.method5384(2, var11, false, var10);
                  this.method5384(32, var11 + 1, false, var10);
               }

               if (arg5 == 2) {
                  this.method5384(8, var11, false, var10);
                  this.method5384(128, var11, false, var10 + 1);
               }

               if (~arg5 == -4) {
                  this.method5384(32, var11, false, var10);
                  this.method5384(2, var11 + -1, false, var10);
               }
            }

            if (arg3 == 1 || arg3 == 3) {
               if (~arg5 == -1) {
                  this.method5384(1, var11, false, var10);
                  this.method5384(16, var11 - -1, false, var10 + -1);
               }

               if (arg5 == 1) {
                  this.method5384(4, var11, false, var10);
                  this.method5384(64, var11 - -1, false, var10 + 1);
               }

               if (arg5 == 2) {
                  this.method5384(16, var11, false, var10);
                  this.method5384(1, var11 - 1, false, var10 + 1);
               }

               if (arg5 == 3) {
                  this.method5384(64, var11, false, var10);
                  this.method5384(4, var11 + -1, false, var10 + -1);
               }
            }

            if (arg3 == 2) {
               if (~arg5 == -1) {
                  this.method5384(130, var11, false, var10);
                  this.method5384(8, var11, false, var10 + -1);
                  this.method5384(32, var11 + 1, false, var10);
               }

               if (~arg5 == -2) {
                  this.method5384(10, var11, false, var10);
                  this.method5384(32, var11 + 1, false, var10);
                  this.method5384(128, var11, false, var10 + 1);
               }

               if (arg5 == 2) {
                  this.method5384(40, var11, false, var10);
                  this.method5384(128, var11, false, var10 + 1);
                  this.method5384(2, var11 + -1, false, var10);
               }

               if (~arg5 == -4) {
                  this.method5384(160, var11, false, var10);
                  this.method5384(2, var11 + -1, false, var10);
                  this.method5384(8, var11, false, var10 + -1);
               }
            }

            if (arg6) {
               if (arg3 == 0) {
                  if (arg5 == 0) {
                     this.method5384(65536, var11, false, var10);
                     this.method5384(4096, var11, false, var10 + -1);
                  }

                  if (~arg5 == -2) {
                     this.method5384(1024, var11, false, var10);
                     this.method5384(16384, var11 - -1, false, var10);
                  }

                  if (arg5 == 2) {
                     this.method5384(4096, var11, false, var10);
                     this.method5384(65536, var11, false, var10 + 1);
                  }

                  if (~arg5 == -4) {
                     this.method5384(16384, var11, false, var10);
                     this.method5384(1024, var11 + -1, false, var10);
                  }
               }

               if (~arg3 == -2 || ~arg3 == -4) {
                  if (arg5 == 0) {
                     this.method5384(512, var11, false, var10);
                     this.method5384(8192, var11 + 1, false, var10 + -1);
                  }

                  if (~arg5 == -2) {
                     this.method5384(2048, var11, false, var10);
                     this.method5384(32768, var11 + 1, false, var10 + 1);
                  }

                  if (arg5 == 2) {
                     this.method5384(8192, var11, false, var10);
                     this.method5384(512, var11 + -1, false, var10 + 1);
                  }

                  if (~arg5 == -4) {
                     this.method5384(32768, var11, false, var10);
                     this.method5384(2048, var11 + -1, false, var10 - 1);
                  }
               }

               if (arg3 == 2) {
                  if (~arg5 == -1) {
                     this.method5384(66560, var11, false, var10);
                     this.method5384(4096, var11, false, var10 + -1);
                     this.method5384(16384, var11 + 1, false, var10);
                  }

                  if (arg5 == 1) {
                     this.method5384(5120, var11, false, var10);
                     this.method5384(16384, var11 + 1, false, var10);
                     this.method5384(65536, var11, false, var10 + 1);
                  }

                  if (arg5 == 2) {
                     this.method5384(20480, var11, false, var10);
                     this.method5384(65536, var11, false, var10 + 1);
                     this.method5384(1024, var11 + -1, false, var10);
                  }

                  if (~arg5 == -4) {
                     this.method5384(81920, var11, false, var10);
                     this.method5384(1024, var11 + -1, false, var10);
                     this.method5384(4096, var11, false, var10 + -1);
                  }
               }
            }

            if (arg0) {
               if (arg3 == 0) {
                  if (arg5 == 0) {
                     this.method5384(536870912, var11, false, var10);
                     this.method5384(33554432, var11, false, var10 - 1);
                  }

                  if (arg5 == 1) {
                     this.method5384(8388608, var11, false, var10);
                     this.method5384(134217728, var11 + 1, false, var10);
                  }

                  if (arg5 == 2) {
                     this.method5384(33554432, var11, false, var10);
                     this.method5384(536870912, var11, false, var10 + 1);
                  }

                  if (~arg5 == -4) {
                     this.method5384(134217728, var11, false, var10);
                     this.method5384(8388608, var11 + -1, false, var10);
                  }
               }

               if (arg3 == 1 || arg3 == 3) {
                  if (arg5 == 0) {
                     this.method5384(4194304, var11, false, var10);
                     this.method5384(67108864, var11 + 1, false, var10 + -1);
                  }

                  if (~arg5 == -2) {
                     this.method5384(16777216, var11, false, var10);
                     this.method5384(268435456, var11 + 1, false, var10 - -1);
                  }

                  if (arg5 == 2) {
                     this.method5384(67108864, var11, false, var10);
                     this.method5384(4194304, var11 - 1, false, var10 - -1);
                  }

                  if (arg5 == 3) {
                     this.method5384(268435456, var11, false, var10);
                     this.method5384(16777216, var11 - 1, false, var10 + -1);
                  }
               }

               if (arg3 == 2) {
                  if (arg5 == 0) {
                     this.method5384(545259520, var11, false, var10);
                     this.method5384(33554432, var11, false, var10 + -1);
                     this.method5384(134217728, var11 + 1, false, var10);
                  }

                  if (~arg5 == -2) {
                     this.method5384(41943040, var11, false, var10);
                     this.method5384(134217728, var11 + 1, false, var10);
                     this.method5384(536870912, var11, false, var10 - -1);
                  }

                  if (arg5 == 2) {
                     this.method5384(167772160, var11, false, var10);
                     this.method5384(536870912, var11, false, var10 + 1);
                     this.method5384(8388608, var11 + -1, false, var10);
                  }

                  if (arg5 == 3) {
                     this.method5384(671088640, var11, false, var10);
                     this.method5384(8388608, var11 + -1, false, var10);
                     this.method5384(33554432, var11, false, var10 - 1);
                     return;
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10983[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIIIIIBIII)Z",
      line = 640
   )
   public final boolean method5386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
      int var11 = client.field4530;

      try {
         ++field10974;
         int var12 = arg3 + arg7;
         int var13 = arg5 - -arg0;
         if (arg6 != 101) {
            field10982 = -67;
         }

         int var14 = arg8 + arg9;
         int var15 = arg1 + arg4;
         if (arg7 == var14 && (2 & arg2) == 0) {
            int var16 = ~arg4 > ~arg5 ? arg5 : arg4;
            int var17 = ~var15 >= ~var13 ? var15 : var13;
            if (var11 != 0) {
               if ((8 & this.field10979[var14 - (1 - -this.field10981)][-this.field10962 + var16]) == 0) {
                  return true;
               }

               ++var16;
            }

            while(true) {
               while(var17 > var16) {
                  if ((8 & this.field10979[var14 - (1 - -this.field10981)][-this.field10962 + var16]) == 0) {
                     return true;
                  }

                  ++var16;
               }

               if (var11 == 0) {
                  if (var11 == 0) {
                     return false;
                  }
                  break;
               }

               ++var16;
            }
         }

         if (arg8 == var12 && ~(8 & arg2) == -1) {
            int var18 = ~arg4 <= ~arg5 ? arg4 : arg5;
            int var19 = var15 <= var13 ? var15 : var13;
            if (var11 != 0) {
               if ((128 & this.field10979[-this.field10981 + arg8][var18 - this.field10962]) == 0) {
                  return true;
               }

               ++var18;
            }

            while(true) {
               while(var18 < var19) {
                  if ((128 & this.field10979[-this.field10981 + arg8][var18 - this.field10962]) == 0) {
                     return true;
                  }

                  ++var18;
               }

               if (var11 == 0) {
                  if (var11 == 0) {
                     return false;
                  }
                  break;
               }

               ++var18;
            }
         }

         if (arg5 == var15 && ~(arg2 & 1) == -1) {
            int var20 = arg8 < arg7 ? arg7 : arg8;
            int var21 = ~var14 < ~var12 ? var12 : var14;
            if (var11 != 0) {
               if (~(this.field10979[-this.field10981 + var20][var15 + -1 + -this.field10962] & 2) == -1) {
                  return true;
               }

               ++var20;
            }

            while(true) {
               while(~var21 < ~var20) {
                  if (~(this.field10979[-this.field10981 + var20][var15 + -1 + -this.field10962] & 2) == -1) {
                     return true;
                  }

                  ++var20;
               }

               if (var11 == 0) {
                  if (var11 == 0) {
                     return false;
                  }
                  break;
               }

               ++var20;
            }
         }

         if (~arg4 == ~var13 && ~(arg2 & 4) == -1) {
            int var22 = ~arg7 >= ~arg8 ? arg8 : arg7;
            int var23 = var14 > var12 ? var12 : var14;
            if (var11 != 0 || var23 > var22) {
               do {
                  if (~(32 & this.field10979[-this.field10981 + var22][arg4 - this.field10962]) == -1) {
                     return true;
                  }

                  ++var22;
               } while(var23 > var22);
            }
         }

         return false;
      } catch (RuntimeException var25) {
         throw class670.method4877(var25, field10983[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(I)V",
      line = 732
   )
   public final void method5387(int arg0) {
      int var2 = client.field4530;

      try {
         ++field10964;
         int var3 = 0;
         if (arg0 != 3) {
            this.method5383(47, -84, 105, 104);
            if (var2 == 0 && ~this.field10961 >= ~var3) {
               return;
            }
         } else if (~this.field10961 >= ~var3) {
            return;
         }

         do {
            int var4 = 0;
            if (var2 != 0) {
               if (var3 != 0) {
                  if (~var4 != -1) {
                     if (this.field10961 + -5 > var3) {
                        if (~(this.field10963 + -5) >= ~var4) {
                           this.field10979[var3][var4] = -1;
                           if (var2 != 0) {
                              this.field10979[var3][var4] = 2097152;
                              ++var4;
                           } else {
                              ++var4;
                           }
                        } else {
                           this.field10979[var3][var4] = 2097152;
                           ++var4;
                        }
                     } else {
                        this.field10979[var3][var4] = -1;
                        if (var2 != 0) {
                           this.field10979[var3][var4] = 2097152;
                           ++var4;
                        } else {
                           ++var4;
                        }
                     }
                  } else {
                     this.field10979[var3][var4] = -1;
                     if (var2 != 0) {
                        this.field10979[var3][var4] = 2097152;
                        ++var4;
                     } else {
                        ++var4;
                     }
                  }
               } else {
                  this.field10979[var3][var4] = -1;
                  if (var2 != 0) {
                     this.field10979[var3][var4] = 2097152;
                     ++var4;
                  } else {
                     ++var4;
                  }
               }
            }

            while(true) {
               while(~var4 > ~this.field10963) {
                  if (var3 != 0) {
                     if (~var4 != -1) {
                        if (this.field10961 + -5 > var3) {
                           if (~(this.field10963 + -5) >= ~var4) {
                              this.field10979[var3][var4] = -1;
                              if (var2 != 0) {
                                 this.field10979[var3][var4] = 2097152;
                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           } else {
                              this.field10979[var3][var4] = 2097152;
                              ++var4;
                           }
                        } else {
                           this.field10979[var3][var4] = -1;
                           if (var2 != 0) {
                              this.field10979[var3][var4] = 2097152;
                              ++var4;
                           } else {
                              ++var4;
                           }
                        }
                     } else {
                        this.field10979[var3][var4] = -1;
                        if (var2 != 0) {
                           this.field10979[var3][var4] = 2097152;
                           ++var4;
                        } else {
                           ++var4;
                        }
                     }
                  } else {
                     this.field10979[var3][var4] = -1;
                     if (var2 != 0) {
                        this.field10979[var3][var4] = 2097152;
                        ++var4;
                     } else {
                        ++var4;
                     }
                  }
               }

               if (var2 == 0) {
                  ++var3;
                  break;
               }

               if (var2 != 0) {
                  this.field10979[var3][var4] = 2097152;
                  ++var4;
               } else {
                  ++var4;
               }
            }
         } while(~this.field10961 < ~var3);

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10983[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(ZZIIIIB)V",
      line = 766
   )
   public final void method5388(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         ++field10960;
         int var11 = arg4 - this.field10962;
         int var10 = arg2 - this.field10981;
         if (~arg3 == -1) {
            if (~arg5 == -1) {
               this.method5383(arg6 + 89, var10, 128, var11);
               this.method5383(98, var10 + -1, 8, var11);
            }

            if (~arg5 == -2) {
               this.method5383(26, var10, 2, var11);
               this.method5383(arg6 ^ -26, var10, 32, var11 + 1);
            }

            if (~arg5 == -3) {
               this.method5383(40, var10, 8, var11);
               this.method5383(15, var10 - -1, 128, var11);
            }

            if (arg5 == 3) {
               this.method5383(30, var10, 32, var11);
               this.method5383(6, var10, 2, var11 - 1);
            }
         }

         if (arg6 == -37) {
            if (arg3 == 1 || arg3 == 3) {
               if (~arg5 == -1) {
                  this.method5383(24, var10, 1, var11);
                  this.method5383(arg6 ^ -42, var10 - 1, 16, var11 + 1);
               }

               if (~arg5 == -2) {
                  this.method5383(60, var10, 4, var11);
                  this.method5383(79, var10 + 1, 64, var11 + 1);
               }

               if (arg5 == 2) {
                  this.method5383(arg6 ^ -15, var10, 16, var11);
                  this.method5383(9, var10 + 1, 1, var11 + -1);
               }

               if (arg5 == 3) {
                  this.method5383(46, var10, 64, var11);
                  this.method5383(16, var10 + -1, 4, var11 + -1);
               }
            }

            if (~arg3 == -3) {
               if (~arg5 == -1) {
                  this.method5383(58, var10, 130, var11);
                  this.method5383(arg6 ^ -29, var10 - 1, 8, var11);
                  this.method5383(118, var10, 32, var11 + 1);
               }

               if (~arg5 == -2) {
                  this.method5383(121, var10, 10, var11);
                  this.method5383(arg6 ^ -54, var10, 32, var11 + 1);
                  this.method5383(21, var10 + 1, 128, var11);
               }

               if (arg5 == 2) {
                  this.method5383(77, var10, 40, var11);
                  this.method5383(arg6 ^ -54, var10 + 1, 128, var11);
                  this.method5383(arg6 + 60, var10, 2, var11 + -1);
               }

               if (arg5 == 3) {
                  this.method5383(arg6 ^ -81, var10, 160, var11);
                  this.method5383(53, var10, 2, var11 - 1);
                  this.method5383(79, var10 + -1, 8, var11);
               }
            }

            if (arg1) {
               if (~arg3 == -1) {
                  if (arg5 == 0) {
                     this.method5383(100, var10, 65536, var11);
                     this.method5383(arg6 ^ -95, var10 + -1, 4096, var11);
                  }

                  if (~arg5 == -2) {
                     this.method5383(92, var10, 1024, var11);
                     this.method5383(arg6 ^ -13, var10, 16384, var11 + 1);
                  }

                  if (~arg5 == -3) {
                     this.method5383(120, var10, 4096, var11);
                     this.method5383(70, var10 - -1, 65536, var11);
                  }

                  if (arg5 == 3) {
                     this.method5383(78, var10, 16384, var11);
                     this.method5383(78, var10, 1024, var11 - 1);
                  }
               }

               if (~arg3 == -2 || arg3 == 3) {
                  if (arg5 == 0) {
                     this.method5383(arg6 + 132, var10, 512, var11);
                     this.method5383(14, var10 + -1, 8192, var11 - -1);
                  }

                  if (~arg5 == -2) {
                     this.method5383(110, var10, 2048, var11);
                     this.method5383(114, var10 + 1, 32768, var11 - -1);
                  }

                  if (arg5 == 2) {
                     this.method5383(49, var10, 8192, var11);
                     this.method5383(78, var10 + 1, 512, var11 + -1);
                  }

                  if (~arg5 == -4) {
                     this.method5383(14, var10, 32768, var11);
                     this.method5383(111, var10 + -1, 2048, var11 + -1);
                  }
               }

               if (arg3 == 2) {
                  if (arg5 == 0) {
                     this.method5383(88, var10, 66560, var11);
                     this.method5383(arg6 ^ -105, var10 + -1, 4096, var11);
                     this.method5383(47, var10, 16384, var11 + 1);
                  }

                  if (arg5 == 1) {
                     this.method5383(98, var10, 5120, var11);
                     this.method5383(arg6 + 95, var10, 16384, var11 + 1);
                     this.method5383(41, var10 + 1, 65536, var11);
                  }

                  if (~arg5 == -3) {
                     this.method5383(arg6 ^ -48, var10, 20480, var11);
                     this.method5383(arg6 + 68, var10 + 1, 65536, var11);
                     this.method5383(43, var10, 1024, var11 + -1);
                  }

                  if (arg5 == 3) {
                     this.method5383(45, var10, 81920, var11);
                     this.method5383(34, var10, 1024, var11 + -1);
                     this.method5383(arg6 ^ -57, var10 + -1, 4096, var11);
                  }
               }
            }

            if (arg0) {
               if (arg3 == 0) {
                  if (~arg5 == -1) {
                     this.method5383(99, var10, 536870912, var11);
                     this.method5383(arg6 ^ -49, var10 - 1, 33554432, var11);
                  }

                  if (~arg5 == -2) {
                     this.method5383(37, var10, 8388608, var11);
                     this.method5383(arg6 + 123, var10, 134217728, var11 + 1);
                  }

                  if (arg5 == 2) {
                     this.method5383(arg6 ^ -72, var10, 33554432, var11);
                     this.method5383(58, var10 + 1, 536870912, var11);
                  }

                  if (~arg5 == -4) {
                     this.method5383(80, var10, 134217728, var11);
                     this.method5383(32, var10, 8388608, var11 + -1);
                  }
               }

               if (arg3 == 1 || arg3 == 3) {
                  if (arg5 == 0) {
                     this.method5383(125, var10, 4194304, var11);
                     this.method5383(107, var10 + -1, 67108864, var11 + 1);
                  }

                  if (arg5 == 1) {
                     this.method5383(93, var10, 16777216, var11);
                     this.method5383(25, var10 + 1, 268435456, var11 + 1);
                  }

                  if (~arg5 == -3) {
                     this.method5383(99, var10, 67108864, var11);
                     this.method5383(23, var10 + 1, 4194304, var11 + -1);
                  }

                  if (~arg5 == -4) {
                     this.method5383(69, var10, 268435456, var11);
                     this.method5383(arg6 + 132, var10 + -1, 16777216, var11 + -1);
                  }
               }

               if (~arg3 == -3) {
                  if (arg5 == 0) {
                     this.method5383(arg6 ^ -8, var10, 545259520, var11);
                     this.method5383(40, var10 + -1, 33554432, var11);
                     this.method5383(arg6 + 82, var10, 134217728, var11 + 1);
                  }

                  if (~arg5 == -2) {
                     this.method5383(arg6 + 107, var10, 41943040, var11);
                     this.method5383(arg6 + 148, var10, 134217728, var11 + 1);
                     this.method5383(10, var10 + 1, 536870912, var11);
                  }

                  if (arg5 == 2) {
                     this.method5383(115, var10, 167772160, var11);
                     this.method5383(111, var10 - -1, 536870912, var11);
                     this.method5383(60, var10, 8388608, var11 + -1);
                  }

                  if (arg5 == 3) {
                     this.method5383(15, var10, 671088640, var11);
                     this.method5383(arg6 + 79, var10, 8388608, var11 + -1);
                     this.method5383(43, var10 + -1, 33554432, var11);
                     return;
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10983[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IZIIZBI)V",
      line = 1077
   )
   public final void method5389(int param1, boolean param2, int param3, int param4, boolean param5, byte param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ega",
      name = "d",
      descriptor = "(III)V",
      line = 1123
   )
   public final void method5390(int arg0, int arg1, int arg2) {
      try {
         int var6 = arg0 - this.field10962;
         if (arg2 >= -80) {
            this.field10963 = 22;
         }

         int var7 = arg1 - this.field10981;
         ++field10968;
         this.field10979[var7][var6] = class153.method1262(this.field10979[var7][var6], -262145);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10983[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "(IIIIIIII)Z",
      line = 1151
   )
   public final boolean method5391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field10967;
         if (arg2 == 1) {
            if (arg1 == arg7 && arg3 == arg4) {
               return true;
            }
         } else if (~arg7 >= ~arg1 && ~arg1 >= ~(arg2 + -1 + arg7) && arg4 <= arg4 && ~(arg2 + arg4 + -1) <= ~arg4) {
            return true;
         }

         int var15 = arg4 - this.field10962;
         int var16 = arg7 - this.field10981;
         int var13 = arg1 - this.field10981;
         int var14 = arg3 - this.field10962;
         if (~arg2 != -2) {
            int var9 = var16 - -arg2 + -1;
            int var10 = var14 - -arg2 + -1;
            if (~arg5 == -1) {
               if (arg0 == 0) {
                  if (~(var13 - arg2) == ~var16 && ~var14 >= ~var15 && ~var10 <= ~var15) {
                     return true;
                  }

                  if (~var16 >= ~var13 && ~var9 <= ~var13 && var15 + 1 == var14 && ~(this.field10979[var13][var14] & 2883872) == -1) {
                     return true;
                  }

                  if (var16 <= var13 && ~var13 >= ~var9 && ~(-arg2 + var15) == ~var14 && ~(this.field10979[var13][var10] & 2883842) == -1) {
                     return true;
                  }
               } else if (arg0 != 1) {
                  if (arg0 == 2) {
                     if (var13 + 1 == var16 && var15 >= var14 && ~var10 <= ~var15) {
                        return true;
                     }

                     if (~var13 <= ~var16 && ~var13 >= ~var9 && var15 + 1 == var14 && ~(2883872 & this.field10979[var13][var14]) == -1) {
                        return true;
                     }

                     if (~var16 >= ~var13 && ~var9 <= ~var13 && -arg2 + var15 == var14 && ~(this.field10979[var13][var10] & 2883842) == -1) {
                        return true;
                     }
                  } else if (~arg0 == -4) {
                     if (var13 >= var16 && ~var9 <= ~var13 && -arg2 + var15 == var14) {
                        return true;
                     }

                     if (~(var13 - arg2) == ~var16 && ~var15 <= ~var14 && ~var10 <= ~var15 && (2883848 & this.field10979[var9][var15]) == 0) {
                        return true;
                     }

                     if (~(var13 + 1) == ~var16 && ~var14 >= ~var15 && var15 <= var10 && (this.field10979[var16][var15] & 2883968) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (~var13 <= ~var16 && ~var9 <= ~var13 && ~(var15 - -1) == ~var14) {
                     return true;
                  }

                  if (var13 - arg2 == var16 && var14 <= var15 && ~var10 <= ~var15 && (2883848 & this.field10979[var9][var15]) == 0) {
                     return true;
                  }

                  if (~(var13 + 1) == ~var16 && ~var14 >= ~var15 && var15 <= var10 && (2883968 & this.field10979[var16][var15]) == 0) {
                     return true;
                  }
               }
            }

            if (arg5 == 2) {
               if (~arg0 != -1) {
                  if (arg0 != 1) {
                     if (arg0 == 2) {
                        if (~(-arg2 + var13) == ~var16 && var14 <= var15 && ~var15 >= ~var10 && (2883848 & this.field10979[var9][var15]) == 0) {
                           return true;
                        }

                        if (~var16 >= ~var13 && var9 >= var13 && ~(var15 + 1) == ~var14 && ~(this.field10979[var13][var14] & 2883872) == -1) {
                           return true;
                        }

                        if (var13 + 1 == var16 && var14 <= var15 && ~var15 >= ~var10) {
                           return true;
                        }

                        if (~var13 <= ~var16 && var13 <= var9 && ~(var15 - arg2) == ~var14) {
                           return true;
                        }
                     } else if (arg0 == 3) {
                        if (~(-arg2 + var13) == ~var16 && ~var14 >= ~var15 && ~var15 >= ~var10) {
                           return true;
                        }

                        if (var13 >= var16 && ~var13 >= ~var9 && ~(var15 - -1) == ~var14 && (this.field10979[var13][var14] & 2883872) == 0) {
                           return true;
                        }

                        if (var13 + 1 == var16 && var15 >= var14 && var10 >= var15 && (2883968 & this.field10979[var16][var15]) == 0) {
                           return true;
                        }

                        if (var13 >= var16 && var13 <= var9 && ~(-arg2 + var15) == ~var14) {
                           return true;
                        }
                     }
                  } else {
                     if (~(-arg2 + var13) == ~var16 && var14 <= var15 && ~var15 >= ~var10 && (this.field10979[var9][var15] & 2883848) == 0) {
                        return true;
                     }

                     if (var16 <= var13 && var9 >= var13 && var15 + 1 == var14) {
                        return true;
                     }

                     if (~(var13 + 1) == ~var16 && var14 <= var15 && var10 >= var15) {
                        return true;
                     }

                     if (~var13 <= ~var16 && var9 >= var13 && ~(-arg2 + var15) == ~var14 && ~(this.field10979[var13][var10] & 2883842) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (~(-arg2 + var13) == ~var16 && ~var15 <= ~var14 && ~var15 >= ~var10) {
                     return true;
                  }

                  if (~var16 >= ~var13 && var9 >= var13 && var15 + 1 == var14) {
                     return true;
                  }

                  if (~(var13 + 1) == ~var16 && ~var14 >= ~var15 && ~var15 >= ~var10 && ~(2883968 & this.field10979[var16][var15]) == -1) {
                     return true;
                  }

                  if (~var13 <= ~var16 && ~var9 <= ~var13 && -arg2 + var15 == var14 && ~(2883842 & this.field10979[var13][var10]) == -1) {
                     return true;
                  }
               }
            }

            if (~arg5 == -10) {
               if (var16 <= var13 && ~var9 <= ~var13 && var15 - -1 == var14 && ~(2883872 & this.field10979[var13][var14]) == -1) {
                  return true;
               }

               if (~var13 <= ~var16 && ~var13 >= ~var9 && ~(-arg2 + var15) == ~var14 && (2883842 & this.field10979[var13][var10]) == 0) {
                  return true;
               }

               if (-arg2 + var13 == var16 && ~var14 >= ~var15 && var15 <= var10 && ~(2883848 & this.field10979[var9][var15]) == -1) {
                  return true;
               }

               if (~(var13 + 1) == ~var16 && var15 >= var14 && ~var10 <= ~var15 && (2883968 & this.field10979[var16][var15]) == 0) {
                  return true;
               }
            }
         } else {
            if (arg5 == 0) {
               if (arg0 != 0) {
                  if (arg0 == 1) {
                     if (~var13 == ~var16 && var15 + 1 == var14) {
                        return true;
                     }

                     if (~(var13 + -1) == ~var16 && ~var14 == ~var15 && (this.field10979[var16][var14] & 2883848) == 0) {
                        return true;
                     }

                     if (~(var13 + 1) == ~var16 && ~var14 == ~var15 && ~(this.field10979[var16][var14] & 2883968) == -1) {
                        return true;
                     }
                  } else if (~arg0 == -3) {
                     if (~(var13 + 1) == ~var16 && ~var14 == ~var15) {
                        return true;
                     }

                     if (~var13 == ~var16 && ~(var15 + 1) == ~var14 && (2883872 & this.field10979[var16][var14]) == 0) {
                        return true;
                     }

                     if (~var13 == ~var16 && ~(var15 + -1) == ~var14 && (2883842 & this.field10979[var16][var14]) == 0) {
                        return true;
                     }
                  } else if (~arg0 == -4) {
                     if (var13 == var16 && ~(var15 + -1) == ~var14) {
                        return true;
                     }

                     if (var13 + -1 == var16 && var14 == var15 && (2883848 & this.field10979[var16][var14]) == 0) {
                        return true;
                     }

                     if (~(var13 + 1) == ~var16 && var14 == var15 && (2883968 & this.field10979[var16][var14]) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (var13 + -1 == var16 && var14 == var15) {
                     return true;
                  }

                  if (~var13 == ~var16 && var15 - -1 == var14 && ~(this.field10979[var16][var14] & 2883872) == -1) {
                     return true;
                  }

                  if (var13 == var16 && ~(var15 + -1) == ~var14 && (2883842 & this.field10979[var16][var14]) == 0) {
                     return true;
                  }
               }
            }

            if (arg5 == 2) {
               if (arg0 == 0) {
                  if (~(var13 + -1) == ~var16 && ~var14 == ~var15) {
                     return true;
                  }

                  if (var13 == var16 && var15 - -1 == var14) {
                     return true;
                  }

                  if (~(var13 - -1) == ~var16 && ~var14 == ~var15 && (2883968 & this.field10979[var16][var14]) == 0) {
                     return true;
                  }

                  if (~var13 == ~var16 && var15 + -1 == var14 && (2883842 & this.field10979[var16][var14]) == 0) {
                     return true;
                  }
               } else if (arg0 == 1) {
                  if (~(var13 - 1) == ~var16 && ~var14 == ~var15 && ~(2883848 & this.field10979[var16][var14]) == -1) {
                     return true;
                  }

                  if (~var13 == ~var16 && var15 - -1 == var14) {
                     return true;
                  }

                  if (var13 + 1 == var16 && ~var14 == ~var15) {
                     return true;
                  }

                  if (var13 == var16 && ~(var15 - 1) == ~var14 && (2883842 & this.field10979[var16][var14]) == 0) {
                     return true;
                  }
               } else if (arg0 != 2) {
                  if (~arg0 == -4) {
                     if (var13 - 1 == var16 && var14 == var15) {
                        return true;
                     }

                     if (var13 == var16 && var15 - -1 == var14 && (2883872 & this.field10979[var16][var14]) == 0) {
                        return true;
                     }

                     if (~(var13 + 1) == ~var16 && var14 == var15 && ~(this.field10979[var16][var14] & 2883968) == -1) {
                        return true;
                     }

                     if (var13 == var16 && ~(var15 - 1) == ~var14) {
                        return true;
                     }
                  }
               } else {
                  if (var13 + -1 == var16 && var14 == var15 && ~(this.field10979[var16][var14] & 2883848) == -1) {
                     return true;
                  }

                  if (var13 == var16 && ~(var15 + 1) == ~var14 && (this.field10979[var16][var14] & 2883872) == 0) {
                     return true;
                  }

                  if (~(var13 - -1) == ~var16 && var14 == var15) {
                     return true;
                  }

                  if (var13 == var16 && ~(var15 + -1) == ~var14) {
                     return true;
                  }
               }
            }

            if (arg5 == 9) {
               if (~var13 == ~var16 && ~(var15 + 1) == ~var14 && (this.field10979[var16][var14] & 32) == 0) {
                  return true;
               }

               if (var13 == var16 && ~(var15 - 1) == ~var14 && ~(2 & this.field10979[var16][var14]) == -1) {
                  return true;
               }

               if (var13 + -1 == var16 && var14 == var15 && (8 & this.field10979[var16][var14]) == 0) {
                  return true;
               }

               if (var13 + 1 == var16 && ~var14 == ~var15 && (this.field10979[var16][var14] & 128) == 0) {
                  return true;
               }
            }
         }

         if (arg6 != 2) {
            field10971 = null;
         }

         return false;
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10983[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(III)V",
      line = 1516
   )
   public final void method5392(int arg0, int arg1, int arg2) {
      try {
         int var6 = arg1 - this.field10981;
         int var7 = arg2 - this.field10962;
         ++field10959;
         this.field10979[var6][var7] = class153.method1262(this.field10979[var6][var7], arg0);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10983[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 1530
   )
   public final boolean method5393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field10976;
         if (arg8 != -5289) {
            this.method5378(-33, 116, -10, -78, 103, -79, -120, -66);
         }

         if (~arg6 < -2) {
            return class568.method4207((byte)124, arg0, arg6, arg7, arg5, arg3, arg6, arg4, arg1) ? true : this.method5386(arg6, arg4, arg2, arg6, arg0, arg1, (byte)101, arg5, arg7, arg3);
         } else {
            int var10 = arg3 + -1 + arg7;
            int var11 = arg0 + arg4 + -1;
            if (~arg7 >= ~arg5 && arg5 <= var10 && arg0 <= arg1 && arg1 <= var11) {
               return true;
            } else if (arg7 + -1 == arg5 && arg0 <= arg1 && ~var11 <= ~arg1 && (this.field10979[-this.field10981 + arg5][-this.field10962 + arg1] & 8) == 0 && ~(8 & arg2) == -1) {
               return true;
            } else if (~(var10 - -1) == ~arg5 && ~arg0 >= ~arg1 && ~arg1 >= ~var11 && (128 & this.field10979[-this.field10981 + arg5][-this.field10962 + arg1]) == 0 && (arg2 & 2) == 0) {
               return true;
            } else if (arg0 + -1 == arg1 && ~arg5 <= ~arg7 && arg5 <= var10 && ~(this.field10979[-this.field10981 + arg5][-this.field10962 + arg1] & 2) == -1 && (4 & arg2) == 0) {
               return true;
            } else {
               return ~(var11 + 1) == ~arg1 && ~arg7 >= ~arg5 && ~var10 <= ~arg5 && (32 & this.field10979[arg5 - this.field10981][arg1 - this.field10962]) == 0 && ~(1 & arg2) == -1;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10983[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5394(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5395(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
