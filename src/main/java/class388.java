import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class388 extends class567 {
   @OriginalMember(
      owner = "client!bc",
      name = "t",
      descriptor = "Lkfa;"
   )
   private class632 field5438;
   @OriginalMember(
      owner = "client!bc",
      name = "u",
      descriptor = "Lfa;"
   )
   private class246 field5432;
   @OriginalMember(
      owner = "client!bc",
      name = "q",
      descriptor = "Llb;"
   )
   private class572 field5435;
   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5439 = new String[]{method2963(method2962("L\u001c")), method2963(method2962("P^oWX")), method2963(method2962("_\u0002 \u0017V[\u00113\u001cK_/6\u0018QN\u0002")), method2963(method2962("I\u0013oELE\u00195G\r")), method2963(method2962("E\u0005-\u0015")), method2963(method2962("I\u0013o;\r")), method2963(method2962("I\u0013o<\r")), method2963(method2962("I\u0013o>\r")), method2963(method2962("I\u0013o?\r")), method2963(method2962("I\u0013o:\r")), method2963(method2962("I\u0013o3\r")), method2963(method2962("I\u0013o8\r"))};
   @OriginalMember(
      owner = "client!bc",
      name = "r",
      descriptor = "Ldd;"
   )
   public static class735 field5430 = new class735(11, 0, 1, 2);
   @OriginalMember(
      owner = "client!bc",
      name = "w",
      descriptor = "I"
   )
   public static int field5428;
   @OriginalMember(
      owner = "client!bc",
      name = "p",
      descriptor = "I"
   )
   public static int field5429;
   @OriginalMember(
      owner = "client!bc",
      name = "y",
      descriptor = "I"
   )
   public static int field5431;
   @OriginalMember(
      owner = "client!bc",
      name = "o",
      descriptor = "I"
   )
   public static int field5434;
   @OriginalMember(
      owner = "client!bc",
      name = "x",
      descriptor = "I"
   )
   public static int field5436;
   @OriginalMember(
      owner = "client!bc",
      name = "v",
      descriptor = "I"
   )
   public static int field5437;
   @OriginalMember(
      owner = "client!bc",
      name = "s",
      descriptor = "[Z"
   )
   public static boolean[] field5433;

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         ++field5436;
         if (!arg0) {
            field5433 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5439[5] + arg0 + ',' + (arg1 != null ? field5439[1] : field5439[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      try {
         ++field5429;
         OpenGL.glBindProgramARB(34336, this.field5435.field7870);
         OpenGL.glEnable(34336);
         super.field7728.method2547(0, class529.field7261, 0);
         if (arg1 != 10286) {
            this.method1(-6, true);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5439[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      try {
         ++field5434;
         int var4 = 115 / ((arg1 - 63) / 58);
         if (this.field5432.field3087) {
            float var5 = (float)(super.field7728.field4578 % 4000) / 4000.0F;
            super.field7728.method2581(this.field5432.field3088, -87);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
         } else {
            int var6 = super.field7728.field4578 % 4000 * 16 / 4000;
            super.field7728.method2581(this.field5432.field3084[var6], -114);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5439[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         ++field5437;
         if (arg0 >= -64) {
            return true;
         } else {
            return this.field5435 != null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5439[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         if (arg0 != -1309) {
            field5430 = null;
         }

         ++field5428;
         super.field7728.method2587(class59.field623, -80, class535.field7314);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5439[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "<init>",
      descriptor = "(Lkfa;Lqh;Lfa;)V"
   )
   public class388(class632 arg0, class74 arg1, class246 arg2) {
      super(arg0);

      try {
         this.field5438 = arg0;
         this.field5432 = arg2;
         if (arg1 != null && this.field5432.method1858(572) && this.field5438.field8949) {
            this.field5435 = class294.method2217(arg1.method720(false, field5439[2], field5439[0]), this.field5438, 34336, 0);
         } else {
            this.field5435 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5439[3] + (arg0 != null ? field5439[1] : field5439[4]) + ',' + (arg1 != null ? field5439[1] : field5439[4]) + ',' + (arg2 != null ? field5439[1] : field5439[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method2961(int arg0) {
      try {
         if (arg0 <= 15) {
            field5433 = null;
         }

         field5433 = null;
         field5430 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5439[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         ++field5431;
         super.field7728.method2547(arg0, class550.field7513, 0);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34820);
         OpenGL.glDisable(34336);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5439[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2962(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2963(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
