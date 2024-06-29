import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class501 extends class331 {
   @OriginalMember(
      owner = "client!qq",
      name = "J",
      descriptor = "Z"
   )
   private boolean field7434 = false;
   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "[F"
   )
   private float[] field7443 = new float[4];
   @OriginalMember(
      owner = "client!qq",
      name = "A",
      descriptor = "Z"
   )
   private boolean field7455;
   @OriginalMember(
      owner = "client!qq",
      name = "y",
      descriptor = "Lrda;"
   )
   private class690 field7448;
   @OriginalMember(
      owner = "client!qq",
      name = "o",
      descriptor = "Lrda;"
   )
   private class690 field7441;
   @OriginalMember(
      owner = "client!qq",
      name = "r",
      descriptor = "Lrda;"
   )
   private class690 field7437;
   @OriginalMember(
      owner = "client!qq",
      name = "s",
      descriptor = "Lrda;"
   )
   private class690 field7447;
   @OriginalMember(
      owner = "client!qq",
      name = "t",
      descriptor = "Loia;"
   )
   private class95 field7438;
   @OriginalMember(
      owner = "client!qq",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7457 = new String[]{method3742(method3741("Y\u0017]nk")), method3742(method3741("Y\u0017]\u0015*F\u000f\u0007\u0017k")), method3742(method3741("]\u0011,D,L\u0003\u001fv6F\n\u001a]")), method3742(method3741("SH]\u0007>")), method3742(method3741("F\u0013\u001fE")), method3742(method3741("]\u0011,N1G\u0013\u001dM\u001cD\u000f\u0007")), method3742(method3741("]\u0011,N1G\u0013\u001dM\u001c]\b\u001f@7")), method3742(method3741("]\u0011,D,L\u0003\u001fv/A\u0012")), method3742(method3741("O\n")), method3742(method3741("Y\u0017]gk")), method3742(method3741("Y\u0017]jk")), method3742(method3741("Y\u0017]ok")), method3742(method3741("Y\u0017]bk")), method3742(method3741("Y\u0017]kk")), method3742(method3741("Y\u0017]ak")), method3742(method3741("Y\u0017]`k")), method3742(method3741("Y\u0017]ck")), method3742(method3741("Y\u0017]dk"))};
   @OriginalMember(
      owner = "client!qq",
      name = "x",
      descriptor = "I"
   )
   public static int field7454 = 0;
   @OriginalMember(
      owner = "client!qq",
      name = "C",
      descriptor = "Lsd;"
   )
   public static class101 field7433 = new class101(28, -2);
   @OriginalMember(
      owner = "client!qq",
      name = "I",
      descriptor = "I"
   )
   public static int field7435;
   @OriginalMember(
      owner = "client!qq",
      name = "D",
      descriptor = "I"
   )
   public static int field7439;
   @OriginalMember(
      owner = "client!qq",
      name = "n",
      descriptor = "I"
   )
   public static int field7440;
   @OriginalMember(
      owner = "client!qq",
      name = "w",
      descriptor = "I"
   )
   public static int field7442;
   @OriginalMember(
      owner = "client!qq",
      name = "u",
      descriptor = "I"
   )
   public static int field7444;
   @OriginalMember(
      owner = "client!qq",
      name = "v",
      descriptor = "I"
   )
   public static int field7446;
   @OriginalMember(
      owner = "client!qq",
      name = "H",
      descriptor = "I"
   )
   public static int field7449;
   @OriginalMember(
      owner = "client!qq",
      name = "G",
      descriptor = "I"
   )
   public static int field7450;
   @OriginalMember(
      owner = "client!qq",
      name = "q",
      descriptor = "I"
   )
   public static int field7451;
   @OriginalMember(
      owner = "client!qq",
      name = "F",
      descriptor = "I"
   )
   public static int field7452;
   @OriginalMember(
      owner = "client!qq",
      name = "E",
      descriptor = "I"
   )
   public static int field7453;
   @OriginalMember(
      owner = "client!qq",
      name = "B",
      descriptor = "I"
   )
   public static int field7456;
   @OriginalMember(
      owner = "client!qq",
      name = "K",
      descriptor = "Z"
   )
   private boolean field7436;
   @OriginalMember(
      owner = "client!qq",
      name = "p",
      descriptor = "Z"
   )
   private boolean field7445;

   @OriginalMember(
      owner = "client!qq",
      name = "c",
      descriptor = "(Z)V",
      line = 6
   )
   public static final void method3739(boolean arg0) {
      try {
         if (arg0) {
            field7452 = 11;
         }

         ++field7446;
         class317.method2411(11, (byte)1);
         class370.method2880((byte)-111);
         System.gc();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7457[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "c",
      descriptor = "(I)V",
      line = 20
   )
   public final void method1559(int arg0) {
      try {
         int var2;
         class495 var3;
         label35: {
            ++field7440;
            var2 = super.field4745.method2590((byte)84);
            var3 = super.field4745.method2681(false);
            if (this.field7436) {
               OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field7441.field10394 : this.field7447.field10394);
               if (client.field4530 == 0) {
                  break label35;
               }
            }

            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field7448.field10394 : this.field7437.field10394);
         }

         OpenGL.glEnable(34336);
         this.field7445 = true;
         var3.method3660(this.field7443, -1.0F, 0.0F, 0.0F, (float)var2, 0);
         if (arg0 != -27966) {
            this.method417(false, (byte)-28);
         }

         OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field7443[0], this.field7443[1], this.field7443[2], this.field7443[3]);
         this.method413((byte)87);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7457[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "<init>",
      descriptor = "(Leh;Leaa;)V",
      line = 138
   )
   public class501(class379 arg0, class526 arg1) {
      super(arg0);

      try {
         if (arg1 != null && arg0.field5838) {
            this.field7448 = class89.method816(arg1.method3878(false, field7457[8], field7457[6]), arg0, -5602, 34336);
            this.field7441 = class89.method816(arg1.method3878(false, field7457[8], field7457[5]), arg0, -5602, 34336);
            this.field7437 = class89.method816(arg1.method3878(false, field7457[8], field7457[2]), arg0, -5602, 34336);
            this.field7447 = class89.method816(arg1.method3878(false, field7457[8], field7457[7]), arg0, -5602, 34336);
            if (!(this.field7447 != null & this.field7437 != null & this.field7441 != null & this.field7448 != null)) {
               this.field7455 = false;
            } else {
               this.field7438 = super.field4745.method2577(false, 2, new int[]{0, -1}, 1, 2);
               this.field7438.method502(125, false, false);
               this.field7455 = true;
            }
         } else {
            this.field7455 = false;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7457[1] + (arg0 != null ? field7457[3] : field7457[4]) + ',' + (arg1 != null ? field7457[3] : field7457[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(ZB)V",
      line = 61
   )
   public final void method417(boolean arg0, byte arg1) {
      try {
         if (arg1 != -102) {
            this.field7448 = null;
         }

         ++field7453;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7457[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "b",
      descriptor = "(I)V",
      line = 73
   )
   public final void method411(int arg0) {
      try {
         ++field7451;
         super.field4745.method2574(106, 1);
         super.field4745.method2578((class254)null, true);
         super.field4745.method2568(class556.field8257, class556.field8257, false);
         if (arg0 > -21) {
            this.method413((byte)-20);
         }

         super.field4745.method2636(-95, 0, class496.field7336);
         super.field4745.method2636(-91, 2, class522.field7591);
         super.field4745.method2662(true, class496.field7336, 0);
         super.field4745.method2574(117, 0);
         if (this.field7434) {
            super.field4745.method2636(-112, 0, class496.field7336);
            super.field4745.method2662(true, class496.field7336, 0);
            this.field7434 = false;
         }

         if (this.field7445) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field7445 = false;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7457[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "b",
      descriptor = "(B)V",
      line = 106
   )
   public final void method413(byte arg0) {
      try {
         if (arg0 != 87) {
            this.method411(-18);
         }

         if (this.field7445) {
            int var2 = super.field4745.method639();
            int var3 = super.field4745.method635();
            float var4 = (float)var2 + -((float)(-var3 + var2) * 0.125F);
            float var5 = (float)var2 - (float)(-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field4745.method2620((byte)69), (float)super.field4745.method2605(117) / 255.0F);
            super.field4745.method2574(124, 1);
            super.field4745.method2646(super.field4745.method2570(1), 127);
            super.field4745.method2574(arg0 + -41, 0);
         }

         ++field7435;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7457[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(IILuha;)V",
      line = 164
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      try {
         label34: {
            ++field7442;
            if (arg2 != null) {
               if (this.field7434) {
                  super.field4745.method2636(arg0 ^ -109, 0, class496.field7336);
                  super.field4745.method2662(true, class496.field7336, 0);
                  this.field7434 = false;
               }

               super.field4745.method2578(arg2, true);
               super.field4745.method2649((byte)119, arg1);
               if (client.field4530 == 0) {
                  break label34;
               }
            }

            if (!this.field7434) {
               super.field4745.method2578(super.field4745.field5042, true);
               super.field4745.method2649((byte)119, 1);
               super.field4745.method2636(-118, 0, class309.field4402);
               super.field4745.method2662(true, class309.field4402, 0);
               this.field7434 = true;
            }
         }

         if (arg0 != 0) {
            this.field7438 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7457[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7457[3] : field7457[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(IZ)V",
      line = 201
   )
   public final void method410(int arg0, boolean arg1) {
      try {
         ++field7450;
         this.field7436 = arg1;
         super.field4745.method2574(39, 1);
         if (arg0 >= 3) {
            super.field4745.method2578(this.field7438, true);
            super.field4745.method2568(class225.field2891, class680.field10213, false);
            super.field4745.method2636(-124, 0, class522.field7591);
            super.field4745.method2629(class496.field7336, 85, 2, false, true);
            super.field4745.method2662(true, class309.field4402, 0);
            super.field4745.method2574(46, 0);
            this.method1559(-27966);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7457[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(B)Z",
      line = 222
   )
   public final boolean method407(byte arg0) {
      try {
         if (arg0 <= 16) {
            return false;
         } else {
            ++field7449;
            return this.field7455;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7457[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(III)V",
      line = 235
   )
   public final void method412(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 9950) {
            this.field7441 = null;
         }

         ++field7444;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7457[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "c",
      descriptor = "(B)V",
      line = 246
   )
   public static void method3740(byte arg0) {
      try {
         field7433 = null;
         int var1 = 91 % ((arg0 - -66) / 37);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7457[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3741(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3742(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
