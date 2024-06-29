import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class251 extends class689 {
   @OriginalMember(
      owner = "client!dt",
      name = "E",
      descriptor = "I"
   )
   private int field3362;
   @OriginalMember(
      owner = "client!dt",
      name = "y",
      descriptor = "I"
   )
   private int field3363;
   @OriginalMember(
      owner = "client!dt",
      name = "M",
      descriptor = "I"
   )
   public int field3361;
   @OriginalMember(
      owner = "client!dt",
      name = "L",
      descriptor = "I"
   )
   public int field3367;
   @OriginalMember(
      owner = "client!dt",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3368 = new String[]{method1900(method1899("Fe&#")), method1900(method1899("Ldds\u0017Fy>qV")), method1900(method1899("S>da\u0003")), method1900(method1899("Ldd\u0001V")), method1900(method1899("Ldd\u0003V")), method1900(method1899("Ldd\u0005V")), method1900(method1899("Ldd\u001cV")), method1900(method1899("Ldd\u0006V")), method1900(method1899("Ldd\u0004V")), method1900(method1899("Ldd\u0002V")), method1900(method1899("Ldd\u001dV"))};
   @OriginalMember(
      owner = "client!dt",
      name = "H",
      descriptor = "I"
   )
   public static int field3355;
   @OriginalMember(
      owner = "client!dt",
      name = "I",
      descriptor = "I"
   )
   public static int field3356;
   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "I"
   )
   public static int field3358;
   @OriginalMember(
      owner = "client!dt",
      name = "F",
      descriptor = "I"
   )
   public static int field3359;
   @OriginalMember(
      owner = "client!dt",
      name = "D",
      descriptor = "I"
   )
   public static int field3360;
   @OriginalMember(
      owner = "client!dt",
      name = "G",
      descriptor = "I"
   )
   public static int field3364;
   @OriginalMember(
      owner = "client!dt",
      name = "K",
      descriptor = "I"
   )
   public static int field3365;
   @OriginalMember(
      owner = "client!dt",
      name = "J",
      descriptor = "I"
   )
   public static int field3366;
   @OriginalMember(
      owner = "client!dt",
      name = "B",
      descriptor = "Leaa;"
   )
   public static class526 field3357;

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1892(boolean arg0) {
      try {
         field3357 = null;
         if (!arg0) {
            method1892(true);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3368[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(ZZZ)V"
   )
   public final void method1893(boolean arg0, boolean arg1, boolean arg2) {
      try {
         ++field3355;
         if (arg0) {
            if (super.field10376 == 3553) {
               super.field10381.method4818((byte)56, this);
               OpenGL.glTexParameteri(super.field10376, 10242, !arg2 ? 33071 : 10497);
               OpenGL.glTexParameteri(super.field10376, 10243, !arg1 ? 33071 : 10497);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3368[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "(Lck;IIIII)V"
   )
   public class251(class667 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, 6407, arg4 * arg5, false);
      this.field3362 = -1;
      this.field3363 = -1;

      try {
         this.field3361 = arg5;
         this.field3367 = arg4;
         int var7 = -arg3 + -arg5 + super.field10381.field9732;
         super.field10381.method4818((byte)-122, this);
         OpenGL.glCopyTexImage2D(super.field10376, 0, super.field10369, arg2, var7, arg4, arg5, 0);
         this.method5012(true, -10161);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field3368[1] + (arg0 != null ? field3368[2] : field3368[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "(Lck;IIIIZ[FI)V"
   )
   public class251(class667 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3362 = -1;
      this.field3363 = -1;

      try {
         label43: {
            this.field3361 = arg4;
            this.field3367 = arg3;
            super.field10381.method4818((byte)61, this);
            if (!arg5 || ~super.field10376 == -34038) {
               OpenGL.glTexImage2Df(super.field10376, 0, super.field10369, this.field3367, this.field3361, 0, arg7, 5126, arg6, 0);
               this.method5014(6162, false);
               if (client.field4530 == 0) {
                  break label43;
               }
            }

            class348.method2724(341, arg4, arg1, arg7, arg2, arg3, arg6);
            this.method5014(6162, true);
         }

         this.method5012(true, -10161);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3368[1] + (arg0 != null ? field3368[2] : field3368[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3368[2] : field3368[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "(Lck;IIIIZ[IIIZ)V"
   )
   public class251(class667 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
      int var11 = client.field4530;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3362 = -1;
      this.field3363 = -1;

      try {
         this.field3367 = arg3;
         this.field3361 = arg4;
         if (arg9) {
            int[] var12 = new int[arg6.length];
            int var13 = 0;
            if (var11 != 0 || ~var13 > ~arg4) {
               do {
                  int var14 = arg3 * var13;
                  int var15 = (arg4 - 1 + -var13) * arg3;
                  int var16 = 0;
                  if (var11 != 0) {
                     var12[var14++] = arg6[var15++];
                     ++var16;
                  }

                  while(true) {
                     while(arg3 > var16) {
                        var12[var14++] = arg6[var15++];
                        ++var16;
                     }

                     if (var11 == 0) {
                        ++var13;
                        break;
                     }

                     ++var16;
                  }
               } while(~var13 > ~arg4);
            }

            arg6 = var12;
         }

         label49: {
            super.field10381.method4818((byte)-105, this);
            if (super.field10376 != 34037 && arg5 && ~arg7 == -1 && ~arg8 == -1) {
               class324.method2448((byte)96, this.field3361, this.field3367, super.field10376, super.field10369, super.field10381.field10000, 32993, arg6);
               this.method5014(6162, true);
               if (var11 == 0) {
                  break label49;
               }
            }

            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field10376, 0, super.field10369, this.field3367, this.field3361, 0, 32993, super.field10381.field10000, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method5014(6162, false);
         }

         this.method5012(true, -10161);
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field3368[1] + (arg0 != null ? field3368[2] : field3368[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3368[2] : field3368[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(ZZ)Z"
   )
   public static boolean method1894(boolean arg0, boolean arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3368[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(ZII[BIIIIII)V"
   )
   public final void method1895(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      int var11 = client.field4530;

      try {
         ++field3359;
         if (~arg1 == -1) {
            arg1 = arg5;
         }

         if (arg0) {
            int var12 = class651.method4697(1, arg2);
            int var13 = arg5 * var12;
            int var14 = arg1 * var12;
            byte[] var15 = new byte[arg9 * var13];
            int var16 = 0;
            if (var11 != 0 || arg9 > var16) {
               do {
                  int var17 = var13 * var16;
                  int var18 = (arg9 + -1 + -var16) * var14 + arg8;
                  int var19 = 0;
                  if (var11 != 0) {
                     var15[var17++] = arg3[var18++];
                     ++var19;
                  }

                  while(true) {
                     while(~var13 < ~var19) {
                        var15[var17++] = arg3[var18++];
                        ++var19;
                     }

                     if (var11 == 0) {
                        ++var16;
                        break;
                     }

                     ++var19;
                  }
               } while(arg9 > var16);
            }

            arg3 = var15;
         }

         super.field10381.method4818((byte)-121, this);
         OpenGL.glPixelStorei(3317, 1);
         if (arg7 != 10329) {
            field3357 = null;
         }

         if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, arg1);
         }

         OpenGL.glTexSubImage2Dub(super.field10376, 0, arg6, arg4, arg5, arg9, arg2, 5121, arg3, arg8);
         if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field3368[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3368[2] : field3368[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public final void method1896(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg2) {
            this.method1898(false, 82, -87, -128, 49, -93, (int[])null, -18, 98);
         }

         OpenGL.glFramebufferTexture2DEXT(arg3, arg0, super.field10376, super.field10388, arg1);
         ++field3356;
         this.field3363 = arg0;
         this.field3362 = arg3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3368[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(BIIIIII)V"
   )
   public final void method1897(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3365;
         int var8 = -arg3 + super.field10381.field9732 + -arg4;
         int var9 = -74 / ((41 - arg0) / 59);
         super.field10381.method4818((byte)60, this);
         OpenGL.glCopyTexSubImage2D(super.field10376, 0, arg6, -arg1 + this.field3361 + -arg4, arg5, var8, arg2, arg4);
         OpenGL.glFlush();
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3368[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "(Lck;IIIIZ[BIZ)V"
   )
   public class251(class667 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
      int var10 = client.field4530;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3362 = -1;
      this.field3363 = -1;

      try {
         this.field3361 = arg4;
         this.field3367 = arg3;
         if (arg8) {
            byte[] var11 = new byte[arg6.length];
            int var12 = 0;
            if (var10 != 0 || arg4 > var12) {
               do {
                  int var13 = arg3 * var12;
                  int var14 = (-var12 + -1 + arg4) * arg3;
                  int var15 = 0;
                  if (var10 != 0) {
                     var11[var13++] = arg6[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(~var15 > ~arg3) {
                        var11[var13++] = arg6[var14++];
                        ++var15;
                     }

                     if (var10 == 0) {
                        ++var12;
                        break;
                     }

                     ++var15;
                  }
               } while(arg4 > var12);
            }

            arg6 = var11;
         }

         label43: {
            super.field10381.method4818((byte)18, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 && ~super.field10376 != -34038) {
               class648.method4675(arg3, arg6, arg4, arg2, true, arg7, arg1);
               this.method5014(6162, true);
               if (var10 == 0) {
                  break label43;
               }
            }

            OpenGL.glTexImage2Dub(super.field10376, 0, super.field10369, this.field3367, this.field3361, 0, arg7, 5121, arg6, 0);
            this.method5014(6162, false);
         }

         OpenGL.glPixelStorei(3317, 4);
         this.method5012(true, -10161);
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field3368[1] + (arg0 != null ? field3368[2] : field3368[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3368[2] : field3368[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "(Lck;IIII)V"
   )
   public class251(class667 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3 * arg4, false);
      this.field3362 = -1;
      this.field3363 = -1;

      try {
         this.field3361 = arg4;
         this.field3367 = arg3;
         super.field10381.method4818((byte)-122, this);
         OpenGL.glTexImage2Dub(super.field10376, 0, super.field10369, arg3, arg4, 0, class589.method4335(-112, super.field10369), 5121, (byte[])null, 0);
         this.method5012(true, -10161);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3368[1] + (arg0 != null ? field3368[2] : field3368[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method117(byte arg0) {
      try {
         ++field3364;
         OpenGL.glFramebufferTexture2DEXT(this.field3362, this.field3363, super.field10376, 0, 0);
         this.field3363 = -1;
         this.field3362 = -1;
         int var2 = -125 / ((arg0 - 26) / 55);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3368[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(ZIIIII[III)V"
   )
   public final void method1898(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
      int var10 = client.field4530;

      try {
         ++field3358;
         if (~arg1 == -1) {
            arg1 = arg8;
         }

         if (arg0) {
            int[] var11 = new int[arg2 * arg8];
            int var12 = 0;
            if (var10 != 0 || var12 < arg2) {
               do {
                  int var13 = arg8 * var12;
                  int var14 = (-var12 + arg2 + -1) * arg1 + arg5;
                  int var15 = 0;
                  if (var10 != 0) {
                     var11[var13++] = arg6[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(arg8 > var15) {
                        var11[var13++] = arg6[var14++];
                        ++var15;
                     }

                     if (var10 == 0) {
                        ++var12;
                        break;
                     }

                     ++var15;
                  }
               } while(var12 < arg2);
            }

            arg6 = var11;
         }

         if (arg7 != 3314) {
            this.field3362 = -95;
         }

         super.field10381.method4818((byte)-110, this);
         if (arg1 != arg8) {
            OpenGL.glPixelStorei(3314, arg1);
         }

         OpenGL.glTexSubImage2Di(super.field10376, 0, arg4, -arg3 + this.field3361 + -arg2, arg8, arg2, 32993, super.field10381.field10000, arg6, arg5);
         if (~arg1 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field3368[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3368[2] : field3368[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1899(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1900(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
