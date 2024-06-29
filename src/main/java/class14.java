import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 {
   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field191 = new String[]{method112(method111("sO\u001bQo")), method112(method111("J\u001d\u00159g")), method112(method111("\\R\u0015R2")), method112(method111("I\tW\u0010")), method112(method111("J\u001d\u0015>g")), method112(method111("J\u001d\u00158g")), method112(method111("J\u001d\u0015?g")), method112(method111("J\u001d\u0015=g"))};
   @OriginalMember(
      owner = "client!ma",
      name = "t",
      descriptor = "I"
   )
   public static int field170 = 1;
   @OriginalMember(
      owner = "client!ma",
      name = "q",
      descriptor = "Ltp;"
   )
   public static class563 field181 = new class563(0, 0);
   @OriginalMember(
      owner = "client!ma",
      name = "m",
      descriptor = "I"
   )
   public static int field190 = 100;
   @OriginalMember(
      owner = "client!ma",
      name = "e",
      descriptor = "I"
   )
   public int field171;
   @OriginalMember(
      owner = "client!ma",
      name = "o",
      descriptor = "I"
   )
   public static int field172;
   @OriginalMember(
      owner = "client!ma",
      name = "r",
      descriptor = "I"
   )
   public int field173;
   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "I"
   )
   public static int field174;
   @OriginalMember(
      owner = "client!ma",
      name = "j",
      descriptor = "I"
   )
   public int field175;
   @OriginalMember(
      owner = "client!ma",
      name = "f",
      descriptor = "I"
   )
   public int field176;
   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "I"
   )
   public int field177;
   @OriginalMember(
      owner = "client!ma",
      name = "u",
      descriptor = "I"
   )
   public int field178;
   @OriginalMember(
      owner = "client!ma",
      name = "g",
      descriptor = "I"
   )
   public static int field179;
   @OriginalMember(
      owner = "client!ma",
      name = "h",
      descriptor = "I"
   )
   public int field180;
   @OriginalMember(
      owner = "client!ma",
      name = "p",
      descriptor = "I"
   )
   public int field182;
   @OriginalMember(
      owner = "client!ma",
      name = "l",
      descriptor = "I"
   )
   public int field183;
   @OriginalMember(
      owner = "client!ma",
      name = "d",
      descriptor = "I"
   )
   public static int field184;
   @OriginalMember(
      owner = "client!ma",
      name = "n",
      descriptor = "I"
   )
   public int field186;
   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "I"
   )
   public int field187;
   @OriginalMember(
      owner = "client!ma",
      name = "i",
      descriptor = "I"
   )
   public int field188;
   @OriginalMember(
      owner = "client!ma",
      name = "k",
      descriptor = "Lqh;"
   )
   public static class74 field185;
   @OriginalMember(
      owner = "client!ma",
      name = "s",
      descriptor = "Lbo;"
   )
   public static class763 field189;

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(ZLo;)V"
   )
   public static final void method106(boolean arg0, class31 arg1) {
      boolean var2 = client.field4273;

      try {
         ++field174;
         class206 var3 = class605.field8474.field2788;
         int var10000;
         if (class386.field5415 == arg1) {
            int var4 = var3.method4288((byte)112);
            int var5 = class484.field6677 - -(var4 & 7);
            int var6 = class17.field237 + var5;
            int var7 = (7 & var4 >> 4) + class690.field10089;
            int var8 = class752.field10921 + var7;
            int var9 = var3.method4280(-19104);
            int var10 = var3.method4280(-19104);
            int var11 = var3.method4280(-19104);
            if (class2.field7 != null) {
               class480 var12 = (class480)class2.field7.method1839(-119, (long)(var8 | class384.field5397 << 28 | var6 << 14));
               if (var12 != null) {
                  int var10001;
                  label418: {
                     class666 var13 = (class666)var12.field6636.method3855(-98);
                     if (var2) {
                        var10000 = 32767 & var9;
                        var10001 = var13.field9471;
                     } else if (var13 == null) {
                        var10000 = ~var7;
                        var10001 = -1;
                        if (!var2) {
                           break label418;
                        }
                     } else {
                        var10000 = 32767 & var9;
                        var10001 = var13.field9471;
                     }

                     label417:
                     do {
                        while(true) {
                           if (var10000 == var10001) {
                              if (~var13.field9472 == ~var10) {
                                 var13.method3609(103);
                                 var13.field9472 = var11;
                                 class635.method4610(true, var6, class384.field5397, var8, var13);
                                 if (!var2) {
                                    var10000 = ~var7;
                                    var10001 = -1;
                                    break;
                                 }

                                 var13 = (class666)var12.field6636.method3866((byte)119);
                              } else {
                                 var13 = (class666)var12.field6636.method3866((byte)119);
                              }
                           } else {
                              var13 = (class666)var12.field6636.method3866((byte)119);
                           }

                           if (var13 == null) {
                              var10000 = ~var7;
                              var10001 = -1;
                              if (!var2) {
                                 break label417;
                              }
                           } else {
                              var10000 = 32767 & var9;
                              var10001 = var13.field9471;
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 <= var10001 && var5 >= 0 && var7 < class507.field7030 && ~var5 > ~class215.field2667) {
                     class792.method5709(var5, class384.field5397, (byte)-30, var7);
                  }
               }
            }

         } else if (class535.field7316 == arg1) {
            int var14 = var3.method4275(-110);
            int var15 = var3.method4310(2);
            int var16 = var3.method4336((byte)127);
            int var17 = class484.field6677 - -(7 & var16);
            int var18 = class17.field237 + var17;
            int var19 = (var16 >> 4 & 7) + class690.field10089;
            int var20 = class752.field10921 + var19;
            int var21 = var3.method4280(-19104);
            if (class602.field8397 != var21) {
               boolean var22 = ~var19 <= -1 && ~var17 <= -1 && class507.field7030 > var19 && var17 < class215.field2667;
               if (var22 || class715.method5204(class677.field9944, arg0)) {
                  class635.method4610(arg0, var18, class384.field5397, var20, new class666(var14, var15));
                  if (var22) {
                     class792.method5709(var17, class384.field5397, (byte)-30, var19);
                  }
               }
            }

         } else if (class656.field9174 == arg1) {
            int var23 = var3.method4288((byte)124);
            boolean var24 = (128 & var23) != 0;
            int var25 = (var23 >> 3 & 7) + class690.field10089;
            int var26 = class484.field6677 - -(var23 & 7);
            int var27 = var3.method4340(409855200) + var25;
            int var28 = var26 - -var3.method4340(409855200);
            int var29 = var3.method4333(-70);
            int var30 = var3.method4280(-19104);
            int var31 = 4 * var3.method4288((byte)67);
            int var32 = var3.method4288((byte)87) * 4;
            int var33 = var3.method4280(-19104);
            int var34 = var3.method4280(-19104);
            int var35 = var3.method4288((byte)112);
            if (var35 == 255) {
               var35 = -1;
            }

            int var36 = var3.method4280(-19104);
            if (~var25 <= -1 && ~var26 <= -1 && class507.field7030 > var25 && class215.field2667 > var26 && ~var27 <= -1 && var28 >= 0 && var27 < class507.field7030 && ~class215.field2667 < ~var28 && var30 != 65535) {
               int var37 = var36 << 2;
               int var38 = var26 * 512 + 256;
               int var39 = var31 << 2;
               int var40 = var28 * 512 + 256;
               int var41 = var25 * 512 + 256;
               int var42 = var32 << 2;
               int var43 = var27 * 512 + 256;
               class163 var44 = new class163(var30, class384.field5397, class384.field5397, var41, var38, var39, class369.field5205 + var33, class369.field5205 + var34, var35, var37, 0, var29, var42, var24, -1);
               var44.method1299(var40, var43, 50560, class369.field5205 + var33, class687.method5016(var43, class384.field5397, var40, 2) + -var42);
               class167.field2109.method3859(2, new class575(var44));
            }

         } else if (class507.field7032 == arg1) {
            int var45 = var3.method4336((byte)-53);
            int var46 = var45 >> 2;
            int var47 = 3 & var45;
            int var48 = class318.field4241[var46];
            int var49 = var3.method4288((byte)62);
            int var50 = (7 & var49 >> 4) + class690.field10089;
            int var51 = (var49 & 7) + class484.field6677;
            int var52 = var3.method4310(2);
            if (class715.method5204(class677.field9944, true) || var50 >= 0 && var51 >= 0 && ~var50 > ~class507.field7030 && ~var51 > ~class215.field2667) {
               class144.method1216(var52, var47, -1, class384.field5397, var48, var46, var50, var51);
            }

         } else if (class413.field5801 == arg1) {
            var3.method4288((byte)70);
            int var53 = var3.method4288((byte)107);
            int var54 = (var53 >> 4 & 7) + class690.field10089;
            int var55 = (7 & var53) + class484.field6677;
            int var56 = var3.method4280(-19104);
            int var57 = var3.method4288((byte)127);
            int var58 = var3.method4293(59);
            String var59 = var3.method4291(-87);
            class614.method4463(var55, var58, var57, class384.field5397, var54, var56, var59, (byte)18);
         } else if (class795.field11615 == arg1) {
            int var60 = var3.method4280(-19104);
            class774 var61 = class472.field6533.method3586(64, var60);
            int var62 = var3.method4336((byte)-99);
            int var63 = ((var62 & 123) >> 4) + class690.field10089;
            int var64 = (var62 & 7) + class484.field6677;
            int var65 = var3.method4286(128);
            int var66 = var3.method4286(128);
            int var67 = var66 >> 2;
            int var68 = class318.field4241[var67];
            if (var67 == 11) {
               var67 = 10;
            }

            int var69 = 0;
            if (var61.field11219 != null) {
               label511: {
                  int var70 = -1;
                  int var71 = 0;
                  if (var2) {
                     var10000 = var61.field11219[var71];
                  } else if (~var71 <= ~var61.field11219.length) {
                     var10000 = var61.field11198[var70].length;
                     if (!var2) {
                        break label511;
                     }
                  } else {
                     var10000 = var61.field11219[var71];
                  }

                  label510:
                  do {
                     while(true) {
                        if (var10000 == var67) {
                           var70 = var71;
                           if (!var2) {
                              var10000 = var61.field11198[var71].length;
                              break;
                           }

                           ++var71;
                        } else {
                           ++var71;
                        }

                        if (~var71 <= ~var61.field11219.length) {
                           var10000 = var61.field11198[var70].length;
                           if (!var2) {
                              break label510;
                           }
                        } else {
                           var10000 = var61.field11219[var71];
                        }
                     }
                  } while(var2);
               }

               var69 = var10000;
            }

            int var72 = 0;
            if (var61.field11179 != null) {
               var72 = var61.field11179.length;
            }

            int var73 = 0;
            if (var61.field11222 != null) {
               var73 = var61.field11222.length;
            }

            if ((1 & var65) == 1) {
               class74.method737(var63, var68, (class87)null, var64, class384.field5397, 8933);
            } else {
               int[] var74 = null;
               if (~(var65 & 2) == -3) {
                  var74 = new int[var69];
                  int var75 = 0;
                  if (var2) {
                     var74[var75] = var3.method4280(-19104);
                     ++var75;
                  }

                  while(~var69 < ~var75) {
                     var74[var75] = var3.method4280(-19104);
                     ++var75;
                  }
               }

               short[] var76 = null;
               if (~(4 & var65) == -5) {
                  var76 = new short[var72];
                  int var77 = 0;
                  if (var2 || var77 < var72) {
                     do {
                        var76[var77] = (short)var3.method4280(-19104);
                        ++var77;
                     } while(var77 < var72);
                  }
               }

               short[] var78 = null;
               if ((8 & var65) == 8) {
                  var78 = new short[var73];
                  int var79 = 0;
                  if (var2 || ~var73 < ~var79) {
                     do {
                        var78[var79] = (short)var3.method4280(-19104);
                        ++var79;
                     } while(~var73 < ~var79);
                  }
               }

               class74.method737(var63, var68, new class87((long)(class210.field2617++), var74, var76, var78), var64, class384.field5397, 8933);
            }
         } else {
            if (!arg0) {
               method106(false, (class31)null);
            }

            if (class70.field873 == arg1) {
               int var80 = var3.method4288((byte)59);
               int var81 = (var80 >> 4 & 7) + class690.field10089;
               int var82 = class484.field6677 - -(var80 & 7);
               int var83 = var3.method4280(-19104);
               if (var83 == 65535) {
                  var83 = -1;
               }

               int var84 = var3.method4288((byte)119);
               int var85 = (240 & var84) >> 4;
               int var86 = 7 & var84;
               int var87 = var3.method4288((byte)59);
               int var88 = var3.method4288((byte)120);
               int var89 = var3.method4280(-19104);
               if (var81 >= 0 && var82 >= 0 && var81 < class507.field7030 && ~var82 > ~class215.field2667) {
                  int var90 = var85 + 1;
                  if (class278.field3709.field7853[0] >= -var90 + var81 && var81 + var90 >= class278.field3709.field7853[0] && ~class278.field3709.field7855[0] <= ~(-var90 + var82) && ~class278.field3709.field7855[0] >= ~(var82 + var90)) {
                     class352.method2768(var87, var89, var83, (var81 << 16) + ((class384.field5397 << 24) + (var82 << 8) - -var85), var88, (byte)-100, var86);
                  }
               }

            } else if (class212.field2636 == arg1) {
               int var91 = var3.method4336((byte)109);
               int var92 = var91 >> 2;
               int var93 = var91 & 3;
               int var94 = class318.field4241[var92];
               int var95 = var3.method4292(109);
               int var96 = class690.field10089 - -(7 & var95 >> 4);
               int var97 = (var95 & 7) + class484.field6677;
               if (class715.method5204(class677.field9944, true) || var96 >= 0 && ~var97 <= -1 && class507.field7030 > var96 && class215.field2667 > var97) {
                  class144.method1216(-1, var93, -1, class384.field5397, var94, var92, var96, var97);
               }

            } else if (class404.field5693 == arg1) {
               int var98 = var3.method4288((byte)71);
               int var99 = (7 & var98 >> 4) + class690.field10089;
               int var100 = (var98 & 7) + class484.field6677;
               int var101 = var3.method4288((byte)111);
               int var102 = var101 >> 2;
               int var103 = var101 & 3;
               int var104 = class318.field4241[var102];
               int var105 = var3.method4275(-78);
               if (~var105 == -65536) {
                  var105 = -1;
               }

               class243.method1819(var103, var105, var102, var104, var100, var99, -101, class384.field5397);
            } else if (class698.field10187 == arg1) {
               int var106 = var3.method4310(2);
               int var107 = var3.method4292(121);
               int var108 = (7 & var107) + class484.field6677;
               int var109 = class17.field237 + var108;
               int var110 = class690.field10089 - -(7 & var107 >> 4);
               int var111 = class752.field10921 - -var110;
               int var112 = var3.method4310(2);
               boolean var113 = var110 >= 0 && var108 >= 0 && ~var110 > ~class507.field7030 && class215.field2667 > var108;
               if (var113 || class715.method5204(class677.field9944, true)) {
                  class635.method4610(true, var109, class384.field5397, var111, new class666(var112, var106));
                  if (var113) {
                     class792.method5709(var108, class384.field5397, (byte)-30, var110);
                  }
               }

            } else if (class247.field3105 == arg1) {
               int var114 = var3.method4280(-19104);
               int var115 = var3.method4288((byte)98);
               class472.field6533.method3586(64, var114).method5546((byte)-124, var115);
            } else if (class221.field2759 == arg1) {
               int var116 = var3.method4288((byte)74);
               int var117 = (var116 >> 4 & 7) + class690.field10089;
               int var118 = class484.field6677 - -(7 & var116);
               int var119 = var3.method4280(-19104);
               if (var119 == 65535) {
                  var119 = -1;
               }

               int var120 = var3.method4288((byte)72);
               int var121 = 15 & var120 >> 4;
               int var122 = 7 & var120;
               int var123 = var3.method4288((byte)79);
               int var124 = var3.method4288((byte)81);
               int var125 = var3.method4280(-19104);
               if (~var117 <= -1 && ~var118 <= -1 && ~var117 > ~class507.field7030 && ~class215.field2667 < ~var118) {
                  int var126 = var121 + 1;
                  if (~(-var126 + var117) >= ~class278.field3709.field7853[0] && var117 + var126 >= class278.field3709.field7853[0] && var118 - var126 <= class278.field3709.field7855[0] && ~class278.field3709.field7855[0] >= ~(var118 - -var126)) {
                     class313.method2357((var118 << 8) + (class384.field5397 << 24) + (var117 << 16) - -var121, false, var125, 100, var124, var122, var119, var123);
                  }
               }

            } else if (class750.field10915 == arg1) {
               int var127 = var3.method4288((byte)89);
               int var128 = class690.field10089 - -((117 & var127) >> 4);
               int var129 = (var127 & 7) + class484.field6677;
               int var130 = var3.method4280(-19104);
               int var131 = var3.method4288((byte)94);
               int var132 = var3.method4280(-19104);
               int var133 = var3.method4288((byte)62);
               if (var128 >= 0 && var129 >= 0 && var128 < class507.field7030 && class215.field2667 > var129) {
                  int var134 = var128 * 512 - -256;
                  int var135 = var129 * 512 + 256;
                  int var136 = class384.field5397;
                  if (var136 < 3 && class407.method3090(var128, 1, var129)) {
                     ++var136;
                  }

                  class430 var137 = new class430(var130, var132, class369.field5205, class384.field5397, var136, var134, -var131 + class687.method5016(var134, class384.field5397, var135, 2), var135, var128, var128, var129, var129, var133);
                  class532.field7281.method3859(2, new class424(var137));
               }

            } else if (class226.field2840 == arg1) {
               int var138 = var3.method4292(111);
               int var139 = (var138 & 7) + class484.field6677;
               int var140 = class17.field237 + var139;
               int var141 = class690.field10089 - -((119 & var138) >> 4);
               int var142 = class752.field10921 + var141;
               int var143 = var3.method4310(2);
               class480 var144 = (class480)class2.field7.method1839(-11, (long)(var142 | class384.field5397 << 28 | var140 << 14));
               if (var144 != null) {
                  label568: {
                     class666 var145 = (class666)var144.field6636.method3855(125);
                     if (var2) {
                        var10000 = ~(var143 & 32767);
                     } else if (var145 == null) {
                        var10000 = var144.field6636.method3858((byte)-63);
                        if (!var2) {
                           break label568;
                        }
                     } else {
                        var10000 = ~(var143 & 32767);
                     }

                     label567:
                     do {
                        while(true) {
                           if (var10000 == ~var145.field9471) {
                              var145.method3609(112);
                              if (!var2) {
                                 var10000 = var144.field6636.method3858((byte)-63);
                                 break;
                              }

                              var145 = (class666)var144.field6636.method3866((byte)111);
                           } else {
                              var145 = (class666)var144.field6636.method3866((byte)111);
                           }

                           if (var145 == null) {
                              var10000 = var144.field6636.method3858((byte)-63);
                              if (!var2) {
                                 break label567;
                              }
                           } else {
                              var10000 = ~(var143 & 32767);
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 != 0) {
                     var144.method3609(124);
                  }

                  if (~var141 <= -1 && var139 >= 0 && ~class507.field7030 < ~var141 && var139 < class215.field2667) {
                     class792.method5709(var139, class384.field5397, (byte)-30, var141);
                  }
               }

            } else if (class37.field437 == arg1) {
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
               label577: {
                  int var146 = var3.method4288((byte)75);
                  var147 = class690.field10089 * 2 - -((241 & var146) >> 4);
                  var148 = (var146 & 15) + class484.field6677 * 2;
                  int var149 = var3.method4288((byte)104);
                  var150 = (var149 & 1) != 0;
                  boolean var151 = (2 & var149) != 0;
                  var152 = !var151 ? -1 : var149 >> 2;
                  var153 = var147 - -var3.method4340(409855200);
                  var154 = var3.method4340(409855200) + var148;
                  var155 = var3.method4333(-107);
                  var156 = var3.method4333(-122);
                  var157 = var3.method4280(-19104);
                  var158 = var3.method4288((byte)74);
                  if (!var151) {
                     var158 *= 4;
                     if (!var2) {
                        break label577;
                     }
                  }

                  var158 = (byte)var158;
               }

               int var159 = var3.method4288((byte)116) * 4;
               int var160 = var3.method4280(-19104);
               int var161 = var3.method4280(-19104);
               int var162 = var3.method4288((byte)102);
               int var163 = var3.method4280(-19104);
               if (var162 == 255) {
                  var162 = -1;
               }

               if (~var147 <= -1 && var148 >= 0 && var147 < class507.field7030 * 2 && class507.field7030 * 2 > var148 && var153 >= 0 && var154 >= 0 && class215.field2667 * 2 > var153 && var154 < class215.field2667 * 2 && ~var157 != -65536) {
                  int var164 = var158 << 2;
                  int var165 = var153 * 256;
                  int var166 = var147 * 256;
                  int var167 = var154 * 256;
                  int var168 = var163 << 2;
                  int var169 = var159 << 2;
                  int var170 = var148 * 256;
                  if (~var155 != -1 && ~var152 != 0) {
                     class569 var171 = null;
                     if (~var155 > -1) {
                        int var172 = -var155 + -1;
                        if (~class602.field8397 == ~var172) {
                           var171 = class278.field3709;
                        } else {
                           var171 = class136.field1773[var172];
                        }
                     } else {
                        int var173 = var155 + -1;
                        class243 var174 = (class243)class335.field4808.method1839(55, (long)var173);
                        if (var174 != null) {
                           var171 = var174.field3043;
                        }
                     }

                     if (var171 != null) {
                        class120 var175 = var171.method4086((byte)-123);
                        if (var175.field1480 != null && var175.field1480[var152] != null) {
                           var164 -= var175.field1480[var152][1];
                        }

                        if (var175.field1506 != null && var175.field1506[var152] != null) {
                           var164 -= var175.field1506[var152][1];
                        }
                     }
                  }

                  class163 var176 = new class163(var157, class384.field5397, class384.field5397, var166, var170, var164, class369.field5205 + var160, var161 - -class369.field5205, var162, var168, var155, var156, var169, var150, var152);
                  var176.method1299(var167, var165, 50560, class369.field5205 + var160, -var169 + class687.method5016(var165, class384.field5397, var167, 2));
                  class167.field2109.method3859(2, new class575(var176));
               }

            } else {
               class106.method940(field191[0] + arg1, (Throwable)null, (byte)-33);
               class316.method2373(false, 116);
            }
         }
      } catch (RuntimeException var178) {
         throw class534.method3846(var178, field191[1] + arg0 + ',' + (arg1 != null ? field191[2] : field191[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method107(byte arg0, int arg1) {
      try {
         if (arg0 >= 111) {
            ++field184;
            class446 var2 = class635.method4607(117, (long)arg1, 5);
            var2.method3312(-127);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field191[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method108(byte arg0) {
      try {
         field181 = null;
         if (arg0 != -96) {
            field185 = null;
         }

         field189 = null;
         field185 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field191[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(ILma;)Z"
   )
   public final boolean method109(int arg0, class14 arg1) {
      try {
         ++field172;
         if (arg0 != 3) {
            method107((byte)48, -114);
         }

         return this.field188 == arg1.field188 && this.field173 == arg1.field173 && this.field177 == arg1.field177;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field191[5] + arg0 + ',' + (arg1 != null ? field191[2] : field191[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(ZLjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method110(boolean arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field179;
         if (arg1 == null) {
            return null;
         } else {
            int var3;
            int var4;
            int var10000;
            label119: {
               var3 = 0;
               var4 = arg1.length();
               if (var2) {
                  ++var3;
               }

               label111:
               while(true) {
                  if (~var3 > ~var4) {
                     var10000 = class362.method2815(arg1.charAt(var3), -111);
                     if (!var2) {
                        if (var10000 != 0) {
                           ++var3;
                           continue;
                        }

                        if (var2) {
                           --var4;
                        }

                        var10000 = var3;
                     }
                  } else {
                     var10000 = var3;
                  }

                  while(true) {
                     if (var10000 >= var4) {
                        break label111;
                     }

                     var10000 = class362.method2815(arg1.charAt(var4 + -1), -93);
                     if (var2) {
                        break label119;
                     }

                     if (var10000 == 0) {
                        break label111;
                     }

                     --var4;
                     var10000 = var3;
                  }
               }

               var10000 = -var3 + var4;
            }

            int var5 = var10000;
            if (~var5 <= -2 && ~var5 >= -13) {
               StringBuffer var6 = new StringBuffer(var5);
               if (!arg0) {
                  method108((byte)-70);
               }

               int var7 = var3;
               char var9;
               if (var2) {
                  char var8 = arg1.charAt(var3);
                  if (class463.method3398(var8, (byte)-100)) {
                     var9 = class73.method704(var8, 202);
                     if (~var9 != -1) {
                        var6.append(var9);
                     }
                  }

                  var7 = var3 + 1;
               }

               while(true) {
                  if (var7 >= var4) {
                     var10000 = ~var6.length();
                     if (!var2) {
                        if (var10000 == -1) {
                           return null;
                        }

                        return var6.toString();
                     }
                  } else {
                     var10000 = arg1.charAt(var7);
                  }

                  int var12 = var10000;
                  if (class463.method3398((char)var12, (byte)-100)) {
                     var9 = class73.method704((char)var12, 202);
                     if (~var9 != -1) {
                        var6.append(var9);
                     }
                  }

                  ++var7;
               }
            } else {
               return null;
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field191[6] + arg0 + ',' + (arg1 != null ? field191[2] : field191[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method111(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method112(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
