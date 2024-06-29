import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class198 {
   @OriginalMember(
      owner = "client!qga",
      name = "j",
      descriptor = "Lbo;"
   )
   private class762 field2808 = new class762();
   @OriginalMember(
      owner = "client!qga",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field2813;
   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2825 = new String[]{method1568(method1567("\u0001P|\u000b")), method1568(method1567("\u001eBqIRG")), method1568(method1567("\u0014\u000b>Ii")), method1568(method1567("\u001eBqI(\u0006Ky\u0013*G")), method1568(method1567("\u001eBqIVG")), method1568(method1567("\u001eBqI^G")), method1568(method1567("\u001eBqIQG")), method1568(method1567("\u001eBqIWG")), method1568(method1567("\u001eBqI]G")), method1568(method1567(")Uc]")), method1568(method1567("\"@}]")), method1568(method1567("\u001eBqIUG")), method1568(method1567("\u001eBqISG")), method1568(method1567("\u001eBqI\\G")), method1568(method1567("\u001eBqIPG"))};
   @OriginalMember(
      owner = "client!qga",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field2812 = true;
   @OriginalMember(
      owner = "client!qga",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2816 = null;
   @OriginalMember(
      owner = "client!qga",
      name = "g",
      descriptor = "Loi;"
   )
   public static class80 field2811 = new class80(8);
   @OriginalMember(
      owner = "client!qga",
      name = "p",
      descriptor = "I"
   )
   public static int field2809;
   @OriginalMember(
      owner = "client!qga",
      name = "h",
      descriptor = "I"
   )
   public static int field2810;
   @OriginalMember(
      owner = "client!qga",
      name = "i",
      descriptor = "I"
   )
   public static int field2814;
   @OriginalMember(
      owner = "client!qga",
      name = "q",
      descriptor = "I"
   )
   public static int field2815;
   @OriginalMember(
      owner = "client!qga",
      name = "m",
      descriptor = "I"
   )
   public static int field2817;
   @OriginalMember(
      owner = "client!qga",
      name = "l",
      descriptor = "I"
   )
   public static int field2818;
   @OriginalMember(
      owner = "client!qga",
      name = "e",
      descriptor = "I"
   )
   public static int field2819;
   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "I"
   )
   public static int field2820;
   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "I"
   )
   public static int field2821;
   @OriginalMember(
      owner = "client!qga",
      name = "c",
      descriptor = "I"
   )
   private volatile int field2823;
   @OriginalMember(
      owner = "client!qga",
      name = "n",
      descriptor = "Lnp;"
   )
   private class519 field2824;
   @OriginalMember(
      owner = "client!qga",
      name = "o",
      descriptor = "[Lgn;"
   )
   public static class731[] field2822;

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(Lgn;Z)V"
   )
   public final void method1557(class731 arg0, boolean arg1) {
      try {
         arg0.field10703 = true;
         ++field2809;
         class762 var3 = this.field2808;
         synchronized(this.field2808) {
            if (arg1) {
               this.method1560(12, (class731)null);
            }

            this.field2808.method5530(125, arg0);
            ++this.field2823;
         }

         if (this.field2824 != null) {
            class519 var4 = this.field2824;
            synchronized(this.field2824) {
               this.field2824.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2825[8] + (arg0 != null ? field2825[2] : field2825[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(BLef;)V"
   )
   public final void method1558(byte arg0, class516 arg1) {
      try {
         if (arg0 > 8) {
            ++field2815;
            class762 var3 = this.field2808;
            synchronized(this.field2808) {
               this.field2808.method5530(118, arg1);
               ++this.field2823;
            }

            if (this.field2824 != null) {
               class519 var4 = this.field2824;
               synchronized(this.field2824) {
                  this.field2824.notify();
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2825[6] + arg0 + ',' + (arg1 != null ? field2825[2] : field2825[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1559(int arg0) {
      try {
         field2816 = null;
         if (arg0 != 32150) {
            field2811 = null;
         }

         field2822 = null;
         field2811 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2825[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(ILgn;)V"
   )
   public final void method1560(int arg0, class731 arg1) {
      try {
         arg1.field10703 = false;
         ++field2810;
         class762 var3 = this.field2808;
         synchronized(this.field2808) {
            this.field2808.method5530(123, arg1);
            if (arg0 != -201) {
               field2812 = true;
            }

            ++this.field2823;
         }

         if (this.field2824 != null) {
            class519 var4 = this.field2824;
            synchronized(this.field2824) {
               this.field2824.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2825[7] + arg0 + ',' + (arg1 != null ? field2825[2] : field2825[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1561(boolean arg0) {
      try {
         ++field2821;
         if (!arg0) {
            return true;
         } else {
            return ~this.field2823 == -1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2825[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(ILnp;)V"
   )
   public final void method1562(int arg0, class519 arg1) {
      try {
         this.field2824 = arg1;
         if (arg0 != 16401) {
            this.field2824 = null;
         }

         ++field2814;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2825[1] + arg0 + ',' + (arg1 != null ? field2825[2] : field2825[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method1563(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2818;
         class755 var4 = class317.method2325((long)arg2, 100, 11);
         var4.method5479(1288);
         var4.field11184 = arg1;
         if (arg0 != 8) {
            field2816 = null;
         }

         var4.field11181 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2825[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(I)Ldp;"
   )
   public final class3 method1564(int arg0) {
      try {
         ++field2819;
         Object var2 = null;
         class762 var3 = this.field2808;
         synchronized(this.field2808) {
            if (arg0 != 29354) {
               field2816 = null;
            }

            class3 var4 = this.field2808.method5529((byte)-42);
            var4.method12((byte)-126);
            --this.field2823;
            return var4;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2825[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(ZLth;)V"
   )
   public static final void method1565(boolean arg0, class623 arg1) {
      boolean var2 = client.field4360;

      try {
         arg1.field9168 = null;
         ++field2820;
         if (arg0) {
            method1559(-83);
         }

         int var3 = arg1.field9164.length;
         int var4 = 0;
         if (var2) {
            arg1.field9164[var4].field4191 = false;
            ++var4;
         }

         while(true) {
            while(var3 > var4) {
               arg1.field9164[var4].field4191 = false;
               ++var4;
            }

            class762[] var5 = class237.field3305;
            synchronized(class237.field3305) {
               if (!var2) {
                  if (class237.field3305.length > var3 && ~class557.field7988[var3] > -201) {
                     class237.field3305[var3].method5530(123, arg1);
                     int var10002 = class557.field7988[var3]++;
                  }

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2825[4] + arg0 + ',' + (arg1 != null ? field2825[2] : field2825[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(IBILd;ILha;I)V"
   )
   public static final void method1566(int arg0, byte arg1, int arg2, class162 arg3, int arg4, class66 arg5, int arg6) {
      try {
         if (class116.field1452 < 100) {
            class310.method2295(arg3, (byte)-106, arg5);
         }

         ++field2817;
         arg5.method592(arg0, arg4, arg0 - -arg6, arg4 - -arg2);
         if (~class116.field1452 > -101) {
            byte var7 = 20;
            int var8 = arg0 - -(arg6 / 2);
            int var9 = arg2 / 2 + arg4 - 18 + -var7;
            arg5.method496(arg0, arg4, arg6, arg2, -16777216, 0);
            arg5.method608(var8 + -152, var9, 304, 34, class751.field11113[class474.field6829].getRGB(), 0);
            arg5.method496(var8 + -150, var9 - -2, class116.field1452 * 3, 30, class423.field6030[class474.field6829].getRGB(), 0);
            class455.field6465.method632(var8, false, -1, var7 + var9, class180.field2497.method1437(class608.field8920, 50), class235.field3277[class474.field6829].getRGB());
         } else {
            int var10 = class220.field3138 - (int)((float)arg6 / class650.field9501);
            int var11 = (int)((float)arg2 / class650.field9501) + class224.field3191;
            int var12 = (int)((float)arg6 / class650.field9501) + class220.field3138;
            class308.field4211 = (int)((float)(arg6 * 2) / class650.field9501);
            int var13 = class224.field3191 - (int)((float)arg2 / class650.field9501);
            int var14 = 64 / ((arg1 - -41) / 53);
            class415.field5977 = (int)((float)(arg2 * 2) / class650.field9501);
            class783.field11474 = class220.field3138 - (int)((float)arg6 / class650.field9501);
            class163.field2312 = -((int)((float)arg2 / class650.field9501)) + class224.field3191;
            class650.method4747(class650.field9513 + var10, class650.field9523 + var11, class650.field9513 + var12, class650.field9523 + var13, arg0, arg4, arg0 + arg6, arg4 - (-arg2 - 1));
            class650.method4746(arg5);
            class387 var15 = class650.method4734(arg5);
            class67.method618(arg5, 0, 0, (byte)120, var15);
            if (class592.field8717 > 0) {
               --class697.field10218;
               if (~class697.field10218 == -1) {
                  --class592.field8717;
                  class697.field10218 = 20;
               }
            }

            if (class753.field11135) {
               int var16 = arg6 + -5 + arg0;
               int var17 = arg2 + -8 + arg4;
               class427.field6124.method624(var16, var17, -1, 0, field2825[9] + class108.field1348, 16776960);
               int var23 = var17 - 15;
               Runtime var18 = Runtime.getRuntime();
               int var19 = (int)((var18.totalMemory() - var18.freeMemory()) / 1024L);
               int var20 = 16776960;
               if (~var19 < -65537) {
                  var20 = 16711680;
               }

               class427.field6124.method624(var16, var23, -1, 0, field2825[10] + var19 + "k", var20);
               var17 = var23 - 15;
            }
         }
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field2825[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2825[2] : field2825[0]) + ',' + arg4 + ',' + (arg5 != null ? field2825[2] : field2825[0]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class198(String arg0) {
      try {
         this.field2813 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2825[3] + (arg0 != null ? field2825[2] : field2825[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1567(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1568(char[] arg0) {
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
            var10005 = 37;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
