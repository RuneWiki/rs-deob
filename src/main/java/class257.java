import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class257 extends class751 {
   @OriginalMember(
      owner = "client!jia",
      name = "A",
      descriptor = "I"
   )
   private int field3903 = -1;
   @OriginalMember(
      owner = "client!jia",
      name = "n",
      descriptor = "Lmi;"
   )
   private class20 field3920;
   @OriginalMember(
      owner = "client!jia",
      name = "k",
      descriptor = "I"
   )
   private int field3899;
   @OriginalMember(
      owner = "client!jia",
      name = "s",
      descriptor = "[[B"
   )
   private byte[][] field3910;
   @OriginalMember(
      owner = "client!jia",
      name = "j",
      descriptor = "[[B"
   )
   private byte[][] field3901;
   @OriginalMember(
      owner = "client!jia",
      name = "x",
      descriptor = "F"
   )
   private float field3900;
   @OriginalMember(
      owner = "client!jia",
      name = "u",
      descriptor = "F"
   )
   private float field3902;
   @OriginalMember(
      owner = "client!jia",
      name = "q",
      descriptor = "F"
   )
   private float field3905;
   @OriginalMember(
      owner = "client!jia",
      name = "E",
      descriptor = "F"
   )
   private float field3906;
   @OriginalMember(
      owner = "client!jia",
      name = "D",
      descriptor = "F"
   )
   private float field3907;
   @OriginalMember(
      owner = "client!jia",
      name = "v",
      descriptor = "F"
   )
   private float field3909;
   @OriginalMember(
      owner = "client!jia",
      name = "y",
      descriptor = "F"
   )
   private float field3912;
   @OriginalMember(
      owner = "client!jia",
      name = "B",
      descriptor = "F"
   )
   private float field3913;
   @OriginalMember(
      owner = "client!jia",
      name = "w",
      descriptor = "F"
   )
   private float field3914;
   @OriginalMember(
      owner = "client!jia",
      name = "o",
      descriptor = "F"
   )
   private float field3915;
   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "F"
   )
   private float field3916;
   @OriginalMember(
      owner = "client!jia",
      name = "C",
      descriptor = "F"
   )
   private float field3919;
   @OriginalMember(
      owner = "client!jia",
      name = "p",
      descriptor = "[[Lsha;"
   )
   private class189[][] field3908;
   @OriginalMember(
      owner = "client!jia",
      name = "l",
      descriptor = "[[Lsia;"
   )
   private class404[][] field3917;
   @OriginalMember(
      owner = "client!jia",
      name = "m",
      descriptor = "[[Lng;"
   )
   private class429[][] field3918;
   @OriginalMember(
      owner = "client!jia",
      name = "t",
      descriptor = "[[Lre;"
   )
   private class529[][] field3911;
   @OriginalMember(
      owner = "client!jia",
      name = "r",
      descriptor = "[[Lah;"
   )
   private class764[][] field3904;

   @OriginalMember(
      owner = "client!jia",
      name = "YA",
      descriptor = "()V"
   )
   public final void method54() {
      this.field3910 = null;
      this.field3901 = null;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public final void method47(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      class26 var7 = this.field3920.field282;
      this.field3903 = -1;
      this.field3915 = var7.field365;
      this.field3902 = var7.field392;
      this.field3900 = var7.field373;
      this.field3913 = var7.field387;
      this.field3906 = var7.field377;
      this.field3907 = var7.field382;
      this.field3919 = var7.field371;
      this.field3909 = var7.field391;
      this.field3916 = var7.field390;
      this.field3914 = var7.field376;
      this.field3912 = var7.field370;
      this.field3905 = var7.field363;

      for(int var8 = 0; var8 < arg2 + arg2; ++var8) {
         for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
            if (arg3[var8][var9]) {
               int var10 = arg0 - arg2 + var8;
               int var11 = arg1 - arg2 + var9;
               if (var10 >= 0 && var10 < super.field10665 && var11 >= 0 && var11 < super.field10666) {
                  this.method2187(var10, var11, arg5);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method45(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      if (this.field3908 == null) {
         this.field3908 = new class189[super.field10665][super.field10666];
         this.field3917 = new class404[super.field10665][super.field10666];
      } else if (this.field3904 != null || this.field3911 != null) {
         throw new IllegalStateException();
      }

      boolean var18 = false;
      if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
         var18 = true;

         for(int var19 = 1; var19 < 2; ++var19) {
            int var20 = arg2[arg6[var19]];
            int var21 = arg4[arg6[var19]];
            if (var20 != 0 && super.field10672 != var20 || var21 != 0 && super.field10672 != var21) {
               var18 = false;
               break;
            }
         }
      }

      if (!var18) {
         class404 var22 = new class404();
         short var23 = (short)arg2.length;
         short var24 = (short)arg9.length;
         var22.field5952 = var23;
         var22.field5944 = new short[var23];
         var22.field5945 = new short[var23];
         var22.field5951 = new short[var23];
         var22.field5943 = new short[var23];

         for(int var25 = 0; var25 < var23; ++var25) {
            int var32 = arg2[var25];
            int var33 = arg4[var25];
            if (var32 == 0 && var33 == 0) {
               var22.field5944[var25] = (short)(this.field3910[arg0][arg1] - this.field3901[arg0][arg1]);
            } else if (var32 == 0 && super.field10672 == var33) {
               var22.field5944[var25] = (short)(this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]);
            } else if (super.field10672 == var32 && super.field10672 == var33) {
               var22.field5944[var25] = (short)(this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]);
            } else if (super.field10672 == var32 && var33 == 0) {
               var22.field5944[var25] = (short)(this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]);
            } else {
               int var34 = (this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]) * var32 + (this.field3910[arg0][arg1] - this.field3901[arg0][arg1]) * (super.field10672 - var32);
               int var35 = (this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]) * var32 + (this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]) * (super.field10672 - var32);
               var22.field5944[var25] = (short)((super.field10672 - var33) * var34 + var33 * var35 >> super.field10671 * 2);
            }

            int var36 = (arg0 << super.field10671) + var32;
            int var37 = (arg1 << super.field10671) + var33;
            var22.field5945[var25] = (short)var32;
            var22.field5943[var25] = (short)var33;
            var22.field5951[var25] = (short)(this.method5401(var36, true, var37) + (arg3 != null ? arg3[var25] : 0));
            if (var22.field5944[var25] < 2) {
               var22.field5944[var25] = 2;
            }
         }

         boolean var26 = false;
         int var27 = 0;

         for(int var28 = 0; var28 < var24; ++var28) {
            if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
               ++var27;
            }

            int var30 = arg11[var28];
            if (var30 != -1) {
               class390 var31 = this.field3920.field240.method2043(-28, var30);
               if (!var31.field5670) {
                  var26 = true;
                  if (this.method2184(var31.field5668) || var31.field5681 != 0 || var31.field5667 != 0) {
                     var22.field5949 = (byte)(var22.field5949 | 4);
                  }
               }
            }
         }

         var22.field5953 = new int[var27];
         if (arg10 != null) {
            var22.field5941 = new int[var27];
         }

         var22.field5946 = new short[var27];
         var22.field5954 = new short[var27];
         var22.field5947 = new short[var27];
         if (var26) {
            var22.field5942 = new short[var27];
            var22.field5948 = new short[var27];
         }

         for(int var29 = 0; var29 < var24; ++var29) {
            if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
               if (arg9[var29] >= 0) {
                  var22.field5953[var22.field5950] = class270.method2299(arg9[var29], false);
               } else {
                  var22.field5953[var22.field5950] = -1;
               }

               if (arg10 != null) {
                  if (arg10[var29] != -1) {
                     var22.field5941[var22.field5950] = class270.method2299(arg10[var29], false);
                  } else {
                     var22.field5941[var22.field5950] = -1;
                  }
               }

               var22.field5946[var22.field5950] = (short)arg6[var29];
               var22.field5954[var22.field5950] = (short)arg7[var29];
               var22.field5947[var22.field5950] = (short)arg8[var29];
               if (var26) {
                  if (arg11[var29] != -1 && !this.field3920.field240.method2043(-19, arg11[var29]).field5670) {
                     var22.field5942[var22.field5950] = (short)arg11[var29];
                     var22.field5948[var22.field5950] = (short)arg12[var29];
                  } else {
                     var22.field5942[var22.field5950] = -1;
                  }
               }

               ++var22.field5950;
            }
         }

         this.field3917[arg0][arg1] = var22;
      } else {
         if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
            class189 var38 = new class189();
            int var39 = arg9[0];
            int var40 = arg11[0];
            if (arg10 != null) {
               var38.field2786 = class210.method1812(this.field3910[arg0][arg1] - this.field3901[arg0][arg1], -55, class270.method2299(arg10[0], false));
               if (var39 == -1) {
                  var38.field2782 = (byte)(var38.field2782 | 2);
               }
            }

            if (super.field10669[arg0 + 1][arg1] == super.field10669[arg0][arg1] && super.field10669[arg0 + 1][arg1 + 1] == super.field10669[arg0][arg1] && super.field10669[arg0][arg1 + 1] == super.field10669[arg0][arg1]) {
               var38.field2782 = (byte)(var38.field2782 | 1);
            }

            class390 var41 = null;
            if (var40 != -1) {
               var41 = this.field3920.field240.method2043(-112, var40);
            }

            if (var41 != null && (var38.field2782 & 2) == 0 && !var41.field5670) {
               var38.field2784 = (short)(this.field3910[arg0][arg1] - this.field3901[arg0][arg1]);
               var38.field2781 = (short)(this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]);
               var38.field2783 = (short)(this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]);
               var38.field2785 = (short)(this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]);
               var38.field2787 = (short)var40;
               if (this.method2184(var41.field5668) || var41.field5681 != 0 || var41.field5667 != 0) {
                  var38.field2782 = (byte)(var38.field2782 | 4);
               }
            } else {
               short var42 = class270.method2299(var39, false);
               var38.field2784 = (short)class210.method1812(this.field3910[arg0][arg1] - this.field3901[arg0][arg1], -44, var42);
               var38.field2781 = (short)class210.method1812(this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1], -94, var42);
               var38.field2783 = (short)class210.method1812(this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1], -64, var42);
               var38.field2785 = (short)class210.method1812(this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1], -50, var42);
               var38.field2787 = -1;
            }

            this.field3908[arg0][arg1] = var38;
         }

      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method53(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class772 var9 = this.field3920.method287(Thread.currentThread());
      class335 var10 = var9.field11184;
      var10.field4951 = 0;
      var10.field4958 = true;
      this.field3920.method144();
      if (this.field3904 == null && this.field3911 == null) {
         if (this.field3908 != null) {
            this.method2188(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field11205, var9.field11187);
         }

      } else {
         this.method2190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field11205, var9.field11187);
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public final class412 method43(int arg0, int arg1, class412 arg2) {
      return null;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(I)Z"
   )
   private final boolean method2184(int arg0) {
      if ((this.field3899 & 8) == 0) {
         return false;
      } else if (arg0 == 4) {
         return true;
      } else if (arg0 == 8) {
         return true;
      } else {
         return arg0 == 9;
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(II)I"
   )
   private static final int method2185(int arg0, int arg1) {
      int var2 = (arg0 & 16711680) * arg1 >> 23;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 253) {
         var2 = 253;
      }

      int var3 = (arg0 & 65280) * arg1 >> 15;
      if (var3 < 2) {
         var3 = 2;
      } else if (var3 > 253) {
         var3 = 253;
      }

      int var4 = (arg0 & 255) * arg1 >> 7;
      if (var4 < 2) {
         var4 = 2;
      } else if (var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method50(int arg0, int arg1) {
      this.method2187(arg0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public final void method44(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      class26 var8 = this.field3920.field282;
      this.field3903 = arg5;
      this.field3915 = var8.field365;
      this.field3902 = var8.field392;
      this.field3900 = var8.field373;
      this.field3913 = var8.field387;
      this.field3906 = var8.field377;
      this.field3907 = var8.field382;
      this.field3919 = var8.field371;
      this.field3909 = var8.field391;
      this.field3916 = var8.field390;
      this.field3914 = var8.field376;
      this.field3912 = var8.field370;
      this.field3905 = var8.field363;

      for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
         for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
            if (arg3[var9][var10]) {
               int var11 = arg0 - arg2 + var9;
               int var12 = arg1 - arg2 + var10;
               if (var11 >= 0 && var11 < super.field10665 && var12 >= 0 && var12 < super.field10666) {
                  this.method2187(var11, var12, arg6);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(IIZLsea;Lnha;[I[I[I[II)V"
   )
   private final void method2186(int arg0, int arg1, boolean arg2, class772 arg3, class335 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class764 var11 = this.field3904[arg0][arg1];
      if (var11 != null) {
         if ((var11.field10899 & 2) == 0) {
            if (arg9 != 0) {
               if ((var11.field10899 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            int var12 = super.field10672 * arg0;
            int var13 = super.field10672 + var12;
            int var14 = super.field10672 * arg1;
            int var15 = super.field10672 + var14;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            float var22;
            float var23;
            float var24;
            float var25;
            int var33;
            int var35;
            int var37;
            int var39;
            int var41;
            int var43;
            int var45;
            int var47;
            if ((var11.field10899 & 1) != 0 && !arg2) {
               int var20 = super.field10669[arg0][arg1];
               float var21 = (float)var20 * this.field3914;
               if (this.field3903 == -1) {
                  var22 = (float)var14 * this.field3912 + (float)var12 * this.field3916 + var21 + this.field3905;
                  if (var22 <= (float)this.field3920.field309) {
                     return;
                  }

                  var23 = (float)var14 * this.field3912 + (float)var13 * this.field3916 + var21 + this.field3905;
                  if (var23 <= (float)this.field3920.field309) {
                     return;
                  }

                  var24 = (float)var15 * this.field3912 + (float)var13 * this.field3916 + var21 + this.field3905;
                  if (var24 <= (float)this.field3920.field309) {
                     return;
                  }

                  var25 = (float)var15 * this.field3912 + (float)var12 * this.field3916 + var21 + this.field3905;
                  if (var25 <= (float)this.field3920.field309) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field3912 + (float)var12 * this.field3916 + var21 + this.field3905;
                  var23 = (float)var14 * this.field3912 + (float)var13 * this.field3916 + var21 + this.field3905;
                  var24 = (float)var15 * this.field3912 + (float)var13 * this.field3916 + var21 + this.field3905;
                  var25 = (float)var15 * this.field3912 + (float)var12 * this.field3916 + var21 + this.field3905;
               }

               if (arg3.field11163) {
                  int var26 = (int)(var22 - (float)arg3.field11169);
                  if (var26 > 0) {
                     var16 = var26;
                     if (var26 > 255) {
                        var16 = 255;
                     }
                  }

                  int var27 = (int)(var23 - (float)arg3.field11169);
                  if (var27 > 0) {
                     var17 = var27;
                     if (var27 > 255) {
                        var17 = 255;
                     }
                  }

                  int var28 = (int)(var24 - (float)arg3.field11169);
                  if (var28 > 0) {
                     var18 = var28;
                     if (var28 > 255) {
                        var18 = 255;
                     }
                  }

                  int var29 = (int)(var25 - (float)arg3.field11169);
                  if (var29 > 0) {
                     var19 = var29;
                     if (var29 > 255) {
                        var19 = 255;
                     }
                  }
               }

               float var30 = (float)var20 * this.field3902;
               float var31 = (float)var20 * this.field3907;
               if (this.field3903 == -1) {
                  float var32 = (float)var14 * this.field3900 + (float)var12 * this.field3915 + var30 + this.field3913;
                  var33 = (int)((float)this.field3920.field307 * var32 / var22) + arg4.field4961;
                  float var34 = (float)var14 * this.field3919 + (float)var12 * this.field3906 + var31 + this.field3909;
                  var35 = (int)((float)this.field3920.field286 * var34 / var22) + arg4.field4954;
                  float var36 = (float)var14 * this.field3900 + (float)var13 * this.field3915 + var30 + this.field3913;
                  var37 = (int)((float)this.field3920.field307 * var36 / var23) + arg4.field4961;
                  float var38 = (float)var14 * this.field3919 + (float)var13 * this.field3906 + var31 + this.field3909;
                  var39 = (int)((float)this.field3920.field286 * var38 / var23) + arg4.field4954;
                  float var40 = (float)var15 * this.field3900 + (float)var13 * this.field3915 + var30 + this.field3913;
                  var41 = (int)((float)this.field3920.field307 * var40 / var24) + arg4.field4961;
                  float var42 = (float)var15 * this.field3919 + (float)var13 * this.field3906 + var31 + this.field3909;
                  var43 = (int)((float)this.field3920.field286 * var42 / var24) + arg4.field4954;
                  float var44 = (float)var15 * this.field3900 + (float)var12 * this.field3915 + var30 + this.field3913;
                  var45 = (int)((float)this.field3920.field307 * var44 / var25) + arg4.field4961;
                  float var46 = (float)var15 * this.field3919 + (float)var12 * this.field3906 + var31 + this.field3909;
                  var47 = (int)((float)this.field3920.field286 * var46 / var25) + arg4.field4954;
               } else {
                  float var48 = (float)var14 * this.field3900 + (float)var12 * this.field3915 + var30 + this.field3913;
                  var33 = (int)((float)this.field3920.field307 * var48 / (float)this.field3903) + arg4.field4961;
                  float var49 = (float)var14 * this.field3919 + (float)var12 * this.field3906 + var31 + this.field3909;
                  var35 = (int)((float)this.field3920.field286 * var49 / (float)this.field3903) + arg4.field4954;
                  float var50 = (float)var14 * this.field3900 + (float)var13 * this.field3915 + var30 + this.field3913;
                  var37 = (int)((float)this.field3920.field307 * var50 / (float)this.field3903) + arg4.field4961;
                  float var51 = (float)var14 * this.field3919 + (float)var13 * this.field3906 + var31 + this.field3909;
                  var39 = (int)((float)this.field3920.field286 * var51 / (float)this.field3903) + arg4.field4954;
                  float var52 = (float)var15 * this.field3900 + (float)var13 * this.field3915 + var30 + this.field3913;
                  var41 = (int)((float)this.field3920.field307 * var52 / (float)this.field3903) + arg4.field4961;
                  float var53 = (float)var15 * this.field3919 + (float)var13 * this.field3906 + var31 + this.field3909;
                  var43 = (int)((float)this.field3920.field286 * var53 / (float)this.field3903) + arg4.field4954;
                  float var54 = (float)var15 * this.field3900 + (float)var12 * this.field3915 + var30 + this.field3913;
                  var45 = (int)((float)this.field3920.field307 * var54 / (float)this.field3903) + arg4.field4961;
                  float var55 = (float)var15 * this.field3919 + (float)var12 * this.field3906 + var31 + this.field3909;
                  var47 = (int)((float)this.field3920.field286 * var55 / (float)this.field3903) + arg4.field4954;
               }
            } else {
               int var56 = super.field10669[arg0][arg1];
               int var57 = super.field10669[arg0 + 1][arg1];
               int var58 = super.field10669[arg0 + 1][arg1 + 1];
               int var59 = super.field10669[arg0][arg1 + 1];
               if (this.field3903 == -1) {
                  var22 = (float)var14 * this.field3912 + (float)var12 * this.field3916 + (float)var56 * this.field3914 + this.field3905;
                  if (var22 <= (float)this.field3920.field309) {
                     return;
                  }

                  var23 = (float)var14 * this.field3912 + (float)var13 * this.field3916 + (float)var57 * this.field3914 + this.field3905;
                  if (var23 <= (float)this.field3920.field309) {
                     return;
                  }

                  var24 = (float)var15 * this.field3912 + (float)var13 * this.field3916 + (float)var58 * this.field3914 + this.field3905;
                  if (var24 <= (float)this.field3920.field309) {
                     return;
                  }

                  var25 = (float)var15 * this.field3912 + (float)var12 * this.field3916 + (float)var59 * this.field3914 + this.field3905;
                  if (var25 <= (float)this.field3920.field309) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field3912 + (float)var12 * this.field3916 + (float)var56 * this.field3914 + this.field3905;
                  var23 = (float)var14 * this.field3912 + (float)var13 * this.field3916 + (float)var57 * this.field3914 + this.field3905;
                  var24 = (float)var15 * this.field3912 + (float)var13 * this.field3916 + (float)var58 * this.field3914 + this.field3905;
                  var25 = (float)var15 * this.field3912 + (float)var12 * this.field3916 + (float)var59 * this.field3914 + this.field3905;
               }

               if (arg2) {
                  int var60 = (int)(var22 - (float)arg3.field11169);
                  if (var60 > 255) {
                     var60 = 255;
                  }

                  if (var60 > 0) {
                     var16 = var60;
                     int var61 = var11.field10897 * var60 / 255;
                     if (var61 > 0) {
                        var56 -= var61;
                     }
                  }

                  int var62 = (int)(var23 - (float)arg3.field11169);
                  if (var62 > 255) {
                     var62 = 255;
                  }

                  if (var62 > 0) {
                     var17 = var62;
                     int var63 = var11.field10898 * var62 / 255;
                     if (var63 > 0) {
                        var57 -= var63;
                     }
                  }

                  int var64 = (int)(var24 - (float)arg3.field11169);
                  if (var64 > 255) {
                     var64 = 255;
                  }

                  if (var64 > 0) {
                     var18 = var64;
                     int var65 = var11.field10896 * var64 / 255;
                     if (var65 > 0) {
                        var58 -= var65;
                     }
                  }

                  int var66 = (int)(var25 - (float)arg3.field11169);
                  if (var66 > 255) {
                     var66 = 255;
                  }

                  if (var66 > 0) {
                     var19 = var66;
                     int var67 = var11.field10892 * var66 / 255;
                     if (var67 > 0) {
                        var59 -= var67;
                     }
                  }
               } else if (arg3.field11163) {
                  int var68 = (int)(var22 - (float)arg3.field11169);
                  if (var68 > 0) {
                     var16 = var68;
                     if (var68 > 255) {
                        var16 = 255;
                     }
                  }

                  int var69 = (int)(var23 - (float)arg3.field11169);
                  if (var69 > 0) {
                     var17 = var69;
                     if (var69 > 255) {
                        var17 = 255;
                     }
                  }

                  int var70 = (int)(var24 - (float)arg3.field11169);
                  if (var70 > 0) {
                     var18 = var70;
                     if (var70 > 255) {
                        var18 = 255;
                     }
                  }

                  int var71 = (int)(var25 - (float)arg3.field11169);
                  if (var71 > 0) {
                     var19 = var71;
                     if (var71 > 255) {
                        var19 = 255;
                     }
                  }
               }

               if (this.field3903 == -1) {
                  float var72 = (float)var14 * this.field3900 + (float)var12 * this.field3915 + (float)var56 * this.field3902 + this.field3913;
                  var33 = (int)((float)this.field3920.field307 * var72 / var22) + arg4.field4961;
                  float var73 = (float)var14 * this.field3919 + (float)var12 * this.field3906 + (float)var56 * this.field3907 + this.field3909;
                  var35 = (int)((float)this.field3920.field286 * var73 / var22) + arg4.field4954;
                  float var74 = (float)var14 * this.field3900 + (float)var13 * this.field3915 + (float)var57 * this.field3902 + this.field3913;
                  var37 = (int)((float)this.field3920.field307 * var74 / var23) + arg4.field4961;
                  float var75 = (float)var14 * this.field3919 + (float)var13 * this.field3906 + (float)var57 * this.field3907 + this.field3909;
                  var39 = (int)((float)this.field3920.field286 * var75 / var23) + arg4.field4954;
                  float var76 = (float)var15 * this.field3900 + (float)var13 * this.field3915 + (float)var58 * this.field3902 + this.field3913;
                  var41 = (int)((float)this.field3920.field307 * var76 / var24) + arg4.field4961;
                  float var77 = (float)var15 * this.field3919 + (float)var13 * this.field3906 + (float)var58 * this.field3907 + this.field3909;
                  var43 = (int)((float)this.field3920.field286 * var77 / var24) + arg4.field4954;
                  float var78 = (float)var15 * this.field3900 + (float)var12 * this.field3915 + (float)var59 * this.field3902 + this.field3913;
                  var45 = (int)((float)this.field3920.field307 * var78 / var25) + arg4.field4961;
                  float var79 = (float)var15 * this.field3919 + (float)var12 * this.field3906 + (float)var59 * this.field3907 + this.field3909;
                  var47 = (int)((float)this.field3920.field286 * var79 / var25) + arg4.field4954;
               } else {
                  float var80 = (float)var14 * this.field3900 + (float)var12 * this.field3915 + (float)var56 * this.field3902 + this.field3913;
                  var33 = (int)((float)this.field3920.field307 * var80 / (float)this.field3903) + arg4.field4961;
                  float var81 = (float)var14 * this.field3919 + (float)var12 * this.field3906 + (float)var56 * this.field3907 + this.field3909;
                  var35 = (int)((float)this.field3920.field286 * var81 / (float)this.field3903) + arg4.field4954;
                  float var82 = (float)var14 * this.field3900 + (float)var13 * this.field3915 + (float)var57 * this.field3902 + this.field3913;
                  var37 = (int)((float)this.field3920.field307 * var82 / (float)this.field3903) + arg4.field4961;
                  float var83 = (float)var14 * this.field3919 + (float)var13 * this.field3906 + (float)var57 * this.field3907 + this.field3909;
                  var39 = (int)((float)this.field3920.field286 * var83 / (float)this.field3903) + arg4.field4954;
                  float var84 = (float)var15 * this.field3900 + (float)var13 * this.field3915 + (float)var58 * this.field3902 + this.field3913;
                  var41 = (int)((float)this.field3920.field307 * var84 / (float)this.field3903) + arg4.field4961;
                  float var85 = (float)var15 * this.field3919 + (float)var13 * this.field3906 + (float)var58 * this.field3907 + this.field3909;
                  var43 = (int)((float)this.field3920.field286 * var85 / (float)this.field3903) + arg4.field4954;
                  float var86 = (float)var15 * this.field3900 + (float)var12 * this.field3915 + (float)var59 * this.field3902 + this.field3913;
                  var45 = (int)((float)this.field3920.field307 * var86 / (float)this.field3903) + arg4.field4961;
                  float var87 = (float)var15 * this.field3919 + (float)var12 * this.field3906 + (float)var59 * this.field3907 + this.field3909;
                  var47 = (int)((float)this.field3920.field286 * var87 / (float)this.field3903) + arg4.field4954;
               }
            }

            boolean var88 = var11.field10890 != -1 && this.method2184(this.field3920.field240.method2043(-48, var11.field10890).field5668);
            if (this.field3903 == -1) {
               int var89 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field4958 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field4952 || var45 > arg4.field4952 || var37 > arg4.field4952;
                  if (var89 < 765) {
                     if (var89 > 0) {
                        if (var11.field10890 >= 0) {
                           int var90 = -16777216;
                           if (var88) {
                              var90 = -1694498816;
                           }

                           arg4.method2689((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field10889 & 16777215, var90 | var11.field10891 & 16777215, var90 | var11.field10894 & 16777215, arg3.field11178, var18, var19, var17, var11.field10890);
                        } else {
                           if (var88) {
                              arg4.field4951 = 100;
                           }

                           arg4.method2687((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class324.method2606(var18 << 24 | arg3.field11178, (byte)-27, var11.field10889), class324.method2606(var19 << 24 | arg3.field11178, (byte)-60, var11.field10891), class324.method2606(var17 << 24 | arg3.field11178, (byte)7, var11.field10894));
                           arg4.field4951 = 0;
                        }
                     } else if (var11.field10890 >= 0) {
                        int var91 = -16777216;
                        if (var88) {
                           var91 = -1694498816;
                        }

                        arg4.method2689((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field10889 & 16777215, var91 | var11.field10891 & 16777215, var91 | var11.field10894 & 16777215, 0, 0, 0, 0, var11.field10890);
                     } else {
                        if (var88) {
                           arg4.field4951 = 100;
                        }

                        arg4.method2687((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field10889, var11.field10891, var11.field10894);
                        arg4.field4951 = 0;
                     }
                  } else {
                     arg4.method2682((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field11178);
                  }
               }

               int var92 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field4958 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field4952 || var37 > arg4.field4952 || var45 > arg4.field4952;
                  if (var92 < 765) {
                     if (var88) {
                        arg4.field4951 = -1694498816;
                     }

                     if (var92 > 0) {
                        if (var11.field10890 >= 0) {
                           int var93 = -16777216;
                           if (var88) {
                              var93 = -1694498816;
                           }

                           arg4.method2689((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field10895 & 16777215, var93 | var11.field10894 & 16777215, var93 | var11.field10891 & 16777215, arg3.field11178, var16, var17, var19, var11.field10890);
                           return;
                        }

                        if (var88) {
                           arg4.field4951 = 100;
                        }

                        arg4.method2687((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class324.method2606(var16 << 24 | arg3.field11178, (byte)118, var11.field10895), class324.method2606(var17 << 24 | arg3.field11178, (byte)-26, var11.field10894), class324.method2606(var19 << 24 | arg3.field11178, (byte)-95, var11.field10891));
                        arg4.field4951 = 0;
                        return;
                     }

                     if (var11.field10890 >= 0) {
                        int var94 = -16777216;
                        if (var88) {
                           var94 = -1694498816;
                        }

                        arg4.method2689((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field10895 & 16777215, var94 | var11.field10894 & 16777215, var94 | var11.field10891 & 16777215, 0, 0, 0, 0, var11.field10890);
                        return;
                     }

                     if (var88) {
                        arg4.field4951 = 100;
                     }

                     arg4.method2687((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field10895, var11.field10894, var11.field10891);
                     arg4.field4951 = 0;
                     return;
                  }

                  arg4.method2682((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field11178);
                  return;
               }
            } else {
               int var95 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field4958 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field4952 || var45 > arg4.field4952 || var37 > arg4.field4952;
                  if (var95 < 765) {
                     if (var88) {
                        arg4.field4951 = -1694498816;
                     }

                     if (var95 > 0) {
                        if (var11.field10890 >= 0) {
                           int var96 = -16777216;
                           if (var88) {
                              var96 = -1694498816;
                           }

                           arg4.method2689((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field10889 & 16777215, var96 | var11.field10891 & 16777215, var96 | var11.field10894 & 16777215, arg3.field11178, var18, var19, var17, var11.field10890);
                        } else {
                           if (var88) {
                              arg4.field4951 = 100;
                           }

                           arg4.method2687((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class324.method2606(var18 << 24 | arg3.field11178, (byte)110, var11.field10889), class324.method2606(var19 << 24 | arg3.field11178, (byte)-102, var11.field10891), class324.method2606(var17 << 24 | arg3.field11178, (byte)100, var11.field10894));
                           arg4.field4951 = 0;
                        }
                     } else if (var11.field10890 >= 0) {
                        int var97 = -16777216;
                        if (var88) {
                           var97 = -1694498816;
                        }

                        arg4.method2689((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field10889 & 16777215, var97 | var11.field10891 & 16777215, var97 | var11.field10894 & 16777215, 0, 0, 0, 0, var11.field10890);
                     } else {
                        if (var88) {
                           arg4.field4951 = 100;
                        }

                        arg4.method2687((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field10889, var11.field10891, var11.field10894);
                        arg4.field4951 = 0;
                     }
                  } else {
                     arg4.method2682((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field11178);
                  }
               }

               int var98 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field4958 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field4952 || var37 > arg4.field4952 || var45 > arg4.field4952;
                  if (var98 < 765) {
                     if (var88) {
                        arg4.field4951 = -1694498816;
                     }

                     if (var98 > 0) {
                        if (var11.field10890 >= 0) {
                           int var99 = -16777216;
                           if (var88) {
                              var99 = -1694498816;
                           }

                           arg4.method2689((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field10895 & 16777215, var99 | var11.field10894 & 16777215, var99 | var11.field10891 & 16777215, arg3.field11178, var16, var17, var19, var11.field10890);
                           return;
                        }

                        if (var88) {
                           arg4.field4951 = 100;
                        }

                        arg4.method2687((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class324.method2606(var16 << 24 | arg3.field11178, (byte)-34, var11.field10895), class324.method2606(var17 << 24 | arg3.field11178, (byte)118, var11.field10894), class324.method2606(var19 << 24 | arg3.field11178, (byte)114, var11.field10891));
                        arg4.field4951 = 0;
                        return;
                     }

                     if (var11.field10890 >= 0) {
                        int var100 = -16777216;
                        if (var88) {
                           var100 = -1694498816;
                        }

                        arg4.method2689((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field10895 & 16777215, var100 | var11.field10894 & 16777215, var100 | var11.field10891 & 16777215, 0, 0, 0, 0, var11.field10890);
                        return;
                     }

                     if (var88) {
                        arg4.field4951 = 100;
                     }

                     arg4.method2687((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field10895, var11.field10894, var11.field10891);
                     arg4.field4951 = 0;
                     return;
                  }

                  arg4.method2682((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field11178);
               }
            }

         }
      } else {
         class429 var101 = this.field3918[arg0][arg1];
         if (var101 != null) {
            if (arg9 != 0) {
               if ((var101.field6290 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            if (this.field3903 == -1) {
               for(int var102 = 0; var102 < var101.field6295; ++var102) {
                  int var103 = (arg0 << super.field10671) + var101.field6298[var102];
                  int var104 = var101.field6294[var102];
                  int var105 = (arg1 << super.field10671) + var101.field6297[var102];
                  float var106 = (float)var105 * this.field3912 + (float)var103 * this.field3916 + (float)var104 * this.field3914 + this.field3905;
                  if (var106 <= (float)this.field3920.field309) {
                     return;
                  }

                  arg8[var102] = 0;
                  if (arg2) {
                     int var107 = (int)(var106 - (float)arg3.field11169);
                     if (var107 > 255) {
                        var107 = 255;
                     }

                     if (var107 > 0) {
                        arg8[var102] = var107;
                        int var108 = var101.field6292[var102] * var107 / 255;
                        if (var108 > 0) {
                           var104 -= var108;
                        }
                     }
                  } else if (arg3.field11163) {
                     int var109 = (int)(var106 - (float)arg3.field11169);
                     if (var109 > 0) {
                        arg8[var102] = var109;
                        if (arg8[var102] > 255) {
                           arg8[var102] = 255;
                        }
                     }
                  }

                  float var110 = (float)var105 * this.field3900 + (float)var103 * this.field3915 + (float)var104 * this.field3902 + this.field3913;
                  float var111 = (float)var105 * this.field3919 + (float)var103 * this.field3906 + (float)var104 * this.field3907 + this.field3909;
                  arg5[var102] = (int)((float)this.field3920.field307 * var110 / var106) + arg4.field4961;
                  arg6[var102] = (int)((float)this.field3920.field286 * var111 / var106) + arg4.field4954;
                  arg7[var102] = (int)var106;
               }
            } else {
               for(int var112 = 0; var112 < var101.field6295; ++var112) {
                  int var152 = (arg0 << super.field10671) + var101.field6298[var112];
                  int var153 = var101.field6294[var112];
                  int var154 = (arg1 << super.field10671) + var101.field6297[var112];
                  float var155 = (float)var154 * this.field3912 + (float)var152 * this.field3916 + (float)var153 * this.field3914 + this.field3905;
                  arg8[var112] = 0;
                  if (arg2) {
                     int var156 = this.field3903 - arg3.field11169;
                     if (var156 > 255) {
                        var156 = 255;
                     }

                     if (var156 > 0) {
                        arg8[var112] = var156;
                        int var157 = var101.field6292[var112] * var156 / 255;
                        if (var157 > 0) {
                           var153 -= var157;
                        }
                     }
                  } else if (arg3.field11163) {
                     int var158 = this.field3903 - arg3.field11169;
                     if (var158 > 0) {
                        arg8[var112] = var158;
                        if (arg8[var112] > 255) {
                           arg8[var112] = 255;
                        }
                     }
                  }

                  float var159 = (float)var154 * this.field3900 + (float)var152 * this.field3915 + (float)var153 * this.field3902 + this.field3913;
                  float var160 = (float)var154 * this.field3919 + (float)var152 * this.field3906 + (float)var153 * this.field3907 + this.field3909;
                  arg5[var112] = (int)((float)this.field3920.field307 * var159 / (float)this.field3903) + arg4.field4961;
                  arg6[var112] = (int)((float)this.field3920.field286 * var160 / (float)this.field3903) + arg4.field4954;
                  arg7[var112] = (int)var155;
               }
            }

            if (var101.field6291 != null) {
               if (this.field3903 == -1) {
                  for(int var113 = 0; var113 < var101.field6288; ++var113) {
                     int var114 = var113 * 3;
                     int var115 = var114 + 1;
                     int var116 = var115 + 1;
                     int var117 = arg5[var114];
                     int var118 = arg5[var115];
                     int var119 = arg5[var116];
                     int var120 = arg6[var114];
                     int var121 = arg6[var115];
                     int var122 = arg6[var116];
                     int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                     if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                        arg4.field4958 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field4952 || var118 > arg4.field4952 || var119 > arg4.field4952;
                        short var124 = var101.field6291[var113];
                        if (var123 < 765) {
                           if (var123 > 0) {
                              if (var124 != -1) {
                                 int var125 = -16777216;
                                 if (var124 != -1 && this.method2184(this.field3920.field240.method2043(-27, var124).field5668)) {
                                    var125 = -1694498816;
                                 }

                                 arg4.method2689((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field6298[var114] / (float)super.field10672, (float)var101.field6298[var115] / (float)super.field10672, (float)var101.field6298[var116] / (float)super.field10672, (float)var101.field6297[var114] / (float)super.field10672, (float)var101.field6297[var115] / (float)super.field10672, (float)var101.field6297[var116] / (float)super.field10672, var125 | var101.field6296[var114] & 16777215, var125 | var101.field6296[var115] & 16777215, var125 | var101.field6296[var116] & 16777215, arg3.field11178, arg8[var114], arg8[var115], arg8[var116], var124);
                              } else if ((var101.field6296[var114] & 16777215) != 0) {
                                 if (var124 != -1 && this.method2184(this.field3920.field240.method2043(-74, var124).field5668)) {
                                    arg4.field4951 = -1694498816;
                                 }

                                 arg4.method2687((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], class324.method2606(arg8[var114] << 24 | arg3.field11178, (byte)-111, var101.field6296[var114]), class324.method2606(arg8[var115] << 24 | arg3.field11178, (byte)100, var101.field6296[var115]), class324.method2606(arg8[var116] << 24 | arg3.field11178, (byte)103, var101.field6296[var116]));
                                 arg4.field4951 = 0;
                              }
                           } else if (var124 != -1) {
                              int var126 = -16777216;
                              if (var124 != -1 && this.method2184(this.field3920.field240.method2043(-82, var124).field5668)) {
                                 var126 = -1694498816;
                              }

                              arg4.method2689((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field6298[var114] / (float)super.field10672, (float)var101.field6298[var115] / (float)super.field10672, (float)var101.field6298[var116] / (float)super.field10672, (float)var101.field6297[var114] / (float)super.field10672, (float)var101.field6297[var115] / (float)super.field10672, (float)var101.field6297[var116] / (float)super.field10672, var126 | var101.field6296[var114] & 16777215, var126 | var101.field6296[var115] & 16777215, var126 | var101.field6296[var116] & 16777215, 0, 0, 0, 0, var124);
                           } else if ((var101.field6296[var114] & 16777215) != 0) {
                              if (var124 != -1 && this.method2184(this.field3920.field240.method2043(-106, var124).field5668)) {
                                 arg4.field4951 = -1694498816;
                              }

                              arg4.method2687((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], var101.field6296[var114], var101.field6296[var115], var101.field6296[var116]);
                              arg4.field4951 = 0;
                           }
                        } else {
                           arg4.method2682((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], arg3.field11178);
                        }
                     }
                  }

                  return;
               }

               for(int var127 = 0; var127 < var101.field6288; ++var127) {
                  int var128 = var127 * 3;
                  int var129 = var128 + 1;
                  int var130 = var129 + 1;
                  int var131 = arg5[var128];
                  int var132 = arg5[var129];
                  int var133 = arg5[var130];
                  int var134 = arg6[var128];
                  int var135 = arg6[var129];
                  int var136 = arg6[var130];
                  int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                  if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                     arg4.field4958 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field4952 || var132 > arg4.field4952 || var133 > arg4.field4952;
                     short var138 = var101.field6291[var127];
                     if (var137 < 765) {
                        if (var138 != -1 && this.method2184(this.field3920.field240.method2043(-64, var138).field5668)) {
                           arg4.field4951 = -1694498816;
                        }

                        if (var137 > 0) {
                           if (var138 != -1) {
                              int var139 = -16777216;
                              if (var138 != -1 && this.method2184(this.field3920.field240.method2043(-44, var138).field5668)) {
                                 var139 = -1694498816;
                              }

                              arg4.method2689((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field6298[var128] / (float)super.field10672, (float)var101.field6298[var129] / (float)super.field10672, (float)var101.field6298[var130] / (float)super.field10672, (float)var101.field6297[var128] / (float)super.field10672, (float)var101.field6297[var129] / (float)super.field10672, (float)var101.field6297[var130] / (float)super.field10672, var139 | var101.field6296[var128] & 16777215, var139 | var101.field6296[var129] & 16777215, var139 | var101.field6296[var130] & 16777215, arg3.field11178, arg8[var128], arg8[var129], arg8[var130], var138);
                           } else if ((var101.field6296[var128] & 16777215) != 0) {
                              if (var138 != -1 && this.method2184(this.field3920.field240.method2043(-126, var138).field5668)) {
                                 arg4.field4951 = -1694498816;
                              }

                              arg4.method2687((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], class324.method2606(arg8[var128] << 24 | arg3.field11178, (byte)-90, var101.field6296[var128]), class324.method2606(arg8[var129] << 24 | arg3.field11178, (byte)-77, var101.field6296[var129]), class324.method2606(arg8[var130] << 24 | arg3.field11178, (byte)123, var101.field6296[var130]));
                              arg4.field4951 = 0;
                           }
                        } else if (var138 != -1) {
                           int var140 = -16777216;
                           if (var138 != -1 && this.method2184(this.field3920.field240.method2043(-74, var138).field5668)) {
                              var140 = -1694498816;
                           }

                           arg4.method2689((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field6298[var128] / (float)super.field10672, (float)var101.field6298[var129] / (float)super.field10672, (float)var101.field6298[var130] / (float)super.field10672, (float)var101.field6297[var128] / (float)super.field10672, (float)var101.field6297[var129] / (float)super.field10672, (float)var101.field6297[var130] / (float)super.field10672, var140 | var101.field6296[var128] & 16777215, var140 | var101.field6296[var129] & 16777215, var140 | var101.field6296[var130] & 16777215, 0, 0, 0, 0, var138);
                        } else if ((var101.field6296[var128] & 16777215) != 0) {
                           if (var138 != -1 && this.method2184(this.field3920.field240.method2043(-60, var138).field5668)) {
                              arg4.field4951 = -1694498816;
                           }

                           arg4.method2687((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], var101.field6296[var128], var101.field6296[var129], var101.field6296[var130]);
                           arg4.field4951 = 0;
                        }

                        arg4.field4951 = 0;
                     } else {
                        arg4.method2682((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], arg3.field11178);
                     }
                  }
               }

               return;
            }

            for(int var141 = 0; var141 < var101.field6288; ++var141) {
               int var142 = var141 * 3;
               int var143 = var142 + 1;
               int var144 = var143 + 1;
               int var145 = arg5[var142];
               int var146 = arg5[var143];
               int var147 = arg5[var144];
               int var148 = arg6[var142];
               int var149 = arg6[var143];
               int var150 = arg6[var144];
               int var151 = arg8[var142] + arg8[var143] + arg8[var144];
               if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                  arg4.field4958 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field4952 || var146 > arg4.field4952 || var147 > arg4.field4952;
                  if (var151 < 765) {
                     if (var151 > 0) {
                        if ((var101.field6296[var142] & 16777215) != 0) {
                           arg4.method2687((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], class609.method4488(100, arg8[var142], var101.field6296[var142], arg3.field11178), class609.method4488(54, arg8[var143], var101.field6296[var143], arg3.field11178), class609.method4488(44, arg8[var144], var101.field6296[var144], arg3.field11178));
                        }
                     } else if ((var101.field6296[var142] & 16777215) != 0) {
                        arg4.method2687((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], var101.field6296[var142], var101.field6296[var143], var101.field6296[var144]);
                     }
                  } else {
                     arg4.method2682((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], arg3.field11178);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public final boolean method52(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return false;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "(III)V"
   )
   private final void method2187(int arg0, int arg1, int arg2) {
      class772 var4 = this.field3920.method287(Thread.currentThread());
      var4.field11184.field4951 = 0;
      if (this.field3904 != null) {
         this.method2186(arg0, arg1, var4.field11172, var4, var4.field11184, var4.field11205, var4.field11187, var4.field11217, var4.field11210, arg2);
      } else if (this.field3908 != null) {
         this.method2191(arg0, arg1, var4.field11184, var4.field11205, var4.field11187, var4.field11217, var4.field11210, arg2);
      } else {
         if (this.field3911 != null) {
            this.method2189(arg0, arg1, var4.field11172, var4, var4.field11184, var4.field11205, var4.field11187, var4.field11217, var4.field11210, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Lpha;[I)V"
   )
   public final void method46(class757 arg0, int[] arg1) {
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IIIIIII[[ZLsea;Lnha;[I[I)V"
   )
   private final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class772 arg8, class335 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field11164;
      this.field3920.method262(false);
      arg9.field4964 = false;
      arg9.field4956 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field3908[var18][var19] != null) {
                  class189 var20 = this.field3908[var18][var19];
                  if (var20.field2787 != -1 && (var20.field2782 & 2) == 0 && var20.field2786 == -1) {
                     int var21 = this.field3920.method279(var20.field2787);
                     arg9.method2673((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class210.method1812(var20.field2783 & 65535, -68, var21), (float)class210.method1812(var20.field2785 & 65535, -102, var21), (float)class210.method1812(var20.field2781 & 65535, -50, var21));
                     arg9.method2673((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class210.method1812(var20.field2784 & 65535, -51, var21), (float)class210.method1812(var20.field2781 & 65535, -43, var21), (float)class210.method1812(var20.field2785 & 65535, -108, var21));
                  } else if (var20.field2786 == -1) {
                     arg9.method2673((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)(var20.field2783 & 65535), (float)(var20.field2785 & 65535), (float)(var20.field2781 & 65535));
                     arg9.method2673((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var20.field2784 & 65535), (float)(var20.field2781 & 65535), (float)(var20.field2785 & 65535));
                  } else {
                     int var22 = var20.field2786;
                     arg9.method2673((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                     arg9.method2673((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                  }
               } else if (this.field3917[var18][var19] != null) {
                  class404 var23 = this.field3917[var18][var19];

                  for(int var24 = 0; var24 < var23.field5952; ++var24) {
                     arg10[var24] = var23.field5945[var24] * var14 / super.field10672 + var16;
                     arg11[var24] = var17 - var23.field5943[var24] * var14 / super.field10672;
                  }

                  for(int var25 = 0; var25 < var23.field5950; ++var25) {
                     short var26 = var23.field5946[var25];
                     short var27 = var23.field5954[var25];
                     short var28 = var23.field5947[var25];
                     int var29 = arg10[var26];
                     int var30 = arg10[var27];
                     int var31 = arg10[var28];
                     int var32 = arg11[var26];
                     int var33 = arg11[var27];
                     int var34 = arg11[var28];
                     if (var23.field5941 != null && var23.field5941[var25] != -1) {
                        int var35 = var23.field5941[var25];
                        arg9.method2673((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class210.method1812(var23.field5944[var26], -84, var35), (float)class210.method1812(var23.field5944[var27], -69, var35), (float)class210.method1812(var23.field5944[var28], -42, var35));
                     } else if (var23.field5942 != null && var23.field5942[var25] != -1) {
                        int var36 = this.field3920.method279(var23.field5942[var25]);
                        arg9.method2673((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class210.method1812(var23.field5944[var26], -105, var36), (float)class210.method1812(var23.field5944[var27], -55, var36), (float)class210.method1812(var23.field5944[var28], -79, var36));
                     } else {
                        int var37 = var23.field5953[var25];
                        arg9.method2673((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class210.method1812(var23.field5944[var26], -63, var37), (float)class210.method1812(var23.field5944[var27], -65, var37), (float)class210.method1812(var23.field5944[var28], -35, var37));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field4964 = true;
      this.field3920.method262(var15);
   }

   @OriginalMember(
      owner = "client!jia",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method57(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
      boolean var15 = (this.field3899 & 32) == 0;
      if (this.field3904 == null && !var15) {
         this.field3904 = new class764[super.field10665][super.field10666];
         this.field3918 = new class429[super.field10665][super.field10666];
      } else if (this.field3911 == null && var15) {
         this.field3911 = new class529[super.field10665][super.field10666];
      } else if (this.field3908 != null) {
         throw new IllegalStateException();
      }

      if (arg2 != null && arg2.length != 0) {
         for(int var16 = 0; var16 < arg6.length; ++var16) {
            if (arg6[var16] == -1) {
               arg6[var16] = 0;
            } else {
               arg6[var16] = class584.field8198[class270.method2299(arg6[var16], false) & 65535] << 8 | 255;
            }
         }

         if (arg7 != null) {
            for(int var17 = 0; var17 < arg7.length; ++var17) {
               if (arg7[var17] == -1) {
                  arg7[var17] = 0;
               } else {
                  arg7[var17] = class584.field8198[class270.method2299(arg7[var17], false) & 65535] << 8 | 255;
               }
            }
         }

         if (var15) {
            class529 var18 = new class529();
            var18.field7466 = (short)arg2.length;
            var18.field7470 = (short)(arg2.length / 3);
            var18.field7468 = new short[var18.field7466];
            var18.field7472 = new short[var18.field7466];
            var18.field7464 = new short[var18.field7466];
            var18.field7465 = new int[var18.field7466];
            var18.field7473 = new short[var18.field7466];
            var18.field7474 = new short[var18.field7466];
            var18.field7467 = new byte[var18.field7466];
            if (arg5 != null) {
               var18.field7471 = new short[var18.field7466];
            }

            for(int var19 = 0; var19 < var18.field7466; ++var19) {
               int var22 = arg2[var19];
               int var23 = arg4[var19];
               boolean var24 = false;
               int var25;
               if (var22 == 0 && var23 == 0) {
                  var25 = this.field3910[arg0][arg1] - this.field3901[arg0][arg1];
               } else if (var22 == 0 && super.field10672 == var23) {
                  var25 = this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1];
               } else if (super.field10672 == var22 && super.field10672 == var23) {
                  var25 = this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1];
               } else if (super.field10672 == var22 && var23 == 0) {
                  var25 = this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1];
               } else {
                  int var26 = (this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]) * var22 + (this.field3910[arg0][arg1] - this.field3901[arg0][arg1]) * (super.field10672 - var22);
                  int var27 = (this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]) * var22 + (this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]) * (super.field10672 - var22);
                  var25 = (super.field10672 - var23) * var26 + var23 * var27 >> super.field10671 * 2;
               }

               int var28 = (arg0 << super.field10671) + var22;
               int var29 = (arg1 << super.field10671) + var23;
               var18.field7468[var19] = (short)var22;
               var18.field7464[var19] = (short)var23;
               var18.field7472[var19] = (short)(this.method5401(var28, true, var29) + (arg3 != null ? arg3[var19] : 0));
               if (var25 < 0) {
                  var25 = 0;
               }

               if (arg6[var19] == 0) {
                  var18.field7465[var19] = 0;
                  if (arg7 != null) {
                     var18.field7467[var19] = (byte)var25;
                  }
               } else {
                  int var30 = 0;
                  if (arg5 != null) {
                     short var31 = var18.field7471[var19] = (short)arg5[var19];
                     if (arg11 != 0) {
                        var30 = var31 * 255 / arg11;
                        if (var30 < 0) {
                           var30 = 0;
                        } else if (var30 > 255) {
                           var30 = 255;
                        }
                     }
                  }

                  int var32 = -16777216;
                  if (arg8[var19] != -1 && this.method2184(this.field3920.field240.method2043(-120, arg8[var19]).field5668)) {
                     var32 = -1694498816;
                  }

                  var18.field7465[var19] = var32 | class609.method4488(83, var30, method2185(arg6[var19] >> 8, var25), arg10);
                  if (arg7 != null) {
                     var18.field7467[var19] = (byte)var25;
                  }
               }

               var18.field7473[var19] = (short)arg8[var19];
               var18.field7474[var19] = (short)arg9[var19];
            }

            if (arg7 != null) {
               var18.field7469 = new int[var18.field7470];
            }

            for(int var20 = 0; var20 < var18.field7470; ++var20) {
               int var21 = var20 * 3;
               if (arg7 != null && arg7[var21] != 0) {
                  var18.field7469[var20] = -16777216 | arg7[var21] >> 8;
               }
            }

            this.field3911[arg0][arg1] = var18;
         } else {
            boolean var33 = true;
            int var34 = -1;
            int var35 = -1;
            int var36 = -1;
            int var37 = -1;
            if (arg2.length == 6) {
               for(int var38 = 0; var38 < 6; ++var38) {
                  if (arg2[var38] == 0 && arg4[var38] == 0) {
                     if (var34 != -1 && arg6[var34] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var34 = var38;
                  } else if (arg2[var38] == super.field10672 && arg4[var38] == 0) {
                     if (var35 != -1 && arg6[var35] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var35 = var38;
                  } else if (arg2[var38] == super.field10672 && arg4[var38] == super.field10672) {
                     if (var36 != -1 && arg6[var36] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var36 = var38;
                  } else if (arg2[var38] == 0 && arg4[var38] == super.field10672) {
                     if (var37 != -1 && arg6[var37] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var37 = var38;
                  }
               }

               if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                  var33 = false;
               }

               if (var33) {
                  if (arg3 != null) {
                     for(int var39 = 0; var39 < 4; ++var39) {
                        if (arg3[var39] != 0) {
                           var33 = false;
                           break;
                        }
                     }
                  }

                  if (var33) {
                     for(int var40 = 1; var40 < 4; ++var40) {
                        if (arg2[var40] != arg2[0] && arg2[0] + super.field10672 != arg2[var40] && arg2[0] - super.field10672 != arg2[var40]) {
                           var33 = false;
                           break;
                        }

                        if (arg4[var40] != arg4[0] && arg4[0] + super.field10672 != arg4[var40] && arg4[0] - super.field10672 != arg4[var40]) {
                           var33 = false;
                           break;
                        }
                     }
                  }
               }
            } else {
               var33 = false;
            }

            if (var33) {
               class764 var41 = new class764();
               int var42 = arg6[0];
               int var43 = arg8[0];
               if (arg7 != null) {
                  var41.field10893 = arg7[0] >> 8;
                  if (var42 == 0) {
                     var41.field10899 = (byte)(var41.field10899 | 2);
                  }
               } else if (var42 == 0) {
                  return;
               }

               if (super.field10669[arg0 + 1][arg1] == super.field10669[arg0][arg1] && super.field10669[arg0 + 1][arg1 + 1] == super.field10669[arg0][arg1] && super.field10669[arg0][arg1 + 1] == super.field10669[arg0][arg1]) {
                  var41.field10899 = (byte)(var41.field10899 | 1);
               }

               if (var43 != -1 && (var41.field10899 & 2) == 0 && !this.field3920.field240.method2043(-46, var43).field5670) {
                  int var44;
                  if (arg5 != null && arg11 != 0) {
                     var44 = arg5[var34] * 255 / arg11;
                     if (var44 < 0) {
                        var44 = 0;
                     } else if (var44 > 255) {
                        var44 = 255;
                     }
                  } else {
                     var44 = 0;
                  }

                  var41.field10895 = class609.method4488(37, var44, method2185(arg6[var34] >> 8, this.field3910[arg0][arg1] - this.field3901[arg0][arg1]), arg10);
                  if (var41.field10893 != 0) {
                     var41.field10895 |= 255 - (this.field3910[arg0][arg1] - this.field3901[arg0][arg1]) << 25;
                  }

                  int var45;
                  if (arg5 != null && arg11 != 0) {
                     var45 = arg5[var35] * 255 / arg11;
                     if (var45 < 0) {
                        var45 = 0;
                     } else if (var45 > 255) {
                        var45 = 255;
                     }
                  } else {
                     var45 = 0;
                  }

                  var41.field10894 = class609.method4488(54, var45, method2185(arg6[var35] >> 8, this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]), arg10);
                  if (var41.field10893 != 0) {
                     var41.field10894 |= 255 - (this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]) << 25;
                  }

                  int var46;
                  if (arg5 != null && arg11 != 0) {
                     var46 = arg5[var36] * 255 / arg11;
                     if (var46 < 0) {
                        var46 = 0;
                     } else if (var46 > 255) {
                        var46 = 255;
                     }
                  } else {
                     var46 = 0;
                  }

                  var41.field10889 = class609.method4488(22, var46, method2185(arg6[var36] >> 8, this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]), arg10);
                  if (var41.field10893 != 0) {
                     var41.field10889 |= 255 - (this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var47;
                  if (arg5 != null && arg11 != 0) {
                     var47 = arg5[var37] * 255 / arg11;
                     if (var47 < 0) {
                        var47 = 0;
                     } else if (var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var41.field10891 = class609.method4488(107, var47, method2185(arg6[var37] >> 8, this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]), arg10);
                  var41.field10890 = (short)var43;
               } else {
                  int var48;
                  if (arg5 != null && arg11 != 0) {
                     var48 = arg5[var34] * 255 / arg11;
                     if (var48 < 0) {
                        var48 = 0;
                     } else if (var48 > 255) {
                        var48 = 255;
                     }
                  } else {
                     var48 = 0;
                  }

                  var41.field10895 = class609.method4488(5, var48, method2185(arg6[var34] >> 8, this.field3910[arg0][arg1] - this.field3901[arg0][arg1]), arg10);
                  if (var41.field10893 != 0) {
                     var41.field10895 |= 255 - (this.field3910[arg0][arg1] - this.field3901[arg0][arg1]) << 25;
                  }

                  int var49;
                  if (arg5 != null && arg11 != 0) {
                     var49 = arg5[var35] * 255 / arg11;
                     if (var49 < 0) {
                        var49 = 0;
                     } else if (var49 > 255) {
                        var49 = 255;
                     }
                  } else {
                     var49 = 0;
                  }

                  var41.field10894 = class609.method4488(49, var49, method2185(arg6[var35] >> 8, this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]), arg10);
                  if (var41.field10893 != 0) {
                     var41.field10894 |= 255 - (this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]) << 25;
                  }

                  int var50;
                  if (arg5 != null && arg11 != 0) {
                     var50 = arg5[var36] * 255 / arg11;
                     if (var50 < 0) {
                        var50 = 0;
                     } else if (var50 > 255) {
                        var50 = 255;
                     }
                  } else {
                     var50 = 0;
                  }

                  var41.field10889 = class609.method4488(84, var50, method2185(arg6[var36] >> 8, this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]), arg10);
                  if (var41.field10893 != 0) {
                     var41.field10889 |= 255 - (this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var51;
                  if (arg5 != null && arg11 != 0) {
                     var51 = arg5[var37] * 255 / arg11;
                     if (var51 < 0) {
                        var51 = 0;
                     } else if (var51 > 255) {
                        var51 = 255;
                     }
                  } else {
                     var51 = 0;
                  }

                  var41.field10891 = class609.method4488(111, var51, method2185(arg6[var37] >> 8, this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]), arg10);
                  if (var41.field10893 != 0) {
                     var41.field10891 |= 255 - (this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]) << 25;
                  }

                  var41.field10890 = -1;
               }

               if (arg5 != null) {
                  var41.field10896 = (short)arg5[var36];
                  var41.field10892 = (short)arg5[var37];
                  var41.field10898 = (short)arg5[var35];
                  var41.field10897 = (short)arg5[var34];
               }

               this.field3904[arg0][arg1] = var41;
            } else {
               class429 var52 = new class429();
               var52.field6295 = (short)arg2.length;
               var52.field6288 = (short)(arg2.length / 3);
               var52.field6298 = new short[var52.field6295];
               var52.field6294 = new short[var52.field6295];
               var52.field6297 = new short[var52.field6295];
               var52.field6296 = new int[var52.field6295];
               if (arg5 != null) {
                  var52.field6292 = new short[var52.field6295];
               }

               for(int var53 = 0; var53 < var52.field6295; ++var53) {
                  int var68 = arg2[var53];
                  int var69 = arg4[var53];
                  boolean var70 = false;
                  int var71;
                  if (var68 == 0 && var69 == 0) {
                     var71 = this.field3910[arg0][arg1] - this.field3901[arg0][arg1];
                  } else if (var68 == 0 && super.field10672 == var69) {
                     var71 = this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1];
                  } else if (super.field10672 == var68 && super.field10672 == var69) {
                     var71 = this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1];
                  } else if (super.field10672 == var68 && var69 == 0) {
                     var71 = this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1];
                  } else {
                     int var72 = (this.field3910[arg0 + 1][arg1] - this.field3901[arg0 + 1][arg1]) * var68 + (this.field3910[arg0][arg1] - this.field3901[arg0][arg1]) * (super.field10672 - var68);
                     int var73 = (this.field3910[arg0 + 1][arg1 + 1] - this.field3901[arg0 + 1][arg1 + 1]) * var68 + (this.field3910[arg0][arg1 + 1] - this.field3901[arg0][arg1 + 1]) * (super.field10672 - var68);
                     var71 = (super.field10672 - var69) * var72 + var69 * var73 >> super.field10671 * 2;
                  }

                  int var74 = (arg0 << super.field10671) + var68;
                  int var75 = (arg1 << super.field10671) + var69;
                  var52.field6298[var53] = (short)var68;
                  var52.field6297[var53] = (short)var69;
                  var52.field6294[var53] = (short)(this.method5401(var74, true, var75) + (arg3 != null ? arg3[var53] : 0));
                  if (var71 < 0) {
                     var71 = 0;
                  }

                  if (arg6[var53] == 0) {
                     if (arg7 != null) {
                        var52.field6296[var53] = var71 << 25;
                     } else {
                        var52.field6296[var53] = 0;
                     }
                  } else {
                     int var76 = 0;
                     if (arg5 != null) {
                        short var77 = var52.field6292[var53] = (short)arg5[var53];
                        if (arg11 != 0) {
                           var76 = var77 * 255 / arg11;
                           if (var76 < 0) {
                              var76 = 0;
                           } else if (var76 > 255) {
                              var76 = 255;
                           }
                        }
                     }

                     var52.field6296[var53] = class609.method4488(124, var76, method2185(arg6[var53] >> 8, var71), arg10);
                     if (arg7 != null) {
                        var52.field6296[var53] |= var71 << 25;
                     }
                  }
               }

               boolean var54 = false;

               for(int var55 = 0; var55 < var52.field6288; ++var55) {
                  if (arg8[var55 * 3] != -1 && !this.field3920.field240.method2043(-47, arg8[var55 * 3]).field5670) {
                     var54 = true;
                  }
               }

               if (arg7 != null) {
                  var52.field6293 = new int[var52.field6288];
               }

               if (var54) {
                  var52.field6291 = new short[var52.field6288];
                  var52.field6289 = new short[var52.field6288];
               }

               for(int var56 = 0; var56 < var52.field6288; ++var56) {
                  int var57 = var56 * 3;
                  if (arg7 != null && arg7[var57] != 0) {
                     var52.field6293[var56] = arg7[var57] >> 8;
                  }

                  if (var54) {
                     int var58 = var57 + 1;
                     int var59 = var58 + 1;
                     boolean var60 = false;
                     boolean var61 = true;
                     int var62 = arg8[var57];
                     if (var62 != -1 && !this.field3920.field240.method2043(-46, var62).field5670) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var63 = arg8[var58];
                     if (var63 != -1 && !this.field3920.field240.method2043(-60, var63).field5670) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var64 = arg8[var59];
                     if (var64 != -1 && !this.field3920.field240.method2043(-69, var64).field5670) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     if (var61) {
                        var52.field6291[var56] = (short)var64;
                        var52.field6289[var56] = (short)arg9[var57];
                     } else {
                        if (var60) {
                           int var65 = arg8[var57];
                           if (var65 != -1 && !this.field3920.field240.method2043(-52, var65).field5670) {
                              var52.field6296[var57] = class584.field8198[class270.method2299(this.field3920.field240.method2043(-77, var65).field5674 & 65535, false) & 65535];
                           }

                           int var66 = arg8[var58];
                           if (var66 != -1 && !this.field3920.field240.method2043(-20, var66).field5670) {
                              var52.field6296[var58] = class584.field8198[class270.method2299(this.field3920.field240.method2043(-103, var66).field5674 & 65535, false) & 65535];
                           }

                           int var67 = arg8[var59];
                           if (var67 != -1 && !this.field3920.field240.method2043(-80, var67).field5670) {
                              var52.field6296[var59] = class584.field8198[class270.method2299(this.field3920.field240.method2043(-43, var67).field5674 & 65535, false) & 65535];
                           }
                        }

                        var52.field6291[var56] = -1;
                     }
                  }
               }

               this.field3918[arg0][arg1] = var52;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IIZLsea;Lnha;[I[I[I[II)V"
   )
   private final void method2189(int arg0, int arg1, boolean arg2, class772 arg3, class335 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class529 var11 = this.field3911[arg0][arg1];
      if (arg9 == 0 || (arg9 & 2) == 0) {
         if (var11 != null) {
            if (this.field3903 == -1) {
               for(int var12 = 0; var12 < var11.field7466; ++var12) {
                  int var13 = (arg0 << super.field10671) + var11.field7468[var12];
                  int var14 = var11.field7472[var12];
                  int var15 = (arg1 << super.field10671) + var11.field7464[var12];
                  float var16 = (float)var15 * this.field3912 + (float)var13 * this.field3916 + (float)var14 * this.field3914 + this.field3905;
                  if (var16 <= (float)this.field3920.field309) {
                     return;
                  }

                  arg8[var12] = 0;
                  if (arg2) {
                     int var17 = (int)(var16 - (float)arg3.field11169);
                     if (var17 > 255) {
                        var17 = 255;
                     }

                     if (var17 > 0) {
                        arg8[var12] = var17;
                        int var18 = var11.field7471[var12] * var17 / 255;
                        if (var18 > 0) {
                           var14 -= var18;
                        }
                     }
                  } else if (arg3.field11163) {
                     int var19 = (int)(var16 - (float)arg3.field11169);
                     if (var19 > 0) {
                        arg8[var12] = var19;
                        if (arg8[var12] > 255) {
                           arg8[var12] = 255;
                        }
                     }
                  }

                  float var20 = (float)var15 * this.field3900 + (float)var13 * this.field3915 + (float)var14 * this.field3902 + this.field3913;
                  float var21 = (float)var15 * this.field3919 + (float)var13 * this.field3906 + (float)var14 * this.field3907 + this.field3909;
                  arg5[var12] = (int)((float)this.field3920.field307 * var20 / var16) + arg4.field4961;
                  arg6[var12] = (int)((float)this.field3920.field286 * var21 / var16) + arg4.field4954;
                  arg7[var12] = (int)var16;
               }
            } else {
               for(int var22 = 0; var22 < var11.field7466; ++var22) {
                  int var36 = (arg0 << super.field10671) + var11.field7468[var22];
                  int var37 = var11.field7472[var22];
                  int var38 = (arg1 << super.field10671) + var11.field7464[var22];
                  float var39 = (float)var38 * this.field3912 + (float)var36 * this.field3916 + (float)var37 * this.field3914 + this.field3905;
                  arg8[var22] = 0;
                  if (arg2) {
                     int var40 = this.field3903 - arg3.field11169;
                     if (var40 > 255) {
                        var40 = 255;
                     }

                     if (var40 > 0) {
                        arg8[var22] = var40;
                        int var41 = var11.field7471[var22] * var40 / 255;
                        if (var41 > 0) {
                           var37 -= var41;
                        }
                     }
                  } else if (arg3.field11163) {
                     int var42 = this.field3903 - arg3.field11169;
                     if (var42 > 0) {
                        arg8[var22] = var42;
                        if (arg8[var22] > 255) {
                           arg8[var22] = 255;
                        }
                     }
                  }

                  float var43 = (float)var38 * this.field3900 + (float)var36 * this.field3915 + (float)var37 * this.field3902 + this.field3913;
                  float var44 = (float)var38 * this.field3919 + (float)var36 * this.field3906 + (float)var37 * this.field3907 + this.field3909;
                  arg5[var22] = (int)((float)this.field3920.field307 * var43 / (float)this.field3903) + arg4.field4961;
                  arg6[var22] = (int)((float)this.field3920.field286 * var44 / (float)this.field3903) + arg4.field4954;
                  arg7[var22] = (int)var39;
               }
            }

            float var23 = (float)super.field10672;

            for(int var24 = 0; var24 < var11.field7470; ++var24) {
               int var25 = var24 * 3;
               int var26 = var25 + 1;
               int var27 = var26 + 1;
               int var28 = arg5[var25];
               int var29 = arg5[var26];
               int var30 = arg5[var27];
               int var31 = arg6[var25];
               int var32 = arg6[var26];
               int var33 = arg6[var27];
               if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                  arg4.field4958 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field4952 || var29 > arg4.field4952 || var30 > arg4.field4952;
                  if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                     int var34 = arg0 << super.field10671;
                     int var35 = arg1 << super.field10671;
                     if ((var11.field7465[var25] & 16777215) != 0) {
                        if (var11.field7473[var25] == var11.field7473[var26] && var11.field7473[var25] == var11.field7473[var27] && var11.field7474[var25] == var11.field7474[var26] && var11.field7474[var25] == var11.field7474[var27]) {
                           arg4.method2689((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field7468[var25] + var34) / (float)var11.field7474[var25], (float)(var11.field7468[var26] + var34) / (float)var11.field7474[var26], (float)(var11.field7468[var27] + var34) / (float)var11.field7474[var27], (float)(var11.field7464[var25] + var35) / (float)var11.field7474[var25], (float)(var11.field7464[var26] + var35) / (float)var11.field7474[var26], (float)(var11.field7464[var27] + var35) / (float)var11.field7474[var27], var11.field7465[var25], var11.field7465[var26], var11.field7465[var27], arg3.field11178, arg8[var25], arg8[var26], arg8[var27], var11.field7473[var25]);
                        } else {
                           arg4.method2674((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field7468[var25] + var34) / var23, (float)(var11.field7468[var26] + var34) / var23, (float)(var11.field7468[var27] + var34) / var23, (float)(var11.field7464[var25] + var35) / var23, (float)(var11.field7464[var26] + var35) / var23, (float)(var11.field7464[var27] + var35) / var23, var11.field7465[var25], var11.field7465[var26], var11.field7465[var27], arg3.field11178, arg8[var25], arg8[var26], arg8[var27], var11.field7473[var25], var23 / (float)var11.field7474[var25], var11.field7473[var26], var23 / (float)var11.field7474[var26], var11.field7473[var27], var23 / (float)var11.field7474[var27]);
                        }
                     }
                  } else {
                     arg4.method2682((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], arg3.field11178);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(IIIIIII[[ZLsea;Lnha;[I[I)V"
   )
   private final void method2190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class772 arg8, class335 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field11164;
      this.field3920.method262(false);
      arg9.field4964 = false;
      arg9.field4956 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field3904 != null) {
                  if (this.field3904[var18][var19] != null) {
                     class764 var20 = this.field3904[var18][var19];
                     if (var20.field10890 != -1 && (var20.field10899 & 2) == 0 && var20.field10893 == 0) {
                        int var21 = this.field3920.method279(var20.field10890);
                        arg9.method2673((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class210.method1812(var20.field10889, -36, var21), (float)class210.method1812(var20.field10891, -120, var21), (float)class210.method1812(var20.field10894, -38, var21));
                        arg9.method2673((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class210.method1812(var20.field10895, -41, var21), (float)class210.method1812(var20.field10894, -43, var21), (float)class210.method1812(var20.field10891, -55, var21));
                     } else if (var20.field10893 == 0) {
                        arg9.method2687((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, var20.field10889, var20.field10891, var20.field10894);
                        arg9.method2687((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, var20.field10895, var20.field10894, var20.field10891);
                     } else {
                        int var22 = var20.field10893;
                        arg9.method2687((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, class324.method2606(var20.field10889 & -16777216, (byte)96, var22), class324.method2606(var20.field10891 & -16777216, (byte)-13, var22), class324.method2606(var20.field10894 & -16777216, (byte)-17, var22));
                        arg9.method2687((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, class324.method2606(var20.field10895 & -16777216, (byte)-8, var22), class324.method2606(var20.field10894 & -16777216, (byte)13, var22), class324.method2606(var20.field10891 & -16777216, (byte)-20, var22));
                     }
                  } else if (this.field3918[var18][var19] != null) {
                     class429 var23 = this.field3918[var18][var19];

                     for(int var24 = 0; var24 < var23.field6295; ++var24) {
                        arg10[var24] = var23.field6298[var24] * var14 / super.field10672 + var16;
                        arg11[var24] = var17 - var23.field6297[var24] * var14 / super.field10672;
                     }

                     for(int var25 = 0; var25 < var23.field6288; ++var25) {
                        int var26 = var25 * 3;
                        int var27 = var26 + 1;
                        int var28 = var27 + 1;
                        int var29 = arg10[var26];
                        int var30 = arg10[var27];
                        int var31 = arg10[var28];
                        int var32 = arg11[var26];
                        int var33 = arg11[var27];
                        int var34 = arg11[var28];
                        if (var23.field6293 != null && var23.field6293[var25] != 0 && (var23.field6291 == null || var23.field6291 != null && var23.field6291[var25] == -1)) {
                           int var35 = var23.field6293[var25];
                           arg9.method2687((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, class324.method2606(-16777216 - (var23.field6296[var26] & -16777216), (byte)-43, var35), class324.method2606(-16777216 - (var23.field6296[var27] & -16777216), (byte)-125, var35), class324.method2606(-16777216 - (var23.field6296[var28] & -16777216), (byte)12, var35));
                        } else if (var23.field6291 != null && var23.field6291[var25] != -1) {
                           int var36 = this.field3920.method279(var23.field6291[var25]);
                           arg9.method2673((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)var36, (float)var36, (float)var36);
                        } else {
                           arg9.method2687((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, var23.field6296[var26], var23.field6296[var27], var23.field6296[var28]);
                        }
                     }
                  }
               } else if (this.field3911[var18][var19] != null) {
                  class529 var37 = this.field3911[var18][var19];

                  for(int var38 = 0; var38 < var37.field7466; ++var38) {
                     arg10[var38] = var37.field7468[var38] * var14 / super.field10672 + var16;
                     arg11[var38] = var17 - var37.field7464[var38] * var14 / super.field10672;
                  }

                  for(int var39 = 0; var39 < var37.field7470; ++var39) {
                     int var40 = var39 * 3;
                     int var41 = var40 + 1;
                     int var42 = var41 + 1;
                     int var43 = arg10[var40];
                     int var44 = arg10[var41];
                     int var45 = arg10[var42];
                     int var46 = arg11[var40];
                     int var47 = arg11[var41];
                     int var48 = arg11[var42];
                     if (var37.field7469 != null && var37.field7469[var39] != 0) {
                        int var49 = var37.field7469[var39];
                        arg9.method2687((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                     } else {
                        arg9.method2687((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var37.field7465[var40], var37.field7465[var41], var37.field7465[var42]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field4964 = true;
      this.field3920.method262(var15);
   }

   @OriginalMember(
      owner = "client!jia",
      name = "ka",
      descriptor = "(III)V"
   )
   public final void method48(int arg0, int arg1, int arg2) {
      if (this.field3901[arg0][arg1] < arg2) {
         this.field3901[arg0][arg1] = (byte)arg2;
      }

   }

   @OriginalMember(
      owner = "client!jia",
      name = "<init>",
      descriptor = "(Lmi;IIII[[I[[II)V"
   )
   public class257(class20 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field3920 = arg0;
      this.field3899 = arg2;
      this.field3910 = new byte[arg3 + 1][arg4 + 1];
      int var9 = this.field3920.field289 >> 9;

      for(int var10 = 1; var10 < arg4; ++var10) {
         for(int var11 = 1; var11 < arg3; ++var11) {
            int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
            int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var14 * var14 + arg7 * 512 + var13 * var13));
            int var16 = (var13 << 8) / var15;
            int var17 = arg7 * -512 / var15;
            int var18 = (var14 << 8) / var15;
            int var19 = (this.field3920.field296 * var18 + this.field3920.field292 * var16 + this.field3920.field278 * var17 >> 17) + var9;
            int var20 = var19 >> 1;
            if (var20 < 2) {
               var20 = 2;
            } else if (var20 > 126) {
               var20 = 126;
            }

            this.field3910[var11][var10] = (byte)var20;
         }
      }

      this.field3901 = new byte[arg3 + 1][arg4 + 1];
   }

   @OriginalMember(
      owner = "client!jia",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method49(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IILnha;[I[I[I[II)V"
   )
   private final void method2191(int arg0, int arg1, class335 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
      class189 var9 = this.field3908[arg0][arg1];
      if (var9 != null) {
         if ((var9.field2782 & 2) == 0) {
            if (arg7 != 0) {
               if ((var9.field2782 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            int var10 = super.field10672 * arg0;
            int var11 = super.field10672 + var10;
            int var12 = super.field10672 * arg1;
            int var13 = super.field10672 + var12;
            float var16;
            float var17;
            float var18;
            float var19;
            int var23;
            int var25;
            int var27;
            int var29;
            int var31;
            int var33;
            int var35;
            int var37;
            if ((var9.field2782 & 1) != 0) {
               int var14 = super.field10669[arg0][arg1];
               float var15 = (float)var14 * this.field3914;
               if (this.field3903 == -1) {
                  var16 = (float)var12 * this.field3912 + (float)var10 * this.field3916 + var15 + this.field3905;
                  if (var16 <= (float)this.field3920.field309) {
                     return;
                  }

                  var17 = (float)var12 * this.field3912 + (float)var11 * this.field3916 + var15 + this.field3905;
                  if (var17 <= (float)this.field3920.field309) {
                     return;
                  }

                  var18 = (float)var13 * this.field3912 + (float)var11 * this.field3916 + var15 + this.field3905;
                  if (var18 <= (float)this.field3920.field309) {
                     return;
                  }

                  var19 = (float)var13 * this.field3912 + (float)var10 * this.field3916 + var15 + this.field3905;
                  if (var19 <= (float)this.field3920.field309) {
                     return;
                  }
               } else {
                  var16 = (float)var12 * this.field3912 + (float)var10 * this.field3916 + var15 + this.field3905;
                  var17 = (float)var12 * this.field3912 + (float)var11 * this.field3916 + var15 + this.field3905;
                  var18 = (float)var13 * this.field3912 + (float)var11 * this.field3916 + var15 + this.field3905;
                  var19 = (float)var13 * this.field3912 + (float)var10 * this.field3916 + var15 + this.field3905;
               }

               float var20 = (float)var14 * this.field3902;
               float var21 = (float)var14 * this.field3907;
               if (this.field3903 == -1) {
                  float var22 = (float)var12 * this.field3900 + (float)var10 * this.field3915 + var20 + this.field3913;
                  var23 = (int)((float)this.field3920.field307 * var22 / var16) + arg2.field4961;
                  float var24 = (float)var12 * this.field3919 + (float)var10 * this.field3906 + var21 + this.field3909;
                  var25 = (int)((float)this.field3920.field286 * var24 / var16) + arg2.field4954;
                  float var26 = (float)var12 * this.field3900 + (float)var11 * this.field3915 + var20 + this.field3913;
                  var27 = (int)((float)this.field3920.field307 * var26 / var17) + arg2.field4961;
                  float var28 = (float)var12 * this.field3919 + (float)var11 * this.field3906 + var21 + this.field3909;
                  var29 = (int)((float)this.field3920.field286 * var28 / var17) + arg2.field4954;
                  float var30 = (float)var13 * this.field3900 + (float)var11 * this.field3915 + var20 + this.field3913;
                  var31 = (int)((float)this.field3920.field307 * var30 / var18) + arg2.field4961;
                  float var32 = (float)var13 * this.field3919 + (float)var11 * this.field3906 + var21 + this.field3909;
                  var33 = (int)((float)this.field3920.field286 * var32 / var18) + arg2.field4954;
                  float var34 = (float)var13 * this.field3900 + (float)var10 * this.field3915 + var20 + this.field3913;
                  var35 = (int)((float)this.field3920.field307 * var34 / var19) + arg2.field4961;
                  float var36 = (float)var13 * this.field3919 + (float)var10 * this.field3906 + var21 + this.field3909;
                  var37 = (int)((float)this.field3920.field286 * var36 / var19) + arg2.field4954;
               } else {
                  float var38 = (float)var12 * this.field3900 + (float)var10 * this.field3915 + var20 + this.field3913;
                  var23 = (int)((float)this.field3920.field307 * var38 / (float)this.field3903) + arg2.field4961;
                  float var39 = (float)var12 * this.field3919 + (float)var10 * this.field3906 + var21 + this.field3909;
                  var25 = (int)((float)this.field3920.field286 * var39 / (float)this.field3903) + arg2.field4954;
                  float var40 = (float)var12 * this.field3900 + (float)var11 * this.field3915 + var20 + this.field3913;
                  var27 = (int)((float)this.field3920.field307 * var40 / (float)this.field3903) + arg2.field4961;
                  float var41 = (float)var12 * this.field3919 + (float)var11 * this.field3906 + var21 + this.field3909;
                  var29 = (int)((float)this.field3920.field286 * var41 / (float)this.field3903) + arg2.field4954;
                  float var42 = (float)var13 * this.field3900 + (float)var11 * this.field3915 + var20 + this.field3913;
                  var31 = (int)((float)this.field3920.field307 * var42 / (float)this.field3903) + arg2.field4961;
                  float var43 = (float)var13 * this.field3919 + (float)var11 * this.field3906 + var21 + this.field3909;
                  var33 = (int)((float)this.field3920.field286 * var43 / (float)this.field3903) + arg2.field4954;
                  float var44 = (float)var13 * this.field3900 + (float)var10 * this.field3915 + var20 + this.field3913;
                  var35 = (int)((float)this.field3920.field307 * var44 / (float)this.field3903) + arg2.field4961;
                  float var45 = (float)var13 * this.field3919 + (float)var10 * this.field3906 + var21 + this.field3909;
                  var37 = (int)((float)this.field3920.field286 * var45 / (float)this.field3903) + arg2.field4954;
               }
            } else {
               int var46 = super.field10669[arg0][arg1];
               int var47 = super.field10669[arg0 + 1][arg1];
               int var48 = super.field10669[arg0 + 1][arg1 + 1];
               int var49 = super.field10669[arg0][arg1 + 1];
               if (this.field3903 == -1) {
                  var16 = (float)var12 * this.field3912 + (float)var10 * this.field3916 + (float)var46 * this.field3914 + this.field3905;
                  if (var16 <= (float)this.field3920.field309) {
                     return;
                  }

                  var17 = (float)var12 * this.field3912 + (float)var11 * this.field3916 + (float)var47 * this.field3914 + this.field3905;
                  if (var17 <= (float)this.field3920.field309) {
                     return;
                  }

                  var18 = (float)var13 * this.field3912 + (float)var11 * this.field3916 + (float)var48 * this.field3914 + this.field3905;
                  if (var18 <= (float)this.field3920.field309) {
                     return;
                  }

                  var19 = (float)var13 * this.field3912 + (float)var10 * this.field3916 + (float)var49 * this.field3914 + this.field3905;
                  if (var19 <= (float)this.field3920.field309) {
                     return;
                  }

                  float var50 = (float)var12 * this.field3900 + (float)var10 * this.field3915 + (float)var46 * this.field3902 + this.field3913;
                  var23 = (int)((float)this.field3920.field307 * var50 / var16) + arg2.field4961;
                  float var51 = (float)var12 * this.field3919 + (float)var10 * this.field3906 + (float)var46 * this.field3907 + this.field3909;
                  var25 = (int)((float)this.field3920.field286 * var51 / var16) + arg2.field4954;
                  float var52 = (float)var12 * this.field3900 + (float)var11 * this.field3915 + (float)var47 * this.field3902 + this.field3913;
                  var27 = (int)((float)this.field3920.field307 * var52 / var17) + arg2.field4961;
                  float var53 = (float)var12 * this.field3919 + (float)var11 * this.field3906 + (float)var47 * this.field3907 + this.field3909;
                  var29 = (int)((float)this.field3920.field286 * var53 / var17) + arg2.field4954;
                  float var54 = (float)var13 * this.field3900 + (float)var11 * this.field3915 + (float)var48 * this.field3902 + this.field3913;
                  var31 = (int)((float)this.field3920.field307 * var54 / var18) + arg2.field4961;
                  float var55 = (float)var13 * this.field3919 + (float)var11 * this.field3906 + (float)var48 * this.field3907 + this.field3909;
                  var33 = (int)((float)this.field3920.field286 * var55 / var18) + arg2.field4954;
                  float var56 = (float)var13 * this.field3900 + (float)var10 * this.field3915 + (float)var49 * this.field3902 + this.field3913;
                  var35 = (int)((float)this.field3920.field307 * var56 / var19) + arg2.field4961;
                  float var57 = (float)var13 * this.field3919 + (float)var10 * this.field3906 + (float)var49 * this.field3907 + this.field3909;
                  var37 = (int)((float)this.field3920.field286 * var57 / var19) + arg2.field4954;
               } else {
                  var16 = (float)var12 * this.field3912 + (float)var10 * this.field3916 + (float)var46 * this.field3914 + this.field3905;
                  var17 = (float)var12 * this.field3912 + (float)var11 * this.field3916 + (float)var47 * this.field3914 + this.field3905;
                  var18 = (float)var13 * this.field3912 + (float)var11 * this.field3916 + (float)var48 * this.field3914 + this.field3905;
                  var19 = (float)var13 * this.field3912 + (float)var10 * this.field3916 + (float)var49 * this.field3914 + this.field3905;
                  float var58 = (float)var12 * this.field3900 + (float)var10 * this.field3915 + (float)var46 * this.field3902 + this.field3913;
                  var23 = (int)((float)this.field3920.field307 * var58 / (float)this.field3903) + arg2.field4961;
                  float var59 = (float)var12 * this.field3919 + (float)var10 * this.field3906 + (float)var46 * this.field3907 + this.field3909;
                  var25 = (int)((float)this.field3920.field286 * var59 / (float)this.field3903) + arg2.field4954;
                  float var60 = (float)var12 * this.field3900 + (float)var11 * this.field3915 + (float)var47 * this.field3902 + this.field3913;
                  var27 = (int)((float)this.field3920.field307 * var60 / (float)this.field3903) + arg2.field4961;
                  float var61 = (float)var12 * this.field3919 + (float)var11 * this.field3906 + (float)var47 * this.field3907 + this.field3909;
                  var29 = (int)((float)this.field3920.field286 * var61 / (float)this.field3903) + arg2.field4954;
                  float var62 = (float)var13 * this.field3900 + (float)var11 * this.field3915 + (float)var48 * this.field3902 + this.field3913;
                  var31 = (int)((float)this.field3920.field307 * var62 / (float)this.field3903) + arg2.field4961;
                  float var63 = (float)var13 * this.field3919 + (float)var11 * this.field3906 + (float)var48 * this.field3907 + this.field3909;
                  var33 = (int)((float)this.field3920.field286 * var63 / (float)this.field3903) + arg2.field4954;
                  float var64 = (float)var13 * this.field3900 + (float)var10 * this.field3915 + (float)var49 * this.field3902 + this.field3913;
                  var35 = (int)((float)this.field3920.field307 * var64 / (float)this.field3903) + arg2.field4961;
                  float var65 = (float)var13 * this.field3919 + (float)var10 * this.field3906 + (float)var49 * this.field3907 + this.field3909;
                  var37 = (int)((float)this.field3920.field286 * var65 / (float)this.field3903) + arg2.field4954;
               }
            }

            if (this.field3903 == -1) {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field4958 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field4952 || var35 > arg2.field4952 || var27 > arg2.field4952;
                  if (var9.field2787 >= 0) {
                     arg2.method2689((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class584.field8198[var9.field2783 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2785 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2781 & 65535] & 16777215, 0, 0, 0, 0, var9.field2787);
                  } else {
                     arg2.method2673((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field2783 & 65535), (float)(var9.field2785 & 65535), (float)(var9.field2781 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field4958 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field4952 || var27 > arg2.field4952 || var35 > arg2.field4952;
                  if (var9.field2787 >= 0) {
                     arg2.method2689((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class584.field8198[var9.field2784 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2781 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2785 & 65535] & 16777215, 0, 0, 0, 0, var9.field2787);
                     return;
                  }

                  arg2.method2673((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field2784 & 65535), (float)(var9.field2781 & 65535), (float)(var9.field2785 & 65535));
                  return;
               }
            } else {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field4958 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field4952 || var35 > arg2.field4952 || var27 > arg2.field4952;
                  if (var9.field2787 >= 0) {
                     arg2.method2689((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class584.field8198[var9.field2783 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2785 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2781 & 65535] & 16777215, 0, 0, 0, 0, var9.field2787);
                  } else {
                     arg2.method2673((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field2783 & 65535), (float)(var9.field2785 & 65535), (float)(var9.field2781 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field4958 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field4952 || var27 > arg2.field4952 || var35 > arg2.field4952;
                  if (var9.field2787 >= 0) {
                     arg2.method2689((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class584.field8198[var9.field2784 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2781 & 65535] & 16777215, -16777216 | class584.field8198[var9.field2785 & 65535] & 16777215, 0, 0, 0, 0, var9.field2787);
                     return;
                  }

                  arg2.method2673((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field2784 & 65535), (float)(var9.field2781 & 65535), (float)(var9.field2785 & 65535));
               }
            }

         }
      } else {
         class404 var66 = this.field3917[arg0][arg1];
         if (var66 != null) {
            if (arg7 != 0) {
               if ((var66.field5949 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            if (this.field3903 == -1) {
               for(int var67 = 0; var67 < var66.field5952; ++var67) {
                  int var68 = (arg0 << super.field10671) + var66.field5945[var67];
                  short var69 = var66.field5951[var67];
                  int var70 = (arg1 << super.field10671) + var66.field5943[var67];
                  float var71 = (float)var70 * this.field3912 + (float)var68 * this.field3916 + (float)var69 * this.field3914 + this.field3905;
                  if (var71 <= (float)this.field3920.field309) {
                     return;
                  }

                  float var72 = (float)var70 * this.field3900 + (float)var68 * this.field3915 + (float)var69 * this.field3902 + this.field3913;
                  float var73 = (float)var70 * this.field3919 + (float)var68 * this.field3906 + (float)var69 * this.field3907 + this.field3909;
                  arg3[var67] = (int)((float)this.field3920.field307 * var72 / var71) + arg2.field4961;
                  arg4[var67] = (int)((float)this.field3920.field286 * var73 / var71) + arg2.field4954;
                  arg5[var67] = (int)var71;
               }
            } else {
               for(int var74 = 0; var74 < var66.field5952; ++var74) {
                  int var110 = (arg0 << super.field10671) + var66.field5945[var74];
                  short var111 = var66.field5951[var74];
                  int var112 = (arg1 << super.field10671) + var66.field5943[var74];
                  float var113 = (float)var112 * this.field3912 + (float)var110 * this.field3916 + (float)var111 * this.field3914 + this.field3905;
                  float var114 = (float)var112 * this.field3900 + (float)var110 * this.field3915 + (float)var111 * this.field3902 + this.field3913;
                  float var115 = (float)var112 * this.field3919 + (float)var110 * this.field3906 + (float)var111 * this.field3907 + this.field3909;
                  arg3[var74] = (int)((float)this.field3920.field307 * var114 / (float)this.field3903) + arg2.field4961;
                  arg4[var74] = (int)((float)this.field3920.field286 * var115 / (float)this.field3903) + arg2.field4954;
                  arg5[var74] = (int)var113;
               }
            }

            if (var66.field5942 != null) {
               if (this.field3903 == -1) {
                  for(int var75 = 0; var75 < var66.field5950; ++var75) {
                     short var76 = var66.field5946[var75];
                     short var77 = var66.field5954[var75];
                     short var78 = var66.field5947[var75];
                     int var79 = arg3[var76];
                     int var80 = arg3[var77];
                     int var81 = arg3[var78];
                     int var82 = arg4[var76];
                     int var83 = arg4[var77];
                     int var84 = arg4[var78];
                     if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                        arg2.field4958 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field4952 || var80 > arg2.field4952 || var81 > arg2.field4952;
                        short var85 = var66.field5942[var75];
                        if (var85 != -1) {
                           arg2.method2689((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)var66.field5945[var76] / (float)super.field10672, (float)var66.field5945[var77] / (float)super.field10672, (float)var66.field5945[var78] / (float)super.field10672, (float)var66.field5943[var76] / (float)super.field10672, (float)var66.field5943[var77] / (float)super.field10672, (float)var66.field5943[var78] / (float)super.field10672, -16777216 | class584.field8198[var66.field5944[var76] & 65535] & 16777215, -16777216 | class584.field8198[var66.field5944[var77] & 65535] & 16777215, -16777216 | class584.field8198[var66.field5944[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                        } else {
                           int var86 = var66.field5953[var75];
                           if (var86 != -1) {
                              arg2.method2673((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)class210.method1812(var66.field5944[var76], -68, var86), (float)class210.method1812(var66.field5944[var77], -39, var86), (float)class210.method1812(var66.field5944[var78], -48, var86));
                           }
                        }
                     }
                  }

                  return;
               }

               for(int var87 = 0; var87 < var66.field5950; ++var87) {
                  short var88 = var66.field5946[var87];
                  short var89 = var66.field5954[var87];
                  short var90 = var66.field5947[var87];
                  int var91 = arg3[var88];
                  int var92 = arg3[var89];
                  int var93 = arg3[var90];
                  int var94 = arg4[var88];
                  int var95 = arg4[var89];
                  int var96 = arg4[var90];
                  if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                     arg2.field4958 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field4952 || var92 > arg2.field4952 || var93 > arg2.field4952;
                     short var97 = var66.field5942[var87];
                     if (var97 != -1) {
                        arg2.method2689((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)var66.field5945[var88] / (float)super.field10672, (float)var66.field5945[var89] / (float)super.field10672, (float)var66.field5945[var90] / (float)super.field10672, (float)var66.field5943[var88] / (float)super.field10672, (float)var66.field5943[var89] / (float)super.field10672, (float)var66.field5943[var90] / (float)super.field10672, -16777216 | class584.field8198[var66.field5944[var88] & 65535] & 16777215, -16777216 | class584.field8198[var66.field5944[var89] & 65535] & 16777215, -16777216 | class584.field8198[var66.field5944[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                     } else {
                        int var98 = var66.field5953[var87];
                        if (var98 != -1) {
                           arg2.method2673((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)class210.method1812(var66.field5944[var88], -96, var98), (float)class210.method1812(var66.field5944[var89], -86, var98), (float)class210.method1812(var66.field5944[var90], -47, var98));
                        }
                     }
                  }
               }

               return;
            }

            for(int var99 = 0; var99 < var66.field5950; ++var99) {
               short var100 = var66.field5946[var99];
               short var101 = var66.field5954[var99];
               short var102 = var66.field5947[var99];
               int var103 = arg3[var100];
               int var104 = arg3[var101];
               int var105 = arg3[var102];
               int var106 = arg4[var100];
               int var107 = arg4[var101];
               int var108 = arg4[var102];
               if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                  int var109 = var66.field5953[var99];
                  if (var109 != -1) {
                     arg2.field4958 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field4952 || var104 > arg2.field4952 || var105 > arg2.field4952;
                     arg2.method2673((float)var106, (float)var107, (float)var108, (float)var103, (float)var104, (float)var105, (float)arg5[var100], (float)arg5[var101], (float)arg5[var102], (float)class210.method1812(var66.field5944[var100], -108, var109), (float)class210.method1812(var66.field5944[var101], -106, var109), (float)class210.method1812(var66.field5944[var102], -36, var109));
                  }
               }
            }
         }

      }
   }
}
