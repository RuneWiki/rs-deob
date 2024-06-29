import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class419 extends class396 {
   @OriginalMember(
      owner = "client!qk",
      name = "O",
      descriptor = "Z"
   )
   public boolean field6490;
   @OriginalMember(
      owner = "client!qk",
      name = "N",
      descriptor = "F"
   )
   public float field6487;
   @OriginalMember(
      owner = "client!qk",
      name = "Q",
      descriptor = "F"
   )
   public float field6488;
   @OriginalMember(
      owner = "client!qk",
      name = "X",
      descriptor = "I"
   )
   public int field6485;
   @OriginalMember(
      owner = "client!qk",
      name = "U",
      descriptor = "I"
   )
   public int field6482;
   @OriginalMember(
      owner = "client!qk",
      name = "Y",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6492 = new String[]{method3342(method3341("9\u0006ZB")), method3342(method3341(",]\u0018\u0000\\")), method3342(method3341("&\u0018\u0018m\t")), method3342(method3341("&\u0018\u0018\u0012H9\u001aB\u0010\t")), method3342(method3341("&\u0018\u0018o\t")), method3342(method3341("\u0015\\E\u000en\"\u0007\f")), method3342(method3341("k\\UAMiSN")), method3342(method3341("\u0010\u0012[K\u001bw:X\u0014")), method3342(method3341("&\u0018\u0018j\t")), method3342(method3341("k\u0010YB\u001c1\u0015\u000f\u001e\u0015gM")), method3342(method3341("\u0011\u0003E\u0014")), method3342(method3341("w\\\u0016")), method3342(method3341("\u001a\u0016[\u0014")), method3342(method3341("w?W\u0014\u0001")), method3342(method3341("rS\u001e")), method3342(method3341("\u0007\u001cZWRmS")), method3342(method3341("\u0007\u0012DZH4\u001fS]\u001bw")), method3342(method3341("\u00002d`h\u00194\f\u000el2\u001eY\\Xw\u0006EOF2SYXD%S\u0000\u001al\u0015R\u0016~M2\u0012EK\u0001>\u001dPAS:SAFN2\u0005S\\\u0001>\u0000\u0016\\D$\u0003Y@R>\u0011ZK\u00011\u001cD\u000eU?\u0016\u0016MN9\u0007S@Ux\u0012DK@w\nY[\u00016\u0001S\u000eT$\u001aXI\u000e>\u001d\u0018")), method3342(method3341("w=fm\u001bw")), method3342(method3341("rZ")), method3342(method3341("\u0014\u0012UFDm")), method3342(method3341("w#Z\u0014\u0001")), method3342(method3341("\u001b\u001cTLXmS\u007f@\u001b")), method3342(method3341("w>YJD;\u0000\f\u000e")), method3342(method3341("\u001b\u0000\f\u000e")), method3342(method3341("\u0018\u0015PFD6\u0003\f")), method3342(method3341("\u0015\\E")), method3342(method3341("&\u0018\u0018l\t"))};
   @OriginalMember(
      owner = "client!qk",
      name = "T",
      descriptor = "I"
   )
   public static int field6481 = -1;
   @OriginalMember(
      owner = "client!qk",
      name = "V",
      descriptor = "Z"
   )
   public static boolean field6486 = false;
   @OriginalMember(
      owner = "client!qk",
      name = "S",
      descriptor = "[I"
   )
   public static int[] field6491 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @OriginalMember(
      owner = "client!qk",
      name = "R",
      descriptor = "I"
   )
   public static int field6483;
   @OriginalMember(
      owner = "client!qk",
      name = "P",
      descriptor = "I"
   )
   public static int field6484;
   @OriginalMember(
      owner = "client!qk",
      name = "M",
      descriptor = "I"
   )
   public static int field6489;
   @OriginalMember(
      owner = "client!qk",
      name = "W",
      descriptor = "Ld;"
   )
   public static class150 field6480;

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIIIZ[BI)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            if (super.field11642 != 34037) {
               this.field6490 = true;
               this.field6488 = this.field6487 = 1.0F;
               if (!client.field1786) {
                  break label28;
               }
            }

            this.field6487 = (float)arg4;
            this.field6488 = (float)arg3;
            this.field6490 = false;
         }

         this.field6485 = arg3;
         this.field6482 = arg4;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6492[1] : field6492[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method3337(boolean arg0) {
      try {
         field6480 = null;
         if (arg0) {
            method3337(false);
         }

         field6491 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6492[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIII)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field6485 = arg3;
         this.field6482 = arg4;
         if (~super.field11642 != -34038) {
            this.field6490 = true;
            this.field6488 = this.field6487 = 1.0F;
         } else {
            this.field6488 = (float)arg3;
            this.field6490 = false;
            this.field6487 = (float)arg4;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIII[I)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, 6408, arg3, arg4);

      try {
         this.field6485 = arg1;
         this.field6482 = arg2;
         this.method3198(91, 0, arg1, 0, arg2, true, 0, 0, arg5);
         this.field6488 = (float)arg1 / (float)arg3;
         this.field6490 = false;
         this.field6487 = (float)arg2 / (float)arg4;
         this.method3192(false, false, false);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6492[1] : field6492[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIIII)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field6485 = arg2;
         this.field6482 = arg3;
         this.field6487 = (float)arg3 / (float)arg5;
         this.field6490 = false;
         this.field6488 = (float)arg2 / (float)arg4;
         this.method3192(false, false, false);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(IIBIIIZIII[Lfq;)V"
   )
   public static final void method3338(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class374[] arg10) {
      boolean var11 = client.field1786;

      try {
         ++field6484;
         class351.field5356.method629(arg8, arg1, arg7, arg4);
         int var12 = -51 % ((arg2 - 51) / 36);
         int var13 = 0;
         if (var11 || ~var13 > ~arg10.length) {
            do {
               class374 var14 = arg10[var13];
               if (var14 != null && (~var14.field5830 == ~arg9 || arg9 == -1412584499 && (class358.field5551 == var14 || var11))) {
                  int var15 = var14.field5845 + arg0;
                  int var16 = var14.field5879 + arg5;
                  int var17 = var15 + 1 + var14.field5849;
                  int var18 = var16 + 1 - -var14.field5915;
                  int var19;
                  if (arg3 == -1) {
                     class640.field9275[class169.field2594].setBounds(var14.field5845 - -arg0, var14.field5879 + arg5, var14.field5849, var14.field5915);
                     var19 = class169.field2594++;
                     if (var11) {
                        var19 = arg3;
                     }
                  } else {
                     var19 = arg3;
                  }

                  var14.field5858 = var19;
                  var14.field5898 = class308.field4801;
                  if (!client.method1169(var14)) {
                     label1015: {
                        if (~var14.field5917 != -1) {
                           class102.method987(var14, (byte)68);
                        }

                        int var20 = var14.field5845 - -arg0;
                        int var21 = var14.field5879 + arg5;
                        int var22 = 0;
                        int var23 = 0;
                        if (class281.field4472) {
                           var22 = class600.method4443(0);
                           var23 = class218.method1890(0);
                        }

                        int var24 = var14.field5886;
                        if (class351.field5351) {
                           if (client.method1148(var14).field898 == 0) {
                              if (var14.field5910 == 0 && ~var24 < -128) {
                                 var24 = 127;
                              }
                           } else if (~var24 < -128) {
                              var24 = 127;
                           }
                        }

                        if (class358.field5551 == var14) {
                           if (~arg9 != 1412584498 && (~class42.field568 == ~var14.field5920 || ~class456.field6999 == ~var14.field5920)) {
                              class42.field567 = arg0;
                              class421.field6506 = arg5;
                              class203.field3098 = arg10;
                              if (!var11) {
                                 break label1015;
                              }
                           }

                           if (class412.field6412 && class717.field10744) {
                              int var25 = var22 + class690.field10254.method2571(96);
                              int var26 = class690.field10254.method2578(true) + var23;
                              int var27 = var25 - class36.field427;
                              int var28 = var26 - class17.field229;
                              if (class76.field980 > var27) {
                                 var27 = class76.field980;
                              }

                              if (var14.field5849 + var27 > class76.field980 + class432.field6655.field5849) {
                                 var27 = class76.field980 + class432.field6655.field5849 - var14.field5849;
                              }

                              if (~class37.field453 < ~var28) {
                                 var28 = class37.field453;
                              }

                              var20 = var27;
                              if (var14.field5915 + var28 > class37.field453 + class432.field6655.field5915) {
                                 var28 = -var14.field5915 + class432.field6655.field5915 + class37.field453;
                              }

                              var21 = var28;
                           }

                           if (~class456.field6999 == ~var14.field5920) {
                              var24 = 128;
                           }
                        }

                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        label982: {
                           if (var14.field5910 == 2) {
                              var29 = arg7;
                              var30 = arg1;
                              var31 = arg4;
                              var32 = arg8;
                              if (!var11) {
                                 break label982;
                              }
                           }

                           int var33 = var20 - -var14.field5849;
                           int var34 = var21 - -var14.field5915;
                           var32 = ~var20 >= ~arg8 ? arg8 : var20;
                           var30 = arg1 < var21 ? var21 : arg1;
                           if (~var14.field5910 == -10) {
                              ++var33;
                              ++var34;
                           }

                           var31 = ~arg4 >= ~var34 ? arg4 : var34;
                           var29 = ~var33 > ~arg7 ? var33 : arg7;
                        }

                        if (~var29 < ~var32 && (var30 < var31 || var11)) {
                           label1049: {
                              if (~var14.field5917 != -1) {
                                 if (class707.field10649 == var14.field5917 || ~class287.field4518 == ~var14.field5917) {
                                    class38.method272(var14, var21, var20, 1);
                                    if (!class281.field4472) {
                                       class492.method3810(var20, ~class287.field4518 == ~var14.field5917, -1179648, var21, var14.field5915, var14.field5849);
                                       class351.field5356.method629(arg8, arg1, arg7, arg4);
                                    }

                                    class721.field10798[var19] = true;
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }

                                 if (class431.field6649 == var14.field5917) {
                                    if (var14.method3069(class351.field5356, (byte)-72) == null) {
                                       break label1049;
                                    }

                                    class532.method4095(-107);
                                    class694.method5106(class351.field5356, var21, var20, var14, 128);
                                    class730.field10897[var19] = true;
                                    class351.field5356.method629(arg8, arg1, arg7, arg4);
                                    if (!class281.field4472) {
                                       break label1049;
                                    }

                                    if (arg6) {
                                       class171.method1580(var17, var18, -118, var16, var15);
                                       if (!var11) {
                                          break label1049;
                                       }
                                    }

                                    class684.method5055(var16, var15, var18, 10266, var17);
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }

                                 if (~class233.field3560 == ~var14.field5917) {
                                    class652.method4794(var14, var20, var21, class351.field5356, (byte)124);
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }

                                 if (~class136.field1944 == ~var14.field5917) {
                                    class198.method1749(var20, var21, class351.field5356, var14.field5938 % 64, var14, 0);
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }

                                 if (class464.field7053 == var14.field5917) {
                                    if (var14.method3069(class351.field5356, (byte)-72) == null) {
                                       break label1049;
                                    }

                                    class579.method4336(124, var21, var20, var14);
                                    class730.field10897[var19] = true;
                                    class351.field5356.method629(arg8, arg1, arg7, arg4);
                                    if (!class281.field4472) {
                                       break label1049;
                                    }

                                    if (arg6) {
                                       class171.method1580(var17, var18, -88, var16, var15);
                                       if (!var11) {
                                          break label1049;
                                       }
                                    }

                                    class684.method5055(var16, var15, var18, 10266, var17);
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }

                                 if (class580.field8569 == var14.field5917) {
                                    class424.method3363(var21, class351.field5356, var14.field5849, class652.field9583, var20, -120, var14.field5915);
                                    class721.field10798[var19] = true;
                                    class351.field5356.method629(arg8, arg1, arg7, arg4);
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }

                                 if (~class459.field7007 == ~var14.field5917) {
                                    class552.method4194(var20, class351.field5356, var14.field5849, var14.field5915, (byte)84, var21);
                                    class721.field10798[var19] = true;
                                    class351.field5356.method629(arg8, arg1, arg7, arg4);
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }

                                 if (~class738.field10968 == ~var14.field5917) {
                                    if (!class636.field9187 && !class162.field2422) {
                                       break label1049;
                                    }

                                    int var35 = var14.field5849 + var20;
                                    if (class281.field4472) {
                                       if (!arg6) {
                                          class684.method5055(var16, var15, var18, 10266, var17);
                                          if (var11) {
                                             class171.method1580(var17, var18, -95, var16, var15);
                                          }
                                       } else {
                                          class171.method1580(var17, var18, -95, var16, var15);
                                       }
                                    }

                                    int var36 = var21 + 15;
                                    if (class636.field9187) {
                                       int var37 = -256;
                                       if (class14.field178 < 20) {
                                          var37 = -65536;
                                       }

                                       class577.field8538.method2403(-16, var35, var36, -1, var37, field6492[10] + class14.field178);
                                       var36 += 15;
                                       Runtime var38 = Runtime.getRuntime();
                                       int var39 = (int)((var38.totalMemory() - var38.freeMemory()) / 1024L);
                                       int var40 = -256;
                                       if (~var39 < -98305) {
                                          if (class168.field2578) {
                                             class176.method1613(0);
                                             int var41 = 0;
                                             if (var11) {
                                                System.gc();
                                                ++var41;
                                             }

                                             while(true) {
                                                while(~var41 > -11) {
                                                   System.gc();
                                                   ++var41;
                                                }

                                                var39 = (int)((var38.totalMemory() + -var38.freeMemory()) / 1024L);
                                                if (!var11) {
                                                   if (var39 > 65536) {
                                                      class23.method170(4, 0, field6492[17]);
                                                   }

                                                   var40 = -65536;
                                                   break;
                                                }

                                                ++var41;
                                             }
                                          } else {
                                             var40 = -65536;
                                          }
                                       }

                                       class577.field8538.method2403(-99, var35, var36, -1, var40, field6492[12] + var39 + "k");
                                       var36 += 15;
                                       class577.field8538.method2403(-99, var35, var36, -1, -256, field6492[7] + class510.field7801.field371 + field6492[5] + class510.field7801.field369 + field6492[26]);
                                       var36 += 15;
                                       class577.field8538.method2403(64, var35, var36, -1, -256, field6492[22] + class510.field7800.field371 + field6492[5] + class510.field7800.field369 + field6492[26]);
                                       var36 += 15;
                                       int var42 = class351.field5356.method661() / 1024;
                                       class577.field8538.method2403(73, var35, var36, -1, ~var42 < -65537 ? -65536 : -256, field6492[25] + var42 + "k");
                                       var36 += 15;
                                       int var43 = 0;
                                       int var44 = 0;
                                       int var45 = 0;
                                       int var46 = 0;
                                       if (var11) {
                                          if (class311.field4826[var46] != null) {
                                             var43 += class311.field4826[var46].method5436(false);
                                             var44 += class311.field4826[var46].method5432(true);
                                             var45 += class311.field4826[var46].method5439(108);
                                          }

                                          ++var46;
                                       }

                                       while(true) {
                                          while(var46 < 37) {
                                             if (class311.field4826[var46] != null) {
                                                var43 += class311.field4826[var46].method5436(false);
                                                var44 += class311.field4826[var46].method5432(true);
                                                var45 += class311.field4826[var46].method5439(108);
                                             }

                                             ++var46;
                                          }

                                          int var47 = var45 * 100 / var43;
                                          int var48 = var44 * 10000 / var43;
                                          String var49 = field6492[20] + class50.method345(2, (long)var48, 160, 0, true) + field6492[14] + var47 + field6492[19];
                                          class722.field10805.method2403(-118, var35, var36, -1, -256, var49);
                                          if (!var11) {
                                             var36 += 12;
                                             break;
                                          }

                                          ++var46;
                                       }
                                    }

                                    if (class738.field10973 > 0) {
                                       class722.field10805.method2403(9, var35, var36, -1, -256, field6492[16] + class332.field5028 + field6492[11] + class738.field10973);
                                    }

                                    var36 += 12;
                                    if (class162.field2422) {
                                       class722.field10805.method2403(29, var35, var36, -1, -256, field6492[15] + class351.field5356.method591() + field6492[23] + class351.field5356.method706());
                                       var36 += 12;
                                       class722.field10805.method2403(-92, var35, var36, -1, -256, field6492[24] + class787.field11538 + field6492[13] + class14.field177 + field6492[18] + class53.field660 + field6492[21] + class399.field6252);
                                       class455.method3560((byte)73);
                                       var36 += 12;
                                    }

                                    class721.field10798[var19] = true;
                                    if (!var11) {
                                       break label1049;
                                    }
                                 }
                              }

                              if (var14.field5910 == 0) {
                                 if (~class746.field11075 == ~var14.field5917 && class351.field5356.method617()) {
                                    class351.field5356.method686(var20, var21, var14.field5849, var14.field5915);
                                 }

                                 method3338(var20 - var14.field5809, var30, (byte)88, var19, var31, var21 - var14.field5812, arg6, var29, var32, var14.field5840, arg10);
                                 if (var14.field5829 != null) {
                                    method3338(-var14.field5809 + var20, var30, (byte)90, var19, var31, -var14.field5812 + var21, arg6, var29, var32, var14.field5840, var14.field5829);
                                 }

                                 class276 var50 = (class276)class507.field7766.method3141((long)var14.field5840, true);
                                 if (var50 != null) {
                                    class640.method4674(var32, var29, var21, var50.field4404, -25977, var20, var31, var19, var30);
                                 }

                                 if (~class746.field11075 == ~var14.field5917 && class351.field5356.method617()) {
                                    class351.field5356.method672();
                                 }

                                 class351.field5356.method629(arg8, arg1, arg7, arg4);
                              }

                              if (class12.field158[var19] || class556.field8300 > 1) {
                                 label1050: {
                                    if (var14.field5910 == 3) {
                                       label996: {
                                          if (var24 != 0) {
                                             if (var14.field5940) {
                                                class351.field5356.method631(var20, var21, var14.field5849, var14.field5915, -(var24 & 255) + 255 << 24 | var14.field5938 & 16777215, 1);
                                                if (!var11) {
                                                   break label996;
                                                }
                                             }

                                             class351.field5356.method602(var20, var21, var14.field5849, var14.field5915, -(var24 & 255) + 255 << 24 | var14.field5938 & 16777215, 1);
                                             if (!var11) {
                                                break label996;
                                             }
                                          }

                                          if (var14.field5940) {
                                             class351.field5356.method631(var20, var21, var14.field5849, var14.field5915, var14.field5938, 0);
                                             if (!var11) {
                                                break label996;
                                             }
                                          }

                                          class351.field5356.method602(var20, var21, var14.field5849, var14.field5915, var14.field5938, 0);
                                       }

                                       if (!class281.field4472) {
                                          break label1050;
                                       }

                                       if (!arg6) {
                                          class684.method5055(var16, var15, var18, 10266, var17);
                                          if (!var11) {
                                             break label1050;
                                          }
                                       }

                                       class171.method1580(var17, var18, -82, var16, var15);
                                       if (!var11) {
                                          break label1050;
                                       }
                                    }

                                    if (~var14.field5910 == -5) {
                                       class288 var51 = var14.method3056(class351.field5356, (byte)-123);
                                       if (var51 == null) {
                                          if (!class717.field10757) {
                                             break label1050;
                                          }

                                          class573.method4310((byte)-70, var14);
                                          if (!var11) {
                                             break label1050;
                                          }
                                       }

                                       int var52 = var14.field5938;
                                       String var53 = var14.field5941;
                                       if (~var14.field5927 != 0) {
                                          class136 var54 = class247.field3763.method2058(-11, var14.field5927);
                                          var53 = var54.field1975;
                                          if (var53 == null) {
                                             var53 = field6492[0];
                                          }

                                          if ((var54.field1961 == 1 || var14.field5958 != 1) && var14.field5958 != -1) {
                                             var53 = field6492[9] + var53 + field6492[6] + class528.method4060(false, var14.field5958);
                                          }
                                       }

                                       if (~var14.field5903 != 0) {
                                          var53 = class686.method5058(-125, var14.field5903);
                                          if (var53 == null) {
                                             var53 = "";
                                          }
                                       }

                                       if (class387.field6083 == var14) {
                                          var53 = class499.field7619.method3875(class493.field7455, 93);
                                          var52 = var14.field5938;
                                       }

                                       if (class294.field4657) {
                                          class351.field5356.method586(var20, var21, var14.field5849 + var20, var14.field5915 + var21);
                                       }

                                       var51.method2410(class547.field8199, var14.field5821, var14.field5839, var14.field5856 ? -(var24 & 255) + 255 << 24 : -1, 29979, 0, var20, var14.field5915, var53, (class96)null, var14.field5849, var14.field5873, var21, 0, (int[])null, var52 | -(var24 & 255) + 255 << 24, var14.field5835);
                                       if (class294.field4657) {
                                          class351.field5356.method629(arg8, arg1, arg7, arg4);
                                       }

                                       if (var53.trim().length() <= 0) {
                                          break label1050;
                                       }

                                       if (!class294.field4657) {
                                          class697 var55 = class645.method4691(var14.field5827, (byte)24, class351.field5356);
                                          int var56 = var55.method5124(var53, 1, var14.field5849, class547.field8199);
                                          int var57 = var55.method5127(var14.field5849, class547.field8199, var14.field5873, var53, 8364);
                                          if (!class281.field4472) {
                                             break label1050;
                                          }

                                          if (!arg6) {
                                             class684.method5055(var21, var20, var21 - -var57, 10266, var20 + var56);
                                             if (!var11) {
                                                break label1050;
                                             }
                                          }

                                          class171.method1580(var20 - -var56, var21 + var57, -112, var21, var20);
                                          if (!var11) {
                                             break label1050;
                                          }
                                       }

                                       if (!class281.field4472) {
                                          break label1050;
                                       }

                                       if (!arg6) {
                                          class684.method5055(var16, var15, var18, 10266, var17);
                                          if (!var11) {
                                             break label1050;
                                          }
                                       }

                                       class171.method1580(var17, var18, -109, var16, var15);
                                       if (!var11) {
                                          break label1050;
                                       }
                                    }

                                    if (~var14.field5910 == -6) {
                                       label861: {
                                          if (var14.field5844 < 0) {
                                             class672 var58;
                                             label1002: {
                                                if (~var14.field5927 == 0) {
                                                   if (~var14.field5903 == 0) {
                                                      var58 = var14.method3062(class351.field5356, (byte)-125);
                                                      if (!var11) {
                                                         break label1002;
                                                      }
                                                   }

                                                   var58 = class326.method2668(class351.field5356, var14.field5903, 23825);
                                                   if (!var11) {
                                                      break label1002;
                                                   }
                                                }

                                                class456 var59 = !var14.field5875 ? null : class476.field7251.field98;
                                                var58 = class247.field3763.method2049(var59, class351.field5356, var14.field5808, var14.field5927, var14.field5935, (byte)28, var14.field5958, -16777216 | var14.field5955);
                                             }

                                             if (var58 == null) {
                                                if (!class717.field10757) {
                                                   break label861;
                                                }

                                                class573.method4310((byte)-125, var14);
                                                if (!var11) {
                                                   break label861;
                                                }
                                             }

                                             int var60 = var58.method2106();
                                             int var61 = var58.method2108();
                                             int var62 = (var14.field5938 != 0 ? 16777215 & var14.field5938 : 16777215) | -(var24 & 255) + 255 << 24;
                                             if (var14.field5793) {
                                                label1004: {
                                                   class351.field5356.method586(var20, var21, var14.field5849 + var20, var14.field5915 + var21);
                                                   if (var14.field5800 == 0) {
                                                      if (~var14.field5938 != -1 || var24 != 0) {
                                                         var58.method2101(var20, var21, var14.field5849, var14.field5915, 0, var62, 1);
                                                         if (!var11) {
                                                            break label1004;
                                                         }
                                                      }

                                                      var58.method4949(var20, var21, var14.field5849, var14.field5915);
                                                      if (!var11) {
                                                         break label1004;
                                                      }
                                                   }

                                                   int var63 = (var60 + -1 + var14.field5849) / var60;
                                                   int var64 = (var14.field5915 - 1 - -var61) / var61;
                                                   int var65 = 0;
                                                   if (var11 || ~var65 > ~var63) {
                                                      do {
                                                         int var66 = 0;
                                                         if (var11) {
                                                            if (~var14.field5938 == -1) {
                                                               var58.method4951((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field5800);
                                                               if (var11) {
                                                                  var58.method4950((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field5800, 0, var62, 1);
                                                                  ++var66;
                                                               } else {
                                                                  ++var66;
                                                               }
                                                            } else {
                                                               var58.method4950((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field5800, 0, var62, 1);
                                                               ++var66;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(var64 > var66) {
                                                               if (~var14.field5938 == -1) {
                                                                  var58.method4951((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field5800);
                                                                  if (var11) {
                                                                     var58.method4950((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field5800, 0, var62, 1);
                                                                     ++var66;
                                                                  } else {
                                                                     ++var66;
                                                                  }
                                                               } else {
                                                                  var58.method4950((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field5800, 0, var62, 1);
                                                                  ++var66;
                                                               }
                                                            }

                                                            if (!var11) {
                                                               ++var65;
                                                               break;
                                                            }

                                                            var58.method4950((float)var60 / 2.0F + (float)(var60 * var65 + var20), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field5800, 0, var62, 1);
                                                            ++var66;
                                                         }
                                                      } while(~var65 > ~var63);
                                                   }
                                                }

                                                class351.field5356.method629(arg8, arg1, arg7, arg4);
                                                if (!var11) {
                                                   break label861;
                                                }
                                             }

                                             if (~var14.field5938 != -1 || ~var24 != -1) {
                                                if (var14.field5800 == 0) {
                                                   if (var14.field5849 != var60 || var14.field5915 != var61) {
                                                      var58.method4953(var20, var21, var14.field5849, var14.field5915, 0, var62, 1);
                                                      if (!var11) {
                                                         break label861;
                                                      }
                                                   }

                                                   var58.method938(var20, var21, 0, var62, 1);
                                                   if (!var11) {
                                                      break label861;
                                                   }
                                                }

                                                var58.method4950((float)var14.field5849 / 2.0F + (float)var20, (float)var14.field5915 / 2.0F + (float)var21, var14.field5849 * 4096 / var60, var14.field5800, 0, var62, 1);
                                                if (!var11) {
                                                   break label861;
                                                }
                                             }

                                             if (~var14.field5800 == -1) {
                                                if (~var14.field5849 != ~var60 || ~var14.field5915 != ~var61) {
                                                   var58.method4954(var20, var21, var14.field5849, var14.field5915);
                                                   if (!var11) {
                                                      break label861;
                                                   }
                                                }

                                                var58.method4959(var20, var21);
                                                if (!var11) {
                                                   break label861;
                                                }
                                             }

                                             var58.method4951((float)var14.field5849 / 2.0F + (float)var20, (float)var14.field5915 / 2.0F + (float)var21, var14.field5849 * 4096 / var60, var14.field5800);
                                             if (!var11) {
                                                break label861;
                                             }
                                          }

                                          var14.method3061((byte)122, class88.field1274, class739.field10975).method3388(var20, -123, var21, class351.field5356, var14.field5957 << 3, var14.field5849, 0, var14.field5794 << 3, var14.field5915, 0, 0);
                                       }

                                       if (!class281.field4472) {
                                          break label1050;
                                       }

                                       if (!arg6) {
                                          class684.method5055(var16, var15, var18, 10266, var17);
                                          if (!var11) {
                                             break label1050;
                                          }
                                       }

                                       class171.method1580(var17, var18, -114, var16, var15);
                                       if (!var11) {
                                          break label1050;
                                       }
                                    }

                                    if (~var14.field5910 == -7) {
                                       class144.method1305(-30608);
                                       Object var67 = null;
                                       class91 var68 = null;
                                       int var69 = 0;
                                       if (var14.field5927 == -1) {
                                          if (~var14.field5825 == -6) {
                                             int var70 = var14.field5822;
                                             if (~var70 <= -1 && var70 < 2048) {
                                                class9 var71 = class484.field7370[var70];
                                                if (var71 != null && (class315.field4864 == var70 || ~class126.method1191(var71.field67, 65) == ~var14.field5828)) {
                                                   var68 = var71.field98.method3566(var14.field5937, class252.field3808, class738.field10964, true, -99, 0, (class366[])null, (class366)null, class247.field3763, class412.field6401, (int[])null, class31.field381, class351.field5356, class314.field4861, class45.field599, 2048);
                                                }
                                             }
                                          } else if (var14.field5825 != 8 && var14.field5825 != 9) {
                                             if (var14.field5937 != null && var14.field5937.method2991(64)) {
                                                var68 = var14.method3052(class412.field6401, (class317)var67, var14.field5937, class476.field7251.field98, class45.field599, 0, class247.field3763, class351.field5356, 2048, class738.field10964, class252.field3808, class314.field4861);
                                                if (var68 == null && class717.field10757) {
                                                   class573.method4310((byte)-121, var14);
                                                }
                                             } else {
                                                var68 = var14.method3052(class412.field6401, (class317)var67, (class366)null, class476.field7251.field98, class45.field599, 0, class247.field3763, class351.field5356, 2048, class738.field10964, class252.field3808, class314.field4861);
                                                if (var68 == null && class717.field10757) {
                                                   class573.method4310((byte)-61, var14);
                                                }
                                             }
                                          } else {
                                             class503 var72 = class291.method2454(false, (byte)-26, var14.field5822);
                                             if (var72 != null) {
                                                var68 = var72.method3895(var14.field5875 ? class476.field7251.field98 : null, var14.field5937, var14.field5828, var14.field5825 == 9, class351.field5356, 2048, 31357);
                                             }
                                          }
                                       } else {
                                          class136 var73 = class247.field3763.method2058(-11, var14.field5927);
                                          if (var73 != null) {
                                             class136 var74 = var73.method1250(var14.field5958, (byte)127);
                                             var68 = var74.method1258(!var14.field5875 ? null : class476.field7251.field98, 2048, true, class351.field5356, 1, var14.field5937);
                                             if (var68 != null) {
                                                var69 = -var68.method911() >> 1;
                                                if (var11) {
                                                   class573.method4310((byte)-67, var14);
                                                }
                                             } else {
                                                class573.method4310((byte)-67, var14);
                                             }
                                          }
                                       }

                                       if (var68 != null) {
                                          int var75;
                                          if (~var14.field5872 >= -1) {
                                             var75 = 512;
                                             if (var11) {
                                                var75 = (var14.field5849 << 9) / var14.field5872;
                                             }
                                          } else {
                                             var75 = (var14.field5849 << 9) / var14.field5872;
                                          }

                                          int var76;
                                          if (var14.field5842 > 0) {
                                             var76 = (var14.field5915 << 9) / var14.field5842;
                                             if (var11) {
                                                var76 = 512;
                                             }
                                          } else {
                                             var76 = 512;
                                          }

                                          int var77 = var14.field5849 / 2 + var20;
                                          int var78 = var14.field5915 / 2 + var21;
                                          if (!var14.field5877) {
                                             var77 += var14.field5919 * var75 >> 9;
                                             var78 += var14.field5911 * var76 >> 9;
                                          }

                                          class187.field2925.method1551();
                                          class351.field5356.method688(class187.field2925);
                                          class351.field5356.method639(var77, var78, var75, var76);
                                          class351.field5356.method655();
                                          if (var14.field5867) {
                                             class351.field5356.method581(false);
                                          }

                                          label721: {
                                             if (var14.field5877) {
                                                class717.field10754.method1552(var14.field5918);
                                                class717.field10754.method1547(var14.field5894);
                                                class717.field10754.method1555(var14.field5778);
                                                class717.field10754.method1546(var14.field5919, var14.field5911, var14.field5838);
                                                if (!var11) {
                                                   break label721;
                                                }
                                             }

                                             int var79 = (var14.field5950 << 2) * class83.field1196[var14.field5918 << 3] >> 14;
                                             int var80 = (var14.field5950 << 2) * class83.field1194[var14.field5918 << 3] >> 14;
                                             class717.field10754.method1540(-var14.field5778 << 3);
                                             class717.field10754.method1547(var14.field5894 << 3);
                                             class717.field10754.method1546(var14.field5792 << 2, (var14.field5864 << 2) + var69 + var79, (var14.field5864 << 2) + var80);
                                             class717.field10754.method1560(var14.field5918 << 3);
                                          }

                                          var14.method3067(class717.field10754, var68, class351.field5356, class308.field4801, -1);
                                          if (class294.field4657) {
                                             class351.field5356.method586(var20, var21, var14.field5849 + var20, var14.field5915 + var21);
                                          }

                                          label715: {
                                             if (!var14.field5877) {
                                                if (!var14.field5780) {
                                                   var68.method897(class717.field10754, (class49)null, 1);
                                                   if (var14.field5954 == null) {
                                                      break label715;
                                                   }

                                                   class351.field5356.method652(var14.field5954.method5450());
                                                   if (!var11) {
                                                      break label715;
                                                   }
                                                }

                                                var68.method905(class717.field10754, (class49)null, var14.field5950 << 2, 1);
                                                if (!var11) {
                                                   break label715;
                                                }
                                             }

                                             if (!var14.field5780) {
                                                var68.method897(class717.field10754, (class49)null, 1);
                                                if (var14.field5954 != null) {
                                                   class351.field5356.method652(var14.field5954.method5450());
                                                   if (var11) {
                                                      var68.method905(class717.field10754, (class49)null, var14.field5950, 1);
                                                   }
                                                }
                                             } else {
                                                var68.method905(class717.field10754, (class49)null, var14.field5950, 1);
                                             }
                                          }

                                          if (class294.field4657) {
                                             class351.field5356.method629(arg8, arg1, arg7, arg4);
                                          }

                                          if (var14.field5867) {
                                             class351.field5356.method581(true);
                                          }
                                       }

                                       if (!class281.field4472) {
                                          break label1050;
                                       }

                                       if (arg6) {
                                          class171.method1580(var17, var18, -27, var16, var15);
                                          if (!var11) {
                                             break label1050;
                                          }
                                       }

                                       class684.method5055(var16, var15, var18, 10266, var17);
                                       if (!var11) {
                                          break label1050;
                                       }
                                    }

                                    if (~var14.field5910 == -10) {
                                       int var81;
                                       int var82;
                                       int var83;
                                       int var84;
                                       label701: {
                                          if (var14.field5928) {
                                             var81 = var14.field5915 + var21;
                                             var82 = var20;
                                             var83 = var21;
                                             var84 = var14.field5849 + var20;
                                             if (!var11) {
                                                break label701;
                                             }
                                          }

                                          var82 = var20;
                                          var81 = var21;
                                          var83 = var21 - -var14.field5915;
                                          var84 = var14.field5849 + var20;
                                       }

                                       label696: {
                                          if (~var14.field5779 == -2) {
                                             class351.field5356.method695(var82, var81, var84, var83, var14.field5938, 0);
                                             if (!var11) {
                                                break label696;
                                             }
                                          }

                                          class351.field5356.method649(var82, var81, var84, var83, var14.field5938, var14.field5779, 0);
                                       }

                                       if (class281.field4472) {
                                          if (arg6) {
                                             class171.method1580(var17, var18, -50, var16, var15);
                                             if (var11) {
                                                class684.method5055(var16, var15, var18, 10266, var17);
                                             }
                                          } else {
                                             class684.method5055(var16, var15, var18, 10266, var17);
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
            } while(~var13 > ~arg10.length);

         }
      } catch (RuntimeException var86) {
         throw class482.method3757(var86, field6492[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field6492[1] : field6492[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIIIIIZ)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);

      try {
         this.field6482 = arg4;
         this.field6485 = arg3;
         this.field6487 = (float)arg4 / (float)arg6;
         this.field6490 = false;
         this.field6488 = (float)arg3 / (float)arg5;
         this.method3192(false, false, false);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "c",
      descriptor = "(II)I"
   )
   public static int method3339(int arg0, int arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6492[27] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(ILica;)Ltda;"
   )
   public static final class407 method3340(int arg0, class354 arg1) {
      try {
         ++field6489;
         int var2 = arg1.method2848(arg0 + -105);
         if (arg0 != 12) {
            method3340(98, (class354)null);
         }

         class694 var3 = class389.method3142((byte)-83)[arg1.method2855(arg0 + -31019)];
         class750 var4 = class666.method4919((byte)91)[arg1.method2855(arg0 ^ -30995)];
         int var5 = arg1.method2869(false);
         int var6 = arg1.method2869(false);
         return new class407(var2, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6492[2] + arg0 + ',' + (arg1 != null ? field6492[1] : field6492[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIIIIZ)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);

      try {
         label23: {
            if (~super.field11642 != -34038) {
               this.field6488 = this.field6487 = 1.0F;
               this.field6490 = true;
               if (!client.field1786) {
                  break label23;
               }
            }

            this.field6487 = (float)arg5;
            this.field6488 = (float)arg4;
            this.field6490 = false;
         }

         this.field6482 = arg5;
         this.field6485 = arg4;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIIII[BI)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field6485 = arg2;
         this.field6482 = arg3;
         this.method3195(arg2, 0, arg6, 0, 0, -3477, arg7, true, 0, arg3);
         this.field6488 = (float)arg2 / (float)arg4;
         this.field6490 = false;
         this.field6487 = (float)arg3 / (float)arg5;
         this.method3192(false, false, false);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6492[1] : field6492[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lc;IIIZ[III)V"
   )
   public class419(class652 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            this.field6485 = arg2;
            if (super.field11642 != 34037) {
               this.field6490 = true;
               this.field6488 = this.field6487 = 1.0F;
               if (!client.field1786) {
                  break label28;
               }
            }

            this.field6488 = (float)arg2;
            this.field6490 = false;
            this.field6487 = (float)arg3;
         }

         this.field6482 = arg3;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6492[3] + (arg0 != null ? field6492[1] : field6492[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6492[1] : field6492[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3341(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3342(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
