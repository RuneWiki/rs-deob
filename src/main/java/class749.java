import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class749 extends class22 {
   @OriginalMember(
      owner = "client!dr",
      name = "k",
      descriptor = "[I"
   )
   private int[] field10800;
   @OriginalMember(
      owner = "client!dr",
      name = "v",
      descriptor = "[B"
   )
   public byte[] field10808;
   @OriginalMember(
      owner = "client!dr",
      name = "q",
      descriptor = "[Lrt;"
   )
   public class237[] field10796;
   @OriginalMember(
      owner = "client!dr",
      name = "u",
      descriptor = "[B"
   )
   public byte[] field10801;
   @OriginalMember(
      owner = "client!dr",
      name = "t",
      descriptor = "[S"
   )
   public short[] field10807;
   @OriginalMember(
      owner = "client!dr",
      name = "s",
      descriptor = "[B"
   )
   public byte[] field10799;
   @OriginalMember(
      owner = "client!dr",
      name = "j",
      descriptor = "[Lri;"
   )
   public class122[] field10803;
   @OriginalMember(
      owner = "client!dr",
      name = "o",
      descriptor = "I"
   )
   public int field10804;
   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10811 = new String[]{method5436(method5435("r\tk]s")), method5436(method5435("r\tkZs")), method5436(method5435("x\u000e)t")), method5436(method5435("mUk6&")), method5436(method5435("r\tkYs")), method5436(method5435("r\tk\\s")), method5436(method5435("r\tk[s")), method5436(method5435("r\tk$2x\u00121&s"))};
   @OriginalMember(
      owner = "client!dr",
      name = "x",
      descriptor = "J"
   )
   public static long field10797 = 0L;
   @OriginalMember(
      owner = "client!dr",
      name = "l",
      descriptor = "I"
   )
   public static int field10798 = 1339;
   @OriginalMember(
      owner = "client!dr",
      name = "y",
      descriptor = "I"
   )
   public static int field10802;
   @OriginalMember(
      owner = "client!dr",
      name = "r",
      descriptor = "I"
   )
   public static int field10805;
   @OriginalMember(
      owner = "client!dr",
      name = "n",
      descriptor = "I"
   )
   public static int field10806;
   @OriginalMember(
      owner = "client!dr",
      name = "p",
      descriptor = "I"
   )
   public static int field10809;
   @OriginalMember(
      owner = "client!dr",
      name = "w",
      descriptor = "Ltca;"
   )
   public static class181 field10795;
   @OriginalMember(
      owner = "client!dr",
      name = "m",
      descriptor = "Lpa;"
   )
   public static class386 field10810;

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IZ)V"
   )
   public static final void method5430(int arg0, String arg1, String arg2, int arg3, boolean arg4) {
      try {
         ++field10806;
         class542 var5 = class44.method560(16);
         var5.field7859.method3571(255, class485.field7050.field7915);
         var5.field7859.method3550(arg3, 29620);
         int var6 = var5.field7859.field6907;
         var5.field7859.method3550(653, 29620);
         int[] var7 = class318.method2486(var5, 2);
         int var8 = var5.field7859.field6907;
         var5.field7859.method3546((byte)-126, arg2);
         var5.field7859.method3550(class767.field11135, 29620);
         var5.field7859.method3546((byte)-106, arg1);
         var5.field7859.method3528(class580.field8335, (byte)123);
         var5.field7859.method3571(255, class385.field5684);
         var5.field7859.method3571(255, class128.field2145.field4608);
         class543.method4062(var5.field7859, 102);
         String var9 = class698.field10219;
         var5.field7859.method3571(255, var9 != null ? 1 : 0);
         if (var9 != null) {
            var5.field7859.method3546((byte)-123, var9);
         }

         var5.field7859.method3571(255, arg0);
         var5.field7859.method3571(255, arg4 ? 1 : 0);
         var5.field7859.field6907 += 7;
         var5.field7859.method3552((byte)121, var5.field7859.field6907, var7, var8);
         var5.field7859.method3560(-var6 + var5.field7859.field6907, arg3 ^ 27995);
         class740.method5332(var5, (byte)77);
         class487.field7080 = 1;
         class608.field8731 = 0;
         class518.field7548 = 0;
         class349.field4968 = -3;
         if (arg0 < 13) {
            class473.field6898 = true;
            class710.method5163((byte)127);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field10811[4] + arg0 + ',' + (arg1 != null ? field10811[3] : field10811[2]) + ',' + (arg2 != null ? field10811[3] : field10811[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(IIIIIIB)V"
   )
   public static final void method5431(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5432(int arg0) {
      try {
         if (arg0 != 24308) {
            method5432(-108);
         }

         field10795 = null;
         field10810 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10811[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "<init>",
      descriptor = "()V"
   )
   public class749() {
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5433(int arg0) {
      try {
         ++field10805;
         if (arg0 != -18805) {
            this.field10796 = null;
         }

         this.field10800 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10811[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(Lnf;B[I[B)Z"
   )
   public final boolean method5434(class601 arg0, byte arg1, int[] arg2, byte[] arg3) {
      boolean var5 = client.field4564;

      try {
         ++field10809;
         byte var6 = 1;
         int var7 = 0;
         if (arg1 != -53) {
            field10798 = 81;
         }

         class122 var8 = null;
         int var9 = 0;

         while(true) {
            label73: {
               int var10000;
               if (var9 >= 128) {
                  var10000 = var6;
                  if (!var5) {
                     return (boolean)var6;
                  }
               } else {
                  if (arg3 != null && ~arg3[var9] == -1) {
                     break label73;
                  }

                  var10000 = this.field10800[var9];
               }

               int var10 = var10000;
               if (var10 != 0) {
                  if (~var7 != ~var10) {
                     label62: {
                        var7 = var10--;
                        if (~(var10 & 1) != -1) {
                           var8 = arg0.method4441(arg2, -2, var10 >> 2);
                           if (!var5) {
                              break label62;
                           }
                        }

                        var8 = arg0.method4436(var10 >> 2, arg1 + 53, arg2);
                     }

                     if (var8 == null) {
                        var6 = 0;
                     }
                  }

                  if (var8 != null) {
                     this.field10803[var9] = var8;
                     this.field10800[var9] = 0;
                  }
               }
            }

            ++var9;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10811[1] + (arg0 != null ? field10811[3] : field10811[2]) + ',' + arg1 + ',' + (arg2 != null ? field10811[3] : field10811[2]) + ',' + (arg3 != null ? field10811[3] : field10811[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class749(byte[] arg0) {
      boolean var2 = client.field4564;
      super();

      try {
         this.field10800 = new int[128];
         this.field10808 = new byte[128];
         this.field10796 = new class237[128];
         this.field10801 = new byte[128];
         this.field10807 = new short[128];
         this.field10799 = new byte[128];
         this.field10803 = new class122[128];
         class473 var3 = new class473(arg0);
         int var4 = 0;
         if (var2) {
            ++var4;
         }

         while(~var3.field6889[var3.field6907 + var4] != -1) {
            ++var4;
         }

         byte[] var5 = new byte[var4];
         int var6 = 0;
         if (var2) {
            var5[var6] = var3.method3543(-1132613840);
            ++var6;
         }

         while(true) {
            while(~var4 < ~var6) {
               var5[var6] = var3.method3543(-1132613840);
               ++var6;
            }

            ++var3.field6907;
            ++var4;
            int var7 = var3.field6907;
            var3.field6907 += var4;
            int var8 = 0;
            if (!var2) {
               if (var2) {
                  ++var8;
               }

               while(~var3.field6889[var3.field6907 + var8] != -1) {
                  ++var8;
               }

               byte[] var9 = new byte[var8];
               int var10 = 0;
               if (var2) {
                  var9[var10] = var3.method3543(-1132613840);
                  ++var10;
               }

               while(true) {
                  while(~var8 < ~var10) {
                     var9[var10] = var3.method3543(-1132613840);
                     ++var10;
                  }

                  ++var3.field6907;
                  ++var8;
                  int var11 = var3.field6907;
                  var3.field6907 += var8;
                  int var12 = 0;
                  if (!var2) {
                     if (var2) {
                        ++var12;
                     }

                     while(var3.field6889[var3.field6907 + var12] != 0) {
                        ++var12;
                     }

                     byte[] var13 = new byte[var12];
                     int var14 = 0;
                     if (var2) {
                        var13[var14] = var3.method3543(-1132613840);
                        ++var14;
                     }

                     while(true) {
                        while(~var12 < ~var14) {
                           var13[var14] = var3.method3543(-1132613840);
                           ++var14;
                        }

                        ++var12;
                        ++var3.field6907;
                        byte[] var15 = new byte[var12];
                        if (!var2) {
                           int var16;
                           label4178: {
                              if (var12 > 1) {
                                 var15[1] = 1;
                                 var16 = 2;
                                 int var17 = 1;
                                 int var18 = 2;
                                 if (var2 || var18 < var12) {
                                    do {
                                       int var19 = var3.method3564((byte)-53);
                                       if (~var19 != -1) {
                                          if (~var19 >= ~var17) {
                                             --var19;
                                          }

                                          var17 = var19;
                                          if (var2) {
                                             var17 = var16++;
                                          }
                                       } else {
                                          var17 = var16++;
                                       }

                                       var15[var18] = (byte)var17;
                                       ++var18;
                                    } while(var18 < var12);
                                 }

                                 if (!var2) {
                                    break label4178;
                                 }
                              }

                              var16 = var12;
                           }

                           class237[] var20 = new class237[var16];
                           int var21 = 0;
                           class237 var22;
                           int var23;
                           int var24;
                           if (var2) {
                              var22 = var20[var21] = new class237();
                              var23 = var3.method3564((byte)-97);
                              if (var23 > 0) {
                                 var22.field3438 = new byte[var23 * 2];
                              }

                              var24 = var3.method3564((byte)-63);
                              if (~var24 < -1) {
                                 var22.field3451 = new byte[var24 * 2 - -2];
                                 var22.field3451[1] = 64;
                              }

                              ++var21;
                           }

                           while(var20.length > var21) {
                              var22 = var20[var21] = new class237();
                              var23 = var3.method3564((byte)-97);
                              if (var23 > 0) {
                                 var22.field3438 = new byte[var23 * 2];
                              }

                              var24 = var3.method3564((byte)-63);
                              if (~var24 < -1) {
                                 var22.field3451 = new byte[var24 * 2 - -2];
                                 var22.field3451[1] = 64;
                              }

                              ++var21;
                           }

                           int var25 = var3.method3564((byte)-53);
                           byte[] var26 = var25 > 0 ? new byte[var25 * 2] : null;
                           int var27 = var3.method3564((byte)-46);
                           byte[] var28 = var27 > 0 ? new byte[var27 * 2] : null;
                           int var29 = 0;
                           if (var2) {
                              ++var29;
                           }

                           while(var3.field6889[var3.field6907 + var29] != 0) {
                              ++var29;
                           }

                           byte[] var30 = new byte[var29];
                           int var31 = 0;
                           if (var2) {
                              var30[var31] = var3.method3543(-1132613840);
                              ++var31;
                           }

                           while(true) {
                              while(~var31 > ~var29) {
                                 var30[var31] = var3.method3543(-1132613840);
                                 ++var31;
                              }

                              ++var29;
                              ++var3.field6907;
                              int var32 = 0;
                              int var33 = 0;
                              if (!var2) {
                                 if (var2) {
                                    var32 += var3.method3564((byte)-86);
                                    this.field10807[var33] = (short)var32;
                                    ++var33;
                                 }

                                 while(true) {
                                    while(var33 < 128) {
                                       var32 += var3.method3564((byte)-86);
                                       this.field10807[var33] = (short)var32;
                                       ++var33;
                                    }

                                    var32 = 0;
                                    int var34 = 0;
                                    if (!var2) {
                                       if (var2) {
                                          var32 += var3.method3564((byte)-47);
                                          this.field10807[var34] = (short)(this.field10807[var34] + (var32 << 8));
                                          ++var34;
                                       }

                                       while(true) {
                                          while(~var34 > -129) {
                                             var32 += var3.method3564((byte)-47);
                                             this.field10807[var34] = (short)(this.field10807[var34] + (var32 << 8));
                                             ++var34;
                                          }

                                          int var35 = 0;
                                          int var36 = 0;
                                          int var37 = 0;
                                          int var38 = 0;
                                          if (!var2) {
                                             if (var2) {
                                                if (~var35 == -1) {
                                                   if (var30.length > var36) {
                                                      var35 = var30[var36++];
                                                      if (var2) {
                                                         var35 = -1;
                                                      }
                                                   } else {
                                                      var35 = -1;
                                                   }

                                                   var37 = var3.method3585(0);
                                                }

                                                this.field10807[var38] = (short)(this.field10807[var38] + (class66.method706(2, var37 + -1) << 14));
                                                this.field10800[var38] = var37;
                                                --var35;
                                                ++var38;
                                             }

                                             while(true) {
                                                while(var38 < 128) {
                                                   if (~var35 == -1) {
                                                      if (var30.length > var36) {
                                                         var35 = var30[var36++];
                                                         if (var2) {
                                                            var35 = -1;
                                                         }
                                                      } else {
                                                         var35 = -1;
                                                      }

                                                      var37 = var3.method3585(0);
                                                   }

                                                   this.field10807[var38] = (short)(this.field10807[var38] + (class66.method706(2, var37 + -1) << 14));
                                                   this.field10800[var38] = var37;
                                                   --var35;
                                                   ++var38;
                                                }

                                                var35 = 0;
                                                var36 = 0;
                                                int var39 = 0;
                                                int var40 = 0;
                                                if (!var2) {
                                                   if (var2) {
                                                      if (this.field10800[var40] != 0) {
                                                         if (~var35 == -1) {
                                                            if (~var36 > ~var5.length) {
                                                               var35 = var5[var36++];
                                                               if (var2) {
                                                                  var35 = -1;
                                                               }
                                                            } else {
                                                               var35 = -1;
                                                            }

                                                            var39 = -1 + var3.field6889[var7++];
                                                         }

                                                         --var35;
                                                         this.field10808[var40] = (byte)var39;
                                                      }

                                                      ++var40;
                                                   }

                                                   while(true) {
                                                      while(var40 < 128) {
                                                         if (this.field10800[var40] != 0) {
                                                            if (~var35 == -1) {
                                                               if (~var36 > ~var5.length) {
                                                                  var35 = var5[var36++];
                                                                  if (var2) {
                                                                     var35 = -1;
                                                                  }
                                                               } else {
                                                                  var35 = -1;
                                                               }

                                                               var39 = -1 + var3.field6889[var7++];
                                                            }

                                                            --var35;
                                                            this.field10808[var40] = (byte)var39;
                                                         }

                                                         ++var40;
                                                      }

                                                      var35 = 0;
                                                      var36 = 0;
                                                      int var41 = 0;
                                                      int var42 = 0;
                                                      if (!var2) {
                                                         if (var2) {
                                                            if (~this.field10800[var42] != -1) {
                                                               if (var35 == 0) {
                                                                  var41 = 16 + var3.field6889[var11++] << 2;
                                                                  if (~var9.length >= ~var36) {
                                                                     var35 = -1;
                                                                     if (var2) {
                                                                        var35 = var9[var36++];
                                                                     }
                                                                  } else {
                                                                     var35 = var9[var36++];
                                                                  }
                                                               }

                                                               this.field10801[var42] = (byte)var41;
                                                               --var35;
                                                               ++var42;
                                                            } else {
                                                               ++var42;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(~var42 > -129) {
                                                               if (~this.field10800[var42] != -1) {
                                                                  if (var35 == 0) {
                                                                     var41 = 16 + var3.field6889[var11++] << 2;
                                                                     if (~var9.length >= ~var36) {
                                                                        var35 = -1;
                                                                        if (var2) {
                                                                           var35 = var9[var36++];
                                                                        }
                                                                     } else {
                                                                        var35 = var9[var36++];
                                                                     }
                                                                  }

                                                                  this.field10801[var42] = (byte)var41;
                                                                  --var35;
                                                                  ++var42;
                                                               } else {
                                                                  ++var42;
                                                               }
                                                            }

                                                            var35 = 0;
                                                            var36 = 0;
                                                            class237 var43 = null;
                                                            int var44 = 0;
                                                            if (!var2) {
                                                               while(true) {
                                                                  if (~var44 <= -129) {
                                                                     var36 = 0;
                                                                     var35 = 0;
                                                                     int var45 = 0;
                                                                     int var46 = 0;
                                                                     if (!var2) {
                                                                        if (var2) {
                                                                           if (var35 == 0) {
                                                                              if (var30.length > var36) {
                                                                                 var35 = var30[var36++];
                                                                                 if (var2) {
                                                                                    var35 = -1;
                                                                                 }
                                                                              } else {
                                                                                 var35 = -1;
                                                                              }

                                                                              if (~this.field10800[var46] < -1) {
                                                                                 var45 = var3.method3564((byte)-123) + 1;
                                                                              }
                                                                           }

                                                                           --var35;
                                                                           this.field10799[var46] = (byte)var45;
                                                                           ++var46;
                                                                        }

                                                                        while(true) {
                                                                           while(var46 < 128) {
                                                                              if (var35 == 0) {
                                                                                 if (var30.length > var36) {
                                                                                    var35 = var30[var36++];
                                                                                    if (var2) {
                                                                                       var35 = -1;
                                                                                    }
                                                                                 } else {
                                                                                    var35 = -1;
                                                                                 }

                                                                                 if (~this.field10800[var46] < -1) {
                                                                                    var45 = var3.method3564((byte)-123) + 1;
                                                                                 }
                                                                              }

                                                                              --var35;
                                                                              this.field10799[var46] = (byte)var45;
                                                                              ++var46;
                                                                           }

                                                                           this.field10804 = var3.method3564((byte)-50) + 1;
                                                                           int var47 = 0;
                                                                           if (!var2) {
                                                                              int var10000;
                                                                              int var51;
                                                                              int var52;
                                                                              class237 var53;
                                                                              int var54;
                                                                              int var55;
                                                                              int var56;
                                                                              class237 var57;
                                                                              int var58;
                                                                              int var59;
                                                                              int var60;
                                                                              int var61;
                                                                              int var62;
                                                                              byte var63;
                                                                              int var64;
                                                                              int var65;
                                                                              byte var66;
                                                                              byte var67;
                                                                              int var68;
                                                                              int var69;
                                                                              int var70;
                                                                              Object var71;
                                                                              int var72;
                                                                              int var73;
                                                                              int var74;
                                                                              int var75;
                                                                              int var76;
                                                                              int var77;
                                                                              int var78;
                                                                              int var79;
                                                                              int var80;
                                                                              int var81;
                                                                              int var82;
                                                                              int var83;
                                                                              int var84;
                                                                              int var85;
                                                                              Object var86;
                                                                              int var87;
                                                                              int var88;
                                                                              class237 var89;
                                                                              int var90;
                                                                              int var91;
                                                                              class237 var92;
                                                                              int var93;
                                                                              class237 var94;
                                                                              if (!var2 && var47 >= var16) {
                                                                                 if (var26 != null) {
                                                                                    var51 = 1;
                                                                                    if (var2 || var51 < var26.length) {
                                                                                       do {
                                                                                          var26[var51] = var3.method3543(-1132613840);
                                                                                          var51 += 2;
                                                                                       } while(var51 < var26.length);
                                                                                    }
                                                                                 }

                                                                                 if (var28 != null) {
                                                                                    var52 = 1;
                                                                                    if (var2) {
                                                                                       var28[var52] = var3.method3543(-1132613840);
                                                                                       var52 += 2;
                                                                                    }
                                                                                 } else {
                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || ~var52 > ~var16) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field3451 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && var53.field3451.length <= var55) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 = var3.method3564((byte)-69) + var54 + 1;
                                                                                                      var53.field3451[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var53.field3451.length > var55);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var52 > ~var16);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && var16 <= var56) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method3564((byte)-63);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label2123:
                                                                                             while(true) {
                                                                                                while(~var61 > ~var26.length) {
                                                                                                   var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var62 > var64) {
                                                                                                         this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         if (var2 || ~var65 > ~var26.length) {
                                                                                                            do {
                                                                                                               label2186: {
                                                                                                                  var66 = var26[var65];
                                                                                                                  var67 = var26[var65 + 1];
                                                                                                                  var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  } else if (var66 <= var62) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break label2186;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     var68 += var67 - var63;
                                                                                                                     this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                                     ++var69;
                                                                                                                     if (var66 <= var69) {
                                                                                                                        var63 = var67;
                                                                                                                        var65 += 2;
                                                                                                                        var10000 = var66;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var62 = var10000;
                                                                                                            } while(~var65 > ~var26.length);
                                                                                                         }

                                                                                                         var71 = null;
                                                                                                         var72 = var62;
                                                                                                         if (var2 || ~var62 > -129) {
                                                                                                            do {
                                                                                                               this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                               ++var72;
                                                                                                            } while(~var72 > -129);
                                                                                                         }
                                                                                                         break label2123;
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var73 = var3.method3564((byte)-80);
                                                                                             var28[0] = (byte)var73;
                                                                                             var74 = 2;
                                                                                             if (var2) {
                                                                                                var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             label2239:
                                                                                             while(true) {
                                                                                                while(~var28.length < ~var74) {
                                                                                                   var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                   var28[var74] = (byte)var73;
                                                                                                   var74 += 2;
                                                                                                }

                                                                                                var75 = var28[0];
                                                                                                var76 = var28[1] << 1;
                                                                                                var77 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      var78 = (255 & this.field10801[var77]) + var76;
                                                                                                      if (var78 < 0) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (~var78 < -129) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field10801[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var75 >= ~var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            label2310: {
                                                                                                               if (var2) {
                                                                                                                  var79 = var28[var78];
                                                                                                               } else if (var28.length <= var78) {
                                                                                                                  var79 = var75;
                                                                                                                  if (!var2) {
                                                                                                                     break label2310;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var79 = var28[var78];
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  label2327: {
                                                                                                                     var80 = var28[var78 + 1] << 1;
                                                                                                                     var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                                     var82 = var75;
                                                                                                                     if (var2) {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     } else if (var79 <= var75) {
                                                                                                                        var75 = var79;
                                                                                                                        var10000 = var80;
                                                                                                                        if (!var2) {
                                                                                                                           break label2327;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     }

                                                                                                                     while(true) {
                                                                                                                        var83 = var10000;
                                                                                                                        var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                        if (~var84 > -1) {
                                                                                                                           var84 = 0;
                                                                                                                        }

                                                                                                                        if (~var84 < -129) {
                                                                                                                           var84 = 128;
                                                                                                                        }

                                                                                                                        var81 += -var76 + var80;
                                                                                                                        this.field10801[var82] = (byte)var84;
                                                                                                                        ++var82;
                                                                                                                        if (var79 <= var82) {
                                                                                                                           var75 = var79;
                                                                                                                           var10000 = var80;
                                                                                                                           if (!var2) {
                                                                                                                              break;
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                        }
                                                                                                                     }
                                                                                                                  }

                                                                                                                  var76 = var10000;
                                                                                                                  var78 += 2;
                                                                                                                  if (var28.length <= var78) {
                                                                                                                     var79 = var75;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var79 = var28[var78];
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            if (var2 || var79 < 128) {
                                                                                                               do {
                                                                                                                  var85 = (255 & this.field10801[var79]) + var76;
                                                                                                                  if (var85 < 0) {
                                                                                                                     var85 = 0;
                                                                                                                  }

                                                                                                                  if (~var85 < -129) {
                                                                                                                     var85 = 128;
                                                                                                                  }

                                                                                                                  this.field10801[var79] = (byte)var85;
                                                                                                                  ++var79;
                                                                                                               } while(var79 < 128);
                                                                                                            }

                                                                                                            var86 = null;
                                                                                                            break label2239;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (255 & this.field10801[var77]) + var76;
                                                                                                      }

                                                                                                      if (var78 < 0) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (~var78 < -129) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field10801[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                   }
                                                                                                }

                                                                                                var74 += 2;
                                                                                             }
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2) {
                                                                                             var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                             ++var87;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var87 > ~var16) {
                                                                                                var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                                ++var87;
                                                                                             }

                                                                                             var88 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var88 > ~var16) {
                                                                                                   do {
                                                                                                      var89 = var20[var88];
                                                                                                      if (var89.field3438 != null) {
                                                                                                         var89.field3447 = var3.method3564((byte)-81);
                                                                                                      }

                                                                                                      if (var89.field3451 != null) {
                                                                                                         var89.field3440 = var3.method3564((byte)-73);
                                                                                                      }

                                                                                                      if (~var89.field3441 < -1) {
                                                                                                         var89.field3452 = var3.method3564((byte)-62);
                                                                                                      }

                                                                                                      ++var88;
                                                                                                   } while(~var88 > ~var16);
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                   ++var90;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var90 < var16) {
                                                                                                      var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                      ++var90;
                                                                                                   }

                                                                                                   var91 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var91 < var16) {
                                                                                                         do {
                                                                                                            var92 = var20[var91];
                                                                                                            if (~var92.field3442 < -1) {
                                                                                                               var92.field3450 = var3.method3564((byte)-89);
                                                                                                            }

                                                                                                            ++var91;
                                                                                                         } while(var91 < var16);
                                                                                                      }

                                                                                                      var93 = 0;
                                                                                                      if (!var2 && ~var93 <= ~var16) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var94 = var20[var93];
                                                                                                         if (~var94.field3450 < -1) {
                                                                                                            var94.field3448 = var3.method3564((byte)-48);
                                                                                                         }

                                                                                                         ++var93;
                                                                                                      } while(~var93 > ~var16);

                                                                                                      return;
                                                                                                   }

                                                                                                   ++var90;
                                                                                                }
                                                                                             }

                                                                                             ++var87;
                                                                                          }
                                                                                       }

                                                                                       do {
                                                                                          var57 = var20[var56];
                                                                                          if (var57.field3438 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                                var57.field3438[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var57.field3438.length < ~var59) {
                                                                                                var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                                var57.field3438[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(var16 > var56);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method3564((byte)-63);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label2570:
                                                                                          while(true) {
                                                                                             while(~var61 > ~var26.length) {
                                                                                                var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var65 > ~var26.length) {
                                                                                                         do {
                                                                                                            label2633: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               } else if (var66 <= var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label2633;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += var67 - var63;
                                                                                                                  this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (var66 <= var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                         } while(~var65 > ~var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || ~var62 > -129) {
                                                                                                         do {
                                                                                                            this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(~var72 > -129);
                                                                                                      }
                                                                                                      break label2570;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method3564((byte)-80);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          label2686:
                                                                                          while(true) {
                                                                                             while(~var28.length < ~var74) {
                                                                                                var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var75 >= ~var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         label2757: {
                                                                                                            if (var2) {
                                                                                                               var79 = var28[var78];
                                                                                                            } else if (var28.length <= var78) {
                                                                                                               var79 = var75;
                                                                                                               if (!var2) {
                                                                                                                  break label2757;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var79 = var28[var78];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label2774: {
                                                                                                                  var80 = var28[var78 + 1] << 1;
                                                                                                                  var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                                  var82 = var75;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  } else if (var79 <= var75) {
                                                                                                                     var75 = var79;
                                                                                                                     var10000 = var80;
                                                                                                                     if (!var2) {
                                                                                                                        break label2774;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var83 = var10000;
                                                                                                                     var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                     if (~var84 > -1) {
                                                                                                                        var84 = 0;
                                                                                                                     }

                                                                                                                     if (~var84 < -129) {
                                                                                                                        var84 = 128;
                                                                                                                     }

                                                                                                                     var81 += -var76 + var80;
                                                                                                                     this.field10801[var82] = (byte)var84;
                                                                                                                     ++var82;
                                                                                                                     if (var79 <= var82) {
                                                                                                                        var75 = var79;
                                                                                                                        var10000 = var80;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var76 = var10000;
                                                                                                               var78 += 2;
                                                                                                               if (var28.length <= var78) {
                                                                                                                  var79 = var75;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var79 = var28[var78];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2 || var79 < 128) {
                                                                                                            do {
                                                                                                               var85 = (255 & this.field10801[var79]) + var76;
                                                                                                               if (var85 < 0) {
                                                                                                                  var85 = 0;
                                                                                                               }

                                                                                                               if (~var85 < -129) {
                                                                                                                  var85 = 128;
                                                                                                               }

                                                                                                               this.field10801[var79] = (byte)var85;
                                                                                                               ++var79;
                                                                                                            } while(var79 < 128);
                                                                                                         }

                                                                                                         var86 = null;
                                                                                                         break label2686;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   }

                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var87 > ~var16) {
                                                                                             var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var88 > ~var16) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field3438 != null) {
                                                                                                      var89.field3447 = var3.method3564((byte)-81);
                                                                                                   }

                                                                                                   if (var89.field3451 != null) {
                                                                                                      var89.field3440 = var3.method3564((byte)-73);
                                                                                                   }

                                                                                                   if (~var89.field3441 < -1) {
                                                                                                      var89.field3452 = var3.method3564((byte)-62);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var88 > ~var16);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var90 < var16) {
                                                                                                   var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var91 < var16) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (~var92.field3442 < -1) {
                                                                                                            var92.field3450 = var3.method3564((byte)-89);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(var91 < var16);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field3450 < -1) {
                                                                                                         var94.field3448 = var3.method3564((byte)-48);
                                                                                                      }

                                                                                                      ++var93;
                                                                                                   } while(~var93 > ~var16);

                                                                                                   return;
                                                                                                }

                                                                                                ++var90;
                                                                                             }
                                                                                          }

                                                                                          ++var87;
                                                                                       }
                                                                                    }

                                                                                    var52 += 2;
                                                                                 }

                                                                                 while(true) {
                                                                                    while(~var52 > ~var28.length) {
                                                                                       var28[var52] = var3.method3543(-1132613840);
                                                                                       var52 += 2;
                                                                                    }

                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || ~var52 > ~var16) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field3451 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && var53.field3451.length <= var55) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 = var3.method3564((byte)-69) + var54 + 1;
                                                                                                      var53.field3451[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var53.field3451.length > var55);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var52 > ~var16);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && var16 <= var56) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method3564((byte)-63);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label3053:
                                                                                             while(true) {
                                                                                                while(~var61 > ~var26.length) {
                                                                                                   var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var62 > var64) {
                                                                                                         this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         if (var2 || ~var65 > ~var26.length) {
                                                                                                            do {
                                                                                                               label3116: {
                                                                                                                  var66 = var26[var65];
                                                                                                                  var67 = var26[var65 + 1];
                                                                                                                  var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  } else if (var66 <= var62) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break label3116;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     var68 += var67 - var63;
                                                                                                                     this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                                     ++var69;
                                                                                                                     if (var66 <= var69) {
                                                                                                                        var63 = var67;
                                                                                                                        var65 += 2;
                                                                                                                        var10000 = var66;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var62 = var10000;
                                                                                                            } while(~var65 > ~var26.length);
                                                                                                         }

                                                                                                         var71 = null;
                                                                                                         var72 = var62;
                                                                                                         if (var2 || ~var62 > -129) {
                                                                                                            do {
                                                                                                               this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                               ++var72;
                                                                                                            } while(~var72 > -129);
                                                                                                         }
                                                                                                         break label3053;
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var73 = var3.method3564((byte)-80);
                                                                                             var28[0] = (byte)var73;
                                                                                             var74 = 2;
                                                                                             if (var2) {
                                                                                                var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             label3169:
                                                                                             while(true) {
                                                                                                while(~var28.length < ~var74) {
                                                                                                   var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                   var28[var74] = (byte)var73;
                                                                                                   var74 += 2;
                                                                                                }

                                                                                                var75 = var28[0];
                                                                                                var76 = var28[1] << 1;
                                                                                                var77 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      var78 = (255 & this.field10801[var77]) + var76;
                                                                                                      if (var78 < 0) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (~var78 < -129) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field10801[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var75 >= ~var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            label3240: {
                                                                                                               if (var2) {
                                                                                                                  var79 = var28[var78];
                                                                                                               } else if (var28.length <= var78) {
                                                                                                                  var79 = var75;
                                                                                                                  if (!var2) {
                                                                                                                     break label3240;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var79 = var28[var78];
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  label3257: {
                                                                                                                     var80 = var28[var78 + 1] << 1;
                                                                                                                     var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                                     var82 = var75;
                                                                                                                     if (var2) {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     } else if (var79 <= var75) {
                                                                                                                        var75 = var79;
                                                                                                                        var10000 = var80;
                                                                                                                        if (!var2) {
                                                                                                                           break label3257;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     }

                                                                                                                     while(true) {
                                                                                                                        var83 = var10000;
                                                                                                                        var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                        if (~var84 > -1) {
                                                                                                                           var84 = 0;
                                                                                                                        }

                                                                                                                        if (~var84 < -129) {
                                                                                                                           var84 = 128;
                                                                                                                        }

                                                                                                                        var81 += -var76 + var80;
                                                                                                                        this.field10801[var82] = (byte)var84;
                                                                                                                        ++var82;
                                                                                                                        if (var79 <= var82) {
                                                                                                                           var75 = var79;
                                                                                                                           var10000 = var80;
                                                                                                                           if (!var2) {
                                                                                                                              break;
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                        }
                                                                                                                     }
                                                                                                                  }

                                                                                                                  var76 = var10000;
                                                                                                                  var78 += 2;
                                                                                                                  if (var28.length <= var78) {
                                                                                                                     var79 = var75;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var79 = var28[var78];
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            if (var2 || var79 < 128) {
                                                                                                               do {
                                                                                                                  var85 = (255 & this.field10801[var79]) + var76;
                                                                                                                  if (var85 < 0) {
                                                                                                                     var85 = 0;
                                                                                                                  }

                                                                                                                  if (~var85 < -129) {
                                                                                                                     var85 = 128;
                                                                                                                  }

                                                                                                                  this.field10801[var79] = (byte)var85;
                                                                                                                  ++var79;
                                                                                                               } while(var79 < 128);
                                                                                                            }

                                                                                                            var86 = null;
                                                                                                            break label3169;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (255 & this.field10801[var77]) + var76;
                                                                                                      }

                                                                                                      if (var78 < 0) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (~var78 < -129) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field10801[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                   }
                                                                                                }

                                                                                                var74 += 2;
                                                                                             }
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2) {
                                                                                             var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                             ++var87;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var87 > ~var16) {
                                                                                                var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                                ++var87;
                                                                                             }

                                                                                             var88 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var88 > ~var16) {
                                                                                                   do {
                                                                                                      var89 = var20[var88];
                                                                                                      if (var89.field3438 != null) {
                                                                                                         var89.field3447 = var3.method3564((byte)-81);
                                                                                                      }

                                                                                                      if (var89.field3451 != null) {
                                                                                                         var89.field3440 = var3.method3564((byte)-73);
                                                                                                      }

                                                                                                      if (~var89.field3441 < -1) {
                                                                                                         var89.field3452 = var3.method3564((byte)-62);
                                                                                                      }

                                                                                                      ++var88;
                                                                                                   } while(~var88 > ~var16);
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                   ++var90;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var90 < var16) {
                                                                                                      var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                      ++var90;
                                                                                                   }

                                                                                                   var91 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var91 < var16) {
                                                                                                         do {
                                                                                                            var92 = var20[var91];
                                                                                                            if (~var92.field3442 < -1) {
                                                                                                               var92.field3450 = var3.method3564((byte)-89);
                                                                                                            }

                                                                                                            ++var91;
                                                                                                         } while(var91 < var16);
                                                                                                      }

                                                                                                      var93 = 0;
                                                                                                      if (!var2 && ~var93 <= ~var16) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var94 = var20[var93];
                                                                                                         if (~var94.field3450 < -1) {
                                                                                                            var94.field3448 = var3.method3564((byte)-48);
                                                                                                         }

                                                                                                         ++var93;
                                                                                                      } while(~var93 > ~var16);

                                                                                                      return;
                                                                                                   }

                                                                                                   ++var90;
                                                                                                }
                                                                                             }

                                                                                             ++var87;
                                                                                          }
                                                                                       }

                                                                                       do {
                                                                                          var57 = var20[var56];
                                                                                          if (var57.field3438 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                                var57.field3438[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var57.field3438.length < ~var59) {
                                                                                                var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                                var57.field3438[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(var16 > var56);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method3564((byte)-63);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label3500:
                                                                                          while(true) {
                                                                                             while(~var61 > ~var26.length) {
                                                                                                var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var65 > ~var26.length) {
                                                                                                         do {
                                                                                                            label3563: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               } else if (var66 <= var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label3563;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += var67 - var63;
                                                                                                                  this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (var66 <= var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                         } while(~var65 > ~var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || ~var62 > -129) {
                                                                                                         do {
                                                                                                            this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(~var72 > -129);
                                                                                                      }
                                                                                                      break label3500;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method3564((byte)-80);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          label3616:
                                                                                          while(true) {
                                                                                             while(~var28.length < ~var74) {
                                                                                                var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var75 >= ~var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         label3687: {
                                                                                                            if (var2) {
                                                                                                               var79 = var28[var78];
                                                                                                            } else if (var28.length <= var78) {
                                                                                                               var79 = var75;
                                                                                                               if (!var2) {
                                                                                                                  break label3687;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var79 = var28[var78];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label3704: {
                                                                                                                  var80 = var28[var78 + 1] << 1;
                                                                                                                  var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                                  var82 = var75;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  } else if (var79 <= var75) {
                                                                                                                     var75 = var79;
                                                                                                                     var10000 = var80;
                                                                                                                     if (!var2) {
                                                                                                                        break label3704;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var83 = var10000;
                                                                                                                     var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                     if (~var84 > -1) {
                                                                                                                        var84 = 0;
                                                                                                                     }

                                                                                                                     if (~var84 < -129) {
                                                                                                                        var84 = 128;
                                                                                                                     }

                                                                                                                     var81 += -var76 + var80;
                                                                                                                     this.field10801[var82] = (byte)var84;
                                                                                                                     ++var82;
                                                                                                                     if (var79 <= var82) {
                                                                                                                        var75 = var79;
                                                                                                                        var10000 = var80;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var76 = var10000;
                                                                                                               var78 += 2;
                                                                                                               if (var28.length <= var78) {
                                                                                                                  var79 = var75;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var79 = var28[var78];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2 || var79 < 128) {
                                                                                                            do {
                                                                                                               var85 = (255 & this.field10801[var79]) + var76;
                                                                                                               if (var85 < 0) {
                                                                                                                  var85 = 0;
                                                                                                               }

                                                                                                               if (~var85 < -129) {
                                                                                                                  var85 = 128;
                                                                                                               }

                                                                                                               this.field10801[var79] = (byte)var85;
                                                                                                               ++var79;
                                                                                                            } while(var79 < 128);
                                                                                                         }

                                                                                                         var86 = null;
                                                                                                         break label3616;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   }

                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var87 > ~var16) {
                                                                                             var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var88 > ~var16) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field3438 != null) {
                                                                                                      var89.field3447 = var3.method3564((byte)-81);
                                                                                                   }

                                                                                                   if (var89.field3451 != null) {
                                                                                                      var89.field3440 = var3.method3564((byte)-73);
                                                                                                   }

                                                                                                   if (~var89.field3441 < -1) {
                                                                                                      var89.field3452 = var3.method3564((byte)-62);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var88 > ~var16);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var90 < var16) {
                                                                                                   var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var91 < var16) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (~var92.field3442 < -1) {
                                                                                                            var92.field3450 = var3.method3564((byte)-89);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(var91 < var16);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field3450 < -1) {
                                                                                                         var94.field3448 = var3.method3564((byte)-48);
                                                                                                      }

                                                                                                      ++var93;
                                                                                                   } while(~var93 > ~var16);

                                                                                                   return;
                                                                                                }

                                                                                                ++var90;
                                                                                             }
                                                                                          }

                                                                                          ++var87;
                                                                                       }
                                                                                    }

                                                                                    var52 += 2;
                                                                                 }
                                                                              }

                                                                              do {
                                                                                 class237 var48 = var20[var47];
                                                                                 if (var48.field3438 != null) {
                                                                                    int var49 = 1;
                                                                                    if (var2) {
                                                                                       var48.field3438[var49] = var3.method3543(-1132613840);
                                                                                       var49 += 2;
                                                                                    }

                                                                                    while(var48.field3438.length > var49) {
                                                                                       var48.field3438[var49] = var3.method3543(-1132613840);
                                                                                       var49 += 2;
                                                                                    }
                                                                                 }

                                                                                 if (var48.field3451 == null) {
                                                                                    ++var47;
                                                                                 } else {
                                                                                    int var50 = 3;
                                                                                    if (var2) {
                                                                                       var48.field3451[var50] = var3.method3543(-1132613840);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    while(~(var48.field3451.length + -2) < ~var50) {
                                                                                       var48.field3451[var50] = var3.method3543(-1132613840);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    ++var47;
                                                                                 }
                                                                              } while(var47 < var16);

                                                                              if (var26 != null) {
                                                                                 var51 = 1;
                                                                                 if (var2 || var51 < var26.length) {
                                                                                    do {
                                                                                       var26[var51] = var3.method3543(-1132613840);
                                                                                       var51 += 2;
                                                                                    } while(var51 < var26.length);
                                                                                 }
                                                                              }

                                                                              if (var28 != null) {
                                                                                 var52 = 1;
                                                                                 if (var2) {
                                                                                    var28[var52] = var3.method3543(-1132613840);
                                                                                    var52 += 2;
                                                                                 }
                                                                              } else {
                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || ~var52 > ~var16) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field3451 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && var53.field3451.length <= var55) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 = var3.method3564((byte)-69) + var54 + 1;
                                                                                                   var53.field3451[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var53.field3451.length > var55);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var52 > ~var16);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && var16 <= var56) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method3564((byte)-63);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label1104:
                                                                                          while(true) {
                                                                                             while(~var61 > ~var26.length) {
                                                                                                var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var65 > ~var26.length) {
                                                                                                         do {
                                                                                                            label1167: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               } else if (var66 <= var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label1167;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += var67 - var63;
                                                                                                                  this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (var66 <= var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                         } while(~var65 > ~var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || ~var62 > -129) {
                                                                                                         do {
                                                                                                            this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(~var72 > -129);
                                                                                                      }
                                                                                                      break label1104;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method3564((byte)-80);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          label1220:
                                                                                          while(true) {
                                                                                             while(~var28.length < ~var74) {
                                                                                                var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var75 >= ~var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         label1291: {
                                                                                                            if (var2) {
                                                                                                               var79 = var28[var78];
                                                                                                            } else if (var28.length <= var78) {
                                                                                                               var79 = var75;
                                                                                                               if (!var2) {
                                                                                                                  break label1291;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var79 = var28[var78];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label1308: {
                                                                                                                  var80 = var28[var78 + 1] << 1;
                                                                                                                  var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                                  var82 = var75;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  } else if (var79 <= var75) {
                                                                                                                     var75 = var79;
                                                                                                                     var10000 = var80;
                                                                                                                     if (!var2) {
                                                                                                                        break label1308;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var83 = var10000;
                                                                                                                     var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                     if (~var84 > -1) {
                                                                                                                        var84 = 0;
                                                                                                                     }

                                                                                                                     if (~var84 < -129) {
                                                                                                                        var84 = 128;
                                                                                                                     }

                                                                                                                     var81 += -var76 + var80;
                                                                                                                     this.field10801[var82] = (byte)var84;
                                                                                                                     ++var82;
                                                                                                                     if (var79 <= var82) {
                                                                                                                        var75 = var79;
                                                                                                                        var10000 = var80;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var76 = var10000;
                                                                                                               var78 += 2;
                                                                                                               if (var28.length <= var78) {
                                                                                                                  var79 = var75;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var79 = var28[var78];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2 || var79 < 128) {
                                                                                                            do {
                                                                                                               var85 = (255 & this.field10801[var79]) + var76;
                                                                                                               if (var85 < 0) {
                                                                                                                  var85 = 0;
                                                                                                               }

                                                                                                               if (~var85 < -129) {
                                                                                                                  var85 = 128;
                                                                                                               }

                                                                                                               this.field10801[var79] = (byte)var85;
                                                                                                               ++var79;
                                                                                                            } while(var79 < 128);
                                                                                                         }

                                                                                                         var86 = null;
                                                                                                         break label1220;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   }

                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var87 > ~var16) {
                                                                                             var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var88 > ~var16) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field3438 != null) {
                                                                                                      var89.field3447 = var3.method3564((byte)-81);
                                                                                                   }

                                                                                                   if (var89.field3451 != null) {
                                                                                                      var89.field3440 = var3.method3564((byte)-73);
                                                                                                   }

                                                                                                   if (~var89.field3441 < -1) {
                                                                                                      var89.field3452 = var3.method3564((byte)-62);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var88 > ~var16);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var90 < var16) {
                                                                                                   var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var91 < var16) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (~var92.field3442 < -1) {
                                                                                                            var92.field3450 = var3.method3564((byte)-89);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(var91 < var16);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field3450 < -1) {
                                                                                                         var94.field3448 = var3.method3564((byte)-48);
                                                                                                      }

                                                                                                      ++var93;
                                                                                                   } while(~var93 > ~var16);

                                                                                                   return;
                                                                                                }

                                                                                                ++var90;
                                                                                             }
                                                                                          }

                                                                                          ++var87;
                                                                                       }
                                                                                    }

                                                                                    do {
                                                                                       var57 = var20[var56];
                                                                                       if (var57.field3438 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                             var57.field3438[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var57.field3438.length < ~var59) {
                                                                                             var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                             var57.field3438[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(var16 > var56);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method3564((byte)-63);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label1551:
                                                                                       while(true) {
                                                                                          while(~var61 > ~var26.length) {
                                                                                             var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var62 > var64) {
                                                                                                   this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var65 > ~var26.length) {
                                                                                                      do {
                                                                                                         label1614: {
                                                                                                            var66 = var26[var65];
                                                                                                            var67 = var26[var65 + 1];
                                                                                                            var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                            } else if (var66 <= var62) {
                                                                                                               var63 = var67;
                                                                                                               var65 += 2;
                                                                                                               var10000 = var66;
                                                                                                               if (!var2) {
                                                                                                                  break label1614;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               var68 += var67 - var63;
                                                                                                               this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                               ++var69;
                                                                                                               if (var66 <= var69) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var62 = var10000;
                                                                                                      } while(~var65 > ~var26.length);
                                                                                                   }

                                                                                                   var71 = null;
                                                                                                   var72 = var62;
                                                                                                   if (var2 || ~var62 > -129) {
                                                                                                      do {
                                                                                                         this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                         ++var72;
                                                                                                      } while(~var72 > -129);
                                                                                                   }
                                                                                                   break label1551;
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var73 = var3.method3564((byte)-80);
                                                                                       var28[0] = (byte)var73;
                                                                                       var74 = 2;
                                                                                       if (var2) {
                                                                                          var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                          var28[var74] = (byte)var73;
                                                                                          var74 += 2;
                                                                                       }

                                                                                       label1667:
                                                                                       while(true) {
                                                                                          while(~var28.length < ~var74) {
                                                                                             var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          var75 = var28[0];
                                                                                          var76 = var28[1] << 1;
                                                                                          var77 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                var78 = (255 & this.field10801[var77]) + var76;
                                                                                                if (var78 < 0) {
                                                                                                   var78 = 0;
                                                                                                }

                                                                                                if (~var78 < -129) {
                                                                                                   var78 = 128;
                                                                                                }

                                                                                                this.field10801[var77] = (byte)var78;
                                                                                                ++var77;
                                                                                             }

                                                                                             while(true) {
                                                                                                if (~var75 >= ~var77) {
                                                                                                   var78 = 2;
                                                                                                   if (!var2) {
                                                                                                      label1738: {
                                                                                                         if (var2) {
                                                                                                            var79 = var28[var78];
                                                                                                         } else if (var28.length <= var78) {
                                                                                                            var79 = var75;
                                                                                                            if (!var2) {
                                                                                                               break label1738;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var79 = var28[var78];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label1755: {
                                                                                                               var80 = var28[var78 + 1] << 1;
                                                                                                               var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                               var82 = var75;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                               } else if (var79 <= var75) {
                                                                                                                  var75 = var79;
                                                                                                                  var10000 = var80;
                                                                                                                  if (!var2) {
                                                                                                                     break label1755;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var83 = var10000;
                                                                                                                  var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                  if (~var84 > -1) {
                                                                                                                     var84 = 0;
                                                                                                                  }

                                                                                                                  if (~var84 < -129) {
                                                                                                                     var84 = 128;
                                                                                                                  }

                                                                                                                  var81 += -var76 + var80;
                                                                                                                  this.field10801[var82] = (byte)var84;
                                                                                                                  ++var82;
                                                                                                                  if (var79 <= var82) {
                                                                                                                     var75 = var79;
                                                                                                                     var10000 = var80;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var76 = var10000;
                                                                                                            var78 += 2;
                                                                                                            if (var28.length <= var78) {
                                                                                                               var79 = var75;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var79 = var28[var78];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2 || var79 < 128) {
                                                                                                         do {
                                                                                                            var85 = (255 & this.field10801[var79]) + var76;
                                                                                                            if (var85 < 0) {
                                                                                                               var85 = 0;
                                                                                                            }

                                                                                                            if (~var85 < -129) {
                                                                                                               var85 = 128;
                                                                                                            }

                                                                                                            this.field10801[var79] = (byte)var85;
                                                                                                            ++var79;
                                                                                                         } while(var79 < 128);
                                                                                                      }

                                                                                                      var86 = null;
                                                                                                      break label1667;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = (255 & this.field10801[var77]) + var76;
                                                                                                }

                                                                                                if (var78 < 0) {
                                                                                                   var78 = 0;
                                                                                                }

                                                                                                if (~var78 < -129) {
                                                                                                   var78 = 128;
                                                                                                }

                                                                                                this.field10801[var77] = (byte)var78;
                                                                                                ++var77;
                                                                                             }
                                                                                          }

                                                                                          var74 += 2;
                                                                                       }
                                                                                    }

                                                                                    var87 = 0;
                                                                                    if (var2) {
                                                                                       var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                       ++var87;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(~var87 > ~var16) {
                                                                                          var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                          ++var87;
                                                                                       }

                                                                                       var88 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || ~var88 > ~var16) {
                                                                                             do {
                                                                                                var89 = var20[var88];
                                                                                                if (var89.field3438 != null) {
                                                                                                   var89.field3447 = var3.method3564((byte)-81);
                                                                                                }

                                                                                                if (var89.field3451 != null) {
                                                                                                   var89.field3440 = var3.method3564((byte)-73);
                                                                                                }

                                                                                                if (~var89.field3441 < -1) {
                                                                                                   var89.field3452 = var3.method3564((byte)-62);
                                                                                                }

                                                                                                ++var88;
                                                                                             } while(~var88 > ~var16);
                                                                                          }

                                                                                          var90 = 0;
                                                                                          if (var2) {
                                                                                             var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                             ++var90;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var90 < var16) {
                                                                                                var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                ++var90;
                                                                                             }

                                                                                             var91 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || var91 < var16) {
                                                                                                   do {
                                                                                                      var92 = var20[var91];
                                                                                                      if (~var92.field3442 < -1) {
                                                                                                         var92.field3450 = var3.method3564((byte)-89);
                                                                                                      }

                                                                                                      ++var91;
                                                                                                   } while(var91 < var16);
                                                                                                }

                                                                                                var93 = 0;
                                                                                                if (!var2 && ~var93 <= ~var16) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var94 = var20[var93];
                                                                                                   if (~var94.field3450 < -1) {
                                                                                                      var94.field3448 = var3.method3564((byte)-48);
                                                                                                   }

                                                                                                   ++var93;
                                                                                                } while(~var93 > ~var16);

                                                                                                return;
                                                                                             }

                                                                                             ++var90;
                                                                                          }
                                                                                       }

                                                                                       ++var87;
                                                                                    }
                                                                                 }

                                                                                 var52 += 2;
                                                                              }

                                                                              while(true) {
                                                                                 while(~var52 > ~var28.length) {
                                                                                    var28[var52] = var3.method3543(-1132613840);
                                                                                    var52 += 2;
                                                                                 }

                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || ~var52 > ~var16) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field3451 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && var53.field3451.length <= var55) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 = var3.method3564((byte)-69) + var54 + 1;
                                                                                                   var53.field3451[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var53.field3451.length > var55);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var52 > ~var16);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && var16 <= var56) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method3564((byte)-63);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label595:
                                                                                          while(true) {
                                                                                             while(~var61 > ~var26.length) {
                                                                                                var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var65 > ~var26.length) {
                                                                                                         do {
                                                                                                            label658: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               } else if (var66 <= var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label658;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += var67 - var63;
                                                                                                                  this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (var66 <= var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                         } while(~var65 > ~var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || ~var62 > -129) {
                                                                                                         do {
                                                                                                            this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(~var72 > -129);
                                                                                                      }
                                                                                                      break label595;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method3564((byte)-80);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          label711:
                                                                                          while(true) {
                                                                                             while(~var28.length < ~var74) {
                                                                                                var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var75 >= ~var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         label782: {
                                                                                                            if (var2) {
                                                                                                               var79 = var28[var78];
                                                                                                            } else if (var28.length <= var78) {
                                                                                                               var79 = var75;
                                                                                                               if (!var2) {
                                                                                                                  break label782;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var79 = var28[var78];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label799: {
                                                                                                                  var80 = var28[var78 + 1] << 1;
                                                                                                                  var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                                  var82 = var75;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  } else if (var79 <= var75) {
                                                                                                                     var75 = var79;
                                                                                                                     var10000 = var80;
                                                                                                                     if (!var2) {
                                                                                                                        break label799;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var83 = var10000;
                                                                                                                     var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                     if (~var84 > -1) {
                                                                                                                        var84 = 0;
                                                                                                                     }

                                                                                                                     if (~var84 < -129) {
                                                                                                                        var84 = 128;
                                                                                                                     }

                                                                                                                     var81 += -var76 + var80;
                                                                                                                     this.field10801[var82] = (byte)var84;
                                                                                                                     ++var82;
                                                                                                                     if (var79 <= var82) {
                                                                                                                        var75 = var79;
                                                                                                                        var10000 = var80;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var76 = var10000;
                                                                                                               var78 += 2;
                                                                                                               if (var28.length <= var78) {
                                                                                                                  var79 = var75;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var79 = var28[var78];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2 || var79 < 128) {
                                                                                                            do {
                                                                                                               var85 = (255 & this.field10801[var79]) + var76;
                                                                                                               if (var85 < 0) {
                                                                                                                  var85 = 0;
                                                                                                               }

                                                                                                               if (~var85 < -129) {
                                                                                                                  var85 = 128;
                                                                                                               }

                                                                                                               this.field10801[var79] = (byte)var85;
                                                                                                               ++var79;
                                                                                                            } while(var79 < 128);
                                                                                                         }

                                                                                                         var86 = null;
                                                                                                         break label711;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (255 & this.field10801[var77]) + var76;
                                                                                                   }

                                                                                                   if (var78 < 0) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (~var78 < -129) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field10801[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                }
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var87 > ~var16) {
                                                                                             var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var88 > ~var16) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field3438 != null) {
                                                                                                      var89.field3447 = var3.method3564((byte)-81);
                                                                                                   }

                                                                                                   if (var89.field3451 != null) {
                                                                                                      var89.field3440 = var3.method3564((byte)-73);
                                                                                                   }

                                                                                                   if (~var89.field3441 < -1) {
                                                                                                      var89.field3452 = var3.method3564((byte)-62);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var88 > ~var16);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var90 < var16) {
                                                                                                   var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var91 < var16) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (~var92.field3442 < -1) {
                                                                                                            var92.field3450 = var3.method3564((byte)-89);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(var91 < var16);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field3450 < -1) {
                                                                                                         var94.field3448 = var3.method3564((byte)-48);
                                                                                                      }

                                                                                                      ++var93;
                                                                                                   } while(~var93 > ~var16);

                                                                                                   return;
                                                                                                }

                                                                                                ++var90;
                                                                                             }
                                                                                          }

                                                                                          ++var87;
                                                                                       }
                                                                                    }

                                                                                    do {
                                                                                       var57 = var20[var56];
                                                                                       if (var57.field3438 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                             var57.field3438[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var57.field3438.length < ~var59) {
                                                                                             var58 = var3.method3564((byte)-89) + var58 - -1;
                                                                                             var57.field3438[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(var16 > var56);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method3564((byte)-63);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label545:
                                                                                       while(true) {
                                                                                          while(~var61 > ~var26.length) {
                                                                                             var60 = var3.method3564((byte)-117) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var62 > var64) {
                                                                                                   this.field10799[var64] = (byte)(this.field10799[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var65 > ~var26.length) {
                                                                                                      do {
                                                                                                         label503: {
                                                                                                            var66 = var26[var65];
                                                                                                            var67 = var26[var65 + 1];
                                                                                                            var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                            } else if (var66 <= var62) {
                                                                                                               var63 = var67;
                                                                                                               var65 += 2;
                                                                                                               var10000 = var66;
                                                                                                               if (!var2) {
                                                                                                                  break label503;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               var68 += var67 - var63;
                                                                                                               this.field10799[var69] = (byte)(this.field10799[var69] * var70 + 32 >> 6);
                                                                                                               ++var69;
                                                                                                               if (var66 <= var69) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var62 + var66, var68, true);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var62 = var10000;
                                                                                                      } while(~var65 > ~var26.length);
                                                                                                   }

                                                                                                   var71 = null;
                                                                                                   var72 = var62;
                                                                                                   if (var2 || ~var62 > -129) {
                                                                                                      do {
                                                                                                         this.field10799[var72] = (byte)(this.field10799[var72] * var63 + 32 >> 6);
                                                                                                         ++var72;
                                                                                                      } while(~var72 > -129);
                                                                                                   }
                                                                                                   break label545;
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var73 = var3.method3564((byte)-80);
                                                                                       var28[0] = (byte)var73;
                                                                                       var74 = 2;
                                                                                       if (var2) {
                                                                                          var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                          var28[var74] = (byte)var73;
                                                                                          var74 += 2;
                                                                                       }

                                                                                       label447:
                                                                                       while(true) {
                                                                                          while(~var28.length < ~var74) {
                                                                                             var73 = var73 - -1 + var3.method3564((byte)-85);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          var75 = var28[0];
                                                                                          var76 = var28[1] << 1;
                                                                                          var77 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                var78 = (255 & this.field10801[var77]) + var76;
                                                                                                if (var78 < 0) {
                                                                                                   var78 = 0;
                                                                                                }

                                                                                                if (~var78 < -129) {
                                                                                                   var78 = 128;
                                                                                                }

                                                                                                this.field10801[var77] = (byte)var78;
                                                                                                ++var77;
                                                                                             }

                                                                                             while(true) {
                                                                                                if (~var75 >= ~var77) {
                                                                                                   var78 = 2;
                                                                                                   if (!var2) {
                                                                                                      label403: {
                                                                                                         if (var2) {
                                                                                                            var79 = var28[var78];
                                                                                                         } else if (var28.length <= var78) {
                                                                                                            var79 = var75;
                                                                                                            if (!var2) {
                                                                                                               break label403;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var79 = var28[var78];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label400: {
                                                                                                               var80 = var28[var78 + 1] << 1;
                                                                                                               var81 = (-var75 + var79) / 2 + (-var75 + var79) * var76;
                                                                                                               var82 = var75;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                               } else if (var79 <= var75) {
                                                                                                                  var75 = var79;
                                                                                                                  var10000 = var80;
                                                                                                                  if (!var2) {
                                                                                                                     break label400;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var83 = var10000;
                                                                                                                  var84 = (this.field10801[var82] & 255) - -var83;
                                                                                                                  if (~var84 > -1) {
                                                                                                                     var84 = 0;
                                                                                                                  }

                                                                                                                  if (~var84 < -129) {
                                                                                                                     var84 = 128;
                                                                                                                  }

                                                                                                                  var81 += -var76 + var80;
                                                                                                                  this.field10801[var82] = (byte)var84;
                                                                                                                  ++var82;
                                                                                                                  if (var79 <= var82) {
                                                                                                                     var75 = var79;
                                                                                                                     var10000 = var80;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class538.method4032(-var75 + var79, var81, true);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var76 = var10000;
                                                                                                            var78 += 2;
                                                                                                            if (var28.length <= var78) {
                                                                                                               var79 = var75;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var79 = var28[var78];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2 || var79 < 128) {
                                                                                                         do {
                                                                                                            var85 = (255 & this.field10801[var79]) + var76;
                                                                                                            if (var85 < 0) {
                                                                                                               var85 = 0;
                                                                                                            }

                                                                                                            if (~var85 < -129) {
                                                                                                               var85 = 128;
                                                                                                            }

                                                                                                            this.field10801[var79] = (byte)var85;
                                                                                                            ++var79;
                                                                                                         } while(var79 < 128);
                                                                                                      }

                                                                                                      var86 = null;
                                                                                                      break label447;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = (255 & this.field10801[var77]) + var76;
                                                                                                }

                                                                                                if (var78 < 0) {
                                                                                                   var78 = 0;
                                                                                                }

                                                                                                if (~var78 < -129) {
                                                                                                   var78 = 128;
                                                                                                }

                                                                                                this.field10801[var77] = (byte)var78;
                                                                                                ++var77;
                                                                                             }
                                                                                          }

                                                                                          var74 += 2;
                                                                                       }
                                                                                    }

                                                                                    var87 = 0;
                                                                                    if (var2) {
                                                                                       var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                       ++var87;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(~var87 > ~var16) {
                                                                                          var20[var87].field3441 = var3.method3564((byte)-106);
                                                                                          ++var87;
                                                                                       }

                                                                                       var88 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || ~var88 > ~var16) {
                                                                                             do {
                                                                                                var89 = var20[var88];
                                                                                                if (var89.field3438 != null) {
                                                                                                   var89.field3447 = var3.method3564((byte)-81);
                                                                                                }

                                                                                                if (var89.field3451 != null) {
                                                                                                   var89.field3440 = var3.method3564((byte)-73);
                                                                                                }

                                                                                                if (~var89.field3441 < -1) {
                                                                                                   var89.field3452 = var3.method3564((byte)-62);
                                                                                                }

                                                                                                ++var88;
                                                                                             } while(~var88 > ~var16);
                                                                                          }

                                                                                          var90 = 0;
                                                                                          if (var2) {
                                                                                             var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                             ++var90;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var90 < var16) {
                                                                                                var20[var90].field3442 = var3.method3564((byte)-104);
                                                                                                ++var90;
                                                                                             }

                                                                                             var91 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || var91 < var16) {
                                                                                                   do {
                                                                                                      var92 = var20[var91];
                                                                                                      if (~var92.field3442 < -1) {
                                                                                                         var92.field3450 = var3.method3564((byte)-89);
                                                                                                      }

                                                                                                      ++var91;
                                                                                                   } while(var91 < var16);
                                                                                                }

                                                                                                var93 = 0;
                                                                                                if (!var2 && ~var93 <= ~var16) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var94 = var20[var93];
                                                                                                   if (~var94.field3450 < -1) {
                                                                                                      var94.field3448 = var3.method3564((byte)-48);
                                                                                                   }

                                                                                                   ++var93;
                                                                                                } while(~var93 > ~var16);

                                                                                                return;
                                                                                             }

                                                                                             ++var90;
                                                                                          }
                                                                                       }

                                                                                       ++var87;
                                                                                    }
                                                                                 }

                                                                                 var52 += 2;
                                                                              }
                                                                           }

                                                                           ++var46;
                                                                        }
                                                                     }
                                                                  } else if (this.field10800[var44] != 0) {
                                                                     if (var35 == 0) {
                                                                        label3940: {
                                                                           var43 = var20[var15[var36]];
                                                                           if (var13.length <= var36) {
                                                                              var35 = -1;
                                                                              if (!var2) {
                                                                                 break label3940;
                                                                              }
                                                                           }

                                                                           var35 = var13[var36++];
                                                                        }
                                                                     }

                                                                     --var35;
                                                                     this.field10796[var44] = var43;
                                                                  }

                                                                  ++var44;
                                                               }
                                                            }

                                                            ++var42;
                                                         }
                                                      }

                                                      ++var40;
                                                   }
                                                }

                                                ++var38;
                                             }
                                          }

                                          ++var34;
                                       }
                                    }

                                    ++var33;
                                 }
                              }

                              ++var31;
                           }
                        }

                        ++var14;
                     }
                  }

                  ++var10;
               }
            }

            ++var6;
         }
      } catch (RuntimeException var96) {
         throw class608.method4462(var96, field10811[7] + (arg0 != null ? field10811[3] : field10811[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5435(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5436(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
