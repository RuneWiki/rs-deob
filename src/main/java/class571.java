import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class571 extends class476 implements class282 {
   @OriginalMember(
      owner = "client!pw",
      name = "R",
      descriptor = "I"
   )
   private int field8455;
   @OriginalMember(
      owner = "client!pw",
      name = "P",
      descriptor = "I"
   )
   private int field8446;
   @OriginalMember(
      owner = "client!pw",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8462 = new String[]{method4299(method4298("p\tz!")), method4299(method4298("n\u000b8qkp\u0015bs*")), method4299(method4298("eR8c\u007f")), method4299(method4298("n\u000b8\u0002*")), method4299(method4298("n\u000b8\u0005*")), method4299(method4298("n\u000b8\t*")), method4299(method4298("n\u000b8\n*")), method4299(method4298("n\u000b8\u0000*")), method4299(method4298("n\u000b8\u000f*")), method4299(method4298("n\u000b8\u000b*")), method4299(method4298("n\u000b8\u001d*")), method4299(method4298("n\u000b8\b*")), method4299(method4298("n\u000b8\u0006*")), method4299(method4298("n\u000b8\u0003*")), method4299(method4298("n\u000b8\u0007*")), method4299(method4298("n\u000b8\u0004*")), method4299(method4298("n\u000b8\u0001*"))};
   @OriginalMember(
      owner = "client!pw",
      name = "y",
      descriptor = "Luk;"
   )
   public static class498 field8449 = new class498(61, 3);
   @OriginalMember(
      owner = "client!pw",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field8457 = new int[256];
   @OriginalMember(
      owner = "client!pw",
      name = "x",
      descriptor = "I"
   )
   public static int field8452 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "G",
      descriptor = "I"
   )
   public static int field8459 = 1;
   @OriginalMember(
      owner = "client!pw",
      name = "A",
      descriptor = "[[F"
   )
   public static float[][] field8453 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   @OriginalMember(
      owner = "client!pw",
      name = "F",
      descriptor = "Luk;"
   )
   public static class498 field8460 = new class498(109, -2);
   @OriginalMember(
      owner = "client!pw",
      name = "K",
      descriptor = "I"
   )
   public static int field8461 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "I",
      descriptor = "I"
   )
   public static int field8440;
   @OriginalMember(
      owner = "client!pw",
      name = "Q",
      descriptor = "I"
   )
   public static int field8441;
   @OriginalMember(
      owner = "client!pw",
      name = "w",
      descriptor = "I"
   )
   public static int field8442;
   @OriginalMember(
      owner = "client!pw",
      name = "H",
      descriptor = "I"
   )
   public static int field8443;
   @OriginalMember(
      owner = "client!pw",
      name = "E",
      descriptor = "I"
   )
   public static int field8444;
   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "I"
   )
   public static int field8445;
   @OriginalMember(
      owner = "client!pw",
      name = "B",
      descriptor = "I"
   )
   public static int field8447;
   @OriginalMember(
      owner = "client!pw",
      name = "J",
      descriptor = "I"
   )
   public static int field8448;
   @OriginalMember(
      owner = "client!pw",
      name = "O",
      descriptor = "I"
   )
   public static int field8450;
   @OriginalMember(
      owner = "client!pw",
      name = "N",
      descriptor = "I"
   )
   public static int field8451;
   @OriginalMember(
      owner = "client!pw",
      name = "L",
      descriptor = "I"
   )
   public static int field8454;
   @OriginalMember(
      owner = "client!pw",
      name = "D",
      descriptor = "I"
   )
   public static int field8456;
   @OriginalMember(
      owner = "client!pw",
      name = "C",
      descriptor = "I"
   )
   public static int field8458;

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4293(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8444;
         int var6 = arg0 & arg2;
         if (var6 == 0) {
            return arg1;
         } else if (~var6 == -2) {
            return -arg3 + 4095;
         } else {
            return var6 == 2 ? -arg1 + 4095 : arg3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8462[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(BLica;)Lhj;"
   )
   public static final class598 method4294(byte arg0, class354 arg1) {
      try {
         ++field8440;
         class603 var2 = class429.method3392(69, arg1);
         int var3 = arg1.method2848(-99);
         int var4 = arg1.method2848(-120);
         int var5 = arg1.method2848(-100);
         int var6 = arg1.method2848(arg0 ^ -3);
         if (arg0 != 111) {
            method4295(106, true, 28);
         }

         int var7 = arg1.method2848(-127);
         int var8 = arg1.method2848(arg0 + -216);
         return new class598(var2.field8810, var2.field8815, var2.field8819, var2.field8823, var2.field8820, var2.field8811, var2.field8818, var2.field8822, var2.field8814, var3, var4, var5, var6, var7, var8);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8462[3] + arg0 + ',' + (arg1 != null ? field8462[2] : field8462[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IZI)V"
   )
   public static final void method4295(int arg0, boolean arg1, int arg2) {
      try {
         ++field8454;
         class503 var3 = class291.method2454(arg1, (byte)-26, arg0);
         if (var3 != null) {
            for(int var4 = arg2; var4 < var3.field7680.length; ++var4) {
               var3.field7680[var4] = -1;
               var3.field7681[var4] = 0;
            }

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8462[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Lcka;Leh;II[BII)V"
   )
   public class571(class174 arg0, class19 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class650.field9371, arg2 * arg3, false);

      try {
         this.field8455 = arg3;
         this.field8446 = arg2;
         super.field7244.method2193(this, (byte)-19);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Dub(super.field7248, 0, this.method3704(-8760), arg2, arg3, 0, class158.method1412(50, super.field7246), 5121, arg4, arg5);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8462[1] + (arg0 != null ? field8462[2] : field8462[0]) + ',' + (arg1 != null ? field8462[2] : field8462[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8462[2] : field8462[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(BIIIILeh;II[B)V"
   )
   public final void method2360(byte arg0, int arg1, int arg2, int arg3, int arg4, class19 arg5, int arg6, int arg7, byte[] arg8) {
      try {
         super.field7244.method2193(this, (byte)-19);
         ++field8443;
         if (arg0 >= -11) {
            field8460 = null;
         }

         if (~arg6 == -1) {
            arg6 = arg1;
         }

         OpenGL.glPixelStorei(3317, 1);
         if (~arg1 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg6);
         }

         OpenGL.glTexSubImage2Dub(super.field7248, 0, arg4, arg7, arg1, arg2, class158.method1412(50, arg5), 5121, arg8, arg3);
         if (~arg1 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field8462[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8462[2] : field8462[0]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field8462[2] : field8462[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(B[IIIIII)V"
   )
   public final void method2356(byte param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Lcka;Leh;II[FII)V"
   )
   public class571(class174 arg0, class19 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class650.field9375, arg2 * arg3, false);

      try {
         this.field8446 = arg2;
         this.field8455 = arg3;
         super.field7244.method2193(this, (byte)-19);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Df(super.field7248, 0, this.method3704(-8760), arg2, arg3, 0, class158.method1412(50, super.field7246), 5126, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8462[1] + (arg0 != null ? field8462[2] : field8462[0]) + ',' + (arg1 != null ? field8462[2] : field8462[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8462[2] : field8462[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2362(byte arg0) {
      try {
         ++field8448;
         return arg0 <= 40 ? false : false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8462[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Lcka;Leh;Lpc;II)V"
   )
   public class571(class174 arg0, class19 arg1, class650 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);

      try {
         this.field8455 = arg4;
         this.field8446 = arg3;
         super.field7244.method2193(this, (byte)-19);
         OpenGL.glTexImage2Dub(super.field7248, 0, this.method3704(-8760), arg3, arg4, 0, class158.method1412(50, super.field7246), class511.method3971(super.field7239, (byte)75), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8462[1] + (arg0 != null ? field8462[2] : field8462[0]) + ',' + (arg1 != null ? field8462[2] : field8462[0]) + ',' + (arg2 != null ? field8462[2] : field8462[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4296(int arg0) {
      try {
         field8457 = null;
         field8453 = null;
         int var1 = 33 % ((-65 - arg0) / 48);
         field8449 = null;
         field8460 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8462[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public static final byte[] method4297(int arg0, byte[] arg1) {
      try {
         if (arg0 > -16) {
            method4295(-74, false, 102);
         }

         ++field8451;
         int var2 = arg1.length;
         byte[] var3 = new byte[var2];
         class107.method1027(arg1, 0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8462[8] + arg0 + ',' + (arg1 != null ? field8462[2] : field8462[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IIIII[III)V"
   )
   public final void method2357(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
      try {
         if (arg1 == -24773) {
            if (arg6 == 0) {
               arg6 = arg4;
            }

            ++field8445;
            super.field7244.method2193(this, (byte)-19);
            if (arg4 != arg6) {
               OpenGL.glPixelStorei(3314, arg6);
            }

            OpenGL.glTexSubImage2Di(super.field7248, 0, arg2, arg0, arg4, arg3, 32993, super.field7244.field2736, arg5, arg7);
            if (~arg4 != ~arg6) {
               OpenGL.glPixelStorei(3314, 0);
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8462[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8462[2] : field8462[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(FB)F"
   )
   public final float method2359(float arg0, byte arg1) {
      try {
         ++field8456;
         return arg1 != 32 ? -0.8343237F : arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8462[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2355(int arg0) {
      try {
         ++field8447;
         return arg0 != 20759 ? -72 : this.field8446;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8462[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Lcka;II[III)V"
   )
   public class571(class174 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class364.field5628, class650.field9371, arg1 * arg2, false);

      try {
         this.field8446 = arg1;
         this.field8455 = arg2;
         super.field7244.method2193(this, (byte)-19);
         OpenGL.glPixelStorei(3314, arg5);
         OpenGL.glTexImage2Di(super.field7248, 0, 6408, this.field8446, this.field8455, 0, 32993, super.field7244.field2736, arg3, arg4 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8462[1] + (arg0 != null ? field8462[2] : field8462[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8462[2] : field8462[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IF)F"
   )
   public final float method2363(int arg0, float arg1) {
      try {
         ++field8442;
         if (arg0 >= -24) {
            field8459 = 88;
         }

         return arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8462[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method2358(int arg0, boolean arg1, boolean arg2) {
      try {
         ++field8450;
         if (arg0 != -3545) {
            method4295(67, false, 38);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8462[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2361(int arg0) {
      try {
         if (arg0 != -19616) {
            return -31;
         } else {
            ++field8441;
            return this.field8455;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8462[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
