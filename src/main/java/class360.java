import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class360 extends class247 {
   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "Z"
   )
   private boolean field5326 = true;
   @OriginalMember(
      owner = "client!hka",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field5322 = null;
   @OriginalMember(
      owner = "client!hka",
      name = "p",
      descriptor = "I"
   )
   public int field5329 = 0;
   @OriginalMember(
      owner = "client!hka",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5330 = new String[]{method2835(method2834("C~\u0005\u001eB\u0003")), method2835(method2834("C~\u0005\u001eJ\u0003")), method2835(method2834("P;J\u001ev")), method2835(method2834("E`\b\\")), method2835(method2834("C~\u0005\u001eM\u0003")), method2835(method2834("C~\u0005\u001eN\u0003")), method2835(method2834("\u007f&D\u001d+")), method2835(method2834("C~\u0005\u001eL\u0003")), method2835(method2834("C~\u0005\u001e7B{\rD5\u0003")), method2835(method2834("C~\u0005\u001eI\u0003")), method2835(method2834("C~\u0005\u001eH\u0003")), method2835(method2834("C~\u0005\u001eO\u0003")), method2835(method2834("C~\u0005\u001eC\u0003"))};
   @OriginalMember(
      owner = "client!hka",
      name = "j",
      descriptor = "I"
   )
   public static int field5325 = 4;
   @OriginalMember(
      owner = "client!hka",
      name = "A",
      descriptor = "B"
   )
   public byte field5312;
   @OriginalMember(
      owner = "client!hka",
      name = "s",
      descriptor = "B"
   )
   public byte field5316;
   @OriginalMember(
      owner = "client!hka",
      name = "l",
      descriptor = "I"
   )
   public static int field5314;
   @OriginalMember(
      owner = "client!hka",
      name = "r",
      descriptor = "I"
   )
   public static int field5315;
   @OriginalMember(
      owner = "client!hka",
      name = "n",
      descriptor = "I"
   )
   public static int field5318;
   @OriginalMember(
      owner = "client!hka",
      name = "o",
      descriptor = "I"
   )
   public static int field5319;
   @OriginalMember(
      owner = "client!hka",
      name = "y",
      descriptor = "I"
   )
   public static int field5320;
   @OriginalMember(
      owner = "client!hka",
      name = "B",
      descriptor = "I"
   )
   public static int field5321;
   @OriginalMember(
      owner = "client!hka",
      name = "w",
      descriptor = "I"
   )
   public static int field5324;
   @OriginalMember(
      owner = "client!hka",
      name = "k",
      descriptor = "I"
   )
   public static int field5327;
   @OriginalMember(
      owner = "client!hka",
      name = "q",
      descriptor = "I"
   )
   public static int field5328;
   @OriginalMember(
      owner = "client!hka",
      name = "t",
      descriptor = "J"
   )
   public long field5313;
   @OriginalMember(
      owner = "client!hka",
      name = "v",
      descriptor = "Z"
   )
   private boolean field5323;
   @OriginalMember(
      owner = "client!hka",
      name = "u",
      descriptor = "[I"
   )
   private int[] field5317;
   @OriginalMember(
      owner = "client!hka",
      name = "x",
      descriptor = "[Lqd;"
   )
   public class622[] field5311;

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(Ldb;Z)V"
   )
   public static final void method2825(class685 arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         ++field5318;
         class408 var3 = class745.field10605.field3719;
         int var10000;
         if (class28.field410 == arg0) {
            int var4 = var3.method665(arg1);
            int var5 = (var4 & 7) + class283.field4265;
            int var6 = class480.field6903 + var5;
            int var7 = ((var4 & 127) >> 4) + class172.field2577;
            int var8 = class115.field1824 + var7;
            int var9 = var3.method685(-2);
            int var10 = var3.method685(-2);
            int var11 = var3.method685(-2);
            if (class216.field3081 != null) {
               class279 var12 = (class279)class216.field3081.method3101(-1, (long)(var8 | var6 << 14 | class499.field7097 << 28));
               if (var12 != null) {
                  int var10001;
                  label420: {
                     class311 var13 = (class311)var12.field4227.method2245((byte)-94);
                     if (var2) {
                        var10000 = var13.field4666;
                        var10001 = 32767 & var9;
                     } else if (var13 == null) {
                        var10000 = ~var7;
                        var10001 = -1;
                        if (!var2) {
                           break label420;
                        }
                     } else {
                        var10000 = var13.field4666;
                        var10001 = 32767 & var9;
                     }

                     label419:
                     do {
                        while(true) {
                           if (var10000 == var10001) {
                              if (var13.field4669 == var10) {
                                 var13.method2140((byte)81);
                                 var13.field4669 = var11;
                                 class417.method3257(var8, var6, var13, 495324654, class499.field7097);
                                 if (!var2) {
                                    var10000 = ~var7;
                                    var10001 = -1;
                                    break;
                                 }

                                 var13 = (class311)var12.field4227.method2239((byte)100);
                              } else {
                                 var13 = (class311)var12.field4227.method2239((byte)100);
                              }
                           } else {
                              var13 = (class311)var12.field4227.method2239((byte)100);
                           }

                           if (var13 == null) {
                              var10000 = ~var7;
                              var10001 = -1;
                              if (!var2) {
                                 break label419;
                              }
                           } else {
                              var10000 = var13.field4666;
                              var10001 = 32767 & var9;
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 <= var10001 && var5 >= 0 && ~var7 > ~class234.field3626 && class209.field2989 > var5) {
                     class367.method2894(var5, var7, 5193, class499.field7097);
                  }
               }
            }

         } else if (class637.field9012 == arg0) {
            int var15;
            int var16;
            boolean var18;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            label429: {
               int var14 = var3.method665(false);
               var15 = (var14 >> 4 & 15) + class172.field2577 * 2;
               var16 = (var14 & 15) + class283.field4265 * 2;
               int var17 = var3.method665(false);
               var18 = ~(1 & var17) != -1;
               boolean var19 = (var17 & 2) != 0;
               var20 = !var19 ? -1 : var17 >> 2;
               var21 = var3.method638(true) + var15;
               var22 = var3.method638(!arg1) + var16;
               var23 = var3.method655((byte)45);
               var24 = var3.method655((byte)108);
               var25 = var3.method685(-2);
               var26 = var3.method665(false);
               if (var19) {
                  var26 = (byte)var26;
                  if (!var2) {
                     break label429;
                  }
               }

               var26 *= 4;
            }

            int var27 = 4 * var3.method665(false);
            int var28 = var3.method685(-2);
            int var29 = var3.method685(-2);
            int var30 = var3.method665(false);
            int var31 = var3.method685(-2);
            if (var30 == 255) {
               var30 = -1;
            }

            if (var15 >= 0 && var16 >= 0 && var15 < class234.field3626 * 2 && var16 < class234.field3626 * 2 && ~var21 <= -1 && ~var22 <= -1 && ~(class209.field2989 * 2) < ~var21 && ~(class209.field2989 * 2) < ~var22 && ~var25 != -65536) {
               int var32 = var27 << 2;
               int var33 = var22 * 256;
               int var34 = var31 << 2;
               int var35 = var21 * 256;
               int var36 = var15 * 256;
               int var37 = var16 * 256;
               int var38 = var26 << 2;
               if (var23 != 0 && var20 != -1) {
                  class395 var39 = null;
                  if (var23 >= 0) {
                     int var40 = var23 - 1;
                     class432 var41 = (class432)class573.field8110.method3101(-1, (long)var40);
                     if (var41 != null) {
                        var39 = var41.field6345;
                     }
                  } else {
                     int var42 = -var23 + -1;
                     if (class394.field5731 == var42) {
                        var39 = class117.field1849;
                     } else {
                        var39 = class501.field7137[var42];
                     }
                  }

                  if (var39 != null) {
                     class299 var43 = var39.method3068(-89);
                     if (var43.field4446 != null && var43.field4446[var20] != null) {
                        var38 -= var43.field4446[var20][1];
                     }

                     if (var43.field4426 != null && var43.field4426[var20] != null) {
                        var38 -= var43.field4426[var20][1];
                     }
                  }
               }

               class394 var44 = new class394(var25, class499.field7097, class499.field7097, var36, var37, var38, class51.field770 + var28, class51.field770 + var29, var30, var34, var23, var24, var32, var18, var20);
               var44.method3057(class478.method3658(class499.field7097, var35, var33, (byte)-20) - var32, var35, var28 - -class51.field770, 1, var33);
               class80.field1259.method2238(new class31(var44), 13);
            }

         } else if (class61.field871 == arg0) {
            int var45 = var3.method685(-2);
            int var46 = var3.method665(false);
            class549.field7834.method3850(3917, var45).method4072((byte)-17, var46);
         } else if (class316.field4723 == arg0) {
            int var47 = var3.method665(false);
            int var48 = ((125 & var47) >> 4) + class172.field2577;
            int var49 = (7 & var47) + class283.field4265;
            int var50 = var3.method685(-2);
            if (var50 == 65535) {
               var50 = -1;
            }

            int var51 = var3.method665(false);
            int var52 = (var51 & 252) >> 4;
            int var53 = 7 & var51;
            int var54 = var3.method665(false);
            int var55 = var3.method665(arg1);
            int var56 = var3.method685(-2);
            if (var48 >= 0 && ~var49 <= -1 && ~var48 > ~class234.field3626 && ~class209.field2989 < ~var49) {
               int var57 = var52 + 1;
               if (~(-var57 + var48) >= ~class117.field1849.field5861[0] && ~(var48 + var57) <= ~class117.field1849.field5861[0] && ~(-var57 + var49) >= ~class117.field1849.field5865[0] && class117.field1849.field5865[0] <= var49 + var57) {
                  class210.method1817(var56, var50, var54, var53, true, (class499.field7097 << 24) - (-(var48 << 16) + -(var49 << 8)) + var52, var55);
               }
            }

         } else if (class666.field9371 == arg0) {
            int var58 = var3.method688(-19476);
            int var59 = var58 >> 2;
            int var60 = class209.field2980[var59];
            int var61 = var3.method688(-19476);
            int var62 = (7 & var61 >> 4) + class172.field2577;
            int var63 = class283.field4265 - -(var61 & 7);
            int var64 = var3.method693((byte)114);
            int var65 = var3.method697(2);
            if (~var59 == -12) {
               var59 = 10;
            }

            class544 var66 = class549.field7834.method3850(3917, var65);
            int var67 = 0;
            if (var66.field7669 != null) {
               label498: {
                  int var68 = -1;
                  int var69 = 0;
                  if (var2) {
                     var10000 = var66.field7669[var69];
                  } else if (~var66.field7669.length >= ~var69) {
                     var10000 = var66.field7719[var68].length;
                     if (!var2) {
                        break label498;
                     }
                  } else {
                     var10000 = var66.field7669[var69];
                  }

                  label497:
                  do {
                     while(true) {
                        if (var10000 == var59) {
                           var68 = var69;
                           if (!var2) {
                              var10000 = var66.field7719[var69].length;
                              break;
                           }

                           ++var69;
                        } else {
                           ++var69;
                        }

                        if (~var66.field7669.length >= ~var69) {
                           var10000 = var66.field7719[var68].length;
                           if (!var2) {
                              break label497;
                           }
                        } else {
                           var10000 = var66.field7669[var69];
                        }
                     }
                  } while(var2);
               }

               var67 = var10000;
            }

            int var70 = 0;
            if (var66.field7700 != null) {
               var70 = var66.field7700.length;
            }

            int var71 = 0;
            if (var66.field7712 != null) {
               var71 = var66.field7712.length;
            }

            if ((1 & var64) == 1) {
               class490.method3726(var63, var60, (class468)null, (byte)125, class499.field7097, var62);
            } else {
               int[] var72 = null;
               if (~(2 & var64) == -3) {
                  var72 = new int[var67];
                  int var73 = 0;
                  if (var2 || var67 > var73) {
                     do {
                        var72[var73] = var3.method685(-2);
                        ++var73;
                     } while(var67 > var73);
                  }
               }

               short[] var74 = null;
               if (~(var64 & 4) == -5) {
                  var74 = new short[var70];
                  int var75 = 0;
                  if (var2 || ~var70 < ~var75) {
                     do {
                        var74[var75] = (short)var3.method685(-2);
                        ++var75;
                     } while(~var70 < ~var75);
                  }
               }

               short[] var76 = null;
               if ((8 & var64) == 8) {
                  var76 = new short[var71];
                  int var77 = 0;
                  if (var2 || var71 > var77) {
                     do {
                        var76[var77] = (short)var3.method685(-2);
                        ++var77;
                     } while(var71 > var77);
                  }
               }

               class490.method3726(var63, var60, new class468((long)(class41.field635++), var72, var74, var76), (byte)125, class499.field7097, var62);
            }
         } else if (class21.field319 == arg0) {
            var3.method665(arg1);
            int var78 = var3.method665(false);
            int var79 = class172.field2577 - -((112 & var78) >> 4);
            int var80 = (var78 & 7) + class283.field4265;
            int var81 = var3.method685(-2);
            int var82 = var3.method665(false);
            int var83 = var3.method691((byte)-126);
            String var84 = var3.method640((byte)51);
            class495.method3756(var79, var83, class499.field7097, var81, var80, 117, var82, var84);
         } else if (class695.field10038 == arg0) {
            int var85 = var3.method697(2);
            if (~var85 == -65536) {
               var85 = -1;
            }

            int var86 = var3.method693((byte)114);
            int var87 = (var86 >> 4 & 7) + class172.field2577;
            int var88 = (7 & var86) + class283.field4265;
            int var89 = var3.method688(-19476);
            int var90 = var89 >> 2;
            int var91 = var89 & 3;
            int var92 = class209.field2980[var90];
            class699.method5108(var85, var91, var87, false, var90, var92, class499.field7097, var88);
         } else if (class388.field5656 == arg0) {
            int var93 = var3.method697(2);
            int var94 = var3.method651(-1);
            int var95 = var3.method688(-19476);
            int var96 = (var95 & 7) + class283.field4265;
            int var97 = class480.field6903 + var96;
            int var98 = ((var95 & 122) >> 4) + class172.field2577;
            int var99 = class115.field1824 + var98;
            boolean var100 = var98 >= 0 && var96 >= 0 && ~class234.field3626 < ~var98 && ~var96 > ~class209.field2989;
            if (var100 || class631.method4623(class22.field325, false)) {
               class417.method3257(var99, var97, new class311(var93, var94), 495324654, class499.field7097);
               if (var100) {
                  class367.method2894(var96, var98, 5193, class499.field7097);
               }
            }

         } else if (class209.field2984 == arg0) {
            int var101 = var3.method665(false);
            int var102 = (var101 >> 4 & 7) + class172.field2577;
            int var103 = (var101 & 7) + class283.field4265;
            int var104 = var3.method685(-2);
            int var105 = var3.method665(false);
            int var106 = var3.method685(-2);
            int var107 = var3.method665(arg1);
            if (var102 >= 0 && ~var103 <= -1 && class234.field3626 > var102 && var103 < class209.field2989) {
               int var108 = var102 * 512 + 256;
               int var109 = var103 * 512 + 256;
               int var110 = class499.field7097;
               if (var110 < 3 && class172.method1598(var103, var102, 111)) {
                  ++var110;
               }

               class364 var111 = new class364(var104, var106, class499.field7097, var110, var108, -var105 + class478.method3658(class499.field7097, var108, var109, (byte)-20), var109, var102, var102, var103, var103, var107, false);
               class801.field11657.method2238(new class238(var111), 13);
            }

         } else if (class592.field8362 == arg0) {
            int var112 = var3.method665(false);
            int var113 = class172.field2577 - -((var112 & 126) >> 4);
            int var114 = (var112 & 7) + class283.field4265;
            int var115 = var3.method685(-2);
            if (~var115 == -65536) {
               var115 = -1;
            }

            int var116 = var3.method665(false);
            int var117 = (var116 & 242) >> 4;
            int var118 = 7 & var116;
            int var119 = var3.method665(false);
            int var120 = var3.method665(arg1);
            int var121 = var3.method685(-2);
            if (~var113 <= -1 && ~var114 <= -1 && ~var113 > ~class234.field3626 && ~var114 > ~class209.field2989) {
               int var122 = var117 + 1;
               if (-var122 + var113 <= class117.field1849.field5861[0] && var113 - -var122 >= class117.field1849.field5861[0] && class117.field1849.field5865[0] >= -var122 + var114 && ~(var114 - -var122) <= ~class117.field1849.field5865[0]) {
                  class423.method3299(var121, (class499.field7097 << 24) + (var113 << 16) + (var114 << 8) + var117, 127, var115, var119, var120, var118, false);
               }
            }

         } else if (class654.field9264 == arg0) {
            int var123 = var3.method688(-19476);
            int var124 = var123 >> 2;
            int var125 = 3 & var123;
            int var126 = class209.field2980[var124];
            int var127 = var3.method665(false);
            int var128 = ((var127 & 112) >> 4) + class172.field2577;
            int var129 = (var127 & 7) + class283.field4265;
            int var130 = var3.method651(-1);
            if (class631.method4623(class22.field325, false) || ~var128 <= -1 && ~var129 <= -1 && ~class234.field3626 < ~var128 && ~class209.field2989 < ~var129) {
               class47.method528(var128, var124, class499.field7097, var130, var126, var125, (byte)10, var129);
            }

         } else if (class765.field10967 == arg0) {
            int var131 = var3.method665(false);
            boolean var132 = (128 & var131) != 0;
            int var133 = (7 & var131 >> 3) + class172.field2577;
            int var134 = (var131 & 7) + class283.field4265;
            int var135 = var133 + var3.method638(true);
            int var136 = var134 - -var3.method638(true);
            int var137 = var3.method655((byte)98);
            int var138 = var3.method685(-2);
            int var139 = 4 * var3.method665(arg1);
            int var140 = 4 * var3.method665(false);
            int var141 = var3.method685(-2);
            int var142 = var3.method685(-2);
            int var143 = var3.method665(arg1);
            if (~var143 == -256) {
               var143 = -1;
            }

            int var144 = var3.method685(-2);
            if (~var133 <= -1 && ~var134 <= -1 && class234.field3626 > var133 && var134 < class209.field2989 && ~var135 <= -1 && var136 >= 0 && var135 < class234.field3626 && class209.field2989 > var136 && var138 != 65535) {
               int var145 = var144 << 2;
               int var146 = var140 << 2;
               int var147 = var136 * 512 + 256;
               int var148 = var139 << 2;
               int var149 = var134 * 512 + 256;
               int var150 = var135 * 512 - -256;
               int var151 = var133 * 512 + 256;
               class394 var152 = new class394(var138, class499.field7097, class499.field7097, var151, var149, var148, class51.field770 + var141, class51.field770 + var142, var143, var145, 0, var137, var146, var132, -1);
               var152.method3057(-var146 + class478.method3658(class499.field7097, var150, var147, (byte)-20), var150, var141 - -class51.field770, 1, var147);
               class80.field1259.method2238(new class31(var152), 13);
            }

         } else if (class482.field6914 == arg0) {
            int var153 = var3.method697(2);
            int var154 = var3.method665(false);
            int var155 = (7 & var154) + class283.field4265;
            int var156 = var155 - -class480.field6903;
            int var157 = (var154 >> 4 & 7) + class172.field2577;
            int var158 = class115.field1824 + var157;
            int var159 = var3.method651(-1);
            int var160 = var3.method685(-2);
            if (class394.field5731 != var160) {
               boolean var161 = var157 >= 0 && var155 >= 0 && ~var157 > ~class234.field3626 && var155 < class209.field2989;
               if (var161 || class631.method4623(class22.field325, arg1)) {
                  class417.method3257(var158, var156, new class311(var159, var153), 495324654, class499.field7097);
                  if (var161) {
                     class367.method2894(var155, var157, 5193, class499.field7097);
                  }
               }
            }

         } else if (class777.field11338 == arg0) {
            int var162 = var3.method688(-19476);
            int var163 = ((var162 & 118) >> 4) + class172.field2577;
            int var164 = (7 & var162) + class283.field4265;
            int var165 = var3.method665(false);
            int var166 = var165 >> 2;
            int var167 = var165 & 3;
            int var168 = class209.field2980[var166];
            if (class631.method4623(class22.field325, false) || var163 >= 0 && ~var164 <= -1 && ~var163 > ~class234.field3626 && ~var164 > ~class209.field2989) {
               class47.method528(var163, var166, class499.field7097, -1, var168, var167, (byte)10, var164);
            }

         } else if (class573.field8105 != arg0) {
            class117.method1138(76, field5330[6] + arg0, (Throwable)null);
            class593.method4358(21995, arg1);
         } else {
            int var169 = var3.method647((byte)124);
            int var170 = (var169 & 7) + class283.field4265;
            int var171 = class480.field6903 + var170;
            int var172 = (var169 >> 4 & 7) + class172.field2577;
            int var173 = class115.field1824 + var172;
            int var174 = var3.method685(-2);
            class279 var175 = (class279)class216.field3081.method3101(-1, (long)(var173 | class499.field7097 << 28 | var171 << 14));
            if (var175 != null) {
               label583: {
                  class311 var176 = (class311)var175.field4227.method2245((byte)-94);
                  if (var2) {
                     var10000 = var176.field4666;
                  } else if (var176 == null) {
                     var10000 = var175.field4227.method2242(23702);
                     if (!var2) {
                        break label583;
                     }
                  } else {
                     var10000 = var176.field4666;
                  }

                  label582:
                  do {
                     while(true) {
                        if (var10000 == (32767 & var174)) {
                           var176.method2140((byte)-97);
                           if (!var2) {
                              var10000 = var175.field4227.method2242(23702);
                              break;
                           }

                           var176 = (class311)var175.field4227.method2239((byte)99);
                        } else {
                           var176 = (class311)var175.field4227.method2239((byte)99);
                        }

                        if (var176 == null) {
                           var10000 = var175.field4227.method2242(23702);
                           if (!var2) {
                              break label582;
                           }
                        } else {
                           var10000 = var176.field4666;
                        }
                     }
                  } while(var2);
               }

               if (var10000 != 0) {
                  var175.method2140((byte)-83);
               }

               if (var172 >= 0 && ~var170 <= -1 && class234.field3626 > var172 && ~class209.field2989 < ~var170) {
                  class367.method2894(var170, var172, 5193, class499.field7097);
               }
            }

         }
      } catch (RuntimeException var178) {
         throw class612.method4503(var178, field5330[5] + (arg0 != null ? field5330[2] : field5330[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2826(int arg0, int arg1) {
      try {
         label20: {
            ++field5321;
            --this.field5329;
            if (this.field5329 != 0) {
               class474.method3638(this.field5311, arg0 + 1, this.field5311, arg0, -arg0 + this.field5329);
               if (!client.field10022) {
                  break label20;
               }
            }

            this.field5311 = null;
         }

         if (arg1 > -4) {
            method2833(117);
         }

         this.field5317 = null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5330[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method2827(int arg0, int arg1) {
      try {
         ++field5328;
         if (arg1 != 0) {
            this.field5317 = null;
         }

         if (this.field5311 != null) {
            class474.method3638(this.field5311, 0, this.field5311 = new class622[arg0], 0, this.field5329);
         } else {
            this.field5311 = new class622[arg0];
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5330[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(ILsa;Lha;)V"
   )
   public static final void method2828(int param0, class39 param1, class17 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(Lcu;B)V"
   )
   private final void method2829(class65 arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5314;
         int var4 = arg0.method665(false);
         if ((2 & var4) != 0) {
            this.field5326 = true;
         }

         if ((1 & var4) != 0) {
            this.field5323 = true;
         }

         super.field3777 = arg0.method680(arg1 + -81);
         this.field5313 = arg0.method680(-129);
         this.field5322 = arg0.method640((byte)51);
         if (arg1 != -48) {
            this.method2826(-27, 84);
         }

         arg0.method665(false);
         this.field5312 = arg0.method638(true);
         this.field5316 = arg0.method638(true);
         this.field5329 = arg0.method685(arg1 + 46);
         if (this.field5329 > 0) {
            this.field5311 = new class622[this.field5329];
            int var5 = 0;
            if (var3 || this.field5329 > var5) {
               do {
                  class622 var6 = new class622();
                  if (this.field5323) {
                     arg0.method680(arg1 + -81);
                  }

                  if (this.field5326) {
                     var6.field8891 = arg0.method640((byte)51);
                  }

                  var6.field8883 = arg0.method638(true);
                  var6.field8890 = arg0.method685(-2);
                  this.field5311[var5] = var6;
                  ++var5;
               } while(this.field5329 > var5);

            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5330[10] + (arg0 != null ? field5330[2] : field5330[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method2830(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (arg0 != 4) {
            this.method2829((class65)null, (byte)42);
         }

         if (this.field5317 == null) {
            this.field5317 = new int[this.field5329];
            String[] var3 = new String[this.field5329];
            int var4 = 0;
            if (var2) {
               var3[var4] = this.field5311[var4].field8891;
               this.field5317[var4] = var4++;
            }

            while(true) {
               while(~this.field5329 < ~var4) {
                  var3[var4] = this.field5311[var4].field8891;
                  this.field5317[var4] = var4++;
               }

               int[] var10000 = this.field5317;
               if (!var2) {
                  class11.method91(var10000, false, var3);
                  break;
               }

               var10000[0] = var4++;
            }
         }

         ++field5315;
         return this.field5317;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5330[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(ILqd;)V"
   )
   public final void method2831(int arg0, class622 arg1) {
      try {
         if (this.field5311 == null || ~this.field5311.length >= ~this.field5329) {
            this.method2827(this.field5329 + 5, 0);
         }

         ++field5319;
         if (arg0 == 5668) {
            this.field5311[this.field5329++] = arg1;
            this.field5317 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5330[12] + arg0 + ',' + (arg1 != null ? field5330[2] : field5330[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public final int method2832(int arg0, String arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5327;
         if (arg0 > -41) {
            this.field5316 = -67;
         }

         int var4 = 0;
         if (var3) {
            if (this.field5311[var4].field8891.equalsIgnoreCase(arg1)) {
               return var4;
            }

            ++var4;
         }

         while(true) {
            while(~var4 > ~this.field5329) {
               if (this.field5311[var4].field8891.equalsIgnoreCase(arg1)) {
                  return var4;
               }

               ++var4;
            }

            if (!var3) {
               return -1;
            }

            if (-1 != 0) {
               return var4;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5330[9] + arg0 + ',' + (arg1 != null ? field5330[2] : field5330[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method2833(int arg0) {
      try {
         ++field5324;
         return arg0 != 1 ? -23 : class563.field8015;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5330[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   public class360(class65 arg0) {
      try {
         this.method2829(arg0, (byte)-48);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5330[8] + (arg0 != null ? field5330[2] : field5330[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
