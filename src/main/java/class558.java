import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class558 extends class515 {
   @OriginalMember(
      owner = "client!bea",
      name = "g",
      descriptor = "Lqk;"
   )
   private class118 field7912;
   @OriginalMember(
      owner = "client!bea",
      name = "f",
      descriptor = "Lgca;"
   )
   private class50 field7917;
   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7929 = new String[]{method4155(method4154("+p8Tf")), method4155(method4154(">+z\u0016")), method4155(method4154("2;wTXx")), method4155(method4154("2;wT^x")), method4155(method4154("2;wTYx")), method4155(method4154("2;wT\\x")), method4155(method4154("2;wTRx")), method4155(method4154("2;wT]x")), method4155(method4154("2;wT'90\u007f\u000e%x")), method4155(method4154("2;wT_x")), method4155(method4154("2;wTZx")), method4155(method4154("2;wTSx"))};
   @OriginalMember(
      owner = "client!bea",
      name = "k",
      descriptor = "Lfm;"
   )
   public static class164 field7915 = new class164(3, 4);
   @OriginalMember(
      owner = "client!bea",
      name = "r",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field7923 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   @OriginalMember(
      owner = "client!bea",
      name = "h",
      descriptor = "I"
   )
   public static int field7927 = 0;
   @OriginalMember(
      owner = "client!bea",
      name = "l",
      descriptor = "Lhha;"
   )
   public static class724 field7926 = new class724(60, 4);
   @OriginalMember(
      owner = "client!bea",
      name = "o",
      descriptor = "I"
   )
   public static int field7911;
   @OriginalMember(
      owner = "client!bea",
      name = "p",
      descriptor = "I"
   )
   public static int field7913;
   @OriginalMember(
      owner = "client!bea",
      name = "q",
      descriptor = "I"
   )
   public static int field7914;
   @OriginalMember(
      owner = "client!bea",
      name = "n",
      descriptor = "I"
   )
   public static int field7916;
   @OriginalMember(
      owner = "client!bea",
      name = "j",
      descriptor = "I"
   )
   public static int field7918;
   @OriginalMember(
      owner = "client!bea",
      name = "s",
      descriptor = "I"
   )
   public static int field7919;
   @OriginalMember(
      owner = "client!bea",
      name = "t",
      descriptor = "I"
   )
   public static int field7920;
   @OriginalMember(
      owner = "client!bea",
      name = "i",
      descriptor = "I"
   )
   public static int field7921;
   @OriginalMember(
      owner = "client!bea",
      name = "v",
      descriptor = "I"
   )
   public static int field7925;
   @OriginalMember(
      owner = "client!bea",
      name = "u",
      descriptor = "Lsa;"
   )
   public static class39 field7924;
   @OriginalMember(
      owner = "client!bea",
      name = "w",
      descriptor = "[Ls;"
   )
   public static class751[] field7922;
   @OriginalMember(
      owner = "client!bea",
      name = "m",
      descriptor = "[Lbh;"
   )
   public static class758[] field7928;

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         int var4 = 125 / ((-44 - arg0) / 41);
         ++field7914;
         super.field7307.method4906(-2, arg1);
         super.field7307.method4947(false, arg2);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7929[10] + arg0 + ',' + (arg1 != null ? field7929[0] : field7929[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "<init>",
      descriptor = "(Laea;Lqk;)V"
   )
   public class558(class678 arg0, class118 arg1) {
      super(arg0);

      try {
         this.field7912 = arg1;
         this.field7917 = new class50(arg0, 2);
         this.field7917.method544(0, -90);
         super.field7307.method4958(1, false);
         if (this.field7912.field1858) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
         }

         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glTexGeni(8193, 9472, 9216);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         super.field7307.method4958(0, false);
         this.field7917.method545((byte)93);
         this.field7917.method544(1, -83);
         super.field7307.method4958(1, false);
         if (this.field7912.field1858) {
            OpenGL.glDisable(3170);
         }

         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         super.field7307.method4958(0, false);
         this.field7917.method545((byte)93);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7929[8] + (arg0 != null ? field7929[0] : field7929[1]) + ',' + (arg1 != null ? field7929[0] : field7929[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      try {
         if (arg1 != 3) {
            field7924 = null;
         }

         ++field7913;
         this.field7917.method547('\u0000', true);
         if (this.field7912.field1858) {
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, this.field7912.field1852);
            super.field7307.method4958(0, false);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7929[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         this.field7917.method547('\u0001', true);
         ++field7916;
         super.field7307.method4958(1, false);
         super.field7307.method4906(-2, (class719)null);
         super.field7307.method4958(0, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7929[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         ++field7919;
         if (arg0 != -15) {
            this.method133(true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7929[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         float var5;
         float var6;
         float var7;
         label34: {
            ++field7918;
            var5 = (float)((3 & arg2) - -1) * -5.0E-4F;
            var6 = (float)(((arg2 & 30) >> 3) - -1) * 5.0E-4F;
            var7 = (arg2 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
            boolean var8 = (128 & arg2) != 0;
            int var9 = 75 % ((-57 - arg1) / 60);
            super.field7307.method4958(1, false);
            if (var8) {
               class510.field7241[0] = var7;
               class510.field7241[3] = 0.0F;
               class510.field7241[2] = 0.0F;
               class510.field7241[1] = 0.0F;
               if (!var4) {
                  break label34;
               }
            }

            class510.field7241[3] = 0.0F;
            class510.field7241[0] = 0.0F;
            class510.field7241[1] = 0.0F;
            class510.field7241[2] = var7;
         }

         label29: {
            OpenGL.glTexGenfv(8192, 9474, class510.field7241, 0);
            class510.field7241[1] = var7;
            class510.field7241[2] = 0.0F;
            class510.field7241[3] = (float)super.field7307.field9679 * var5 % 1.0F;
            class510.field7241[0] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class510.field7241, 0);
            if (!this.field7912.field1858) {
               int var10 = (int)((float)super.field7307.field9679 * var6 * 16.0F);
               super.field7307.method4906(-2, this.field7912.field1857[var10 % 16]);
               if (!var4) {
                  break label29;
               }
            }

            class510.field7241[2] = 0.0F;
            class510.field7241[3] = (float)super.field7307.field9679 * var6 % 1.0F;
            class510.field7241[1] = 0.0F;
            class510.field7241[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class510.field7241, 0);
         }

         super.field7307.method4958(0, false);
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field7929[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(ZLlw;)I"
   )
   public static final int method4151(boolean arg0, class408 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field7920;
         if (arg0) {
            method4153((byte)-1, (String)null);
         }

         int var3 = arg1.method3195(116, 2);
         int var4;
         if (var3 == 0) {
            var4 = 0;
            if (!var2) {
               return var4;
            }
         }

         if (~var3 == -2) {
            var4 = arg1.method3195(113, 5);
            if (!var2) {
               return var4;
            }
         }

         if (var3 != 2) {
            var4 = arg1.method3195(113, 11);
            if (!var2) {
               return var4;
            }
         }

         var4 = arg1.method3195(127, 8);
         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7929[2] + arg0 + ',' + (arg1 != null ? field7929[0] : field7929[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4152(int arg0) {
      try {
         field7924 = null;
         field7928 = null;
         field7915 = null;
         field7923 = null;
         field7926 = null;
         if (arg0 != 19860) {
            field7925 = -124;
         }

         field7922 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7929[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method4153(byte arg0, String arg1) {
      try {
         if (arg0 != 94) {
            field7924 = null;
         }

         ++field7921;
         String var2 = class4.method29(-32611, class791.method5708(-30, arg1));
         if (var2 == null) {
            var2 = "";
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7929[9] + arg0 + ',' + (arg1 != null ? field7929[0] : field7929[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         if (arg0 != 19455) {
            return false;
         } else {
            ++field7911;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7929[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4154(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4155(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
