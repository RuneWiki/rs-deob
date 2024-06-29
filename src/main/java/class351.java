import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class351 implements class775 {
   @OriginalMember(
      owner = "client!js",
      name = "b",
      descriptor = "Lkf;"
   )
   private class266 field4723;
   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4727 = new String[]{method2566(method2565("I:\bAP")), method2566(method2565("M<Jj")), method2566(method2565("I:\bGP")), method2566(method2565("Xg\b(\u0005")), method2566(method2565("I:\bEP")), method2566(method2565("I:\bCP")), method2566(method2565("I:\b@P")), method2566(method2565("I:\b:\u0011M R8P")), method2566(method2565("I:\bDP")), method2566(method2565("I:\bNP")), method2566(method2565("I:\bBP"))};
   @OriginalMember(
      owner = "client!js",
      name = "f",
      descriptor = "[[I"
   )
   public static int[][] field4717 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!js",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field4721 = false;
   @OriginalMember(
      owner = "client!js",
      name = "g",
      descriptor = "I"
   )
   public static int field4725 = 0;
   @OriginalMember(
      owner = "client!js",
      name = "d",
      descriptor = "I"
   )
   public static int field4715;
   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "I"
   )
   public static int field4716;
   @OriginalMember(
      owner = "client!js",
      name = "e",
      descriptor = "I"
   )
   public static int field4718;
   @OriginalMember(
      owner = "client!js",
      name = "c",
      descriptor = "I"
   )
   public static int field4719;
   @OriginalMember(
      owner = "client!js",
      name = "k",
      descriptor = "I"
   )
   public static int field4720;
   @OriginalMember(
      owner = "client!js",
      name = "l",
      descriptor = "I"
   )
   public static int field4722;
   @OriginalMember(
      owner = "client!js",
      name = "j",
      descriptor = "I"
   )
   public static int field4724;
   @OriginalMember(
      owner = "client!js",
      name = "h",
      descriptor = "I"
   )
   public static int field4726;

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(IIILha;Lbl;)V",
      line = 3
   )
   public static final void method2557(int arg0, int arg1, int arg2, class66 arg3, class678 arg4) {
      boolean var5 = client.field4360;

      try {
         ++field4716;
         byte var6 = 63;
         byte var7 = 7;
         int var8 = 63;
         if (arg2 != -477732026) {
            method2560((class573)null, -85, 64, -37, 77, 94);
            if (!var5 && var8 < 0) {
               return;
            }
         } else if (var8 < 0) {
            return;
         }

         do {
            int var9 = var6 & 127 | 896 & var7 << 7 | (63 & var8) << 10;
            class733.method5333(true, arg2 + 477732153, false);
            int var10 = class546.field7829[var9];
            class165.method1365(-125, true, false);
            arg3.method496(arg0, ((-var8 + 63) * arg4.field9980 >> 6) + arg1, arg4.field9904, (arg4.field9980 >> 6) + 1, var10, 0);
            --var8;
         } while(var8 >= 0);

      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field4727[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4727[3] : field4727[1]) + ',' + (arg4 != null ? field4727[3] : field4727[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(B)I",
      line = 36
   )
   public static final int method2558(byte arg0) {
      try {
         if (arg0 <= 50) {
            return -32;
         } else {
            ++field4715;
            return class660.field9618.method5438(55);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4727[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(I)Ltfa;",
      line = 48
   )
   public final class36 method2559(int arg0) {
      try {
         ++field4720;
         if (arg0 != -24883) {
            method2558((byte)-23);
         }

         return class36.field509;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4727[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(Lea;IIIII)Lu;",
      line = 59
   )
   public static final class81 method2560(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg2 != 34037) {
            method2558((byte)-20);
         }

         ++field4718;
         if (arg0.field8470 || class471.method3415(arg3, true) && class471.method3415(arg5, true)) {
            return new class81(arg0, 3553, arg1, arg4, arg3, arg5, true);
         } else {
            return arg0.field8397 ? new class81(arg0, 34037, arg1, arg4, arg3, arg5, true) : new class81(arg0, arg1, arg4, arg3, arg5, class350.method2552(false, arg3), class350.method2552(false, arg5), true);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4727[9] + (arg0 != null ? field4727[3] : field4727[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "b",
      descriptor = "(I)I",
      line = 78
   )
   public final int method2561(int arg0) {
      try {
         ++field4719;
         if (this.field4723.method2056(111)) {
            return 100;
         } else {
            if (arg0 != -29119) {
               method2564((class326)null, (class357)null, -56, (class476)null, 81, (byte)-85, 101, (class66)null, -47);
            }

            return this.field4723.method2044(0);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4727[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(Z)V",
      line = 94
   )
   public static void method2562(boolean arg0) {
      try {
         if (!arg0) {
            method2558((byte)-83);
         }

         field4717 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4727[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(IIZII)V",
      line = 114
   )
   public static final void method2563(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         if (arg2) {
            field4721 = true;
         }

         ++field4722;
         class755 var5 = class317.method2325((long)arg4, 98, 10);
         var5.method5479(1288);
         var5.field11181 = arg0;
         var5.field11187 = arg1;
         var5.field11184 = arg3;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4727[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(Ldja;Lrd;ILci;IBILha;I)V",
      line = 130
   )
   public static final void method2564(class326 arg0, class357 arg1, int arg2, class476 arg3, int arg4, byte arg5, int arg6, class66 arg7, int arg8) {
      boolean var9 = client.field4360;

      try {
         ++field4724;
         int var10 = -(arg6 / 2) + arg4 - 5;
         if (arg5 <= -51) {
            int var11 = arg8 + 2;
            if (~arg0.field4417 != -1) {
               arg7.method533(arg0.field4417, var10, var11, arg6 - -10, (byte)107, -var11 + arg8 - -(arg3.method3463() * arg2) + 1);
            }

            if (~arg0.field4458 != -1) {
               arg7.method566(var11, (byte)-124, var10, arg6 - -10, arg0.field4458, 1 + -var11 + arg8 + arg3.method3463() * arg2);
            }

            int var12 = arg0.field4418;
            if (arg1.field4799 && arg0.field4442 != -1) {
               var12 = arg0.field4442;
            }

            int var13 = 0;
            if (var9 || var13 < arg2) {
               do {
                  String var14 = class305.field4181[var13];
                  if (~(arg2 + -1) < ~var13) {
                     var14 = var14.substring(0, -4 + var14.length());
                  }

                  arg3.method3460(arg7, var14, arg4, arg8, var12, true);
                  arg8 += arg3.method3463();
                  ++var13;
               } while(var13 < arg2);

            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field4727[2] + (arg0 != null ? field4727[3] : field4727[1]) + ',' + (arg1 != null ? field4727[3] : field4727[1]) + ',' + arg2 + ',' + (arg3 != null ? field4727[3] : field4727[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4727[3] : field4727[1]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "<init>",
      descriptor = "(Lkf;)V",
      line = 174
   )
   public class351(class266 arg0) {
      try {
         this.field4723 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4727[7] + (arg0 != null ? field4727[3] : field4727[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2565(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2566(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
