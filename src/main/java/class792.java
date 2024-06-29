import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class792 extends class213 {
   @OriginalMember(
      owner = "client!eca",
      name = "y",
      descriptor = "I"
   )
   private int field11607 = -1;
   @OriginalMember(
      owner = "client!eca",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11614 = new String[]{method5714(method5713("pksb==")), method5714(method5713("{}~ ")), method5714(method5713("pksb:=")), method5714(method5713("n&<b\u0004")), method5714(method5713("pksb;=")), method5714(method5713("pksb?=")), method5714(method5713("pksb8=")), method5714(method5713("pksb<="))};
   @OriginalMember(
      owner = "client!eca",
      name = "v",
      descriptor = "Lbo;"
   )
   public static class762 field11608 = new class762();
   @OriginalMember(
      owner = "client!eca",
      name = "x",
      descriptor = "B"
   )
   private byte field11604;
   @OriginalMember(
      owner = "client!eca",
      name = "C",
      descriptor = "I"
   )
   public static int field11603;
   @OriginalMember(
      owner = "client!eca",
      name = "D",
      descriptor = "I"
   )
   public static int field11605;
   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "I"
   )
   public static int field11606;
   @OriginalMember(
      owner = "client!eca",
      name = "A",
      descriptor = "I"
   )
   public static int field11609;
   @OriginalMember(
      owner = "client!eca",
      name = "w",
      descriptor = "I"
   )
   public static int field11611;
   @OriginalMember(
      owner = "client!eca",
      name = "u",
      descriptor = "Lll;"
   )
   public static class387 field11613;
   @OriginalMember(
      owner = "client!eca",
      name = "t",
      descriptor = "Lbg;"
   )
   public static class492 field11612;
   @OriginalMember(
      owner = "client!eca",
      name = "B",
      descriptor = "[Lqu;"
   )
   public static class106[] field11610;

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         ++field11609;
         if (arg1 >= -38) {
            this.method1343((class472)null, true);
         }

         this.field11607 = arg0.method1211(-26166);
         this.field11604 = arg0.method1162(4);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11614[2] + (arg0 != null ? field11614[3] : field11614[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5709(int arg0) {
      try {
         if (arg0 != 524288) {
            field11612 = null;
         }

         field11610 = null;
         field11608 = null;
         field11612 = null;
         field11613 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11614[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(IIBLbda;Lrv;)V"
   )
   public static final void method5710(int arg0, int arg1, byte arg2, class534 arg3, class121 arg4) {
      boolean var5 = client.field4360;

      try {
         ++field11603;
         if (arg2 < 98) {
            field11612 = null;
         }

         byte var6 = -1;
         if ((arg0 & 8192) != 0) {
            arg4.field1535 = arg3.method1194(14623) == 1;
         }

         if (~(arg0 & 1024) != -1) {
            label278: {
               arg4.field3811 = arg3.method1204(2119550368);
               if (~arg4.field3811.charAt(0) != -127) {
                  if (class564.field8045 != arg4) {
                     break label278;
                  }

                  class3.method11(arg4.method979(true, true), 2, arg4.method980(false, 0), arg4.field3811, 0, arg4.field1556, (byte)116);
                  if (!var5) {
                     break label278;
                  }
               }

               arg4.field3811 = arg4.field3811.substring(1);
               class3.method11(arg4.method979(true, true), 2, arg4.method980(false, 0), arg4.field3811, 0, arg4.field1556, (byte)-25);
            }

            arg4.field3839 = 150;
            arg4.field3875 = 0;
            arg4.field3823 = 0;
         }

         if ((arg0 & 1) != 0) {
            class187.field2660[arg1] = arg3.method1171(-128);
         }

         if ((arg0 & 32) != 0) {
            int var7 = arg3.method1194(14623);
            if (var7 > 0) {
               int var8 = 0;
               if (var5 || var7 > var8) {
                  do {
                     int var9;
                     int var10;
                     int var11;
                     int var12;
                     label289: {
                        var9 = -1;
                        var10 = -1;
                        var11 = arg3.method1145((byte)123);
                        var12 = -1;
                        if (var11 == 32767) {
                           var11 = arg3.method1145((byte)109);
                           var10 = arg3.method1145((byte)91);
                           var9 = arg3.method1145((byte)115);
                           var12 = arg3.method1145((byte)68);
                           if (!var5) {
                              break label289;
                           }
                        }

                        if (~var11 == -32767) {
                           var11 = -1;
                           if (!var5) {
                              break label289;
                           }
                        }

                        var10 = arg3.method1145((byte)61);
                     }

                     int var13 = arg3.method1145((byte)83);
                     int var14 = arg3.method1174((byte)124);
                     arg4.method2131(class96.field1234, var10, (byte)16, var12, var14, var13, var9, var11);
                     ++var8;
                  } while(var7 > var8);
               }
            }
         }

         if ((arg0 & 64) != 0) {
            int var15 = arg3.method1210((byte)126);
            int var16 = arg3.method1164(19693);
            if (var15 == 65535) {
               var15 = -1;
            }

            int var17 = arg3.method1194(14623);
            int var18 = var17 & 7;
            int var19 = var17 >> 3 & 15;
            if (var19 == 15) {
               var19 = -1;
            }

            arg4.method2127(var18, (byte)-25, 0, var15, var19, var16);
         }

         if (~(262144 & arg0) != -1) {
            int var20 = arg3.method1210((byte)126);
            int var21 = arg3.method1164(19693);
            if (var20 == 65535) {
               var20 = -1;
            }

            int var22 = arg3.method1194(14623);
            int var23 = 7 & var22;
            int var24 = (122 & var22) >> 3;
            if (var24 == 15) {
               var24 = -1;
            }

            arg4.method2127(var23, (byte)-25, 2, var20, var24, var21);
         }

         if ((arg0 & 4096) != 0) {
            int var25 = arg3.method1210((byte)126);
            arg4.field3878 = arg3.method1143(-15465);
            arg4.field3803 = arg3.method1174((byte)-108);
            arg4.field3877 = (var25 & 32768) != 0;
            arg4.field3847 = 32767 & var25;
            arg4.field3819 = class96.field1234 + arg4.field3847 + arg4.field3878;
         }

         if ((arg0 & 524288) != 0) {
            int var26 = arg3.method1143(-15465);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            int var29 = 0;
            if (var5 || ~var26 < ~var29) {
               do {
                  int var30 = arg3.method1211(-26166);
                  if (~(49152 & var30) != -49153) {
                     var27[var29] = var30;
                     if (!var5) {
                        var28[var29] = arg3.method1154(true);
                        ++var29;
                        continue;
                     }
                  }

                  int var31 = arg3.method1210((byte)126);
                  var27[var29] = class300.method2238(var30 << 16, var31);
                  var28[var29] = arg3.method1154(true);
                  ++var29;
               } while(~var26 < ~var29);
            }

            arg4.method2126(var28, 105, var27);
         }

         if (~(arg0 & 2) != -1) {
            int var32 = arg3.method1194(14623);
            byte[] var33 = new byte[var32];
            class147 var34 = new class147(var33);
            arg3.method1173(0, var32, (byte)-86, var33);
            class483.field6906[arg1] = var34;
            arg4.method974((byte)92, var34);
         }

         if ((arg0 & 128) != 0) {
            arg4.field1545 = arg3.method1210((byte)126);
            if (arg4.field3891 == 0) {
               arg4.method2114(-12281, arg4.field1545);
               arg4.field1545 = -1;
            }
         }

         if (~(arg0 & 2048) != -1) {
            var6 = arg3.method1206((byte)-117);
         }

         if ((arg0 & 8) != 0) {
            int[] var35 = new int[4];
            int var36 = 0;
            if (var5) {
               var35[var36] = arg3.method1210((byte)126);
               if (var35[var36] == 65535) {
                  var35[var36] = -1;
               }

               ++var36;
            }

            while(true) {
               if (~var36 <= -5) {
                  int var37 = arg3.method1174((byte)26);
                  if (!var5) {
                     class447.method3279(arg4, var37, var35, 0);
                     break;
                  }
               } else {
                  var35[var36] = arg3.method1210((byte)126);
               }

               if (var35[var36] == 65535) {
                  var35[var36] = -1;
               }

               ++var36;
            }
         }

         if ((65536 & arg0) != 0) {
            arg4.field3790 = arg3.method1168(128);
            arg4.field3808 = arg3.method1206((byte)-125);
            arg4.field3812 = arg3.method1168(128);
            arg4.field3800 = (byte)arg3.method1174((byte)125);
            arg4.field3815 = class96.field1234 - -arg3.method1176(-32768);
            arg4.field3865 = class96.field1234 - -arg3.method1176(-32768);
         }

         if ((256 & arg0) != 0) {
            int var38 = arg3.method1194(14623);
            int[] var39 = new int[var38];
            int[] var40 = new int[var38];
            int[] var41 = new int[var38];
            int var42 = 0;
            if (var5 || ~var42 > ~var38) {
               do {
                  int var43 = arg3.method1154(true);
                  if (var43 == 65535) {
                     var43 = -1;
                  }

                  var39[var42] = var43;
                  var40[var42] = arg3.method1194(14623);
                  var41[var42] = arg3.method1154(true);
                  ++var42;
               } while(~var42 > ~var38);
            }

            class584.method4258(var39, var40, (byte)-98, arg4, var41);
         }

         if ((arg0 & 512) != 0) {
            label187: {
               arg4.field3873 = arg3.method1171(-128);
               arg4.field3835 = arg3.method1171(-128);
               arg4.field3853 = arg3.method1162(4);
               arg4.field3818 = arg3.method1171(-128);
               arg4.field3795 = arg3.method1154(true) - -class96.field1234;
               arg4.field3832 = arg3.method1211(-26166) - -class96.field1234;
               arg4.field3848 = arg3.method1194(14623);
               if (!arg4.field1574) {
                  arg4.field3853 += arg4.field3888[0];
                  arg4.field3835 += arg4.field3884[0];
                  arg4.field3891 = 1;
                  arg4.field3873 += arg4.field3888[0];
                  arg4.field3818 += arg4.field3884[0];
                  if (!var5) {
                     break label187;
                  }
               }

               arg4.field3818 += arg4.field1523;
               arg4.field3853 += arg4.field1572;
               arg4.field3891 = 0;
               arg4.field3873 += arg4.field1572;
               arg4.field3835 += arg4.field1523;
            }

            arg4.field3886 = 0;
         }

         if (~(arg0 & 131072) != -1) {
            arg4.field1555 = arg3.method1194(14623) == 1;
         }

         if (~(16 & arg0) != -1) {
            int var44 = arg3.method1176(-32768);
            if (~var44 == -65536) {
               var44 = -1;
            }

            arg4.field3857 = var44;
         }

         if ((16384 & arg0) != 0) {
            int var45 = arg3.method1210((byte)126);
            if (~var45 == -65536) {
               var45 = -1;
            }

            int var46 = arg3.method1164(19693);
            int var47 = arg3.method1189(0);
            int var48 = 7 & var47;
            int var49 = (var47 & 127) >> 3;
            if (var49 == 15) {
               var49 = -1;
            }

            arg4.method2127(var48, (byte)-25, 1, var45, var49, var46);
         }

         if (arg4.field1574) {
            if (~var6 == -128) {
               arg4.method968(arg4.field1572, (byte)-110, arg4.field1523);
            } else {
               byte var50;
               label175: {
                  if (var6 != -1) {
                     var50 = var6;
                     if (!var5) {
                        break label175;
                     }
                  }

                  var50 = class187.field2660[arg1];
               }

               class562.method4016(var50, 125, arg4);
               arg4.method977(arg4.field1523, var50, arg4.field1572, (byte)120);
            }
         }
      } catch (RuntimeException var52) {
         throw class237.method1823(var52, field11614[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11614[3] : field11614[1]) + ',' + (arg4 != null ? field11614[3] : field11614[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5711(int arg0, int arg1) {
      try {
         ++field11605;
         if (arg1 != 5510) {
            field11608 = null;
         }

         return ~arg0 == -1 || ~arg0 == -2 || ~arg0 == -3;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11614[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5712(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -14258) {
            return false;
         } else {
            ++field11611;
            return (540800 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11614[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(Lqv;Z)V"
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         ++field11606;
         if (arg1) {
            arg0.method3437(this.field11604, false, this.field11607);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11614[6] + (arg0 != null ? field11614[3] : field11614[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5713(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5714(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
