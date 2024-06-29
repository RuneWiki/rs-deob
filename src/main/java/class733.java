import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class733 extends class242 {
   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "Lqu;"
   )
   private class105 field10552;
   @OriginalMember(
      owner = "client!pw",
      name = "C",
      descriptor = "Lik;"
   )
   private class219 field10548;
   @OriginalMember(
      owner = "client!pw",
      name = "q",
      descriptor = "Z"
   )
   private boolean field10546;
   @OriginalMember(
      owner = "client!pw",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10554 = new String[]{method5288(method5287("<[;0\u0015")), method5288(method5287("?Y{=E<C{\u001dS8")), method5288(method5287("\"Cg\u0015\\ \u007ft\u0015M Ig")), method5288(method5287(")Bc5\\<\u007ft\u0015M Ig")), method5288(method5287("?Y{;R C`\n")), method5288(method5287("?Y{<T>")), method5288(method5287("7\u0002;V@")), method5288(method5287(")Bc\u0011O#Bx\u001dS8sx\u0019M<Iq'J-Xp\nb*")), method5288(method5287(")Bc\u0011O#Bx\u001dS8sx\u0019M<Iq'J-Xp\nb:")), method5288(method5287("+@")), method5288(method5287("<[;DT\"EaF\u0015")), method5288(method5287("\"Yy\u0014")), method5288(method5287("<[;1\u0015")), method5288(method5287(".^p\u0019V\u001bMa\u001dO\u0003Js\u000bX8")), method5288(method5287("8Ex\u001d")), method5288(method5287("<[;?\u0015")), method5288(method5287("?Ot\u0014X")), method5288(method5287(".^p\u0019V\u001bMa\u001dO\bIe\fU")), method5288(method5287("<[;6\u0015")), method5288(method5287("<[;5\u0015")), method5288(method5287("<[;<\u0015")), method5288(method5287("<[;:\u0015")), method5288(method5287("<[;9\u0015"))};
   @OriginalMember(
      owner = "client!pw",
      name = "p",
      descriptor = "I"
   )
   public static int field10534 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "n",
      descriptor = "[[S"
   )
   private static short[][] field10539 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!pw",
      name = "B",
      descriptor = "I"
   )
   public static int field10535 = -1;
   @OriginalMember(
      owner = "client!pw",
      name = "t",
      descriptor = "[[S"
   )
   private static short[][] field10549 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!pw",
      name = "u",
      descriptor = "[[S"
   )
   private static short[][] field10545 = new short[][]{{6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}};
   @OriginalMember(
      owner = "client!pw",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field10540 = false;
   @OriginalMember(
      owner = "client!pw",
      name = "A",
      descriptor = "[[[S"
   )
   public static short[][][] field10536 = new short[][][]{field10545, field10539, field10549};
   @OriginalMember(
      owner = "client!pw",
      name = "x",
      descriptor = "I"
   )
   public static int field10538;
   @OriginalMember(
      owner = "client!pw",
      name = "E",
      descriptor = "I"
   )
   public static int field10541;
   @OriginalMember(
      owner = "client!pw",
      name = "G",
      descriptor = "I"
   )
   public static int field10542;
   @OriginalMember(
      owner = "client!pw",
      name = "y",
      descriptor = "I"
   )
   public static int field10543;
   @OriginalMember(
      owner = "client!pw",
      name = "s",
      descriptor = "I"
   )
   public static int field10544;
   @OriginalMember(
      owner = "client!pw",
      name = "F",
      descriptor = "I"
   )
   public static int field10547;
   @OriginalMember(
      owner = "client!pw",
      name = "H",
      descriptor = "I"
   )
   public static int field10550;
   @OriginalMember(
      owner = "client!pw",
      name = "v",
      descriptor = "I"
   )
   public static int field10551;
   @OriginalMember(
      owner = "client!pw",
      name = "w",
      descriptor = "Z"
   )
   private boolean field10537;
   @OriginalMember(
      owner = "client!pw",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field10553;

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IIB)V",
      line = 4
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      try {
         if (this.field10537) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float)(1 << ((61 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float)((252950 & arg1) >> 16) / 8.0F;
            long var8 = this.field10548.field3306;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10554[14]), (float)(super.field3498.field5227 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10554[16]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10554[17]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10554[13]), var7);
         }

         ++field10538;
         if (arg2 >= -64) {
            this.method69(-95);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field10554[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Lbba;Lhw;Lqu;)V",
      line = 33
   )
   public class733(class124 arg0, class141 arg1, class105 arg2) {
      super(arg0);

      try {
         this.field10552 = arg2;
         if (arg1 != null && arg0.field2091 && arg0.field2084) {
            class648 var4 = class260.method2084(35633, arg0, (byte)116, arg1.method1348(field10554[9], field10554[8], 40));
            class648 var5 = class260.method2084(35632, arg0, (byte)116, arg1.method1348(field10554[9], field10554[7], 40));
            this.field10548 = class276.method2169(false, new class648[]{var4, var5}, arg0);
            this.field10546 = this.field10548 != null && this.field10552.method1021((byte)66);
         } else {
            this.field10546 = false;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10554[10] + (arg0 != null ? field10554[6] : field10554[11]) + ',' + (arg1 != null ? field10554[6] : field10554[11]) + ',' + (arg2 != null ? field10554[6] : field10554[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "f",
      descriptor = "(I)V",
      line = 59
   )
   public final void method68(int arg0) {
      try {
         if (this.field10537) {
            super.field3498.method2767((byte)-112, 1);
            super.field3498.method2806(false, (class47)null);
            super.field3498.method2767((byte)-112, 0);
            super.field3498.method2806(false, (class47)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field10537 = false;
         }

         ++field10543;
         int var2 = 3 / ((27 - arg0) / 34);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10554[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "g",
      descriptor = "(I)V",
      line = 83
   )
   public static void method5285(int arg0) {
      try {
         field10539 = null;
         field10549 = null;
         field10553 = null;
         if (arg0 == 4949) {
            field10545 = null;
            field10536 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10554[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(ZZ)V",
      line = 99
   )
   public final void method70(boolean arg0, boolean arg1) {
      try {
         ++field10541;
         if (!arg0) {
            field10535 = -49;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10554[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(Lek;IZ)V",
      line = 114
   )
   public static final void method5286(class531 arg0, int arg1, boolean arg2) {
      try {
         ++field10547;
         if (class697.field10214) {
            arg1 = 0;
            class697.field10214 = false;
         }

         if (arg2) {
            if (class787.field11521 == null || !class787.field11521.method3977(26154, arg0)) {
               class787.field11521 = arg0;
               class534.field7780 = class57.method650(122);
               class218.field3294 = arg1;
               class265.field3775 = arg1;
               if (class265.field3775 != 0) {
                  class632.field9220 = class361.field5399;
                  class153.field2446 = class460.field6740;
                  class17.field298 = class14.field199;
                  class728.field10484 = class597.field8617;
                  class402.field5934 = class753.field10845;
                  class40.field954 = class202.field3028;
                  class434.field6274 = class119.field1937;
                  class704.field10264 = class272.field3853;
                  class419.field6121 = class749.field10810;
                  class510.field7453 = class527.field7685;
                  return;
               }

               class650.method4768(arg2);
            }

         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10554[18] + (arg0 != null ? field10554[6] : field10554[11]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(ZI)V",
      line = 162
   )
   public final void method72(boolean arg0, int arg1) {
      try {
         ++field10551;
         class568 var3 = super.field3498.method2740((byte)83);
         if (this.field10546 && var3 != null) {
            super.field3498.method2767((byte)-112, 1);
            super.field3498.method2806(false, var3);
            super.field3498.method2767((byte)-112, 0);
            super.field3498.method2806(false, this.field10552.field1745);
            long var4 = this.field10548.field3306;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field10554[2]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field10554[3]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field10554[5]), -super.field3498.field5260[0], -super.field3498.field5260[1], -super.field3498.field5260[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field10554[4]), super.field3498.field5274, super.field3498.field5313, super.field3498.field5324, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field10554[1]), Math.abs(super.field3498.field5260[1]) * 928.0F + 96.0F);
            this.field10537 = true;
         }

         if (arg1 != -29461) {
            method5285(71);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10554[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "e",
      descriptor = "(I)Z",
      line = 200
   )
   public final boolean method69(int arg0) {
      try {
         ++field10550;
         return arg0 != 30453 ? true : this.field10546;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10554[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IILbt;)V",
      line = 214
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      try {
         ++field10542;
         if (!this.field10537) {
            super.field3498.method2806(false, arg2);
            super.field3498.method2738(-91, arg0);
         }

         if (arg1 <= 12) {
            this.field10537 = false;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10554[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10554[6] : field10554[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5287(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5288(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
