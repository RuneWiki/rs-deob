import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class722 {
   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10451 = new String[]{method5245(method5244("~s\u001fD")), method5245(method5244("k(]\u0006z")), method5245(method5244("zn\u0012\u0006@8")), method5245(method5244("zn\u0012\u0006D8")), method5245(method5244("zn\u0012\u0006A8")), method5245(method5244("zn\u0012\u0006B8")), method5245(method5244("zn\u0012\u0006F8")), method5245(method5244("zn\u0012\u0006C8")), method5245(method5244("xtIDu")), method5245(method5244("zn\u0012\u0006E8"))};
   @OriginalMember(
      owner = "client!jha",
      name = "e",
      descriptor = "Luw;"
   )
   public static class435 field10448 = new class435(78, 6);
   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "Lqg;"
   )
   public static class485 field10450 = new class485(2, 2);
   @OriginalMember(
      owner = "client!jha",
      name = "h",
      descriptor = "I"
   )
   public int field10440;
   @OriginalMember(
      owner = "client!jha",
      name = "f",
      descriptor = "I"
   )
   public static int field10441;
   @OriginalMember(
      owner = "client!jha",
      name = "k",
      descriptor = "I"
   )
   public static int field10442;
   @OriginalMember(
      owner = "client!jha",
      name = "i",
      descriptor = "I"
   )
   public static int field10443;
   @OriginalMember(
      owner = "client!jha",
      name = "j",
      descriptor = "I"
   )
   public int field10444;
   @OriginalMember(
      owner = "client!jha",
      name = "d",
      descriptor = "I"
   )
   public int field10445;
   @OriginalMember(
      owner = "client!jha",
      name = "g",
      descriptor = "I"
   )
   public static int field10446;
   @OriginalMember(
      owner = "client!jha",
      name = "c",
      descriptor = "I"
   )
   public static int field10447;
   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "I"
   )
   public static int field10449;

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5237(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var6;
         int var7;
         label15: {
            ++field10447;
            float var5 = (float)class370.field5506 / (float)class370.field5496;
            var6 = arg2;
            var7 = arg4;
            if (!(var5 < (float)arg0)) {
               var6 = (int)((float)arg4 / var5);
               if (!client.field4564) {
                  break label15;
               }
            }

            var7 = (int)((float)arg2 * var5);
         }

         int var10 = arg1 - (arg4 - var7) / 2;
         int var11 = arg3 - (-var6 + arg2) / 2;
         class3.field22 = -1;
         class755.field10968 = class370.field5496 * var11 / var6;
         class48.field1043 = -(class370.field5506 * var10 / var7) + class370.field5506;
         class493.field7185 = -1;
         class632.method4645(-126);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10451[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(ILkk;B)Z"
   )
   public static final boolean method5238(int arg0, class200 arg1, byte arg2) {
      try {
         ++field10443;
         int var3 = arg1.method1714((byte)-34, 2);
         if (var3 == 0) {
            if (arg1.method1714((byte)-34, 1) != 0) {
               method5238(arg0, arg1, (byte)-124);
            }

            int var4 = arg1.method1714((byte)-34, 6);
            int var5 = arg1.method1714((byte)-34, 6);
            boolean var6 = arg1.method1714((byte)-34, 1) == 1;
            if (var6) {
               class342.field4857[class477.field6954++] = arg0;
            }

            if (class458.field6723[arg0] != null) {
               throw new RuntimeException(field10451[8]);
            } else {
               class312 var7 = class60.field1140[arg0];
               class457 var8 = class458.field6723[arg0] = new class457();
               var8.field11306 = arg0;
               if (class774.field11341[arg0] != null) {
                  var8.method3433(-123, class774.field11341[arg0]);
               }

               var8.method5577(-31308, var7.field4493, true);
               var8.field11263 = var7.field4490;
               int var9 = var7.field4494;
               int var10 = var9 >> 28;
               int var11 = (var9 & 4186550) >> 14;
               int var12 = 255 & var9;
               int var13 = (var11 << 6) + -class347.field4939 + var4;
               var8.field6707 = var7.field4489;
               int var14 = (var12 << 6) - class753.field10887 + var5;
               var8.field6672 = var7.field4492;
               var8.field11318[0] = class171.field2656[arg0];
               var8.field4090 = var8.field4091 = (byte)var10;
               if (class561.method4189(var13, -32018, var14)) {
                  ++var8.field4091;
               }

               var8.method3437(63, var14, var13);
               var8.field6702 = false;
               class60.field1140[arg0] = null;
               return true;
            }
         } else if (var3 == 1) {
            int var15 = arg1.method1714((byte)-34, 2);
            int var16 = class60.field1140[arg0].field4494;
            class60.field1140[arg0].field4494 = ((3 & (var16 >> 28) - -var15) << 28) + (var16 & 268435455);
            return false;
         } else if (~var3 == -3) {
            int var17 = arg1.method1714((byte)-34, 5);
            int var18 = var17 >> 3;
            int var19 = 7 & var17;
            int var20 = class60.field1140[arg0].field4494;
            int var21 = (var20 >> 28) - -var18 & 3;
            int var22 = var20 >> 14 & 255;
            int var23 = var20 & 255;
            if (~var19 == -1) {
               --var22;
               --var23;
            }

            if (var19 == 1) {
               --var23;
            }

            if (var19 == 2) {
               ++var22;
               --var23;
            }

            if (~var19 == -4) {
               --var22;
            }

            if (var19 == 4) {
               ++var22;
            }

            if (~var19 == -6) {
               ++var23;
               --var22;
            }

            if (~var19 == -7) {
               ++var23;
            }

            if (~var19 == -8) {
               ++var22;
               ++var23;
            }

            class60.field1140[arg0].field4494 = (var21 << 28) + (var22 << 14) + var23;
            return false;
         } else {
            int var24 = arg1.method1714((byte)-34, 18);
            if (arg2 > -108) {
               method5240(77, (class144)null);
            }

            int var25 = var24 >> 16;
            int var26 = (var24 & 65477) >> 8;
            int var27 = 255 & var24;
            int var28 = class60.field1140[arg0].field4494;
            int var29 = 3 & (var28 >> 28) + var25;
            int var30 = (var28 >> 14) + var26 & 255;
            int var31 = 255 & var27 + var28;
            class60.field1140[arg0].field4494 = (var30 << 14) + ((var29 << 28) - -var31);
            return false;
         }
      } catch (RuntimeException var33) {
         throw class608.method4462(var33, field10451[9] + arg0 + ',' + (arg1 != null ? field10451[1] : field10451[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5239(int arg0, int arg1) {
      try {
         ++field10446;
         int var2 = -class157.field2511 + class29.field458;
         if (~var2 <= -101) {
            class590.field8514 = 1;
            class234.field3408 = -1;
            class501.field7296 = -1;
         } else {
            int var3 = (int)class621.field9035;
            if (class463.field6770 >> 8 > var3) {
               var3 = class463.field6770 >> 8;
            }

            if (class718.field10370[4] && ~(class734.field10557[4] + 128) < ~var3) {
               var3 = class734.field10557[4] - -128;
            }

            float var5;
            int var6;
            label31: {
               int var4 = (int)class756.field10975 + class585.field8463 & 16383;
               class764.method5529(var3, arg1 + -101, var4, class587.field8484, class663.method4851(class304.field4398.field4096, class304.field4398.field4101, class731.field10504, 123) - 200, 600 - -((var3 >> 3) * 3) << 2, arg0, class243.field3500);
               var5 = 1.0F - (float)((arg1 - var2) * (100 - var2) * (-var2 + 100)) / 1000000.0F;
               class677.field9932 = (int)((float)(class677.field9932 - class200.field2993) * var5 + (float)class200.field2993);
               class583.field8442 = (int)((float)(-class715.field10349 + class583.field8442) * var5 + (float)class715.field10349);
               class494.field7193 = (int)((float)(-class474.field6927 + class494.field7193) * var5 + (float)class474.field6927);
               class414.field6073 = (int)((float)(-class524.field7665 + class414.field6073) * var5 + (float)class524.field7665);
               var6 = class373.field5548 - class13.field191;
               if (~var6 >= -8193) {
                  if (var6 >= -8192) {
                     break label31;
                  }

                  var6 += 16384;
                  if (!client.field4564) {
                     break label31;
                  }
               }

               var6 -= 16384;
            }

            class373.field5548 = (int)((float)var6 * var5 + (float)class13.field191);
            class373.field5548 &= 16383;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10451[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(ILmc;)Lqj;"
   )
   public static final class533 method5240(int arg0, class144 arg1) {
      try {
         if (arg0 != 4) {
            return null;
         } else {
            class533 var2;
            label24: {
               ++field10441;
               if (class665.field9669 != null) {
                  var2 = class665.field9669;
                  class665.field9669 = class665.field9669.field7763;
                  var2.field7763 = null;
                  --class41.field962;
                  if (!client.field4564) {
                     break label24;
                  }
               }

               var2 = new class533();
            }

            var2.field7766 = arg1;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10451[2] + arg0 + ',' + (arg1 != null ? field10451[1] : field10451[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(Luda;I)V"
   )
   public final void method5241(class473 arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10449;

         while(true) {
            int var4 = arg0.method3564((byte)-44);
            if (~var4 != -1) {
               this.method5242(arg0, arg1 ^ 5, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != -128) {
               this.field10444 = 38;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10451[6] + (arg0 != null ? field10451[1] : field10451[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   private final void method5242(class473 arg0, int arg1, int arg2) {
      try {
         int var4 = 44 % ((arg1 - -60) / 46);
         if (arg2 == 1) {
            this.field10445 = arg0.method3565(true);
            this.field10444 = arg0.method3564((byte)-75);
            this.field10440 = arg0.method3564((byte)-65);
         }

         ++field10442;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10451[3] + (arg0 != null ? field10451[1] : field10451[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5243(byte arg0) {
      try {
         field10448 = null;
         field10450 = null;
         int var1 = 5 % ((82 - arg0) / 38);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10451[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5244(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5245(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
