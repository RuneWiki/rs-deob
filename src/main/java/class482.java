import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class482 {
   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7345 = new String[]{method3760(method3759("L:WPl")), method3760(method3759("L:W^l")), method3760(method3759("L:W@l")), method3760(method3759("L:WZl")), method3760(method3759("L:WCl")), method3760(method3759("L:WWl")), method3760(method3759("L:WQl")), method3760(method3759("L:WRl")), method3760(method3759("L:WUl")), method3760(method3759("L:WTl")), method3760(method3759("L:W[l")), method3760(method3759("L:WBl")), method3760(method3759("L:W\\l")), method3760(method3759("L:WYl")), method3760(method3759("L:W]l")), method3760(method3759("L:W_l")), method3760(method3759("L:WAl")), method3760(method3759("L:WVl"))};
   @OriginalMember(
      owner = "client!fr",
      name = "o",
      descriptor = "[[I"
   )
   public static int[][] field7343 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!fr",
      name = "u",
      descriptor = "I"
   )
   public static int field7321;
   @OriginalMember(
      owner = "client!fr",
      name = "v",
      descriptor = "I"
   )
   public static int field7322;
   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "I"
   )
   public static int field7323;
   @OriginalMember(
      owner = "client!fr",
      name = "r",
      descriptor = "I"
   )
   public static int field7324;
   @OriginalMember(
      owner = "client!fr",
      name = "f",
      descriptor = "I"
   )
   public static int field7325;
   @OriginalMember(
      owner = "client!fr",
      name = "k",
      descriptor = "I"
   )
   public static int field7326;
   @OriginalMember(
      owner = "client!fr",
      name = "e",
      descriptor = "I"
   )
   public int field7327;
   @OriginalMember(
      owner = "client!fr",
      name = "p",
      descriptor = "I"
   )
   public static int field7328;
   @OriginalMember(
      owner = "client!fr",
      name = "h",
      descriptor = "I"
   )
   public int field7329;
   @OriginalMember(
      owner = "client!fr",
      name = "c",
      descriptor = "I"
   )
   public static int field7330;
   @OriginalMember(
      owner = "client!fr",
      name = "g",
      descriptor = "I"
   )
   public static int field7331;
   @OriginalMember(
      owner = "client!fr",
      name = "t",
      descriptor = "I"
   )
   public static int field7332;
   @OriginalMember(
      owner = "client!fr",
      name = "l",
      descriptor = "I"
   )
   public static int field7333;
   @OriginalMember(
      owner = "client!fr",
      name = "q",
      descriptor = "I"
   )
   public static int field7334;
   @OriginalMember(
      owner = "client!fr",
      name = "m",
      descriptor = "I"
   )
   public static int field7335;
   @OriginalMember(
      owner = "client!fr",
      name = "w",
      descriptor = "I"
   )
   public static int field7336;
   @OriginalMember(
      owner = "client!fr",
      name = "j",
      descriptor = "I"
   )
   public int field7337;
   @OriginalMember(
      owner = "client!fr",
      name = "d",
      descriptor = "I"
   )
   public static int field7338;
   @OriginalMember(
      owner = "client!fr",
      name = "x",
      descriptor = "I"
   )
   public static int field7340;
   @OriginalMember(
      owner = "client!fr",
      name = "i",
      descriptor = "I"
   )
   public static int field7341;
   @OriginalMember(
      owner = "client!fr",
      name = "n",
      descriptor = "I"
   )
   public static int field7342;
   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "I"
   )
   public int field7344;
   @OriginalMember(
      owner = "client!fr",
      name = "s",
      descriptor = "[[I"
   )
   public int[][] field7339;

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(ZZIIZII)V"
   )
   public final void method3740(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
      try {
         if (!arg1) {
            field7343 = null;
         }

         int var10 = arg5 - this.field7337;
         ++field7335;
         int var11 = arg6 - this.field7329;
         if (arg2 == 0) {
            if (~arg3 == -1) {
               this.method3748((byte)34, 128, var11, var10);
               this.method3748((byte)34, 8, var11 - 1, var10);
            }

            if (~arg3 == -2) {
               this.method3748((byte)34, 2, var11, var10);
               this.method3748((byte)34, 32, var11, var10 + 1);
            }

            if (arg3 == 2) {
               this.method3748((byte)34, 8, var11, var10);
               this.method3748((byte)34, 128, var11 + 1, var10);
            }

            if (arg3 == 3) {
               this.method3748((byte)34, 32, var11, var10);
               this.method3748((byte)34, 2, var11, var10 + -1);
            }
         }

         if (~arg2 == -2 || ~arg2 == -4) {
            if (arg3 == 0) {
               this.method3748((byte)34, 1, var11, var10);
               this.method3748((byte)34, 16, var11 + -1, var10 + 1);
            }

            if (~arg3 == -2) {
               this.method3748((byte)34, 4, var11, var10);
               this.method3748((byte)34, 64, var11 + 1, var10 + 1);
            }

            if (~arg3 == -3) {
               this.method3748((byte)34, 16, var11, var10);
               this.method3748((byte)34, 1, var11 + 1, var10 + -1);
            }

            if (arg3 == 3) {
               this.method3748((byte)34, 64, var11, var10);
               this.method3748((byte)34, 4, var11 - 1, var10 - 1);
            }
         }

         if (arg2 == 2) {
            if (~arg3 == -1) {
               this.method3748((byte)34, 130, var11, var10);
               this.method3748((byte)34, 8, var11 + -1, var10);
               this.method3748((byte)34, 32, var11, var10 + 1);
            }

            if (~arg3 == -2) {
               this.method3748((byte)34, 10, var11, var10);
               this.method3748((byte)34, 32, var11, var10 + 1);
               this.method3748((byte)34, 128, var11 + 1, var10);
            }

            if (~arg3 == -3) {
               this.method3748((byte)34, 40, var11, var10);
               this.method3748((byte)34, 128, var11 + 1, var10);
               this.method3748((byte)34, 2, var11, var10 + -1);
            }

            if (arg3 == 3) {
               this.method3748((byte)34, 160, var11, var10);
               this.method3748((byte)34, 2, var11, var10 + -1);
               this.method3748((byte)34, 8, var11 + -1, var10);
            }
         }

         if (arg0) {
            if (arg2 == 0) {
               if (~arg3 == -1) {
                  this.method3748((byte)34, 65536, var11, var10);
                  this.method3748((byte)34, 4096, var11 - 1, var10);
               }

               if (arg3 == 1) {
                  this.method3748((byte)34, 1024, var11, var10);
                  this.method3748((byte)34, 16384, var11, var10 + 1);
               }

               if (~arg3 == -3) {
                  this.method3748((byte)34, 4096, var11, var10);
                  this.method3748((byte)34, 65536, var11 - -1, var10);
               }

               if (arg3 == 3) {
                  this.method3748((byte)34, 16384, var11, var10);
                  this.method3748((byte)34, 1024, var11, var10 + -1);
               }
            }

            if (arg2 == 1 || arg2 == 3) {
               if (~arg3 == -1) {
                  this.method3748((byte)34, 512, var11, var10);
                  this.method3748((byte)34, 8192, var11 + -1, var10 - -1);
               }

               if (arg3 == 1) {
                  this.method3748((byte)34, 2048, var11, var10);
                  this.method3748((byte)34, 32768, var11 + 1, var10 + 1);
               }

               if (~arg3 == -3) {
                  this.method3748((byte)34, 8192, var11, var10);
                  this.method3748((byte)34, 512, var11 - -1, var10 + -1);
               }

               if (arg3 == 3) {
                  this.method3748((byte)34, 32768, var11, var10);
                  this.method3748((byte)34, 2048, var11 + -1, var10 + -1);
               }
            }

            if (~arg2 == -3) {
               if (~arg3 == -1) {
                  this.method3748((byte)34, 66560, var11, var10);
                  this.method3748((byte)34, 4096, var11 + -1, var10);
                  this.method3748((byte)34, 16384, var11, var10 + 1);
               }

               if (~arg3 == -2) {
                  this.method3748((byte)34, 5120, var11, var10);
                  this.method3748((byte)34, 16384, var11, var10 + 1);
                  this.method3748((byte)34, 65536, var11 + 1, var10);
               }

               if (~arg3 == -3) {
                  this.method3748((byte)34, 20480, var11, var10);
                  this.method3748((byte)34, 65536, var11 + 1, var10);
                  this.method3748((byte)34, 1024, var11, var10 + -1);
               }

               if (arg3 == 3) {
                  this.method3748((byte)34, 81920, var11, var10);
                  this.method3748((byte)34, 1024, var11, var10 + -1);
                  this.method3748((byte)34, 4096, var11 - 1, var10);
               }
            }
         }

         if (arg4) {
            if (arg2 == 0) {
               if (~arg3 == -1) {
                  this.method3748((byte)34, 536870912, var11, var10);
                  this.method3748((byte)34, 33554432, var11 + -1, var10);
               }

               if (~arg3 == -2) {
                  this.method3748((byte)34, 8388608, var11, var10);
                  this.method3748((byte)34, 134217728, var11, var10 - -1);
               }

               if (arg3 == 2) {
                  this.method3748((byte)34, 33554432, var11, var10);
                  this.method3748((byte)34, 536870912, var11 + 1, var10);
               }

               if (~arg3 == -4) {
                  this.method3748((byte)34, 134217728, var11, var10);
                  this.method3748((byte)34, 8388608, var11, var10 + -1);
               }
            }

            if (arg2 == 1 || arg2 == 3) {
               if (arg3 == 0) {
                  this.method3748((byte)34, 4194304, var11, var10);
                  this.method3748((byte)34, 67108864, var11 + -1, var10 + 1);
               }

               if (~arg3 == -2) {
                  this.method3748((byte)34, 16777216, var11, var10);
                  this.method3748((byte)34, 268435456, var11 - -1, var10 + 1);
               }

               if (~arg3 == -3) {
                  this.method3748((byte)34, 67108864, var11, var10);
                  this.method3748((byte)34, 4194304, var11 + 1, var10 + -1);
               }

               if (arg3 == 3) {
                  this.method3748((byte)34, 268435456, var11, var10);
                  this.method3748((byte)34, 16777216, var11 + -1, var10 - 1);
               }
            }

            if (~arg2 == -3) {
               if (~arg3 == -1) {
                  this.method3748((byte)34, 545259520, var11, var10);
                  this.method3748((byte)34, 33554432, var11 - 1, var10);
                  this.method3748((byte)34, 134217728, var11, var10 + 1);
               }

               if (~arg3 == -2) {
                  this.method3748((byte)34, 41943040, var11, var10);
                  this.method3748((byte)34, 134217728, var11, var10 + 1);
                  this.method3748((byte)34, 536870912, var11 + 1, var10);
               }

               if (~arg3 == -3) {
                  this.method3748((byte)34, 167772160, var11, var10);
                  this.method3748((byte)34, 536870912, var11 - -1, var10);
                  this.method3748((byte)34, 8388608, var11, var10 - 1);
               }

               if (arg3 == 3) {
                  this.method3748((byte)34, 671088640, var11, var10);
                  this.method3748((byte)34, 8388608, var11, var10 + -1);
                  this.method3748((byte)34, 33554432, var11 - 1, var10);
                  return;
               }
            }
         }

      } catch (RuntimeException var9) {
         throw method3757(var9, field7345[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3741(int arg0) {
      try {
         field7343 = null;
         if (arg0 != -1) {
            method3754(true, 84, -108);
         }
      } catch (RuntimeException var2) {
         throw method3757(var2, field7345[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IIZZIII)V"
   )
   public final void method3742(int param1, int param2, boolean param3, boolean param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IIIIIIIIII)Z"
   )
   public final boolean method3743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var11 = client.field1786;

      try {
         ++field7321;
         int var12 = arg3 + arg8;
         if (arg1 > -74) {
            this.method3744(69);
         }

         int var13 = arg5 + arg6;
         int var14 = arg9 - -arg0;
         int var15 = arg7 - -arg2;
         if (~arg3 == ~var14 && (2 & arg4) == 0) {
            int var16 = arg6 > arg7 ? arg6 : arg7;
            int var17 = ~var15 < ~var13 ? var13 : var15;
            if (var11) {
               if (~(this.field7339[-this.field7329 + var14 + -1][-this.field7337 + var16] & 8) == -1) {
                  return true;
               }

               ++var16;
            }

            while(true) {
               while(var16 < var17) {
                  if (~(this.field7339[-this.field7329 + var14 + -1][-this.field7337 + var16] & 8) == -1) {
                     return true;
                  }

                  ++var16;
               }

               if (!var11) {
                  if (!var11) {
                     return false;
                  }
                  break;
               }

               ++var16;
            }
         }

         if (arg9 != var12 || (arg4 & 8) != 0) {
            if (~arg6 != ~var15 || ~(1 & arg4) != -1) {
               if (~arg7 != ~var13 || (arg4 & 4) != 0) {
                  return false;
               }

               int var18 = arg3 <= arg9 ? arg9 : arg3;
               int var19 = ~var14 >= ~var12 ? var14 : var12;
               if (var11) {
                  if ((32 & this.field7339[-this.field7329 + var18][-this.field7337 + arg7]) == 0) {
                     return true;
                  }

                  ++var18;
               }

               while(true) {
                  while(~var18 > ~var19) {
                     if ((32 & this.field7339[-this.field7329 + var18][-this.field7337 + arg7]) == 0) {
                        return true;
                     }

                     ++var18;
                  }

                  if (!var11) {
                     if (!var11) {
                        return false;
                     }
                     break;
                  }

                  ++var18;
               }
            }

            int var20 = ~arg3 >= ~arg9 ? arg9 : arg3;
            int var21 = var12 >= var14 ? var14 : var12;
            if (var11) {
               if (~(2 & this.field7339[-this.field7329 + var20][-this.field7337 + -1 + var15]) == -1) {
                  return true;
               }

               ++var20;
            }

            while(true) {
               while(~var21 < ~var20) {
                  if (~(2 & this.field7339[-this.field7329 + var20][-this.field7337 + -1 + var15]) == -1) {
                     return true;
                  }

                  ++var20;
               }

               if (!var11) {
                  if (!var11) {
                     return false;
                  }
                  break;
               }

               ++var20;
            }
         }

         int var22 = arg6 <= arg7 ? arg7 : arg6;
         int var23 = ~var15 < ~var13 ? var13 : var15;
         if (var11 || ~var23 < ~var22) {
            do {
               if (~(this.field7339[-this.field7329 + arg9][var22 - this.field7337] & 128) == -1) {
                  return true;
               }

               ++var22;
            } while(~var23 < ~var22);
         }

         return false;
      } catch (RuntimeException var25) {
         throw method3757(var25, field7345[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3744(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method3745(int arg0, int arg1, int arg2) {
      try {
         int var6 = arg1 - this.field7329;
         int var7 = arg2 - this.field7337;
         if (arg0 < 80) {
            this.method3749(89, (byte)62, 42, 119, false, -3, true);
         }

         ++field7326;
         this.field7339[var6][var7] = class119.method1087(this.field7339[var6][var7], 262144);
      } catch (RuntimeException var5) {
         throw method3757(var5, field7345[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IBII)V"
   )
   private final void method3746(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field7328;
         this.field7339[arg3][arg0] = class119.method1087(this.field7339[arg3][arg0], arg2);
         if (arg1 > -110) {
            this.field7329 = -16;
         }
      } catch (RuntimeException var6) {
         throw method3757(var6, field7345[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method3747(int arg0, byte arg1, int arg2) {
      try {
         int var6 = arg0 - this.field7329;
         ++field7333;
         if (arg1 != 2) {
            this.method3740(true, true, -3, -6, true, -47, -47);
         }

         int var7 = arg2 - this.field7337;
         this.field7339[var6][var7] = class408.method3277(this.field7339[var6][var7], -2097153);
      } catch (RuntimeException var5) {
         throw method3757(var5, field7345[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(BIII)V"
   )
   private final void method3748(byte arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 != 34) {
            this.field7339 = null;
         }

         ++field7340;
         this.field7339[arg2][arg3] = class408.method3277(this.field7339[arg2][arg3], ~arg1);
      } catch (RuntimeException var6) {
         throw method3757(var6, field7345[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IBIIZIZ)V"
   )
   public final void method3749(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
      try {
         int var11 = arg5 - this.field7329;
         int var10 = arg3 - this.field7337;
         ++field7336;
         if (~arg2 == -1) {
            if (~arg0 == -1) {
               this.method3746(var10, (byte)-121, 128, var11);
               this.method3746(var10, (byte)-119, 8, var11 + -1);
            }

            if (arg0 == 1) {
               this.method3746(var10, (byte)-125, 2, var11);
               this.method3746(var10 + 1, (byte)-121, 32, var11);
            }

            if (~arg0 == -3) {
               this.method3746(var10, (byte)-123, 8, var11);
               this.method3746(var10, (byte)-123, 128, var11 - -1);
            }

            if (~arg0 == -4) {
               this.method3746(var10, (byte)-118, 32, var11);
               this.method3746(var10 + -1, (byte)-120, 2, var11);
            }
         }

         if (arg1 >= 36) {
            if (~arg2 == -2 || ~arg2 == -4) {
               if (arg0 == 0) {
                  this.method3746(var10, (byte)-125, 1, var11);
                  this.method3746(var10 - -1, (byte)-116, 16, var11 + -1);
               }

               if (~arg0 == -2) {
                  this.method3746(var10, (byte)-112, 4, var11);
                  this.method3746(var10 + 1, (byte)-120, 64, var11 + 1);
               }

               if (~arg0 == -3) {
                  this.method3746(var10, (byte)-125, 16, var11);
                  this.method3746(var10 + -1, (byte)-121, 1, var11 + 1);
               }

               if (~arg0 == -4) {
                  this.method3746(var10, (byte)-118, 64, var11);
                  this.method3746(var10 - 1, (byte)-128, 4, var11 + -1);
               }
            }

            if (~arg2 == -3) {
               if (~arg0 == -1) {
                  this.method3746(var10, (byte)-127, 130, var11);
                  this.method3746(var10, (byte)-115, 8, var11 + -1);
                  this.method3746(var10 + 1, (byte)-116, 32, var11);
               }

               if (~arg0 == -2) {
                  this.method3746(var10, (byte)-124, 10, var11);
                  this.method3746(var10 + 1, (byte)-119, 32, var11);
                  this.method3746(var10, (byte)-119, 128, var11 - -1);
               }

               if (arg0 == 2) {
                  this.method3746(var10, (byte)-116, 40, var11);
                  this.method3746(var10, (byte)-119, 128, var11 + 1);
                  this.method3746(var10 + -1, (byte)-120, 2, var11);
               }

               if (~arg0 == -4) {
                  this.method3746(var10, (byte)-117, 160, var11);
                  this.method3746(var10 + -1, (byte)-114, 2, var11);
                  this.method3746(var10, (byte)-113, 8, var11 - 1);
               }
            }

            if (arg4) {
               if (arg2 == 0) {
                  if (arg0 == 0) {
                     this.method3746(var10, (byte)-116, 65536, var11);
                     this.method3746(var10, (byte)-121, 4096, var11 + -1);
                  }

                  if (~arg0 == -2) {
                     this.method3746(var10, (byte)-120, 1024, var11);
                     this.method3746(var10 + 1, (byte)-128, 16384, var11);
                  }

                  if (arg0 == 2) {
                     this.method3746(var10, (byte)-113, 4096, var11);
                     this.method3746(var10, (byte)-111, 65536, var11 + 1);
                  }

                  if (~arg0 == -4) {
                     this.method3746(var10, (byte)-127, 16384, var11);
                     this.method3746(var10 + -1, (byte)-111, 1024, var11);
                  }
               }

               if (arg2 == 1 || ~arg2 == -4) {
                  if (arg0 == 0) {
                     this.method3746(var10, (byte)-120, 512, var11);
                     this.method3746(var10 + 1, (byte)-120, 8192, var11 + -1);
                  }

                  if (~arg0 == -2) {
                     this.method3746(var10, (byte)-120, 2048, var11);
                     this.method3746(var10 - -1, (byte)-127, 32768, var11 + 1);
                  }

                  if (arg0 == 2) {
                     this.method3746(var10, (byte)-118, 8192, var11);
                     this.method3746(var10 + -1, (byte)-113, 512, var11 + 1);
                  }

                  if (~arg0 == -4) {
                     this.method3746(var10, (byte)-125, 32768, var11);
                     this.method3746(var10 + -1, (byte)-115, 2048, var11 + -1);
                  }
               }

               if (~arg2 == -3) {
                  if (~arg0 == -1) {
                     this.method3746(var10, (byte)-120, 66560, var11);
                     this.method3746(var10, (byte)-119, 4096, var11 - 1);
                     this.method3746(var10 + 1, (byte)-115, 16384, var11);
                  }

                  if (~arg0 == -2) {
                     this.method3746(var10, (byte)-123, 5120, var11);
                     this.method3746(var10 + 1, (byte)-113, 16384, var11);
                     this.method3746(var10, (byte)-122, 65536, var11 + 1);
                  }

                  if (~arg0 == -3) {
                     this.method3746(var10, (byte)-126, 20480, var11);
                     this.method3746(var10, (byte)-126, 65536, var11 + 1);
                     this.method3746(var10 + -1, (byte)-123, 1024, var11);
                  }

                  if (~arg0 == -4) {
                     this.method3746(var10, (byte)-111, 81920, var11);
                     this.method3746(var10 + -1, (byte)-111, 1024, var11);
                     this.method3746(var10, (byte)-124, 4096, var11 + -1);
                  }
               }
            }

            if (arg6) {
               if (~arg2 == -1) {
                  if (~arg0 == -1) {
                     this.method3746(var10, (byte)-113, 536870912, var11);
                     this.method3746(var10, (byte)-118, 33554432, var11 + -1);
                  }

                  if (arg0 == 1) {
                     this.method3746(var10, (byte)-113, 8388608, var11);
                     this.method3746(var10 + 1, (byte)-122, 134217728, var11);
                  }

                  if (~arg0 == -3) {
                     this.method3746(var10, (byte)-112, 33554432, var11);
                     this.method3746(var10, (byte)-114, 536870912, var11 - -1);
                  }

                  if (arg0 == 3) {
                     this.method3746(var10, (byte)-118, 134217728, var11);
                     this.method3746(var10 + -1, (byte)-114, 8388608, var11);
                  }
               }

               if (arg2 == 1 || ~arg2 == -4) {
                  if (arg0 == 0) {
                     this.method3746(var10, (byte)-126, 4194304, var11);
                     this.method3746(var10 + 1, (byte)-113, 67108864, var11 - 1);
                  }

                  if (~arg0 == -2) {
                     this.method3746(var10, (byte)-113, 16777216, var11);
                     this.method3746(var10 + 1, (byte)-114, 268435456, var11 - -1);
                  }

                  if (~arg0 == -3) {
                     this.method3746(var10, (byte)-115, 67108864, var11);
                     this.method3746(var10 + -1, (byte)-127, 4194304, var11 - -1);
                  }

                  if (~arg0 == -4) {
                     this.method3746(var10, (byte)-121, 268435456, var11);
                     this.method3746(var10 + -1, (byte)-121, 16777216, var11 + -1);
                  }
               }

               if (arg2 == 2) {
                  if (arg0 == 0) {
                     this.method3746(var10, (byte)-118, 545259520, var11);
                     this.method3746(var10, (byte)-120, 33554432, var11 - 1);
                     this.method3746(var10 - -1, (byte)-126, 134217728, var11);
                  }

                  if (~arg0 == -2) {
                     this.method3746(var10, (byte)-123, 41943040, var11);
                     this.method3746(var10 + 1, (byte)-121, 134217728, var11);
                     this.method3746(var10, (byte)-112, 536870912, var11 - -1);
                  }

                  if (arg0 == 2) {
                     this.method3746(var10, (byte)-114, 167772160, var11);
                     this.method3746(var10, (byte)-117, 536870912, var11 + 1);
                     this.method3746(var10 + -1, (byte)-122, 8388608, var11);
                  }

                  if (arg0 == 3) {
                     this.method3746(var10, (byte)-126, 671088640, var11);
                     this.method3746(var10 + -1, (byte)-125, 8388608, var11);
                     this.method3746(var10, (byte)-127, 33554432, var11 + -1);
                     return;
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw method3757(var9, field7345[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(ZBIIIZII)V"
   )
   public final void method3750(boolean param1, byte param2, int param3, int param4, int param5, boolean param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method3751(int arg0, int arg1, int arg2) {
      try {
         ++field7323;
         int var4 = -126 / ((arg2 - -18) / 34);
         int var7 = arg0 - this.field7329;
         int var8 = arg1 - this.field7337;
         this.field7339[var7][var8] = class119.method1087(this.field7339[var7][var8], 2097152);
      } catch (RuntimeException var6) {
         throw method3757(var6, field7345[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IIIIIIII)Z"
   )
   public final boolean method3752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field7338;
         if (arg5 != -1) {
            this.field7329 = 67;
         }

         if (arg6 == 1) {
            if (arg1 == arg4 && arg2 == arg3) {
               return true;
            }
         } else if (~arg1 >= ~arg4 && arg1 + arg6 - 1 >= arg4 && ~arg3 <= ~arg3 && ~(arg3 - 1 + arg6) <= ~arg3) {
            return true;
         }

         int var13 = arg1 - this.field7329;
         int var15 = arg3 - this.field7337;
         int var16 = arg4 - this.field7329;
         int var14 = arg2 - this.field7337;
         if (arg6 != 1) {
            int var9 = var13 + -1 + arg6;
            int var10 = var14 + arg6 - 1;
            if (~arg0 == -1) {
               if (~arg7 != -1) {
                  if (~arg7 == -2) {
                     if (var13 <= var16 && var9 >= var16 && var15 + 1 == var14) {
                        return true;
                     }

                     if (-arg6 + var16 == var13 && ~var14 >= ~var15 && var10 >= var15 && ~(2883848 & this.field7339[var9][var15]) == -1) {
                        return true;
                     }

                     if (~(var16 - -1) == ~var13 && var14 <= var15 && var10 >= var15 && ~(this.field7339[var13][var15] & 2883968) == -1) {
                        return true;
                     }
                  } else if (arg7 == 2) {
                     if (~(var16 - -1) == ~var13 && var15 >= var14 && ~var15 >= ~var10) {
                        return true;
                     }

                     if (var16 >= var13 && var9 >= var16 && ~(var15 + 1) == ~var14 && ~(2883872 & this.field7339[var16][var14]) == -1) {
                        return true;
                     }

                     if (var16 >= var13 && var9 >= var16 && ~(-arg6 + var15) == ~var14 && (this.field7339[var16][var10] & 2883842) == 0) {
                        return true;
                     }
                  } else if (~arg7 == -4) {
                     if (var16 >= var13 && var9 >= var16 && ~(var15 - arg6) == ~var14) {
                        return true;
                     }

                     if (var16 - arg6 == var13 && ~var14 >= ~var15 && var10 >= var15 && ~(this.field7339[var9][var15] & 2883848) == -1) {
                        return true;
                     }

                     if (~(var16 + 1) == ~var13 && var15 >= var14 && ~var15 >= ~var10 && ~(this.field7339[var13][var15] & 2883968) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (-arg6 + var16 == var13 && ~var14 >= ~var15 && ~var15 >= ~var10) {
                     return true;
                  }

                  if (var16 >= var13 && var16 <= var9 && var15 + 1 == var14 && ~(this.field7339[var16][var14] & 2883872) == -1) {
                     return true;
                  }

                  if (var13 <= var16 && ~var9 <= ~var16 && ~(-arg6 + var15) == ~var14 && (2883842 & this.field7339[var16][var10]) == 0) {
                     return true;
                  }
               }
            }

            if (~arg0 == -3) {
               if (~arg7 == -1) {
                  if (-arg6 + var16 == var13 && ~var14 >= ~var15 && var10 >= var15) {
                     return true;
                  }

                  if (var13 <= var16 && var16 <= var9 && ~(var15 + 1) == ~var14) {
                     return true;
                  }

                  if (var16 + 1 == var13 && var15 >= var14 && var15 <= var10 && (this.field7339[var13][var15] & 2883968) == 0) {
                     return true;
                  }

                  if (~var16 <= ~var13 && var16 <= var9 && -arg6 + var15 == var14 && ~(this.field7339[var16][var10] & 2883842) == -1) {
                     return true;
                  }
               } else if (arg7 == 1) {
                  if (-arg6 + var16 == var13 && var15 >= var14 && var10 >= var15 && (this.field7339[var9][var15] & 2883848) == 0) {
                     return true;
                  }

                  if (~var13 >= ~var16 && ~var16 >= ~var9 && ~(var15 - -1) == ~var14) {
                     return true;
                  }

                  if (~(var16 + 1) == ~var13 && ~var15 <= ~var14 && ~var10 <= ~var15) {
                     return true;
                  }

                  if (~var16 <= ~var13 && ~var16 >= ~var9 && ~(-arg6 + var15) == ~var14 && (2883842 & this.field7339[var16][var10]) == 0) {
                     return true;
                  }
               } else if (arg7 != 2) {
                  if (~arg7 == -4) {
                     if (var16 - arg6 == var13 && ~var14 >= ~var15 && var15 <= var10) {
                        return true;
                     }

                     if (var13 <= var16 && ~var9 <= ~var16 && var15 + 1 == var14 && ~(this.field7339[var16][var14] & 2883872) == -1) {
                        return true;
                     }

                     if (var16 + 1 == var13 && ~var15 <= ~var14 && var15 <= var10 && (this.field7339[var13][var15] & 2883968) == 0) {
                        return true;
                     }

                     if (var16 >= var13 && ~var9 <= ~var16 && ~(-arg6 + var15) == ~var14) {
                        return true;
                     }
                  }
               } else {
                  if (-arg6 + var16 == var13 && ~var14 >= ~var15 && var10 >= var15 && (2883848 & this.field7339[var9][var15]) == 0) {
                     return true;
                  }

                  if (var16 >= var13 && var16 <= var9 && var15 - -1 == var14 && (2883872 & this.field7339[var16][var14]) == 0) {
                     return true;
                  }

                  if (var16 + 1 == var13 && var15 >= var14 && ~var15 >= ~var10) {
                     return true;
                  }

                  if (var16 >= var13 && var16 <= var9 && -arg6 + var15 == var14) {
                     return true;
                  }
               }
            }

            if (~arg0 == -10) {
               if (var16 >= var13 && ~var9 <= ~var16 && var15 - -1 == var14 && (this.field7339[var16][var14] & 2883872) == 0) {
                  return true;
               }

               if (~var13 >= ~var16 && ~var9 <= ~var16 && var15 - arg6 == var14 && (this.field7339[var16][var10] & 2883842) == 0) {
                  return true;
               }

               if (~(var16 - arg6) == ~var13 && var15 >= var14 && var10 >= var15 && ~(2883848 & this.field7339[var9][var15]) == -1) {
                  return true;
               }

               if (~(var16 + 1) == ~var13 && var14 <= var15 && var15 <= var10 && (this.field7339[var13][var15] & 2883968) == 0) {
                  return true;
               }
            }
         } else {
            if (~arg0 == -1) {
               if (~arg7 == -1) {
                  if (~(var16 + -1) == ~var13 && var14 == var15) {
                     return true;
                  }

                  if (var13 == var16 && var15 + 1 == var14 && (2883872 & this.field7339[var13][var14]) == 0) {
                     return true;
                  }

                  if (~var13 == ~var16 && var15 + -1 == var14 && ~(2883842 & this.field7339[var13][var14]) == -1) {
                     return true;
                  }
               } else if (arg7 == 1) {
                  if (~var13 == ~var16 && var15 - -1 == var14) {
                     return true;
                  }

                  if (var16 + -1 == var13 && var14 == var15 && (this.field7339[var13][var14] & 2883848) == 0) {
                     return true;
                  }

                  if (var16 + 1 == var13 && ~var14 == ~var15 && (2883968 & this.field7339[var13][var14]) == 0) {
                     return true;
                  }
               } else if (arg7 != 2) {
                  if (arg7 == 3) {
                     if (var13 == var16 && ~(var15 + -1) == ~var14) {
                        return true;
                     }

                     if (var16 - 1 == var13 && ~var14 == ~var15 && (2883848 & this.field7339[var13][var14]) == 0) {
                        return true;
                     }

                     if (~(var16 + 1) == ~var13 && var14 == var15 && (2883968 & this.field7339[var13][var14]) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (~(var16 + 1) == ~var13 && ~var14 == ~var15) {
                     return true;
                  }

                  if (var13 == var16 && ~(var15 - -1) == ~var14 && ~(this.field7339[var13][var14] & 2883872) == -1) {
                     return true;
                  }

                  if (~var13 == ~var16 && ~(var15 + -1) == ~var14 && (2883842 & this.field7339[var13][var14]) == 0) {
                     return true;
                  }
               }
            }

            if (~arg0 == -3) {
               if (arg7 != 0) {
                  if (~arg7 == -2) {
                     if (var16 + -1 == var13 && ~var14 == ~var15 && ~(2883848 & this.field7339[var13][var14]) == -1) {
                        return true;
                     }

                     if (~var13 == ~var16 && ~(var15 - -1) == ~var14) {
                        return true;
                     }

                     if (~(var16 + 1) == ~var13 && ~var14 == ~var15) {
                        return true;
                     }

                     if (~var13 == ~var16 && var15 - 1 == var14 && ~(this.field7339[var13][var14] & 2883842) == -1) {
                        return true;
                     }
                  } else if (~arg7 != -3) {
                     if (~arg7 == -4) {
                        if (~(var16 + -1) == ~var13 && var14 == var15) {
                           return true;
                        }

                        if (~var13 == ~var16 && ~(var15 + 1) == ~var14 && (this.field7339[var13][var14] & 2883872) == 0) {
                           return true;
                        }

                        if (~(var16 + 1) == ~var13 && var14 == var15 && (2883968 & this.field7339[var13][var14]) == 0) {
                           return true;
                        }

                        if (~var13 == ~var16 && var15 + -1 == var14) {
                           return true;
                        }
                     }
                  } else {
                     if (var16 + -1 == var13 && ~var14 == ~var15 && (2883848 & this.field7339[var13][var14]) == 0) {
                        return true;
                     }

                     if (var13 == var16 && var15 + 1 == var14 && (this.field7339[var13][var14] & 2883872) == 0) {
                        return true;
                     }

                     if (var16 - -1 == var13 && var14 == var15) {
                        return true;
                     }

                     if (~var13 == ~var16 && ~(var15 - 1) == ~var14) {
                        return true;
                     }
                  }
               } else {
                  if (var16 - 1 == var13 && ~var14 == ~var15) {
                     return true;
                  }

                  if (var13 == var16 && var15 - -1 == var14) {
                     return true;
                  }

                  if (~(var16 + 1) == ~var13 && var14 == var15 && ~(2883968 & this.field7339[var13][var14]) == -1) {
                     return true;
                  }

                  if (var13 == var16 && ~(var15 - 1) == ~var14 && (2883842 & this.field7339[var13][var14]) == 0) {
                     return true;
                  }
               }
            }

            if (arg0 == 9) {
               if (~var13 == ~var16 && ~(var15 + 1) == ~var14 && ~(this.field7339[var13][var14] & 32) == -1) {
                  return true;
               }

               if (~var13 == ~var16 && ~(var15 + -1) == ~var14 && (2 & this.field7339[var13][var14]) == 0) {
                  return true;
               }

               if (~(var16 + -1) == ~var13 && var14 == var15 && (8 & this.field7339[var13][var14]) == 0) {
                  return true;
               }

               if (~(var16 - -1) == ~var13 && ~var14 == ~var15 && (128 & this.field7339[var13][var14]) == 0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var12) {
         throw method3757(var12, field7345[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3753(int arg0, int arg1) {
      try {
         if (arg1 == 6251) {
            ++field7325;
            class108.field1491.method2552(arg0, arg1 ^ 19574);
         }
      } catch (RuntimeException var3) {
         throw method3757(var3, field7345[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method3754(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            method3757((Throwable)null, (String)null);
         }

         ++field7322;
         return (arg1 & 24) != 0 | (arg1 & 544) == 544;
      } catch (RuntimeException var4) {
         throw method3757(var4, field7345[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IIIIIIIII)Z"
   )
   public final boolean method3755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field7324;
         if (arg8 != 0) {
            method3757((Throwable)null, (String)null);
         }

         if (arg5 > 1) {
            return class56.method414(arg7, false, arg0, arg2, arg4, arg6, arg3, arg5, arg5) ? true : this.method3743(arg2, -92, arg6, arg0, arg1, arg5, arg3, arg4, arg5, arg7);
         } else {
            int var10 = arg2 + arg7 + -1;
            int var11 = arg4 + arg6 - 1;
            if (arg7 <= arg0 && ~var10 <= ~arg0 && ~arg4 >= ~arg3 && var11 >= arg3) {
               return true;
            } else if (~(arg7 + -1) == ~arg0 && ~arg3 <= ~arg4 && arg3 <= var11 && ~(this.field7339[-this.field7329 + arg0][-this.field7337 + arg3] & 8) == -1 && ~(8 & arg1) == -1) {
               return true;
            } else if (~(var10 + 1) == ~arg0 && arg3 >= arg4 && ~arg3 >= ~var11 && (128 & this.field7339[-this.field7329 + arg0][-this.field7337 + arg3]) == 0 && (2 & arg1) == 0) {
               return true;
            } else if (arg4 + -1 == arg3 && arg7 <= arg0 && ~var10 <= ~arg0 && (2 & this.field7339[-this.field7329 + arg0][-this.field7337 + arg3]) == 0 && ~(4 & arg1) == -1) {
               return true;
            } else {
               return var11 + 1 == arg3 && ~arg7 >= ~arg0 && ~arg0 >= ~var10 && (32 & this.field7339[-this.field7329 + arg0][-this.field7337 + arg3]) == 0 && ~(1 & arg1) == -1;
            }
         }
      } catch (RuntimeException var13) {
         throw method3757(var13, field7345[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method3756(int arg0, int arg1, byte arg2) {
      try {
         int var6 = arg0 - this.field7329;
         ++field7342;
         if (arg2 < 28) {
            this.field7327 = 5;
         }

         int var7 = arg1 - this.field7337;
         this.field7339[var6][var7] = class408.method3277(this.field7339[var6][var7], -262145);
      } catch (RuntimeException var5) {
         throw method3757(var5, field7345[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmea;"
   )
   public static final class364 method3757(Throwable arg0, String arg1) {
      ++field7341;
      class364 var2;
      if (arg0 instanceof class364) {
         var2 = (class364)arg0;
         var2.field5624 = var2.field5624 + ' ' + arg1;
      } else {
         var2 = new class364(arg0, arg1);
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IIIIIIZI)Z"
   )
   public final boolean method3758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
      try {
         ++field7330;
         if (~arg1 != -2) {
            if (arg7 >= arg4 && ~arg7 >= ~(arg4 + -1 + arg1) && ~arg3 <= ~arg3 && ~arg3 >= ~(arg1 + arg3 + -1)) {
               return true;
            }
         } else if (~arg4 == ~arg7 && arg2 == arg3) {
            return true;
         }

         int var14 = arg3 - this.field7337;
         int var16 = arg7 - this.field7329;
         if (arg6) {
            return true;
         } else {
            int var13 = arg2 - this.field7337;
            int var15 = arg4 - this.field7329;
            if (arg1 == 1) {
               if (~arg0 == -7 || arg0 == 7) {
                  if (~arg0 == -8) {
                     arg5 = 3 & arg5 + 2;
                  }

                  if (~arg5 != -1) {
                     if (~arg5 == -2) {
                        if (~(var16 + -1) == ~var15 && ~var13 == ~var14 && ~(8 & this.field7339[var15][var13]) == -1) {
                           return true;
                        }

                        if (~var15 == ~var16 && ~(var14 + -1) == ~var13 && (this.field7339[var15][var13] & 2) == 0) {
                           return true;
                        }
                     } else if (arg5 != 2) {
                        if (~arg5 == -4) {
                           if (var16 - -1 == var15 && var13 == var14 && ~(128 & this.field7339[var15][var13]) == -1) {
                              return true;
                           }

                           if (var15 == var16 && ~(var14 + 1) == ~var13 && ~(this.field7339[var15][var13] & 32) == -1) {
                              return true;
                           }
                        }
                     } else {
                        if (var16 + -1 == var15 && ~var13 == ~var14 && (8 & this.field7339[var15][var13]) == 0) {
                           return true;
                        }

                        if (var15 == var16 && ~(var14 + 1) == ~var13 && (32 & this.field7339[var15][var13]) == 0) {
                           return true;
                        }
                     }
                  } else {
                     if (var16 + 1 == var15 && ~var13 == ~var14 && ~(128 & this.field7339[var15][var13]) == -1) {
                        return true;
                     }

                     if (~var15 == ~var16 && ~(var14 - 1) == ~var13 && (2 & this.field7339[var15][var13]) == 0) {
                        return true;
                     }
                  }
               }

               if (~arg0 == -9) {
                  if (var15 == var16 && ~(var14 + 1) == ~var13 && ~(32 & this.field7339[var15][var13]) == -1) {
                     return true;
                  }

                  if (var15 == var16 && ~(var14 + -1) == ~var13 && (2 & this.field7339[var15][var13]) == 0) {
                     return true;
                  }

                  if (~(var16 + -1) == ~var15 && ~var13 == ~var14 && ~(this.field7339[var15][var13] & 8) == -1) {
                     return true;
                  }

                  if (~(var16 + 1) == ~var15 && ~var13 == ~var14 && ~(this.field7339[var15][var13] & 128) == -1) {
                     return true;
                  }
               }
            } else {
               int var9 = var15 - -arg1 - 1;
               int var10 = arg1 + -1 + var13;
               if (~arg0 == -7 || ~arg0 == -8) {
                  if (arg0 == 7) {
                     arg5 = 3 & arg5 + 2;
                  }

                  if (arg5 == 0) {
                     if (var16 - -1 == var15 && ~var14 <= ~var13 && var10 >= var14 && (this.field7339[var15][var14] & 128) == 0) {
                        return true;
                     }

                     if (~var15 >= ~var16 && ~var9 <= ~var16 && var14 - arg1 == var13 && (this.field7339[var16][var10] & 2) == 0) {
                        return true;
                     }
                  } else if (arg5 != 1) {
                     if (arg5 != 2) {
                        if (~arg5 == -4) {
                           if (~(var16 + 1) == ~var15 && var13 <= var14 && var14 <= var10 && (128 & this.field7339[var15][var14]) == 0) {
                              return true;
                           }

                           if (var15 <= var16 && ~var9 <= ~var16 && ~(var14 + 1) == ~var13 && ~(32 & this.field7339[var16][var13]) == -1) {
                              return true;
                           }
                        }
                     } else {
                        if (var16 - arg1 == var15 && var13 <= var14 && ~var10 <= ~var14 && (8 & this.field7339[var9][var14]) == 0) {
                           return true;
                        }

                        if (~var15 >= ~var16 && ~var16 >= ~var9 && ~(var14 + 1) == ~var13 && (32 & this.field7339[var16][var13]) == 0) {
                           return true;
                        }
                     }
                  } else {
                     if (-arg1 + var16 == var15 && ~var13 >= ~var14 && ~var14 >= ~var10 && (8 & this.field7339[var9][var14]) == 0) {
                        return true;
                     }

                     if (var15 <= var16 && ~var16 >= ~var9 && ~(-arg1 + var14) == ~var13 && ~(2 & this.field7339[var16][var10]) == -1) {
                        return true;
                     }
                  }
               }

               if (~arg0 == -9) {
                  if (var15 <= var16 && var9 >= var16 && ~(var14 + 1) == ~var13 && ~(32 & this.field7339[var16][var13]) == -1) {
                     return true;
                  }

                  if (var16 >= var15 && var9 >= var16 && ~(var14 - arg1) == ~var13 && ~(2 & this.field7339[var16][var10]) == -1) {
                     return true;
                  }

                  if (-arg1 + var16 == var15 && ~var13 >= ~var14 && ~var10 <= ~var14 && (8 & this.field7339[var9][var14]) == 0) {
                     return true;
                  }

                  if (var16 - -1 == var15 && ~var13 >= ~var14 && ~var14 >= ~var10 && (128 & this.field7339[var15][var14]) == 0) {
                     return true;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var12) {
         throw method3757(var12, field7345[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3759(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3760(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
