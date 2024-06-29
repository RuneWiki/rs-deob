import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class769 extends class38 implements class706 {
   @OriginalMember(
      owner = "client!fl",
      name = "J",
      descriptor = "I"
   )
   private int field11203;
   @OriginalMember(
      owner = "client!fl",
      name = "C",
      descriptor = "I"
   )
   private int field11193;
   @OriginalMember(
      owner = "client!fl",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11207 = new String[]{method5567(method5566("I\u0010(k\u000f")), method5567(method5566("I\u0010(h\u000f")), method5567(method5566("A\tjB")), method5567(method5566("TR(\u0000Z")), method5567(method5566("I\u0010(d\u000f")), method5567(method5566("I\u0010(b\u000f")), method5567(method5566("I\u0010(j\u000f")), method5567(method5566("I\u0010(e\u000f")), method5567(method5566("I\u0010(\u0012NA\u0015r\u0010\u000f")), method5567(method5566("I\u0010(g\u000f")), method5567(method5566("I\u0010(f\u000f")), method5567(method5566("I\u0010(i\u000f")), method5567(method5566("I\u0010(c\u000f"))};
   @OriginalMember(
      owner = "client!fl",
      name = "E",
      descriptor = "Lgh;"
   )
   public static class572 field11204 = new class572(27, 2);
   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "Lgw;"
   )
   public static class179 field11205 = new class179(20);
   @OriginalMember(
      owner = "client!fl",
      name = "y",
      descriptor = "I"
   )
   public static int field11194;
   @OriginalMember(
      owner = "client!fl",
      name = "H",
      descriptor = "I"
   )
   public static int field11195;
   @OriginalMember(
      owner = "client!fl",
      name = "I",
      descriptor = "I"
   )
   public static int field11196;
   @OriginalMember(
      owner = "client!fl",
      name = "A",
      descriptor = "I"
   )
   public static int field11197;
   @OriginalMember(
      owner = "client!fl",
      name = "F",
      descriptor = "I"
   )
   public static int field11198;
   @OriginalMember(
      owner = "client!fl",
      name = "w",
      descriptor = "I"
   )
   public static int field11199;
   @OriginalMember(
      owner = "client!fl",
      name = "x",
      descriptor = "I"
   )
   public static int field11200;
   @OriginalMember(
      owner = "client!fl",
      name = "G",
      descriptor = "I"
   )
   public static int field11201;
   @OriginalMember(
      owner = "client!fl",
      name = "B",
      descriptor = "I"
   )
   public static int field11202;
   @OriginalMember(
      owner = "client!fl",
      name = "D",
      descriptor = "I"
   )
   public static int field11206;

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(III[IBII)V",
      line = 5
   )
   public final void method883(int param1, int param2, int param3, int[] param4, byte param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "(Lbba;Ltv;Lrfa;II)V",
      line = 29
   )
   public class769(class124 arg0, class584 arg1, class209 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);

      try {
         this.field11203 = arg4;
         this.field11193 = arg3;
         super.field922.method2806(false, this);
         OpenGL.glTexImage2Dub(super.field924, 0, this.method466((byte)118), arg3, arg4, 0, class583.method4325(super.field905, 6406), class458.method3444((byte)-108, super.field913), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field11207[8] + (arg0 != null ? field11207[3] : field11207[2]) + ',' + (arg1 != null ? field11207[3] : field11207[2]) + ',' + (arg2 != null ? field11207[3] : field11207[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(ZIZ)V",
      line = 41
   )
   public final void method884(boolean arg0, int arg1, boolean arg2) {
      try {
         int var4 = 122 % ((arg1 - 30) / 37);
         ++field11200;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11207[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(ILtv;IIIB[BII)V",
      line = 51
   )
   public final void method885(int arg0, class584 arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field11194;
         if (arg5 < 9) {
            this.field11193 = -110;
         }

         if (arg0 == 0) {
            arg0 = arg2;
         }

         super.field922.method2806(false, this);
         OpenGL.glPixelStorei(3317, 1);
         if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg0);
         }

         OpenGL.glTexSubImage2Dub(super.field924, 0, arg7, arg8, arg2, arg4, class583.method4325(arg1, 6406), 5121, arg6, arg3);
         if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field11207[12] + arg0 + ',' + (arg1 != null ? field11207[3] : field11207[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11207[3] : field11207[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(IF)F",
      line = 77
   )
   public final float method880(int arg0, float arg1) {
      try {
         ++field11199;
         if (arg0 != -10745) {
            field11204 = null;
         }

         return arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11207[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(FZ)F",
      line = 89
   )
   public final float method881(float arg0, boolean arg1) {
      try {
         if (arg1) {
            return -1.8767467F;
         } else {
            ++field11202;
            return arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11207[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(I)I",
      line = 100
   )
   public final int method889(int arg0) {
      try {
         ++field11195;
         return arg0 != 28570 ? 65 : this.field11193;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11207[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "f",
      descriptor = "(B)V",
      line = 111
   )
   public static void method5565(byte arg0) {
      try {
         if (arg0 >= -84) {
            field11198 = -25;
         }

         field11205 = null;
         field11204 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11207[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "b",
      descriptor = "(I)I",
      line = 124
   )
   public final int method886(int arg0) {
      try {
         ++field11201;
         if (arg0 != -19759) {
            this.field11193 = 59;
         }

         return this.field11203;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11207[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "(Lbba;II[III)V",
      line = 136
   )
   public class769(class124 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class296.field4146, class209.field3106, arg1 * arg2, false);

      try {
         this.field11203 = arg2;
         this.field11193 = arg1;
         super.field922.method2806(false, this);
         OpenGL.glPixelStorei(3314, arg5);
         OpenGL.glTexImage2Di(super.field924, 0, 6408, this.field11193, this.field11203, 0, 32993, super.field922.field2089, arg3, arg4 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field11207[8] + (arg0 != null ? field11207[3] : field11207[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11207[3] : field11207[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(Z)Z",
      line = 149
   )
   public final boolean method878(boolean arg0) {
      try {
         if (!arg0) {
            field11204 = null;
         }

         ++field11197;
         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11207[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(I[IIIIIZI)V",
      line = 160
   )
   public final void method887(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
      try {
         if (arg2 == 0) {
            arg2 = arg7;
         }

         ++field11196;
         super.field922.method2806(arg6, this);
         if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg2);
         }

         OpenGL.glTexSubImage2Di(super.field924, 0, arg3, arg0, arg7, arg4, 32993, super.field922.field2089, arg1, arg5);
         if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field11207[6] + arg0 + ',' + (arg1 != null ? field11207[3] : field11207[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "(Lbba;Ltv;II[FII)V",
      line = 184
   )
   public class769(class124 arg0, class584 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class209.field3110, arg2 * arg3, false);

      try {
         this.field11203 = arg3;
         this.field11193 = arg2;
         super.field922.method2806(false, this);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Df(super.field924, 0, this.method466((byte)118), arg2, arg3, 0, class583.method4325(super.field905, 6406), 5126, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field11207[8] + (arg0 != null ? field11207[3] : field11207[2]) + ',' + (arg1 != null ? field11207[3] : field11207[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11207[3] : field11207[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "(Lbba;Ltv;II[BII)V",
      line = 206
   )
   public class769(class124 arg0, class584 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class209.field3106, arg2 * arg3, false);

      try {
         this.field11203 = arg3;
         this.field11193 = arg2;
         super.field922.method2806(false, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Dub(super.field924, 0, this.method466((byte)118), arg2, arg3, 0, class583.method4325(super.field905, 6406), 5121, arg4, arg5);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field11207[8] + (arg0 != null ? field11207[3] : field11207[2]) + ',' + (arg1 != null ? field11207[3] : field11207[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11207[3] : field11207[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5566(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5567(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
