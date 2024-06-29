import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class230 implements class272 {
   @OriginalMember(
      owner = "client!tu",
      name = "h",
      descriptor = "Lrr;"
   )
   private class678 field3518;
   @OriginalMember(
      owner = "client!tu",
      name = "i",
      descriptor = "Ltda;"
   )
   public class407 field3521;
   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3530 = new String[]{method1985(method1984("HFVy_")), method1985(method1984("HFVx_")), method1985(method1984("HFV\u007f_")), method1985(method1984("HFV}_")), method1985(method1984("RF\u0014V")), method1985(method1984("G\u001dV\u0014\n")), method1985(method1984("HFV\u0006\u001eRZ\f\u0004_")), method1985(method1984("HFV~_")), method1985(method1984("HFV|_")), method1985(method1984("h\u0000X\u0017W")), method1985(method1984("HFV{_"))};
   @OriginalMember(
      owner = "client!tu",
      name = "g",
      descriptor = "I"
   )
   public static int field3519 = -1;
   @OriginalMember(
      owner = "client!tu",
      name = "l",
      descriptor = "I"
   )
   public static int field3525 = -1;
   @OriginalMember(
      owner = "client!tu",
      name = "f",
      descriptor = "I"
   )
   public static int field3522;
   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "I"
   )
   public static int field3523;
   @OriginalMember(
      owner = "client!tu",
      name = "j",
      descriptor = "I"
   )
   public static int field3524;
   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "I"
   )
   public static int field3527;
   @OriginalMember(
      owner = "client!tu",
      name = "d",
      descriptor = "I"
   )
   public static int field3528;
   @OriginalMember(
      owner = "client!tu",
      name = "e",
      descriptor = "I"
   )
   public static int field3529;
   @OriginalMember(
      owner = "client!tu",
      name = "c",
      descriptor = "Lea;"
   )
   public static class520 field3520;
   @OriginalMember(
      owner = "client!tu",
      name = "k",
      descriptor = "Ljq;"
   )
   public class672 field3526;

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1980(int arg0) {
      try {
         if (arg0 != -3833) {
            field3525 = 126;
         }

         field3520 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3530[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method282(byte arg0) {
      try {
         ++field3527;
         this.field3526 = class85.method828(106, this.field3518, this.field3521.field6344);
         if (arg0 < 98) {
            this.field3518 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3530[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(Lhka;B)V"
   )
   public static final void method1981(class377 arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         ++field3523;
         class102 var3 = class510.field7801.field362;
         int var10000;
         if (class117.field1569 == arg0) {
            int var4 = var3.method2857((byte)125);
            int var5 = (var4 & 7) + class441.field6783;
            int var6 = class119.field1606 + var5;
            int var7 = (var4 >> 4 & 7) + class37.field449;
            int var8 = class120.field1694 + var7;
            int var9 = var3.method2867(118);
            class535 var10 = (class535)class429.field6620.method3141((long)(var6 << 14 | class242.field3678 << 28 | var8), true);
            if (var10 != null) {
               label419: {
                  class281 var11 = (class281)var10.field8105.method4972((byte)-84);
                  if (var2) {
                     var10000 = ~var11.field4474;
                  } else if (var11 == null) {
                     var10000 = var10.field8105.method4978(15590);
                     if (!var2) {
                        break label419;
                     }
                  } else {
                     var10000 = ~var11.field4474;
                  }

                  label418:
                  do {
                     while(true) {
                        if (var10000 == ~(var9 & 32767)) {
                           var11.method2477(1976);
                           if (!var2) {
                              var10000 = var10.field8105.method4978(15590);
                              break;
                           }

                           var11 = (class281)var10.field8105.method4975((byte)103);
                        } else {
                           var11 = (class281)var10.field8105.method4975((byte)103);
                        }

                        if (var11 == null) {
                           var10000 = var10.field8105.method4978(15590);
                           if (!var2) {
                              break label418;
                           }
                        } else {
                           var10000 = ~var11.field4474;
                        }
                     }
                  } while(var2);
               }

               if (var10000 != 0) {
                  var10.method2477(1976);
               }

               if (~var7 <= -1 && var5 >= 0 && ~var7 > ~class513.field7828 && ~var5 > ~class475.field7230) {
                  class801.method5771(-19718, var7, var5, class242.field3678);
               }
            }

         } else if (class187.field2933 == arg0) {
            int var13;
            int var14;
            boolean var16;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            label427: {
               int var12 = var3.method2855(-31007);
               var13 = (15 & var12 >> 4) + class37.field449 * 2;
               var14 = (var12 & 15) + class441.field6783 * 2;
               int var15 = var3.method2855(-31007);
               var16 = ~(1 & var15) != -1;
               boolean var17 = ~(var15 & 2) != -1;
               var18 = !var17 ? -1 : var15 >> 2;
               var19 = var3.method2886((byte)88) + var13;
               var20 = var3.method2886((byte)88) + var14;
               var21 = var3.method2869(false);
               var22 = var3.method2869(false);
               var23 = var3.method2848(-127);
               var24 = var3.method2855(-31007);
               if (!var17) {
                  var24 *= 4;
                  if (!var2) {
                     break label427;
                  }
               }

               var24 = (byte)var24;
            }

            int var25 = 4 * var3.method2855(-31007);
            int var26 = var3.method2848(-99);
            int var27 = var3.method2848(-115);
            int var28 = var3.method2855(-31007);
            if (var28 == 255) {
               var28 = -1;
            }

            int var29 = var3.method2848(-104);
            if (~var13 <= -1 && var14 >= 0 && class513.field7828 * 2 > var13 && var14 < class513.field7828 * 2 && var19 >= 0 && var20 >= 0 && ~(class475.field7230 * 2) < ~var19 && class475.field7230 * 2 > var20 && var23 != 65535) {
               int var30 = var19 * 256;
               int var31 = var24 << 2;
               int var32 = var25 << 2;
               int var33 = var14 * 256;
               int var34 = var29 << 2;
               int var35 = var20 * 256;
               int var36 = var13 * 256;
               if (var21 != 0 && var18 != -1) {
                  class119 var37 = null;
                  if (var21 < 0) {
                     int var38 = -var21 + -1;
                     if (class315.field4864 != var38) {
                        var37 = class484.field7370[var38];
                     } else {
                        var37 = class476.field7251;
                     }
                  } else {
                     int var39 = var21 + -1;
                     class795 var40 = (class795)class501.field7665.method3141((long)var39, true);
                     if (var40 != null) {
                        var37 = var40.field11592;
                     }
                  }

                  if (var37 != null) {
                     class228 var41 = var37.method1089(true);
                     if (var41.field3497 != null && var41.field3497[var18] != null) {
                        var31 -= var41.field3497[var18][1];
                     }

                     if (var41.field3462 != null && var41.field3462[var18] != null) {
                        var31 -= var41.field3462[var18][1];
                     }
                  }
               }

               class660 var42 = new class660(var23, class242.field3678, class242.field3678, var36, var33, var31, class308.field4801 + var26, class308.field4801 + var27, var28, var34, var21, var22, var32, var16, var18);
               var42.method4861((byte)-3, class477.method3711(class242.field3678, var30, (byte)0, var35) + -var32, var30, var35, var26 - -class308.field4801);
               class425.field6557.method4980(new class23(var42), 0);
            }

         } else if (class135.field1903 == arg0) {
            int var43 = var3.method2855(-31007);
            int var44 = (7 & var43 >> 4) + class37.field449;
            int var45 = (7 & var43) + class441.field6783;
            int var46 = var3.method2848(-99);
            if (~var46 == -65536) {
               var46 = -1;
            }

            int var47 = var3.method2855(-31007);
            int var48 = 15 & var47 >> 4;
            int var49 = var47 & 7;
            int var50 = var3.method2855(-31007);
            int var51 = var3.method2855(-31007);
            int var52 = var3.method2848(-106);
            if (var44 >= 0 && ~var45 <= -1 && class513.field7828 > var44 && ~class475.field7230 < ~var45) {
               int var53 = var48 + 1;
               if (class476.field7251.field1683[0] >= -var53 + var44 && ~class476.field7251.field1683[0] >= ~(var44 + var53) && ~class476.field7251.field1685[0] <= ~(var45 - var53) && var45 + var53 >= class476.field7251.field1685[0]) {
                  class197.method1737((class242.field3678 << 24) + (var44 << 16) + (var45 << 8) + var48, var52, var51, var49, var46, false, -42, var50);
               }
            }

         } else if (class658.field9828 == arg0) {
            var3.method2855(-31007);
            int var54 = var3.method2855(-31007);
            int var55 = class37.field449 - -((var54 & 112) >> 4);
            int var56 = (var54 & 7) + class441.field6783;
            int var57 = var3.method2848(-104);
            int var58 = var3.method2855(-31007);
            int var59 = var3.method2872(2);
            String var60 = var3.method2843(-1);
            class394.method3175(var57, var60, class242.field3678, var58, var56, var55, var59, 20717);
         } else if (class401.field6287 == arg0) {
            int var61 = var3.method2855(-31007);
            int var62 = (var61 & 7) + class441.field6783;
            int var63 = class119.field1606 + var62;
            int var64 = (var61 >> 4 & 7) + class37.field449;
            int var65 = class120.field1694 + var64;
            int var66 = var3.method2848(-102);
            int var67 = var3.method2848(-125);
            int var68 = var3.method2848(-117);
            if (class429.field6620 != null) {
               class535 var69 = (class535)class429.field6620.method3141((long)(var63 << 14 | class242.field3678 << 28 | var65), true);
               if (var69 != null) {
                  label458: {
                     class281 var70 = (class281)var69.field8105.method4972((byte)-84);
                     if (var2) {
                        var10000 = var70.field4474;
                     } else if (var70 == null) {
                        var10000 = var64;
                        if (!var2) {
                           break label458;
                        }
                     } else {
                        var10000 = var70.field4474;
                     }

                     label457:
                     do {
                        while(true) {
                           if (var10000 == (32767 & var66) && var70.field4467 == var67) {
                              var70.method2477(1976);
                              var70.field4467 = var68;
                              class558.method4223(var70, var65, 90, var63, class242.field3678);
                              if (!var2) {
                                 var10000 = var64;
                                 break;
                              }
                           }

                           var70 = (class281)var69.field8105.method4975((byte)95);
                           if (var70 == null) {
                              var10000 = var64;
                              if (!var2) {
                                 break label457;
                              }
                           } else {
                              var10000 = var70.field4474;
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 >= 0 && var62 >= 0 && ~var64 > ~class513.field7828 && class475.field7230 > var62) {
                     class801.method5771(-19718, var64, var62, class242.field3678);
                  }
               }
            }

         } else if (class6.field33 == arg0) {
            int var71 = var3.method2857((byte)121);
            int var72 = var71 >> 2;
            int var73 = 3 & var71;
            int var74 = class137.field2001[var72];
            int var75 = var3.method2855(-31007);
            int var76 = class37.field449 - -(7 & var75 >> 4);
            int var77 = class441.field6783 - -(var75 & 7);
            if (class204.method1785((byte)32, class55.field683) || ~var76 <= -1 && var77 >= 0 && class513.field7828 > var76 && ~var77 > ~class475.field7230) {
               class694.method5107(var76, var77, class242.field3678, -1, var72, false, var74, var73);
            }

         } else if (class1.field2 == arg0) {
            int var78 = var3.method2834(7183);
            int var79 = var3.method2857((byte)122);
            int var80 = class441.field6783 - -(7 & var79);
            int var81 = class119.field1606 + var80;
            int var82 = ((var79 & 116) >> 4) + class37.field449;
            int var83 = class120.field1694 - -var82;
            int var84 = var3.method2834(7183);
            boolean var85 = ~var82 <= -1 && var80 >= 0 && ~var82 > ~class513.field7828 && ~var80 > ~class475.field7230;
            if (var85 || class204.method1785((byte)32, class55.field683)) {
               class558.method4223(new class281(var78, var84), var83, -109, var81, class242.field3678);
               if (var85) {
                  class801.method5771(-19718, var82, var80, class242.field3678);
               }
            }

         } else if (class285.field4494 == arg0) {
            int var86 = var3.method2857((byte)118);
            int var87 = var86 >> 2;
            int var88 = 3 & var86;
            int var89 = class137.field2001[var87];
            int var90 = var3.method2861((byte)60);
            int var91 = var3.method2855(-31007);
            int var92 = class37.field449 - -(7 & var91 >> 4);
            int var93 = (var91 & 7) + class441.field6783;
            if (class204.method1785((byte)32, class55.field683) || var92 >= 0 && var93 >= 0 && var92 < class513.field7828 && class475.field7230 > var93) {
               class694.method5107(var92, var93, class242.field3678, var90, var87, false, var89, var88);
            }

         } else if (class423.field6528 == arg0) {
            int var94 = var3.method2857((byte)127);
            int var95 = var94 >> 2;
            int var96 = class137.field2001[var95];
            int var97 = var3.method2861((byte)55);
            class333 var98 = class102.field1434.method1411(var97, -62);
            int var99 = var3.method2877(-31130);
            int var100 = var3.method2857((byte)121);
            int var101 = class37.field449 - -(7 & var100 >> 4);
            int var102 = class441.field6783 - -(7 & var100);
            if (var95 == 11) {
               var95 = 10;
            }

            int var103 = 0;
            if (var98.field5062 != null) {
               label569: {
                  int var104 = -1;
                  int var105 = 0;
                  if (var2) {
                     var10000 = var98.field5062[var105];
                  } else if (~var98.field5062.length >= ~var105) {
                     var10000 = var98.field5109[var104].length;
                     if (!var2) {
                        break label569;
                     }
                  } else {
                     var10000 = var98.field5062[var105];
                  }

                  label568:
                  do {
                     while(true) {
                        if (var10000 == var95) {
                           var104 = var105;
                           if (!var2) {
                              var10000 = var98.field5109[var105].length;
                              break;
                           }

                           ++var105;
                        } else {
                           ++var105;
                        }

                        if (~var98.field5062.length >= ~var105) {
                           var10000 = var98.field5109[var104].length;
                           if (!var2) {
                              break label568;
                           }
                        } else {
                           var10000 = var98.field5062[var105];
                        }
                     }
                  } while(var2);
               }

               var103 = var10000;
            }

            int var106 = 0;
            if (var98.field5103 != null) {
               var106 = var98.field5103.length;
            }

            int var107 = 0;
            if (var98.field5113 != null) {
               var107 = var98.field5113.length;
            }

            if (~(1 & var99) == -2) {
               class600.method4441(var102, class242.field3678, (class752)null, var101, 0, var96);
            } else {
               int[] var108 = null;
               if (~(var99 & 2) == -3) {
                  var108 = new int[var103];
                  int var109 = 0;
                  if (var2 || var109 < var103) {
                     do {
                        var108[var109] = var3.method2848(-92);
                        ++var109;
                     } while(var109 < var103);
                  }
               }

               short[] var110 = null;
               if ((var99 & 4) == 4) {
                  var110 = new short[var106];
                  int var111 = 0;
                  if (var2 || var111 < var106) {
                     do {
                        var110[var111] = (short)var3.method2848(-98);
                        ++var111;
                     } while(var111 < var106);
                  }
               }

               short[] var112 = null;
               if (~(var99 & 8) == -9) {
                  var112 = new short[var107];
                  int var113 = 0;
                  if (var2 || ~var113 > ~var107) {
                     do {
                        var112[var113] = (short)var3.method2848(-98);
                        ++var113;
                     } while(~var113 > ~var107);
                  }
               }

               class600.method4441(var102, class242.field3678, new class752((long)(class246.field3727++), var108, var110, var112), var101, 0, var96);
            }
         } else if (class398.field6241 != arg0) {
            if (class311.field4825 == arg0) {
               int var123 = var3.method2855(-31007);
               int var124 = class37.field449 - -((126 & var123) >> 4);
               int var125 = (var123 & 7) + class441.field6783;
               int var126 = var3.method2848(-117);
               int var127 = var3.method2855(-31007);
               int var128 = var3.method2848(-101);
               int var129 = var3.method2855(-31007);
               if (~var124 <= -1 && ~var125 <= -1 && var124 < class513.field7828 && class475.field7230 > var125) {
                  int var130 = var124 * 512 + 256;
                  int var131 = var125 * 512 + 256;
                  int var132 = class242.field3678;
                  if (var132 < 3 && class577.method4326(var124, (byte)77, var125)) {
                     ++var132;
                  }

                  class207 var133 = new class207(var126, var128, class242.field3678, var132, var130, class477.method3711(class242.field3678, var130, (byte)0, var131) - var127, var131, var124, var124, var125, var125, var129, false);
                  class777.field11405.method4980(new class372(var133), 0);
               }

            } else if (class705.field10610 == arg0) {
               int var134 = var3.method2855(-31007);
               boolean var135 = ~(128 & var134) != -1;
               int var136 = class37.field449 - -((var134 & 56) >> 3);
               int var137 = (7 & var134) + class441.field6783;
               int var138 = var3.method2886((byte)88) + var136;
               int var139 = var137 - -var3.method2886((byte)88);
               int var140 = var3.method2869(false);
               int var141 = var3.method2848(-119);
               int var142 = 4 * var3.method2855(-31007);
               int var143 = var3.method2855(-31007) * 4;
               int var144 = var3.method2848(-107);
               int var145 = var3.method2848(-128);
               int var146 = var3.method2855(-31007);
               if (~var146 == -256) {
                  var146 = -1;
               }

               int var147 = var3.method2848(-113);
               if (~var136 <= -1 && var137 >= 0 && class513.field7828 > var136 && ~class475.field7230 < ~var137 && ~var138 <= -1 && ~var139 <= -1 && ~var138 > ~class513.field7828 && var139 < class475.field7230 && ~var141 != -65536) {
                  int var148 = var138 * 512 + 256;
                  int var149 = var142 << 2;
                  int var150 = var137 * 512 + 256;
                  int var151 = var136 * 512 + 256;
                  int var152 = var147 << 2;
                  int var153 = var143 << 2;
                  int var154 = var139 * 512 + 256;
                  class660 var155 = new class660(var141, class242.field3678, class242.field3678, var151, var150, var149, class308.field4801 + var144, class308.field4801 + var145, var146, var152, 0, var140, var153, var135, -1);
                  var155.method4861((byte)-3, -var153 + class477.method3711(class242.field3678, var148, (byte)0, var154), var148, var154, var144 - -class308.field4801);
                  class425.field6557.method4980(new class23(var155), 0);
               }

            } else if (class455.field6955 == arg0) {
               int var156 = var3.method2855(-31007);
               int var157 = class37.field449 - -(7 & var156 >> 4);
               int var158 = (var156 & 7) + class441.field6783;
               int var159 = var3.method2848(-127);
               if (var159 == 65535) {
                  var159 = -1;
               }

               int var160 = var3.method2855(-31007);
               int var161 = (var160 & 245) >> 4;
               int var162 = var160 & 7;
               int var163 = var3.method2855(-31007);
               int var164 = var3.method2855(-31007);
               int var165 = var3.method2848(-104);
               if (~var157 <= -1 && ~var158 <= -1 && var157 < class513.field7828 && ~class475.field7230 < ~var158) {
                  int var166 = var161 - -1;
                  if (~class476.field7251.field1683[0] <= ~(-var166 + var157) && class476.field7251.field1683[0] <= var157 + var166 && ~(var158 - var166) >= ~class476.field7251.field1685[0] && class476.field7251.field1685[0] <= var158 + var166) {
                     class9.method42(var164, var159, var165, 50, var162, (var158 << 8) + ((class242.field3678 << 24) + (var157 << 16) - -var161), var163);
                  }
               }

            } else if (class86.field1260 == arg0) {
               int var167 = var3.method2877(-31130);
               int var168 = var167 >> 2;
               int var169 = var167 & 3;
               int var170 = class137.field2001[var168];
               int var171 = var3.method2867(19);
               if (var171 == 65535) {
                  var171 = -1;
               }

               int var172 = var3.method2855(-31007);
               int var173 = ((118 & var172) >> 4) + class37.field449;
               int var174 = (7 & var172) + class441.field6783;
               class472.method3669(38, var173, var170, var174, var169, var168, class242.field3678, var171);
            } else if (class12.field151 == arg0) {
               int var175 = var3.method2848(-123);
               int var176 = var3.method2855(-31007);
               class102.field1434.method1411(var175, -74).method2715(var176, 21188);
            } else {
               class281.method2349(1, field3530[9] + arg0, (Throwable)null);
               int var177 = 106 / ((34 - arg1) / 35);
               class321.method2638(2, false);
            }
         } else {
            int var114 = var3.method2848(-104);
            int var115 = var3.method2867(119);
            int var116 = var3.method2867(81);
            int var117 = var3.method2868(1318266360);
            int var118 = (7 & var117) + class441.field6783;
            int var119 = class119.field1606 + var118;
            int var120 = (var117 >> 4 & 7) + class37.field449;
            int var121 = class120.field1694 + var120;
            if (~class315.field4864 != ~var115) {
               boolean var122 = var120 >= 0 && var118 >= 0 && class513.field7828 > var120 && ~class475.field7230 < ~var118;
               if (var122 || class204.method1785((byte)32, class55.field683)) {
                  class558.method4223(new class281(var116, var114), var121, 84, var119, class242.field3678);
                  if (var122) {
                     class801.method5771(-19718, var120, var118, class242.field3678);
                  }
               }
            }

         }
      } catch (RuntimeException var179) {
         throw class482.method3757(var179, field3530[10] + (arg0 != null ? field3530[5] : field3530[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(IIIIIIIIII)Z"
   )
   public static final boolean method1982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field1786;

      try {
         ++field3528;
         if (~arg1 >= -2001 && arg0 <= 2000 && arg8 <= 2000 && ~arg7 >= -2001 && ~arg3 >= -2001 && ~arg6 >= -2001) {
            if (arg1 >= -2000 && ~arg0 <= 1999 && ~arg8 <= 1999 && arg7 >= -2000 && ~arg3 <= 1999 && arg6 >= -2000) {
               if (class69.field908 == 2) {
                  int var11 = class211.field3196 * arg1 + arg7;
                  if (var11 >= 0 && ~class327.field4984.length < ~var11 && ~((arg9 << 8) + -38400) > ~class327.field4984[var11]) {
                     return false;
                  }

                  int var12 = arg3 - -(class211.field3196 * arg0);
                  if (~var12 <= -1 && var12 < class327.field4984.length && class327.field4984[var12] > (arg4 << 8) + -38400) {
                     return false;
                  }

                  int var13 = arg6 - -(class211.field3196 * arg8);
                  if (~var13 <= -1 && ~class327.field4984.length < ~var13 && (arg5 << 8) + -38400 < class327.field4984[var13]) {
                     return false;
                  }
               }

               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               label1113: {
                  var14 = -arg7 + arg3;
                  var15 = arg0 - arg1;
                  var16 = -arg7 + arg6;
                  var17 = arg8 - arg1;
                  var18 = arg4 - arg9;
                  var19 = -arg9 + arg5;
                  if (arg1 < arg0 && ~arg8 < ~arg8) {
                     --arg1;
                     if (~arg0 < ~arg8) {
                        ++arg0;
                        if (!var10) {
                           break label1113;
                        }
                     }

                     ++arg8;
                     if (!var10) {
                        break label1113;
                     }
                  }

                  if (arg8 > arg0) {
                     label1081: {
                        if (~arg1 >= ~arg8) {
                           ++arg8;
                           if (!var10) {
                              break label1081;
                           }
                        }

                        ++arg1;
                     }

                     --arg0;
                     if (!var10) {
                        break label1113;
                     }
                  }

                  --arg8;
                  if (arg1 <= arg0) {
                     ++arg0;
                     if (!var10) {
                        break label1113;
                     }
                  }

                  ++arg1;
               }

               int var20 = 0;
               if (arg0 != arg1) {
                  var20 = (-arg7 + arg3 << 12) / (-arg1 + arg0);
               }

               int var21 = 0;
               if (arg0 != arg8) {
                  var21 = (arg6 - arg3 << 12) / (-arg0 + arg8);
               }

               int var22 = 0;
               if (arg1 != arg8) {
                  var22 = (-arg6 + arg7 << 12) / (-arg8 + arg1);
               }

               int var23 = var14 * var17 + -(var15 * var16);
               if (~var23 == -1) {
                  return false;
               } else {
                  int var24 = 112 / ((arg2 - 54) / 50);
                  int var25 = (var17 * var18 + -(var15 * var19) << 8) / var23;
                  int var26 = (var14 * var19 + -(var16 * var18) << 8) / var23;
                  boolean var10000;
                  if (~arg1 >= ~arg0 && ~arg1 >= ~arg8) {
                     if (~arg1 <= ~class105.field1456) {
                        return true;
                     } else {
                        if (~class105.field1456 > ~arg8) {
                           arg8 = class105.field1456;
                        }

                        arg9 = (arg9 << 8) + var25 + -(arg7 * var25);
                        if (arg0 > class105.field1456) {
                           arg0 = class105.field1456;
                        }

                        if (arg0 >= arg8) {
                           arg3 = arg7 <<= 12;
                           if (arg1 < 0) {
                              arg9 -= arg1 * var26;
                              arg3 -= arg1 * var22;
                              arg7 -= arg1 * var20;
                              arg1 = 0;
                           }

                           arg6 <<= 12;
                           if (arg8 < 0) {
                              arg6 -= arg8 * var21;
                              arg8 = 0;
                           }

                           if (arg1 != arg8 && var20 > var22 || ~arg1 == ~arg8 && var20 < var21) {
                              arg0 -= arg8;
                              arg8 -= arg1;
                              arg1 = class211.field3196 * arg1;
                              if (var10) {
                                 if (!class566.method4266(0, arg1, class327.field4984, (arg7 >> 12) + 1, 125, arg9, (arg3 >> 12) - 1, var25)) {
                                    return false;
                                 }

                                 arg3 += var22;
                                 arg7 += var20;
                                 arg9 += var26;
                                 arg1 += class211.field3196;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (arg8 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg1, class327.field4984, (arg7 >> 12) + 1, 116, arg9, (arg6 >> 12) - 1, var25)) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg1 += class211.field3196;
                                             arg9 += var26;
                                             arg6 += var21;
                                          }

                                          while(true) {
                                             --arg0;
                                             if (arg0 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg1, class327.field4984, (arg7 >> 12) + 1, 116, arg9, (arg6 >> 12) - 1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg1 += class211.field3196;
                                             arg9 += var26;
                                             arg6 += var21;
                                          }
                                       }

                                       arg1 += class211.field3196;
                                    } else {
                                       if (!class566.method4266(0, arg1, class327.field4984, (arg7 >> 12) + 1, 125, arg9, (arg3 >> 12) - 1, var25)) {
                                          return false;
                                       }

                                       arg3 += var22;
                                       arg7 += var20;
                                       arg9 += var26;
                                       arg1 += class211.field3196;
                                    }
                                 }
                              }
                           } else {
                              arg0 -= arg8;
                              arg8 -= arg1;
                              arg1 = class211.field3196 * arg1;
                              if (var10) {
                                 if (!class566.method4266(0, arg1, class327.field4984, (arg3 >> 12) + 1, 115, arg9, (arg7 >> 12) + -1, var25)) {
                                    return false;
                                 }

                                 arg3 += var22;
                                 arg1 += class211.field3196;
                                 arg7 += var20;
                                 arg9 += var26;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (arg8 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg1, class327.field4984, (arg6 >> 12) + 1, 117, arg9, (arg7 >> 12) - 1, var25)) {
                                                return false;
                                             }

                                             arg6 += var21;
                                             arg7 += var20;
                                             arg1 += class211.field3196;
                                             arg9 += var26;
                                          }

                                          while(true) {
                                             --arg0;
                                             if (arg0 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg1, class327.field4984, (arg6 >> 12) + 1, 117, arg9, (arg7 >> 12) - 1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg6 += var21;
                                             arg7 += var20;
                                             arg1 += class211.field3196;
                                             arg9 += var26;
                                          }
                                       }

                                       arg9 += var26;
                                    } else {
                                       if (!class566.method4266(0, arg1, class327.field4984, (arg3 >> 12) + 1, 115, arg9, (arg7 >> 12) + -1, var25)) {
                                          return false;
                                       }

                                       arg3 += var22;
                                       arg1 += class211.field3196;
                                       arg7 += var20;
                                       arg9 += var26;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg6 = arg7 <<= 12;
                           arg3 <<= 12;
                           if (arg1 < 0) {
                              arg7 -= arg1 * var20;
                              arg6 -= arg1 * var22;
                              arg9 -= arg1 * var26;
                              arg1 = 0;
                           }

                           if (~arg0 > -1) {
                              arg3 -= arg0 * var21;
                              arg0 = 0;
                           }

                           if (arg0 != arg1 && var20 > var22 || ~arg0 == ~arg1 && var22 > var21) {
                              arg8 -= arg0;
                              arg0 -= arg1;
                              arg1 = class211.field3196 * arg1;
                              if (var10) {
                                 if (!class566.method4266(0, arg1, class327.field4984, (arg7 >> 12) + 1, 126, arg9, (arg6 >> 12) + -1, var25)) {
                                    return false;
                                 }

                                 arg6 += var22;
                                 arg1 += class211.field3196;
                                 arg9 += var26;
                                 arg7 += var20;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (~arg0 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg1, class327.field4984, (arg3 >> 12) + 1, 117, arg9, (arg6 >> 12) + -1, var25)) {
                                                return false;
                                             }

                                             arg3 += var21;
                                             arg9 += var26;
                                             arg6 += var22;
                                             arg1 += class211.field3196;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (arg8 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg1, class327.field4984, (arg3 >> 12) + 1, 117, arg9, (arg6 >> 12) + -1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += var21;
                                             arg9 += var26;
                                             arg6 += var22;
                                             arg1 += class211.field3196;
                                          }
                                       }

                                       arg7 += var20;
                                    } else {
                                       if (!class566.method4266(0, arg1, class327.field4984, (arg7 >> 12) + 1, 126, arg9, (arg6 >> 12) + -1, var25)) {
                                          return false;
                                       }

                                       arg6 += var22;
                                       arg1 += class211.field3196;
                                       arg9 += var26;
                                       arg7 += var20;
                                    }
                                 }
                              }
                           } else {
                              arg8 -= arg0;
                              arg0 -= arg1;
                              arg1 = class211.field3196 * arg1;
                              if (var10) {
                                 if (!class566.method4266(0, arg1, class327.field4984, (arg6 >> 12) - -1, 110, arg9, (arg7 >> 12) + -1, var25)) {
                                    return false;
                                 }

                                 arg6 += var22;
                                 arg1 += class211.field3196;
                                 arg7 += var20;
                                 arg9 += var26;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (~arg0 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg1, class327.field4984, (arg6 >> 12) - -1, 113, arg9, (arg3 >> 12) + -1, var25)) {
                                                return false;
                                             }

                                             arg3 += var21;
                                             arg1 += class211.field3196;
                                             arg9 += var26;
                                             arg6 += var22;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (~arg8 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg1, class327.field4984, (arg6 >> 12) - -1, 113, arg9, (arg3 >> 12) + -1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += var21;
                                             arg1 += class211.field3196;
                                             arg9 += var26;
                                             arg6 += var22;
                                          }
                                       }

                                       arg9 += var26;
                                    } else {
                                       if (!class566.method4266(0, arg1, class327.field4984, (arg6 >> 12) - -1, 110, arg9, (arg7 >> 12) + -1, var25)) {
                                          return false;
                                       }

                                       arg6 += var22;
                                       arg1 += class211.field3196;
                                       arg7 += var20;
                                       arg9 += var26;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if (arg0 <= arg8) {
                     if (class105.field1456 <= arg0) {
                        return true;
                     } else {
                        if (arg1 > class105.field1456) {
                           arg1 = class105.field1456;
                        }

                        if (~arg8 < ~class105.field1456) {
                           arg8 = class105.field1456;
                        }

                        arg4 = (arg4 << 8) + -(arg3 * var25) + var25;
                        if (arg8 >= arg1) {
                           arg6 = arg3 <<= 12;
                           if (~arg0 > -1) {
                              arg4 -= arg0 * var26;
                              arg6 -= arg0 * var20;
                              arg3 -= arg0 * var21;
                              arg0 = 0;
                           }

                           arg7 <<= 12;
                           if (~arg1 > -1) {
                              arg7 -= arg1 * var22;
                              arg1 = 0;
                           }

                           if (var21 > var20) {
                              arg8 -= arg1;
                              arg1 -= arg0;
                              arg0 = class211.field3196 * arg0;
                              if (var10) {
                                 if (!class566.method4266(0, arg0, class327.field4984, (arg3 >> 12) + 1, 116, arg4, (arg6 >> 12) + -1, var25)) {
                                    return false;
                                 }

                                 arg0 += class211.field3196;
                                 arg4 += var26;
                                 arg6 += var20;
                                 arg3 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (~arg1 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg0, class327.field4984, (arg3 >> 12) + 1, 114, arg4, (arg7 >> 12) - 1, var25)) {
                                                return false;
                                             }

                                             arg3 += var21;
                                             arg0 += class211.field3196;
                                             arg7 += var22;
                                             arg4 += var26;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (arg8 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg0, class327.field4984, (arg3 >> 12) + 1, 114, arg4, (arg7 >> 12) - 1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += var21;
                                             arg0 += class211.field3196;
                                             arg7 += var22;
                                             arg4 += var26;
                                          }
                                       }

                                       arg3 += var21;
                                    } else {
                                       if (!class566.method4266(0, arg0, class327.field4984, (arg3 >> 12) + 1, 116, arg4, (arg6 >> 12) + -1, var25)) {
                                          return false;
                                       }

                                       arg0 += class211.field3196;
                                       arg4 += var26;
                                       arg6 += var20;
                                       arg3 += var21;
                                    }
                                 }
                              }
                           } else {
                              arg8 -= arg1;
                              arg1 -= arg0;
                              arg0 = class211.field3196 * arg0;
                              if (var10) {
                                 if (!class566.method4266(0, arg0, class327.field4984, (arg6 >> 12) - -1, 110, arg4, (arg3 >> 12) - 1, var25)) {
                                    return false;
                                 }

                                 arg3 += var21;
                                 arg0 += class211.field3196;
                                 arg4 += var26;
                                 arg6 += var20;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (~arg1 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg0, class327.field4984, (arg7 >> 12) + 1, 115, arg4, (arg3 >> 12) - 1, var25)) {
                                                return false;
                                             }

                                             arg4 += var26;
                                             arg3 += var21;
                                             arg0 += class211.field3196;
                                             arg7 += var22;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (arg8 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg0, class327.field4984, (arg7 >> 12) + 1, 115, arg4, (arg3 >> 12) - 1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg4 += var26;
                                             arg3 += var21;
                                             arg0 += class211.field3196;
                                             arg7 += var22;
                                          }
                                       }

                                       arg6 += var20;
                                    } else {
                                       if (!class566.method4266(0, arg0, class327.field4984, (arg6 >> 12) - -1, 110, arg4, (arg3 >> 12) - 1, var25)) {
                                          return false;
                                       }

                                       arg3 += var21;
                                       arg0 += class211.field3196;
                                       arg4 += var26;
                                       arg6 += var20;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg7 = arg3 <<= 12;
                           if (~arg0 > -1) {
                              arg7 -= arg0 * var20;
                              arg3 -= arg0 * var21;
                              arg4 -= arg0 * var26;
                              arg0 = 0;
                           }

                           arg6 <<= 12;
                           if (arg8 < 0) {
                              arg6 -= arg8 * var22;
                              arg8 = 0;
                           }

                           if (~arg0 != ~arg8 && var20 < var21 || arg0 == arg8 && ~var20 < ~var22) {
                              arg1 -= arg8;
                              arg8 -= arg0;
                              arg0 = class211.field3196 * arg0;
                              if (var10) {
                                 if (!class566.method4266(0, arg0, class327.field4984, (arg3 >> 12) - -1, 113, arg4, (arg7 >> 12) + -1, var25)) {
                                    return false;
                                 }

                                 arg4 += var26;
                                 arg0 += class211.field3196;
                                 arg7 += var20;
                                 arg3 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (~arg8 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg0, class327.field4984, (arg6 >> 12) - -1, 118, arg4, (arg7 >> 12) + -1, var25)) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg6 += var22;
                                             arg4 += var26;
                                             arg0 += class211.field3196;
                                          }

                                          while(true) {
                                             --arg1;
                                             if (~arg1 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg0, class327.field4984, (arg6 >> 12) - -1, 118, arg4, (arg7 >> 12) + -1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg6 += var22;
                                             arg4 += var26;
                                             arg0 += class211.field3196;
                                          }
                                       }

                                       arg3 += var21;
                                    } else {
                                       if (!class566.method4266(0, arg0, class327.field4984, (arg3 >> 12) - -1, 113, arg4, (arg7 >> 12) + -1, var25)) {
                                          return false;
                                       }

                                       arg4 += var26;
                                       arg0 += class211.field3196;
                                       arg7 += var20;
                                       arg3 += var21;
                                    }
                                 }
                              }
                           } else {
                              arg1 -= arg8;
                              arg8 -= arg0;
                              arg0 = class211.field3196 * arg0;
                              if (var10) {
                                 if (!class566.method4266(0, arg0, class327.field4984, (arg7 >> 12) + 1, 122, arg4, (arg3 >> 12) - 1, var25)) {
                                    return false;
                                 }

                                 arg0 += class211.field3196;
                                 arg4 += var26;
                                 arg7 += var20;
                                 arg3 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (~arg8 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class566.method4266(0, arg0, class327.field4984, (arg7 >> 12) + 1, 125, arg4, (arg6 >> 12) + -1, var25)) {
                                                return false;
                                             }

                                             arg6 += var22;
                                             arg0 += class211.field3196;
                                             arg7 += var20;
                                             arg4 += var26;
                                          }

                                          while(true) {
                                             --arg1;
                                             if (arg1 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class566.method4266(0, arg0, class327.field4984, (arg7 >> 12) + 1, 125, arg4, (arg6 >> 12) + -1, var25);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg6 += var22;
                                             arg0 += class211.field3196;
                                             arg7 += var20;
                                             arg4 += var26;
                                          }
                                       }

                                       arg3 += var21;
                                    } else {
                                       if (!class566.method4266(0, arg0, class327.field4984, (arg7 >> 12) + 1, 122, arg4, (arg3 >> 12) - 1, var25)) {
                                          return false;
                                       }

                                       arg0 += class211.field3196;
                                       arg4 += var26;
                                       arg7 += var20;
                                       arg3 += var21;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if (~class105.field1456 >= ~arg8) {
                     return true;
                  } else {
                     arg5 = (arg5 << 8) + var25 + -(arg6 * var25);
                     if (~class105.field1456 > ~arg1) {
                        arg1 = class105.field1456;
                     }

                     if (arg0 > class105.field1456) {
                        arg0 = class105.field1456;
                     }

                     if (~arg1 <= ~arg0) {
                        arg7 = arg6 <<= 12;
                        arg3 <<= 12;
                        if (arg8 < 0) {
                           arg5 -= arg8 * var26;
                           arg6 -= arg8 * var22;
                           arg7 -= arg8 * var21;
                           arg8 = 0;
                        }

                        if (~arg0 > -1) {
                           arg3 -= arg0 * var20;
                           arg0 = 0;
                        }

                        if (var21 >= var22) {
                           arg1 -= arg0;
                           arg0 -= arg8;
                           arg8 = class211.field3196 * arg8;
                           if (var10) {
                              if (!class566.method4266(0, arg8, class327.field4984, (arg7 >> 12) + 1, 120, arg5, (arg6 >> 12) - 1, var25)) {
                                 return false;
                              }

                              arg7 += var21;
                              arg5 += var26;
                              arg6 += var22;
                              arg8 += class211.field3196;
                           }

                           while(true) {
                              while(true) {
                                 --arg0;
                                 if (arg0 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class566.method4266(0, arg8, class327.field4984, (arg3 >> 12) - -1, 119, arg5, (arg6 >> 12) + -1, var25)) {
                                             return false;
                                          }

                                          arg3 += var20;
                                          arg5 += var26;
                                          arg8 += class211.field3196;
                                          arg6 += var22;
                                       }

                                       while(true) {
                                          --arg1;
                                          if (~arg1 > -1) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class566.method4266(0, arg8, class327.field4984, (arg3 >> 12) - -1, 119, arg5, (arg6 >> 12) + -1, var25);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg3 += var20;
                                          arg5 += var26;
                                          arg8 += class211.field3196;
                                          arg6 += var22;
                                       }
                                    }

                                    arg8 += class211.field3196;
                                 } else {
                                    if (!class566.method4266(0, arg8, class327.field4984, (arg7 >> 12) + 1, 120, arg5, (arg6 >> 12) - 1, var25)) {
                                       return false;
                                    }

                                    arg7 += var21;
                                    arg5 += var26;
                                    arg6 += var22;
                                    arg8 += class211.field3196;
                                 }
                              }
                           }
                        } else {
                           arg1 -= arg0;
                           arg0 -= arg8;
                           arg8 = class211.field3196 * arg8;
                           if (var10) {
                              if (!class566.method4266(0, arg8, class327.field4984, (arg6 >> 12) + 1, 124, arg5, (arg7 >> 12) + -1, var25)) {
                                 return false;
                              }

                              arg7 += var21;
                              arg6 += var22;
                              arg5 += var26;
                              arg8 += class211.field3196;
                           }

                           while(true) {
                              while(true) {
                                 --arg0;
                                 if (arg0 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class566.method4266(0, arg8, class327.field4984, (arg6 >> 12) - -1, 114, arg5, (arg3 >> 12) + -1, var25)) {
                                             return false;
                                          }

                                          arg5 += var26;
                                          arg6 += var22;
                                          arg8 += class211.field3196;
                                          arg3 += var20;
                                       }

                                       while(true) {
                                          --arg1;
                                          if (~arg1 > -1) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class566.method4266(0, arg8, class327.field4984, (arg6 >> 12) - -1, 114, arg5, (arg3 >> 12) + -1, var25);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg5 += var26;
                                          arg6 += var22;
                                          arg8 += class211.field3196;
                                          arg3 += var20;
                                       }
                                    }

                                    arg8 += class211.field3196;
                                 } else {
                                    if (!class566.method4266(0, arg8, class327.field4984, (arg6 >> 12) + 1, 124, arg5, (arg7 >> 12) + -1, var25)) {
                                       return false;
                                    }

                                    arg7 += var21;
                                    arg6 += var22;
                                    arg5 += var26;
                                    arg8 += class211.field3196;
                                 }
                              }
                           }
                        }
                     } else {
                        arg3 = arg6 <<= 12;
                        arg7 <<= 12;
                        if (arg8 < 0) {
                           arg3 -= arg8 * var21;
                           arg5 -= arg8 * var26;
                           arg6 -= arg8 * var22;
                           arg8 = 0;
                        }

                        if (~arg1 > -1) {
                           arg7 -= arg1 * var20;
                           arg1 = 0;
                        }

                        if (var21 >= var22) {
                           arg0 -= arg1;
                           arg1 -= arg8;
                           arg8 = class211.field3196 * arg8;
                           if (var10) {
                              if (!class566.method4266(0, arg8, class327.field4984, (arg3 >> 12) + 1, 115, arg5, (arg6 >> 12) + -1, var25)) {
                                 return false;
                              }

                              arg3 += var21;
                              arg5 += var26;
                              arg8 += class211.field3196;
                              arg6 += var22;
                           }

                           while(true) {
                              while(true) {
                                 --arg1;
                                 if (~arg1 > -1) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class566.method4266(0, arg8, class327.field4984, (arg3 >> 12) + 1, 120, arg5, (arg7 >> 12) + -1, var25)) {
                                             return false;
                                          }

                                          arg7 += var20;
                                          arg5 += var26;
                                          arg3 += var21;
                                          arg8 += class211.field3196;
                                       }

                                       while(true) {
                                          --arg0;
                                          if (arg0 < 0) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class566.method4266(0, arg8, class327.field4984, (arg3 >> 12) + 1, 120, arg5, (arg7 >> 12) + -1, var25);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg7 += var20;
                                          arg5 += var26;
                                          arg3 += var21;
                                          arg8 += class211.field3196;
                                       }
                                    }

                                    arg6 += var22;
                                 } else {
                                    if (!class566.method4266(0, arg8, class327.field4984, (arg3 >> 12) + 1, 115, arg5, (arg6 >> 12) + -1, var25)) {
                                       return false;
                                    }

                                    arg3 += var21;
                                    arg5 += var26;
                                    arg8 += class211.field3196;
                                    arg6 += var22;
                                 }
                              }
                           }
                        } else {
                           arg0 -= arg1;
                           arg1 -= arg8;
                           arg8 = class211.field3196 * arg8;
                           if (var10) {
                              if (!class566.method4266(0, arg8, class327.field4984, (arg6 >> 12) - -1, 122, arg5, (arg3 >> 12) + -1, var25)) {
                                 return false;
                              }

                              arg6 += var22;
                              arg5 += var26;
                              arg8 += class211.field3196;
                              arg3 += var21;
                           }

                           while(true) {
                              while(true) {
                                 --arg1;
                                 if (~arg1 > -1) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class566.method4266(0, arg8, class327.field4984, (arg7 >> 12) + 1, 126, arg5, (arg3 >> 12) - 1, var25)) {
                                             return false;
                                          }

                                          arg7 += var20;
                                          arg8 += class211.field3196;
                                          arg5 += var26;
                                          arg3 += var21;
                                       }

                                       while(true) {
                                          --arg0;
                                          if (arg0 < 0) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class566.method4266(0, arg8, class327.field4984, (arg7 >> 12) + 1, 126, arg5, (arg3 >> 12) - 1, var25);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg7 += var20;
                                          arg8 += class211.field3196;
                                          arg5 += var26;
                                          arg3 += var21;
                                       }
                                    }

                                    arg3 += var21;
                                 } else {
                                    if (!class566.method4266(0, arg8, class327.field4984, (arg6 >> 12) - -1, 122, arg5, (arg3 >> 12) + -1, var25)) {
                                       return false;
                                    }

                                    arg6 += var22;
                                    arg5 += var26;
                                    arg8 += class211.field3196;
                                    arg3 += var21;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var28) {
         throw class482.method3757(var28, field3530[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1983(int arg0) {
      try {
         ++field3524;
         class259.field4270.method748(116);
         class326.field4957 = 1;
         class489.field7417 = null;
         class218.field3277 = null;
         if (arg0 != -24192) {
            method1982(19, -7, -118, -10, 69, 110, -58, 95, -49, -102);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3530[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public void method284(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            ++field3522;
            if (arg1) {
               int var3 = this.field3521.field6345.method5105(118, class154.field2293, this.field3526.method2106()) + this.field3521.field6342;
               int var4 = this.field3521.field6334.method5508(67, class445.field6835, this.field3526.method2108()) + this.field3521.field6337;
               this.field3526.method4959(var3, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3530[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method285(byte arg0) {
      try {
         ++field3529;
         return arg0 != 8 ? false : this.field3518.method5002(this.field3521.field6344, (byte)127);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3530[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "<init>",
      descriptor = "(Lrr;Ltda;)V"
   )
   public class230(class678 arg0, class407 arg1) {
      try {
         this.field3518 = arg0;
         this.field3521 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3530[6] + (arg0 != null ? field3530[5] : field3530[4]) + ',' + (arg1 != null ? field3530[5] : field3530[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1984(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1985(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
