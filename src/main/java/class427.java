import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class427 {
   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5814 = new String[]{method3311(method3310("\u00152P\"V")), method3311(method3310("1'\u001d\t\u001bH")), method3311(method3310("5'\u0013\u0004DR\u000f\u0010[")), method3311(method3310("Ri^")), method3311(method3310("N%\u0011\rC\u0014 GQJBx")), method3311(method3310("R\u000b\u0011\u0005\u001b\u001e5DA")), method3311(method3310("R\b.\"DR")), method3311(method3310("= \u0018\t\u001b\u00136D")), method3311(method3310("?#\u0013[")), method3311(method3310("WfV")), method3311(method3310("\u00152P V")), method3311(method3310("R\n\u001f[^")), method3311(method3310("\")\u0012\u0018\rHf")), method3311(method3310(">)\u001c\u0003\u0007Hf7\u000fD")), method3311(method3310("0i\r")), method3311(method3310("\u001c3\u0012\r")), method3311(method3310(">5DA")), method3311(method3310("\"'\f\u0015\u0017\u0011*\u001b\u0012DR")), method3311(method3310("%\u0007,/7<\u0001DA3\u0017+\u0011\u0013\u0007R3\r\u0000\u0019\u0017f\u0011\u0017\u001b\u0000fHU30g^1\u0012\u0017'\r\u0004^\u001b(\u0018\u000e\f\u001ff\t\t\u0011\u00170\u001b\u0013^\u001b5^\u0013\u001b\u00016\u0011\u000f\r\u001b$\u0012\u0004^\u0014)\fA\n\u001a#^\u0002\u0011\u001c2\u001b\u000f\n]'\f\u0004\u001fR?\u0011\u0014^\u00134\u001bA\u000b\u0001/\u0010\u0006Q\u001b(P")), method3311(method3310("\thPO\u0003")), method3311(method3310("0i\rA1\u00072D")), method3311(method3310("Ni\u001d\u000e\u0012Lf\u0006")), method3311(method3310("Wo")), method3311(method3310("R\u0016\u0012[^")), method3311(method3310("46\r[")), method3311(method3310("\u00152P#V"))};
   @OriginalMember(
      owner = "client!gt",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field5812 = new class418(6, 10);
   @OriginalMember(
      owner = "client!gt",
      name = "e",
      descriptor = "F"
   )
   public static float field5813;
   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "I"
   )
   public static int field5809;
   @OriginalMember(
      owner = "client!gt",
      name = "d",
      descriptor = "I"
   )
   public static int field5810;
   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "[Ljha;"
   )
   public static class107[] field5811;

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3307(int arg0) {
      try {
         field5811 = null;
         field5812 = null;
         if (arg0 != 1820626145) {
            method3308((class642[])null, 8, true, -26, -98, 96, -83, -5, 56, 29, -109);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5814[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "([Loca;IZIIIIIIII)V"
   )
   public static final void method3308(class642[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field1481;

      try {
         class629.field9294.method460(arg6, arg10, arg5, arg9);
         if (arg7 != -5230) {
            field5811 = null;
         }

         ++field5810;
         int var12 = 0;
         if (var11 || var12 < arg0.length) {
            do {
               class642 var13 = arg0[var12];
               if (var13 != null && (~var13.field9589 == ~arg3 || arg3 == -1412584499 && (class584.field8627 == var13 || var11))) {
                  int var14 = var13.field9495 + arg4;
                  int var15 = var13.field9570 + arg8;
                  int var16 = var14 + 1 - -var13.field9629;
                  int var17 = var15 - -var13.field9572 - -1;
                  int var18;
                  if (~arg1 == 0) {
                     class439.field5975[class121.field1604].setBounds(var13.field9495 + arg4, var13.field9570 + arg8, var13.field9629, var13.field9572);
                     var18 = class121.field1604++;
                     if (var11) {
                        var18 = arg1;
                     }
                  } else {
                     var18 = arg1;
                  }

                  var13.field9566 = class413.field5678;
                  var13.field9497 = var18;
                  if (!client.method994(var13)) {
                     label1020: {
                        if (var13.field9558 != 0) {
                           class302.method2428(true, var13);
                        }

                        int var19 = var13.field9495 + arg4;
                        int var20 = var13.field9570 - -arg8;
                        int var21 = 0;
                        int var22 = 0;
                        if (class28.field416) {
                           var21 = class356.method2825(0);
                           var22 = class465.method3538(-26506);
                        }

                        int var23 = var13.field9609;
                        if (class497.field6955 && (~client.method999(var13).field10630 != -1 || ~var13.field9493 == -1) && ~var23 < -128) {
                           var23 = 127;
                        }

                        if (class584.field8627 == var13) {
                           if (~arg3 != 1412584498 && (~class612.field9012 == ~var13.field9478 || ~class94.field1281 == ~var13.field9478)) {
                              class137.field1745 = arg0;
                              class318.field4384 = arg8;
                              class450.field6105 = arg4;
                              if (!var11) {
                                 break label1020;
                              }
                           }

                           if (class70.field931 && class50.field697) {
                              int var24 = var21 + class372.field5216.method1570(29658);
                              int var25 = class372.field5216.method1566(0) - -var22;
                              int var26 = var24 - class308.field4309;
                              int var27 = var25 - class67.field897;
                              if (var26 < class417.field5706) {
                                 var26 = class417.field5706;
                              }

                              if (~class727.field10608 < ~var27) {
                                 var27 = class727.field10608;
                              }

                              if (~(class417.field5706 + class509.field7102.field9629) > ~(var13.field9629 + var26)) {
                                 var26 = -var13.field9629 + class417.field5706 - -class509.field7102.field9629;
                              }

                              var19 = var26;
                              if (~(var27 - -var13.field9572) < ~(class727.field10608 - -class509.field7102.field9572)) {
                                 var27 = -var13.field9572 + class509.field7102.field9572 + class727.field10608;
                              }

                              var20 = var27;
                           }

                           if (class94.field1281 == var13.field9478) {
                              var23 = 128;
                           }
                        }

                        int var28;
                        int var29;
                        int var30;
                        int var31;
                        label983: {
                           if (var13.field9493 == 2) {
                              var28 = arg10;
                              var29 = arg6;
                              var30 = arg5;
                              var31 = arg9;
                              if (!var11) {
                                 break label983;
                              }
                           }

                           int var32 = var19 - -var13.field9629;
                           int var33 = var13.field9572 + var20;
                           if (~var13.field9493 == -10) {
                              ++var32;
                              ++var33;
                           }

                           var29 = ~var19 >= ~arg6 ? arg6 : var19;
                           var28 = arg10 >= var20 ? arg10 : var20;
                           var30 = ~arg5 >= ~var32 ? arg5 : var32;
                           var31 = var33 < arg9 ? var33 : arg9;
                        }

                        if (~var29 > ~var30 && (~var28 > ~var31 || var11)) {
                           label1056: {
                              if (~var13.field9558 != -1) {
                                 if (~class157.field2024 == ~var13.field9558 || class119.field1570 == var13.field9558) {
                                    class23.method179(var13, var19, 126, var20);
                                    if (!class28.field416) {
                                       class734.method5305(arg7 + -1595255882, class119.field1570 == var13.field9558, var20, var13.field9629, var13.field9572, var19);
                                       class629.field9294.method460(arg6, arg10, arg5, arg9);
                                    }

                                    class485.field6750[var18] = true;
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }

                                 if (~class139.field1754 == ~var13.field9558) {
                                    if (var13.method4732(class629.field9294, 1618484232) == null) {
                                       break label1056;
                                    }

                                    class161.method1344((byte)-104);
                                    class503.method3802(class629.field9294, var19, var13, var20, (byte)89);
                                    class626.field9246[var18] = true;
                                    class629.field9294.method460(arg6, arg10, arg5, arg9);
                                    if (!class28.field416) {
                                       break label1056;
                                    }

                                    if (arg2) {
                                       class762.method5522(var16, var15, var17, arg7 ^ 5182, var14);
                                       if (!var11) {
                                          break label1056;
                                       }
                                    }

                                    class8.method61(var15, var14, (byte)-116, var17, var16);
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }

                                 if (~class485.field6764 == ~var13.field9558) {
                                    class95.method883(class629.field9294, var20, var19, arg7 ^ -5124, var13);
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }

                                 if (class485.field6743 == var13.field9558) {
                                    class762.method5524(0, var13, var20, var19, class629.field9294, var13.field9617 % 64);
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }

                                 if (~class24.field384 == ~var13.field9558) {
                                    if (var13.method4732(class629.field9294, 1618484232) == null) {
                                       break label1056;
                                    }

                                    class212.method1740(var20, var13, (byte)35, var19);
                                    class626.field9246[var18] = true;
                                    class629.field9294.method460(arg6, arg10, arg5, arg9);
                                    if (!class28.field416) {
                                       break label1056;
                                    }

                                    if (arg2) {
                                       class762.method5522(var16, var15, var17, -71, var14);
                                       if (!var11) {
                                          break label1056;
                                       }
                                    }

                                    class8.method61(var15, var14, (byte)102, var17, var16);
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }

                                 if (~class785.field11473 == ~var13.field9558) {
                                    class121.method1067(class629.field9294, class765.field11191, var19, var13.field9572, var20, (byte)63, var13.field9629);
                                    class485.field6750[var18] = true;
                                    class629.field9294.method460(arg6, arg10, arg5, arg9);
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }

                                 if (class527.field7384 == var13.field9558) {
                                    class778.method5617(var13.field9629, class629.field9294, var20, var19, var13.field9572, 4);
                                    class485.field6750[var18] = true;
                                    class629.field9294.method460(arg6, arg10, arg5, arg9);
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }

                                 if (~class120.field1591 == ~var13.field9558) {
                                    if (!class731.field10652 && !class506.field7050) {
                                       break label1056;
                                    }

                                    int var34 = var13.field9629 + var19;
                                    int var35 = var20 + 15;
                                    if (class28.field416) {
                                       label1033: {
                                          if (arg2) {
                                             class762.method5522(var16, var15, var17, -108, var14);
                                             if (!var11) {
                                                break label1033;
                                             }
                                          }

                                          class8.method61(var15, var14, (byte)-110, var17, var16);
                                       }
                                    }

                                    if (class731.field10652) {
                                       int var36 = -256;
                                       if (class618.field9102 < 20) {
                                          var36 = -65536;
                                       }

                                       class209.field2657.method3431(var36, var35, field5814[24] + class618.field9102, (byte)-127, var34, -1);
                                       var35 += 15;
                                       Runtime var37 = Runtime.getRuntime();
                                       int var38 = (int)((var37.totalMemory() + -var37.freeMemory()) / 1024L);
                                       int var39 = -256;
                                       if (~var38 < -98305) {
                                          var39 = -65536;
                                          if (class613.field9025) {
                                             class507.method3825(-67);
                                             int var40 = 0;
                                             if (var11) {
                                                System.gc();
                                                ++var40;
                                             }

                                             while(true) {
                                                while(~var40 > -11) {
                                                   System.gc();
                                                   ++var40;
                                                }

                                                var38 = (int)((var37.totalMemory() - var37.freeMemory()) / 1024L);
                                                if (!var11) {
                                                   if (var38 > 65536) {
                                                      class632.method4663(field5814[18], 4, -109);
                                                   }
                                                   break;
                                                }

                                                ++var40;
                                             }
                                          }
                                       }

                                       class209.field2657.method3431(var39, var35, field5814[8] + var38 + "k", (byte)-126, var34, -1);
                                       var35 += 15;
                                       class209.field2657.method3431(-256, var35, field5814[2] + class387.field5365.field8772 + field5814[20] + class387.field5365.field8773 + field5814[14], (byte)-121, var34, -1);
                                       var35 += 15;
                                       class209.field2657.method3431(-256, var35, field5814[13] + class387.field5363.field8772 + field5814[20] + class387.field5363.field8773 + field5814[14], (byte)-113, var34, -1);
                                       var35 += 15;
                                       int var41 = class629.field9294.method400() / 1024;
                                       class209.field2657.method3431(~var41 >= -65537 ? -256 : -65536, var35, field5814[7] + var41 + "k", (byte)-110, var34, -1);
                                       var35 += 15;
                                       int var42 = 0;
                                       int var43 = 0;
                                       int var44 = 0;
                                       int var45 = 0;
                                       if (var11) {
                                          if (class87.field1193[var45] != null) {
                                             var42 += class87.field1193[var45].method3776((byte)106);
                                             var43 += class87.field1193[var45].method3772((byte)-122);
                                             var44 += class87.field1193[var45].method3777((byte)-54);
                                          }

                                          ++var45;
                                       }

                                       while(true) {
                                          while(~var45 > -38) {
                                             if (class87.field1193[var45] != null) {
                                                var42 += class87.field1193[var45].method3776((byte)106);
                                                var43 += class87.field1193[var45].method3772((byte)-122);
                                                var44 += class87.field1193[var45].method3777((byte)-54);
                                             }

                                             ++var45;
                                          }

                                          int var46 = var44 * 100 / var42;
                                          int var47 = var43 * 10000 / var42;
                                          String var48 = field5814[1] + class732.method5287(2, 0, (long)var47, arg7 ^ -5230, true) + field5814[9] + var46 + field5814[22];
                                          class59.field770.method3431(-256, var35, var48, (byte)-117, var34, -1);
                                          if (!var11) {
                                             var35 += 12;
                                             break;
                                          }

                                          ++var45;
                                       }
                                    }

                                    if (~class314.field4355 < -1) {
                                       class59.field770.method3431(-256, var35, field5814[17] + class248.field3142 + field5814[3] + class314.field4355, (byte)-112, var34, -1);
                                    }

                                    var35 += 12;
                                    if (class506.field7050) {
                                       class59.field770.method3431(-256, var35, field5814[12] + class629.field9294.method450() + field5814[5] + class629.field9294.method497(), (byte)-125, var34, -1);
                                       var35 += 12;
                                       class59.field770.method3431(-256, var35, field5814[16] + class606.field8968 + field5814[11] + class737.field10781 + field5814[6] + class712.field10454 + field5814[23] + class754.field11042, (byte)-111, var34, -1);
                                       class410.method3219(-86);
                                       var35 += 12;
                                    }

                                    class485.field6750[var18] = true;
                                    if (!var11) {
                                       break label1056;
                                    }
                                 }
                              }

                              if (~var13.field9493 == -1) {
                                 if (~class507.field7059 == ~var13.field9558 && class629.field9294.method399()) {
                                    class629.field9294.method395(var19, var20, var13.field9629, var13.field9572);
                                 }

                                 method3308(arg0, var18, arg2, var13.field9482, var19 - var13.field9556, var30, var29, -5230, -var13.field9584 + var20, var31, var28);
                                 if (var13.field9530 != null) {
                                    method3308(var13.field9530, var18, arg2, var13.field9482, -var13.field9556 + var19, var30, var29, arg7, var20 - var13.field9584, var31, var28);
                                 }

                                 class710 var49 = (class710)class397.field5473.method1818(-1, (long)var13.field9482);
                                 if (var49 != null) {
                                    class115.method1025(var19, var30, var31, var28, (byte)-91, var49.field10422, var18, var29, var20);
                                 }

                                 if (~class507.field7059 == ~var13.field9558 && class629.field9294.method399()) {
                                    class629.field9294.method393();
                                 }

                                 class629.field9294.method460(arg6, arg10, arg5, arg9);
                              }

                              if (class708.field10409[var18] || class420.field5741 > 1) {
                                 label1058: {
                                    if (~var13.field9493 == -4) {
                                       label998: {
                                          if (var23 == 0) {
                                             if (var13.field9516) {
                                                class629.field9294.method513(var19, var20, var13.field9629, var13.field9572, var13.field9617, 0);
                                                if (!var11) {
                                                   break label998;
                                                }
                                             }

                                             class629.field9294.method462(var19, var20, var13.field9629, var13.field9572, var13.field9617, 0);
                                             if (!var11) {
                                                break label998;
                                             }
                                          }

                                          if (!var13.field9516) {
                                             class629.field9294.method462(var19, var20, var13.field9629, var13.field9572, 16777215 & var13.field9617 | 255 - (255 & var23) << 24, 1);
                                             if (!var11) {
                                                break label998;
                                             }
                                          }

                                          class629.field9294.method513(var19, var20, var13.field9629, var13.field9572, 16777215 & var13.field9617 | -(255 & var23) + 255 << 24, 1);
                                       }

                                       if (!class28.field416) {
                                          break label1058;
                                       }

                                       if (!arg2) {
                                          class8.method61(var15, var14, (byte)104, var17, var16);
                                          if (!var11) {
                                             break label1058;
                                          }
                                       }

                                       class762.method5522(var16, var15, var17, -71, var14);
                                       if (!var11) {
                                          break label1058;
                                       }
                                    }

                                    if (~var13.field9493 == -5) {
                                       class447 var50 = var13.method4725(class629.field9294, (byte)49);
                                       if (var50 == null) {
                                          if (!class681.field10032) {
                                             break label1058;
                                          }

                                          class49.method372(var13, arg7 ^ -5230);
                                          if (!var11) {
                                             break label1058;
                                          }
                                       }

                                       int var51 = var13.field9617;
                                       String var52 = var13.field9633;
                                       if (~var13.field9524 != 0) {
                                          class546 var53 = class166.field2126.method5576(var13.field9524, (byte)-127);
                                          var52 = var53.field8056;
                                          if (var52 == null) {
                                             var52 = field5814[15];
                                          }

                                          if ((~var53.field8027 == -2 || ~var13.field9634 != -2) && ~var13.field9634 != 0) {
                                             var52 = field5814[4] + var52 + field5814[21] + class215.method1755(var13.field9634, 9);
                                          }
                                       }

                                       if (var13.field9587 != -1) {
                                          var52 = class223.method1781(var13.field9587, 8);
                                          if (var52 == null) {
                                             var52 = "";
                                          }
                                       }

                                       if (class201.field2554 == var13) {
                                          var52 = class606.field8934.method4490(class782.field11389, -16777216);
                                          var51 = var13.field9617;
                                       }

                                       if (class554.field8140) {
                                          class629.field9294.method412(var19, var20, var13.field9629 + var19, var13.field9572 + var20);
                                       }

                                       var50.method3427(true, class693.field10172, (class87)null, 0, !var13.field9523 ? -1 : 255 - (255 & var23) << 24, var13.field9510, var20, var52, var13.field9629, var13.field9572, -(var23 & 255) + 255 << 24 | var51, var13.field9624, (int[])null, var13.field9534, var19, 0, var13.field9574);
                                       if (class554.field8140) {
                                          class629.field9294.method460(arg6, arg10, arg5, arg9);
                                       }

                                       if (~var52.trim().length() >= -1) {
                                          break label1058;
                                       }

                                       if (class554.field8140) {
                                          if (!class28.field416) {
                                             break label1058;
                                          }

                                          if (arg2) {
                                             class762.method5522(var16, var15, var17, -83, var14);
                                             if (!var11) {
                                                break label1058;
                                             }
                                          }

                                          class8.method61(var15, var14, (byte)113, var17, var16);
                                          if (!var11) {
                                             break label1058;
                                          }
                                       }

                                       class19 var54 = class441.method3397(arg7 + 5246, var13.field9487, class629.field9294);
                                       int var55 = var54.method148(class693.field10172, 0, var13.field9629, var52);
                                       int var56 = var54.method140(var13.field9624, var52, (byte)-43, class693.field10172, var13.field9629);
                                       if (!class28.field416) {
                                          break label1058;
                                       }

                                       if (arg2) {
                                          class762.method5522(var19 + var55, var20, var20 + var56, -69, var19);
                                          if (!var11) {
                                             break label1058;
                                          }
                                       }

                                       class8.method61(var20, var19, (byte)-67, var20 + var56, var19 + var55);
                                       if (!var11) {
                                          break label1058;
                                       }
                                    }

                                    if (~var13.field9493 == -6) {
                                       label1003: {
                                          if (var13.field9506 >= 0) {
                                             var13.method4739(class720.field10555, (byte)-8, class263.field3339).method3560(var13.field9629, var20, class629.field9294, 0, var13.field9568 << 3, var13.field9489 << 3, var19, arg7 ^ -5742, var13.field9572, 0);
                                             if (!var11) {
                                                break label1003;
                                             }
                                          }

                                          class648 var57;
                                          label1004: {
                                             if (~var13.field9524 == 0) {
                                                if (var13.field9587 == -1) {
                                                   var57 = var13.method4737((byte)102, class629.field9294);
                                                   if (!var11) {
                                                      break label1004;
                                                   }
                                                }

                                                var57 = class530.method3977(-1, var13.field9587, class629.field9294);
                                                if (!var11) {
                                                   break label1004;
                                                }
                                             }

                                             class570 var58 = var13.field9632 ? class204.field2593.field11443 : null;
                                             var57 = class166.field2126.method5571(var13.field9524, false, var58, class629.field9294, var13.field9634, var13.field9625 | -16777216, var13.field9485, var13.field9488);
                                          }

                                          if (var57 != null) {
                                             int var59 = var57.method2406();
                                             int var60 = var57.method2396();
                                             int var61 = 255 - (var23 & 255) << 24 | (~var13.field9617 != -1 ? 16777215 & var13.field9617 : 16777215);
                                             if (!var13.field9470) {
                                                if (var13.field9617 == 0 && ~var23 == -1) {
                                                   if (~var13.field9464 != -1) {
                                                      var57.method4763((float)var13.field9629 / 2.0F + (float)var19, (float)var13.field9572 / 2.0F + (float)var20, var13.field9629 * 4096 / var59, var13.field9464);
                                                      if (!var11) {
                                                         break label1003;
                                                      }
                                                   }

                                                   if (~var13.field9629 == ~var59 && ~var13.field9572 == ~var60) {
                                                      var57.method4760(var19, var20);
                                                      if (!var11) {
                                                         break label1003;
                                                      }
                                                   }

                                                   var57.method4766(var19, var20, var13.field9629, var13.field9572);
                                                   if (!var11) {
                                                      break label1003;
                                                   }
                                                }

                                                if (var13.field9464 == 0) {
                                                   if (~var13.field9629 != ~var59 || var13.field9572 != var60) {
                                                      var57.method4769(var19, var20, var13.field9629, var13.field9572, 0, var61, 1);
                                                      if (!var11) {
                                                         break label1003;
                                                      }
                                                   }

                                                   var57.method2399(var19, var20, 0, var61, 1);
                                                   if (!var11) {
                                                      break label1003;
                                                   }
                                                }

                                                var57.method4765((float)var13.field9629 / 2.0F + (float)var19, (float)var13.field9572 / 2.0F + (float)var20, var13.field9629 * 4096 / var59, var13.field9464, 0, var61, 1);
                                                if (!var11) {
                                                   break label1003;
                                                }
                                             }

                                             label1008: {
                                                class629.field9294.method412(var19, var20, var13.field9629 + var19, var20 - -var13.field9572);
                                                if (~var13.field9464 != -1) {
                                                   int var62 = (var13.field9629 + var59 + -1) / var59;
                                                   int var63 = (var13.field9572 + var60 + -1) / var60;
                                                   int var64 = 0;
                                                   if (var11 || var64 < var62) {
                                                      do {
                                                         int var65 = 0;
                                                         if (var11) {
                                                            if (var13.field9617 == 0) {
                                                               var57.method4763((float)var59 / 2.0F + (float)(var19 - -(var59 * var64)), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9464);
                                                               if (var11) {
                                                                  var57.method4765((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field9464, 0, var61, 1);
                                                                  ++var65;
                                                               } else {
                                                                  ++var65;
                                                               }
                                                            } else {
                                                               var57.method4765((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field9464, 0, var61, 1);
                                                               ++var65;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(~var63 < ~var65) {
                                                               if (var13.field9617 == 0) {
                                                                  var57.method4763((float)var59 / 2.0F + (float)(var19 - -(var59 * var64)), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9464);
                                                                  if (var11) {
                                                                     var57.method4765((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field9464, 0, var61, 1);
                                                                     ++var65;
                                                                  } else {
                                                                     ++var65;
                                                                  }
                                                               } else {
                                                                  var57.method4765((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field9464, 0, var61, 1);
                                                                  ++var65;
                                                               }
                                                            }

                                                            if (!var11) {
                                                               ++var64;
                                                               break;
                                                            }

                                                            var57.method4765((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), 4096, var13.field9464, 0, var61, 1);
                                                            ++var65;
                                                         }
                                                      } while(var64 < var62);
                                                   }

                                                   if (!var11) {
                                                      break label1008;
                                                   }
                                                }

                                                if (~var13.field9617 == -1 && var23 == 0) {
                                                   var57.method4762(var19, var20, var13.field9629, var13.field9572);
                                                   if (!var11) {
                                                      break label1008;
                                                   }
                                                }

                                                var57.method2409(var19, var20, var13.field9629, var13.field9572, 0, var61, 1);
                                             }

                                             class629.field9294.method460(arg6, arg10, arg5, arg9);
                                             if (!var11) {
                                                break label1003;
                                             }
                                          }

                                          if (class681.field10032) {
                                             class49.method372(var13, 0);
                                          }
                                       }

                                       if (!class28.field416) {
                                          break label1058;
                                       }

                                       if (arg2) {
                                          class762.method5522(var16, var15, var17, -85, var14);
                                          if (!var11) {
                                             break label1058;
                                          }
                                       }

                                       class8.method61(var15, var14, (byte)-42, var17, var16);
                                       if (!var11) {
                                          break label1058;
                                       }
                                    }

                                    if (var13.field9493 == 6) {
                                       class128.method1095(46);
                                       Object var66 = null;
                                       class232 var67 = null;
                                       int var68 = 0;
                                       if (~var13.field9524 != 0) {
                                          class546 var69 = class166.field2126.method5576(var13.field9524, (byte)-119);
                                          if (var69 != null) {
                                             class546 var70 = var69.method4130(var13.field9634, -91);
                                             class238 var71 = var13.field9529 != -1 ? class532.field7812.method2473((byte)86, var13.field9529) : null;
                                             class570 var72 = !var13.field9632 ? null : class204.field2593.field11443;
                                             var67 = var70.method4124(true, var13.field9611, var72, var13.field9469, 2048, class629.field9294, var13.field9597, 1, var71);
                                             if (var67 != null) {
                                                var68 = -var67.method1287() >> 1;
                                                if (var11) {
                                                   class49.method372(var13, 0);
                                                }
                                             } else {
                                                class49.method372(var13, 0);
                                             }
                                          }
                                       } else if (var13.field9528 == 5) {
                                          int var73 = var13.field9535;
                                          if (~var73 <= -1 && var73 < 2048) {
                                             class783 var74 = class59.field771[var73];
                                             class238 var75 = ~var13.field9529 == 0 ? null : class532.field7812.method2473((byte)86, var13.field9529);
                                             if (var74 != null && (~class16.field280 == ~var73 || ~class577.method4325((byte)101, var74.field11422) == ~var13.field9475)) {
                                                var67 = var74.field11443.method4277((class287[])null, -1, true, arg7 ^ -5183, 0, 0, var13.field9597, class629.field9294, class754.field11043, var13.field9469, class175.field2266, class3.field44, (int[])null, var13.field9611, var75, class166.field2126, class119.field1574, class270.field3460, 2048, class532.field7812, 0, (class238)null);
                                             }
                                          }
                                       } else if (~var13.field9528 != -9 && ~var13.field9528 != -10) {
                                          if (~var13.field9529 == 0) {
                                             var67 = var13.method4730(0, -24893, class175.field2266, -1, class270.field3460, class166.field2126, 2048, (class12)var66, class754.field11043, class3.field44, class629.field9294, class532.field7812, (class238)null, class204.field2593.field11443, -1);
                                             if (var67 == null && class681.field10032) {
                                                class49.method372(var13, 0);
                                             }
                                          } else {
                                             class238 var76 = class532.field7812.method2473((byte)86, var13.field9529);
                                             var67 = var13.method4730(var13.field9597, -24893, class175.field2266, var13.field9611, class270.field3460, class166.field2126, 2048, (class12)var66, class754.field11043, class3.field44, class629.field9294, class532.field7812, var76, class204.field2593.field11443, var13.field9469);
                                             if (var67 == null && class681.field10032) {
                                                class49.method372(var13, 0);
                                             }
                                          }
                                       } else {
                                          class657 var77 = class733.method5295(var13.field9535, false, (byte)99);
                                          class238 var78 = ~var13.field9529 != 0 ? class532.field7812.method2473((byte)86, var13.field9529) : null;
                                          if (var77 != null) {
                                             class570 var79 = var13.field9632 ? class204.field2593.field11443 : null;
                                             var67 = var77.method4822(23555, var13.field9475, var13.field9611, 2048, var79, var13.field9597, ~var13.field9528 == -10, var78, var13.field9469, class629.field9294);
                                          }
                                       }

                                       if (var67 != null) {
                                          int var80;
                                          if (var13.field9557 > 0) {
                                             var80 = (var13.field9629 << 9) / var13.field9557;
                                             if (var11) {
                                                var80 = 512;
                                             }
                                          } else {
                                             var80 = 512;
                                          }

                                          int var81;
                                          if (var13.field9594 > 0) {
                                             var81 = (var13.field9572 << 9) / var13.field9594;
                                             if (var11) {
                                                var81 = 512;
                                             }
                                          } else {
                                             var81 = 512;
                                          }

                                          int var82 = var13.field9629 / 2 + var19;
                                          int var83 = var13.field9572 / 2 + var20;
                                          if (!var13.field9645) {
                                             var83 += var13.field9486 * var81 >> 9;
                                             var82 += var13.field9503 * var80 >> 9;
                                          }

                                          class428.field5818.method856();
                                          class629.field9294.method397(class428.field5818);
                                          class629.field9294.method504(var82, var83, var80, var81);
                                          class629.field9294.method502();
                                          if (var13.field9507) {
                                             class629.field9294.method437(false);
                                          }

                                          label720: {
                                             if (!var13.field9645) {
                                                int var84 = (var13.field9517 << 2) * class746.field10907[var13.field9498 << 3] >> 14;
                                                int var85 = (var13.field9517 << 2) * class746.field10897[var13.field9498 << 3] >> 14;
                                                class216.field2745.method855(-var13.field9578 << 3);
                                                class216.field2745.method861(var13.field9540 << 3);
                                                class216.field2745.method868(var13.field9536 << 2, var84 - -(var13.field9630 << 2) + var68, (var13.field9630 << 2) + var85);
                                                class216.field2745.method873(var13.field9498 << 3);
                                                if (!var11) {
                                                   break label720;
                                                }
                                             }

                                             class216.field2745.method859(var13.field9498);
                                             class216.field2745.method861(var13.field9540);
                                             class216.field2745.method871(var13.field9578);
                                             class216.field2745.method868(var13.field9503, var13.field9486, var13.field9519);
                                          }

                                          var13.method4738(class216.field2745, -2, class413.field5678, var67, class629.field9294);
                                          if (class554.field8140) {
                                             class629.field9294.method412(var19, var20, var13.field9629 + var19, var20 - -var13.field9572);
                                          }

                                          label1017: {
                                             if (!var13.field9645) {
                                                if (var13.field9553) {
                                                   var67.method1297(class216.field2745, (class687)null, var13.field9517 << 2, 1);
                                                   if (!var11) {
                                                      break label1017;
                                                   }
                                                }

                                                var67.method1305(class216.field2745, (class687)null, 1);
                                                if (var13.field9472 == null) {
                                                   break label1017;
                                                }

                                                class629.field9294.method508(var13.field9472.method4559());
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             if (var13.field9553) {
                                                var67.method1297(class216.field2745, (class687)null, var13.field9517, 1);
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             var67.method1305(class216.field2745, (class687)null, 1);
                                             if (var13.field9472 != null) {
                                                class629.field9294.method508(var13.field9472.method4559());
                                             }
                                          }

                                          if (class554.field8140) {
                                             class629.field9294.method460(arg6, arg10, arg5, arg9);
                                          }

                                          if (var13.field9507) {
                                             class629.field9294.method437(true);
                                          }
                                       }

                                       if (!class28.field416) {
                                          break label1058;
                                       }

                                       if (!arg2) {
                                          class8.method61(var15, var14, (byte)-32, var17, var16);
                                          if (!var11) {
                                             break label1058;
                                          }
                                       }

                                       class762.method5522(var16, var15, var17, -110, var14);
                                       if (!var11) {
                                          break label1058;
                                       }
                                    }

                                    if (~var13.field9493 == -10) {
                                       int var86;
                                       int var87;
                                       int var88;
                                       int var89;
                                       label696: {
                                          if (!var13.field9474) {
                                             var86 = var13.field9572 + var20;
                                             var87 = var20;
                                             var88 = var13.field9629 + var19;
                                             var89 = var19;
                                             if (!var11) {
                                                break label696;
                                             }
                                          }

                                          var88 = var13.field9629 + var19;
                                          var86 = var20;
                                          var87 = var20 - -var13.field9572;
                                          var89 = var19;
                                       }

                                       label691: {
                                          if (~var13.field9636 == -2) {
                                             class629.field9294.method446(var89, var87, var88, var86, var13.field9617, 0);
                                             if (!var11) {
                                                break label691;
                                             }
                                          }

                                          class629.field9294.method403(var89, var87, var88, var86, var13.field9617, var13.field9636, 0);
                                       }

                                       if (class28.field416) {
                                          label1048: {
                                             if (!arg2) {
                                                class8.method61(var15, var14, (byte)-28, var17, var16);
                                                if (!var11) {
                                                   break label1048;
                                                }
                                             }

                                             class762.method5522(var16, var15, var17, arg7 ^ 5144, var14);
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
            } while(var12 < arg0.length);

         }
      } catch (RuntimeException var91) {
         throw class93.method866(var91, field5814[10] + (arg0 != null ? field5814[19] : field5814[15]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method3309(int arg0, byte arg1) {
      try {
         ++field5809;
         int var2 = -28 % ((37 - arg1) / 49);
         return arg0 == 4 || arg0 == 8 || ~arg0 == -13 || arg0 == 10;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5814[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3310(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3311(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
