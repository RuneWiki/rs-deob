import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class686 extends class15 {
   @OriginalMember(
      owner = "client!tfa",
      name = "u",
      descriptor = "Llba;"
   )
   public class224 field10101;
   @OriginalMember(
      owner = "client!tfa",
      name = "D",
      descriptor = "Lfha;"
   )
   public class289 field10107;
   @OriginalMember(
      owner = "client!tfa",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10114 = new String[]{method5025(method5024("\"\u0005A]")), method5025(method5024("8\u0016L\u001f+%\u001eDE)d")), method5025(method5024("7^\u0003\u001fj")), method5025(method5024("8\u0016L\u001fTd")), method5025(method5024("8\u0016L\u001fUd")), method5025(method5024("8\u0016L\u001fRd")), method5025(method5024("8\u0016L\u001fVd"))};
   @OriginalMember(
      owner = "client!tfa",
      name = "C",
      descriptor = "Laka;"
   )
   public static class418 field10112 = new class418(132, 4);
   @OriginalMember(
      owner = "client!tfa",
      name = "w",
      descriptor = "I"
   )
   public int field10102;
   @OriginalMember(
      owner = "client!tfa",
      name = "A",
      descriptor = "I"
   )
   public static int field10103;
   @OriginalMember(
      owner = "client!tfa",
      name = "B",
      descriptor = "I"
   )
   public static int field10104;
   @OriginalMember(
      owner = "client!tfa",
      name = "t",
      descriptor = "I"
   )
   public static int field10105;
   @OriginalMember(
      owner = "client!tfa",
      name = "y",
      descriptor = "I"
   )
   public static int field10108;
   @OriginalMember(
      owner = "client!tfa",
      name = "v",
      descriptor = "I"
   )
   public int field10109;
   @OriginalMember(
      owner = "client!tfa",
      name = "E",
      descriptor = "I"
   )
   public int field10110;
   @OriginalMember(
      owner = "client!tfa",
      name = "x",
      descriptor = "I"
   )
   public int field10111;
   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "I"
   )
   public int field10113;
   @OriginalMember(
      owner = "client!tfa",
      name = "s",
      descriptor = "Lu;"
   )
   public static class65 field10106;

   @OriginalMember(
      owner = "client!tfa",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method5019(int arg0) {
      try {
         field10112 = null;
         field10106 = null;
         if (arg0 > -34) {
            method5023(60, 20, 122, 37, (byte[][][])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, -13, (byte)-97, 110, -83, false, false, 50, -73, true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10114[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5020(int arg0) {
      try {
         this.field10110 = this.field10101.field2802;
         this.field10109 = this.field10101.field2800;
         ++field10103;
         this.field10111 = this.field10101.field2799;
         if (this.field10101.field2807 != null) {
            this.field10101.field2807.method865(this.field10107.field3995, this.field10107.field4002, this.field10107.field4007, class354.field4949);
         }

         if (arg0 == 2) {
            this.field10102 = class354.field4949[0];
            this.field10113 = class354.field4949[2];
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10114[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method5021(int arg0, int arg1, byte arg2) {
      try {
         ++field10108;
         if (class5.method44((byte)-29)) {
            if (~class428.field5822 != ~arg1) {
               class368.field5134 = "";
            }

            class139.field1755 = arg0;
            int var3 = 10 / ((31 - arg2) / 32);
            class428.field5822 = arg1;
            class577.method4324((byte)-125, 6);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10114[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5022(int arg0) {
      try {
         if (arg0 != 0) {
            method5022(-30);
         }

         ++field10105;
         if (class532.field7800 != null) {
            class532.field7800.method724(-1);
         }

         if (class511.field7135 != null) {
            while(true) {
               try {
                  class511.field7135.join();
                  return;
               } catch (InterruptedException var2) {
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10114[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V"
   )
   public static final void method5023(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
      class78.field1042 = true;
      class446.field6036 = class158.field2032.method487() > 0;
      class739.field10826 = arg15;
      class699.field10231 = arg1 >> class783.field11447;
      class664.field9833 = arg3 >> class783.field11447;
      class649.field9697 = arg1;
      class323.field4423 = arg3;
      class453.field6246 = arg2;
      class16.field283 = class699.field10231 - class106.field1403;
      if (class16.field283 < 0) {
         class313.field4344 = -class16.field283;
         class16.field283 = 0;
      } else {
         class313.field4344 = 0;
      }

      class274.field3507 = class664.field9833 - class106.field1403;
      if (class274.field3507 < 0) {
         class483.field6723 = -class274.field3507;
         class274.field3507 = 0;
      } else {
         class483.field6723 = 0;
      }

      class689.field10136 = class699.field10231 + class106.field1403;
      if (class689.field10136 > class137.field1743) {
         class689.field10136 = class137.field1743;
      }

      class213.field2707 = class664.field9833 + class106.field1403;
      if (class213.field2707 > class181.field2297) {
         class213.field2707 = class181.field2297;
      }

      boolean[][] var19 = class276.field3516;
      boolean[][] var20 = class134.field1685;
      if (class739.field10826) {
         for(int var21 = 0; var21 < class106.field1403 + class106.field1403 + 2; ++var21) {
            int var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < class106.field1403 + class106.field1403 + 2; ++var24) {
               if (var24 > 1) {
                  class579.field8574[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = class699.field10231 - class106.field1403 + var21;
               int var26 = class664.field9833 - class106.field1403 + var24;
               if (var25 >= 0 && var26 >= 0 && var25 < class137.field1743 && var26 < class181.field2297) {
                  int var27 = var25 << class783.field11447;
                  int var28 = var26 << class783.field11447;
                  int var29 = class373.field5223[class373.field5223.length - 1].method3284(-1, var25, var26) - (1000 << class783.field11447 - 7);
                  int var30 = class569.field8364 != null ? class569.field8364[0].method3284(-1, var25, var26) + class15.field276 : class373.field5223[0].method3284(-1, var25, var26) + class15.field276;
                  var23 = arg16 >= 0 ? class158.field2032.method442(var27, var29, var28, var27, var30, var28, arg16) : class158.field2032.method457(var27, var29, var28, var27, var30, var28);
                  class134.field1685[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  class134.field1685[var21][var24] = false;
               }

               if (var21 > 0 && var24 > 0) {
                  int var31 = class579.field8574[var24 - 1] & class579.field8574[var24] & var22 & var23;
                  class276.field3516[var21 - 1][var24 - 1] = var31 == 0;
               }
            }

            class579.field8574[class106.field1403 + class106.field1403] = var22;
            class579.field8574[class106.field1403 + class106.field1403 + 1] = var23;
         }

         if (arg16 >= 0) {
            class78.field1042 = false;
         } else {
            class141.field1774 = arg5;
            class273.field3487 = arg6;
            class403.field5532 = arg7;
            class105.field1361 = arg8;
            class614.field9046 = arg9;
            class118.method1039((byte)-42, arg10, class158.field2032);
         }
      } else {
         if (class86.field1185 == null) {
            class86.field1185 = new boolean[class137.field1743 + class137.field1743 + 1][class181.field2297 + class137.field1743 + 1];
         }

         for(int var32 = 0; var32 < class86.field1185.length; ++var32) {
            for(int var42 = 0; var42 < class86.field1185[0].length; ++var42) {
               class86.field1185[var32][var42] = true;
            }
         }

         class134.field1685 = class86.field1185;
         class276.field3516 = class86.field1185;
         class16.field283 = 0;
         class274.field3507 = 0;
         class689.field10136 = class137.field1743;
         class213.field2707 = class181.field2297;
         class78.field1042 = false;
      }

      class697.method5080(class158.field2032, 320);
      if (!class422.field5749.field544) {
         class627 var33 = class422.field5749.field543;

         for(class328 var34 = (class328)var33.method4639(-121); var34 != null; var34 = (class328)var33.method4636((byte)35)) {
            var34.method797((byte)94);
            class697.method5077((byte)1, var34);
         }
      }

      if (class446.field6036) {
         for(int var35 = 0; var35 < class77.field1023; ++var35) {
            class375.field5241[var35].method4853(arg0, arg14, 2048);
         }
      }

      if (class203.field2588) {
         class653.field9757 = class158.field2032.method419();
         class158.field2032.method417(class374.field5235);
         int var36 = (class374.field5235[2] - class374.field5235[0]) / class385.field5335;

         for(int var37 = 0; var37 < class385.field5335 - 1; ++var37) {
            class278.field3549[var37] = (var37 + 1) * var36 + class785.field11472[var37];
         }

         for(int var38 = 0; var38 < class403.field5537.length; ++var38) {
            class403.field5537[var38].method4817();
         }
      }

      if (class392.field5432 != null) {
         if (class203.field2588) {
            class125.method1083(0);
         }

         class665.method4861(true);
         class158.field2032.method447(-1, 1583160, 40, 127);
         class438.method3378(true, arg4, arg10, arg11, arg16, arg17, arg18);
         if (class203.field2588) {
            class670.method4892();
         }

         class158.field2032.method512();
         class665.method4861(false);
      }

      class438.method3378(false, arg4, arg10, arg11, arg16, arg17, arg18);
      if (class203.field2588) {
         for(int var39 = 0; var39 < class174.field2251; ++var39) {
            class587.field8659[var39] = class372.field5217[var39];
         }

         class125.method1083(0);

         for(int var40 = 0; var40 < class403.field5537.length; ++var40) {
            class403.field5537[var40].method4817();
         }
      }

      if (class203.field2588) {
         class670.method4892();

         for(int var41 = 0; var41 < class174.field2251; ++var41) {
            class372.field5217[var41] = class587.field8659[var41];
         }

         if (class500.field6974 == 2) {
            int var10002;
            if (class749.field10939[0] < class749.field10939[1]) {
               if (class785.field11472[0] + class278.field3549[0] > class374.field5235[0]) {
                  var10002 = class785.field11472[0]++;
               }
            } else if (class749.field10939[0] > class749.field10939[1] && class785.field11472[0] + class278.field3549[0] < class374.field5235[2]) {
               var10002 = class785.field11472[0]--;
            }
         }
      }

      if (!class739.field10826) {
         class276.field3516 = var19;
         class134.field1685 = var20;
      }

      class255.method2051();
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "<init>",
      descriptor = "(Llba;Luj;)V"
   )
   public class686(class224 arg0, class619 arg1) {
      try {
         this.field10101 = arg0;
         this.field10107 = this.field10101.method1790(126);
         this.method5020(2);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10114[1] + (arg0 != null ? field10114[2] : field10114[0]) + ',' + (arg1 != null ? field10114[2] : field10114[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5024(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5025(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
