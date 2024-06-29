import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 extends class458 implements class272 {
   @OriginalMember(
      owner = "client!o",
      name = "J",
      descriptor = "I"
   )
   private int field440;
   @OriginalMember(
      owner = "client!o",
      name = "C",
      descriptor = "I"
   )
   private int field438;
   @OriginalMember(
      owner = "client!o",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field454 = new String[]{method285(method284("ZIy\u0010")), method285(method284("O\u0012;R\u0007")), method285(method284("[\u0012T=R")), method285(method284("[\u0012)\u0015\u0014]H+T")), method285(method284("[\u0012WT")), method285(method284("[\u0012@T")), method285(method284("[\u0012FT")), method285(method284("[\u0012AT")), method285(method284("[\u0012DT")), method285(method284("[\u0012CT")), method285(method284("[\u0012BT")), method285(method284("[\u0012VT")), method285(method284("[\u0012TT")), method285(method284("[\u0012GT")), method285(method284("[\u0012QT"))};
   @OriginalMember(
      owner = "client!o",
      name = "w",
      descriptor = "Lbl;"
   )
   public static class678 field445 = null;
   @OriginalMember(
      owner = "client!o",
      name = "E",
      descriptor = "I"
   )
   public static int field439;
   @OriginalMember(
      owner = "client!o",
      name = "H",
      descriptor = "I"
   )
   public static int field441;
   @OriginalMember(
      owner = "client!o",
      name = "K",
      descriptor = "I"
   )
   public static int field442;
   @OriginalMember(
      owner = "client!o",
      name = "L",
      descriptor = "I"
   )
   public static int field444;
   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "I"
   )
   public static int field446;
   @OriginalMember(
      owner = "client!o",
      name = "F",
      descriptor = "I"
   )
   public static int field447;
   @OriginalMember(
      owner = "client!o",
      name = "B",
      descriptor = "I"
   )
   public static int field448;
   @OriginalMember(
      owner = "client!o",
      name = "I",
      descriptor = "I"
   )
   public static int field449;
   @OriginalMember(
      owner = "client!o",
      name = "y",
      descriptor = "I"
   )
   public static int field450;
   @OriginalMember(
      owner = "client!o",
      name = "A",
      descriptor = "I"
   )
   public static int field451;
   @OriginalMember(
      owner = "client!o",
      name = "x",
      descriptor = "I"
   )
   public static int field452;
   @OriginalMember(
      owner = "client!o",
      name = "v",
      descriptor = "I"
   )
   public static int field453;
   @OriginalMember(
      owner = "client!o",
      name = "D",
      descriptor = "J"
   )
   public static long field443;

   @OriginalMember(
      owner = "client!o",
      name = "<init>",
      descriptor = "(Lwi;Lak;Lria;II)V",
      line = 3
   )
   public class31(class494 arg0, class371 arg1, class301 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);

      try {
         this.field440 = arg4;
         this.field438 = arg3;
         super.field6592.method2804(this, -2);
         OpenGL.glTexImage2Dub(super.field6589, 0, this.method3345((byte)-29), arg3, arg4, 0, class270.method2074(super.field6582, 21), class311.method2300(16756, super.field6590), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field454[3] + (arg0 != null ? field454[1] : field454[0]) + ',' + (arg1 != null ? field454[1] : field454[0]) + ',' + (arg2 != null ? field454[1] : field454[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(B)I",
      line = 14
   )
   public final int method272(byte arg0) {
      try {
         if (arg0 != -13) {
            return -97;
         } else {
            ++field448;
            return this.field440;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field454[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IIIIIILak;I[F)V",
      line = 25
   )
   public final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class371 arg6, int arg7, float[] arg8) {
      try {
         if (arg5 == -2072) {
            ++field442;
            super.field6592.method2804(this, -2);
            OpenGL.glPixelStorei(3314, arg0);
            OpenGL.glTexSubImage2Df(super.field6589, 0, arg2, arg3, arg7, arg4, class270.method2074(arg6, 21), 5121, arg8, arg1);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field454[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field454[1] : field454[0]) + ',' + arg7 + ',' + (arg8 != null ? field454[1] : field454[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IF)F",
      line = 39
   )
   public final float method274(int arg0, float arg1) {
      try {
         if (arg0 != 11535) {
            return -0.38459513F;
         } else {
            ++field449;
            return arg1 / (float)this.field440;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field454[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "([IIIIBII)V",
      line = 50
   )
   public final void method275(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field444;
         int[] var9 = new int[this.field440 * this.field438];
         super.field6592.method2804(this, -2);
         OpenGL.glGetTexImagei(super.field6589, 0, 32993, 5121, var9, 0);
         int var10 = 0;
         if (var8) {
            class242.method1853(var9, (-var10 + arg1 - (1 - arg3)) * this.field438, arg0, arg5 * var10 + arg2, arg5);
            ++var10;
         }

         while(true) {
            while(~var10 > ~arg1) {
               class242.method1853(var9, (-var10 + arg1 - (1 - arg3)) * this.field438, arg0, arg5 * var10 + arg2, arg5);
               ++var10;
            }

            if (!var8) {
               if (arg4 != -96) {
                  this.field438 = -23;
                  return;
               }

               return;
            }

            ++var10;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field454[5] + (arg0 != null ? field454[1] : field454[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IILak;III[BII)V",
      line = 75
   )
   public final void method276(int arg0, int arg1, class371 arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         if (arg3 == -8262) {
            ++field451;
            super.field6592.method2804(this, -2);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg1);
            OpenGL.glTexSubImage2Dub(super.field6589, 0, arg8, arg4, arg7, arg0, class270.method2074(arg2, 21), 5121, arg6, arg5);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field454[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field454[1] : field454[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field454[1] : field454[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "<init>",
      descriptor = "(Lwi;Lak;IIZ[FII)V",
      line = 91
   )
   public class31(class494 arg0, class371 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class301.field4121, arg2 * arg3, arg4);

      try {
         this.field438 = arg2;
         this.field440 = arg3;
         super.field6592.method2804(this, -2);
         if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3342(arg3, super.field6589, arg5, 100, arg2);
         } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field6589, 0, this.method3345((byte)-29), arg2, arg3, 0, class270.method2074(super.field6582, 21), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field454[3] + (arg0 != null ? field454[1] : field454[0]) + ',' + (arg1 != null ? field454[1] : field454[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field454[1] : field454[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "<init>",
      descriptor = "(Lwi;IIZ[III)V",
      line = 113
   )
   public class31(class494 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class424.field6036, class301.field4117, arg1 * arg2, arg3);

      try {
         this.field438 = arg1;
         this.field440 = arg2;
         super.field6592.method2804(this, -2);
         if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method3344(arg1, arg2, super.field6589, arg4, 1);
         } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field6589, 0, 6408, this.field438, this.field440, 0, 32993, super.field6592.field7163, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field454[3] + (arg0 != null ? field454[1] : field454[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field454[1] : field454[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(ZZZ)V",
      line = 132
   )
   public final void method277(boolean arg0, boolean arg1, boolean arg2) {
      try {
         ++field453;
         super.field6592.method2804(this, -2);
         OpenGL.glTexParameteri(super.field6589, 10242, !arg2 ? 33071 : 10497);
         if (!arg0) {
            this.method279(true);
         }

         OpenGL.glTexParameteri(super.field6589, 10243, !arg1 ? 33071 : 10497);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field454[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "<init>",
      descriptor = "(Lwi;Lak;IIZ[BII)V",
      line = 145
   )
   public class31(class494 arg0, class371 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class301.field4117, arg2 * arg3, arg4);

      try {
         label53: {
            this.field438 = arg2;
            this.field440 = arg3;
            super.field6592.method2804(this, -2);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg4 || arg7 != 0 || arg6 != 0) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Dub(super.field6589, 0, this.method3345((byte)-29), arg2, arg3, 0, class270.method2074(super.field6582, 21), 5121, arg5, arg6);
               OpenGL.glPixelStorei(3314, 0);
               if (!client.field4360) {
                  break label53;
               }
            }

            this.method3339(arg5, super.field6589, arg3, arg2, 119);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field454[3] + (arg0 != null ? field454[1] : field454[0]) + ',' + (arg1 != null ? field454[1] : field454[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field454[1] : field454[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IILkf;I)Lru;",
      line = 166
   )
   public static final class206 method278(int arg0, int arg1, class266 arg2, int arg3) {
      try {
         ++field446;
         byte[] var4 = arg2.method2037(false, arg3, arg0);
         if (arg1 != 2780) {
            method280(64);
         }

         return var4 == null ? null : new class206(var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field454[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field454[1] : field454[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(Z)Z",
      line = 185
   )
   public final boolean method279(boolean arg0) {
      try {
         if (!arg0) {
            this.method283(false);
         }

         ++field450;
         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field454[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "c",
      descriptor = "(I)V",
      line = 197
   )
   public static void method280(int arg0) {
      try {
         if (arg0 != 0) {
            method280(-69);
         }

         field445 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field454[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(B[IIIIIII)V",
      line = 207
   )
   public final void method281(byte arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field441;
         super.field6592.method2804(this, -2);
         OpenGL.glPixelStorei(3314, arg7);
         OpenGL.glTexSubImage2Di(super.field6589, 0, arg2, arg5, arg6, arg3, 32993, super.field6592.field7163, arg1, arg4);
         OpenGL.glPixelStorei(3314, 0);
         if (arg0 != -2) {
            this.method279(true);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field454[12] + arg0 + ',' + (arg1 != null ? field454[1] : field454[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(FB)F",
      line = 224
   )
   public final float method282(float arg0, byte arg1) {
      try {
         if (arg1 != 26) {
            return -0.70879567F;
         } else {
            ++field439;
            return arg0 / (float)this.field438;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field454[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "(Z)I",
      line = 238
   )
   public final int method283(boolean arg0) {
      try {
         if (!arg0) {
            field445 = null;
         }

         ++field447;
         return this.field438;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field454[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method284(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method285(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
