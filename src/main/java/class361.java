import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class361 {
   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5344 = new String[]{method2844(method2843("\u00020\u001c_1")), method2844(method2843("\u0017s\u001c4d")), method2844(method2843("\u0017k^\u001d")), method2844(method2843("E}]\u001dqI.T\u0017*\u001f ")), method2844(method2843("\u0017s\u001c6d")), method2844(method2843("Y3\f")), method2844(method2843("Y3\fQp\u001aq^L*\u001f'\u0002E|G")), method2844(method2843("E}]\u001dq\u001fx\u000bAxI ")), method2844(method2843("Y3\fQp\u001aq^L|IxT\u0017*G")), method2844(method2843("\u0017s\u001c5d")), method2844(method2843("\u0017s\u001c3d")), method2844(method2843("\u0017s\u001c0d")), method2844(method2843("\u0017s\u001c2d")), method2844(method2843("\u0017s\u001c7d"))};
   @OriginalMember(
      owner = "client!nm",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5333 = false;
   @OriginalMember(
      owner = "client!nm",
      name = "i",
      descriptor = "I"
   )
   public static int field5336 = 0;
   @OriginalMember(
      owner = "client!nm",
      name = "g",
      descriptor = "C"
   )
   public char field5343;
   @OriginalMember(
      owner = "client!nm",
      name = "h",
      descriptor = "I"
   )
   public int field5331;
   @OriginalMember(
      owner = "client!nm",
      name = "c",
      descriptor = "I"
   )
   public int field5332;
   @OriginalMember(
      owner = "client!nm",
      name = "j",
      descriptor = "I"
   )
   public static int field5334;
   @OriginalMember(
      owner = "client!nm",
      name = "d",
      descriptor = "I"
   )
   public static int field5335;
   @OriginalMember(
      owner = "client!nm",
      name = "e",
      descriptor = "I"
   )
   public static int field5337;
   @OriginalMember(
      owner = "client!nm",
      name = "m",
      descriptor = "I"
   )
   public static int field5339;
   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "I"
   )
   public static int field5340;
   @OriginalMember(
      owner = "client!nm",
      name = "f",
      descriptor = "I"
   )
   public static int field5341;
   @OriginalMember(
      owner = "client!nm",
      name = "b",
      descriptor = "I"
   )
   public int field5342;
   @OriginalMember(
      owner = "client!nm",
      name = "l",
      descriptor = "[Lnja;"
   )
   public static class387[] field5338;

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2836(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         ++field5335;
         int var6 = 0;
         int var7 = arg2;
         int var8 = -arg2;
         byte var9 = -1;
         int var10 = class437.method3398(class729.field10384, (byte)92, arg2 + arg3, class604.field8618);
         int var11 = class437.method3398(class729.field10384, (byte)97, -arg2 + arg3, class604.field8618);
         if (arg4 != 1) {
            field5336 = 70;
         }

         class100.method989(var11, (byte)22, var10, arg1, class788.field11482[arg0]);
         int var10000;
         int var10001;
         int var22;
         if (var5) {
            var22 = var9 + 2;
            var10000 = var8;
            var10001 = var22;
         } else {
            if (var6 >= arg2) {
               return;
            }

            var22 = var9 + 2;
            var10000 = var8;
            var10001 = var22;
         }

         while(true) {
            while(true) {
               var8 = var10000 + var10001;
               if (var8 > 0) {
                  --var7;
                  var8 -= var7 << 1;
                  int var12 = arg0 - var7;
                  int var13 = arg0 - -var7;
                  if (var13 >= class587.field8239 && ~var12 >= ~class767.field11011) {
                     int var14 = class437.method3398(class729.field10384, (byte)-14, arg3 + var6, class604.field8618);
                     int var15 = class437.method3398(class729.field10384, (byte)120, -var6 + arg3, class604.field8618);
                     if (class767.field11011 >= var13) {
                        class100.method989(var15, (byte)22, var14, arg1, class788.field11482[var13]);
                     }

                     if (var12 >= class587.field8239) {
                        class100.method989(var15, (byte)22, var14, arg1, class788.field11482[var12]);
                     }
                  }
               }

               ++var6;
               int var16 = -var6 + arg0;
               int var17 = arg0 + var6;
               if (~class587.field8239 < ~var17) {
                  break;
               }

               var10000 = ~var16;
               var10001 = ~class767.field11011;
               if (!var5) {
                  if (var10000 >= var10001) {
                     int var18 = class437.method3398(class729.field10384, (byte)103, arg3 + var7, class604.field8618);
                     int var19 = class437.method3398(class729.field10384, (byte)-47, -var7 + arg3, class604.field8618);
                     if (~class767.field11011 <= ~var17) {
                        class100.method989(var19, (byte)22, var18, arg1, class788.field11482[var17]);
                     }

                     if (~var16 <= ~class587.field8239) {
                        class100.method989(var19, (byte)22, var18, arg1, class788.field11482[var16]);
                     }
                  }
                  break;
               }
            }

            if (var6 >= var7) {
               return;
            }

            var22 += 2;
            var10000 = var8;
            var10001 = var22;
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field5344[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2837(byte arg0) {
      try {
         field5338 = null;
         int var1 = -95 % ((-28 - arg0) / 39);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5344[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2838(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1983466679) {
            field5338 = null;
         }

         ++field5337;
         return false;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5344[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(Lcu;IB)V"
   )
   private final void method2839(class65 arg0, int arg1, byte arg2) {
      try {
         label31: {
            ++field5339;
            if (~arg1 != -2) {
               if (arg1 != 2) {
                  break label31;
               }

               this.field5332 = arg0.method685(-2);
               this.field5331 = arg0.method665(false);
               this.field5342 = arg0.method665(false);
               if (!client.field10022) {
                  break label31;
               }
            }

            this.field5343 = class571.method4230(arg0.method638(true), -111);
         }

         if (arg2 <= 45) {
            field5336 = -85;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5344[10] + (arg0 != null ? field5344[0] : field5344[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(Lcu;B)V"
   )
   public final void method2840(class65 arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5341;
         int var4 = 17 % ((arg1 - -92) / 32);

         do {
            int var5 = arg0.method665(false);
            if (~var5 == -1) {
               break;
            }

            this.method2839(arg0, var5, (byte)74);
         } while(!var3);

      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5344[1] + (arg0 != null ? field5344[0] : field5344[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(IBLha;I)V"
   )
   public static final void method2841(int arg0, byte arg1, class17 arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field5340;
         if (arg1 > -106) {
            method2841(89, (byte)-19, (class17)null, 104);
         }

         if (arg0 >= 0 && ~arg3 <= -1 && ~class737.field10514 != -1 && ~class11.field186 != -1) {
            class502 var5;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            label692: {
               if (class563.field8012) {
                  class331.method2654(false, 6257);
                  var5 = arg2.method176();
                  int[] var6 = arg2.method147();
                  var7 = var6[0];
                  var8 = var6[3];
                  var9 = var6[2];
                  var10 = var6[1];
                  var11 = class763.method5508(0, false) + arg0;
                  var12 = class133.method1366(false, 0) + arg3;
                  if (!var4) {
                     break label692;
                  }
               }

               arg2.method256(class222.field3160, class160.field2450, class737.field10514, class11.field186);
               var7 = class222.field3160;
               var10 = class160.field2450;
               var9 = class737.field10514;
               var8 = class11.field186;
               arg2.method150(class511.field7260, class674.field9448, class737.field10514, class11.field186);
               var5 = arg2.method183();
               var5.method325(class782.field11394, class508.field7211, class286.field4289, class542.field7636, class341.field5018, class205.field2915);
               var12 = arg3;
               var11 = arg0;
               arg2.method255(var5);
            }

            if (var9 == 0) {
               var9 = 1;
            }

            class560.method4167((byte)-105, true);
            if (~var8 == -1) {
               var8 = 1;
            }

            if (class558.field7922 != null && (!class37.field543 || ~(class394.field5716 & 64) != -1)) {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               label678: {
                  var13 = -1;
                  var14 = -1;
                  var15 = arg2.method141();
                  var16 = arg2.method212();
                  if (!class791.field11526) {
                     var17 = (-var10 + var12) * var16 / var8;
                     var18 = (-var7 + var11) * var15 / var9;
                     var19 = (-var7 + var11) * var16 / var9;
                     var20 = (-var10 + var12) * var15 / var8;
                     if (!var4) {
                        break label678;
                     }
                  }

                  var20 = var17 = (var12 - var10) * class582.field8178 / var8;
                  var18 = var19 = (var11 - var7) * class582.field8178 / var9;
               }

               int[] var21 = new int[]{var18, var20, var15};
               int[] var22 = new int[]{var19, var17, var16};
               var5.method336(var21);
               var5.method336(var22);
               float var23 = class443.method3440((float)var21[1], -812336759, (float)var21[0], (float)var21[2], (float)var22[0], 4, (float)var22[1], (float)var22[2]);
               if (var23 > 0.0F) {
                  int var24 = var22[0] + -var21[0];
                  int var25 = var22[2] + -var21[2];
                  int var26 = (int)((float)var24 * var23 + (float)var21[0]);
                  int var27 = (int)((float)var25 * var23 + (float)var21[2]);
                  var13 = (class117.field1849.method1507(-111) - 1 << 8) + var26 >> 9;
                  var14 = var27 + (class117.field1849.method1507(-54) - 1 << 8) >> 9;
                  byte var28 = class117.field1849.field6824;
                  if (var28 < 3 && ~(2 & class644.field9070[1][var26 >> 9][var27 >> 9]) != -1) {
                     int var90 = var28 + 1;
                  }
               }

               if (var13 != -1 && ~var14 != 0) {
                  label772: {
                     if (!class37.field543 || ~(class394.field5716 & 64) == -1) {
                        if (class240.field3697) {
                           class643.method4678(var13, 0, 21, true, (long)(var14 | var13 << 0), "", -1, true, var14, class765.field10930.method5512(-2, class777.field11340), 0L, -1, false);
                        }

                        ++class3.field22;
                        class643.method4678(var13, 0, 12, true, (long)(var13 << 0 | var14), "", -1, true, var14, class708.field10164, 0L, class444.field6482, false);
                        if (!var4) {
                           break label772;
                        }
                     }

                     class91 var29 = class751.method5399(class224.field3183, 1, class704.field10135);
                     if (var29 != null) {
                        class643.method4678(var13, 0, 3, true, (long)(var13 << 0 | var14), field5344[5], -1, true, var14, class733.field10420, 0L, class127.field2038, false);
                        if (!var4) {
                           break label772;
                        }
                     }

                     class499.method3776(-80);
                  }
               }
            }

            if (class563.field8012) {
               class412.method3220(83);
            }

            int var30 = 0;
            byte var10001;
            if (!var4) {
               if (!class563.field8012) {
                  var10001 = 1;
                  if (!var4) {
                  }
               } else {
                  var10001 = 2;
               }

               if (var30 >= var10001) {
                  class560.method4167((byte)66, false);
                  return;
               }
            }

            do {
               boolean var31 = var30 == 0;
               class167 var32 = var31 ? class416.field6098 : class662.field9321;
               int var33 = arg0;
               int var34 = arg3;
               if (class563.field8012) {
                  class331.method2654(var31, 6257);
                  var33 = arg0 + class763.method5508(0, var31);
                  var34 = arg3 + class133.method1366(var31, 0);
               }

               boolean var10000;
               label654: {
                  class424 var35 = var32.field2513;
                  class731 var36 = (class731)var35.method3307(16976);
                  if (var4) {
                     var10000 = class539.field7573;
                  } else if (var36 == null) {
                     var10000 = class563.field8012;
                     if (!var4) {
                        break label654;
                     }
                  } else {
                     var10000 = class539.field7573;
                  }

                  while(true) {
                     if ((var10000 || ~class117.field1849.field6824 == ~var36.field10399.field6824) && var36.method5294((byte)23, var33, arg2, var34)) {
                        label730: {
                           boolean var37 = false;
                           boolean var38 = false;
                           int var39;
                           int var40;
                           if (!(var36.field10399 instanceof class578)) {
                              var39 = var36.field10399.field6832 >> 9;
                              var40 = var36.field10399.field6833 >> 9;
                              if (var4) {
                                 var40 = ((class578)var36.field10399).field8160;
                                 var39 = ((class578)var36.field10399).field8154;
                              }
                           } else {
                              var40 = ((class578)var36.field10399).field8160;
                              var39 = ((class578)var36.field10399).field8154;
                           }

                           if (var36.field10399 instanceof class158) {
                              class158 var41 = (class158)var36.field10399;
                              int var42 = var41.method1507(-10);
                              if ((1 & var42) == 0 && (511 & var41.field6832) == 0 && (511 & var41.field6833) == 0 || (var42 & 1) == 1 && ~(511 & var41.field6832) == -257 && ~(511 & var41.field6833) == -257) {
                                 int var43 = var41.field6832 - (-1 + var41.method1507(-41) << 8);
                                 int var44 = var41.field6833 - (-1 + var41.method1507(-28) << 8);
                                 int var45 = 0;
                                 if (var4 || var45 < class261.field3995) {
                                    do {
                                       class432 var46 = (class432)class573.field8110.method3101(-1, (long)class344.field5068[var45]);
                                       if (var46 != null) {
                                          class799 var47 = var46.field6345;
                                          if (class51.field770 != var47.field5809) {
                                             if (!var47.field5770 && !var4) {
                                                ++var45;
                                             } else {
                                                int var48 = -(var47.field11618.field4529 + -1 << 8) + var47.field6832;
                                                int var49 = -(var47.field11618.field4529 + -1 << 8) + var47.field6833;
                                                if (var43 <= var48 && var47.field11618.field4529 <= var41.method1507(-52) - (-var43 + var48 >> 9) && ~var49 <= ~var44 && ~var47.field11618.field4529 >= ~(-(-var44 + var49 >> 9) + var41.method1507(-113))) {
                                                   class757.method5468(var47, ~class117.field1849.field6824 != ~var36.field10399.field6824, (byte)41);
                                                   var47.field5809 = class51.field770;
                                                }

                                                ++var45;
                                             }
                                          } else {
                                             ++var45;
                                          }
                                       } else {
                                          ++var45;
                                       }
                                    } while(var45 < class261.field3995);
                                 }

                                 int var50 = class274.field4182;
                                 int[] var51 = class124.field1983;
                                 int var52 = 0;
                                 if (var4 || ~var52 > ~var50) {
                                    do {
                                       class158 var53 = class501.field7137[var51[var52]];
                                       if (var53 != null) {
                                          if (~class51.field770 != ~var53.field5809) {
                                             if (var41 != var53) {
                                                if (!var53.field5770 && !var4) {
                                                   ++var52;
                                                } else {
                                                   int var54 = var53.field6832 + -(-1 + var53.method1507(-115) << 8);
                                                   int var55 = var53.field6833 - (var53.method1507(-43) + -1 << 8);
                                                   if (~var54 <= ~var43 && ~var53.method1507(-57) >= ~(-(-var43 + var54 >> 9) + var41.method1507(-46)) && var44 <= var55 && ~var53.method1507(-109) >= ~(-(var55 - var44 >> 9) + var41.method1507(-56))) {
                                                      class41.method481(var53, (byte)-127, class117.field1849.field6824 != var36.field10399.field6824);
                                                      var53.field5809 = class51.field770;
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
                                    } while(~var52 > ~var50);
                                 }
                              }

                              if (~class51.field770 == ~var41.field5809) {
                                 break label730;
                              }

                              class41.method481(var41, (byte)-91, ~class117.field1849.field6824 != ~var36.field10399.field6824);
                              var41.field5809 = class51.field770;
                           }

                           if (var36.field10399 instanceof class799) {
                              class799 var56 = (class799)var36.field10399;
                              if (var56.field11618 != null) {
                                 if ((1 & var56.field11618.field4529) == 0 && ~(511 & var56.field6832) == -1 && ~(511 & var56.field6833) == -1 || (var56.field11618.field4529 & 1) == 1 && ~(var56.field6832 & 511) == -257 && ~(511 & var56.field6833) == -257) {
                                    int var57 = -(var56.field11618.field4529 + -1 << 8) + var56.field6832;
                                    int var58 = -(var56.field11618.field4529 + -1 << 8) + var56.field6833;
                                    int var59 = 0;
                                    if (var4 || ~var59 > ~class261.field3995) {
                                       do {
                                          class432 var60 = (class432)class573.field8110.method3101(-1, (long)class344.field5068[var59]);
                                          if (var60 != null) {
                                             class799 var61 = var60.field6345;
                                             if (~class51.field770 != ~var61.field5809) {
                                                if (var56 != var61) {
                                                   if (!var61.field5770 && !var4) {
                                                      ++var59;
                                                   } else {
                                                      int var62 = -(var61.field11618.field4529 + -1 << 8) + var61.field6832;
                                                      int var63 = -(var61.field11618.field4529 + -1 << 8) + var61.field6833;
                                                      if (~var57 >= ~var62 && -(var62 - var57 >> 9) + var56.field11618.field4529 >= var61.field11618.field4529 && ~var63 <= ~var58 && ~(-(-var58 + var63 >> 9) + var56.field11618.field4529) <= ~var61.field11618.field4529) {
                                                         class757.method5468(var61, class117.field1849.field6824 != var36.field10399.field6824, (byte)41);
                                                         var61.field5809 = class51.field770;
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
                                       } while(~var59 > ~class261.field3995);
                                    }

                                    int var64 = class274.field4182;
                                    int[] var65 = class124.field1983;
                                    int var66 = 0;
                                    if (var4 || var66 < var64) {
                                       do {
                                          class158 var67 = class501.field7137[var65[var66]];
                                          if (var67 != null) {
                                             if (~class51.field770 != ~var67.field5809) {
                                                if (!var67.field5770 && !var4) {
                                                   ++var66;
                                                } else {
                                                   int var68 = var67.field6832 - (var67.method1507(-101) + -1 << 8);
                                                   int var69 = var67.field6833 - (-1 + var67.method1507(-53) << 8);
                                                   if (~var57 >= ~var68 && ~var67.method1507(-116) >= ~(var56.field11618.field4529 - (-var57 + var68 >> 9)) && var69 >= var58 && var67.method1507(-72) <= -(-var58 + var69 >> 9) + var56.field11618.field4529) {
                                                      class41.method481(var67, (byte)-89, class117.field1849.field6824 != var36.field10399.field6824);
                                                      var67.field5809 = class51.field770;
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

                                 if (class51.field770 == var56.field5809) {
                                    break label730;
                                 }

                                 class757.method5468(var56, ~class117.field1849.field6824 != ~var36.field10399.field6824, (byte)41);
                                 var56.field5809 = class51.field770;
                              }
                           }

                           if (var36.field10399 instanceof class346) {
                              int var70 = class115.field1824 + var39;
                              int var71 = class480.field6903 + var40;
                              class279 var72 = (class279)class216.field3081.method3101(-1, (long)(var70 | var36.field10399.field6824 << 28 | var71 << 14));
                              if (var72 != null) {
                                 int var73 = 0;
                                 class311 var74 = (class311)var72.field4227.method2243(127);
                                 if (var4 || var74 != null) {
                                    do {
                                       class618 var75 = class201.field2882.method5591(var74.field4666, (byte)-84);
                                       if (class37.field543 && class117.field1849.field6824 == var36.field10399.field6824) {
                                          class57 var76 = ~class466.field6762 != 0 ? class746.field10611.method1224(class466.field6762, 11) : null;
                                          if (~(class394.field5716 & 1) != -1 && (var76 == null || var75.method4549(var76.field816, 0, class466.field6762) != var76.field816)) {
                                             class643.method4678(var39, 0, 22, true, (long)var73, class128.field2048 + field5344[6] + var75.field8781, -1, false, var40, class733.field10420, (long)var74.field4666, class127.field2038, false);
                                             ++class108.field1697;
                                          }
                                       }

                                       if (~class117.field1849.field6824 != ~var36.field10399.field6824) {
                                          var74 = (class311)var72.field4227.method2246((byte)110);
                                          ++var73;
                                       } else {
                                          String[] var77 = var75.field8827;
                                          int var78 = var77.length + -1;
                                          if (!var4 && ~var78 > -1) {
                                             var74 = (class311)var72.field4227.method2246((byte)110);
                                             ++var73;
                                          } else {
                                             do {
                                                if (var77[var78] != null) {
                                                   short var79 = 0;
                                                   int var80 = class560.field7967;
                                                   if (~var78 == -1) {
                                                      var79 = 2;
                                                   }

                                                   if (~var78 == -2) {
                                                      var79 = 13;
                                                   }

                                                   if (var78 == 2) {
                                                      var79 = 5;
                                                   }

                                                   if (var78 == 3) {
                                                      var79 = 23;
                                                   }

                                                   if (var78 == 4) {
                                                      var79 = 47;
                                                   }

                                                   if (var78 == 5) {
                                                      var79 = 1007;
                                                   }

                                                   if (var75.field8851 == var78) {
                                                      var80 = var75.field8819;
                                                   }

                                                   if (~var75.field8843 == ~var78) {
                                                      var80 = var75.field8839;
                                                   }

                                                   ++class476.field6871;
                                                   class643.method4678(var39, 0, var79, true, (long)var73, field5344[7] + var75.field8781, -1, false, var40, var77[var78], (long)var74.field4666, var80, false);
                                                }

                                                --var78;
                                             } while(~var78 <= -1);

                                             var74 = (class311)var72.field4227.method2246((byte)110);
                                             ++var73;
                                          }
                                       }
                                    } while(var74 != null);
                                 }
                              }
                           }

                           if (var36.field10399 instanceof class338) {
                              class338 var81 = (class338)var36.field10399;
                              class544 var82 = class549.field7834.method3850(3917, var81.method724(23976));
                              if (var82.field7741 != null) {
                                 var82 = var82.method4068(-24716, class344.field5074);
                              }

                              if (var82 != null) {
                                 if (class37.field543 && ~class117.field1849.field6824 == ~var36.field10399.field6824) {
                                    class57 var83 = class466.field6762 == -1 ? null : class746.field10611.method1224(class466.field6762, 11);
                                    if ((class394.field5716 & 4) != 0 && (var83 == null || ~var82.method4070(false, var83.field816, class466.field6762) != ~var83.field816)) {
                                       ++class387.field5646;
                                       class643.method4678(var39, 0, 49, true, (long)var81.hashCode(), class128.field2048 + field5344[8] + var82.field7724, -1, false, var40, class733.field10420, class383.method2987(var39, var40, (byte)-37, var81), class127.field2038, false);
                                    }
                                 }

                                 if (class117.field1849.field6824 == var36.field10399.field6824) {
                                    String[] var84 = var82.field7698;
                                    if (var84 != null) {
                                       int var85 = var84.length + -1;
                                       if (var4 || var85 >= 0) {
                                          do {
                                             if (var84[var85] != null) {
                                                short var86 = 0;
                                                int var87 = class560.field7967;
                                                if (~var85 == -1) {
                                                   var86 = 30;
                                                }

                                                if (~var85 == -2) {
                                                   var86 = 57;
                                                }

                                                if (~var85 == -3) {
                                                   var86 = 59;
                                                }

                                                if (var85 == 3) {
                                                   var86 = 45;
                                                }

                                                if (~var85 == -5) {
                                                   var86 = 1002;
                                                }

                                                if (~var85 == -6) {
                                                   var86 = 1001;
                                                }

                                                if (var82.field7728 == var85) {
                                                   var87 = var82.field7715;
                                                }

                                                if (~var82.field7689 == ~var85) {
                                                   var87 = var82.field7744;
                                                }

                                                ++class757.field10823;
                                                class643.method4678(var39, 0, var86, true, (long)var81.hashCode(), field5344[3] + var82.field7724, -1, false, var40, var84[var85], class383.method2987(var39, var40, (byte)-102, var81), var87, false);
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

                     var36 = (class731)var35.method3309(true);
                     if (var36 == null) {
                        var10000 = class563.field8012;
                        if (!var4) {
                           break;
                        }
                     } else {
                        var10000 = class539.field7573;
                     }
                  }
               }

               if (var10000) {
                  class412.method3220(117);
               }

               ++var30;
               if (!class563.field8012) {
                  var10001 = 1;
                  if (!var4) {
                  }
               } else {
                  var10001 = 2;
               }
            } while(var30 < var10001);

            class560.method4167((byte)66, false);
         }
      } catch (RuntimeException var89) {
         throw class612.method4503(var89, field5344[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5344[0] : field5344[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(I)J"
   )
   public static final long method2842(int arg0) {
      try {
         if (arg0 > -116) {
            return -88L;
         } else {
            ++field5334;
            return class657.field9292.method3562((byte)124);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5344[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2843(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2844(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
