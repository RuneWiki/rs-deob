import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class8 extends class719 {
   @OriginalMember(
      owner = "client!mn",
      name = "w",
      descriptor = "I"
   )
   private int field137;
   @OriginalMember(
      owner = "client!mn",
      name = "G",
      descriptor = "I"
   )
   private int field143;
   @OriginalMember(
      owner = "client!mn",
      name = "B",
      descriptor = "I"
   )
   public int field141;
   @OriginalMember(
      owner = "client!mn",
      name = "C",
      descriptor = "I"
   )
   public int field140;
   @OriginalMember(
      owner = "client!mn",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field149 = new String[]{method72(method71("\u0016\u00125\u0002]")), method72(method71("\u0016\u00125\u0003]")), method72(method71("\u0016\u00125n\u001c\u0015\u0015ol]")), method72(method71("\u0015\tw>")), method72(method71("\u0000R5|\b")), method72(method71("\u0016\u00125\u001c]")), method72(method71("\u0016\u00125\u001d]")), method72(method71("\u0016\u00125\u0000]")), method72(method71("\u0016\u00125\u0001]")), method72(method71("\u0016\u00125\u0013]"))};
   @OriginalMember(
      owner = "client!mn",
      name = "H",
      descriptor = "Lbba;"
   )
   public static class801 field144 = new class801();
   @OriginalMember(
      owner = "client!mn",
      name = "y",
      descriptor = "Lsb;"
   )
   public static class261 field147 = new class261();
   @OriginalMember(
      owner = "client!mn",
      name = "x",
      descriptor = "Lhha;"
   )
   public static class724 field148 = new class724(79, -2);
   @OriginalMember(
      owner = "client!mn",
      name = "D",
      descriptor = "I"
   )
   public static int field136;
   @OriginalMember(
      owner = "client!mn",
      name = "E",
      descriptor = "I"
   )
   public static int field138;
   @OriginalMember(
      owner = "client!mn",
      name = "A",
      descriptor = "I"
   )
   public static int field139;
   @OriginalMember(
      owner = "client!mn",
      name = "F",
      descriptor = "I"
   )
   public static int field142;
   @OriginalMember(
      owner = "client!mn",
      name = "v",
      descriptor = "I"
   )
   public static int field145;
   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "I"
   )
   public static int field146;

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(II[IIIIIZI)V"
   )
   public final void method64(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
      boolean var10 = client.field10022;

      try {
         ++field138;
         if (~arg1 == -1) {
            arg1 = arg8;
         }

         if (arg7) {
            int[] var11 = new int[arg4 * arg8];
            int var12 = 0;
            if (var10 || arg4 > var12) {
               do {
                  int var13 = arg8 * var12;
                  int var14 = (arg4 + -1 + -var12) * arg1 - -arg0;
                  int var15 = 0;
                  if (var10) {
                     var11[var13++] = arg2[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(~arg8 < ~var15) {
                        var11[var13++] = arg2[var14++];
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

            arg2 = var11;
         }

         int var16 = -113 / ((-28 - arg5) / 38);
         super.field10293.method4906(-2, this);
         if (arg1 != arg8) {
            OpenGL.glPixelStorei(3314, arg1);
         }

         OpenGL.glTexSubImage2Di(super.field10295, 0, arg6, -arg4 + this.field140 - arg3, arg8, arg4, 32993, super.field10293.field9785, arg2, arg0);
         if (~arg1 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field149[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field149[4] : field149[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "(Laea;IIII)V"
   )
   public class8(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3 * arg4, false);
      this.field137 = -1;
      this.field143 = -1;

      try {
         this.field141 = arg3;
         this.field140 = arg4;
         super.field10293.method4906(-2, this);
         OpenGL.glTexImage2Dub(super.field10295, 0, super.field10288, arg3, arg4, 0, class14.method117(-18924, super.field10288), 5121, (byte[])null, 0);
         this.method5204(true, -1);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field149[2] + (arg0 != null ? field149[4] : field149[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "(IBII)V"
   )
   public final void method65(int arg0, byte arg1, int arg2, int arg3) {
      try {
         OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field10295, super.field10298, arg2);
         int var5 = 50 % ((arg1 - -25) / 54);
         ++field146;
         this.field143 = arg0;
         this.field137 = arg3;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field149[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "(Laea;IIIIZ[IIIZ)V"
   )
   public class8(class678 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
      boolean var11 = client.field10022;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field137 = -1;
      this.field143 = -1;

      try {
         this.field141 = arg3;
         this.field140 = arg4;
         if (arg9) {
            int[] var12 = new int[arg6.length];
            int var13 = 0;
            if (var11 || ~var13 > ~arg4) {
               do {
                  int var14 = arg3 * var13;
                  int var15 = (arg4 - (var13 + 1)) * arg3;
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
               } while(~var13 > ~arg4);
            }

            arg6 = var12;
         }

         label97: {
            super.field10293.method4906(-2, this);
            if (~super.field10295 == -34038 || !arg5 || arg7 != 0 || arg8 != 0) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Di(super.field10295, 0, super.field10288, this.field141, this.field140, 0, 32993, super.field10293.field9785, arg6, arg8 * 4);
               OpenGL.glPixelStorei(3314, 0);
               this.method5208(false, -1);
               if (!var11) {
                  break label97;
               }
            }

            class584.method4293(super.field10295, super.field10288, this.field140, super.field10293.field9785, arg6, 774680424, 32993, this.field141);
            this.method5208(true, -1);
         }

         this.method5204(true, -1);
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field149[2] + (arg0 != null ? field149[4] : field149[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field149[4] : field149[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "(Laea;IIIIZ[BIZ)V"
   )
   public class8(class678 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
      boolean var10 = client.field10022;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field137 = -1;
      this.field143 = -1;

      try {
         this.field141 = arg3;
         this.field140 = arg4;
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
                     while(~arg3 < ~var15) {
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
            super.field10293.method4906(-2, this);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg5 || ~super.field10295 == -34038) {
               OpenGL.glTexImage2Dub(super.field10295, 0, super.field10288, this.field141, this.field140, 0, arg7, 5121, arg6, 0);
               this.method5208(false, -1);
               if (!var10) {
                  break label92;
               }
            }

            class561.method4180(arg7, arg3, arg6, 0, arg2, arg4, arg1);
            this.method5208(true, -1);
         }

         OpenGL.glPixelStorei(3317, 4);
         this.method5204(true, -1);
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field149[2] + (arg0 != null ? field149[4] : field149[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field149[4] : field149[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field142;
         int var8 = -arg2 + super.field10293.field9538 + -arg1;
         super.field10293.method4906(-2, this);
         OpenGL.glCopyTexSubImage2D(super.field10295, 0, arg6, this.field140 - arg5 - arg1, arg4, var8, arg0, arg1);
         if (arg3 != -1) {
            field148 = null;
         }

         OpenGL.glFlush();
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field149[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(ZIZ)V"
   )
   public final void method67(boolean arg0, int arg1, boolean arg2) {
      try {
         int var4 = -18 / (arg1 / 41);
         ++field136;
         if (super.field10295 == 3553) {
            super.field10293.method4906(-2, this);
            OpenGL.glTexParameteri(super.field10295, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field10295, 10243, !arg0 ? 33071 : 10497);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field149[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "([BZIIIIIIIB)V"
   )
   public final void method68(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
      boolean var11 = client.field10022;

      try {
         if (arg9 != 4) {
            this.method66(-47, 109, 92, 42, 61, 81, -1);
         }

         ++field139;
         if (~arg4 == -1) {
            arg4 = arg3;
         }

         if (arg1) {
            int var12 = class104.method1022((byte)105, arg6);
            int var13 = arg3 * var12;
            int var14 = arg4 * var12;
            byte[] var15 = new byte[arg2 * var13];
            int var16 = 0;
            if (var11 || arg2 > var16) {
               do {
                  int var17 = var13 * var16;
                  int var18 = (-var16 - 1 + arg2) * var14 + arg7;
                  int var19 = 0;
                  if (var11) {
                     var15[var17++] = arg0[var18++];
                     ++var19;
                  }

                  while(true) {
                     while(~var13 < ~var19) {
                        var15[var17++] = arg0[var18++];
                        ++var19;
                     }

                     if (!var11) {
                        ++var16;
                        break;
                     }

                     ++var19;
                  }
               } while(arg2 > var16);
            }

            arg0 = var15;
         }

         super.field10293.method4906(-2, this);
         OpenGL.glPixelStorei(3317, 1);
         if (~arg3 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg4);
         }

         OpenGL.glTexSubImage2Dub(super.field10295, 0, arg5, arg8, arg3, arg2, arg6, 5121, arg0, arg7);
         if (~arg3 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field149[7] + (arg0 != null ? field149[4] : field149[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "(Laea;IIIIZ[FI)V"
   )
   public class8(class678 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field137 = -1;
      this.field143 = -1;

      try {
         label43: {
            this.field141 = arg3;
            this.field140 = arg4;
            super.field10293.method4906(-2, this);
            if (!arg5 || ~super.field10295 == -34038) {
               OpenGL.glTexImage2Df(super.field10295, 0, super.field10288, this.field141, this.field140, 0, arg7, 5126, arg6, 0);
               this.method5208(false, -1);
               if (!client.field10022) {
                  break label43;
               }
            }

            class167.method1565(arg7, arg3, arg4, arg6, arg1, arg2, 109);
            this.method5208(true, -1);
         }

         this.method5204(true, -1);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field149[2] + (arg0 != null ? field149[4] : field149[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field149[4] : field149[3]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method69(int arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field143, this.field137, super.field10295, 0, 0);
         ++field145;
         this.field137 = -1;
         this.field143 = -1;
         if (arg0 != -4249) {
            this.method66(25, 107, 83, 103, 57, -70, 47);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field149[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "(Laea;IIIII)V"
   )
   public class8(class678 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, 6407, arg4 * arg5, false);
      this.field137 = -1;
      this.field143 = -1;

      try {
         this.field141 = arg4;
         this.field140 = arg5;
         int var7 = -arg3 + -arg5 + super.field10293.field9538;
         super.field10293.method4906(-2, this);
         OpenGL.glCopyTexImage2D(super.field10295, 0, super.field10288, arg2, var7, arg4, arg5, 0);
         this.method5204(true, -1);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field149[2] + (arg0 != null ? field149[4] : field149[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method70(byte arg0) {
      try {
         field148 = null;
         field147 = null;
         field144 = null;
         if (arg0 < 85) {
            field148 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field149[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method71(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method72(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
