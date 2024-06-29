import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class733 extends class331 {
   @OriginalMember(
      owner = "client!ed",
      name = "q",
      descriptor = "Leh;"
   )
   private class379 field10872;
   @OriginalMember(
      owner = "client!ed",
      name = "p",
      descriptor = "Lwr;"
   )
   private class482 field10874;
   @OriginalMember(
      owner = "client!ed",
      name = "t",
      descriptor = "Lrda;"
   )
   private class690 field10877;
   @OriginalMember(
      owner = "client!ed",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10880 = new String[]{method5333(method5332("k#sL`")), method5333(method5332("k#sI`")), method5333(method5332("`21m")), method5333(method5332("uis/5")), method5333(method5332("k#sH`")), method5333(method5332("k#sJ`")), method5333(method5332("k#sC`")), method5333(method5332("k#sO`")), method5333(method5332("k#sK`")), method5333(method5332("k#sN`")), method5333(method5332("k#sQ`")), method5333(method5332("k#sG`")), method5333(method5332("z5<o;~&/d&z\u0018*`<k5")), method5333(method5332("k#s=!`.)?`")), method5333(method5332("i+"))};
   @OriginalMember(
      owner = "client!ed",
      name = "o",
      descriptor = "I"
   )
   public static int field10869 = 0;
   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "I"
   )
   public static int field10865;
   @OriginalMember(
      owner = "client!ed",
      name = "w",
      descriptor = "I"
   )
   public static int field10866;
   @OriginalMember(
      owner = "client!ed",
      name = "u",
      descriptor = "I"
   )
   public static int field10867;
   @OriginalMember(
      owner = "client!ed",
      name = "v",
      descriptor = "I"
   )
   public static int field10868;
   @OriginalMember(
      owner = "client!ed",
      name = "r",
      descriptor = "I"
   )
   public static int field10870;
   @OriginalMember(
      owner = "client!ed",
      name = "B",
      descriptor = "I"
   )
   public static int field10871;
   @OriginalMember(
      owner = "client!ed",
      name = "s",
      descriptor = "I"
   )
   public static int field10873;
   @OriginalMember(
      owner = "client!ed",
      name = "x",
      descriptor = "I"
   )
   public static int field10875;
   @OriginalMember(
      owner = "client!ed",
      name = "A",
      descriptor = "I"
   )
   public static int field10876;
   @OriginalMember(
      owner = "client!ed",
      name = "n",
      descriptor = "I"
   )
   public static int field10878;
   @OriginalMember(
      owner = "client!ed",
      name = "y",
      descriptor = "I"
   )
   public static int field10879;

   @OriginalMember(
      owner = "client!ed",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method411(int arg0) {
      try {
         super.field4745.method2636(-89, 0, class496.field7336);
         ++field10875;
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34820);
         OpenGL.glDisable(34336);
         if (arg0 > -21) {
            this.field10874 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10880[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(Lvl;I)V"
   )
   public static final void method5328(class15 arg0, int arg1) {
      try {
         class175.field2175 = arg0;
         int var2 = 62 / ((42 - arg1) / 60);
         ++field10876;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10880[10] + (arg0 != null ? field10880[3] : field10880[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ZZ[B)V"
   )
   public static final void method5329(boolean arg0, boolean arg1, byte[] arg2) {
      int var3 = client.field4530;

      try {
         if (class538.field7864 == null) {
            class538.field7864 = new class128(20000);
         }

         ++field10865;
         class538.field7864.method1059(arg2.length, -2125022416, arg2, 0);
         if (!arg1) {
            method5329(true, true, (byte[])null);
         }

         if (arg0) {
            class357.method2788(class538.field7864.field1552, 1);
            class433.field6609 = new class21[class458.field6936];
            int var4 = 0;
            int var5 = class498.field7379;
            class21 var6;
            if (var3 != 0) {
               var6 = class70.method700(-14, var5);
               if (var6 != null) {
                  class433.field6609[var4++] = var6;
               }

               ++var5;
            }

            while(true) {
               byte var10000;
               if (~class554.field8212 > ~var5) {
                  class68.field863 = false;
                  var10000 = 1;
                  if (var3 == 0) {
                     class120.field1460 = class188.method1462(true);
                     class538.field7864 = null;
                     return;
                  }
               } else {
                  var10000 = -14;
               }

               var6 = class70.method700(var10000, var5);
               if (var6 != null) {
                  class433.field6609[var4++] = var6;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10880[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10880[3] : field10880[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public static final void method5330(String arg0, String arg1, int arg2) {
      try {
         ++field10868;
         if (arg1.length() <= 320) {
            if (arg2 == -8898) {
               if (class163.method1333(3)) {
                  if (class429.field6546 != null) {
                     class429.field6546.method812(2035738378);
                     class429.field6546 = null;
                  }

                  class5.method41((byte)-113);
                  class685.field10283 = arg1;
                  class397.field6109 = arg0;
                  class317.method2411(5, (byte)6);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10880[9] + (arg0 != null ? field10880[3] : field10880[2]) + ',' + (arg1 != null ? field10880[3] : field10880[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method410(int arg0, boolean arg1) {
      try {
         OpenGL.glBindProgramARB(34336, this.field10877.field10394);
         ++field10867;
         OpenGL.glEnable(34336);
         if (arg0 < 3) {
            this.field10877 = null;
         }

         super.field4745.method2636(-128, 0, class309.field4402);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10880[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method5331(int arg0) {
      try {
         ++field10866;
         class748 var1 = class402.field6170;
         synchronized(class402.field6170) {
            class402.field6170.method5451(arg0 ^ -9642);
            if (arg0 != -9718) {
               field10871 = 75;
            }
         }

         class748 var2 = class134.field1713;
         synchronized(class134.field1713) {
            class134.field1713.method5451(arg0 + 9834);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10880[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "<init>",
      descriptor = "(Leh;Leaa;Lwr;)V"
   )
   public class733(class379 arg0, class526 arg1, class482 arg2) {
      super(arg0);

      try {
         this.field10872 = arg0;
         this.field10874 = arg2;
         if (arg1 != null && this.field10874.method3579(2) && this.field10872.field5838) {
            this.field10877 = class89.method816(arg1.method3878(false, field10880[14], field10880[12]), this.field10872, -5602, 34336);
         } else {
            this.field10877 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10880[13] + (arg0 != null ? field10880[3] : field10880[2]) + ',' + (arg1 != null ? field10880[3] : field10880[2]) + ',' + (arg2 != null ? field10880[3] : field10880[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(IILuha;)V"
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      try {
         if (arg0 == 0) {
            ++field10870;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10880[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10880[3] : field10880[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method417(boolean arg0, byte arg1) {
      try {
         ++field10873;
         super.field4745.method2568(class680.field10213, class325.field4618, false);
         if (arg1 != -102) {
            this.method411(72);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10880[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method412(int arg0, int arg1, int arg2) {
      try {
         label19: {
            ++field10879;
            if (this.field10874.field7152) {
               float var4 = (float)(super.field4745.field5008 % 4000) / 4000.0F;
               super.field4745.method2578(this.field10874.field7155, true);
               OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
               if (client.field4530 == 0) {
                  break label19;
               }
            }

            int var5 = super.field4745.field5008 % 4000 * 16 / 4000;
            super.field4745.method2578(this.field10874.field7153[var5], true);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
         }

         if (arg1 != 9950) {
            this.method414(-20, -2, (class254)null);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10880[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method407(byte arg0) {
      try {
         ++field10878;
         if (arg0 < 16) {
            return true;
         } else {
            return this.field10877 != null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10880[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5332(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5333(char[] arg0) {
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
            var10005 = 71;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
