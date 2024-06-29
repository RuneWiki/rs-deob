import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class705 {
   @OriginalMember(
      owner = "client!jha",
      name = "g",
      descriptor = "I"
   )
   private int field10611 = 0;
   @OriginalMember(
      owner = "client!jha",
      name = "k",
      descriptor = "I"
   )
   private int field10616 = 0;
   @OriginalMember(
      owner = "client!jha",
      name = "e",
      descriptor = "I"
   )
   private int field10620 = 0;
   @OriginalMember(
      owner = "client!jha",
      name = "i",
      descriptor = "Lc;"
   )
   private class652 field10609;
   @OriginalMember(
      owner = "client!jha",
      name = "f",
      descriptor = "Lwfa;"
   )
   private class786 field10623;
   @OriginalMember(
      owner = "client!jha",
      name = "c",
      descriptor = "[Lmia;"
   )
   private class416[] field10614;
   @OriginalMember(
      owner = "client!jha",
      name = "p",
      descriptor = "Liha;"
   )
   public class771 field10608;
   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10624 = new String[]{method5208(method5207("\u0012\u0003Q!\f")), method5208(method5207("\u0003E\u001e!3A")), method5208(method5207("\u0007X\u0013c")), method5208(method5207("\u0003E\u001e!9A")), method5208(method5207("\u0003E\u001e!6A")), method5208(method5207("\u0003E\u001e!4A")), method5208(method5207("\u0003E\u001e!7A")), method5208(method5207("\u0003E\u001e!5A")), method5208(method5207("\u0003E\u001e!0A")), method5208(method5207("\u0003E\u001e!M\u0000C\u0016{OA")), method5208(method5207("\u0003E\u001e!2A"))};
   @OriginalMember(
      owner = "client!jha",
      name = "n",
      descriptor = "Lhka;"
   )
   public static class377 field10610 = new class377(12, 16);
   @OriginalMember(
      owner = "client!jha",
      name = "d",
      descriptor = "I"
   )
   public static int field10621 = -1;
   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "I"
   )
   public static int field10612;
   @OriginalMember(
      owner = "client!jha",
      name = "h",
      descriptor = "I"
   )
   public static int field10613;
   @OriginalMember(
      owner = "client!jha",
      name = "o",
      descriptor = "I"
   )
   public static int field10615;
   @OriginalMember(
      owner = "client!jha",
      name = "m",
      descriptor = "I"
   )
   public static int field10617;
   @OriginalMember(
      owner = "client!jha",
      name = "l",
      descriptor = "I"
   )
   public static int field10618;
   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "I"
   )
   public static int field10619;
   @OriginalMember(
      owner = "client!jha",
      name = "j",
      descriptor = "I"
   )
   public static int field10622;

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method5199(int arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         if (arg1) {
            if (~class288.field4539 != 0) {
               class558.method4220(true, class288.field4539);
            }

            int var10000;
            label65: {
               class276 var3 = (class276)class507.field7766.method3139(arg0 + 5);
               if (var2) {
                  var10000 = var3.method2478(1001);
               } else if (var3 == null) {
                  class288.field4539 = -1;
                  class507.field7766 = new class389(8);
                  class502.method3890((byte)119);
                  class288.field4539 = class728.field10872;
                  class714.method5291(true, false);
                  class204.method1782((byte)7);
                  var10000 = class288.field4539;
                  if (!var2) {
                     break label65;
                  }
               } else {
                  var10000 = var3.method2478(1001);
               }

               label64:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class276)class507.field7766.method3139(arg0 ^ 127);
                        if (var3 == null) {
                           if (!var2) {
                              class288.field4539 = -1;
                              class507.field7766 = new class389(8);
                              class502.method3890((byte)119);
                              class288.field4539 = class728.field10872;
                              class714.method5291(true, false);
                              class204.method1782((byte)7);
                              var10000 = class288.field4539;
                              break;
                           }

                           class741.method5443(-1, var3, false, true);
                           var3 = (class276)class507.field7766.method3147(-21068);
                        } else {
                           class741.method5443(-1, var3, false, true);
                           var3 = (class276)class507.field7766.method3147(-21068);
                        }
                     } else {
                        class741.method5443(-1, var3, false, true);
                        var3 = (class276)class507.field7766.method3147(-21068);
                     }

                     if (var3 == null) {
                        class288.field4539 = -1;
                        class507.field7766 = new class389(8);
                        class502.method3890((byte)119);
                        class288.field4539 = class728.field10872;
                        class714.method5291(true, false);
                        class204.method1782((byte)7);
                        var10000 = class288.field4539;
                        if (!var2) {
                           break label64;
                        }
                     } else {
                        var10000 = var3.method2478(1001);
                     }
                  }
               } while(var2);
            }

            class469.method3639(var10000);
         }

         label33: {
            ++field10622;
            class608.method4480((byte)-31);
            class686.field10207 = false;
            class25.method188(arg0 + -82);
            class436.field6683 = -1;
            class296.method2488(class91.field1315, -1);
            class476.field7251 = new class9();
            class476.field7251.field1505 = class513.field7828 * 512 / 2;
            class476.field7251.field1683[0] = class513.field7828 / 2;
            class476.field7251.field1494 = class475.field7230 * 512 / 2;
            class691.field10259 = arg0;
            class401.field6288 = arg0;
            class476.field7251.field1685[0] = class475.field7230 / 2;
            if (class648.field9340 != 2) {
               class301.method2521(arg0 + 3);
               if (!var2) {
                  break label33;
               }
            }

            class691.field10259 = class621.field9036 << 9;
            class401.field6288 = class754.field11172 << 9;
         }

         class410.method3287(false);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10624[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(I[IIZ[II[III[IIIII[I[[[BZB)V"
   )
   public static final void method5200(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14, byte[][][] arg15, boolean arg16, byte arg17) {
      boolean var18 = client.field1786;

      try {
         ++field10615;
         if (~class67.field883 != 0) {
            int[] var19 = class450.field6888.method669();
            int var20 = var19[arg10];
            int var21 = var19[1];
            int var22 = var19[2];
            int var23 = var19[3];
            int var24 = var22;
            int var25 = var23;
            if (class67.field883 == 1) {
               var25 = (int)((double)class208.field3176 * (double)var23 / (double)class63.field837);
               var24 = (int)((double)class208.field3176 * (double)var22 / (double)class63.field837);
            }

            if (!class67.field884) {
               label409: {
                  if (~class67.field883 == -2) {
                     class119.method1102(arg10);
                  }

                  int var26 = -class534.field8103 + arg8;
                  int var27 = -class742.field11032 + arg0;
                  int var28 = arg7 - class573.field8490;
                  int var29 = (int)(((double)var28 * class193.field2989 + (double)var26 * class97.field1364 + (double)var27 * class383.field6042) * (double)var24 / (double)arg11);
                  int var30 = (int)(((double)var28 * class238.field3622 + (double)var26 * class341.field5194 + (double)var27 * class162.field2420) * (double)var25 / (double)arg11);
                  double var31 = (double)var28 * class341.field5193 + (double)var26 * class780.field11435 + (double)var27 * class298.field4690;
                  int var33 = -class497.field7569 + class1.field7 + var29;
                  int var34 = -class302.field4730 + class263.field4324 + var30;
                  int var35 = class86.field1255 + var33;
                  int var36 = class208.field3176 + var34;
                  if ((~var33 > -1 || var34 < 0 || ~class790.field11557 > ~var35 || class63.field837 < var36) && ~class67.field883 != -3) {
                     if (var35 <= 0 || var36 <= 0 || var33 >= class790.field11557 || class63.field837 <= var34) {
                        class67.field884 = true;
                        if (!var18) {
                           break label409;
                        }
                     }

                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     double var43;
                     label334: {
                        int var37 = var33 - class1.field7;
                        int var38 = -class263.field4324 + var34;
                        var39 = 0;
                        var40 = 0;
                        var41 = 0;
                        var42 = 0;
                        var43 = 0.0D;
                        if (~class67.field883 != -1) {
                           if (class67.field883 != 1) {
                              break label334;
                           }

                           var42 = var38 / class37.field444;
                           var41 = var37 / class155.field2316;
                           var40 = class37.field444 * var42;
                           var39 = class155.field2316 * var41;
                           var43 = (class234.field3582 + var31) * (double)(var37 * var39 - -(var38 * var40)) / (double)(var37 * var37 + var38 * var38);
                           if (!var18) {
                              break label334;
                           }
                        }

                        var40 = var38;
                        var43 = class234.field3582 + var31;
                        var39 = var37;
                     }

                     double var45;
                     int var47;
                     int var48;
                     int var49;
                     int var50;
                     int var51;
                     int var52;
                     int var53;
                     int var54;
                     int var55;
                     int var56;
                     label362: {
                        var45 = -var43;
                        var47 = 0;
                        var48 = 0;
                        var49 = 0;
                        var50 = 0;
                        var51 = 0;
                        var52 = 0;
                        if (var39 >= 0) {
                           var53 = 0;
                           var54 = -var39 + class790.field11557;
                           var55 = var39;
                           var56 = var54;
                           if (~class67.field883 != -2) {
                              break label362;
                           }

                           var51 = var41;
                           var49 = -var41 + class13.field166;
                           if (!var18) {
                              break label362;
                           }
                        }

                        var54 = class790.field11557 + var39;
                        var53 = -var39;
                        var56 = 0;
                        if (~class67.field883 == -2) {
                           var51 = -var41;
                           var49 = 0;
                        }

                        var55 = var53;
                     }

                     int var57;
                     int var58;
                     int var59;
                     int var60;
                     int var61;
                     int var62;
                     label363: {
                        if (~var40 <= -1) {
                           var57 = 0;
                           var58 = -var40 + class63.field837;
                           var59 = 0;
                           var60 = var58;
                           var61 = var40;
                           if (class67.field883 == 1) {
                              var50 = 0;
                              var47 = class395.field6185 - var42;
                              var48 = var42;
                              var52 = var47;
                           }

                           var62 = var58;
                           if (!var18) {
                              break label363;
                           }
                        }

                        var60 = 0;
                        var57 = -var40;
                        var58 = class63.field837 - -var40;
                        var61 = var57;
                        if (~class67.field883 == -2) {
                           var47 = 0;
                           var48 = -var42;
                           var52 = class395.field6185 - -var42;
                           var50 = var48;
                        }

                        var62 = var58;
                        var59 = var57;
                     }

                     class208 var63 = class609.field8867.field3729;
                     class788 var64 = (class788)var63.method1815(arg10 ^ 1);
                     if (var18 || var64 != null) {
                        do {
                           class49[] var65 = var64.field11545;
                           boolean var66 = true;
                           int var67 = 0;
                           if (var18 || var67 < var65.length) {
                              do {
                                 class49 var68 = var65[var67];
                                 int var69 = var68.field636;
                                 int var70 = var68.field634;
                                 int var71 = var68.field635;
                                 int var72 = var68.field633;
                                 int var73;
                                 var68.field635 = var73 = -var39 + var71;
                                 int var74 = var68.field631;
                                 int var75;
                                 var68.field634 = var75 = var70 - var40;
                                 int var76;
                                 var68.field633 = var76 = -var40 + var72;
                                 int var77;
                                 var68.field636 = var77 = -var39 + var69;
                                 if (var66) {
                                    int var78 = (var77 >= var73 ? var73 : var77) - var74;
                                    if (~class790.field11557 <= ~var78) {
                                       int var79 = -var74 + (~var75 > ~var76 ? var75 : var76);
                                       if (~var79 >= ~class63.field837) {
                                          int var80 = var74 + (var73 <= var77 ? var77 : var73);
                                          if (~var80 <= -1) {
                                             int var81 = var74 + (~var75 <= ~var76 ? var75 : var76);
                                             if (~var81 <= -1) {
                                                var66 = false;
                                             }
                                          }
                                       }
                                    }
                                 }

                                 ++var67;
                              } while(var67 < var65.length);
                           }

                           if (var66) {
                              var64.method3159(true);
                              class142.method1291(var64, arg10 ^ -91);
                           }

                           var64 = (class788)var63.method1817(0);
                        } while(var64 != null);
                     }

                     if (class67.field883 == 0) {
                        class450.field6888.method693(class595.field8748);
                     }

                     label293: {
                        class450.field6888.method643(-var39, -var40);
                        class450.field6888.method592(var53, var57, var54, var58, var45);
                        class430.method3402(class234.field3582 + var45, arg10 ^ 109);
                        class37.field452 = class234.field3582 + var45;
                        if (~class67.field883 != -2) {
                           class658.field9838 = var25;
                           class341.field5190 = var24;
                           class4.field18 = class263.field4324 + var21 - (class302.field4730 + var40);
                           class620.field9021 = var20 - var39 + -class497.field7569 + class1.field7;
                           class450.field6888.method639(class620.field9021, class4.field18, class341.field5190, class658.field9838);
                           if (!var18) {
                              break label293;
                           }
                        }

                        class4.field18 = -class302.field4730 + -var40 + var21;
                        class620.field9021 = -var39 + var20 - class497.field7569;
                        class341.field5190 = var24;
                        class658.field9838 = var25;
                        class450.field6888.method639(class620.field9021, class4.field18, class341.field5190, class658.field9838);
                     }

                     class293.method2468(class609.field8867);
                     if (var61 > 0) {
                        class450.field6888.method629(0, var60, class790.field11557, var60 + var61);
                        class450.field6888.method655();
                        class450.field6888.method590(class751.field11131);
                        class315.method2615(arg13, arg8, arg0, arg7, arg15, arg4, arg14, arg9, arg1, arg6, arg12, arg17, arg2, arg5, arg16, arg3, arg11, 1, false);
                     }

                     if (~var55 < -1) {
                        class450.field6888.method629(var56, var59, var55 + var56, var59 + var62);
                        class450.field6888.method655();
                        class450.field6888.method590(class751.field11131);
                        class315.method2615(arg13, arg8, arg0, arg7, arg15, arg4, arg14, arg9, arg1, arg6, arg12, arg17, arg2, arg5, arg16, arg3, arg11, 1, false);
                     }

                     class450.field6888.method701();
                     class410.method3285();
                     if (~class67.field883 == -1) {
                        class450.field6888.method618();
                     }

                     class302.field4730 += var40;
                     class234.field3582 += var45;
                     class497.field7569 += var39;
                     class656.field9793 = class1.field7 + var29 + -class497.field7569;
                     class177.field2773 = class263.field4324 - -var30 + -class302.field4730;
                     if (class67.field883 != 1) {
                        break label409;
                     }

                     class249.field3781 += var42;
                     class25.field321 += var41;
                     int var82 = 0;
                     if (var18 || ~class395.field6185 < ~var82) {
                        do {
                           int var83 = class409.method3280(class249.field3781 + var82, (byte)-112, class395.field6185) * class13.field166;
                           int var84 = 0;
                           if (var18 || ~class13.field166 < ~var84) {
                              do {
                                 int var85 = class409.method3280(class25.field321 + var84, (byte)-94, class13.field166) + var83;
                                 boolean var86 = var82 >= var47 && var82 < var47 - -var48 ? true : (var50 <= var82 ? (var82 < var50 + var52 ? (var49 <= var84 ? var49 + var51 > var84 : false) : false) : false);
                                 class35.field423[var85].method1289(class155.field2316 * var84, class37.field444 * var82, class155.field2316, class37.field444, 0, 0, var86, true);
                                 ++var84;
                              } while(~class13.field166 < ~var84);
                           }

                           ++var82;
                        } while(~class395.field6185 < ~var82);
                     }

                     if (!var18) {
                        break label409;
                     }
                  }

                  if (class67.field883 == 2) {
                     class234.field3582 = -var31;
                  }

                  class656.field9793 = var33;
                  class177.field2773 = var34;
               }
            }

            if (class67.field884) {
               class234.field3582 = 0.0D;
               class656.field9793 = class1.field7;
               class177.field2773 = class263.field4324;
               class742.field11032 = arg0;
               class573.field8490 = arg7;
               class302.field4730 = 0;
               class497.field7569 = 0;
               class534.field8103 = arg8;
               if (~class67.field883 == -1) {
                  class450.field6888.method693(class595.field8748);
               }

               label239: {
                  class450.field6888.method701();
                  class450.field6888.method655();
                  class450.field6888.method590(class751.field11131);
                  class691.field10264.method1556(class534.field8103, class742.field11032, class573.field8490, class560.field8328, class200.field3072, class662.field9929);
                  class450.field6888.method688(class691.field10264);
                  if (class67.field883 == 1) {
                     class341.field5190 = var24;
                     class620.field9021 = var20;
                     class658.field9838 = var25;
                     class4.field18 = var21;
                     class450.field6888.method639(class620.field9021, class4.field18, class341.field5190, class658.field9838);
                     if (!var18) {
                        break label239;
                     }
                  }

                  class620.field9021 = var20 - -class1.field7;
                  class658.field9838 = var25;
                  class341.field5190 = var24;
                  class4.field18 = class263.field4324 + var21;
                  class450.field6888.method639(class620.field9021, class4.field18, class341.field5190, class658.field9838);
               }

               class37.field452 = 0.0D;
               class609.field8867.method2090(arg10);
               class293.method2468(class609.field8867);
               class315.method2615(arg13, arg8, arg0, arg7, arg15, arg4, arg14, arg9, arg1, arg6, arg12, arg17, arg2, arg5, arg16, arg3, arg11, 1, false);
               class410.method3285();
               class67.field884 = false;
               if (~class67.field883 == -1) {
                  class450.field6888.method618();
               }

               if (class67.field883 == 1) {
                  class759.method5564(-113);
               }
            }

            if (~class67.field883 == -1) {
               class595.field8748.method1288(class656.field9793, class177.field2773, class86.field1255, class208.field3176, 0, 0, true, true);
            }

            label369: {
               ++class456.field7001;
               class430.method3402(class234.field3582, 45);
               class775.field11387 = class234.field3582;
               if (~class67.field883 != -1 && ~class67.field883 != -3) {
                  if (~class67.field883 != -2) {
                     break label369;
                  }

                  class727.field10857 = -class302.field4730 + var21;
                  class395.field6189 = var24;
                  class95.field1334 = var20 - class497.field7569;
                  class740.field11007 = var25;
                  class450.field6888.method639(class95.field1334, class727.field10857, class395.field6189, class740.field11007);
                  class450.field6888.method629(class656.field9793, class177.field2773, class86.field1255 + class656.field9793, class208.field3176 + class177.field2773);
                  if (!var18) {
                     break label369;
                  }
               }

               if (~class67.field883 == -3) {
                  class450.field6888.method590(class751.field11131);
                  class450.field6888.method655();
               }

               class740.field11007 = var25;
               class727.field10857 = class263.field4324 + var21 + -class302.field4730 + -class177.field2773;
               class95.field1334 = -class497.field7569 + var20 - (-class1.field7 + class656.field9793);
               class395.field6189 = var24;
               class450.field6888.method639(class95.field1334, class727.field10857, class395.field6189, class740.field11007);
            }

            class315.method2615(arg13, arg8, arg0, arg7, arg15, arg4, arg14, arg9, arg1, arg6, arg12, arg17, arg2, arg5, arg16, arg3, arg11, class67.field883 != 2 ? 2 : 0, class67.field883 == 1);
            class450.field6888.method701();
            class450.field6888.method639(var20, var21, var22, var23);
         }
      } catch (RuntimeException var88) {
         throw class482.method3757(var88, field10624[1] + arg0 + ',' + (arg1 != null ? field10624[0] : field10624[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10624[0] : field10624[2]) + ',' + arg5 + ',' + (arg6 != null ? field10624[0] : field10624[2]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field10624[0] : field10624[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field10624[0] : field10624[2]) + ',' + (arg15 != null ? field10624[0] : field10624[2]) + ',' + arg16 + ',' + arg17 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(BILuaa;)V"
   )
   public static final void method5201(byte arg0, int arg1, class119 arg2) {
      boolean var3 = client.field1786;

      try {
         int var4;
         int var5;
         label109: {
            ++field10613;
            var4 = -1;
            var5 = 0;
            if (~arg2.field1659 < ~class308.field4801) {
               class67.method513(arg2, 12288);
               if (!var3) {
                  break label109;
               }
            }

            if (class308.field4801 > arg2.field1675) {
               class466.method3616(false, arg2, (byte)114);
               var4 = class206.field3134;
               var5 = class356.field5489;
               if (!var3) {
                  break label109;
               }
            }

            class14.method107(arg2, (byte)117);
         }

         class119 var10000;
         if (~arg2.field1505 > -513 || ~arg2.field1494 > -513 || (class513.field7828 + -1) * 512 <= arg2.field1505 || arg2.field1494 >= (class475.field7230 + -1) * 512) {
            arg2.field1657.method2981(-1, 0);
            int var6 = 0;
            if (var3) {
               arg2.field1678[var6].field8707 = -1;
               arg2.field1678[var6].field8705.method2981(-1, 0);
               ++var6;
            }

            while(true) {
               if (arg2.field1678.length <= var6) {
                  arg2.field1659 = 0;
                  var5 = 0;
                  arg2.field1603 = null;
                  arg2.field1675 = 0;
                  var4 = -1;
                  arg2.field1505 = arg2.field1683[0] * 512 + arg2.method61((byte)70) * 256;
                  arg2.field1494 = arg2.field1685[0] * 512 + 256 * arg2.method61((byte)70);
                  var10000 = arg2;
                  if (!var3) {
                     arg2.method1094((byte)-97);
                     break;
                  }
               } else {
                  arg2.field1678[var6].field8707 = -1;
                  var10000 = arg2;
               }

               var10000.field1678[var6].field8705.method2981(-1, 0);
               ++var6;
            }
         }

         if (class476.field7251 == arg2 && (~arg2.field1505 > -6145 || ~arg2.field1494 > -6145 || arg2.field1505 >= class513.field7828 * 512 + -6144 || (class475.field7230 - 12) * 512 <= arg2.field1494)) {
            arg2.field1657.method2981(-1, 0);
            int var7 = 0;
            if (var3) {
               arg2.field1678[var7].field8707 = -1;
               arg2.field1678[var7].field8705.method2981(-1, 0);
               ++var7;
            }

            while(true) {
               if (~arg2.field1678.length >= ~var7) {
                  var5 = 0;
                  arg2.field1603 = null;
                  var4 = -1;
                  arg2.field1659 = 0;
                  arg2.field1675 = 0;
                  arg2.field1505 = arg2.field1683[0] * 512 + 256 * arg2.method61((byte)70);
                  arg2.field1494 = arg2.field1685[0] * 512 + arg2.method61((byte)70) * 256;
                  var10000 = arg2;
                  if (!var3) {
                     arg2.method1094((byte)-109);
                     break;
                  }
               } else {
                  arg2.field1678[var7].field8707 = -1;
                  var10000 = arg2;
               }

               var10000.field1678[var7].field8705.method2981(-1, 0);
               ++var7;
            }
         }

         int var8 = class658.method4848(-31138, arg2);
         class689.method5075(90, arg2);
         if (arg0 <= -83) {
            class558.method4221((byte)-77, var5, var8, var4, arg2);
            class353.method2829(arg2, var4, 14478);
            class660.method4863(1, arg2);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field10624[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10624[0] : field10624[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method5202(int arg0, byte arg1) {
      try {
         ++field10612;
         return arg1 != 6 ? true : this.field10614[arg0].method1830((byte)-106);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10624[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(Lvda;IB)Z"
   )
   public final boolean method5203(class799 arg0, int arg1, byte arg2) {
      try {
         ++field10618;
         if (~this.field10620 == -1) {
            return false;
         } else {
            this.field10614[Integer.MAX_VALUE & this.field10620].method1826(arg0, arg1, (byte)-62);
            if (arg2 < 41) {
               this.field10623 = null;
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10624[3] + (arg0 != null ? field10624[0] : field10624[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5204(int arg0) {
      try {
         field10610 = null;
         if (arg0 != -14451) {
            method5204(-38);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10624[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IIZZII)V"
   )
   public final void method5205(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
      try {
         boolean var9 = arg3 & this.field10609.method585();
         ++field10619;
         if (!var9 && (~arg1 == -5 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
               arg5 = arg4;
            }

            arg1 = 2;
         }

         if (~arg1 != -1 && arg2) {
            arg1 |= Integer.MIN_VALUE;
         }

         label72: {
            if (~this.field10620 == ~arg1) {
               if (this.field10620 == 0) {
                  break label72;
               }

               this.field10614[this.field10620 & Integer.MAX_VALUE].method1828(false, arg2);
               if (this.field10616 == arg4 && this.field10611 == arg5) {
                  break label72;
               }

               this.field10614[Integer.MAX_VALUE & this.field10620].method1833(arg5, -104, arg4);
               this.field10611 = arg5;
               this.field10616 = arg4;
               if (!client.field1786) {
                  break label72;
               }
            }

            if (this.field10620 != 0) {
               this.field10614[this.field10620 & Integer.MAX_VALUE].method1827((byte)77);
            }

            if (arg1 != 0) {
               this.field10614[Integer.MAX_VALUE & arg1].method1831(arg2, 3211);
               this.field10614[arg1 & Integer.MAX_VALUE].method1828(false, arg2);
               this.field10614[arg1 & Integer.MAX_VALUE].method1833(arg5, -93, arg4);
            }

            this.field10616 = arg4;
            this.field10620 = arg1;
            this.field10611 = arg5;
         }

         if (arg0 != Integer.MAX_VALUE) {
            method5206((byte)-22, -90, 10, -114, 77);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field10624[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method5206(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class443.field6806 = arg1;
         class182.field2833 = arg3;
         ++field10617;
         int var5 = -71 % ((arg0 - 52) / 46);
         class368.field5724 = arg4;
         class84.field1212 = arg2;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10624[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "<init>",
      descriptor = "(Lc;)V"
   )
   public class705(class652 arg0) {
      try {
         this.field10609 = arg0;
         this.field10623 = new class786(arg0);
         this.field10614 = new class416[10];
         this.field10614[1] = new class612(arg0);
         this.field10614[2] = new class312(arg0, this.field10623);
         this.field10614[4] = new class210(arg0, this.field10623);
         this.field10614[5] = new class492(arg0, this.field10623);
         this.field10614[6] = new class723(arg0);
         this.field10614[7] = new class683(arg0);
         this.field10614[3] = this.field10608 = new class771(arg0);
         this.field10614[8] = new class356(arg0, this.field10623);
         this.field10614[9] = new class413(arg0, this.field10623);
         if (!this.field10614[8].method1830((byte)55)) {
            this.field10614[8] = this.field10614[4];
         }

         if (!this.field10614[9].method1830((byte)-118)) {
            this.field10614[9] = this.field10614[8];
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10624[9] + (arg0 != null ? field10624[0] : field10624[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5207(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5208(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
