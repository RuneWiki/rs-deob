import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class133 {
   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1704 = new String[]{method1056(method1055("1QFRG")), method1056(method1055("1QFQG")), method1056(method1055("1QFSG")), method1056(method1055("9R\u0004|")), method1056(method1055("'A\t")), method1056(method1055(",\tF>\u0012")), method1056(method1055("1QFTG")), method1056(method1055("\u0003\u0014H=O")), method1056(method1055("1QFUG"))};
   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "I"
   )
   public static int field1699;
   @OriginalMember(
      owner = "client!fv",
      name = "c",
      descriptor = "I"
   )
   public static int field1700;
   @OriginalMember(
      owner = "client!fv",
      name = "e",
      descriptor = "I"
   )
   public static int field1701;
   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "I"
   )
   public static int field1703;
   @OriginalMember(
      owner = "client!fv",
      name = "d",
      descriptor = "Ljava/awt/datatransfer/Clipboard;"
   )
   public static Clipboard field1702;

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1050(boolean arg0) {
      try {
         if (!arg0) {
            field1702 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1704[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(ZLlea;)V"
   )
   public static final void method1051(boolean arg0, class639 arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1700;
         class534 var3 = class430.field6150.field105;
         if (class191.field2719 == arg1) {
            int var4 = var3.method1194(14623);
            int var5 = var4 >> 2;
            int var6 = var4 & 3;
            int var7 = class773.field11363[var5];
            int var8 = var3.method1174((byte)126);
            int var9 = class82.field1067 - -((var8 & 125) >> 4);
            int var10 = (var8 & 7) + class457.field6517;
            if (class679.method4951(class594.field8738, -201) || ~var9 <= -1 && ~var10 <= -1 && var9 < class644.field9403 && var10 < class337.field4594) {
               class259.method1979(var10, var7, var6, var9, -1, var5, -20027, class611.field8967);
            }

         } else {
            int var10000;
            if (class589.field8692 == arg1) {
               int var11 = var3.method1210((byte)126);
               int var12 = var3.method1194(14623);
               int var13 = (var12 & 7) + class457.field6517;
               int var14 = class533.field7595 + var13;
               int var15 = class82.field1067 - -((var12 & 122) >> 4);
               int var16 = var15 - -class672.field9740;
               class622 var17 = (class622)class39.field556.method329((byte)-93, (long)(class611.field8967 << 28 | var14 << 14 | var16));
               if (var17 != null) {
                  label427: {
                     class553 var18 = (class553)var17.field9154.method2933(2);
                     if (var2) {
                        var10000 = ~(32767 & var11);
                     } else if (var18 == null) {
                        var10000 = var17.field9154.method2942(0);
                        if (!var2) {
                           break label427;
                        }
                     } else {
                        var10000 = ~(32767 & var11);
                     }

                     label426:
                     do {
                        while(true) {
                           if (var10000 == ~var18.field7927) {
                              var18.method3165(119);
                              if (!var2) {
                                 var10000 = var17.field9154.method2942(0);
                                 break;
                              }

                              var18 = (class553)var17.field9154.method2940(false);
                           } else {
                              var18 = (class553)var17.field9154.method2940(false);
                           }

                           if (var18 == null) {
                              var10000 = var17.field9154.method2942(0);
                              if (!var2) {
                                 break label426;
                              }
                           } else {
                              var10000 = ~(32767 & var11);
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 != 0) {
                     var17.method3165(119);
                  }

                  if (~var15 <= -1 && var13 >= 0 && class644.field9403 > var15 && ~var13 > ~class337.field4594) {
                     class284.method2152(112, class611.field8967, var15, var13);
                  }
               }

            } else if (class763.field11275 == arg1) {
               int var19 = var3.method1143(-15465);
               int var20 = (7 & var19 >> 4) + class82.field1067;
               int var21 = class457.field6517 - -(var19 & 7);
               int var22 = var3.method1211(-26166);
               int var23 = var3.method1143(-15465);
               int var24 = var3.method1211(-26166);
               int var25 = var3.method1143(-15465);
               if (var20 >= 0 && ~var21 <= -1 && class644.field9403 > var20 && var21 < class337.field4594) {
                  int var26 = var20 * 512 + 256;
                  int var27 = var21 * 512 + 256;
                  int var28 = class611.field8967;
                  if (~var28 > -4 && class437.method3224(var21, true, var20)) {
                     ++var28;
                  }

                  class784 var29 = new class784(var22, var24, class96.field1234, class611.field8967, var28, var26, class102.method851(class611.field8967, (byte)127, var26, var27) - var23, var27, var20, var20, var21, var21, var25);
                  class636.field9304.method2930((byte)-56, new class432(var29));
               }

            } else if (class700.field10243 == arg1) {
               int var30 = var3.method1143(-15465);
               int var31 = (7 & var30) + class457.field6517;
               int var32 = var31 - -class533.field7595;
               int var33 = class82.field1067 - -((122 & var30) >> 4);
               int var34 = var33 - -class672.field9740;
               int var35 = var3.method1211(-26166);
               int var36 = var3.method1211(-26166);
               int var37 = var3.method1211(-26166);
               if (class39.field556 != null) {
                  class622 var38 = (class622)class39.field556.method329((byte)-20, (long)(var32 << 14 | class611.field8967 << 28 | var34));
                  if (var38 != null) {
                     label457: {
                        class553 var39 = (class553)var38.field9154.method2933(2);
                        if (var2) {
                           var10000 = var39.field7927;
                        } else if (var39 == null) {
                           var10000 = var33;
                           if (!var2) {
                              break label457;
                           }
                        } else {
                           var10000 = var39.field7927;
                        }

                        label456:
                        do {
                           while(true) {
                              if (var10000 == (var35 & 32767) && var39.field7929 == var36) {
                                 var39.method3165(118);
                                 var39.field7929 = var37;
                                 class611.method4442(var32, class611.field8967, var39, var34, -5663);
                                 if (!var2) {
                                    var10000 = var33;
                                    break;
                                 }
                              }

                              var39 = (class553)var38.field9154.method2940(false);
                              if (var39 == null) {
                                 var10000 = var33;
                                 if (!var2) {
                                    break label456;
                                 }
                              } else {
                                 var10000 = var39.field7927;
                              }
                           }
                        } while(var2);
                     }

                     if (var10000 >= 0 && ~var31 <= -1 && class644.field9403 > var33 && ~var31 > ~class337.field4594) {
                        class284.method2152(-9, class611.field8967, var33, var31);
                     }
                  }
               }

            } else if (class227.field3216 == arg1) {
               int var40 = var3.method1143(-15465);
               int var41 = (7 & var40 >> 4) + class82.field1067;
               int var42 = (7 & var40) + class457.field6517;
               int var43 = var3.method1211(-26166);
               if (~var43 == -65536) {
                  var43 = -1;
               }

               int var44 = var3.method1143(-15465);
               int var45 = (250 & var44) >> 4;
               int var46 = var44 & 7;
               int var47 = var3.method1143(-15465);
               int var48 = var3.method1143(-15465);
               int var49 = var3.method1211(-26166);
               if (var41 >= 0 && var42 >= 0 && class644.field9403 > var41 && var42 < class337.field4594) {
                  int var50 = var45 - -1;
                  if (~(-var50 + var41) >= ~class564.field8045.field3888[0] && var41 - -var50 >= class564.field8045.field3888[0] && var42 - var50 <= class564.field8045.field3884[0] && ~class564.field8045.field3884[0] >= ~(var42 + var50)) {
                     class246.method1869(var43, 82, var46, false, var49, var48, var47, (var42 << 8) + (class611.field8967 << 24) - -(var41 << 16) + var45);
                  }
               }

            } else if (class264.field3643 == arg1) {
               int var51 = var3.method1194(14623);
               int var52 = var3.method1194(14623);
               int var53 = class82.field1067 - -((112 & var52) >> 4);
               int var54 = (var52 & 7) + class457.field6517;
               int var55 = var3.method1174((byte)124);
               int var56 = var55 >> 2;
               int var57 = class773.field11363[var56];
               int var58 = var3.method1210((byte)126);
               if (~var56 == -12) {
                  var56 = 10;
               }

               class259 var59 = class387.field5618.method3977(var58, (byte)75);
               int var60 = 0;
               if (var59.field3604 != null) {
                  label526: {
                     int var61 = -1;
                     int var62 = 0;
                     if (var2) {
                        var10000 = var59.field3604[var62];
                     } else if (var59.field3604.length <= var62) {
                        var10000 = var59.field3577[var61].length;
                        if (!var2) {
                           break label526;
                        }
                     } else {
                        var10000 = var59.field3604[var62];
                     }

                     label525:
                     do {
                        while(true) {
                           if (var10000 == var56) {
                              var61 = var62;
                              if (!var2) {
                                 var10000 = var59.field3577[var62].length;
                                 break;
                              }

                              ++var62;
                           } else {
                              ++var62;
                           }

                           if (var59.field3604.length <= var62) {
                              var10000 = var59.field3577[var61].length;
                              if (!var2) {
                                 break label525;
                              }
                           } else {
                              var10000 = var59.field3604[var62];
                           }
                        }
                     } while(var2);
                  }

                  var60 = var10000;
               }

               int var63 = 0;
               if (var59.field3571 != null) {
                  var63 = var59.field3571.length;
               }

               int var64 = 0;
               if (var59.field3538 != null) {
                  var64 = var59.field3538.length;
               }

               if (~(1 & var51) == -2) {
                  class752.method5456(var57, (class39)null, var54, var53, class611.field8967, -127);
               } else {
                  int[] var65 = null;
                  if ((2 & var51) == 2) {
                     var65 = new int[var60];
                     int var66 = 0;
                     if (var2 || var60 > var66) {
                        do {
                           var65[var66] = var3.method1211(-26166);
                           ++var66;
                        } while(var60 > var66);
                     }
                  }

                  short[] var67 = null;
                  if (~(4 & var51) == -5) {
                     var67 = new short[var63];
                     int var68 = 0;
                     if (var2 || ~var68 > ~var63) {
                        do {
                           var67[var68] = (short)var3.method1211(-26166);
                           ++var68;
                        } while(~var68 > ~var63);
                     }
                  }

                  short[] var69 = null;
                  if ((var51 & 8) == 8) {
                     var69 = new short[var64];
                     int var70 = 0;
                     if (var2 || ~var64 < ~var70) {
                        do {
                           var69[var70] = (short)var3.method1211(-26166);
                           ++var70;
                        } while(~var64 < ~var70);
                     }
                  }

                  class752.method5456(var57, new class39((long)(class16.field182++), var65, var67, var69), var54, var53, class611.field8967, -123);
               }
            } else if (class23.field266 == arg1) {
               int var71 = var3.method1143(-15465);
               int var72 = var71 >> 2;
               int var73 = 3 & var71;
               int var74 = class773.field11363[var72];
               int var75 = var3.method1194(14623);
               int var76 = class82.field1067 - -(var75 >> 4 & 7);
               int var77 = class457.field6517 - -(7 & var75);
               int var78 = var3.method1154(arg0);
               if (class679.method4951(class594.field8738, -201) || var76 >= 0 && ~var77 <= -1 && var76 < class644.field9403 && class337.field4594 > var77) {
                  class259.method1979(var77, var74, var73, var76, var78, var72, -20027, class611.field8967);
               }

            } else if (class65.field792 == arg1) {
               var3.method1143(-15465);
               int var79 = var3.method1143(-15465);
               int var80 = (7 & var79 >> 4) + class82.field1067;
               int var81 = (7 & var79) + class457.field6517;
               int var82 = var3.method1211(-26166);
               int var83 = var3.method1143(-15465);
               int var84 = var3.method1166((byte)-71);
               String var85 = var3.method1204(2119550368);
               class325.method2405(var83, var80, var84, var81, var85, var82, class611.field8967, (byte)-123);
            } else if (class110.field1372 == arg1) {
               int var86 = var3.method1194(14623);
               int var87 = class82.field1067 - -(var86 >> 4 & 7);
               int var88 = class457.field6517 - -(var86 & 7);
               int var89 = var3.method1176(-32768);
               if (~var89 == -65536) {
                  var89 = -1;
               }

               int var90 = var3.method1189(0);
               int var91 = var90 >> 2;
               int var92 = var90 & 3;
               int var93 = class773.field11363[var91];
               class74.method677(var93, var89, class611.field8967, var87, var91, var88, var92, 3);
            } else {
               if (!arg0) {
                  field1702 = null;
               }

               if (class679.field10004 == arg1) {
                  int var94 = var3.method1210((byte)126);
                  int var95 = var3.method1211(-26166);
                  int var96 = var3.method1176(-32768);
                  int var97 = var3.method1189(0);
                  int var98 = class457.field6517 - -(var97 & 7);
                  int var99 = class533.field7595 + var98;
                  int var100 = ((120 & var97) >> 4) + class82.field1067;
                  int var101 = class672.field9740 + var100;
                  if (class358.field4891 != var96) {
                     boolean var102 = var100 >= 0 && ~var98 <= -1 && class644.field9403 > var100 && ~var98 > ~class337.field4594;
                     if (var102 || class679.method4951(class594.field8738, -201)) {
                        class611.method4442(var99, class611.field8967, new class553(var94, var95), var101, -5663);
                        if (var102) {
                           class284.method2152(104, class611.field8967, var100, var98);
                        }
                     }
                  }

               } else if (class208.field2972 == arg1) {
                  int var103 = var3.method1143(-15465);
                  int var104 = (7 & var103 >> 4) + class82.field1067;
                  int var105 = (7 & var103) + class457.field6517;
                  int var106 = var3.method1211(-26166);
                  if (~var106 == -65536) {
                     var106 = -1;
                  }

                  int var107 = var3.method1143(-15465);
                  int var108 = 15 & var107 >> 4;
                  int var109 = var107 & 7;
                  int var110 = var3.method1143(-15465);
                  int var111 = var3.method1143(-15465);
                  int var112 = var3.method1211(-26166);
                  if (var104 >= 0 && var105 >= 0 && var104 < class644.field9403 && ~var105 > ~class337.field4594) {
                     int var113 = var108 + 1;
                     if (~(-var113 + var104) >= ~class564.field8045.field3888[0] && var104 + var113 >= class564.field8045.field3888[0] && ~(-var113 + var105) >= ~class564.field8045.field3884[0] && var105 + var113 >= class564.field8045.field3884[0]) {
                        class165.method1368(var109, var106, var110, (class611.field8967 << 24) + var108 - (-(var104 << 16) - (var105 << 8)), (byte)1, var112, var111);
                     }
                  }

               } else if (class130.field1663 == arg1) {
                  int var114 = var3.method1143(-15465);
                  boolean var115 = (128 & var114) != 0;
                  int var116 = class82.field1067 - -((var114 & 61) >> 3);
                  int var117 = (var114 & 7) + class457.field6517;
                  int var118 = var116 - -var3.method1162(4);
                  int var119 = var3.method1162(4) + var117;
                  int var120 = var3.method1187((byte)-97);
                  int var121 = var3.method1211(-26166);
                  int var122 = 4 * var3.method1143(-15465);
                  int var123 = 4 * var3.method1143(-15465);
                  int var124 = var3.method1211(-26166);
                  int var125 = var3.method1211(-26166);
                  int var126 = var3.method1143(-15465);
                  if (var126 == 255) {
                     var126 = -1;
                  }

                  int var127 = var3.method1211(-26166);
                  if (var116 >= 0 && var117 >= 0 && class644.field9403 > var116 && ~class337.field4594 < ~var117 && ~var118 <= -1 && var119 >= 0 && ~class644.field9403 < ~var118 && var119 < class337.field4594 && var121 != 65535) {
                     int var128 = var127 << 2;
                     int var129 = var117 * 512 + 256;
                     int var130 = var118 * 512 + 256;
                     int var131 = var123 << 2;
                     int var132 = var116 * 512 - -256;
                     int var133 = var119 * 512 + 256;
                     int var134 = var122 << 2;
                     class308 var135 = new class308(var121, class611.field8967, class611.field8967, var132, var129, var134, var124 - -class96.field1234, class96.field1234 + var125, var126, var128, 0, var120, var131, var115, -1);
                     var135.method2290(var130, class96.field1234 + var124, -15473, -var131 + class102.method851(class611.field8967, (byte)127, var130, var133), var133);
                     class552.field7922.method2930((byte)-58, new class60(var135));
                  }

               } else if (class72.field885 == arg1) {
                  int var136 = var3.method1210((byte)126);
                  int var137 = var3.method1154(true);
                  int var138 = var3.method1174((byte)-89);
                  int var139 = class457.field6517 - -(var138 & 7);
                  int var140 = class533.field7595 + var139;
                  int var141 = class82.field1067 - -((var138 & 117) >> 4);
                  int var142 = class672.field9740 + var141;
                  boolean var143 = ~var141 <= -1 && var139 >= 0 && ~var141 > ~class644.field9403 && ~var139 > ~class337.field4594;
                  if (var143 || class679.method4951(class594.field8738, -201)) {
                     class611.method4442(var140, class611.field8967, new class553(var137, var136), var142, -5663);
                     if (var143) {
                        class284.method2152(-65, class611.field8967, var141, var139);
                     }
                  }

               } else if (class111.field1393 == arg1) {
                  int var144 = var3.method1211(-26166);
                  int var145 = var3.method1143(-15465);
                  class387.field5618.method3977(var144, (byte)75).method1983(-115, var145);
               } else if (class160.field2278 == arg1) {
                  int var147;
                  int var148;
                  boolean var150;
                  int var152;
                  int var153;
                  int var154;
                  int var155;
                  int var156;
                  int var157;
                  int var158;
                  label574: {
                     int var146 = var3.method1143(-15465);
                     var147 = (var146 >> 4 & 15) + class82.field1067 * 2;
                     var148 = (var146 & 15) + class457.field6517 * 2;
                     int var149 = var3.method1143(-15465);
                     var150 = ~(var149 & 1) != -1;
                     boolean var151 = (var149 & 2) != 0;
                     var152 = !var151 ? -1 : var149 >> 2;
                     var153 = var147 - -var3.method1162(4);
                     var154 = var3.method1162(4) + var148;
                     var155 = var3.method1187((byte)-120);
                     var156 = var3.method1187((byte)-116);
                     var157 = var3.method1211(-26166);
                     var158 = var3.method1143(-15465);
                     if (var151) {
                        var158 = (byte)var158;
                        if (!var2) {
                           break label574;
                        }
                     }

                     var158 *= 4;
                  }

                  int var159 = 4 * var3.method1143(-15465);
                  int var160 = var3.method1211(-26166);
                  int var161 = var3.method1211(-26166);
                  int var162 = var3.method1143(-15465);
                  int var163 = var3.method1211(-26166);
                  if (~var162 == -256) {
                     var162 = -1;
                  }

                  if (var147 >= 0 && var148 >= 0 && var147 < class644.field9403 * 2 && ~(class644.field9403 * 2) < ~var148 && var153 >= 0 && ~var154 <= -1 && ~var153 > ~(class337.field4594 * 2) && ~(class337.field4594 * 2) < ~var154 && var157 != 65535) {
                     int var164 = var163 << 2;
                     int var165 = var154 * 256;
                     int var166 = var153 * 256;
                     int var167 = var158 << 2;
                     int var168 = var147 * 256;
                     int var169 = var148 * 256;
                     int var170 = var159 << 2;
                     if (~var155 != -1 && var152 != -1) {
                        class279 var171 = null;
                        if (~var155 <= -1) {
                           int var172 = var155 + -1;
                           class529 var173 = (class529)class328.field4479.method329((byte)-24, (long)var172);
                           if (var173 != null) {
                              var171 = var173.field7559;
                           }
                        } else {
                           int var174 = -var155 - 1;
                           if (class358.field4891 == var174) {
                              var171 = class564.field8045;
                           } else {
                              var171 = class380.field5483[var174];
                           }
                        }

                        if (var171 != null) {
                           class425 var175 = var171.method2119(false);
                           if (var175.field6101 != null && var175.field6101[var152] != null) {
                              var167 -= var175.field6101[var152][1];
                           }

                           if (var175.field6086 != null && var175.field6086[var152] != null) {
                              var167 -= var175.field6086[var152][1];
                           }
                        }
                     }

                     class308 var176 = new class308(var157, class611.field8967, class611.field8967, var168, var169, var167, class96.field1234 + var160, class96.field1234 + var161, var162, var164, var155, var156, var170, var150, var152);
                     var176.method2290(var166, var160 - -class96.field1234, -15473, -var170 + class102.method851(class611.field8967, (byte)127, var166, var165), var165);
                     class552.field7922.method2930((byte)-66, new class60(var176));
                  }

               } else {
                  class668.method4876(-110, field1704[7] + arg1, (Throwable)null);
                  class388.method2945(false, (byte)-20);
               }
            }
         }
      } catch (RuntimeException var178) {
         throw class237.method1823(var178, field1704[8] + arg0 + ',' + (arg1 != null ? field1704[5] : field1704[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IBIIIII)V"
   )
   public static final void method1052(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         ++field1701;
         int var8 = class298.method2224(arg5, class245.field3374, class699.field10237, arg1 ^ -248);
         int var9 = class298.method2224(arg2, class245.field3374, class699.field10237, -250);
         int var10 = class298.method2224(arg0, class457.field6528, class348.field4702, -250);
         int var11 = class298.method2224(arg4, class457.field6528, class348.field4702, -250);
         int var12 = class298.method2224(arg3 + arg5, class245.field3374, class699.field10237, -250);
         int var13 = class298.method2224(arg2 - arg3, class245.field3374, class699.field10237, -250);
         int var14 = var8;
         if (var7) {
            class149.method1249(-7, var10, arg6, class341.field4631[var8], var11);
            var14 = var8 + 1;
         }

         while(true) {
            byte var10000;
            int var10001;
            if (~var14 <= ~var12) {
               int var15 = var9;
               var10000 = arg1;
               var10001 = 14;
               if (!var7) {
                  if (arg1 != 14) {
                     field1702 = null;
                     if (var7) {
                        class149.method1249(-7, var10, arg6, class341.field4631[var9], var11);
                        var15 = var9 - 1;
                     }
                  }

                  while(true) {
                     while(var15 > var13) {
                        class149.method1249(-7, var10, arg6, class341.field4631[var15], var11);
                        --var15;
                     }

                     int var16 = class298.method2224(arg0 + arg3, class457.field6528, class348.field4702, -250);
                     int var17 = class298.method2224(-arg3 + arg4, class457.field6528, class348.field4702, -250);
                     int var18 = var12;
                     if (!var7) {
                        if (!var7 && var13 < var12) {
                           return;
                        }

                        do {
                           int[] var19 = class341.field4631[var18];
                           class149.method1249(arg1 + -21, var10, arg6, var19, var16);
                           class149.method1249(arg1 ^ -9, var17, arg6, var19, var11);
                           ++var18;
                        } while(var13 >= var18);

                        return;
                     }

                     --var15;
                  }
               }
            } else {
               var10000 = -7;
               var10001 = var10;
            }

            class149.method1249(var10000, var10001, arg6, class341.field4631[var14], var11);
            ++var14;
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field1704[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "([BZB)Ljava/lang/Object;"
   )
   public static final Object method1053(byte[] arg0, boolean arg1, byte arg2) {
      try {
         ++field1703;
         if (arg0 == null) {
            return null;
         } else {
            if (arg0.length > 136 && !class679.field10015) {
               try {
                  class361 var3 = (class361)Class.forName(field1704[4]).newInstance();
                  var3.method2311(402, arg0);
                  return var3;
               } catch (Throwable var5) {
                  class679.field10015 = true;
               }
            }

            if (arg2 != 92) {
               return null;
            } else {
               return arg1 ? class677.method4926(arg0, 100) : arg0;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1704[6] + (arg0 != null ? field1704[5] : field1704[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(I)J"
   )
   public static final synchronized long method1054(int arg0) {
      try {
         ++field1699;
         if (arg0 != -29025) {
            field1702 = null;
         }

         long var1 = System.currentTimeMillis();
         if (class41.field571 > var1) {
            class240.field3350 += -var1 + class41.field571;
         }

         class41.field571 = var1;
         return class240.field3350 + var1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1704[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1055(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1056(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
