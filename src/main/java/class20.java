import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 extends class604 {
   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field224 = new String[]{method142(method141("@ 2\u001c7s-%\u001bd0")), method142(method141("_'&\u0000;q1z")), method142(method141("\\2zH")), method142(method141("5ah")), method142(method141("Rn3H\u0011e5z")), method142(method141("0\f/\f;|2zH")), method142(method141("@.,\u0011-*a")), method142(method141("0\u0011,R~")), method142(method141("0n`")), method142(method141("~4,\u0004")), method142(method141(",\"/\u0004cv'yXj \u007f")), method142(method141("Y/z")), method142(method141("V13R")), method142(method141("|o\u0004@")), method142(method141("G\u0000\u0012&\u0017^\u0006zH\u0013u,/\u001a'043\t9ua/\u001e;bav\\\u0013R``82u 3\r~y/&\u0007,}a7\u00001u7%\u001a~y2`\u001a;c1/\u0006-y#,\r~v.2H*x$`\u000b1~5%\u0006*? 2\r?08/\u001d~q3%H+c(.\u000fqy/n")), method142(method141("konF#")), method142(method141("Rn3")), method142(method141("0\r!R~")), method142(method141("0\u000f\u0010+d0")), method142(method141("5h")), method142(method141("]$-R")), method142(method141(",n#\u00072.a8")), method142(method141("S #\u0000;*")), method142(method141("|o\u0001@")), method142(method141("|o\u0002@")), method142(method141("|o\u0003@"))};
   @OriginalMember(
      owner = "client!l",
      name = "r",
      descriptor = "I"
   )
   public static int field222 = -1;
   @OriginalMember(
      owner = "client!l",
      name = "q",
      descriptor = "I"
   )
   public int field212;
   @OriginalMember(
      owner = "client!l",
      name = "t",
      descriptor = "I"
   )
   public static int field213;
   @OriginalMember(
      owner = "client!l",
      name = "m",
      descriptor = "I"
   )
   public int field214;
   @OriginalMember(
      owner = "client!l",
      name = "l",
      descriptor = "I"
   )
   public static int field215;
   @OriginalMember(
      owner = "client!l",
      name = "p",
      descriptor = "I"
   )
   public int field217;
   @OriginalMember(
      owner = "client!l",
      name = "i",
      descriptor = "I"
   )
   public static int field218;
   @OriginalMember(
      owner = "client!l",
      name = "j",
      descriptor = "I"
   )
   public static int field219;
   @OriginalMember(
      owner = "client!l",
      name = "o",
      descriptor = "I"
   )
   public int field220;
   @OriginalMember(
      owner = "client!l",
      name = "s",
      descriptor = "I"
   )
   public int field221;
   @OriginalMember(
      owner = "client!l",
      name = "n",
      descriptor = "I"
   )
   public int field223;
   @OriginalMember(
      owner = "client!l",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field216;

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(I[Lhv;IIIIIIIIZ)V",
      line = 5
   )
   public static final void method137(int arg0, class544[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      int var11 = client.field4530;

      try {
         if (arg3 == 1447) {
            ++field218;
            class786.field11439.method554(arg7, arg5, arg8, arg4);
            int var12 = 0;
            if (var11 != 0 || arg1.length > var12) {
               do {
                  class544 var13 = arg1[var12];
                  if (var13 != null && (var13.field7968 == arg2 || arg2 == -1412584499 && (class331.field4741 == var13 || var11 != 0))) {
                     int var14 = var13.field7948 + arg6;
                     int var15 = var13.field7963 + arg0;
                     int var16 = var14 + 1 - -var13.field7986;
                     int var17 = var15 - -var13.field7954 + 1;
                     int var18;
                     if (arg9 == -1) {
                        class521.field7579[class117.field1428].setBounds(var13.field7948 - -arg6, var13.field7963 + arg0, var13.field7986, var13.field7954);
                        var18 = class117.field1428++;
                        if (var11 != 0) {
                           var18 = arg9;
                        }
                     } else {
                        var18 = arg9;
                     }

                     var13.field8086 = var18;
                     var13.field8063 = class314.field4488;
                     if (!client.method2379(var13)) {
                        label1028: {
                           if (var13.field7994 != 0) {
                              class73.method722(var13, 2047);
                           }

                           int var19 = var13.field7948 + arg6;
                           int var20 = var13.field7963 - -arg0;
                           int var21 = 0;
                           int var22 = 0;
                           if (class446.field6785) {
                              var21 = class325.method2458(29461);
                              var22 = class319.method2421(true);
                           }

                           int var23 = var13.field8081;
                           if (class384.field5876 && (client.method2388(var13).field7097 != 0 || var13.field7920 == 0) && ~var23 < -128) {
                              var23 = 127;
                           }

                           if (class331.field4741 == var13) {
                              if (~arg2 != 1412584498 && (~class663.field9644 == ~var13.field8058 || class266.field3655 == var13.field8058)) {
                                 class780.field11387 = arg6;
                                 class706.field10570 = arg0;
                                 class402.field6171 = arg1;
                                 if (var11 == 0) {
                                    break label1028;
                                 }
                              }

                              if (class213.field2708 && class660.field9562) {
                                 int var24 = var21 + class723.field10766.method368((byte)106);
                                 int var25 = class723.field10766.method366(true) - -var22;
                                 int var26 = var24 - class430.field6583;
                                 int var27 = var25 - class64.field792;
                                 if (~var26 > ~class49.field595) {
                                    var26 = class49.field595;
                                 }

                                 if (class49.field595 + class741.field11002.field7986 < var13.field7986 + var26) {
                                    var26 = class49.field595 + class741.field11002.field7986 - var13.field7986;
                                 }

                                 if (~var27 > ~class78.field978) {
                                    var27 = class78.field978;
                                 }

                                 var19 = var26;
                                 if (~(class78.field978 + class741.field11002.field7954) > ~(var27 - -var13.field7954)) {
                                    var27 = class78.field978 + class741.field11002.field7954 + -var13.field7954;
                                 }

                                 var20 = var27;
                              }

                              if (~class266.field3655 == ~var13.field8058) {
                                 var23 = 128;
                              }
                           }

                           int var30;
                           int var31;
                           int var32;
                           int var33;
                           label954: {
                              if (~var13.field7920 != -3) {
                                 int var28 = var19 - -var13.field7986;
                                 int var29 = var13.field7954 + var20;
                                 var30 = ~var20 >= ~arg5 ? arg5 : var20;
                                 var31 = ~arg7 > ~var19 ? var19 : arg7;
                                 if (~var13.field7920 == -10) {
                                    ++var28;
                                    ++var29;
                                 }

                                 var32 = ~var28 <= ~arg8 ? arg8 : var28;
                                 var33 = ~var29 > ~arg4 ? var29 : arg4;
                                 if (var11 == 0) {
                                    break label954;
                                 }
                              }

                              var30 = arg5;
                              var31 = arg7;
                              var32 = arg8;
                              var33 = arg4;
                           }

                           if (~var32 < ~var31 && (var30 < var33 || var11 != 0)) {
                              label1066: {
                                 if (~var13.field7994 != -1) {
                                    if (class365.field5471 == var13.field7994 || class442.field6741 == var13.field7994) {
                                       class466.method3484(var13, var20, (byte)118, var19);
                                       if (!class446.field6785) {
                                          class358.method2794(var13.field7986, ~class442.field6741 == ~var13.field7994, -18249, var13.field7954, var20, var19);
                                          class786.field11439.method554(arg7, arg5, arg8, arg4);
                                       }

                                       class275.field3835[var18] = true;
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }

                                    if (~class565.field8429 == ~var13.field7994) {
                                       if (var13.method4025(15, class786.field11439) == null) {
                                          break label1066;
                                       }

                                       class351.method2741(8);
                                       class745.method5428(var13, class786.field11439, var19, var20, -107);
                                       class446.field6781[var18] = true;
                                       class786.field11439.method554(arg7, arg5, arg8, arg4);
                                       if (!class446.field6785) {
                                          break label1066;
                                       }

                                       if (arg10) {
                                          class458.method3442(var17, 26306, var15, var14, var16);
                                          if (var11 == 0) {
                                             break label1066;
                                          }
                                       }

                                       class524.method3852(var17, var16, var15, var14, -1);
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }

                                    if (class122.field1480 == var13.field7994) {
                                       class323.method2440(var19, var20, var13, (byte)-35, class786.field11439);
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }

                                    if (~class285.field4005 == ~var13.field7994) {
                                       class669.method4866(class786.field11439, var13, var20, 21988, var13.field8022 % 64, var19);
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }

                                    if (~class5.field91 == ~var13.field7994) {
                                       if (var13.method4025(15, class786.field11439) == null) {
                                          break label1066;
                                       }

                                       class207.method1579(var13, var20, var19, (byte)42);
                                       class446.field6781[var18] = true;
                                       class786.field11439.method554(arg7, arg5, arg8, arg4);
                                       if (!class446.field6785) {
                                          break label1066;
                                       }

                                       if (!arg10) {
                                          class524.method3852(var17, var16, var15, var14, -1);
                                          if (var11 == 0) {
                                             break label1066;
                                          }
                                       }

                                       class458.method3442(var17, 26306, var15, var14, var16);
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }

                                    if (~class738.field10957 == ~var13.field7994) {
                                       class262.method1990(class786.field11439, var20, class204.field2629, var13.field7954, var13.field7986, arg3 + -1327, var19);
                                       class275.field3835[var18] = true;
                                       class786.field11439.method554(arg7, arg5, arg8, arg4);
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }

                                    if (class162.field2043 == var13.field7994) {
                                       class356.method2779(-1996488705, var20, var19, var13.field7986, class786.field11439, var13.field7954);
                                       class275.field3835[var18] = true;
                                       class786.field11439.method554(arg7, arg5, arg8, arg4);
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }

                                    if (class242.field3090 == var13.field7994) {
                                       if (!class576.field8555 && !class764.field11226) {
                                          break label1066;
                                       }

                                       int var34 = var13.field7986 + var19;
                                       int var35 = var20 + 15;
                                       if (class446.field6785) {
                                          label1041: {
                                             if (arg10) {
                                                class458.method3442(var17, 26306, var15, var14, var16);
                                                if (var11 == 0) {
                                                   break label1041;
                                                }
                                             }

                                             class524.method3852(var17, var16, var15, var14, arg3 ^ -1448);
                                          }
                                       }

                                       if (class576.field8555) {
                                          int var36 = -256;
                                          if (~class280.field3898 > -21) {
                                             var36 = -65536;
                                          }

                                          class288.field4045.method668(-1, var34, var36, field224[12] + class280.field3898, var35, -25049);
                                          var35 += 15;
                                          Runtime var37 = Runtime.getRuntime();
                                          int var38 = (int)((var37.totalMemory() + -var37.freeMemory()) / 1024L);
                                          int var39 = -256;
                                          if (~var38 < -98305) {
                                             var39 = -65536;
                                             if (class110.field1346) {
                                                class199.method1527(arg3 ^ -1536);
                                                int var40 = 0;
                                                if (var11 != 0) {
                                                   System.gc();
                                                   ++var40;
                                                }

                                                while(true) {
                                                   while(var40 < 10) {
                                                      System.gc();
                                                      ++var40;
                                                   }

                                                   var38 = (int)((var37.totalMemory() - var37.freeMemory()) / 1024L);
                                                   if (var11 == 0) {
                                                      if (~var38 < -65537) {
                                                         class324.method2449(field224[14], 4, 27501);
                                                      }
                                                      break;
                                                   }

                                                   ++var40;
                                                }
                                             }
                                          }

                                          class288.field4045.method668(-1, var34, var39, field224[20] + var38 + "k", var35, arg3 + -26496);
                                          var35 += 15;
                                          class288.field4045.method668(-1, var34, -256, field224[11] + class360.field5432 + field224[4] + class501.field7456 + field224[16], var35, -25049);
                                          var35 += 15;
                                          int var41 = class786.field11439.method565() / 1024;
                                          class288.field4045.method668(-1, var34, var41 > 65536 ? -65536 : -256, field224[1] + var41 + "k", var35, arg3 + -26496);
                                          var35 += 15;
                                          int var42 = 0;
                                          int var43 = 0;
                                          int var44 = 0;
                                          int var45 = 0;
                                          if (var11 != 0) {
                                             if (class277.field3859[var45] != null) {
                                                var42 += class277.field3859[var45].method4661(arg3 ^ -1506);
                                                var43 += class277.field3859[var45].method4666((byte)103);
                                                var44 += class277.field3859[var45].method4658(0);
                                             }

                                             ++var45;
                                          }

                                          while(true) {
                                             while(var45 < 37) {
                                                if (class277.field3859[var45] != null) {
                                                   var42 += class277.field3859[var45].method4661(arg3 ^ -1506);
                                                   var43 += class277.field3859[var45].method4666((byte)103);
                                                   var44 += class277.field3859[var45].method4658(0);
                                                }

                                                ++var45;
                                             }

                                             int var46 = var44 * 100 / var42;
                                             int var47 = var43 * 10000 / var42;
                                             String var48 = field224[22] + class778.method5603(-28424, 2, true, 0, (long)var47) + field224[3] + var46 + field224[19];
                                             class57.field721.method668(-1, var34, -256, var48, var35, -25049);
                                             if (var11 == 0) {
                                                var35 += 12;
                                                break;
                                             }

                                             ++var45;
                                          }
                                       }

                                       if (class437.field6666 > 0) {
                                          class57.field721.method668(-1, var34, -256, field224[0] + class789.field11472 + field224[8] + class437.field6666, var35, -25049);
                                       }

                                       var35 += 12;
                                       if (class764.field11226) {
                                          class57.field721.method668(-1, var34, -256, field224[6] + class786.field11439.method631() + field224[5] + class786.field11439.method556(), var35, -25049);
                                          var35 += 12;
                                          class57.field721.method668(-1, var34, -256, field224[2] + class122.field1488 + field224[17] + class717.field10661 + field224[18] + class408.field6224 + field224[7] + class688.field10366, var35, -25049);
                                          class41.method284(127);
                                          var35 += 12;
                                       }

                                       class275.field3835[var18] = true;
                                       if (var11 == 0) {
                                          break label1066;
                                       }
                                    }
                                 }

                                 if (var13.field7920 == 0) {
                                    if (class569.field8481 == var13.field7994 && class786.field11439.method657()) {
                                       class786.field11439.method633(var19, var20, var13.field7986, var13.field7954);
                                    }

                                    method137(var20 - var13.field7962, arg1, var13.field8054, 1447, var33, var30, -var13.field8060 + var19, var31, var32, var18, arg10);
                                    if (var13.field8061 != null) {
                                       method137(-var13.field7962 + var20, var13.field8061, var13.field8054, 1447, var33, var30, -var13.field8060 + var19, var31, var32, var18, arg10);
                                    }

                                    class624 var49 = (class624)class573.field8525.method5681((long)var13.field8054, -1);
                                    if (var49 != null) {
                                       class296.method2255(var18, var49.field9087, var33, var32, var20, var31, var19, var30, arg3 ^ 1447);
                                    }

                                    if (~class569.field8481 == ~var13.field7994 && class786.field11439.method657()) {
                                       class786.field11439.method581();
                                    }

                                    class786.field11439.method554(arg7, arg5, arg8, arg4);
                                 }

                                 if (class482.field7157[var18] || ~class67.field829 < -2) {
                                    label1090: {
                                       if (~var13.field7920 == -4) {
                                          label1005: {
                                             if (~var23 != -1) {
                                                if (!var13.field7942) {
                                                   class786.field11439.method553(var19, var20, var13.field7986, var13.field7954, -(var23 & 255) + 255 << 24 | var13.field8022 & 16777215, 1);
                                                   if (var11 == 0) {
                                                      break label1005;
                                                   }
                                                }

                                                class786.field11439.method645(var19, var20, var13.field7986, var13.field7954, -(var23 & 255) + 255 << 24 | var13.field8022 & 16777215, 1);
                                                if (var11 == 0) {
                                                   break label1005;
                                                }
                                             }

                                             if (var13.field7942) {
                                                class786.field11439.method645(var19, var20, var13.field7986, var13.field7954, var13.field8022, 0);
                                                if (var11 == 0) {
                                                   break label1005;
                                                }
                                             }

                                             class786.field11439.method553(var19, var20, var13.field7986, var13.field7954, var13.field8022, 0);
                                          }

                                          if (!class446.field6785) {
                                             break label1090;
                                          }

                                          if (arg10) {
                                             class458.method3442(var17, 26306, var15, var14, var16);
                                             if (var11 == 0) {
                                                break label1090;
                                             }
                                          }

                                          class524.method3852(var17, var16, var15, var14, -1);
                                          if (var11 == 0) {
                                             break label1090;
                                          }
                                       }

                                       if (~var13.field7920 == -5) {
                                          class67 var50 = var13.method4019(true, class786.field11439);
                                          if (var50 == null) {
                                             if (!class327.field4653) {
                                                break label1090;
                                             }

                                             class140.method1188(var13, (byte)-118);
                                             if (var11 == 0) {
                                                break label1090;
                                             }
                                          }

                                          int var51 = var13.field8022;
                                          String var52 = var13.field8066;
                                          if (~var13.field7969 != 0) {
                                             class91 var53 = class54.field616.method1689(var13.field7969, (byte)-12);
                                             var52 = var53.field1138;
                                             if (var52 == null) {
                                                var52 = field224[9];
                                             }

                                             if ((var53.field1150 == 1 || var13.field7931 != 1) && ~var13.field7931 != 0) {
                                                var52 = field224[10] + var52 + field224[21] + class366.method2843(var13.field7931, arg3 ^ -1448);
                                             }
                                          }

                                          if (~var13.field8088 != 0) {
                                             var52 = class658.method4732(var13.field8088, arg3 + 7444);
                                             if (var52 == null) {
                                                var52 = "";
                                             }
                                          }

                                          if (class458.field6935 == var13) {
                                             var52 = class204.field2595.method1562((byte)-73, class728.field10827);
                                             var51 = var13.field8022;
                                          }

                                          if (class100.field1220) {
                                             class786.field11439.method598(var19, var20, var13.field7986 + var19, var13.field7954 + var20);
                                          }

                                          var50.method680(255 - (255 & var23) << 24 | var51, var13.field7986, var19, arg3 ^ 1410, (class512)null, var52, 0, var13.field7954, var13.field8031, var20, class134.field1717, !var13.field8005 ? -1 : -(255 & var23) + 255 << 24, (int[])null, var13.field7945, var13.field8065, 0, var13.field8056);
                                          if (class100.field1220) {
                                             class786.field11439.method554(arg7, arg5, arg8, arg4);
                                          }

                                          if (var52.trim().length() <= 0) {
                                             break label1090;
                                          }

                                          if (class100.field1220) {
                                             if (!class446.field6785) {
                                                break label1090;
                                             }

                                             if (arg10) {
                                                class458.method3442(var17, 26306, var15, var14, var16);
                                                if (var11 == 0) {
                                                   break label1090;
                                                }
                                             }

                                             class524.method3852(var17, var16, var15, var14, -1);
                                             if (var11 == 0) {
                                                break label1090;
                                             }
                                          }

                                          class763 var54 = class299.method2284(var13.field8075, 0, class786.field11439);
                                          int var55 = var54.method5524(class134.field1717, var52, (byte)-71, var13.field7986);
                                          int var56 = var54.method5529(var52, class134.field1717, (byte)76, var13.field7986, var13.field8031);
                                          if (!class446.field6785) {
                                             break label1090;
                                          }

                                          if (!arg10) {
                                             class524.method3852(var20 + var56, var19 + var55, var20, var19, -1);
                                             if (var11 == 0) {
                                                break label1090;
                                             }
                                          }

                                          class458.method3442(var20 + var56, arg3 + 24859, var20, var19, var19 + var55);
                                          if (var11 == 0) {
                                             break label1090;
                                          }
                                       }

                                       if (~var13.field7920 == -6) {
                                          label852: {
                                             if (var13.field8085 < 0) {
                                                class396 var58;
                                                label1011: {
                                                   if (var13.field7969 != -1) {
                                                      class131 var57 = var13.field7978 ? class693.field10418.field10329 : null;
                                                      var58 = class54.field616.method1687(var13.field8004, var13.field7996, -18458, var57, var13.field7931, class786.field11439, var13.field7969, -16777216 | var13.field7987);
                                                      if (var11 == 0) {
                                                         break label1011;
                                                      }
                                                   }

                                                   if (~var13.field8088 != 0) {
                                                      var58 = class339.method2687(class786.field11439, 0, var13.field8088);
                                                      if (var11 == 0) {
                                                         break label1011;
                                                      }
                                                   }

                                                   var58 = var13.method4030(class786.field11439, arg3 ^ -1437);
                                                }

                                                if (var58 == null) {
                                                   if (!class327.field4653) {
                                                      break label852;
                                                   }

                                                   class140.method1188(var13, (byte)56);
                                                   if (var11 == 0) {
                                                      break label852;
                                                   }
                                                }

                                                int var59 = var58.method1971();
                                                int var60 = var58.method1975();
                                                int var61 = -(var23 & 255) + 255 << 24 | (var13.field8022 != 0 ? var13.field8022 & 16777215 : 16777215);
                                                if (!var13.field7983) {
                                                   if (~var13.field8022 != -1 || var23 != 0) {
                                                      if (var13.field7928 == 0) {
                                                         if (var13.field7986 != var59 || ~var13.field7954 != ~var60) {
                                                            var58.method3028(var19, var20, var13.field7986, var13.field7954, 0, var61, 1);
                                                            if (var11 == 0) {
                                                               break label852;
                                                            }
                                                         }

                                                         var58.method264(var19, var20, 0, var61, 1);
                                                         if (var11 == 0) {
                                                            break label852;
                                                         }
                                                      }

                                                      var58.method3030((float)var13.field7986 / 2.0F + (float)var19, (float)var13.field7954 / 2.0F + (float)var20, var13.field7986 * 4096 / var59, var13.field7928, 0, var61, 1);
                                                      if (var11 == 0) {
                                                         break label852;
                                                      }
                                                   }

                                                   if (~var13.field7928 == -1) {
                                                      if (~var13.field7986 == ~var59 && var13.field7954 == var60) {
                                                         var58.method3035(var19, var20);
                                                         if (var11 == 0) {
                                                            break label852;
                                                         }
                                                      }

                                                      var58.method3037(var19, var20, var13.field7986, var13.field7954);
                                                      if (var11 == 0) {
                                                         break label852;
                                                      }
                                                   }

                                                   var58.method3029((float)var13.field7986 / 2.0F + (float)var19, (float)var13.field7954 / 2.0F + (float)var20, var13.field7986 * 4096 / var59, var13.field7928);
                                                   if (var11 == 0) {
                                                      break label852;
                                                   }
                                                }

                                                label1015: {
                                                   class786.field11439.method598(var19, var20, var13.field7986 + var19, var13.field7954 + var20);
                                                   if (~var13.field7928 == -1) {
                                                      if (var13.field8022 != 0 || var23 != 0) {
                                                         var58.method1974(var19, var20, var13.field7986, var13.field7954, 0, var61, 1);
                                                         if (var11 == 0) {
                                                            break label1015;
                                                         }
                                                      }

                                                      var58.method3032(var19, var20, var13.field7986, var13.field7954);
                                                      if (var11 == 0) {
                                                         break label1015;
                                                      }
                                                   }

                                                   int var62 = (var59 + -1 + var13.field7986) / var59;
                                                   int var63 = (var60 + -1 + var13.field7954) / var60;
                                                   int var64 = 0;
                                                   if (var11 != 0 || ~var64 > ~var62) {
                                                      do {
                                                         int var65 = 0;
                                                         if (var11 != 0) {
                                                            if (var13.field8022 == 0) {
                                                               var58.method3029((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field7928);
                                                               if (var11 != 0) {
                                                                  var58.method3030((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field7928, 0, var61, 1);
                                                                  ++var65;
                                                               } else {
                                                                  ++var65;
                                                               }
                                                            } else {
                                                               var58.method3030((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field7928, 0, var61, 1);
                                                               ++var65;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(var65 < var63) {
                                                               if (var13.field8022 == 0) {
                                                                  var58.method3029((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field7928);
                                                                  if (var11 != 0) {
                                                                     var58.method3030((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field7928, 0, var61, 1);
                                                                     ++var65;
                                                                  } else {
                                                                     ++var65;
                                                                  }
                                                               } else {
                                                                  var58.method3030((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field7928, 0, var61, 1);
                                                                  ++var65;
                                                               }
                                                            }

                                                            if (var11 == 0) {
                                                               ++var64;
                                                               break;
                                                            }

                                                            var58.method3030((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field7928, 0, var61, 1);
                                                            ++var65;
                                                         }
                                                      } while(~var64 > ~var62);
                                                   }
                                                }

                                                class786.field11439.method554(arg7, arg5, arg8, arg4);
                                                if (var11 == 0) {
                                                   break label852;
                                                }
                                             }

                                             var13.method4036(class530.field7707, class127.field1526, (byte)-97).method2963(0, var13.field7986, var19, var13.field7966 << 3, (byte)26, var13.field7954, 0, var13.field7935 << 3, class786.field11439, var20);
                                          }

                                          if (!class446.field6785) {
                                             break label1090;
                                          }

                                          if (!arg10) {
                                             class524.method3852(var17, var16, var15, var14, -1);
                                             if (var11 == 0) {
                                                break label1090;
                                             }
                                          }

                                          class458.method3442(var17, arg3 ^ 25445, var15, var14, var16);
                                          if (var11 == 0) {
                                             break label1090;
                                          }
                                       }

                                       if (var13.field7920 == 6) {
                                          class423.method3215(false);
                                          Object var66 = null;
                                          class497 var67 = null;
                                          int var68 = 0;
                                          if (~var13.field7969 != 0) {
                                             class91 var69 = class54.field616.method1689(var13.field7969, (byte)-82);
                                             if (var69 != null) {
                                                class91 var70 = var69.method835(0, var13.field7931);
                                                class676 var71 = var13.field7944 != -1 ? class576.field8554.method3189(var13.field7944, (byte)-42) : null;
                                                class131 var72 = !var13.field7978 ? null : class693.field10418.field10329;
                                                var67 = var70.method833(1, var13.field7936, var13.field7972, (byte)103, 2048, class786.field11439, var71, var72, var13.field7989);
                                                if (var67 != null) {
                                                   var68 = -var67.method339() >> 1;
                                                   if (var11 != 0) {
                                                      class140.method1188(var13, (byte)-119);
                                                   }
                                                } else {
                                                   class140.method1188(var13, (byte)-119);
                                                }
                                             }
                                          } else if (~var13.field7965 == -6) {
                                             int var73 = var13.field8038;
                                             if (~var73 <= -1 && var73 < 2048) {
                                                class687 var74 = class661.field9578[var73];
                                                class676 var75 = var13.field7944 == -1 ? null : class576.field8554.method3189(var13.field7944, (byte)-39);
                                                if (var74 != null && (class741.field10996 == var73 || class200.method1538(0, var74.field10332) == var13.field7925)) {
                                                   var67 = var74.field10329.method1116(class576.field8554, class786.field11439, (class676)null, class68.field859, 0, (class146[])null, var13.field7936, class54.field616, (int[])null, var13.field7972, class536.field7845, 0, 2048, true, var13.field7989, 0, 0, class597.field8793, var75, -1, class759.field11174);
                                                }
                                             }
                                          } else if (~var13.field7965 != -9 && var13.field7965 != 9) {
                                             if (~var13.field7944 != 0) {
                                                class676 var76 = class576.field8554.method3189(var13.field7944, (byte)-82);
                                                var67 = var13.method4032(class576.field8554, var76, 2048, var13.field7972, class786.field11439, class54.field616, var13.field7989, (byte)124, class68.field859, (class548)var66, var13.field7936, class597.field8793, class759.field11174, class536.field7845, class693.field10418.field10329);
                                                if (var67 == null && class327.field4653) {
                                                   class140.method1188(var13, (byte)4);
                                                }
                                             } else {
                                                var67 = var13.method4032(class576.field8554, (class676)null, 2048, -1, class786.field11439, class54.field616, -1, (byte)124, class68.field859, (class548)var66, 0, class597.field8793, class759.field11174, class536.field7845, class693.field10418.field10329);
                                                if (var67 == null && class327.field4653) {
                                                   class140.method1188(var13, (byte)-109);
                                                }
                                             }
                                          } else {
                                             class5 var77 = class289.method2200(var13.field8038, 0, false);
                                             class676 var78 = ~var13.field7944 != 0 ? class576.field8554.method3189(var13.field7944, (byte)-69) : null;
                                             if (var77 != null) {
                                                class131 var79 = var13.field7978 ? class693.field10418.field10329 : null;
                                                var67 = var77.method44(2048, class786.field11439, var79, var13.field7936, var13.field7989, var13.field7972, var13.field7965 == 9, -28923, var13.field7925, var78);
                                             }
                                          }

                                          if (var67 != null) {
                                             int var80;
                                             if (var13.field8094 > 0) {
                                                var80 = (var13.field7986 << 9) / var13.field8094;
                                                if (var11 != 0) {
                                                   var80 = 512;
                                                }
                                             } else {
                                                var80 = 512;
                                             }

                                             int var81;
                                             label718: {
                                                if (var13.field7916 <= 0) {
                                                   var81 = 512;
                                                   if (var11 == 0) {
                                                      break label718;
                                                   }
                                                }

                                                var81 = (var13.field7954 << 9) / var13.field7916;
                                             }

                                             int var82 = var13.field7986 / 2 + var19;
                                             int var83 = var13.field7954 / 2 + var20;
                                             if (!var13.field8021) {
                                                var82 += var13.field8062 * var80 >> 9;
                                                var83 += var13.field8076 * var81 >> 9;
                                             }

                                             class332.field4754.method1525();
                                             class786.field11439.method550(class332.field4754);
                                             class786.field11439.method630(var82, var83, var80, var81);
                                             class786.field11439.method561();
                                             if (var13.field8035) {
                                                class786.field11439.method622(false);
                                             }

                                             label710: {
                                                if (!var13.field8021) {
                                                   int var84 = (var13.field7917 << 2) * class689.field10389[var13.field8008 << 3] >> 14;
                                                   int var85 = (var13.field7917 << 2) * class689.field10391[var13.field8008 << 3] >> 14;
                                                   class706.field10567.method1524(-var13.field8067 << 3);
                                                   class706.field10567.method1515(var13.field7960 << 3);
                                                   class706.field10567.method1512(var13.field8047 << 2, (var13.field7958 << 2) + var68 + var84, (var13.field7958 << 2) + var85);
                                                   class706.field10567.method1531(var13.field8008 << 3);
                                                   if (var11 == 0) {
                                                      break label710;
                                                   }
                                                }

                                                class706.field10567.method1529(var13.field8008);
                                                class706.field10567.method1515(var13.field7960);
                                                class706.field10567.method1522(var13.field8067);
                                                class706.field10567.method1512(var13.field8062, var13.field8076, var13.field7999);
                                             }

                                             var13.method4037(class314.field4488, 126, class786.field11439, class706.field10567, var67);
                                             if (class100.field1220) {
                                                class786.field11439.method598(var19, var20, var13.field7986 + var19, var13.field7954 + var20);
                                             }

                                             label1024: {
                                                if (!var13.field8021) {
                                                   if (var13.field7975) {
                                                      var67.method338(class706.field10567, (class655)null, var13.field7917 << 2, 1);
                                                      if (var11 == 0) {
                                                         break label1024;
                                                      }
                                                   }

                                                   var67.method301(class706.field10567, (class655)null, 1);
                                                   if (var13.field8010 == null) {
                                                      break label1024;
                                                   }

                                                   class786.field11439.method562(var13.field8010.method5366());
                                                   if (var11 == 0) {
                                                      break label1024;
                                                   }
                                                }

                                                if (!var13.field7975) {
                                                   var67.method301(class706.field10567, (class655)null, 1);
                                                   if (var13.field8010 == null) {
                                                      break label1024;
                                                   }

                                                   class786.field11439.method562(var13.field8010.method5366());
                                                   if (var11 == 0) {
                                                      break label1024;
                                                   }
                                                }

                                                var67.method338(class706.field10567, (class655)null, var13.field7917, 1);
                                             }

                                             if (class100.field1220) {
                                                class786.field11439.method554(arg7, arg5, arg8, arg4);
                                             }

                                             if (var13.field8035) {
                                                class786.field11439.method622(true);
                                             }
                                          }

                                          if (!class446.field6785) {
                                             break label1090;
                                          }

                                          if (!arg10) {
                                             class524.method3852(var17, var16, var15, var14, arg3 ^ -1448);
                                             if (var11 == 0) {
                                                break label1090;
                                             }
                                          }

                                          class458.method3442(var17, 26306, var15, var14, var16);
                                          if (var11 == 0) {
                                             break label1090;
                                          }
                                       }

                                       if (~var13.field7920 == -10) {
                                          int var86;
                                          int var87;
                                          int var88;
                                          int var89;
                                          label684: {
                                             if (!var13.field7997) {
                                                var86 = var13.field7986 + var19;
                                                var87 = var19;
                                                var88 = var20;
                                                var89 = var13.field7954 + var20;
                                                if (var11 == 0) {
                                                   break label684;
                                                }
                                             }

                                             var88 = var20 - -var13.field7954;
                                             var89 = var20;
                                             var87 = var19;
                                             var86 = var13.field7986 + var19;
                                          }

                                          label679: {
                                             if (~var13.field8039 != -2) {
                                                class786.field11439.method557(var87, var88, var86, var89, var13.field8022, var13.field8039, 0);
                                                if (var11 == 0) {
                                                   break label679;
                                                }
                                             }

                                             class786.field11439.method588(var87, var88, var86, var89, var13.field8022, 0);
                                          }

                                          if (class446.field6785) {
                                             label1057: {
                                                if (!arg10) {
                                                   class524.method3852(var17, var16, var15, var14, -1);
                                                   if (var11 == 0) {
                                                      break label1057;
                                                   }
                                                }

                                                class458.method3442(var17, arg3 + 24859, var15, var14, var16);
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
               } while(arg1.length > var12);

            }
         }
      } catch (RuntimeException var91) {
         throw class670.method4877(var91, field224[13] + arg0 + ',' + (arg1 != null ? field224[15] : field224[9]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(ZLjj;)Lcba;",
      line = 881
   )
   public static final class576 method138(boolean arg0, class128 arg1) {
      try {
         ++field215;
         class370 var2 = class65.method534(arg1, -15143);
         if (arg0) {
            method140(-118, 60, -24, (byte)110, -95, -125, 31, 13);
         }

         int var3 = arg1.method1041(4758);
         int var4 = arg1.method1041(4758);
         int var5 = arg1.method1038((byte)-110);
         return new class576(var2.field5647, var2.field5640, var2.field5636, var2.field5631, var2.field5645, var2.field5637, var2.field5644, var2.field5638, var2.field5639, var3, var4, var5);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field224[23] + arg0 + ',' + (arg1 != null ? field224[15] : field224[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "c",
      descriptor = "(B)[Loi;",
      line = 908
   )
   public static final class79[] method139(byte arg0) {
      try {
         if (arg0 != 26) {
            field222 = 3;
         }

         ++field213;
         return new class79[]{class688.field10363, class554.field8209, class33.field367, class675.field10143, class561.field8388, class362.field5454, class335.field4792, class389.field5946, class55.field686, class380.field5848};
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field224[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(IIIBIIII)V",
      line = 921
   )
   public static final void method140(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field219;
         class395 var9 = null;
         int var10 = -19 % ((arg3 - -32) / 58);
         class395 var11 = (class395)class68.field860.method4071((byte)127);
         if (var8 != 0 || var11 != null) {
            do {
               if (var11.field6007 == arg0 && var11.field6011 == arg2 && var11.field6010 == arg5 && ~var11.field6006 == ~arg6) {
                  var9 = var11;
                  break;
               }

               var11 = (class395)class68.field860.method4059((byte)111);
            } while(var11 != null);
         }

         while(var8 != 0) {
         }

         if (var9 == null) {
            var9 = new class395();
            var9.field6006 = arg6;
            var9.field6011 = arg2;
            var9.field6010 = arg5;
            var9.field6007 = arg0;
            if (~arg2 <= -1 && arg5 >= 0 && ~arg2 > ~class323.field4603 && class178.field2197 > arg5) {
               class63.method518(false, var9);
            }

            class68.field860.method4060(23, var9);
         }

         var9.field6005 = arg4;
         var9.field6000 = arg7;
         var9.field6013 = false;
         var9.field6008 = arg1;
         var9.field6002 = true;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field224[25] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method141(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method142(char[] arg0) {
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
            var10005 = 65;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
