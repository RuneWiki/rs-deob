import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class281 extends class707 {
   @OriginalMember(
      owner = "client!kv",
      name = "A",
      descriptor = "I"
   )
   private int field3929;
   @OriginalMember(
      owner = "client!kv",
      name = "F",
      descriptor = "I"
   )
   private int field3937;
   @OriginalMember(
      owner = "client!kv",
      name = "E",
      descriptor = "I"
   )
   public int field3928;
   @OriginalMember(
      owner = "client!kv",
      name = "C",
      descriptor = "I"
   )
   public int field3926;
   @OriginalMember(
      owner = "client!kv",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3942 = new String[]{method2203(method2202("8\u0007R\u001b")), method2203(method2202("=\u0004\u0010Ks8\u001bJI2")), method2203(method2202("-\\\u0010Yg")), method2203(method2202("=\u0004\u001082")), method2203(method2202("=\u0004\u0010'2")), method2203(method2202("=\u0004\u0010\"2")), method2203(method2202("=\u0004\u0010%2")), method2203(method2202("=\u0004\u001092")), method2203(method2202("=\u0004\u001052")), method2203(method2202("=\u0004\u0010#2")), method2203(method2202("=\u0004\u0010$2")), method2203(method2202("=\u0004\u0010!2")), method2203(method2202("=\u0004\u0010:2")), method2203(method2202("=\u0004\u0010&2"))};
   @OriginalMember(
      owner = "client!kv",
      name = "s",
      descriptor = "Lhm;"
   )
   public static class230 field3939 = new class230(11, 0, 1, 2);
   @OriginalMember(
      owner = "client!kv",
      name = "y",
      descriptor = "I"
   )
   public static int field3927;
   @OriginalMember(
      owner = "client!kv",
      name = "r",
      descriptor = "I"
   )
   public static int field3930;
   @OriginalMember(
      owner = "client!kv",
      name = "B",
      descriptor = "I"
   )
   public static int field3931;
   @OriginalMember(
      owner = "client!kv",
      name = "u",
      descriptor = "I"
   )
   public static int field3933;
   @OriginalMember(
      owner = "client!kv",
      name = "w",
      descriptor = "I"
   )
   public static int field3934;
   @OriginalMember(
      owner = "client!kv",
      name = "v",
      descriptor = "I"
   )
   public static int field3935;
   @OriginalMember(
      owner = "client!kv",
      name = "x",
      descriptor = "I"
   )
   public static int field3936;
   @OriginalMember(
      owner = "client!kv",
      name = "t",
      descriptor = "I"
   )
   public static int field3938;
   @OriginalMember(
      owner = "client!kv",
      name = "G",
      descriptor = "I"
   )
   public static int field3940;
   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "I"
   )
   public static int field3941;
   @OriginalMember(
      owner = "client!kv",
      name = "D",
      descriptor = "Lsm;"
   )
   public static class297 field3932;

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method2192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3938;
         if (arg5 < -68) {
            int var8 = super.field10269.field546 - arg6 + -arg4;
            super.field10269.method252(this, (byte)-66);
            OpenGL.glCopyTexSubImage2D(super.field10277, 0, arg2, -arg1 - arg4 + this.field3928, arg3, var8, arg0, arg4);
            OpenGL.glFlush();
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3942[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IIIIZ[IIII)V"
   )
   public final void method2193(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4564;

      try {
         if (arg0 == arg2) {
            arg0 = arg6;
         }

         ++field3931;
         if (arg4) {
            int[] var11 = new int[arg3 * arg6];
            int var12 = 0;
            if (var10 || ~arg3 < ~var12) {
               do {
                  int var13 = arg6 * var12;
                  int var14 = (arg3 - var12 - 1) * arg0 - -arg7;
                  int var15 = 0;
                  if (var10) {
                     var11[var13++] = arg5[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(~arg6 < ~var15) {
                        var11[var13++] = arg5[var14++];
                        ++var15;
                     }

                     if (!var10) {
                        ++var12;
                        break;
                     }

                     ++var15;
                  }
               } while(~arg3 < ~var12);
            }

            arg5 = var11;
         }

         super.field10269.method252(this, (byte)-65);
         if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg0);
         }

         OpenGL.glTexSubImage2Di(super.field10277, 0, arg1, -arg8 + this.field3928 + -arg3, arg6, arg3, 32993, super.field10269.field853, arg5, arg7);
         if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field3942[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3942[2] : field3942[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(Lrk;IIIIZ[IIIZ)V"
   )
   public class281(class35 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
      boolean var11 = client.field4564;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3929 = -1;
      this.field3937 = -1;

      try {
         this.field3928 = arg4;
         this.field3926 = arg3;
         if (arg9) {
            int[] var12 = new int[arg6.length];
            int var13 = 0;
            if (var11 || var13 < arg4) {
               do {
                  int var14 = arg3 * var13;
                  int var15 = (-var13 + arg4 + -1) * arg3;
                  int var16 = 0;
                  if (var11) {
                     var12[var14++] = arg6[var15++];
                     ++var16;
                  }

                  while(true) {
                     while(arg3 > var16) {
                        var12[var14++] = arg6[var15++];
                        ++var16;
                     }

                     if (!var11) {
                        ++var13;
                        break;
                     }

                     ++var16;
                  }
               } while(var13 < arg4);
            }

            arg6 = var12;
         }

         label98: {
            super.field10269.method252(this, (byte)-15);
            if (~super.field10277 == -34038 || !arg5 || ~arg7 != -1 || arg8 != 0) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Di(super.field10277, 0, super.field10270, this.field3926, this.field3928, 0, 32993, super.field10269.field853, arg6, arg8 * 4);
               OpenGL.glPixelStorei(3314, 0);
               this.method5131(false, 49);
               if (!var11) {
                  break label98;
               }
            }

            class216.method1842(this.field3928, super.field10269.field853, false, arg6, 32993, super.field10270, this.field3926, super.field10277);
            this.method5131(true, 124);
         }

         this.method5132(true, 0);
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field3942[1] + (arg0 != null ? field3942[2] : field3942[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3942[2] : field3942[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method2194(byte arg0) {
      try {
         ++field3941;
         if (class195.field2948 != null) {
            class445.field6487 = new class113();
            class445.field6487.method1073(class195.field2948, arg0 + 21640, class195.field2948.field6215.method961(class385.field5684, true), class195.field2948.field6211, class782.field11449);
            if (arg0 != -50) {
               field3939 = null;
            }

            class673.field9873 = new Thread(class445.field6487, "");
            class673.field9873.start();
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3942[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(Lrk;IIIIZ[BIZ)V"
   )
   public class281(class35 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
      boolean var10 = client.field4564;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3929 = -1;
      this.field3937 = -1;

      try {
         this.field3928 = arg4;
         this.field3926 = arg3;
         if (arg8) {
            byte[] var11 = new byte[arg6.length];
            int var12 = 0;
            if (var10 || arg4 > var12) {
               do {
                  int var13 = arg3 * var12;
                  int var14 = (-var12 + arg4 + -1) * arg3;
                  int var15 = 0;
                  if (var10) {
                     var11[var13++] = arg6[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(var15 < arg3) {
                        var11[var13++] = arg6[var14++];
                        ++var15;
                     }

                     if (!var10) {
                        ++var12;
                        break;
                     }

                     ++var15;
                  }
               } while(arg4 > var12);
            }

            arg6 = var11;
         }

         label92: {
            super.field10269.method252(this, (byte)-123);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg5 || ~super.field10277 == -34038) {
               OpenGL.glTexImage2Dub(super.field10277, 0, super.field10270, this.field3926, this.field3928, 0, arg7, 5121, arg6, 0);
               this.method5131(false, 80);
               if (!var10) {
                  break label92;
               }
            }

            class377.method2942(arg6, 124, arg4, arg3, arg2, arg7, arg1);
            this.method5131(true, 68);
         }

         OpenGL.glPixelStorei(3317, 4);
         this.method5132(true, 0);
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field3942[1] + (arg0 != null ? field3942[2] : field3942[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3942[2] : field3942[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(ZBZ)V"
   )
   public final void method2195(boolean arg0, byte arg1, boolean arg2) {
      try {
         if (arg1 != -59) {
            method2194((byte)120);
         }

         if (super.field10277 == 3553) {
            super.field10269.method252(this, (byte)-120);
            OpenGL.glTexParameteri(super.field10277, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field10277, 10243, arg2 ? 10497 : 33071);
         }

         ++field3933;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3942[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method2196(int arg0) {
      try {
         ++field3934;
         class510.field7454.method5552(1, 37, class510.field7454.field11187);
         class510.field7454.method5552(1, arg0 ^ -114, class510.field7454.field11159);
         class510.field7454.method5552(2, arg0 + 33, class510.field7454.field11186);
         class510.field7454.method5552(arg0, 32, class510.field7454.field11165);
         class510.field7454.method5552(1, -118, class510.field7454.field11188);
         class510.field7454.method5552(1, 106, class510.field7454.field11175);
         class510.field7454.method5552(1, -123, class510.field7454.field11162);
         class510.field7454.method5552(1, arg0 + 53, class510.field7454.field11179);
         class510.field7454.method5552(1, 53, class510.field7454.field11148);
         class510.field7454.method5552(1, -108, class510.field7454.field11166);
         class510.field7454.method5552(1, 85, class510.field7454.field11143);
         class510.field7454.method5552(1, arg0 + -107, class510.field7454.field11139);
         class510.field7454.method5552(0, 70, class510.field7454.field11150);
         class510.field7454.method5552(1, 56, class510.field7454.field11181);
         class510.field7454.method5552(0, -110, class510.field7454.field11173);
         class510.field7454.method5552(0, 82, class510.field7454.field11149);
         class510.field7454.method5552(1, -117, class510.field7454.field11189);
         class510.field7454.method5552(0, -107, class510.field7454.field11163);
         class510.field7454.method5552(0, 96, class510.field7454.field11138);
         class468.method3504(false);
         class510.field7454.method5552(1, -116, class510.field7454.field11168);
         class510.field7454.method5552(3, arg0 ^ 21, class510.field7454.field11184);
         class416.method3174(false);
         class681.method4967(-1);
         class26.field391 = true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3942[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method2197(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field3927;
         if (arg3 < 105) {
            this.method2192(87, 26, -99, -23, 13, -59, -126);
         }

         OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field10277, super.field10271, arg2);
         this.field3929 = arg1;
         this.field3937 = arg0;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3942[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(III[BIIZIII)V"
   )
   public final void method2198(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
      boolean var11 = client.field4564;

      try {
         if (arg7 == 0) {
            arg7 = arg1;
         }

         ++field3940;
         if (arg6) {
            int var12 = class332.method2587(arg4, (byte)-93);
            int var13 = arg1 * var12;
            int var14 = arg7 * var12;
            byte[] var15 = new byte[arg8 * var13];
            int var16 = 0;
            if (var11 || ~var16 > ~arg8) {
               do {
                  int var17 = var13 * var16;
                  int var18 = (arg8 + -1 - var16) * var14 + arg9;
                  int var19 = 0;
                  if (var11) {
                     var15[var17++] = arg3[var18++];
                     ++var19;
                  }

                  while(true) {
                     while(var19 < var13) {
                        var15[var17++] = arg3[var18++];
                        ++var19;
                     }

                     if (!var11) {
                        ++var16;
                        break;
                     }

                     ++var19;
                  }
               } while(~var16 > ~arg8);
            }

            arg3 = var15;
         }

         super.field10269.method252(this, (byte)-72);
         OpenGL.glPixelStorei(3317, 1);
         if (arg1 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
         }

         OpenGL.glTexSubImage2Dub(super.field10277, 0, arg2, arg0, arg1, arg8, arg4, 5121, arg3, arg9);
         int var20 = -82 % ((arg5 - 24) / 59);
         if (arg1 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field3942[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3942[2] : field3942[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(Lrk;IIIII)V"
   )
   public class281(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, 6407, arg4 * arg5, false);
      this.field3929 = -1;
      this.field3937 = -1;

      try {
         this.field3926 = arg4;
         this.field3928 = arg5;
         int var7 = -arg3 + -arg5 + super.field10269.field546;
         super.field10269.method252(this, (byte)-72);
         OpenGL.glCopyTexImage2D(super.field10277, 0, super.field10270, arg2, var7, arg4, arg5, 0);
         this.method5132(true, 0);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3942[1] + (arg0 != null ? field3942[2] : field3942[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2199(int arg0) {
      try {
         int var1 = -97 / ((arg0 - -37) / 62);
         field3932 = null;
         field3939 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3942[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IILjava/lang/String;II)V"
   )
   public static final void method2200(int arg0, int arg1, String arg2, int arg3, int arg4) {
      try {
         ++field3930;
         class303 var5 = class345.method2670(arg1, (byte)97, arg3);
         if (var5 != null) {
            if (var5.field4335 != null) {
               class227 var6 = new class227();
               var6.field3360 = var5;
               var6.field3351 = arg2;
               var6.field3352 = var5.field4335;
               var6.field3358 = arg4;
               class161.method1463(var6);
            }

            if (~class376.field5588 == -11) {
               if (client.method2454(var5).method5165(1, arg4 + -1)) {
                  if (~arg4 == -2) {
                     ++class274.field3880;
                     class542 var7 = class549.method4093((byte)-113, class346.field4933, class126.field2108);
                     class375.method2931(var7, arg3, var5.field4346, arg0 ^ 174868364, arg1);
                     class740.method5332(var7, (byte)77);
                  }

                  if (arg0 == 0) {
                     if (~arg4 == -3) {
                        ++class471.field6840;
                        class542 var8 = class549.method4093((byte)-113, class401.field5890, class126.field2108);
                        class375.method2931(var8, arg3, var5.field4346, 174868364, arg1);
                        class740.method5332(var8, (byte)77);
                     }

                     if (~arg4 == -4) {
                        ++class755.field10965;
                        class542 var9 = class549.method4093((byte)-113, class28.field433, class126.field2108);
                        class375.method2931(var9, arg3, var5.field4346, 174868364, arg1);
                        class740.method5332(var9, (byte)77);
                     }

                     if (~arg4 == -5) {
                        ++class393.field5790;
                        class542 var10 = class549.method4093((byte)-113, class577.field8308, class126.field2108);
                        class375.method2931(var10, arg3, var5.field4346, 174868364, arg1);
                        class740.method5332(var10, (byte)77);
                     }

                     if (~arg4 == -6) {
                        ++class274.field3876;
                        class542 var11 = class549.method4093((byte)-113, class61.field1147, class126.field2108);
                        class375.method2931(var11, arg3, var5.field4346, arg0 + 174868364, arg1);
                        class740.method5332(var11, (byte)77);
                     }

                     if (arg4 == 6) {
                        ++class567.field8225;
                        class542 var12 = class549.method4093((byte)-113, class361.field5400, class126.field2108);
                        class375.method2931(var12, arg3, var5.field4346, 174868364, arg1);
                        class740.method5332(var12, (byte)77);
                     }

                     if (~arg4 == -8) {
                        ++class368.field5463;
                        class542 var13 = class549.method4093((byte)-113, class771.field11283, class126.field2108);
                        class375.method2931(var13, arg3, var5.field4346, 174868364, arg1);
                        class740.method5332(var13, (byte)77);
                     }

                     if (arg4 == 8) {
                        ++class210.field3117;
                        class542 var14 = class549.method4093((byte)-113, class750.field10815, class126.field2108);
                        class375.method2931(var14, arg3, var5.field4346, arg0 + 174868364, arg1);
                        class740.method5332(var14, (byte)77);
                     }

                     if (~arg4 == -10) {
                        ++class319.field4603;
                        class542 var15 = class549.method4093((byte)-113, class468.field6820, class126.field2108);
                        class375.method2931(var15, arg3, var5.field4346, 174868364, arg1);
                        class740.method5332(var15, (byte)77);
                     }

                     if (arg4 == 10) {
                        ++class123.field1961;
                        class542 var16 = class549.method4093((byte)-113, class201.field3015, class126.field2108);
                        class375.method2931(var16, arg3, var5.field4346, 174868364, arg1);
                        class740.method5332(var16, (byte)77);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field3942[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3942[2] : field3942[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method96(int arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field3937, this.field3929, super.field10277, 0, 0);
         ++field3935;
         this.field3929 = -1;
         this.field3937 = -1;
         int var2 = -44 % ((6 - arg0) / 46);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3942[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method2201(byte arg0) {
      try {
         ++field3936;
         if (arg0 > -17) {
            method2194((byte)-37);
         }

         if (class376.field5588 != 3) {
            if (~class376.field5588 == -8) {
               class645.method4735(8, -124);
               return;
            }

            if (class376.field5588 == 10) {
               class645.method4735(11, -100);
               return;
            }
         } else {
            class645.method4735(4, -124);
         }

      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3942[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(Lrk;IIIIZ[FI)V"
   )
   public class281(class35 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3929 = -1;
      this.field3937 = -1;

      try {
         label31: {
            this.field3928 = arg4;
            this.field3926 = arg3;
            super.field10269.method252(this, (byte)-90);
            if (arg5 && ~super.field10277 != -34038) {
               class33.method240(arg7, arg2, arg4, 53, arg3, arg6, arg1);
               this.method5131(true, 61);
               if (!client.field4564) {
                  break label31;
               }
            }

            OpenGL.glTexImage2Df(super.field10277, 0, super.field10270, this.field3926, this.field3928, 0, arg7, 5126, arg6, 0);
            this.method5131(false, 58);
         }

         this.method5132(true, 0);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3942[1] + (arg0 != null ? field3942[2] : field3942[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3942[2] : field3942[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(Lrk;IIII)V"
   )
   public class281(class35 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3 * arg4, false);
      this.field3929 = -1;
      this.field3937 = -1;

      try {
         this.field3926 = arg3;
         this.field3928 = arg4;
         super.field10269.method252(this, (byte)-77);
         OpenGL.glTexImage2Dub(super.field10277, 0, super.field10270, arg3, arg4, 0, class780.method5637(true, super.field10270), 5121, (byte[])null, 0);
         this.method5132(true, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3942[1] + (arg0 != null ? field3942[2] : field3942[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
