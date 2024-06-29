import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class511 extends class393 {
   @OriginalMember(
      owner = "client!raa",
      name = "y",
      descriptor = "Ldd;"
   )
   private class712 field7121;
   @OriginalMember(
      owner = "client!raa",
      name = "l",
      descriptor = "Lafa;"
   )
   private class215 field7128;
   @OriginalMember(
      owner = "client!raa",
      name = "n",
      descriptor = "Z"
   )
   private boolean field7126;
   @OriginalMember(
      owner = "client!raa",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7136 = new String[]{method3861(method3860("\u001f1{ \u001eE")), method3861(method3860("\u001f1{ \u001cE")), method3861(method3860("\u0003%vb")), method3861(method3860("\n<")), method3861(method3860("\b>lg%\u0002>wk9\u0019\u000fwo'\u001d5~Q \f$\u007f|\b\u001b")), method3861(method3860("\u0016~4 *")), method3861(method3860("\u001f1{ k\u0004>sziE")), method3861(method3860("\b>lg%\u0002>wk9\u0019\u000fwo'\u001d5~Q \f$\u007f|\b\u000b")), method3861(method3860("\u001f1{ \u0007E")), method3861(method3860("\u000f\"\u007fo<:1nk%\"6|}2\u0019")), method3861(method3860("\u001f1{ \u0010E")), method3861(method3860("\u001e3{b2")), method3861(method3860("\u000f\"\u007fo<:1nk%)5jz?")), method3861(method3860("\u00199wk")), method3861(method3860("\u001f1{ \u0013E")), method3861(method3860("\u001f1{ \u0006E")), method3861(method3860("\u001e%tJ>\u001f")), method3861(method3860("\u001e%tM8\u0001?o|")), method3861(method3860("\u0003?hc6\u0001\u0003{c'\u00015h")), method3861(method3860("\b>lC6\u001d\u0003{c'\u00015h")), method3861(method3860("\u001f1{ \u0012E")), method3861(method3860("\u001e%tK/\u001d?tk9\u0019")), method3861(method3860("\u001f1{ \u0019E")), method3861(method3860("\u001f1{ \u0005E")), method3861(method3860("\u001f1{ \u001dE")), method3861(method3860("\u001f1{ \u0014E"))};
   @OriginalMember(
      owner = "client!raa",
      name = "t",
      descriptor = "Laka;"
   )
   public static class418 field7130 = new class418(50, 10);
   @OriginalMember(
      owner = "client!raa",
      name = "k",
      descriptor = "Lse;"
   )
   public static class6 field7131 = new class6(90, 8);
   @OriginalMember(
      owner = "client!raa",
      name = "v",
      descriptor = "I"
   )
   public static int field7120;
   @OriginalMember(
      owner = "client!raa",
      name = "m",
      descriptor = "I"
   )
   public static int field7122;
   @OriginalMember(
      owner = "client!raa",
      name = "r",
      descriptor = "I"
   )
   public static int field7123;
   @OriginalMember(
      owner = "client!raa",
      name = "u",
      descriptor = "I"
   )
   public static int field7124;
   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "I"
   )
   public static int field7125;
   @OriginalMember(
      owner = "client!raa",
      name = "w",
      descriptor = "I"
   )
   public static int field7127;
   @OriginalMember(
      owner = "client!raa",
      name = "x",
      descriptor = "I"
   )
   public static int field7129;
   @OriginalMember(
      owner = "client!raa",
      name = "j",
      descriptor = "I"
   )
   public static int field7132;
   @OriginalMember(
      owner = "client!raa",
      name = "p",
      descriptor = "I"
   )
   public static int field7133;
   @OriginalMember(
      owner = "client!raa",
      name = "o",
      descriptor = "I"
   )
   public static int field7134;
   @OriginalMember(
      owner = "client!raa",
      name = "q",
      descriptor = "Ljava/lang/Thread;"
   )
   public static Thread field7135;
   @OriginalMember(
      owner = "client!raa",
      name = "s",
      descriptor = "Z"
   )
   private boolean field7119;

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Lha;IIZ)Lda;"
   )
   public static final class447 method3855(class479 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field7124;
         class553 var4 = class375.method2961(arg2, arg3, -28218, arg0);
         if (arg1 != 2) {
            method3856(-21, (byte)18, (class783)null, false, 77);
         }

         return var4 == null ? null : var4.field8129;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7136[22] + (arg0 != null ? field7136[5] : field7136[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         if (arg0 != 29404) {
            this.method1460(true);
         }

         ++field7125;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7136[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(IBLsa;ZI)V"
   )
   public static final void method3856(int param0, byte param1, class783 param2, boolean param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         if (arg0) {
            this.method1457((byte)-123);
         }

         ++field7127;
         return this.field7126;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7136[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      try {
         if (this.field7119) {
            super.field5438.method2238(9, 1);
            super.field5438.method2265((class421)null, (byte)-101);
            super.field5438.method2238(9, 0);
            super.field5438.method2265((class421)null, (byte)114);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7119 = false;
         }

         int var2 = 8 % ((22 - arg0) / 63);
         ++field7120;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7136[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "<init>",
      descriptor = "(Llea;Lww;Ldd;)V"
   )
   public class511(class574 arg0, class339 arg1, class712 arg2) {
      super(arg0);

      try {
         this.field7121 = arg2;
         if (arg1 != null && arg0.field8521 && arg0.field8525) {
            class128 var4 = class16.method130(arg0, (byte)10, arg1.method2692(field7136[3], field7136[4], (byte)-86), 35633);
            class128 var5 = class16.method130(arg0, (byte)70, arg1.method2692(field7136[3], field7136[7], (byte)-86), 35632);
            this.field7128 = class32.method260(105, new class128[]{var4, var5}, arg0);
            this.field7126 = this.field7128 != null && this.field7121.method5202((byte)-96);
         } else {
            this.field7126 = false;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7136[6] + (arg0 != null ? field7136[5] : field7136[2]) + ',' + (arg1 != null ? field7136[5] : field7136[2]) + ',' + (arg2 != null ? field7136[5] : field7136[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(BZ)I"
   )
   public static final int method3857(byte arg0, boolean arg1) {
      try {
         ++field7129;
         int var2 = -100 % ((arg0 - -56) / 35);
         int var3 = class175.field2258;
         if (var3 != 0) {
            if (~var3 == -2) {
               return class453.field6250;
            }

            if (var3 != 2) {
               return 0;
            }

            if (!client.field1481) {
               return 0;
            }
         }

         return !arg1 ? class453.field6250 : 0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7136[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3858(int arg0) {
      try {
         field7131 = null;
         field7135 = null;
         field7130 = null;
         if (arg0 != 1) {
            method3855((class479)null, -20, 89, true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7136[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      try {
         ++field7132;
         if (arg1 != 32) {
            this.field7128 = null;
         }

         class531 var3 = super.field5438.method2286(-70);
         if (this.field7126 && var3 != null) {
            super.field5438.method2238(9, 1);
            super.field5438.method2265(var3, (byte)118);
            super.field5438.method2238(9, 0);
            super.field5438.method2265(this.field7121.field10447, (byte)-68);
            long var4 = this.field7128.field2734;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field7136[18]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field7136[19]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field7136[16]), -super.field5438.field3803[0], -super.field5438.field3803[1], -super.field5438.field3803[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field7136[17]), super.field5438.field3862, super.field5438.field3826, super.field5438.field3795, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field7136[21]), 928.0F * Math.abs(super.field5438.field3803[1]) + 96.0F);
            this.field7119 = true;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7136[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      try {
         if (this.field7119) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float)(1 << ((58 & arg0) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float)((arg2 & 224544) >> 16) / 8.0F;
            long var8 = this.field7128.field2734;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field7136[13]), (float)(super.field5438.field3805 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field7136[11]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field7136[12]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field7136[9]), var7);
         }

         ++field7122;
         if (arg1 != 7313) {
            field7130 = null;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field7136[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3859(int arg0, int arg1) {
      try {
         if (arg1 <= 60) {
            field7130 = null;
         }

         ++field7133;
         if (class89.field1205 == null || class89.field1205.length < arg0) {
            class89.field1205 = new int[arg0];
         }

      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7136[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         if (!this.field7119) {
            super.field5438.method2265(arg0, (byte)-51);
            super.field5438.method2240(-4, arg2);
         }

         ++field7123;
         if (arg1 <= 84) {
            method3855((class479)null, 42, -7, false);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7136[24] + (arg0 != null ? field7136[5] : field7136[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3860(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3861(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
