import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class500 {
   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "Z"
   )
   public boolean field7253 = false;
   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7259 = new String[]{method3634(method3633("R\r)\u0012@")), method3634(method3633("BB){~\u0001")), method3634(method3633("GVkP")), method3634(method3633("BB)u~\u0001")), method3634(method3633("BB)\u007f~\u0001")), method3634(method3633("BB)j\u007f\u0001")), method3634(method3633("BB)y~\u0001")), method3634(method3633("BB)}~\u0001")), method3634(method3633("BB)~~\u0001")), method3634(method3633("BB)x~\u0001")), method3634(method3633("BB)z~\u0001")), method3634(method3633("BB)k\u007f\u0001"))};
   @OriginalMember(
      owner = "client!ka",
      name = "p",
      descriptor = "I"
   )
   public static int field7246 = 0;
   @OriginalMember(
      owner = "client!ka",
      name = "m",
      descriptor = "S"
   )
   public static short field7255 = 205;
   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "S"
   )
   public static short field7254 = 1;
   @OriginalMember(
      owner = "client!ka",
      name = "o",
      descriptor = "I"
   )
   public static int field7243;
   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "I"
   )
   public static int field7244;
   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "I"
   )
   public static int field7245;
   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "I"
   )
   public static int field7247;
   @OriginalMember(
      owner = "client!ka",
      name = "l",
      descriptor = "I"
   )
   public static int field7248;
   @OriginalMember(
      owner = "client!ka",
      name = "g",
      descriptor = "I"
   )
   public static int field7249;
   @OriginalMember(
      owner = "client!ka",
      name = "i",
      descriptor = "I"
   )
   public static int field7250;
   @OriginalMember(
      owner = "client!ka",
      name = "n",
      descriptor = "I"
   )
   public static int field7251;
   @OriginalMember(
      owner = "client!ka",
      name = "h",
      descriptor = "I"
   )
   public static int field7252;
   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "I"
   )
   public static int field7256;
   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "I"
   )
   public static int field7257;
   @OriginalMember(
      owner = "client!ka",
      name = "j",
      descriptor = "I"
   )
   public static int field7258;

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZILqu;IIIIILqu;)V",
      line = 15
   )
   public final void method3622(boolean arg0, int arg1, class106 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
      try {
         ++field7251;
         if (arg1 != -1) {
            this.method168();
            if (!this.method186()) {
               this.method212();
            } else {
               class736 var10 = arg2.field1341[arg1];
               if (arg4 != 30379) {
                  this.field7253 = false;
               }

               class269 var11 = var10.field10751;
               class736 var12 = null;
               if (arg8 != null) {
                  var12 = arg8.field1341[arg3];
                  if (var12.field10751 != var11) {
                     var12 = null;
                  }
               }

               this.method3631(65535, var12, arg6, false, (boolean[])null, var11, (int[])null, arg7, arg5, arg0, var10, false);
               this.method189();
               this.method212();
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field7259[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7259[0] : field7259[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7259[0] : field7259[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IZLqu;IILqu;Lqu;[ZILqu;IIIII)V",
      line = 57
   )
   public final void method3623(int arg0, boolean arg1, class106 arg2, int arg3, int arg4, class106 arg5, class106 arg6, boolean[] arg7, int arg8, class106 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      try {
         ++field7257;
         if (arg14 != -1) {
            if (arg7 != null && ~arg0 != 0) {
               this.method168();
               if (!this.method186()) {
                  this.method212();
               } else {
                  class736 var16 = arg2.field1341[arg14];
                  class269 var17 = var16.field10751;
                  int var18 = 23 / ((-33 - arg10) / 57);
                  class736 var19 = null;
                  if (arg6 != null) {
                     var19 = arg6.field1341[arg13];
                     if (var19.field10751 != var17) {
                        var19 = null;
                     }
                  }

                  this.method3631(65535, var19, arg12, false, arg7, var17, (int[])null, 0, arg8, arg1, var16, false);
                  class736 var20 = arg9.field1341[arg0];
                  class736 var21 = null;
                  if (arg5 != null) {
                     var21 = arg5.field1341[arg4];
                     if (var21.field10751 != var17) {
                        var21 = null;
                     }
                  }

                  this.method210(0, new int[0], 0, 0, 0, 0, arg1);
                  this.method3631(65535, var21, arg11, true, arg7, var20.field10751, (int[])null, 0, arg3, arg1, var20, false);
                  this.method189();
                  this.method212();
               }
            } else {
               this.method3622(arg1, arg14, arg2, arg13, 30379, arg8, arg12, 0, arg6);
            }
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field7259[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7259[0] : field7259[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7259[0] : field7259[2]) + ',' + (arg6 != null ? field7259[0] : field7259[2]) + ',' + (arg7 != null ? field7259[0] : field7259[2]) + ',' + arg8 + ',' + (arg9 != null ? field7259[0] : field7259[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(B)V",
      line = 115
   )
   public static final void method3624(byte arg0) {
      try {
         label129: {
            ++field7258;
            int var1 = class463.field6650 * 512 - -256;
            int var2 = class754.field11175 * 512 + 256;
            int var3 = class102.method851(class561.field8019, (byte)127, var1, var2) + -class612.field8981;
            if (~class483.field6916 <= -101) {
               class224.field3188 = class463.field6650 * 512 + 256;
               class782.field11465 = class754.field11175 * 512 + 256;
               class421.field6021 = class102.method851(class561.field8019, (byte)127, class224.field3188, class782.field11465) - class612.field8981;
               if (!client.field4360) {
                  break label129;
               }
            }

            if (class224.field3188 < var1) {
               class224.field3188 += (-class224.field3188 + var1) * class483.field6916 / 1000 + class662.field9648;
               if (~var1 > ~class224.field3188) {
                  class224.field3188 = var1;
               }
            }

            if (var3 > class421.field6021) {
               class421.field6021 += class662.field9648 - -((-class421.field6021 + var3) * class483.field6916 / 1000);
               if (~var3 > ~class421.field6021) {
                  class421.field6021 = var3;
               }
            }

            if (~class224.field3188 < ~var1) {
               class224.field3188 -= (class224.field3188 - var1) * class483.field6916 / 1000 + class662.field9648;
               if (~var1 < ~class224.field3188) {
                  class224.field3188 = var1;
               }
            }

            if (~class421.field6021 < ~var3) {
               class421.field6021 -= class662.field9648 - -((-var3 + class421.field6021) * class483.field6916 / 1000);
               if (~class421.field6021 > ~var3) {
                  class421.field6021 = var3;
               }
            }

            if (~class782.field11465 > ~var2) {
               class782.field11465 += class662.field9648 - -((-class782.field11465 + var2) * class483.field6916 / 1000);
               if (~var2 > ~class782.field11465) {
                  class782.field11465 = var2;
               }
            }

            if (~var2 > ~class782.field11465) {
               class782.field11465 -= (-var2 + class782.field11465) * class483.field6916 / 1000 + class662.field9648;
               if (~class782.field11465 > ~var2) {
                  class782.field11465 = var2;
               }
            }
         }

         int var4 = class27.field415 * 512 - -256;
         int var5 = class188.field2679 * 512 + 256;
         int var6 = class102.method851(class561.field8019, (byte)127, var4, var5) - class102.field1309;
         if (arg0 != 50) {
            field7255 = -80;
         }

         int var7 = -class224.field3188 + var4;
         int var8 = -class421.field6021 + var6;
         int var9 = -class782.field11465 + var5;
         int var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
         int var11 = (int)(Math.atan2((double)var8, (double)var10) * 2607.5945876176133D) & 16383;
         int var12 = 16383 & (int)(Math.atan2((double)var7, (double)var9) * -2607.5945876176133D);
         if (~var11 > -1025) {
            var11 = 1024;
         }

         if (var11 > 3072) {
            var11 = 3072;
         }

         if (class207.field2966 < var11) {
            class207.field2966 += (-class207.field2966 + var11 >> 3) * class415.field5979 / 1000 + class762.field11256 << 3;
            if (var11 < class207.field2966) {
               class207.field2966 = var11;
            }
         }

         if (class207.field2966 > var11) {
            class207.field2966 -= (class207.field2966 - var11 >> 3) * class415.field5979 / 1000 + class762.field11256 << 3;
            if (class207.field2966 < var11) {
               class207.field2966 = var11;
            }
         }

         int var13 = -class10.field96 + var12;
         if (var13 > 8192) {
            var13 -= 16384;
         }

         if (var13 < -8192) {
            var13 += 16384;
         }

         int var14 = var13 >> 3;
         if (var14 > 0) {
            class10.field96 += class415.field5979 * var14 / 1000 + class762.field11256 << 3;
            class10.field96 &= 16383;
         }

         if (~var14 > -1) {
            class10.field96 -= -var14 * class415.field5979 / 1000 + class762.field11256 << 3;
            class10.field96 &= 16383;
         }

         int var15 = var12 - class10.field96;
         if (var15 > 8192) {
            var15 -= 16384;
         }

         if (~var15 > 8191) {
            var15 += 16384;
         }

         if (~var15 > -1 && ~var14 < -1 || var15 > 0 && var14 < 0) {
            class10.field96 = var12;
         }

         class723.field10552 = 0;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field7259[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[FIIIII)V",
      line = 273
   )
   public static final void method3625(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         ++field7243;
         if (~arg4 < -1 && !class471.method3415(arg4, true)) {
            throw new IllegalArgumentException("");
         } else if (~arg3 < -1 && !class471.method3415(arg3, true)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class596.method4332(arg0, 6409);
            int var9 = 0;
            int var10 = arg4 >= arg3 ? arg3 : arg4;
            int var11 = arg4 >> 1;
            if (arg6 != 1000) {
               method3624((byte)12);
            }

            int var12 = arg3 >> 1;
            float[] var13 = arg1;
            float[] var14 = new float[var8 * var11 * var12];

            while(true) {
               OpenGL.glTexImage2Df(arg2, var9, arg5, arg4, arg3, 0, arg0, 5126, var13, 0);
               if (~var10 >= -2) {
                  return;
               }

               int var10000;
               label91: {
                  int var15 = arg4 * var8;
                  int var16 = 0;
                  float[] var28;
                  if (var7) {
                     var10000 = var16;
                  } else if (var16 >= var8) {
                     var28 = var14;
                     var14 = var13;
                     arg3 = var12;
                     var13 = var28;
                     arg4 = var11;
                     var12 >>= 1;
                     var11 >>= 1;
                     ++var9;
                     var10000 = var10 >> 1;
                     if (!var7) {
                        break label91;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var15 + var16;
                     int var20 = 0;
                     if (var7 || ~var12 < ~var20) {
                        do {
                           int var21 = 0;
                           if (var7 || ~var21 > ~var11) {
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
                              } while(~var21 > ~var11);
                           }

                           var18 += var15;
                           var19 += var15;
                           ++var20;
                        } while(~var12 < ~var20);
                     }

                     ++var16;
                     if (var16 >= var8) {
                        var28 = var14;
                        var14 = var13;
                        arg3 = var12;
                        var13 = var28;
                        arg4 = var11;
                        var12 >>= 1;
                        var11 >>= 1;
                        ++var9;
                        var10000 = var10 >> 1;
                        if (!var7) {
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
         throw class237.method1823(var30, field7259[4] + arg0 + ',' + (arg1 != null ? field7259[0] : field7259[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ILqu;IIII[IZLqu;II)V",
      line = 373
   )
   public final void method3626(int arg0, class106 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, boolean arg7, class106 arg8, int arg9, int arg10) {
      try {
         ++field7249;
         if (~arg9 != 0) {
            this.method168();
            if (!this.method186()) {
               this.method212();
            } else {
               class736 var12 = arg8.field1341[arg9];
               class269 var13 = var12.field10751;
               class736 var14 = null;
               if (arg1 != null) {
                  var14 = arg1.field1341[arg4];
                  if (var14.field10751 != var13) {
                     var14 = null;
                  }
               }

               this.method3631(arg0, var14, arg3, false, (boolean[])null, var13, arg6, arg5, arg2, arg7, var12, false);
               this.method189();
               this.method212();
               if (arg10 != 0) {
                  this.method191();
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field7259[1] + arg0 + ',' + (arg1 != null ? field7259[0] : field7259[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7259[0] : field7259[2]) + ',' + arg7 + ',' + (arg8 != null ? field7259[0] : field7259[2]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILqu;)V",
      line = 415
   )
   public final void method3627(int arg0, int arg1, class106 arg2) {
      boolean var4 = client.field4360;

      try {
         ++field7245;
         if (arg0 != -1) {
            this.method168();
            if (!this.method186()) {
               this.method212();
            } else {
               if (arg1 != 29604) {
                  this.method190((class521)null);
               }

               class736 var5 = arg2.field1341[arg0];
               class269 var6 = var5.field10751;
               int var7 = 0;
               if (!var4 && var5.field10754 <= var7) {
                  this.method189();
                  this.method212();
               } else {
                  do {
                     short var8 = var5.field10746[var7];
                     if (var6.field3720[var8]) {
                        if (var5.field10758[var7] != -1) {
                           this.method205(0, 0, 0, 0);
                        }

                        this.method205(var6.field3717[var8], var5.field10750[var7], var5.field10755[var7], var5.field10745[var7]);
                     }

                     ++var7;
                  } while(var5.field10754 > var7);

                  this.method189();
                  this.method212();
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field7259[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7259[0] : field7259[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZIIIIB[I[III)V",
      line = 467
   )
   private final void method3628(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[] arg6, int[] arg7, int arg8, int arg9) {
      boolean var11 = client.field4360;

      try {
         ++field7252;
         if (arg5 <= 49) {
            this.method190((class521)null);
         }

         label109: {
            if (arg4 != 1) {
               if (arg4 == 2) {
                  if (arg3 == 0 || arg3 == 1) {
                     arg8 = -arg8;
                     arg2 = -arg2;
                     if (!var11) {
                        break label109;
                     }
                  }

                  if (arg3 != 2) {
                     break label109;
                  }

                  arg2 = -arg2 & 16383;
                  arg8 = -arg8 & 16383;
                  if (!var11) {
                     break label109;
                  }
               }

               if (arg4 != 3) {
                  break label109;
               }

               if (~arg3 == -1 || arg3 == 1) {
                  int var12 = arg8;
                  arg8 = -arg2;
                  arg2 = var12;
                  if (!var11) {
                     break label109;
                  }
               }

               if (~arg3 != -4) {
                  if (arg3 != 2) {
                     break label109;
                  }

                  int var13 = arg8;
                  arg8 = 16383 & arg2;
                  arg2 = -var13 & 16383;
                  if (!var11) {
                     break label109;
                  }
               }

               int var14 = arg8;
               arg8 = arg2;
               arg2 = var14;
               if (!var11) {
                  break label109;
               }
            }

            if (arg3 != 0 && ~arg3 != -2) {
               if (~arg3 == -4) {
                  int var15 = arg8;
                  arg8 = arg2;
                  arg2 = var15;
                  if (!var11) {
                     break label109;
                  }
               }

               if (~arg3 != -3) {
                  break label109;
               }

               int var16 = arg8;
               arg8 = -arg2 & 16383;
               arg2 = 16383 & var16;
               if (!var11) {
                  break label109;
               }
            }

            int var17 = -arg8;
            arg8 = arg2;
            arg2 = var17;
         }

         if (arg9 != 65535) {
            this.method165(arg3, arg7, arg8, arg1, arg2, arg0, arg9, arg6);
         } else {
            this.method210(arg3, arg7, arg8, arg1, arg2, arg4, arg0);
         }
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field7259[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7259[0] : field7259[2]) + ',' + (arg7 != null ? field7259[0] : field7259[2]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIIIILs;II)V",
      line = 585
   )
   public final void method3629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class295 arg6, int arg7, int arg8) {
      boolean var10 = client.field4360;

      try {
         ++field7256;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         int var14 = -arg0 / 2;
         int var15 = -arg1 / 2;
         int var16 = arg6.method2220(arg2 + var15, arg3 + var14, -77);
         int var17 = arg0 / 2;
         int var18 = -arg1 / 2;
         int var19 = arg6.method2220(arg2 + var18, arg3 + var17, 87);
         int var20 = -arg0 / 2;
         int var21 = arg1 / 2;
         int var22 = arg6.method2220(arg2 + var21, arg3 + var20, 82);
         int var23 = arg0 / 2;
         int var24 = arg1 / 2;
         int var25 = -22 / ((-29 - arg4) / 46);
         int var26 = arg6.method2220(arg2 + var24, arg3 - -var23, 97);
         int var27 = ~var19 < ~var16 ? var16 : var19;
         int var28 = ~var26 < ~var22 ? var22 : var26;
         int var29 = var26 <= var19 ? var26 : var19;
         if (~arg1 != -1) {
            int var30 = (int)(2607.5945876176133D * Math.atan2((double)(var27 - var28), (double)arg1)) & 16383;
            if (~var30 != -1) {
               if (arg8 != 0) {
                  label106: {
                     if (var30 > 8192) {
                        int var31 = -arg8 + 16384;
                        if (~var30 <= ~var31) {
                           break label106;
                        }

                        var30 = var31;
                        if (!var10) {
                           break label106;
                        }
                     }

                     if (~var30 < ~arg8) {
                        var30 = arg8;
                     }
                  }
               }

               this.method227(var30);
            }
         }

         int var32 = ~var16 > ~var22 ? var16 : var22;
         int var33 = var16 - -var26;
         if (~arg0 != -1) {
            int var34 = (int)(2607.5945876176133D * Math.atan2((double)(-var29 + var32), (double)arg0)) & 16383;
            if (var34 != 0) {
               if (arg7 != 0) {
                  label109: {
                     if (~var34 >= -8193) {
                        if (~var34 >= ~arg7) {
                           break label109;
                        }

                        var34 = arg7;
                        if (!var10) {
                           break label109;
                        }
                     }

                     int var35 = -arg7 + 16384;
                     if (var34 < var35) {
                        var34 = var35;
                     }
                  }
               }

               this.method193(var34);
            }
         }

         if (~(var19 + var22) > ~var33) {
            var33 = var19 - -var22;
         }

         int var36 = (var33 >> 1) + -arg5;
         if (var36 != 0) {
            this.method164(0, var36, 0);
         }
      } catch (RuntimeException var38) {
         throw class237.method1823(var38, field7259[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7259[0] : field7259[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(III)Lol;",
      line = 707
   )
   public static final class300 method3630(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      return var3 == null ? null : var3.field7474;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ILpw;IZ[ZLse;[IIIZLpw;Z)V",
      line = 723
   )
   private final void method3631(int arg0, class736 arg1, int arg2, boolean arg3, boolean[] arg4, class269 arg5, int[] arg6, int arg7, int arg8, boolean arg9, class736 arg10, boolean arg11) {
      boolean var13 = client.field4360;

      try {
         ++field7244;
         if (arg1 != null && arg2 != 0) {
            int var17 = 0;
            if (!arg11) {
               int var18 = 0;
               int var19 = 0;
               boolean var20;
               boolean var21;
               if (var13) {
                  var20 = false;
                  if (arg10.field10754 > var17 && arg10.field10746[var17] == var19) {
                     var20 = true;
                  }

                  var21 = false;
                  if (var18 < arg1.field10754 && arg1.field10746[var18] == var19) {
                     var21 = true;
                  }
               } else {
                  if (~var19 <= ~arg5.field3719) {
                     return;
                  }

                  var20 = false;
                  if (arg10.field10754 > var17 && arg10.field10746[var17] == var19) {
                     var20 = true;
                  }

                  var21 = false;
                  if (var18 < arg1.field10754 && arg1.field10746[var18] == var19) {
                     var21 = true;
                  }
               }

               while(true) {
                  if (!var20 && !var21) {
                     ++var19;
                  } else {
                     label346: {
                        if (arg4 != null && arg3 == !arg4[var19] && arg5.field3717[var19] != 0) {
                           if (var20) {
                              ++var17;
                           }

                           if (!var21) {
                              ++var19;
                              break label346;
                           }

                           ++var18;
                           if (!var13) {
                              ++var19;
                              break label346;
                           }
                        }

                        short var22 = 0;
                        int var23 = arg5.field3717[var19];
                        if (var23 != 3) {
                           if (var23 == 10) {
                              var22 = 128;
                           }
                        } else {
                           var22 = 128;
                        }

                        byte var24;
                        short var25;
                        short var26;
                        short var27;
                        short var28;
                        if (!var20) {
                           var24 = 0;
                           var25 = var22;
                           var26 = -1;
                           var27 = var22;
                           var28 = var22;
                           if (var13) {
                              var25 = arg10.field10745[var17];
                              var28 = arg10.field10755[var17];
                              var27 = arg10.field10750[var17];
                              var26 = arg10.field10758[var17];
                              var24 = arg10.field10744[var17];
                              ++var17;
                           }
                        } else {
                           var25 = arg10.field10745[var17];
                           var28 = arg10.field10755[var17];
                           var27 = arg10.field10750[var17];
                           var26 = arg10.field10758[var17];
                           var24 = arg10.field10744[var17];
                           ++var17;
                        }

                        short var29;
                        short var30;
                        byte var31;
                        short var32;
                        short var33;
                        if (var21) {
                           var29 = arg1.field10745[var18];
                           var30 = arg1.field10750[var18];
                           var31 = arg1.field10744[var18];
                           var32 = arg1.field10758[var18];
                           var33 = arg1.field10755[var18];
                           ++var18;
                           if (var13) {
                              var33 = var22;
                              var30 = var22;
                              var29 = var22;
                              var32 = -1;
                              var31 = 0;
                           }
                        } else {
                           var33 = var22;
                           var30 = var22;
                           var29 = var22;
                           var32 = -1;
                           var31 = 0;
                        }

                        int var34;
                        int var35;
                        int var36;
                        label360: {
                           if (~(var24 & 2) != -1 || ~(1 & var31) != -1) {
                              var34 = var27;
                              var35 = var28;
                              var36 = var25;
                              if (!var13) {
                                 break label360;
                              }
                           }

                           int var39;
                           int var40;
                           int var41;
                           if (~var23 != -3) {
                              label284: {
                                 if (var23 == 9) {
                                    int var37 = 16383 & -var27 + var30;
                                    if (var37 >= 8192) {
                                       var37 -= 16384;
                                    }

                                    var34 = 16383 & arg2 * var37 / arg8 + var27;
                                    var36 = 0;
                                    var35 = 0;
                                    if (!var13) {
                                       break label284;
                                    }
                                 }

                                 if (var23 == 7) {
                                    int var38 = 63 & -var27 + var30;
                                    if (var38 >= 32) {
                                       var38 -= 64;
                                    }

                                    var34 = 63 & arg2 * var38 / arg8 + var27;
                                    var35 = (var33 - var28) * arg2 / arg8 + var28;
                                    var36 = var25 - -((-var25 + var29) * arg2 / arg8);
                                    if (var13) {
                                       var36 = (-var25 + var29) * arg2 / arg8 + var25;
                                       var35 = (-var28 + var33) * arg2 / arg8 + var28;
                                       var34 = (-var27 + var30) * arg2 / arg8 + var27;
                                       if (var13) {
                                          var39 = 16383 & var30 - var27;
                                          var40 = var33 - var28 & 16383;
                                          if (var40 >= 8192) {
                                             var40 -= 16384;
                                          }

                                          if (var39 >= 8192) {
                                             var39 -= 16384;
                                          }

                                          var41 = 16383 & var29 - var25;
                                          if (~var41 <= -8193) {
                                             var41 -= 16384;
                                          }

                                          var34 = 16383 & var27 - -(arg2 * var39 / arg8);
                                          var35 = arg2 * var40 / arg8 + var28 & 16383;
                                          var36 = 16383 & arg2 * var41 / arg8 + var25;
                                       }
                                    }
                                 } else {
                                    var36 = (-var25 + var29) * arg2 / arg8 + var25;
                                    var35 = (-var28 + var33) * arg2 / arg8 + var28;
                                    var34 = (-var27 + var30) * arg2 / arg8 + var27;
                                    if (var13) {
                                       var39 = 16383 & var30 - var27;
                                       var40 = var33 - var28 & 16383;
                                       if (var40 >= 8192) {
                                          var40 -= 16384;
                                       }

                                       if (var39 >= 8192) {
                                          var39 -= 16384;
                                       }

                                       var41 = 16383 & var29 - var25;
                                       if (~var41 <= -8193) {
                                          var41 -= 16384;
                                       }

                                       var34 = 16383 & var27 - -(arg2 * var39 / arg8);
                                       var35 = arg2 * var40 / arg8 + var28 & 16383;
                                       var36 = 16383 & arg2 * var41 / arg8 + var25;
                                    }
                                 }
                              }
                           } else {
                              var39 = 16383 & var30 - var27;
                              var40 = var33 - var28 & 16383;
                              if (var40 >= 8192) {
                                 var40 -= 16384;
                              }

                              if (var39 >= 8192) {
                                 var39 -= 16384;
                              }

                              var41 = 16383 & var29 - var25;
                              if (~var41 <= -8193) {
                                 var41 -= 16384;
                              }

                              var34 = 16383 & var27 - -(arg2 * var39 / arg8);
                              var35 = arg2 * var40 / arg8 + var28 & 16383;
                              var36 = 16383 & arg2 * var41 / arg8 + var25;
                           }
                        }

                        if (~var26 == 0) {
                           if (var32 != -1) {
                              this.method3628(arg9, 0, 0, 0, arg7, (byte)73, arg6, arg5.field3718[var32], 0, arg5.field3722[var32] & arg0);
                              if (var13) {
                                 this.method3628(arg9, 0, 0, 0, arg7, (byte)114, arg6, arg5.field3718[var26], 0, arg0 & arg5.field3722[var26]);
                              }
                           }
                        } else {
                           this.method3628(arg9, 0, 0, 0, arg7, (byte)114, arg6, arg5.field3718[var26], 0, arg0 & arg5.field3722[var26]);
                        }

                        this.method3628(arg9, var35, var36, var23, arg7, (byte)71, arg6, arg5.field3718[var19], var34, arg0 & arg5.field3722[var19]);
                        ++var19;
                     }
                  }

                  if (~var19 <= ~arg5.field3719) {
                     return;
                  }

                  var20 = false;
                  if (arg10.field10754 > var17 && arg10.field10746[var17] == var19) {
                     var20 = true;
                  }

                  var21 = false;
                  if (var18 < arg1.field10754 && arg1.field10746[var18] == var19) {
                     var21 = true;
                  }
               }
            }
         } else {
            int var14 = 0;
            if (var13 || arg10.field10754 > var14) {
               do {
                  short var15 = arg10.field10746[var14];
                  if (arg4 != null && !arg4[var15] != !arg3 && ~arg5.field3717[var15] != -1) {
                     ++var14;
                  } else {
                     short var16 = arg10.field10758[var14];
                     if (var16 != -1) {
                        this.method3628(arg9, 0, 0, 0, arg7, (byte)97, arg6, arg5.field3718[var16], 0, arg0 & arg5.field3722[var16]);
                     }

                     this.method3628(arg9, arg10.field10755[var14], arg10.field10745[var14], arg5.field3717[var15], arg7, (byte)51, arg6, arg5.field3718[var15], arg10.field10750[var14], arg5.field3722[var15] & arg0);
                     ++var14;
                  }
               } while(arg10.field10754 > var14);

            }
         }
      } catch (RuntimeException var43) {
         throw class237.method1823(var43, field7259[5] + arg0 + ',' + (arg1 != null ? field7259[0] : field7259[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7259[0] : field7259[2]) + ',' + (arg5 != null ? field7259[0] : field7259[2]) + ',' + (arg6 != null ? field7259[0] : field7259[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field7259[0] : field7259[2]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZLjava/lang/String;I)V",
      line = 946
   )
   public static final void method3632(boolean arg0, String arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field7250;
         int var4 = class390.field5657;
         int[] var5 = class254.field3459;
         boolean var6 = false;
         if (!arg0) {
            method3624((byte)45);
         }

         int var7 = 0;
         if (var3 || var4 > var7) {
            do {
               class121 var8 = class380.field5483[var5[var7]];
               if (var8 != null && class564.field8045 != var8 && var8.field1575 != null && var8.field1575.equalsIgnoreCase(arg1)) {
                  var6 = true;
                  if (~arg2 == -2) {
                     ++class176.field2430;
                     class447 var9 = class40.method350(class636.field9305, class430.field6150.field106, true);
                     var9.field6359.method1163((byte)35, var5[var7]);
                     var9.field6359.method1200(0, -12649);
                     class430.field6150.method55(13256, var9);
                     if (!var3) {
                        break;
                     }
                  }

                  if (~arg2 == -5) {
                     ++class610.field8963;
                     class447 var10 = class40.method350(class695.field10200, class430.field6150.field106, arg0);
                     var10.field6359.method1165(128, 0);
                     var10.field6359.method1190(-9720, var5[var7]);
                     class430.field6150.method55(13256, var10);
                     if (!var3) {
                        break;
                     }
                  }

                  if (arg2 != 5) {
                     if (arg2 != 6) {
                        if (arg2 != 7) {
                           if (~arg2 != -10) {
                              break;
                           }

                           class447 var11 = class40.method350(class94.field1222, class430.field6150.field106, true);
                           var11.field6359.method1185(var5[var7], true);
                           var11.field6359.method1183(-637822779, 0);
                           class430.field6150.method55(13256, var11);
                           if (!var3) {
                              break;
                           }
                        }

                        ++class371.field5389;
                        class447 var12 = class40.method350(class470.field6751, class430.field6150.field106, true);
                        var12.field6359.method1190(-9720, var5[var7]);
                        var12.field6359.method1165(128, 0);
                        class430.field6150.method55(13256, var12);
                        if (!var3) {
                           break;
                        }
                     }

                     ++class746.field10942;
                     class447 var13 = class40.method350(class110.field1386, class430.field6150.field106, true);
                     var13.field6359.method1183(-637822779, 0);
                     var13.field6359.method1185(var5[var7], true);
                     class430.field6150.method55(13256, var13);
                     if (!var3) {
                        break;
                     }
                  }

                  ++class128.field1631;
                  class447 var14 = class40.method350(class491.field7024, class430.field6150.field106, arg0);
                  var14.field6359.method1190(-9720, var5[var7]);
                  var14.field6359.method1200(0, -12649);
                  class430.field6150.method55(13256, var14);
                  if (!var3) {
                     break;
                  }
               }

               ++var7;
            } while(var4 > var7);
         }

         if (!var6) {
            class684.method4989(class180.field2500.method1437(class608.field8920, 50) + arg1, 4, 4095);
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field7259[3] + arg0 + ',' + (arg1 != null ? field7259[0] : field7259[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "H",
      descriptor = "(III)V"
   )
   public abstract void method164(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lew;Lsb;II)V"
   )
   public abstract void method182(class521 arg0, class307 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "da",
      descriptor = "()I"
   )
   public abstract int method148();

   @OriginalMember(
      owner = "client!ka",
      name = "ma",
      descriptor = "()I"
   )
   public abstract int method225();

   @OriginalMember(
      owner = "client!ka",
      name = "WA",
      descriptor = "()I"
   )
   public abstract int method217();

   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "()V"
   )
   public abstract void method168();

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "()V"
   )
   public abstract void method212();

   @OriginalMember(
      owner = "client!ka",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method215();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lew;Lsb;I)V"
   )
   public abstract void method192(class521 arg0, class307 arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method177(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "ia",
      descriptor = "(SS)V"
   )
   public abstract void method157(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lew;IZ)V"
   )
   public abstract void method167(class521 arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "VA",
      descriptor = "(I)V"
   )
   public abstract void method193(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "s",
      descriptor = "(I)V"
   )
   public abstract void method195(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "na",
      descriptor = "()I"
   )
   public abstract int method174();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method156(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "()V"
   )
   public abstract void method169();

   @OriginalMember(
      owner = "client!ka",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public abstract void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!ka",
      name = "F",
      descriptor = "()Z"
   )
   public abstract boolean method222();

   @OriginalMember(
      owner = "client!ka",
      name = "HA",
      descriptor = "()I"
   )
   public abstract int method197();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method187(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "EA",
      descriptor = "()I"
   )
   public abstract int method201();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public abstract void method173(class500 arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "V",
      descriptor = "()I"
   )
   public abstract int method199();

   @OriginalMember(
      owner = "client!ka",
      name = "O",
      descriptor = "(III)V"
   )
   public abstract void method166(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "FA",
      descriptor = "(I)V"
   )
   public abstract void method227(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method219(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "aa",
      descriptor = "(SS)V"
   )
   public abstract void method176(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public abstract class196 method154(class196 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lew;)V"
   )
   public abstract void method190(class521 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILew;ZI)Z"
   )
   public abstract boolean method183(int arg0, int arg1, class521 arg2, boolean arg3, int arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public abstract void method210(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "fa",
      descriptor = "()I"
   )
   public abstract int method226();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "()[Ltu;"
   )
   public abstract class370[] method153();

   @OriginalMember(
      owner = "client!ka",
      name = "RA",
      descriptor = "()I"
   )
   public abstract int method220();

   @OriginalMember(
      owner = "client!ka",
      name = "NA",
      descriptor = "()Z"
   )
   public abstract boolean method186();

   @OriginalMember(
      owner = "client!ka",
      name = "G",
      descriptor = "()I"
   )
   public abstract int method162();

   @OriginalMember(
      owner = "client!ka",
      name = "LA",
      descriptor = "(I)V"
   )
   public abstract void method204(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method151();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILew;ZII)Z"
   )
   public abstract boolean method206(int arg0, int arg1, class521 arg2, boolean arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "()[Lvga;"
   )
   public abstract class94[] method188();

   @OriginalMember(
      owner = "client!ka",
      name = "P",
      descriptor = "(IIII)V"
   )
   public abstract void method205(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "()Z"
   )
   public abstract boolean method191();

   @OriginalMember(
      owner = "client!ka",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public abstract void method224(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "ua",
      descriptor = "()I"
   )
   public abstract int method214();

   @OriginalMember(
      owner = "client!ka",
      name = "wa",
      descriptor = "()V"
   )
   public abstract void method189();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public abstract class500 method159(byte arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3633(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3634(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
