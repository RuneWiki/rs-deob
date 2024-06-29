import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class483 {
   @OriginalMember(
      owner = "client!nq",
      name = "l",
      descriptor = "Lgw;"
   )
   private class179 field7018 = new class179(64);
   @OriginalMember(
      owner = "client!nq",
      name = "d",
      descriptor = "Lhw;"
   )
   private class141 field7021;
   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7025 = new String[]{method3658(method3657("\u00128=\u0018\u0014")), method3658(method3657("\u00128=\u0012\u0014")), method3658(method3657("\u00128=\u001e\u0014")), method3658(method3657("\u00128=\u001c\u0014")), method3658(method3657("\u0007g=tA")), method3658(method3657("\u0012<\u007f6")), method3658(method3657("\u00128=\u001f\u0014")), method3658(method3657("\u00128=fU\u0012 gd\u0014")), method3658(method3657("\u00128=\u001b\u0014")), method3658(method3657("\u00128=\u0013\u0014")), method3658(method3657("\u00128=\u001d\u0014"))};
   @OriginalMember(
      owner = "client!nq",
      name = "k",
      descriptor = "Lqe;"
   )
   public static class491 field7015 = new class491();
   @OriginalMember(
      owner = "client!nq",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field7023 = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
   @OriginalMember(
      owner = "client!nq",
      name = "g",
      descriptor = "I"
   )
   public static int field7013;
   @OriginalMember(
      owner = "client!nq",
      name = "h",
      descriptor = "I"
   )
   public static int field7014;
   @OriginalMember(
      owner = "client!nq",
      name = "f",
      descriptor = "I"
   )
   public static int field7016;
   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "I"
   )
   public static int field7017;
   @OriginalMember(
      owner = "client!nq",
      name = "e",
      descriptor = "I"
   )
   public static int field7019;
   @OriginalMember(
      owner = "client!nq",
      name = "c",
      descriptor = "I"
   )
   public static int field7020;
   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "I"
   )
   public static int field7022;
   @OriginalMember(
      owner = "client!nq",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field7024;

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(B)V",
      line = 5
   )
   public final void method3648(byte arg0) {
      try {
         class179 var2 = this.field7018;
         synchronized(this.field7018) {
            this.field7018.method1591((byte)58);
            if (arg0 <= 124) {
               field7015 = null;
            }
         }

         ++field7013;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7025[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "([BB)V",
      line = 22
   )
   public static final void method3649(byte[] arg0, byte arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg1 < 35) {
            field7023 = null;
         }

         ++field7014;
         class473 var3 = new class473(arg0);

         while(true) {
            label101:
            while(true) {
               int var4 = var3.method3564((byte)-54);
               if (var4 == 0) {
                  if (!var2) {
                     return;
                  }
                  break;
               }

               if (~var4 == -2) {
                  break;
               }

               if (var4 == 4) {
                  int var5 = var3.method3564((byte)-91);
                  class357.field5036 = new int[var5];
                  int var6 = 0;
                  if (var2) {
                     class357.field5036[var6] = var3.method3565(true);
                     if (class357.field5036[var6] == 65535) {
                        class357.field5036[var6] = -1;
                     }

                     ++var6;
                  }

                  while(true) {
                     if (~var5 >= ~var6) {
                        if (!var2) {
                           if (!var2) {
                              continue label101;
                           }
                           break;
                        }
                     } else {
                        class357.field5036[var6] = var3.method3565(true);
                     }

                     if (class357.field5036[var6] == 65535) {
                        class357.field5036[var6] = -1;
                     }

                     ++var6;
                  }
               }

               if (~var4 == -6) {
                  int var7 = var3.method3564((byte)-51);
                  class768.field11161 = new int[var7];
                  int var8 = 0;
                  if (var2) {
                     class768.field11161[var8] = var3.method3565(true);
                     if (~class768.field11161[var8] == -65536) {
                        class768.field11161[var8] = -1;
                     }

                     ++var8;
                  }

                  while(true) {
                     if (var8 >= var7) {
                        if (!var2) {
                           if (var2) {
                              break label101;
                           }
                           break;
                        }
                     } else {
                        class768.field11161[var8] = var3.method3565(true);
                     }

                     if (~class768.field11161[var8] == -65536) {
                        class768.field11161[var8] = -1;
                     }

                     ++var8;
                  }
               }
            }

            int[] var9 = class22.field348 = new int[6];
            var9[0] = var3.method3565(true);
            var9[1] = var3.method3565(true);
            var9[2] = var3.method3565(true);
            var9[3] = var3.method3565(true);
            var9[4] = var3.method3565(true);
            var9[5] = var3.method3565(true);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field7025[3] + (arg0 != null ? field7025[4] : field7025[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(B)V",
      line = 101
   )
   public static void method3650(byte arg0) {
      try {
         if (arg0 != -94) {
            field7024 = false;
         }

         field7015 = null;
         field7023 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7025[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(II)Lofa;",
      line = 112
   )
   public final class346 method3651(int arg0, int arg1) {
      try {
         ++field7019;
         class179 var3 = this.field7018;
         class346 var4;
         synchronized(this.field7018) {
            var4 = (class346)this.field7018.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field7021;
            byte[] var6;
            synchronized(this.field7021) {
               var6 = this.field7021.method1347((byte)124, arg1, arg0);
            }

            class346 var7 = new class346();
            if (var6 != null) {
               var7.method2677((byte)-126, new class473(var6));
            }

            class179 var8 = this.field7018;
            synchronized(this.field7018) {
               this.field7018.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field7025[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(II)V",
      line = 139
   )
   public final void method3652(int arg0, int arg1) {
      try {
         class179 var3 = this.field7018;
         synchronized(this.field7018) {
            this.field7018.method1579(93, arg1);
         }

         if (arg0 != -1) {
            field7015 = null;
         }

         ++field7022;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7025[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Z)V",
      line = 155
   )
   public final void method3653(boolean arg0) {
      try {
         class179 var2 = this.field7018;
         synchronized(this.field7018) {
            this.field7018.method1589((byte)83);
         }

         ++field7017;
         if (arg0) {
            field7015 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7025[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(BZ[IIBI[I[[[BI[IIIIIZI[I[I)V",
      line = 168
   )
   public static final void method3654(byte arg0, boolean arg1, int[] arg2, int arg3, byte arg4, int arg5, int[] arg6, byte[][][] arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int[] arg16, int[] arg17) {
      boolean var18 = client.field4564;

      try {
         ++field7020;
         if (~class402.field5939 != 0) {
            int[] var19 = class393.field5787.method278();
            int var20 = var19[0];
            int var21 = var19[1];
            int var22 = var19[2];
            int var23 = var19[3];
            int var24 = var22;
            int var25 = -103 / ((arg4 - -71) / 42);
            int var26 = var23;
            if (class402.field5939 == 1) {
               var26 = (int)((double)class634.field9251 * (double)var23 / (double)class31.field473);
               var24 = (int)((double)class634.field9251 * (double)var22 / (double)class31.field473);
            }

            if (!class186.field2818) {
               label414: {
                  if (~class402.field5939 == -2) {
                     class704.method5121(true);
                  }

                  int var27 = -class320.field4611 + arg3;
                  int var28 = -class754.field10955 + arg10;
                  int var29 = -class319.field4606 + arg8;
                  int var30 = (int)(((double)var29 * class329.field4703 + (double)var27 * class702.field10254 + (double)var28 * class275.field3898) * (double)var24 / (double)arg13);
                  int var31 = (int)(((double)var29 * class674.field9888 + (double)var27 * class14.field203 + (double)var28 * class61.field1150) * (double)var26 / (double)arg13);
                  double var32 = (double)var29 * class49.field1050 + (double)var27 * class596.field8596 + (double)var28 * class332.field4745;
                  int var34 = -class551.field7955 + var30 + class567.field8231;
                  int var35 = -class637.field9275 + class493.field7174 + var31;
                  int var36 = class82.field1382 + var34;
                  int var37 = class634.field9251 + var35;
                  if (~var34 <= -1 && ~var35 <= -1 && var36 <= class220.field3311 && ~var37 >= ~class31.field473 || class402.field5939 == 2) {
                     class490.field7149 = var35;
                     class601.field8673 = var34;
                     if (~class402.field5939 != -3) {
                        break label414;
                     }

                     class164.field2596 = -var32;
                     if (!var18) {
                        break label414;
                     }
                  }

                  if (var36 > 0 && var37 > 0 && ~class220.field3311 < ~var34 && ~var35 > ~class31.field473) {
                     int var40;
                     int var41;
                     int var42;
                     int var43;
                     double var44;
                     label330: {
                        int var38 = -class567.field8231 + var34;
                        int var39 = var35 - class493.field7174;
                        var40 = 0;
                        var41 = 0;
                        var42 = 0;
                        var43 = 0;
                        var44 = 0.0D;
                        if (~class402.field5939 != -1) {
                           if (~class402.field5939 != -2) {
                              break label330;
                           }

                           var42 = var38 / class438.field6324;
                           var43 = var39 / class335.field4788;
                           var40 = class438.field6324 * var42;
                           var41 = class335.field4788 * var43;
                           var44 = (class164.field2596 + var32) * (double)(var38 * var40 + var39 * var41) / (double)(var38 * var38 - -(var39 * var39));
                           if (!var18) {
                              break label330;
                           }
                        }

                        var40 = var38;
                        var44 = class164.field2596 + var32;
                        var41 = var39;
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
                     int var57;
                     label363: {
                        var46 = -var44;
                        var48 = 0;
                        var49 = 0;
                        var50 = 0;
                        var51 = 0;
                        var52 = 0;
                        var53 = 0;
                        if (var40 >= 0) {
                           var54 = -var40 + class220.field3311;
                           var55 = 0;
                           if (~class402.field5939 == -2) {
                              var50 = -var42 + class547.field7911;
                              var52 = var42;
                           }

                           var56 = var54;
                           var57 = var40;
                           if (!var18) {
                              break label363;
                           }
                        }

                        var54 = class220.field3311 + var40;
                        var56 = 0;
                        var55 = -var40;
                        if (~class402.field5939 == -2) {
                           var52 = -var42;
                           var50 = 0;
                        }

                        var57 = var55;
                     }

                     int var58;
                     int var59;
                     int var60;
                     int var61;
                     int var62;
                     int var63;
                     label364: {
                        if (~var41 > -1) {
                           var58 = class31.field473 + var41;
                           var59 = -var41;
                           var60 = 0;
                           var61 = var59;
                           var62 = var58;
                           var63 = var59;
                           if (class402.field5939 != 1) {
                              break label364;
                           }

                           var49 = -var43;
                           var48 = 0;
                           var51 = var49;
                           var53 = class124.field2039 + var43;
                           if (!var18) {
                              break label364;
                           }
                        }

                        var58 = -var41 + class31.field473;
                        var59 = 0;
                        var60 = var58;
                        var62 = var58;
                        var63 = 0;
                        if (~class402.field5939 == -2) {
                           var51 = 0;
                           var48 = -var43 + class124.field2039;
                           var49 = var43;
                           var53 = var48;
                        }

                        var61 = var41;
                     }

                     class150 var64 = class664.field9657.field2841;
                     class321 var65 = (class321)var64.method1394((byte)-116);
                     if (var18 || var65 != null) {
                        do {
                           class362[] var66 = var65.field4630;
                           boolean var67 = true;
                           int var68 = 0;
                           if (var18 || ~var68 > ~var66.length) {
                              do {
                                 class362 var69 = var66[var68];
                                 int var70 = var69.field5411;
                                 int var71 = var69.field5408;
                                 int var72 = var69.field5407;
                                 int var73 = var69.field5410;
                                 int var74 = var69.field5409;
                                 int var75;
                                 var69.field5407 = var75 = -var40 + var72;
                                 int var76;
                                 var69.field5410 = var76 = -var41 + var73;
                                 int var77;
                                 var69.field5408 = var77 = var71 - var41;
                                 int var78;
                                 var69.field5411 = var78 = var70 - var40;
                                 if (var67) {
                                    int var79 = -var74 + (~var75 >= ~var78 ? var75 : var78);
                                    if (~var79 >= ~class220.field3311) {
                                       int var80 = (~var76 < ~var77 ? var77 : var76) - var74;
                                       if (~var80 >= ~class31.field473) {
                                          int var81 = var74 + (~var75 >= ~var78 ? var78 : var75);
                                          if (~var81 <= -1) {
                                             int var82 = var74 + (var76 <= var77 ? var77 : var76);
                                             if (~var82 <= -1) {
                                                var67 = false;
                                             }
                                          }
                                       }
                                    }
                                 }

                                 ++var68;
                              } while(~var68 > ~var66.length);
                           }

                           if (var67) {
                              var65.method1995((byte)35);
                              class600.method4429(-121, var65);
                           }

                           var65 = (class321)var64.method1400(false);
                        } while(var65 != null);
                     }

                     if (~class402.field5939 == -1) {
                        class393.field5787.method253(class75.field1330);
                     }

                     label289: {
                        class393.field5787.method326(-var40, -var41);
                        class393.field5787.method261(var55, var59, var54, var58, var46);
                        class641.method4696(class164.field2596 + var46, 0);
                        class727.field10463 = class164.field2596 + var46;
                        if (~class402.field5939 == -2) {
                           class536.field7810 = var26;
                           class17.field304 = var24;
                           class697.field10216 = -class637.field9275 + var21 + -var41;
                           class343.field4876 = var20 - class551.field7955 + -var40;
                           class393.field5787.method429(class343.field4876, class697.field10216, class17.field304, class536.field7810);
                           if (!var18) {
                              break label289;
                           }
                        }

                        class536.field7810 = var26;
                        class697.field10216 = -class637.field9275 + -var41 + class493.field7174 + var21;
                        class343.field4876 = var20 - -class567.field8231 + -class551.field7955 - var40;
                        class17.field304 = var24;
                        class393.field5787.method429(class343.field4876, class697.field10216, class17.field304, class536.field7810);
                     }

                     class125.method1221(class664.field9657);
                     if (~var61 < -1) {
                        class393.field5787.method333(0, var60, class220.field3311, var60 + var61);
                        class393.field5787.method380();
                        class393.field5787.method421(class640.field9323);
                        class628.method4600(arg11, arg3, arg10, arg8, arg7, arg17, arg16, arg2, arg6, arg9, arg5, arg0, arg15, arg12, arg14, arg1, arg13, 1, false);
                     }

                     if (~var57 < -1) {
                        class393.field5787.method333(var56, var63, var56 + var57, var62 + var63);
                        class393.field5787.method380();
                        class393.field5787.method421(class640.field9323);
                        class628.method4600(arg11, arg3, arg10, arg8, arg7, arg17, arg16, arg2, arg6, arg9, arg5, arg0, arg15, arg12, arg14, arg1, arg13, 1, false);
                     }

                     class393.field5787.method349();
                     class4.method27();
                     if (~class402.field5939 == -1) {
                        class393.field5787.method379();
                     }

                     class551.field7955 += var40;
                     class164.field2596 += var46;
                     class637.field9275 += var41;
                     class601.field8673 = class567.field8231 + var30 - class551.field7955;
                     class490.field7149 = class493.field7174 - -var31 + -class637.field9275;
                     if (~class402.field5939 != -2) {
                        break label414;
                     }

                     class663.field9648 += var42;
                     class504.field7338 += var43;
                     int var83 = 0;
                     if (var18 || ~class124.field2039 < ~var83) {
                        do {
                           int var84 = class642.method4701((byte)69, class124.field2039, class504.field7338 + var83) * class547.field7911;
                           int var85 = 0;
                           if (var18 || class547.field7911 > var85) {
                              do {
                                 int var86 = class642.method4701((byte)62, class547.field7911, class663.field9648 + var85) + var84;
                                 boolean var87 = ~var83 <= ~var48 && var48 + var49 > var83 ? true : (var51 <= var83 ? (~var83 > ~(var51 + var53) ? (~var85 <= ~var50 ? var85 < var50 - -var52 : false) : false) : false);
                                 class80.field1360[var86].method4466(class438.field6324 * var85, class335.field4788 * var83, class438.field6324, class335.field4788, 0, 0, var87, true);
                                 ++var85;
                              } while(class547.field7911 > var85);
                           }

                           ++var83;
                        } while(~class124.field2039 < ~var83);
                     }

                     if (!var18) {
                        break label414;
                     }
                  }

                  class186.field2818 = true;
               }
            }

            if (class186.field2818) {
               class490.field7149 = class493.field7174;
               class754.field10955 = arg10;
               class637.field9275 = 0;
               class319.field4606 = arg8;
               class164.field2596 = 0.0D;
               class320.field4611 = arg3;
               class601.field8673 = class567.field8231;
               class551.field7955 = 0;
               if (class402.field5939 == 0) {
                  class393.field5787.method253(class75.field1330);
               }

               label236: {
                  class393.field5787.method349();
                  class393.field5787.method380();
                  class393.field5787.method421(class640.field9323);
                  class718.field10369.method997(class320.field4611, class754.field10955, class319.field4606, class302.field4214, class528.field7696, class768.field11174);
                  class393.field5787.method338(class718.field10369);
                  if (class402.field5939 != 1) {
                     class536.field7810 = var26;
                     class697.field10216 = class493.field7174 + var21;
                     class343.field4876 = class567.field8231 + var20;
                     class17.field304 = var24;
                     class393.field5787.method429(class343.field4876, class697.field10216, class17.field304, class536.field7810);
                     if (!var18) {
                        break label236;
                     }
                  }

                  class343.field4876 = var20;
                  class697.field10216 = var21;
                  class17.field304 = var24;
                  class536.field7810 = var26;
                  class393.field5787.method429(class343.field4876, class697.field10216, class17.field304, class536.field7810);
               }

               class727.field10463 = 0.0D;
               class664.field9657.method1647(0);
               class125.method1221(class664.field9657);
               class628.method4600(arg11, arg3, arg10, arg8, arg7, arg17, arg16, arg2, arg6, arg9, arg5, arg0, arg15, arg12, arg14, arg1, arg13, 1, false);
               class4.method27();
               class186.field2818 = false;
               if (class402.field5939 == 0) {
                  class393.field5787.method379();
               }

               if (class402.field5939 == 1) {
                  class615.method4513((byte)-118);
               }
            }

            if (~class402.field5939 == -1) {
               class75.field1330.method4465(class601.field8673, class490.field7149, class82.field1382, class634.field9251, 0, 0, true, true);
            }

            label370: {
               ++class618.field8980;
               class641.method4696(class164.field2596, 0);
               class504.field7337 = class164.field2596;
               if (~class402.field5939 != -1 && ~class402.field5939 != -3) {
                  if (~class402.field5939 != -2) {
                     break label370;
                  }

                  class4.field41 = var24;
                  class546.field7900 = var26;
                  class672.field9868 = -class551.field7955 + var20;
                  class113.field1826 = -class637.field9275 + var21;
                  class393.field5787.method429(class672.field9868, class113.field1826, class4.field41, class546.field7900);
                  class393.field5787.method333(class601.field8673, class490.field7149, class82.field1382 + class601.field8673, class634.field9251 + class490.field7149);
                  if (!var18) {
                     break label370;
                  }
               }

               if (~class402.field5939 == -3) {
                  class393.field5787.method421(class640.field9323);
                  class393.field5787.method380();
               }

               class672.field9868 = -class601.field8673 + -class551.field7955 + class567.field8231 + var20;
               class4.field41 = var24;
               class546.field7900 = var26;
               class113.field1826 = var21 - class637.field9275 + -class490.field7149 + class493.field7174;
               class393.field5787.method429(class672.field9868, class113.field1826, class4.field41, class546.field7900);
            }

            class628.method4600(arg11, arg3, arg10, arg8, arg7, arg17, arg16, arg2, arg6, arg9, arg5, arg0, arg15, arg12, arg14, arg1, arg13, ~class402.field5939 == -3 ? 0 : 2, class402.field5939 == 1);
            class393.field5787.method349();
            class393.field5787.method429(var20, var21, var22, var23);
         }
      } catch (RuntimeException var89) {
         throw class608.method4462(var89, field7025[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7025[4] : field7025[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7025[4] : field7025[5]) + ',' + (arg7 != null ? field7025[4] : field7025[5]) + ',' + arg8 + ',' + (arg9 != null ? field7025[4] : field7025[5]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + (arg16 != null ? field7025[4] : field7025[5]) + ',' + (arg17 != null ? field7025[4] : field7025[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V",
      line = 661
   )
   public class483(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field7021 = arg2;
         this.field7021.method1346(31, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7025[7] + (arg0 != null ? field7025[4] : field7025[5]) + ',' + arg1 + ',' + (arg2 != null ? field7025[4] : field7025[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(I)I",
      line = 617
   )
   public static final int method3655(int arg0) {
      int var1 = -1;

      for(int var2 = 0; var2 < class85.field1409 - 1; ++var2) {
         if (arg0 < class474.field6930[var2] + class172.field2660[var2]) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = class85.field1409 - 1;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Lhw;Z)V",
      line = 638
   )
   public static final void method3656(class141 arg0, boolean arg1) {
      try {
         ++field7016;
         class572.field8270 = 0;
         if (!arg1) {
            field7024 = false;
         }

         class780.field11421 = 0;
         class513.field7485 = new class150();
         class662.field9622 = new class99[1024];
         class401.field5896 = new class42[class665.field9663[class231.field3395] - -1];
         class76.field1338 = 0;
         class463.field6774 = 0;
         class212.method1798(arg0, 1);
         class672.method4916(arg0, (byte)51);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7025[8] + (arg0 != null ? field7025[4] : field7025[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3657(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3658(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
