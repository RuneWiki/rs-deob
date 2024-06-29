import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class603 {
   @OriginalMember(
      owner = "client!uo",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8877 = new String[]{method4400(method4399("IXW\\\u007f")), method4400(method4399("IXW^\u007f")), method4400(method4399("IXWR\u007f")), method4400(method4399("IXWT\u007f")), method4400(method4399("IXWW\u007f")), method4400(method4399("IXWU\u007f")), method4400(method4399("IXWS\u007f")), method4400(method4399("IXW[\u007f")), method4400(method4399("IXWZ\u007f")), method4400(method4399("IXWY\u007f")), method4400(method4399("IXWQ\u007f")), method4400(method4399("IXW]\u007f")), method4400(method4399("IXWH\u007f")), method4400(method4399("IXW_\u007f")), method4400(method4399("IXWV\u007f")), method4400(method4399("IXWP\u007f"))};
   @OriginalMember(
      owner = "client!uo",
      name = "m",
      descriptor = "Leg;"
   )
   public static class118 field8863 = new class118(79, 4);
   @OriginalMember(
      owner = "client!uo",
      name = "f",
      descriptor = "Lwia;"
   )
   public static class793 field8872 = new class793();
   @OriginalMember(
      owner = "client!uo",
      name = "w",
      descriptor = "I"
   )
   public static int field8875 = 0;
   @OriginalMember(
      owner = "client!uo",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field8874 = new int[128];
   @OriginalMember(
      owner = "client!uo",
      name = "k",
      descriptor = "I"
   )
   public static int field8851;
   @OriginalMember(
      owner = "client!uo",
      name = "l",
      descriptor = "I"
   )
   public static int field8852;
   @OriginalMember(
      owner = "client!uo",
      name = "p",
      descriptor = "I"
   )
   public static int field8853;
   @OriginalMember(
      owner = "client!uo",
      name = "t",
      descriptor = "I"
   )
   public static int field8854;
   @OriginalMember(
      owner = "client!uo",
      name = "y",
      descriptor = "I"
   )
   public int field8855;
   @OriginalMember(
      owner = "client!uo",
      name = "i",
      descriptor = "I"
   )
   public static int field8856;
   @OriginalMember(
      owner = "client!uo",
      name = "u",
      descriptor = "I"
   )
   public static int field8857;
   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "I"
   )
   public static int field8858;
   @OriginalMember(
      owner = "client!uo",
      name = "r",
      descriptor = "I"
   )
   public static int field8859;
   @OriginalMember(
      owner = "client!uo",
      name = "v",
      descriptor = "I"
   )
   public int field8860;
   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "I"
   )
   public static int field8861;
   @OriginalMember(
      owner = "client!uo",
      name = "q",
      descriptor = "I"
   )
   public int field8862;
   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "I"
   )
   public static int field8864;
   @OriginalMember(
      owner = "client!uo",
      name = "x",
      descriptor = "I"
   )
   public static int field8865;
   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "I"
   )
   public static int field8866;
   @OriginalMember(
      owner = "client!uo",
      name = "j",
      descriptor = "I"
   )
   public static int field8867;
   @OriginalMember(
      owner = "client!uo",
      name = "h",
      descriptor = "I"
   )
   public static int field8868;
   @OriginalMember(
      owner = "client!uo",
      name = "o",
      descriptor = "I"
   )
   public static int field8869;
   @OriginalMember(
      owner = "client!uo",
      name = "n",
      descriptor = "I"
   )
   public int field8871;
   @OriginalMember(
      owner = "client!uo",
      name = "g",
      descriptor = "Lew;"
   )
   public static class521 field8876;
   @OriginalMember(
      owner = "client!uo",
      name = "d",
      descriptor = "[Z"
   )
   public static boolean[] field8873;
   @OriginalMember(
      owner = "client!uo",
      name = "s",
      descriptor = "[[I"
   )
   public int[][] field8870;

   static {
      for(int var0 = 0; field8874.length > var0; ++var0) {
         field8874[var0] = -1;
      }

      for(int var1 = 65; var1 <= 90; ++var1) {
         field8874[var1] = var1 + -65;
      }

      for(int var2 = 97; var2 <= 122; ++var2) {
         field8874[var2] = var2 + 26 + -97;
      }

      for(int var3 = 48; var3 <= 57; ++var3) {
         field8874[var3] = var3 + 4;
      }

      field8874[45] = field8874[47] = 63;
      field8874[42] = field8874[43] = 62;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IZIIZII)V",
      line = 3
   )
   public final void method4383(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
      try {
         ++field8851;
         int var11 = arg0 - this.field8860;
         int var12 = arg5 - this.field8871;
         if (arg2 == 0) {
            if (arg6 == 0) {
               this.method4385(var12, 128, var11, -1);
               this.method4385(var12, 8, var11 - 1, -1);
            }

            if (arg6 == 1) {
               this.method4385(var12, 2, var11, -1);
               this.method4385(var12 + 1, 32, var11, -1);
            }

            if (arg6 == 2) {
               this.method4385(var12, 8, var11, -1);
               this.method4385(var12, 128, var11 + 1, -1);
            }

            if (arg6 == 3) {
               this.method4385(var12, 32, var11, -1);
               this.method4385(var12 + -1, 2, var11, -1);
            }
         }

         if (arg2 == 1 || arg2 == 3) {
            if (~arg6 == -1) {
               this.method4385(var12, 1, var11, -1);
               this.method4385(var12 + 1, 16, var11 + -1, -1);
            }

            if (arg6 == 1) {
               this.method4385(var12, 4, var11, -1);
               this.method4385(var12 + 1, 64, var11 + 1, -1);
            }

            if (arg6 == 2) {
               this.method4385(var12, 16, var11, -1);
               this.method4385(var12 + -1, 1, var11 + 1, -1);
            }

            if (~arg6 == -4) {
               this.method4385(var12, 64, var11, -1);
               this.method4385(var12 + -1, 4, var11 - 1, -1);
            }
         }

         if (~arg2 == -3) {
            if (arg6 == 0) {
               this.method4385(var12, 130, var11, -1);
               this.method4385(var12, 8, var11 - 1, -1);
               this.method4385(var12 + 1, 32, var11, -1);
            }

            if (~arg6 == -2) {
               this.method4385(var12, 10, var11, -1);
               this.method4385(var12 + 1, 32, var11, -1);
               this.method4385(var12, 128, var11 + 1, -1);
            }

            if (~arg6 == -3) {
               this.method4385(var12, 40, var11, -1);
               this.method4385(var12, 128, var11 - -1, -1);
               this.method4385(var12 + -1, 2, var11, -1);
            }

            if (arg6 == 3) {
               this.method4385(var12, 160, var11, -1);
               this.method4385(var12 + -1, 2, var11, -1);
               this.method4385(var12, 8, var11 - 1, -1);
            }
         }

         if (arg1) {
            if (~arg2 == -1) {
               if (~arg6 == -1) {
                  this.method4385(var12, 65536, var11, -1);
                  this.method4385(var12, 4096, var11 + -1, -1);
               }

               if (~arg6 == -2) {
                  this.method4385(var12, 1024, var11, -1);
                  this.method4385(var12 - -1, 16384, var11, -1);
               }

               if (arg6 == 2) {
                  this.method4385(var12, 4096, var11, -1);
                  this.method4385(var12, 65536, var11 + 1, -1);
               }

               if (~arg6 == -4) {
                  this.method4385(var12, 16384, var11, -1);
                  this.method4385(var12 + -1, 1024, var11, -1);
               }
            }

            if (~arg2 == -2 || arg2 == 3) {
               if (arg6 == 0) {
                  this.method4385(var12, 512, var11, -1);
                  this.method4385(var12 + 1, 8192, var11 + -1, -1);
               }

               if (~arg6 == -2) {
                  this.method4385(var12, 2048, var11, -1);
                  this.method4385(var12 + 1, 32768, var11 + 1, -1);
               }

               if (arg6 == 2) {
                  this.method4385(var12, 8192, var11, -1);
                  this.method4385(var12 + -1, 512, var11 + 1, -1);
               }

               if (~arg6 == -4) {
                  this.method4385(var12, 32768, var11, -1);
                  this.method4385(var12 - 1, 2048, var11 + -1, -1);
               }
            }

            if (~arg2 == -3) {
               if (~arg6 == -1) {
                  this.method4385(var12, 66560, var11, -1);
                  this.method4385(var12, 4096, var11 + -1, -1);
                  this.method4385(var12 + 1, 16384, var11, -1);
               }

               if (~arg6 == -2) {
                  this.method4385(var12, 5120, var11, -1);
                  this.method4385(var12 + 1, 16384, var11, -1);
                  this.method4385(var12, 65536, var11 + 1, -1);
               }

               if (arg6 == 2) {
                  this.method4385(var12, 20480, var11, -1);
                  this.method4385(var12, 65536, var11 - -1, -1);
                  this.method4385(var12 + -1, 1024, var11, -1);
               }

               if (arg6 == 3) {
                  this.method4385(var12, 81920, var11, -1);
                  this.method4385(var12 + -1, 1024, var11, -1);
                  this.method4385(var12, 4096, var11 - 1, -1);
               }
            }
         }

         int var8 = 95 / ((-70 - arg3) / 48);
         if (arg4) {
            if (arg2 == 0) {
               if (~arg6 == -1) {
                  this.method4385(var12, 536870912, var11, -1);
                  this.method4385(var12, 33554432, var11 - 1, -1);
               }

               if (arg6 == 1) {
                  this.method4385(var12, 8388608, var11, -1);
                  this.method4385(var12 + 1, 134217728, var11, -1);
               }

               if (~arg6 == -3) {
                  this.method4385(var12, 33554432, var11, -1);
                  this.method4385(var12, 536870912, var11 - -1, -1);
               }

               if (arg6 == 3) {
                  this.method4385(var12, 134217728, var11, -1);
                  this.method4385(var12 + -1, 8388608, var11, -1);
               }
            }

            if (~arg2 == -2 || ~arg2 == -4) {
               if (arg6 == 0) {
                  this.method4385(var12, 4194304, var11, -1);
                  this.method4385(var12 - -1, 67108864, var11 + -1, -1);
               }

               if (~arg6 == -2) {
                  this.method4385(var12, 16777216, var11, -1);
                  this.method4385(var12 + 1, 268435456, var11 + 1, -1);
               }

               if (~arg6 == -3) {
                  this.method4385(var12, 67108864, var11, -1);
                  this.method4385(var12 - 1, 4194304, var11 + 1, -1);
               }

               if (~arg6 == -4) {
                  this.method4385(var12, 268435456, var11, -1);
                  this.method4385(var12 + -1, 16777216, var11 + -1, -1);
               }
            }

            if (arg2 == 2) {
               if (~arg6 == -1) {
                  this.method4385(var12, 545259520, var11, -1);
                  this.method4385(var12, 33554432, var11 + -1, -1);
                  this.method4385(var12 + 1, 134217728, var11, -1);
               }

               if (arg6 == 1) {
                  this.method4385(var12, 41943040, var11, -1);
                  this.method4385(var12 - -1, 134217728, var11, -1);
                  this.method4385(var12, 536870912, var11 + 1, -1);
               }

               if (~arg6 == -3) {
                  this.method4385(var12, 167772160, var11, -1);
                  this.method4385(var12, 536870912, var11 - -1, -1);
                  this.method4385(var12 + -1, 8388608, var11, -1);
               }

               if (arg6 == 3) {
                  this.method4385(var12, 671088640, var11, -1);
                  this.method4385(var12 + -1, 8388608, var11, -1);
                  this.method4385(var12, 33554432, var11 + -1, -1);
                  return;
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8877[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "(I)V",
      line = 313
   )
   public static void method4384(int arg0) {
      try {
         field8873 = null;
         if (arg0 != -1) {
            method4384(98);
         }

         field8872 = null;
         field8863 = null;
         field8876 = null;
         field8874 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8877[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "(IIII)V",
      line = 331
   )
   private final void method4385(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field8870[arg2][arg0] = class300.method2238(this.field8870[arg2][arg0], arg1);
         if (arg3 != -1) {
            this.method4395(49, -9, (byte)40);
         }

         ++field8864;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8877[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIIIIZZ)V",
      line = 342
   )
   public final void method4386(int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIB)V",
      line = 394
   )
   public final void method4387(int arg0, int arg1, byte arg2) {
      try {
         int var6 = arg0 - this.field8860;
         if (arg2 >= -27) {
            this.field8871 = -98;
         }

         ++field8852;
         int var7 = arg1 - this.field8871;
         this.field8870[var6][var7] = class300.method2238(this.field8870[var6][var7], 2097152);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8877[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIIIIIIIIB)Z",
      line = 408
   )
   public final boolean method4388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
      boolean var11 = client.field4360;

      try {
         label243: {
            ++field8859;
            int var12 = arg4 - -arg6;
            int var13 = arg0 + arg2;
            int var14 = arg7 - -arg1;
            int var15 = arg3 - -arg8;
            if (~arg4 != ~var14 || (2 & arg5) != 0) {
               if (~arg7 != ~var12 || (arg5 & 8) != 0) {
                  if (arg2 == var15 && (arg5 & 1) == 0) {
                     int var16 = ~arg4 < ~arg7 ? arg4 : arg7;
                     int var17 = ~var12 <= ~var14 ? var14 : var12;
                     if (var11) {
                        if ((this.field8870[var16 - this.field8860][-1 - this.field8871 + var15] & 2) == 0) {
                           return true;
                        }

                        ++var16;
                     }

                     while(true) {
                        while(~var17 < ~var16) {
                           if ((this.field8870[var16 - this.field8860][-1 - this.field8871 + var15] & 2) == 0) {
                              return true;
                           }

                           ++var16;
                        }

                        if (!var11) {
                           if (!var11) {
                              break label243;
                           }
                           break;
                        }

                        ++var16;
                     }
                  }

                  if (arg3 != var13 || ~(4 & arg5) != -1) {
                     break label243;
                  }

                  int var18 = ~arg4 < ~arg7 ? arg4 : arg7;
                  int var19 = var14 > var12 ? var12 : var14;
                  if (var11) {
                     if ((this.field8870[-this.field8860 + var18][-this.field8871 + arg3] & 32) == 0) {
                        return true;
                     }

                     ++var18;
                  }

                  while(true) {
                     while(var19 > var18) {
                        if ((this.field8870[-this.field8860 + var18][-this.field8871 + arg3] & 32) == 0) {
                           return true;
                        }

                        ++var18;
                     }

                     if (!var11) {
                        if (!var11) {
                           break label243;
                        }
                        break;
                     }

                     ++var18;
                  }
               }

               int var20 = ~arg3 <= ~arg2 ? arg3 : arg2;
               int var21 = var15 > var13 ? var13 : var15;
               if (var11) {
                  if (~(128 & this.field8870[-this.field8860 + arg7][-this.field8871 + var20]) == -1) {
                     return true;
                  }

                  ++var20;
               }

               while(true) {
                  while(~var20 > ~var21) {
                     if (~(128 & this.field8870[-this.field8860 + arg7][-this.field8871 + var20]) == -1) {
                        return true;
                     }

                     ++var20;
                  }

                  if (!var11) {
                     if (!var11) {
                        break label243;
                     }
                     break;
                  }

                  ++var20;
               }
            }

            int var22 = ~arg2 < ~arg3 ? arg2 : arg3;
            int var23 = var15 <= var13 ? var15 : var13;
            if (var11 || ~var22 > ~var23) {
               do {
                  if (~(this.field8870[var14 + -1 + -this.field8860][-this.field8871 + var22] & 8) == -1) {
                     return true;
                  }

                  ++var22;
               } while(~var22 > ~var23);
            }
         }

         if (arg9 >= -89) {
            this.method4396(-99, 23, 105);
         }

         return false;
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field8877[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIII)V",
      line = 504
   )
   private final void method4389(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 >= 88) {
            ++field8865;
            this.field8870[arg0][arg3] = class556.method3988(this.field8870[arg0][arg3], ~arg2);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8877[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIIIIIIB)Z",
      line = 517
   )
   public final boolean method4390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
      try {
         if (arg7 != -23) {
            this.method4388(34, -3, -14, -92, -74, -119, -4, 93, 51, (byte)-45);
         }

         ++field8858;
         if (~arg0 == -2) {
            if (arg4 == arg6 && arg2 == arg3) {
               return true;
            }
         } else if (arg6 <= arg4 && ~(arg0 + arg6 + -1) <= ~arg4 && arg3 >= arg3 && ~arg3 >= ~(arg3 - -arg0 + -1)) {
            return true;
         }

         int var16 = arg6 - this.field8860;
         int var15 = arg4 - this.field8860;
         int var14 = arg3 - this.field8871;
         int var13 = arg2 - this.field8871;
         if (~arg0 == -2) {
            if (arg1 == 6 || ~arg1 == -8) {
               if (arg1 == 7) {
                  arg5 = 3 & arg5 + 2;
               }

               if (~arg5 == -1) {
                  if (var15 + 1 == var16 && var13 == var14 && (this.field8870[var16][var13] & 128) == 0) {
                     return true;
                  }

                  if (~var15 == ~var16 && ~(var14 + -1) == ~var13 && ~(2 & this.field8870[var16][var13]) == -1) {
                     return true;
                  }
               } else if (arg5 == 1) {
                  if (~(var15 + -1) == ~var16 && ~var13 == ~var14 && (8 & this.field8870[var16][var13]) == 0) {
                     return true;
                  }

                  if (~var15 == ~var16 && var14 + -1 == var13 && (this.field8870[var16][var13] & 2) == 0) {
                     return true;
                  }
               } else if (arg5 == 2) {
                  if (~(var15 + -1) == ~var16 && ~var13 == ~var14 && (8 & this.field8870[var16][var13]) == 0) {
                     return true;
                  }

                  if (var15 == var16 && var14 - -1 == var13 && (this.field8870[var16][var13] & 32) == 0) {
                     return true;
                  }
               } else if (arg5 == 3) {
                  if (var15 - -1 == var16 && ~var13 == ~var14 && ~(128 & this.field8870[var16][var13]) == -1) {
                     return true;
                  }

                  if (var15 == var16 && var14 - -1 == var13 && (this.field8870[var16][var13] & 32) == 0) {
                     return true;
                  }
               }
            }

            if (arg1 == 8) {
               if (~var15 == ~var16 && var14 - -1 == var13 && ~(this.field8870[var16][var13] & 32) == -1) {
                  return true;
               }

               if (~var15 == ~var16 && var14 + -1 == var13 && (2 & this.field8870[var16][var13]) == 0) {
                  return true;
               }

               if (~(var15 - 1) == ~var16 && var13 == var14 && ~(this.field8870[var16][var13] & 8) == -1) {
                  return true;
               }

               if (~(var15 + 1) == ~var16 && ~var13 == ~var14 && (this.field8870[var16][var13] & 128) == 0) {
                  return true;
               }
            }
         } else {
            int var9 = arg0 + var16 + -1;
            int var10 = arg0 + var13 + -1;
            if (arg1 == 6 || ~arg1 == -8) {
               if (arg1 == 7) {
                  arg5 = arg5 + 2 & 3;
               }

               if (~arg5 == -1) {
                  if (~(var15 + 1) == ~var16 && ~var14 <= ~var13 && ~var10 <= ~var14 && (this.field8870[var16][var14] & 128) == 0) {
                     return true;
                  }

                  if (~var16 >= ~var15 && var15 <= var9 && var14 - arg0 == var13 && (this.field8870[var15][var10] & 2) == 0) {
                     return true;
                  }
               } else if (arg5 != 1) {
                  if (~arg5 == -3) {
                     if (~(-arg0 + var15) == ~var16 && var14 >= var13 && ~var14 >= ~var10 && (this.field8870[var9][var14] & 8) == 0) {
                        return true;
                     }

                     if (var16 <= var15 && var9 >= var15 && var14 + 1 == var13 && (32 & this.field8870[var15][var13]) == 0) {
                        return true;
                     }
                  } else if (arg5 == 3) {
                     if (~(var15 + 1) == ~var16 && var14 >= var13 && ~var14 >= ~var10 && ~(this.field8870[var16][var14] & 128) == -1) {
                        return true;
                     }

                     if (var15 >= var16 && var15 <= var9 && ~(var14 + 1) == ~var13 && (this.field8870[var15][var13] & 32) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (var15 - arg0 == var16 && ~var13 >= ~var14 && ~var10 <= ~var14 && (8 & this.field8870[var9][var14]) == 0) {
                     return true;
                  }

                  if (~var16 >= ~var15 && ~var9 <= ~var15 && -arg0 + var14 == var13 && (this.field8870[var15][var10] & 2) == 0) {
                     return true;
                  }
               }
            }

            if (~arg1 == -9) {
               if (var16 <= var15 && var9 >= var15 && var14 + 1 == var13 && (32 & this.field8870[var15][var13]) == 0) {
                  return true;
               }

               if (var15 >= var16 && var9 >= var15 && var14 - arg0 == var13 && (2 & this.field8870[var15][var10]) == 0) {
                  return true;
               }

               if (~(var15 - arg0) == ~var16 && var13 <= var14 && ~var14 >= ~var10 && ~(8 & this.field8870[var9][var14]) == -1) {
                  return true;
               }

               if (~(var15 - -1) == ~var16 && var14 >= var13 && var14 <= var10 && ~(128 & this.field8870[var16][var14]) == -1) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field8877[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIZIIZII)V",
      line = 706
   )
   public final void method4391(int param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 761
   )
   public final boolean method4392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg0 != 6) {
            field8872 = null;
         }

         ++field8861;
         if (arg8 > 1) {
            return class111.method905(arg4, arg8, arg2, arg5, arg6, arg7, arg0 ^ -86, arg8, arg3) ? true : this.method4388(arg8, arg2, arg6, arg4, arg5, arg1, arg8, arg3, arg7, (byte)-93);
         } else {
            int var10 = arg2 + arg3 - 1;
            int var11 = arg4 + arg7 + -1;
            if (~arg5 <= ~arg3 && arg5 <= var10 && ~arg6 <= ~arg4 && arg6 <= var11) {
               return true;
            } else if (~(arg3 + -1) == ~arg5 && ~arg4 >= ~arg6 && arg6 <= var11 && (8 & this.field8870[-this.field8860 + arg5][arg6 - this.field8871]) == 0 && ~(8 & arg1) == -1) {
               return true;
            } else if (~(var10 + 1) == ~arg5 && ~arg4 >= ~arg6 && arg6 <= var11 && (128 & this.field8870[arg5 - this.field8860][-this.field8871 + arg6]) == 0 && (2 & arg1) == 0) {
               return true;
            } else if (arg4 + -1 == arg6 && ~arg5 <= ~arg3 && ~var10 <= ~arg5 && ~(this.field8870[-this.field8860 + arg5][-this.field8871 + arg6] & 2) == -1 && ~(4 & arg1) == -1) {
               return true;
            } else {
               return ~(var11 - -1) == ~arg6 && ~arg3 >= ~arg5 && arg5 <= var10 && (this.field8870[-this.field8860 + arg5][-this.field8871 + arg6] & 32) == 0 && (1 & arg1) == 0;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field8877[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIIZIIZ)V",
      line = 806
   )
   public final void method4393(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
      try {
         int var11 = arg5 - this.field8860;
         ++field8856;
         int var10 = arg4 - this.field8871;
         if (arg2 == 0) {
            if (~arg0 == -1) {
               this.method4389(var11, 127, 128, var10);
               this.method4389(var11 + -1, 100, 8, var10);
            }

            if (arg0 == 1) {
               this.method4389(var11, 89, 2, var10);
               this.method4389(var11, 98, 32, var10 + 1);
            }

            if (~arg0 == -3) {
               this.method4389(var11, 100, 8, var10);
               this.method4389(var11 - -1, 126, 128, var10);
            }

            if (arg0 == 3) {
               this.method4389(var11, 100, 32, var10);
               this.method4389(var11, 94, 2, var10 - 1);
            }
         }

         if (~arg2 == -2 || arg2 == 3) {
            if (~arg0 == -1) {
               this.method4389(var11, 100, 1, var10);
               this.method4389(var11 + -1, 127, 16, var10 + 1);
            }

            if (arg0 == 1) {
               this.method4389(var11, 111, 4, var10);
               this.method4389(var11 - -1, 125, 64, var10 - -1);
            }

            if (arg0 == 2) {
               this.method4389(var11, 89, 16, var10);
               this.method4389(var11 - -1, 91, 1, var10 + -1);
            }

            if (arg0 == 3) {
               this.method4389(var11, 98, 64, var10);
               this.method4389(var11 + -1, 94, 4, var10 - 1);
            }
         }

         if (arg1 < 4) {
            this.method4383(84, true, 114, 115, false, 15, 35);
         }

         if (~arg2 == -3) {
            if (arg0 == 0) {
               this.method4389(var11, 89, 130, var10);
               this.method4389(var11 + -1, 111, 8, var10);
               this.method4389(var11, 108, 32, var10 - -1);
            }

            if (~arg0 == -2) {
               this.method4389(var11, 91, 10, var10);
               this.method4389(var11, 95, 32, var10 + 1);
               this.method4389(var11 + 1, 106, 128, var10);
            }

            if (~arg0 == -3) {
               this.method4389(var11, 92, 40, var10);
               this.method4389(var11 + 1, 116, 128, var10);
               this.method4389(var11, 121, 2, var10 + -1);
            }

            if (arg0 == 3) {
               this.method4389(var11, 106, 160, var10);
               this.method4389(var11, 118, 2, var10 + -1);
               this.method4389(var11 + -1, 99, 8, var10);
            }
         }

         if (arg6) {
            if (arg2 == 0) {
               if (arg0 == 0) {
                  this.method4389(var11, 121, 65536, var10);
                  this.method4389(var11 + -1, 104, 4096, var10);
               }

               if (arg0 == 1) {
                  this.method4389(var11, 119, 1024, var10);
                  this.method4389(var11, 116, 16384, var10 - -1);
               }

               if (~arg0 == -3) {
                  this.method4389(var11, 97, 4096, var10);
                  this.method4389(var11 + 1, 113, 65536, var10);
               }

               if (arg0 == 3) {
                  this.method4389(var11, 105, 16384, var10);
                  this.method4389(var11, 115, 1024, var10 + -1);
               }
            }

            if (arg2 == 1 || ~arg2 == -4) {
               if (~arg0 == -1) {
                  this.method4389(var11, 122, 512, var10);
                  this.method4389(var11 - 1, 104, 8192, var10 + 1);
               }

               if (~arg0 == -2) {
                  this.method4389(var11, 115, 2048, var10);
                  this.method4389(var11 + 1, 120, 32768, var10 + 1);
               }

               if (arg0 == 2) {
                  this.method4389(var11, 108, 8192, var10);
                  this.method4389(var11 + 1, 118, 512, var10 + -1);
               }

               if (~arg0 == -4) {
                  this.method4389(var11, 107, 32768, var10);
                  this.method4389(var11 + -1, 96, 2048, var10 + -1);
               }
            }

            if (~arg2 == -3) {
               if (~arg0 == -1) {
                  this.method4389(var11, 99, 66560, var10);
                  this.method4389(var11 + -1, 96, 4096, var10);
                  this.method4389(var11, 92, 16384, var10 + 1);
               }

               if (~arg0 == -2) {
                  this.method4389(var11, 124, 5120, var10);
                  this.method4389(var11, 98, 16384, var10 + 1);
                  this.method4389(var11 + 1, 127, 65536, var10);
               }

               if (arg0 == 2) {
                  this.method4389(var11, 103, 20480, var10);
                  this.method4389(var11 + 1, 91, 65536, var10);
                  this.method4389(var11, 89, 1024, var10 + -1);
               }

               if (~arg0 == -4) {
                  this.method4389(var11, 105, 81920, var10);
                  this.method4389(var11, 93, 1024, var10 - 1);
                  this.method4389(var11 + -1, 104, 4096, var10);
               }
            }
         }

         if (arg3) {
            if (~arg2 == -1) {
               if (arg0 == 0) {
                  this.method4389(var11, 124, 536870912, var10);
                  this.method4389(var11 - 1, 107, 33554432, var10);
               }

               if (~arg0 == -2) {
                  this.method4389(var11, 113, 8388608, var10);
                  this.method4389(var11, 105, 134217728, var10 + 1);
               }

               if (arg0 == 2) {
                  this.method4389(var11, 111, 33554432, var10);
                  this.method4389(var11 - -1, 110, 536870912, var10);
               }

               if (arg0 == 3) {
                  this.method4389(var11, 98, 134217728, var10);
                  this.method4389(var11, 92, 8388608, var10 - 1);
               }
            }

            if (~arg2 == -2 || ~arg2 == -4) {
               if (~arg0 == -1) {
                  this.method4389(var11, 93, 4194304, var10);
                  this.method4389(var11 + -1, 94, 67108864, var10 - -1);
               }

               if (~arg0 == -2) {
                  this.method4389(var11, 127, 16777216, var10);
                  this.method4389(var11 - -1, 115, 268435456, var10 - -1);
               }

               if (~arg0 == -3) {
                  this.method4389(var11, 101, 67108864, var10);
                  this.method4389(var11 + 1, 108, 4194304, var10 + -1);
               }

               if (~arg0 == -4) {
                  this.method4389(var11, 119, 268435456, var10);
                  this.method4389(var11 + -1, 89, 16777216, var10 + -1);
               }
            }

            if (~arg2 == -3) {
               if (~arg0 == -1) {
                  this.method4389(var11, 125, 545259520, var10);
                  this.method4389(var11 + -1, 122, 33554432, var10);
                  this.method4389(var11, 103, 134217728, var10 + 1);
               }

               if (~arg0 == -2) {
                  this.method4389(var11, 125, 41943040, var10);
                  this.method4389(var11, 117, 134217728, var10 - -1);
                  this.method4389(var11 + 1, 117, 536870912, var10);
               }

               if (arg0 == 2) {
                  this.method4389(var11, 108, 167772160, var10);
                  this.method4389(var11 - -1, 89, 536870912, var10);
                  this.method4389(var11, 96, 8388608, var10 - 1);
               }

               if (arg0 == 3) {
                  this.method4389(var11, 118, 671088640, var10);
                  this.method4389(var11, 89, 8388608, var10 + -1);
                  this.method4389(var11 - 1, 115, 33554432, var10);
                  return;
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8877[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "(IIB)V",
      line = 1119
   )
   public final void method4394(int arg0, int arg1, byte arg2) {
      try {
         ++field8868;
         if (arg2 < 108) {
            method4384(-56);
         }

         int var7 = arg1 - this.field8871;
         int var6 = arg0 - this.field8860;
         this.field8870[var6][var7] = class300.method2238(this.field8870[var6][var7], 262144);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8877[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "(IIB)V",
      line = 1138
   )
   public final void method4395(int arg0, int arg1, byte arg2) {
      try {
         int var8 = arg1 - this.field8860;
         int var4 = -31 / ((26 - arg2) / 33);
         ++field8854;
         int var7 = arg0 - this.field8871;
         this.field8870[var8][var7] = class556.method3988(this.field8870[var8][var7], -262145);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8877[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(III)V",
      line = 1152
   )
   public final void method4396(int arg0, int arg1, int arg2) {
      try {
         int var6 = arg1 - this.field8871;
         int var7 = arg2 - this.field8860;
         ++field8853;
         this.field8870[var7][var6] = class556.method3988(this.field8870[var7][var6], -2097153);
         if (arg0 > -83) {
            this.field8860 = -32;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8877[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(I)V",
      line = 1170
   )
   public final void method4397(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field8857;
         int var3 = 0;
         int var10000;
         if (var2) {
            var10000 = 0;
         } else if (~this.field8855 >= ~var3) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 != 31436) {
                  field8876 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            int var4 = var10000;
            if (var2) {
               if (var3 != 0) {
                  if (var4 != 0) {
                     if (~(this.field8855 + -5) < ~var3) {
                        if (~(this.field8862 + -5) >= ~var4) {
                           this.field8870[var3][var4] = -1;
                           if (var2) {
                              this.field8870[var3][var4] = 2097152;
                              ++var4;
                           } else {
                              ++var4;
                           }
                        } else {
                           this.field8870[var3][var4] = 2097152;
                           ++var4;
                        }
                     } else {
                        this.field8870[var3][var4] = -1;
                        if (var2) {
                           this.field8870[var3][var4] = 2097152;
                           ++var4;
                        } else {
                           ++var4;
                        }
                     }
                  } else {
                     this.field8870[var3][var4] = -1;
                     if (var2) {
                        this.field8870[var3][var4] = 2097152;
                        ++var4;
                     } else {
                        ++var4;
                     }
                  }
               } else {
                  this.field8870[var3][var4] = -1;
                  if (var2) {
                     this.field8870[var3][var4] = 2097152;
                     ++var4;
                  } else {
                     ++var4;
                  }
               }
            }

            while(true) {
               while(this.field8862 > var4) {
                  if (var3 != 0) {
                     if (var4 != 0) {
                        if (~(this.field8855 + -5) < ~var3) {
                           if (~(this.field8862 + -5) >= ~var4) {
                              this.field8870[var3][var4] = -1;
                              if (var2) {
                                 this.field8870[var3][var4] = 2097152;
                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           } else {
                              this.field8870[var3][var4] = 2097152;
                              ++var4;
                           }
                        } else {
                           this.field8870[var3][var4] = -1;
                           if (var2) {
                              this.field8870[var3][var4] = 2097152;
                              ++var4;
                           } else {
                              ++var4;
                           }
                        }
                     } else {
                        this.field8870[var3][var4] = -1;
                        if (var2) {
                           this.field8870[var3][var4] = 2097152;
                           ++var4;
                        } else {
                           ++var4;
                        }
                     }
                  } else {
                     this.field8870[var3][var4] = -1;
                     if (var2) {
                        this.field8870[var3][var4] = 2097152;
                        ++var4;
                     } else {
                        ++var4;
                     }
                  }
               }

               if (!var2) {
                  ++var3;
                  if (~this.field8855 >= ~var3) {
                     var10000 = arg0;
                     if (!var2) {
                        if (arg0 != 31436) {
                           field8876 = null;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = 0;
                  }
                  break;
               }

               if (var2) {
                  this.field8870[var3][var4] = 2097152;
                  ++var4;
               } else {
                  ++var4;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8877[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIZIIIII)Z",
      line = 1208
   )
   public final boolean method4398(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field8866;
         if (arg7 == 1) {
            if (arg0 == arg5 && arg1 == arg4) {
               return true;
            }
         } else if (~arg5 <= ~arg0 && ~(arg0 - (-arg7 + 1)) <= ~arg5 && ~arg4 <= ~arg4 && arg4 <= arg4 - (-arg7 + 1)) {
            return true;
         }

         int var15 = arg4 - this.field8871;
         int var13 = arg0 - this.field8860;
         int var14 = arg1 - this.field8871;
         int var16 = arg5 - this.field8860;
         if (arg2) {
            field8874 = null;
         }

         if (arg7 != 1) {
            int var9 = var13 + -1 - -arg7;
            int var10 = var14 + arg7 - 1;
            if (arg3 == 0) {
               if (arg6 != 0) {
                  if (arg6 == 1) {
                     if (var16 >= var13 && ~var16 >= ~var9 && var15 + 1 == var14) {
                        return true;
                     }

                     if (-arg7 + var16 == var13 && var14 <= var15 && var10 >= var15 && (this.field8870[var9][var15] & 2883848) == 0) {
                        return true;
                     }

                     if (var16 + 1 == var13 && ~var15 <= ~var14 && var10 >= var15 && (this.field8870[var13][var15] & 2883968) == 0) {
                        return true;
                     }
                  } else if (~arg6 != -3) {
                     if (arg6 == 3) {
                        if (var13 <= var16 && ~var9 <= ~var16 && -arg7 + var15 == var14) {
                           return true;
                        }

                        if (~(-arg7 + var16) == ~var13 && var14 <= var15 && var10 >= var15 && (2883848 & this.field8870[var9][var15]) == 0) {
                           return true;
                        }

                        if (var16 - -1 == var13 && ~var15 <= ~var14 && ~var15 >= ~var10 && (2883968 & this.field8870[var13][var15]) == 0) {
                           return true;
                        }
                     }
                  } else {
                     if (~(var16 + 1) == ~var13 && var14 <= var15 && ~var10 <= ~var15) {
                        return true;
                     }

                     if (var16 >= var13 && var9 >= var16 && ~(var15 - -1) == ~var14 && ~(this.field8870[var16][var14] & 2883872) == -1) {
                        return true;
                     }

                     if (var16 >= var13 && var16 <= var9 && var15 - arg7 == var14 && (2883842 & this.field8870[var16][var10]) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (~(-arg7 + var16) == ~var13 && ~var15 <= ~var14 && var15 <= var10) {
                     return true;
                  }

                  if (~var13 >= ~var16 && ~var16 >= ~var9 && ~(var15 + 1) == ~var14 && ~(2883872 & this.field8870[var16][var14]) == -1) {
                     return true;
                  }

                  if (~var13 >= ~var16 && var16 <= var9 && -arg7 + var15 == var14 && (2883842 & this.field8870[var16][var10]) == 0) {
                     return true;
                  }
               }
            }

            if (arg3 == 2) {
               if (~arg6 != -1) {
                  if (~arg6 == -2) {
                     if (~(-arg7 + var16) == ~var13 && ~var15 <= ~var14 && var15 <= var10 && (2883848 & this.field8870[var9][var15]) == 0) {
                        return true;
                     }

                     if (var16 >= var13 && ~var16 >= ~var9 && var15 - -1 == var14) {
                        return true;
                     }

                     if (~(var16 + 1) == ~var13 && ~var14 >= ~var15 && ~var15 >= ~var10) {
                        return true;
                     }

                     if (var13 <= var16 && var16 <= var9 && -arg7 + var15 == var14 && (2883842 & this.field8870[var16][var10]) == 0) {
                        return true;
                     }
                  } else if (arg6 != 2) {
                     if (arg6 == 3) {
                        if (~(-arg7 + var16) == ~var13 && var15 >= var14 && var10 >= var15) {
                           return true;
                        }

                        if (var16 >= var13 && ~var9 <= ~var16 && ~(var15 - -1) == ~var14 && ~(2883872 & this.field8870[var16][var14]) == -1) {
                           return true;
                        }

                        if (var16 + 1 == var13 && ~var15 <= ~var14 && var10 >= var15 && (this.field8870[var13][var15] & 2883968) == 0) {
                           return true;
                        }

                        if (var13 <= var16 && var16 <= var9 && ~(-arg7 + var15) == ~var14) {
                           return true;
                        }
                     }
                  } else {
                     if (~(-arg7 + var16) == ~var13 && ~var15 <= ~var14 && var10 >= var15 && (this.field8870[var9][var15] & 2883848) == 0) {
                        return true;
                     }

                     if (var16 >= var13 && var9 >= var16 && var15 - -1 == var14 && ~(this.field8870[var16][var14] & 2883872) == -1) {
                        return true;
                     }

                     if (~(var16 + 1) == ~var13 && ~var14 >= ~var15 && ~var10 <= ~var15) {
                        return true;
                     }

                     if (~var13 >= ~var16 && var9 >= var16 && ~(-arg7 + var15) == ~var14) {
                        return true;
                     }
                  }
               } else {
                  if (var16 - arg7 == var13 && ~var15 <= ~var14 && ~var15 >= ~var10) {
                     return true;
                  }

                  if (var13 <= var16 && ~var9 <= ~var16 && var15 - -1 == var14) {
                     return true;
                  }

                  if (~(var16 + 1) == ~var13 && var14 <= var15 && ~var10 <= ~var15 && (2883968 & this.field8870[var13][var15]) == 0) {
                     return true;
                  }

                  if (~var13 >= ~var16 && var16 <= var9 && -arg7 + var15 == var14 && (2883842 & this.field8870[var16][var10]) == 0) {
                     return true;
                  }
               }
            }

            if (~arg3 == -10) {
               if (var13 <= var16 && var9 >= var16 && ~(var15 + 1) == ~var14 && (this.field8870[var16][var14] & 2883872) == 0) {
                  return true;
               }

               if (var13 <= var16 && ~var16 >= ~var9 && -arg7 + var15 == var14 && (2883842 & this.field8870[var16][var10]) == 0) {
                  return true;
               }

               if (~(-arg7 + var16) == ~var13 && ~var15 <= ~var14 && ~var15 >= ~var10 && (this.field8870[var9][var15] & 2883848) == 0) {
                  return true;
               }

               if (var16 + 1 == var13 && ~var15 <= ~var14 && var10 >= var15 && (2883968 & this.field8870[var13][var15]) == 0) {
                  return true;
               }
            }
         } else {
            if (~arg3 == -1) {
               if (~arg6 != -1) {
                  if (arg6 != 1) {
                     if (~arg6 != -3) {
                        if (arg6 == 3) {
                           if (var13 == var16 && var15 + -1 == var14) {
                              return true;
                           }

                           if (var16 - 1 == var13 && ~var14 == ~var15 && ~(this.field8870[var13][var14] & 2883848) == -1) {
                              return true;
                           }

                           if (~(var16 + 1) == ~var13 && var14 == var15 && (2883968 & this.field8870[var13][var14]) == 0) {
                              return true;
                           }
                        }
                     } else {
                        if (var16 + 1 == var13 && ~var14 == ~var15) {
                           return true;
                        }

                        if (var13 == var16 && ~(var15 + 1) == ~var14 && (2883872 & this.field8870[var13][var14]) == 0) {
                           return true;
                        }

                        if (var13 == var16 && var15 + -1 == var14 && ~(2883842 & this.field8870[var13][var14]) == -1) {
                           return true;
                        }
                     }
                  } else {
                     if (var13 == var16 && ~(var15 - -1) == ~var14) {
                        return true;
                     }

                     if (~(var16 - 1) == ~var13 && ~var14 == ~var15 && ~(this.field8870[var13][var14] & 2883848) == -1) {
                        return true;
                     }

                     if (~(var16 - -1) == ~var13 && ~var14 == ~var15 && (this.field8870[var13][var14] & 2883968) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (var16 + -1 == var13 && ~var14 == ~var15) {
                     return true;
                  }

                  if (~var13 == ~var16 && ~(var15 - -1) == ~var14 && ~(2883872 & this.field8870[var13][var14]) == -1) {
                     return true;
                  }

                  if (var13 == var16 && ~(var15 + -1) == ~var14 && ~(2883842 & this.field8870[var13][var14]) == -1) {
                     return true;
                  }
               }
            }

            if (~arg3 == -3) {
               if (~arg6 != -1) {
                  if (~arg6 == -2) {
                     if (~(var16 - 1) == ~var13 && ~var14 == ~var15 && ~(2883848 & this.field8870[var13][var14]) == -1) {
                        return true;
                     }

                     if (var13 == var16 && var15 - -1 == var14) {
                        return true;
                     }

                     if (var16 + 1 == var13 && var14 == var15) {
                        return true;
                     }

                     if (var13 == var16 && var15 + -1 == var14 && ~(this.field8870[var13][var14] & 2883842) == -1) {
                        return true;
                     }
                  } else if (~arg6 == -3) {
                     if (var16 + -1 == var13 && var14 == var15 && (this.field8870[var13][var14] & 2883848) == 0) {
                        return true;
                     }

                     if (var13 == var16 && var15 + 1 == var14 && (this.field8870[var13][var14] & 2883872) == 0) {
                        return true;
                     }

                     if (~(var16 + 1) == ~var13 && var14 == var15) {
                        return true;
                     }

                     if (var13 == var16 && ~(var15 + -1) == ~var14) {
                        return true;
                     }
                  } else if (~arg6 == -4) {
                     if (var16 + -1 == var13 && ~var14 == ~var15) {
                        return true;
                     }

                     if (var13 == var16 && ~(var15 + 1) == ~var14 && ~(this.field8870[var13][var14] & 2883872) == -1) {
                        return true;
                     }

                     if (~(var16 + 1) == ~var13 && ~var14 == ~var15 && (this.field8870[var13][var14] & 2883968) == 0) {
                        return true;
                     }

                     if (~var13 == ~var16 && ~(var15 + -1) == ~var14) {
                        return true;
                     }
                  }
               } else {
                  if (var16 + -1 == var13 && var14 == var15) {
                     return true;
                  }

                  if (~var13 == ~var16 && ~(var15 + 1) == ~var14) {
                     return true;
                  }

                  if (~(var16 + 1) == ~var13 && var14 == var15 && ~(2883968 & this.field8870[var13][var14]) == -1) {
                     return true;
                  }

                  if (var13 == var16 && var15 - 1 == var14 && ~(2883842 & this.field8870[var13][var14]) == -1) {
                     return true;
                  }
               }
            }

            if (~arg3 == -10) {
               if (var13 == var16 && ~(var15 - -1) == ~var14 && ~(this.field8870[var13][var14] & 32) == -1) {
                  return true;
               }

               if (var13 == var16 && var15 + -1 == var14 && ~(this.field8870[var13][var14] & 2) == -1) {
                  return true;
               }

               if (~(var16 + -1) == ~var13 && var14 == var15 && (8 & this.field8870[var13][var14]) == 0) {
                  return true;
               }

               if (var16 + 1 == var13 && var14 == var15 && (128 & this.field8870[var13][var14]) == 0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field8877[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4399(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4400(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
