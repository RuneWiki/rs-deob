import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class266 extends class549 {
   @OriginalMember(
      owner = "client!kk",
      name = "H",
      descriptor = "I"
   )
   private int field3365;
   @OriginalMember(
      owner = "client!kk",
      name = "C",
      descriptor = "I"
   )
   private int field3368;
   @OriginalMember(
      owner = "client!kk",
      name = "E",
      descriptor = "I"
   )
   public int field3363;
   @OriginalMember(
      owner = "client!kk",
      name = "A",
      descriptor = "I"
   )
   public int field3367;
   @OriginalMember(
      owner = "client!kk",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3373 = new String[]{method2129(method2128("\u0005b3h")), method2129(method2128("\u0000|q8/\u0005~+:n")), method2129(method2128("\u00109q*;")), method2129(method2128("\u0000|qMn")), method2129(method2128("\u0000|qCn")), method2129(method2128("\u0000|qAn")), method2129(method2128("\u0000|q@n")), method2129(method2128("\u0000|qEn")), method2129(method2128("\u0000|qFn")), method2129(method2128("\u0000|qGn")), method2129(method2128("\u0000|qLn")), method2129(method2128("\u0000|qBn"))};
   @OriginalMember(
      owner = "client!kk",
      name = "B",
      descriptor = "Lcba;"
   )
   public static class95 field3361 = new class95();
   @OriginalMember(
      owner = "client!kk",
      name = "G",
      descriptor = "Lsia;"
   )
   public static class407 field3370 = new class407(4);
   @OriginalMember(
      owner = "client!kk",
      name = "M",
      descriptor = "I"
   )
   public static int field3359;
   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "I"
   )
   public static int field3360;
   @OriginalMember(
      owner = "client!kk",
      name = "w",
      descriptor = "I"
   )
   public static int field3362;
   @OriginalMember(
      owner = "client!kk",
      name = "J",
      descriptor = "I"
   )
   public static int field3364;
   @OriginalMember(
      owner = "client!kk",
      name = "L",
      descriptor = "I"
   )
   public static int field3366;
   @OriginalMember(
      owner = "client!kk",
      name = "y",
      descriptor = "I"
   )
   public static int field3369;
   @OriginalMember(
      owner = "client!kk",
      name = "F",
      descriptor = "I"
   )
   public static int field3371;
   @OriginalMember(
      owner = "client!kk",
      name = "x",
      descriptor = "I"
   )
   public static int field3372;

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Liu;IIIIZ[IIIZ)V"
   )
   public class266(class530 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
      boolean var11 = client.field1481;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3365 = -1;
      this.field3368 = -1;

      try {
         this.field3363 = arg3;
         this.field3367 = arg4;
         if (arg9) {
            int[] var12 = new int[arg6.length];
            int var13 = 0;
            if (var11 || ~arg4 < ~var13) {
               do {
                  int var14 = arg3 * var13;
                  int var15 = (-var13 + arg4 + -1) * arg3;
                  int var16 = 0;
                  if (var11) {
                     var12[var14++] = arg6[var15++];
                     ++var16;
                  }

                  while(true) {
                     while(var16 < arg3) {
                        var12[var14++] = arg6[var15++];
                        ++var16;
                     }

                     if (!var11) {
                        ++var13;
                        break;
                     }

                     ++var16;
                  }
               } while(~arg4 < ~var13);
            }

            arg6 = var12;
         }

         label49: {
            super.field8096.method4006(this, (byte)-12);
            if (~super.field8090 != -34038 && arg5 && arg7 == 0 && ~arg8 == -1) {
               class430.method3325(this.field3363, super.field8100, 32993, this.field3367, arg6, super.field8096.field7710, 1020, super.field8090);
               this.method4155(true, -1);
               if (!var11) {
                  break label49;
               }
            }

            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field8090, 0, super.field8100, this.field3363, this.field3367, 0, 32993, super.field8096.field7710, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method4155(false, -1);
         }

         this.method4157((byte)111, true);
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field3373[1] + (arg0 != null ? field3373[2] : field3373[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3373[2] : field3373[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;I)V"
   )
   public static final void method2120(Canvas arg0, int arg1) {
      try {
         ++field3372;
         Dimension var2 = arg0.getSize();
         class316.method2503(var2.width, (byte)117, var2.height);
         if (arg1 == 14168) {
            if (~class175.field2258 != -2) {
               class497.field6954.method411(arg0, class197.field2522, class429.field5829);
            } else {
               class497.field6954.method411(arg0, class713.field10470, class345.field4735);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3373[9] + (arg0 != null ? field3373[2] : field3373[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Liu;IIII)V"
   )
   public class266(class530 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3 * arg4, false);
      this.field3365 = -1;
      this.field3368 = -1;

      try {
         this.field3363 = arg3;
         this.field3367 = arg4;
         super.field8096.method4006(this, (byte)-121);
         OpenGL.glTexImage2Dub(super.field8090, 0, super.field8100, arg3, arg4, 0, class561.method4222(super.field8100, 19), 5121, (byte[])null, 0);
         this.method4157((byte)111, true);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3373[1] + (arg0 != null ? field3373[2] : field3373[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Liu;IIIIZ[FI)V"
   )
   public class266(class530 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3365 = -1;
      this.field3368 = -1;

      try {
         label43: {
            this.field3367 = arg4;
            this.field3363 = arg3;
            super.field8096.method4006(this, (byte)24);
            if (!arg5 || super.field8090 == 34037) {
               OpenGL.glTexImage2Df(super.field8090, 0, super.field8100, this.field3363, this.field3367, 0, arg7, 5126, arg6, 0);
               this.method4155(false, -1);
               if (!client.field1481) {
                  break label43;
               }
            }

            class649.method4772(arg1, 0, arg6, arg2, arg4, arg3, arg7);
            this.method4155(true, -1);
         }

         this.method4157((byte)111, true);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3373[1] + (arg0 != null ? field3373[2] : field3373[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3373[2] : field3373[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method2121(int arg0, boolean arg1, boolean arg2) {
      try {
         if (~super.field8090 == -3554) {
            super.field8096.method4006(this, (byte)42);
            OpenGL.glTexParameteri(super.field8090, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field8090, 10243, arg1 ? 10497 : 33071);
         }

         if (arg0 != 0) {
            this.field3368 = -4;
         }

         ++field3364;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3373[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IIBIIII)V"
   )
   public final void method2122(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         int var8 = -25 / ((-72 - arg2) / 54);
         ++field3369;
         int var9 = super.field8096.field7615 - (arg6 - -arg4);
         super.field8096.method4006(this, (byte)-122);
         OpenGL.glCopyTexSubImage2D(super.field8090, 0, arg3, -arg5 - arg4 + this.field3367, arg1, var9, arg0, arg4);
         OpenGL.glFlush();
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3373[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2123(int arg0) {
      try {
         if (arg0 != -1) {
            method2125((class66)null, (byte)-122);
         }

         field3370 = null;
         field3361 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3373[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IIZIIIII[BI)V"
   )
   public final void method2124(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
      boolean var11 = client.field1481;

      try {
         ++field3362;
         if (~arg9 == -1) {
            arg9 = arg7;
         }

         if (arg2) {
            int var12 = class697.method5076(arg5, -1);
            int var13 = arg7 * var12;
            int var14 = arg9 * var12;
            byte[] var15 = new byte[arg6 * var13];
            int var16 = 0;
            if (var11 || ~arg6 < ~var16) {
               do {
                  int var17 = var13 * var16;
                  int var18 = (-var16 + arg6 + -1) * var14 + arg4;
                  int var19 = 0;
                  if (var11) {
                     var15[var17++] = arg8[var18++];
                     ++var19;
                  }

                  while(true) {
                     while(var13 > var19) {
                        var15[var17++] = arg8[var18++];
                        ++var19;
                     }

                     if (!var11) {
                        ++var16;
                        break;
                     }

                     ++var19;
                  }
               } while(~arg6 < ~var16);
            }

            arg8 = var15;
         }

         super.field8096.method4006(this, (byte)-127);
         OpenGL.glPixelStorei(3317, 1);
         if (arg7 != arg9) {
            OpenGL.glPixelStorei(3314, arg9);
         }

         OpenGL.glTexSubImage2Dub(super.field8090, 0, arg0, arg3, arg7, arg6, arg5, 5121, arg8, arg4);
         if (arg1 != 3314) {
            this.field3365 = -110;
         }

         if (arg7 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field3373[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field3373[2] : field3373[0]) + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(Lgea;B)Lcw;"
   )
   public static final class145 method2125(class66 arg0, byte arg1) {
      try {
         ++field3360;
         class145 var2 = new class145();
         var2.field1818 = arg0.method603(-2);
         var2.field1823 = class31.field455.method4969(var2.field1818, (byte)-107);
         if (arg1 <= 63) {
            field3370 = null;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3373[10] + (arg0 != null ? field3373[2] : field3373[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method970(byte arg0) {
      try {
         ++field3371;
         OpenGL.glFramebufferTexture2DEXT(this.field3365, this.field3368, super.field8090, 0, 0);
         this.field3368 = -1;
         this.field3365 = -1;
         if (arg0 > -12) {
            this.field3363 = -65;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3373[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Liu;IIIIZ[BIZ)V"
   )
   public class266(class530 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
      boolean var10 = client.field1481;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field3365 = -1;
      this.field3368 = -1;

      try {
         this.field3363 = arg3;
         this.field3367 = arg4;
         if (arg8) {
            byte[] var11 = new byte[arg6.length];
            int var12 = 0;
            if (var10 || arg4 > var12) {
               do {
                  int var13 = arg3 * var12;
                  int var14 = (arg4 - 1 + -var12) * arg3;
                  int var15 = 0;
                  if (var10) {
                     var11[var13++] = arg6[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(~var15 > ~arg3) {
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

         label43: {
            super.field8096.method4006(this, (byte)72);
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 && super.field8090 != 34037) {
               class359.method2834(0, arg6, arg4, arg1, arg7, arg3, arg2);
               this.method4155(true, -1);
               if (!var10) {
                  break label43;
               }
            }

            OpenGL.glTexImage2Dub(super.field8090, 0, super.field8100, this.field3363, this.field3367, 0, arg7, 5121, arg6, 0);
            this.method4155(false, -1);
         }

         OpenGL.glPixelStorei(3317, 4);
         this.method4157((byte)111, true);
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field3373[1] + (arg0 != null ? field3373[2] : field3373[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3373[2] : field3373[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Liu;IIIII)V"
   )
   public class266(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, 6407, arg4 * arg5, false);
      this.field3365 = -1;
      this.field3368 = -1;

      try {
         this.field3367 = arg5;
         this.field3363 = arg4;
         int var7 = -arg5 + super.field8096.field7615 + -arg3;
         super.field8096.method4006(this, (byte)-123);
         OpenGL.glCopyTexImage2D(super.field8090, 0, super.field8100, arg2, var7, arg4, arg5, 0);
         this.method4157((byte)111, true);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3373[1] + (arg0 != null ? field3373[2] : field3373[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IIIZI[IIII)V"
   )
   public final void method2126(int arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field1481;

      try {
         if (~arg2 == -1) {
            arg2 = arg7;
         }

         ++field3359;
         int var11 = 0 / ((arg6 - 5) / 48);
         if (arg3) {
            int[] var12 = new int[arg1 * arg7];
            int var13 = 0;
            if (var10 || ~var13 > ~arg1) {
               do {
                  int var14 = arg7 * var13;
                  int var15 = (arg1 + -1 + -var13) * arg2 - -arg0;
                  int var16 = 0;
                  if (var10) {
                     var12[var14++] = arg5[var15++];
                     ++var16;
                  }

                  while(true) {
                     while(arg7 > var16) {
                        var12[var14++] = arg5[var15++];
                        ++var16;
                     }

                     if (!var10) {
                        ++var13;
                        break;
                     }

                     ++var16;
                  }
               } while(~var13 > ~arg1);
            }

            arg5 = var12;
         }

         super.field8096.method4006(this, (byte)-2);
         if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg2);
         }

         OpenGL.glTexSubImage2Di(super.field8090, 0, arg4, -arg8 + this.field3367 - arg1, arg7, arg1, 32993, super.field8096.field7710, arg5, arg0);
         if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field3373[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3373[2] : field3373[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method2127(int arg0, int arg1, int arg2, int arg3) {
      try {
         OpenGL.glFramebufferTexture2DEXT(arg3, arg1, super.field8090, super.field8098, arg0);
         ++field3366;
         this.field3368 = arg1;
         this.field3365 = arg3;
         if (arg2 != -1) {
            this.method970((byte)-101);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3373[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
