import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class437 extends class331 {
   @OriginalMember(
      owner = "client!uw",
      name = "w",
      descriptor = "Lwr;"
   )
   private class482 field6672;
   @OriginalMember(
      owner = "client!uw",
      name = "x",
      descriptor = "Ljt;"
   )
   private class112 field6665;
   @OriginalMember(
      owner = "client!uw",
      name = "q",
      descriptor = "Z"
   )
   private boolean field6664;
   @OriginalMember(
      owner = "client!uw",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6677 = new String[]{method3313(method3312("d\u007f\u001bHI")), method3313(method3312("d\u007f\u001bCI")), method3313(method3312("d\u007f\u001bFI")), method3313(method3312("szPo\nFiAk\u0013UmEz\t")), method3313(method3312("bkTb\u0004")), method3313(method3312("eaXk")), method3313(method3312("szPo\nFiAk\u0013^nS}\u0004e")), method3313(method3312("d\u007f\u001bLI")), method3313(method3312("tfCg\u0013~fXk\u000feWXo\u0011amQQ\u0016p|P|>g")), method3313(method3312("d\u007f\u001b2\b\u007faA0I")), method3313(method3312("j&\u001b \u001c")), method3313(method3312("tfCg\u0013~fXk\u000feWXo\u0011amQQ\u0016p|P|>w")), method3313(method3312("\u007f}Yb")), method3313(method3312("vd")), method3313(method3312("d\u007f\u001bDI")), method3313(method3312("d\u007f\u001bGI")), method3313(method3312("tfCC\u0000a[Tc\u0011}mG")), method3313(method3312("\u007fgGc\u0000}[Tc\u0011}mG")), method3313(method3312("b}[K\u0019ag[k\u000fe")), method3313(method3312("d\u007f\u001bEI")), method3313(method3312("b}[M\u000e}g@|")), method3313(method3312("b}[J\bc"))};
   @OriginalMember(
      owner = "client!uw",
      name = "A",
      descriptor = "I"
   )
   public static int field6666 = 0;
   @OriginalMember(
      owner = "client!uw",
      name = "y",
      descriptor = "I"
   )
   public static int field6675 = 1;
   @OriginalMember(
      owner = "client!uw",
      name = "s",
      descriptor = "Ljca;"
   )
   public static class712 field6676 = new class712();
   @OriginalMember(
      owner = "client!uw",
      name = "B",
      descriptor = "I"
   )
   public static int field6661;
   @OriginalMember(
      owner = "client!uw",
      name = "u",
      descriptor = "I"
   )
   public static int field6662;
   @OriginalMember(
      owner = "client!uw",
      name = "r",
      descriptor = "I"
   )
   public static int field6667;
   @OriginalMember(
      owner = "client!uw",
      name = "v",
      descriptor = "I"
   )
   public static int field6668;
   @OriginalMember(
      owner = "client!uw",
      name = "p",
      descriptor = "I"
   )
   public static int field6669;
   @OriginalMember(
      owner = "client!uw",
      name = "o",
      descriptor = "I"
   )
   public static int field6671;
   @OriginalMember(
      owner = "client!uw",
      name = "C",
      descriptor = "I"
   )
   public static int field6673;
   @OriginalMember(
      owner = "client!uw",
      name = "n",
      descriptor = "Lki;"
   )
   public static class736 field6674;
   @OriginalMember(
      owner = "client!uw",
      name = "t",
      descriptor = "Z"
   )
   private boolean field6670;
   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "[Lida;"
   )
   public static class246[] field6663;

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method412(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 9950) {
            method3311((byte)-100);
         }

         if (this.field6670) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float)(1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float)(arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field6665.field1358;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field6677[5]), (float)(super.field4745.field5008 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field6677[4]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field6677[3]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field6677[6]), var7);
         }

         ++field6668;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field6677[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method411(int arg0) {
      try {
         ++field6671;
         if (this.field6670) {
            super.field4745.method2574(103, 1);
            super.field4745.method2578((class254)null, true);
            super.field4745.method2574(74, 0);
            super.field4745.method2578((class254)null, true);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6670 = false;
         }

         if (arg0 >= -21) {
            field6674 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6677[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method3311(byte arg0) {
      try {
         field6663 = null;
         if (arg0 <= -87) {
            field6674 = null;
            field6676 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6677[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method410(int arg0, boolean arg1) {
      try {
         ++field6661;
         if (arg0 < 3) {
            this.field6665 = null;
         }

         class223 var3 = super.field4745.method2669(-720);
         if (this.field6664 && var3 != null) {
            super.field4745.method2574(107, 1);
            super.field4745.method2578(var3, true);
            super.field4745.method2574(126, 0);
            super.field4745.method2578(this.field6672.field7150, true);
            long var4 = this.field6665.field1358;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field6677[17]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field6677[16]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field6677[21]), -super.field4745.field5057[0], -super.field4745.field5057[1], -super.field4745.field5057[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field6677[20]), super.field4745.field5082, super.field4745.field5047, super.field4745.field5062, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field6677[18]), 96.0F + 928.0F * Math.abs(super.field4745.field5057[1]));
            this.field6670 = true;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6677[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method417(boolean arg0, byte arg1) {
      try {
         ++field6673;
         if (arg1 != -102) {
            this.method412(-27, 61, 16);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6677[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method407(byte arg0) {
      try {
         if (arg0 <= 16) {
            field6674 = null;
         }

         ++field6662;
         return this.field6664;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6677[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "<init>",
      descriptor = "(Leh;Leaa;Lwr;)V"
   )
   public class437(class379 arg0, class526 arg1, class482 arg2) {
      super(arg0);

      try {
         this.field6672 = arg2;
         if (arg1 != null && arg0.field5834 && arg0.field5828) {
            class429 var4 = class345.method2707(-124, arg1.method3878(false, field6677[13], field6677[8]), arg0, 35633);
            class429 var5 = class345.method2707(99, arg1.method3878(false, field6677[13], field6677[11]), arg0, 35632);
            this.field6665 = class536.method3972(new class429[]{var4, var5}, arg0, 0);
            this.field6664 = this.field6665 != null && this.field6672.method3575(false);
         } else {
            this.field6664 = false;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6677[9] + (arg0 != null ? field6677[10] : field6677[12]) + ',' + (arg1 != null ? field6677[10] : field6677[12]) + ',' + (arg2 != null ? field6677[10] : field6677[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(IILuha;)V"
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      try {
         if (!this.field6670) {
            super.field4745.method2578(arg2, true);
            super.field4745.method2649((byte)119, arg1);
         }

         ++field6667;
         if (arg0 != 0) {
            this.method414(66, 76, (class254)null);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6677[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6677[10] : field6677[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
