import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class663 extends class293 {
   @OriginalMember(
      owner = "client!tda",
      name = "o",
      descriptor = "Lum;"
   )
   private class550 field9626;
   @OriginalMember(
      owner = "client!tda",
      name = "H",
      descriptor = "Lck;"
   )
   public class667 field9632;
   @OriginalMember(
      owner = "client!tda",
      name = "n",
      descriptor = "I"
   )
   private int field9617;
   @OriginalMember(
      owner = "client!tda",
      name = "fb",
      descriptor = "[[F"
   )
   private float[][] field9641;
   @OriginalMember(
      owner = "client!tda",
      name = "s",
      descriptor = "[[[Lte;"
   )
   private class639[][][] field9633;
   @OriginalMember(
      owner = "client!tda",
      name = "X",
      descriptor = "[[[I"
   )
   public int[][][] field9622;
   @OriginalMember(
      owner = "client!tda",
      name = "l",
      descriptor = "I"
   )
   private int field9604;
   @OriginalMember(
      owner = "client!tda",
      name = "A",
      descriptor = "I"
   )
   public int field9607;
   @OriginalMember(
      owner = "client!tda",
      name = "W",
      descriptor = "[[[I"
   )
   public int[][][] field9616;
   @OriginalMember(
      owner = "client!tda",
      name = "I",
      descriptor = "[[[I"
   )
   private int[][][] field9601;
   @OriginalMember(
      owner = "client!tda",
      name = "k",
      descriptor = "[[B"
   )
   private byte[][] field9611;
   @OriginalMember(
      owner = "client!tda",
      name = "q",
      descriptor = "[[F"
   )
   private float[][] field9647;
   @OriginalMember(
      owner = "client!tda",
      name = "Q",
      descriptor = "[[[I"
   )
   public int[][][] field9608;
   @OriginalMember(
      owner = "client!tda",
      name = "cb",
      descriptor = "[[[I"
   )
   private int[][][] field9635;
   @OriginalMember(
      owner = "client!tda",
      name = "N",
      descriptor = "[[F"
   )
   private float[][] field9648;
   @OriginalMember(
      owner = "client!tda",
      name = "G",
      descriptor = "[[B"
   )
   private byte[][] field9639;
   @OriginalMember(
      owner = "client!tda",
      name = "J",
      descriptor = "[[S"
   )
   public short[][] field9620;
   @OriginalMember(
      owner = "client!tda",
      name = "K",
      descriptor = "Lwia;"
   )
   private class791 field9640;
   @OriginalMember(
      owner = "client!tda",
      name = "V",
      descriptor = "Lhc;"
   )
   private class150 field9627;
   @OriginalMember(
      owner = "client!tda",
      name = "lb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9652 = new String[]{method4760(method4759("q4mk'dx")), method4760(method4759("k%`)")), method4760(method4759("q4mk*dx")), method4760(method4759("~~\"k1")), method4760(method4759("q4mk;dx")), method4760(method4759("q4mk\u0006-")), method4760(method4759("q4mk\u0015Dx")), method4760(method4759("q4mk\n-")), method4760(method4759("q4mk\u0007-")), method4760(method4759("q4mk\u000e-")), method4760(method4759("q4mk\u0005-")), method4760(method4759("q4mk\u0004-")), method4760(method4759("q4mk\u000b-")), method4760(method4759("q4mk\u000fDx")), method4760(method4759("q4mk\u000f-")), method4760(method4759("q4mk\u0019-")), method4760(method4759("q4mk\t-")), method4760(method4759("q4mk\r-")), method4760(method4759("q4mk\b-")), method4760(method4759("q4mkpl>e1r-"))};
   @OriginalMember(
      owner = "client!tda",
      name = "Z",
      descriptor = "I"
   )
   public static int field9630 = 503;
   @OriginalMember(
      owner = "client!tda",
      name = "P",
      descriptor = "Lce;"
   )
   public static class324 field9636 = new class324(method4760(method4759("W\u0013")), 1);
   @OriginalMember(
      owner = "client!tda",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field9637 = new int[1000];
   @OriginalMember(
      owner = "client!tda",
      name = "hb",
      descriptor = "I"
   )
   public static int field9644 = 2;
   @OriginalMember(
      owner = "client!tda",
      name = "ab",
      descriptor = "I"
   )
   public static int field9599;
   @OriginalMember(
      owner = "client!tda",
      name = "t",
      descriptor = "I"
   )
   public static int field9600;
   @OriginalMember(
      owner = "client!tda",
      name = "S",
      descriptor = "I"
   )
   public static int field9602;
   @OriginalMember(
      owner = "client!tda",
      name = "ib",
      descriptor = "I"
   )
   public static int field9603;
   @OriginalMember(
      owner = "client!tda",
      name = "y",
      descriptor = "I"
   )
   public static int field9606;
   @OriginalMember(
      owner = "client!tda",
      name = "M",
      descriptor = "I"
   )
   public static int field9612;
   @OriginalMember(
      owner = "client!tda",
      name = "jb",
      descriptor = "I"
   )
   private int field9613;
   @OriginalMember(
      owner = "client!tda",
      name = "U",
      descriptor = "I"
   )
   public static int field9614;
   @OriginalMember(
      owner = "client!tda",
      name = "db",
      descriptor = "I"
   )
   public static int field9615;
   @OriginalMember(
      owner = "client!tda",
      name = "F",
      descriptor = "I"
   )
   public static int field9618;
   @OriginalMember(
      owner = "client!tda",
      name = "E",
      descriptor = "I"
   )
   public static int field9619;
   @OriginalMember(
      owner = "client!tda",
      name = "O",
      descriptor = "I"
   )
   public static int field9621;
   @OriginalMember(
      owner = "client!tda",
      name = "bb",
      descriptor = "I"
   )
   public static int field9623;
   @OriginalMember(
      owner = "client!tda",
      name = "m",
      descriptor = "I"
   )
   public static int field9624;
   @OriginalMember(
      owner = "client!tda",
      name = "Y",
      descriptor = "I"
   )
   private int field9625;
   @OriginalMember(
      owner = "client!tda",
      name = "T",
      descriptor = "I"
   )
   public static int field9628;
   @OriginalMember(
      owner = "client!tda",
      name = "v",
      descriptor = "I"
   )
   public static int field9629;
   @OriginalMember(
      owner = "client!tda",
      name = "L",
      descriptor = "I"
   )
   public static int field9631;
   @OriginalMember(
      owner = "client!tda",
      name = "B",
      descriptor = "I"
   )
   private int field9645;
   @OriginalMember(
      owner = "client!tda",
      name = "w",
      descriptor = "I"
   )
   private int field9646;
   @OriginalMember(
      owner = "client!tda",
      name = "kb",
      descriptor = "Lrr;"
   )
   public class380 field9642;
   @OriginalMember(
      owner = "client!tda",
      name = "x",
      descriptor = "Lrr;"
   )
   private class380 field9643;
   @OriginalMember(
      owner = "client!tda",
      name = "u",
      descriptor = "Lrr;"
   )
   public class380 field9650;
   @OriginalMember(
      owner = "client!tda",
      name = "eb",
      descriptor = "Lrr;"
   )
   public class380 field9651;
   @OriginalMember(
      owner = "client!tda",
      name = "r",
      descriptor = "Lgka;"
   )
   private class390 field9638;
   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "Ldk;"
   )
   public static class536 field9634;
   @OriginalMember(
      owner = "client!tda",
      name = "p",
      descriptor = "Lwba;"
   )
   public static class55 field9609;
   @OriginalMember(
      owner = "client!tda",
      name = "C",
      descriptor = "Lwm;"
   )
   public static class590 field9605;
   @OriginalMember(
      owner = "client!tda",
      name = "gb",
      descriptor = "[Lte;"
   )
   private class639[] field9649;
   @OriginalMember(
      owner = "client!tda",
      name = "R",
      descriptor = "[[[I"
   )
   private int[][][] field9610;

   @OriginalMember(
      owner = "client!tda",
      name = "ka",
      descriptor = "(III)V",
      line = 4
   )
   public final void method789(int arg0, int arg1, int arg2) {
      try {
         ++field9600;
         if (~(this.field9639[arg0][arg1] & 255) > ~arg2) {
            this.field9639[arg0][arg1] = (byte)arg2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9652[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V",
      line = 14
   )
   public final void method787(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field9629;
         if (this.field9627 != null && arg0 != null) {
            int var7 = -(this.field9632.field9953 * arg2 >> 8) + arg1 >> this.field9632.field9903;
            int var8 = -(this.field9632.field9977 * arg2 >> 8) + arg3 >> this.field9632.field9903;
            this.field9627.method1234(var8, (byte)-2, arg0, var7);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field9652[4] + (arg0 != null ? field9652[3] : field9652[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V",
      line = 36
   )
   public final void method775(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field9618;
         if (this.field9627 != null && arg0 != null) {
            int var7 = -(this.field9632.field9953 * arg2 >> 8) + arg1 >> this.field9632.field9903;
            int var8 = -(this.field9632.field9977 * arg2 >> 8) + arg3 >> this.field9632.field9903;
            this.field9627.method1236(var8, false, var7, arg0);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field9652[13] + (arg0 != null ? field9652[3] : field9652[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "YA",
      descriptor = "()V",
      line = 54
   )
   public final void method781() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z",
      line = 633
   )
   public final boolean method770(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field9619;
         if (this.field9627 != null && arg0 != null) {
            int var7 = arg1 - (this.field9632.field9953 * arg2 >> 8) >> this.field9632.field9903;
            int var8 = arg3 - (this.field9632.field9977 * arg2 >> 8) >> this.field9632.field9903;
            return this.field9627.method1232(arg0, var7, 0, var8);
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field9652[9] + (arg0 != null ? field9652[3] : field9652[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V",
      line = 653
   )
   public final void method786(int param1, int param2, int[] param3, int[] param4, int[] param5, int[] param6, int[] param7, int[] param8, int[] param9, int[] param10, int param11, int param12, int param13, boolean param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(Ljava/io/File;B)[B",
      line = 739
   )
   public static final byte[] method4755(File arg0, byte arg1) {
      try {
         ++field9624;
         int var2 = 95 % ((arg1 - -20) / 41);
         return class753.method5482((int)arg0.length(), arg0, 0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9652[8] + (arg0 != null ? field9652[3] : field9652[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(II)V",
      line = 749
   )
   public final void method790(int arg0, int arg1) {
      try {
         ++field9603;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9652[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "<init>",
      descriptor = "(Lck;IIII[[I[[II)V",
      line = 760
   )
   public class663(class667 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      int var9 = client.field4530;
      super(arg3, arg4, arg7, arg5);
      this.field9626 = new class550();

      try {
         this.field9632 = arg0;
         this.field9617 = super.field4086 + -2;
         this.field9641 = new float[super.field4087 + 1][super.field4081 + 1];
         this.field9633 = new class639[arg3][arg4][];
         this.field9622 = new int[arg3][arg4][];
         this.field9604 = 1 << this.field9617;
         this.field9607 = arg2;
         this.field9616 = new int[arg3][arg4][];
         this.field9601 = new int[arg3][arg4][];
         this.field9611 = new byte[arg3][arg4];
         this.field9647 = new float[super.field4087 + 1][super.field4081 + 1];
         this.field9608 = new int[arg3][arg4][];
         this.field9635 = new int[arg3][arg4][];
         this.field9648 = new float[super.field4087 + 1][super.field4081 + 1];
         this.field9639 = new byte[arg3 + 1][arg4 + 1];
         this.field9620 = new short[arg3 * arg4][];
         int var10 = 1;
         int var10000;
         if (var9 != 0) {
            var10000 = 1;
         } else if (~super.field4081 >= ~var10) {
            this.field9640 = new class791(128);
            var10000 = ~(16 & this.field9607);
            if (var9 == 0) {
               if (var10000 != -1) {
                  this.field9627 = new class150(this.field9632, this);
                  return;
               }

               return;
            }
         } else {
            var10000 = 1;
         }

         while(true) {
            int var11 = var10000;
            if (var9 != 0 || ~super.field4087 < ~var11) {
               do {
                  int var12 = arg6[var11 - -1][var10] + -arg6[var11 - 1][var10];
                  int var13 = arg6[var11][var10 + 1] + -arg6[var11][var10 + -1];
                  float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 - (-(arg7 * arg7 * 4) - var13 * var13))));
                  this.field9647[var11][var10] = (float)var12 * var14;
                  this.field9648[var11][var10] = (float)(-arg7 * 2) * var14;
                  this.field9641[var11][var10] = (float)var13 * var14;
                  ++var11;
               } while(~super.field4087 < ~var11);
            }

            ++var10;
            if (~super.field4081 >= ~var10) {
               this.field9640 = new class791(128);
               var10000 = ~(16 & this.field9607);
               if (var9 == 0) {
                  if (var10000 != -1) {
                     this.field9627 = new class150(this.field9632, this);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 1;
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field9652[19] + (arg0 != null ? field9652[3] : field9652[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9652[3] : field9652[1]) + ',' + (arg6 != null ? field9652[3] : field9652[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(III[[ZZII)V",
      line = 823
   )
   public final void method780(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      try {
         this.method4756(arg3, (byte)123, arg1, arg4, arg5, arg6, arg2, arg0);
         ++field9623;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9652[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9652[3] : field9652[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V",
      line = 836
   )
   public final void method777(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      int var18 = client.field4530;

      try {
         ++field9621;
         int var19 = arg9.length;
         int[] var20 = new int[var19 * 3];
         int[] var21 = new int[var19 * 3];
         int[] var22 = new int[var19 * 3];
         int[] var23 = new int[var19 * 3];
         int[] var24 = new int[var19 * 3];
         int[] var25 = new int[var19 * 3];
         int[] var26 = arg3 != null ? new int[var19 * 3] : null;
         int[] var27 = arg5 != null ? new int[var19 * 3] : null;
         int var28 = 0;
         int var29 = 0;
         if (var18 == 0 && var29 >= var19) {
            this.method786(arg0, arg1, var20, var26, var21, var27, var22, var23, var24, var25, arg13, arg14, arg15, arg16);
         } else {
            do {
               int var30 = arg6[var29];
               int var31 = arg7[var29];
               int var32 = arg8[var29];
               var20[var28] = arg2[var30];
               var21[var28] = arg4[var30];
               var22[var28] = arg9[var29];
               var24[var28] = arg11[var29];
               var25[var28] = arg12[var29];
               var23[var28] = arg10 == null ? arg9[var29] : arg10[var29];
               if (arg3 != null) {
                  var26[var28] = arg3[var30];
               }

               if (arg5 != null) {
                  var27[var28] = arg5[var30];
               }

               ++var28;
               var20[var28] = arg2[var31];
               var21[var28] = arg4[var31];
               var22[var28] = arg9[var29];
               var24[var28] = arg11[var29];
               var25[var28] = arg12[var29];
               var23[var28] = arg10 != null ? arg10[var29] : arg9[var29];
               if (arg3 != null) {
                  var26[var28] = arg3[var31];
               }

               if (arg5 != null) {
                  var27[var28] = arg5[var31];
               }

               ++var28;
               var20[var28] = arg2[var32];
               var21[var28] = arg4[var32];
               var22[var28] = arg9[var29];
               var24[var28] = arg11[var29];
               var25[var28] = arg12[var29];
               var23[var28] = arg10 != null ? arg10[var29] : arg9[var29];
               if (arg3 != null) {
                  var26[var28] = arg3[var32];
               }

               if (arg5 != null) {
                  var27[var28] = arg5[var32];
               }

               ++var28;
               ++var29;
            } while(var29 < var19);

            this.method786(arg0, arg1, var20, var26, var21, var27, var22, var23, var24, var25, arg13, arg14, arg15, arg16);
         }
      } catch (RuntimeException var34) {
         throw class670.method4877(var34, field9652[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9652[3] : field9652[1]) + ',' + (arg3 != null ? field9652[3] : field9652[1]) + ',' + (arg4 != null ? field9652[3] : field9652[1]) + ',' + (arg5 != null ? field9652[3] : field9652[1]) + ',' + (arg6 != null ? field9652[3] : field9652[1]) + ',' + (arg7 != null ? field9652[3] : field9652[1]) + ',' + (arg8 != null ? field9652[3] : field9652[1]) + ',' + (arg9 != null ? field9652[3] : field9652[1]) + ',' + (arg10 != null ? field9652[3] : field9652[1]) + ',' + (arg11 != null ? field9652[3] : field9652[1]) + ',' + (arg12 != null ? field9652[3] : field9652[1]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(Llja;[I)V",
      line = 920
   )
   public final void method776(class744 arg0, int[] arg1) {
      try {
         this.field9626.method4060(23, new class181(this.field9632, this, arg0, arg1));
         ++field9615;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9652[12] + (arg0 != null ? field9652[3] : field9652[1]) + ',' + (arg1 != null ? field9652[3] : field9652[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "fa",
      descriptor = "(IILr;)Lr;",
      line = 930
   )
   public final class193 method779(int arg0, int arg1, class193 arg2) {
      try {
         ++field9614;
         if (~(this.field9611[arg0][arg1] & 1) == -1) {
            return null;
         } else {
            int var4;
            class290 var6;
            label27: {
               var4 = super.field4080 >> this.field9632.field9903;
               class290 var5 = (class290)arg2;
               if (var5 != null && var5.method2207(var4, var4, 19280)) {
                  var6 = var5;
                  var5.method2206((byte)103);
                  if (client.field4530 == 0) {
                     break label27;
                  }
               }

               var6 = new class290(this.field9632, var4, var4);
            }

            var6.method2205(0, 0, var4, var4, true);
            this.method4758(arg0, 104, arg1, var6);
            return var6;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9652[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9652[3] : field9652[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "([[ZBIZIIII)V",
      line = 959
   )
   private final void method4756(boolean[][] arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
      int var9 = client.field4530;

      try {
         ++field9628;
         if (arg1 <= 122) {
            method4757(-103);
         }

         if (this.field9649 != null) {
            int var10 = arg6 - -1 + arg6;
            int var11 = var10 * var10;
            if (var11 > this.field9632.field10049.length) {
               this.field9632.field10049 = new int[var11];
            }

            if (this.field9632.field10021.field1552.length < this.field9613 * 2) {
               this.field9632.field10021 = new class764(this.field9613 * 2);
            }

            int var12 = -arg6 + arg7;
            int var13 = var12;
            if (var12 < 0) {
               var12 = 0;
            }

            int var14 = -arg6 + arg2;
            int var15 = var14;
            if (var14 < 0) {
               var14 = 0;
            }

            int var16 = arg6 + arg7;
            if (var16 > super.field4087 + -1) {
               var16 = super.field4087 + -1;
            }

            int var17 = arg2 + arg6;
            if (~(super.field4081 - 1) > ~var17) {
               var17 = super.field4081 + -1;
            }

            int var18 = 0;
            int[] var19 = this.field9632.field10049;
            int var20 = var12;
            if (var9 != 0 || ~var12 >= ~var16) {
               do {
                  boolean[] var21 = arg0[var20 - var13];
                  int var22 = var14;
                  if (var9 != 0) {
                     if (var21[var14 - var15]) {
                        var19[var18++] = super.field4087 * var14 + var20;
                     }

                     var22 = var14 + 1;
                  }

                  while(true) {
                     while(var17 >= var22) {
                        if (var21[var22 - var15]) {
                           var19[var18++] = super.field4087 * var22 + var20;
                        }

                        ++var22;
                     }

                     if (var9 == 0) {
                        ++var20;
                        break;
                     }

                     ++var22;
                  }
               } while(~var20 >= ~var16);
            }

            label100: {
               if (arg4 != -1) {
                  this.field9632.method4800((float)arg4, -4);
                  this.field9632.method4787((byte)-116);
                  if (var9 == 0) {
                     break label100;
                  }
               }

               this.field9632.method4820(false);
            }

            this.field9632.method4822(9, (this.field9607 & 7) != 0);
            int var23 = 0;
            if (var9 != 0) {
               this.field9649[var23].method4602((byte)56, var19, var18);
               ++var23;
            }

            while(true) {
               class663 var10000;
               if (var23 >= this.field9649.length) {
                  var10000 = this;
                  if (var9 == 0) {
                     if (!this.field9626.method4068(false)) {
                        int var24 = this.field9632.field10028;
                        int var25 = this.field9632.field10031;
                        this.field9632.method540(0, var25, this.field9632.field9992);
                        this.field9632.method4822(48, false);
                        this.field9632.method4811(-32, false);
                        this.field9632.method4854(-3, 128);
                        this.field9632.method4840(-2, (byte)125);
                        this.field9632.method4818((byte)-109, this.field9632.field10004);
                        this.field9632.method4849(7681, 34161, 8448);
                        this.field9632.method4814(7681, 0, 34166, 770);
                        this.field9632.method4823(34167, 0, 770, (byte)63);
                        class347 var26 = this.field9626.method4071((byte)126);
                        class181 var27;
                        if (var9 != 0) {
                           var27 = (class181)var26;
                           var27.method1423(arg0, arg6, arg2, arg7, -120);
                           var26 = this.field9626.method4059((byte)113);
                        }

                        while(true) {
                           if (var26 == null) {
                              this.field9632.method4814(7681, 0, 5890, 768);
                              this.field9632.method4823(5890, 0, 770, (byte)105);
                              this.field9632.method4818((byte)-106, (class689)null);
                              this.field9632.method540(var24, var25, this.field9632.field9992);
                              break;
                           }

                           var27 = (class181)var26;
                           var27.method1423(arg0, arg6, arg2, arg7, -120);
                           var26 = this.field9626.method4059((byte)113);
                        }
                     }

                     if (this.field9627 != null) {
                        OpenGL.glPushMatrix();
                        OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                        this.field9632.method4847(this.field9650, 113, this.field9651, (class380)null, (class380)null);
                        this.field9627.method1230(arg6, arg2, arg0, 0, arg7, arg3);
                        OpenGL.glPopMatrix();
                        return;
                     }
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field9649[var23].method4602((byte)56, var19, var18);
               ++var23;
            }
         }

      } catch (RuntimeException var29) {
         throw class670.method4877(var29, field9652[11] + (arg0 != null ? field9652[3] : field9652[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "(I)V",
      line = 1106
   )
   public static void method4757(int arg0) {
      try {
         field9634 = null;
         field9605 = null;
         field9637 = null;
         field9636 = null;
         if (arg0 != -578913695) {
            method4755((File)null, (byte)109);
         }

         field9609 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9652[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(III[[ZZI)V",
      line = 1127
   )
   public final void method784(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      try {
         ++field9599;
         this.method4756(arg3, (byte)124, arg1, arg4, -1, arg5, arg2, arg0);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9652[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9652[3] : field9652[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(IIILgf;)V",
      line = 1137
   )
   private final void method4758(int arg0, int arg1, int arg2, class290 arg3) {
      int var5 = client.field4530;

      try {
         ++field9602;
         if (arg1 <= 95) {
            this.method775((class193)null, 116, -100, 33, -81, true);
         }

         int[] var6 = this.field9622[arg0][arg2];
         int[] var7 = this.field9616[arg0][arg2];
         int var8 = var6.length;
         if (~this.field9632.field10050.length > ~var8) {
            this.field9632.field10050 = new int[var8];
            this.field9632.field10048 = new int[var8];
         }

         int[] var9 = this.field9632.field10050;
         int[] var10 = this.field9632.field10048;
         int var11 = 0;
         if (var5 != 0) {
            var9[var11] = var6[var11] >> this.field9632.field9903;
            var10[var11] = var7[var11] >> this.field9632.field9903;
            ++var11;
         }

         while(true) {
            while(var11 < var8) {
               var9[var11] = var6[var11] >> this.field9632.field9903;
               var10[var11] = var7[var11] >> this.field9632.field9903;
               ++var11;
            }

            int var12 = 0;
            if (var5 == 0) {
               if (var5 == 0 && ~var12 <= ~var8) {
                  return;
               } else {
                  do {
                     int var13 = var9[var12];
                     int var14 = var10[var12++];
                     int var15 = var9[var12];
                     int var16 = var10[var12++];
                     int var17 = var9[var12];
                     int var18 = var10[var12++];

                     while((-var15 + var13) * (-var18 + var16) - (-var14 + var16) * (-var15 + var17) > 0) {
                        if (var5 == 0) {
                           arg3.method2208(var15, (byte)126, var13, var16, var17, var14, var18);
                           break;
                        }
                     }
                  } while(~var12 > ~var8);

                  return;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field9652[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9652[3] : field9652[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(IIIIIII[[Z)V",
      line = 1203
   )
   public final void method778(int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean[][] param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4759(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4760(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
