import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class469 extends class295 {
   @OriginalMember(
      owner = "client!vj",
      name = "eb",
      descriptor = "Lod;"
   )
   private class536 field6485;
   @OriginalMember(
      owner = "client!vj",
      name = "K",
      descriptor = "Lor;"
   )
   public class670 field6483;
   @OriginalMember(
      owner = "client!vj",
      name = "F",
      descriptor = "I"
   )
   private int field6461;
   @OriginalMember(
      owner = "client!vj",
      name = "S",
      descriptor = "[[[I"
   )
   public int[][][] field6478;
   @OriginalMember(
      owner = "client!vj",
      name = "v",
      descriptor = "[[F"
   )
   private float[][] field6498;
   @OriginalMember(
      owner = "client!vj",
      name = "E",
      descriptor = "[[[I"
   )
   public int[][][] field6484;
   @OriginalMember(
      owner = "client!vj",
      name = "bb",
      descriptor = "[[F"
   )
   private float[][] field6504;
   @OriginalMember(
      owner = "client!vj",
      name = "N",
      descriptor = "[[B"
   )
   private byte[][] field6501;
   @OriginalMember(
      owner = "client!vj",
      name = "M",
      descriptor = "[[S"
   )
   public short[][] field6470;
   @OriginalMember(
      owner = "client!vj",
      name = "R",
      descriptor = "[[B"
   )
   private byte[][] field6482;
   @OriginalMember(
      owner = "client!vj",
      name = "db",
      descriptor = "[[[I"
   )
   private int[][][] field6476;
   @OriginalMember(
      owner = "client!vj",
      name = "i",
      descriptor = "[[[I"
   )
   private int[][][] field6474;
   @OriginalMember(
      owner = "client!vj",
      name = "W",
      descriptor = "[[[Ljc;"
   )
   private class467[][][] field6467;
   @OriginalMember(
      owner = "client!vj",
      name = "V",
      descriptor = "[[[I"
   )
   public int[][][] field6472;
   @OriginalMember(
      owner = "client!vj",
      name = "r",
      descriptor = "I"
   )
   public int field6489;
   @OriginalMember(
      owner = "client!vj",
      name = "q",
      descriptor = "[[F"
   )
   private float[][] field6505;
   @OriginalMember(
      owner = "client!vj",
      name = "O",
      descriptor = "I"
   )
   private int field6458;
   @OriginalMember(
      owner = "client!vj",
      name = "X",
      descriptor = "Ldia;"
   )
   private class245 field6506;
   @OriginalMember(
      owner = "client!vj",
      name = "H",
      descriptor = "Lrba;"
   )
   private class460 field6471;
   @OriginalMember(
      owner = "client!vj",
      name = "fb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6507 = new String[]{method3442(method3441("\u0001\u0005-\u001e7")), method3442(method3441("\u0014^o\\")), method3442(method3441("\fA-qb")), method3442(method3441("\fA-s\u000bR")), method3442(method3441("\fA-i\u000bR")), method3442(method3441("\fA-\f#\u0014Bw\u000eb")), method3442(method3441("\fA-ub")), method3442(method3441("\fA-V+R")), method3442(method3441("\fA-rb")), method3442(method3441("\fA-~b")), method3442(method3441("\fA-G+R")), method3442(method3441("\fA-vb")), method3442(method3441("\fA-eb")), method3442(method3441("\fA-sb")), method3442(method3441("\fA-xb")), method3442(method3441("\fA-[+R")), method3442(method3441("\fA-yb")), method3442(method3441("\fA-zb")), method3442(method3441("\fA-tb"))};
   @OriginalMember(
      owner = "client!vj",
      name = "o",
      descriptor = "Lnw;"
   )
   public static class616 field6490 = new class616(46, 2);
   @OriginalMember(
      owner = "client!vj",
      name = "C",
      descriptor = "I"
   )
   public static int field6500 = -60;
   @OriginalMember(
      owner = "client!vj",
      name = "p",
      descriptor = "Lnw;"
   )
   public static class616 field6497 = new class616(59, 7);
   @OriginalMember(
      owner = "client!vj",
      name = "w",
      descriptor = "I"
   )
   public static int field6459;
   @OriginalMember(
      owner = "client!vj",
      name = "j",
      descriptor = "I"
   )
   private int field6460;
   @OriginalMember(
      owner = "client!vj",
      name = "U",
      descriptor = "I"
   )
   public static int field6462;
   @OriginalMember(
      owner = "client!vj",
      name = "s",
      descriptor = "I"
   )
   public static int field6463;
   @OriginalMember(
      owner = "client!vj",
      name = "k",
      descriptor = "I"
   )
   public static int field6465;
   @OriginalMember(
      owner = "client!vj",
      name = "n",
      descriptor = "I"
   )
   public static int field6466;
   @OriginalMember(
      owner = "client!vj",
      name = "G",
      descriptor = "I"
   )
   public static int field6468;
   @OriginalMember(
      owner = "client!vj",
      name = "l",
      descriptor = "I"
   )
   public static int field6469;
   @OriginalMember(
      owner = "client!vj",
      name = "B",
      descriptor = "I"
   )
   public static int field6473;
   @OriginalMember(
      owner = "client!vj",
      name = "y",
      descriptor = "I"
   )
   public static int field6475;
   @OriginalMember(
      owner = "client!vj",
      name = "P",
      descriptor = "I"
   )
   public static int field6477;
   @OriginalMember(
      owner = "client!vj",
      name = "ab",
      descriptor = "I"
   )
   public static int field6479;
   @OriginalMember(
      owner = "client!vj",
      name = "L",
      descriptor = "I"
   )
   public static int field6480;
   @OriginalMember(
      owner = "client!vj",
      name = "t",
      descriptor = "I"
   )
   public static int field6481;
   @OriginalMember(
      owner = "client!vj",
      name = "cb",
      descriptor = "I"
   )
   private int field6486;
   @OriginalMember(
      owner = "client!vj",
      name = "u",
      descriptor = "I"
   )
   public static int field6487;
   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "I"
   )
   public static int field6488;
   @OriginalMember(
      owner = "client!vj",
      name = "D",
      descriptor = "I"
   )
   private int field6493;
   @OriginalMember(
      owner = "client!vj",
      name = "x",
      descriptor = "I"
   )
   private int field6496;
   @OriginalMember(
      owner = "client!vj",
      name = "Y",
      descriptor = "Lwq;"
   )
   public class178 field6492;
   @OriginalMember(
      owner = "client!vj",
      name = "I",
      descriptor = "Lwq;"
   )
   private class178 field6494;
   @OriginalMember(
      owner = "client!vj",
      name = "m",
      descriptor = "Lwq;"
   )
   public class178 field6502;
   @OriginalMember(
      owner = "client!vj",
      name = "A",
      descriptor = "Lwq;"
   )
   public class178 field6503;
   @OriginalMember(
      owner = "client!vj",
      name = "J",
      descriptor = "Lei;"
   )
   private class189 field6495;
   @OriginalMember(
      owner = "client!vj",
      name = "Z",
      descriptor = "Ldha;"
   )
   public static class84 field6491;
   @OriginalMember(
      owner = "client!vj",
      name = "T",
      descriptor = "[Ljc;"
   )
   private class467[] field6499;
   @OriginalMember(
      owner = "client!vj",
      name = "Q",
      descriptor = "[[[I"
   )
   private int[][][] field6464;

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3438(byte arg0) {
      try {
         field6490 = null;
         if (arg0 == -46) {
            field6497 = null;
            field6491 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6507[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public final void method1685(int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean[][] param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1671(int arg0, int arg1) {
      try {
         ++field6480;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6507[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public final boolean method1677(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field6487;
         if (this.field6471 != null && arg0 != null) {
            int var7 = -(this.field6483.field9751 * arg2 >> 8) + arg1 >> this.field6483.field9709;
            int var8 = arg3 - (this.field6483.field9796 * arg2 >> 8) >> this.field6483.field9709;
            return this.field6471.method3390(var8, arg0, true, var7);
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6507[18] + (arg0 != null ? field6507[0] : field6507[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public final class194 method1678(int arg0, int arg1, class194 arg2) {
      try {
         ++field6473;
         if (~(this.field6482[arg0][arg1] & 1) == -1) {
            return null;
         } else {
            int var4;
            class132 var6;
            label38: {
               var4 = super.field3869 >> this.field6483.field9709;
               class132 var5 = (class132)arg2;
               if (var5 == null || !var5.method1112(var4, var4, (byte)124)) {
                  var6 = new class132(this.field6483, var4, var4);
                  if (!client.field4273) {
                     break label38;
                  }
               }

               var6 = var5;
               var5.method1108((byte)93);
            }

            var6.method1114(var4, 0, 32409, var4, 0);
            this.method3440(arg1, (byte)-63, var6, arg0);
            return var6;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6507[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6507[0] : field6507[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(Loda;[I)V"
   )
   public final void method1676(class127 arg0, int[] arg1) {
      try {
         this.field6485.method3859(2, new class439(this.field6483, this, arg0, arg1));
         ++field6468;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6507[17] + (arg0 != null ? field6507[0] : field6507[1]) + ',' + (arg1 != null ? field6507[0] : field6507[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method1669(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field6459;
         if (this.field6471 != null && arg0 != null) {
            int var7 = -(this.field6483.field9751 * arg2 >> 8) + arg1 >> this.field6483.field9709;
            int var8 = -(this.field6483.field9796 * arg2 >> 8) + arg3 >> this.field6483.field9709;
            this.field6471.method3386(arg0, var8, var7, (byte)-50);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6507[10] + (arg0 != null ? field6507[0] : field6507[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "ka",
      descriptor = "(III)V"
   )
   public final void method1668(int arg0, int arg1, int arg2) {
      try {
         if (~arg2 < ~(this.field6501[arg0][arg1] & 255)) {
            this.field6501[arg0][arg1] = (byte)arg2;
         }

         ++field6475;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6507[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public final void method1682(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      try {
         this.method3439(arg3, arg4, arg0, arg1, arg6, arg5, arg2, 1362833480);
         ++field6465;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6507[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6507[0] : field6507[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "<init>",
      descriptor = "(Lor;IIII[[I[[II)V"
   )
   public class469(class670 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      boolean var9 = client.field4273;
      super(arg3, arg4, arg7, arg5);
      this.field6485 = new class536();

      try {
         this.field6483 = arg0;
         this.field6461 = super.field3874 - 2;
         this.field6478 = new int[arg3][arg4][];
         this.field6498 = new float[super.field3873 - -1][super.field3871 + 1];
         this.field6484 = new int[arg3][arg4][];
         this.field6504 = new float[super.field3873 + 1][super.field3871 - -1];
         this.field6501 = new byte[arg3 + 1][arg4 + 1];
         this.field6470 = new short[arg3 * arg4][];
         this.field6482 = new byte[arg3][arg4];
         this.field6476 = new int[arg3][arg4][];
         this.field6474 = new int[arg3][arg4][];
         this.field6467 = new class467[arg3][arg4][];
         this.field6472 = new int[arg3][arg4][];
         this.field6489 = arg2;
         this.field6505 = new float[super.field3873 + 1][super.field3871 + 1];
         this.field6458 = 1 << this.field6461;
         int var10 = 1;
         int var10000;
         if (var9) {
            var10000 = 1;
         } else if (super.field3871 <= var10) {
            this.field6506 = new class245(128);
            var10000 = this.field6489 & 16;
            if (!var9) {
               if (var10000 != 0) {
                  this.field6471 = new class460(this.field6483, this);
                  return;
               }

               return;
            }
         } else {
            var10000 = 1;
         }

         while(true) {
            int var11 = var10000;
            if (var9 || super.field3873 > var11) {
               do {
                  int var12 = arg6[var11 + 1][var10] + -arg6[var11 - 1][var10];
                  int var13 = arg6[var11][var10 + 1] + -arg6[var11][var10 + -1];
                  float var14 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                  this.field6504[var11][var10] = (float)var12 * var14;
                  this.field6498[var11][var10] = (float)(-arg7 * 2) * var14;
                  this.field6505[var11][var10] = (float)var13 * var14;
                  ++var11;
               } while(super.field3873 > var11);
            }

            ++var10;
            if (super.field3871 <= var10) {
               this.field6506 = new class245(128);
               var10000 = this.field6489 & 16;
               if (!var9) {
                  if (var10000 != 0) {
                     this.field6471 = new class460(this.field6483, this);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 1;
            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field6507[5] + (arg0 != null ? field6507[0] : field6507[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6507[0] : field6507[1]) + ',' + (arg6 != null ? field6507[0] : field6507[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method1680(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      boolean var18 = client.field4273;

      try {
         ++field6488;
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
         if (!var18 && ~var29 <= ~var19) {
            this.method1674(arg0, arg1, var20, var26, var21, var27, var22, var23, var24, var25, arg13, arg14, arg15, arg16);
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
               var23[var28] = arg10 == null ? arg9[var29] : arg10[var29];
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
            } while(~var29 > ~var19);

            this.method1674(arg0, arg1, var20, var26, var21, var27, var22, var23, var24, var25, arg13, arg14, arg15, arg16);
         }
      } catch (RuntimeException var34) {
         throw class534.method3846(var34, field6507[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6507[0] : field6507[1]) + ',' + (arg3 != null ? field6507[0] : field6507[1]) + ',' + (arg4 != null ? field6507[0] : field6507[1]) + ',' + (arg5 != null ? field6507[0] : field6507[1]) + ',' + (arg6 != null ? field6507[0] : field6507[1]) + ',' + (arg7 != null ? field6507[0] : field6507[1]) + ',' + (arg8 != null ? field6507[0] : field6507[1]) + ',' + (arg9 != null ? field6507[0] : field6507[1]) + ',' + (arg10 != null ? field6507[0] : field6507[1]) + ',' + (arg11 != null ? field6507[0] : field6507[1]) + ',' + (arg12 != null ? field6507[0] : field6507[1]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method1683(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field6469;
         if (this.field6471 != null && arg0 != null) {
            int var7 = arg1 - (this.field6483.field9751 * arg2 >> 8) >> this.field6483.field9709;
            int var8 = -(this.field6483.field9796 * arg2 >> 8) + arg3 >> this.field6483.field9709;
            this.field6471.method3385(arg0, var7, var8, (byte)-54);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6507[3] + (arg0 != null ? field6507[0] : field6507[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method1674(int param1, int param2, int[] param3, int[] param4, int[] param5, int[] param6, int[] param7, int[] param8, int[] param9, int[] param10, int param11, int param12, int param13, boolean param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vj",
      name = "YA",
      descriptor = "()V"
   )
   public final void method1681() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "([[ZZIIIIII)V"
   )
   private final void method3439(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = client.field4273;

      try {
         if (this.field6499 != null) {
            int var10 = arg6 + arg6 + 1;
            int var11 = var10 * var10;
            if (~this.field6483.field9861.length > ~var11) {
               this.field6483.field9861 = new int[var11];
            }

            if (~this.field6483.field9769.field8227.length > ~(this.field6486 * 2)) {
               this.field6483.field9769 = new class608(this.field6486 * 2);
            }

            int var12 = arg2 - arg6;
            int var13 = var12;
            if (~var12 > -1) {
               var12 = 0;
            }

            int var14 = arg3 - arg6;
            int var15 = var14;
            if (~var14 > -1) {
               var14 = 0;
            }

            int var16 = arg2 - -arg6;
            if (var16 > super.field3873 - 1) {
               var16 = super.field3873 - 1;
            }

            int var17 = arg3 + arg6;
            if (~(super.field3871 + -1) > ~var17) {
               var17 = super.field3871 - 1;
            }

            int var18 = 0;
            int[] var19 = this.field6483.field9861;
            int var20 = var12;
            if (var9 || ~var12 >= ~var16) {
               do {
                  boolean[] var21 = arg0[-var13 + var20];
                  int var22 = var14;
                  if (var9) {
                     if (var21[-var15 + var14]) {
                        var19[var18++] = super.field3873 * var14 + var20;
                     }

                     var22 = var14 + 1;
                  }

                  while(true) {
                     while(var17 >= var22) {
                        if (var21[-var15 + var22]) {
                           var19[var18++] = super.field3873 * var22 + var20;
                        }

                        ++var22;
                     }

                     if (!var9) {
                        ++var20;
                        break;
                     }

                     ++var22;
                  }
               } while(~var20 >= ~var16);
            }

            label101: {
               if (~arg5 == 0) {
                  this.field6483.method4836((byte)-57);
                  if (!var9) {
                     break label101;
                  }
               }

               this.field6483.method4897(-4, (float)arg5);
               this.field6483.method4867(-106);
            }

            this.field6483.method4911(~(this.field6489 & 7) != -1, -8);
            int var23 = 0;
            if (var9) {
               this.field6499[var23].method3422(var19, -18760, var18);
               ++var23;
            }

            while(true) {
               class469 var10000;
               if (~var23 <= ~this.field6499.length) {
                  var10000 = this;
                  if (!var9) {
                     if (!this.field6485.method3858((byte)-63)) {
                        int var24 = this.field6483.field9846;
                        int var25 = this.field6483.field9806;
                        this.field6483.method547(0, var25, this.field6483.field9772);
                        this.field6483.method4911(false, -8);
                        this.field6483.method4837(false, -32);
                        this.field6483.method4912(1, 128);
                        this.field6483.method4840(-2, arg7 ^ 1362833428);
                        this.field6483.method4848(false, this.field6483.field9800);
                        this.field6483.method4862(7681, 8448, 65);
                        this.field6483.method4901(770, 0, 34166, arg7 + -1362833475);
                        this.field6483.method4906((byte)26, 770, 0, 34167);
                        class500 var26 = this.field6485.method3855(arg7 + -1362833530);
                        class439 var27;
                        if (var9) {
                           var27 = (class439)var26;
                           var27.method3261(arg0, -1, arg6, arg3, arg2);
                           var26 = this.field6485.method3866((byte)124);
                        }

                        while(true) {
                           if (var26 == null) {
                              this.field6483.method4901(768, 0, 5890, 5);
                              this.field6483.method4906((byte)26, 770, 0, 5890);
                              this.field6483.method4848(false, (class573)null);
                              this.field6483.method547(var24, var25, this.field6483.field9772);
                              break;
                           }

                           var27 = (class439)var26;
                           var27.method3261(arg0, -1, arg6, arg3, arg2);
                           var26 = this.field6485.method3866((byte)124);
                        }
                     }

                     if (this.field6471 != null) {
                        OpenGL.glPushMatrix();
                        OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                        this.field6483.method4874((class178)null, this.field6503, 102, this.field6502, (class178)null);
                        this.field6471.method3387(arg6, arg1, arg0, 118, arg2, arg3);
                        OpenGL.glPopMatrix();
                     }
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field6499[var23].method3422(var19, -18760, var18);
               ++var23;
            }
         }

         if (arg7 != 1362833480) {
            this.method1681();
         }

         ++field6463;
      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field6507[8] + (arg0 != null ? field6507[0] : field6507[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(IBLej;I)V"
   )
   private final void method3440(int arg0, byte arg1, class132 arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field6462;
         int[] var6 = this.field6472[arg3][arg0];
         int[] var7 = this.field6484[arg3][arg0];
         int var8 = var6.length;
         if (var8 > this.field6483.field9862.length) {
            this.field6483.field9862 = new int[var8];
            this.field6483.field9860 = new int[var8];
         }

         if (arg1 == -63) {
            int[] var9 = this.field6483.field9862;
            int[] var10 = this.field6483.field9860;
            int var11 = 0;
            if (var5) {
               var9[var11] = var6[var11] >> this.field6483.field9709;
               var10[var11] = var7[var11] >> this.field6483.field9709;
               ++var11;
            }

            while(true) {
               while(var8 > var11) {
                  var9[var11] = var6[var11] >> this.field6483.field9709;
                  var10[var11] = var7[var11] >> this.field6483.field9709;
                  ++var11;
               }

               int var12 = 0;
               if (!var5) {
                  if (!var5 && var8 <= var12) {
                     return;
                  } else {
                     do {
                        int var13 = var9[var12];
                        int var14 = var10[var12++];
                        int var15 = var9[var12];
                        int var16 = var10[var12++];
                        int var17 = var9[var12];
                        int var18 = var10[var12++];

                        while((-var15 + var13) * (-var18 + var16) + -((var17 - var15) * (-var14 + var16)) > 0) {
                           if (!var5) {
                              arg2.method1115(var18, -1, var15, var16, var13, var14, var17);
                              break;
                           }
                        }
                     } while(var8 > var12);

                     return;
                  }
               }

               ++var11;
            }
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field6507[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6507[0] : field6507[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public final void method1684(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      try {
         this.method3439(arg3, arg4, arg0, arg1, arg5, -1, arg2, 1362833480);
         ++field6466;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6507[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6507[0] : field6507[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3441(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3442(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
