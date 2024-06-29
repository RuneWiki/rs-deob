import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class641 extends class25 {
   @OriginalMember(
      owner = "client!mfa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9345 = new String[]{method4612(method4611("\u000b\u0010= iN")), method4612(method4611("\b\u00030b")), method4612(method4611("Z\u00153b\u001f\u0000\u0010e>\u0016VH")), method4612(method4611("F[b.\u001e\u0005\u001903D\u0000Ol:\u0012X")), method4612(method4611("\u001dXr _")), method4612(method4611("\u000b\u0010= sN")), method4612(method4611("Z\u00153b\u001fVF:hD\u0000H")), method4612(method4611("F[b")), method4612(method4611("F[b.\u001e\u0005\u001903\u0012V\u0010:hDX")), method4612(method4611("\u000b\u0010= kN")), method4612(method4611("\u000b\u0010= oN")), method4612(method4611("\u000b\u0010= pN")), method4612(method4611("\u000b\u0010= nN")), method4612(method4611("\u000b\u0010= hN")), method4612(method4611("\u000b\u0010= gN"))};
   @OriginalMember(
      owner = "client!mfa",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field9340 = new int[32];
   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "I"
   )
   public static int field9331;
   @OriginalMember(
      owner = "client!mfa",
      name = "s",
      descriptor = "I"
   )
   public static int field9332;
   @OriginalMember(
      owner = "client!mfa",
      name = "u",
      descriptor = "I"
   )
   public static int field9334;
   @OriginalMember(
      owner = "client!mfa",
      name = "C",
      descriptor = "I"
   )
   public static int field9338;
   @OriginalMember(
      owner = "client!mfa",
      name = "B",
      descriptor = "I"
   )
   public static int field9339;
   @OriginalMember(
      owner = "client!mfa",
      name = "y",
      descriptor = "I"
   )
   public static int field9342;
   @OriginalMember(
      owner = "client!mfa",
      name = "x",
      descriptor = "I"
   )
   public static int field9343;
   @OriginalMember(
      owner = "client!mfa",
      name = "v",
      descriptor = "Lat;"
   )
   private class396 field9333;
   @OriginalMember(
      owner = "client!mfa",
      name = "p",
      descriptor = "Lat;"
   )
   private class396 field9335;
   @OriginalMember(
      owner = "client!mfa",
      name = "t",
      descriptor = "Lat;"
   )
   private class396 field9336;
   @OriginalMember(
      owner = "client!mfa",
      name = "A",
      descriptor = "Lat;"
   )
   private class396 field9337;
   @OriginalMember(
      owner = "client!mfa",
      name = "w",
      descriptor = "Lat;"
   )
   public class396 field9341;
   @OriginalMember(
      owner = "client!mfa",
      name = "r",
      descriptor = "Lat;"
   )
   private class396 field9344;

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "(Leaa;Leaa;Lmg;)V"
   )
   public class641(class526 arg0, class526 arg1, class158 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4607(int arg0, int arg1, int arg2) {
      try {
         label33: {
            ++field9342;
            if (class489.field7224 == class180.field2219) {
               if (class105.method899(1, 0, false, -2, arg2, 0, 0, 1, arg1)) {
                  return;
               }

               class105.method899(1, 0, false, -3, arg2, 0, 0, 1, arg1);
               if (client.field4530 == 0) {
                  break label33;
               }
            }

            if (class105.method899(1, 0, false, -3, arg2, 0, 0, 1, arg1)) {
               return;
            }

            class105.method899(1, 0, false, -2, arg2, 0, 0, 1, arg1);
         }

         if (arg0 >= -5) {
            field9340 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9345[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method165(int arg0) {
      try {
         super.method165(arg0);
         ++field9332;
         class158 var2 = (class158)super.field263;
         this.field9341 = class256.method1940(var2.field2010, super.field270, arg0 + -25559);
         this.field9335 = class256.method1940(var2.field2011, super.field270, arg0 ^ 25649);
         this.field9337 = class256.method1940(var2.field2006, super.field270, arg0 + -25577);
         this.field9336 = class256.method1940(var2.field2005, super.field270, 104);
         this.field9344 = class256.method1940(var2.field2012, super.field270, arg0 + -25562);
         this.field9333 = class256.method1940(var2.field2013, super.field270, 119);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9345[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(ILha;II)V"
   )
   public static final void method4608(int arg0, class66 arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field9338;
         if (arg2 >= 0 && arg3 >= 0 && class230.field2932 != 0 && class425.field6453 != 0) {
            class540 var5;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            label706: {
               if (class446.field6785) {
                  class54.method428(false, (byte)-103);
                  var5 = arg1.method656();
                  int[] var6 = arg1.method576();
                  var7 = var6[3];
                  var8 = var6[0];
                  var9 = var6[2];
                  var10 = var6[1];
                  var11 = arg2 + class698.method5064(0, false);
                  var12 = arg3 + class748.method5459(629165702, false);
                  if (var4 == 0) {
                     break label706;
                  }
               }

               arg1.method630(class610.field8935, class555.field8227, class230.field2932, class425.field6453);
               var7 = class425.field6453;
               var9 = class230.field2932;
               var10 = class555.field8227;
               var8 = class610.field8935;
               arg1.method554(class388.field5934, class590.field8726, class230.field2932, class425.field6453);
               var5 = arg1.method559();
               var5.method1518(class591.field8736, class302.field4316, class596.field8780, class436.field6659, class397.field6105, class491.field7257);
               var12 = arg3;
               arg1.method550(var5);
               var11 = arg2;
            }

            class746.method5436(true, (byte)35);
            if (~var7 == -1) {
               var7 = 1;
            }

            if (var9 == 0) {
               var9 = 1;
            }

            if (class147.field1843 != null && (!class367.field5530 || ~(class427.field6529 & 64) != -1)) {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               label692: {
                  var13 = -1;
                  var14 = -1;
                  var15 = arg1.method635();
                  var16 = arg1.method639();
                  if (!class88.field1076) {
                     var17 = (var12 - var10) * var15 / var7;
                     var18 = (var11 - var8) * var15 / var9;
                     var19 = (var11 - var8) * var16 / var9;
                     var20 = (-var10 + var12) * var16 / var7;
                     if (var4 == 0) {
                        break label692;
                     }
                  }

                  var17 = var20 = (-var10 + var12) * class221.field2828 / var7;
                  var18 = var19 = (var11 - var8) * class221.field2828 / var9;
               }

               int[] var21 = new int[]{var18, var17, var15};
               var5.method1528(var21);
               int[] var22 = new int[]{var19, var20, var16};
               var5.method1528(var22);
               float var23 = class680.method4957((float)var22[0], (float)var22[1], (byte)-126, (float)var22[2], (float)var21[2], (float)var21[0], (float)var21[1], 4);
               if (var23 > 0.0F) {
                  int var24 = var22[0] + -var21[0];
                  int var25 = var22[2] + -var21[2];
                  int var26 = (int)((float)var24 * var23 + (float)var21[0]);
                  int var27 = (int)((float)var25 * var23 + (float)var21[2]);
                  var13 = (-1 + class693.field10418.method3046(-23) << 8) + var26 >> 9;
                  var14 = (class693.field10418.method3046(-120) - 1 << 8) + var27 >> 9;
                  byte var28 = class693.field10418.field9010;
                  if (var28 < 3 && (2 & class65.field797[1][var26 >> 9][var27 >> 9]) != 0) {
                     int var90 = var28 + 1;
                  }
               }

               if (var13 != -1 && var14 != -1) {
                  label788: {
                     if (!class367.field5530 || ~(64 & class427.field6529) == -1) {
                        if (class786.field11438) {
                           class466.method3485(class204.field2591.method1562((byte)-99, class728.field10827), 25, var14, true, -1, true, "", false, true, -1, (long)(var13 << 0 | var14), 0L, var13);
                        }

                        class466.method3485(class187.field2341, 48, var14, true, class149.field1861, true, "", false, true, -1, (long)(var14 | var13 << 0), 0L, var13);
                        ++class102.field1250;
                        if (var4 == 0) {
                           break label788;
                        }
                     }

                     class544 var29 = class241.method1793(~arg0, class200.field2500, class209.field2658);
                     if (var29 == null) {
                        class8.method76(30687);
                        if (var4 == 0) {
                           break label788;
                        }
                     }

                     class466.method3485(class84.field1033, 57, var14, true, class30.field330, true, field9345[7], false, true, -1, (long)(var14 | var13 << 0), 0L, var13);
                  }
               }
            }

            if (class446.field6785) {
               class284.method2171(8);
            }

            if (arg0 != 0) {
               method4607(-65, -81, -84);
            }

            int var30 = 0;
            int var10000;
            int var10001;
            if (var4 == 0) {
               var10000 = ~var30;
               if (!class446.field6785) {
                  var10001 = 1;
                  if (var4 == 0) {
                     var10001 = ~1;
                  }
               } else {
                  var10001 = ~2;
               }

               if (var10000 <= var10001) {
                  class746.method5436(false, (byte)35);
                  return;
               }
            }

            do {
               boolean var31 = ~var30 == -1;
               class710 var32 = var31 ? class499.field7394 : class366.field5511;
               int var33 = arg2;
               int var34 = arg3;
               if (class446.field6785) {
                  class54.method428(var31, (byte)-123);
                  var33 = arg2 + class698.method5064(0, var31);
                  var34 = arg3 + class748.method5459(629165702, var31);
               }

               boolean var91;
               label666: {
                  class14 var35 = var32.field10598;
                  class319 var36 = (class319)var35.method102(19230);
                  if (var4 != 0) {
                     var91 = class15.field186;
                  } else if (var36 == null) {
                     var91 = class446.field6785;
                     if (var4 == 0) {
                        break label666;
                     }
                  } else {
                     var91 = class15.field186;
                  }

                  while(true) {
                     if ((var91 || ~class693.field10418.field9010 == ~var36.field4565.field9010) && var36.method2422(var33, (byte)86, arg1, var34)) {
                        label743: {
                           boolean var37 = false;
                           boolean var38 = false;
                           int var39;
                           int var40;
                           if (!(var36.field4565 instanceof class741)) {
                              var39 = var36.field4565.field9003 >> 9;
                              var40 = var36.field4565.field9007 >> 9;
                              if (var4 != 0) {
                                 var39 = ((class741)var36.field4565).field10995;
                                 var40 = ((class741)var36.field4565).field11000;
                              }
                           } else {
                              var39 = ((class741)var36.field4565).field10995;
                              var40 = ((class741)var36.field4565).field11000;
                           }

                           if (var36.field4565 instanceof class687) {
                              class687 var41 = (class687)var36.field4565;
                              int var42 = var41.method3046(127);
                              if (~(1 & var42) == -1 && ~(511 & var41.field9003) == -1 && (var41.field9007 & 511) == 0 || ~(var42 & 1) == -2 && ~(var41.field9003 & 511) == -257 && (var41.field9007 & 511) == 256) {
                                 int var43 = var41.field9003 - (-1 + var41.method3046(111) << 8);
                                 int var44 = var41.field9007 - (-1 + var41.method3046(arg0 + 108) << 8);
                                 int var45 = 0;
                                 if (var4 != 0 || var45 < class159.field2021) {
                                    do {
                                       class726 var46 = (class726)class259.field3509.method5681((long)class115.field1381[var45], -1);
                                       if (var46 != null) {
                                          class155 var47 = var46.field10794;
                                          if (~class314.field4488 != ~var47.field6076) {
                                             if (!var47.field6025 && var4 == 0) {
                                                ++var45;
                                             } else {
                                                int var48 = var47.field9003 - (var47.field1971.field5589 + -1 << 8);
                                                int var49 = -(var47.field1971.field5589 - 1 << 8) + var47.field9007;
                                                if (var48 >= var43 && var47.field1971.field5589 <= var41.method3046(arg0 + -63) - (-var43 + var48 >> 9) && ~var49 <= ~var44 && var47.field1971.field5589 <= var41.method3046(arg0 + -56) + -(-var44 + var49 >> 9)) {
                                                   class519.method3824(127, class693.field10418.field9010 != var36.field4565.field9010, var47);
                                                   var47.field6076 = class314.field4488;
                                                }

                                                ++var45;
                                             }
                                          } else {
                                             ++var45;
                                          }
                                       } else {
                                          ++var45;
                                       }
                                    } while(var45 < class159.field2021);
                                 }

                                 int var50 = class287.field4026;
                                 int[] var51 = class33.field372;
                                 int var52 = 0;
                                 if (var4 != 0 || var50 > var52) {
                                    do {
                                       class687 var53 = class661.field9578[var51[var52]];
                                       if (var53 != null) {
                                          if (class314.field4488 != var53.field6076) {
                                             if (var41 != var53) {
                                                if (!var53.field6025 && var4 == 0) {
                                                   ++var52;
                                                } else {
                                                   int var54 = var53.field9003 + -(-1 + var53.method3046(arg0 + -67) << 8);
                                                   int var55 = var53.field9007 - (var53.method3046(arg0 + 104) + -1 << 8);
                                                   if (~var54 <= ~var43 && ~var53.method3046(arg0 ^ -126) >= ~(var41.method3046(-102) - (-var43 + var54 >> 9)) && var44 <= var55 && ~var53.method3046(105) >= ~(-(-var44 + var55 >> 9) + var41.method3046(-120))) {
                                                      class253.method1911(var53, (byte)118, ~class693.field10418.field9010 != ~var36.field4565.field9010);
                                                      var53.field6076 = class314.field4488;
                                                   }

                                                   ++var52;
                                                }
                                             } else {
                                                ++var52;
                                             }
                                          } else {
                                             ++var52;
                                          }
                                       } else {
                                          ++var52;
                                       }
                                    } while(var50 > var52);
                                 }
                              }

                              if (~class314.field4488 == ~var41.field6076) {
                                 break label743;
                              }

                              class253.method1911(var41, (byte)121, ~class693.field10418.field9010 != ~var36.field4565.field9010);
                              var41.field6076 = class314.field4488;
                           }

                           if (var36.field4565 instanceof class155) {
                              class155 var56 = (class155)var36.field4565;
                              if (var56.field1971 != null) {
                                 if (~(var56.field1971.field5589 & 1) == -1 && (var56.field9003 & 511) == 0 && ~(var56.field9007 & 511) == -1 || ~(1 & var56.field1971.field5589) == -2 && ~(511 & var56.field9003) == -257 && (511 & var56.field9007) == 256) {
                                    int var57 = -(var56.field1971.field5589 + -1 << 8) + var56.field9003;
                                    int var58 = -(var56.field1971.field5589 + -1 << 8) + var56.field9007;
                                    int var59 = 0;
                                    if (var4 != 0 || ~var59 > ~class159.field2021) {
                                       do {
                                          class726 var60 = (class726)class259.field3509.method5681((long)class115.field1381[var59], arg0 + -1);
                                          if (var60 != null) {
                                             class155 var61 = var60.field10794;
                                             if (class314.field4488 != var61.field6076) {
                                                if (var56 != var61) {
                                                   if (!var61.field6025 && var4 == 0) {
                                                      ++var59;
                                                   } else {
                                                      int var62 = -(var61.field1971.field5589 + -1 << 8) + var61.field9003;
                                                      int var63 = -(var61.field1971.field5589 + -1 << 8) + var61.field9007;
                                                      if (~var62 <= ~var57 && var61.field1971.field5589 <= -(-var57 + var62 >> 9) + var56.field1971.field5589 && ~var63 <= ~var58 && var61.field1971.field5589 <= -(-var58 + var63 >> 9) + var56.field1971.field5589) {
                                                         class519.method3824(arg0 + 125, ~class693.field10418.field9010 != ~var36.field4565.field9010, var61);
                                                         var61.field6076 = class314.field4488;
                                                      }

                                                      ++var59;
                                                   }
                                                } else {
                                                   ++var59;
                                                }
                                             } else {
                                                ++var59;
                                             }
                                          } else {
                                             ++var59;
                                          }
                                       } while(~var59 > ~class159.field2021);
                                    }

                                    int var64 = class287.field4026;
                                    int[] var65 = class33.field372;
                                    int var66 = 0;
                                    if (var4 != 0 || var66 < var64) {
                                       do {
                                          class687 var67 = class661.field9578[var65[var66]];
                                          if (var67 != null) {
                                             if (~class314.field4488 != ~var67.field6076) {
                                                if (!var67.field6025 && var4 == 0) {
                                                   ++var66;
                                                } else {
                                                   int var68 = var67.field9003 + -(-1 + var67.method3046(-87) << 8);
                                                   int var69 = var67.field9007 - (var67.method3046(-39) + -1 << 8);
                                                   if (~var57 >= ~var68 && ~var67.method3046(120) >= ~(-(-var57 + var68 >> 9) + var56.field1971.field5589) && var69 >= var58 && var67.method3046(arg0 + 103) <= -(-var58 + var69 >> 9) + var56.field1971.field5589) {
                                                      class253.method1911(var67, (byte)13, class693.field10418.field9010 != var36.field4565.field9010);
                                                      var67.field6076 = class314.field4488;
                                                   }

                                                   ++var66;
                                                }
                                             } else {
                                                ++var66;
                                             }
                                          } else {
                                             ++var66;
                                          }
                                       } while(var66 < var64);
                                    }
                                 }

                                 if (class314.field4488 == var56.field6076) {
                                    break label743;
                                 }

                                 class519.method3824(126, class693.field10418.field9010 != var36.field4565.field9010, var56);
                                 var56.field6076 = class314.field4488;
                              }
                           }

                           if (var36.field4565 instanceof class628) {
                              int var70 = class718.field10676 + var39;
                              int var71 = class669.field10064 + var40;
                              class167 var72 = (class167)class561.field8393.method5681((long)(var70 | var71 << 14 | var36.field4565.field9010 << 28), -1);
                              if (var72 != null) {
                                 int var73 = 0;
                                 class738 var74 = (class738)var72.field2084.method4061(false);
                                 if (var4 != 0 || var74 != null) {
                                    do {
                                       class91 var75 = class54.field616.method1689(var74.field10955, (byte)-75);
                                       if (class367.field5530 && ~class693.field10418.field9010 == ~var36.field4565.field9010) {
                                          class457 var76 = class662.field9596 == -1 ? null : class170.field2105.method3799(-122, class662.field9596);
                                          if ((1 & class427.field6529) != 0 && (var76 == null || ~var75.method839(var76.field6933, true, class662.field9596) != ~var76.field6933)) {
                                             class466.method3485(class84.field1033, 45, var40, true, class30.field330, false, class769.field11280 + field9345[3] + var75.field1138, false, true, -1, (long)var73, (long)var74.field10955, var39);
                                             ++class308.field4375;
                                          }
                                       }

                                       if (class693.field10418.field9010 == var36.field4565.field9010) {
                                          String[] var77 = var75.field1088;
                                          int var78 = 4;
                                          if (var4 != 0 || ~var78 <= -1) {
                                             do {
                                                if (var77 != null && var77[var78] != null) {
                                                   byte var79 = 0;
                                                   if (~var78 == -1) {
                                                      var79 = 58;
                                                   }

                                                   int var80 = class213.field2705;
                                                   if (~var78 == -2) {
                                                      var79 = 22;
                                                   }

                                                   if (var78 == 2) {
                                                      var79 = 2;
                                                   }

                                                   if (var78 == 3) {
                                                      var79 = 44;
                                                   }

                                                   if (var78 == 4) {
                                                      var79 = 3;
                                                   }

                                                   if (var75.field1092 == var78) {
                                                      var80 = var75.field1122;
                                                   }

                                                   if (~var75.field1159 == ~var78) {
                                                      var80 = var75.field1099;
                                                   }

                                                   ++class311.field4420;
                                                   class466.method3485(var77[var78], var79, var40, true, var80, false, field9345[2] + var75.field1138, false, true, -1, (long)var73, (long)var74.field10955, var39);
                                                }

                                                --var78;
                                             } while(~var78 <= -1);
                                          }
                                       }

                                       ++class732.field10858;
                                       class466.method3485(class204.field2586.method1562((byte)-120, class728.field10827), 1001, var40, true, class202.field2537, false, field9345[2] + var75.field1138, ~class693.field10418.field9010 != ~var36.field4565.field9010, true, -1, (long)var73, (long)var74.field10955, var39);
                                       var74 = (class738)var72.field2084.method4064(14);
                                       ++var73;
                                    } while(var74 != null);
                                 }
                              }
                           }

                           if (var36.field4565 instanceof class86) {
                              class86 var81 = (class86)var36.field4565;
                              class557 var82 = class151.field1896.method5072(30, var81.method350(arg0 + 25061));
                              if (var82.field8320 != null) {
                                 var82 = var82.method4125(class597.field8793, 84);
                              }

                              if (var82 != null) {
                                 if (class367.field5530 && ~class693.field10418.field9010 == ~var36.field4565.field9010) {
                                    class457 var83 = class662.field9596 == -1 ? null : class170.field2105.method3799(arg0 ^ -126, class662.field9596);
                                    if ((class427.field6529 & 4) != 0 && (var83 == null || var82.method4124(class662.field9596, 180, var83.field6933) != var83.field6933)) {
                                       ++class479.field7109;
                                       class466.method3485(class84.field1033, 49, var40, true, class30.field330, false, class769.field11280 + field9345[8] + var82.field8311, false, true, -1, (long)var81.hashCode(), class424.method3224(var40, var81, var39, 18774), var39);
                                    }
                                 }

                                 if (~class693.field10418.field9010 == ~var36.field4565.field9010) {
                                    String[] var84 = var82.field8298;
                                    if (var84 != null) {
                                       int var85 = 4;
                                       if (var4 != 0 || var85 >= 0) {
                                          do {
                                             if (var84[var85] != null) {
                                                short var86 = 0;
                                                int var87 = class213.field2705;
                                                if (var85 == 0) {
                                                   var86 = 30;
                                                }

                                                if (~var85 == -2) {
                                                   var86 = 5;
                                                }

                                                if (var85 == 2) {
                                                   var86 = 15;
                                                }

                                                if (var85 == 3) {
                                                   var86 = 8;
                                                }

                                                if (~var82.field8344 == ~var85) {
                                                   var87 = var82.field8318;
                                                }

                                                if (~var85 == -5) {
                                                   var86 = 1011;
                                                }

                                                if (~var82.field8284 == ~var85) {
                                                   var87 = var82.field8289;
                                                }

                                                ++class491.field7253;
                                                class466.method3485(var84[var85], var86, var40, true, var87, false, field9345[6] + var82.field8311, false, true, -1, (long)var81.hashCode(), class424.method3224(var40, var81, var39, 18774), var39);
                                             }

                                             --var85;
                                          } while(var85 >= 0);
                                       }
                                    }

                                    class466.method3485(class204.field2586.method1562((byte)-128, class728.field10827), 1009, var40, true, class202.field2537, false, field9345[6] + var82.field8311, ~class693.field10418.field9010 != ~var36.field4565.field9010, true, -1, (long)var81.hashCode(), (long)var82.field8274, var39);
                                    ++class467.field7003;
                                 }
                              }
                           }
                        }
                     }

                     var36 = (class319)var35.method95((byte)121);
                     if (var36 == null) {
                        var91 = class446.field6785;
                        if (var4 == 0) {
                           break;
                        }
                     } else {
                        var91 = class15.field186;
                     }
                  }
               }

               if (var91) {
                  class284.method2171(8);
               }

               ++var30;
               var10000 = ~var30;
               if (!class446.field6785) {
                  var10001 = 1;
                  if (var4 == 0) {
                     var10001 = ~1;
                  }
               } else {
                  var10001 = ~2;
               }
            } while(var10000 > var10001);

            class746.method5436(false, (byte)35);
         }
      } catch (RuntimeException var89) {
         throw class670.method4877(var89, field9345[5] + arg0 + ',' + (arg1 != null ? field9345[4] : field9345[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method168(boolean arg0) {
      try {
         ++field9343;
         if (!super.method168(arg0)) {
            return false;
         } else if (arg0) {
            return true;
         } else {
            class158 var2 = (class158)super.field263;
            if (!super.field270.method3884((byte)-99, var2.field2010)) {
               return false;
            } else if (!super.field270.method3884((byte)-99, var2.field2011)) {
               return false;
            } else if (!super.field270.method3884((byte)-99, var2.field2006)) {
               return false;
            } else if (!super.field270.method3884((byte)-99, var2.field2005)) {
               return false;
            } else if (!super.field270.method3884((byte)-99, var2.field2012)) {
               return false;
            } else {
               return super.field270.method3884((byte)-99, var2.field2013);
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9345[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4609(int arg0) {
      try {
         if (arg0 <= 55) {
            field9340 = null;
         }

         field9340 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9345[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public void method4610(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg3 == -1) {
            ++field9331;
            this.field9341.method3032(arg4, arg0, arg2, arg1);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9345[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(IIBZ)V"
   )
   public final void method169(int arg0, int arg1, byte arg2, boolean arg3) {
      try {
         ++field9334;
         int var5 = arg1 - -this.field9337.method1971();
         int var6 = super.field263.field5645 + arg1 + -this.field9336.method1971();
         int var7 = this.field9344.method1975() + arg0;
         int var8 = super.field263.field5637 + arg0 + -this.field9333.method1975();
         int var9 = -116 % ((arg2 - 16) / 58);
         int var10 = -var5 + var6;
         int var11 = var8 - var7;
         int var12 = this.method164((byte)124) * var10 / 10000;
         int[] var13 = new int[4];
         class786.field11439.method618(var13);
         class786.field11439.method554(var5, var7, var5 - -var12, var8);
         this.method4610(var7, var11, var10, -1, var5);
         class786.field11439.method554(var5 + var12, var7, var6, var8);
         this.field9335.method3032(var5, var7, var10, var11);
         class786.field11439.method554(var13[0], var13[1], var13[2], var13[3]);
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field9345[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(IZBI)V"
   )
   public final void method171(int arg0, boolean arg1, byte arg2, int arg3) {
      try {
         if (arg2 <= 6) {
            method4607(-20, -18, -25);
         }

         ++field9339;
         if (arg1) {
            int[] var5 = new int[4];
            class786.field11439.method618(var5);
            class786.field11439.method554(arg0, arg3, arg0 - -super.field263.field5645, super.field263.field5637 + arg3);
            int var6 = this.field9337.method1971();
            int var7 = this.field9337.method1975();
            int var8 = this.field9336.method1971();
            int var9 = this.field9336.method1975();
            this.field9337.method3035(arg0, (super.field263.field5637 - var7) / 2 + arg3);
            this.field9336.method3035(-var8 + super.field263.field5645 + arg0, (-var9 + super.field263.field5637) / 2 + arg3);
            class786.field11439.method554(arg0, arg3, super.field263.field5645 + arg0, this.field9344.method1975() + arg3);
            this.field9344.method3032(arg0 + var6, arg3, -var6 + super.field263.field5645 + -var8, super.field263.field5637);
            int var10 = this.field9333.method1975();
            class786.field11439.method554(arg0, arg3 - (-super.field263.field5637 + var10), super.field263.field5645 + arg0, arg3 - -super.field263.field5637);
            this.field9333.method3032(arg0 + var6, -var10 + super.field263.field5637 + arg3, -var6 + -var8 + super.field263.field5645, super.field263.field5637);
            class786.field11439.method554(var5[0], var5[1], var5[2], var5[3]);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field9345[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4611(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4612(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
