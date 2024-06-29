import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class210 extends class416 {
   @OriginalMember(
      owner = "client!hb",
      name = "f",
      descriptor = "Lwfa;"
   )
   private class786 field3189;
   @OriginalMember(
      owner = "client!hb",
      name = "m",
      descriptor = "Lsba;"
   )
   private class601 field3183;
   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3194 = new String[]{method1835(method1834("\u0012L\u001dD)")), method1835(method1834("\u0012L\u001dG)")), method1835(method1834("\u0001\u0000\u001d/|")), method1835(method1834("\u0014[_m")), method1835(method1834("\u0012L\u001d@)")), method1835(method1834("\u0012L\u001d=h\u0014GG?)")), method1835(method1834("\u0012L\u001dI)")), method1835(method1834("\u0012L\u001dE)")), method1835(method1834("\u0012L\u001dF)")), method1835(method1834("\u0012L\u001dC)")), method1835(method1834("\u0012L\u001dB)"))};
   @OriginalMember(
      owner = "client!hb",
      name = "l",
      descriptor = "[Lmq;"
   )
   public static class577[] field3192 = new class577[300];
   @OriginalMember(
      owner = "client!hb",
      name = "o",
      descriptor = "I"
   )
   public static int field3182;
   @OriginalMember(
      owner = "client!hb",
      name = "d",
      descriptor = "I"
   )
   public static int field3184;
   @OriginalMember(
      owner = "client!hb",
      name = "i",
      descriptor = "I"
   )
   public static int field3185;
   @OriginalMember(
      owner = "client!hb",
      name = "j",
      descriptor = "I"
   )
   public static int field3187;
   @OriginalMember(
      owner = "client!hb",
      name = "g",
      descriptor = "I"
   )
   public static int field3188;
   @OriginalMember(
      owner = "client!hb",
      name = "e",
      descriptor = "I"
   )
   public static int field3190;
   @OriginalMember(
      owner = "client!hb",
      name = "h",
      descriptor = "I"
   )
   public static int field3191;
   @OriginalMember(
      owner = "client!hb",
      name = "n",
      descriptor = "Luf;"
   )
   private class701 field3186;
   @OriginalMember(
      owner = "client!hb",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3193;

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(Lvda;IB)V",
      line = 3
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         ++field3187;
         if (arg2 > -29) {
            field3192 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3194[1] + (arg0 != null ? field3194[2] : field3194[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "c",
      descriptor = "(B)V",
      line = 16
   )
   public final void method1827(byte arg0) {
      try {
         this.field3186.method5160((byte)-76, '\u0001');
         ++field3185;
         if (~super.field6445.field9701 < -1) {
            super.field6445.method4787(-58, 1);
            super.field6445.method4792(-26367, (class799)null);
            super.field6445.method4789(1.0F, 0.0F, 6914);
            super.field6445.method4787(-74, 0);
         }

         super.field6445.method4803(8448, 8448, true);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         if (arg0 == 77) {
            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3194[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(ZZ)V",
      line = 39
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         super.field6445.method4803(260, 8448, true);
         ++field3182;
         if (arg0) {
            field3192 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3194[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(I)V",
      line = 52
   )
   public static void method1829(int arg0) {
      try {
         if (arg0 != 2) {
            method1829(-3);
         }

         field3193 = null;
         field3192 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3194[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "<init>",
      descriptor = "(Lc;Lwfa;)V",
      line = 64
   )
   public class210(class652 arg0, class786 arg1) {
      super(arg0);

      try {
         this.field3189 = arg1;
         this.method1832(120);
         this.field3183 = new class601(super.field6445, 6406, 2, new byte[]{0, -1}, 6406);
         this.field3183.method4447(false, false);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3194[5] + (arg0 != null ? field3194[2] : field3194[3]) + ',' + (arg1 != null ? field3194[2] : field3194[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(B)Z",
      line = 75
   )
   public final boolean method1830(byte arg0) {
      try {
         ++field3190;
         int var2 = 109 / ((arg0 - -8) / 57);
         return true;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3194[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(ZI)V",
      line = 86
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         ++field3184;
         if (super.field6445.field9701 > 0) {
            float var3 = -0.5F / (float)super.field6445.field9701;
            super.field6445.method4787(arg1 + -3292, 1);
            class505.field7742[2] = var3;
            class505.field7742[0] = 0.0F;
            class505.field7742[1] = 0.0F;
            class505.field7742[3] = super.field6445.field9747 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class505.field7742, 0);
            OpenGL.glPopMatrix();
            super.field6445.method4789(0.5F, (float)super.field6445.field9701, 6914);
            super.field6445.method4792(-26367, this.field3183);
            super.field6445.method4787(-66, 0);
         }

         if (arg1 != 3211) {
            field3192 = null;
         }

         this.field3186.method5160((byte)-76, '\u0000');
         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(0.25F, 0.25F, 1.0F);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3194[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(I)V",
      line = 123
   )
   private final void method1832(int arg0) {
      try {
         this.field3186 = new class701(super.field6445, 2);
         ++field3188;
         this.field3186.method5162(0, -6177);
         super.field6445.method4787(-69, 1);
         super.field6445.method4803(7681, 260, true);
         super.field6445.method4809(768, (byte)-128, 34168, 0);
         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glEnable(3168);
         super.field6445.method4787(-50, 0);
         OpenGL.glTexEnvf(8960, 34163, 2.0F);
         if (this.field3189.field11530) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
         }

         this.field3186.method5163(-3623);
         this.field3186.method5162(1, -6177);
         super.field6445.method4787(-103, 1);
         super.field6445.method4803(8448, 8448, true);
         super.field6445.method4809(768, (byte)-128, 5890, 0);
         OpenGL.glDisable(3168);
         super.field6445.method4787(-51, 0);
         OpenGL.glTexEnvf(8960, 34163, 1.0F);
         if (arg0 > 7) {
            if (this.field3189.field11530) {
               OpenGL.glDisable(3170);
               OpenGL.glDisable(3171);
            }

            this.field3186.method5163(-3623);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3194[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(III)V",
      line = 173
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      try {
         if (arg1 > -90) {
            this.method1832(73);
         }

         ++field3191;
         if (~(1 & arg2) != -2) {
            if (!this.field3189.field11530) {
               super.field6445.method4792(-26367, this.field3189.field11527[0]);
            } else {
               super.field6445.method4792(-26367, this.field3189.field11533);
               class505.field7742[3] = 0.0F;
               class505.field7742[2] = 0.0F;
               class505.field7742[1] = 0.0F;
               class505.field7742[0] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class505.field7742, 0);
            }
         } else if (this.field3189.field11530) {
            super.field6445.method4792(-26367, this.field3189.field11533);
            class505.field7742[1] = 0.0F;
            class505.field7742[0] = 0.0F;
            class505.field7742[3] = (float)(super.field6445.field9615 % 4000) / 4000.0F;
            class505.field7742[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class505.field7742, 0);
         } else {
            int var4 = super.field6445.field9615 % 4000 * 16 / 4000;
            super.field6445.method4792(-26367, this.field3189.field11527[var4]);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3194[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
