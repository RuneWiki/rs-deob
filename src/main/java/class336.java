import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class336 extends class529 {
   @OriginalMember(
      owner = "client!en",
      name = "e",
      descriptor = "Z"
   )
   private boolean field4804 = false;
   @OriginalMember(
      owner = "client!en",
      name = "n",
      descriptor = "Lll;"
   )
   private class383 field4802;
   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4810 = new String[]{method2547(method2546("dGBS!")), method2547(method2546("dGB^!")), method2547(method2546("dGBR!")), method2547(method2546("o\\\u0000z")), method2547(method2546("z\u0007B8t")), method2547(method2546("dGB*`o@\u0018(!")), method2547(method2546("dGBT!")), method2547(method2546("dGBU!")), method2547(method2546("dGBW!")), method2547(method2546("dGBQ!")), method2547(method2546("dGBP!"))};
   @OriginalMember(
      owner = "client!en",
      name = "f",
      descriptor = "Lsda;"
   )
   public static class269 field4805 = new class269(64, -1);
   @OriginalMember(
      owner = "client!en",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field4806 = false;
   @OriginalMember(
      owner = "client!en",
      name = "j",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field4808 = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
   @OriginalMember(
      owner = "client!en",
      name = "g",
      descriptor = "I"
   )
   public static int field4796;
   @OriginalMember(
      owner = "client!en",
      name = "d",
      descriptor = "I"
   )
   public static int field4797;
   @OriginalMember(
      owner = "client!en",
      name = "o",
      descriptor = "I"
   )
   public static int field4798;
   @OriginalMember(
      owner = "client!en",
      name = "h",
      descriptor = "I"
   )
   public static int field4799;
   @OriginalMember(
      owner = "client!en",
      name = "p",
      descriptor = "I"
   )
   public static int field4800;
   @OriginalMember(
      owner = "client!en",
      name = "l",
      descriptor = "I"
   )
   public static int field4801;
   @OriginalMember(
      owner = "client!en",
      name = "i",
      descriptor = "I"
   )
   public static int field4803;
   @OriginalMember(
      owner = "client!en",
      name = "m",
      descriptor = "Lsu;"
   )
   public static class220 field4807;
   @OriginalMember(
      owner = "client!en",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field4809;

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method871(int arg0, int arg1, int arg2) {
      try {
         ++field4803;
         int var4 = 126 / ((75 - arg1) / 37);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4810[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2544(int arg0) {
      try {
         ++field4800;
         class354.method2768(22050, (byte)-19, 2, class261.field3566.field9440.method1502(115) == 1);
         field4807 = class425.method3230(class755.field11144, class769.field11271, 0, false, 22050);
         class157.method1299(class633.method4557((class55)null, true), true, (byte)96);
         class240.field3050 = class425.method3230(class755.field11144, class769.field11271, 1, false, 2048);
         class149.field1871 = new class775();
         if (arg0 == 29042) {
            class240.field3050.method1663(arg0 + -29140, class149.field1871);
            class550.field8139 = new class157(22050, class335.field4787);
            class454.method3417((byte)-77);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4810[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method878(int arg0, boolean arg1) {
      try {
         ++field4796;
         if (arg0 != 0) {
            this.field4802 = null;
         }

         class355 var3 = super.field7700.method4851((byte)-30);
         if (this.field4802 != null && var3 != null && arg1) {
            this.field4802.method2948('\u0000', (byte)-69);
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4818((byte)73, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7700.field9935.method1647(2), 0);
            OpenGL.glMatrixMode(5888);
            super.field7700.method4828(0, (byte)66);
            this.field4804 = true;
         } else {
            super.field7700.method4823(34168, 0, 770, (byte)60);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4810[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2545(byte arg0) {
      try {
         if (arg0 != -99) {
            field4805 = null;
         }

         field4808 = null;
         field4805 = null;
         field4809 = null;
         field4807 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4810[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method873(int arg0) {
      try {
         ++field4801;
         return arg0 != 0 ? true : true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4810[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method872(int arg0, boolean arg1) {
      try {
         ++field4799;
         super.field7700.method4849(7681, 34161, 8448);
         if (arg0 < 12) {
            field4809 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4810[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "<init>",
      descriptor = "(Lck;)V"
   )
   public class336(class667 arg0) {
      super(arg0);

      try {
         if (arg0.field10026) {
            this.field4802 = new class383(arg0, 2);
            this.field4802.method2949(false, 0);
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4849(7681, 34161, 34165);
            super.field7700.method4814(7681, 2, 34168, 770);
            super.field7700.method4823(34167, 0, 770, (byte)83);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field7700.method4828(0, (byte)66);
            this.field4802.method2946(407554050);
            this.field4802.method2949(false, 1);
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4849(8448, 34161, 8448);
            super.field7700.method4814(7681, 2, 34166, 770);
            super.field7700.method4823(5890, 0, 770, (byte)84);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field7700.method4828(0, (byte)66);
            this.field4802.method2946(407554050);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4810[5] + (arg0 != null ? field4810[4] : field4810[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(ILbca;I)V"
   )
   public final void method870(int arg0, class689 arg1, int arg2) {
      try {
         super.field7700.method4818((byte)-128, arg1);
         ++field4797;
         super.field7700.method4796(false, arg0);
         if (arg2 != -1) {
            method2545((byte)116);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4810[6] + arg0 + ',' + (arg1 != null ? field4810[4] : field4810[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method874(int arg0) {
      try {
         label20: {
            ++field4798;
            if (this.field4804) {
               this.field4802.method2948('\u0001', (byte)-69);
               super.field7700.method4828(1, (byte)66);
               super.field7700.method4818((byte)44, (class689)null);
               super.field7700.method4828(0, (byte)66);
               if (client.field4530 == 0) {
                  break label20;
               }
            }

            super.field7700.method4823(5890, 0, 770, (byte)75);
         }

         super.field7700.method4849(8448, arg0 ^ 34160, 8448);
         if (arg0 != 1) {
            this.method878(-18, true);
         }

         this.field4804 = false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4810[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2546(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2547(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
