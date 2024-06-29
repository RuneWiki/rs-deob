import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class28 implements class603 {
   @OriginalMember(
      owner = "client!mi",
      name = "c",
      descriptor = "Ldh;"
   )
   private class300 field413;
   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field418 = new String[]{method226(method225("y$2\f\u007f")), method226(method225("l\u007fpN")), method226(method225("oc2\u001eklch\u001c*")), method226(method225("oc2d*")), method226(method225("Ak~@ceo")), method226(method225("oc2c*")), method226(method225("ux")), method226(method225("oc2a*")), method226(method225("oc2g*")), method226(method225("oc2f*")), method226(method225("oc2e*"))};
   @OriginalMember(
      owner = "client!mi",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field416 = false;
   @OriginalMember(
      owner = "client!mi",
      name = "b",
      descriptor = "I"
   )
   public static int field409;
   @OriginalMember(
      owner = "client!mi",
      name = "i",
      descriptor = "I"
   )
   public static int field410;
   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "I"
   )
   public static int field411;
   @OriginalMember(
      owner = "client!mi",
      name = "g",
      descriptor = "I"
   )
   public static int field412;
   @OriginalMember(
      owner = "client!mi",
      name = "d",
      descriptor = "I"
   )
   public static int field415;
   @OriginalMember(
      owner = "client!mi",
      name = "f",
      descriptor = "Lww;"
   )
   public static class339 field414;
   @OriginalMember(
      owner = "client!mi",
      name = "h",
      descriptor = "[[I"
   )
   public static int[][] field417;

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IILgea;)Ljava/lang/String;"
   )
   public static final String method218(int arg0, int arg1, class66 arg2) {
      try {
         ++field410;

         try {
            if (arg0 > -9) {
               method220(-80);
            }

            int var3 = arg2.method653((byte)-54);
            if (arg1 < var3) {
               var3 = arg1;
            }

            byte[] var4 = new byte[var3];
            arg2.field864 += class532.field7798.method5465(var4, 0, 5, arg2.field859, var3, arg2.field864);
            return class271.method2154((byte)96, var4, 0, var3);
         } catch (Exception var7) {
            return field418[4];
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field418[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field418[0] : field418[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public static final void method219(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field411;
         if (class171.field2227 != arg0 || class781.field11385 != arg1 || ~class353.field4942 != ~arg3) {
            class781.field11385 = arg1;
            class171.field2227 = arg0;
            class353.field4942 = arg3;
            class323.field4420 = true;
            double var4 = -((double)(arg0 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double)(arg1 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class782.field11392 = 0.0D;
            class93.field1262 = var8 * var12;
            class32.field481 = var8;
            class407.field5624 = -var10 * var12;
            class372.field5203 = var10 * var14;
            class21.field331 = -var8 * var14;
            if (arg2 != -84) {
               method219(37, 4, (byte)-23, 51);
            }

            class486.field6785 = var14;
            class598.field8837 = var12;
            class504.field7031 = var10;
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field418[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method220(int arg0) {
      try {
         field417 = null;
         field414 = null;
         if (arg0 != -25596) {
            field414 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field418[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method221(int arg0) {
      try {
         ++field415;
         return arg0 == -10439;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field418[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method222(int arg0, boolean arg1) {
      try {
         if (arg0 == -22493) {
            if (arg1) {
               class629.field9294.method513(0, 0, class204.field2605, class91.field1242, this.field413.field4185, 0);
            }

            ++field412;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field418[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method223(int arg0) {
      try {
         if (arg0 != -28722) {
            method220(-124);
         }

         ++field409;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field418[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "<init>",
      descriptor = "(Ldh;)V"
   )
   public class28(class300 arg0) {
      try {
         this.field413 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field418[2] + (arg0 != null ? field418[0] : field418[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(Lha;IIIIIIZZ)V"
   )
   public static final void method224(class479 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
      class158.field2032 = arg0;
      class500.field6974 = arg1;
      class203.field2588 = class500.field6974 > 1 && class158.field2032.method515();
      class783.field11447 = arg2;
      class15.field276 = 1 << class783.field11447;
      class486.field6788 = class15.field276 >> 1;
      Math.sqrt((double)(class486.field6788 * class486.field6788 + class486.field6788 * class486.field6788));
      class174.field2251 = arg3;
      class137.field1743 = arg4;
      class181.field2297 = arg5;
      class106.field1403 = arg6;
      class575.field8534 = class371.method2939((byte)102);
      class566.method4252((byte)-120);
      class520.field7312 = new class731[arg3][class137.field1743][class181.field2297];
      class373.field5223 = new class423[arg3];
      if (arg7) {
         class743.field10860 = new int[class137.field1743][class181.field2297];
         class684.field10073 = new byte[class137.field1743][class181.field2297];
         class47.field600 = new short[class137.field1743][class181.field2297];
         class392.field5432 = new class731[1][class137.field1743][class181.field2297];
         class569.field8364 = new class423[1];
      } else {
         class743.field10860 = null;
         class684.field10073 = null;
         class47.field600 = null;
         class392.field5432 = null;
         class569.field8364 = null;
      }

      if (arg8) {
         class314.field4356 = new long[arg3][arg4][arg5];
         class375.field5241 = new class664[65535];
         class436.field5952 = new boolean[65535];
         class77.field1023 = 0;
      } else {
         class314.field4356 = null;
         class375.field5241 = null;
         class436.field5952 = null;
         class77.field1023 = 0;
      }

      class665.method4861(false);
      class127.field1637 = new class713[2];
      class217.field2753 = new class713[2];
      class500.field6970 = new class713[2];
      class120.field1597 = new class713[10000];
      class465.field6400 = 0;
      class335.field4600 = new class713[5000];
      class289.field3990 = 0;
      class156.field2017 = new class680[5000];
      class315.field4362 = 0;
      class276.field3516 = new boolean[class106.field1403 + class106.field1403 + 1][class106.field1403 + class106.field1403 + 1];
      class134.field1685 = new boolean[class106.field1403 + class106.field1403 + 2][class106.field1403 + class106.field1403 + 2];
      class579.field8574 = new int[class106.field1403 + class106.field1403 + 2];
      class422.field5749 = class422.field5751;
      if (class203.field2588) {
         class372.field5217 = new boolean[arg3][class106.field1403 + class106.field1403 + 1][class106.field1403 + class106.field1403 + 1];
         class587.field8659 = new boolean[arg3][][];
         if (class403.field5537 != null) {
            class570.method4276();
         }

         class403.field5537 = new class656[class500.field6974];
         class158.field2032.method514(class403.field5537.length + 1);
         class158.field2032.method394(0);

         for(int var9 = 0; var9 < class403.field5537.length; ++var9) {
            class403.field5537[var9] = new class656(var9 + 1, class158.field2032);
            (new Thread(class403.field5537[var9], field418[6] + var9)).start();
         }

         byte var10;
         if (class500.field6974 == 2) {
            var10 = 4;
            class385.field5335 = 2;
         } else if (class500.field6974 == 3) {
            var10 = 6;
            class385.field5335 = 3;
         } else {
            var10 = 8;
            class385.field5335 = 4;
         }

         class700.field10259 = new class204[var10];

         for(int var11 = 0; var11 < var10; ++var11) {
            class700.field10259[var11] = new class204(class84.field1164[class500.field6974 - 2][var11]);
         }
      } else {
         class385.field5335 = 1;
      }

      class278.field3549 = new int[class385.field5335 - 1];
      class785.field11472 = new int[class385.field5335 - 1];
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method225(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method226(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
