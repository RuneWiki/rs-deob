import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class16 extends class515 {
   @OriginalMember(
      owner = "client!sw",
      name = "n",
      descriptor = "Z"
   )
   private boolean field216 = false;
   @OriginalMember(
      owner = "client!sw",
      name = "k",
      descriptor = "Lgca;"
   )
   private class50 field221;
   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field226 = new String[]{method139(method138("OL3FP")), method139(method138("RNqh")), method139(method138("G\u00153*\u0005")), method139(method138("OL38\u0011RRi:P")), method139(method138("OL3AP")), method139(method138("OL3BP")), method139(method138("OL3EP")), method139(method138("OL3GP")), method139(method138("OL3MP")), method139(method138("OL3LP"))};
   @OriginalMember(
      owner = "client!sw",
      name = "i",
      descriptor = "F"
   )
   public static float field222 = 1.0F;
   @OriginalMember(
      owner = "client!sw",
      name = "m",
      descriptor = "I"
   )
   public static int field217;
   @OriginalMember(
      owner = "client!sw",
      name = "l",
      descriptor = "I"
   )
   public static int field218;
   @OriginalMember(
      owner = "client!sw",
      name = "j",
      descriptor = "I"
   )
   public static int field219;
   @OriginalMember(
      owner = "client!sw",
      name = "f",
      descriptor = "I"
   )
   public static int field223;
   @OriginalMember(
      owner = "client!sw",
      name = "o",
      descriptor = "I"
   )
   public static int field224;
   @OriginalMember(
      owner = "client!sw",
      name = "g",
      descriptor = "I"
   )
   public static int field225;
   @OriginalMember(
      owner = "client!sw",
      name = "h",
      descriptor = "[[B"
   )
   public static byte[][] field220;

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         ++field219;
         super.field7307.method4906(-2, arg1);
         super.field7307.method4947(false, arg2);
         int var4 = -8 % ((-44 - arg0) / 41);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field226[6] + arg0 + ',' + (arg1 != null ? field226[2] : field226[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         super.field7307.method4931(8448, 7681, arg0 + 15);
         if (arg0 != -15) {
            this.method132(-28, false);
         }

         ++field223;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field226[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         label25: {
            ++field225;
            if (!this.field216) {
               super.field7307.method4933(770, 5890, 0, true);
               if (!client.field10022) {
                  break label25;
               }
            }

            this.field221.method547('\u0001', !arg0);
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, (class719)null);
            super.field7307.method4958(0, arg0);
         }

         super.field7307.method4931(8448, 8448, 0);
         this.field216 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field226[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method134(int arg0) {
      try {
         if (arg0 != 9472) {
            method134(70);
         }

         field220 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field226[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         ++field224;
         if (arg0 != 19455) {
            this.method133(false);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field226[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class16(class678 arg0) {
      super(arg0);

      try {
         if (arg0.field9819) {
            this.field221 = new class50(arg0, 2);
            this.field221.method544(0, 12);
            super.field7307.method4958(1, false);
            super.field7307.method4931(34165, 7681, 0);
            super.field7307.method4909(34168, 770, 2, (byte)-12);
            super.field7307.method4933(770, 34167, 0, true);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field7307.method4958(0, false);
            this.field221.method545((byte)93);
            this.field221.method544(1, 113);
            super.field7307.method4958(1, false);
            super.field7307.method4931(8448, 8448, 0);
            super.field7307.method4909(34166, 770, 2, (byte)-108);
            super.field7307.method4933(770, 5890, 0, true);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field7307.method4958(0, false);
            this.field221.method545((byte)93);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field226[3] + (arg0 != null ? field226[2] : field226[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      try {
         ++field218;
         if (arg1 != 3) {
            this.method133(false);
         }

         class763 var3 = super.field7307.method4895((byte)-126);
         if (this.field221 != null && var3 != null && arg0) {
            this.field221.method547('\u0000', true);
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7307.field9716.method2401(26260), 0);
            OpenGL.glMatrixMode(5888);
            super.field7307.method4958(0, false);
            this.field216 = true;
         } else {
            super.field7307.method4933(770, 34168, 0, true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field226[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      try {
         ++field217;
         int var4 = -7 / ((-57 - arg1) / 60);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field226[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method138(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method139(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
