import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class324 extends class486 implements class610 {
   @OriginalMember(
      owner = "client!bv",
      name = "I",
      descriptor = "I"
   )
   private int field4323;
   @OriginalMember(
      owner = "client!bv",
      name = "D",
      descriptor = "I"
   )
   private int field4328;
   @OriginalMember(
      owner = "client!bv",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4335 = new String[]{method2444(method2443("ChMRA")), method2444(method2443("Ok\u000f|")), method2444(method2443("Z0M>\u0014")), method2444(method2443("ChMTA")), method2444(method2443("ChM\\A")), method2444(method2443("ChMVA")), method2444(method2443("ChMQA")), method2444(method2443("ChM,\u0000Ow\u0017.A")), method2444(method2443("ChMUA")), method2444(method2443("ChMYA")), method2444(method2443("ChM[A")), method2444(method2443("ChMZA")), method2444(method2443("ChMWA")), method2444(method2443("ChMSA")), method2444(method2443("ChMXA"))};
   @OriginalMember(
      owner = "client!bv",
      name = "A",
      descriptor = "I"
   )
   public static int field4321;
   @OriginalMember(
      owner = "client!bv",
      name = "H",
      descriptor = "I"
   )
   public static int field4322;
   @OriginalMember(
      owner = "client!bv",
      name = "L",
      descriptor = "I"
   )
   public static int field4324;
   @OriginalMember(
      owner = "client!bv",
      name = "E",
      descriptor = "I"
   )
   public static int field4325;
   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "I"
   )
   public static int field4326;
   @OriginalMember(
      owner = "client!bv",
      name = "G",
      descriptor = "I"
   )
   public static int field4327;
   @OriginalMember(
      owner = "client!bv",
      name = "C",
      descriptor = "I"
   )
   public static int field4329;
   @OriginalMember(
      owner = "client!bv",
      name = "F",
      descriptor = "I"
   )
   public static int field4330;
   @OriginalMember(
      owner = "client!bv",
      name = "B",
      descriptor = "I"
   )
   public static int field4331;
   @OriginalMember(
      owner = "client!bv",
      name = "K",
      descriptor = "I"
   )
   public static int field4332;
   @OriginalMember(
      owner = "client!bv",
      name = "J",
      descriptor = "I"
   )
   public static int field4333;
   @OriginalMember(
      owner = "client!bv",
      name = "y",
      descriptor = "I"
   )
   public static int field4334;

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method2440(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method44(byte arg0) {
      try {
         ++field4327;
         if (arg0 != 64) {
            this.field4328 = 84;
         }

         return this.field4323;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4335[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(II[BLtga;IIZII)V"
   )
   public final void method38(int arg0, int arg1, byte[] arg2, class63 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
      try {
         if (arg7 == 0) {
            arg7 = arg8;
         }

         ++field4325;
         super.field6694.method2581(this, 122);
         OpenGL.glPixelStorei(3317, 1);
         if (~arg7 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg7);
         }

         OpenGL.glTexSubImage2Dub(super.field6681, 0, arg0, arg5, arg8, arg4, class133.method1124(arg3, 217), 5121, arg2, arg1);
         if (~arg7 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
         if (!arg6) {
            this.field4328 = -7;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4335[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4335[2] : field4335[1]) + ',' + (arg3 != null ? field4335[2] : field4335[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "<init>",
      descriptor = "(Lkfa;Ltga;II[BII)V"
   )
   public class324(class632 arg0, class63 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class335.field4803, arg2 * arg3, false);

      try {
         this.field4323 = arg2;
         this.field4328 = arg3;
         super.field6694.method2581(this, -123);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Dub(super.field6681, 0, this.method3537((byte)-56), arg2, arg3, 0, class133.method1124(super.field6695, 217), 5121, arg4, arg5);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4335[7] + (arg0 != null ? field4335[2] : field4335[1]) + ',' + (arg1 != null ? field4335[2] : field4335[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4335[2] : field4335[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(JZIJLjava/lang/String;ILjava/lang/String;IIZIZI)V"
   )
   public static final void method2441(long arg0, boolean arg1, int arg2, long arg3, String arg4, int arg5, String arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11, int arg12) {
      try {
         ++field4329;
         if (!class666.field9473 && ~class234.field2899 > -501) {
            int var18 = arg12 != -1 ? arg12 : class325.field4354;
            class241 var15 = new class241(arg6, arg4, var18, arg10, arg7, arg0, arg5, arg8, arg9, arg1, arg3, arg11);
            class749.method5414(26066, var15);
            if (arg2 > 119) {
               ;
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field4335[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4335[2] : field4335[1]) + ',' + arg5 + ',' + (arg6 != null ? field4335[2] : field4335[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(BF)F"
   )
   public final float method42(byte arg0, float arg1) {
      try {
         ++field4333;
         return arg0 != 15 ? 1.1468734F : arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4335[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method36(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg0 != 10251) {
            this.field4323 = -9;
         }

         ++field4334;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4335[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method45(int arg0) {
      try {
         ++field4331;
         return arg0 != -23234;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4335[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method39(int arg0) {
      try {
         if (arg0 >= -14) {
            this.field4328 = -71;
         }

         ++field4322;
         return this.field4328;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4335[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "<init>",
      descriptor = "(Lkfa;Ltga;II[FII)V"
   )
   public class324(class632 arg0, class63 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class335.field4807, arg2 * arg3, false);

      try {
         this.field4328 = arg3;
         this.field4323 = arg2;
         super.field6694.method2581(this, 106);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Df(super.field6681, 0, this.method3537((byte)-66), arg2, arg3, 0, class133.method1124(super.field6695, 217), 5126, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4335[7] + (arg0 != null ? field4335[2] : field4335[1]) + ',' + (arg1 != null ? field4335[2] : field4335[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4335[2] : field4335[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "<init>",
      descriptor = "(Lkfa;II[III)V"
   )
   public class324(class632 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class622.field8682, class335.field4803, arg1 * arg2, false);

      try {
         this.field4328 = arg2;
         this.field4323 = arg1;
         super.field6694.method2581(this, -45);
         OpenGL.glPixelStorei(3314, arg5);
         OpenGL.glTexImage2Di(super.field6681, 0, 6408, this.field4323, this.field4328, 0, 32993, super.field6694.field8941, arg3, arg4 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4335[7] + (arg0 != null ? field4335[2] : field4335[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4335[2] : field4335[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(Ljava/lang/Object;IZ)[B"
   )
   public static final byte[] method2442(Object arg0, int arg1, boolean arg2) {
      try {
         ++field4330;
         if (arg0 == null) {
            return null;
         } else {
            int var3 = -26 / ((arg1 - 58) / 59);
            if (arg0 instanceof byte[]) {
               byte[] var4 = (byte[])arg0;
               return !arg2 ? var4 : class170.method1330((byte)-108, var4);
            } else if (arg0 instanceof class205) {
               class205 var5 = (class205)arg0;
               return var5.method1548(1);
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4335[14] + (arg0 != null ? field4335[2] : field4335[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(IIIII[III)V"
   )
   public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
      try {
         super.field6694.method2581(this, 108);
         ++field4324;
         if (~arg6 == -1) {
            arg6 = arg1;
         }

         if (~arg1 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg6);
         }

         if (arg7 != -16856) {
            this.field4323 = -114;
         }

         OpenGL.glTexSubImage2Di(super.field6681, 0, arg3, arg4, arg1, arg2, 32993, super.field6694.field8941, arg5, arg0);
         if (~arg1 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4335[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4335[2] : field4335[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(III[IIII)V"
   )
   public final void method46(int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method37(float arg0, int arg1) {
      try {
         if (arg1 >= -29) {
            this.method35(26, 49, -31, -70, 64, (int[])null, 43, -57);
         }

         ++field4332;
         return arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4335[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "<init>",
      descriptor = "(Lkfa;Ltga;Liw;II)V"
   )
   public class324(class632 arg0, class63 arg1, class335 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);

      try {
         this.field4328 = arg4;
         this.field4323 = arg3;
         super.field6694.method2581(this, -111);
         OpenGL.glTexImage2Dub(super.field6681, 0, this.method3537((byte)-82), arg3, arg4, 0, class133.method1124(super.field6695, 217), class317.method2377(super.field6698, (byte)-80), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4335[7] + (arg0 != null ? field4335[2] : field4335[1]) + ',' + (arg1 != null ? field4335[2] : field4335[1]) + ',' + (arg2 != null ? field4335[2] : field4335[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2443(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2444(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
