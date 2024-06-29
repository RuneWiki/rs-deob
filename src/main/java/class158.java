import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class158 extends class316 {
   @OriginalMember(
      owner = "client!mg",
      name = "d",
      descriptor = "Z"
   )
   private boolean field2519 = false;
   @OriginalMember(
      owner = "client!mg",
      name = "h",
      descriptor = "Llt;"
   )
   private class702 field2521;
   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2530 = new String[]{method1448(method1447("S,E\u0002\u0012\u0005")), method1448(method1447("Y%\u001b%L")), method1448(method1447("Y%\u001b/L")), method1448(method1447("Y%\u001b&L")), method1448(method1447("Z7Y\u0001")), method1448(method1447("Y%\u001b(L")), method1448(method1447("Ol\u001bC\u0019")), method1448(method1447("Y%\u001b)L")), method1448(method1447("Y%\u001b*L")), method1448(method1447("Y%\u001b+L")), method1448(method1447("Y%\u001b.L")), method1448(method1447("Y%\u001b$L")), method1448(method1447("Y%\u001bQ\rZ+ASL")), method1448(method1447("Y%\u001b,L"))};
   @OriginalMember(
      owner = "client!mg",
      name = "k",
      descriptor = "Luw;"
   )
   public static class435 field2517 = new class435(38, 2);
   @OriginalMember(
      owner = "client!mg",
      name = "c",
      descriptor = "I"
   )
   public static int field2525 = 0;
   @OriginalMember(
      owner = "client!mg",
      name = "j",
      descriptor = "I"
   )
   public static int field2518;
   @OriginalMember(
      owner = "client!mg",
      name = "g",
      descriptor = "I"
   )
   public static int field2520;
   @OriginalMember(
      owner = "client!mg",
      name = "l",
      descriptor = "I"
   )
   public static int field2522;
   @OriginalMember(
      owner = "client!mg",
      name = "e",
      descriptor = "I"
   )
   public static int field2523;
   @OriginalMember(
      owner = "client!mg",
      name = "o",
      descriptor = "I"
   )
   public static int field2524;
   @OriginalMember(
      owner = "client!mg",
      name = "n",
      descriptor = "I"
   )
   public static int field2526;
   @OriginalMember(
      owner = "client!mg",
      name = "f",
      descriptor = "I"
   )
   public static int field2527;
   @OriginalMember(
      owner = "client!mg",
      name = "i",
      descriptor = "I"
   )
   public static int field2528;
   @OriginalMember(
      owner = "client!mg",
      name = "m",
      descriptor = "I"
   )
   public static int field2529;

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method805(int arg0) {
      try {
         label16: {
            if (this.field2519) {
               this.field2521.method5117('\u0001', 5);
               super.field4567.method259(32, 1);
               super.field4567.method252((class707)null, (byte)-97);
               super.field4567.method259(32, 0);
               if (!client.field4564) {
                  break label16;
               }
            }

            super.field4567.method387(0, 34184, 5890, 770);
         }

         ++field2518;
         int var2 = -32 / ((-18 - arg0) / 63);
         super.field4567.method314(8448, -55, 8448);
         this.field2519 = false;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2530[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1443(int arg0) {
      boolean var1 = client.field4564;

      try {
         label37: {
            ++field2520;
            int var2 = class510.field7454.field11165.method3277(false);
            if (~var2 == -1) {
               class443.field6462 = null;
               class98.method937(0, false);
               if (!var1) {
                  break label37;
               }
            }

            if (~var2 != -2) {
               class531.method3979((byte)(255 & class631.field9212 + -4), arg0 ^ 512);
               class98.method937(2, false);
               if (!var1) {
                  break label37;
               }
            }

            class531.method3979((byte)0, 0);
            class98.method937(512, false);
            if (class608.field8732 != null) {
               class285.method2220(-13981);
            }
         }

         if (arg0 != 512) {
            field2525 = -75;
         }

         class18.field319 = class731.field10504;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2530[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "<init>",
      descriptor = "(Lrk;)V"
   )
   public class158(class35 arg0) {
      super(arg0);

      try {
         if (arg0.field769) {
            this.field2521 = new class702(arg0, 2);
            this.field2521.method5116((byte)111, 0);
            super.field4567.method259(32, 1);
            super.field4567.method314(34165, 100, 7681);
            super.field4567.method262(2, 770, 8960, 34168);
            super.field4567.method387(0, 34184, 34167, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field4567.method259(32, 0);
            this.field2521.method5115((byte)-78);
            this.field2521.method5116((byte)111, 1);
            super.field4567.method259(32, 1);
            super.field4567.method314(8448, -82, 8448);
            super.field4567.method262(2, 770, 8960, 34166);
            super.field4567.method387(0, 34184, 5890, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field4567.method259(32, 0);
            this.field2521.method5115((byte)-86);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2530[12] + (arg0 != null ? field2530[6] : field2530[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1444(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method806(byte arg0, boolean arg1) {
      try {
         ++field2527;
         int var3 = -50 % ((arg0 - -44) / 38);
         class14 var4 = super.field4567.method350(0);
         if (this.field2521 != null && var4 != null && arg1) {
            this.field2521.method5117('\u0000', 5);
            super.field4567.method259(32, 1);
            super.field4567.method252(var4, (byte)-97);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field4567.field761.method4167(10), 0);
            OpenGL.glMatrixMode(5888);
            super.field4567.method259(32, 0);
            this.field2519 = true;
         } else {
            super.field4567.method387(0, 34184, 34168, 770);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2530[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         ++field2526;
         if (arg0 != 51) {
            this.method804(99, 114, (class707)null);
         }

         super.field4567.method314(8448, arg0 + -52, 7681);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2530[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1445(byte arg0) {
      try {
         int var1 = 50 / ((-21 - arg0) / 46);
         field2517 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2530[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public static final void method1446(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         label50: {
            ++field2528;
            int var6 = class510.field7454.field11147.method684(false) * arg3 >> 8;
            if (arg0 == -1 && !class733.field10540) {
               class162.method1481(-95);
               if (!client.field4564) {
                  break label50;
               }
            }

            if (~arg0 != 0 && (class140.field2285 != arg0 || !class593.method4378(99)) && var6 != 0 && !class733.field10540) {
               class51.method618(arg0, 0, arg1, !arg2, class534.field7784, false, var6);
               class182.method1610(81);
            }
         }

         if (!arg2) {
            field2517 = null;
         }

         if (~class140.field2285 != ~arg0) {
            class712.field10339 = null;
         }

         class140.field2285 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2530[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(IILufa;)V"
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         ++field2529;
         super.field4567.method252(arg2, (byte)-70);
         super.field4567.method322(arg0 ^ -43, arg1);
         if (arg0 != 0) {
            this.method804(53, 101, (class707)null);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2530[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2530[6] : field2530[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method807(int arg0) {
      try {
         ++field2523;
         if (arg0 != -18913) {
            this.method804(-90, 20, (class707)null);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2530[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method810(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 0) {
            method1444(87);
         }

         ++field2522;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2530[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1447(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1448(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
