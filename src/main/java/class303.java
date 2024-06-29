import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class303 extends class364 implements class177 {
   @OriginalMember(
      owner = "client!vi",
      name = "C",
      descriptor = "I"
   )
   private int field4236;
   @OriginalMember(
      owner = "client!vi",
      name = "y",
      descriptor = "I"
   )
   private int field4243;
   @OriginalMember(
      owner = "client!vi",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4248 = new String[]{method2435(method2434("G\u001c\u0006R=")), method2435(method2434("_\u0000Dj")), method2435(method2434("J[\u0006(h")), method2435(method2434("G\u001c\u0006D=")), method2435(method2434("G\u001c\u0006W=")), method2435(method2434("G\u001c\u0006S=")), method2435(method2434("G\u001c\u0006Q=")), method2435(method2434("G\u001c\u0006:|_\u001c\\8=")), method2435(method2434("G\u001c\u0006V=")), method2435(method2434("G\u001c\u0006T=")), method2435(method2434("G\u001c\u0006I=")), method2435(method2434("G\u001c\u0006GT\u0019")), method2435(method2434("G\u001c\u0006P=")), method2435(method2434("G\u001c\u0006U="))};
   @OriginalMember(
      owner = "client!vi",
      name = "A",
      descriptor = "I"
   )
   public static int field4235;
   @OriginalMember(
      owner = "client!vi",
      name = "D",
      descriptor = "I"
   )
   public static int field4237;
   @OriginalMember(
      owner = "client!vi",
      name = "w",
      descriptor = "I"
   )
   public static int field4238;
   @OriginalMember(
      owner = "client!vi",
      name = "I",
      descriptor = "I"
   )
   public static int field4239;
   @OriginalMember(
      owner = "client!vi",
      name = "G",
      descriptor = "I"
   )
   public static int field4241;
   @OriginalMember(
      owner = "client!vi",
      name = "B",
      descriptor = "I"
   )
   public static int field4242;
   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "I"
   )
   public static int field4244;
   @OriginalMember(
      owner = "client!vi",
      name = "E",
      descriptor = "I"
   )
   public static int field4245;
   @OriginalMember(
      owner = "client!vi",
      name = "x",
      descriptor = "I"
   )
   public static int field4246;
   @OriginalMember(
      owner = "client!vi",
      name = "H",
      descriptor = "I"
   )
   public static int field4247;
   @OriginalMember(
      owner = "client!vi",
      name = "F",
      descriptor = "Lwf;"
   )
   public static class541 field4240;

   @OriginalMember(
      owner = "client!vi",
      name = "<init>",
      descriptor = "(Llea;IIZ[III)V"
   )
   public class303(class574 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class606.field8967, class576.field8541, arg1 * arg2, arg3);

      try {
         this.field4236 = arg1;
         this.field4243 = arg2;
         super.field5058.method2265(this, (byte)-12);
         if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method2872(super.field5055, arg2, -120, arg4, arg1);
         } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field5055, 0, 6408, this.field4236, this.field4243, 0, 32993, super.field5058.field8524, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4248[7] + (arg0 != null ? field4248[2] : field4248[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4248[2] : field4248[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "<init>",
      descriptor = "(Llea;Ldja;IIZ[BII)V"
   )
   public class303(class574 arg0, class45 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class576.field8541, arg2 * arg3, arg4);

      try {
         label53: {
            this.field4236 = arg2;
            this.field4243 = arg3;
            super.field5058.method2265(this, (byte)-47);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg4 || arg7 != 0 || ~arg6 != -1) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Dub(super.field5055, 0, this.method2866(false), arg2, arg3, 0, class615.method4531(95, super.field5056), 5121, arg5, arg6);
               OpenGL.glPixelStorei(3314, 0);
               if (!client.field1481) {
                  break label53;
               }
            }

            this.method2865(super.field5055, arg2, arg5, 1, arg3);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field4248[7] + (arg0 != null ? field4248[2] : field4248[1]) + ',' + (arg1 != null ? field4248[2] : field4248[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4248[2] : field4248[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "<init>",
      descriptor = "(Llea;Ldja;IIZ[FII)V"
   )
   public class303(class574 arg0, class45 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class576.field8545, arg2 * arg3, arg4);

      try {
         this.field4243 = arg3;
         this.field4236 = arg2;
         super.field5058.method2265(this, (byte)-112);
         if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method2874(super.field5055, 0, arg2, arg5, arg3);
         } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field5055, 0, this.method2866(false), arg2, arg3, 0, class615.method4531(-41, super.field5056), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field4248[7] + (arg0 != null ? field4248[2] : field4248[1]) + ',' + (arg1 != null ? field4248[2] : field4248[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4248[2] : field4248[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(IF)F"
   )
   public final float method1510(int arg0, float arg1) {
      try {
         ++field4238;
         int var3 = -68 / ((5 - arg0) / 36);
         return arg1 / (float)this.field4243;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4248[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(IBILdja;III[FI)V"
   )
   public final void method2432(int arg0, byte arg1, int arg2, class45 arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8) {
      try {
         super.field5058.method2265(this, (byte)71);
         if (arg1 < -102) {
            ++field4247;
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexSubImage2Df(super.field5055, 0, arg2, arg4, arg8, arg5, class615.method4531(-121, arg3), 5121, arg7, arg0);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field4248[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4248[2] : field4248[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4248[2] : field4248[1]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(III[BLdja;IIII)V"
   )
   public final void method1515(int arg0, int arg1, int arg2, byte[] arg3, class45 arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg8 > -74) {
            this.field4236 = 10;
         }

         ++field4246;
         super.field5058.method2265(this, (byte)-24);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg7);
         OpenGL.glTexSubImage2Dub(super.field5055, 0, arg6, arg1, arg5, arg2, class615.method4531(-44, arg4), 5121, arg3, arg0);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field4248[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4248[2] : field4248[1]) + ',' + (arg4 != null ? field4248[2] : field4248[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(BF)F"
   )
   public final float method1514(byte arg0, float arg1) {
      try {
         if (arg0 < 28) {
            field4240 = null;
         }

         ++field4239;
         return arg1 / (float)this.field4236;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4248[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1517(int arg0) {
      try {
         if (arg0 != 20668) {
            this.method1517(-98);
         }

         ++field4245;
         return true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4248[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(I[IIIIIII)V"
   )
   public final void method1512(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         super.field5058.method2265(this, (byte)-65);
         ++field4242;
         OpenGL.glPixelStorei(3314, arg0);
         OpenGL.glTexSubImage2Di(super.field5055, 0, arg7, arg6, arg2, arg5, 32993, super.field5058.field8524, arg1, arg3);
         if (arg4 == -29005) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field4248[4] + arg0 + ',' + (arg1 != null ? field4248[2] : field4248[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(ZZI)V"
   )
   public final void method1516(boolean arg0, boolean arg1, int arg2) {
      try {
         super.field5058.method2265(this, (byte)-100);
         ++field4235;
         if (arg2 == 13852) {
            OpenGL.glTexParameteri(super.field5055, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field5055, 10243, arg0 ? 10497 : 33071);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4248[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1513(byte arg0) {
      try {
         ++field4244;
         if (arg0 != -115) {
            method2433((byte)43);
         }

         return this.field4243;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4248[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "<init>",
      descriptor = "(Llea;Ldja;Lwn;II)V"
   )
   public class303(class574 arg0, class45 arg1, class576 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);

      try {
         this.field4243 = arg4;
         this.field4236 = arg3;
         super.field5058.method2265(this, (byte)-117);
         OpenGL.glTexImage2Dub(super.field5055, 0, this.method2866(false), arg3, arg4, 0, class615.method4531(-77, super.field5056), class624.method4617(super.field5053, false), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4248[7] + (arg0 != null ? field4248[2] : field4248[1]) + ',' + (arg1 != null ? field4248[2] : field4248[1]) + ',' + (arg2 != null ? field4248[2] : field4248[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1511(int arg0) {
      try {
         ++field4241;
         if (arg0 != 23351) {
            this.method1512(-9, (int[])null, 28, 79, 58, 79, 106, 71);
         }

         return this.field4236;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4248[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method2433(byte arg0) {
      try {
         int var1 = -6 % ((arg0 - -27) / 33);
         field4240 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4248[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   public final void method1509(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         ++field4237;
         int[] var9 = new int[this.field4243 * this.field4236];
         super.field5058.method2265(this, (byte)-43);
         OpenGL.glGetTexImagei(super.field5055, 0, 32993, 5121, var9, 0);
         int var10 = 0;
         if (var8) {
            class349.method2759(var9, (-1 - var10 + arg0 + arg6) * this.field4236, arg4, arg3 * var10 + arg5, arg3);
            ++var10;
         }

         while(true) {
            while(~var10 > ~arg0) {
               class349.method2759(var9, (-1 - var10 + arg0 + arg6) * this.field4236, arg4, arg3 * var10 + arg5, arg3);
               ++var10;
            }

            if (!var8) {
               if (arg2 != 3971) {
                  this.method1513((byte)-65);
                  return;
               }

               return;
            }

            ++var10;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field4248[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4248[2] : field4248[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2434(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2435(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
