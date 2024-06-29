import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class90 implements class157 {
   @OriginalMember(
      owner = "client!rea",
      name = "h",
      descriptor = "Lrb;"
   )
   private class689 field1298;
   @OriginalMember(
      owner = "client!rea",
      name = "i",
      descriptor = "[Lam;"
   )
   private class272[] field1296;
   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1304 = new String[]{method863(method862("9+(\u00012c")), method863(method862("9+(\u00016c")), method863(method862("9+(\u00015c")), method863(method862("9+(\u00013c")), method863(method862("9+(\u0001<c")), method863(method862("0`g\u0001\t")), method863(method862("w-&CI{~/I\u0012-p")), method863(method862("kcw")), method863(method862("kcw\u000fH(!%\u0012D{(/I\u0012u")), method863(method862("kcw\u000fH(!%\u0012\u0012-wy\u001bDu")), method863(method862("w-&CI-(p\u001f@{p")), method863(method862("%;%C")), method863(method862("9+(\u00010c")), method863(method862("9+(\u0001H\"  [Jc")), method863(method862("9+(\u00011c")), method863(method862("9+(\u00017c"))};
   @OriginalMember(
      owner = "client!rea",
      name = "e",
      descriptor = "I"
   )
   public static int field1292 = 0;
   @OriginalMember(
      owner = "client!rea",
      name = "j",
      descriptor = "Luk;"
   )
   public static class498 field1301 = new class498(52, 4);
   @OriginalMember(
      owner = "client!rea",
      name = "l",
      descriptor = "I"
   )
   public static int field1291;
   @OriginalMember(
      owner = "client!rea",
      name = "f",
      descriptor = "I"
   )
   public static int field1293;
   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "I"
   )
   public static int field1294;
   @OriginalMember(
      owner = "client!rea",
      name = "n",
      descriptor = "I"
   )
   public static int field1295;
   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "I"
   )
   public static int field1297;
   @OriginalMember(
      owner = "client!rea",
      name = "g",
      descriptor = "I"
   )
   public static int field1300;
   @OriginalMember(
      owner = "client!rea",
      name = "k",
      descriptor = "I"
   )
   public static int field1303;
   @OriginalMember(
      owner = "client!rea",
      name = "d",
      descriptor = "Lha;"
   )
   private class610 field1299;
   @OriginalMember(
      owner = "client!rea",
      name = "m",
      descriptor = "Ljava/lang/Thread;"
   )
   public static Thread field1302;
   @OriginalMember(
      owner = "client!rea",
      name = "c",
      descriptor = "Z"
   )
   private boolean field1290;

   @OriginalMember(
      owner = "client!rea",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public static void method854(int arg0) {
      try {
         field1301 = null;
         field1302 = null;
         if (arg0 != 736106825) {
            method859((class610)null, true, -121, 16);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1304[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(JB)Z",
      line = 16
   )
   public final boolean method855(long arg0, byte arg1) {
      try {
         int var4 = 54 % ((-55 - arg1) / 43);
         ++field1295;
         return ~class162.method1442(14080) <= ~((long)this.field1298.field10233 + arg0);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1304[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "(B)I",
      line = 31
   )
   public final int method856(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field1297;
         int var3 = 0;
         class272[] var4 = this.field1296;
         if (arg0 > -78) {
            return 98;
         } else {
            int var5 = 0;
            if (!var2 && var4.length <= var5) {
               return var3 * 100 / this.field1296.length;
            } else {
               do {
                  class272 var6 = var4[var5];
                  if (var6 != null) {
                     if (var6.method285((byte)8)) {
                        ++var3;
                     }
                  } else {
                     ++var3;
                  }

                  ++var5;
               } while(var4.length > var5);

               return var3 * 100 / this.field1296.length;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1304[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(I)V",
      line = 58
   )
   public final void method857(int arg0) {
      try {
         if (arg0 != 26187) {
            this.field1298 = null;
         }

         ++field1291;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1304[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "(I)V",
      line = 77
   )
   public final void method858(int arg0) {
      boolean var2 = client.field1786;

      try {
         if (class351.field5356 != this.field1299) {
            this.field1299 = class351.field5356;
            this.field1290 = true;
         }

         ++field1303;
         this.field1299.method590(0);
         class272[] var3 = this.field1296;
         int var4 = 0;
         class272 var5;
         if (arg0 < 30) {
            this.field1299 = null;
            if (var2) {
               var5 = var3[var4];
               if (var5 != null) {
                  var5.method282((byte)111);
               }

               ++var4;
            }
         }

         while(~var3.length < ~var4) {
            var5 = var3[var4];
            if (var5 != null) {
               var5.method282((byte)111);
            }

            ++var4;
         }

      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1304[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(Lha;ZII)V",
      line = 108
   )
   public static final void method859(class610 arg0, boolean arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field1293;
         if (arg2 >= 0 && ~arg3 <= -1 && ~class324.field4937 != -1 && ~class185.field2900 != -1) {
            int var5;
            int var6;
            int var7;
            int var8;
            class401 var9;
            int var10;
            int var11;
            label696: {
               if (!class281.field4472) {
                  arg0.method639(class25.field312, class144.field2047, class324.field4937, class185.field2900);
                  var5 = class324.field4937;
                  var6 = class185.field2900;
                  var7 = class144.field2047;
                  var8 = class25.field312;
                  arg0.method629(class493.field7449, class501.field7667, class324.field4937, class185.field2900);
                  var9 = arg0.method624();
                  var9.method1556(class634.field9181, class598.field8772, class420.field6494, class63.field840, class369.field5740, class540.field8137);
                  var10 = arg2;
                  var11 = arg3;
                  arg0.method688(var9);
                  if (!var4) {
                     break label696;
                  }
               }

               class176.method1615(false, (byte)-96);
               var9 = arg0.method605();
               int[] var12 = arg0.method669();
               var6 = var12[3];
               var8 = var12[0];
               var7 = var12[1];
               var5 = var12[2];
               var10 = arg2 + class442.method3482((byte)62, false);
               var11 = class153.method1390((byte)91, false) + arg3;
            }

            if (var6 == 0) {
               var6 = 1;
            }

            class753.method5528(-26506, arg1);
            if (var5 == 0) {
               var5 = 1;
            }

            if (class96.field1355 != null && (!class552.field8264 || (class441.field6793 & 64) != 0)) {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               label682: {
                  var13 = -1;
                  var14 = -1;
                  var15 = arg0.method635();
                  var16 = arg0.method616();
                  if (!class334.field5143) {
                     var17 = (var11 - var7) * var15 / var6;
                     var18 = (-var8 + var10) * var15 / var5;
                     var19 = (-var8 + var10) * var16 / var5;
                     var20 = (-var7 + var11) * var16 / var6;
                     if (!var4) {
                        break label682;
                     }
                  }

                  var18 = var19 = (-var8 + var10) * class591.field8709 / var5;
                  var17 = var20 = (-var7 + var11) * class591.field8709 / var6;
               }

               int[] var21 = new int[]{var18, var17, var15};
               var9.method1541(var21);
               int[] var22 = new int[]{var19, var20, var16};
               var9.method1541(var22);
               float var23 = class397.method3201((float)var21[2], (float)var21[1], (float)var21[0], 4, -96, (float)var22[1], (float)var22[2], (float)var22[0]);
               if (var23 > 0.0F) {
                  int var24 = var22[0] - var21[0];
                  int var25 = var22[2] + -var21[2];
                  int var26 = (int)((float)var24 * var23 + (float)var21[0]);
                  int var27 = (int)((float)var25 * var23 + (float)var21[2]);
                  var13 = (-1 + class476.field7251.method61((byte)70) << 8) + var26 >> 9;
                  var14 = var27 - -(class476.field7251.method61((byte)70) + -1 << 8) >> 9;
                  byte var28 = class476.field7251.field1506;
                  if (~var28 > -4 && (2 & class757.field11211[1][var26 >> 9][var27 >> 9]) != 0) {
                     int var90 = var28 + 1;
                  }
               }

               if (var13 != -1 && ~var14 != 0) {
                  label707: {
                     if (class552.field8264 && (class441.field6793 & 64) != 0) {
                        class374 var29 = class221.method1912(class175.field2750, -59, class105.field1459);
                        if (var29 != null) {
                           class91.method921(-1, true, 0L, var13, arg1, false, true, class698.field10378, class443.field6803, field1304[7], var14, (long)(var13 << 0 | var14), 6);
                           if (!var4) {
                              break label707;
                           }
                        }

                        class411.method3292(2827);
                        if (!var4) {
                           break label707;
                        }
                     }

                     if (class63.field839) {
                        class91.method921(-1, true, 0L, var13, true, false, true, -1, class499.field7615.method3875(class493.field7455, 122), "", var14, (long)(var13 << 0 | var14), 57);
                     }

                     class91.method921(-1, true, 0L, var13, arg1, false, true, class381.field6029, class659.field9847, "", var14, (long)(var14 | var13 << 0), 44);
                     ++class531.field8047;
                  }
               }
            }

            if (class281.field4472) {
               class442.method3481(72);
            }

            int var30 = 0;
            int var10000;
            if (!var4) {
               if (class281.field4472) {
                  var10000 = 2;
                  if (!var4) {
                     var10000 = ~2;
                  }
               } else {
                  var10000 = ~1;
               }

               if (var10000 >= ~var30) {
                  class753.method5528(-26506, false);
                  return;
               }
            }

            do {
               boolean var31 = var30 == 0;
               class246 var32 = var31 ? class154.field2298 : class609.field8867;
               int var33 = arg2;
               int var34 = arg3;
               if (class281.field4472) {
                  class176.method1615(var31, (byte)-96);
                  var33 = arg2 + class442.method3482((byte)40, var31);
                  var34 = arg3 + class153.method1390((byte)91, var31);
               }

               boolean var91;
               label662: {
                  class208 var35 = var32.field3729;
                  class788 var36 = (class788)var35.method1815(1);
                  if (var4) {
                     var91 = class739.field10980;
                  } else if (var36 == null) {
                     var91 = class281.field4472;
                     if (!var4) {
                        break label662;
                     }
                  } else {
                     var91 = class739.field10980;
                  }

                  while(true) {
                     if ((var91 || ~class476.field7251.field1506 == ~var36.field11544.field1506) && var36.method5711(var33, 0, var34, arg0)) {
                        label731: {
                           boolean var37 = false;
                           boolean var38 = false;
                           int var39;
                           int var40;
                           if (var36.field11544 instanceof class78) {
                              var39 = ((class78)var36.field11544).field1044;
                              var40 = ((class78)var36.field11544).field1040;
                              if (var4) {
                                 var39 = var36.field11544.field1494 >> 9;
                                 var40 = var36.field11544.field1505 >> 9;
                              }
                           } else {
                              var39 = var36.field11544.field1494 >> 9;
                              var40 = var36.field11544.field1505 >> 9;
                           }

                           if (var36.field11544 instanceof class9) {
                              class9 var41 = (class9)var36.field11544;
                              int var42 = var41.method61((byte)70);
                              if (~(var42 & 1) == -1 && (var41.field1505 & 511) == 0 && (511 & var41.field1494) == 0 || (1 & var42) == 1 && ~(511 & var41.field1505) == -257 && (511 & var41.field1494) == 256) {
                                 int var43 = var41.field1505 - (var41.method61((byte)70) + -1 << 8);
                                 int var44 = var41.field1494 - (-1 + var41.method61((byte)70) << 8);
                                 int var45 = 0;
                                 if (var4 || ~class615.field8929 < ~var45) {
                                    do {
                                       class795 var46 = (class795)class501.field7665.method3141((long)class334.field5139[var45], true);
                                       if (var46 != null) {
                                          class466 var47 = var46.field11592;
                                          if (~class308.field4801 != ~var47.field1644) {
                                             if (!var47.field1601 && !var4) {
                                                ++var45;
                                             } else {
                                                int var48 = -(var47.field7072.field5250 - 1 << 8) + var47.field1505;
                                                int var49 = -(var47.field7072.field5250 - 1 << 8) + var47.field1494;
                                                if (var48 >= var43 && var47.field7072.field5250 <= -(var48 - var43 >> 9) + var41.method61((byte)70) && var44 <= var49 && var47.field7072.field5250 <= -(-var44 + var49 >> 9) + var41.method61((byte)70)) {
                                                   class629.method4609(2, class476.field7251.field1506 != var36.field11544.field1506, var47);
                                                   var47.field1644 = class308.field4801;
                                                }

                                                ++var45;
                                             }
                                          } else {
                                             ++var45;
                                          }
                                       } else {
                                          ++var45;
                                       }
                                    } while(~class615.field8929 < ~var45);
                                 }

                                 int var50 = class728.field10861;
                                 int[] var51 = class17.field223;
                                 int var52 = 0;
                                 if (var4 || var50 > var52) {
                                    do {
                                       class9 var53 = class484.field7370[var51[var52]];
                                       if (var53 != null) {
                                          if (~class308.field4801 != ~var53.field1644) {
                                             if (var41 != var53) {
                                                if (!var53.field1601 && !var4) {
                                                   ++var52;
                                                } else {
                                                   int var54 = var53.field1505 + -(-1 + var53.method61((byte)70) << 8);
                                                   int var55 = var53.field1494 + -(-1 + var53.method61((byte)70) << 8);
                                                   if (var43 <= var54 && var53.method61((byte)70) <= -(var54 - var43 >> 9) + var41.method61((byte)70) && var44 <= var55 && ~var53.method61((byte)70) >= ~(-(-var44 + var55 >> 9) + var41.method61((byte)70))) {
                                                      class123.method1138(class476.field7251.field1506 != var36.field11544.field1506, -1, var53);
                                                      var53.field1644 = class308.field4801;
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

                              if (class308.field4801 == var41.field1644) {
                                 break label731;
                              }

                              class123.method1138(~class476.field7251.field1506 != ~var36.field11544.field1506, -1, var41);
                              var41.field1644 = class308.field4801;
                           }

                           if (var36.field11544 instanceof class466) {
                              class466 var56 = (class466)var36.field11544;
                              if (var56.field7072 != null) {
                                 if (~(var56.field7072.field5250 & 1) == -1 && (var56.field1505 & 511) == 0 && (var56.field1494 & 511) == 0 || (1 & var56.field7072.field5250) == 1 && (511 & var56.field1505) == 256 && ~(var56.field1494 & 511) == -257) {
                                    int var57 = var56.field1505 - (var56.field7072.field5250 + -1 << 8);
                                    int var58 = -(var56.field7072.field5250 - 1 << 8) + var56.field1494;
                                    int var59 = 0;
                                    if (var4 || var59 < class615.field8929) {
                                       do {
                                          class795 var60 = (class795)class501.field7665.method3141((long)class334.field5139[var59], true);
                                          if (var60 != null) {
                                             class466 var61 = var60.field11592;
                                             if (class308.field4801 != var61.field1644) {
                                                if (var56 != var61) {
                                                   if (!var61.field1601 && !var4) {
                                                      ++var59;
                                                   } else {
                                                      int var62 = -(var61.field7072.field5250 + -1 << 8) + var61.field1505;
                                                      int var63 = -(var61.field7072.field5250 - 1 << 8) + var61.field1494;
                                                      if (var57 <= var62 && -(-var57 + var62 >> 9) + var56.field7072.field5250 >= var61.field7072.field5250 && var58 <= var63 && ~var61.field7072.field5250 >= ~(-(-var58 + var63 >> 9) + var56.field7072.field5250)) {
                                                         class629.method4609(2, class476.field7251.field1506 != var36.field11544.field1506, var61);
                                                         var61.field1644 = class308.field4801;
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
                                       } while(var59 < class615.field8929);
                                    }

                                    int var64 = class728.field10861;
                                    int[] var65 = class17.field223;
                                    int var66 = 0;
                                    if (var4 || var66 < var64) {
                                       do {
                                          class9 var67 = class484.field7370[var65[var66]];
                                          if (var67 != null) {
                                             if (class308.field4801 != var67.field1644) {
                                                if (!var67.field1601 && !var4) {
                                                   ++var66;
                                                } else {
                                                   int var68 = var67.field1505 + -(var67.method61((byte)70) - 1 << 8);
                                                   int var69 = var67.field1494 + -(var67.method61((byte)70) + -1 << 8);
                                                   if (~var57 >= ~var68 && var67.method61((byte)70) <= var56.field7072.field5250 - (-var57 + var68 >> 9) && var69 >= var58 && var67.method61((byte)70) <= -(-var58 + var69 >> 9) + var56.field7072.field5250) {
                                                      class123.method1138(class476.field7251.field1506 != var36.field11544.field1506, -1, var67);
                                                      var67.field1644 = class308.field4801;
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

                                 if (class308.field4801 == var56.field1644) {
                                    break label731;
                                 }

                                 class629.method4609(2, ~class476.field7251.field1506 != ~var36.field11544.field1506, var56);
                                 var56.field1644 = class308.field4801;
                              }
                           }

                           if (var36.field11544 instanceof class707) {
                              int var70 = class120.field1694 + var40;
                              int var71 = class119.field1606 + var39;
                              class535 var72 = (class535)class429.field6620.method3141((long)(var70 | var71 << 14 | var36.field11544.field1506 << 28), true);
                              if (var72 != null) {
                                 int var73 = 0;
                                 class281 var74 = (class281)var72.field8105.method4984((byte)-69);
                                 if (var4 || var74 != null) {
                                    do {
                                       class136 var75 = class247.field3763.method2058(-11, var74.field4474);
                                       if (class552.field8264 && class476.field7251.field1506 == var36.field11544.field1506) {
                                          class58 var76 = class593.field8730 == -1 ? null : class610.field8879.method179(-1572, class593.field8730);
                                          if ((class441.field6793 & 1) != 0 && (var76 == null || var75.method1251(class593.field8730, var76.field710, 0) != var76.field710)) {
                                             class91.method921(-1, true, (long)var74.field4474, var40, true, false, false, class698.field10378, class443.field6803, class65.field860 + field1304[9] + var75.field1975, var39, (long)var73, 48);
                                             ++class145.field2064;
                                          }
                                       }

                                       if (~class476.field7251.field1506 != ~var36.field11544.field1506) {
                                          var74 = (class281)var72.field8105.method4979((byte)-114);
                                          ++var73;
                                       } else {
                                          String[] var77 = var75.field1967;
                                          int var78 = var77.length + -1;
                                          if (!var4 && ~var78 > -1) {
                                             var74 = (class281)var72.field8105.method4979((byte)-114);
                                             ++var73;
                                          } else {
                                             do {
                                                if (var77[var78] != null) {
                                                   short var79 = 0;
                                                   int var80 = class143.field2033;
                                                   if (~var78 == -1) {
                                                      var79 = 60;
                                                   }

                                                   if (var78 == 1) {
                                                      var79 = 45;
                                                   }

                                                   if (var78 == 2) {
                                                      var79 = 47;
                                                   }

                                                   if (~var78 == -4) {
                                                      var79 = 17;
                                                   }

                                                   if (var78 == 4) {
                                                      var79 = 9;
                                                   }

                                                   if (~var75.field1922 == ~var78) {
                                                      var80 = var75.field1943;
                                                   }

                                                   if (var78 == 5) {
                                                      var79 = 1008;
                                                   }

                                                   if (~var75.field1923 == ~var78) {
                                                      var80 = var75.field1917;
                                                   }

                                                   ++class67.field876;
                                                   class91.method921(-1, true, (long)var74.field4474, var40, true, false, false, var80, var77[var78], field1304[10] + var75.field1975, var39, (long)var73, var79);
                                                }

                                                --var78;
                                             } while(~var78 <= -1);

                                             var74 = (class281)var72.field8105.method4979((byte)-114);
                                             ++var73;
                                          }
                                       }
                                    } while(var74 != null);
                                 }
                              }
                           }

                           if (var36.field11544 instanceof class434) {
                              class434 var81 = (class434)var36.field11544;
                              class333 var82 = class102.field1434.method1411(var81.method236((byte)-11), -92);
                              if (var82.field5088 != null) {
                                 var82 = var82.method2714(class45.field599, -1);
                              }

                              if (var82 != null) {
                                 if (class552.field8264 && class476.field7251.field1506 == var36.field11544.field1506) {
                                    class58 var83 = ~class593.field8730 == 0 ? null : class610.field8879.method179(-1572, class593.field8730);
                                    if ((class441.field6793 & 4) != 0 && (var83 == null || ~var82.method2718(82, class593.field8730, var83.field710) != ~var83.field710)) {
                                       ++class11.field149;
                                       class91.method921(-1, true, class669.method4929(var39, var40, 1, var81), var40, true, false, false, class698.field10378, class443.field6803, class65.field860 + field1304[8] + var82.field5093, var39, (long)var81.hashCode(), 30);
                                    }
                                 }

                                 if (class476.field7251.field1506 == var36.field11544.field1506) {
                                    String[] var84 = var82.field5098;
                                    if (var84 != null) {
                                       int var85 = var84.length + -1;
                                       if (var4 || var85 >= 0) {
                                          do {
                                             if (var84[var85] != null) {
                                                short var86 = 0;
                                                if (var85 == 0) {
                                                   var86 = 49;
                                                }

                                                int var87 = class143.field2033;
                                                if (var85 == 1) {
                                                   var86 = 2;
                                                }

                                                if (var85 == 2) {
                                                   var86 = 18;
                                                }

                                                if (~var85 == -4) {
                                                   var86 = 11;
                                                }

                                                if (var85 == 4) {
                                                   var86 = 1011;
                                                }

                                                if (var82.field5112 == var85) {
                                                   var87 = var82.field5077;
                                                }

                                                if (~var85 == -6) {
                                                   var86 = 1007;
                                                }

                                                if (var82.field5043 == var85) {
                                                   var87 = var82.field5039;
                                                }

                                                class91.method921(-1, true, class669.method4929(var39, var40, 1, var81), var40, true, false, false, var87, var84[var85], field1304[6] + var82.field5093, var39, (long)var81.hashCode(), var86);
                                                ++class716.field10729;
                                             }

                                             --var85;
                                          } while(var85 >= 0);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var36 = (class788)var35.method1817(0);
                     if (var36 == null) {
                        var91 = class281.field4472;
                        if (!var4) {
                           break;
                        }
                     } else {
                        var91 = class739.field10980;
                     }
                  }
               }

               if (var91) {
                  class442.method3481(72);
               }

               ++var30;
               if (class281.field4472) {
                  var10000 = 2;
                  if (!var4) {
                     var10000 = ~2;
                  }
               } else {
                  var10000 = ~1;
               }
            } while(var10000 < ~var30);

            class753.method5528(-26506, false);
         }
      } catch (RuntimeException var89) {
         throw class482.method3757(var89, field1304[4] + (arg0 != null ? field1304[5] : field1304[11]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(B)I",
      line = 661
   )
   public final int method860(byte arg0) {
      try {
         ++field1294;
         if (arg0 <= 25) {
            this.method856((byte)32);
         }

         return this.field1298.field10232;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1304[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(IZ)V",
      line = 672
   )
   public final void method861(int arg0, boolean arg1) {
      boolean var3 = client.field1786;

      try {
         boolean var9 = true;
         ++field1300;
         if (arg0 < -98) {
            class272[] var4 = this.field1296;
            int var5 = 0;
            if (!var3 && ~var4.length >= ~var5) {
               this.field1290 = false;
            } else {
               do {
                  class272 var6 = var4[var5];
                  if (var6 != null) {
                     var6.method284(false, !var9 ? this.field1290 : true);
                     ++var5;
                  } else {
                     ++var5;
                  }
               } while(~var4.length < ~var5);

               this.field1290 = false;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1304[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "<init>",
      descriptor = "(Lrb;Liaa;)V",
      line = 703
   )
   public class90(class689 param1, class745 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method862(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method863(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
