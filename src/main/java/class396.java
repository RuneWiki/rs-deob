import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class396 extends class799 {
   @OriginalMember(
      owner = "client!bka",
      name = "A",
      descriptor = "I"
   )
   private int field6203;
   @OriginalMember(
      owner = "client!bka",
      name = "B",
      descriptor = "I"
   )
   private int field6209;
   @OriginalMember(
      owner = "client!bka",
      name = "I",
      descriptor = "I"
   )
   public int field6218;
   @OriginalMember(
      owner = "client!bka",
      name = "E",
      descriptor = "I"
   )
   public int field6215;
   @OriginalMember(
      owner = "client!bka",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6219 = new String[]{method3200(method3199("L33H\"\u0006")), method3200(method3199("@->\n")), method3200(method3199("Uv|H\b")), method3200(method3199("L33HIG6;\u0012K\u0006")), method3200(method3199("L33H#\u0006")), method3200(method3199("L33H2\u0006")), method3200(method3199("L33H0\u0006")), method3200(method3199("L33H3\u0006")), method3200(method3199("L33H!\u0006")), method3200(method3199("L33H&\u0006")), method3200(method3199("L33H \u0006")), method3200(method3199("L33H7op"))};
   @OriginalMember(
      owner = "client!bka",
      name = "D",
      descriptor = "Lnaa;"
   )
   public static class113 field6211 = new class113(91, 8);
   @OriginalMember(
      owner = "client!bka",
      name = "L",
      descriptor = "I"
   )
   public static int field6216 = 0;
   @OriginalMember(
      owner = "client!bka",
      name = "F",
      descriptor = "F"
   )
   public static float field6212;
   @OriginalMember(
      owner = "client!bka",
      name = "x",
      descriptor = "I"
   )
   public static int field6204;
   @OriginalMember(
      owner = "client!bka",
      name = "K",
      descriptor = "I"
   )
   public static int field6205;
   @OriginalMember(
      owner = "client!bka",
      name = "G",
      descriptor = "I"
   )
   public static int field6206;
   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "I"
   )
   public static int field6207;
   @OriginalMember(
      owner = "client!bka",
      name = "J",
      descriptor = "I"
   )
   public static int field6208;
   @OriginalMember(
      owner = "client!bka",
      name = "w",
      descriptor = "I"
   )
   public static int field6210;
   @OriginalMember(
      owner = "client!bka",
      name = "y",
      descriptor = "I"
   )
   public static int field6213;
   @OriginalMember(
      owner = "client!bka",
      name = "C",
      descriptor = "I"
   )
   public static int field6214;
   @OriginalMember(
      owner = "client!bka",
      name = "H",
      descriptor = "I"
   )
   public static int field6217;

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IIIIBII)V"
   )
   public final void method3190(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         ++field6213;
         if (arg4 < 75) {
            field6216 = 28;
         }

         int var8 = -arg2 - (arg6 - super.field11637.field9472);
         super.field11637.method4792(-26367, this);
         OpenGL.glCopyTexSubImage2D(super.field11642, 0, arg0, -arg6 + this.field6218 + -arg1, arg5, var8, arg3, arg6);
         OpenGL.glFlush();
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6219[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method3191(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field6207;
         OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field11642, super.field11631, arg1);
         int var5 = -113 % ((arg3 - 66) / 59);
         this.field6203 = arg0;
         this.field6209 = arg2;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6219[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(ZZZ)V"
   )
   public final void method3192(boolean arg0, boolean arg1, boolean arg2) {
      try {
         ++field6210;
         if (arg1) {
            this.method1683((byte)4);
         }

         if (~super.field11642 == -3554) {
            super.field11637.method4792(-26367, this);
            OpenGL.glTexParameteri(super.field11642, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field11642, 10243, !arg2 ? 33071 : 10497);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6219[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IIIIBI)V"
   )
   public static final void method3193(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
      try {
         ++field6208;
         if (~class687.field10213.field509.method1774(480102311) != -1 && arg1 != 0 && class465.field7069 < 50 && arg5 != -1) {
            class207.field3159[class465.field7069++] = new class760((byte)1, arg5, arg1, arg2, arg0, 0, arg3, (class109)null);
         }

         int var6 = -113 % ((arg4 - 74) / 37);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6219[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1683(byte arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field6209, this.field6203, super.field11642, 0, 0);
         ++field6205;
         this.field6209 = -1;
         this.field6203 = -1;
         if (arg0 != -117) {
            this.field6209 = -46;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6219[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "(II)Lbga;"
   )
   public static final class59 method3194(int arg0, int arg1) {
      try {
         ++field6204;
         class59 var2 = (class59)class187.field2921.method2544(false, (long)arg1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class425.field6568.method5017(arg0, arg1, (byte)71);
            class59 var4 = new class59();
            if (var3 != null) {
               var4.method438(arg1, false, new class354(var3));
            }

            class187.field2921.method2545((long)arg1, 114, var4);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6219[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(II[BIIIIZII)V"
   )
   public final void method3195(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
      boolean var11 = client.field1786;

      try {
         if (arg1 == 0) {
            arg1 = arg0;
         }

         ++field6206;
         if (arg7) {
            int var12 = class357.method2920((byte)-51, arg6);
            int var13 = arg0 * var12;
            int var14 = arg1 * var12;
            byte[] var15 = new byte[arg9 * var13];
            int var16 = 0;
            if (var11 || arg9 > var16) {
               do {
                  int var17 = var13 * var16;
                  int var18 = (-var16 + -1 + arg9) * var14 + arg3;
                  int var19 = 0;
                  if (var11) {
                     var15[var17++] = arg2[var18++];
                     ++var19;
                  }

                  while(true) {
                     while(~var19 > ~var13) {
                        var15[var17++] = arg2[var18++];
                        ++var19;
                     }

                     if (!var11) {
                        ++var16;
                        break;
                     }

                     ++var19;
                  }
               } while(arg9 > var16);
            }

            arg2 = var15;
         }

         super.field11637.method4792(-26367, this);
         if (arg5 == -3477) {
            OpenGL.glPixelStorei(3317, 1);
            if (arg0 != arg1) {
               OpenGL.glPixelStorei(3314, arg1);
            }

            OpenGL.glTexSubImage2Dub(super.field11642, 0, arg8, arg4, arg0, arg9, arg6, 5121, arg2, arg3);
            if (~arg0 != ~arg1) {
               OpenGL.glPixelStorei(3314, 0);
            }

            OpenGL.glPixelStorei(3317, 4);
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field6219[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6219[2] : field6219[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(Lc;IIIIZ[FI)V"
   )
   public class396(class652 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field6203 = -1;
      this.field6209 = -1;

      try {
         label43: {
            this.field6218 = arg4;
            this.field6215 = arg3;
            super.field11637.method4792(-26367, this);
            if (!arg5 || super.field11642 == 34037) {
               OpenGL.glTexImage2Df(super.field11642, 0, super.field11630, this.field6215, this.field6218, 0, arg7, 5126, arg6, 0);
               this.method5766(-103, false);
               if (!client.field1786) {
                  break label43;
               }
            }

            class446.method3502(arg7, arg2, arg1, arg4, arg3, false, arg6);
            this.method5766(123, true);
         }

         this.method5760(true, (byte)-107);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6219[3] + (arg0 != null ? field6219[2] : field6219[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6219[2] : field6219[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(Lc;IIIIZ[IIIZ)V"
   )
   public class396(class652 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
      boolean var11 = client.field1786;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field6203 = -1;
      this.field6209 = -1;

      try {
         this.field6218 = arg4;
         this.field6215 = arg3;
         if (arg9) {
            int[] var12 = new int[arg6.length];
            int var13 = 0;
            if (var11 || arg4 > var13) {
               do {
                  int var14 = arg3 * var13;
                  int var15 = (arg4 - var13 + -1) * arg3;
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
               } while(arg4 > var13);
            }

            arg6 = var12;
         }

         label98: {
            super.field11637.method4792(-26367, this);
            if (super.field11642 == 34037 || !arg5 || arg7 != 0 || arg8 != 0) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Di(super.field11642, 0, super.field11630, this.field6215, this.field6218, 0, 32993, super.field11637.field9738, arg6, arg8 * 4);
               OpenGL.glPixelStorei(3314, 0);
               this.method5766(-73, false);
               if (!var11) {
                  break label98;
               }
            }

            class14.method101(arg6, this.field6215, super.field11630, super.field11642, this.field6218, 32993, super.field11637.field9738, (byte)65);
            this.method5766(-2, true);
         }

         this.method5760(true, (byte)-107);
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field6219[3] + (arg0 != null ? field6219[2] : field6219[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6219[2] : field6219[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(III)Lija;"
   )
   public static final class605 method3196(int arg0, int arg1, int arg2) {
      class190 var3 = class711.field10694[arg0][arg1][arg2];
      return var3 == null ? null : var3.field2962;
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(Lc;IIIII)V"
   )
   public class396(class652 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, 6407, arg4 * arg5, false);
      this.field6203 = -1;
      this.field6209 = -1;

      try {
         this.field6218 = arg5;
         this.field6215 = arg4;
         int var7 = -arg3 + -arg5 + super.field11637.field9472;
         super.field11637.method4792(-26367, this);
         OpenGL.glCopyTexImage2D(super.field11642, 0, super.field11630, arg2, var7, arg4, arg5, 0);
         this.method5760(true, (byte)-107);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field6219[3] + (arg0 != null ? field6219[2] : field6219[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3197(int arg0) {
      try {
         if (arg0 != 0) {
            method3193(-118, 44, 120, -11, (byte)0, 99);
         }

         field6211 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6219[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(Lc;IIII)V"
   )
   public class396(class652 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3 * arg4, false);
      this.field6203 = -1;
      this.field6209 = -1;

      try {
         this.field6215 = arg3;
         this.field6218 = arg4;
         super.field11637.method4792(-26367, this);
         OpenGL.glTexImage2Dub(super.field11642, 0, super.field11630, arg3, arg4, 0, class605.method4467(super.field11630, (byte)27), 5121, (byte[])null, 0);
         this.method5760(true, (byte)-107);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6219[3] + (arg0 != null ? field6219[2] : field6219[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(Lc;IIIIZ[BIZ)V"
   )
   public class396(class652 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
      boolean var10 = client.field1786;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field6203 = -1;
      this.field6209 = -1;

      try {
         this.field6218 = arg4;
         this.field6215 = arg3;
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

         label43: {
            super.field11637.method4792(-26367, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 && super.field11642 != 34037) {
               class186.method1673(arg3, arg4, 0, arg1, arg6, arg7, arg2);
               this.method5766(-40, true);
               if (!var10) {
                  break label43;
               }
            }

            OpenGL.glTexImage2Dub(super.field11642, 0, super.field11630, this.field6215, this.field6218, 0, arg7, 5121, arg6, 0);
            this.method5766(30, false);
         }

         OpenGL.glPixelStorei(3317, 4);
         this.method5760(true, (byte)-107);
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field6219[3] + (arg0 != null ? field6219[2] : field6219[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6219[2] : field6219[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IIIIIZII[I)V"
   )
   public final void method3198(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int[] arg8) {
      boolean var10 = client.field1786;

      try {
         if (arg0 != 91) {
            this.field6203 = -13;
         }

         if (arg3 == 0) {
            arg3 = arg2;
         }

         ++field6217;
         if (arg5) {
            int[] var11 = new int[arg2 * arg4];
            int var12 = 0;
            if (var10 || arg4 > var12) {
               do {
                  int var13 = arg2 * var12;
                  int var14 = (arg4 - var12 + -1) * arg3 - -arg6;
                  int var15 = 0;
                  if (var10) {
                     var11[var13++] = arg8[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(var15 < arg2) {
                        var11[var13++] = arg8[var14++];
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

            arg8 = var11;
         }

         super.field11637.method4792(-26367, this);
         if (~arg2 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg3);
         }

         OpenGL.glTexSubImage2Di(super.field11642, 0, arg7, -arg1 + this.field6218 + -arg4, arg2, arg4, 32993, super.field11637.field9738, arg8, arg6);
         if (arg2 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field6219[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field6219[2] : field6219[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3199(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3200(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
