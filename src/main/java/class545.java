import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class545 extends class125 {
   @OriginalMember(
      owner = "client!gda",
      name = "r",
      descriptor = "Z"
   )
   private boolean field7962 = false;
   @OriginalMember(
      owner = "client!gda",
      name = "m",
      descriptor = "Ljea;"
   )
   private class249 field7963;
   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7972 = new String[]{method4122(method4121("\u0011!PdC^")), method4122(method4121("\u0011!PdE^")), method4122(method4121("\u0011!PdA^")), method4122(method4121("\u0011!PdB^")), method4122(method4121("\u0011!PdN^")), method4122(method4121("\u0011!PdG^")), method4122(method4121("\u00180]&")), method4122(method4121("\rk\u001fdy")), method4122(method4121("\u0011!Pd@^")), method4122(method4121("\u0011!PdF^")), method4122(method4121("\u0011!Pd8\u001f+X>:^"))};
   @OriginalMember(
      owner = "client!gda",
      name = "l",
      descriptor = "Ll;"
   )
   public static class292 field7958 = new class292("", 19);
   @OriginalMember(
      owner = "client!gda",
      name = "q",
      descriptor = "Loca;"
   )
   public static class642 field7964 = null;
   @OriginalMember(
      owner = "client!gda",
      name = "n",
      descriptor = "Lse;"
   )
   public static class6 field7967 = new class6(75, 12);
   @OriginalMember(
      owner = "client!gda",
      name = "g",
      descriptor = "I"
   )
   public static int field7959;
   @OriginalMember(
      owner = "client!gda",
      name = "f",
      descriptor = "I"
   )
   public static int field7960;
   @OriginalMember(
      owner = "client!gda",
      name = "s",
      descriptor = "I"
   )
   public static int field7961;
   @OriginalMember(
      owner = "client!gda",
      name = "i",
      descriptor = "I"
   )
   public static int field7965;
   @OriginalMember(
      owner = "client!gda",
      name = "k",
      descriptor = "I"
   )
   public static int field7966;
   @OriginalMember(
      owner = "client!gda",
      name = "j",
      descriptor = "I"
   )
   public static int field7968;
   @OriginalMember(
      owner = "client!gda",
      name = "h",
      descriptor = "I"
   )
   public static int field7970;
   @OriginalMember(
      owner = "client!gda",
      name = "o",
      descriptor = "I"
   )
   public static int field7971;
   @OriginalMember(
      owner = "client!gda",
      name = "p",
      descriptor = "Lwf;"
   )
   public static class541 field7969;

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         ++field7959;
         class789 var3 = super.field1630.method3986(arg1 ^ 3041);
         if (arg1 != 3) {
            this.method347(true);
         }

         if (this.field7963 != null && var3 != null && arg0) {
            this.field7963.method1979('\u0000', arg1 ^ -4);
            super.field1630.method3988(-128, 1);
            super.field1630.method4006(var3, (byte)14);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1630.field7677.method1549(arg1 + 3), 0);
            OpenGL.glMatrixMode(5888);
            super.field1630.method3988(arg1 + -131, 0);
            this.field7962 = true;
         } else {
            super.field1630.method3969(0, 34168, (byte)-127, 770);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7972[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      try {
         ++field7971;
         if (arg0 > -125) {
            field7958 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7972[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         label20: {
            ++field7961;
            if (!this.field7962) {
               super.field1630.method3969(0, 5890, (byte)-124, 770);
               if (!client.field1481) {
                  break label20;
               }
            }

            this.field7963.method1979('\u0001', -1);
            super.field1630.method3988(-128, 1);
            super.field1630.method4006((class549)null, (byte)-127);
            super.field1630.method3988(-128, 0);
         }

         super.field1630.method4022(8448, 34161, 8448);
         if (arg0 == 5) {
            this.field7962 = false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7972[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         ++field7970;
         if (arg0) {
            method4119(-103);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7972[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class545(class530 arg0) {
      super(arg0);

      try {
         if (arg0.field7697) {
            this.field7963 = new class249(arg0, 2);
            this.field7963.method1977(4864, 0);
            super.field1630.method3988(-128, 1);
            super.field1630.method4022(7681, 34161, 34165);
            super.field1630.method3959(-58, 770, 34168, 2);
            super.field1630.method3969(0, 34167, (byte)-120, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field1630.method3988(-128, 0);
            this.field7963.method1976(-112);
            this.field7963.method1977(4864, 1);
            super.field1630.method3988(-128, 1);
            super.field1630.method4022(8448, 34161, 8448);
            super.field1630.method3959(-70, 770, 34166, 2);
            super.field1630.method3969(0, 5890, (byte)-127, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1630.method3988(-128, 0);
            this.field7963.method1976(-111);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7972[10] + (arg0 != null ? field7972[7] : field7972[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4119(int arg0) {
      try {
         field7964 = null;
         field7969 = null;
         field7958 = null;
         if (arg0 != 7681) {
            method4120(-49, 51, 111, -85, -67, (class339)null, false);
         }

         field7967 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7972[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(IIIIILww;Z)V"
   )
   public static final void method4120(int arg0, int arg1, int arg2, int arg3, int arg4, class339 arg5, boolean arg6) {
      try {
         if (arg2 > 62) {
            label29: {
               if (~arg0 >= -1) {
                  class380.method3011(arg6, arg4, arg1, arg3, arg5, (byte)-110);
                  if (!client.field1481) {
                     break label29;
                  }
               }

               class533.field7825 = 1;
               class624.field9229 = arg1;
               class131.field1682 = arg4;
               class471.field6491 = arg5;
               class204.field2599 = arg3;
               class176.field2274 = null;
               class746.field10895 = arg6;
               class242.field3046 = class98.field1305.method5156(277927531) / arg0;
               if (class242.field3046 < 1) {
                  class242.field3046 = 1;
               }
            }

            ++field7965;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7972[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7972[7] : field7972[6]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         ++field7966;
         if (!arg0) {
            field7969 = null;
         }

         super.field1630.method4022(7681, 34161, 8448);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7972[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         ++field7960;
         super.field1630.method4006(arg0, (byte)12);
         if (arg1 != -23385) {
            field7958 = null;
         }

         super.field1630.method4009(arg2, 1);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7972[8] + (arg0 != null ? field7972[7] : field7972[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4121(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4122(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
