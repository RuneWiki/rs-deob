import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class458 implements class205 {
   @OriginalMember(
      owner = "client!ss",
      name = "q",
      descriptor = "Lgj;"
   )
   private class663 field6593 = class711.field10376;
   @OriginalMember(
      owner = "client!ss",
      name = "f",
      descriptor = "I"
   )
   private int field6585;
   @OriginalMember(
      owner = "client!ss",
      name = "m",
      descriptor = "I"
   )
   public int field6589;
   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "Lak;"
   )
   public class371 field6582;
   @OriginalMember(
      owner = "client!ss",
      name = "j",
      descriptor = "Lria;"
   )
   public class301 field6590;
   @OriginalMember(
      owner = "client!ss",
      name = "n",
      descriptor = "Z"
   )
   private boolean field6583;
   @OriginalMember(
      owner = "client!ss",
      name = "o",
      descriptor = "Lwi;"
   )
   public class494 field6592;
   @OriginalMember(
      owner = "client!ss",
      name = "d",
      descriptor = "I"
   )
   private int field6597;
   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6600 = new String[]{method3349(method3348("oR\u0012LI")), method3349(method3348("z\tP\u000e")), method3349(method3348("g\u000f\u0012*\u001c")), method3349(method3348("g\u000f\u0012/\u001c")), method3349(method3348("g\u000f\u0012$\u001c")), method3349(method3348("g\u000f\u0012)\u001c")), method3349(method3348("g\u000f\u0012^]z\u0015H\\\u001c")), method3349(method3348("g\u000f\u0012'\u001c")), method3349(method3348("g\u000f\u0012,\u001c")), method3349(method3348("g\u000f\u0012(\u001c")), method3349(method3348("g\u000f\u00122\u001c")), method3349(method3348("g\u000f\u0012-\u001c")), method3349(method3348("g\u000f\u0012\u0004]z\u001dP\u000bNqT")), method3349(method3348("g\u000f\u0012.\u001c")), method3349(method3348("g\u000f\u0012+\u001c")), method3349(method3348("g\u000f\u0012%\u001c"))};
   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "Lwia;"
   )
   public static class793 field6587 = new class793();
   @OriginalMember(
      owner = "client!ss",
      name = "k",
      descriptor = "I"
   )
   public static int field6579;
   @OriginalMember(
      owner = "client!ss",
      name = "h",
      descriptor = "I"
   )
   public static int field6580;
   @OriginalMember(
      owner = "client!ss",
      name = "i",
      descriptor = "I"
   )
   public static int field6581;
   @OriginalMember(
      owner = "client!ss",
      name = "s",
      descriptor = "I"
   )
   public static int field6584;
   @OriginalMember(
      owner = "client!ss",
      name = "r",
      descriptor = "I"
   )
   public static int field6586;
   @OriginalMember(
      owner = "client!ss",
      name = "t",
      descriptor = "I"
   )
   public static int field6588;
   @OriginalMember(
      owner = "client!ss",
      name = "c",
      descriptor = "I"
   )
   public static int field6591;
   @OriginalMember(
      owner = "client!ss",
      name = "p",
      descriptor = "I"
   )
   public static int field6594;
   @OriginalMember(
      owner = "client!ss",
      name = "l",
      descriptor = "I"
   )
   public static int field6595;
   @OriginalMember(
      owner = "client!ss",
      name = "g",
      descriptor = "I"
   )
   public static int field6596;
   @OriginalMember(
      owner = "client!ss",
      name = "u",
      descriptor = "I"
   )
   public static int field6598;
   @OriginalMember(
      owner = "client!ss",
      name = "e",
      descriptor = "I"
   )
   public static int field6599;

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 6
   )
   public static final void method3338(boolean arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field6581;
         if (arg1 != null) {
            String var3 = class738.method5357(-86, arg1);
            if (var3 != null) {
               int var4 = 0;
               if (var2 || class640.field9356 > var4) {
                  label70:
                  do {
                     String var5 = class640.field9350[var4];
                     String var6 = class738.method5357(-113, var5);
                     if (!class525.method3803(var5, var3, -18357, arg1, var6)) {
                        ++var4;
                     } else {
                        --class640.field9356;
                        int var7 = var4;
                        if (var2) {
                           class640.field9350[var4] = class640.field9350[var4 + 1];
                           class552.field7909[var4] = class552.field7909[var4 + 1];
                           class295.field4068[var4] = class295.field4068[var4 + 1];
                           class558.field8005[var4] = class558.field8005[var4 + 1];
                           class505.field7326[var4] = class505.field7326[var4 + 1];
                           var7 = var4 + 1;
                        }

                        while(true) {
                           while(~var7 > ~class640.field9356) {
                              class640.field9350[var7] = class640.field9350[var7 + 1];
                              class552.field7909[var7] = class552.field7909[var7 + 1];
                              class295.field4068[var7] = class295.field4068[var7 + 1];
                              class558.field8005[var7] = class558.field8005[var7 + 1];
                              class505.field7326[var7] = class505.field7326[var7 + 1];
                              ++var7;
                           }

                           ++class139.field1772;
                           class414.field5972 = class768.field11318;
                           class10 var8 = class292.method2192(-9730);
                           class447 var9 = class40.method350(class263.field3631, var8.field106, true);
                           var9.field6359.method1186(class89.method783(1, arg1), 0);
                           var9.field6359.method1195((byte)33, arg1);
                           var8.method55(13256, var9);
                           if (!var2) {
                              if (!var2) {
                                 break label70;
                              }

                              ++var4;
                              break;
                           }

                           ++var7;
                        }
                     }
                  } while(class640.field9356 > var4);
               }

               if (!arg0) {
                  field6587 = null;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field6600[14] + arg0 + ',' + (arg1 != null ? field6600[0] : field6600[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(I)V",
      line = 65
   )
   public final void method1423(int arg0) {
      try {
         ++field6595;
         int var2 = this.field6592.method2766(122);
         int var3 = this.field6592.field7157[var2];
         if (arg0 == 3038) {
            if (~this.field6589 != ~var3) {
               if (var3 != 0) {
                  OpenGL.glBindTexture(var3, 0);
                  OpenGL.glDisable(var3);
               }

               OpenGL.glEnable(this.field6589);
               this.field6592.field7157[var2] = this.field6589;
            }

            OpenGL.glBindTexture(this.field6589, this.field6597);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6600[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "([BIIII)V",
      line = 94
   )
   public final void method3339(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field6596;
         if (~arg3 < -1 && !class471.method3415(arg3, true)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 < -1 && !class471.method3415(arg2, true)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = this.field6582.field5392;
            int var8 = 0;
            if (arg4 <= 110) {
               this.field6592 = null;
            }

            int var9 = ~arg3 > ~arg2 ? arg3 : arg2;
            int var10 = arg3 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg0;
            byte[] var13 = new byte[var7 * var11 * var10];

            while(true) {
               OpenGL.glTexImage2Dub(arg1, var8, this.method3345((byte)-29), arg3, arg2, 0, class270.method2074(this.field6582, 21), 5121, var12, 0);
               if (~var9 >= -2) {
                  return;
               }

               int var10000;
               label101: {
                  int var14 = arg3 * var7;
                  byte[] var15 = var13;
                  int var16 = 0;
                  if (var6) {
                     var10000 = var16;
                  } else if (~var16 <= ~var7) {
                     var13 = var12;
                     var12 = var15;
                     arg2 = var11;
                     arg3 = var10;
                     ++var8;
                     var9 >>= 1;
                     var11 >>= 1;
                     var10000 = var10 >> 1;
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
                     if (var6 || ~var11 < ~var20) {
                        do {
                           label95: {
                              int var21 = 0;
                              if (var6) {
                                 var10000 = var12[var18];
                              } else if (~var10 >= ~var21) {
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
                                 int var25 = var12[var19] + var24;
                                 var18 = var7 + var23;
                                 int var26 = var7 + var19;
                                 int var27 = var12[var26] + var25;
                                 var19 = var7 + var26;
                                 var13[var17] = (byte)(var27 >> 2);
                                 var17 += var7;
                                 ++var21;
                                 if (~var10 >= ~var21) {
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
                        } while(~var11 < ~var20);
                     }

                     ++var16;
                     if (~var16 <= ~var7) {
                        var13 = var12;
                        var12 = var15;
                        arg2 = var11;
                        arg3 = var10;
                        ++var8;
                        var9 >>= 1;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var29) {
         throw class237.method1823(var29, field6600[10] + (arg0 != null ? field6600[0] : field6600[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "(I)V",
      line = 197
   )
   private final void method3340(int arg0) {
      try {
         ++field6594;
         if (this.field6597 > 0) {
            this.field6592.method3584(this.method3346((byte)112), this.field6597, arg0 ^ 34936);
            this.field6597 = 0;
         }

         if (arg0 != 34846) {
            method3347((byte)13);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6600[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "finalize",
      descriptor = "()V",
      line = 218
   )
   protected final void finalize() throws Throwable {
      try {
         ++field6588;
         this.method3340(34846);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6600[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(IZ)V",
      line = 228
   )
   private final void method3341(int arg0, boolean arg1) {
      try {
         if (arg1) {
            ++field6580;
            this.field6592.field5232 -= arg0;
            this.field6592.field5232 += this.method3346((byte)-127);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6600[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(II[FII)V",
      line = 240
   )
   public final void method3342(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field6598;
         if (arg4 > 0 && !class471.method3415(arg4, true)) {
            throw new IllegalArgumentException("");
         } else if (~arg0 < -1 && !class471.method3415(arg0, true)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = 121 % ((arg3 - -50) / 45);
            int var8 = this.field6582.field5392;
            int var9 = 0;
            int var10 = ~arg0 >= ~arg4 ? arg0 : arg4;
            int var11 = arg4 >> 1;
            int var12 = arg0 >> 1;
            float[] var13 = arg2;
            float[] var14 = new float[var11 * var12 * var8];

            while(true) {
               OpenGL.glTexImage2Df(arg1, var9, this.method3345((byte)-29), arg4, arg0, 0, class270.method2074(this.field6582, 21), 5126, var13, 0);
               if (var10 <= 1) {
                  return;
               }

               int var10000;
               label87: {
                  int var15 = arg4 * var8;
                  int var16 = 0;
                  float[] var28;
                  if (var6) {
                     var10000 = var16;
                  } else if (var16 >= var8) {
                     var28 = var14;
                     var14 = var13;
                     arg0 = var12;
                     arg4 = var11;
                     var13 = var28;
                     ++var9;
                     var12 >>= 1;
                     var11 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label87;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var15 + var16;
                     int var20 = 0;
                     if (var6 || ~var12 < ~var20) {
                        do {
                           int var21 = 0;
                           if (var6 || var21 < var11) {
                              do {
                                 float var22 = var13[var18];
                                 int var23 = var8 + var18;
                                 float var24 = var13[var23] + var22;
                                 var18 = var8 + var23;
                                 float var25 = var13[var19] + var24;
                                 int var26 = var8 + var19;
                                 float var27 = var13[var26] + var25;
                                 var14[var17] = var27 * 0.25F;
                                 var19 = var8 + var26;
                                 var17 += var8;
                                 ++var21;
                              } while(var21 < var11);
                           }

                           var19 += var15;
                           var18 += var15;
                           ++var20;
                        } while(~var12 < ~var20);
                     }

                     ++var16;
                     if (var16 >= var8) {
                        var28 = var14;
                        var14 = var13;
                        arg0 = var12;
                        arg4 = var11;
                        var13 = var28;
                        ++var9;
                        var12 >>= 1;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var30) {
         throw class237.method1823(var30, field6600[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6600[0] : field6600[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "d",
      descriptor = "(B)V",
      line = 341
   )
   private final void method3343(byte arg0) {
      try {
         label35: {
            ++field6591;
            this.field6592.method2804(this, -2);
            if (class711.field10376 != this.field6593) {
               OpenGL.glTexParameteri(this.field6589, 10241, this.field6583 ? 9984 : 9728);
               OpenGL.glTexParameteri(this.field6589, 10240, 9728);
               if (!client.field4360) {
                  break label35;
               }
            }

            OpenGL.glTexParameteri(this.field6589, 10241, this.field6583 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6589, 10240, 9729);
         }

         if (arg0 <= 104) {
            this.field6589 = -126;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6600[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(ILgj;)V",
      line = 363
   )
   public final void method1425(int arg0, class663 arg1) {
      try {
         if (this.field6593 != arg1) {
            this.field6593 = arg1;
            this.method3343((byte)114);
         }

         ++field6579;
         if (arg0 >= -116) {
            this.field6592 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6600[7] + arg0 + ',' + (arg1 != null ? field6600[0] : field6600[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "<init>",
      descriptor = "(Lwi;ILak;Lria;IZ)V",
      line = 614
   )
   public class458(class494 arg0, int arg1, class371 arg2, class301 arg3, int arg4, boolean arg5) {
      try {
         this.field6585 = arg4;
         this.field6589 = arg1;
         this.field6582 = arg2;
         this.field6590 = arg3;
         this.field6583 = arg5;
         this.field6592 = arg0;
         OpenGL.glGenTextures(1, class504.field7311, 0);
         this.field6597 = class504.field7311[0];
         this.method3343((byte)119);
         this.method3341(0, true);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6600[6] + (arg0 != null ? field6600[0] : field6600[1]) + ',' + arg1 + ',' + (arg2 != null ? field6600[0] : field6600[1]) + ',' + (arg3 != null ? field6600[0] : field6600[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(III[II)V",
      line = 386
   )
   public final void method3344(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field6586;
         if (~arg0 < -1 && !class471.method3415(arg0, true)) {
            throw new IllegalArgumentException("");
         } else if (arg1 > 0 && !class471.method3415(arg1, true)) {
            throw new IllegalArgumentException("");
         } else if (class424.field6036 != this.field6582) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = 0;
            if (arg4 != 1) {
               this.field6585 = 120;
            }

            int var8 = ~arg1 >= ~arg0 ? arg1 : arg0;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            int[] var11 = arg3;
            int[] var12 = new int[var9 * var10];

            while(true) {
               OpenGL.glTexImage2Di(arg2, var7, this.method3345((byte)-29), arg0, arg1, 0, 32993, this.field6592.field7163, var11, 0);
               if (var8 <= 1) {
                  return;
               }

               int var10000;
               label92: {
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = var14 - -arg0;
                  int var16 = 0;
                  int[] var38;
                  if (var6) {
                     var10000 = 0;
                  } else if (~var10 >= ~var16) {
                     var38 = var12;
                     var12 = var11;
                     var11 = var38;
                     arg0 = var9;
                     arg1 = var10;
                     var9 >>= 1;
                     ++var7;
                     var8 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label92;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     label89: {
                        int var17 = var10000;
                        if (var6) {
                           var10000 = var11[var14++];
                        } else if (var17 >= var9) {
                           var15 += arg0;
                           var10000 = arg0 + var14;
                           if (!var6) {
                              break label89;
                           }
                        } else {
                           var10000 = var11[var14++];
                        }

                        while(true) {
                           int var18 = var10000;
                           int var19 = var11[var15++];
                           int var20 = var11[var14++];
                           int var21 = var11[var15++];
                           int var22 = (16765625 & var18) >> 16;
                           int var23 = var18 & 255;
                           int var24 = var18 >> 24 & 255;
                           int var25 = 255 & var18 >> 8;
                           int var26 = (var20 & 255) + var23;
                           int var27 = ((16775263 & var20) >> 16) + var22;
                           int var28 = (var20 >> 24 & 255) + var24;
                           int var29 = (var20 >> 8 & 255) + var25;
                           int var30 = (255 & var19 >> 24) + var28;
                           int var31 = (255 & var19 >> 16) + var27;
                           int var32 = (var19 >> 8 & 255) + var29;
                           int var33 = (255 & var19) + var26;
                           int var34 = (var21 & 255) + var33;
                           int var35 = ((var21 & 16728730) >> 16) + var31;
                           int var36 = (var21 >> 24 & 255) + var30;
                           int var37 = (255 & var21 >> 8) + var32;
                           var12[var13++] = class300.method2238(class556.method3988(255, var34 >> 2), class300.method2238(class300.method2238(class556.method3988(-16777216, var36 << 22), class556.method3988(var35 << 14, 16711680)), class556.method3988(var37, 1020) << 6));
                           ++var17;
                           if (var17 >= var9) {
                              var15 += arg0;
                              var10000 = arg0 + var14;
                              if (!var6) {
                                 break;
                              }
                           } else {
                              var10000 = var11[var14++];
                           }
                        }
                     }

                     var14 = var10000;
                     ++var16;
                     if (~var10 >= ~var16) {
                        var38 = var12;
                        var12 = var11;
                        var11 = var38;
                        arg0 = var9;
                        arg1 = var10;
                        var9 >>= 1;
                        ++var7;
                        var8 >>= 1;
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
         throw class237.method1823(var40, field6600[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6600[0] : field6600[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "c",
      descriptor = "(B)I",
      line = 493
   )
   public final int method3345(byte arg0) {
      try {
         ++field6584;
         if (arg0 != -29) {
            this.field6597 = -10;
         }

         if (class301.field4117 != this.field6590) {
            if (class301.field4120 != this.field6590) {
               if (class301.field4121 == this.field6590) {
                  if (class14.field155 == this.field6582) {
                     return 34837;
                  }

                  if (class424.field6036 == this.field6582) {
                     return 34836;
                  }

                  if (class46.field621 == this.field6582) {
                     return 34838;
                  }

                  if (class14.field166 == this.field6582) {
                     return 34840;
                  }

                  if (class227.field3212 == this.field6582) {
                     return 34841;
                  }

                  if (class626.field9193 == this.field6582) {
                     return 6145;
                  }
               }
            } else {
               if (class14.field155 == this.field6582) {
                  return 34843;
               }

               if (class424.field6036 == this.field6582) {
                  return 34842;
               }

               if (class46.field621 == this.field6582) {
                  return 34844;
               }

               if (class14.field166 == this.field6582) {
                  return 34846;
               }

               if (class227.field3212 == this.field6582) {
                  return 34847;
               }

               if (class626.field9193 == this.field6582) {
                  return 6145;
               }
            }
         } else {
            if (class14.field155 == this.field6582) {
               return 6407;
            }

            if (class424.field6036 == this.field6582) {
               return 6408;
            }

            if (class46.field621 == this.field6582) {
               return 6406;
            }

            if (class14.field166 == this.field6582) {
               return 6409;
            }

            if (class227.field3212 == this.field6582) {
               return 6410;
            }

            if (class626.field9193 == this.field6582) {
               return 6145;
            }
         }

         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6600[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "e",
      descriptor = "(B)I",
      line = 593
   )
   private final int method3346(byte arg0) {
      try {
         int var2 = -111 / ((arg0 - -40) / 58);
         ++field6599;
         int var3 = this.field6582.field5392 * this.field6585 * this.field6590.field4112;
         return this.field6583 ? var3 * 4 / 3 : var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6600[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "(B)V",
      line = 605
   )
   public static void method3347(byte arg0) {
      try {
         int var1 = -80 % ((arg0 - -42) / 63);
         field6587 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6600[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3348(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3349(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
