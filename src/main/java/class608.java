import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class608 extends class557 {
   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8669 = new String[]{method4484(method4483("/X^m0")), method4484(method4483("/X^c0")), method4484(method4483("/X^l0")), method4484(method4483("/X^n0")), method4484(method4483("/X^h0")), method4484(method4483("/X^a0")), method4484(method4483("/X^j0")), method4484(method4483("/X^o0"))};
   @OriginalMember(
      owner = "client!lc",
      name = "o",
      descriptor = "I"
   )
   public static int field8659 = -1;
   @OriginalMember(
      owner = "client!lc",
      name = "q",
      descriptor = "F"
   )
   public static float field8665;
   @OriginalMember(
      owner = "client!lc",
      name = "m",
      descriptor = "I"
   )
   public static int field8661;
   @OriginalMember(
      owner = "client!lc",
      name = "k",
      descriptor = "I"
   )
   public static int field8662;
   @OriginalMember(
      owner = "client!lc",
      name = "p",
      descriptor = "I"
   )
   public static int field8663;
   @OriginalMember(
      owner = "client!lc",
      name = "l",
      descriptor = "I"
   )
   public static int field8664;
   @OriginalMember(
      owner = "client!lc",
      name = "i",
      descriptor = "I"
   )
   public static int field8666;
   @OriginalMember(
      owner = "client!lc",
      name = "j",
      descriptor = "I"
   )
   public static int field8667;
   @OriginalMember(
      owner = "client!lc",
      name = "n",
      descriptor = "I"
   )
   public static int field8668;
   @OriginalMember(
      owner = "client!lc",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field8660;

   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            this.method92(124, 8);
         }

         ++field8667;
         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8669[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(ZIIBI)Lkc;"
   )
   public static final class733 method4478(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field8664;
         class733 var5 = new class733();
         var5.field10421 = arg4;
         var5.field10417 = arg2;
         class139.field2228.method3098((long)arg1, var5, -1);
         class50.method546(0, arg2);
         class91 var6 = class460.method3554(-103, arg1);
         if (var6 != null) {
            class566.method4205(1727005542, var6);
         }

         if (class463.field6743 != null) {
            class566.method4205(1727005542, class463.field6743);
            class463.field6743 = null;
         }

         class384.method2992(-865314456);
         if (var6 != null) {
            class220.method1906(-9278, var6, !arg0);
         }

         if (!arg0) {
            class427.method3345(arg2);
         }

         if (!arg0 && class7.field130 != -1) {
            class129.method1320(1, (byte)-88, class7.field130);
         }

         if (arg3 <= 121) {
            field8660 = null;
         }

         return var5;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8669[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class608(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Lsaa;)V"
   )
   public static final void method4479(class425 arg0) {
      if (class160.field2452 < 65535) {
         class757 var1 = arg0.field6218;
         class274.field4176[class160.field2452] = arg0;
         class566.field8046[class160.field2452] = false;
         ++class160.field2452;
         int var2 = arg0.field6217;
         if (arg0.field6215) {
            var2 = 0;
         }

         int var3 = arg0.field6217;
         if (arg0.field6211) {
            var3 = class522.field7337 - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = var1.method5469((byte)13) - var1.method5465((byte)109) + class744.field10587 >> class313.field4707;
            if (var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = var1.method5469((byte)13) + var1.method5465((byte)-6) - class744.field10587 >> class313.field4707;
            if (var7 >= class25.field360) {
               var7 = class25.field360 - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = arg0.field6214[var5++];
               int var10 = (var1.method5474(10368) - var1.method5465((byte)-109) + class744.field10587 >> class313.field4707) + (var9 >>> 8);
               int var11 = (var9 & 255) + var10 - 1;
               if (var10 < 0) {
                  var10 = 0;
               }

               if (var11 >= class155.field2381) {
                  var11 = class155.field2381 - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = class232.field3604[var4][var12][var8];
                  if ((var13 & 65535L) == 0L) {
                     class232.field3604[var4][var12][var8] = var13 | (long)class160.field2452;
                  } else if ((var13 & 4294901760L) == 0L) {
                     class232.field3604[var4][var12][var8] = var13 | (long)class160.field2452 << 16;
                  } else if ((var13 & 281470681743360L) == 0L) {
                     class232.field3604[var4][var12][var8] = var13 | (long)class160.field2452 << 32;
                  } else if ((var13 & -281474976710656L) == 0L) {
                     class232.field3604[var4][var12][var8] = var13 | (long)class160.field2452 << 48;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class608(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method4480(int arg0) {
      try {
         if (arg0 > -52) {
            field8659 = -3;
         }

         ++field8662;
         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8669[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4481(byte arg0) {
      try {
         ++field8668;
         if (arg0 != 108) {
            field8660 = null;
         }

         return class137.method1385(4175, super.field7906.field9109.method4676(-75));
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8669[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 == -22) {
            if (super.field7906.field9109.method4679(true) && !class137.method1385(4175, super.field7906.field9109.method4676(-55))) {
               super.field7905 = 0;
            }

            ++field8666;
            if (super.field7905 < 0 || super.field7905 > 2) {
               super.field7905 = this.method97(0);
            }

         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8669[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field8659 = -24;
         }

         super.field7905 = arg0;
         ++field8661;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8669[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field8663;
         if (arg0 != 1) {
            this.method99(88, true);
         }

         return !class137.method1385(4175, super.field7906.field9109.method4676(-95)) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8669[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4482(int arg0) {
      try {
         field8660 = null;
         if (arg0 != 0) {
            method4478(true, -47, -63, (byte)-115, 50);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8669[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4483(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4484(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
