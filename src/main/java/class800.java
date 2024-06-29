import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class800 extends class575 {
   @OriginalMember(
      owner = "client!bo",
      name = "v",
      descriptor = "Lqc;"
   )
   private class497 field11636;
   @OriginalMember(
      owner = "client!bo",
      name = "t",
      descriptor = "Z"
   )
   private boolean field11645;
   @OriginalMember(
      owner = "client!bo",
      name = "w",
      descriptor = "Lska;"
   )
   private class225 field11640;
   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11646 = new String[]{method5768(method5767("nDgq\u0005")), method5768(method5767("w\u0005g\u0018P")), method5768(method5767("iE?__cE$SCxt$W]|N-iZm_,Drj")), method5768(method5767("kG")), method5768(method5767("nDg\nDbB=\b\u0005")), method5768(method5767("iE?__cE$SCxt$W]|N-iZm_,Drz")), method5768(method5767("b^%Z")), method5768(method5767("nDgt\u0005")), method5768(method5767("nDgw\u0005")), method5768(method5767("nDgu\u0005")), method5768(method5767("nY,WF[J=S_HN9BE")), method5768(method5767("nY,WF[J=S_CM/EHx")), method5768(method5767("xB$S")), method5768(method5767("nDgr\u0005")), method5768(method5767("\u007fH(ZH")), method5768(method5767("nDgs\u0005")), method5768(method5767("\u007f^'sU|D'SCx")), method5768(method5767("nDgp\u0005")), method5768(method5767("bD;[L`x([]`N;")), method5768(method5767("iE?{L|x([]`N;")), method5768(method5767("\u007f^'uB`D<D")), method5768(method5767("\u007f^'rD~"))};
   @OriginalMember(
      owner = "client!bo",
      name = "u",
      descriptor = "I"
   )
   public static int field11644 = 1401;
   @OriginalMember(
      owner = "client!bo",
      name = "s",
      descriptor = "I"
   )
   public static int field11634;
   @OriginalMember(
      owner = "client!bo",
      name = "r",
      descriptor = "I"
   )
   public static int field11635;
   @OriginalMember(
      owner = "client!bo",
      name = "n",
      descriptor = "I"
   )
   public static int field11637;
   @OriginalMember(
      owner = "client!bo",
      name = "o",
      descriptor = "I"
   )
   public static int field11639;
   @OriginalMember(
      owner = "client!bo",
      name = "q",
      descriptor = "I"
   )
   public static int field11641;
   @OriginalMember(
      owner = "client!bo",
      name = "p",
      descriptor = "I"
   )
   public static int field11643;
   @OriginalMember(
      owner = "client!bo",
      name = "l",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field11642;
   @OriginalMember(
      owner = "client!bo",
      name = "m",
      descriptor = "Z"
   )
   private boolean field11638;

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         ++field11643;
         if (arg1 != 23) {
            this.field11638 = false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11646[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "<init>",
      descriptor = "(Lqs;Lsa;Lqc;)V"
   )
   public class800(class771 arg0, class39 arg1, class497 arg2) {
      super(arg0);

      try {
         this.field11636 = arg2;
         if (arg1 != null && arg0.field11156 && arg0.field11151) {
            class170 var4 = class784.method5662(0, arg0, 35633, arg1.method458(0, field11646[3], field11646[5]));
            class170 var5 = class784.method5662(0, arg0, 35632, arg1.method458(0, field11646[3], field11646[2]));
            this.field11640 = class164.method1544(new class170[]{var4, var5}, -7567, arg0);
            this.field11645 = this.field11640 != null && this.field11636.method3770(13);
         } else {
            this.field11645 = false;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11646[4] + (arg0 != null ? field11646[1] : field11646[6]) + ',' + (arg1 != null ? field11646[1] : field11646[6]) + ',' + (arg2 != null ? field11646[1] : field11646[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         ++field11637;
         if (arg0 != 15385) {
            this.method82(false, (byte)-125);
         }

         return this.field11645;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11646[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         if (!this.field11638) {
            super.field8129.method1943(0, arg2);
            super.field8129.method1966(arg0, -5);
         }

         ++field11639;
         if (!arg1) {
            this.method86(41);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11646[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11646[1] : field11646[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      try {
         ++field11635;
         class293 var3 = super.field8129.method2005(false);
         if (this.field11645 && var3 != null) {
            super.field8129.method1953(-61, 1);
            super.field8129.method1943(0, var3);
            super.field8129.method1953(116, 0);
            super.field8129.method1943(0, this.field11636.field7088);
            long var4 = this.field11640.field3196;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field11646[18]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field11646[19]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field11646[21]), -super.field8129.field3435[0], -super.field8129.field3435[1], -super.field8129.field3435[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field11646[20]), super.field8129.field3438, super.field8129.field3462, super.field8129.field3429, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field11646[16]), 928.0F * Math.abs(super.field8129.field3435[1]) + 96.0F);
            this.field11638 = true;
         }

         if (!arg1) {
            this.field11640 = null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11646[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      try {
         if (arg0) {
            this.field11645 = true;
         }

         ++field11634;
         if (this.field11638) {
            super.field8129.method1953(98, 1);
            super.field8129.method1943(0, (class683)null);
            super.field8129.method1953(114, 0);
            super.field8129.method1943(0, (class683)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field11638 = false;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11646[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5766(int arg0) {
      try {
         if (arg0 != 1) {
            method5766(78);
         }

         field11642 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11646[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      try {
         if (this.field11638) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float)(1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float)((arg0 & 252178) >> 16) / 8.0F;
            long var8 = this.field11640.field3196;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11646[12]), (float)(super.field8129.field3488 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11646[14]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11646[10]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11646[11]), var7);
         }

         if (arg2 <= 61) {
            this.field11640 = null;
         }

         ++field11641;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field11646[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5767(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5768(char[] arg0) {
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
            var10005 = 43;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
