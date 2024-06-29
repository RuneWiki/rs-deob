import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class111 extends class550 {
   @OriginalMember(
      owner = "client!or",
      name = "y",
      descriptor = "Lsc;"
   )
   private class97 field1524;
   @OriginalMember(
      owner = "client!or",
      name = "n",
      descriptor = "Z"
   )
   private boolean field1528;
   @OriginalMember(
      owner = "client!or",
      name = "j",
      descriptor = "Lpo;"
   )
   private class739 field1525;
   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1539 = new String[]{method1053(method1052("\u000e\u0000OuW")), method1053(method1052("\u001b[\r7")), method1053(method1052("\u001a\\O\u0015\u0002")), method1053(method1052("\u001a\\O\u0017\u0002")), method1053(method1052("\u0017\\\u0004:A\"O\u0015>X1K\u0011/B")), method1053(method1052("\u0001G\f>")), method1053(method1052("\u001a\\O\u0018\u0002")), method1053(method1052("\u0006M\u00007O")), method1053(method1052("\u0017\\\u0004:A\"O\u0015>X:H\u0007(O\u0001")), method1053(method1052("\u001a\\O\u0014\u0002")), method1053(method1052("\u001a\\O\u001d\u0002")), method1053(method1052("\u0012B")), method1053(method1052("\u001a\\OgC\u001bG\u0015e\u0002")), method1053(method1052("\u0010@\u00172X\u001a@\f>D\u0001q\f:Z\u0005K\u0005\u0004]\u0014Z\u0004)u\u0013")), method1053(method1052("\u0010@\u00172X\u001a@\f>D\u0001q\f:Z\u0005K\u0005\u0004]\u0014Z\u0004)u\u0003")), method1053(method1052("\u001a\\O\u0012\u0002")), method1053(method1052("\u0006[\u000f\u001eR\u0005A\u000f>D\u0001")), method1053(method1052("\u0010@\u0017\u0016K\u0005}\u00006Z\u0019K\u0013")), method1053(method1052("\u0006[\u000f\u001fC\u0007")), method1053(method1052("\u001a\\O\u001a\u0002")), method1053(method1052("\u0006[\u000f\u0018E\u0019A\u0014)")), method1053(method1052("\u001bA\u00136K\u0019}\u00006Z\u0019K\u0013")), method1053(method1052("\u001a\\O\u0019\u0002")), method1053(method1052("\u001a\\O\u001e\u0002"))};
   @OriginalMember(
      owner = "client!or",
      name = "r",
      descriptor = "Luk;"
   )
   public static class498 field1533 = new class498(93, 7);
   @OriginalMember(
      owner = "client!or",
      name = "l",
      descriptor = "Ljw;"
   )
   public static class779 field1536 = new class779(10, 2, 2, 0);
   @OriginalMember(
      owner = "client!or",
      name = "k",
      descriptor = "Ljw;"
   )
   public static class779 field1537 = new class779(13, 0, 1, 0);
   @OriginalMember(
      owner = "client!or",
      name = "v",
      descriptor = "I"
   )
   public static int field1523;
   @OriginalMember(
      owner = "client!or",
      name = "p",
      descriptor = "I"
   )
   public static int field1526;
   @OriginalMember(
      owner = "client!or",
      name = "s",
      descriptor = "I"
   )
   public static int field1527;
   @OriginalMember(
      owner = "client!or",
      name = "q",
      descriptor = "I"
   )
   public static int field1529;
   @OriginalMember(
      owner = "client!or",
      name = "x",
      descriptor = "I"
   )
   public static int field1531;
   @OriginalMember(
      owner = "client!or",
      name = "w",
      descriptor = "I"
   )
   public static int field1532;
   @OriginalMember(
      owner = "client!or",
      name = "m",
      descriptor = "I"
   )
   public static int field1534;
   @OriginalMember(
      owner = "client!or",
      name = "t",
      descriptor = "I"
   )
   public static int field1535;
   @OriginalMember(
      owner = "client!or",
      name = "o",
      descriptor = "Z"
   )
   private boolean field1530;
   @OriginalMember(
      owner = "client!or",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field1538;

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method72(int arg0) {
      try {
         ++field1535;
         if (this.field1530) {
            super.field8234.method2220(1, 14);
            super.field8234.method2193((class428)null, (byte)-19);
            super.field8234.method2220(0, arg0 ^ -16);
            super.field8234.method2193((class428)null, (byte)-19);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1530 = false;
         }

         if (arg0 != -2) {
            method1049((byte)-115);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1539[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method1049(byte arg0) {
      try {
         field1537 = null;
         field1536 = null;
         int var1 = -77 / ((-13 - arg0) / 50);
         field1538 = null;
         field1533 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1539[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         if (arg0 <= 82) {
            this.field1525 = null;
         }

         ++field1531;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1539[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ILria;)Ljava/lang/String;"
   )
   public static final String method1050(int arg0, class185 arg1) {
      try {
         if (arg0 != -11382) {
            field1536 = null;
         }

         ++field1534;
         if (arg1.field2899 != null && arg1.field2899.length() != 0) {
            return arg1.field2910 != null && ~arg1.field2910.length() < -1 ? arg1.field2903 + class499.field7620.method3875(class493.field7455, 84) + arg1.field2910 + class499.field7620.method3875(class493.field7455, 95) + arg1.field2899 : arg1.field2903 + class499.field7620.method3875(class493.field7455, 97) + arg1.field2899;
         } else {
            return arg1.field2910 != null && arg1.field2910.length() > 0 ? arg1.field2903 + class499.field7620.method3875(class493.field7455, 98) + arg1.field2910 : arg1.field2903;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1539[2] + arg0 + ',' + (arg1 != null ? field1539[0] : field1539[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IBLwm;)V"
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         int var4 = 121 % ((18 - arg1) / 60);
         if (!this.field1530) {
            super.field8234.method2193(arg2, (byte)-19);
            super.field8234.method2255(arg0, (byte)90);
         }

         ++field1526;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1539[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1539[0] : field1539[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         ++field1529;
         class496 var3 = super.field8234.method2223(16);
         if (this.field1528 && var3 != null) {
            super.field8234.method2220(1, 14);
            super.field8234.method2193(var3, (byte)-19);
            super.field8234.method2220(0, 14);
            super.field8234.method2193(this.field1524.field1360, (byte)-19);
            long var4 = this.field1525.field10976;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field1539[21]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field1539[17]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field1539[18]), -super.field8234.field4203[0], -super.field8234.field4203[1], -super.field8234.field4203[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field1539[20]), super.field8234.field4160, super.field8234.field4194, super.field8234.field4211, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field1539[16]), 96.0F + 928.0F * Math.abs(super.field8234.field4203[1]));
            this.field1530 = true;
         }

         if (arg1 > -44) {
            this.method73(true, (byte)120);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1539[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      try {
         ++field1527;
         if (arg0 == 90) {
            if (this.field1530) {
               int var4 = 1 << (arg2 & 3);
               float var5 = (float)(1 << (arg2 >> 3 & 7)) / 32.0F;
               int var6 = 65535 & arg1;
               float var7 = (float)(3 & arg1 >> 16) / 8.0F;
               long var8 = this.field1525.field10976;
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field1539[5]), (float)(super.field8234.field4155 * var4 % 40000) / 40000.0F);
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field1539[7]), var5);
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field1539[4]), (float)var6);
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field1539[8]), var7);
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1539[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method69(byte arg0) {
      try {
         if (arg0 != 120) {
            field1537 = null;
         }

         ++field1532;
         return this.field1528;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1539[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "<init>",
      descriptor = "(Lcka;Lrr;Lsc;)V"
   )
   public class111(class174 arg0, class678 arg1, class97 arg2) {
      super(arg0);

      try {
         this.field1524 = arg2;
         if (arg1 != null && arg0.field2738 && arg0.field2732) {
            class513 var4 = class670.method4935(true, arg1.method5023(field1539[14], field1539[11], 0), 35633, arg0);
            class513 var5 = class670.method4935(true, arg1.method5023(field1539[13], field1539[11], 0), 35632, arg0);
            this.field1525 = class224.method1949(0, arg0, new class513[]{var4, var5});
            this.field1528 = this.field1525 != null && this.field1524.method953(99);
         } else {
            this.field1528 = false;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1539[12] + (arg0 != null ? field1539[0] : field1539[1]) + ',' + (arg1 != null ? field1539[0] : field1539[1]) + ',' + (arg2 != null ? field1539[0] : field1539[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1051(int arg0, int arg1, int arg2) {
      try {
         ++field1523;
         if (arg2 != 1) {
            return false;
         } else {
            return ~(arg0 & 2048) != -1 | class542.method4142(false, arg1, arg0) || class233.method2003(arg0, (byte)104, arg1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1539[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1052(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1053(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
