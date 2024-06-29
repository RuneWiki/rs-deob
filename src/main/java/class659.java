import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class659 extends class476 implements class282 {
   @OriginalMember(
      owner = "client!st",
      name = "N",
      descriptor = "I"
   )
   private int field9854;
   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "I"
   )
   private int field9857;
   @OriginalMember(
      owner = "client!st",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9861 = new String[]{method4859(method4858("\u0011\b#;\u0007")), method4859(method4858("\u0004Say")), method4859(method4858("\u0019R#_R")), method4859(method4858("\u0019R#YR")), method4859(method4858("\u0019R#]R")), method4859(method4858("\u0019R#)\u0013\u0004Oy+R")), method4859(method4858("\u0019R#SR")), method4859(method4858("\u0019R#DR")), method4859(method4858("\u0019R#ER")), method4859(method4858("\u0019R#ZR")), method4859(method4858("\u0019R#QR")), method4859(method4858("\u0019R#WR")), method4859(method4858("\u0019R#\\R")), method4859(method4858("\u0019R#PR")), method4859(method4858("\u0019R#XR")), method4859(method4858("\u0019R#RR")), method4859(method4858("\u0019R#^R"))};
   @OriginalMember(
      owner = "client!st",
      name = "I",
      descriptor = "I"
   )
   public static int field9843;
   @OriginalMember(
      owner = "client!st",
      name = "J",
      descriptor = "I"
   )
   public static int field9844;
   @OriginalMember(
      owner = "client!st",
      name = "B",
      descriptor = "I"
   )
   public static int field9846;
   @OriginalMember(
      owner = "client!st",
      name = "H",
      descriptor = "I"
   )
   public static int field9848;
   @OriginalMember(
      owner = "client!st",
      name = "L",
      descriptor = "I"
   )
   public static int field9849;
   @OriginalMember(
      owner = "client!st",
      name = "M",
      descriptor = "I"
   )
   public static int field9851;
   @OriginalMember(
      owner = "client!st",
      name = "w",
      descriptor = "I"
   )
   public static int field9852;
   @OriginalMember(
      owner = "client!st",
      name = "A",
      descriptor = "I"
   )
   public static int field9853;
   @OriginalMember(
      owner = "client!st",
      name = "D",
      descriptor = "I"
   )
   public static int field9855;
   @OriginalMember(
      owner = "client!st",
      name = "C",
      descriptor = "I"
   )
   public static int field9856;
   @OriginalMember(
      owner = "client!st",
      name = "y",
      descriptor = "I"
   )
   public static int field9858;
   @OriginalMember(
      owner = "client!st",
      name = "G",
      descriptor = "I"
   )
   public static int field9859;
   @OriginalMember(
      owner = "client!st",
      name = "x",
      descriptor = "I"
   )
   public static int field9860;
   @OriginalMember(
      owner = "client!st",
      name = "O",
      descriptor = "Lha;"
   )
   public static class610 field9850;
   @OriginalMember(
      owner = "client!st",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9847;
   @OriginalMember(
      owner = "client!st",
      name = "F",
      descriptor = "[Lpk;"
   )
   public static class451[] field9842;
   @OriginalMember(
      owner = "client!st",
      name = "K",
      descriptor = "[[Z"
   )
   public static boolean[][] field9845;

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2355(int arg0) {
      try {
         ++field9859;
         if (arg0 != 20759) {
            field9842 = null;
         }

         return this.field9854;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9861[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(BIIIILeh;II[B)V"
   )
   public final void method2360(byte arg0, int arg1, int arg2, int arg3, int arg4, class19 arg5, int arg6, int arg7, byte[] arg8) {
      try {
         super.field7244.method2193(this, (byte)-19);
         ++field9851;
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexSubImage2Dub(super.field7248, 0, arg4, arg7, arg1, arg2, class158.method1412(50, arg5), 5121, arg8, arg3);
         OpenGL.glPixelStorei(3314, 0);
         if (arg0 >= -11) {
            field9847 = null;
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field9861[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9861[0] : field9861[1]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field9861[0] : field9861[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(IF)F"
   )
   public final float method2363(int arg0, float arg1) {
      try {
         if (arg0 > -24) {
            method4856((byte)61);
         }

         ++field9856;
         return arg1 / (float)this.field9857;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9861[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "e",
      descriptor = "(B)V"
   )
   public static final void method4852(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(B[IIIIII)V"
   )
   public final void method2356(byte param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(IIIII[III)V"
   )
   public final void method2357(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
      try {
         super.field7244.method2193(this, (byte)-19);
         if (arg1 == -24773) {
            ++field9852;
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexSubImage2Di(super.field7248, 0, arg2, arg0, arg4, arg3, 32993, super.field7244.field2736, arg5, arg7);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9861[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9861[0] : field9861[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "<init>",
      descriptor = "(Lcka;Leh;IIZ[FII)V"
   )
   public class659(class174 arg0, class19 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class650.field9375, arg2 * arg3, arg4);

      try {
         this.field9854 = arg2;
         this.field9857 = arg3;
         super.field7244.method2193(this, (byte)-19);
         if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method3703(super.field7248, arg5, arg2, arg3, (byte)108);
         } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field7248, 0, this.method3704(-8760), arg2, arg3, 0, class158.method1412(50, super.field7246), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9861[5] + (arg0 != null ? field9861[0] : field9861[1]) + ',' + (arg1 != null ? field9861[0] : field9861[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9861[0] : field9861[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method4853(byte arg0) {
      try {
         ++class81.field1142;
         ++field9846;
         class577 var1 = class218.method1888(class120.field1701, 121, class510.field7801.field361);
         if (arg0 == -19) {
            var1.field8531.method2849(class756.field11198, (byte)-34);
            class510.field7801.method211(var1, 125);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9861[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "<init>",
      descriptor = "(Lcka;Leh;Lpc;II)V"
   )
   public class659(class174 arg0, class19 arg1, class650 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);

      try {
         this.field9854 = arg3;
         this.field9857 = arg4;
         super.field7244.method2193(this, (byte)-19);
         OpenGL.glTexImage2Dub(super.field7248, 0, this.method3704(-8760), arg3, arg4, 0, class158.method1412(50, super.field7246), class511.method3971(super.field7239, (byte)116), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9861[5] + (arg0 != null ? field9861[0] : field9861[1]) + ',' + (arg1 != null ? field9861[0] : field9861[1]) + ',' + (arg2 != null ? field9861[0] : field9861[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(Ljava/lang/String;Lc;II)Lep;"
   )
   public static final class454 method4854(String arg0, class652 arg1, int arg2, int arg3) {
      try {
         ++field9849;
         if (arg2 > -2) {
            field9842 = null;
         }

         int var4 = OpenGL.glGenProgramARB();
         OpenGL.glBindProgramARB(arg3, var4);
         OpenGL.glProgramStringARB(arg3, 34933, arg0);
         OpenGL.glGetIntegerv(34379, class435.field6674, 0);
         if (class435.field6674[0] != -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
         } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class454(arg1, arg3, var4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9861[9] + (arg0 != null ? field9861[0] : field9861[1]) + ',' + (arg1 != null ? field9861[0] : field9861[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "<init>",
      descriptor = "(Lcka;IIZ[III)V"
   )
   public class659(class174 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class364.field5628, class650.field9371, arg1 * arg2, arg3);

      try {
         this.field9857 = arg2;
         this.field9854 = arg1;
         super.field7244.method2193(this, (byte)-19);
         if (arg3 && ~arg6 == -1 && ~arg5 == -1) {
            this.method3706(arg1, super.field7248, 20110, arg2, arg4);
         } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field7248, 0, 6408, this.field9854, this.field9857, 0, 32993, super.field7244.field2736, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9861[5] + (arg0 != null ? field9861[0] : field9861[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9861[0] : field9861[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(FB)F"
   )
   public final float method2359(float arg0, byte arg1) {
      try {
         if (arg1 != 32) {
            this.method2355(-114);
         }

         ++field9858;
         return arg0 / (float)this.field9854;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9861[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2361(int arg0) {
      try {
         ++field9860;
         return arg0 != -19616 ? 6 : this.field9857;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9861[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4855(int arg0, int arg1, int arg2) {
      class190 var3 = class711.field10694[arg0][arg1][arg2];
      if (var3 != null) {
         class592.method4409(var3.field2960);
         class592.method4409(var3.field2955);
         if (var3.field2960 != null) {
            var3.field2960 = null;
         }

         if (var3.field2955 != null) {
            var3.field2955 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!st",
      name = "<init>",
      descriptor = "(Lcka;Leh;IIZ[BII)V"
   )
   public class659(class174 arg0, class19 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class650.field9371, arg2 * arg3, arg4);

      try {
         label39: {
            this.field9857 = arg3;
            this.field9854 = arg2;
            super.field7244.method2193(this, (byte)-19);
            OpenGL.glPixelStorei(3317, 1);
            if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
               this.method3705(arg5, arg3, (byte)52, arg2, super.field7248);
               if (!client.field1786) {
                  break label39;
               }
            }

            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field7248, 0, this.method3704(-8760), arg2, arg3, 0, class158.method1412(50, super.field7246), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9861[5] + (arg0 != null ? field9861[0] : field9861[1]) + ',' + (arg1 != null ? field9861[0] : field9861[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9861[0] : field9861[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method4856(byte arg0) {
      try {
         int var1 = 15 / ((arg0 - 76) / 36);
         field9845 = null;
         field9847 = null;
         field9842 = null;
         field9850 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9861[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2362(byte arg0) {
      try {
         ++field9855;
         if (arg0 < 40) {
            field9845 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9861[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(IIIILeh;[FIIB)V"
   )
   public final void method4857(int arg0, int arg1, int arg2, int arg3, class19 arg4, float[] arg5, int arg6, int arg7, byte arg8) {
      try {
         super.field7244.method2193(this, (byte)-19);
         ++field9844;
         OpenGL.glPixelStorei(3314, arg0);
         OpenGL.glTexSubImage2Df(super.field7248, 0, arg2, arg6, arg3, arg7, class158.method1412(50, arg4), 5121, arg5, arg1);
         if (arg8 != -31) {
            field9847 = null;
         }

         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field9861[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9861[0] : field9861[1]) + ',' + (arg5 != null ? field9861[0] : field9861[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method2358(int arg0, boolean arg1, boolean arg2) {
      try {
         super.field7244.method2193(this, (byte)-19);
         ++field9848;
         OpenGL.glTexParameteri(super.field7248, 10242, arg1 ? 10497 : 33071);
         if (arg0 == -3545) {
            OpenGL.glTexParameteri(super.field7248, 10243, !arg2 ? 33071 : 10497);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9861[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4858(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4859(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
