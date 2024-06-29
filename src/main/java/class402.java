import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class402 extends class403 {
   @OriginalMember(
      owner = "client!fha",
      name = "k",
      descriptor = "[Lfu;"
   )
   public class414[] field5641;
   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5646 = new String[]{method3049(method3048("|:8\u0013rs<0Ip2")), method3049(method3048("a|w\u00133")), method3049(method3048("t'5Q")), method3049(method3048("|:8\u0013\r2")), method3049(method3048("|:8\u0013\u000f2")), method3049(method3048("|:8\u0013\f2")), method3049(method3048("|:8\u0013\u000b2")), method3049(method3048("|:8\u0013\n2"))};
   @OriginalMember(
      owner = "client!fha",
      name = "m",
      descriptor = "Lbga;"
   )
   public static class378 field5638 = new class378(17, 6);
   @OriginalMember(
      owner = "client!fha",
      name = "f",
      descriptor = "Lbga;"
   )
   public static class378 field5644 = new class378(95, 6);
   @OriginalMember(
      owner = "client!fha",
      name = "l",
      descriptor = "I"
   )
   public static int field5639;
   @OriginalMember(
      owner = "client!fha",
      name = "g",
      descriptor = "I"
   )
   public static int field5640;
   @OriginalMember(
      owner = "client!fha",
      name = "j",
      descriptor = "I"
   )
   public static int field5642;
   @OriginalMember(
      owner = "client!fha",
      name = "h",
      descriptor = "I"
   )
   public static int field5643;
   @OriginalMember(
      owner = "client!fha",
      name = "i",
      descriptor = "Lb;"
   )
   public static class354 field5645;

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Lvi;B)V"
   )
   public static final void method3043(class569 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "([I[I[I[[[BIIZIZIII[IB[IBII)V"
   )
   public static final void method3044(int[] arg0, int[] arg1, int[] arg2, byte[][][] arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int[] arg12, byte arg13, int[] arg14, byte arg15, int arg16, int arg17) {
      boolean var18 = client.field4273;

      try {
         ++field5640;
         if (~class616.field8588 != 0) {
            int[] var19 = class633.field8958.method599();
            int var20 = var19[0];
            int var21 = var19[1];
            int var22 = var19[2];
            int var23 = var19[3];
            int var24 = var22;
            int var25 = -48 % ((-11 - arg15) / 33);
            int var26 = var23;
            if (class616.field8588 == 1) {
               var24 = (int)((double)class314.field4187 * (double)var22 / (double)class459.field6289);
               var26 = (int)((double)class314.field4187 * (double)var23 / (double)class459.field6289);
            }

            if (!class591.field8180) {
               label403: {
                  if (~class616.field8588 == -2) {
                     class543.method3925(24933);
                  }

                  int var27 = -class720.field10554 + arg5;
                  int var28 = -class114.field1416 + arg16;
                  int var29 = -class442.field6132 + arg4;
                  int var30 = (int)(((double)var29 * class433.field6036 + (double)var27 * class364.field5144 + (double)var28 * class603.field8411) * (double)var24 / (double)arg9);
                  int var31 = (int)(((double)var29 * class527.field7207 + (double)var27 * class456.field6255 + (double)var28 * class600.field8374) * (double)var26 / (double)arg9);
                  double var32 = (double)var29 * class486.field6704 + (double)var27 * class107.field1369 + (double)var28 * class468.field6454;
                  int var34 = class167.field2111 - class516.field7089 + var30;
                  int var35 = class292.field3853 - (-var31 + class446.field6178);
                  int var36 = var34 - -class192.field2343;
                  int var37 = class314.field4187 + var35;
                  if (var34 >= 0 && var35 >= 0 && var36 <= class40.field462 && class459.field6289 >= var37 || ~class616.field8588 == -3) {
                     if (class616.field8588 == 2) {
                        class28.field348 = -var32;
                     }

                     class347.field4984 = var34;
                     class384.field5398 = var35;
                     if (!var18) {
                        break label403;
                     }
                  }

                  if (~var36 >= -1 || var37 <= 0 || class40.field462 <= var34 || ~var35 <= ~class459.field6289) {
                     class591.field8180 = true;
                     if (!var18) {
                        break label403;
                     }
                  }

                  int var40;
                  int var41;
                  int var42;
                  int var43;
                  double var44;
                  label324: {
                     int var38 = var34 - class167.field2111;
                     int var39 = -class292.field3853 + var35;
                     var40 = 0;
                     var41 = 0;
                     var42 = 0;
                     var43 = 0;
                     var44 = 0.0D;
                     if (~class616.field8588 == -1) {
                        var40 = var38;
                        var41 = var39;
                        var44 = class28.field348 + var32;
                        if (!var18) {
                           break label324;
                        }
                     }

                     if (class616.field8588 == 1) {
                        var42 = var38 / class477.field6599;
                        var43 = var39 / class182.field2249;
                        var40 = class477.field6599 * var42;
                        var41 = class182.field2249 * var43;
                        var44 = (class28.field348 + var32) * (double)(var38 * var40 + var39 * var41) / (double)(var38 * var38 + var39 * var39);
                     }
                  }

                  double var46;
                  int var48;
                  int var49;
                  int var50;
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  label319: {
                     var46 = -var44;
                     var48 = 0;
                     var49 = 0;
                     var50 = 0;
                     var51 = 0;
                     var52 = 0;
                     if (var40 < 0) {
                        var53 = class40.field462 + var40;
                        var54 = -var40;
                        var55 = 0;
                        if (class616.field8588 == 1) {
                           var52 = -var42;
                           var50 = 0;
                        }

                        var56 = var54;
                        if (!var18) {
                           break label319;
                        }
                     }

                     var53 = -var40 + class40.field462;
                     var54 = 0;
                     var56 = var40;
                     var55 = var53;
                     if (class616.field8588 == 1) {
                        var52 = var42;
                        var50 = class498.field6856 - var42;
                     }
                  }

                  int var57;
                  int var58;
                  int var59;
                  int var60;
                  int var61;
                  int var62;
                  int var63;
                  label359: {
                     var57 = 0;
                     if (var41 < 0) {
                        var58 = 0;
                        var59 = class459.field6289 - -var41;
                        var60 = -var41;
                        var61 = var60;
                        var62 = var60;
                        var63 = var59;
                        if (class616.field8588 != 1) {
                           break label359;
                        }

                        var48 = 0;
                        var49 = -var43;
                        var57 = class124.field1540 + var43;
                        var51 = var49;
                        if (!var18) {
                           break label359;
                        }
                     }

                     var59 = -var41 + class459.field6289;
                     var60 = 0;
                     var61 = var41;
                     var58 = var59;
                     if (class616.field8588 == 1) {
                        var49 = var43;
                        var51 = 0;
                        var48 = -var43 + class124.field1540;
                        var57 = var48;
                     }

                     var62 = 0;
                     var63 = var59;
                  }

                  class411 var64 = class526.field7199.field381;
                  class794 var65 = (class794)var64.method3110(-115);
                  if (var18 || var65 != null) {
                     do {
                        class52[] var66 = var65.field11601;
                        boolean var67 = true;
                        int var68 = 0;
                        if (var18 || var68 < var66.length) {
                           do {
                              class52 var69 = var66[var68];
                              int var70 = var69.field576;
                              int var71 = var69.field573;
                              int var72 = var69.field574;
                              int var73 = var69.field571;
                              int var74 = var69.field575;
                              int var75;
                              var69.field576 = var75 = -var40 + var70;
                              int var76;
                              var69.field574 = var76 = var72 - var40;
                              int var77;
                              var69.field571 = var77 = -var41 + var73;
                              int var78;
                              var69.field573 = var78 = -var41 + var71;
                              if (var67) {
                                 int var79 = -var74 + (var76 > var75 ? var75 : var76);
                                 if (~class40.field462 <= ~var79) {
                                    int var80 = -var74 + (~var78 > ~var77 ? var78 : var77);
                                    if (class459.field6289 >= var80) {
                                       int var81 = (~var76 >= ~var75 ? var75 : var76) + var74;
                                       if (var81 >= 0) {
                                          int var82 = var74 + (var78 >= var77 ? var78 : var77);
                                          if (~var82 <= -1) {
                                             var67 = false;
                                          }
                                       }
                                    }
                                 }
                              }

                              ++var68;
                           } while(var68 < var66.length);
                        }

                        if (var67) {
                           var65.method5512((byte)-127);
                           class42.method315(var65, false);
                        }

                        var65 = (class794)var64.method3114(2);
                     } while(var65 != null);
                  }

                  if (class616.field8588 == 0) {
                     class633.field8958.method550(class771.field11096);
                  }

                  label285: {
                     class633.field8958.method570(-var40, -var41);
                     class633.field8958.method606(var54, var60, var53, var59, var46);
                     class524.method3786(false, class28.field348 + var46);
                     class483.field6658 = class28.field348 + var46;
                     if (~class616.field8588 != -2) {
                        class307.field4091 = var24;
                        class21.field265 = var20 - var40 + -class516.field7089 + class167.field2111;
                        class658.field9400 = var26;
                        class528.field7241 = class292.field3853 + var21 + -var41 + -class446.field6178;
                        class633.field8958.method526(class21.field265, class528.field7241, class307.field4091, class658.field9400);
                        if (!var18) {
                           break label285;
                        }
                     }

                     class528.field7241 = -class446.field6178 + var21 - var41;
                     class307.field4091 = var24;
                     class658.field9400 = var26;
                     class21.field265 = -class516.field7089 + var20 + -var40;
                     class633.field8958.method526(class21.field265, class528.field7241, class307.field4091, class658.field9400);
                  }

                  class390.method2965(class526.field7199);
                  if (~var61 < -1) {
                     class633.field8958.method577(0, var58, class40.field462, var58 + var61);
                     class633.field8958.method608();
                     class633.field8958.method589(class253.field3211);
                     class136.method1138(arg11, arg5, arg16, arg4, arg3, arg0, arg14, arg2, arg1, arg12, arg7, arg13, arg10, arg17, arg6, arg8, arg9, 1, false);
                  }

                  if (var56 > 0) {
                     class633.field8958.method577(var55, var62, var55 + var56, var62 - -var63);
                     class633.field8958.method608();
                     class633.field8958.method589(class253.field3211);
                     class136.method1138(arg11, arg5, arg16, arg4, arg3, arg0, arg14, arg2, arg1, arg12, arg7, arg13, arg10, arg17, arg6, arg8, arg9, 1, false);
                  }

                  class633.field8958.method593();
                  class542.method3911();
                  if (class616.field8588 == 0) {
                     class633.field8958.method544();
                  }

                  class446.field6178 += var41;
                  class28.field348 += var46;
                  class516.field7089 += var40;
                  class384.field5398 = -class446.field6178 + var31 + class292.field3853;
                  class347.field4984 = -class516.field7089 + class167.field2111 - -var30;
                  if (~class616.field8588 == -2) {
                     class671.field9871 += var43;
                     class458.field6280 += var42;
                     int var83 = 0;
                     if (var18 || class124.field1540 > var83) {
                        do {
                           int var84 = class348.method2749(class671.field9871 + var83, class124.field1540, (byte)-72) * class498.field6856;
                           int var85 = 0;
                           if (var18 || ~class498.field6856 < ~var85) {
                              do {
                                 int var86 = class348.method2749(class458.field6280 + var85, class498.field6856, (byte)-72) + var84;
                                 boolean var87 = ~var83 <= ~var48 && var83 < var48 - -var49 ? true : (~var83 <= ~var51 ? (~var83 > ~(var51 - -var57) ? (~var85 <= ~var50 ? var50 + var52 > var85 : false) : false) : false);
                                 class599.field8362[var86].method1310(class477.field6599 * var85, class182.field2249 * var83, class477.field6599, class182.field2249, 0, 0, var87, true);
                                 ++var85;
                              } while(~class498.field6856 < ~var85);
                           }

                           ++var83;
                        } while(class124.field1540 > var83);
                     }
                  }
               }
            }

            if (class591.field8180) {
               class384.field5398 = class292.field3853;
               class28.field348 = 0.0D;
               class720.field10554 = arg5;
               class446.field6178 = 0;
               class114.field1416 = arg16;
               class347.field4984 = class167.field2111;
               class516.field7089 = 0;
               class442.field6132 = arg4;
               if (class616.field8588 == 0) {
                  class633.field8958.method550(class771.field11096);
               }

               label236: {
                  class633.field8958.method593();
                  class633.field8958.method608();
                  class633.field8958.method589(class253.field3211);
                  class195.field2370.method149(class720.field10554, class114.field1416, class442.field6132, class660.field9417, class596.field8300, class681.field9996);
                  class633.field8958.method581(class195.field2370);
                  if (~class616.field8588 != -2) {
                     class658.field9400 = var26;
                     class21.field265 = var20 - -class167.field2111;
                     class307.field4091 = var24;
                     class528.field7241 = class292.field3853 + var21;
                     class633.field8958.method526(class21.field265, class528.field7241, class307.field4091, class658.field9400);
                     if (!var18) {
                        break label236;
                     }
                  }

                  class307.field4091 = var24;
                  class21.field265 = var20;
                  class658.field9400 = var26;
                  class528.field7241 = var21;
                  class633.field8958.method526(class21.field265, class528.field7241, class307.field4091, class658.field9400);
               }

               class483.field6658 = 0.0D;
               class526.field7199.method260(false);
               class390.method2965(class526.field7199);
               class136.method1138(arg11, arg5, arg16, arg4, arg3, arg0, arg14, arg2, arg1, arg12, arg7, arg13, arg10, arg17, arg6, arg8, arg9, 1, false);
               class542.method3911();
               class591.field8180 = false;
               if (class616.field8588 == 0) {
                  class633.field8958.method544();
               }

               if (~class616.field8588 == -2) {
                  class784.method5646((byte)-115);
               }
            }

            if (~class616.field8588 == -1) {
               class771.field11096.method1309(class347.field4984, class384.field5398, class192.field2343, class314.field4187, 0, 0, true, true);
            }

            label365: {
               ++class492.field6769;
               class524.method3786(false, class28.field348);
               class298.field3944 = class28.field348;
               if (~class616.field8588 != -1 && ~class616.field8588 != -3) {
                  if (class616.field8588 != 1) {
                     break label365;
                  }

                  class619.field8652 = -class446.field6178 + var21;
                  class373.field5253 = var26;
                  class517.field7097 = -class516.field7089 + var20;
                  class568.field7750 = var24;
                  class633.field8958.method526(class517.field7097, class619.field8652, class568.field7750, class373.field5253);
                  class633.field8958.method577(class347.field4984, class384.field5398, class347.field4984 + class192.field2343, class384.field5398 + class314.field4187);
                  if (!var18) {
                     break label365;
                  }
               }

               if (~class616.field8588 == -3) {
                  class633.field8958.method589(class253.field3211);
                  class633.field8958.method608();
               }

               class568.field7750 = var24;
               class517.field7097 = var20 - class516.field7089 + class167.field2111 + -class347.field4984;
               class373.field5253 = var26;
               class619.field8652 = -class446.field6178 + class292.field3853 + var21 + -class384.field5398;
               class633.field8958.method526(class517.field7097, class619.field8652, class568.field7750, class373.field5253);
            }

            class136.method1138(arg11, arg5, arg16, arg4, arg3, arg0, arg14, arg2, arg1, arg12, arg7, arg13, arg10, arg17, arg6, arg8, arg9, ~class616.field8588 == -3 ? 0 : 2, ~class616.field8588 == -2);
            class633.field8958.method593();
            class633.field8958.method526(var20, var21, var22, var23);
         }
      } catch (RuntimeException var89) {
         throw class534.method3846(var89, field5646[5] + (arg0 != null ? field5646[1] : field5646[2]) + ',' + (arg1 != null ? field5646[1] : field5646[2]) + ',' + (arg2 != null ? field5646[1] : field5646[2]) + ',' + (arg3 != null ? field5646[1] : field5646[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field5646[1] : field5646[2]) + ',' + arg13 + ',' + (arg14 != null ? field5646[1] : field5646[2]) + ',' + arg15 + ',' + arg16 + ',' + arg17 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(II)J"
   )
   public static final long method3045(int arg0, int arg1) {
      try {
         ++field5643;
         return arg0 != -20138 ? -40L : (long)(arg1 + 11745) * 86400000L;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5646[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3046(boolean arg0) {
      try {
         field5644 = null;
         if (arg0) {
            field5645 = null;
            field5638 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5646[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "<init>",
      descriptor = "([Lfu;)V"
   )
   public class402(class414[] arg0) {
      try {
         this.field5641 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5646[0] + (arg0 != null ? field5646[1] : field5646[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Lha;IILaa;ZLeb;III)V"
   )
   public static final void method3047(class65 arg0, int arg1, int arg2, class516 arg3, boolean arg4, class657 arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4273;

      try {
         if (arg4) {
            field5645 = null;
         }

         ++field5639;
         class297 var10 = class25.field315.method5236(arg2, (byte)70);
         if (var10 != null && var10.field3903 && var10.method2239(class259.field3320, (byte)-92)) {
            if (var10.field3896 != null) {
               int[] var11 = new int[var10.field3896.length];
               int var12 = 0;
               int var13;
               int var14;
               int var15;
               if (var9) {
                  if (~class635.field8977 != -5) {
                     var13 = 16383 & (int)class363.field5142 + class661.field9423;
                     if (var9) {
                        var13 = (int)class363.field5142 & 16383;
                     }
                  } else {
                     var13 = (int)class363.field5142 & 16383;
                  }

                  var14 = class192.field2342[var13];
                  var15 = class192.field2341[var13];
                  if (~class635.field8977 != -5) {
                     var15 = var15 * 256 / (class356.field5080 + 256);
                     var14 = var14 * 256 / (class356.field5080 - -256);
                  }

                  var11[var12 * 2] = ((arg6 - -(var10.field3896[var12 * 2 + 1] * 4)) * var14 + (var10.field3896[var12 * 2] * 4 + arg8) * var15 >> 14) + (arg7 - -(arg5.field9379 / 2));
                  var11[var12 * 2 + 1] = arg1 - (-(arg5.field9360 / 2) - -((var10.field3896[var12 * 2 + 1] * 4 + arg6) * var15 + -((arg8 - -(var10.field3896[var12 * 2] * 4)) * var14) >> 14));
                  ++var12;
               }

               label186:
               while(true) {
                  int var10000;
                  if (var12 >= var11.length / 2) {
                     class738.method5349(arg0, var11, var10.field3917, arg5.field9318, arg5.field9368);
                     var10000 = var10.field3920;
                     if (!var9) {
                        int var10001;
                        if (var10000 > 0) {
                           int var17;
                           int var18;
                           int var19;
                           int var20;
                           label133: {
                              int var16 = 0;
                              if (var9) {
                                 var17 = var11[var16 * 2];
                                 var18 = var11[var16 * 2 + 1];
                                 var19 = var11[(var16 + 1) * 2];
                                 var20 = var11[var16 * 2 + 2 + 1];
                                 var10000 = var19;
                                 var10001 = var17;
                              } else if (var11.length / 2 + -1 <= var16) {
                                 var17 = var11[var11.length + -2];
                                 var18 = var11[var11.length + -1];
                                 var19 = var11[0];
                                 var20 = var11[1];
                                 var10000 = var19;
                                 var10001 = var17;
                                 if (!var9) {
                                    break label133;
                                 }
                              } else {
                                 var17 = var11[var16 * 2];
                                 var18 = var11[var16 * 2 + 1];
                                 var19 = var11[(var16 + 1) * 2];
                                 var20 = var11[var16 * 2 + 2 + 1];
                                 var10000 = var19;
                                 var10001 = var17;
                              }

                              while(true) {
                                 int var22;
                                 int var23;
                                 if (var10000 >= var10001) {
                                    if (~var17 == ~var19 && var20 < var18) {
                                       int var21 = var18;
                                       var18 = var20;
                                       var20 = var21;
                                       if (var9) {
                                          var22 = var17;
                                          var17 = var19;
                                          var23 = var18;
                                          var19 = var22;
                                          var18 = var21;
                                          var20 = var23;
                                       }
                                    }
                                 } else {
                                    var22 = var17;
                                    var17 = var19;
                                    var23 = var18;
                                    var19 = var22;
                                    var18 = var20;
                                    var20 = var23;
                                 }

                                 arg0.method504(var17, var18, var19, var20, var10.field3934[var10.field3929[var16] & 255], 1, arg3, arg7, arg1, var10.field3920, var10.field3909, var10.field3922);
                                 ++var16;
                                 if (var11.length / 2 + -1 <= var16) {
                                    var17 = var11[var11.length + -2];
                                    var18 = var11[var11.length + -1];
                                    var19 = var11[0];
                                    var20 = var11[1];
                                    var10000 = var19;
                                    var10001 = var17;
                                    if (!var9) {
                                       break;
                                    }
                                 } else {
                                    var17 = var11[var16 * 2];
                                    var18 = var11[var16 * 2 + 1];
                                    var19 = var11[(var16 + 1) * 2];
                                    var20 = var11[var16 * 2 + 2 + 1];
                                    var10000 = var19;
                                    var10001 = var17;
                                 }
                              }
                           }

                           label108: {
                              if (var10000 < var10001) {
                                 int var24 = var17;
                                 int var25 = var18;
                                 var17 = var19;
                                 var18 = var20;
                                 var19 = var24;
                                 var20 = var25;
                                 if (!var9) {
                                    break label108;
                                 }
                              }

                              if (~var17 == ~var19 && var20 < var18) {
                                 int var26 = var18;
                                 var18 = var20;
                                 var20 = var26;
                              }
                           }

                           arg0.method504(var17, var18, var19, var20, var10.field3934[var10.field3929[var10.field3929.length + -1] & 255], 1, arg3, arg7, arg1, var10.field3920, var10.field3909, var10.field3922);
                           if (!var9) {
                              break;
                           }
                        }

                        int var27 = 0;
                        if (var9) {
                           arg0.method565(var11[var27 * 2], var11[var27 * 2 + 1], var11[var27 * 2 + 2], var11[var27 * 2 - -2 + 1], var10.field3934[255 & var10.field3929[var27]], 1, arg3, arg7, arg1);
                           ++var27;
                        }

                        while(true) {
                           while(~var27 > ~(var11.length / 2 - 1)) {
                              arg0.method565(var11[var27 * 2], var11[var27 * 2 + 1], var11[var27 * 2 + 2], var11[var27 * 2 - -2 + 1], var10.field3934[255 & var10.field3929[var27]], 1, arg3, arg7, arg1);
                              ++var27;
                           }

                           var10001 = var11[var11.length - 2];
                           int var10002 = var11[var11.length + -1];
                           int var10003 = var11[0];
                           int var10004 = var11[1];
                           int var10005 = var10.field3934[255 & var10.field3929[var10.field3929.length - 1]];
                           if (!var9) {
                              arg0.method565(var10001, var10002, var10003, var10004, var10005, 1, arg3, arg7, arg1);
                              break label186;
                           }

                           arg0.method565(var10001, var10002, var10003, var10004, var10005, 1, arg3, arg7, arg1);
                           ++var27;
                        }
                     }
                  } else {
                     var10000 = ~class635.field8977;
                  }

                  if (var10000 != -5) {
                     var13 = 16383 & (int)class363.field5142 + class661.field9423;
                     if (var9) {
                        var13 = (int)class363.field5142 & 16383;
                     }
                  } else {
                     var13 = (int)class363.field5142 & 16383;
                  }

                  var14 = class192.field2342[var13];
                  var15 = class192.field2341[var13];
                  if (~class635.field8977 != -5) {
                     var15 = var15 * 256 / (class356.field5080 + 256);
                     var14 = var14 * 256 / (class356.field5080 - -256);
                  }

                  var11[var12 * 2] = ((arg6 - -(var10.field3896[var12 * 2 + 1] * 4)) * var14 + (var10.field3896[var12 * 2] * 4 + arg8) * var15 >> 14) + (arg7 - -(arg5.field9379 / 2));
                  var11[var12 * 2 + 1] = arg1 - (-(arg5.field9360 / 2) - -((var10.field3896[var12 * 2 + 1] * 4 + arg6) * var15 + -((arg8 - -(var10.field3896[var12 * 2] * 4)) * var14) >> 14));
                  ++var12;
               }
            }

            class763 var28 = null;
            if (var10.field3932 != -1) {
               var28 = var10.method2238(arg0, -104, false);
               if (var28 != null) {
                  class251.method1898(arg1, 74, arg6, arg3, arg8, arg5, arg7, var28);
               }
            }

            if (var10.field3918 != null) {
               int var29 = 0;
               if (var28 != null) {
                  var29 = var28.method2137();
               }

               class66 var30 = class183.field2263;
               class663 var31 = class632.field8875;
               if (~var10.field3912 == -2) {
                  var31 = class22.field281;
                  var30 = class163.field2095;
               }

               if (var10.field3912 == 2) {
                  var30 = class101.field1310;
                  var31 = class101.field1304;
               }

               class612.method4450(arg3, arg6, var10.field3918, var10.field3927, var31, var30, arg8, var29, (byte)-88, arg5, arg1, arg7);
               return;
            }
         }

      } catch (RuntimeException var33) {
         throw class534.method3846(var33, field5646[3] + (arg0 != null ? field5646[1] : field5646[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5646[1] : field5646[2]) + ',' + arg4 + ',' + (arg5 != null ? field5646[1] : field5646[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3048(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3049(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
