import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public abstract class class38 implements class47 {
   @OriginalMember(
      owner = "client!uja",
      name = "o",
      descriptor = "Lega;"
   )
   private class738 field907 = class185.field2801;
   @OriginalMember(
      owner = "client!uja",
      name = "v",
      descriptor = "Lbba;"
   )
   public class124 field922;
   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "Lrfa;"
   )
   public class209 field913;
   @OriginalMember(
      owner = "client!uja",
      name = "s",
      descriptor = "Z"
   )
   private boolean field906;
   @OriginalMember(
      owner = "client!uja",
      name = "l",
      descriptor = "Ltv;"
   )
   public class584 field905;
   @OriginalMember(
      owner = "client!uja",
      name = "e",
      descriptor = "I"
   )
   public int field924;
   @OriginalMember(
      owner = "client!uja",
      name = "m",
      descriptor = "I"
   )
   private int field915;
   @OriginalMember(
      owner = "client!uja",
      name = "d",
      descriptor = "I"
   )
   private int field919;
   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field927 = new String[]{method472(method471("0Z\"*\u001em")), method472(method471("0Z\"**,^\"h%?Uk")), method472(method471("0Z\"*\u0003m")), method472(method471("0Z\"*\u000fm")), method472(method471(">\u001em*1")), method472(method471("+E/h")), method472(method471("0Z\"*\u0019m")), method472(method471("0Z\"*p,^*prm")), method472(method471("0Z\"*\u001dm")), method472(method471("0Z\"*\u001cm")), method472(method471("0Z\"*\u001am")), method472(method471("0Z\"*\u0018m")), method472(method471("0Z\"*\u0002m")), method472(method471("0Z\"*\rm")), method472(method471("0Z\"*\u001fm"))};
   @OriginalMember(
      owner = "client!uja",
      name = "f",
      descriptor = "Leb;"
   )
   public static class650 field925 = new class650(7, 2);
   @OriginalMember(
      owner = "client!uja",
      name = "j",
      descriptor = "I"
   )
   public static int field908;
   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "I"
   )
   public static int field909;
   @OriginalMember(
      owner = "client!uja",
      name = "i",
      descriptor = "I"
   )
   public static int field910;
   @OriginalMember(
      owner = "client!uja",
      name = "t",
      descriptor = "I"
   )
   public static int field911;
   @OriginalMember(
      owner = "client!uja",
      name = "n",
      descriptor = "I"
   )
   public static int field912;
   @OriginalMember(
      owner = "client!uja",
      name = "u",
      descriptor = "I"
   )
   public static int field914;
   @OriginalMember(
      owner = "client!uja",
      name = "r",
      descriptor = "I"
   )
   public static int field916;
   @OriginalMember(
      owner = "client!uja",
      name = "g",
      descriptor = "I"
   )
   public static int field917;
   @OriginalMember(
      owner = "client!uja",
      name = "p",
      descriptor = "I"
   )
   public static int field918;
   @OriginalMember(
      owner = "client!uja",
      name = "h",
      descriptor = "I"
   )
   public static int field920;
   @OriginalMember(
      owner = "client!uja",
      name = "q",
      descriptor = "I"
   )
   public static int field921;
   @OriginalMember(
      owner = "client!uja",
      name = "c",
      descriptor = "I"
   )
   public static int field923;
   @OriginalMember(
      owner = "client!uja",
      name = "k",
      descriptor = "I"
   )
   public static int field926;

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(BLega;)V"
   )
   public final void method460(byte arg0, class738 arg1) {
      try {
         if (arg0 >= 0) {
            this.method468((byte)8, -76, (int[])null, 116, -1);
         }

         ++field918;
         if (this.field907 != arg1) {
            this.field907 = arg1;
            this.method463((byte)-119);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field927[13] + arg0 + ',' + (arg1 != null ? field927[4] : field927[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method461(byte arg0) {
      try {
         if (arg0 != 89) {
            this.method463((byte)42);
         }

         ++field920;
         int var2 = this.field922.method2729(-100);
         int var3 = this.field922.field2083[var2];
         if (this.field924 != var3) {
            if (~var3 != -1) {
               OpenGL.glBindTexture(var3, 0);
               OpenGL.glDisable(var3);
            }

            OpenGL.glEnable(this.field924);
            this.field922.field2083[var2] = this.field924;
         }

         OpenGL.glBindTexture(this.field924, this.field919);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field927[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method462(int arg0, int arg1) {
      try {
         ++field908;
         this.field922.field5213 -= arg1;
         this.field922.field5213 += this.method467((byte)-50);
         if (arg0 != 65396) {
            this.method467((byte)-52);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field927[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method463(byte arg0) {
      try {
         ++field921;
         int var2 = 46 % ((arg0 - -50) / 32);
         this.field922.method2806(false, this);
         if (class185.field2801 != this.field907) {
            OpenGL.glTexParameteri(this.field924, 10241, this.field906 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field924, 10240, 9728);
         } else {
            OpenGL.glTexParameteri(this.field924, 10241, this.field906 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field924, 10240, 9729);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field927[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method464(byte arg0) {
      try {
         if (arg0 > -91) {
            field912 = -76;
         }

         field925 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field927[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field914;
         this.method465(1);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field927[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method465(int arg0) {
      try {
         if (arg0 != 1) {
            this.method461((byte)-27);
         }

         ++field923;
         if (~this.field919 < -1) {
            this.field922.method1154((byte)-100, this.field919, this.method467((byte)-50));
            this.field919 = 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field927[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method466(byte arg0) {
      try {
         ++field909;
         if (arg0 != 118) {
            return -31;
         } else {
            if (class209.field3106 == this.field913) {
               if (class431.field6246 == this.field905) {
                  return 6407;
               }

               if (class296.field4146 == this.field905) {
                  return 6408;
               }

               if (class776.field11354 == this.field905) {
                  return 6406;
               }

               if (class153.field2444 == this.field905) {
                  return 6409;
               }

               if (class434.field6278 == this.field905) {
                  return 6410;
               }

               if (class669.field9743 == this.field905) {
                  return 6145;
               }
            } else if (class209.field3109 == this.field913) {
               if (class431.field6246 == this.field905) {
                  return 34843;
               }

               if (class296.field4146 == this.field905) {
                  return 34842;
               }

               if (class776.field11354 == this.field905) {
                  return 34844;
               }

               if (class153.field2444 == this.field905) {
                  return 34846;
               }

               if (class434.field6278 == this.field905) {
                  return 34847;
               }

               if (class669.field9743 == this.field905) {
                  return 6145;
               }
            } else if (class209.field3110 == this.field913) {
               if (class431.field6246 == this.field905) {
                  return 34837;
               }

               if (class296.field4146 == this.field905) {
                  return 34836;
               }

               if (class776.field11354 == this.field905) {
                  return 34838;
               }

               if (class153.field2444 == this.field905) {
                  return 34840;
               }

               if (class434.field6278 == this.field905) {
                  return 34841;
               }

               if (class669.field9743 == this.field905) {
                  return 6145;
               }
            }

            throw new IllegalStateException();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field927[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "c",
      descriptor = "(B)I"
   )
   private final int method467(byte arg0) {
      try {
         ++field911;
         if (arg0 != -50) {
            this.method465(127);
         }

         int var2 = this.field905.field8449 * this.field915 * this.field913.field3103;
         return !this.field906 ? var2 : var2 * 4 / 3;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field927[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(BI[III)V"
   )
   public final void method468(byte arg0, int arg1, int[] arg2, int arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         ++field910;
         if (arg4 > 0 && !class756.method5476((byte)-63, arg4)) {
            throw new IllegalArgumentException("");
         } else if (arg1 > 0 && !class756.method5476((byte)-63, arg1)) {
            throw new IllegalArgumentException("");
         } else if (class296.field4146 != this.field905) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = 0;
            int var8 = arg1 > arg4 ? arg4 : arg1;
            int var9 = arg4 >> 1;
            int var10 = arg1 >> 1;
            int[] var11 = arg2;
            int[] var12 = new int[var9 * var10];
            if (arg0 < 113) {
               field926 = 106;
            }

            while(true) {
               OpenGL.glTexImage2Di(arg3, var7, this.method466((byte)118), arg4, arg1, 0, 32993, this.field922.field2089, var11, 0);
               if (var8 <= 1) {
                  return;
               }

               int var10000;
               label90: {
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = arg4 + var14;
                  int var16 = 0;
                  int[] var38;
                  if (var6) {
                     var10000 = 0;
                  } else if (~var10 >= ~var16) {
                     var38 = var12;
                     var12 = var11;
                     var11 = var38;
                     arg4 = var9;
                     arg1 = var10;
                     var8 >>= 1;
                     ++var7;
                     var9 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label90;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     label87: {
                        int var17 = var10000;
                        if (var6) {
                           var10000 = var11[var14++];
                        } else if (~var17 <= ~var9) {
                           var14 += arg4;
                           var10000 = arg4 + var15;
                           if (!var6) {
                              break label87;
                           }
                        } else {
                           var10000 = var11[var14++];
                        }

                        while(true) {
                           int var18 = var10000;
                           int var19 = var11[var15++];
                           int var20 = var11[var14++];
                           int var21 = 255 & var18 >> 8;
                           int var22 = 255 & var18;
                           int var23 = var18 >> 24 & 255;
                           int var24 = 255 & var18 >> 16;
                           int var25 = var11[var15++];
                           int var26 = ((16762030 & var20) >> 16) + var24;
                           int var27 = (var20 & 255) + var22;
                           int var28 = (255 & var20 >> 8) + var21;
                           int var29 = (var20 >> 24 & 255) + var23;
                           int var30 = (255 & var19 >> 24) + var29;
                           int var31 = ((var19 & 16732027) >> 16) + var26;
                           int var32 = (var19 & 255) + var27;
                           int var33 = ((var19 & 65375) >> 8) + var28;
                           int var34 = ((var25 & 16746149) >> 16) + var31;
                           int var35 = (255 & var25 >> 24) + var30;
                           int var36 = ((65396 & var25) >> 8) + var33;
                           int var37 = (255 & var25) + var32;
                           var12[var13++] = class93.method899(class93.method899(class93.method899(class66.method706(1020, var34) << 14, class66.method706(-16777216, var35 << 22)), class66.method706(1020, var36) << 6), class66.method706(1020, var37) >> 2);
                           ++var17;
                           if (~var17 <= ~var9) {
                              var14 += arg4;
                              var10000 = arg4 + var15;
                              if (!var6) {
                                 break;
                              }
                           } else {
                              var10000 = var11[var14++];
                           }
                        }
                     }

                     var15 = var10000;
                     ++var16;
                     if (~var10 >= ~var16) {
                        var38 = var12;
                        var12 = var11;
                        var11 = var38;
                        arg4 = var9;
                        arg1 = var10;
                        var8 >>= 1;
                        ++var7;
                        var9 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var40) {
         throw class608.method4462(var40, field927[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field927[4] : field927[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(IIII[F)V"
   )
   public final void method469(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
      boolean var6 = client.field4564;

      try {
         ++field916;
         if (~arg0 < -1 && !class756.method5476((byte)-63, arg0)) {
            throw new IllegalArgumentException("");
         } else if (~arg3 < -1 && !class756.method5476((byte)-63, arg3)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = this.field905.field8449;
            int var8 = 0;
            int var9 = arg0 >= arg3 ? arg3 : arg0;
            if (arg2 != 30805) {
               this.field907 = null;
            }

            int var10 = arg0 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg4;
            float[] var13 = new float[var7 * var11 * var10];

            while(true) {
               OpenGL.glTexImage2Df(arg1, var8, this.method466((byte)118), arg0, arg3, 0, class583.method4325(this.field905, 6406), 5126, var12, 0);
               if (~var9 >= -2) {
                  return;
               }

               int var10000;
               label91: {
                  int var14 = arg0 * var7;
                  float[] var15 = var13;
                  int var16 = 0;
                  if (var6) {
                     var10000 = var16;
                  } else if (~var7 >= ~var16) {
                     var13 = var12;
                     var12 = var15;
                     arg0 = var10;
                     arg3 = var11;
                     var10 >>= 1;
                     var9 >>= 1;
                     ++var8;
                     var10000 = var11 >> 1;
                     if (!var6) {
                        break label91;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var14 + var16;
                     int var20 = 0;
                     if (var6 || ~var11 < ~var20) {
                        do {
                           int var21 = 0;
                           if (var6 || ~var21 > ~var10) {
                              do {
                                 float var22 = var12[var18];
                                 int var23 = var7 + var18;
                                 float var24 = var12[var23] + var22;
                                 float var25 = var12[var19] + var24;
                                 var18 = var7 + var23;
                                 int var26 = var7 + var19;
                                 float var27 = var12[var26] + var25;
                                 var13[var17] = var27 * 0.25F;
                                 var19 = var7 + var26;
                                 var17 += var7;
                                 ++var21;
                              } while(~var21 > ~var10);
                           }

                           var18 += var14;
                           var19 += var14;
                           ++var20;
                        } while(~var11 < ~var20);
                     }

                     ++var16;
                     if (~var7 >= ~var16) {
                        var13 = var12;
                        var12 = var15;
                        arg0 = var10;
                        arg3 = var11;
                        var10 >>= 1;
                        var9 >>= 1;
                        ++var8;
                        var10000 = var11 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var11 = var10000;
            }
         }
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field927[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field927[4] : field927[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(III[BI)V"
   )
   public final void method470(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         ++field917;
         if (arg2 > 0 && !class756.method5476((byte)-63, arg2)) {
            throw new IllegalArgumentException("");
         } else if (arg0 > 0 && !class756.method5476((byte)-63, arg0)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = this.field905.field8449;
            int var8 = 0;
            int var9 = ~arg0 >= ~arg2 ? arg0 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            if (arg4 < 122) {
               this.field922 = null;
            }

            byte[] var12 = arg3;
            byte[] var13 = new byte[var10 * var11 * var7];

            while(true) {
               OpenGL.glTexImage2Dub(arg1, var8, this.method466((byte)118), arg2, arg0, 0, class583.method4325(this.field905, 6406), 5121, var12, 0);
               if (var9 <= 1) {
                  return;
               }

               int var10000;
               label101: {
                  int var14 = arg2 * var7;
                  byte[] var15 = var13;
                  int var16 = 0;
                  if (var6) {
                     var10000 = var16;
                  } else if (var16 >= var7) {
                     var13 = var12;
                     arg2 = var10;
                     var12 = var15;
                     arg0 = var11;
                     var11 >>= 1;
                     var10 >>= 1;
                     var10000 = var9 >> 1;
                     if (!var6) {
                        break label101;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var16 - -var14;
                     int var20 = 0;
                     if (var6 || var11 > var20) {
                        do {
                           label95: {
                              int var21 = 0;
                              if (var6) {
                                 var10000 = var12[var18];
                              } else if (var21 >= var10) {
                                 var18 += var14;
                                 var10000 = var14 + var19;
                                 if (!var6) {
                                    break label95;
                                 }
                              } else {
                                 var10000 = var12[var18];
                              }

                              while(true) {
                                 int var22 = var10000;
                                 int var23 = var7 + var18;
                                 int var24 = var12[var23] + var22;
                                 var18 = var7 + var23;
                                 int var25 = var12[var19] + var24;
                                 int var26 = var7 + var19;
                                 int var27 = var12[var26] + var25;
                                 var19 = var7 + var26;
                                 var13[var17] = (byte)(var27 >> 2);
                                 var17 += var7;
                                 ++var21;
                                 if (var21 >= var10) {
                                    var18 += var14;
                                    var10000 = var14 + var19;
                                    if (!var6) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var12[var18];
                                 }
                              }
                           }

                           var19 = var10000;
                           ++var20;
                        } while(var11 > var20);
                     }

                     ++var16;
                     if (var16 >= var7) {
                        var13 = var12;
                        arg2 = var10;
                        var12 = var15;
                        arg0 = var11;
                        var11 >>= 1;
                        var10 >>= 1;
                        var10000 = var9 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var9 = var10000;
               ++var8;
            }
         }
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field927[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field927[4] : field927[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "<init>",
      descriptor = "(Lbba;ILtv;Lrfa;IZ)V"
   )
   public class38(class124 arg0, int arg1, class584 arg2, class209 arg3, int arg4, boolean arg5) {
      try {
         this.field922 = arg0;
         this.field913 = arg3;
         this.field906 = arg5;
         this.field905 = arg2;
         this.field924 = arg1;
         this.field915 = arg4;
         OpenGL.glGenTextures(1, class728.field10471, 0);
         this.field919 = class728.field10471[0];
         this.method463((byte)88);
         this.method462(65396, 0);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field927[7] + (arg0 != null ? field927[4] : field927[5]) + ',' + arg1 + ',' + (arg2 != null ? field927[4] : field927[5]) + ',' + (arg3 != null ? field927[4] : field927[5]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method471(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method472(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
