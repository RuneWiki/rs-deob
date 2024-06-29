import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class46 extends class757 {
   @OriginalMember(
      owner = "client!vo",
      name = "q",
      descriptor = "Z"
   )
   private boolean field529 = false;
   @OriginalMember(
      owner = "client!vo",
      name = "o",
      descriptor = "Laga;"
   )
   private class697 field531;
   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field536 = new String[]{method396(method395("7U\u0007wo")), method396(method395("7U\u0007{o")), method396(method395(":\u0014\u0007\u0013:")), method396(method395("/OEQ")), method396(method395("7U\u0007uo")), method396(method395("7U\u0007to")), method396(method395("7U\u0007yo")), method396(method395("7U\u0007|o")), method396(method395("7U\u0007\u0001./S]\u0003o")), method396(method395("7U\u0007vo")), method396(method395("7U\u0007~o")), method396(method395("7U\u0007\u007fo")), method396(method395("7U\u0007zo")), method396(method395("7U\u0007xo"))};
   @OriginalMember(
      owner = "client!vo",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field527 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!vo",
      name = "s",
      descriptor = "Liha;"
   )
   public static class32 field521;
   @OriginalMember(
      owner = "client!vo",
      name = "f",
      descriptor = "Liha;"
   )
   public static class32 field528 = field521 = new class32(false);
   @OriginalMember(
      owner = "client!vo",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field532 = null;
   @OriginalMember(
      owner = "client!vo",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field534 = false;
   @OriginalMember(
      owner = "client!vo",
      name = "j",
      descriptor = "I"
   )
   public static int field517;
   @OriginalMember(
      owner = "client!vo",
      name = "k",
      descriptor = "I"
   )
   public static int field518;
   @OriginalMember(
      owner = "client!vo",
      name = "h",
      descriptor = "I"
   )
   public static int field519;
   @OriginalMember(
      owner = "client!vo",
      name = "p",
      descriptor = "I"
   )
   public static int field520;
   @OriginalMember(
      owner = "client!vo",
      name = "n",
      descriptor = "I"
   )
   public static int field522;
   @OriginalMember(
      owner = "client!vo",
      name = "l",
      descriptor = "I"
   )
   public static int field523;
   @OriginalMember(
      owner = "client!vo",
      name = "t",
      descriptor = "I"
   )
   public static int field524;
   @OriginalMember(
      owner = "client!vo",
      name = "g",
      descriptor = "I"
   )
   public static int field525;
   @OriginalMember(
      owner = "client!vo",
      name = "u",
      descriptor = "I"
   )
   public static int field526;
   @OriginalMember(
      owner = "client!vo",
      name = "e",
      descriptor = "I"
   )
   public static int field530;
   @OriginalMember(
      owner = "client!vo",
      name = "m",
      descriptor = "I"
   )
   public static int field533;
   @OriginalMember(
      owner = "client!vo",
      name = "i",
      descriptor = "I"
   )
   public static int field535;

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method384(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         if (arg1 == 500) {
            super.field10974.method4862(7681, 8448, 77);
            ++field520;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field536[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      try {
         if (arg1 >= -118) {
            field534 = false;
         }

         ++field522;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field536[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         ++field530;
         if (arg0 == -96) {
            super.field10974.method4848(false, arg2);
            super.field10974.method4879(arg0 + 96, arg1);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field536[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field536[2] : field536[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         label16: {
            ++field523;
            int var2 = 102 / ((48 - arg0) / 63);
            if (this.field529) {
               this.field531.method5070('\u0001', 4);
               super.field10974.method4841(1, 33984);
               super.field10974.method4848(false, (class573)null);
               super.field10974.method4841(0, 33984);
               if (!client.field4273) {
                  break label16;
               }
            }

            super.field10974.method4906((byte)26, 770, 0, 5890);
         }

         super.field10974.method4862(8448, 8448, 127);
         this.field529 = false;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field536[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method389(byte arg0) {
      try {
         field521 = null;
         field528 = null;
         field527 = null;
         field532 = null;
         if (arg0 <= 34) {
            field527 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field536[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method390(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -28538) {
            return false;
         } else {
            ++field518;
            return (arg0 & 2048) != 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field536[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      try {
         ++field526;
         class681 var3 = super.field10974.method4900(true);
         if (arg0 <= 24) {
            method384((byte)19);
         }

         if (this.field531 != null && var3 != null && arg1) {
            this.field531.method5070('\u0000', 4);
            super.field10974.method4841(1, 33984);
            super.field10974.method4848(false, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field10974.field9746.method3809(true), 0);
            OpenGL.glMatrixMode(5888);
            super.field10974.method4841(0, 33984);
            this.field529 = true;
         } else {
            super.field10974.method4906((byte)26, 770, 0, 34168);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field536[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         if (arg0 <= 110) {
            field521 = null;
         }

         ++field517;
         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field536[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(Ljava/lang/String;II)I"
   )
   public static final int method393(String arg0, int arg1, int arg2) {
      try {
         ++field519;
         if (arg2 != -2822) {
            field533 = 107;
         }

         return class608.method4442(true, arg2 ^ -2822, arg0, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field536[4] + (arg0 != null ? field536[2] : field536[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method394(boolean arg0) {
      try {
         ++field525;
         class693.field10117 = 0;
         int var1 = (class278.field3709.field999 >> 9) + class752.field10921;
         if (arg0) {
            method389((byte)66);
         }

         int var2 = (class278.field3709.field1003 >> 9) - -class17.field237;
         if (~var1 <= -3054 && var1 <= 3156 && ~var2 <= -3057 && ~var2 >= -3137) {
            class693.field10117 = 1;
         }

         if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class693.field10117 = 1;
         }

         if (class693.field10117 == 1 && var1 >= 3139 && var1 <= 3199 && ~var2 <= -3009 && ~var2 >= -3063) {
            class693.field10117 = 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field536[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class46(class670 arg0) {
      super(arg0);

      try {
         if (arg0.field9781) {
            this.field531 = new class697(arg0, 2);
            this.field531.method5069(109, 0);
            super.field10974.method4841(1, 33984);
            super.field10974.method4862(7681, 34165, 40);
            super.field10974.method4901(770, 2, 34168, 5);
            super.field10974.method4906((byte)26, 770, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field10974.method4841(0, 33984);
            this.field531.method5068((byte)119);
            this.field531.method5069(121, 1);
            super.field10974.method4841(1, 33984);
            super.field10974.method4862(8448, 8448, 110);
            super.field10974.method4901(770, 2, 34166, 5);
            super.field10974.method4906((byte)26, 770, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field10974.method4841(0, 33984);
            this.field531.method5068((byte)119);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field536[8] + (arg0 != null ? field536[2] : field536[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method395(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method396(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
