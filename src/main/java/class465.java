import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class465 extends class393 {
   @OriginalMember(
      owner = "client!maa",
      name = "u",
      descriptor = "Llea;"
   )
   private class574 field6391;
   @OriginalMember(
      owner = "client!maa",
      name = "w",
      descriptor = "Ldd;"
   )
   private class712 field6392;
   @OriginalMember(
      owner = "client!maa",
      name = "B",
      descriptor = "Lqia;"
   )
   private class575 field6396;
   @OriginalMember(
      owner = "client!maa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6407 = new String[]{method3543(method3542("c2crO&")), method3543(method3542("c2crZ&")), method3543(method3542("c2crM&")), method3543(method3542("c2crY&")), method3543(method3542("u},ru")), method3543(method3542("`&n0")), method3543(method3542("c2crB&")), method3543(method3542("c2crK&")), method3543(method3542("c2crL&")), method3543(method3542("c2crF&")), method3543(method3542("c2crC&")), method3543(method3542("c2crA&")), method3543(method3542("c2crX&")), method3543(method3542("i?")), method3543(method3542("c2cr4g=k(6&")), method3543(method3542("z!c2{~2p9fz\fu=|k!"))};
   @OriginalMember(
      owner = "client!maa",
      name = "A",
      descriptor = "Llja;"
   )
   public static class728 field6393 = new class728();
   @OriginalMember(
      owner = "client!maa",
      name = "k",
      descriptor = "F"
   )
   public static float field6405 = 1.0F;
   @OriginalMember(
      owner = "client!maa",
      name = "s",
      descriptor = "Laka;"
   )
   public static class418 field6406 = new class418(8, 6);
   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "F"
   )
   public static float field6389;
   @OriginalMember(
      owner = "client!maa",
      name = "x",
      descriptor = "I"
   )
   public static int field6388;
   @OriginalMember(
      owner = "client!maa",
      name = "p",
      descriptor = "I"
   )
   public static int field6390;
   @OriginalMember(
      owner = "client!maa",
      name = "l",
      descriptor = "I"
   )
   public static int field6394;
   @OriginalMember(
      owner = "client!maa",
      name = "q",
      descriptor = "I"
   )
   public static int field6395;
   @OriginalMember(
      owner = "client!maa",
      name = "o",
      descriptor = "I"
   )
   public static int field6397;
   @OriginalMember(
      owner = "client!maa",
      name = "v",
      descriptor = "I"
   )
   public static int field6398;
   @OriginalMember(
      owner = "client!maa",
      name = "t",
      descriptor = "I"
   )
   public static int field6399;
   @OriginalMember(
      owner = "client!maa",
      name = "y",
      descriptor = "I"
   )
   public static int field6400;
   @OriginalMember(
      owner = "client!maa",
      name = "r",
      descriptor = "I"
   )
   public static int field6401;
   @OriginalMember(
      owner = "client!maa",
      name = "j",
      descriptor = "I"
   )
   public static int field6402;
   @OriginalMember(
      owner = "client!maa",
      name = "m",
      descriptor = "I"
   )
   public static int field6403;
   @OriginalMember(
      owner = "client!maa",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field6404;

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      try {
         if (arg1 == 32) {
            ++field6399;
            OpenGL.glBindProgramARB(34336, this.field6396.field8527);
            OpenGL.glEnable(34336);
            super.field5438.method2288((byte)-10, class48.field640, 0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6407[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      try {
         super.field5438.method2288((byte)-10, class363.field5039, 0);
         ++field6397;
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34820);
         int var2 = 61 / ((arg0 - 22) / 63);
         OpenGL.glDisable(34336);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6407[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "<init>",
      descriptor = "(Llea;Lww;Ldd;)V"
   )
   public class465(class574 arg0, class339 arg1, class712 arg2) {
      super(arg0);

      try {
         this.field6391 = arg0;
         this.field6392 = arg2;
         if (arg1 != null && this.field6392.method5201((byte)-87) && this.field6391.field8520) {
            this.field6396 = class92.method851(arg1.method2692(field6407[13], field6407[15], (byte)-86), (byte)70, this.field6391, 34336);
         } else {
            this.field6396 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6407[14] + (arg0 != null ? field6407[4] : field6407[5]) + ',' + (arg1 != null ? field6407[4] : field6407[5]) + ',' + (arg2 != null ? field6407[4] : field6407[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3537(int arg0) {
      try {
         if (arg0 != 10131) {
            field6400 = -72;
         }

         field6406 = null;
         field6393 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6407[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method3538(int arg0) {
      try {
         if (arg0 != -26506) {
            return 33;
         } else {
            ++field6402;
            return ~class175.field2258 == -2 ? class409.field5641 : 0;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6407[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      try {
         ++field6401;
         if (arg1 != 7313) {
            field6400 = -114;
         }

         if (this.field6392.field10445) {
            float var4 = (float)(super.field5438.field3805 % 4000) / 4000.0F;
            super.field5438.method2265(this.field6392.field10444, (byte)111);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
         } else {
            int var5 = super.field5438.field3805 % 4000 * 16 / 4000;
            super.field5438.method2265(this.field6392.field10455[var5], (byte)94);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6407[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         if (arg1 < 84) {
            method3538(-125);
         }

         ++field6398;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6407[6] + (arg0 != null ? field6407[4] : field6407[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public static final void method3539(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         ++field6390;
         class487 var5 = class2.method12((long)arg1, 8, (byte)43);
         int var6 = 8 / ((arg4 - -27) / 54);
         var5.method3694(-21792);
         var5.field6797 = arg3;
         var5.field6794 = arg2;
         var5.field6791 = arg0;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6407[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         ++field6388;
         if (arg0) {
            method3538(98);
         }

         return this.field6396 != null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6407[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         super.field5438.method2231(class318.field4380, class242.field3052, (byte)93);
         ++field6403;
         if (arg0 != 29404) {
            method3538(11);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6407[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3540(int arg0, int arg1) {
      try {
         ++field6395;
         if (arg1 != 0) {
            field6406 = null;
         }

         class373.field5222.method3197(arg1 ^ 5, arg0);
         class151.field1879.method3197(5, arg0);
         class390.field5406.method3197(arg1 + 5, arg0);
         class266.field3370.method3197(5, arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6407[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method3541(long arg0, int arg1) {
      try {
         ++field6394;
         if (arg1 != 0) {
            field6389 = 0.9023498F;
         }

         try {
            Thread.sleep(arg0);
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6407[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3542(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3543(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
