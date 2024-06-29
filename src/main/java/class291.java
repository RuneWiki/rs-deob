import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class291 extends class307 {
   @OriginalMember(
      owner = "client!qb",
      name = "A",
      descriptor = "I"
   )
   private int field4360;
   @OriginalMember(
      owner = "client!qb",
      name = "t",
      descriptor = "I"
   )
   private int field4359;
   @OriginalMember(
      owner = "client!qb",
      name = "r",
      descriptor = "Z"
   )
   private boolean field4356;
   @OriginalMember(
      owner = "client!qb",
      name = "q",
      descriptor = "I"
   )
   private int field4361;
   @OriginalMember(
      owner = "client!qb",
      name = "y",
      descriptor = "I"
   )
   private int field4353;
   @OriginalMember(
      owner = "client!qb",
      name = "w",
      descriptor = "I"
   )
   private int field4357;
   @OriginalMember(
      owner = "client!qb",
      name = "B",
      descriptor = "I"
   )
   private int field4354;
   @OriginalMember(
      owner = "client!qb",
      name = "u",
      descriptor = "I"
   )
   private int field4349;
   @OriginalMember(
      owner = "client!qb",
      name = "v",
      descriptor = "I"
   )
   private int field4350;
   @OriginalMember(
      owner = "client!qb",
      name = "o",
      descriptor = "I"
   )
   private int field4351;
   @OriginalMember(
      owner = "client!qb",
      name = "p",
      descriptor = "I"
   )
   private int field4352;
   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "I"
   )
   private int field4355;
   @OriginalMember(
      owner = "client!qb",
      name = "s",
      descriptor = "I"
   )
   private int field4358;
   @OriginalMember(
      owner = "client!qb",
      name = "x",
      descriptor = "I"
   )
   private int field4362;
   @OriginalMember(
      owner = "client!qb",
      name = "n",
      descriptor = "I"
   )
   private int field4363;

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "([B[IIIIIIIILqb;)I"
   )
   private static final int method2407(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class291 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
         var14 = arg7;
      }

      arg9.field4349 += (var14 - arg3) * arg9.field4352;
      arg9.field4351 += (var14 - arg3) * arg9.field4363;
      var14 -= 3;

      int var10001;
      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10--] * var12;
         int var15 = var12 + var13;
         int var18 = arg3++;
         arg1[var18] += arg0[var10--] * var15;
         int var16 = var13 + var15;
         int var19 = arg3++;
         arg1[var19] += arg0[var10--] * var16;
         int var17 = var13 + var16;
         int var20 = arg3++;
         arg1[var20] += arg0[var10--] * var17;
         var12 = var13 + var17;
      }

      var14 += 3;

      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10--] * var12;
         var12 += var13;
      }

      arg9.field4362 = var12 >> 2;
      arg9.field4354 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(II[B[IIIIIIIILqb;II)I"
   )
   private static final int method2408(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class291 arg11, int arg12, int arg13) {
      int var14;
      if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var15 = arg5 << 1;
      int var16 = var14 << 1;

      int var10001;
      while(var15 < var16) {
         int var21 = arg4 >> 8;
         byte var22 = arg2[var21 - 1];
         int var23 = (var22 << 8) + (arg4 & 255) * (arg2[var21] - var22);
         var10001 = var15++;
         arg3[var10001] += arg6 * var23 >> 6;
         int var24 = var15++;
         arg3[var24] += arg7 * var23 >> 6;
         arg4 += arg12;
      }

      int var17;
      if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
         var17 = arg9;
      }

      int var18 = var17 << 1;
      int var19 = arg13;

      while(var15 < var18) {
         int var20 = (var19 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var19);
         var10001 = var15++;
         arg3[var10001] += arg6 * var20 >> 6;
         var10001 = var15++;
         arg3[var10001] += arg7 * var20 >> 6;
         arg4 += arg12;
      }

      arg11.field4354 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method564(int[] arg0, int arg1, int arg2) {
      if (this.field4353 == 0 && this.field4350 == 0) {
         this.method561(arg2);
      } else {
         class301 var4 = (class301)super.field4642;
         int var5 = this.field4360 << 8;
         int var6 = this.field4359 << 8;
         int var7 = var4.field4493.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field4355 = 0;
         }

         int var9 = arg1;
         int var10 = arg1 + arg2;
         if (this.field4354 < 0) {
            if (this.field4361 <= 0) {
               this.method2428();
               this.method2140((byte)73);
               return;
            }

            this.field4354 = 0;
         }

         if (this.field4354 >= var7) {
            if (this.field4361 >= 0) {
               this.method2428();
               this.method2140((byte)-76);
               return;
            }

            this.field4354 = var7 - 1;
         }

         if (this.field4355 < 0) {
            if (this.field4356) {
               if (this.field4361 < 0) {
                  var9 = this.method2414(arg0, arg1, var5, var10, var4.field4493[this.field4360]);
                  if (this.field4354 >= var5) {
                     return;
                  }

                  this.field4354 = var5 + var5 - 1 - this.field4354;
                  this.field4361 = -this.field4361;
               }

               while(true) {
                  int var11 = this.method2441(arg0, var9, var6, var10, var4.field4493[this.field4359 - 1]);
                  if (this.field4354 < var6) {
                     return;
                  }

                  this.field4354 = var6 + var6 - 1 - this.field4354;
                  this.field4361 = -this.field4361;
                  var9 = this.method2414(arg0, var11, var5, var10, var4.field4493[this.field4360]);
                  if (this.field4354 >= var5) {
                     return;
                  }

                  this.field4354 = var5 + var5 - 1 - this.field4354;
                  this.field4361 = -this.field4361;
               }
            } else if (this.field4361 < 0) {
               while(true) {
                  var9 = this.method2414(arg0, var9, var5, var10, var4.field4493[this.field4359 - 1]);
                  if (this.field4354 >= var5) {
                     return;
                  }

                  this.field4354 = var6 - 1 - (var6 - 1 - this.field4354) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method2441(arg0, var9, var6, var10, var4.field4493[this.field4360]);
                  if (this.field4354 < var6) {
                     return;
                  }

                  this.field4354 = (this.field4354 - var5) % var8 + var5;
               }
            }
         } else {
            if (this.field4355 > 0) {
               if (this.field4356) {
                  label130: {
                     if (this.field4361 < 0) {
                        var9 = this.method2414(arg0, arg1, var5, var10, var4.field4493[this.field4360]);
                        if (this.field4354 >= var5) {
                           return;
                        }

                        this.field4354 = var5 + var5 - 1 - this.field4354;
                        this.field4361 = -this.field4361;
                        if (--this.field4355 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method2441(arg0, var9, var6, var10, var4.field4493[this.field4359 - 1]);
                        if (this.field4354 < var6) {
                           return;
                        }

                        this.field4354 = var6 + var6 - 1 - this.field4354;
                        this.field4361 = -this.field4361;
                        if (--this.field4355 == 0) {
                           break;
                        }

                        var9 = this.method2414(arg0, var9, var5, var10, var4.field4493[this.field4360]);
                        if (this.field4354 >= var5) {
                           return;
                        }

                        this.field4354 = var5 + var5 - 1 - this.field4354;
                        this.field4361 = -this.field4361;
                     } while(--this.field4355 != 0);
                  }
               } else if (this.field4361 < 0) {
                  while(true) {
                     var9 = this.method2414(arg0, var9, var5, var10, var4.field4493[this.field4359 - 1]);
                     if (this.field4354 >= var5) {
                        return;
                     }

                     int var12 = (var6 - 1 - this.field4354) / var8;
                     if (var12 >= this.field4355) {
                        this.field4354 += this.field4355 * var8;
                        this.field4355 = 0;
                        break;
                     }

                     this.field4354 += var8 * var12;
                     this.field4355 -= var12;
                  }
               } else {
                  while(true) {
                     var9 = this.method2441(arg0, var9, var6, var10, var4.field4493[this.field4360]);
                     if (this.field4354 < var6) {
                        return;
                     }

                     int var13 = (this.field4354 - var5) / var8;
                     if (var13 >= this.field4355) {
                        this.field4354 -= this.field4355 * var8;
                        this.field4355 = 0;
                        break;
                     }

                     this.field4354 -= var8 * var13;
                     this.field4355 -= var13;
                  }
               }
            }

            if (this.field4361 < 0) {
               this.method2414(arg0, var9, 0, var10, 0);
               if (this.field4354 < 0) {
                  this.field4354 = -1;
                  this.method2428();
                  this.method2140((byte)46);
                  return;
               }
            } else {
               this.method2441(arg0, var9, var7, var10, 0);
               if (this.field4354 >= var7) {
                  this.field4354 = var7;
                  this.method2428();
                  this.method2140((byte)113);
               }
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "g",
      descriptor = "(I)V"
   )
   private final synchronized void method2409(int arg0) {
      this.method2446(arg0, this.method2444());
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(III)V"
   )
   public final synchronized void method2410(int arg0, int arg1, int arg2) {
      if (arg0 == 0) {
         this.method2446(arg1, arg2);
      } else {
         int var4 = method2427(arg1, arg2);
         int var5 = method2426(arg1, arg2);
         if (this.field4349 == var4 && this.field4351 == var5) {
            this.field4350 = 0;
         } else {
            int var6 = arg1 - this.field4362;
            if (this.field4362 - arg1 > var6) {
               var6 = this.field4362 - arg1;
            }

            if (var4 - this.field4349 > var6) {
               var6 = var4 - this.field4349;
            }

            if (this.field4349 - var4 > var6) {
               var6 = this.field4349 - var4;
            }

            if (var5 - this.field4351 > var6) {
               var6 = var5 - this.field4351;
            }

            if (this.field4351 - var5 > var6) {
               var6 = this.field4351 - var5;
            }

            if (arg0 > var6) {
               arg0 = var6;
            }

            this.field4350 = arg0;
            this.field4353 = arg1;
            this.field4357 = arg2;
            this.field4358 = (arg1 - this.field4362) / arg0;
            this.field4352 = (var4 - this.field4349) / arg0;
            this.field4363 = (var5 - this.field4351) / arg0;
         }
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method2411() {
      return this.field4350 != 0;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "k",
      descriptor = "()V"
   )
   private final void method2412() {
      this.field4362 = this.field4353;
      this.field4349 = method2427(this.field4353, this.field4357);
      this.field4351 = method2426(this.field4353, this.field4357);
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(II[B[IIIIIIIIIILqb;II)I"
   )
   private static final int method2413(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class291 arg13, int arg14, int arg15) {
      arg13.field4362 -= arg13.field4358 * arg5;
      int var16;
      if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
         var16 = arg11;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var25 = arg4 >> 8;
         byte var26 = arg2[var25];
         int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
         var10001 = var17++;
         arg3[var10001] += arg6 * var27 >> 6;
         arg6 += arg8;
         int var28 = var17++;
         arg3[var28] += arg7 * var27 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var19;
      if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
         var19 = arg11;
      }

      int var20 = var19 << 1;
      int var21 = arg15;

      while(var17 < var20) {
         byte var23 = arg2[arg4 >> 8];
         int var24 = (var23 << 8) + (arg4 & 255) * (var21 - var23);
         var10001 = var17++;
         arg3[var10001] += arg6 * var24 >> 6;
         arg6 += arg8;
         var10001 = var17++;
         arg3[var10001] += arg7 * var24 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var22 = var17 >> 1;
      arg13.field4362 += arg13.field4358 * var22;
      arg13.field4349 = arg6;
      arg13.field4351 = arg7;
      arg13.field4354 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "([IIIII)I"
   )
   private final int method2414(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field4350 <= 0) {
            if (this.field4361 == -256 && (this.field4354 & 255) == 0) {
               if (class235.field3645) {
                  return method2436(0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, 0, arg3, arg2, this);
               }

               return method2417(((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, 0, arg3, arg2, this);
            }

            if (class235.field3645) {
               return method2408(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, 0, arg3, arg2, this, this.field4361, arg4);
            }

            return method2445(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, 0, arg3, arg2, this, this.field4361, arg4);
         }

         int var6 = this.field4350 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field4350 += arg1;
         if (this.field4361 == -256 && (this.field4354 & 255) == 0) {
            if (class235.field3645) {
               arg1 = method2429(0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, this.field4352, this.field4363, 0, var6, arg2, this);
            } else {
               arg1 = method2407(((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, this.field4358, 0, var6, arg2, this);
            }
         } else if (class235.field3645) {
            arg1 = method2430(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, this.field4352, this.field4363, 0, var6, arg2, this, this.field4361, arg4);
         } else {
            arg1 = method2440(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, this.field4358, 0, var6, arg2, this, this.field4361, arg4);
         }

         this.field4350 -= arg1;
         if (this.field4350 != 0) {
            return arg1;
         }
      } while(!this.method2435());

      return arg3;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "e",
      descriptor = "(I)V"
   )
   public final synchronized void method2415(int arg0) {
      this.method2446(this.method2443(), arg0);
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method561(int arg0) {
      if (this.field4350 > 0) {
         if (arg0 >= this.field4350) {
            if (this.field4353 == Integer.MIN_VALUE) {
               this.field4353 = 0;
               this.field4362 = this.field4349 = this.field4351 = 0;
               this.method2140((byte)-81);
               arg0 = this.field4350;
            }

            this.field4350 = 0;
            this.method2412();
         } else {
            this.field4362 += this.field4358 * arg0;
            this.field4349 += this.field4352 * arg0;
            this.field4351 += this.field4363 * arg0;
            this.field4350 -= arg0;
         }
      }

      class301 var2 = (class301)super.field4642;
      int var3 = this.field4360 << 8;
      int var4 = this.field4359 << 8;
      int var5 = var2.field4493.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field4355 = 0;
      }

      if (this.field4354 < 0) {
         if (this.field4361 <= 0) {
            this.method2428();
            this.method2140((byte)-76);
            return;
         }

         this.field4354 = 0;
      }

      if (this.field4354 >= var5) {
         if (this.field4361 >= 0) {
            this.method2428();
            this.method2140((byte)-83);
            return;
         }

         this.field4354 = var5 - 1;
      }

      this.field4354 += this.field4361 * arg0;
      if (this.field4355 < 0) {
         if (!this.field4356) {
            if (this.field4361 < 0) {
               if (this.field4354 < var3) {
                  this.field4354 = var4 - 1 - (var4 - 1 - this.field4354) % var6;
               }
            } else if (this.field4354 >= var4) {
               this.field4354 = (this.field4354 - var3) % var6 + var3;
            }
         } else {
            if (this.field4361 < 0) {
               if (this.field4354 >= var3) {
                  return;
               }

               this.field4354 = var3 + var3 - 1 - this.field4354;
               this.field4361 = -this.field4361;
            }

            while(this.field4354 >= var4) {
               this.field4354 = var4 + var4 - 1 - this.field4354;
               this.field4361 = -this.field4361;
               if (this.field4354 >= var3) {
                  return;
               }

               this.field4354 = var3 + var3 - 1 - this.field4354;
               this.field4361 = -this.field4361;
            }

         }
      } else {
         if (this.field4355 > 0) {
            if (this.field4356) {
               label125: {
                  if (this.field4361 < 0) {
                     if (this.field4354 >= var3) {
                        return;
                     }

                     this.field4354 = var3 + var3 - 1 - this.field4354;
                     this.field4361 = -this.field4361;
                     if (--this.field4355 == 0) {
                        break label125;
                     }
                  }

                  do {
                     if (this.field4354 < var4) {
                        return;
                     }

                     this.field4354 = var4 + var4 - 1 - this.field4354;
                     this.field4361 = -this.field4361;
                     if (--this.field4355 == 0) {
                        break;
                     }

                     if (this.field4354 >= var3) {
                        return;
                     }

                     this.field4354 = var3 + var3 - 1 - this.field4354;
                     this.field4361 = -this.field4361;
                  } while(--this.field4355 != 0);
               }
            } else if (this.field4361 < 0) {
               if (this.field4354 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field4354) / var6;
               if (var7 < this.field4355) {
                  this.field4354 += var6 * var7;
                  this.field4355 -= var7;
                  return;
               }

               this.field4354 += this.field4355 * var6;
               this.field4355 = 0;
            } else {
               if (this.field4354 < var4) {
                  return;
               }

               int var8 = (this.field4354 - var3) / var6;
               if (var8 < this.field4355) {
                  this.field4354 -= var6 * var8;
                  this.field4355 -= var8;
                  return;
               }

               this.field4354 -= this.field4355 * var6;
               this.field4355 = 0;
            }
         }

         if (this.field4361 < 0) {
            if (this.field4354 < 0) {
               this.field4354 = -1;
               this.method2428();
               this.method2140((byte)41);
               return;
            }
         } else if (this.field4354 >= var5) {
            this.field4354 = var5;
            this.method2428();
            this.method2140((byte)-106);
         }

      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "([B[IIIIIIIILqb;)I"
   )
   private static final int method2416(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class291 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var11 - var10) > arg7) {
         var14 = arg7;
      }

      arg9.field4349 += (var14 - arg3) * arg9.field4352;
      arg9.field4351 += (var14 - arg3) * arg9.field4363;
      var14 -= 3;

      int var10001;
      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10++] * var12;
         int var15 = var12 + var13;
         int var18 = arg3++;
         arg1[var18] += arg0[var10++] * var15;
         int var16 = var13 + var15;
         int var19 = arg3++;
         arg1[var19] += arg0[var10++] * var16;
         int var17 = var13 + var16;
         int var20 = arg3++;
         arg1[var20] += arg0[var10++] * var17;
         var12 = var13 + var17;
      }

      var14 += 3;

      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10++] * var12;
         var12 += var13;
      }

      arg9.field4362 = var12 >> 2;
      arg9.field4354 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "([B[IIIIIIILqb;)I"
   )
   private static final int method2417(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class291 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12;
      if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
         var12 = arg6;
      }

      var12 -= 3;

      int var10001;
      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9--] * var11;
         int var13 = arg3++;
         arg1[var13] += arg0[var9--] * var11;
         int var14 = arg3++;
         arg1[var14] += arg0[var9--] * var11;
         int var15 = arg3++;
         arg1[var15] += arg0[var9--] * var11;
      }

      var12 += 3;

      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9--] * var11;
      }

      arg8.field4354 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "()Lnj;"
   )
   public final class307 method566() {
      return null;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "(II[B[IIIIIIIILqb;II)I"
   )
   private static final int method2418(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class291 arg11, int arg12, int arg13) {
      arg11.field4349 -= arg11.field4352 * arg5;
      arg11.field4351 -= arg11.field4363 * arg5;
      int var14;
      if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var10001;
      while(arg5 < var14) {
         int var18 = arg4 >> 8;
         byte var19 = arg2[var18];
         var10001 = arg5++;
         arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18 + 1] - var19)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      int var15;
      if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
         var15 = arg9;
      }

      int var16 = arg13;

      while(arg5 < var15) {
         byte var17 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (var16 - var17)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      arg11.field4349 += arg11.field4352 * arg5;
      arg11.field4351 += arg11.field4363 * arg5;
      arg11.field4362 = arg6;
      arg11.field4354 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "j",
      descriptor = "(I)V"
   )
   public final synchronized void method2419(int arg0) {
      this.method2446(arg0 << 6, this.method2444());
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(Laia;III)Lqb;"
   )
   public static final class291 method2420(class301 arg0, int arg1, int arg2, int arg3) {
      return arg0.field4493 != null && arg0.field4493.length != 0 ? new class291(arg0, arg1, arg2, arg3) : null;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "(II)V"
   )
   public final synchronized void method2421(int arg0, int arg1) {
      this.method2410(arg0, arg1, this.method2444());
   }

   @OriginalMember(
      owner = "client!qb",
      name = "d",
      descriptor = "(II[B[IIIIIIIILqb;II)I"
   )
   private static final int method2422(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class291 arg11, int arg12, int arg13) {
      int var14;
      if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var15 = arg5 << 1;
      int var16 = var14 << 1;

      int var10001;
      while(var15 < var16) {
         int var22 = arg4 >> 8;
         byte var23 = arg2[var22];
         int var24 = (var23 << 8) + (arg4 & 255) * (arg2[var22 + 1] - var23);
         var10001 = var15++;
         arg3[var10001] += arg6 * var24 >> 6;
         int var25 = var15++;
         arg3[var25] += arg7 * var24 >> 6;
         arg4 += arg12;
      }

      int var17;
      if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
         var17 = arg9;
      }

      int var18 = var17 << 1;
      int var19 = arg13;

      while(var15 < var18) {
         byte var20 = arg2[arg4 >> 8];
         int var21 = (var20 << 8) + (arg4 & 255) * (var19 - var20);
         var10001 = var15++;
         arg3[var10001] += arg6 * var21 >> 6;
         var10001 = var15++;
         arg3[var10001] += arg7 * var21 >> 6;
         arg4 += arg12;
      }

      arg11.field4354 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "d",
      descriptor = "()I"
   )
   public final int method563() {
      return this.field4353 == 0 && this.field4350 == 0 ? 0 : 1;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method2423(int arg0) {
      this.field4355 = arg0;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method2424(boolean arg0) {
      this.field4361 = (this.field4361 >>> 31) + (this.field4361 ^ this.field4361 >> 31);
      if (arg0) {
         this.field4361 = -this.field4361;
      }

   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(I[B[IIIIIIIIIILqb;)I"
   )
   private static final int method2425(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class291 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19;
      if ((var19 = arg4 + var14 - var13) > arg10) {
         var19 = arg10;
      }

      arg12.field4362 += (var19 - arg4) * arg12.field4358;
      int var20 = arg4 << 1;
      int var21 = var19 << 1;
      int var44 = var21 - 6;

      while(var20 < var44) {
         byte var23 = arg1[var13++];
         int var33 = var20++;
         arg2[var33] += var15 * var23;
         int var24 = var15 + var17;
         int var34 = var20++;
         arg2[var34] += var16 * var23;
         int var25 = var16 + var18;
         byte var26 = arg1[var13++];
         int var36 = var20++;
         arg2[var36] += var24 * var26;
         int var27 = var17 + var24;
         int var37 = var20++;
         arg2[var37] += var25 * var26;
         int var28 = var18 + var25;
         byte var29 = arg1[var13++];
         int var39 = var20++;
         arg2[var39] += var27 * var29;
         int var30 = var17 + var27;
         int var40 = var20++;
         arg2[var40] += var28 * var29;
         int var31 = var18 + var28;
         byte var32 = arg1[var13++];
         int var42 = var20++;
         arg2[var42] += var30 * var32;
         var15 = var17 + var30;
         int var43 = var20++;
         arg2[var43] += var31 * var32;
         var16 = var18 + var31;
      }

      var21 = var44 + 6;

      while(var20 < var21) {
         byte var22 = arg1[var13++];
         int var10001 = var20++;
         arg2[var10001] += var15 * var22;
         var15 += var17;
         int var45 = var20++;
         arg2[var45] += var16 * var22;
         var16 += var18;
      }

      arg12.field4349 = var15 >> 2;
      arg12.field4351 = var16 >> 2;
      arg12.field4354 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(II)I"
   )
   private static final int method2426(int arg0, int arg1) {
      return arg1 < 0 ? -arg0 : (int)((double)arg0 * Math.sqrt((double)arg1 * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!qb",
      name = "d",
      descriptor = "(II)I"
   )
   private static final int method2427(int arg0, int arg1) {
      return arg1 < 0 ? arg0 : (int)((double)arg0 * Math.sqrt((double)(16384 - arg1) * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!qb",
      name = "i",
      descriptor = "()V"
   )
   private final void method2428() {
      if (this.field4350 != 0) {
         if (this.field4353 == Integer.MIN_VALUE) {
            this.field4353 = 0;
         }

         this.field4350 = 0;
         this.method2412();
      }

   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(I[B[IIIIIIIIIILqb;)I"
   )
   private static final int method2429(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class291 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19;
      if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
         var19 = arg10;
      }

      arg12.field4362 += (var19 - arg4) * arg12.field4358;
      int var20 = arg4 << 1;
      int var21 = var19 << 1;
      int var44 = var21 - 6;

      while(var20 < var44) {
         byte var23 = arg1[var13--];
         int var33 = var20++;
         arg2[var33] += var15 * var23;
         int var24 = var15 + var17;
         int var34 = var20++;
         arg2[var34] += var16 * var23;
         int var25 = var16 + var18;
         byte var26 = arg1[var13--];
         int var36 = var20++;
         arg2[var36] += var24 * var26;
         int var27 = var17 + var24;
         int var37 = var20++;
         arg2[var37] += var25 * var26;
         int var28 = var18 + var25;
         byte var29 = arg1[var13--];
         int var39 = var20++;
         arg2[var39] += var27 * var29;
         int var30 = var17 + var27;
         int var40 = var20++;
         arg2[var40] += var28 * var29;
         int var31 = var18 + var28;
         byte var32 = arg1[var13--];
         int var42 = var20++;
         arg2[var42] += var30 * var32;
         var15 = var17 + var30;
         int var43 = var20++;
         arg2[var43] += var31 * var32;
         var16 = var18 + var31;
      }

      var21 = var44 + 6;

      while(var20 < var21) {
         byte var22 = arg1[var13--];
         int var10001 = var20++;
         arg2[var10001] += var15 * var22;
         var15 += var17;
         int var45 = var20++;
         arg2[var45] += var16 * var22;
         var16 += var18;
      }

      arg12.field4349 = var15 >> 2;
      arg12.field4351 = var16 >> 2;
      arg12.field4354 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(II[B[IIIIIIIIIILqb;II)I"
   )
   private static final int method2430(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class291 arg13, int arg14, int arg15) {
      arg13.field4362 -= arg13.field4358 * arg5;
      int var16;
      if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
         var16 = arg11;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var24 = arg4 >> 8;
         byte var25 = arg2[var24 - 1];
         int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
         var10001 = var17++;
         arg3[var10001] += arg6 * var26 >> 6;
         arg6 += arg8;
         int var27 = var17++;
         arg3[var27] += arg7 * var26 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var19;
      if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
         var19 = arg11;
      }

      int var20 = var19 << 1;
      int var21 = arg15;

      while(var17 < var20) {
         int var23 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
         var10001 = var17++;
         arg3[var10001] += arg6 * var23 >> 6;
         arg6 += arg8;
         var10001 = var17++;
         arg3[var10001] += arg7 * var23 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var22 = var17 >> 1;
      arg13.field4362 += arg13.field4358 * var22;
      arg13.field4349 = arg6;
      arg13.field4351 = arg7;
      arg13.field4354 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "()I"
   )
   public final int method2431() {
      int var1 = this.field4362 * 3 >> 6;
      int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
      if (this.field4355 == 0) {
         var2 -= this.field4354 * var2 / (((class301)super.field4642).field4493.length << 8);
      } else if (this.field4355 >= 0) {
         var2 -= this.field4360 * var2 / ((class301)super.field4642).field4493.length;
      }

      return var2 > 255 ? 255 : var2;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(II[B[IIIIIIILqb;II)I"
   )
   private static final int method2432(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class291 arg10, int arg11, int arg12) {
      int var13;
      if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
         var13 = arg8;
      }

      int var10001;
      while(arg5 < var13) {
         int var17 = arg4 >> 8;
         byte var18 = arg2[var17];
         var10001 = arg5++;
         arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6 >> 6;
         arg4 += arg11;
      }

      int var14;
      if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
         var14 = arg8;
      }

      int var15 = arg12;

      while(arg5 < var14) {
         byte var16 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6 >> 6;
         arg4 += arg11;
      }

      arg10.field4354 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "f",
      descriptor = "(I)V"
   )
   public final synchronized void method2433(int arg0) {
      int var2 = ((class301)super.field4642).field4493.length << 8;
      if (arg0 < -1) {
         arg0 = -1;
      }

      if (arg0 > var2) {
         arg0 = var2;
      }

      this.field4354 = arg0;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "i",
      descriptor = "(I)V"
   )
   public final synchronized void method2434(int arg0) {
      if (this.field4361 < 0) {
         this.field4361 = -arg0;
      } else {
         this.field4361 = arg0;
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "h",
      descriptor = "()Z"
   )
   private final boolean method2435() {
      int var1 = this.field4353;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method2427(var1, this.field4357);
         var2 = method2426(var1, this.field4357);
      }

      if (this.field4362 == var1 && this.field4349 == var3 && this.field4351 == var2) {
         if (this.field4353 == Integer.MIN_VALUE) {
            this.field4353 = 0;
            this.field4362 = this.field4349 = this.field4351 = 0;
            this.method2140((byte)-91);
            return true;
         } else {
            this.method2412();
            return false;
         }
      } else {
         if (this.field4362 < var1) {
            this.field4358 = 1;
            this.field4350 = var1 - this.field4362;
         } else if (this.field4362 > var1) {
            this.field4358 = -1;
            this.field4350 = this.field4362 - var1;
         } else {
            this.field4358 = 0;
         }

         if (this.field4349 < var3) {
            this.field4352 = 1;
            if (this.field4350 == 0 || this.field4350 > var3 - this.field4349) {
               this.field4350 = var3 - this.field4349;
            }
         } else if (this.field4349 > var3) {
            this.field4352 = -1;
            if (this.field4350 == 0 || this.field4350 > this.field4349 - var3) {
               this.field4350 = this.field4349 - var3;
            }
         } else {
            this.field4352 = 0;
         }

         if (this.field4351 < var2) {
            this.field4363 = 1;
            if (this.field4350 == 0 || this.field4350 > var2 - this.field4351) {
               this.field4350 = var2 - this.field4351;
            }
         } else if (this.field4351 > var2) {
            this.field4363 = -1;
            if (this.field4350 == 0 || this.field4350 > this.field4351 - var2) {
               this.field4350 = this.field4351 - var2;
            }
         } else {
            this.field4363 = 0;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(I[B[IIIIIIIILqb;)I"
   )
   private static final int method2436(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class291 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15;
      if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
         var15 = arg8;
      }

      int var16 = arg4 << 1;
      int var17 = var15 << 1;
      int var23 = var17 - 6;

      while(var16 < var23) {
         byte var19 = arg1[var11--];
         int var24 = var16++;
         arg2[var24] += var13 * var19;
         int var25 = var16++;
         arg2[var25] += var14 * var19;
         byte var20 = arg1[var11--];
         int var27 = var16++;
         arg2[var27] += var13 * var20;
         int var28 = var16++;
         arg2[var28] += var14 * var20;
         byte var21 = arg1[var11--];
         int var30 = var16++;
         arg2[var30] += var13 * var21;
         int var31 = var16++;
         arg2[var31] += var14 * var21;
         byte var22 = arg1[var11--];
         int var33 = var16++;
         arg2[var33] += var13 * var22;
         int var34 = var16++;
         arg2[var34] += var14 * var22;
      }

      var17 = var23 + 6;

      while(var16 < var17) {
         byte var18 = arg1[var11--];
         int var10001 = var16++;
         arg2[var10001] += var13 * var18;
         int var35 = var16++;
         arg2[var35] += var14 * var18;
      }

      arg10.field4354 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "()Lnj;"
   )
   public final class307 method558() {
      return null;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "j",
      descriptor = "()I"
   )
   public final synchronized int method2437() {
      return this.field4361 < 0 ? -this.field4361 : this.field4361;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "h",
      descriptor = "(I)V"
   )
   public final synchronized void method2438(int arg0) {
      if (arg0 == 0) {
         this.method2409(0);
         this.method2140((byte)-78);
      } else if (this.field4349 == 0 && this.field4351 == 0) {
         this.field4350 = 0;
         this.field4353 = 0;
         this.field4362 = 0;
         this.method2140((byte)49);
      } else {
         int var2 = -this.field4362;
         if (this.field4362 > var2) {
            var2 = this.field4362;
         }

         if (-this.field4349 > var2) {
            var2 = -this.field4349;
         }

         if (this.field4349 > var2) {
            var2 = this.field4349;
         }

         if (-this.field4351 > var2) {
            var2 = -this.field4351;
         }

         if (this.field4351 > var2) {
            var2 = this.field4351;
         }

         if (arg0 > var2) {
            arg0 = var2;
         }

         this.field4350 = arg0;
         this.field4353 = Integer.MIN_VALUE;
         this.field4358 = -this.field4362 / arg0;
         this.field4352 = -this.field4349 / arg0;
         this.field4363 = -this.field4351 / arg0;
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(I[B[IIIIIIIILqb;)I"
   )
   private static final int method2439(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class291 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15;
      if ((var15 = arg4 + var12 - var11) > arg8) {
         var15 = arg8;
      }

      int var16 = arg4 << 1;
      int var17 = var15 << 1;
      int var23 = var17 - 6;

      while(var16 < var23) {
         byte var19 = arg1[var11++];
         int var24 = var16++;
         arg2[var24] += var13 * var19;
         int var25 = var16++;
         arg2[var25] += var14 * var19;
         byte var20 = arg1[var11++];
         int var27 = var16++;
         arg2[var27] += var13 * var20;
         int var28 = var16++;
         arg2[var28] += var14 * var20;
         byte var21 = arg1[var11++];
         int var30 = var16++;
         arg2[var30] += var13 * var21;
         int var31 = var16++;
         arg2[var31] += var14 * var21;
         byte var22 = arg1[var11++];
         int var33 = var16++;
         arg2[var33] += var13 * var22;
         int var34 = var16++;
         arg2[var34] += var14 * var22;
      }

      var17 = var23 + 6;

      while(var16 < var17) {
         byte var18 = arg1[var11++];
         int var10001 = var16++;
         arg2[var10001] += var13 * var18;
         int var35 = var16++;
         arg2[var35] += var14 * var18;
      }

      arg10.field4354 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(II[B[IIIIIIIILqb;II)I"
   )
   private static final int method2440(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class291 arg11, int arg12, int arg13) {
      arg11.field4349 -= arg11.field4352 * arg5;
      arg11.field4351 -= arg11.field4363 * arg5;
      int var14;
      if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var10001;
      while(arg5 < var14) {
         int var18 = arg4 >> 8;
         byte var19 = arg2[var18 - 1];
         var10001 = arg5++;
         arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18] - var19)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      int var15;
      if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var15 = arg9;
      }

      int var16 = arg13;
      int var17 = arg12;

      while(arg5 < var15) {
         var10001 = arg5++;
         arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var16)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += var17;
      }

      arg11.field4349 += arg11.field4352 * arg5;
      arg11.field4351 += arg11.field4363 * arg5;
      arg11.field4362 = arg6;
      arg11.field4354 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "([IIIII)I"
   )
   private final int method2441(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field4350 <= 0) {
            if (this.field4361 == 256 && (this.field4354 & 255) == 0) {
               if (class235.field3645) {
                  return method2439(0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, 0, arg3, arg2, this);
               }

               return method2442(((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, 0, arg3, arg2, this);
            }

            if (class235.field3645) {
               return method2422(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, 0, arg3, arg2, this, this.field4361, arg4);
            }

            return method2432(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, 0, arg3, arg2, this, this.field4361, arg4);
         }

         int var6 = this.field4350 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field4350 += arg1;
         if (this.field4361 == 256 && (this.field4354 & 255) == 0) {
            if (class235.field3645) {
               arg1 = method2425(0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, this.field4352, this.field4363, 0, var6, arg2, this);
            } else {
               arg1 = method2416(((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, this.field4358, 0, var6, arg2, this);
            }
         } else if (class235.field3645) {
            arg1 = method2413(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4349, this.field4351, this.field4352, this.field4363, 0, var6, arg2, this, this.field4361, arg4);
         } else {
            arg1 = method2418(0, 0, ((class301)super.field4642).field4493, arg0, this.field4354, arg1, this.field4362, this.field4358, 0, var6, arg2, this, this.field4361, arg4);
         }

         this.field4350 -= arg1;
         if (this.field4350 != 0) {
            return arg1;
         }
      } while(!this.method2435());

      return arg3;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "([B[IIIIIIILqb;)I"
   )
   private static final int method2442(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class291 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12;
      if ((var12 = arg3 + var10 - var9) > arg6) {
         var12 = arg6;
      }

      var12 -= 3;

      int var10001;
      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9++] * var11;
         int var13 = arg3++;
         arg1[var13] += arg0[var9++] * var11;
         int var14 = arg3++;
         arg1[var14] += arg0[var9++] * var11;
         int var15 = arg3++;
         arg1[var15] += arg0[var9++] * var11;
      }

      var12 += 3;

      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9++] * var11;
      }

      arg8.field4354 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "g",
      descriptor = "()I"
   )
   public final synchronized int method2443() {
      return this.field4353 == Integer.MIN_VALUE ? 0 : this.field4353;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "e",
      descriptor = "()I"
   )
   public final synchronized int method2444() {
      return this.field4357 < 0 ? -1 : this.field4357;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(II[B[IIIIIIILqb;II)I"
   )
   private static final int method2445(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class291 arg10, int arg11, int arg12) {
      int var13;
      if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var13 = arg8;
      }

      int var10001;
      while(arg5 < var13) {
         int var17 = arg4 >> 8;
         byte var18 = arg2[var17 - 1];
         var10001 = arg5++;
         arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6 >> 6;
         arg4 += arg11;
      }

      int var14;
      if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var14 = arg8;
      }

      int var15 = arg12;
      int var16 = arg11;

      while(arg5 < var14) {
         var10001 = arg5++;
         arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6 >> 6;
         arg4 += var16;
      }

      arg10.field4354 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(II)V"
   )
   private final synchronized void method2446(int arg0, int arg1) {
      this.field4353 = arg0;
      this.field4357 = arg1;
      this.field4350 = 0;
      this.method2412();
   }

   @OriginalMember(
      owner = "client!qb",
      name = "<init>",
      descriptor = "(Laia;III)V"
   )
   private class291(class301 arg0, int arg1, int arg2, int arg3) {
      super.field4642 = arg0;
      this.field4360 = arg0.field4495;
      this.field4359 = arg0.field4492;
      this.field4356 = arg0.field4496;
      this.field4361 = arg1;
      this.field4353 = arg2;
      this.field4357 = arg3;
      this.field4354 = 0;
      this.method2412();
   }

   @OriginalMember(
      owner = "client!qb",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method2447() {
      return this.field4354 < 0 || this.field4354 >= ((class301)super.field4642).field4493.length << 8;
   }
}
