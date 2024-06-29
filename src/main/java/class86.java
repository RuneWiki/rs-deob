import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class86 {
   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1313 = new String[]{method905(method904("*\u007fGb7")), method905(method904("*\u007fGa7")), method905(method904("{W\u0006@z7iS\u0004")), method905(method904("{J\u0005\u001e?")), method905(method904("\u001c{\u0004A%{S\u0007\u001e")), method905(method904("{T9g%{")), method905(method904(" 4G\nb")), method905(method904("g5\nKse:\u0011")), method905(method904("{V\b\u001e?")), method905(method904("\u00195\u001a\u0004P.nS")), method905(method904("~:A")), method905(method904("\u0014|\u000fLz:jS")), method905(method904("\f[;jV\u0015]S\u0004R>w\u0006Vf{o\u001aEx>:\u0006Rz):_\u0010R\u0019;Its>{\u001aA?2t\u000fKm6:\u001eLp>l\fV?2iIVz(j\u0006Jl2x\u0005A?=u\u001b\u0004k3\u007fIGp5n\fJkt{\u001bA~{c\u0006Q?:h\f\u0004j(s\u0007C02tG")), method905(method904("\u0016\u007f\u0004\u001e")), method905(method904("\u001dj\u001a\u001e")), method905(method904("~3")), method905(method904("\u00195\u001a")), method905(method904("*\u007fG`7")), method905(method904("{5I")), method905(method904("\u000bu\u0005]la:")), method905(method904("5o\u0005H")), method905(method904("\u0017iS\u0004")), method905(method904("\u0018{\nLza")), method905(method904("\u000b{\u001bPv8v\fW%{")), method905(method904("\u0017u\u000bFfa: J%")), method905(method904("gy\u0006H\"=|P\u0014+k$"))};
   @OriginalMember(
      owner = "client!qe",
      name = "e",
      descriptor = "Lhha;"
   )
   public static class724 field1310 = new class724(87, 6);
   @OriginalMember(
      owner = "client!qe",
      name = "c",
      descriptor = "F"
   )
   public static float field1312 = 0.0F;
   @OriginalMember(
      owner = "client!qe",
      name = "d",
      descriptor = "D"
   )
   public static double field1311;
   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "I"
   )
   public static int field1308;
   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "I"
   )
   public static int field1309;

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(IZI)[B"
   )
   public abstract byte[] method898(int arg0, boolean arg1, int arg2);

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(I)[B"
   )
   public abstract byte[] method899(int arg0);

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method900(int arg0, int arg1, int arg2) {
      try {
         ++field1309;
         if (arg1 != -1) {
            field1310 = null;
         }

         return class249.method2152(arg2, (byte)66, arg0) || class388.method3023(arg2, arg0, (byte)56);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1313[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(IIIIII[Ljga;IZII)V"
   )
   public static final void method901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class91[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
      boolean var11 = client.field10022;

      try {
         ++field1308;
         class54.field794.method150(arg1, arg2, arg7, arg4);
         if (arg9 != -96255198) {
            field1310 = null;
         }

         int var12 = 0;
         if (var11 || var12 < arg6.length) {
            do {
               class91 var13 = arg6[var12];
               if (var13 != null && (~var13.field1407 == ~arg10 || ~arg10 == 1412584498 && (class696.field10048 == var13 || var11))) {
                  int var14 = var13.field1341 + arg3;
                  int var15 = var13.field1425 + arg5;
                  int var16 = var14 - -var13.field1513 + 1;
                  int var17 = var13.field1452 + 1 + var15;
                  int var18;
                  if (arg0 == -1) {
                     class223.field3167[class766.field10999].setBounds(var13.field1341 + arg3, var13.field1425 + arg5, var13.field1513, var13.field1452);
                     var18 = class766.field10999++;
                     if (var11) {
                        var18 = arg0;
                     }
                  } else {
                     var18 = arg0;
                  }

                  var13.field1465 = class51.field770;
                  var13.field1427 = var18;
                  if (!client.method5053(var13)) {
                     label1019: {
                        if (~var13.field1418 != -1) {
                           class625.method4600(var13, (byte)119);
                        }

                        int var19 = var13.field1341 + arg3;
                        int var20 = var13.field1425 + arg5;
                        int var21 = 0;
                        int var22 = 0;
                        if (class563.field8012) {
                           var21 = class425.method3319(0);
                           var22 = class630.method4620((byte)85);
                        }

                        int var23 = var13.field1517;
                        if (class34.field514 && (~client.method5048(var13).field6076 != -1 || ~var13.field1403 == -1) && ~var23 < -128) {
                           var23 = 127;
                        }

                        if (class696.field10048 == var13) {
                           if (~arg10 != 1412584498 && (~class141.field2255 == ~var13.field1433 || ~class588.field8253 == ~var13.field1433)) {
                              class536.field7525 = arg5;
                              class173.field2582 = arg6;
                              class100.field1591 = arg3;
                              if (!var11) {
                                 break label1019;
                              }
                           }

                           if (class555.field7891 && class11.field179) {
                              int var24 = class387.field5645.method1549(-49) + var21;
                              int var25 = var22 + class387.field5645.method1560((byte)121);
                              int var26 = var24 - class279.field4232;
                              int var27 = var25 - class732.field10411;
                              if (~var26 > ~class464.field6752) {
                                 var26 = class464.field6752;
                              }

                              if (class464.field6752 + class138.field2224.field1513 < var13.field1513 + var26) {
                                 var26 = -var13.field1513 + class138.field2224.field1513 + class464.field6752;
                              }

                              if (var27 < class495.field7060) {
                                 var27 = class495.field7060;
                              }

                              if (~(class495.field7060 - -class138.field2224.field1452) > ~(var13.field1452 + var27)) {
                                 var27 = class495.field7060 + class138.field2224.field1452 + -var13.field1452;
                              }

                              var19 = var26;
                              var20 = var27;
                           }

                           if (~class588.field8253 == ~var13.field1433) {
                              var23 = 128;
                           }
                        }

                        int var30;
                        int var31;
                        int var32;
                        int var33;
                        label949: {
                           if (~var13.field1403 != -3) {
                              int var28 = var13.field1513 + var19;
                              int var29 = var13.field1452 + var20;
                              if (var13.field1403 == 9) {
                                 ++var28;
                                 ++var29;
                              }

                              var30 = arg1 >= var19 ? arg1 : var19;
                              var31 = ~arg2 <= ~var20 ? arg2 : var20;
                              var32 = arg7 <= var28 ? arg7 : var28;
                              var33 = arg4 > var29 ? var29 : arg4;
                              if (!var11) {
                                 break label949;
                              }
                           }

                           var31 = arg2;
                           var30 = arg1;
                           var33 = arg4;
                           var32 = arg7;
                        }

                        if (~var32 < ~var30 && (~var33 < ~var31 || var11)) {
                           label1058: {
                              if (var13.field1418 != 0) {
                                 if (class540.field7580 == var13.field1418 || ~class207.field2939 == ~var13.field1418) {
                                    class48.method531((byte)-105, var13, var19, var20);
                                    if (!class563.field8012) {
                                       class358.method2812(var20, 16777215, class207.field2939 == var13.field1418, var13.field1452, var19, var13.field1513);
                                       class54.field794.method150(arg1, arg2, arg7, arg4);
                                    }

                                    class417.field6107[var18] = true;
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }

                                 if (class375.field5480 == var13.field1418) {
                                    if (var13.method935(class54.field794, false) == null) {
                                       break label1058;
                                    }

                                    class622.method4576((byte)-65);
                                    class712.method5178(var13, class54.field794, var19, var20, 16233);
                                    class55.field798[var18] = true;
                                    class54.field794.method150(arg1, arg2, arg7, arg4);
                                    if (!class563.field8012) {
                                       break label1058;
                                    }

                                    if (!arg8) {
                                       class575.method4257(var17, 0, var15, var16, var14);
                                       if (!var11) {
                                          break label1058;
                                       }
                                    }

                                    class515.method3870(var15, var16, (byte)-50, var17, var14);
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }

                                 if (~class606.field8653 == ~var13.field1418) {
                                    class487.method3704(var20, var13, class54.field794, 63, var19);
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }

                                 if (~class637.field9007 == ~var13.field1418) {
                                    class413.method3225(var13.field1466 % 64, class54.field794, var19, var20, -124, var13);
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }

                                 if (~class196.field2832 == ~var13.field1418) {
                                    if (var13.method935(class54.field794, false) == null) {
                                       break label1058;
                                    }

                                    class599.method4404(var13, (byte)-115, var20, var19);
                                    class55.field798[var18] = true;
                                    class54.field794.method150(arg1, arg2, arg7, arg4);
                                    if (!class563.field8012) {
                                       break label1058;
                                    }

                                    if (!arg8) {
                                       class575.method4257(var17, 0, var15, var16, var14);
                                       if (!var11) {
                                          break label1058;
                                       }
                                    }

                                    class515.method3870(var15, var16, (byte)-50, var17, var14);
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }

                                 if (~class586.field8225 == ~var13.field1418) {
                                    class542.method4041(var13.field1452, var20, var19, 2, class54.field794, class318.field4761, var13.field1513);
                                    class417.field6107[var18] = true;
                                    class54.field794.method150(arg1, arg2, arg7, arg4);
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }

                                 if (class800.field11644 == var13.field1418) {
                                    class147.method1436(87, var19, var20, class54.field794, var13.field1452, var13.field1513);
                                    class417.field6107[var18] = true;
                                    class54.field794.method150(arg1, arg2, arg7, arg4);
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }

                                 if (class425.field6219 == var13.field1418) {
                                    if (!class434.field6364 && !class737.field10518) {
                                       break label1058;
                                    }

                                    int var34 = var19 - -var13.field1513;
                                    int var35 = var20 + 15;
                                    if (class563.field8012) {
                                       label1032: {
                                          if (arg8) {
                                             class515.method3870(var15, var16, (byte)-50, var17, var14);
                                             if (!var11) {
                                                break label1032;
                                             }
                                          }

                                          class575.method4257(var17, 0, var15, var16, var14);
                                       }
                                    }

                                    if (class434.field6364) {
                                       int var36 = -256;
                                       if (~class368.field5433 > -21) {
                                          var36 = -65536;
                                       }

                                       class510.field7243.method1868(-1, var36, 0, var34, field1313[14] + class368.field5433, var35);
                                       var35 += 15;
                                       Runtime var37 = Runtime.getRuntime();
                                       int var38 = (int)((var37.totalMemory() + -var37.freeMemory()) / 1024L);
                                       int var39 = -256;
                                       if (var38 > 98304) {
                                          if (class773.field11260) {
                                             class776.method5605(arg9 ^ 96255153);
                                             int var40 = 0;
                                             if (var11) {
                                                System.gc();
                                                ++var40;
                                             }

                                             while(true) {
                                                while(var40 < 10) {
                                                   System.gc();
                                                   ++var40;
                                                }

                                                var38 = (int)((var37.totalMemory() + -var37.freeMemory()) / 1024L);
                                                if (!var11) {
                                                   if (var38 > 65536) {
                                                      class249.method2149(42, field1313[12], 4);
                                                   }

                                                   var39 = -65536;
                                                   break;
                                                }

                                                ++var40;
                                             }
                                          } else {
                                             var39 = -65536;
                                          }
                                       }

                                       class510.field7243.method1868(-1, var39, arg9 ^ -96255198, var34, field1313[13] + var38 + "k", var35);
                                       var35 += 15;
                                       class510.field7243.method1868(-1, -256, arg9 ^ -96255198, var34, field1313[4] + class745.field10605.field3725 + field1313[9] + class745.field10605.field3732 + field1313[16], var35);
                                       var35 += 15;
                                       class510.field7243.method1868(-1, -256, 0, var34, field1313[24] + class745.field10604.field3725 + field1313[9] + class745.field10604.field3732 + field1313[16], var35);
                                       var35 += 15;
                                       int var41 = class54.field794.method161() / 1024;
                                       class510.field7243.method1868(-1, ~var41 < -65537 ? -65536 : -256, 0, var34, field1313[11] + var41 + "k", var35);
                                       var35 += 15;
                                       int var42 = 0;
                                       int var43 = 0;
                                       int var44 = 0;
                                       int var45 = 0;
                                       if (var11) {
                                          if (class398.field5898[var45] != null) {
                                             var42 += class398.field5898[var45].method4163(true);
                                             var43 += class398.field5898[var45].method4165((byte)60);
                                             var44 += class398.field5898[var45].method4170(0);
                                          }

                                          ++var45;
                                       }

                                       while(true) {
                                          while(var45 < 37) {
                                             if (class398.field5898[var45] != null) {
                                                var42 += class398.field5898[var45].method4163(true);
                                                var43 += class398.field5898[var45].method4165((byte)60);
                                                var44 += class398.field5898[var45].method4170(0);
                                             }

                                             ++var45;
                                          }

                                          int var46 = var44 * 100 / var42;
                                          int var47 = var43 * 10000 / var42;
                                          String var48 = field1313[22] + class74.method824(-4896, (long)var47, 0, true, 2) + field1313[10] + var46 + field1313[15];
                                          class666.field9377.method1868(-1, -256, arg9 + 96255198, var34, var48, var35);
                                          if (!var11) {
                                             var35 += 12;
                                             break;
                                          }

                                          ++var45;
                                       }
                                    }

                                    if (~class610.field8696 < -1) {
                                       class666.field9377.method1868(-1, -256, 0, var34, field1313[23] + class604.field8620 + field1313[18] + class610.field8696, var35);
                                    }

                                    var35 += 12;
                                    if (class737.field10518) {
                                       class666.field9377.method1868(-1, -256, arg9 + 96255198, var34, field1313[19] + class54.field794.method156() + field1313[2] + class54.field794.method149(), var35);
                                       var35 += 12;
                                       class666.field9377.method1868(-1, -256, 0, var34, field1313[21] + class255.field3872 + field1313[8] + class560.field7969 + field1313[5] + class108.field1689 + field1313[3] + class794.field11554, var35);
                                       class530.method3959(true);
                                       var35 += 12;
                                    }

                                    class417.field6107[var18] = true;
                                    if (!var11) {
                                       break label1058;
                                    }
                                 }
                              }

                              if (~var13.field1403 == -1) {
                                 if (class522.field7361 == var13.field1418 && class54.field794.method237()) {
                                    class54.field794.method191(var19, var20, var13.field1513, var13.field1452);
                                 }

                                 method901(var18, var30, var31, var19 - var13.field1419, var33, var20 - var13.field1371, arg6, var32, arg8, arg9, var13.field1356);
                                 if (var13.field1373 != null) {
                                    method901(var18, var30, var31, -var13.field1419 + var19, var33, var20 - var13.field1371, var13.field1373, var32, arg8, -96255198, var13.field1356);
                                 }

                                 class733 var49 = (class733)class139.field2228.method3101(-1, (long)var13.field1356);
                                 if (var49 != null) {
                                    class725.method5249(var33, var32, var19, var49.field10417, 0, var30, var20, var31, var18);
                                 }

                                 if (class522.field7361 == var13.field1418 && class54.field794.method237()) {
                                    class54.field794.method193();
                                 }

                                 class54.field794.method150(arg1, arg2, arg7, arg4);
                              }

                              if (class15.field210[var18] || class622.field8886 > 1) {
                                 label1059: {
                                    if (var13.field1403 == 3) {
                                       label1000: {
                                          if (~var23 == -1) {
                                             if (var13.field1353) {
                                                class54.field794.method226(var19, var20, var13.field1513, var13.field1452, var13.field1466, 0);
                                                if (!var11) {
                                                   break label1000;
                                                }
                                             }

                                             class54.field794.method257(var19, var20, var13.field1513, var13.field1452, var13.field1466, 0);
                                             if (!var11) {
                                                break label1000;
                                             }
                                          }

                                          if (!var13.field1353) {
                                             class54.field794.method257(var19, var20, var13.field1513, var13.field1452, 255 - (255 & var23) << 24 | 16777215 & var13.field1466, 1);
                                             if (!var11) {
                                                break label1000;
                                             }
                                          }

                                          class54.field794.method226(var19, var20, var13.field1513, var13.field1452, 255 - (var23 & 255) << 24 | var13.field1466 & 16777215, 1);
                                       }

                                       if (!class563.field8012) {
                                          break label1059;
                                       }

                                       if (arg8) {
                                          class515.method3870(var15, var16, (byte)-50, var17, var14);
                                          if (!var11) {
                                             break label1059;
                                          }
                                       }

                                       class575.method4257(var17, 0, var15, var16, var14);
                                       if (!var11) {
                                          break label1059;
                                       }
                                    }

                                    if (~var13.field1403 == -5) {
                                       class216 var50 = var13.method922((byte)-60, class54.field794);
                                       if (var50 == null) {
                                          if (!class481.field6906) {
                                             break label1059;
                                          }

                                          class566.method4205(arg9 ^ -1665974204, var13);
                                          if (!var11) {
                                             break label1059;
                                          }
                                       }

                                       int var51 = var13.field1466;
                                       String var52 = var13.field1492;
                                       if (var13.field1428 != -1) {
                                          class618 var53 = class201.field2882.method5591(var13.field1428, (byte)-84);
                                          var52 = var53.field8781;
                                          if (var52 == null) {
                                             var52 = field1313[20];
                                          }

                                          if ((var53.field8836 == 1 || ~var13.field1439 != -2) && ~var13.field1439 != 0) {
                                             var52 = field1313[25] + var52 + field1313[7] + class234.method2072(var13.field1439, 67);
                                          }
                                       }

                                       if (var13.field1495 != -1) {
                                          var52 = class171.method1587(10, var13.field1495);
                                          if (var52 == null) {
                                             var52 = "";
                                          }
                                       }

                                       if (class463.field6743 == var13) {
                                          var52 = class765.field10934.method5512(-2, class777.field11340);
                                          var51 = var13.field1466;
                                       }

                                       if (class654.field9267) {
                                          class54.field794.method209(var19, var20, var13.field1513 + var19, var13.field1452 + var20);
                                       }

                                       var50.method1862(var13.field1497, var13.field1452, var13.field1485, var13.field1434, class261.field4011, var19, (int[])null, !var13.field1470 ? -1 : -(var23 & 255) + 255 << 24, (class684)null, 0, 0, 0, var13.field1513, var13.field1461, 255 - (255 & var23) << 24 | var51, var20, var52);
                                       if (class654.field9267) {
                                          class54.field794.method150(arg1, arg2, arg7, arg4);
                                       }

                                       if (var52.trim().length() <= 0) {
                                          break label1059;
                                       }

                                       if (class654.field9267) {
                                          if (!class563.field8012) {
                                             break label1059;
                                          }

                                          if (arg8) {
                                             class515.method3870(var15, var16, (byte)-50, var17, var14);
                                             if (!var11) {
                                                break label1059;
                                             }
                                          }

                                          class575.method4257(var17, 0, var15, var16, var14);
                                          if (!var11) {
                                             break label1059;
                                          }
                                       }

                                       class440 var54 = class50.method543(class54.field794, 0, var13.field1501);
                                       int var55 = var54.method3431(var52, var13.field1513, class261.field4011, 83);
                                       int var56 = var54.method3424(var52, class261.field4011, arg9 ^ 96255163, var13.field1513, var13.field1497);
                                       if (!class563.field8012) {
                                          break label1059;
                                       }

                                       if (!arg8) {
                                          class575.method4257(var20 + var56, 0, var20, var19 + var55, var19);
                                          if (!var11) {
                                             break label1059;
                                          }
                                       }

                                       class515.method3870(var20, var19 + var55, (byte)-50, var20 + var56, var19);
                                       if (!var11) {
                                          break label1059;
                                       }
                                    }

                                    if (var13.field1403 == 5) {
                                       label848: {
                                          if (var13.field1460 < 0) {
                                             class148 var57;
                                             label1006: {
                                                if (~var13.field1428 == 0) {
                                                   if (var13.field1495 == -1) {
                                                      var57 = var13.method927((byte)-95, class54.field794);
                                                      if (!var11) {
                                                         break label1006;
                                                      }
                                                   }

                                                   var57 = class224.method1922(var13.field1495, -108, class54.field794);
                                                   if (!var11) {
                                                      break label1006;
                                                   }
                                                }

                                                class384 var58 = !var13.field1411 ? null : class117.field1849.field2444;
                                                var57 = class201.field2882.method5584(var13.field1332 | -16777216, class54.field794, var13.field1494, var13.field1439, var13.field1428, arg9 + 96255311, var58, var13.field1333);
                                             }

                                             if (var57 == null) {
                                                if (!class481.field6906) {
                                                   break label848;
                                                }

                                                class566.method4205(1727005542, var13);
                                                if (!var11) {
                                                   break label848;
                                                }
                                             }

                                             int var59 = var57.method1351();
                                             int var60 = var57.method1356();
                                             int var61 = -(255 & var23) + 255 << 24 | (~var13.field1466 == -1 ? 16777215 : 16777215 & var13.field1466);
                                             if (var13.field1441) {
                                                label1008: {
                                                   class54.field794.method209(var19, var20, var13.field1513 + var19, var13.field1452 + var20);
                                                   if (var13.field1515 == 0) {
                                                      if (~var13.field1466 != -1 || var23 != 0) {
                                                         var57.method1353(var19, var20, var13.field1513, var13.field1452, 0, var61, 1);
                                                         if (!var11) {
                                                            break label1008;
                                                         }
                                                      }

                                                      var57.method1448(var19, var20, var13.field1513, var13.field1452);
                                                      if (!var11) {
                                                         break label1008;
                                                      }
                                                   }

                                                   int var62 = (var13.field1513 - (-var59 + 1)) / var59;
                                                   int var63 = (var13.field1452 + var60 + -1) / var60;
                                                   int var64 = 0;
                                                   if (var11 || var64 < var62) {
                                                      do {
                                                         int var65 = 0;
                                                         if (var11) {
                                                            if (~var13.field1466 == -1) {
                                                               var57.method1445((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field1515);
                                                               if (var11) {
                                                                  var57.method1447((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field1515, 0, var61, 1);
                                                                  ++var65;
                                                               } else {
                                                                  ++var65;
                                                               }
                                                            } else {
                                                               var57.method1447((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field1515, 0, var61, 1);
                                                               ++var65;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(~var65 > ~var63) {
                                                               if (~var13.field1466 == -1) {
                                                                  var57.method1445((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field1515);
                                                                  if (var11) {
                                                                     var57.method1447((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field1515, 0, var61, 1);
                                                                     ++var65;
                                                                  } else {
                                                                     ++var65;
                                                                  }
                                                               } else {
                                                                  var57.method1447((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field1515, 0, var61, 1);
                                                                  ++var65;
                                                               }
                                                            }

                                                            if (!var11) {
                                                               ++var64;
                                                               break;
                                                            }

                                                            var57.method1447((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field1515, 0, var61, 1);
                                                            ++var65;
                                                         }
                                                      } while(var64 < var62);
                                                   }
                                                }

                                                class54.field794.method150(arg1, arg2, arg7, arg4);
                                                if (!var11) {
                                                   break label848;
                                                }
                                             }

                                             if (var13.field1466 == 0 && ~var23 == -1) {
                                                if (var13.field1515 == 0) {
                                                   if (var13.field1513 != var59 || var13.field1452 != var60) {
                                                      var57.method1449(var19, var20, var13.field1513, var13.field1452);
                                                      if (!var11) {
                                                         break label848;
                                                      }
                                                   }

                                                   var57.method1451(var19, var20);
                                                   if (!var11) {
                                                      break label848;
                                                   }
                                                }

                                                var57.method1445((float)var13.field1513 / 2.0F + (float)var19, (float)var13.field1452 / 2.0F + (float)var20, var13.field1513 * 4096 / var59, var13.field1515);
                                                if (!var11) {
                                                   break label848;
                                                }
                                             }

                                             if (var13.field1515 != 0) {
                                                var57.method1447((float)var13.field1513 / 2.0F + (float)var19, (float)var13.field1452 / 2.0F + (float)var20, var13.field1513 * 4096 / var59, var13.field1515, 0, var61, 1);
                                                if (!var11) {
                                                   break label848;
                                                }
                                             }

                                             if (~var13.field1513 != ~var59 || var13.field1452 != var60) {
                                                var57.method1450(var19, var20, var13.field1513, var13.field1452, 0, var61, 1);
                                                if (!var11) {
                                                   break label848;
                                                }
                                             }

                                             var57.method1352(var19, var20, 0, var61, 1);
                                             if (!var11) {
                                                break label848;
                                             }
                                          }

                                          var13.method943(class376.field5487, (byte)-29, class705.field10141).method5576(0, 0, var13.field1409 << 3, class54.field794, var13.field1476 << 3, 0, var19, var13.field1452, var13.field1513, 85, var20);
                                       }

                                       if (!class563.field8012) {
                                          break label1059;
                                       }

                                       if (!arg8) {
                                          class575.method4257(var17, 0, var15, var16, var14);
                                          if (!var11) {
                                             break label1059;
                                          }
                                       }

                                       class515.method3870(var15, var16, (byte)-50, var17, var14);
                                       if (!var11) {
                                          break label1059;
                                       }
                                    }

                                    if (~var13.field1403 == -7) {
                                       class239.method2101((byte)-83);
                                       Object var66 = null;
                                       class761 var67 = null;
                                       int var68 = 0;
                                       if (~var13.field1428 != 0) {
                                          class618 var69 = class201.field2882.method5591(var13.field1428, (byte)-84);
                                          if (var69 != null) {
                                             label1041: {
                                                class618 var70 = var69.method4542(-10987, var13.field1439);
                                                var67 = var70.method4540(-126, class54.field794, 1, !var13.field1411 ? null : class117.field1849.field2444, var13.field1337, 2048);
                                                if (var67 != null) {
                                                   var68 = -var67.method801() >> 1;
                                                   if (!var11) {
                                                      break label1041;
                                                   }
                                                }

                                                class566.method4205(arg9 ^ -1665974204, var13);
                                             }
                                          }
                                       } else if (~var13.field1489 != -6) {
                                          if (var13.field1489 != 8 && var13.field1489 != 9) {
                                             if (var13.field1337 != null && var13.field1337.method2201((byte)97)) {
                                                var67 = var13.method930(class344.field5074, class226.field3299, class117.field1849.field2444, class216.field3085, (class559)var66, class201.field2882, class54.field794, 2048, (byte)90, class478.field6879, var13.field1337, class378.field5523);
                                                if (var67 == null && class481.field6906) {
                                                   class566.method4205(arg9 ^ -1665974204, var13);
                                                }
                                             } else {
                                                var67 = var13.method930(class344.field5074, class226.field3299, class117.field1849.field2444, class216.field3085, (class559)var66, class201.field2882, class54.field794, 2048, (byte)100, class478.field6879, (class258)null, class378.field5523);
                                                if (var67 == null && class481.field6906) {
                                                   class566.method4205(1727005542, var13);
                                                }
                                             }
                                          } else {
                                             class380 var71 = class231.method2056(var13.field1396, false, Integer.MIN_VALUE);
                                             if (var71 != null) {
                                                var67 = var71.method2969(class54.field794, ~var13.field1489 == -10, var13.field1364, 0, var13.field1411 ? class117.field1849.field2444 : null, 2048, var13.field1337);
                                             }
                                          }
                                       } else {
                                          int var72 = var13.field1396;
                                          if (var72 >= 0 && ~var72 > -2049) {
                                             class158 var73 = class501.field7137[var72];
                                             if (var73 != null && (~class394.field5731 == ~var72 || ~class627.method4611(var73.field2402, (byte)-115) == ~var13.field1364)) {
                                                var67 = var73.field2444.method2999(class378.field5523, class54.field794, true, class344.field5074, class451.field6571, class201.field2882, (class258)null, 2048, (int[])null, class478.field6879, (byte)102, (class258[])null, class226.field3299, 0, var13.field1337, class216.field3085);
                                             }
                                          }
                                       }

                                       if (var67 != null) {
                                          int var74;
                                          label706: {
                                             if (var13.field1375 <= 0) {
                                                var74 = 512;
                                                if (!var11) {
                                                   break label706;
                                                }
                                             }

                                             var74 = (var13.field1513 << 9) / var13.field1375;
                                          }

                                          int var75;
                                          if (~var13.field1458 < -1) {
                                             var75 = (var13.field1452 << 9) / var13.field1458;
                                             if (var11) {
                                                var75 = 512;
                                             }
                                          } else {
                                             var75 = 512;
                                          }

                                          int var76 = var13.field1513 / 2 + var19;
                                          int var77 = var13.field1452 / 2 + var20;
                                          if (!var13.field1329) {
                                             var76 += var13.field1405 * var74 >> 9;
                                             var77 += var13.field1507 * var75 >> 9;
                                          }

                                          class178.field2626.method335();
                                          class54.field794.method255(class178.field2626);
                                          class54.field794.method256(var76, var77, var74, var75);
                                          class54.field794.method144();
                                          if (var13.field1487) {
                                             class54.field794.method262(false);
                                          }

                                          label697: {
                                             if (!var13.field1329) {
                                                int var78 = (var13.field1391 << 2) * class160.field2447[var13.field1380 << 3] >> 14;
                                                int var79 = (var13.field1391 << 2) * class160.field2446[var13.field1380 << 3] >> 14;
                                                class686.field9905.method326(-var13.field1508 << 3);
                                                class686.field9905.method329(var13.field1379 << 3);
                                                class686.field9905.method327(var13.field1386 << 2, (var13.field1490 << 2) + var78 + var68, (var13.field1490 << 2) + var79);
                                                class686.field9905.method331(var13.field1380 << 3);
                                                if (!var11) {
                                                   break label697;
                                                }
                                             }

                                             class686.field9905.method324(var13.field1380);
                                             class686.field9905.method329(var13.field1379);
                                             class686.field9905.method337(var13.field1508);
                                             class686.field9905.method327(var13.field1405, var13.field1507, var13.field1422);
                                          }

                                          var13.method938(class54.field794, arg9 ^ -96255173, class51.field770, var67, class686.field9905);
                                          if (class654.field9267) {
                                             class54.field794.method209(var19, var20, var13.field1513 + var19, var20 - -var13.field1452);
                                          }

                                          label1017: {
                                             if (!var13.field1329) {
                                                if (!var13.field1369) {
                                                   var67.method805(class686.field9905, (class213)null, 1);
                                                   if (var13.field1331 == null) {
                                                      break label1017;
                                                   }

                                                   class54.field794.method194(var13.field1331.method3969());
                                                   if (!var11) {
                                                      break label1017;
                                                   }
                                                }

                                                var67.method763(class686.field9905, (class213)null, var13.field1391 << 2, 1);
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             if (!var13.field1369) {
                                                var67.method805(class686.field9905, (class213)null, 1);
                                                if (var13.field1331 == null) {
                                                   break label1017;
                                                }

                                                class54.field794.method194(var13.field1331.method3969());
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             var67.method763(class686.field9905, (class213)null, var13.field1391, 1);
                                          }

                                          if (class654.field9267) {
                                             class54.field794.method150(arg1, arg2, arg7, arg4);
                                          }

                                          if (var13.field1487) {
                                             class54.field794.method262(true);
                                          }
                                       }

                                       if (!class563.field8012) {
                                          break label1059;
                                       }

                                       if (arg8) {
                                          class515.method3870(var15, var16, (byte)-50, var17, var14);
                                          if (!var11) {
                                             break label1059;
                                          }
                                       }

                                       class575.method4257(var17, arg9 + 96255198, var15, var16, var14);
                                       if (!var11) {
                                          break label1059;
                                       }
                                    }

                                    if (var13.field1403 == 9) {
                                       int var80;
                                       int var81;
                                       int var82;
                                       int var83;
                                       label672: {
                                          if (!var13.field1500) {
                                             var80 = var20 - -var13.field1452;
                                             var81 = var13.field1513 + var19;
                                             var82 = var20;
                                             var83 = var19;
                                             if (!var11) {
                                                break label672;
                                             }
                                          }

                                          var81 = var13.field1513 + var19;
                                          var82 = var13.field1452 + var20;
                                          var80 = var20;
                                          var83 = var19;
                                       }

                                       label667: {
                                          if (~var13.field1374 != -2) {
                                             class54.field794.method185(var83, var82, var81, var80, var13.field1466, var13.field1374, 0);
                                             if (!var11) {
                                                break label667;
                                             }
                                          }

                                          class54.field794.method196(var83, var82, var81, var80, var13.field1466, 0);
                                       }

                                       if (class563.field8012) {
                                          label1050: {
                                             if (arg8) {
                                                class515.method3870(var15, var16, (byte)-50, var17, var14);
                                                if (!var11) {
                                                   break label1050;
                                                }
                                             }

                                             class575.method4257(var17, 0, var15, var16, var14);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               ++var12;
            } while(var12 < arg6.length);

         }
      } catch (RuntimeException var85) {
         throw class612.method4503(var85, field1313[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1313[6] : field1313[20]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method902(int arg0) {
      try {
         field1310 = null;
         if (arg0 < 57) {
            method902(-37);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1313[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(I[B)V"
   )
   public abstract void method903(int arg0, byte[] arg1);

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method904(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method905(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
