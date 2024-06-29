import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class601 extends class486 {
   @OriginalMember(
      owner = "client!bha",
      name = "D",
      descriptor = "I"
   )
   private int field8830;
   @OriginalMember(
      owner = "client!bha",
      name = "w",
      descriptor = "I"
   )
   private int field8837;
   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "I"
   )
   public int field8833;
   @OriginalMember(
      owner = "client!bha",
      name = "v",
      descriptor = "I"
   )
   public int field8841;
   @OriginalMember(
      owner = "client!bha",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8844 = new String[]{method4378(method4377("G\u001ffZ")), method4378(method4377("K\u0002k\u0018\u0000@\u0004cB\u0002\u0001")), method4378(method4377("RD$\u0018A")), method4378(method4377("K\u0002k\u0018y\u0001")), method4378(method4377("K\u0002k\u0018t\u0001")), method4378(method4377("K\u0002k\u0018}\u0001")), method4378(method4377("K\u0002k\u0018{\u0001")), method4378(method4377("K\u0002k\u0018z\u0001")), method4378(method4377("K\u0002k\u0018~\u0001")), method4378(method4377("K\u0002k\u0018\u007f\u0001")), method4378(method4377("G\f")), method4378(method4377("K\u0002k\u0018x\u0001"))};
   @OriginalMember(
      owner = "client!bha",
      name = "x",
      descriptor = "Lwu;"
   )
   public static class395 field8838 = new class395(7, 0, 1, 1);
   @OriginalMember(
      owner = "client!bha",
      name = "u",
      descriptor = "Laga;"
   )
   public static class696 field8842 = new class696(64);
   @OriginalMember(
      owner = "client!bha",
      name = "t",
      descriptor = "I"
   )
   public static int field8831;
   @OriginalMember(
      owner = "client!bha",
      name = "A",
      descriptor = "I"
   )
   public static int field8832;
   @OriginalMember(
      owner = "client!bha",
      name = "F",
      descriptor = "I"
   )
   public static int field8834;
   @OriginalMember(
      owner = "client!bha",
      name = "C",
      descriptor = "I"
   )
   public static int field8835;
   @OriginalMember(
      owner = "client!bha",
      name = "s",
      descriptor = "I"
   )
   public static int field8836;
   @OriginalMember(
      owner = "client!bha",
      name = "B",
      descriptor = "I"
   )
   public static int field8839;
   @OriginalMember(
      owner = "client!bha",
      name = "E",
      descriptor = "I"
   )
   public static int field8840;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bha",
      name = "y",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8843;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method4376(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "<init>",
      descriptor = "(Lea;IIIII)V",
      line = 3
   )
   public class601(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, 6407, arg4 * arg5, false);
      this.field8830 = -1;
      this.field8837 = -1;

      try {
         this.field8833 = arg5;
         this.field8841 = arg4;
         int var7 = -arg5 - (arg3 - super.field6940.field8264);
         super.field6940.method4107(-127, this);
         OpenGL.glCopyTexImage2D(super.field6938, 0, super.field6948, arg2, var7, arg4, arg5, 0);
         this.method3526(true, 32);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8844[1] + (arg0 != null ? field8844[2] : field8844[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "<init>",
      descriptor = "(Lea;IIII)V",
      line = 53
   )
   public class601(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3 * arg4, false);
      this.field8830 = -1;
      this.field8837 = -1;

      try {
         this.field8833 = arg4;
         this.field8841 = arg3;
         super.field6940.method4107(-117, this);
         OpenGL.glTexImage2Dub(super.field6938, 0, super.field6948, arg3, arg4, 0, class404.method3045((byte)-29, super.field6948), 5121, (byte[])null, 0);
         this.method3526(true, 32);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8844[1] + (arg0 != null ? field8844[2] : field8844[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "<init>",
      descriptor = "(Lea;IIIIZ[BIZ)V",
      line = 66
   )
   public class601(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
      boolean var10 = client.field4360;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field8830 = -1;
      this.field8837 = -1;

      try {
         this.field8833 = arg4;
         this.field8841 = arg3;
         if (arg8) {
            byte[] var11 = new byte[arg6.length];
            int var12 = 0;
            if (var10 || var12 < arg4) {
               do {
                  int var13 = arg3 * var12;
                  int var14 = (-var12 + -1 + arg4) * arg3;
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
               } while(var12 < arg4);
            }

            arg6 = var11;
         }

         label92: {
            super.field6940.method4107(21, this);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg5 || ~super.field6938 == -34038) {
               OpenGL.glTexImage2Dub(super.field6938, 0, super.field6948, this.field8841, this.field8833, 0, arg7, 5121, arg6, 0);
               this.method3521(false, 10241);
               if (!var10) {
                  break label92;
               }
            }

            class445.method3270(arg2, arg3, arg6, arg1, arg4, arg7, 0);
            this.method3521(true, 10241);
         }

         OpenGL.glPixelStorei(3317, 4);
         this.method3526(true, 32);
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field8844[1] + (arg0 != null ? field8844[2] : field8844[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8844[2] : field8844[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "<init>",
      descriptor = "(Lea;IIIIZ[IIIZ)V",
      line = 131
   )
   public class601(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
      boolean var11 = client.field4360;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field8830 = -1;
      this.field8837 = -1;

      try {
         this.field8841 = arg3;
         this.field8833 = arg4;
         if (arg9) {
            int[] var12 = new int[arg6.length];
            int var13 = 0;
            if (var11 || ~arg4 < ~var13) {
               do {
                  int var14 = arg3 * var13;
                  int var15 = (arg4 - var13 + -1) * arg3;
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
               } while(~arg4 < ~var13);
            }

            arg6 = var12;
         }

         label98: {
            super.field6940.method4107(106, this);
            if (super.field6938 == 34037 || !arg5 || arg7 != 0 || ~arg8 != -1) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Di(super.field6938, 0, super.field6948, this.field8841, this.field8833, 0, 32993, super.field6940.field8439, arg6, arg8 * 4);
               OpenGL.glPixelStorei(3314, 0);
               this.method3521(false, 10241);
               if (!var11) {
                  break label98;
               }
            }

            class688.method5024(arg6, (byte)-104, this.field8841, this.field8833, super.field6940.field8439, 32993, super.field6948, super.field6938);
            this.method3521(true, 10241);
         }

         this.method3526(true, 32);
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field8844[1] + (arg0 != null ? field8844[2] : field8844[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8844[2] : field8844[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "<init>",
      descriptor = "(Lea;IIIIZ[FI)V",
      line = 184
   )
   public class601(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field8830 = -1;
      this.field8837 = -1;

      try {
         label43: {
            this.field8833 = arg4;
            this.field8841 = arg3;
            super.field6940.method4107(27, this);
            if (!arg5 || super.field6938 == 34037) {
               OpenGL.glTexImage2Df(super.field6938, 0, super.field6948, this.field8841, this.field8833, 0, arg7, 5126, arg6, 0);
               this.method3521(false, 10241);
               if (!client.field4360) {
                  break label43;
               }
            }

            class500.method3625(arg7, arg6, arg1, arg4, arg3, arg2, 1000);
            this.method3521(true, 10241);
         }

         this.method3526(true, 32);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8844[1] + (arg0 != null ? field8844[2] : field8844[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8844[2] : field8844[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(IIIIIBI)V",
      line = 26
   )
   public final void method4369(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
      try {
         if (arg5 == 26) {
            ++field8834;
            int var8 = -arg2 + -arg4 + super.field6940.field8264;
            super.field6940.method4107(-123, this);
            OpenGL.glCopyTexSubImage2D(super.field6938, 0, arg0, -arg2 + this.field8833 + -arg6, arg1, var8, arg3, arg2);
            OpenGL.glFlush();
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8844[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "d",
      descriptor = "(I)V",
      line = 42
   )
   public static void method4370(int arg0) {
      try {
         field8838 = null;
         if (arg0 != 3317) {
            method4370(-111);
         }

         field8842 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8844[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(I)V",
      line = 121
   )
   public final void method1678(int arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field8830, this.field8837, super.field6938, 0, arg0);
         ++field8836;
         this.field8837 = -1;
         this.field8830 = -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8844[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(IIII[IZZII)V",
      line = 209
   )
   public final void method4371(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, boolean arg6, int arg7, int arg8) {
      boolean var10 = client.field4360;

      try {
         if (~arg7 == -1) {
            arg7 = arg2;
         }

         ++field8839;
         if (!arg6) {
            if (arg5) {
               int[] var11 = new int[arg2 * arg3];
               int var12 = 0;
               if (var10 || ~arg3 < ~var12) {
                  do {
                     int var13 = arg2 * var12;
                     int var14 = (arg3 - 1 + -var12) * arg7 + arg8;
                     int var15 = 0;
                     if (var10) {
                        var11[var13++] = arg4[var14++];
                        ++var15;
                     }

                     while(true) {
                        while(var15 < arg2) {
                           var11[var13++] = arg4[var14++];
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

               arg4 = var11;
            }

            super.field6940.method4107(4, this);
            if (arg2 != arg7) {
               OpenGL.glPixelStorei(3314, arg7);
            }

            OpenGL.glTexSubImage2Di(super.field6938, 0, arg0, -arg3 + this.field8833 + -arg1, arg2, arg3, 32993, super.field6940.field8439, arg4, arg8);
            if (arg2 != arg7) {
               OpenGL.glPixelStorei(3314, 0);
            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field8844[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8844[2] : field8844[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(ZZB)V",
      line = 263
   )
   public final void method4372(boolean arg0, boolean arg1, byte arg2) {
      try {
         ++field8840;
         if (super.field6938 == 3553) {
            super.field6940.method4107(64, this);
            OpenGL.glTexParameteri(super.field6938, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field6938, 10243, arg1 ? 10497 : 33071);
         }

         if (arg2 < 24) {
            this.field8841 = -3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8844[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(IIII)Z",
      line = 280
   )
   public static final boolean method4373(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != 0) {
            field8842 = null;
         }

         ++field8831;
         class604 var4 = (class604)class45.method381(arg0, arg2, arg1);
         boolean var5 = true;
         if (var4 != null) {
            var5 &= class494.method3593(var4, arg3);
         }

         class604 var6 = (class604)class691.method5042(arg0, arg2, arg1, field8843 != null ? field8843 : (field8843 = method4376(field8844[10])));
         if (var6 != null) {
            var5 &= class494.method3593(var6, 0);
         }

         class604 var7 = (class604)class216.method1708(arg0, arg2, arg1);
         if (var7 != null) {
            var5 &= class494.method3593(var7, 0);
         }

         return var5;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8844[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "(IIII)V",
      line = 312
   )
   public final void method4374(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg2 < -22) {
            OpenGL.glFramebufferTexture2DEXT(arg3, arg0, super.field6938, super.field6931, arg1);
            ++field8832;
            this.field8830 = arg3;
            this.field8837 = arg0;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8844[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(ZIII[BIIIII)V",
      line = 325
   )
   public final void method4375(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var11 = client.field4360;

      try {
         ++field8835;
         if (arg3 == 0) {
            arg3 = arg1;
         }

         if (arg0) {
            int var12 = class596.method4332(arg5, 6409);
            int var13 = arg1 * var12;
            int var14 = arg3 * var12;
            byte[] var15 = new byte[arg8 * var13];
            int var16 = 0;
            if (var11 || ~var16 > ~arg8) {
               do {
                  int var17 = var13 * var16;
                  int var18 = (arg8 - 1 + -var16) * var14 + arg9;
                  int var19 = 0;
                  if (var11) {
                     var15[var17++] = arg4[var18++];
                     ++var19;
                  }

                  while(true) {
                     while(~var13 < ~var19) {
                        var15[var17++] = arg4[var18++];
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

            arg4 = var15;
         }

         super.field6940.method4107(25, this);
         OpenGL.glPixelStorei(3317, 1);
         if (arg1 != arg3) {
            OpenGL.glPixelStorei(3314, arg3);
         }

         OpenGL.glTexSubImage2Dub(super.field6938, 0, arg7, arg2, arg1, arg8, arg5, 5121, arg4, arg9);
         if (arg1 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(arg6, 4);
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field8844[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8844[2] : field8844[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4377(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4378(char[] arg0) {
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
            var10005 = 106;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
