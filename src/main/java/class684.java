import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class684 extends class573 {
   @OriginalMember(
      owner = "client!mj",
      name = "B",
      descriptor = "I"
   )
   private int field10036;
   @OriginalMember(
      owner = "client!mj",
      name = "x",
      descriptor = "I"
   )
   private int field10039;
   @OriginalMember(
      owner = "client!mj",
      name = "E",
      descriptor = "I"
   )
   public int field10044;
   @OriginalMember(
      owner = "client!mj",
      name = "A",
      descriptor = "I"
   )
   public int field10040;
   @OriginalMember(
      owner = "client!mj",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10048 = new String[]{method5004(method5003("\t\u001dZ\u007f")), method5004(method5003("\u001cF\u0018=\u0019")), method5004(method5003("\n\u0002\u0018/\r\t\u0001B-L")), method5004(method5003("\n\u0002\u0018TL")), method5004(method5003("\n\u0002\u0018[L")), method5004(method5003("\n\u0002\u0018QL")), method5004(method5003("\n\u0002\u0018RL")), method5004(method5003("\n\u0002\u0018WL")), method5004(method5003("\n\u0002\u0018VL")), method5004(method5003("\n\u0002\u0018UL")), method5004(method5003("\n\u0002\u0018PL"))};
   @OriginalMember(
      owner = "client!mj",
      name = "C",
      descriptor = "Lnw;"
   )
   public static class616 field10043 = new class616(9, 15);
   @OriginalMember(
      owner = "client!mj",
      name = "G",
      descriptor = "I"
   )
   public static int field10037;
   @OriginalMember(
      owner = "client!mj",
      name = "F",
      descriptor = "I"
   )
   public static int field10038;
   @OriginalMember(
      owner = "client!mj",
      name = "y",
      descriptor = "I"
   )
   public static int field10041;
   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "I"
   )
   public static int field10042;
   @OriginalMember(
      owner = "client!mj",
      name = "v",
      descriptor = "I"
   )
   public static int field10045;
   @OriginalMember(
      owner = "client!mj",
      name = "w",
      descriptor = "I"
   )
   public static int field10046;
   @OriginalMember(
      owner = "client!mj",
      name = "D",
      descriptor = "I"
   )
   public static int field10047;

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Lor;IIIIZ[BIZ)V"
   )
   public class684(class670 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
      boolean var10 = client.field4273;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field10036 = -1;
      this.field10039 = -1;

      try {
         this.field10044 = arg4;
         this.field10040 = arg3;
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

         label43: {
            super.field7877.method4848(false, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 && super.field7876 != 34037) {
               class702.method5092(-83, arg6, arg4, arg2, arg3, arg1, arg7);
               this.method4132(true, 125);
               if (!var10) {
                  break label43;
               }
            }

            OpenGL.glTexImage2Dub(super.field7876, 0, super.field7890, this.field10040, this.field10044, 0, arg7, 5121, arg6, 0);
            this.method4132(false, 102);
         }

         OpenGL.glPixelStorei(3317, 4);
         this.method4129(-1323776991, true);
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field10048[2] + (arg0 != null ? field10048[1] : field10048[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10048[1] : field10048[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method4996(int arg0) {
      try {
         int var1 = 62 / ((-14 - arg0) / 35);
         ++field10046;
         if (class694.method5054(class445.field6162, -10)) {
            if (class605.field8473.field2779 != null) {
               class397.method3019(-120, 7);
            } else {
               class397.method3019(125, 5);
            }
         } else if (~class445.field6162 != -6 && ~class445.field6162 != -7) {
            if (~class445.field6162 == -14) {
               class397.method3019(78, 3);
            }
         } else {
            class397.method3019(-105, 3);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10048[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method4997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field10047;
         int var8 = -arg0 + -arg6 + super.field7877.field9621;
         super.field7877.method4848(false, this);
         if (arg1 < -73) {
            OpenGL.glCopyTexSubImage2D(super.field7876, 0, arg5, -arg4 + -arg6 + this.field10044, arg2, var8, arg3, arg6);
            OpenGL.glFlush();
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field10048[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Lor;IIIIZ[IIIZ)V"
   )
   public class684(class670 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
      boolean var11 = client.field4273;
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field10036 = -1;
      this.field10039 = -1;

      try {
         this.field10044 = arg4;
         this.field10040 = arg3;
         if (arg9) {
            int[] var12 = new int[arg6.length];
            int var13 = 0;
            if (var11 || arg4 > var13) {
               do {
                  int var14 = arg3 * var13;
                  int var15 = (arg4 - 1 + -var13) * arg3;
                  int var16 = 0;
                  if (var11) {
                     var12[var14++] = arg6[var15++];
                     ++var16;
                  }

                  while(true) {
                     while(~var16 > ~arg3) {
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

         label49: {
            super.field7877.method4848(false, this);
            if (super.field7876 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
               class592.method4259(super.field7877.field9852, super.field7890, this.field10044, 32993, (byte)-121, super.field7876, arg6, this.field10040);
               this.method4132(true, 103);
               if (!var11) {
                  break label49;
               }
            }

            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field7876, 0, super.field7890, this.field10040, this.field10044, 0, 32993, super.field7877.field9852, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method4132(false, 120);
         }

         this.method4129(-1323776991, true);
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field10048[2] + (arg0 != null ? field10048[1] : field10048[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10048[1] : field10048[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method317(int arg0) {
      try {
         ++field10038;
         OpenGL.glFramebufferTexture2DEXT(this.field10039, this.field10036, super.field7876, arg0, 0);
         this.field10036 = -1;
         this.field10039 = -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10048[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Lor;IIII)V"
   )
   public class684(class670 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3 * arg4, false);
      this.field10036 = -1;
      this.field10039 = -1;

      try {
         this.field10040 = arg3;
         this.field10044 = arg4;
         super.field7877.method4848(false, this);
         OpenGL.glTexImage2Dub(super.field7876, 0, super.field7890, arg3, arg4, 0, class393.method2995(super.field7890, 6410), 5121, (byte[])null, 0);
         this.method4129(-1323776991, true);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10048[2] + (arg0 != null ? field10048[1] : field10048[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Lor;IIIIZ[FI)V"
   )
   public class684(class670 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3 * arg4, arg5);
      this.field10036 = -1;
      this.field10039 = -1;

      try {
         label43: {
            this.field10040 = arg3;
            this.field10044 = arg4;
            super.field7877.method4848(false, this);
            if (!arg5 || ~super.field7876 == -34038) {
               OpenGL.glTexImage2Df(super.field7876, 0, super.field7890, this.field10040, this.field10044, 0, arg7, 5126, arg6, 0);
               this.method4132(false, 103);
               if (!client.field4273) {
                  break label43;
               }
            }

            class435.method3245(1, arg7, arg4, arg6, arg1, arg2, arg3);
            this.method4132(true, 108);
         }

         this.method4129(-1323776991, true);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field10048[2] + (arg0 != null ? field10048[1] : field10048[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10048[1] : field10048[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method4998(int arg0, boolean arg1, boolean arg2) {
      try {
         if (super.field7876 == 3553) {
            super.field7877.method4848(false, this);
            OpenGL.glTexParameteri(super.field7876, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field7876, 10243, !arg1 ? 33071 : 10497);
         }

         if (arg0 == 10497) {
            ++field10042;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10048[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4999(int arg0) {
      try {
         if (arg0 != -1) {
            field10043 = null;
         }

         field10043 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10048[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(II[BIIIIZII)V"
   )
   public final void method5000(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
      boolean var11 = client.field4273;

      try {
         ++field10045;
         if (arg9 == 0) {
            arg9 = arg5;
         }

         if (arg7) {
            int var12 = class341.method2702(arg6 ^ -3214, arg1);
            int var13 = arg5 * var12;
            int var14 = arg9 * var12;
            byte[] var15 = new byte[arg0 * var13];
            int var16 = 0;
            if (var11 || arg0 > var16) {
               do {
                  int var17 = var13 * var16;
                  int var18 = (-var16 + -1 + arg0) * var14 + arg8;
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
               } while(arg0 > var16);
            }

            arg2 = var15;
         }

         super.field7877.method4848(false, this);
         OpenGL.glPixelStorei(3317, 1);
         if (arg5 != arg9) {
            OpenGL.glPixelStorei(3314, arg9);
         }

         if (arg6 != 3314) {
            this.field10036 = 43;
         }

         OpenGL.glTexSubImage2Dub(super.field7876, 0, arg3, arg4, arg5, arg0, arg1, 5121, arg2, arg8);
         if (arg5 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field10048[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10048[1] : field10048[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(Z[IIIIIIII)V"
   )
   public final void method5001(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4273;

      try {
         ++field10041;
         if (arg4 == 0) {
            arg4 = arg3;
         }

         if (arg0) {
            int[] var11 = new int[arg2 * arg3];
            int var12 = 0;
            if (var10 || ~var12 > ~arg2) {
               do {
                  int var13 = arg3 * var12;
                  int var14 = (-var12 + arg2 - 1) * arg4 + arg5;
                  int var15 = 0;
                  if (var10) {
                     var11[var13++] = arg1[var14++];
                     ++var15;
                  }

                  while(true) {
                     while(arg3 > var15) {
                        var11[var13++] = arg1[var14++];
                        ++var15;
                     }

                     if (!var10) {
                        ++var12;
                        break;
                     }

                     ++var15;
                  }
               } while(~var12 > ~arg2);
            }

            arg1 = var11;
         }

         super.field7877.method4848(false, this);
         if (~arg3 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg4);
         }

         OpenGL.glTexSubImage2Di(super.field7876, arg7, arg8, -arg2 + -arg6 + this.field10044, arg3, arg2, 32993, super.field7877.field9852, arg1, arg5);
         if (~arg3 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field10048[8] + arg0 + ',' + (arg1 != null ? field10048[1] : field10048[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Lor;IIIII)V"
   )
   public class684(class670 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, 6407, arg4 * arg5, false);
      this.field10036 = -1;
      this.field10039 = -1;

      try {
         this.field10044 = arg5;
         this.field10040 = arg4;
         int var7 = -arg3 + -arg5 + super.field7877.field9621;
         super.field7877.method4848(false, this);
         OpenGL.glCopyTexImage2D(super.field7876, 0, super.field7890, arg2, var7, arg4, arg5, 0);
         this.method4129(-1323776991, true);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10048[2] + (arg0 != null ? field10048[1] : field10048[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method5002(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 == -6) {
            OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field7876, super.field7882, arg3);
            ++field10037;
            this.field10039 = arg2;
            this.field10036 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10048[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5003(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5004(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
