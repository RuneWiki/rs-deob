import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class486 implements class159 {
   @OriginalMember(
      owner = "client!wr",
      name = "c",
      descriptor = "Lrb;"
   )
   private class374 field6684 = class213.field2642;
   @OriginalMember(
      owner = "client!wr",
      name = "s",
      descriptor = "Lkfa;"
   )
   public class632 field6694;
   @OriginalMember(
      owner = "client!wr",
      name = "d",
      descriptor = "Ltga;"
   )
   public class63 field6695;
   @OriginalMember(
      owner = "client!wr",
      name = "v",
      descriptor = "Z"
   )
   private boolean field6702;
   @OriginalMember(
      owner = "client!wr",
      name = "x",
      descriptor = "I"
   )
   public int field6681;
   @OriginalMember(
      owner = "client!wr",
      name = "p",
      descriptor = "I"
   )
   private int field6700;
   @OriginalMember(
      owner = "client!wr",
      name = "q",
      descriptor = "Liw;"
   )
   public class335 field6698;
   @OriginalMember(
      owner = "client!wr",
      name = "o",
      descriptor = "I"
   )
   private int field6693;
   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6705 = new String[]{method3539(method3538("\u0003~,(g")), method3539(method3538("\u000f\",K2")), method3539(method3538("\u001ayn\t")), method3539(method3538("\u0003~,6g")), method3539(method3538("\u0003~,'\u000e\\")), method3539(method3538("\u0003~,5g")), method3539(method3538("\u0003~,3g")), method3539(method3538("\u0003~,7g")), method3539(method3538("\u0003~,0g")), method3539(method3538("\u0003~,Y&\u001aev[g")), method3539(method3538("\u0003~,*g")), method3539(method3538("\u0003~,2g")), method3539(method3538("\u0003~,+g")), method3539(method3538("\u0003~,&\u000e\\")), method3539(method3538("\u0003~,$\u000e\\")), method3539(method3538("\u0003~,1g")), method3539(method3538("\u0003~,\u0003&\u001amn\f5\u0011$"))};
   @OriginalMember(
      owner = "client!wr",
      name = "l",
      descriptor = "B"
   )
   public static byte field6686 = -6;
   @OriginalMember(
      owner = "client!wr",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6691 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
   @OriginalMember(
      owner = "client!wr",
      name = "h",
      descriptor = "D"
   )
   public static double field6704;
   @OriginalMember(
      owner = "client!wr",
      name = "w",
      descriptor = "I"
   )
   public static int field6682;
   @OriginalMember(
      owner = "client!wr",
      name = "r",
      descriptor = "I"
   )
   public static int field6683;
   @OriginalMember(
      owner = "client!wr",
      name = "t",
      descriptor = "I"
   )
   public static int field6685;
   @OriginalMember(
      owner = "client!wr",
      name = "i",
      descriptor = "I"
   )
   public static int field6687;
   @OriginalMember(
      owner = "client!wr",
      name = "u",
      descriptor = "I"
   )
   public static int field6688;
   @OriginalMember(
      owner = "client!wr",
      name = "f",
      descriptor = "I"
   )
   public static int field6689;
   @OriginalMember(
      owner = "client!wr",
      name = "k",
      descriptor = "I"
   )
   public static int field6690;
   @OriginalMember(
      owner = "client!wr",
      name = "m",
      descriptor = "I"
   )
   public static int field6692;
   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "I"
   )
   public static int field6696;
   @OriginalMember(
      owner = "client!wr",
      name = "n",
      descriptor = "I"
   )
   public static int field6697;
   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "I"
   )
   public static int field6699;
   @OriginalMember(
      owner = "client!wr",
      name = "j",
      descriptor = "I"
   )
   public static int field6701;
   @OriginalMember(
      owner = "client!wr",
      name = "g",
      descriptor = "I"
   )
   public static int field6703;

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Lrb;B)V"
   )
   public final void method40(class374 arg0, byte arg1) {
      try {
         int var3 = -2 / ((arg1 - -72) / 37);
         ++field6690;
         if (this.field6684 != arg0) {
            this.field6684 = arg0;
            this.method3528((byte)20);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6705[12] + (arg0 != null ? field6705[1] : field6705[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method3526(int arg0, int arg1) {
      try {
         ++field6689;
         if (arg1 == 3) {
            this.field6694.field4560 -= arg0;
            this.field6694.field4560 += this.method3532((byte)-89);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6705[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method3527(int arg0) {
      try {
         if (~this.field6693 < -1) {
            this.field6694.method4591(this.field6693, this.method3532((byte)-106), true);
            this.field6693 = 0;
         }

         if (arg0 >= -36) {
            method3531(-2, (class295)null);
         }

         ++field6682;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6705[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method3528(byte arg0) {
      try {
         ++field6685;
         this.field6694.method2581(this, 120);
         if (arg0 == 20) {
            if (class213.field2642 != this.field6684) {
               OpenGL.glTexParameteri(this.field6681, 10241, this.field6702 ? 9984 : 9728);
               OpenGL.glTexParameteri(this.field6681, 10240, 9728);
            } else {
               OpenGL.glTexParameteri(this.field6681, 10241, !this.field6702 ? 9729 : 9987);
               OpenGL.glTexParameteri(this.field6681, 10240, 9729);
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6705[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(B[BIII)V"
   )
   public final void method3529(byte arg0, byte[] arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         ++field6688;
         if (arg3 > 0 && !class685.method5005(arg3, (byte)120)) {
            throw new IllegalArgumentException("");
         } else if (arg2 > 0 && !class685.method5005(arg2, (byte)112)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = this.field6695.field693;
            int var8 = 0;
            int var9 = arg2 <= arg3 ? arg2 : arg3;
            if (arg0 <= 104) {
               this.field6702 = true;
            }

            int var10 = arg3 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg1;
            byte[] var13 = new byte[var7 * var11 * var10];

            while(true) {
               OpenGL.glTexImage2Dub(arg4, var8, this.method3537((byte)-95), arg3, arg2, 0, class133.method1124(this.field6695, 217), 5121, var12, 0);
               if (~var9 >= -2) {
                  return;
               }

               int var10000;
               label101: {
                  int var14 = arg3 * var7;
                  int var15 = 0;
                  byte[] var27;
                  if (var6) {
                     var10000 = var15;
                  } else if (var7 <= var15) {
                     var27 = var13;
                     var13 = var12;
                     arg3 = var10;
                     var12 = var27;
                     arg2 = var11;
                     var9 >>= 1;
                     ++var8;
                     var11 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label101;
                     }
                  } else {
                     var10000 = var15;
                  }

                  while(true) {
                     int var16 = var10000;
                     int var17 = var15;
                     int var18 = var14 + var15;
                     int var19 = 0;
                     if (var6 || ~var11 < ~var19) {
                        do {
                           label95: {
                              int var20 = 0;
                              if (var6) {
                                 var10000 = var12[var17];
                              } else if (~var20 <= ~var10) {
                                 var18 += var14;
                                 var10000 = var14 + var17;
                                 if (!var6) {
                                    break label95;
                                 }
                              } else {
                                 var10000 = var12[var17];
                              }

                              while(true) {
                                 int var21 = var10000;
                                 int var22 = var7 + var17;
                                 int var23 = var12[var22] + var21;
                                 var17 = var7 + var22;
                                 int var24 = var12[var18] + var23;
                                 int var25 = var7 + var18;
                                 int var26 = var12[var25] + var24;
                                 var13[var16] = (byte)(var26 >> 2);
                                 var18 = var7 + var25;
                                 var16 += var7;
                                 ++var20;
                                 if (~var20 <= ~var10) {
                                    var18 += var14;
                                    var10000 = var14 + var17;
                                    if (!var6) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var12[var17];
                                 }
                              }
                           }

                           var17 = var10000;
                           ++var19;
                        } while(~var11 < ~var19);
                     }

                     ++var15;
                     if (var7 <= var15) {
                        var27 = var13;
                        var13 = var12;
                        arg3 = var10;
                        var12 = var27;
                        arg2 = var11;
                        var9 >>= 1;
                        ++var8;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var15;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field6705[5] + arg0 + ',' + (arg1 != null ? field6705[1] : field6705[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3530(int arg0) {
      try {
         if (arg0 == 3) {
            field6691 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6705[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(ILs;)V"
   )
   public static final void method3531(int arg0, class295 arg1) {
      class93.field1241[arg0] = arg1;
   }

   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "(B)I"
   )
   private final int method3532(byte arg0) {
      try {
         int var2 = -73 % ((arg0 - -3) / 43);
         ++field6683;
         int var3 = this.field6695.field693 * this.field6700 * this.field6698.field4797;
         return !this.field6702 ? var3 : var3 * 4 / 3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6705[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(BLjava/lang/String;IZ)V"
   )
   public static final void method3533(byte arg0, String arg1, int arg2, boolean arg3) {
      try {
         class95.method886(0);
         ++field6703;
         class492.method3572(true);
         class449.method3330(-20052);
         class338.method2683(arg2, arg1, true, arg3);
         class360.method2811(true);
         class590.method4246(class338.field4832, (byte)-87);
         if (arg0 != 107) {
            field6686 = 102;
         }

         class205.method1547(-7265, class338.field4832);
         class64.method479(class354.field5051, 28946, class338.field4832);
         class479.method3491(true);
         class300.method2259(0, class447.field6181);
         class570.method4093(-30624);
         class493.method3579((byte)-97);
         if (~class445.field6162 != -4) {
            if (~class445.field6162 == -8) {
               class397.method3019(-108, 8);
            } else if (~class445.field6162 == -10) {
               class397.method3019(31, 10);
            } else if (~class445.field6162 == -12) {
               class397.method3019(95, 12);
            } else {
               if (~class445.field6162 == -2 || class445.field6162 == 2) {
                  class41.method309((byte)-26);
               }

            }
         } else {
            class397.method3019(arg0 ^ 26, 4);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6705[3] + arg0 + ',' + (arg1 != null ? field6705[1] : field6705[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method3534(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6701;
         if (class233.field2888 && class480.field6633) {
            if (class111.field1406 < 100) {
               return false;
            } else {
               int var4 = class24.field312[arg3][arg0][arg1];
               if (~(-class728.field10667) == ~var4) {
                  return false;
               } else if (~class728.field10667 == ~var4) {
                  return true;
               } else {
                  if (arg2 != -17319) {
                     method3530(-74);
                  }

                  if (class93.field1241 == class73.field900) {
                     return false;
                  } else {
                     int var5 = arg0 << class76.field965;
                     int var6 = arg1 << class76.field965;
                     if (class432.method3235(var6 + 1, class212.field2635 + -1 + var6, class93.field1241[arg3].method2221(false, arg1 - -1, arg0 + 1), var5 + 1, class212.field2635 + var6 + -1, class93.field1241[arg3].method2221(false, arg1 + 1, arg0), true, var5 + 1, class212.field2635 + -1 + var5, class93.field1241[arg3].method2221(false, arg1, arg0)) && class432.method3235(var6 + 1, class212.field2635 + -1 + var6, class93.field1241[arg3].method2221(false, arg1, arg0 - -1), class212.field2635 + var5 + -1, var6 + 1, class93.field1241[arg3].method2221(false, arg1 - -1, arg0 + 1), true, var5 - -1, var5 + -1 + class212.field2635, class93.field1241[arg3].method2221(false, arg1, arg0))) {
                        ++class666.field9475;
                        class24.field312[arg3][arg0][arg1] = class728.field10667;
                        return true;
                     } else {
                        class24.field312[arg3][arg0][arg1] = -class728.field10667;
                        return false;
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6705[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method41(int arg0) {
      try {
         ++field6697;
         if (arg0 != -26708) {
            this.field6695 = null;
         }

         int var2 = this.field6694.method2533(false);
         int var3 = this.field6694.field8942[var2];
         if (this.field6681 != var3) {
            if (~var3 != -1) {
               OpenGL.glBindTexture(var3, 0);
               OpenGL.glDisable(var3);
            }

            OpenGL.glEnable(this.field6681);
            this.field6694.field8942[var2] = this.field6681;
         }

         OpenGL.glBindTexture(this.field6681, this.field6693);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6705[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(IZ[FII)V"
   )
   public final void method3535(int arg0, boolean arg1, float[] arg2, int arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         ++field6687;
         if (arg0 > 0 && !class685.method5005(arg0, (byte)125)) {
            throw new IllegalArgumentException("");
         } else if (arg3 > 0 && !class685.method5005(arg3, (byte)118)) {
            throw new IllegalArgumentException("");
         } else {
            if (arg1) {
               this.field6694 = null;
            }

            int var7 = this.field6695.field693;
            int var8 = 0;
            int var9 = arg0 >= arg3 ? arg3 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var10 * var11 * var7];

            while(true) {
               OpenGL.glTexImage2Df(arg4, var8, this.method3537((byte)-61), arg0, arg3, 0, class133.method1124(this.field6695, 217), 5126, var12, 0);
               if (var9 <= 1) {
                  return;
               }

               int var10000;
               label91: {
                  int var14 = arg0 * var7;
                  int var15 = 0;
                  float[] var27;
                  if (var6) {
                     var10000 = var15;
                  } else if (~var7 >= ~var15) {
                     var27 = var13;
                     var13 = var12;
                     var12 = var27;
                     arg3 = var11;
                     arg0 = var10;
                     ++var8;
                     var9 >>= 1;
                     var11 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label91;
                     }
                  } else {
                     var10000 = var15;
                  }

                  while(true) {
                     int var16 = var10000;
                     int var17 = var15;
                     int var18 = var14 + var15;
                     int var19 = 0;
                     if (var6 || ~var19 > ~var11) {
                        do {
                           int var20 = 0;
                           if (var6 || ~var10 < ~var20) {
                              do {
                                 float var21 = var12[var17];
                                 int var22 = var7 + var17;
                                 float var23 = var12[var22] + var21;
                                 float var24 = var12[var18] + var23;
                                 var17 = var7 + var22;
                                 int var25 = var7 + var18;
                                 float var26 = var12[var25] + var24;
                                 var13[var16] = var26 * 0.25F;
                                 var18 = var7 + var25;
                                 var16 += var7;
                                 ++var20;
                              } while(~var10 < ~var20);
                           }

                           var17 += var14;
                           var18 += var14;
                           ++var19;
                        } while(~var19 > ~var11);
                     }

                     ++var15;
                     if (~var7 >= ~var15) {
                        var27 = var13;
                        var13 = var12;
                        var12 = var27;
                        arg3 = var11;
                        arg0 = var10;
                        ++var8;
                        var9 >>= 1;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var15;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field6705[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6705[1] : field6705[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "<init>",
      descriptor = "(Lkfa;ILtga;Liw;IZ)V"
   )
   public class486(class632 arg0, int arg1, class63 arg2, class335 arg3, int arg4, boolean arg5) {
      try {
         this.field6694 = arg0;
         this.field6695 = arg2;
         this.field6702 = arg5;
         this.field6681 = arg1;
         this.field6700 = arg4;
         this.field6698 = arg3;
         OpenGL.glGenTextures(1, class719.field10534, 0);
         this.field6693 = class719.field10534[0];
         this.method3528((byte)20);
         this.method3526(0, 3);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6705[9] + (arg0 != null ? field6705[1] : field6705[2]) + ',' + arg1 + ',' + (arg2 != null ? field6705[1] : field6705[2]) + ',' + (arg3 != null ? field6705[1] : field6705[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(IIII[I)V"
   )
   public final void method3536(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      boolean var6 = client.field4273;

      try {
         ++field6699;
         if (~arg3 < -1 && !class685.method5005(arg3, (byte)126)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 < -1 && !class685.method5005(arg2, (byte)127)) {
            throw new IllegalArgumentException("");
         } else {
            if (arg0 != 255) {
               this.method3535(108, false, (float[])null, -5, 108);
            }

            if (class622.field8682 != this.field6695) {
               throw new IllegalArgumentException("");
            } else {
               int var7 = 0;
               int var8 = arg2 <= arg3 ? arg2 : arg3;
               int var9 = arg3 >> 1;
               int var10 = arg2 >> 1;
               int[] var11 = arg4;
               int[] var12 = new int[var9 * var10];

               while(true) {
                  OpenGL.glTexImage2Di(arg1, var7, this.method3537((byte)95), arg3, arg2, 0, 32993, this.field6694.field8941, var11, 0);
                  if (~var8 >= -2) {
                     return;
                  }

                  int var10000;
                  label92: {
                     int var13 = 0;
                     int var14 = 0;
                     int var15 = arg3 + var14;
                     int[] var16 = var12;
                     int var17 = 0;
                     if (var6) {
                        var10000 = 0;
                     } else if (var17 >= var10) {
                        var12 = var11;
                        var11 = var16;
                        arg3 = var9;
                        arg2 = var10;
                        var9 >>= 1;
                        ++var7;
                        var10 >>= 1;
                        var10000 = var8 >> 1;
                        if (!var6) {
                           break label92;
                        }
                     } else {
                        var10000 = 0;
                     }

                     while(true) {
                        label89: {
                           int var18 = var10000;
                           if (var6) {
                              var10000 = var11[var14++];
                           } else if (~var18 <= ~var9) {
                              var15 += arg3;
                              var10000 = arg3 + var14;
                              if (!var6) {
                                 break label89;
                              }
                           } else {
                              var10000 = var11[var14++];
                           }

                           while(true) {
                              int var19 = var10000;
                              int var20 = var11[var14++];
                              int var21 = var11[var15++];
                              int var22 = var19 >> 24 & 255;
                              int var23 = var19 >> 8 & 255;
                              int var24 = var11[var15++];
                              int var25 = (var19 & 16759477) >> 16;
                              int var26 = 255 & var19;
                              int var27 = ((16730281 & var20) >> 16) + var25;
                              int var28 = (var20 >> 8 & 255) + var23;
                              int var29 = (255 & var20 >> 24) + var22;
                              int var30 = (255 & var20) + var26;
                              int var31 = (255 & var21) + var30;
                              int var32 = (255 & var21 >> 24) + var29;
                              int var33 = ((16760254 & var21) >> 16) + var27;
                              int var34 = ((var21 & 65461) >> 8) + var28;
                              int var35 = (var24 >> 8 & 255) + var34;
                              int var36 = (255 & var24) + var31;
                              int var37 = (255 & var24 >> 16) + var33;
                              int var38 = (255 & var24 >> 24) + var32;
                              var12[var13++] = class283.method2155(class743.method5375(var36 >> 2, 255), class283.method2155(class283.method2155(class743.method5375(-16777216, var38 << 22), class743.method5375(16711680, var37 << 14)), class743.method5375(1020, var35) << 6));
                              ++var18;
                              if (~var18 <= ~var9) {
                                 var15 += arg3;
                                 var10000 = arg3 + var14;
                                 if (!var6) {
                                    break;
                                 }
                              } else {
                                 var10000 = var11[var14++];
                              }
                           }
                        }

                        var14 = var10000;
                        ++var17;
                        if (var17 >= var10) {
                           var12 = var11;
                           var11 = var16;
                           arg3 = var9;
                           arg2 = var10;
                           var9 >>= 1;
                           ++var7;
                           var10 >>= 1;
                           var10000 = var8 >> 1;
                           if (!var6) {
                              break;
                           }
                        } else {
                           var10000 = 0;
                        }
                     }
                  }

                  var8 = var10000;
               }
            }
         }
      } catch (RuntimeException var40) {
         throw class534.method3846(var40, field6705[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6705[1] : field6705[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method3527(-56);
         ++field6696;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6705[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method3537(byte arg0) {
      try {
         ++field6692;
         int var2 = -79 / ((arg0 - -8) / 46);
         if (class335.field4803 == this.field6698) {
            if (class657.field9377 == this.field6695) {
               return 6407;
            }

            if (class622.field8682 == this.field6695) {
               return 6408;
            }

            if (class128.field1618 == this.field6695) {
               return 6406;
            }

            if (class548.field7492 == this.field6695) {
               return 6409;
            }

            if (class630.field8824 == this.field6695) {
               return 6410;
            }

            if (class567.field7729 == this.field6695) {
               return 6145;
            }
         } else if (class335.field4806 == this.field6698) {
            if (class657.field9377 == this.field6695) {
               return 34843;
            }

            if (class622.field8682 == this.field6695) {
               return 34842;
            }

            if (class128.field1618 == this.field6695) {
               return 34844;
            }

            if (class548.field7492 == this.field6695) {
               return 34846;
            }

            if (class630.field8824 == this.field6695) {
               return 34847;
            }

            if (class567.field7729 == this.field6695) {
               return 6145;
            }
         } else if (class335.field4807 == this.field6698) {
            if (class657.field9377 == this.field6695) {
               return 34837;
            }

            if (class622.field8682 == this.field6695) {
               return 34836;
            }

            if (class128.field1618 == this.field6695) {
               return 34838;
            }

            if (class548.field7492 == this.field6695) {
               return 34840;
            }

            if (class630.field8824 == this.field6695) {
               return 34841;
            }

            if (class567.field7729 == this.field6695) {
               return 6145;
            }
         }

         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6705[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3538(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3539(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
