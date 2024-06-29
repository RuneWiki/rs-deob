import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 {
   @OriginalMember(
      owner = "client!bja",
      name = "e",
      descriptor = "I"
   )
   private int field494 = 0;
   @OriginalMember(
      owner = "client!bja",
      name = "h",
      descriptor = "I"
   )
   private int field495 = 0;
   @OriginalMember(
      owner = "client!bja",
      name = "j",
      descriptor = "I"
   )
   private int field501 = 0;
   @OriginalMember(
      owner = "client!bja",
      name = "f",
      descriptor = "Lea;"
   )
   private class573 field490;
   @OriginalMember(
      owner = "client!bja",
      name = "k",
      descriptor = "Lds;"
   )
   private class16 field499;
   @OriginalMember(
      owner = "client!bja",
      name = "c",
      descriptor = "[Lma;"
   )
   private class14[] field493;
   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "Lqh;"
   )
   public class75 field489;
   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field502 = new String[]{method306(method305("@1i*\\\n")), method306(method305("@1i*^\n")), method306(method305("@1i*Y\n")), method306(method305("Yu&*b")), method306(method305("L.dh")), method306(method305("@1i*#K5ap!\n")), method306(method305("@1i*Z\n")), method306(method305("@1i*]\n"))};
   @OriginalMember(
      owner = "client!bja",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field491 = false;
   @OriginalMember(
      owner = "client!bja",
      name = "i",
      descriptor = "I"
   )
   public static int field492;
   @OriginalMember(
      owner = "client!bja",
      name = "l",
      descriptor = "I"
   )
   public static int field496;
   @OriginalMember(
      owner = "client!bja",
      name = "g",
      descriptor = "I"
   )
   public static int field497;
   @OriginalMember(
      owner = "client!bja",
      name = "b",
      descriptor = "I"
   )
   public static int field498;
   @OriginalMember(
      owner = "client!bja",
      name = "d",
      descriptor = "I"
   )
   public static int field500;

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(II)Z",
      line = 3
   )
   public final boolean method299(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            this.field499 = null;
         }

         ++field492;
         return this.field493[arg1].method87(-87);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field502[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V",
      line = 14
   )
   public static final void method300(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
      class273.field3754 = true;
      class316.field4302 = class80.field1038.method593() > 0;
      class621.field9143 = arg15;
      class712.field10385 = arg1 >> class773.field11359;
      class377.field5453 = arg3 >> class773.field11359;
      class225.field3201 = arg1;
      class84.field1093 = arg3;
      class222.field3164 = arg2;
      class741.field10805 = class712.field10385 - class106.field1335;
      if (class741.field10805 < 0) {
         class447.field6351 = -class741.field10805;
         class741.field10805 = 0;
      } else {
         class447.field6351 = 0;
      }

      class110.field1388 = class377.field5453 - class106.field1335;
      if (class110.field1388 < 0) {
         class542.field7781 = -class110.field1388;
         class110.field1388 = 0;
      } else {
         class542.field7781 = 0;
      }

      class786.field11546 = class712.field10385 + class106.field1335;
      if (class786.field11546 > class457.field6539) {
         class786.field11546 = class457.field6539;
      }

      class559.field8011 = class377.field5453 + class106.field1335;
      if (class559.field8011 > class16.field190) {
         class559.field8011 = class16.field190;
      }

      boolean[][] var19 = class506.field7334;
      boolean[][] var20 = class433.field6210;
      if (class621.field9143) {
         for(int var21 = 0; var21 < class106.field1335 + class106.field1335 + 2; ++var21) {
            int var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < class106.field1335 + class106.field1335 + 2; ++var24) {
               if (var24 > 1) {
                  class25.field404[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = class712.field10385 - class106.field1335 + var21;
               int var26 = class377.field5453 - class106.field1335 + var24;
               if (var25 >= 0 && var26 >= 0 && var25 < class457.field6539 && var26 < class16.field190) {
                  int var27 = var25 << class773.field11359;
                  int var28 = var26 << class773.field11359;
                  int var29 = class265.field3658[class265.field3658.length - 1].method2219(true, var25, var26) - (1000 << class773.field11359 - 7);
                  int var30 = class757.field11220 != null ? class757.field11220[0].method2219(true, var25, var26) + class729.field10681 : class265.field3658[0].method2219(true, var25, var26) + class729.field10681;
                  var23 = arg16 >= 0 ? class80.field1038.method541(var27, var29, var28, var27, var30, var28, arg16) : class80.field1038.method494(var27, var29, var28, var27, var30, var28);
                  class433.field6210[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  class433.field6210[var21][var24] = false;
               }

               if (var21 > 0 && var24 > 0) {
                  int var31 = class25.field404[var24 - 1] & class25.field404[var24] & var22 & var23;
                  class506.field7334[var21 - 1][var24 - 1] = var31 == 0;
               }
            }

            class25.field404[class106.field1335 + class106.field1335] = var22;
            class25.field404[class106.field1335 + class106.field1335 + 1] = var23;
         }

         if (arg16 >= 0) {
            class273.field3754 = false;
         } else {
            class407.field5890 = arg5;
            class38.field545 = arg6;
            class705.field10307 = arg7;
            class522.field7502 = arg8;
            class405.field5858 = arg9;
            class189.method1495(arg10, class80.field1038, -113);
         }
      } else {
         if (class228.field3219 == null) {
            class228.field3219 = new boolean[class457.field6539 + class457.field6539 + 1][class457.field6539 + class16.field190 + 1];
         }

         for(int var32 = 0; var32 < class228.field3219.length; ++var32) {
            for(int var42 = 0; var42 < class228.field3219[0].length; ++var42) {
               class228.field3219[var32][var42] = true;
            }
         }

         class433.field6210 = class228.field3219;
         class506.field7334 = class228.field3219;
         class741.field10805 = 0;
         class110.field1388 = 0;
         class786.field11546 = class457.field6539;
         class559.field8011 = class16.field190;
         class273.field3754 = false;
      }

      class711.method5168(class80.field1038, -128);
      if (!class146.field1851.field3632) {
         class762 var33 = class146.field1851.field3628;

         for(class623 var34 = (class623)var33.method5529((byte)-42); var34 != null; var34 = (class623)var33.method5527((byte)45)) {
            var34.method12((byte)-122);
            class198.method1565(false, var34);
         }
      }

      if (class316.field4302) {
         for(int var35 = 0; var35 < class299.field4095; ++var35) {
            class220.field3145[var35].method4611(80, arg14, arg0);
         }
      }

      if (class767.field11310) {
         class298.field4085 = class80.field1038.method558();
         class80.field1038.method605(class692.field10186);
         int var36 = (class692.field10186[2] - class692.field10186[0]) / class199.field2833;

         for(int var37 = 0; var37 < class199.field2833 - 1; ++var37) {
            class652.field9556[var37] = (var37 + 1) * var36 + class493.field7039[var37];
         }

         for(int var38 = 0; var38 < class314.field4294.length; ++var38) {
            class314.field4294[var38].method3774();
         }
      }

      if (class75.field933 != null) {
         if (class767.field11310) {
            class473.method3445(0);
         }

         class769.method5569(true);
         class80.field1038.method536(-1, 1583160, 40, 127);
         class68.method641(true, arg4, arg10, arg11, arg16, arg17, arg18);
         if (class767.field11310) {
            class425.method3142();
         }

         class80.field1038.method518();
         class769.method5569(false);
      }

      class68.method641(false, arg4, arg10, arg11, arg16, arg17, arg18);
      if (class767.field11310) {
         for(int var39 = 0; var39 < class154.field2185; ++var39) {
            class747.field11059[var39] = class637.field9318[var39];
         }

         class473.method3445(0);

         for(int var40 = 0; var40 < class314.field4294.length; ++var40) {
            class314.field4294[var40].method3774();
         }
      }

      if (class767.field11310) {
         class425.method3142();

         for(int var41 = 0; var41 < class154.field2185; ++var41) {
            class637.field9318[var41] = class747.field11059[var41];
         }

         if (class140.field1792 == 2) {
            int var10002;
            if (class285.field3952[0] < class285.field3952[1]) {
               if (class652.field9556[0] + class493.field7039[0] > class692.field10186[0]) {
                  var10002 = class493.field7039[0]++;
               }
            } else if (class285.field3952[0] > class285.field3952[1] && class652.field9556[0] + class493.field7039[0] < class692.field10186[2]) {
               var10002 = class493.field7039[0]--;
            }
         }
      }

      if (!class621.field9143) {
         class506.field7334 = var19;
         class433.field6210 = var20;
      }

      class490.method3560();
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(IILsl;)Z",
      line = 297
   )
   public final boolean method301(int arg0, int arg1, class486 arg2) {
      try {
         ++field497;
         if (this.field501 == arg1) {
            return false;
         } else {
            this.field493[this.field501 & Integer.MAX_VALUE].method86((byte)121, arg2, arg0);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field502[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field502[3] : field502[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(JII)Ljava/lang/String;",
      line = 320
   )
   public static final String method302(long arg0, int arg1, int arg2) {
      try {
         class111.method907((byte)-68, arg0);
         ++field500;
         int var4 = class176.field2442.get(5);
         int var5 = class176.field2442.get(arg1);
         int var6 = class176.field2442.get(1);
         return ~arg2 == -4 ? class468.method3396(arg1 + -10780, arg2, arg0) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class85.field1101[arg2][var5] + "-" + var6;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field502[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 418
   )
   public class34(class573 arg0) {
      try {
         this.field490 = arg0;
         this.field499 = new class16(arg0);
         this.field493 = new class14[10];
         this.field493[1] = new class776(arg0);
         this.field493[2] = new class182(arg0, this.field499);
         this.field493[4] = new class558(arg0, this.field499);
         this.field493[5] = new class341(arg0, this.field499);
         this.field493[6] = new class355(arg0);
         this.field493[7] = new class368(arg0);
         this.field493[3] = this.field489 = new class75(arg0);
         this.field493[8] = new class707(arg0, this.field499);
         this.field493[9] = new class170(arg0, this.field499);
         if (!this.field493[8].method87(-72)) {
            this.field493[8] = this.field493[4];
         }

         if (!this.field493[9].method87(-104)) {
            this.field493[9] = this.field493[8];
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field502[5] + (arg0 != null ? field502[3] : field502[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(IIZIZI)V",
      line = 343
   )
   public final void method303(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
      try {
         ++field496;
         boolean var9 = arg4 & this.field490.method564();
         if (arg1 <= 10) {
            method304(-37, -122, 74);
         }

         if (!var9 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (~arg3 == -5) {
               arg0 = arg5;
            }

            arg3 = 2;
         }

         if (arg3 != 0 && arg2) {
            arg3 |= Integer.MIN_VALUE;
         }

         if (~this.field501 != ~arg3) {
            if (this.field501 != 0) {
               this.field493[this.field501 & Integer.MAX_VALUE].method85(17328);
            }

            if (~arg3 != -1) {
               this.field493[arg3 & Integer.MAX_VALUE].method84(arg2, 13254);
               this.field493[Integer.MAX_VALUE & arg3].method88(16, arg2);
               this.field493[arg3 & Integer.MAX_VALUE].method82(13880, arg5, arg0);
            }

            this.field494 = arg5;
            this.field495 = arg0;
            this.field501 = arg3;
         } else if (this.field501 != 0) {
            this.field493[Integer.MAX_VALUE & this.field501].method88(16, arg2);
            if (~this.field494 != ~arg5 || this.field495 != arg0) {
               this.field493[Integer.MAX_VALUE & this.field501].method82(13880, arg5, arg0);
               this.field495 = arg0;
               this.field494 = arg5;
            }

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field502[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(III)Z",
      line = 405
   )
   public static final boolean method304(int arg0, int arg1, int arg2) {
      try {
         int var3 = -17 / ((arg2 - 40) / 34);
         ++field498;
         return ~(458752 & arg1) != -1 | class137.method1081(arg0, arg1, (byte)-30) || class652.method4779(arg1, arg0, (byte)-127);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field502[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method305(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method306(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
