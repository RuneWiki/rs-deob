import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public abstract class class639 {
   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9316 = new String[]{method4681(method4680("_g")), method4681(method4680("Za\u0000")), method4681(method4680("6=\u001a>")), method4681(method4680("-\u000frP24\t\u001a>6\u001f#Ol\u0002Z;S\u007f\u001c\u001fnOh\u001e\bn\u0016*68o\u0000N\u0017\u001f/S{[\u0013 Fq\t\u0017nWv\u0014\u001f8El[\u0013=\u0000l\u001e\t>Op\b\u0013,L{[\u001c!R>\u000f\u0012+\u0000}\u0014\u0014:Ep\u000fU/R{\u001aZ7Ok[\u001b<E>\u000e\t'NyT\u0013 \u000e")), method4681(method4680("8aS")), method4681(method4680("Z\u0000p]AZ")), method4681(method4680("<>S$")), method4681(method4680("\u0001`\u000e0\u0006")), method4681(method4680("8aS>4\u000f:\u001a")), method4681(method4680("5(Fv\u001e\u001b>\u001a")), method4681(method4680("9/Cv\u001e@")), method4681(method4680("_n\b")), method4681(method4680("Z\u0003Oz\u001e\u0016=\u001a>")), method4681(method4680("7+M$")), method4681(method4680("3 \u001a")), method4681(method4680("Z\u0002A$[")), method4681(method4680("\u0010/A09R")), method4681(method4680("F-OrF\u001c(\u0019.OJp")), method4681(method4680("*/Rj\u0012\u0019\"EmAZ")), method4681(method4680("FaCq\u0017DnX")), method4681(method4680("Z\u001eL$[")), method4681(method4680("\u0014;Lr")), method4681(method4680("*!Lg\b@n")), method4681(method4680("\u0010/A02R")), method4681(method4680("\u0010/A01R"))};
   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "I"
   )
   public static int field9311 = -1;
   @OriginalMember(
      owner = "client!jaa",
      name = "f",
      descriptor = "I"
   )
   public static int field9312 = 0;
   @OriginalMember(
      owner = "client!jaa",
      name = "d",
      descriptor = "I"
   )
   public static int field9310;
   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "I"
   )
   public static int field9314;
   @OriginalMember(
      owner = "client!jaa",
      name = "c",
      descriptor = "I"
   )
   public static int field9315;
   @OriginalMember(
      owner = "client!jaa",
      name = "e",
      descriptor = "J"
   )
   public static long field9313;

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "([Ljfa;IIIIIIIIIZ)V",
      line = 9
   )
   public static final void method4677(class303[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      boolean var11 = client.field4564;

      try {
         class444.field6473.method333(arg5, arg9, arg6, arg3);
         int var12 = -9 / ((arg7 - 51) / 63);
         ++field9310;
         int var13 = 0;
         if (var11 || ~arg0.length < ~var13) {
            do {
               class303 var14 = arg0[var13];
               if (var14 != null && (var14.field4256 == arg8 || arg8 == -1412584499 && (class665.field9664 == var14 || var11))) {
                  int var15 = var14.field4279 + arg4;
                  int var16 = var14.field4323 + arg1;
                  int var17 = var14.field4308 + 1 + var15;
                  int var18 = var16 - -1 + var14.field4226;
                  int var19;
                  if (arg2 == -1) {
                     class211.field3153[class656.field9577].setBounds(var14.field4279 + arg4, var14.field4323 - -arg1, var14.field4308, var14.field4226);
                     var19 = class656.field9577++;
                     if (var11) {
                        var19 = arg2;
                     }
                  } else {
                     var19 = arg2;
                  }

                  var14.field4358 = class29.field458;
                  var14.field4316 = var19;
                  if (!client.method2470(var14)) {
                     label1019: {
                        if (~var14.field4364 != -1) {
                           class125.method1217(var14, 103);
                        }

                        int var20 = var14.field4279 - -arg4;
                        int var21 = var14.field4323 + arg1;
                        int var22 = 0;
                        int var23 = 0;
                        if (class262.field3734) {
                           var22 = class124.method1174((byte)-95);
                           var23 = class745.method5410(75);
                        }

                        int var24 = var14.field4268;
                        if (class589.field8508) {
                           if (client.method2454(var14).field10311 == 0) {
                              if (var14.field4270 == 0 && ~var24 < -128) {
                                 var24 = 127;
                              }
                           } else if (~var24 < -128) {
                              var24 = 127;
                           }
                        }

                        if (class665.field9664 == var14) {
                           if (~arg8 != 1412584498 && (class536.field7809 == var14.field4382 || ~class206.field3077 == ~var14.field4382)) {
                              class607.field8712 = arg0;
                              class534.field7777 = arg4;
                              class246.field3538 = arg1;
                              if (!var11) {
                                 break label1019;
                              }
                           }

                           if (class415.field6084 && class258.field3657) {
                              int var25 = var22 + class315.field4531.method1630(true);
                              int var26 = class315.field4531.method1632(-118) - -var23;
                              int var27 = var26 - class566.field8201;
                              int var28 = var25 - class412.field6029;
                              if (class514.field7496 > var28) {
                                 var28 = class514.field7496;
                              }

                              if (class567.field8233 > var27) {
                                 var27 = class567.field8233;
                              }

                              if (var14.field4308 + var28 > class514.field7496 - -class768.field11144.field4308) {
                                 var28 = class514.field7496 + class768.field11144.field4308 + -var14.field4308;
                              }

                              var20 = var28;
                              if (var27 - -var14.field4226 > class567.field8233 + class768.field11144.field4226) {
                                 var27 = class567.field8233 + class768.field11144.field4226 + -var14.field4226;
                              }

                              var21 = var27;
                           }

                           if (~class206.field3077 == ~var14.field4382) {
                              var24 = 128;
                           }
                        }

                        int var31;
                        int var32;
                        int var33;
                        int var34;
                        if (~var14.field4270 != -3) {
                           int var29 = var14.field4308 + var20;
                           int var30 = var14.field4226 + var21;
                           var31 = ~arg9 > ~var21 ? var21 : arg9;
                           if (var14.field4270 == 9) {
                              ++var30;
                              ++var29;
                           }

                           var32 = var20 > arg5 ? var20 : arg5;
                           var33 = arg3 > var30 ? var30 : arg3;
                           var34 = arg6 > var29 ? var29 : arg6;
                           if (var11) {
                              var31 = arg9;
                              var32 = arg5;
                              var33 = arg3;
                              var34 = arg6;
                           }
                        } else {
                           var31 = arg9;
                           var32 = arg5;
                           var33 = arg3;
                           var34 = arg6;
                        }

                        if (~var32 > ~var34 && (~var33 < ~var31 || var11)) {
                           label1052: {
                              if (var14.field4364 != 0) {
                                 if (class440.field6428 == var14.field4364 || class732.field10517 == var14.field4364) {
                                    class658.method4833(var14, (byte)-104, var21, var20);
                                    if (!class262.field3734) {
                                       class694.method5048(var21, var14.field4308, var14.field4226, 20629, var20, class732.field10517 == var14.field4364);
                                       class444.field6473.method333(arg5, arg9, arg6, arg3);
                                    }

                                    class178.field2749[var19] = true;
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }

                                 if (class357.field5072 == var14.field4364) {
                                    if (var14.method2357(-10680, class444.field6473) == null) {
                                       break label1052;
                                    }

                                    class743.method5393(4);
                                    class1.method2(var21, var14, class444.field6473, 74, var20);
                                    class36.field892[var19] = true;
                                    class444.field6473.method333(arg5, arg9, arg6, arg3);
                                    if (!class262.field3734) {
                                       break label1052;
                                    }

                                    if (!arg10) {
                                       class704.method5120(var16, -95, var15, var17, var18);
                                       if (!var11) {
                                          break label1052;
                                       }
                                    }

                                    class670.method4896(var17, 0, var15, var18, var16);
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }

                                 if (class335.field4787 == var14.field4364) {
                                    class7.method50(class444.field6473, -68, var20, var14, var21);
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }

                                 if (~class207.field3089 == ~var14.field4364) {
                                    class245.method1991((byte)-58, var14, var14.field4291 % 64, var20, class444.field6473, var21);
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }

                                 if (class749.field10798 == var14.field4364) {
                                    if (var14.method2357(-10680, class444.field6473) == null) {
                                       break label1052;
                                    }

                                    class89.method866(var14, var21, var20, (byte)-56);
                                    class36.field892[var19] = true;
                                    class444.field6473.method333(arg5, arg9, arg6, arg3);
                                    if (!class262.field3734) {
                                       break label1052;
                                    }

                                    if (arg10) {
                                       class670.method4896(var17, 0, var15, var18, var16);
                                       if (!var11) {
                                          break label1052;
                                       }
                                    }

                                    class704.method5120(var16, -104, var15, var17, var18);
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }

                                 if (~class61.field1154 == ~var14.field4364) {
                                    class760.method5496(var14.field4226, var14.field4308, class64.field1169, var20, class444.field6473, (byte)-40, var21);
                                    class178.field2749[var19] = true;
                                    class444.field6473.method333(arg5, arg9, arg6, arg3);
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }

                                 if (class196.field2957 == var14.field4364) {
                                    class116.method1106((byte)-21, var21, class444.field6473, var20, var14.field4308, var14.field4226);
                                    class178.field2749[var19] = true;
                                    class444.field6473.method333(arg5, arg9, arg6, arg3);
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }

                                 if (class368.field5459 == var14.field4364) {
                                    if (!class324.field4665 && !class436.field6294) {
                                       break label1052;
                                    }

                                    int var35 = var14.field4308 + var20;
                                    if (class262.field3734) {
                                       if (arg10) {
                                          class670.method4896(var17, 0, var15, var18, var16);
                                          if (var11) {
                                             class704.method5120(var16, -102, var15, var17, var18);
                                          }
                                       } else {
                                          class704.method5120(var16, -102, var15, var17, var18);
                                       }
                                    }

                                    int var36 = var21 + 15;
                                    if (class324.field4665) {
                                       int var37 = -256;
                                       if (class69.field1245 < 20) {
                                          var37 = -65536;
                                       }

                                       class678.field9949.method714(-1, var36, field9316[6] + class69.field1245, var35, var37, -16777216);
                                       var36 += 15;
                                       Runtime var38 = Runtime.getRuntime();
                                       int var39 = (int)((var38.totalMemory() - var38.freeMemory()) / 1024L);
                                       int var40 = -256;
                                       if (var39 > 98304) {
                                          var40 = -65536;
                                          if (class148.field2390) {
                                             class341.method2637(-124);
                                             int var41 = 0;
                                             if (var11) {
                                                System.gc();
                                                ++var41;
                                             }

                                             while(true) {
                                                while(var41 < 10) {
                                                   System.gc();
                                                   ++var41;
                                                }

                                                var39 = (int)((var38.totalMemory() + -var38.freeMemory()) / 1024L);
                                                if (!var11) {
                                                   if (var39 > 65536) {
                                                      class126.method1228(field9316[3], (byte)125, 4);
                                                   }
                                                   break;
                                                }

                                                ++var41;
                                             }
                                          }
                                       }

                                       class678.field9949.method714(-1, var36, field9316[13] + var39 + "k", var35, var40, -16777216);
                                       var36 += 15;
                                       class678.field9949.method714(-1, var36, field9316[14] + class424.field6164 + field9316[8] + class374.field5552 + field9316[4], var35, -256, -16777216);
                                       var36 += 15;
                                       int var42 = class444.field6473.method287() / 1024;
                                       class678.field9949.method714(-1, var36, field9316[9] + var42 + "k", var35, var42 <= 65536 ? -256 : -65536, -16777216);
                                       var36 += 15;
                                       int var43 = 0;
                                       int var44 = 0;
                                       int var45 = 0;
                                       int var46 = 0;
                                       if (var11) {
                                          if (class478.field6964[var46] != null) {
                                             var43 += class478.field6964[var46].method764(true);
                                             var44 += class478.field6964[var46].method760(1);
                                             var45 += class478.field6964[var46].method761(false);
                                          }

                                          ++var46;
                                       }

                                       while(true) {
                                          while(var46 < 37) {
                                             if (class478.field6964[var46] != null) {
                                                var43 += class478.field6964[var46].method764(true);
                                                var44 += class478.field6964[var46].method760(1);
                                                var45 += class478.field6964[var46].method761(false);
                                             }

                                             ++var46;
                                          }

                                          int var47 = var45 * 100 / var43;
                                          int var48 = var44 * 10000 / var43;
                                          String var49 = field9316[10] + class499.method3761(10, (long)var48, 2, 0, true) + field9316[11] + var47 + field9316[0];
                                          class193.field2920.method714(-1, var36, var49, var35, -256, -16777216);
                                          if (!var11) {
                                             var36 += 12;
                                             break;
                                          }

                                          ++var46;
                                       }
                                    }

                                    if (class248.field3571 > 0) {
                                       class193.field2920.method714(-1, var36, field9316[18] + class505.field7351 + field9316[1] + class248.field3571, var35, -256, -16777216);
                                    }

                                    var36 += 12;
                                    if (class436.field6294) {
                                       class193.field2920.method714(-1, var36, field9316[22] + class444.field6473.method346() + field9316[12] + class444.field6473.method318(), var35, -256, -16777216);
                                       var36 += 12;
                                       class193.field2920.method714(-1, var36, field9316[2] + class780.field11423 + field9316[15] + class632.field9217 + field9316[5] + class57.field1125 + field9316[20] + class147.field2381, var35, -256, -16777216);
                                       var36 += 12;
                                       class536.method4016(false);
                                    }

                                    class178.field2749[var19] = true;
                                    if (!var11) {
                                       break label1052;
                                    }
                                 }
                              }

                              if (var14.field4270 == 0) {
                                 if (~class615.field8937 == ~var14.field4364 && class444.field6473.method410()) {
                                    class444.field6473.method427(var20, var21, var14.field4308, var14.field4226);
                                 }

                                 method4677(arg0, -var14.field4235 + var21, var19, var33, -var14.field4341 + var20, var32, var34, -97, var14.field4263, var31, arg10);
                                 if (var14.field4322 != null) {
                                    method4677(var14.field4322, var21 - var14.field4235, var19, var33, var20 - var14.field4341, var32, var34, -72, var14.field4263, var31, arg10);
                                 }

                                 class719 var50 = (class719)class520.field7582.method1572((long)var14.field4263, -16289);
                                 if (var50 != null) {
                                    class167.method1516(var34, (byte)-80, var32, var20, var19, var33, var31, var50.field10375, var21);
                                 }

                                 if (~class615.field8937 == ~var14.field4364 && class444.field6473.method410()) {
                                    class444.field6473.method438();
                                 }

                                 class444.field6473.method333(arg5, arg9, arg6, arg3);
                              }

                              if (class114.field1851[var19] || ~class356.field5020 < -2) {
                                 label1076: {
                                    if (var14.field4270 == 3) {
                                       label999: {
                                          if (~var24 == -1) {
                                             if (!var14.field4267) {
                                                class444.field6473.method403(var20, var21, var14.field4308, var14.field4226, var14.field4291, 0);
                                                if (!var11) {
                                                   break label999;
                                                }
                                             }

                                             class444.field6473.method295(var20, var21, var14.field4308, var14.field4226, var14.field4291, 0);
                                             if (!var11) {
                                                break label999;
                                             }
                                          }

                                          if (var14.field4267) {
                                             class444.field6473.method295(var20, var21, var14.field4308, var14.field4226, -(255 & var24) + 255 << 24 | var14.field4291 & 16777215, 1);
                                             if (!var11) {
                                                break label999;
                                             }
                                          }

                                          class444.field6473.method403(var20, var21, var14.field4308, var14.field4226, 16777215 & var14.field4291 | -(255 & var24) + 255 << 24, 1);
                                       }

                                       if (!class262.field3734) {
                                          break label1076;
                                       }

                                       if (!arg10) {
                                          class704.method5120(var16, -78, var15, var17, var18);
                                          if (!var11) {
                                             break label1076;
                                          }
                                       }

                                       class670.method4896(var17, 0, var15, var18, var16);
                                       if (!var11) {
                                          break label1076;
                                       }
                                    }

                                    if (var14.field4270 == 4) {
                                       class66 var51 = var14.method2372(class444.field6473, true);
                                       if (var51 == null) {
                                          if (!class744.field10718) {
                                             break label1076;
                                          }

                                          class322.method2512(16, var14);
                                          if (!var11) {
                                             break label1076;
                                          }
                                       }

                                       int var52 = var14.field4291;
                                       String var53 = var14.field4347;
                                       if (var14.field4346 != -1) {
                                          class439 var54 = class408.field5993.method845((byte)-110, var14.field4346);
                                          var53 = var54.field6353;
                                          if (var53 == null) {
                                             var53 = field9316[21];
                                          }

                                          if ((~var54.field6335 == -2 || var14.field4351 != 1) && var14.field4351 != -1) {
                                             var53 = field9316[17] + var53 + field9316[19] + class427.method3226(var14.field4351, 7776);
                                          }
                                       }

                                       if (var14.field4285 != -1) {
                                          var53 = class558.method4170(var14.field4285, 10);
                                          if (var53 == null) {
                                             var53 = "";
                                          }
                                       }

                                       if (class581.field8351 == var14) {
                                          var53 = class100.field1630.method961(class385.field5684, true);
                                          var52 = var14.field4291;
                                       }

                                       if (class599.field8635) {
                                          class444.field6473.method309(var20, var21, var14.field4308 + var20, var14.field4226 + var21);
                                       }

                                       var51.method718(var14.field4336, (class510)null, var14.field4308, (int[])null, var20, !var14.field4243 ? -1 : -(255 & var24) + 255 << 24, var21, 0, var14.field4319, var52 | -(255 & var24) + 255 << 24, var14.field4226, 29943, var14.field4339, var14.field4245, var53, class150.field2414, 0);
                                       if (class599.field8635) {
                                          class444.field6473.method333(arg5, arg9, arg6, arg3);
                                       }

                                       if (var53.trim().length() <= 0) {
                                          break label1076;
                                       }

                                       if (class599.field8635) {
                                          if (!class262.field3734) {
                                             break label1076;
                                          }

                                          if (!arg10) {
                                             class704.method5120(var16, -78, var15, var17, var18);
                                             if (!var11) {
                                                break label1076;
                                             }
                                          }

                                          class670.method4896(var17, 0, var15, var18, var16);
                                          if (!var11) {
                                             break label1076;
                                          }
                                       }

                                       class445 var55 = class683.method4985(var14.field4320, false, class444.field6473);
                                       int var56 = var55.method3344(-18283, class150.field2414, var53, var14.field4308);
                                       int var57 = var55.method3350(var14.field4308, 7766, class150.field2414, var14.field4245, var53);
                                       if (!class262.field3734) {
                                          break label1076;
                                       }

                                       if (arg10) {
                                          class670.method4896(var20 + var56, 0, var20, var21 + var57, var21);
                                          if (!var11) {
                                             break label1076;
                                          }
                                       }

                                       class704.method5120(var21, -102, var20, var20 + var56, var21 + var57);
                                       if (!var11) {
                                          break label1076;
                                       }
                                    }

                                    if (~var14.field4270 == -6) {
                                       label869: {
                                          if (var14.field4350 < 0) {
                                             class476 var58;
                                             label1005: {
                                                if (~var14.field4346 == 0) {
                                                   if (~var14.field4285 == 0) {
                                                      var58 = var14.method2368(class444.field6473, 4617);
                                                      if (!var11) {
                                                         break label1005;
                                                      }
                                                   }

                                                   var58 = class250.method2029(var14.field4285, class444.field6473, -1);
                                                   if (!var11) {
                                                      break label1005;
                                                   }
                                                }

                                                class212 var59 = var14.field4365 ? class304.field4398.field6676 : null;
                                                var58 = class408.field5993.method837(var14.field4346, -16777216 | var14.field4348, var59, var14.field4315, var14.field4351, class444.field6473, var14.field4276, 88);
                                             }

                                             if (var58 != null) {
                                                int var60 = var58.method3009();
                                                int var61 = var58.method3000();
                                                int var62 = 255 - (255 & var24) << 24 | (~var14.field4291 == -1 ? 16777215 : var14.field4291 & 16777215);
                                                if (var14.field4356) {
                                                   label1007: {
                                                      class444.field6473.method309(var20, var21, var20 - -var14.field4308, var14.field4226 + var21);
                                                      if (~var14.field4391 == -1) {
                                                         if (var14.field4291 == 0 && ~var24 == -1) {
                                                            var58.method3607(var20, var21, var14.field4308, var14.field4226);
                                                            if (!var11) {
                                                               break label1007;
                                                            }
                                                         }

                                                         var58.method3007(var20, var21, var14.field4308, var14.field4226, 0, var62, 1);
                                                         if (!var11) {
                                                            break label1007;
                                                         }
                                                      }

                                                      int var63 = (var60 + -1 + var14.field4308) / var60;
                                                      int var64 = (var61 - 1 + var14.field4226) / var61;
                                                      int var65 = 0;
                                                      if (var11 || var65 < var63) {
                                                         do {
                                                            int var66 = 0;
                                                            if (var11) {
                                                               if (var14.field4291 != 0) {
                                                                  var58.method3608((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var21 - -(var61 * var66)), 4096, var14.field4391, 0, var62, 1);
                                                                  if (var11) {
                                                                     var58.method3601((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field4391);
                                                                     ++var66;
                                                                  } else {
                                                                     ++var66;
                                                                  }
                                                               } else {
                                                                  var58.method3601((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field4391);
                                                                  ++var66;
                                                               }
                                                            }

                                                            while(true) {
                                                               while(var64 > var66) {
                                                                  if (var14.field4291 != 0) {
                                                                     var58.method3608((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var21 - -(var61 * var66)), 4096, var14.field4391, 0, var62, 1);
                                                                     if (var11) {
                                                                        var58.method3601((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field4391);
                                                                        ++var66;
                                                                     } else {
                                                                        ++var66;
                                                                     }
                                                                  } else {
                                                                     var58.method3601((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field4391);
                                                                     ++var66;
                                                                  }
                                                               }

                                                               if (!var11) {
                                                                  ++var65;
                                                                  break;
                                                               }

                                                               var58.method3601((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field4391);
                                                               ++var66;
                                                            }
                                                         } while(var65 < var63);
                                                      }
                                                   }

                                                   class444.field6473.method333(arg5, arg9, arg6, arg3);
                                                   if (!var11) {
                                                      break label869;
                                                   }
                                                }

                                                if (var14.field4291 != 0 || var24 != 0) {
                                                   if (var14.field4391 != 0) {
                                                      var58.method3608((float)var14.field4308 / 2.0F + (float)var20, (float)var14.field4226 / 2.0F + (float)var21, var14.field4308 * 4096 / var60, var14.field4391, 0, var62, 1);
                                                      if (!var11) {
                                                         break label869;
                                                      }
                                                   }

                                                   if (~var14.field4308 == ~var60 && ~var14.field4226 == ~var61) {
                                                      var58.method1055(var20, var21, 0, var62, 1);
                                                      if (!var11) {
                                                         break label869;
                                                      }
                                                   }

                                                   var58.method3605(var20, var21, var14.field4308, var14.field4226, 0, var62, 1);
                                                   if (!var11) {
                                                      break label869;
                                                   }
                                                }

                                                if (~var14.field4391 == -1) {
                                                   if (var14.field4308 != var60 || var14.field4226 != var61) {
                                                      var58.method3602(var20, var21, var14.field4308, var14.field4226);
                                                      if (!var11) {
                                                         break label869;
                                                      }
                                                   }

                                                   var58.method3609(var20, var21);
                                                   if (!var11) {
                                                      break label869;
                                                   }
                                                }

                                                var58.method3601((float)var14.field4308 / 2.0F + (float)var20, (float)var14.field4226 / 2.0F + (float)var21, var14.field4308 * 4096 / var60, var14.field4391);
                                                if (!var11) {
                                                   break label869;
                                                }
                                             }

                                             if (!class744.field10718) {
                                                break label869;
                                             }

                                             class322.method2512(16, var14);
                                             if (!var11) {
                                                break label869;
                                             }
                                          }

                                          var14.method2362(class300.field4199, -7, class29.field455).method480(0, var14.field4304 << 3, var14.field4384 << 3, var20, 0, var14.field4226, var21, var14.field4308, 0, class444.field6473);
                                       }

                                       if (!class262.field3734) {
                                          break label1076;
                                       }

                                       if (!arg10) {
                                          class704.method5120(var16, -99, var15, var17, var18);
                                          if (!var11) {
                                             break label1076;
                                          }
                                       }

                                       class670.method4896(var17, 0, var15, var18, var16);
                                       if (!var11) {
                                          break label1076;
                                       }
                                    }

                                    if (~var14.field4270 == -7) {
                                       class727.method5255(127);
                                       Object var67 = null;
                                       class495 var68 = null;
                                       int var69 = 0;
                                       if (~var14.field4346 == 0) {
                                          if (var14.field4278 != 5) {
                                             if (var14.field4278 != 8 && var14.field4278 != 9) {
                                                if (var14.field4247 != -1) {
                                                   class295 var70 = class588.field8496.method3781(5, var14.field4247);
                                                   var68 = var14.method2365(var14.field4272, 255, class304.field4398.field6676, var14.field4366, var14.field4334, class588.field8496, var70, class616.field8951, 2048, (class454)var67, class444.field6473, class604.field8696, class373.field5547, class424.field6167, class408.field5993);
                                                   if (var68 == null && class744.field10718) {
                                                      class322.method2512(16, var14);
                                                   }
                                                } else {
                                                   var68 = var14.method2365(0, 255, class304.field4398.field6676, -1, -1, class588.field8496, (class295)null, class616.field8951, 2048, (class454)var67, class444.field6473, class604.field8696, class373.field5547, class424.field6167, class408.field5993);
                                                   if (var68 == null && class744.field10718) {
                                                      class322.method2512(16, var14);
                                                   }
                                                }
                                             } else {
                                                class349 var71 = class190.method1656((byte)68, false, var14.field4231);
                                                class295 var72 = var14.field4247 != -1 ? class588.field8496.method3781(5, var14.field4247) : null;
                                                if (var71 != null) {
                                                   class212 var73 = var14.field4365 ? class304.field4398.field6676 : null;
                                                   var68 = var71.method2692(var73, var14.field4334, class444.field6473, ~var14.field4278 == -10, 610855664, var14.field4306, var14.field4272, var72, 2048, var14.field4366);
                                                }
                                             }
                                          } else {
                                             int var74 = var14.field4231;
                                             if (~var74 <= -1 && var74 < 2048) {
                                                class457 var75 = class458.field6723[var74];
                                                class295 var76 = var14.field4247 == -1 ? null : class588.field8496.method3781(5, var14.field4247);
                                                if (var75 != null && (~class20.field324 == ~var74 || ~class393.method3046(var75.field6665, 126) == ~var14.field4306)) {
                                                   var68 = var75.field6676.method1799((int[])null, class444.field6473, (class295)null, -1, 0, class588.field8496, 0, (class716[])null, (byte)-109, var14.field4272, 2048, class424.field6167, 0, var76, var14.field4366, class408.field5993, true, class616.field8951, class604.field8696, class373.field5547, var14.field4334);
                                                }
                                             }
                                          }
                                       } else {
                                          class439 var77 = class408.field5993.method845((byte)-69, var14.field4346);
                                          if (var77 != null) {
                                             class439 var78 = var77.method3305(0, var14.field4351);
                                             class295 var79 = var14.field4247 != -1 ? class588.field8496.method3781(5, var14.field4247) : null;
                                             class212 var80 = !var14.field4365 ? null : class304.field4398.field6676;
                                             var68 = var78.method3293(1, var14.field4334, var14.field4366, var14.field4272, 2048, var79, var80, 0, class444.field6473);
                                             if (var68 == null) {
                                                class322.method2512(16, var14);
                                                if (var11) {
                                                   var69 = -var68.method540() >> 1;
                                                }
                                             } else {
                                                var69 = -var68.method540() >> 1;
                                             }
                                          }
                                       }

                                       if (var68 != null) {
                                          int var81;
                                          if (~var14.field4387 >= -1) {
                                             var81 = 512;
                                             if (var11) {
                                                var81 = (var14.field4308 << 9) / var14.field4387;
                                             }
                                          } else {
                                             var81 = (var14.field4308 << 9) / var14.field4387;
                                          }

                                          int var82;
                                          if (var14.field4331 <= 0) {
                                             var82 = 512;
                                             if (var11) {
                                                var82 = (var14.field4226 << 9) / var14.field4331;
                                             }
                                          } else {
                                             var82 = (var14.field4226 << 9) / var14.field4331;
                                          }

                                          int var83 = var14.field4308 / 2 + var20;
                                          int var84 = var14.field4226 / 2 + var21;
                                          if (!var14.field4303) {
                                             var83 += var14.field4370 * var81 >> 9;
                                             var84 += var14.field4253 * var82 >> 9;
                                          }

                                          class734.field10566.method979();
                                          class444.field6473.method338(class734.field10566);
                                          class444.field6473.method429(var83, var84, var81, var82);
                                          class444.field6473.method380();
                                          if (var14.field4296) {
                                             class444.field6473.method316(false);
                                          }

                                          label737: {
                                             if (!var14.field4303) {
                                                int var85 = (var14.field4298 << 2) * class593.field8539[var14.field4369 << 3] >> 14;
                                                int var86 = (var14.field4298 << 2) * class593.field8548[var14.field4369 << 3] >> 14;
                                                class252.field3603.method994(-var14.field4246 << 3);
                                                class252.field3603.method1005(var14.field4222 << 3);
                                                class252.field3603.method990(var14.field4271 << 2, (var14.field4343 << 2) + var85 + var69, var86 - -(var14.field4343 << 2));
                                                class252.field3603.method998(var14.field4369 << 3);
                                                if (!var11) {
                                                   break label737;
                                                }
                                             }

                                             class252.field3603.method1002(var14.field4369);
                                             class252.field3603.method1005(var14.field4222);
                                             class252.field3603.method1015(var14.field4246);
                                             class252.field3603.method990(var14.field4370, var14.field4253, var14.field4299);
                                          }

                                          var14.method2359(0, class29.field458, var68, class444.field6473, class252.field3603);
                                          if (class599.field8635) {
                                             class444.field6473.method309(var20, var21, var20 - -var14.field4308, var14.field4226 + var21);
                                          }

                                          label1017: {
                                             if (var14.field4303) {
                                                if (!var14.field4287) {
                                                   var68.method503(class252.field3603, (class362)null, 1);
                                                   if (var14.field4273 == null) {
                                                      break label1017;
                                                   }

                                                   class444.field6473.method256(var14.field4273.method488());
                                                   if (!var11) {
                                                      break label1017;
                                                   }
                                                }

                                                var68.method552(class252.field3603, (class362)null, var14.field4298, 1);
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             if (!var14.field4287) {
                                                var68.method503(class252.field3603, (class362)null, 1);
                                                if (var14.field4273 == null) {
                                                   break label1017;
                                                }

                                                class444.field6473.method256(var14.field4273.method488());
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             var68.method552(class252.field3603, (class362)null, var14.field4298 << 2, 1);
                                          }

                                          if (class599.field8635) {
                                             class444.field6473.method333(arg5, arg9, arg6, arg3);
                                          }

                                          if (var14.field4296) {
                                             class444.field6473.method316(true);
                                          }
                                       }

                                       if (!class262.field3734) {
                                          break label1076;
                                       }

                                       if (!arg10) {
                                          class704.method5120(var16, -77, var15, var17, var18);
                                          if (!var11) {
                                             break label1076;
                                          }
                                       }

                                       class670.method4896(var17, 0, var15, var18, var16);
                                       if (!var11) {
                                          break label1076;
                                       }
                                    }

                                    if (var14.field4270 == 9) {
                                       int var87;
                                       int var88;
                                       int var89;
                                       int var90;
                                       label711: {
                                          if (var14.field4251) {
                                             var87 = var14.field4226 + var21;
                                             var88 = var20;
                                             var89 = var14.field4308 + var20;
                                             var90 = var21;
                                             if (!var11) {
                                                break label711;
                                             }
                                          }

                                          var87 = var21;
                                          var88 = var20;
                                          var89 = var20 - -var14.field4308;
                                          var90 = var14.field4226 + var21;
                                       }

                                       label706: {
                                          if (~var14.field4311 == -2) {
                                             class444.field6473.method340(var88, var87, var89, var90, var14.field4291, 0);
                                             if (!var11) {
                                                break label706;
                                             }
                                          }

                                          class444.field6473.method409(var88, var87, var89, var90, var14.field4291, var14.field4311, 0);
                                       }

                                       if (class262.field3734) {
                                          if (arg10) {
                                             class670.method4896(var17, 0, var15, var18, var16);
                                             if (var11) {
                                                class704.method5120(var16, -84, var15, var17, var18);
                                             }
                                          } else {
                                             class704.method5120(var16, -84, var15, var17, var18);
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

               ++var13;
            } while(~arg0.length < ~var13);

         }
      } catch (RuntimeException var92) {
         throw class608.method4462(var92, field9316[16] + (arg0 != null ? field9316[7] : field9316[21]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(BI)V",
      line = 874
   )
   public static final void method4678(byte param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "c",
      descriptor = "(B)Z",
      line = 896
   )
   public final boolean method4679(byte arg0) {
      try {
         if (arg0 != 115) {
            this.method1642((byte)-35);
         }

         ++field9315;
         return this.method1642((byte)88) || this.method1633(true) || this.method1639(arg0 ^ 12);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9316[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(I)Luv;"
   )
   public abstract class380 method1631(int arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method1642(byte arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method1630(boolean arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public abstract boolean method1633(boolean arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1636(int arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method1632(int arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method1634(byte arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "d",
      descriptor = "(I)Z"
   )
   public abstract boolean method1639(int arg0);

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4680(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4681(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
