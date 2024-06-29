import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class550 extends class428 {
   @OriginalMember(
      owner = "client!ni",
      name = "m",
      descriptor = "Lkk;"
   )
   private class204 field7877;
   @OriginalMember(
      owner = "client!ni",
      name = "I",
      descriptor = "I"
   )
   public int field7878;
   @OriginalMember(
      owner = "client!ni",
      name = "r",
      descriptor = "Lea;"
   )
   private class573 field7891;
   @OriginalMember(
      owner = "client!ni",
      name = "L",
      descriptor = "I"
   )
   public int field7876;
   @OriginalMember(
      owner = "client!ni",
      name = "D",
      descriptor = "[I"
   )
   private int[] field7883;
   @OriginalMember(
      owner = "client!ni",
      name = "x",
      descriptor = "F"
   )
   public float field7879;
   @OriginalMember(
      owner = "client!ni",
      name = "t",
      descriptor = "I"
   )
   public int field7873;
   @OriginalMember(
      owner = "client!ni",
      name = "C",
      descriptor = "I"
   )
   public int field7870;
   @OriginalMember(
      owner = "client!ni",
      name = "M",
      descriptor = "Laha;"
   )
   private class404 field7875;
   @OriginalMember(
      owner = "client!ni",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7894 = new String[]{method3954(method3953("\u0007d7\t")), method3954(method3953("\u0012?uKd")), method3954(method3953("\u0007xuYp\u0007x/[1")), method3954(method3953("\u0007xu#1")), method3954(method3953("\u0007xu\"1")), method3954(method3953("\u0007xu/1")), method3954(method3953("\u0007xu,1")), method3954(method3953("\u0007xu&1")), method3954(method3953(" \u007f-\u0004u\u0000u{\u0017x\rx#_")), method3954(method3953("\u0007xu(1")), method3954(method3953("\u0007xu!1")), method3954(method3953("\u0007xu$1")), method3954(method3953("\u0007xu.1")), method3954(method3953("\u0007xu'1")), method3954(method3953("\u0007xu-1")), method3954(method3953("\u0007xu+1")), method3954(method3953("\u0007xu 1")), method3954(method3953("\u0007xu)1"))};
   @OriginalMember(
      owner = "client!ni",
      name = "w",
      descriptor = "I"
   )
   public static int field7868;
   @OriginalMember(
      owner = "client!ni",
      name = "G",
      descriptor = "I"
   )
   public static int field7869;
   @OriginalMember(
      owner = "client!ni",
      name = "q",
      descriptor = "I"
   )
   public static int field7871;
   @OriginalMember(
      owner = "client!ni",
      name = "n",
      descriptor = "I"
   )
   public static int field7874;
   @OriginalMember(
      owner = "client!ni",
      name = "v",
      descriptor = "I"
   )
   public static int field7881;
   @OriginalMember(
      owner = "client!ni",
      name = "B",
      descriptor = "I"
   )
   public static int field7882;
   @OriginalMember(
      owner = "client!ni",
      name = "p",
      descriptor = "I"
   )
   public static int field7884;
   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "I"
   )
   public static int field7885;
   @OriginalMember(
      owner = "client!ni",
      name = "o",
      descriptor = "I"
   )
   public static int field7886;
   @OriginalMember(
      owner = "client!ni",
      name = "F",
      descriptor = "I"
   )
   public static int field7888;
   @OriginalMember(
      owner = "client!ni",
      name = "s",
      descriptor = "I"
   )
   public static int field7889;
   @OriginalMember(
      owner = "client!ni",
      name = "u",
      descriptor = "I"
   )
   public static int field7892;
   @OriginalMember(
      owner = "client!ni",
      name = "A",
      descriptor = "I"
   )
   public static int field7893;
   @OriginalMember(
      owner = "client!ni",
      name = "y",
      descriptor = "Lil;"
   )
   private class7 field7880;
   @OriginalMember(
      owner = "client!ni",
      name = "K",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field7887;
   @OriginalMember(
      owner = "client!ni",
      name = "J",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field7872;
   @OriginalMember(
      owner = "client!ni",
      name = "N",
      descriptor = "[J"
   )
   public static long[] field7890;

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(II)V",
      line = 3
   )
   public final void method3939(int arg0, int arg1) {
      try {
         this.field7887.method5102();
         if (arg1 == 255) {
            ++field7888;
            class485 var3 = this.field7891.method4108(4, true, arg0 * 4, this.field7872, false);
            this.field7880 = new class7(var3, 5121, 4, 0);
            this.field7887 = null;
            this.field7872 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7894[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(BIII)V",
      line = 20
   )
   public final void method3940(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7892;
         int var5 = -59 / ((arg0 - -36) / 34);
         this.field7883[this.field7877.field4071 * arg2 + arg1] = class300.method2238(this.field7883[this.field7877.field4071 * arg2 + arg1], 1 << arg3);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7894[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "([IZI)V",
      line = 30
   )
   public final void method3941(int[] arg0, boolean arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field7869;
         int var5 = 0;
         class77 var6 = this.field7891.field8490;
         if (arg1) {
            method3950((byte)56, (String)null, -95, false);
         }

         int var7;
         int var10000;
         label225: {
            var6.field1856 = 0;
            if (this.field7891.field8469) {
               var7 = 0;
               if (var4 || ~var7 > ~arg2) {
                  do {
                     int var8 = arg0[var7];
                     int var9 = this.field7883[var8];
                     short[] var10 = this.field7877.field2909[var8];
                     if (var9 != 0) {
                        if (var10 == null) {
                           ++var7;
                        } else {
                           int var11 = 0;
                           int var12 = 0;
                           if (!var4 && ~var12 <= ~var10.length) {
                              ++var7;
                           } else {
                              do {
                                 if (~(var9 & 1 << var11++) == -1) {
                                    var12 += 3;
                                    if (!var4) {
                                       continue;
                                    }
                                 }

                                 ++var5;
                                 var6.method1185(var10[var12++] & 65535, true);
                                 var6.method1185(65535 & var10[var12++], true);
                                 ++var5;
                                 var6.method1185(65535 & var10[var12++], !arg1);
                                 ++var5;
                              } while(~var12 > ~var10.length);

                              ++var7;
                           }
                        }
                     } else {
                        ++var7;
                     }
                  } while(~var7 > ~arg2);
               }

               if (!var4) {
                  var10000 = ~var5;
                  if (!var4) {
                     if (var10000 < -1) {
                        this.field7875.method1010((byte)120, 5123, var6.field1889, var6.field1856);
                        this.field7891.method4144(this.field7877.field2930, (byte)71, this.field7880, this.field7877.field2940, this.field7877.field2932);
                        this.field7891.method4145(this.field7878, (this.field7877.field2920 & 8) != 0, (byte)12, ~(this.field7877.field2920 & 7) != -1);
                        if (this.field7891.field8463) {
                           this.field7891.method557(Integer.MAX_VALUE, this.field7873, this.field7876, this.field7870);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field7879, 1.0F / this.field7879, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field7891.method4144(this.field7877.field2930, (byte)71, this.field7880, this.field7877.field2940, this.field7877.field2932);
                        this.field7891.method4136(4, this.field7875, 0, var5, 103);
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        return;
                     }

                     return;
                  }
                  break label225;
               }
            }

            var7 = 0;
            if (var4) {
               var10000 = arg0[var7];
            } else if (~var7 <= ~arg2) {
               var10000 = ~var5;
               if (!var4) {
                  if (var10000 < -1) {
                     this.field7875.method1010((byte)120, 5123, var6.field1889, var6.field1856);
                     this.field7891.method4144(this.field7877.field2930, (byte)71, this.field7880, this.field7877.field2940, this.field7877.field2932);
                     this.field7891.method4145(this.field7878, (this.field7877.field2920 & 8) != 0, (byte)12, ~(this.field7877.field2920 & 7) != -1);
                     if (this.field7891.field8463) {
                        this.field7891.method557(Integer.MAX_VALUE, this.field7873, this.field7876, this.field7870);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field7879, 1.0F / this.field7879, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field7891.method4144(this.field7877.field2930, (byte)71, this.field7880, this.field7877.field2940, this.field7877.field2932);
                     this.field7891.method4136(4, this.field7875, 0, var5, 103);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg0[var7];
            }
         }

         while(true) {
            int var13 = var10000;
            short[] var14 = this.field7877.field2909[var13];
            int var15 = this.field7883[var13];
            if (~var15 == -1) {
               ++var7;
            } else if (var14 == null) {
               ++var7;
            } else {
               int var16 = 0;
               int var17 = 0;
               if (var4) {
                  if (~(1 << var16++ & var15) != -1) {
                     ++var5;
                     var6.method1205(121, var14[var17++] & 65535);
                     var6.method1205(127, var14[var17++] & 65535);
                     ++var5;
                     ++var5;
                     var6.method1205(116, var14[var17++] & 65535);
                     if (var4) {
                        var17 += 3;
                     }
                  } else {
                     var17 += 3;
                  }
               }

               while(~var17 > ~var14.length) {
                  if (~(1 << var16++ & var15) != -1) {
                     ++var5;
                     var6.method1205(121, var14[var17++] & 65535);
                     var6.method1205(127, var14[var17++] & 65535);
                     ++var5;
                     ++var5;
                     var6.method1205(116, var14[var17++] & 65535);
                     if (var4) {
                        var17 += 3;
                     }
                  } else {
                     var17 += 3;
                  }
               }

               ++var7;
            }

            if (~var7 <= ~arg2) {
               var10000 = ~var5;
               if (!var4) {
                  if (var10000 < -1) {
                     this.field7875.method1010((byte)120, 5123, var6.field1889, var6.field1856);
                     this.field7891.method4144(this.field7877.field2930, (byte)71, this.field7880, this.field7877.field2940, this.field7877.field2932);
                     this.field7891.method4145(this.field7878, (this.field7877.field2920 & 8) != 0, (byte)12, ~(this.field7877.field2920 & 7) != -1);
                     if (this.field7891.field8463) {
                        this.field7891.method557(Integer.MAX_VALUE, this.field7873, this.field7876, this.field7870);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field7879, 1.0F / this.field7879, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field7891.method4144(this.field7877.field2930, (byte)71, this.field7880, this.field7877.field2940, this.field7877.field2932);
                     this.field7891.method4136(4, this.field7875, 0, var5, 103);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg0[var7];
            }
         }
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field7894[16] + (arg0 != null ? field7894[1] : field7894[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(ILwf;)V",
      line = 158
   )
   public static final void method3942(int arg0, class147 arg1) {
      boolean var2 = client.field4360;

      try {
         int var3 = 25 % ((arg0 - 62) / 59);
         ++field7868;
         byte[] var4 = new byte[24];
         if (class75.field918 != null) {
            try {
               int var10000;
               label82: {
                  class75.field918.method1686(true, 0L);
                  class75.field918.method1688(var4, 0);
                  int var5 = 0;
                  if (var2) {
                     var10000 = var4[var5];
                  } else if (var5 >= 24) {
                     var10000 = var5;
                     if (!var2) {
                        break label82;
                     }
                  } else {
                     var10000 = var4[var5];
                  }

                  label81:
                  do {
                     while(true) {
                        if (var10000 != 0) {
                           if (!var2) {
                              var10000 = var5;
                              break;
                           }

                           ++var5;
                        } else {
                           ++var5;
                        }

                        if (var5 >= 24) {
                           var10000 = var5;
                           if (!var2) {
                              break label81;
                           }
                        } else {
                           var10000 = var4[var5];
                        }
                     }
                  } while(var2);
               }

               if (var10000 >= 24) {
                  throw new IOException();
               }
            } catch (Exception var8) {
               int var6 = 0;
               if (var2) {
                  var4[var6] = -1;
                  ++var6;
               }

               while(true) {
                  while(var6 < 24) {
                     var4[var6] = -1;
                     ++var6;
                  }

                  if (!var2) {
                     break;
                  }

                  ++var6;
               }
            }
         }

         arg1.method1193((byte)123, var4, 0, 24);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field7894[4] + arg0 + ',' + (arg1 != null ? field7894[1] : field7894[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(B[[I)V",
      line = 205
   )
   public static final void method3943(byte arg0, int[][] arg1) {
      try {
         if (arg0 != -23) {
            method3951((byte)116);
         }

         class341.field4631 = arg1;
         ++field7884;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7894[15] + arg0 + ',' + (arg1 != null ? field7894[1] : field7894[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(IILdha;)V",
      line = 220
   )
   public static final void method3944(int arg0, int arg1, class85 arg2) {
      try {
         ++field7871;
         if (~class673.field9755 > -51) {
            if (arg2 != null && arg2.field1116 != null && ~arg2.field1116.length < ~arg0 && arg2.field1116[arg0] != null) {
               int var3 = arg2.field1116[arg0][0];
               int var4 = var3 >> 8;
               int var5 = (var3 & 255) >> 5;
               if (arg1 < arg2.field1116[arg0].length) {
                  int var6 = (int)(Math.random() * (double)arg2.field1116[arg0].length);
                  if (var6 > 0) {
                     var4 = arg2.field1116[arg0][var6];
                  }
               }

               int var7 = 256;
               if (arg2.field1099 != null && arg2.field1126 != null) {
                  var7 = class648.method4721(arg2.field1099[arg0], arg2.field1126[arg0], -49);
               }

               if (!arg2.field1124) {
                  class43.method365(var4, 0, (byte)-10, 255, var7, var5);
               } else {
                  class241.method1843((byte)-82, 0, var7, var5, 255, var4, false);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field7894[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7894[1] : field7894[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(IIBIF)V",
      line = 263
   )
   public final void method3945(int arg0, int arg1, byte arg2, int arg3, float arg4) {
      boolean var6 = client.field4360;

      try {
         if (arg2 < -108) {
            ++field7893;
            if (this.field7878 != -1) {
               class317 var7 = this.field7891.field802.method1354(this.field7878, (byte)-109);
               int var8 = 255 & var7.field4321;
               if (var8 != 0 && ~var7.field4308 != -5) {
                  label112: {
                     int var9;
                     label107: {
                        if (~arg0 > -1) {
                           var9 = 0;
                           if (!var6) {
                              break label107;
                           }
                        }

                        if (arg0 > 127) {
                           var9 = 16777215;
                           if (!var6) {
                              break label107;
                           }
                        }

                        var9 = arg0 * 131586;
                     }

                     if (var8 == 256) {
                        arg3 = var9;
                        if (!var6) {
                           break label112;
                        }
                     }

                     int var11 = -var8 + 256;
                     arg3 = (16711680 & (65280 & arg3) * var11 + (65280 & var9) * var8) + (-16711936 & (16711935 & arg3) * var11 + (var9 & 16711935) * var8) >> 8;
                  }
               }

               int var12 = 255 & var7.field4324;
               if (var12 != 0) {
                  var12 += 256;
                  int var13 = (255 & arg3 >> 16) * var12;
                  if (var13 > 65535) {
                     var13 = 65535;
                  }

                  int var14 = (255 & arg3 >> 8) * var12;
                  if (var14 > 65535) {
                     var14 = 65535;
                  }

                  int var15 = (255 & arg3) * var12;
                  if (~var15 < -65536) {
                     var15 = 65535;
                  }

                  arg3 = (var13 << 8 & 16711712) + ((65280 & var14) - -(var15 >> 8));
               }
            }

            this.field7887.method5110(arg1 * 4);
            if (arg4 != 1.0F) {
               int var18;
               int var19;
               int var20;
               label78: {
                  int var16 = 255 & arg3 >> 16;
                  int var17 = arg3 >> 8 & 255;
                  var18 = (int)((float)var16 * arg4);
                  var19 = arg3 & 255;
                  var20 = (int)((float)var17 * arg4);
                  if (var18 >= 0) {
                     if (var18 <= 255) {
                        break label78;
                     }

                     var18 = 255;
                     if (!var6) {
                        break label78;
                     }
                  }

                  var18 = 0;
               }

               label71: {
                  if (~var20 <= -1) {
                     if (var20 <= 255) {
                        break label71;
                     }

                     var20 = 255;
                     if (!var6) {
                        break label71;
                     }
                  }

                  var20 = 0;
               }

               int var21;
               label64: {
                  var21 = (int)((float)var19 * arg4);
                  if (var21 >= 0) {
                     if (var21 <= 255) {
                        break label64;
                     }

                     var21 = 255;
                     if (!var6) {
                        break label64;
                     }
                  }

                  var21 = 0;
               }

               arg3 = var21 | var20 << 8 | var18 << 16;
            }

            this.field7887.method5105((byte)(arg3 >> 16));
            this.field7887.method5105((byte)(arg3 >> 8));
            this.field7887.method5105((byte)arg3);
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field7894[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(BI)V",
      line = 372
   )
   public final void method3946(byte arg0, int arg1) {
      try {
         ++field7881;
         this.field7872 = this.field7891.field8350.method5096(arg1 * 4, true);
         this.field7887 = new Stream(this.field7872);
         if (arg0 != 108) {
            this.field7876 = -118;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7894[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 386
   )
   public static final void method3947(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(IB)V",
      line = 502
   )
   public final void method3948(int arg0, byte arg1) {
      try {
         ++field7889;
         this.field7887.method5110(arg0 * 4 - -3);
         this.field7887.method5105(-1);
         if (arg1 != 50) {
            this.field7872 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7894[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(Ljava/lang/String;IBZ)I",
      line = 514
   )
   public static final int method3949(String arg0, int arg1, byte arg2, boolean arg3) {
      boolean var4 = client.field4360;

      try {
         ++field7885;
         if (arg1 >= 2 && arg1 <= 36) {
            boolean var5 = false;
            byte var6 = 0;
            if (arg2 < 11) {
               return -37;
            } else {
               int var7 = 0;
               int var8 = arg0.length();
               int var9 = 0;
               char var10000;
               if (var4) {
                  var10000 = arg0.charAt(var9);
               } else if (~var9 <= ~var8) {
                  var10000 = (char)var6;
                  if (!var4) {
                     if (var6 == 0) {
                        throw new NumberFormatException();
                     }

                     return var7;
                  }
               } else {
                  var10000 = arg0.charAt(var9);
               }

               while(true) {
                  label233: {
                     char var10 = var10000;
                     if (~var9 == -1) {
                        if (var10 == '-') {
                           var5 = true;
                           if (!var4) {
                              ++var9;
                              break label233;
                           }
                        }

                        if (~var10 == -44 && arg3 && !var4) {
                           ++var9;
                           break label233;
                        }
                     }

                     int var11;
                     int var14;
                     if (var10 >= '0') {
                        if (~var10 < -58) {
                           if (var10 >= 'A') {
                              if (var10 > 'Z') {
                                 if (~var10 > -98 || var10 > 'z') {
                                    break;
                                 }

                                 var14 = var10 - 'W';
                                 if (var4) {
                                    var14 -= 55;
                                    if (var4) {
                                       var14 -= 48;
                                    }
                                 }
                              } else {
                                 var14 = var10 - '7';
                                 if (var4) {
                                    var14 -= 48;
                                 }
                              }
                           } else {
                              if (~var10 > -98 || var10 > 'z') {
                                 break;
                              }

                              var14 = var10 - 'W';
                              if (var4) {
                                 var14 -= 55;
                                 if (var4) {
                                    var14 -= 48;
                                 }
                              }
                           }

                           if (var14 >= arg1) {
                              throw new NumberFormatException();
                           }

                           if (var5) {
                              var14 = -var14;
                           }

                           var11 = arg1 * var7 + var14;
                           if (var11 / arg1 != var7) {
                              throw new NumberFormatException();
                           }

                           var7 = var11;
                           var6 = 1;
                           ++var9;
                        } else {
                           var14 = var10 - '0';
                           if (var14 >= arg1) {
                              throw new NumberFormatException();
                           }

                           if (var5) {
                              var14 = -var14;
                           }

                           var11 = arg1 * var7 + var14;
                           if (var11 / arg1 != var7) {
                              throw new NumberFormatException();
                           }

                           var7 = var11;
                           var6 = 1;
                           ++var9;
                        }
                     } else {
                        if (var10 >= 'A') {
                           if (var10 > 'Z') {
                              if (~var10 > -98 || var10 > 'z') {
                                 break;
                              }

                              var14 = var10 - 'W';
                              if (var4) {
                                 var14 -= 55;
                                 if (var4) {
                                    var14 -= 48;
                                 }
                              }
                           } else {
                              var14 = var10 - '7';
                              if (var4) {
                                 var14 -= 48;
                              }
                           }
                        } else {
                           if (~var10 > -98 || var10 > 'z') {
                              break;
                           }

                           var14 = var10 - 'W';
                           if (var4) {
                              var14 -= 55;
                              if (var4) {
                                 var14 -= 48;
                              }
                           }
                        }

                        if (var14 >= arg1) {
                           throw new NumberFormatException();
                        }

                        if (var5) {
                           var14 = -var14;
                        }

                        var11 = arg1 * var7 + var14;
                        if (var11 / arg1 != var7) {
                           throw new NumberFormatException();
                        }

                        var7 = var11;
                        var6 = 1;
                        ++var9;
                     }
                  }

                  if (~var9 <= ~var8) {
                     var10000 = (char)var6;
                     if (!var4) {
                        if (var6 == 0) {
                           throw new NumberFormatException();
                        }

                        return var7;
                     }
                  } else {
                     var10000 = arg0.charAt(var9);
                  }
               }

               throw new NumberFormatException();
            }
         } else {
            throw new IllegalArgumentException(field7894[8] + arg1);
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field7894[9] + (arg0 != null ? field7894[1] : field7894[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(BLjava/lang/String;IZ)V",
      line = 594
   )
   public static final void method3950(byte arg0, String arg1, int arg2, boolean arg3) {
      try {
         ++field7886;
         class557.method3998((byte)40);
         class32.method290(-44);
         class649.method4727(-1);
         class342.method2507(arg1, arg2, arg3, 0);
         class13.method78((byte)127);
         class751.method5451(-118, class383.field5543);
         class253.method1933(false, class383.field5543);
         class464.method3368(-17844, class383.field5543, class281.field3904);
         class399.method3006((byte)66);
         class636.method4601(class432.field6169, (byte)-79);
         class88.method775((byte)-46);
         int var4 = 5 % ((arg0 - 35) / 49);
         class793.method5717(5539);
         if (~class622.field9156 != -4) {
            if (class622.field9156 == 7) {
               class731.method5321(8, (byte)-86);
            } else if (~class622.field9156 == -10) {
               class731.method5321(10, (byte)-107);
            } else if (~class622.field9156 == -12) {
               class731.method5321(12, (byte)-92);
            } else {
               if (~class622.field9156 == -2 || class622.field9156 == 2) {
                  class20.method122(false);
               }

            }
         } else {
            class731.method5321(4, (byte)-89);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7894[3] + arg0 + ',' + (arg1 != null ? field7894[1] : field7894[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(B)V",
      line = 641
   )
   public static void method3951(byte arg0) {
      try {
         field7890 = null;
         int var1 = -71 / ((arg0 - -40) / 60);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7894[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(Lha;B)V",
      line = 654
   )
   public static final void method3952(class66 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ni",
      name = "<init>",
      descriptor = "(Lkk;IIIII)V",
      line = 705
   )
   public class550(class204 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field7877 = arg0;
         this.field7878 = arg1;
         this.field7891 = this.field7877.field2907;
         this.field7876 = arg4;
         this.field7883 = new int[this.field7877.field4071 * this.field7877.field4064];
         this.field7879 = (float)arg2;
         this.field7873 = arg3;
         this.field7870 = arg5;
         this.field7875 = new class404(this.field7891, 5123, (byte[])null, 1);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7894[2] + (arg0 != null ? field7894[1] : field7894[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3953(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3954(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
