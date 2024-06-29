import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class164 extends class610 {
   @OriginalMember(
      owner = "client!ld",
      name = "A",
      descriptor = "Z"
   )
   private boolean field2453;
   @OriginalMember(
      owner = "client!ld",
      name = "Q",
      descriptor = "Z"
   )
   private boolean field2460;
   @OriginalMember(
      owner = "client!ld",
      name = "y",
      descriptor = "Let;"
   )
   private class389 field2458;
   @OriginalMember(
      owner = "client!ld",
      name = "H",
      descriptor = "I"
   )
   public int field2465;
   @OriginalMember(
      owner = "client!ld",
      name = "x",
      descriptor = "I"
   )
   public int field2467;
   @OriginalMember(
      owner = "client!ld",
      name = "P",
      descriptor = "I"
   )
   public int field2470;
   @OriginalMember(
      owner = "client!ld",
      name = "ob",
      descriptor = "I"
   )
   public int field2469;
   @OriginalMember(
      owner = "client!ld",
      name = "db",
      descriptor = "I"
   )
   public int field2478;
   @OriginalMember(
      owner = "client!ld",
      name = "M",
      descriptor = "Z"
   )
   private boolean field2474;
   @OriginalMember(
      owner = "client!ld",
      name = "T",
      descriptor = "I"
   )
   private int field2494;
   @OriginalMember(
      owner = "client!ld",
      name = "fb",
      descriptor = "I"
   )
   public int field2488;
   @OriginalMember(
      owner = "client!ld",
      name = "pb",
      descriptor = "I"
   )
   public int field2493;
   @OriginalMember(
      owner = "client!ld",
      name = "B",
      descriptor = "I"
   )
   public int field2477;
   @OriginalMember(
      owner = "client!ld",
      name = "nb",
      descriptor = "I"
   )
   public int field2498;
   @OriginalMember(
      owner = "client!ld",
      name = "I",
      descriptor = "I"
   )
   public int field2464;
   @OriginalMember(
      owner = "client!ld",
      name = "cb",
      descriptor = "I"
   )
   public int field2499;
   @OriginalMember(
      owner = "client!ld",
      name = "jb",
      descriptor = "I"
   )
   public int field2497;
   @OriginalMember(
      owner = "client!ld",
      name = "O",
      descriptor = "I"
   )
   private int field2482;
   @OriginalMember(
      owner = "client!ld",
      name = "eb",
      descriptor = "Llj;"
   )
   private class304 field2489;
   @OriginalMember(
      owner = "client!ld",
      name = "D",
      descriptor = "I"
   )
   private int field2500;
   @OriginalMember(
      owner = "client!ld",
      name = "qb",
      descriptor = "Llj;"
   )
   private class304 field2472;
   @OriginalMember(
      owner = "client!ld",
      name = "ib",
      descriptor = "Ldja;"
   )
   public class225 field2491;
   @OriginalMember(
      owner = "client!ld",
      name = "W",
      descriptor = "I"
   )
   private int field2457;
   @OriginalMember(
      owner = "client!ld",
      name = "sb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2502 = new String[]{method1532(method1531("Q\u00142")), method1532(method1531("n\u0007&Q,t\u0013\"U")), method1532(method1531("}\"\u0001")), method1532(method1531("p\u001dtyX"))};
   @OriginalMember(
      owner = "client!ld",
      name = "C",
      descriptor = "I"
   )
   private int field2456;
   @OriginalMember(
      owner = "client!ld",
      name = "L",
      descriptor = "I"
   )
   private int field2459;
   @OriginalMember(
      owner = "client!ld",
      name = "gb",
      descriptor = "I"
   )
   private int field2461;
   @OriginalMember(
      owner = "client!ld",
      name = "J",
      descriptor = "I"
   )
   private int field2462;
   @OriginalMember(
      owner = "client!ld",
      name = "w",
      descriptor = "I"
   )
   public int field2466;
   @OriginalMember(
      owner = "client!ld",
      name = "rb",
      descriptor = "I"
   )
   public int field2468;
   @OriginalMember(
      owner = "client!ld",
      name = "v",
      descriptor = "I"
   )
   public int field2471;
   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "I"
   )
   public int field2473;
   @OriginalMember(
      owner = "client!ld",
      name = "G",
      descriptor = "I"
   )
   private int field2475;
   @OriginalMember(
      owner = "client!ld",
      name = "S",
      descriptor = "I"
   )
   private int field2476;
   @OriginalMember(
      owner = "client!ld",
      name = "E",
      descriptor = "I"
   )
   public int field2479;
   @OriginalMember(
      owner = "client!ld",
      name = "Z",
      descriptor = "I"
   )
   public int field2480;
   @OriginalMember(
      owner = "client!ld",
      name = "R",
      descriptor = "I"
   )
   public int field2481;
   @OriginalMember(
      owner = "client!ld",
      name = "N",
      descriptor = "I"
   )
   public int field2485;
   @OriginalMember(
      owner = "client!ld",
      name = "hb",
      descriptor = "I"
   )
   private int field2486;
   @OriginalMember(
      owner = "client!ld",
      name = "Y",
      descriptor = "I"
   )
   public int field2487;
   @OriginalMember(
      owner = "client!ld",
      name = "U",
      descriptor = "I"
   )
   public int field2490;
   @OriginalMember(
      owner = "client!ld",
      name = "lb",
      descriptor = "I"
   )
   public int field2492;
   @OriginalMember(
      owner = "client!ld",
      name = "kb",
      descriptor = "Ljc;"
   )
   public class202 field2454;
   @OriginalMember(
      owner = "client!ld",
      name = "mb",
      descriptor = "Lsq;"
   )
   private class309 field2484;
   @OriginalMember(
      owner = "client!ld",
      name = "V",
      descriptor = "Ljq;"
   )
   private class672 field2501;
   @OriginalMember(
      owner = "client!ld",
      name = "X",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field2455;
   @OriginalMember(
      owner = "client!ld",
      name = "bb",
      descriptor = "[F"
   )
   public float[] field2463;
   @OriginalMember(
      owner = "client!ld",
      name = "F",
      descriptor = "[F"
   )
   public float[] field2496;
   @OriginalMember(
      owner = "client!ld",
      name = "K",
      descriptor = "[I"
   )
   public int[] field2483;
   @OriginalMember(
      owner = "client!ld",
      name = "ab",
      descriptor = "[Lnr;"
   )
   private class182[] field2495;

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "([IIIIIZ)Ljq;"
   )
   public final class672 method658(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = false;
      int var8 = arg1;

      for(int var9 = 0; var9 < arg4; ++var9) {
         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg0[var8++] >>> 24;
            if (var11 != 0 && var11 != 255) {
               var7 = true;
               return var7 ? new class94(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class468(this, arg0, arg1, arg2, arg3, arg4, arg5);
            }
         }
      }

      return var7 ? new class94(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class468(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "d",
      descriptor = "(IIIIII)Lpr;"
   )
   public final class331 method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIZ)Ljq;"
   )
   public final class672 method697(int arg0, int arg1, boolean arg2) {
      return arg2 ? new class94(this, arg0, arg1) : new class468(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "r",
      descriptor = "()V"
   )
   public final void method618() {
      if (this.field2455 != null) {
         this.field2483 = this.field2454.field3088;
         this.field2481 = this.field2454.field3084;
         this.field2486 = this.field2454.field3090;
         this.field2463 = this.field2496;
         this.field2476 = this.field2462;
         this.field2475 = this.field2461;
      } else {
         this.field2481 = 1;
         this.field2486 = 1;
         this.field2483 = null;
         this.field2476 = 1;
         this.field2475 = 1;
         this.field2463 = null;
      }

      this.field2484 = null;
      this.method1527();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method613(boolean arg0) {
      this.field2474 = arg0;
      this.field2472.method2551(true);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class96 method608(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class561(arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method619(class624 arg0) {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method677() {
      return true;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "e",
      descriptor = "(II)I"
   )
   public final int method584(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(I[Llja;)V"
   )
   public final void method696(int arg0, class404[] arg1) {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class271 method612(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class418(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method663(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 >= this.field2478 && arg0 < this.field2477) {
         if (arg1 < this.field2469) {
            arg2 -= this.field2469 - arg1;
            arg1 = this.field2469;
         }

         if (arg1 + arg2 > this.field2498) {
            arg2 = this.field2498 - arg1;
         }

         int var6 = this.field2481 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field2481 * var10 + var6;
                  int var12 = this.field2483[var11];
                  int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field2483[var11] = var8 + var13;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var14 = 0; var14 < arg2; ++var14) {
                  int var15 = this.field2481 * var14 + var6;
                  int var16 = this.field2483[var15];
                  int var17 = arg3 + var16;
                  int var18 = (arg3 & 16711935) + (var16 & 16711935);
                  int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                  this.field2483[var15] = var17 - var19 | var19 - (var19 >>> 8);
               }

            }
         } else {
            for(int var20 = 0; var20 < arg2; ++var20) {
               this.field2483[this.field2481 * var20 + var6] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   private final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg0 >= this.field2478 && arg0 < this.field2477) {
         int var9 = this.field2481 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg1 + var15 >= this.field2469 && arg1 + var15 < this.field2498 && var12 < arg5) {
                     int var16 = this.field2481 * var15 + var9;
                     int var17 = this.field2483[var16];
                     int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                     this.field2483[var16] = var13 + var18;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var19 = 0;

               while(var19 < arg2) {
                  if (arg1 + var19 >= this.field2469 && arg1 + var19 < this.field2498 && var12 < arg5) {
                     int var20 = this.field2481 * var19 + var9;
                     int var21 = this.field2483[var20];
                     int var22 = arg3 + var21;
                     int var23 = (arg3 & 16711935) + (var21 & 16711935);
                     int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                     this.field2483[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
               if (arg1 + var25 >= this.field2469 && arg1 + var25 < this.field2498 && var12 < arg5) {
                  this.field2483[this.field2481 * var25 + var9] = arg3;
               }

               ++var25;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      if (var11 == 0) {
         if (var10 >= 0) {
            this.method1522(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var12 = arg6 + arg7;
            int var13 = arg8 % var12;
            int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
            int var15 = var14 % var12;
            if (var15 < 0) {
               var15 += var12;
            }

            this.method1522(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
         }
      } else if (var10 == 0) {
         if (var11 >= 0) {
            this.method1514(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var16 = arg6 + arg7;
            int var17 = arg8 % var16;
            int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
            int var19 = var18 % var16;
            if (var19 < 0) {
               var19 += var16;
            }

            this.method1514(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                     if (arg0 >= this.field2478 && arg0 < this.field2477 && var37 >= this.field2469 && var37 < this.field2498 && var24 < var21) {
                        int var38 = this.field2481 * var37 + arg0;
                        int var39 = this.field2483[var38];
                        int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                        this.field2483[var38] = var35 + var40;
                     }

                     var29 += var31;
                     ++arg0;
                     int var41 = var24 + var34;
                     var24 = var41 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var32) {
                     int var42 = var29 >> 16;
                     if (arg0 >= this.field2478 && arg0 < this.field2477 && var42 >= this.field2469 && var42 < this.field2498 && var24 < var21) {
                        int var43 = this.field2481 * var42 + arg0;
                        int var44 = this.field2483[var43];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field2483[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                  if (arg0 >= this.field2478 && arg0 < this.field2477 && var49 >= this.field2469 && var49 < this.field2498 && var24 < var21) {
                     this.field2483[this.field2481 * var49 + arg0] = arg4;
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
                     if (arg1 >= this.field2469 && arg1 < this.field2498 && var60 >= this.field2478 && var60 < this.field2477 && var24 < var21) {
                        int var61 = this.field2481 * arg1 + var60;
                        int var62 = this.field2483[var61];
                        int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                        this.field2483[this.field2481 * arg1 + var60] = var58 + var63;
                     }

                     var52 += var54;
                     ++arg1;
                     int var64 = var24 + var57;
                     var24 = var64 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg1 <= var55) {
                     int var65 = var52 >> 16;
                     if (arg1 >= this.field2469 && arg1 < this.field2498 && var65 >= this.field2478 && var65 < this.field2477 && var24 < var21) {
                        int var66 = this.field2481 * arg1 + var65;
                        int var67 = this.field2483[var66];
                        int var68 = arg4 + var67;
                        int var69 = (arg4 & 16711935) + (var67 & 16711935);
                        int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                        this.field2483[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                  if (arg1 >= this.field2469 && arg1 < this.field2498 && var72 >= this.field2478 && var72 < this.field2477 && var24 < var21) {
                     this.field2483[this.field2481 * arg1 + var72] = arg4;
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
      owner = "client!ld",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method702() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 0) {
         arg2 = -arg2;
      }

      int var6 = arg1 - arg2;
      if (var6 < this.field2469) {
         var6 = this.field2469;
      }

      int var7 = arg1 + arg2 + 1;
      if (var7 > this.field2498) {
         var7 = this.field2498;
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
            if (var64 < this.field2478) {
               var64 = this.field2478;
            }

            int var65 = arg0 + var10;
            if (var65 > this.field2477) {
               var65 = this.field2477;
            }

            int var66 = this.field2481 * var8 + var64;

            for(int var67 = var64; var67 < var65; ++var67) {
               this.field2483[var66++] = arg3;
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
            if (var60 < this.field2478) {
               var60 = this.field2478;
            }

            int var61 = arg0 + var55;
            if (var61 > this.field2477 - 1) {
               var61 = this.field2477 - 1;
            }

            int var62 = this.field2481 * var8 + var60;

            for(int var63 = var60; var63 <= var61; ++var63) {
               this.field2483[var62++] = arg3;
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
            if (var28 < this.field2478) {
               var28 = this.field2478;
            }

            int var29 = arg0 + var10;
            if (var29 > this.field2477) {
               var29 = this.field2477;
            }

            int var30 = this.field2481 * var8 + var28;

            for(int var31 = var28; var31 < var29; ++var31) {
               int var32 = this.field2483[var30];
               int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
               this.field2483[var30++] = var15 + var33;
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
            if (var22 < this.field2478) {
               var22 = this.field2478;
            }

            int var23 = arg0 + var17;
            if (var23 > this.field2477 - 1) {
               var23 = this.field2477 - 1;
            }

            int var24 = this.field2481 * var8 + var22;

            for(int var25 = var22; var25 <= var23; ++var25) {
               int var26 = this.field2483[var24];
               int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
               this.field2483[var24++] = var15 + var27;
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
            if (var47 < this.field2478) {
               var47 = this.field2478;
            }

            int var48 = arg0 + var10;
            if (var48 > this.field2477) {
               var48 = this.field2477;
            }

            int var49 = this.field2481 * var8 + var47;

            for(int var50 = var47; var50 < var48; ++var50) {
               int var51 = this.field2483[var49];
               int var52 = arg3 + var51;
               int var53 = (arg3 & 16711935) + (var51 & 16711935);
               int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
               this.field2483[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
            if (var39 < this.field2478) {
               var39 = this.field2478;
            }

            int var40 = arg0 + var34;
            if (var40 > this.field2477 - 1) {
               var40 = this.field2477 - 1;
            }

            int var41 = this.field2481 * var8 + var39;

            for(int var42 = var39; var42 <= var40; ++var42) {
               int var43 = this.field2483[var41];
               int var44 = arg3 + var43;
               int var45 = (arg3 & 16711935) + (var43 & 16711935);
               int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
               this.field2483[var41++] = var44 - var46 | var46 - (var46 >>> 8);
            }

            ++var8;
            var38 += var35 + var35;
            var37 += var35++ + var35;
         }

      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method668() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method582(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      float var6 = (float)arg2 * this.field2491.field3426 + (float)arg0 * this.field2491.field3421 + (float)arg1 * this.field2491.field3418 + this.field2491.field3408;
      if (!(var6 < (float)this.field2488) && !(var6 > (float)this.field2464)) {
         int var7 = (int)(((float)arg2 * this.field2491.field3422 + (float)arg0 * this.field2491.field3419 + (float)arg1 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / (float)arg3);
         int var8 = (int)(((float)arg2 * this.field2491.field3420 + (float)arg0 * this.field2491.field3429 + (float)arg1 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / (float)arg3);
         if (var7 >= this.field2487 && var7 <= this.field2473 && var8 >= this.field2466 && var8 <= this.field2479) {
            arg4[0] = var7 - this.field2487;
            arg4[1] = var8 - this.field2466;
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } else {
         arg4[0] = arg4[1] = arg4[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      class561 var13 = (class561)arg6;
      int[] var14 = var13.field8337;
      int[] var15 = var13.field8339;
      int var16 = this.field2469 > arg8 ? this.field2469 : arg8;
      int var17 = this.field2498 < var14.length + arg8 ? this.field2498 : var14.length + arg8;
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
                  if (arg0 >= this.field2478 && arg0 < this.field2477 && var37 >= var16 && var37 < var17 && var22 < var19) {
                     int var39 = var14[var38] + arg7;
                     if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                        int var40 = this.field2481 * var37 + arg0;
                        int var41 = this.field2483[var40];
                        int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                        this.field2483[var40] = var35 + var42;
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
                  if (arg0 >= this.field2478 && arg0 < this.field2477 && var44 >= var16 && var44 < var17 && var22 < var19) {
                     int var46 = var14[var45] + arg7;
                     if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                        int var47 = this.field2481 * var44 + arg0;
                        int var48 = this.field2483[var47];
                        int var49 = arg4 + var48;
                        int var50 = (arg4 & 16711935) + (var48 & 16711935);
                        int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                        this.field2483[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
               if (arg0 >= this.field2478 && arg0 < this.field2477 && var53 >= var16 && var53 < var17 && var22 < var19) {
                  int var55 = var14[var54] + arg7;
                  if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                     this.field2483[this.field2481 * var53 + arg0] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var80 >= this.field2478 && var80 < this.field2477 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                  this.field2483[this.field2481 * arg1 + var80] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var66 >= this.field2478 && var66 < this.field2477 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                  int var68 = this.field2481 * arg1 + var66;
                  int var69 = this.field2483[var68];
                  int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                  this.field2483[this.field2481 * arg1 + var66] = var64 + var70;
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
               if (arg1 >= var16 && arg1 < var17 && var72 >= this.field2478 && var72 < this.field2477 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                  int var74 = this.field2481 * arg1 + var72;
                  int var75 = this.field2483[var74];
                  int var76 = arg4 + var75;
                  int var77 = (arg4 & 16711935) + (var75 & 16711935);
                  int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                  this.field2483[var74] = var76 - var78 | var78 - (var78 >>> 8);
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
      owner = "client!ld",
      name = "o",
      descriptor = "(I)[I"
   )
   public final int[] method1515(int arg0) {
      class304 var2 = this.field2472;
      class7 var3;
      synchronized(this.field2472) {
         var3 = (class7)this.field2472.method2544(false, (long)arg0);
         if (var3 == null) {
            if (!super.field8891.method1372(-114, arg0)) {
               return null;
            }

            class453 var5 = super.field8891.method1373(arg0, (byte)-54);
            int var6 = !var5.field6933 && !this.field2474 ? this.field2467 : 64;
            var3 = new class7(arg0, var6, super.field8891.method1375(var6, 0.7F, true, var6, arg0, -9197), var5.field6927 != 1);
            this.field2472.method2545((long)arg0, 125, var3);
         }
      }

      var3.field42 = true;
      return var3.method32();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method690(int arg0, int arg1) {
      int var3 = arg0 | 133120;
      return var3 & arg1 ^ arg1;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method629(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > this.field2481) {
         arg2 = this.field2481;
      }

      if (arg3 > this.field2486) {
         arg3 = this.field2486;
      }

      this.field2478 = arg0;
      this.field2477 = arg2;
      this.field2469 = arg1;
      this.field2498 = arg3;
      this.method1521();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "v",
      descriptor = "()Lkf;"
   )
   public final class401 method605() {
      return this.field2491;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method611(int[] arg0) {
      arg0[0] = this.field2481;
      arg0[1] = this.field2486;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field8891.method1373(arg6, (byte)-54).field6934) {
            if (this.field2500 != arg6) {
               class672 var11 = (class672)this.field2489.method2544(false, (long)arg6);
               if (var11 == null) {
                  int[] var12 = this.method1528(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method1530(arg6) ? 64 : this.field2467;
                  var11 = this.method4494((byte)-122, var13, var13, var13, 0, var12);
                  this.field2489.method2545((long)arg6, 117, var11);
               }

               this.field2500 = arg6;
               this.field2501 = var11;
            }

            ((class517)this.field2501).method934(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method1523(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;)Lnr;"
   )
   public final class182 method1517(Runnable arg0) {
      for(int var2 = 0; var2 < this.field2468; ++var2) {
         if (this.field2495[var2].field2821 == arg0) {
            return this.field2495[var2];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method590(int arg0) {
      this.method631(0, 0, this.field2481, this.field2486, arg0, 0);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method665(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg1 >= this.field2469 && arg1 < this.field2498) {
         if (arg0 < this.field2478) {
            arg2 -= this.field2478 - arg0;
            arg0 = this.field2478;
         }

         if (arg0 + arg2 > this.field2477) {
            arg2 = this.field2477 - arg0;
         }

         int var6 = this.field2481 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field2483[var6 + var10];
                  int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                  this.field2483[var6 + var10] = var8 + var12;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var13 = 0; var13 < arg2; ++var13) {
                  int var14 = this.field2483[var6 + var13];
                  int var15 = arg3 + var14;
                  int var16 = (arg3 & 16711935) + (var14 & 16711935);
                  int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                  this.field2483[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
               }

            }
         } else {
            for(int var18 = 0; var18 < arg2; ++var18) {
               this.field2483[var6 + var18] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lpr;)V"
   )
   public final void method667(class331 arg0) {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method610() {
      return true;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (arg2 > 0 && arg3 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = (arg7 << 16) / arg2;
         int var13 = (arg6.length / arg7 << 16) / arg3;
         int var14 = this.field2481 * arg1 + arg0;
         int var15 = this.field2481 - arg2;
         if (arg1 + arg3 > this.field2498) {
            arg3 -= arg1 + arg3 - this.field2498;
         }

         if (arg1 < this.field2469) {
            int var16 = this.field2469 - arg1;
            arg3 -= var16;
            var14 += this.field2481 * var16;
            var11 += var13 * var16;
         }

         if (arg0 + arg2 > this.field2477) {
            int var17 = arg0 + arg2 - this.field2477;
            arg2 -= var17;
            var15 += var17;
         }

         if (arg0 < this.field2478) {
            int var18 = this.field2478 - arg0;
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
                     int var28 = this.field2483[var14];
                     this.field2483[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                        int var34 = this.field2483[var14];
                        int var35 = var33 + var34;
                        int var36 = (var33 & 16711935) + (var34 & 16711935);
                        int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                        this.field2483[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                     this.field2483[var14++] = arg5;
                  } else {
                     this.field2483[var14++] = arg4;
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
      owner = "client!ld",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class164(Canvas arg0, class150 arg1, int arg2, int arg3) {
      this(arg1);

      try {
         this.method674(arg0, arg2, arg3);
         this.method579(arg0);
      } catch (Throwable var6) {
         var6.printStackTrace();
         this.method4495(true);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method679(float arg0) {
      this.field2470 = (int)(arg0 * 65535.0F);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "i",
      descriptor = "()I"
   )
   public final int method635() {
      return this.field2488;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method700(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field2491.field3426 + (float)arg0 * this.field2491.field3421 + (float)arg1 * this.field2491.field3418 + this.field2491.field3408;
      if (!(var5 < (float)this.field2488) && !(var5 > (float)this.field2464)) {
         int var6 = (int)(((float)arg2 * this.field2491.field3422 + (float)arg0 * this.field2491.field3419 + (float)arg1 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / var5);
         int var7 = (int)(((float)arg2 * this.field2491.field3420 + (float)arg0 * this.field2491.field3429 + (float)arg1 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / var5);
         if (var6 >= this.field2487 && var6 <= this.field2473 && var7 >= this.field2466 && var7 <= this.field2479) {
            arg3[0] = var6 - this.field2487;
            arg3[1] = var7 - this.field2466;
            arg3[2] = (int)var5;
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } else {
         arg3[0] = arg3[1] = arg3[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method681(int arg0) {
      int var2 = arg0 - this.field2457;

      for(Object var3 = this.field2472.method2550(47); var3 != null; var3 = this.field2472.method2553(-20302)) {
         class7 var4 = (class7)var3;
         if (var4.field42) {
            var4.field41 += var2;
            int var5 = var4.field41 / 20;
            if (var5 > 0) {
               class453 var6 = super.field8891.method1373(var4.field44, (byte)-54);
               var4.method31(var6.field6926 * var2 * 50 / 1000, var6.field6932 * var2 * 50 / 1000);
               var4.field41 -= var5 * 20;
            }

            var4.field42 = false;
         }
      }

      this.field2457 = arg0;
      this.field2489.method2552(5, 21533);
      this.field2472.method2552(5, 21533);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method585() {
      return true;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lcl;)V"
   )
   public final void method693(class141 arg0) {
      class309 var2 = (class309)arg0;
      this.field2481 = var2.field4809;
      this.field2486 = var2.field4807;
      this.field2483 = var2.field4815;
      this.field2484 = var2;
      this.field2476 = var2.field4809;
      this.field2475 = var2.field4807;
      this.field2463 = var2.field4816;
      this.method1527();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "(II)Lip;"
   )
   public final class726 method638(int arg0, int arg1) {
      return new class5(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method689() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method628() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "A",
      descriptor = "()V"
   )
   public final void method705() {
      this.field2472.method2551(true);
      this.field2489.method2551(true);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "o",
      descriptor = "()I"
   )
   public final int method687() {
      return 0;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method669() {
      return new int[]{this.field2492, this.field2480, this.field2493, this.field2499};
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lkf;)V"
   )
   public final void method688(class401 arg0) {
      this.field2491 = (class225)arg0;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method651(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method632(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      float var8 = (float)arg2 * this.field2491.field3426 + (float)arg0 * this.field2491.field3421 + (float)arg1 * this.field2491.field3418 + this.field2491.field3408;
      float var9 = (float)arg5 * this.field2491.field3426 + (float)arg3 * this.field2491.field3421 + (float)arg4 * this.field2491.field3418 + this.field2491.field3408;
      int var10 = 0;
      if (var8 < (float)this.field2488 && var9 < (float)this.field2488) {
         var10 |= 16;
      } else if (var8 > (float)this.field2464 && var9 > (float)this.field2464) {
         var10 |= 32;
      }

      int var11 = (int)(((float)arg2 * this.field2491.field3422 + (float)arg0 * this.field2491.field3419 + (float)arg1 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / (float)arg6);
      int var12 = (int)(((float)arg5 * this.field2491.field3422 + (float)arg3 * this.field2491.field3419 + (float)arg4 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / (float)arg6);
      if (var11 < this.field2487 && var12 < this.field2487) {
         var10 |= 1;
      } else if (var11 > this.field2473 && var12 > this.field2473) {
         var10 |= 2;
      }

      int var13 = (int)(((float)arg2 * this.field2491.field3420 + (float)arg0 * this.field2491.field3429 + (float)arg1 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / (float)arg6);
      int var14 = (int)(((float)arg5 * this.field2491.field3420 + (float)arg3 * this.field2491.field3429 + (float)arg4 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / (float)arg6);
      if (var13 < this.field2466 && var14 < this.field2466) {
         var10 |= 4;
      } else if (var13 > this.field2479 && var14 > this.field2479) {
         var10 |= 8;
      }

      return var10;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1518(int arg0) {
      return super.field8891.method1372(-114, arg0);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method592(int arg0, int arg1, int arg2, int arg3, double arg4) {
      int var7 = this.field2476 - arg2;
      int var8 = this.field2476 * arg1 + arg0;
      float[] var9 = this.field2463;
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
      owner = "client!ld",
      name = "k",
      descriptor = "(I)I"
   )
   public final int method1519(int arg0) {
      return super.field8891.method1373(arg0, (byte)-54).field6922 & 65535;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "m",
      descriptor = "(I)Z"
   )
   public final boolean method1520(int arg0) {
      return super.field8891.method1373(arg0, (byte)-54).field6937 || super.field8891.method1373(arg0, (byte)-54).field6938;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method664() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method586(int arg0, int arg1, int arg2, int arg3) {
      if (this.field2478 < arg0) {
         this.field2478 = arg0;
      }

      if (this.field2469 < arg1) {
         this.field2469 = arg1;
      }

      if (this.field2477 > arg2) {
         this.field2477 = arg2;
      }

      if (this.field2498 > arg3) {
         this.field2498 = arg3;
      }

      this.method1521();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "d",
      descriptor = "()V"
   )
   public final void method675() {
      if (this.field2453) {
         class595.method4428(true, (byte)-107, false);
         this.field2453 = false;
      }

      this.field2454 = null;
      this.field2455 = null;
      this.field2459 = 0;
      this.field2456 = 0;
      this.field2458 = null;
      this.field2460 = true;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method579(Canvas arg0) {
      if (arg0 != null) {
         class202 var2 = (class202)this.field2458.method3141((long)arg0.hashCode(), true);
         if (var2 != null) {
            this.field2455 = arg0;
            Dimension var3 = arg0.getSize();
            this.field2459 = var3.width;
            this.field2456 = var3.height;
            this.field2454 = var2;
            if (this.field2484 == null) {
               this.field2483 = var2.field3088;
               this.field2481 = var2.field3084;
               this.field2486 = var2.field3090;
               if (this.field2481 != this.field2476 || this.field2486 != this.field2475) {
                  this.field2462 = this.field2476 = this.field2481;
                  this.field2461 = this.field2475 = this.field2486;
                  this.field2496 = this.field2463 = new float[this.field2476 * this.field2475];
               }

               this.method1527();
               return;
            }
         }
      } else {
         this.field2455 = null;
         this.field2454 = null;
         if (this.field2484 == null) {
            this.field2483 = null;
            this.field2481 = this.field2486 = 1;
            this.field2476 = this.field2475 = 1;
            this.method1527();
         }
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIF)Llja;"
   )
   public final class404 method583(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method665(arg0, arg1, arg2, arg4, arg5);
      this.method665(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method663(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
      this.method663(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method691(int arg0) {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "M",
      descriptor = "()I"
   )
   public final int method706() {
      int var1 = this.field2494;
      this.field2494 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "g",
      descriptor = "()V"
   )
   private final void method1521() {
      this.field2487 = this.field2478 - this.field2492;
      this.field2473 = this.field2477 - this.field2492;
      this.field2466 = this.field2469 - this.field2480;
      this.field2479 = this.field2498 - this.field2480;

      for(int var1 = 0; var1 < this.field2468; ++var1) {
         class448 var5 = this.field2495[var1].field2854;
         var5.field6853 = this.field2492 - this.field2478;
         var5.field6854 = this.field2480 - this.field2469;
         var5.field6851 = this.field2477 - this.field2478;
         var5.field6850 = this.field2498 - this.field2469;
      }

      int var2 = this.field2481 * this.field2469 + this.field2478;

      for(int var3 = this.field2469; var3 < this.field2498; ++var3) {
         for(int var4 = 0; var4 < this.field2468; ++var4) {
            this.field2495[var4].field2854.field6863[var3 - this.field2469] = var2;
         }

         var2 += this.field2481;
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method626(int[] arg0) {
      arg0[0] = this.field2478;
      arg0[1] = this.field2469;
      arg0[2] = this.field2477;
      arg0[3] = this.field2498;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "x",
      descriptor = "()Lkf;"
   )
   public final class401 method624() {
      return new class225();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method587() {
      return true;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method580(int arg0, int arg1, int arg2, int arg3) {
      class182 var5 = this.method1517(Thread.currentThread());
      var5.field2832 = arg0;
      var5.field2823 = arg1;
      var5.field2827 = arg2;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method662() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "<init>",
      descriptor = "(Ld;)V"
   )
   private class164(class150 arg0) {
      super(arg0);
      this.field2453 = false;
      this.field2460 = false;
      this.field2458 = new class389(4);
      this.field2465 = 78642;
      this.field2467 = 128;
      this.field2470 = 75518;
      this.field2469 = 0;
      this.field2478 = 0;
      this.field2474 = false;
      this.field2494 = 0;
      this.field2488 = 50;
      this.field2493 = 512;
      this.field2477 = 0;
      this.field2498 = 0;
      this.field2464 = 3500;
      this.field2499 = 512;
      this.field2497 = 45823;
      this.field2482 = 0;
      this.field2489 = new class304(16);
      this.field2500 = -1;

      try {
         this.field2472 = new class304(256);
         this.field2491 = new class225();
         this.method685(1);
         this.method676(0);
         class274.method2325(true, 1, true);
         this.field2453 = true;
         this.field2457 = (int)class162.method1442(14080);
      } catch (Throwable var3) {
         var3.printStackTrace();
         this.method4495(true);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(IIIIIIII)V"
   )
   private final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg1 >= this.field2469 && arg1 < this.field2498) {
         int var9 = this.field2481 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg0 + var15 >= this.field2478 && arg0 + var15 < this.field2477 && var12 < arg5) {
                     int var16 = this.field2483[var9 + var15];
                     int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                     this.field2483[var9 + var15] = var13 + var17;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var18 = 0;

               while(var18 < arg2) {
                  if (arg0 + var18 >= this.field2478 && arg0 + var18 < this.field2477 && var12 < arg5) {
                     int var19 = this.field2483[var9 + var18];
                     int var20 = arg3 + var19;
                     int var21 = (arg3 & 16711935) + (var19 & 16711935);
                     int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.field2483[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
               if (arg0 + var23 >= this.field2478 && arg0 + var23 < this.field2477 && var12 < arg5) {
                  this.field2483[var9 + var23] = arg3;
               }

               ++var23;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "E",
      descriptor = "()I"
   )
   public final int method661() {
      return 0;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "la",
      descriptor = "()V"
   )
   public final void method701() {
      this.field2478 = 0;
      this.field2469 = 0;
      this.field2477 = this.field2481;
      this.field2498 = this.field2486;
      this.method1521();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method639(int arg0, int arg1, int arg2, int arg3) {
      this.field2492 = arg0;
      this.field2480 = arg1;
      this.field2493 = arg2;
      this.field2499 = arg3;
      this.method1521();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method699(int arg0, int arg1) throws class623 {
      if (this.field2455 != null && this.field2454 != null) {
         try {
            Graphics var3 = this.field2455.getGraphics();
            this.field2454.method1766(this.field2459, arg1, arg0, 0, 0, var3, (byte)107, this.field2456);
         } catch (Exception var4) {
            this.field2455.repaint();
         }
      } else {
         throw new IllegalStateException(field2502[0]);
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "XA",
      descriptor = "()I"
   )
   public final int method616() {
      return this.field2464;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "B",
      descriptor = "()V"
   )
   public final void method680() {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lkp;Z)Ljq;"
   )
   public final class672 method606(class776 arg0, boolean arg1) {
      int[] var3 = arg0.field11400;
      byte[] var4 = arg0.field11396;
      int var5 = arg0.field11395;
      int var6 = arg0.field11394;
      class517 var11;
      if (arg1 && arg0.field11398 == null) {
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

         var11 = new class460(this, var8, var7, var5, var6);
      } else {
         int[] var14 = new int[var5 * var6];
         byte[] var15 = arg0.field11398;
         if (var15 != null) {
            for(int var16 = 0; var16 < var6; ++var16) {
               int var17 = var5 * var16;

               for(int var18 = 0; var18 < var5; ++var18) {
                  var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
               }
            }

            var11 = new class94(this, var14, var5, var6);
         } else {
            for(int var19 = 0; var19 < var6; ++var19) {
               int var20 = var5 * var19;

               for(int var21 = 0; var21 < var5; ++var21) {
                  int var22 = var3[var4[var20 + var21] & 255];
                  var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
               }
            }

            var11 = new class468(this, var14, var5, var6);
         }
      }

      var11.method2107(arg0.field11401, arg0.field11397, arg0.field11402, arg0.field11399);
      return var11;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method647(Canvas arg0, int arg1, int arg2) {
      class202 var4 = (class202)this.field2458.method3141((long)arg0.hashCode(), true);
      if (var4 != null) {
         var4.method2477(1976);
         class202 var5 = class298.method2500(arg0, arg1, arg2, (byte)45);
         this.field2458.method3143(67, var5, (long)arg0.hashCode());
         if (this.field2455 == arg0 && this.field2484 == null) {
            Dimension var6 = arg0.getSize();
            this.field2459 = var6.width;
            this.field2456 = var6.height;
            this.field2454 = var5;
            this.field2483 = var5.field3088;
            this.field2481 = var5.field3084;
            this.field2486 = var5.field3090;
            if (this.field2481 != this.field2476 || this.field2486 != this.field2475) {
               this.field2462 = this.field2476 = this.field2481;
               this.field2461 = this.field2475 = this.field2486;
               this.field2496 = this.field2463 = new float[this.field2476 * this.field2475];
            }

            this.method1527();
         }
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "g",
      descriptor = "(IIIIII)V"
   )
   private final void method1523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg3 < 0) {
         arg3 = -arg3;
      }

      int var7 = arg1 - arg3;
      if (var7 < this.field2469) {
         var7 = this.field2469;
      }

      int var8 = arg1 + arg3 + 1;
      if (var8 > this.field2498) {
         var8 = this.field2498;
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
            if (var65 < this.field2478) {
               var65 = this.field2478;
            }

            int var66 = arg0 + var11;
            if (var66 > this.field2477) {
               var66 = this.field2477;
            }

            int var67 = this.field2481 * var9 + var65;

            for(int var68 = var65; var68 < var66; ++var68) {
               if ((float)arg2 < this.field2463[var67]) {
                  this.field2483[var67] = arg4;
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
            if (var61 < this.field2478) {
               var61 = this.field2478;
            }

            int var62 = arg0 + var56;
            if (var62 > this.field2477 - 1) {
               var62 = this.field2477 - 1;
            }

            int var63 = this.field2481 * var9 + var61;

            for(int var64 = var61; var64 <= var62; ++var64) {
               if ((float)arg2 < this.field2463[var63]) {
                  this.field2483[var63] = arg4;
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
            if (var29 < this.field2478) {
               var29 = this.field2478;
            }

            int var30 = arg0 + var11;
            if (var30 > this.field2477) {
               var30 = this.field2477;
            }

            int var31 = this.field2481 * var9 + var29;

            for(int var32 = var29; var32 < var30; ++var32) {
               if ((float)arg2 < this.field2463[var31]) {
                  int var33 = this.field2483[var31];
                  int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                  this.field2483[var31] = var16 + var34;
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
            if (var23 < this.field2478) {
               var23 = this.field2478;
            }

            int var24 = arg0 + var18;
            if (var24 > this.field2477 - 1) {
               var24 = this.field2477 - 1;
            }

            int var25 = this.field2481 * var9 + var23;

            for(int var26 = var23; var26 <= var24; ++var26) {
               if ((float)arg2 < this.field2463[var25]) {
                  int var27 = this.field2483[var25];
                  int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                  this.field2483[var25] = var16 + var28;
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
            if (var48 < this.field2478) {
               var48 = this.field2478;
            }

            int var49 = arg0 + var11;
            if (var49 > this.field2477) {
               var49 = this.field2477;
            }

            int var50 = this.field2481 * var9 + var48;

            for(int var51 = var48; var51 < var49; ++var51) {
               if ((float)arg2 < this.field2463[var50]) {
                  int var52 = this.field2483[var50];
                  int var53 = arg4 + var52;
                  int var54 = (arg4 & 16711935) + (var52 & 16711935);
                  int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                  this.field2483[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
            if (var40 < this.field2478) {
               var40 = this.field2478;
            }

            int var41 = arg0 + var35;
            if (var41 > this.field2477 - 1) {
               var41 = this.field2477 - 1;
            }

            int var42 = this.field2481 * var9 + var40;

            for(int var43 = var40; var43 <= var41; ++var43) {
               if ((float)arg2 < this.field2463[var42]) {
                  int var44 = this.field2483[var42];
                  int var45 = arg4 + var44;
                  int var46 = (arg4 & 16711935) + (var44 & 16711935);
                  int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                  this.field2483[var42] = var45 - var47 | var47 - (var47 >>> 8);
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
      owner = "client!ld",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method670(int arg0, int arg1) {
      class182 var3 = this.method1517(Thread.currentThread());
      this.field2488 = arg0;
      this.field2464 = arg1;
      var3.field2831 = this.field2464 - 255;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method674(Canvas arg0, int arg1, int arg2) {
      class202 var4 = (class202)this.field2458.method3141((long)arg0.hashCode(), true);
      if (var4 == null) {
         class202 var5 = class298.method2500(arg0, arg1, arg2, (byte)60);
         this.field2458.method3143(92, var5, (long)arg0.hashCode());
      } else {
         if (var4.field3084 != arg1 || var4.field3090 != arg2) {
            this.method647(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method683(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field2495.length; ++var5) {
         this.field2495[var5].field2828 = this.field2495[var5].field2823;
         this.field2495[var5].field2832 = arg0;
         this.field2495[var5].field2823 = arg1;
         this.field2495[var5].field2827 = arg2;
         this.field2495[var5].field2818 = true;
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method656(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field2497 = (int)(arg1 * 65535.0F);
      this.field2465 = (int)(arg2 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
      this.field2485 = (int)(arg3 * 65535.0F / var7);
      this.field2490 = (int)(arg4 * 65535.0F / var7);
      this.field2471 = (int)(arg5 * 65535.0F / var7);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "h",
      descriptor = "(I)Lza;"
   )
   public final class624 method634(int arg0) {
      return null;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method660() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "f",
      descriptor = "()V"
   )
   public final void method672() {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lar;IIII)V"
   )
   private final void method1524(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = arg0.field3007;
      int var8 = arg4 << 1;
      if (var6 == -1) {
         this.method1523(arg1, arg2, arg3, arg4, arg0.field3011, 1);
      } else {
         if (this.field2500 != var6) {
            class672 var9 = (class672)this.field2489.method2544(false, (long)var6);
            if (var9 == null) {
               int[] var10 = this.method1528(var6);
               if (var10 == null) {
                  return;
               }

               int var11 = this.method1530(var6) ? 64 : this.field2467;
               var9 = this.method4494((byte)-107, var11, var11, var11, 0, var10);
               this.field2489.method2545((long)var6, 109, var9);
            }

            this.field2500 = var6;
            this.field2501 = var9;
         }

         ++var8;
         ((class517)this.field2501).method940(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field3011, 1, 1);
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "D",
      descriptor = "()Z"
   )
   public final boolean method1525() {
      return this.field2460;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method704(int arg0) {
      class495.field7543 = arg0;
      class495.field7480 = arg0;
      if (this.field2468 > 1) {
         throw new IllegalStateException(field2502[3]);
      } else {
         this.method685(this.field2468);
         this.method676(0);
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method645(int arg0) {
      this.field2495[arg0].method1655(-1, (Runnable)null);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8) {
      class561 var10 = (class561)arg6;
      int[] var11 = var10.field8337;
      int[] var12 = var10.field8339;
      int var13 = this.field2469 > arg8 ? this.field2469 : arg8;
      int var14 = this.field2498 < var11.length + arg8 ? this.field2498 : var11.length + arg8;
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
         if (arg0 < this.field2478) {
            var18 += (this.field2478 - arg0) * var20;
            arg0 = this.field2478;
         }

         if (var21 >= this.field2477) {
            var21 = this.field2477 - 1;
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
                        int var28 = this.field2481 * var25 + arg0;
                        int var29 = this.field2483[var28];
                        int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                        this.field2483[var28] = var23 + var30;
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
                        int var34 = this.field2481 * var31 + arg0;
                        int var35 = this.field2483[var34];
                        int var36 = arg4 + var35;
                        int var37 = (arg4 & 16711935) + (var35 & 16711935);
                        int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                        this.field2483[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                     this.field2483[this.field2481 * var39 + arg0] = arg4;
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
               if (var64 >= this.field2478 && var64 < this.field2477 && var64 >= var66 && var64 < var12[var65] + var66) {
                  this.field2483[this.field2481 * arg1 + var64] = arg4;
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
               if (var50 >= this.field2478 && var50 < this.field2477 && var50 >= var52 && var50 < var12[var51] + var52) {
                  int var53 = this.field2481 * arg1 + var50;
                  int var54 = this.field2483[var53];
                  int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                  this.field2483[this.field2481 * arg1 + var50] = var48 + var55;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var46) {
               int var56 = var43 >> 16;
               int var57 = arg1 - arg8;
               int var58 = var11[var57] + arg7;
               if (var56 >= this.field2478 && var56 < this.field2477 && var56 >= var58 && var56 < var12[var57] + var58) {
                  int var59 = this.field2481 * arg1 + var56;
                  int var60 = this.field2483[var59];
                  int var61 = arg4 + var60;
                  int var62 = (arg4 & 16711935) + (var60 & 16711935);
                  int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                  this.field2483[var59] = var61 - var63 | var63 - (var63 >>> 8);
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
      owner = "client!ld",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method617() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "ya",
      descriptor = "()V"
   )
   public final void method655() {
      if (this.field2478 == 0 && this.field2481 == this.field2477 && this.field2469 == 0 && this.field2498 == this.field2486) {
         int var1 = this.field2463.length;
         int var2 = var1 - (var1 & 7);
         int var3 = 0;

         while(var3 < var2) {
            this.field2463[var3++] = 2.1474836E9F;
            this.field2463[var3++] = 2.1474836E9F;
            this.field2463[var3++] = 2.1474836E9F;
            this.field2463[var3++] = 2.1474836E9F;
            this.field2463[var3++] = 2.1474836E9F;
            this.field2463[var3++] = 2.1474836E9F;
            this.field2463[var3++] = 2.1474836E9F;
            this.field2463[var3++] = 2.1474836E9F;
         }

         while(var3 < var1) {
            this.field2463[var3++] = 2.1474836E9F;
         }

      } else {
         int var4 = this.field2477 - this.field2478;
         int var5 = this.field2498 - this.field2469;
         int var6 = this.field2481 - var4;
         int var7 = this.field2481 * this.field2469 + this.field2478;
         int var8 = var4 >> 3;
         int var9 = var4 & 7;
         int var10 = var7 - 1;

         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var8 > 0) {
               int var12 = var8;

               do {
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  --var12;
               } while(var12 > 0);
            }

            if (var9 > 0) {
               int var13 = var9;

               do {
                  ++var10;
                  this.field2463[var10] = 2.1474836E9F;
                  --var13;
               } while(var13 > 0);
            }

            var10 += var6;
         }

      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method694(int arg0) {
      this.field2467 = arg0;
      this.field2472.method2551(true);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "()Lap;"
   )
   public final class266 method653() {
      return new class266(0, field2502[1], 1, field2502[2], 0L);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "t",
      descriptor = "()Lkf;"
   )
   public final class401 method640() {
      class182 var1 = this.method1517(Thread.currentThread());
      return var1.field2822;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(II)Lsv;"
   )
   public final class166 method620(int arg0, int arg1) {
      return this.method697(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      class182 var14 = this.method1517(Thread.currentThread());
      class448 var15 = var14.field2854;
      var15.field6860 = false;
      int var16 = arg0 - this.field2487;
      int var17 = arg3 - this.field2487;
      int var18 = arg6 - this.field2487;
      int var19 = arg1 - this.field2466;
      int var20 = arg4 - this.field2466;
      int var21 = arg7 - this.field2466;
      var15.field6856 = var16 < 0 || var16 > var15.field6851 || var17 < 0 || var17 > var15.field6851 || var18 < 0 || var18 > var15.field6851;
      int var22 = arg9 >>> 24;
      if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
         if (arg12 == 1) {
            var15.field6849 = 255 - var22;
            var15.field6852 = false;
            var15.method3512((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         } else {
            if (arg12 != 2) {
               throw new IllegalArgumentException();
            }

            var15.field6849 = 128;
            var15.field6852 = true;
            var15.method3512((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         }
      } else {
         var15.field6849 = 0;
         var15.field6852 = false;
         var15.method3512((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
      }

      var15.field6860 = true;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method642(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = new int[arg2 * arg3];
      int var6 = 0;

      for(int var7 = 0; var7 < arg3; ++var7) {
         int var8 = (arg1 + var7) * this.field2481 + arg0;

         for(int var9 = 0; var9 < arg2; ++var9) {
            var5[var6++] = this.field2483[var8 + var9];
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lqda;[Lkp;Z)Lda;"
   )
   public final class288 method598(class697 arg0, class776[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field11395;
         var5[var7] = arg1[var7].field11394;
         if (arg1[var7].field11398 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class160(this, arg0, arg1, var4, var5);
         } else {
            return new class792(this, arg0, arg1, var4, var5);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class319(this, arg0, arg1, var4, var5);
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lsv;Lip;)Lcl;"
   )
   public final class141 method609(class166 arg0, class726 arg1) {
      return new class309(this, (class672)arg0, (class5)arg1);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lfca;I)V"
   )
   public final void method641(class43 arg0, int arg1) {
      class182 var3 = this.method1517(Thread.currentThread());
      class444 var4 = arg0.field571.field216;

      for(class444 var5 = var4.field6814; var4 != var5; var5 = var5.field6814) {
         class194 var6 = (class194)var5;
         int var7 = var6.field3005 >> 12;
         int var8 = var6.field3009 >> 12;
         int var9 = var6.field3014 >> 12;
         float var10 = (float)var9 * this.field2491.field3426 + (float)var7 * this.field2491.field3421 + (float)var8 * this.field2491.field3418 + this.field2491.field3408;
         if (!(var10 < (float)this.field2488) && !(var10 > (float)var3.field2831)) {
            int var11 = (int)(((float)var9 * this.field2491.field3422 + (float)var7 * this.field2491.field3419 + (float)var8 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / (float)arg1) + this.field2492;
            int var12 = (int)(((float)var9 * this.field2491.field3420 + (float)var7 * this.field2491.field3429 + (float)var8 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / (float)arg1) + this.field2480;
            if (var11 >= this.field2478 && var11 <= this.field2477 && var12 >= this.field2469 && var12 <= this.field2498) {
               if (var10 == 0.0F) {
                  var10 = 1.0F;
               }

               this.method1524(var6, var11, var12, (int)var10, (this.field2493 * var6.field3013 >> 12) / arg1);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method643(int arg0, int arg1) {
      int var3 = this.field2481 * arg1 + arg0;
      int var4 = this.field2476 * arg1 + arg0;
      if (var3 != 0 || var4 != 0) {
         int[] var5 = this.field2483;
         float[] var6 = this.field2463;
         if (var3 < 0) {
            int var7 = var5.length + var3;
            class107.method1029(var5, -var3, var5, 0, var7);
         } else if (var3 > 0) {
            int var8 = var5.length - var3;
            class107.method1029(var5, 0, var5, var3, var8);
         }

         if (var4 < 0) {
            int var9 = var6.length + var4;
            class107.method1023(var6, -var4, var6, 0, var9);
         } else {
            if (var4 > 0) {
               int var10 = var6.length - var4;
               class107.method1023(var6, 0, var6, var4, var10);
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 < this.field2478) {
         arg2 -= this.field2478 - arg0;
         arg0 = this.field2478;
      }

      if (arg1 < this.field2469) {
         arg3 -= this.field2469 - arg1;
         arg1 = this.field2469;
      }

      if (arg0 + arg2 > this.field2477) {
         arg2 = this.field2477 - arg0;
      }

      if (arg1 + arg3 > this.field2498) {
         arg3 = this.field2498 - arg1;
      }

      if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2477 && arg1 <= this.field2498) {
         int var7 = this.field2481 - arg2;
         int var8 = this.field2481 * arg1 + arg0;
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
                     this.field2483[var24] = arg4;
                     ++var24;
                     this.field2483[var24] = arg4;
                     ++var24;
                     this.field2483[var24] = arg4;
                     ++var24;
                     this.field2483[var24] = arg4;
                     ++var24;
                     this.field2483[var24] = arg4;
                     ++var24;
                     this.field2483[var24] = arg4;
                     ++var24;
                     this.field2483[var24] = arg4;
                     ++var24;
                     this.field2483[var24] = arg4;
                     --var26;
                  } while(var26 > 0);
               }

               if (var23 > 0) {
                  int var27 = var23;

                  do {
                     ++var24;
                     this.field2483[var24] = arg4;
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
                  int var14 = this.field2483[var8];
                  int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                  this.field2483[var8++] = var10 + var15;
               }

               var8 += var7;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            for(int var16 = 0; var16 < arg3; ++var16) {
               for(int var17 = -arg2; var17 < 0; ++var17) {
                  int var18 = this.field2483[var8];
                  int var19 = arg4 + var18;
                  int var20 = (arg4 & 16711935) + (var18 & 16711935);
                  int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                  this.field2483[var8++] = var19 - var21 | var21 - (var21 >>> 8);
               }

               var8 += var7;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "I",
      descriptor = "()I"
   )
   public final int method591() {
      int var1 = this.field2482;
      this.field2482 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field8891.method1373(arg6, (byte)-54).field6934) {
            if (this.field2500 != arg6) {
               class672 var11 = (class672)this.field2489.method2544(false, (long)arg6);
               if (var11 == null) {
                  int[] var12 = this.method1528(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method1530(arg6) ? 64 : this.field2467;
                  var11 = this.method4494((byte)-92, var13, var13, var13, 0, var12);
                  this.field2489.method2545((long)arg6, 123, var11);
               }

               this.field2500 = arg6;
               this.field2501 = var11;
            }

            ((class517)this.field2501).method940(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method1523(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method581(boolean arg0) {
      class182 var2 = this.method1517(Thread.currentThread());
      var2.field2820 = arg0;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method600(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field2491.field3426 + (float)arg0 * this.field2491.field3421 + (float)arg1 * this.field2491.field3418 + this.field2491.field3408;
      if (var5 == 0.0F) {
         arg3[0] = arg3[1] = arg3[2] = -1;
      } else {
         int var6 = (int)(((float)arg2 * this.field2491.field3422 + (float)arg0 * this.field2491.field3419 + (float)arg1 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / var5);
         int var7 = (int)(((float)arg2 * this.field2491.field3420 + (float)arg0 * this.field2491.field3429 + (float)arg1 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / var5);
         arg3[0] = var6 - this.field2487;
         arg3[1] = var7 - this.field2466;
         arg3[2] = (int)var5;
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lfca;)V"
   )
   public final void method652(class43 arg0) {
      class182 var2 = this.method1517(Thread.currentThread());
      class444 var3 = arg0.field571.field216;

      for(class444 var4 = var3.field6814; var3 != var4; var4 = var4.field6814) {
         class194 var5 = (class194)var4;
         int var6 = var5.field3005 >> 12;
         int var7 = var5.field3009 >> 12;
         int var8 = var5.field3014 >> 12;
         float var9 = (float)var8 * this.field2491.field3426 + (float)var6 * this.field2491.field3421 + (float)var7 * this.field2491.field3418 + this.field2491.field3408;
         if (!(var9 < (float)this.field2488) && !(var9 > (float)var2.field2831)) {
            int var10 = (int)(((float)var8 * this.field2491.field3422 + (float)var6 * this.field2491.field3419 + (float)var7 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / var9) + this.field2492;
            int var11 = (int)(((float)var8 * this.field2491.field3420 + (float)var6 * this.field2491.field3429 + (float)var7 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / var9) + this.field2480;
            if (var10 >= this.field2478 && var10 <= this.field2477 && var11 >= this.field2469 && var11 <= this.field2498) {
               if (var9 == 0.0F) {
                  var9 = 1.0F;
               }

               this.method1524(var5, var10, var11, (int)var9, (int)((float)(this.field2493 * var5.field3013 >> 12) / var9));
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method593(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class623 {
      if (this.field2455 != null && this.field2454 != null) {
         try {
            Graphics var5 = this.field2455.getGraphics();

            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.x + arg2 <= this.field2481 && var7.y + arg3 <= this.field2486 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                  this.field2454.method1766(var7.width, var7.y + arg3, var7.x + arg2, var7.x, var7.y, var5, (byte)61, var7.height);
               }
            }

         } catch (Exception var8) {
            this.field2455.repaint();
         }
      } else {
         throw new IllegalStateException(field2502[0]);
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "f",
      descriptor = "(IIIIII)V"
   )
   public final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg2 - arg0;
      int var8 = arg3 - arg1;
      if (var8 == 0) {
         if (var7 >= 0) {
            this.method665(arg0, arg1, var7 + 1, arg4, arg5);
         } else {
            this.method665(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
         }
      } else if (var7 == 0) {
         if (var8 >= 0) {
            this.method663(arg0, arg1, var8 + 1, arg4, arg5);
         } else {
            this.method663(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
            if (arg0 < this.field2478) {
               var10 += (this.field2478 - arg0) * var12;
               arg0 = this.field2478;
            }

            if (var13 >= this.field2477) {
               var13 = this.field2477 - 1;
            }

            int var14 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
               if (arg5 == 1) {
                  int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                  int var16 = 256 - var14;

                  while(arg0 <= var13) {
                     int var17 = var10 >> 16;
                     if (var17 >= this.field2469 && var17 < this.field2498) {
                        int var18 = this.field2481 * var17 + arg0;
                        int var19 = this.field2483[var18];
                        int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                        this.field2483[var18] = var15 + var20;
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var13) {
                     int var21 = var10 >> 16;
                     if (var21 >= this.field2469 && var21 < this.field2498) {
                        int var22 = this.field2481 * var21 + arg0;
                        int var23 = this.field2483[var22];
                        int var24 = arg4 + var23;
                        int var25 = (arg4 & 16711935) + (var23 & 16711935);
                        int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                        this.field2483[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                  if (var27 >= this.field2469 && var27 < this.field2498) {
                     this.field2483[this.field2481 * var27 + arg0] = arg4;
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
            if (arg1 < this.field2469) {
               var29 += (this.field2469 - arg1) * var31;
               arg1 = this.field2469;
            }

            if (var32 >= this.field2498) {
               var32 = this.field2498 - 1;
            }

            int var33 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var33 == 255) {
               while(arg1 <= var32) {
                  int var46 = var29 >> 16;
                  if (var46 >= this.field2478 && var46 < this.field2477) {
                     this.field2483[this.field2481 * arg1 + var46] = arg4;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 1) {
               int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var35 = 256 - var33;

               while(arg1 <= var32) {
                  int var36 = var29 >> 16;
                  if (var36 >= this.field2478 && var36 < this.field2477) {
                     int var37 = this.field2481 * arg1 + var36;
                     int var38 = this.field2483[var37];
                     int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                     this.field2483[this.field2481 * arg1 + var36] = var34 + var39;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 2) {
               while(arg1 <= var32) {
                  int var40 = var29 >> 16;
                  if (var40 >= this.field2478 && var40 < this.field2477) {
                     int var41 = this.field2481 * arg1 + var40;
                     int var42 = this.field2483[var41];
                     int var43 = arg4 + var42;
                     int var44 = (arg4 & 16711935) + (var42 & 16711935);
                     int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                     this.field2483[var41] = var43 - var45 | var45 - (var45 >>> 8);
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
      owner = "client!ld",
      name = "C",
      descriptor = "()V"
   )
   private final void method1527() {
      for(int var1 = 0; var1 < this.field2468; ++var1) {
         this.field2495[var1].method1652((byte)69);
      }

      this.method701();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIZ)Ljq;"
   )
   public final class672 method630(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int[] var6 = new int[arg2 * arg3];
      int var7 = this.field2481 * arg1 + arg0;
      int var8 = this.field2481 - arg2;

      for(int var9 = 0; var9 < arg3; ++var9) {
         int var10 = arg2 * var9;

         for(int var11 = 0; var11 < arg2; ++var11) {
            var6[var10 + var11] = this.field2483[var7++];
         }

         var7 += var8;
      }

      if (arg4) {
         return new class94(this, var6, arg2, arg3);
      } else {
         return new class468(this, var6, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method703(Canvas arg0) {
      if (this.field2455 == arg0) {
         this.method579((Canvas)null);
      }

      class202 var2 = (class202)this.field2458.method3141((long)arg0.hashCode(), true);
      if (var2 != null) {
         var2.method2477(1976);
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "p",
      descriptor = "(I)[I"
   )
   public final int[] method1528(int arg0) {
      class304 var2 = this.field2472;
      class7 var3;
      synchronized(this.field2472) {
         var3 = (class7)this.field2472.method2544(false, (long)arg0 | Long.MIN_VALUE);
         if (var3 == null) {
            if (!super.field8891.method1372(-124, arg0)) {
               return null;
            }

            class453 var5 = super.field8891.method1373(arg0, (byte)-54);
            int var6 = !var5.field6933 && !this.field2474 ? this.field2467 : 64;
            var3 = new class7(arg0, var6, super.field8891.method1374(-2395, var6, true, arg0, 0.7F, var6), var5.field6927 != 1);
            this.field2472.method2545((long)arg0 | Long.MIN_VALUE, 107, var3);
         }
      }

      var3.field42 = true;
      return var3.method32();
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lnga;IIII)Lka;"
   )
   public final class91 method614(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class495(this, arg0, arg1, arg3, arg4, arg2);
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lpr;Lpr;FLpr;)Lpr;"
   )
   public final class331 method603(class331 arg0, class331 arg1, float arg2, class331 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method686(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method673() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "n",
      descriptor = "(I)I"
   )
   public final int method1529(int arg0) {
      return super.field8891.method1373(arg0, (byte)-54).field6927;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method594() {
      return false;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "l",
      descriptor = "(I)Z"
   )
   public final boolean method1530(int arg0) {
      return this.field2474 || super.field8891.method1373(arg0, (byte)-54).field6933;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method654(int arg0, class96 arg1, int arg2, int arg3) {
      class561 var5 = (class561)arg1;
      int[] var6 = var5.field8337;
      int[] var7 = var5.field8339;
      int var8;
      if (this.field2498 < var6.length + arg3) {
         var8 = this.field2498 - arg3;
      } else {
         var8 = var6.length;
      }

      int var9;
      if (this.field2469 > arg3) {
         var9 = this.field2469 - arg3;
         arg3 = this.field2469;
      } else {
         var9 = 0;
      }

      if (var8 - var9 > 0) {
         int var10 = this.field2481 * arg3;

         for(int var11 = var9; var11 < var8; ++var11) {
            int var12 = var6[var11] + arg2;
            int var13 = var7[var11];
            if (this.field2478 > var12) {
               var13 -= this.field2478 - var12;
               var12 = this.field2478;
            }

            if (this.field2477 < var12 + var13) {
               var13 = this.field2477 - var12;
            }

            int var14 = var10 + var12;

            for(int var15 = -var13; var15 < 0; ++var15) {
               this.field2483[var14++] = arg0;
            }

            var10 += this.field2481;
         }

      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "h",
      descriptor = "()V"
   )
   public final void method621() {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method676(int arg0) {
      this.field2495[arg0].method1655(-1, Thread.currentThread());
   }

   @OriginalMember(
      owner = "client!ld",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = (float)arg2 * this.field2491.field3426 + (float)arg0 * this.field2491.field3421 + (float)arg1 * this.field2491.field3418 + this.field2491.field3408;
      if (var8 < 1.0F) {
         var8 = 1.0F;
      }

      float var9 = (float)arg5 * this.field2491.field3426 + (float)arg3 * this.field2491.field3421 + (float)arg4 * this.field2491.field3418 + this.field2491.field3408;
      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      if (var8 < (float)this.field2488 && var9 < (float)this.field2488) {
         var7 |= 16;
      } else if (var8 > (float)this.field2464 && var9 > (float)this.field2464) {
         var7 |= 32;
      }

      int var10 = (int)(((float)arg2 * this.field2491.field3422 + (float)arg0 * this.field2491.field3419 + (float)arg1 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / var8);
      int var11 = (int)(((float)arg5 * this.field2491.field3422 + (float)arg3 * this.field2491.field3419 + (float)arg4 * this.field2491.field3427 + this.field2491.field3428) * (float)this.field2493 / var9);
      if (var10 < this.field2487 && var11 < this.field2487) {
         var7 |= 1;
      } else if (var10 > this.field2473 && var11 > this.field2473) {
         var7 |= 2;
      }

      int var12 = (int)(((float)arg2 * this.field2491.field3420 + (float)arg0 * this.field2491.field3429 + (float)arg1 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / var8);
      int var13 = (int)(((float)arg5 * this.field2491.field3420 + (float)arg3 * this.field2491.field3429 + (float)arg4 * this.field2491.field3410 + this.field2491.field3430) * (float)this.field2499 / var9);
      if (var12 < this.field2466 && var13 < this.field2466) {
         var7 |= 4;
      } else if (var12 > this.field2479 && var13 > this.field2479) {
         var7 |= 8;
      }

      return var7;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "pa",
      descriptor = "()V"
   )
   public final void method666() {
      for(int var1 = 0; var1 < this.field2495.length; ++var1) {
         this.field2495[var1].field2823 = this.field2495[var1].field2828;
         this.field2495[var1].field2818 = false;
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "q",
      descriptor = "()V"
   )
   public final void method646() {
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      class182 var8 = this.method1517(Thread.currentThread());
      class448 var9 = var8.field2854;
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
         int var23 = arg0 - var9.method3522();
         int var24 = arg1 - var9.method3524();
         int var25 = var19 + var23;
         int var26 = var23 - var20;
         int var27 = var17 + var23 - var20;
         int var28 = var17 + var23 + var19;
         int var29 = var21 + var24;
         int var30 = var24 - var22;
         int var31 = var18 + var24 - var22;
         int var32 = var18 + var24 + var21;
         if (arg6 == 0) {
            var9.field6849 = 0;
         } else {
            if (arg6 != 1) {
               throw new IllegalArgumentException();
            }

            var9.field6849 = 255 - (arg4 >>> 24);
         }

         this.method581(false);
         var9.field6856 = var25 < 0 || var25 > var9.field6851 || var26 < 0 || var26 > var9.field6851 || var27 < 0 || var27 > var9.field6851;
         var9.method3514((float)var29, (float)var30, (float)var31, (float)var25, (float)var26, (float)var27, 100.0F, 100.0F, 100.0F, arg4);
         var9.field6856 = var25 < 0 || var25 > var9.field6851 || var27 < 0 || var27 > var9.field6851 || var28 < 0 || var28 > var9.field6851;
         var9.method3514((float)var29, (float)var31, (float)var32, (float)var25, (float)var27, (float)var28, 100.0F, 100.0F, 100.0F, arg4);
         this.method581(true);
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method685(int arg0) {
      this.field2468 = arg0;
      this.field2495 = new class182[this.field2468];

      for(int var2 = 0; var2 < this.field2468; ++var2) {
         this.field2495[var2] = new class182(this);
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method627(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field2495.length; ++var4) {
         class182 var5 = this.field2495[var4];
         var5.field2823 = arg0 & 16777215;
         int var6 = var5.field2823 >>> 16 & 255;
         if (var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.field2823 >> 8 & 255;
         if (var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.field2823 & 255;
         if (var8 < 2) {
            var8 = 2;
         }

         var5.field2823 = var6 << 16 | var7 << 8 | var8;
         if (arg1 < 0) {
            var5.field2824 = false;
         } else {
            var5.field2824 = true;
         }
      }

   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1531(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1532(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
