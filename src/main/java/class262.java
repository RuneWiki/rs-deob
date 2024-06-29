import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class262 extends class297 {
   @OriginalMember(
      owner = "client!nha",
      name = "D",
      descriptor = "[I"
   )
   private int[] field4303;
   @OriginalMember(
      owner = "client!nha",
      name = "A",
      descriptor = "[I"
   )
   private int[] field4306;
   @OriginalMember(
      owner = "client!nha",
      name = "w",
      descriptor = "Lsw;"
   )
   private class70 field4305;
   @OriginalMember(
      owner = "client!nha",
      name = "u",
      descriptor = "Lsw;"
   )
   private class70 field4307;
   @OriginalMember(
      owner = "client!nha",
      name = "v",
      descriptor = "Lsw;"
   )
   private class70 field4309;
   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "[Lsw;"
   )
   private class70[] field4312;
   @OriginalMember(
      owner = "client!nha",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4314 = new String[]{method2281(method2280("N.>-")), method2281(method2280("[u|om")), method2281(method2280("N33oV\b")), method2281(method2280("N33o,I5;5.\b")), method2281(method2280("N33oT\b")), method2281(method2280("N33oU\b")), method2281(method2280("N33oQ\b")), method2281(method2280("N33oS\b")), method2281(method2280("N33oR\b"))};
   @OriginalMember(
      owner = "client!nha",
      name = "x",
      descriptor = "I"
   )
   public static int field4301;
   @OriginalMember(
      owner = "client!nha",
      name = "E",
      descriptor = "I"
   )
   public static int field4302;
   @OriginalMember(
      owner = "client!nha",
      name = "F",
      descriptor = "I"
   )
   public static int field4304;
   @OriginalMember(
      owner = "client!nha",
      name = "H",
      descriptor = "I"
   )
   public static int field4310;
   @OriginalMember(
      owner = "client!nha",
      name = "I",
      descriptor = "I"
   )
   public static int field4311;
   @OriginalMember(
      owner = "client!nha",
      name = "y",
      descriptor = "I"
   )
   public static int field4313;
   @OriginalMember(
      owner = "client!nha",
      name = "C",
      descriptor = "Z"
   )
   public static boolean field4308;

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(ZLd;IIZLrr;DI)[I",
      line = 8
   )
   public final int[] method2274(boolean arg0, class150 arg1, int arg2, int arg3, boolean arg4, class678 arg5, double arg6, int arg7) {
      boolean var10 = client.field1786;

      try {
         ++field4310;
         class624.field9056 = arg5;
         class419.field6480 = arg1;
         int var11 = 0;
         if (var10) {
            this.field4312[var11].method538(arg7, -79, arg2);
            ++var11;
         }

         while(true) {
            while(~var11 > ~this.field4312.length) {
               this.field4312[var11].method538(arg7, -79, arg2);
               ++var11;
            }

            int var12 = -115 / ((51 - arg3) / 56);
            class224.method1945(arg6, 111);
            class689.method5073(-1, arg2, arg7);
            int[] var13 = new int[arg2 * arg7];
            if (!var10) {
               int var14;
               int var15;
               byte var16;
               label216: {
                  if (arg0) {
                     var14 = arg2 + -1;
                     var15 = -1;
                     var16 = -1;
                     if (!var10) {
                        break label216;
                     }
                  }

                  var16 = 1;
                  var15 = arg2;
                  var14 = 0;
               }

               int var32;
               label192: {
                  int var17 = 0;
                  int var18 = 0;
                  int[] var19;
                  int[] var20;
                  int[] var21;
                  int[] var22;
                  int[][] var23;
                  if (var10) {
                     if (this.field4307.field933) {
                        var19 = this.field4307.method8((byte)87, var18);
                        var20 = var19;
                        var21 = var19;
                        var22 = var19;
                        if (var10) {
                           var23 = this.field4307.method537(32, var18);
                           var22 = var23[1];
                           var21 = var23[2];
                           var20 = var23[0];
                           if (arg4) {
                              var17 = var18;
                           }
                        } else if (arg4) {
                           var17 = var18;
                        }
                     } else {
                        var23 = this.field4307.method537(32, var18);
                        var22 = var23[1];
                        var21 = var23[2];
                        var20 = var23[0];
                        if (arg4) {
                           var17 = var18;
                        }
                     }
                  } else if (~var18 <= ~arg7) {
                     var32 = 0;
                     if (!var10) {
                        break label192;
                     }

                     var23 = this.field4307.method537(32, var18);
                     var22 = var23[1];
                     var21 = var23[2];
                     var20 = var23[0];
                     if (arg4) {
                        var17 = var18;
                     }
                  } else if (this.field4307.field933) {
                     var19 = this.field4307.method8((byte)87, var18);
                     var20 = var19;
                     var21 = var19;
                     var22 = var19;
                     if (var10) {
                        var23 = this.field4307.method537(32, var18);
                        var22 = var23[1];
                        var21 = var23[2];
                        var20 = var23[0];
                        if (arg4) {
                           var17 = var18;
                        }
                     } else if (arg4) {
                        var17 = var18;
                     }
                  } else {
                     var23 = this.field4307.method537(32, var18);
                     var22 = var23[1];
                     var21 = var23[2];
                     var20 = var23[0];
                     if (arg4) {
                        var17 = var18;
                     }
                  }

                  while(true) {
                     int var24 = var14;
                     if (var10 || ~var15 != ~var14) {
                        do {
                           int var25 = var20[var24] >> 4;
                           if (~var25 < -256) {
                              var25 = 255;
                           }

                           if (var25 < 0) {
                              var25 = 0;
                           }

                           int var26 = var22[var24] >> 4;
                           if (~var26 < -256) {
                              var26 = 255;
                           }

                           if (~var26 > -1) {
                              var26 = 0;
                           }

                           int var27 = var21[var24] >> 4;
                           if (~var27 < -256) {
                              var27 = 255;
                           }

                           int var28 = class571.field8457[var26];
                           int var29 = class571.field8457[var25];
                           if (var27 < 0) {
                              var27 = 0;
                           }

                           int var30 = class571.field8457[var27];
                           int var31 = (var29 << 16) + ((var28 << 8) - -var30);
                           if (~var31 != -1) {
                              var31 |= -16777216;
                           }

                           var13[var17++] = var31;
                           if (arg4) {
                              var17 += arg2 + -1;
                           }

                           var24 += var16;
                        } while(~var15 != ~var24);
                     }

                     ++var18;
                     if (~var18 <= ~arg7) {
                        var32 = 0;
                        if (!var10) {
                           break;
                        }

                        var23 = this.field4307.method537(32, var18);
                        var22 = var23[1];
                        var21 = var23[2];
                        var20 = var23[0];
                        if (arg4) {
                           var17 = var18;
                        }
                     } else if (this.field4307.field933) {
                        var19 = this.field4307.method8((byte)87, var18);
                        var20 = var19;
                        var21 = var19;
                        var22 = var19;
                        if (var10) {
                           var23 = this.field4307.method537(32, var18);
                           var22 = var23[1];
                           var21 = var23[2];
                           var20 = var23[0];
                           if (arg4) {
                              var17 = var18;
                           }
                        } else if (arg4) {
                           var17 = var18;
                        }
                     } else {
                        var23 = this.field4307.method537(32, var18);
                        var22 = var23[1];
                        var21 = var23[2];
                        var20 = var23[0];
                        if (arg4) {
                           var17 = var18;
                        }
                     }
                  }
               }

               if (var10) {
                  this.field4312[var32].method541(102);
                  ++var32;
               }

               while(true) {
                  while(~this.field4312.length < ~var32) {
                     this.field4312[var32].method541(102);
                     ++var32;
                  }

                  if (!var10) {
                     return var13;
                  }

                  ++var32;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var34) {
         throw class482.method3757(var34, field4314[6] + arg0 + ',' + (arg1 != null ? field4314[1] : field4314[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4314[1] : field4314[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(III)Z",
      line = 143
   )
   public static final boolean method2275(int arg0, int arg1, int arg2) {
      try {
         ++field4311;
         if (arg0 >= 0) {
            method2275(-12, -27, 89);
         }

         return (256 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4314[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Lrr;Ld;I)Z",
      line = 158
   )
   public final boolean method2276(class678 arg0, class150 arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         int var6;
         label105: {
            label104: {
               ++field4302;
               if (class56.field694 >= 0) {
                  int var5 = 0;
                  if (var4) {
                     if (!arg0.method4994(this.field4306[var5], 100, class56.field694)) {
                        return false;
                     }

                     ++var5;
                  }

                  while(true) {
                     while(var5 < this.field4306.length) {
                        if (!arg0.method4994(this.field4306[var5], 100, class56.field694)) {
                           return false;
                        }

                        ++var5;
                     }

                     if (!var4) {
                        if (!var4) {
                           var6 = arg2;
                           if (!var4) {
                              break label105;
                           }

                           var6 = arg2 + 1;
                           break label104;
                        }
                        break;
                     }

                     ++var5;
                  }
               }

               var6 = 0;
               if (var4) {
                  if (!arg0.method5002(this.field4306[var6], (byte)109)) {
                     return false;
                  }

                  ++var6;
               }
            }

            while(true) {
               while(this.field4306.length > var6) {
                  if (!arg0.method5002(this.field4306[var6], (byte)109)) {
                     return false;
                  }

                  ++var6;
               }

               var6 = arg2;
               if (!var4) {
                  break;
               }

               var6 = arg2 + 1;
            }
         }

         if (var4) {
            if (!arg1.method1372(-111, this.field4303[var6])) {
               return false;
            }

            ++var6;
         }

         while(true) {
            while(this.field4303.length > var6) {
               if (!arg1.method1372(-111, this.field4303[var6])) {
                  return false;
               }

               ++var6;
            }

            if (!var4) {
               return true;
            }

            if (false) {
               return false;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4314[2] + (arg0 != null ? field4314[1] : field4314[0]) + ',' + (arg1 != null ? field4314[1] : field4314[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "c",
      descriptor = "(I)Lmq;",
      line = 207
   )
   public static final class577 method2277(int arg0) {
      try {
         ++field4304;
         class577 var1 = class702.method5167(102);
         var1.field8532 = 0;
         if (arg0 != 32347) {
            method2275(23, 15, 63);
         }

         var1.field8535 = null;
         var1.field8531 = new class102(5000);
         return var1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4314[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Lrr;ZLd;IZI)[F",
      line = 228
   )
   public final float[] method2278(class678 arg0, boolean arg1, class150 arg2, int arg3, boolean arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         class419.field6480 = arg2;
         class624.field9056 = arg0;
         ++field4301;
         if (!arg1) {
            this.method2278((class678)null, false, (class150)null, -10, true, -41);
         }

         int var8 = 0;
         if (var7) {
            this.field4312[var8].method538(arg3, -122, arg5);
            ++var8;
         }

         while(true) {
            while(this.field4312.length > var8) {
               this.field4312[var8].method538(arg3, -122, arg5);
               ++var8;
            }

            class689.method5073(-1, arg5, arg3);
            float[] var9 = new float[arg3 * arg5 * 4];
            int var10 = 0;
            int var11 = 0;
            if (!var7) {
               int var22;
               label273: {
                  int[] var12;
                  int[] var13;
                  int[] var14;
                  int[] var15;
                  int[][] var16;
                  int[] var17;
                  int[] var18;
                  int var19;
                  float var20;
                  float var21;
                  if (var7) {
                     if (this.field4307.field933) {
                        var12 = this.field4307.method8((byte)87, var11);
                        var13 = var12;
                        var14 = var12;
                        var15 = var12;
                        if (var7) {
                           var16 = this.field4307.method537(32, var11);
                           var14 = var16[2];
                           var13 = var16[0];
                           var15 = var16[1];
                        }
                     } else {
                        var16 = this.field4307.method537(32, var11);
                        var14 = var16[2];
                        var13 = var16[0];
                        var15 = var16[1];
                     }

                     if (!this.field4309.field933) {
                        var17 = this.field4309.method537(32, var11)[0];
                        if (var7) {
                           var17 = this.field4309.method8((byte)87, var11);
                        }
                     } else {
                        var17 = this.field4309.method8((byte)87, var11);
                     }

                     if (arg4) {
                        var10 = var11 << 2;
                     }

                     if (this.field4305.field933) {
                        var18 = this.field4305.method8((byte)87, var11);
                        if (var7) {
                           var18 = this.field4305.method537(32, var11)[0];
                        }
                     } else {
                        var18 = this.field4305.method537(32, var11)[0];
                     }

                     var19 = arg5 + -1;
                     if (var7) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (var20 < 0.0F) {
                           var20 = 0.0F;
                           if (var7 && var20 > 1.0F) {
                              var20 = 1.0F;
                           }
                        } else if (var20 > 1.0F) {
                           var20 = 1.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = var20;
                        if (arg4) {
                           var10 += (arg5 << 2) - 4;
                        }

                        --var19;
                     }
                  } else {
                     if (var11 >= arg3) {
                        var22 = 0;
                        if (!var7) {
                           break label273;
                        }

                        var16 = this.field4307.method537(32, var11);
                        var14 = var16[2];
                        var13 = var16[0];
                        var15 = var16[1];
                     } else if (this.field4307.field933) {
                        var12 = this.field4307.method8((byte)87, var11);
                        var13 = var12;
                        var14 = var12;
                        var15 = var12;
                        if (var7) {
                           var16 = this.field4307.method537(32, var11);
                           var14 = var16[2];
                           var13 = var16[0];
                           var15 = var16[1];
                        }
                     } else {
                        var16 = this.field4307.method537(32, var11);
                        var14 = var16[2];
                        var13 = var16[0];
                        var15 = var16[1];
                     }

                     if (!this.field4309.field933) {
                        var17 = this.field4309.method537(32, var11)[0];
                        if (var7) {
                           var17 = this.field4309.method8((byte)87, var11);
                        }
                     } else {
                        var17 = this.field4309.method8((byte)87, var11);
                     }

                     if (arg4) {
                        var10 = var11 << 2;
                     }

                     if (this.field4305.field933) {
                        var18 = this.field4305.method8((byte)87, var11);
                        if (var7) {
                           var18 = this.field4305.method537(32, var11)[0];
                        }
                     } else {
                        var18 = this.field4305.method537(32, var11)[0];
                     }

                     var19 = arg5 + -1;
                     if (var7) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (var20 < 0.0F) {
                           var20 = 0.0F;
                           if (var7 && var20 > 1.0F) {
                              var20 = 1.0F;
                           }
                        } else if (var20 > 1.0F) {
                           var20 = 1.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = var20;
                        if (arg4) {
                           var10 += (arg5 << 2) - 4;
                        }

                        --var19;
                     }
                  }

                  while(true) {
                     while(var19 >= 0) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (var20 < 0.0F) {
                           var20 = 0.0F;
                           if (var7 && var20 > 1.0F) {
                              var20 = 1.0F;
                           }
                        } else if (var20 > 1.0F) {
                           var20 = 1.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = var20;
                        if (arg4) {
                           var10 += (arg5 << 2) - 4;
                        }

                        --var19;
                     }

                     ++var11;
                     if (var11 >= arg3) {
                        var22 = 0;
                        if (!var7) {
                           break;
                        }

                        var16 = this.field4307.method537(32, var11);
                        var14 = var16[2];
                        var13 = var16[0];
                        var15 = var16[1];
                     } else if (this.field4307.field933) {
                        var12 = this.field4307.method8((byte)87, var11);
                        var13 = var12;
                        var14 = var12;
                        var15 = var12;
                        if (var7) {
                           var16 = this.field4307.method537(32, var11);
                           var14 = var16[2];
                           var13 = var16[0];
                           var15 = var16[1];
                        }
                     } else {
                        var16 = this.field4307.method537(32, var11);
                        var14 = var16[2];
                        var13 = var16[0];
                        var15 = var16[1];
                     }

                     if (!this.field4309.field933) {
                        var17 = this.field4309.method537(32, var11)[0];
                        if (var7) {
                           var17 = this.field4309.method8((byte)87, var11);
                        }
                     } else {
                        var17 = this.field4309.method8((byte)87, var11);
                     }

                     if (arg4) {
                        var10 = var11 << 2;
                     }

                     if (this.field4305.field933) {
                        var18 = this.field4305.method8((byte)87, var11);
                        if (var7) {
                           var18 = this.field4305.method537(32, var11)[0];
                        }
                     } else {
                        var18 = this.field4305.method537(32, var11)[0];
                     }

                     var19 = arg5 + -1;
                     if (var7) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (var20 < 0.0F) {
                           var20 = 0.0F;
                           if (var7 && var20 > 1.0F) {
                              var20 = 1.0F;
                           }
                        } else if (var20 > 1.0F) {
                           var20 = 1.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = var20;
                        if (arg4) {
                           var10 += (arg5 << 2) - 4;
                        }

                        --var19;
                     }
                  }
               }

               if (var7) {
                  this.field4312[var22].method541(-92);
                  ++var22;
               }

               while(true) {
                  while(~var22 > ~this.field4312.length) {
                     this.field4312[var22].method541(-92);
                     ++var22;
                  }

                  if (!var7) {
                     return var9;
                  }

                  ++var22;
               }
            }

            ++var8;
         }
      } catch (RuntimeException var24) {
         throw class482.method3757(var24, field4314[8] + (arg0 != null ? field4314[1] : field4314[0]) + ',' + arg1 + ',' + (arg2 != null ? field4314[1] : field4314[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(ILrr;DZLd;II)[I",
      line = 338
   )
   public final int[] method2279(int arg0, class678 arg1, double arg2, boolean arg3, class150 arg4, int arg5, int arg6) {
      boolean var9 = client.field1786;

      try {
         class624.field9056 = arg1;
         ++field4313;
         class419.field6480 = arg4;
         int var10 = 0;
         if (var9) {
            this.field4312[var10].method538(arg0, -125, arg6);
            ++var10;
         }

         while(true) {
            while(~var10 > ~this.field4312.length) {
               this.field4312[var10].method538(arg0, -125, arg6);
               ++var10;
            }

            class224.method1945(arg2, -97);
            class689.method5073(-1, arg6, arg0);
            int[] var11 = new int[arg0 * arg6];
            int var12 = 0;
            int var13 = 0;
            if (!var9) {
               int var28;
               label383: {
                  int[][] var14;
                  int[] var15;
                  int[] var16;
                  int[] var17;
                  int[] var18;
                  int[] var19;
                  if (var9) {
                     if (!this.field4307.field933) {
                        var14 = this.field4307.method537(32, var13);
                        var15 = var14[0];
                        var16 = var14[1];
                        var17 = var14[2];
                        if (var9) {
                           var18 = this.field4307.method8((byte)87, var13);
                           var15 = var18;
                           var17 = var18;
                           var16 = var18;
                        }
                     } else {
                        var18 = this.field4307.method8((byte)87, var13);
                        var15 = var18;
                        var17 = var18;
                        var16 = var18;
                     }

                     if (this.field4309.field933) {
                        var19 = this.field4309.method8((byte)87, var13);
                        if (var9) {
                           var19 = this.field4309.method537(32, var13)[0];
                           if (arg3) {
                              var12 = var13;
                           }
                        } else if (arg3) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field4309.method537(32, var13)[0];
                        if (arg3) {
                           var12 = var13;
                        }
                     }
                  } else if (var13 >= arg0) {
                     var28 = arg5;
                     if (!var9) {
                        break label383;
                     }

                     var18 = this.field4307.method8((byte)87, var13);
                     var15 = var18;
                     var17 = var18;
                     var16 = var18;
                     if (this.field4309.field933) {
                        var19 = this.field4309.method8((byte)87, var13);
                        if (var9) {
                           var19 = this.field4309.method537(32, var13)[0];
                           if (arg3) {
                              var12 = var13;
                           }
                        } else if (arg3) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field4309.method537(32, var13)[0];
                        if (arg3) {
                           var12 = var13;
                        }
                     }
                  } else {
                     if (!this.field4307.field933) {
                        var14 = this.field4307.method537(32, var13);
                        var15 = var14[0];
                        var16 = var14[1];
                        var17 = var14[2];
                        if (var9) {
                           var18 = this.field4307.method8((byte)87, var13);
                           var15 = var18;
                           var17 = var18;
                           var16 = var18;
                        }
                     } else {
                        var18 = this.field4307.method8((byte)87, var13);
                        var15 = var18;
                        var17 = var18;
                        var16 = var18;
                     }

                     if (this.field4309.field933) {
                        var19 = this.field4309.method8((byte)87, var13);
                        if (var9) {
                           var19 = this.field4309.method537(32, var13)[0];
                           if (arg3) {
                              var12 = var13;
                           }
                        } else if (arg3) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field4309.method537(32, var13)[0];
                        if (arg3) {
                           var12 = var13;
                        }
                     }
                  }

                  while(true) {
                     int var20 = arg6 + -1;
                     if (var9 || ~var20 <= -1) {
                        do {
                           int var21 = var15[var20] >> 4;
                           int var22;
                           int var23;
                           if (~var21 < -256) {
                              var21 = 255;
                              if (~var21 > -1) {
                                 var21 = 0;
                              }

                              var22 = var16[var20] >> 4;
                              if (~var22 < -256) {
                                 var22 = 255;
                                 if (var22 < 0) {
                                    var22 = 0;
                                 }
                              } else if (var22 < 0) {
                                 var22 = 0;
                              }

                              var23 = var17[var20] >> 4;
                              if (var23 > 255) {
                                 var23 = 255;
                                 if (~var23 > -1) {
                                    var23 = 0;
                                 }
                              } else if (~var23 > -1) {
                                 var23 = 0;
                              }
                           } else {
                              if (~var21 > -1) {
                                 var21 = 0;
                              }

                              var22 = var16[var20] >> 4;
                              if (~var22 < -256) {
                                 var22 = 255;
                                 if (var22 < 0) {
                                    var22 = 0;
                                 }
                              } else if (var22 < 0) {
                                 var22 = 0;
                              }

                              var23 = var17[var20] >> 4;
                              if (var23 > 255) {
                                 var23 = 255;
                                 if (~var23 > -1) {
                                    var23 = 0;
                                 }
                              } else if (~var23 > -1) {
                                 var23 = 0;
                              }
                           }

                           int var24 = class571.field8457[var22];
                           int var25 = class571.field8457[var21];
                           int var26 = class571.field8457[var23];
                           int var27;
                           if (~var25 == -1) {
                              if (~var24 == -1) {
                                 if (var26 != 0) {
                                    var27 = var19[var20] >> 4;
                                    if (var27 > 255) {
                                       var27 = 255;
                                    }

                                    if (var27 < 0) {
                                       var27 = 0;
                                       if (var9) {
                                          var27 = 0;
                                       }
                                    }

                                    var11[var12++] = (var25 << 16) + (var27 << 24) + (var24 << 8) + var26;
                                    if (arg3) {
                                       var12 += arg6 + -1;
                                    }

                                    --var20;
                                 } else {
                                    byte var31 = 0;
                                    var11[var12++] = (var25 << 16) + (var31 << 24) + (var24 << 8) + var26;
                                    if (arg3) {
                                       var12 += arg6 + -1;
                                    }

                                    --var20;
                                 }
                              } else {
                                 var27 = var19[var20] >> 4;
                                 if (var27 > 255) {
                                    var27 = 255;
                                 }

                                 if (var27 < 0) {
                                    var27 = 0;
                                    if (var9) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var25 << 16) + (var27 << 24) + (var24 << 8) + var26;
                                 if (arg3) {
                                    var12 += arg6 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (var27 > 255) {
                                 var27 = 255;
                              }

                              if (var27 < 0) {
                                 var27 = 0;
                                 if (var9) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var25 << 16) + (var27 << 24) + (var24 << 8) + var26;
                              if (arg3) {
                                 var12 += arg6 + -1;
                              }

                              --var20;
                           }
                        } while(~var20 <= -1);
                     }

                     ++var13;
                     if (var13 >= arg0) {
                        var28 = arg5;
                        if (!var9) {
                           break;
                        }

                        var18 = this.field4307.method8((byte)87, var13);
                        var15 = var18;
                        var17 = var18;
                        var16 = var18;
                        if (this.field4309.field933) {
                           var19 = this.field4309.method8((byte)87, var13);
                           if (var9) {
                              var19 = this.field4309.method537(32, var13)[0];
                              if (arg3) {
                                 var12 = var13;
                              }
                           } else if (arg3) {
                              var12 = var13;
                           }
                        } else {
                           var19 = this.field4309.method537(32, var13)[0];
                           if (arg3) {
                              var12 = var13;
                           }
                        }
                     } else {
                        if (!this.field4307.field933) {
                           var14 = this.field4307.method537(32, var13);
                           var15 = var14[0];
                           var16 = var14[1];
                           var17 = var14[2];
                           if (var9) {
                              var18 = this.field4307.method8((byte)87, var13);
                              var15 = var18;
                              var17 = var18;
                              var16 = var18;
                           }
                        } else {
                           var18 = this.field4307.method8((byte)87, var13);
                           var15 = var18;
                           var17 = var18;
                           var16 = var18;
                        }

                        if (this.field4309.field933) {
                           var19 = this.field4309.method8((byte)87, var13);
                           if (var9) {
                              var19 = this.field4309.method537(32, var13)[0];
                              if (arg3) {
                                 var12 = var13;
                              }
                           } else if (arg3) {
                              var12 = var13;
                           }
                        } else {
                           var19 = this.field4309.method537(32, var13)[0];
                           if (arg3) {
                              var12 = var13;
                           }
                        }
                     }
                  }
               }

               if (var9) {
                  this.field4312[var28].method541(81);
                  ++var28;
               }

               while(true) {
                  while(~this.field4312.length < ~var28) {
                     this.field4312[var28].method541(81);
                     ++var28;
                  }

                  if (!var9) {
                     return var11;
                  }

                  ++var28;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field4314[4] + arg0 + ',' + (arg1 != null ? field4314[1] : field4314[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4314[1] : field4314[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "<init>",
      descriptor = "()V",
      line = 476
   )
   public class262() {
      try {
         this.field4303 = new int[0];
         this.field4306 = new int[0];
         this.field4305 = new class420(0);
         this.field4305.field920 = 1;
         this.field4307 = new class420();
         this.field4307.field920 = 1;
         this.field4309 = new class420();
         this.field4312 = new class70[]{this.field4307, this.field4309, this.field4305};
         this.field4309.field920 = 1;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4314[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "<init>",
      descriptor = "(Lica;)V",
      line = 491
   )
   public class262(class354 arg0) {
      boolean var2 = client.field1786;
      super();

      try {
         int var3;
         int var4;
         int var5;
         int[][] var6;
         short var10000;
         label97: {
            var3 = arg0.method2855(-31007);
            var4 = 0;
            var5 = 0;
            var6 = new int[var3][];
            this.field4312 = new class70[var3];
            int var7 = 0;
            if (var2) {
               var10000 = 29544;
            } else if (~var3 >= ~var7) {
               this.field4306 = new int[var4];
               this.field4303 = new int[var5];
               var4 = 0;
               var5 = 0;
               var10000 = 0;
               if (!var2) {
                  break label97;
               }
            } else {
               var10000 = 29544;
            }

            label96:
            while(true) {
               class70 var8 = class113.method1058(var10000, arg0);
               if (~var8.method540((byte)107) <= -1) {
                  ++var4;
                  if (var8.method542(-1) >= 0) {
                     ++var5;
                  }
               } else if (var8.method542(-1) >= 0) {
                  ++var5;
               }

               int var9 = var8.field915.length;
               var6[var7] = new int[var9];
               int var10 = 0;
               if (var2) {
                  var6[var7][var10] = arg0.method2855(-31007);
                  ++var10;
               }

               while(true) {
                  while(var10 < var9) {
                     var6[var7][var10] = arg0.method2855(-31007);
                     ++var10;
                  }

                  this.field4312[var7] = var8;
                  if (!var2) {
                     ++var7;
                     if (~var3 >= ~var7) {
                        this.field4306 = new int[var4];
                        this.field4303 = new int[var5];
                        var4 = 0;
                        var5 = 0;
                        var10000 = 0;
                        if (!var2) {
                           break label96;
                        }
                     } else {
                        var10000 = 29544;
                     }
                     break;
                  }

                  ++var10;
               }
            }
         }

         int var11 = var10000;
         class70 var12;
         int var13;
         int var14;
         Object var17;
         class262 var20;
         if (var2) {
            var12 = this.field4312[var11];
            var13 = var12.field915.length;
            var14 = 0;
            if (var2) {
               var12.field915[var14] = this.field4312[var6[var11][var14]];
               ++var14;
            }
         } else {
            if (var11 >= var3) {
               this.field4307 = this.field4312[arg0.method2855(-31007)];
               this.field4309 = this.field4312[arg0.method2855(-31007)];
               var20 = this;
               if (!var2) {
                  this.field4305 = this.field4312[arg0.method2855(-31007)];
                  var17 = null;
                  return;
               }
            } else {
               var20 = this;
            }

            var12 = var20.field4312[var11];
            var13 = var12.field915.length;
            var14 = 0;
            if (var2) {
               var12.field915[var14] = this.field4312[var6[var11][var14]];
               ++var14;
            }
         }

         while(true) {
            while(~var13 < ~var14) {
               var12.field915[var14] = this.field4312[var6[var11][var14]];
               ++var14;
            }

            int var15 = var12.method540((byte)107);
            int var16 = var12.method542(-1);
            if (!var2) {
               if (~var15 < -1) {
                  this.field4306[var4++] = var15;
               }

               if (~var16 < -1) {
                  this.field4303[var5++] = var16;
               }

               var6[var11] = null;
               ++var11;
               if (var11 >= var3) {
                  this.field4307 = this.field4312[arg0.method2855(-31007)];
                  this.field4309 = this.field4312[arg0.method2855(-31007)];
                  var20 = this;
                  if (!var2) {
                     this.field4305 = this.field4312[arg0.method2855(-31007)];
                     var17 = null;
                     return;
                  }
               } else {
                  var20 = this;
               }

               var12 = var20.field4312[var11];
               var13 = var12.field915.length;
               var14 = 0;
               if (var2) {
                  var12.field915[var14] = this.field4312[var6[var11][var14]];
                  ++var14;
               }
            } else {
               ++var14;
            }
         }
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field4314[3] + (arg0 != null ? field4314[1] : field4314[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2280(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2281(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
