import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class703 extends class479 implements class95 {
   @OriginalMember(
      owner = "client!lt",
      name = "F",
      descriptor = "I"
   )
   private int field10538;
   @OriginalMember(
      owner = "client!lt",
      name = "G",
      descriptor = "I"
   )
   private int field10539;
   @OriginalMember(
      owner = "client!lt",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10543 = new String[]{method5119(method5118("`z~k\u0001")), method5119(method5118("b{<A")), method5119(method5118("w ~\u0003T")), method5119(method5118("`z~\u0011@bg$\u0013\u0001")), method5119(method5118("`z~e\u0001")), method5119(method5118("`z~`\u0001")), method5119(method5118("`z~g\u0001")), method5119(method5118("`z~i\u0001")), method5119(method5118("`z~o\u0001")), method5119(method5118("`z~d\u0001")), method5119(method5118("`z~h\u0001")), method5119(method5118("`z~n\u0001")), method5119(method5118("`z~j\u0001")), method5119(method5118("`z~l\u0001"))};
   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "Lsd;"
   )
   public static class101 field10530 = new class101(115, 3);
   @OriginalMember(
      owner = "client!lt",
      name = "C",
      descriptor = "I"
   )
   public static int field10527;
   @OriginalMember(
      owner = "client!lt",
      name = "M",
      descriptor = "I"
   )
   public static int field10528;
   @OriginalMember(
      owner = "client!lt",
      name = "w",
      descriptor = "I"
   )
   public static int field10529;
   @OriginalMember(
      owner = "client!lt",
      name = "B",
      descriptor = "I"
   )
   public static int field10531;
   @OriginalMember(
      owner = "client!lt",
      name = "H",
      descriptor = "I"
   )
   public static int field10532;
   @OriginalMember(
      owner = "client!lt",
      name = "K",
      descriptor = "I"
   )
   public static int field10533;
   @OriginalMember(
      owner = "client!lt",
      name = "D",
      descriptor = "I"
   )
   public static int field10534;
   @OriginalMember(
      owner = "client!lt",
      name = "J",
      descriptor = "I"
   )
   public static int field10535;
   @OriginalMember(
      owner = "client!lt",
      name = "E",
      descriptor = "I"
   )
   public static int field10536;
   @OriginalMember(
      owner = "client!lt",
      name = "x",
      descriptor = "I"
   )
   public static int field10537;
   @OriginalMember(
      owner = "client!lt",
      name = "y",
      descriptor = "I"
   )
   public static int field10542;
   @OriginalMember(
      owner = "client!lt",
      name = "N",
      descriptor = "Ljfa;"
   )
   public static class303 field10541;
   @OriginalMember(
      owner = "client!lt",
      name = "L",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10540;

   @OriginalMember(
      owner = "client!lt",
      name = "c",
      descriptor = "(I)I",
      line = 3
   )
   public final int method500(int arg0) {
      try {
         if (arg0 != -32545) {
            return 3;
         } else {
            ++field10532;
            return this.field10538;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10543[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "b",
      descriptor = "(I)I",
      line = 16
   )
   public final int method505(int arg0) {
      try {
         if (arg0 != 9987) {
            return -78;
         } else {
            ++field10533;
            return this.field10539;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10543[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Leh;Lii;II[FII)V",
      line = 27
   )
   public class703(class379 arg0, class579 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class513.field7523, arg2 * arg3, false);

      try {
         this.field10538 = arg3;
         this.field10539 = arg2;
         super.field7119.method2578(this, true);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Df(super.field7122, 0, this.method3554(34840), arg2, arg3, 0, class420.method3207(super.field7112, 17835), 5126, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10543[3] + (arg0 != null ? field10543[2] : field10543[1]) + ',' + (arg1 != null ? field10543[2] : field10543[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10543[2] : field10543[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Leh;Lii;Lef;II)V",
      line = 40
   )
   public class703(class379 arg0, class579 arg1, class513 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);

      try {
         this.field10539 = arg3;
         this.field10538 = arg4;
         super.field7119.method2578(this, true);
         OpenGL.glTexImage2Dub(super.field7122, 0, this.method3554(34840), arg3, arg4, 0, class420.method3207(super.field7112, 17835), class577.method4260(super.field7110, (byte)101), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10543[3] + (arg0 != null ? field10543[2] : field10543[1]) + ',' + (arg1 != null ? field10543[2] : field10543[1]) + ',' + (arg2 != null ? field10543[2] : field10543[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IZZ)V",
      line = 52
   )
   public final void method502(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg0 < 90) {
            this.field10538 = -102;
         }

         ++field10535;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10543[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(III[IIII)V",
      line = 63
   )
   public final void method510(int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lt",
      name = "g",
      descriptor = "(I)V",
      line = 87
   )
   public static void method5116(int arg0) {
      try {
         field10540 = null;
         if (arg0 < 51) {
            field10530 = null;
         }

         field10530 = null;
         field10541 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10543[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(I)Z",
      line = 99
   )
   public final boolean method499(int arg0) {
      try {
         ++field10528;
         if (arg0 != 27891) {
            this.method503(1.35779F, 21);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10543[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Leh;II[III)V",
      line = 110
   )
   public class703(class379 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class75.field963, class513.field7519, arg1 * arg2, false);

      try {
         this.field10539 = arg1;
         this.field10538 = arg2;
         super.field7119.method2578(this, true);
         OpenGL.glPixelStorei(3314, arg5);
         OpenGL.glTexImage2Di(super.field7122, 0, 6408, this.field10539, this.field10538, 0, 32993, super.field7119.field5832, arg3, arg4 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10543[3] + (arg0 != null ? field10543[2] : field10543[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10543[2] : field10543[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Leh;Lii;II[BII)V",
      line = 123
   )
   public class703(class379 arg0, class579 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class513.field7519, arg2 * arg3, false);

      try {
         this.field10539 = arg2;
         this.field10538 = arg3;
         super.field7119.method2578(this, true);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Dub(super.field7122, 0, this.method3554(34840), arg2, arg3, 0, class420.method3207(super.field7112, 17835), 5121, arg4, arg5);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10543[3] + (arg0 != null ? field10543[2] : field10543[1]) + ',' + (arg1 != null ? field10543[2] : field10543[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10543[2] : field10543[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(FI)F",
      line = 139
   )
   public final float method503(float arg0, int arg1) {
      try {
         if (arg1 != 25525) {
            method5117(-119, -86, -44, 82, 52, 110, 50, 12, 9, 126);
         }

         ++field10529;
         return arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10543[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "([BILii;IIIIII)V",
      line = 154
   )
   public final void method498(byte[] arg0, int arg1, class579 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field10531;
         if (~arg4 == -1) {
            arg4 = arg6;
         }

         super.field7119.method2578(this, true);
         OpenGL.glPixelStorei(3317, 1);
         if (arg1 == 776) {
            if (~arg4 != ~arg6) {
               OpenGL.glPixelStorei(3314, arg4);
            }

            OpenGL.glTexSubImage2Dub(super.field7122, 0, arg8, arg5, arg6, arg3, class420.method3207(arg2, 17835), 5121, arg0, arg7);
            if (arg4 != arg6) {
               OpenGL.glPixelStorei(3314, 0);
            }

            OpenGL.glPixelStorei(3317, 4);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10543[10] + (arg0 != null ? field10543[2] : field10543[1]) + ',' + arg1 + ',' + (arg2 != null ? field10543[2] : field10543[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "b",
      descriptor = "(FI)F",
      line = 184
   )
   public final float method504(float arg0, int arg1) {
      try {
         ++field10536;
         if (arg1 != 2029) {
            this.method503(2.266176F, 37);
         }

         return arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10543[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(III[IIIII)V",
      line = 197
   )
   public final void method508(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field10534;
         if (~arg7 == -1) {
            arg7 = arg2;
         }

         if (arg4 > -106) {
            this.field10538 = 15;
         }

         super.field7119.method2578(this, true);
         if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
         }

         OpenGL.glTexSubImage2Di(super.field7122, 0, arg6, arg5, arg2, arg0, 32993, super.field7119.field5832, arg3, arg1);
         if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10543[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10543[2] : field10543[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IIIIIIIIII)V",
      line = 222
   )
   public static final void method5117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      int var10 = client.field4530;

      try {
         ++field10537;
         if (~arg8 <= -513 && ~arg4 <= -513 && class323.field4603 * 512 + -1024 >= arg8 && ~(class178.field2197 * 512 - 1024) <= ~arg4) {
            int var11;
            label42: {
               var11 = -arg5 + class368.method2858(arg4, (byte)-11, arg8, arg2);
               if (!class446.field6785) {
                  class332.field4754.method1512(arg0, 0, 0);
                  class786.field11439.method550(class332.field4754);
                  if (var10 == 0) {
                     break label42;
                  }
               }

               class54.method428(true, (byte)-118);
            }

            label37: {
               if (class88.field1076) {
                  class786.field11439.method587(arg8, var11, arg4, class221.field2828, class152.field1902);
                  if (var10 == 0) {
                     break label37;
                  }
               }

               class786.field11439.method629(arg8, var11, arg4, class152.field1902);
            }

            if (arg7 > 102) {
               if (!class446.field6785) {
                  class332.field4754.method1512(-arg0, 0, 0);
                  class786.field11439.method550(class332.field4754);
               } else {
                  class284.method2171(8);
               }
            }
         } else {
            class152.field1902[0] = class152.field1902[1] = -1;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10543[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
