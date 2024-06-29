import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class136 {
   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2197 = new String[]{method1384(method1383("2\u0003`6")), method1384(method1383(")\u001emt\u0003t")), method1384(method1383("'X\"t=")), method1384(method1383(")\u001emt\u0001t")), method1384(method1383(")\u001emt\u0002t"))};
   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "I"
   )
   public static int field2194;
   @OriginalMember(
      owner = "client!uha",
      name = "c",
      descriptor = "I"
   )
   public static int field2195;
   @OriginalMember(
      owner = "client!uha",
      name = "b",
      descriptor = "I"
   )
   public static int field2196;

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(BILaa;IILjga;Lha;II)V"
   )
   public static final void method1380(byte arg0, int arg1, class684 arg2, int arg3, int arg4, class91 arg5, class17 arg6, int arg7, int arg8) {
      boolean var9 = client.field10022;

      try {
         ++field2194;
         if (arg0 == -113) {
            class541 var10 = class33.field467.method1756(36, arg8);
            if (var10 != null && var10.field7590 && var10.method4032(class344.field5074, (byte)49)) {
               if (var10.field7613 != null) {
                  int[] var11 = new int[var10.field7613.length];
                  int var12 = 0;
                  int var13;
                  int var14;
                  int var15;
                  if (var9) {
                     if (class306.field4639 != 4) {
                        var13 = (int)class86.field1312 - -class647.field9122 & 16383;
                        if (var9) {
                           var13 = (int)class86.field1312 & 16383;
                        }
                     } else {
                        var13 = (int)class86.field1312 & 16383;
                     }

                     var14 = class160.field2447[var13];
                     var15 = class160.field2446[var13];
                     if (class306.field4639 != 4) {
                        var14 = var14 * 256 / (class455.field6620 - -256);
                        var15 = var15 * 256 / (class455.field6620 + 256);
                     }

                     var11[var12 * 2] = arg3 - -(arg5.field1513 / 2) - -((var10.field7613[var12 * 2] * 4 + arg4) * var15 + (var10.field7613[var12 * 2 - -1] * 4 + arg1) * var14 >> 14);
                     var11[var12 * 2 + 1] = arg5.field1452 / 2 + -((var10.field7613[var12 * 2 + 1] * 4 + arg1) * var15 + -((var10.field7613[var12 * 2] * 4 + arg4) * var14) >> 14) + arg7;
                     ++var12;
                  }

                  label194:
                  while(true) {
                     int var10000;
                     byte var10001;
                     if (~var12 <= ~(var11.length / 2)) {
                        class329.method2639(arg6, var11, var10.field7597, arg5.field1421, arg5.field1384);
                        var10000 = ~var10.field7584;
                        var10001 = -1;
                        if (!var9) {
                           int var34;
                           if (var10000 < -1) {
                              int var17;
                              int var18;
                              int var19;
                              int var20;
                              label141: {
                                 int var16 = 0;
                                 if (var9) {
                                    var17 = var11[var16 * 2];
                                    var18 = var11[var16 * 2 + 1];
                                    var19 = var11[(var16 - -1) * 2];
                                    var20 = var11[var16 * 2 + 1 - -2];
                                    var10000 = ~var17;
                                    var34 = ~var19;
                                 } else if (~var16 <= ~(var11.length / 2 + -1)) {
                                    var17 = var11[var11.length - 2];
                                    var18 = var11[var11.length - 1];
                                    var19 = var11[0];
                                    var20 = var11[1];
                                    var10000 = var19;
                                    var34 = var17;
                                    if (!var9) {
                                       break label141;
                                    }
                                 } else {
                                    var17 = var11[var16 * 2];
                                    var18 = var11[var16 * 2 + 1];
                                    var19 = var11[(var16 - -1) * 2];
                                    var20 = var11[var16 * 2 + 1 - -2];
                                    var10000 = ~var17;
                                    var34 = ~var19;
                                 }

                                 while(true) {
                                    int var23;
                                    if (var10000 < var34) {
                                       int var21 = var17;
                                       var17 = var19;
                                       int var22 = var18;
                                       var18 = var20;
                                       var19 = var21;
                                       var20 = var22;
                                       if (var9 && ~var17 == ~var21 && ~var22 > ~var18) {
                                          var23 = var18;
                                          var18 = var22;
                                          var20 = var23;
                                       }
                                    } else if (~var17 == ~var19 && ~var20 > ~var18) {
                                       var23 = var18;
                                       var18 = var20;
                                       var20 = var23;
                                    }

                                    arg6.method244(var17, var18, var19, var20, var10.field7609[255 & var10.field7595[var16]], 1, arg2, arg3, arg7, var10.field7584, var10.field7612, var10.field7591);
                                    ++var16;
                                    if (~var16 <= ~(var11.length / 2 + -1)) {
                                       var17 = var11[var11.length - 2];
                                       var18 = var11[var11.length - 1];
                                       var19 = var11[0];
                                       var20 = var11[1];
                                       var10000 = var19;
                                       var34 = var17;
                                       if (!var9) {
                                          break;
                                       }
                                    } else {
                                       var17 = var11[var16 * 2];
                                       var18 = var11[var16 * 2 + 1];
                                       var19 = var11[(var16 - -1) * 2];
                                       var20 = var11[var16 * 2 + 1 - -2];
                                       var10000 = ~var17;
                                       var34 = ~var19;
                                    }
                                 }
                              }

                              label112: {
                                 if (var10000 >= var34) {
                                    if (var17 != var19 || ~var20 <= ~var18) {
                                       break label112;
                                    }

                                    int var24 = var18;
                                    var18 = var20;
                                    var20 = var24;
                                    if (!var9) {
                                       break label112;
                                    }
                                 }

                                 int var25 = var17;
                                 var17 = var19;
                                 int var26 = var18;
                                 var19 = var25;
                                 var18 = var20;
                                 var20 = var26;
                              }

                              arg6.method244(var17, var18, var19, var20, var10.field7609[255 & var10.field7595[var10.field7595.length + -1]], 1, arg2, arg3, arg7, var10.field7584, var10.field7612, var10.field7591);
                              if (!var9) {
                                 break;
                              }
                           }

                           int var27 = 0;
                           if (var9) {
                              arg6.method163(var11[var27 * 2], var11[var27 * 2 + 1], var11[(var27 + 1) * 2], var11[(var27 - -1) * 2 + 1], var10.field7609[255 & var10.field7595[var27]], 1, arg2, arg3, arg7);
                              ++var27;
                           }

                           while(true) {
                              while(var27 < var11.length / 2 + -1) {
                                 arg6.method163(var11[var27 * 2], var11[var27 * 2 + 1], var11[(var27 + 1) * 2], var11[(var27 - -1) * 2 + 1], var10.field7609[255 & var10.field7595[var27]], 1, arg2, arg3, arg7);
                                 ++var27;
                              }

                              var34 = var11[var11.length + -2];
                              int var10002 = var11[var11.length + -1];
                              int var10003 = var11[0];
                              int var10004 = var11[1];
                              int var10005 = var10.field7609[255 & var10.field7595[var10.field7595.length + -1]];
                              if (!var9) {
                                 arg6.method163(var34, var10002, var10003, var10004, var10005, 1, arg2, arg3, arg7);
                                 break label194;
                              }

                              arg6.method163(var34, var10002, var10003, var10004, var10005, 1, arg2, arg3, arg7);
                              ++var27;
                           }
                        }
                     } else {
                        var10000 = class306.field4639;
                        var10001 = 4;
                     }

                     if (var10000 != var10001) {
                        var13 = (int)class86.field1312 - -class647.field9122 & 16383;
                        if (var9) {
                           var13 = (int)class86.field1312 & 16383;
                        }
                     } else {
                        var13 = (int)class86.field1312 & 16383;
                     }

                     var14 = class160.field2447[var13];
                     var15 = class160.field2446[var13];
                     if (class306.field4639 != 4) {
                        var14 = var14 * 256 / (class455.field6620 - -256);
                        var15 = var15 * 256 / (class455.field6620 + 256);
                     }

                     var11[var12 * 2] = arg3 - -(arg5.field1513 / 2) - -((var10.field7613[var12 * 2] * 4 + arg4) * var15 + (var10.field7613[var12 * 2 - -1] * 4 + arg1) * var14 >> 14);
                     var11[var12 * 2 + 1] = arg5.field1452 / 2 + -((var10.field7613[var12 * 2 + 1] * 4 + arg1) * var15 + -((var10.field7613[var12 * 2] * 4 + arg4) * var14) >> 14) + arg7;
                     ++var12;
                  }
               }

               class148 var28 = null;
               if (var10.field7628 != -1) {
                  var28 = var10.method4027(false, -17767, arg6);
                  if (var28 != null) {
                     class460.method3553(arg2, (byte)-102, arg3, arg1, arg5, arg4, var28, arg7);
                  }
               }

               if (var10.field7588 != null) {
                  int var29 = 0;
                  if (var28 != null) {
                     var29 = var28.method1354();
                  }

                  class216 var30 = class666.field9377;
                  class440 var31 = class537.field7543;
                  if (~var10.field7603 == -2) {
                     var30 = class510.field7243;
                     var31 = class383.field5587;
                  }

                  if (var10.field7603 == 2) {
                     var30 = class437.field6409;
                     var31 = class705.field10143;
                  }

                  class340.method2707(var30, arg5, arg7, var31, arg3, var10.field7588, (byte)-101, arg4, arg2, var10.field7587, var29, arg1);
                  return;
               }
            }

         }
      } catch (RuntimeException var33) {
         throw class612.method4503(var33, field2197[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2197[2] : field2197[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2197[2] : field2197[0]) + ',' + (arg6 != null ? field2197[2] : field2197[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(IILha;Ljca;ILju;)Z"
   )
   public static final boolean method1381(int arg0, int arg1, class17 arg2, class541 arg3, int arg4, class270 arg5) {
      boolean var6 = client.field10022;

      try {
         ++field2196;
         int var7 = Integer.MAX_VALUE;
         int var8 = Integer.MIN_VALUE;
         int var9 = Integer.MAX_VALUE;
         int var10 = Integer.MIN_VALUE;
         if (arg3.field7613 != null) {
            var8 = (class651.field9222 - class651.field9226) * (arg3.field7625 - -arg5.field4130 + -class651.field9231) / (-class651.field9231 + class651.field9219) + class651.field9226;
            var7 = (arg3.field7585 + arg5.field4130 + -class651.field9231) * (-class651.field9226 + class651.field9222) / (class651.field9219 - class651.field9231) + class651.field9226;
            var10 = -((arg3.field7630 + arg5.field4133 - class651.field9230) * (-class651.field9236 + class651.field9240) / (-class651.field9230 + class651.field9234)) + class651.field9240;
            var9 = class651.field9240 - (arg3.field7596 - -arg5.field4133 + -class651.field9230) * (-class651.field9236 + class651.field9240) / (-class651.field9230 + class651.field9234);
         }

         class148 var11 = null;
         int var12 = 58 / ((arg0 - 55) / 35);
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         if (~arg3.field7628 != 0) {
            if (arg5.field4137 && ~arg3.field7621 != 0) {
               var11 = arg3.method4027(true, -17767, arg2);
            } else {
               var11 = arg3.method4027(false, -17767, arg2);
            }

            if (var11 != null) {
               var13 = arg5.field4132 - (1 + var11.method1351() >> 1);
               var14 = arg5.field4132 - -(1 + var11.method1351() >> 1);
               if (var7 > var13) {
                  var7 = var13;
               }

               if (var14 > var8) {
                  var8 = var14;
               }

               var15 = arg5.field4129 - (1 + var11.method1356() >> 1);
               var16 = arg5.field4129 - -(var11.method1356() - -1 >> 1);
               if (~var15 > ~var9) {
                  var9 = var15;
               }

               if (~var16 < ~var10) {
                  var10 = var16;
               }
            }
         }

         class569 var17 = null;
         int var18 = 0;
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;
         int var23 = 0;
         int var24 = 0;
         int var25 = 0;
         if (arg3.field7588 != null) {
            var17 = class715.method5182(arg3.field7603, -3);
            if (var17 != null) {
               label162: {
                  var18 = class537.field7543.method3426((byte)126, arg3.field7588, class720.field10314, (int[])null, (class148[])null);
                  var20 = -((-class651.field9236 + class651.field9240) * arg3.field7615 / (-class651.field9230 + class651.field9234)) + arg5.field4129;
                  var19 = arg5.field4132 - -((-class651.field9226 + class651.field9222) * arg3.field7604 / (-class651.field9231 + class651.field9219));
                  if (var11 == null) {
                     var20 -= var18 * var17.method4213() / 2;
                     if (!var6) {
                        break label162;
                     }
                  }

                  var20 -= (var11.method1356() >> 1) - -(var18 * var17.method4215());
               }

               int var26 = 0;
               if (var6 || var26 < var18) {
                  do {
                     String var27 = class720.field10314[var26];
                     if (var26 < var18 + -1) {
                        var27 = var27.substring(0, var27.length() + -4);
                     }

                     int var28 = var17.method4218(var27);
                     if (var21 < var28) {
                        var21 = var28;
                     }

                     ++var26;
                  } while(var26 < var18);
               }

               var22 = -(var21 / 2) + var19 + arg1;
               var23 = var21 / 2 + var19 + arg1;
               if (~var7 < ~var22) {
                  var7 = var22;
               }

               var24 = arg4 + var20;
               if (~var23 < ~var8) {
                  var8 = var23;
               }

               if (~var24 > ~var9) {
                  var9 = var24;
               }

               var25 = arg4 + var17.method4215() * var18 + var20;
               if (~var10 > ~var25) {
                  var10 = var25;
               }
            }
         }

         if (~var8 <= ~class651.field9226 && ~var7 >= ~class651.field9222 && var10 >= class651.field9236 && class651.field9240 >= var9) {
            class651.method4760(arg2, arg5, arg3);
            if (var11 != null) {
               if (class287.field4295 > 0 && (class501.field7146 != -1 && ~class501.field7146 == ~arg5.field4134 || class460.field6701 != -1 && ~class460.field6701 == ~arg3.field7606)) {
                  int var29;
                  label133: {
                     if (class746.field10608 > 50) {
                        var29 = -(class746.field10608 * 2) + 200;
                        if (!var6) {
                           break label133;
                        }
                     }

                     var29 = class746.field10608 * 2;
                  }

                  int var30 = var29 << 24 | 16776960;
                  arg2.method233(-94, var30, var11.method1350() / 2 - -7, arg5.field4132, arg5.field4129);
                  arg2.method233(-65, var30, var11.method1350() / 2 - -5, arg5.field4132, arg5.field4129);
                  arg2.method233(-122, var30, 3 + var11.method1350() / 2, arg5.field4132, arg5.field4129);
                  arg2.method233(-106, var30, var11.method1350() / 2 - -1, arg5.field4132, arg5.field4129);
                  arg2.method233(-89, var30, var11.method1350() / 2, arg5.field4132, arg5.field4129);
               }

               var11.method1451(arg5.field4132 + -(var11.method1351() >> 1), arg5.field4129 - (var11.method1356() >> 1));
            }

            if (arg3.field7588 != null && var17 != null) {
               class131.method1336(var19, (byte)-68, var17, arg2, var20, arg5, var18, var21, arg3);
            }

            if (arg3.field7628 != -1 || arg3.field7588 != null) {
               class48 var31 = new class48(arg5);
               var31.field734 = var15;
               var31.field730 = var25;
               var31.field732 = var16;
               var31.field743 = var22;
               var31.field737 = var23;
               var31.field731 = var13;
               var31.field742 = var24;
               var31.field738 = var14;
               class418.field6115.method2238(var31, 13);
            }

            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var33) {
         throw class612.method4503(var33, field2197[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2197[2] : field2197[0]) + ',' + (arg3 != null ? field2197[2] : field2197[0]) + ',' + arg4 + ',' + (arg5 != null ? field2197[2] : field2197[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1382(int arg0) {
      try {
         ++field2195;
         if (class528.field7463 == 10) {
            class528.field7463 = 11;
            if (arg0 == 2) {
               ;
            }
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2197[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1383(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1384(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
