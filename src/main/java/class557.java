import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class557 extends class364 implements class177 {
   @OriginalMember(
      owner = "client!ui",
      name = "G",
      descriptor = "I"
   )
   private int field8162;
   @OriginalMember(
      owner = "client!ui",
      name = "C",
      descriptor = "I"
   )
   private int field8168;
   @OriginalMember(
      owner = "client!ui",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8173 = new String[]{method4204(method4203("Mz\u0006FKVz\\D\n")), method4204(method4203("VfD\u0016")), method4204(method4203("C=\u0006T_")), method4204(method4203("Mz\u0006.\n")), method4204(method4203("Mz\u0006,\n")), method4204(method4203("Mz\u0006*\n")), method4204(method4203("Mz\u0006/\n")), method4204(method4203("Mz\u00069c\u0010")), method4204(method4203("Mz\u0006(\n")), method4204(method4203("Mz\u00068\n")), method4204(method4203("Mz\u0006+\n")), method4204(method4203("Mz\u00065\n")), method4204(method4203("Mz\u0006-\n")), method4204(method4203("Mz\u00068c\u0010")), method4204(method4203("Mz\u0006;c\u0010")), method4204(method4203("Mz\u0006)\n"))};
   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field8159 = new int[]{-1, -1, 1, 1};
   @OriginalMember(
      owner = "client!ui",
      name = "H",
      descriptor = "I"
   )
   public static int field8158;
   @OriginalMember(
      owner = "client!ui",
      name = "B",
      descriptor = "I"
   )
   public static int field8160;
   @OriginalMember(
      owner = "client!ui",
      name = "y",
      descriptor = "I"
   )
   public static int field8161;
   @OriginalMember(
      owner = "client!ui",
      name = "E",
      descriptor = "I"
   )
   public static int field8163;
   @OriginalMember(
      owner = "client!ui",
      name = "A",
      descriptor = "I"
   )
   public static int field8164;
   @OriginalMember(
      owner = "client!ui",
      name = "D",
      descriptor = "I"
   )
   public static int field8165;
   @OriginalMember(
      owner = "client!ui",
      name = "K",
      descriptor = "I"
   )
   public static int field8166;
   @OriginalMember(
      owner = "client!ui",
      name = "J",
      descriptor = "I"
   )
   public static int field8167;
   @OriginalMember(
      owner = "client!ui",
      name = "F",
      descriptor = "I"
   )
   public static int field8169;
   @OriginalMember(
      owner = "client!ui",
      name = "I",
      descriptor = "I"
   )
   public static int field8170;
   @OriginalMember(
      owner = "client!ui",
      name = "w",
      descriptor = "I"
   )
   public static int field8171;
   @OriginalMember(
      owner = "client!ui",
      name = "x",
      descriptor = "I"
   )
   public static int field8172;

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(Llea;II[III)V"
   )
   public class557(class574 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class606.field8967, class576.field8541, arg1 * arg2, false);

      try {
         this.field8162 = arg2;
         this.field8168 = arg1;
         super.field5058.method2265(this, (byte)-99);
         OpenGL.glPixelStorei(3314, arg5);
         OpenGL.glTexImage2Di(super.field5055, 0, 6408, this.field8168, this.field8162, 0, 32993, super.field5058.field8524, arg3, arg4 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field8173[0] + (arg0 != null ? field8173[2] : field8173[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8173[2] : field8173[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(III[BLdja;IIII)V"
   )
   public final void method1515(int arg0, int arg1, int arg2, byte[] arg3, class45 arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg7 == 0) {
            arg7 = arg5;
         }

         super.field5058.method2265(this, (byte)-36);
         ++field8169;
         OpenGL.glPixelStorei(3317, 1);
         if (arg5 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
         }

         OpenGL.glTexSubImage2Dub(super.field5055, 0, arg6, arg1, arg5, arg2, class615.method4531(114, arg4), 5121, arg3, arg0);
         if (arg5 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
         if (arg8 > -74) {
            this.field8168 = -118;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8173[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8173[2] : field8173[1]) + ',' + (arg4 != null ? field8173[2] : field8173[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1513(byte arg0) {
      try {
         ++field8172;
         return arg0 != -115 ? 22 : this.field8162;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8173[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(BF)F"
   )
   public final float method1514(byte arg0, float arg1) {
      try {
         if (arg0 <= 28) {
            this.method1510(68, 0.6010167F);
         }

         ++field8164;
         return arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8173[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(Llea;Ldja;II[BII)V"
   )
   public class557(class574 arg0, class45 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class576.field8541, arg2 * arg3, false);

      try {
         this.field8168 = arg2;
         this.field8162 = arg3;
         super.field5058.method2265(this, (byte)-12);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Dub(super.field5055, 0, this.method2866(false), arg2, arg3, 0, class615.method4531(-21, super.field5056), 5121, arg4, arg5);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8173[0] + (arg0 != null ? field8173[2] : field8173[1]) + ',' + (arg1 != null ? field8173[2] : field8173[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8173[2] : field8173[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(ZZI)V"
   )
   public final void method1516(boolean arg0, boolean arg1, int arg2) {
      try {
         if (arg2 != 13852) {
            field8159 = null;
         }

         ++field8160;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8173[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(I[IIIIIII)V"
   )
   public final void method1512(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg4 != -29005) {
            this.method1517(76);
         }

         ++field8158;
         if (arg0 == 0) {
            arg0 = arg2;
         }

         super.field5058.method2265(this, (byte)70);
         if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg0);
         }

         OpenGL.glTexSubImage2Di(super.field5055, 0, arg7, arg6, arg2, arg5, 32993, super.field5058.field8524, arg1, arg3);
         if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field8173[10] + arg0 + ',' + (arg1 != null ? field8173[2] : field8173[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(IF)F"
   )
   public final float method1510(int arg0, float arg1) {
      try {
         int var3 = 110 % ((arg0 - 5) / 36);
         ++field8165;
         return arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8173[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1517(int arg0) {
      try {
         if (arg0 != 20668) {
            this.method1512(-17, (int[])null, -119, -120, -4, 104, -84, -117);
         }

         ++field8161;
         return false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8173[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(Llea;Ldja;Lwn;II)V"
   )
   public class557(class574 arg0, class45 arg1, class576 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);

      try {
         this.field8168 = arg3;
         this.field8162 = arg4;
         super.field5058.method2265(this, (byte)-13);
         OpenGL.glTexImage2Dub(super.field5055, 0, this.method2866(false), arg3, arg4, 0, class615.method4531(94, super.field5056), class624.method4617(super.field5053, false), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8173[0] + (arg0 != null ? field8173[2] : field8173[1]) + ',' + (arg1 != null ? field8173[2] : field8173[1]) + ',' + (arg2 != null ? field8173[2] : field8173[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   public final void method1509(int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(Llea;Ldja;II[FII)V"
   )
   public class557(class574 arg0, class45 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class576.field8545, arg2 * arg3, false);

      try {
         this.field8168 = arg2;
         this.field8162 = arg3;
         super.field5058.method2265(this, (byte)-76);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Df(super.field5055, 0, this.method2866(false), arg2, arg3, 0, class615.method4531(-106, super.field5056), 5126, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8173[0] + (arg0 != null ? field8173[2] : field8173[1]) + ',' + (arg1 != null ? field8173[2] : field8173[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8173[2] : field8173[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(JI)I"
   )
   public static final int method4199(long arg0, int arg1) {
      try {
         ++field8170;
         if (arg1 != 0) {
            method4201(58, 71, -38, 17, -14, -65);
         }

         return (int)(arg0 / 86400000L) + -11745;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8173[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1511(int arg0) {
      try {
         ++field8167;
         if (arg0 != 23351) {
            this.field8162 = -65;
         }

         return this.field8168;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8173[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method4200(byte arg0) {
      try {
         if (arg0 != 13) {
            method4202(true);
         }

         field8159 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8173[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method4201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field8163;
         int var11 = arg1 + 1;
         class385.method3045(arg3, arg0, class237.field3001[arg1], arg5, (byte)-64);
         int var12 = arg4 - 1;
         class385.method3045(arg3, arg0, class237.field3001[arg4], arg5, (byte)-103);
         int var7 = var11;
         int[] var8;
         if (var6) {
            var8 = class237.field3001[var11];
            var8[arg5] = var8[arg0] = arg3;
            var7 = var11 + 1;
         }

         while(~var12 <= ~var7) {
            var8 = class237.field3001[var7];
            var8[arg5] = var8[arg0] = arg3;
            ++var7;
         }

         if (arg2 != -1) {
            method4199(-96L, -19);
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field8173[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method4202(boolean arg0) {
      boolean var1 = client.field1481;

      try {
         ++field8166;
         class431 var2 = class387.field5365.field8764;

         while(true) {
            if (var2.method3334((byte)-122, class387.field5365.field8776) >= 15) {
               int var3 = var2.method3335(4756, 15);
               if (~var3 != -32768) {
                  boolean var4 = false;
                  class411 var5 = (class411)class35.field493.method1818(-1, (long)var3);
                  if (var5 == null) {
                     class81 var6 = new class81();
                     var6.field145 = var3;
                     var5 = new class411(var6);
                     class35.field493.method1808((long)var3, var5, 26459);
                     class332.field4584[class418.field5713++] = var5;
                     var4 = true;
                  }

                  class81 var7 = var5.field5654;
                  class277.field3534[class737.field10798++] = var3;
                  var7.field155 = class420.field5739;
                  if (var7.field1135 != null && var7.field1135.method3598(0)) {
                     class215.method1756(var7, 0);
                  }

                  int var8 = var2.method3335(4756, 1);
                  int var9 = var2.method3335(4756, 5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }

                  int var10 = var2.method3335(4756, 2);
                  int var11 = var2.method3335(4756, 1);
                  if (~var11 == -2) {
                     class705.field10310[class472.field6505++] = var3;
                  }

                  var7.method787(!arg0, class270.field3460.method5197(var2.method3335(4756, 14), -127));
                  int var12 = var2.method3335(4756, 5);
                  if (~var12 < -16) {
                     var12 -= 32;
                  }

                  int var13 = (85983239 & var2.method3335(4756, 3) - -4) << 11;
                  var7.method89(var7.field1135.field6546, -1000);
                  var7.field162 = var7.field1135.field6565 << 3;
                  if (var4) {
                     var7.method79(true, 115, var13);
                  }

                  var7.method783(class204.field2593.field210[0] + var12, var10, ~var8 == -2, 126, class204.field2593.field205[0] - -var9, var7.method78(0));
                  if (!var7.field1135.method3598(0)) {
                     continue;
                  }

                  class647.method4754(256, (class783)null, var7.field205[0], var7.field10457, var7.field210[0], (class294)null, 0, var7);
                  if (var1) {
                     break;
                  }

                  if (!var1) {
                     continue;
                  }
               }
            }

            var2.method3328(arg0);
            break;
         }

      } catch (RuntimeException var15) {
         throw class93.method866(var15, field8173[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4203(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4204(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
