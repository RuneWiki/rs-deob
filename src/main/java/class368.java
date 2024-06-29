import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class368 extends class14 {
   @OriginalMember(
      owner = "client!ow",
      name = "x",
      descriptor = "Z"
   )
   private boolean field5031 = false;
   @OriginalMember(
      owner = "client!ow",
      name = "n",
      descriptor = "Lcf;"
   )
   private class631 field5036;
   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5041 = new String[]{method2739(method2738("\u0000V!\u0018\u0011")), method2739(method2738("\u0000V!eP\u0001H{g\u0011")), method2739(method2738("\u0001Tc5")), method2739(method2738("\u0014\u000f!wD")), method2739(method2738("\u0000V!\u001b\u0011")), method2739(method2738("\u0000V!\u0010\u0011")), method2739(method2738("\u0000V!\u001e\u0011")), method2739(method2738("\u0000V!\u0011\u0011")), method2739(method2738("\u0000V!\u001a\u0011")), method2739(method2738("\u0000V!\u001c\u0011"))};
   @OriginalMember(
      owner = "client!ow",
      name = "s",
      descriptor = "I"
   )
   public static int field5029 = 0;
   @OriginalMember(
      owner = "client!ow",
      name = "m",
      descriptor = "Lbl;"
   )
   public static class678 field5038 = null;
   @OriginalMember(
      owner = "client!ow",
      name = "r",
      descriptor = "Leg;"
   )
   public static class118 field5033 = new class118(66, -2);
   @OriginalMember(
      owner = "client!ow",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field5040 = false;
   @OriginalMember(
      owner = "client!ow",
      name = "p",
      descriptor = "I"
   )
   public static int field5030;
   @OriginalMember(
      owner = "client!ow",
      name = "t",
      descriptor = "I"
   )
   public static int field5032;
   @OriginalMember(
      owner = "client!ow",
      name = "v",
      descriptor = "I"
   )
   public static int field5034;
   @OriginalMember(
      owner = "client!ow",
      name = "o",
      descriptor = "I"
   )
   public static int field5035;
   @OriginalMember(
      owner = "client!ow",
      name = "w",
      descriptor = "I"
   )
   public static int field5037;
   @OriginalMember(
      owner = "client!ow",
      name = "q",
      descriptor = "I"
   )
   public static int field5039;

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(BLsl;I)V",
      line = 3
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         ++field5030;
         super.field157.method4107(50, arg1);
         if (arg0 > 75) {
            super.field157.method4134(arg2, 2);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5041[6] + arg0 + ',' + (arg1 != null ? field5041[3] : field5041[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(IZ)V",
      line = 17
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         ++field5034;
         super.field157.method4117(8448, 7681, arg0 ^ -17);
         if (arg0 != 16) {
            this.method87(57);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5041[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "b",
      descriptor = "(I)V",
      line = 34
   )
   public final void method85(int arg0) {
      try {
         if (arg0 != 17328) {
            this.field5036 = null;
         }

         label19: {
            ++field5032;
            if (this.field5031) {
               this.field5036.method4571(false, '\u0001');
               super.field157.method4112((byte)18, 1);
               super.field157.method4107(-127, (class486)null);
               super.field157.method4112((byte)112, 0);
               if (!client.field4360) {
                  break label19;
               }
            }

            super.field157.method4141(false, 0, 770, 5890);
         }

         super.field157.method4117(8448, 8448, -1);
         this.field5031 = false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5041[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "c",
      descriptor = "(I)V",
      line = 57
   )
   public static void method2737(int arg0) {
      try {
         field5033 = null;
         if (arg0 < -70) {
            field5038 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5041[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(I)Z",
      line = 73
   )
   public final boolean method87(int arg0) {
      try {
         if (arg0 > -49) {
            field5038 = null;
         }

         ++field5035;
         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5041[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(ZI)V",
      line = 85
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         if (arg1 == 13254) {
            ++field5039;
            class212 var3 = super.field157.method4171(arg1 + -18943);
            if (this.field5036 != null && var3 != null && arg0) {
               this.field5036.method4571(false, '\u0000');
               super.field157.method4112((byte)118, 1);
               super.field157.method4107(arg1 + -13380, var3);
               OpenGL.glMatrixMode(5890);
               OpenGL.glLoadMatrixf(super.field157.field8387.method3682((byte)-121), 0);
               OpenGL.glMatrixMode(5888);
               super.field157.method4112((byte)-38, 0);
               this.field5031 = true;
            } else {
               super.field157.method4141(false, 0, 770, 34168);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5041[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(III)V",
      line = 112
   )
   public final void method82(int arg0, int arg1, int arg2) {
      try {
         ++field5037;
         if (arg0 != 13880) {
            field5040 = false;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5041[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 125
   )
   public class368(class573 arg0) {
      super(arg0);

      try {
         if (arg0.field8413) {
            this.field5036 = new class631(arg0, 2);
            this.field5036.method4569(0, (byte)-119);
            super.field157.method4112((byte)-33, 1);
            super.field157.method4117(34165, 7681, -1);
            super.field157.method4096(2, (byte)15, 34168, 770);
            super.field157.method4141(false, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field157.method4112((byte)126, 0);
            this.field5036.method4570(256);
            this.field5036.method4569(1, (byte)-126);
            super.field157.method4112((byte)-6, 1);
            super.field157.method4117(8448, 8448, -1);
            super.field157.method4096(2, (byte)15, 34166, 770);
            super.field157.method4141(false, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field157.method4112((byte)-112, 0);
            this.field5036.method4570(256);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5041[1] + (arg0 != null ? field5041[3] : field5041[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2738(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2739(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
