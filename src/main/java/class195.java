import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class195 extends class479 {
   @OriginalMember(
      owner = "client!pq",
      name = "hb",
      descriptor = "Z"
   )
   private boolean field2469;
   @OriginalMember(
      owner = "client!pq",
      name = "U",
      descriptor = "Z"
   )
   private boolean field2471;
   @OriginalMember(
      owner = "client!pq",
      name = "ab",
      descriptor = "Lhv;"
   )
   private class227 field2467;
   @OriginalMember(
      owner = "client!pq",
      name = "H",
      descriptor = "I"
   )
   public int field2478;
   @OriginalMember(
      owner = "client!pq",
      name = "R",
      descriptor = "I"
   )
   public int field2483;
   @OriginalMember(
      owner = "client!pq",
      name = "J",
      descriptor = "I"
   )
   public int field2492;
   @OriginalMember(
      owner = "client!pq",
      name = "N",
      descriptor = "I"
   )
   public int field2491;
   @OriginalMember(
      owner = "client!pq",
      name = "ob",
      descriptor = "Z"
   )
   private boolean field2494;
   @OriginalMember(
      owner = "client!pq",
      name = "Y",
      descriptor = "I"
   )
   public int field2480;
   @OriginalMember(
      owner = "client!pq",
      name = "w",
      descriptor = "I"
   )
   private int field2497;
   @OriginalMember(
      owner = "client!pq",
      name = "cb",
      descriptor = "I"
   )
   public int field2493;
   @OriginalMember(
      owner = "client!pq",
      name = "y",
      descriptor = "I"
   )
   public int field2501;
   @OriginalMember(
      owner = "client!pq",
      name = "O",
      descriptor = "I"
   )
   public int field2510;
   @OriginalMember(
      owner = "client!pq",
      name = "E",
      descriptor = "I"
   )
   private int field2508;
   @OriginalMember(
      owner = "client!pq",
      name = "kb",
      descriptor = "I"
   )
   public int field2509;
   @OriginalMember(
      owner = "client!pq",
      name = "lb",
      descriptor = "I"
   )
   public int field2503;
   @OriginalMember(
      owner = "client!pq",
      name = "u",
      descriptor = "I"
   )
   public int field2512;
   @OriginalMember(
      owner = "client!pq",
      name = "jb",
      descriptor = "I"
   )
   public int field2495;
   @OriginalMember(
      owner = "client!pq",
      name = "pb",
      descriptor = "Lsia;"
   )
   private class407 field2498;
   @OriginalMember(
      owner = "client!pq",
      name = "mb",
      descriptor = "I"
   )
   private int field2514;
   @OriginalMember(
      owner = "client!pq",
      name = "x",
      descriptor = "Lsia;"
   )
   private class407 field2507;
   @OriginalMember(
      owner = "client!pq",
      name = "bb",
      descriptor = "Lkp;"
   )
   public class432 field2475;
   @OriginalMember(
      owner = "client!pq",
      name = "db",
      descriptor = "I"
   )
   private int field2466;
   @OriginalMember(
      owner = "client!pq",
      name = "rb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2515 = new String[]{method1630(method1629("[A\u0013<vAU\u00178")), method1630(method1629("Hd4")), method1630(method1629("dR\u0007")), method1630(method1629("E[A\u0014\u0002"))};
   @OriginalMember(
      owner = "client!pq",
      name = "ib",
      descriptor = "I"
   )
   private int field2472;
   @OriginalMember(
      owner = "client!pq",
      name = "V",
      descriptor = "I"
   )
   private int field2473;
   @OriginalMember(
      owner = "client!pq",
      name = "A",
      descriptor = "I"
   )
   public int field2474;
   @OriginalMember(
      owner = "client!pq",
      name = "G",
      descriptor = "I"
   )
   public int field2476;
   @OriginalMember(
      owner = "client!pq",
      name = "B",
      descriptor = "I"
   )
   private int field2477;
   @OriginalMember(
      owner = "client!pq",
      name = "Z",
      descriptor = "I"
   )
   private int field2479;
   @OriginalMember(
      owner = "client!pq",
      name = "Q",
      descriptor = "I"
   )
   public int field2481;
   @OriginalMember(
      owner = "client!pq",
      name = "D",
      descriptor = "I"
   )
   public int field2482;
   @OriginalMember(
      owner = "client!pq",
      name = "gb",
      descriptor = "I"
   )
   public int field2485;
   @OriginalMember(
      owner = "client!pq",
      name = "qb",
      descriptor = "I"
   )
   public int field2486;
   @OriginalMember(
      owner = "client!pq",
      name = "v",
      descriptor = "I"
   )
   public int field2487;
   @OriginalMember(
      owner = "client!pq",
      name = "C",
      descriptor = "I"
   )
   public int field2488;
   @OriginalMember(
      owner = "client!pq",
      name = "S",
      descriptor = "I"
   )
   public int field2499;
   @OriginalMember(
      owner = "client!pq",
      name = "M",
      descriptor = "I"
   )
   private int field2500;
   @OriginalMember(
      owner = "client!pq",
      name = "W",
      descriptor = "I"
   )
   public int field2502;
   @OriginalMember(
      owner = "client!pq",
      name = "fb",
      descriptor = "I"
   )
   private int field2504;
   @OriginalMember(
      owner = "client!pq",
      name = "F",
      descriptor = "I"
   )
   public int field2505;
   @OriginalMember(
      owner = "client!pq",
      name = "nb",
      descriptor = "I"
   )
   private int field2511;
   @OriginalMember(
      owner = "client!pq",
      name = "P",
      descriptor = "Lfba;"
   )
   public class629 field2468;
   @OriginalMember(
      owner = "client!pq",
      name = "I",
      descriptor = "Lpd;"
   )
   private class648 field2513;
   @OriginalMember(
      owner = "client!pq",
      name = "L",
      descriptor = "Lqf;"
   )
   private class786 field2506;
   @OriginalMember(
      owner = "client!pq",
      name = "X",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field2470;
   @OriginalMember(
      owner = "client!pq",
      name = "T",
      descriptor = "[F"
   )
   public float[] field2489;
   @OriginalMember(
      owner = "client!pq",
      name = "eb",
      descriptor = "[F"
   )
   public float[] field2496;
   @OriginalMember(
      owner = "client!pq",
      name = "K",
      descriptor = "[I"
   )
   public int[] field2490;
   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "[Lsr;"
   )
   private class640[] field2484;

   @OriginalMember(
      owner = "client!pq",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method418(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field2510 = (int)(arg1 * 65535.0F);
      this.field2480 = (int)(arg2 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
      this.field2481 = (int)(arg3 * 65535.0F / var7);
      this.field2488 = (int)(arg4 * 65535.0F / var7);
      this.field2482 = (int)(arg5 * 65535.0F / var7);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg1 >= this.field2512 && arg1 < this.field2495) {
         if (arg0 < this.field2483) {
            arg2 -= this.field2483 - arg0;
            arg0 = this.field2483;
         }

         if (arg0 + arg2 > this.field2492) {
            arg2 = this.field2492 - arg0;
         }

         int var6 = this.field2486 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field2490[var6 + var10];
                  int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                  this.field2490[var6 + var10] = var8 + var12;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var13 = 0; var13 < arg2; ++var13) {
                  int var14 = this.field2490[var6 + var13];
                  int var15 = arg3 + var14;
                  int var16 = (arg3 & 16711935) + (var14 & 16711935);
                  int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                  this.field2490[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
               }

            }
         } else {
            for(int var18 = 0; var18 < arg2; ++var18) {
               this.field2490[var6 + var18] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "i",
      descriptor = "()I"
   )
   public final int method519() {
      return this.field2509;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "n",
      descriptor = "(I)Z"
   )
   public final boolean method1612(int arg0) {
      return super.field6667.method915(arg0, 126);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method412(int arg0, int arg1, int arg2, int arg3) {
      if (this.field2483 < arg0) {
         this.field2483 = arg0;
      }

      if (this.field2512 < arg1) {
         this.field2512 = arg1;
      }

      if (this.field2492 > arg2) {
         this.field2492 = arg2;
      }

      if (this.field2495 > arg3) {
         this.field2495 = arg3;
      }

      this.method1614();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method461() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method405(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method428(float arg0) {
      this.field2493 = (int)(arg0 * 65535.0F);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method410(int arg0, int arg1) {
      int var3 = this.field2486 * arg1 + arg0;
      int var4 = this.field2504 * arg1 + arg0;
      if (var3 != 0 || var4 != 0) {
         int[] var5 = this.field2490;
         float[] var6 = this.field2489;
         if (var3 < 0) {
            int var7 = var5.length + var3;
            class349.method2759(var5, -var3, var5, 0, var7);
         } else if (var3 > 0) {
            int var8 = var5.length - var3;
            class349.method2759(var5, 0, var5, var3, var8);
         }

         if (var4 < 0) {
            int var9 = var6.length + var4;
            class349.method2763(var6, -var4, var6, 0, var9);
         } else {
            if (var4 > 0) {
               int var10 = var6.length - var4;
               class349.method2763(var6, 0, var6, var4, var10);
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "y",
      descriptor = "()V"
   )
   public final void method393() {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "([IIIIIZ)Lpd;"
   )
   public final class648 method398(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = false;
      int var8 = arg1;

      for(int var9 = 0; var9 < arg4; ++var9) {
         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg0[var8++] >>> 24;
            if (var11 != 0 && var11 != 255) {
               var7 = true;
               return var7 ? new class298(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class701(this, arg0, arg1, arg2, arg3, arg4, arg5);
            }
         }
      }

      return var7 ? new class298(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class701(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "o",
      descriptor = "(I)[I"
   )
   public final int[] method1613(int arg0) {
      class407 var2 = this.field2507;
      class312 var3;
      synchronized(this.field2507) {
         var3 = (class312)this.field2507.method3192((long)arg0 | Long.MIN_VALUE, (byte)-107);
         if (var3 == null) {
            if (!super.field6667.method915(arg0, 127)) {
               return null;
            }

            class668 var5 = super.field6667.method911(arg0, 34);
            int var6 = !var5.field9901 && !this.field2494 ? this.field2503 : 64;
            var3 = new class312(arg0, var6, super.field6667.method914(arg0, var6, var6, true, 0.7F, true), var5.field9898 != 1);
            this.field2507.method3190(var3, (long)arg0 | Long.MIN_VALUE, 8);
         }
      }

      var3.field4339 = true;
      return var3.method2486();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method439(int arg0, int arg1, int arg2, int arg3) {
      class640 var5 = this.method1622(Thread.currentThread());
      var5.field9390 = arg0;
      var5.field9383 = arg1;
      var5.field9378 = arg2;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg2 - arg0;
      int var8 = arg3 - arg1;
      if (var8 == 0) {
         if (var7 >= 0) {
            this.method474(arg0, arg1, var7 + 1, arg4, arg5);
         } else {
            this.method474(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
         }
      } else if (var7 == 0) {
         if (var8 >= 0) {
            this.method463(arg0, arg1, var8 + 1, arg4, arg5);
         } else {
            this.method463(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
         }
      } else {
         if (var7 + var8 < 0) {
            arg0 += var7;
            var7 = -var7;
            arg1 += var8;
            var8 = -var8;
         }

         if (var7 > var8) {
            int var9 = arg1 << 16;
            int var10 = var9 + 32768;
            int var11 = var8 << 16;
            int var12 = (int)Math.floor((double)var11 / (double)var7 + 0.5D);
            int var13 = arg0 + var7;
            if (arg0 < this.field2483) {
               var10 += (this.field2483 - arg0) * var12;
               arg0 = this.field2483;
            }

            if (var13 >= this.field2492) {
               var13 = this.field2492 - 1;
            }

            int var14 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
               if (arg5 == 1) {
                  int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                  int var16 = 256 - var14;

                  while(arg0 <= var13) {
                     int var17 = var10 >> 16;
                     if (var17 >= this.field2512 && var17 < this.field2495) {
                        int var18 = this.field2486 * var17 + arg0;
                        int var19 = this.field2490[var18];
                        int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                        this.field2490[var18] = var15 + var20;
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var13) {
                     int var21 = var10 >> 16;
                     if (var21 >= this.field2512 && var21 < this.field2495) {
                        int var22 = this.field2486 * var21 + arg0;
                        int var23 = this.field2490[var22];
                        int var24 = arg4 + var23;
                        int var25 = (arg4 & 16711935) + (var23 & 16711935);
                        int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                        this.field2490[var22] = var24 - var26 | var26 - (var26 >>> 8);
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               while(arg0 <= var13) {
                  int var27 = var10 >> 16;
                  if (var27 >= this.field2512 && var27 < this.field2495) {
                     this.field2490[this.field2486 * var27 + arg0] = arg4;
                  }

                  var10 += var12;
                  ++arg0;
               }

            }
         } else {
            int var28 = arg0 << 16;
            int var29 = var28 + 32768;
            int var30 = var7 << 16;
            int var31 = (int)Math.floor((double)var30 / (double)var8 + 0.5D);
            int var32 = arg1 + var8;
            if (arg1 < this.field2512) {
               var29 += (this.field2512 - arg1) * var31;
               arg1 = this.field2512;
            }

            if (var32 >= this.field2495) {
               var32 = this.field2495 - 1;
            }

            int var33 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var33 == 255) {
               while(arg1 <= var32) {
                  int var46 = var29 >> 16;
                  if (var46 >= this.field2483 && var46 < this.field2492) {
                     this.field2490[this.field2486 * arg1 + var46] = arg4;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 1) {
               int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var35 = 256 - var33;

               while(arg1 <= var32) {
                  int var36 = var29 >> 16;
                  if (var36 >= this.field2483 && var36 < this.field2492) {
                     int var37 = this.field2486 * arg1 + var36;
                     int var38 = this.field2490[var37];
                     int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                     this.field2490[this.field2486 * arg1 + var36] = var34 + var39;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 2) {
               while(arg1 <= var32) {
                  int var40 = var29 >> 16;
                  if (var40 >= this.field2483 && var40 < this.field2492) {
                     int var41 = this.field2486 * arg1 + var40;
                     int var42 = this.field2490[var41];
                     int var43 = arg4 + var42;
                     int var44 = (arg4 & 16711935) + (var42 & 16711935);
                     int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                     this.field2490[var41] = var43 - var45 | var45 - (var45 >>> 8);
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else {
               throw new IllegalArgumentException();
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "p",
      descriptor = "()Lkia;"
   )
   public final class93 method396() {
      class640 var1 = this.method1622(Thread.currentThread());
      return var1.field9389;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lkc;Lkc;FLkc;)Lkc;"
   )
   public final class72 method407(class72 arg0, class72 arg1, float arg2, class72 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "ya",
      descriptor = "()V"
   )
   public final void method502() {
      if (this.field2483 == 0 && this.field2492 == this.field2486 && this.field2512 == 0 && this.field2495 == this.field2477) {
         int var1 = this.field2489.length;
         int var2 = var1 - (var1 & 7);
         int var3 = 0;

         while(var3 < var2) {
            this.field2489[var3++] = 2.1474836E9F;
            this.field2489[var3++] = 2.1474836E9F;
            this.field2489[var3++] = 2.1474836E9F;
            this.field2489[var3++] = 2.1474836E9F;
            this.field2489[var3++] = 2.1474836E9F;
            this.field2489[var3++] = 2.1474836E9F;
            this.field2489[var3++] = 2.1474836E9F;
            this.field2489[var3++] = 2.1474836E9F;
         }

         while(var3 < var1) {
            this.field2489[var3++] = 2.1474836E9F;
         }

      } else {
         int var4 = this.field2492 - this.field2483;
         int var5 = this.field2495 - this.field2512;
         int var6 = this.field2486 - var4;
         int var7 = this.field2512 * this.field2486 + this.field2483;
         int var8 = var4 >> 3;
         int var9 = var4 & 7;
         int var10 = var7 - 1;

         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var8 > 0) {
               int var12 = var8;

               do {
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  --var12;
               } while(var12 > 0);
            }

            if (var9 > 0) {
               int var13 = var9;

               do {
                  ++var10;
                  this.field2489[var10] = 2.1474836E9F;
                  --var13;
               } while(var13 > 0);
            }

            var10 += var6;
         }

      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "la",
      descriptor = "()V"
   )
   public final void method443() {
      this.field2483 = 0;
      this.field2512 = 0;
      this.field2492 = this.field2486;
      this.field2495 = this.field2477;
      this.method1614();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class423 method482(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class474(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method433() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method432(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "M",
      descriptor = "()I"
   )
   public final int method497() {
      int var1 = this.field2497;
      this.field2497 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method504(int arg0, int arg1, int arg2, int arg3) {
      this.field2474 = arg0;
      this.field2505 = arg1;
      this.field2491 = arg2;
      this.field2501 = arg3;
      this.method1614();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method458(int arg0) {
      int var2 = arg0 - this.field2466;

      for(Object var3 = this.field2507.method3199(false); var3 != null; var3 = this.field2507.method3196((byte)46)) {
         class312 var4 = (class312)var3;
         if (var4.field4339) {
            var4.field4341 += var2;
            int var5 = var4.field4341 / 20;
            if (var5 > 0) {
               class668 var6 = super.field6667.method911(var4.field4338, 74);
               var4.method2485(var6.field9905 * var2 * 50 / 1000, var6.field9909 * var2 * 50 / 1000);
               var4.field4341 -= var5 * 20;
            }

            var4.field4339 = false;
         }
      }

      this.field2466 = arg0;
      this.field2498.method3197(5, 5);
      this.field2507.method3197(5, 5);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "B",
      descriptor = "()V"
   )
   private final void method1614() {
      this.field2502 = this.field2483 - this.field2474;
      this.field2485 = this.field2492 - this.field2474;
      this.field2487 = this.field2512 - this.field2505;
      this.field2499 = this.field2495 - this.field2505;

      for(int var1 = 0; var1 < this.field2476; ++var1) {
         class236 var5 = this.field2484[var1].field9425;
         var5.field2961 = this.field2474 - this.field2483;
         var5.field2975 = this.field2505 - this.field2512;
         var5.field2965 = this.field2492 - this.field2483;
         var5.field2964 = this.field2495 - this.field2512;
      }

      int var2 = this.field2512 * this.field2486 + this.field2483;

      for(int var3 = this.field2512; var3 < this.field2495; ++var3) {
         for(int var4 = 0; var4 < this.field2476; ++var4) {
            this.field2484[var4].field9425.field2966[var3 - this.field2512] = var2;
         }

         var2 += this.field2486;
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lkr;)V"
   )
   public final void method510(class122 arg0) {
      class786 var2 = (class786)arg0;
      this.field2486 = var2.field11480;
      this.field2477 = var2.field11477;
      this.field2490 = var2.field11486;
      this.field2506 = var2;
      this.field2504 = var2.field11480;
      this.field2479 = var2.field11477;
      this.field2489 = var2.field11479;
      this.method1625();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method406(int arg0, int arg1) {
      class640 var3 = this.method1622(Thread.currentThread());
      this.field2509 = arg0;
      this.field2478 = arg1;
      var3.field9386 = this.field2478 - 255;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method516(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field2484.length; ++var4) {
         class640 var5 = this.field2484[var4];
         var5.field9383 = arg0 & 16777215;
         int var6 = var5.field9383 >>> 16 & 255;
         if (var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.field9383 >> 8 & 255;
         if (var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.field9383 & 255;
         if (var8 < 2) {
            var8 = 2;
         }

         var5.field9383 = var6 << 16 | var7 << 8 | var8;
         if (arg1 < 0) {
            var5.field9393 = false;
         } else {
            var5.field9393 = true;
         }
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method500() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method468(int arg0) {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      class640 var14 = this.method1622(Thread.currentThread());
      class236 var15 = var14.field9425;
      var15.field2960 = false;
      int var16 = arg0 - this.field2502;
      int var17 = arg3 - this.field2502;
      int var18 = arg6 - this.field2502;
      int var19 = arg1 - this.field2487;
      int var20 = arg4 - this.field2487;
      int var21 = arg7 - this.field2487;
      var15.field2972 = var16 < 0 || var16 > var15.field2965 || var17 < 0 || var17 > var15.field2965 || var18 < 0 || var18 > var15.field2965;
      int var22 = arg9 >>> 24;
      if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
         if (arg12 == 1) {
            var15.field2969 = 255 - var22;
            var15.field2974 = false;
            var15.method1882((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         } else {
            if (arg12 != 2) {
               throw new IllegalArgumentException();
            }

            var15.field2969 = 128;
            var15.field2974 = true;
            var15.method1882((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         }
      } else {
         var15.field2969 = 0;
         var15.field2974 = false;
         var15.method1882((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
      }

      var15.field2960 = true;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method437(boolean arg0) {
      class640 var2 = this.method1622(Thread.currentThread());
      var2.field9392 = arg0;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "e",
      descriptor = "(II)Loga;"
   )
   public final class179 method415(int arg0, int arg1) {
      return this.method435(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "e",
      descriptor = "(I)Lza;"
   )
   public final class735 method469(int arg0) {
      return null;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "k",
      descriptor = "(I)Z"
   )
   public final boolean method1615(int arg0) {
      return this.field2494 || super.field6667.method911(arg0, -97).field9901;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "pa",
      descriptor = "()V"
   )
   public final void method512() {
      for(int var1 = 0; var1 < this.field2484.length; ++var1) {
         this.field2484[var1].field9383 = this.field2484[var1].field9394;
         this.field2484[var1].field9382 = false;
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method411(Canvas arg0, int arg1, int arg2) {
      class629 var4 = (class629)this.field2467.method1818(-1, (long)arg0.hashCode());
      if (var4 == null) {
         class629 var5 = class382.method3029(arg1, (byte)-68, arg0, arg2);
         this.field2467.method1808((long)arg0.hashCode(), var5, 26459);
      } else {
         if (var4.field9287 != arg1 || var4.field9288 != arg2) {
            this.method496(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method422() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lnh;)V"
   )
   public final void method508(class554 arg0) {
      class640 var2 = this.method1622(Thread.currentThread());
      class439 var3 = arg0.field8138.field918;

      for(class439 var4 = var3.field5973; var3 != var4; var4 = var4.field5973) {
         class74 var5 = (class74)var4;
         int var6 = var5.field974 >> 12;
         int var7 = var5.field976 >> 12;
         int var8 = var5.field977 >> 12;
         float var9 = (float)var8 * this.field2475.field5883 + (float)var6 * this.field2475.field5888 + (float)var7 * this.field2475.field5878 + this.field2475.field5892;
         if (!(var9 < (float)this.field2509) && !(var9 > (float)var2.field9386)) {
            int var10 = (int)(((float)var8 * this.field2475.field5889 + (float)var6 * this.field2475.field5893 + (float)var7 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / var9) + this.field2474;
            int var11 = (int)(((float)var8 * this.field2475.field5869 + (float)var6 * this.field2475.field5885 + (float)var7 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / var9) + this.field2505;
            if (var10 >= this.field2483 && var10 <= this.field2492 && var11 >= this.field2512 && var11 <= this.field2495) {
               if (var9 == 0.0F) {
                  var9 = 1.0F;
               }

               this.method1617(var5, var10, var11, (int)var9, (int)((float)(this.field2491 * var5.field982 >> 12) / var9));
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      float var8 = (float)arg2 * this.field2475.field5883 + (float)arg0 * this.field2475.field5888 + (float)arg1 * this.field2475.field5878 + this.field2475.field5892;
      float var9 = (float)arg5 * this.field2475.field5883 + (float)arg3 * this.field2475.field5888 + (float)arg4 * this.field2475.field5878 + this.field2475.field5892;
      int var10 = 0;
      if (var8 < (float)this.field2509 && var9 < (float)this.field2509) {
         var10 |= 16;
      } else if (var8 > (float)this.field2478 && var9 > (float)this.field2478) {
         var10 |= 32;
      }

      int var11 = (int)(((float)arg2 * this.field2475.field5889 + (float)arg0 * this.field2475.field5893 + (float)arg1 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / (float)arg6);
      int var12 = (int)(((float)arg5 * this.field2475.field5889 + (float)arg3 * this.field2475.field5893 + (float)arg4 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / (float)arg6);
      if (var11 < this.field2502 && var12 < this.field2502) {
         var10 |= 1;
      } else if (var11 > this.field2485 && var12 > this.field2485) {
         var10 |= 2;
      }

      int var13 = (int)(((float)arg2 * this.field2475.field5869 + (float)arg0 * this.field2475.field5885 + (float)arg1 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / (float)arg6);
      int var14 = (int)(((float)arg5 * this.field2475.field5869 + (float)arg3 * this.field2475.field5885 + (float)arg4 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / (float)arg6);
      if (var13 < this.field2487 && var14 < this.field2487) {
         var10 |= 4;
      } else if (var13 > this.field2499 && var14 > this.field2499) {
         var10 |= 8;
      }

      return var10;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lkia;)V"
   )
   public final void method397(class93 arg0) {
      this.field2475 = (class432)arg0;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method416(int[] arg0) {
      arg0[0] = this.field2486;
      arg0[1] = this.field2477;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "<init>",
      descriptor = "(Ld;)V"
   )
   private class195(class102 arg0) {
      super(arg0);
      this.field2469 = false;
      this.field2471 = false;
      this.field2467 = new class227(4);
      this.field2478 = 3500;
      this.field2483 = 0;
      this.field2492 = 0;
      this.field2491 = 512;
      this.field2494 = false;
      this.field2480 = 78642;
      this.field2497 = 0;
      this.field2493 = 75518;
      this.field2501 = 512;
      this.field2510 = 45823;
      this.field2508 = 0;
      this.field2509 = 50;
      this.field2503 = 128;
      this.field2512 = 0;
      this.field2495 = 0;
      this.field2498 = new class407(16);
      this.field2514 = -1;

      try {
         this.field2507 = new class407(256);
         this.field2475 = new class432();
         this.method514(1);
         this.method394(0);
         class387.method3051(-54, true, true);
         this.field2471 = true;
         this.field2466 = (int)class163.method1353(-121);
      } catch (Throwable var3) {
         var3.printStackTrace();
         this.method3649(false);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "q",
      descriptor = "()V"
   )
   public final void method518() {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "l",
      descriptor = "(I)[I"
   )
   public final int[] method1616(int arg0) {
      class407 var2 = this.field2507;
      class312 var3;
      synchronized(this.field2507) {
         var3 = (class312)this.field2507.method3192((long)arg0, (byte)-127);
         if (var3 == null) {
            if (!super.field6667.method915(arg0, 127)) {
               return null;
            }

            class668 var5 = super.field6667.method911(arg0, 42);
            int var6 = !var5.field9901 && !this.field2494 ? this.field2503 : 64;
            var3 = new class312(arg0, var6, super.field6667.method913(var6, arg0, true, 126, 0.7F, var6), var5.field9898 != 1);
            this.field2507.method3190(var3, (long)arg0, 8);
         }
      }

      var3.field4339 = true;
      return var3.method2486();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method496(Canvas arg0, int arg1, int arg2) {
      class629 var4 = (class629)this.field2467.method1818(-1, (long)arg0.hashCode());
      if (var4 != null) {
         var4.method4924(-2970);
         class629 var5 = class382.method3029(arg1, (byte)-61, arg0, arg2);
         this.field2467.method1808((long)arg0.hashCode(), var5, 26459);
         if (this.field2470 == arg0 && this.field2506 == null) {
            Dimension var6 = arg0.getSize();
            this.field2472 = var6.width;
            this.field2473 = var6.height;
            this.field2468 = var5;
            this.field2490 = var5.field9291;
            this.field2486 = var5.field9287;
            this.field2477 = var5.field9288;
            if (this.field2504 != this.field2486 || this.field2479 != this.field2477) {
               this.field2511 = this.field2504 = this.field2486;
               this.field2500 = this.field2479 = this.field2477;
               this.field2496 = this.field2489 = new float[this.field2504 * this.field2479];
            }

            this.method1625();
         }
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 < this.field2483) {
         arg2 -= this.field2483 - arg0;
         arg0 = this.field2483;
      }

      if (arg1 < this.field2512) {
         arg3 -= this.field2512 - arg1;
         arg1 = this.field2512;
      }

      if (arg0 + arg2 > this.field2492) {
         arg2 = this.field2492 - arg0;
      }

      if (arg1 + arg3 > this.field2495) {
         arg3 = this.field2495 - arg1;
      }

      if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2492 && arg1 <= this.field2495) {
         int var7 = this.field2486 - arg2;
         int var8 = this.field2486 * arg1 + arg0;
         int var9 = arg4 >>> 24;
         if (arg5 == 0 || arg5 == 1 && var9 == 255) {
            int var22 = arg2 >> 3;
            int var23 = arg2 & 7;
            int var24 = var8 - 1;

            for(int var25 = -arg3; var25 < 0; ++var25) {
               if (var22 > 0) {
                  int var26 = var22;

                  do {
                     ++var24;
                     this.field2490[var24] = arg4;
                     ++var24;
                     this.field2490[var24] = arg4;
                     ++var24;
                     this.field2490[var24] = arg4;
                     ++var24;
                     this.field2490[var24] = arg4;
                     ++var24;
                     this.field2490[var24] = arg4;
                     ++var24;
                     this.field2490[var24] = arg4;
                     ++var24;
                     this.field2490[var24] = arg4;
                     ++var24;
                     this.field2490[var24] = arg4;
                     --var26;
                  } while(var26 > 0);
               }

               if (var23 > 0) {
                  int var27 = var23;

                  do {
                     ++var24;
                     this.field2490[var24] = arg4;
                     --var27;
                  } while(var27 > 0);
               }

               var24 += var7;
            }

         } else if (arg5 == 1) {
            int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
            int var11 = 256 - var9;

            for(int var12 = 0; var12 < arg3; ++var12) {
               for(int var13 = -arg2; var13 < 0; ++var13) {
                  int var14 = this.field2490[var8];
                  int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                  this.field2490[var8++] = var10 + var15;
               }

               var8 += var7;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            for(int var16 = 0; var16 < arg3; ++var16) {
               for(int var17 = -arg2; var17 < 0; ++var17) {
                  int var18 = this.field2490[var8];
                  int var19 = arg4 + var18;
                  int var20 = (arg4 & 16711935) + (var18 & 16711935);
                  int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                  this.field2490[var8++] = var19 - var21 | var21 - (var21 >>> 8);
               }

               var8 += var7;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method509(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      float var6 = (float)arg2 * this.field2475.field5883 + (float)arg0 * this.field2475.field5888 + (float)arg1 * this.field2475.field5878 + this.field2475.field5892;
      if (!(var6 < (float)this.field2509) && !(var6 > (float)this.field2478)) {
         int var7 = (int)(((float)arg2 * this.field2475.field5889 + (float)arg0 * this.field2475.field5893 + (float)arg1 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / (float)arg3);
         int var8 = (int)(((float)arg2 * this.field2475.field5869 + (float)arg0 * this.field2475.field5885 + (float)arg1 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / (float)arg3);
         if (var7 >= this.field2502 && var7 <= this.field2485 && var8 >= this.field2487 && var8 <= this.field2499) {
            arg4[0] = var7 - this.field2502;
            arg4[1] = var8 - this.field2487;
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } else {
         arg4[0] = arg4[1] = arg4[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "u",
      descriptor = "()V"
   )
   public final void method438() {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method470(Canvas arg0) {
      if (arg0 != null) {
         class629 var2 = (class629)this.field2467.method1818(-1, (long)arg0.hashCode());
         if (var2 != null) {
            this.field2470 = arg0;
            Dimension var3 = arg0.getSize();
            this.field2472 = var3.width;
            this.field2473 = var3.height;
            this.field2468 = var2;
            if (this.field2506 == null) {
               this.field2490 = var2.field9291;
               this.field2486 = var2.field9287;
               this.field2477 = var2.field9288;
               if (this.field2504 != this.field2486 || this.field2479 != this.field2477) {
                  this.field2511 = this.field2504 = this.field2486;
                  this.field2500 = this.field2479 = this.field2477;
                  this.field2496 = this.field2489 = new float[this.field2504 * this.field2479];
               }

               this.method1625();
               return;
            }
         }
      } else {
         this.field2470 = null;
         this.field2468 = null;
         if (this.field2506 == null) {
            this.field2490 = null;
            this.field2486 = this.field2477 = 1;
            this.field2504 = this.field2479 = 1;
            this.method1625();
         }
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIF)Lue;"
   )
   public final class243 method491(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lgf;IIII)V"
   )
   private final void method1617(class74 arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = arg0.field975;
      int var8 = arg4 << 1;
      if (var6 == -1) {
         this.method1621(arg1, arg2, arg3, arg4, arg0.field980, 1);
      } else {
         if (this.field2514 != var6) {
            class648 var9 = (class648)this.field2498.method3192((long)var6, (byte)-121);
            if (var9 == null) {
               int[] var10 = this.method1613(var6);
               if (var10 == null) {
                  return;
               }

               int var11 = this.method1615(var6) ? 64 : this.field2503;
               var9 = this.method3638(var11, -27, var10, var11, var11, 0);
               this.field2498.method3190(var9, (long)var6, 8);
            }

            this.field2514 = var6;
            this.field2513 = var9;
         }

         ++var8;
         ((class297)this.field2513).method2393(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field980, 1, 1);
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method483(class735 arg0) {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method455() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method476(int arg0, int arg1) throws class221 {
      if (this.field2470 != null && this.field2468 != null) {
         try {
            Graphics var3 = this.field2470.getGraphics();
            this.field2468.method382(false, arg0, this.field2473, this.field2472, var3, 0, arg1, 0);
         } catch (Exception var4) {
            this.field2470.repaint();
         }
      } else {
         throw new IllegalStateException(field2515[2]);
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "()V"
   )
   public final void method481() {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method1618(int arg0) {
      return super.field6667.method911(arg0, -80).field9898;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      class424 var13 = (class424)arg6;
      int[] var14 = var13.field5778;
      int[] var15 = var13.field5776;
      int var16 = this.field2512 > arg8 ? this.field2512 : arg8;
      int var17 = this.field2495 < var14.length + arg8 ? this.field2495 : var14.length + arg8;
      int var18 = arg11 << 8;
      int var19 = arg9 << 8;
      int var20 = arg10 << 8;
      int var21 = var19 + var20;
      int var22 = var18 % var21;
      int var23 = arg2 - arg0;
      int var24 = arg3 - arg1;
      if (var23 + var24 < 0) {
         int var25 = (int)(Math.sqrt((double)(var23 * var23 + var24 * var24)) * 256.0D);
         int var26 = var25 % var21;
         int var27 = var19 + var21 - var22 - var26;
         var22 = var27 % var21;
         if (var22 < 0) {
            var22 += var21;
         }

         arg0 += var23;
         var23 = -var23;
         arg1 += var24;
         var24 = -var24;
      }

      if (var23 > var24) {
         int var28 = arg1 << 16;
         int var29 = var28 + 32768;
         int var30 = var24 << 16;
         int var31 = (int)Math.floor((double)var30 / (double)var23 + 0.5D);
         int var32 = arg0 + var23;
         int var33 = arg4 >>> 24;
         int var34 = (int)Math.sqrt((double)((var31 >> 8) * (var31 >> 8) + 65536));
         if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
            if (arg5 == 1) {
               int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var36 = 256 - var33;

               while(arg0 <= var32) {
                  int var37 = var29 >> 16;
                  int var38 = var37 - arg8;
                  if (arg0 >= this.field2483 && arg0 < this.field2492 && var37 >= var16 && var37 < var17 && var22 < var19) {
                     int var39 = var14[var38] + arg7;
                     if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                        int var40 = this.field2486 * var37 + arg0;
                        int var41 = this.field2490[var40];
                        int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                        this.field2490[var40] = var35 + var42;
                     }
                  }

                  var29 += var31;
                  ++arg0;
                  int var43 = var22 + var34;
                  var22 = var43 % var21;
               }

            } else if (arg5 == 2) {
               while(arg0 <= var32) {
                  int var44 = var29 >> 16;
                  int var45 = var44 - arg8;
                  if (arg0 >= this.field2483 && arg0 < this.field2492 && var44 >= var16 && var44 < var17 && var22 < var19) {
                     int var46 = var14[var45] + arg7;
                     if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                        int var47 = this.field2486 * var44 + arg0;
                        int var48 = this.field2490[var47];
                        int var49 = arg4 + var48;
                        int var50 = (arg4 & 16711935) + (var48 & 16711935);
                        int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                        this.field2490[var47] = var49 - var51 | var51 - (var51 >>> 8);
                     }
                  }

                  var29 += var31;
                  ++arg0;
                  int var52 = var22 + var34;
                  var22 = var52 % var21;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            while(arg0 <= var32) {
               int var53 = var29 >> 16;
               int var54 = var53 - arg8;
               if (arg0 >= this.field2483 && arg0 < this.field2492 && var53 >= var16 && var53 < var17 && var22 < var19) {
                  int var55 = var14[var54] + arg7;
                  if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                     this.field2490[this.field2486 * var53 + arg0] = arg4;
                  }
               }

               var29 += var31;
               ++arg0;
               int var56 = var22 + var34;
               var22 = var56 % var21;
            }

         }
      } else {
         int var57 = arg0 << 16;
         int var58 = var57 + 32768;
         int var59 = var23 << 16;
         int var60 = (int)Math.floor((double)var59 / (double)var24 + 0.5D);
         int var61 = (int)Math.sqrt((double)((var60 >> 8) * (var60 >> 8) + 65536));
         int var62 = arg1 + var24;
         int var63 = arg4 >>> 24;
         if (arg5 == 0 || arg5 == 1 && var63 == 255) {
            while(arg1 <= var62) {
               int var80 = var58 >> 16;
               int var81 = arg1 - arg8;
               if (arg1 >= var16 && arg1 < var17 && var80 >= this.field2483 && var80 < this.field2492 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                  this.field2490[this.field2486 * arg1 + var80] = arg4;
               }

               var58 += var60;
               ++arg1;
               int var82 = var22 + var61;
               var22 = var82 % var21;
            }

         } else if (arg5 == 1) {
            int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
            int var65 = 256 - var63;

            while(arg1 <= var62) {
               int var66 = var58 >> 16;
               int var67 = arg1 - arg8;
               if (arg1 >= var16 && arg1 < var17 && var66 >= this.field2483 && var66 < this.field2492 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                  int var68 = this.field2486 * arg1 + var66;
                  int var69 = this.field2490[var68];
                  int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                  this.field2490[this.field2486 * arg1 + var66] = var64 + var70;
               }

               var58 += var60;
               ++arg1;
               int var71 = var22 + var61;
               var22 = var71 % var21;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var62) {
               int var72 = var58 >> 16;
               int var73 = arg1 - arg8;
               if (arg1 >= var16 && arg1 < var17 && var72 >= this.field2483 && var72 < this.field2492 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                  int var74 = this.field2486 * arg1 + var72;
                  int var75 = this.field2490[var74];
                  int var76 = arg4 + var75;
                  int var77 = (arg4 & 16711935) + (var75 & 16711935);
                  int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                  this.field2490[var74] = var76 - var78 | var78 - (var78 >>> 8);
               }

               var58 += var60;
               ++arg1;
               int var79 = var22 + var61;
               var22 = var79 % var21;
            }

         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIZ)Lpd;"
   )
   public final class648 method435(int arg0, int arg1, boolean arg2) {
      return arg2 ? new class298(this, arg0, arg1) : new class701(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "d",
      descriptor = "(II)Lsq;"
   )
   public final class220 method409(int arg0, int arg1) {
      return new class308(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "h",
      descriptor = "()V"
   )
   public final void method507() {
      if (this.field2470 != null) {
         this.field2490 = this.field2468.field9291;
         this.field2486 = this.field2468.field9287;
         this.field2477 = this.field2468.field9288;
         this.field2489 = this.field2496;
         this.field2504 = this.field2511;
         this.field2479 = this.field2500;
      } else {
         this.field2486 = 1;
         this.field2477 = 1;
         this.field2490 = null;
         this.field2504 = 1;
         this.field2479 = 1;
         this.field2489 = null;
      }

      this.field2506 = null;
      this.method1625();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (arg2 > 0 && arg3 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = (arg7 << 16) / arg2;
         int var13 = (arg6.length / arg7 << 16) / arg3;
         int var14 = this.field2486 * arg1 + arg0;
         int var15 = this.field2486 - arg2;
         if (arg1 + arg3 > this.field2495) {
            arg3 -= arg1 + arg3 - this.field2495;
         }

         if (arg1 < this.field2512) {
            int var16 = this.field2512 - arg1;
            arg3 -= var16;
            var14 += this.field2486 * var16;
            var11 += var13 * var16;
         }

         if (arg0 + arg2 > this.field2492) {
            int var17 = arg0 + arg2 - this.field2492;
            arg2 -= var17;
            var15 += var17;
         }

         if (arg0 < this.field2483) {
            int var18 = this.field2483 - arg0;
            arg2 -= var18;
            var14 += var18;
            var10 += var12 * var18;
            var15 += var18;
         }

         int var19 = arg4 >>> 24;
         int var20 = arg5 >>> 24;
         if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
            if (arg8 == 1) {
               int var21 = var10;

               for(int var22 = -arg3; var22 < 0; ++var22) {
                  int var23 = (var11 >> 16) * arg7;

                  for(int var24 = -arg2; var24 < 0; ++var24) {
                     int var25 = arg4;
                     if (arg6[(var10 >> 16) + var23] != 0) {
                        var25 = arg5;
                     }

                     int var26 = var25 >>> 24;
                     int var27 = 255 - var26;
                     int var28 = this.field2490[var14];
                     this.field2490[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                     var10 += var12;
                  }

                  var11 += var13;
                  var10 = var21;
                  var14 += var15;
               }

            } else if (arg8 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var29 = var10;

               for(int var30 = -arg3; var30 < 0; ++var30) {
                  int var31 = (var11 >> 16) * arg7;

                  for(int var32 = -arg2; var32 < 0; ++var32) {
                     int var33 = arg4;
                     if (arg6[(var10 >> 16) + var31] != 0) {
                        var33 = arg5;
                     }

                     if (var33 != 0) {
                        int var34 = this.field2490[var14];
                        int var35 = var33 + var34;
                        int var36 = (var33 & 16711935) + (var34 & 16711935);
                        int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                        this.field2490[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                     } else {
                        ++var14;
                     }

                     var10 += var12;
                  }

                  var11 += var13;
                  var10 = var29;
                  var14 += var15;
               }

            }
         } else {
            int var38 = var10;

            for(int var39 = -arg3; var39 < 0; ++var39) {
               int var40 = (var11 >> 16) * arg7;

               for(int var41 = -arg2; var41 < 0; ++var41) {
                  if (arg6[(var10 >> 16) + var40] != 0) {
                     this.field2490[var14++] = arg5;
                  } else {
                     this.field2490[var14++] = arg4;
                  }

                  var10 += var12;
               }

               var11 += var13;
               var10 = var38;
               var14 += var15;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "(II)I"
   )
   public final int method495(int arg0, int arg1) {
      int var3 = arg0 | 133120;
      return var3 & arg1 ^ arg1;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method514(int arg0) {
      this.field2476 = arg0;
      this.field2484 = new class640[this.field2476];

      for(int var2 = 0; var2 < this.field2476; ++var2) {
         this.field2484[var2] = new class640(this);
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method440() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "()I"
   )
   public final int method487() {
      return 0;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method515() {
      return true;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class221 {
      if (this.field2470 != null && this.field2468 != null) {
         try {
            Graphics var5 = this.field2470.getGraphics();

            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.x + arg2 <= this.field2486 && var7.y + arg3 <= this.field2477 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                  this.field2468.method382(false, var7.x + arg2, var7.height, var7.width, var5, var7.y, var7.y + arg3, var7.x);
               }
            }

         } catch (Exception var8) {
            this.field2470.repaint();
         }
      } else {
         throw new IllegalStateException(field2515[2]);
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method417(int[] arg0) {
      arg0[0] = this.field2483;
      arg0[1] = this.field2512;
      arg0[2] = this.field2492;
      arg0[3] = this.field2495;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method448() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "m",
      descriptor = "(I)Z"
   )
   public final boolean method1619(int arg0) {
      return super.field6667.method911(arg0, 126).field9906 || super.field6667.method911(arg0, -122).field9902;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1620(int arg0) {
      return super.field6667.method911(arg0, 88).field9890 & 65535;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   private final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg3 < 0) {
         arg3 = -arg3;
      }

      int var7 = arg1 - arg3;
      if (var7 < this.field2512) {
         var7 = this.field2512;
      }

      int var8 = arg1 + arg3 + 1;
      if (var8 > this.field2495) {
         var8 = this.field2495;
      }

      int var9 = var7;
      int var10 = arg3 * arg3;
      int var11 = 0;
      int var12 = arg1 - var7;
      int var13 = var12 * var12;
      int var14 = var13 - var12;
      if (arg1 > var8) {
         arg1 = var8;
      }

      int var15 = arg4 >>> 24;
      if (arg5 == 0 || arg5 == 1 && var15 == 255) {
         while(var9 < arg1) {
            while(var14 <= var10 || var13 <= var10) {
               var13 += var11 + var11;
               var14 += var11++ + var11;
            }

            int var65 = arg0 - var11 + 1;
            if (var65 < this.field2483) {
               var65 = this.field2483;
            }

            int var66 = arg0 + var11;
            if (var66 > this.field2492) {
               var66 = this.field2492;
            }

            int var67 = this.field2486 * var9 + var65;

            for(int var68 = var65; var68 < var66; ++var68) {
               if ((float)arg2 < this.field2489[var67]) {
                  this.field2490[var67] = arg4;
               }

               ++var67;
            }

            ++var9;
            var13 -= var12-- + var12;
            var14 -= var12 + var12;
         }

         int var56 = arg3;
         int var57 = var9 - arg1;
         int var58 = var57 * var57 + var10;
         int var59 = var58 - arg3;
         int var60 = var58 - var57;

         while(var9 < var8) {
            while(var60 > var10 && var59 > var10) {
               var60 -= var56-- + var56;
               var59 -= var56 + var56;
            }

            int var61 = arg0 - var56;
            if (var61 < this.field2483) {
               var61 = this.field2483;
            }

            int var62 = arg0 + var56;
            if (var62 > this.field2492 - 1) {
               var62 = this.field2492 - 1;
            }

            int var63 = this.field2486 * var9 + var61;

            for(int var64 = var61; var64 <= var62; ++var64) {
               if ((float)arg2 < this.field2489[var63]) {
                  this.field2490[var63] = arg4;
               }

               ++var63;
            }

            ++var9;
            var60 += var57 + var57;
            var59 += var57++ + var57;
         }

      } else if (arg5 == 1) {
         int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
         int var17 = 256 - var15;

         while(var9 < arg1) {
            while(var14 <= var10 || var13 <= var10) {
               var13 += var11 + var11;
               var14 += var11++ + var11;
            }

            int var29 = arg0 - var11 + 1;
            if (var29 < this.field2483) {
               var29 = this.field2483;
            }

            int var30 = arg0 + var11;
            if (var30 > this.field2492) {
               var30 = this.field2492;
            }

            int var31 = this.field2486 * var9 + var29;

            for(int var32 = var29; var32 < var30; ++var32) {
               if ((float)arg2 < this.field2489[var31]) {
                  int var33 = this.field2490[var31];
                  int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                  this.field2490[var31] = var16 + var34;
               }

               ++var31;
            }

            ++var9;
            var13 -= var12-- + var12;
            var14 -= var12 + var12;
         }

         int var18 = arg3;
         int var19 = -var12;
         int var20 = var19 * var19 + var10;
         int var21 = var20 - arg3;
         int var22 = var20 - var19;

         while(var9 < var8) {
            while(var22 > var10 && var21 > var10) {
               var22 -= var18-- + var18;
               var21 -= var18 + var18;
            }

            int var23 = arg0 - var18;
            if (var23 < this.field2483) {
               var23 = this.field2483;
            }

            int var24 = arg0 + var18;
            if (var24 > this.field2492 - 1) {
               var24 = this.field2492 - 1;
            }

            int var25 = this.field2486 * var9 + var23;

            for(int var26 = var23; var26 <= var24; ++var26) {
               if ((float)arg2 < this.field2489[var25]) {
                  int var27 = this.field2490[var25];
                  int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                  this.field2490[var25] = var16 + var28;
               }

               ++var25;
            }

            ++var9;
            var22 += var19 + var19;
            var21 += var19++ + var19;
         }

      } else if (arg5 != 2) {
         throw new IllegalArgumentException();
      } else {
         while(var9 < arg1) {
            while(var14 <= var10 || var13 <= var10) {
               var13 += var11 + var11;
               var14 += var11++ + var11;
            }

            int var48 = arg0 - var11 + 1;
            if (var48 < this.field2483) {
               var48 = this.field2483;
            }

            int var49 = arg0 + var11;
            if (var49 > this.field2492) {
               var49 = this.field2492;
            }

            int var50 = this.field2486 * var9 + var48;

            for(int var51 = var48; var51 < var49; ++var51) {
               if ((float)arg2 < this.field2489[var50]) {
                  int var52 = this.field2490[var50];
                  int var53 = arg4 + var52;
                  int var54 = (arg4 & 16711935) + (var52 & 16711935);
                  int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                  this.field2490[var50] = var53 - var55 | var55 - (var55 >>> 8);
               }

               ++var50;
            }

            ++var9;
            var13 -= var12-- + var12;
            var14 -= var12 + var12;
         }

         int var35 = arg3;
         int var36 = -var12;
         int var37 = var36 * var36 + var10;
         int var38 = var37 - arg3;
         int var39 = var37 - var36;

         while(var9 < var8) {
            while(var39 > var10 && var38 > var10) {
               var39 -= var35-- + var35;
               var38 -= var35 + var35;
            }

            int var40 = arg0 - var35;
            if (var40 < this.field2483) {
               var40 = this.field2483;
            }

            int var41 = arg0 + var35;
            if (var41 > this.field2492 - 1) {
               var41 = this.field2492 - 1;
            }

            int var42 = this.field2486 * var9 + var40;

            for(int var43 = var40; var43 <= var41; ++var43) {
               if ((float)arg2 < this.field2489[var42]) {
                  int var44 = this.field2490[var42];
                  int var45 = arg4 + var44;
                  int var46 = (arg4 & 16711935) + (var44 & 16711935);
                  int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                  this.field2490[var42] = var45 - var47 | var47 - (var47 >>> 8);
               }

               ++var42;
            }

            ++var9;
            var39 += var36 + var36;
            var38 += var36++ + var36;
         }

      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method451(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field2475.field5883 + (float)arg0 * this.field2475.field5888 + (float)arg1 * this.field2475.field5878 + this.field2475.field5892;
      if (!(var5 < (float)this.field2509) && !(var5 > (float)this.field2478)) {
         int var6 = (int)(((float)arg2 * this.field2475.field5889 + (float)arg0 * this.field2475.field5893 + (float)arg1 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / var5);
         int var7 = (int)(((float)arg2 * this.field2475.field5869 + (float)arg0 * this.field2475.field5885 + (float)arg1 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / var5);
         if (var6 >= this.field2502 && var6 <= this.field2485 && var7 >= this.field2487 && var7 <= this.field2499) {
            arg3[0] = var6 - this.field2502;
            arg3[1] = var7 - this.field2487;
            arg3[2] = (int)var5;
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } else {
         arg3[0] = arg3[1] = arg3[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method452(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field2475.field5883 + (float)arg0 * this.field2475.field5888 + (float)arg1 * this.field2475.field5878 + this.field2475.field5892;
      if (var5 == 0.0F) {
         arg3[0] = arg3[1] = arg3[2] = -1;
      } else {
         int var6 = (int)(((float)arg2 * this.field2475.field5889 + (float)arg0 * this.field2475.field5893 + (float)arg1 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / var5);
         int var7 = (int)(((float)arg2 * this.field2475.field5869 + (float)arg0 * this.field2475.field5885 + (float)arg1 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / var5);
         arg3[0] = var6 - this.field2502;
         arg3[1] = var7 - this.field2487;
         arg3[2] = (int)var5;
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(I[Lue;)V"
   )
   public final void method485(int arg0, class243[] arg1) {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method426(int arg0) {
      this.method513(0, 0, this.field2486, this.field2477, arg0, 0);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lu;Z)Lpd;"
   )
   public final class648 method402(class65 arg0, boolean arg1) {
      int[] var3 = arg0.field813;
      byte[] var4 = arg0.field818;
      int var5 = arg0.field819;
      int var6 = arg0.field820;
      class297 var11;
      if (arg1 && arg0.field815 == null) {
         int[] var7 = new int[var3.length];
         byte[] var8 = new byte[var5 * var6];

         for(int var9 = 0; var9 < var6; ++var9) {
            int var12 = var5 * var9;

            for(int var13 = 0; var13 < var5; ++var13) {
               var8[var12 + var13] = var4[var12 + var13];
            }
         }

         for(int var10 = 0; var10 < var3.length; ++var10) {
            var7[var10] = var3[var10];
         }

         var11 = new class434(this, var8, var7, var5, var6);
      } else {
         int[] var14 = new int[var5 * var6];
         byte[] var15 = arg0.field815;
         if (var15 != null) {
            for(int var16 = 0; var16 < var6; ++var16) {
               int var17 = var5 * var16;

               for(int var18 = 0; var18 < var5; ++var18) {
                  var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
               }
            }

            var11 = new class298(this, var14, var5, var6);
         } else {
            for(int var19 = 0; var19 < var6; ++var19) {
               int var20 = var5 * var19;

               for(int var21 = 0; var21 < var5; ++var21) {
                  int var22 = var3[var4[var20 + var21] & 255];
                  var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
               }
            }

            var11 = new class701(this, var14, var5, var6);
         }
      }

      var11.method2405(arg0.field816, arg0.field814, arg0.field817, arg0.field821);
      return var11;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      class640 var8 = this.method1622(Thread.currentThread());
      class236 var9 = var8.field9425;
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      int var12 = var10 >= 0 ? var10 : -var10;
      int var13 = var11 >= 0 ? var11 : -var11;
      int var14 = var12;
      if (var12 < var13) {
         var14 = var13;
      }

      if (var14 != 0) {
         int var15 = (var10 << 16) / var14;
         int var16 = (var11 << 16) / var14;
         int var17 = (var15 >> 16) + var10;
         int var18 = (var16 >> 16) + var11;
         if (var16 <= var15) {
            var15 = -var15;
         } else {
            var16 = -var16;
         }

         int var19 = arg5 * var16 >> 17;
         int var20 = arg5 * var16 + 1 >> 17;
         int var21 = arg5 * var15 >> 17;
         int var22 = arg5 * var15 + 1 >> 17;
         int var23 = arg0 - var9.method1875();
         int var24 = arg1 - var9.method1877();
         int var25 = var19 + var23;
         int var26 = var23 - var20;
         int var27 = var17 + var23 - var20;
         int var28 = var17 + var23 + var19;
         int var29 = var21 + var24;
         int var30 = var24 - var22;
         int var31 = var18 + var24 - var22;
         int var32 = var18 + var24 + var21;
         if (arg6 == 0) {
            var9.field2969 = 0;
         } else {
            if (arg6 != 1) {
               throw new IllegalArgumentException();
            }

            var9.field2969 = 255 - (arg4 >>> 24);
         }

         this.method437(false);
         var9.field2972 = var25 < 0 || var25 > var9.field2965 || var26 < 0 || var26 > var9.field2965 || var27 < 0 || var27 > var9.field2965;
         var9.method1872((float)var29, (float)var30, (float)var31, (float)var25, (float)var26, (float)var27, 100.0F, 100.0F, 100.0F, arg4);
         var9.field2972 = var25 < 0 || var25 > var9.field2965 || var27 < 0 || var27 > var9.field2965 || var28 < 0 || var28 > var9.field2965;
         var9.method1872((float)var29, (float)var31, (float)var32, (float)var25, (float)var27, (float)var28, 100.0F, 100.0F, 100.0F, arg4);
         this.method437(true);
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(IIIIII)Lkc;"
   )
   public final class72 method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "XA",
      descriptor = "()I"
   )
   public final int method499() {
      return this.field2478;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method394(int arg0) {
      this.field2484[arg0].method4710(10, Thread.currentThread());
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;)Lsr;"
   )
   public final class640 method1622(Runnable arg0) {
      for(int var2 = 0; var2 < this.field2476; ++var2) {
         if (this.field2484[var2].field9379 == arg0) {
            return this.field2484[var2];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class195(Canvas arg0, class102 arg1, int arg2, int arg3) {
      this(arg1);

      try {
         this.method411(arg0, arg2, arg3);
         this.method470(arg0);
      } catch (Throwable var6) {
         var6.printStackTrace();
         this.method3649(false);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = (float)arg2 * this.field2475.field5883 + (float)arg0 * this.field2475.field5888 + (float)arg1 * this.field2475.field5878 + this.field2475.field5892;
      if (var8 < 1.0F) {
         var8 = 1.0F;
      }

      float var9 = (float)arg5 * this.field2475.field5883 + (float)arg3 * this.field2475.field5888 + (float)arg4 * this.field2475.field5878 + this.field2475.field5892;
      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      if (var8 < (float)this.field2509 && var9 < (float)this.field2509) {
         var7 |= 16;
      } else if (var8 > (float)this.field2478 && var9 > (float)this.field2478) {
         var7 |= 32;
      }

      int var10 = (int)(((float)arg2 * this.field2475.field5889 + (float)arg0 * this.field2475.field5893 + (float)arg1 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / var8);
      int var11 = (int)(((float)arg5 * this.field2475.field5889 + (float)arg3 * this.field2475.field5893 + (float)arg4 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / var9);
      if (var10 < this.field2502 && var11 < this.field2502) {
         var7 |= 1;
      } else if (var10 > this.field2485 && var11 > this.field2485) {
         var7 |= 2;
      }

      int var12 = (int)(((float)arg2 * this.field2475.field5869 + (float)arg0 * this.field2475.field5885 + (float)arg1 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / var8);
      int var13 = (int)(((float)arg5 * this.field2475.field5869 + (float)arg3 * this.field2475.field5885 + (float)arg4 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / var9);
      if (var12 < this.field2487 && var13 < this.field2487) {
         var7 |= 4;
      } else if (var12 > this.field2499 && var13 > this.field2499) {
         var7 |= 8;
      }

      return var7;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      if (var11 == 0) {
         if (var10 >= 0) {
            this.method1627(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var12 = arg6 + arg7;
            int var13 = arg8 % var12;
            int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
            int var15 = var14 % var12;
            if (var15 < 0) {
               var15 += var12;
            }

            this.method1627(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
         }
      } else if (var10 == 0) {
         if (var11 >= 0) {
            this.method1628(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var16 = arg6 + arg7;
            int var17 = arg8 % var16;
            int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
            int var19 = var18 % var16;
            if (var19 < 0) {
               var19 += var16;
            }

            this.method1628(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
         }
      } else {
         int var20 = arg8 << 8;
         int var21 = arg6 << 8;
         int var22 = arg7 << 8;
         int var23 = var21 + var22;
         int var24 = var20 % var23;
         if (var10 + var11 < 0) {
            int var25 = (int)(Math.sqrt((double)(var10 * var10 + var11 * var11)) * 256.0D);
            int var26 = var25 % var23;
            int var27 = var21 + var23 - var24 - var26;
            var24 = var27 % var23;
            if (var24 < 0) {
               var24 += var23;
            }

            arg0 += var10;
            var10 = -var10;
            arg1 += var11;
            var11 = -var11;
         }

         if (var10 > var11) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var11 << 16;
            int var31 = (int)Math.floor((double)var30 / (double)var10 + 0.5D);
            int var32 = arg0 + var10;
            int var33 = arg4 >>> 24;
            int var34 = (int)Math.sqrt((double)((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
               if (arg5 == 1) {
                  int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                  int var36 = 256 - var33;

                  while(arg0 <= var32) {
                     int var37 = var29 >> 16;
                     if (arg0 >= this.field2483 && arg0 < this.field2492 && var37 >= this.field2512 && var37 < this.field2495 && var24 < var21) {
                        int var38 = this.field2486 * var37 + arg0;
                        int var39 = this.field2490[var38];
                        int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                        this.field2490[var38] = var35 + var40;
                     }

                     var29 += var31;
                     ++arg0;
                     int var41 = var24 + var34;
                     var24 = var41 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var32) {
                     int var42 = var29 >> 16;
                     if (arg0 >= this.field2483 && arg0 < this.field2492 && var42 >= this.field2512 && var42 < this.field2495 && var24 < var21) {
                        int var43 = this.field2486 * var42 + arg0;
                        int var44 = this.field2490[var43];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field2490[var43] = var45 - var47 | var47 - (var47 >>> 8);
                     }

                     var29 += var31;
                     ++arg0;
                     int var48 = var24 + var34;
                     var24 = var48 % var23;
                  }

               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               while(arg0 <= var32) {
                  int var49 = var29 >> 16;
                  if (arg0 >= this.field2483 && arg0 < this.field2492 && var49 >= this.field2512 && var49 < this.field2495 && var24 < var21) {
                     this.field2490[this.field2486 * var49 + arg0] = arg4;
                  }

                  var29 += var31;
                  ++arg0;
                  int var50 = var24 + var34;
                  var24 = var50 % var23;
               }

            }
         } else {
            int var51 = arg0 << 16;
            int var52 = var51 + 32768;
            int var53 = var10 << 16;
            int var54 = (int)Math.floor((double)var53 / (double)var11 + 0.5D);
            int var55 = arg1 + var11;
            int var56 = arg4 >>> 24;
            int var57 = (int)Math.sqrt((double)((var54 >> 8) * (var54 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
               if (arg5 == 1) {
                  int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                  int var59 = 256 - var56;

                  while(arg1 <= var55) {
                     int var60 = var52 >> 16;
                     if (arg1 >= this.field2512 && arg1 < this.field2495 && var60 >= this.field2483 && var60 < this.field2492 && var24 < var21) {
                        int var61 = this.field2486 * arg1 + var60;
                        int var62 = this.field2490[var61];
                        int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                        this.field2490[this.field2486 * arg1 + var60] = var58 + var63;
                     }

                     var52 += var54;
                     ++arg1;
                     int var64 = var24 + var57;
                     var24 = var64 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg1 <= var55) {
                     int var65 = var52 >> 16;
                     if (arg1 >= this.field2512 && arg1 < this.field2495 && var65 >= this.field2483 && var65 < this.field2492 && var24 < var21) {
                        int var66 = this.field2486 * arg1 + var65;
                        int var67 = this.field2490[var66];
                        int var68 = arg4 + var67;
                        int var69 = (arg4 & 16711935) + (var67 & 16711935);
                        int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                        this.field2490[var66] = var68 - var70 | var70 - (var70 >>> 8);
                     }

                     var52 += var54;
                     ++arg1;
                     int var71 = var24 + var57;
                     var24 = var71 % var23;
                  }

               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               while(arg1 <= var55) {
                  int var72 = var52 >> 16;
                  if (arg1 >= this.field2512 && arg1 < this.field2495 && var72 >= this.field2483 && var72 < this.field2492 && var24 < var21) {
                     this.field2490[this.field2486 * arg1 + var72] = arg4;
                  }

                  var52 += var54;
                  ++arg1;
                  int var73 = var24 + var57;
                  var24 = var73 % var23;
               }

            }
         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method520() {
      return true;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class87 method479(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class424(arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "g",
      descriptor = "()Z"
   )
   public final boolean method1623() {
      return this.field2469;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method1624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field6667.method911(arg6, 78).field9894) {
            if (this.field2514 != arg6) {
               class648 var11 = (class648)this.field2498.method3192((long)arg6, (byte)-105);
               if (var11 == null) {
                  int[] var12 = this.method1613(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method1615(arg6) ? 64 : this.field2503;
                  var11 = this.method3638(var13, -92, var12, var13, var13, 0);
                  this.field2498.method3190(var11, (long)arg6, 8);
               }

               this.field2514 = arg6;
               this.field2513 = var11;
            }

            ((class297)this.field2513).method2393(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method1621(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "w",
      descriptor = "()V"
   )
   public final void method401() {
      if (this.field2471) {
         class201.method1661(20251, true, false);
         this.field2471 = false;
      }

      this.field2468 = null;
      this.field2470 = null;
      this.field2472 = 0;
      this.field2473 = 0;
      this.field2467 = null;
      this.field2469 = true;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "C",
      descriptor = "()V"
   )
   private final void method1625() {
      for(int var1 = 0; var1 < this.field2476; ++var1) {
         this.field2484[var1].method4707(true);
      }

      this.method443();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method506(int arg0) {
      class153.field1937 = arg0;
      class153.field1966 = arg0;
      if (this.field2476 > 1) {
         throw new IllegalStateException(field2515[3]);
      } else {
         this.method514(this.field2476);
         this.method394(0);
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
      class424 var10 = (class424)arg6;
      int[] var11 = var10.field5778;
      int[] var12 = var10.field5776;
      int var13 = this.field2512 > arg8 ? this.field2512 : arg8;
      int var14 = this.field2495 < var11.length + arg8 ? this.field2495 : var11.length + arg8;
      int var15 = arg2 - arg0;
      int var16 = arg3 - arg1;
      if (var15 + var16 < 0) {
         arg0 += var15;
         var15 = -var15;
         arg1 += var16;
         var16 = -var16;
      }

      if (var15 > var16) {
         int var17 = arg1 << 16;
         int var18 = var17 + 32768;
         int var19 = var16 << 16;
         int var20 = (int)Math.floor((double)var19 / (double)var15 + 0.5D);
         int var21 = arg0 + var15;
         if (arg0 < this.field2483) {
            var18 += (this.field2483 - arg0) * var20;
            arg0 = this.field2483;
         }

         if (var21 >= this.field2492) {
            var21 = this.field2492 - 1;
         }

         int var22 = arg4 >>> 24;
         if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
            if (arg5 == 1) {
               int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
               int var24 = 256 - var22;

               while(arg0 <= var21) {
                  int var25 = var18 >> 16;
                  int var26 = var25 - arg8;
                  if (var25 >= var13 && var25 < var14) {
                     int var27 = var11[var26] + arg7;
                     if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                        int var28 = this.field2486 * var25 + arg0;
                        int var29 = this.field2490[var28];
                        int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                        this.field2490[var28] = var23 + var30;
                     }
                  }

                  var18 += var20;
                  ++arg0;
               }

            } else if (arg5 == 2) {
               while(arg0 <= var21) {
                  int var31 = var18 >> 16;
                  int var32 = var31 - arg8;
                  if (var31 >= var13 && var31 < var14) {
                     int var33 = var11[var32] + arg7;
                     if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                        int var34 = this.field2486 * var31 + arg0;
                        int var35 = this.field2490[var34];
                        int var36 = arg4 + var35;
                        int var37 = (arg4 & 16711935) + (var35 & 16711935);
                        int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                        this.field2490[var34] = var36 - var38 | var38 - (var38 >>> 8);
                     }
                  }

                  var18 += var20;
                  ++arg0;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            while(arg0 <= var21) {
               int var39 = var18 >> 16;
               int var40 = var39 - arg8;
               if (var39 >= var13 && var39 < var14) {
                  int var41 = var11[var40] + arg7;
                  if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                     this.field2490[this.field2486 * var39 + arg0] = arg4;
                  }
               }

               var18 += var20;
               ++arg0;
            }

         }
      } else {
         int var42 = arg0 << 16;
         int var43 = var42 + 32768;
         int var44 = var15 << 16;
         int var45 = (int)Math.floor((double)var44 / (double)var16 + 0.5D);
         int var46 = arg1 + var16;
         if (arg1 < var13) {
            var43 += (var13 - arg1) * var45;
            arg1 = var13;
         }

         if (var46 >= var14) {
            var46 = var14 - 1;
         }

         int var47 = arg4 >>> 24;
         if (arg5 == 0 || arg5 == 1 && var47 == 255) {
            while(arg1 <= var46) {
               int var64 = var43 >> 16;
               int var65 = arg1 - arg8;
               int var66 = var11[var65] + arg7;
               if (var64 >= this.field2483 && var64 < this.field2492 && var64 >= var66 && var64 < var12[var65] + var66) {
                  this.field2490[this.field2486 * arg1 + var64] = arg4;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 1) {
            int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
            int var49 = 256 - var47;

            while(arg1 <= var46) {
               int var50 = var43 >> 16;
               int var51 = arg1 - arg8;
               int var52 = var11[var51] + arg7;
               if (var50 >= this.field2483 && var50 < this.field2492 && var50 >= var52 && var50 < var12[var51] + var52) {
                  int var53 = this.field2486 * arg1 + var50;
                  int var54 = this.field2490[var53];
                  int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                  this.field2490[this.field2486 * arg1 + var50] = var48 + var55;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var46) {
               int var56 = var43 >> 16;
               int var57 = arg1 - arg8;
               int var58 = var11[var57] + arg7;
               if (var56 >= this.field2483 && var56 < this.field2492 && var56 >= var58 && var56 < var12[var57] + var58) {
                  int var59 = this.field2486 * arg1 + var56;
                  int var60 = this.field2490[var59];
                  int var61 = arg4 + var60;
                  int var62 = (arg4 & 16711935) + (var60 & 16711935);
                  int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                  this.field2490[var59] = var61 - var63 | var63 - (var63 >>> 8);
               }

               var43 += var45;
               ++arg1;
            }

         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "d",
      descriptor = "()V"
   )
   public final void method505() {
      this.field2507.method3201((byte)-86);
      this.field2498.method3201((byte)99);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lls;IIII)Lka;"
   )
   public final class232 method494(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class153(this, arg0, arg1, arg3, arg4, arg2);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "E",
      descriptor = "()I"
   )
   public final int method400() {
      return 0;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "e",
      descriptor = "()Ljv;"
   )
   public final class776 method425() {
      return new class776(0, field2515[0], 1, field2515[1], 0L);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method473(Canvas arg0) {
      if (this.field2470 == arg0) {
         this.method470((Canvas)null);
      }

      class629 var2 = (class629)this.field2467.method1818(-1, (long)arg0.hashCode());
      if (var2 != null) {
         var2.method4924(-2970);
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method460(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > this.field2486) {
         arg2 = this.field2486;
      }

      if (arg3 > this.field2477) {
         arg3 = this.field2477;
      }

      this.field2483 = arg0;
      this.field2492 = arg2;
      this.field2512 = arg1;
      this.field2495 = arg3;
      this.method1614();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lnh;I)V"
   )
   public final void method517(class554 arg0, int arg1) {
      class640 var3 = this.method1622(Thread.currentThread());
      class439 var4 = arg0.field8138.field918;

      for(class439 var5 = var4.field5973; var4 != var5; var5 = var5.field5973) {
         class74 var6 = (class74)var5;
         int var7 = var6.field974 >> 12;
         int var8 = var6.field976 >> 12;
         int var9 = var6.field977 >> 12;
         float var10 = (float)var9 * this.field2475.field5883 + (float)var7 * this.field2475.field5888 + (float)var8 * this.field2475.field5878 + this.field2475.field5892;
         if (!(var10 < (float)this.field2509) && !(var10 > (float)var3.field9386)) {
            int var11 = (int)(((float)var9 * this.field2475.field5889 + (float)var7 * this.field2475.field5893 + (float)var8 * this.field2475.field5879 + this.field2475.field5886) * (float)this.field2491 / (float)arg1) + this.field2474;
            int var12 = (int)(((float)var9 * this.field2475.field5869 + (float)var7 * this.field2475.field5885 + (float)var8 * this.field2475.field5872 + this.field2475.field5876) * (float)this.field2501 / (float)arg1) + this.field2505;
            if (var11 >= this.field2483 && var11 <= this.field2492 && var12 >= this.field2512 && var12 <= this.field2495) {
               if (var10 == 0.0F) {
                  var10 = 1.0F;
               }

               this.method1617(var6, var11, var12, (int)var10, (this.field2491 * var6.field982 >> 12) / arg1);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(IIIIZ)Lpd;"
   )
   public final class648 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int[] var6 = new int[arg2 * arg3];
      int var7 = this.field2486 * arg1 + arg0;
      int var8 = this.field2486 - arg2;

      for(int var9 = 0; var9 < arg3; ++var9) {
         int var10 = arg2 * var9;

         for(int var11 = 0; var11 < arg2; ++var11) {
            var6[var10 + var11] = this.field2490[var7++];
         }

         var7 += var8;
      }

      if (arg4) {
         return new class298(this, var6, arg2, arg3);
      } else {
         return new class701(this, var6, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field6667.method911(arg6, 111).field9894) {
            if (this.field2514 != arg6) {
               class648 var11 = (class648)this.field2498.method3192((long)arg6, (byte)-113);
               if (var11 == null) {
                  int[] var12 = this.method1613(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method1615(arg6) ? 64 : this.field2503;
                  var11 = this.method3638(var13, -89, var12, var13, var13, 0);
                  this.field2498.method3190(var11, (long)arg6, 8);
               }

               this.field2514 = arg6;
               this.field2513 = var11;
            }

            ((class297)this.field2513).method2401(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method1621(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(IIIIIIII)V"
   )
   private final void method1627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg1 >= this.field2512 && arg1 < this.field2495) {
         int var9 = this.field2486 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg0 + var15 >= this.field2483 && arg0 + var15 < this.field2492 && var12 < arg5) {
                     int var16 = this.field2490[var9 + var15];
                     int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                     this.field2490[var9 + var15] = var13 + var17;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var18 = 0;

               while(var18 < arg2) {
                  if (arg0 + var18 >= this.field2483 && arg0 + var18 < this.field2492 && var12 < arg5) {
                     int var19 = this.field2490[var9 + var18];
                     int var20 = arg3 + var19;
                     int var21 = (arg3 & 16711935) + (var19 & 16711935);
                     int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.field2490[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                  }

                  ++var18;
                  ++var12;
                  var12 %= var11;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            int var23 = 0;

            while(var23 < arg2) {
               if (arg0 + var23 >= this.field2483 && arg0 + var23 < this.field2492 && var12 < arg5) {
                  this.field2490[var9 + var23] = arg3;
               }

               ++var23;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   private final void method1628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg0 >= this.field2483 && arg0 < this.field2492) {
         int var9 = this.field2486 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg1 + var15 >= this.field2512 && arg1 + var15 < this.field2495 && var12 < arg5) {
                     int var16 = this.field2486 * var15 + var9;
                     int var17 = this.field2490[var16];
                     int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                     this.field2490[var16] = var13 + var18;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var19 = 0;

               while(var19 < arg2) {
                  if (arg1 + var19 >= this.field2512 && arg1 + var19 < this.field2495 && var12 < arg5) {
                     int var20 = this.field2486 * var19 + var9;
                     int var21 = this.field2490[var20];
                     int var22 = arg3 + var21;
                     int var23 = (arg3 & 16711935) + (var21 & 16711935);
                     int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                     this.field2490[var20] = var22 - var24 | var24 - (var24 >>> 8);
                  }

                  ++var19;
                  ++var12;
                  var12 %= var11;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            int var25 = 0;

            while(var25 < arg2) {
               if (arg1 + var25 >= this.field2512 && arg1 + var25 < this.field2495 && var12 < arg5) {
                  this.field2490[this.field2486 * var25 + var9] = arg3;
               }

               ++var25;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Loga;Lsq;)Lkr;"
   )
   public final class122 method445(class179 arg0, class220 arg1) {
      return new class786(this, (class648)arg0, (class308)arg1);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method421(int arg0, class87 arg1, int arg2, int arg3) {
      class424 var5 = (class424)arg1;
      int[] var6 = var5.field5778;
      int[] var7 = var5.field5776;
      int var8;
      if (this.field2495 < var6.length + arg3) {
         var8 = this.field2495 - arg3;
      } else {
         var8 = var6.length;
      }

      int var9;
      if (this.field2512 > arg3) {
         var9 = this.field2512 - arg3;
         arg3 = this.field2512;
      } else {
         var9 = 0;
      }

      if (var8 - var9 > 0) {
         int var10 = this.field2486 * arg3;

         for(int var11 = var9; var11 < var8; ++var11) {
            int var12 = var6[var11] + arg2;
            int var13 = var7[var11];
            if (this.field2483 > var12) {
               var13 -= this.field2483 - var12;
               var12 = this.field2483;
            }

            if (this.field2492 < var12 + var13) {
               var13 = this.field2492 - var12;
            }

            int var14 = var10 + var12;

            for(int var15 = -var13; var15 < 0; ++var15) {
               this.field2490[var14++] = arg0;
            }

            var10 += this.field2486;
         }

      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 >= this.field2483 && arg0 < this.field2492) {
         if (arg1 < this.field2512) {
            arg2 -= this.field2512 - arg1;
            arg1 = this.field2512;
         }

         if (arg1 + arg2 > this.field2495) {
            arg2 = this.field2495 - arg1;
         }

         int var6 = this.field2486 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field2486 * var10 + var6;
                  int var12 = this.field2490[var11];
                  int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field2490[var11] = var8 + var13;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var14 = 0; var14 < arg2; ++var14) {
                  int var15 = this.field2486 * var14 + var6;
                  int var16 = this.field2490[var15];
                  int var17 = arg3 + var16;
                  int var18 = (arg3 & 16711935) + (var16 & 16711935);
                  int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                  this.field2490[var15] = var17 - var19 | var19 - (var19 >>> 8);
               }

            }
         } else {
            for(int var20 = 0; var20 < arg2; ++var20) {
               this.field2490[this.field2486 * var20 + var6] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method493(int arg0) {
      this.field2503 = arg0;
      this.field2507.method3201((byte)114);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method501(boolean arg0) {
      this.field2494 = arg0;
      this.field2507.method3201((byte)-122);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method429(int arg0) {
      this.field2484[arg0].method4710(10, (Runnable)null);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method474(arg0, arg1, arg2, arg4, arg5);
      this.method474(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method463(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
      this.method463(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!pq",
      name = "v",
      descriptor = "()Lkia;"
   )
   public final class93 method484() {
      return this.field2475;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "o",
      descriptor = "()Lkia;"
   )
   public final class93 method480() {
      return new class432();
   }

   @OriginalMember(
      owner = "client!pq",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 0) {
         arg2 = -arg2;
      }

      int var6 = arg1 - arg2;
      if (var6 < this.field2512) {
         var6 = this.field2512;
      }

      int var7 = arg1 + arg2 + 1;
      if (var7 > this.field2495) {
         var7 = this.field2495;
      }

      int var8 = var6;
      int var9 = arg2 * arg2;
      int var10 = 0;
      int var11 = arg1 - var6;
      int var12 = var11 * var11;
      int var13 = var12 - var11;
      if (arg1 > var7) {
         arg1 = var7;
      }

      int var14 = arg3 >>> 24;
      if (arg4 == 0 || arg4 == 1 && var14 == 255) {
         while(var8 < arg1) {
            while(var13 <= var9 || var12 <= var9) {
               var12 += var10 + var10;
               var13 += var10++ + var10;
            }

            int var64 = arg0 - var10 + 1;
            if (var64 < this.field2483) {
               var64 = this.field2483;
            }

            int var65 = arg0 + var10;
            if (var65 > this.field2492) {
               var65 = this.field2492;
            }

            int var66 = this.field2486 * var8 + var64;

            for(int var67 = var64; var67 < var65; ++var67) {
               this.field2490[var66++] = arg3;
            }

            ++var8;
            var12 -= var11-- + var11;
            var13 -= var11 + var11;
         }

         int var55 = arg2;
         int var56 = var8 - arg1;
         int var57 = var56 * var56 + var9;
         int var58 = var57 - arg2;
         int var59 = var57 - var56;

         while(var8 < var7) {
            while(var59 > var9 && var58 > var9) {
               var59 -= var55-- + var55;
               var58 -= var55 + var55;
            }

            int var60 = arg0 - var55;
            if (var60 < this.field2483) {
               var60 = this.field2483;
            }

            int var61 = arg0 + var55;
            if (var61 > this.field2492 - 1) {
               var61 = this.field2492 - 1;
            }

            int var62 = this.field2486 * var8 + var60;

            for(int var63 = var60; var63 <= var61; ++var63) {
               this.field2490[var62++] = arg3;
            }

            ++var8;
            var59 += var56 + var56;
            var58 += var56++ + var56;
         }

      } else if (arg4 == 1) {
         int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
         int var16 = 256 - var14;

         while(var8 < arg1) {
            while(var13 <= var9 || var12 <= var9) {
               var12 += var10 + var10;
               var13 += var10++ + var10;
            }

            int var28 = arg0 - var10 + 1;
            if (var28 < this.field2483) {
               var28 = this.field2483;
            }

            int var29 = arg0 + var10;
            if (var29 > this.field2492) {
               var29 = this.field2492;
            }

            int var30 = this.field2486 * var8 + var28;

            for(int var31 = var28; var31 < var29; ++var31) {
               int var32 = this.field2490[var30];
               int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
               this.field2490[var30++] = var15 + var33;
            }

            ++var8;
            var12 -= var11-- + var11;
            var13 -= var11 + var11;
         }

         int var17 = arg2;
         int var18 = -var11;
         int var19 = var18 * var18 + var9;
         int var20 = var19 - arg2;
         int var21 = var19 - var18;

         while(var8 < var7) {
            while(var21 > var9 && var20 > var9) {
               var21 -= var17-- + var17;
               var20 -= var17 + var17;
            }

            int var22 = arg0 - var17;
            if (var22 < this.field2483) {
               var22 = this.field2483;
            }

            int var23 = arg0 + var17;
            if (var23 > this.field2492 - 1) {
               var23 = this.field2492 - 1;
            }

            int var24 = this.field2486 * var8 + var22;

            for(int var25 = var22; var25 <= var23; ++var25) {
               int var26 = this.field2490[var24];
               int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
               this.field2490[var24++] = var15 + var27;
            }

            ++var8;
            var21 += var18 + var18;
            var20 += var18++ + var18;
         }

      } else if (arg4 != 2) {
         throw new IllegalArgumentException();
      } else {
         while(var8 < arg1) {
            while(var13 <= var9 || var12 <= var9) {
               var12 += var10 + var10;
               var13 += var10++ + var10;
            }

            int var47 = arg0 - var10 + 1;
            if (var47 < this.field2483) {
               var47 = this.field2483;
            }

            int var48 = arg0 + var10;
            if (var48 > this.field2492) {
               var48 = this.field2492;
            }

            int var49 = this.field2486 * var8 + var47;

            for(int var50 = var47; var50 < var48; ++var50) {
               int var51 = this.field2490[var49];
               int var52 = arg3 + var51;
               int var53 = (arg3 & 16711935) + (var51 & 16711935);
               int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
               this.field2490[var49++] = var52 - var54 | var54 - (var54 >>> 8);
            }

            ++var8;
            var12 -= var11-- + var11;
            var13 -= var11 + var11;
         }

         int var34 = arg2;
         int var35 = -var11;
         int var36 = var35 * var35 + var9;
         int var37 = var36 - arg2;
         int var38 = var36 - var35;

         while(var8 < var7) {
            while(var38 > var9 && var37 > var9) {
               var38 -= var34-- + var34;
               var37 -= var34 + var34;
            }

            int var39 = arg0 - var34;
            if (var39 < this.field2483) {
               var39 = this.field2483;
            }

            int var40 = arg0 + var34;
            if (var40 > this.field2492 - 1) {
               var40 = this.field2492 - 1;
            }

            int var41 = this.field2486 * var8 + var39;

            for(int var42 = var39; var42 <= var40; ++var42) {
               int var43 = this.field2490[var41];
               int var44 = arg3 + var43;
               int var45 = (arg3 & 16711935) + (var43 & 16711935);
               int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
               this.field2490[var41++] = var44 - var46 | var46 - (var46 >>> 8);
            }

            ++var8;
            var38 += var35 + var35;
            var37 += var35++ + var35;
         }

      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method488() {
      return true;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method447(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field2484.length; ++var5) {
         this.field2484[var5].field9394 = this.field2484[var5].field9383;
         this.field2484[var5].field9390 = arg0;
         this.field2484[var5].field9383 = arg1;
         this.field2484[var5].field9378 = arg2;
         this.field2484[var5].field9382 = true;
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method464(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = new int[arg2 * arg3];
      int var6 = 0;

      for(int var7 = 0; var7 < arg3; ++var7) {
         int var8 = (arg1 + var7) * this.field2486 + arg0;

         for(int var9 = 0; var9 < arg2; ++var9) {
            var5[var6++] = this.field2490[var8 + var9];
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method444(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lkc;)V"
   )
   public final void method490(class72 arg0) {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method399() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method465() {
      return false;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method431(int arg0, int arg1, int arg2, int arg3, double arg4) {
      int var7 = this.field2504 - arg2;
      int var8 = this.field2504 * arg1 + arg0;
      float[] var9 = this.field2489;
      int var10 = 0;

      while(var10 < arg3) {
         int var11 = 0;

         while(var11 < arg2) {
            float var12 = var9[var8];
            if (var12 != 2.1474836E9F) {
               var9[var8] = (float)((double)var12 + arg4);
            }

            ++var11;
            ++var8;
         }

         ++var10;
         var8 += var7;
      }

   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method408() {
      return true;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method419() {
      return new int[]{this.field2474, this.field2505, this.field2491, this.field2501};
   }

   @OriginalMember(
      owner = "client!pq",
      name = "I",
      descriptor = "()I"
   )
   public final int method450() {
      int var1 = this.field2508;
      this.field2508 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(Lkv;[Lu;Z)Lda;"
   )
   public final class447 method430(class19 arg0, class65[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field819;
         var5[var7] = arg1[var7].field820;
         if (arg1[var7].field815 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class514(this, arg0, arg1, var4, var5);
         } else {
            return new class143(this, arg0, arg1, var4, var5);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class767(this, arg0, arg1, var4, var5);
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1629(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1630(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
