import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class402 extends class673 {
   @OriginalMember(
      owner = "client!ra",
      name = "l",
      descriptor = "[I"
   )
   private int[] field5515;
   @OriginalMember(
      owner = "client!ra",
      name = "A",
      descriptor = "[S"
   )
   public short[] field5521;
   @OriginalMember(
      owner = "client!ra",
      name = "v",
      descriptor = "[B"
   )
   public byte[] field5514;
   @OriginalMember(
      owner = "client!ra",
      name = "x",
      descriptor = "[B"
   )
   public byte[] field5517;
   @OriginalMember(
      owner = "client!ra",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field5527;
   @OriginalMember(
      owner = "client!ra",
      name = "s",
      descriptor = "[Lwd;"
   )
   public class180[] field5520;
   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "[Lgb;"
   )
   public class521[] field5526;
   @OriginalMember(
      owner = "client!ra",
      name = "o",
      descriptor = "I"
   )
   public int field5529;
   @OriginalMember(
      owner = "client!ra",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5530 = new String[]{method3158(method3157("\u007f>`[\u001c")), method3158(method3157("vq`6I")), method3158(method3157("je\"\u0019")), method3158(method3157("vq`1I")), method3158(method3157("vq`4I")), method3158(method3157("vq`0I")), method3158(method3157(")=pU")), method3158(method3157("vq`7I")), method3158(method3157("vq`I\bjy:KI"))};
   @OriginalMember(
      owner = "client!ra",
      name = "u",
      descriptor = "I"
   )
   public static int field5525 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "t",
      descriptor = "Log;"
   )
   public static class516 field5516 = new class516();
   @OriginalMember(
      owner = "client!ra",
      name = "w",
      descriptor = "Z"
   )
   public static volatile boolean field5528 = true;
   @OriginalMember(
      owner = "client!ra",
      name = "r",
      descriptor = "I"
   )
   public static int field5518;
   @OriginalMember(
      owner = "client!ra",
      name = "m",
      descriptor = "I"
   )
   public static int field5519;
   @OriginalMember(
      owner = "client!ra",
      name = "q",
      descriptor = "I"
   )
   public static int field5523;
   @OriginalMember(
      owner = "client!ra",
      name = "y",
      descriptor = "I"
   )
   public static int field5524;
   @OriginalMember(
      owner = "client!ra",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field5522;

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3152(boolean arg0) {
      try {
         field5522 = null;
         if (arg0) {
            field5516 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5530[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(IIIIII)I"
   )
   public static final int method3153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field5518;
         if (arg2 != -32293) {
            field5528 = false;
         }

         if (class659.field9815 == null) {
            return 0;
         } else {
            if (arg1 < 3) {
               int var6 = arg0 >> 9;
               int var7 = arg3 >> 9;
               if (arg5 < 0 || ~arg4 > -1 || class273.field3491 + -1 < arg5 || arg4 > class211.field2689 - 1) {
                  return 0;
               }

               if (var6 < 1 || ~var7 > -2 || ~var6 < ~(class273.field3491 - 1) || ~(class211.field2689 + -1) > ~var7) {
                  return 0;
               }

               boolean var8 = (2 & class245.field3092[1][arg0 >> 9][arg3 >> 9]) != 0;
               if (~(arg0 & 511) == -1) {
                  boolean var9 = (class245.field3092[1][var6 - 1][arg3 >> 9] & 2) != 0;
                  boolean var10 = ~(2 & class245.field3092[1][var6][arg3 >> 9]) != -1;
                  if (var9 != var10) {
                     var8 = (class245.field3092[1][arg5][arg4] & 2) != 0;
                  }
               }

               if (~(511 & arg3) == -1) {
                  boolean var11 = ~(2 & class245.field3092[1][arg0 >> 9][var7 + -1]) != -1;
                  boolean var12 = (2 & class245.field3092[1][arg0 >> 9][var7]) != 0;
                  if (!var11 == var12) {
                     var8 = (class245.field3092[1][arg5][arg4] & 2) != 0;
                  }
               }

               if (var8) {
                  ++arg1;
               }
            }

            return class659.field9815[arg1].method3288(arg0, (byte)121, arg3);
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field5530[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Lwl;[I[BB)Z"
   )
   public final boolean method3154(class149 arg0, int[] arg1, byte[] arg2, byte arg3) {
      boolean var5 = client.field1481;

      try {
         ++field5523;
         byte var6 = 1;
         int var7 = 0;
         class521 var8 = null;
         if (arg3 >= -114) {
            return true;
         } else {
            int var9 = 0;

            while(true) {
               label73: {
                  int var10000;
                  if (~var9 <= -129) {
                     var10000 = var6;
                     if (!var5) {
                        return (boolean)var6;
                     }
                  } else {
                     if (arg2 != null && ~arg2[var9] == -1) {
                        break label73;
                     }

                     var10000 = this.field5515[var9];
                  }

                  int var10 = var10000;
                  if (var10 != 0) {
                     if (var7 != var10) {
                        label62: {
                           var7 = var10--;
                           if ((1 & var10) != 0) {
                              var8 = arg0.method1196(0, arg1, var10 >> 2);
                              if (!var5) {
                                 break label62;
                              }
                           }

                           var8 = arg0.method1200(-8046, arg1, var10 >> 2);
                        }

                        if (var8 == null) {
                           var6 = 0;
                        }
                     }

                     if (var8 != null) {
                        this.field5526[var9] = var8;
                        this.field5515[var9] = 0;
                     }
                  }
               }

               ++var9;
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field5530[1] + (arg0 != null ? field5530[0] : field5530[2]) + ',' + (arg1 != null ? field5530[0] : field5530[2]) + ',' + (arg2 != null ? field5530[0] : field5530[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3155(int arg0) {
      try {
         ++field5524;
         this.field5515 = null;
         if (arg0 != -1) {
            method3152(true);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5530[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method3156(boolean arg0, int arg1) {
      try {
         ++field5519;
         if (arg1 != -7129) {
            field5528 = false;
         }

         if (~class198.field2525.length() != -1) {
            class586.method4369(field5530[6] + class198.field2525, 86);
            class192.method1596(false, arg0, class198.field2525, true);
            class235.field2955 = 0;
            if (!arg0) {
               class433.field5908 = 0;
               class198.field2525 = "";
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5530[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "<init>",
      descriptor = "()V"
   )
   public class402() {
   }

   @OriginalMember(
      owner = "client!ra",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class402(byte[] arg0) {
      boolean var2 = client.field1481;
      super();

      try {
         this.field5515 = new int[128];
         this.field5521 = new short[128];
         this.field5514 = new byte[128];
         this.field5517 = new byte[128];
         this.field5527 = new byte[128];
         this.field5520 = new class180[128];
         this.field5526 = new class521[128];
         class66 var3 = new class66(arg0);
         int var4 = 0;
         if (var2) {
            ++var4;
         }

         while(~var3.field859[var3.field864 - -var4] != -1) {
            ++var4;
         }

         byte[] var5 = new byte[var4];
         int var6 = 0;
         if (var2) {
            var5[var6] = var3.method628((byte)-12);
            ++var6;
         }

         while(true) {
            while(~var6 > ~var4) {
               var5[var6] = var3.method628((byte)-12);
               ++var6;
            }

            ++var4;
            ++var3.field864;
            int var7 = var3.field864;
            var3.field864 += var4;
            int var8 = 0;
            if (!var2) {
               if (var2) {
                  ++var8;
               }

               while(~var3.field859[var3.field864 + var8] != -1) {
                  ++var8;
               }

               byte[] var9 = new byte[var8];
               int var10 = 0;
               if (var2) {
                  var9[var10] = var3.method628((byte)-12);
                  ++var10;
               }

               while(true) {
                  while(~var8 < ~var10) {
                     var9[var10] = var3.method628((byte)-12);
                     ++var10;
                  }

                  ++var8;
                  ++var3.field864;
                  int var11 = var3.field864;
                  var3.field864 += var8;
                  int var12 = 0;
                  if (!var2) {
                     if (var2) {
                        ++var12;
                     }

                     while(~var3.field859[var3.field864 + var12] != -1) {
                        ++var12;
                     }

                     byte[] var13 = new byte[var12];
                     int var14 = 0;
                     if (var2) {
                        var13[var14] = var3.method628((byte)-12);
                        ++var14;
                     }

                     while(true) {
                        while(~var14 > ~var12) {
                           var13[var14] = var3.method628((byte)-12);
                           ++var14;
                        }

                        ++var3.field864;
                        ++var12;
                        byte[] var15 = new byte[var12];
                        if (!var2) {
                           int var17;
                           label4340: {
                              if (~var12 < -2) {
                                 var15[1] = 1;
                                 int var16 = 1;
                                 var17 = 2;
                                 int var18 = 2;
                                 if (var2 || ~var18 > ~var12) {
                                    do {
                                       int var19 = var3.method640(255);
                                       if (~var19 != -1) {
                                          if (~var19 >= ~var16) {
                                             --var19;
                                          }

                                          var16 = var19;
                                          if (var2) {
                                             var16 = var17++;
                                          }
                                       } else {
                                          var16 = var17++;
                                       }

                                       var15[var18] = (byte)var16;
                                       ++var18;
                                    } while(~var18 > ~var12);
                                 }

                                 if (!var2) {
                                    break label4340;
                                 }
                              }

                              var17 = var12;
                           }

                           class180[] var20 = new class180[var17];
                           int var21 = 0;
                           class180 var22;
                           int var23;
                           int var24;
                           if (var2) {
                              var22 = var20[var21] = new class180();
                              var23 = var3.method640(255);
                              if (~var23 < -1) {
                                 var22.field2291 = new byte[var23 * 2];
                              }

                              var24 = var3.method640(255);
                              if (var24 > 0) {
                                 var22.field2293 = new byte[var24 * 2 + 2];
                                 var22.field2293[1] = 64;
                              }

                              ++var21;
                           }

                           while(~var21 > ~var20.length) {
                              var22 = var20[var21] = new class180();
                              var23 = var3.method640(255);
                              if (~var23 < -1) {
                                 var22.field2291 = new byte[var23 * 2];
                              }

                              var24 = var3.method640(255);
                              if (var24 > 0) {
                                 var22.field2293 = new byte[var24 * 2 + 2];
                                 var22.field2293[1] = 64;
                              }

                              ++var21;
                           }

                           int var25 = var3.method640(255);
                           byte[] var26 = var25 > 0 ? new byte[var25 * 2] : null;
                           int var27 = var3.method640(255);
                           byte[] var28 = ~var27 < -1 ? new byte[var27 * 2] : null;
                           int var29 = 0;
                           if (var2) {
                              ++var29;
                           }

                           while(~var3.field859[var3.field864 + var29] != -1) {
                              ++var29;
                           }

                           byte[] var30 = new byte[var29];
                           int var31 = 0;
                           if (var2) {
                              var30[var31] = var3.method628((byte)-12);
                              ++var31;
                           }

                           while(true) {
                              while(~var31 > ~var29) {
                                 var30[var31] = var3.method628((byte)-12);
                                 ++var31;
                              }

                              ++var29;
                              ++var3.field864;
                              int var32 = 0;
                              int var33 = 0;
                              if (!var2) {
                                 if (var2) {
                                    var32 += var3.method640(255);
                                    this.field5521[var33] = (short)var32;
                                    ++var33;
                                 }

                                 while(true) {
                                    while(var33 < 128) {
                                       var32 += var3.method640(255);
                                       this.field5521[var33] = (short)var32;
                                       ++var33;
                                    }

                                    var32 = 0;
                                    int var34 = 0;
                                    if (!var2) {
                                       if (var2) {
                                          var32 += var3.method640(255);
                                          this.field5521[var34] = (short)(this.field5521[var34] + (var32 << 8));
                                          ++var34;
                                       }

                                       while(true) {
                                          while(var34 < 128) {
                                             var32 += var3.method640(255);
                                             this.field5521[var34] = (short)(this.field5521[var34] + (var32 << 8));
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

                                                   var37 = var3.method616((byte)-96);
                                                }

                                                this.field5521[var38] = (short)(this.field5521[var38] + class109.method974(var37 + -1 << 14, 32768));
                                                --var35;
                                                this.field5515[var38] = var37;
                                                ++var38;
                                             }

                                             while(true) {
                                                while(~var38 > -129) {
                                                   if (~var35 == -1) {
                                                      if (var30.length > var36) {
                                                         var35 = var30[var36++];
                                                         if (var2) {
                                                            var35 = -1;
                                                         }
                                                      } else {
                                                         var35 = -1;
                                                      }

                                                      var37 = var3.method616((byte)-96);
                                                   }

                                                   this.field5521[var38] = (short)(this.field5521[var38] + class109.method974(var37 + -1 << 14, 32768));
                                                   --var35;
                                                   this.field5515[var38] = var37;
                                                   ++var38;
                                                }

                                                var35 = 0;
                                                var36 = 0;
                                                int var39 = 0;
                                                int var40 = 0;
                                                if (!var2) {
                                                   if (var2) {
                                                      if (this.field5515[var40] != 0) {
                                                         if (var35 == 0) {
                                                            if (~var36 > ~var5.length) {
                                                               var35 = var5[var36++];
                                                               if (var2) {
                                                                  var35 = -1;
                                                               }
                                                            } else {
                                                               var35 = -1;
                                                            }

                                                            var39 = var3.field859[var7++] + -1;
                                                         }

                                                         this.field5527[var40] = (byte)var39;
                                                         --var35;
                                                      }

                                                      ++var40;
                                                   }

                                                   while(true) {
                                                      while(var40 < 128) {
                                                         if (this.field5515[var40] != 0) {
                                                            if (var35 == 0) {
                                                               if (~var36 > ~var5.length) {
                                                                  var35 = var5[var36++];
                                                                  if (var2) {
                                                                     var35 = -1;
                                                                  }
                                                               } else {
                                                                  var35 = -1;
                                                               }

                                                               var39 = var3.field859[var7++] + -1;
                                                            }

                                                            this.field5527[var40] = (byte)var39;
                                                            --var35;
                                                         }

                                                         ++var40;
                                                      }

                                                      var35 = 0;
                                                      var36 = 0;
                                                      int var41 = 0;
                                                      int var42 = 0;
                                                      if (!var2) {
                                                         if (var2) {
                                                            if (~this.field5515[var42] != -1) {
                                                               if (~var35 == -1) {
                                                                  var41 = 16 + var3.field859[var11++] << 2;
                                                                  if (var9.length <= var36) {
                                                                     var35 = -1;
                                                                     if (var2) {
                                                                        var35 = var9[var36++];
                                                                     }
                                                                  } else {
                                                                     var35 = var9[var36++];
                                                                  }
                                                               }

                                                               this.field5517[var42] = (byte)var41;
                                                               --var35;
                                                               ++var42;
                                                            } else {
                                                               ++var42;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(var42 < 128) {
                                                               if (~this.field5515[var42] != -1) {
                                                                  if (~var35 == -1) {
                                                                     var41 = 16 + var3.field859[var11++] << 2;
                                                                     if (var9.length <= var36) {
                                                                        var35 = -1;
                                                                        if (var2) {
                                                                           var35 = var9[var36++];
                                                                        }
                                                                     } else {
                                                                        var35 = var9[var36++];
                                                                     }
                                                                  }

                                                                  this.field5517[var42] = (byte)var41;
                                                                  --var35;
                                                                  ++var42;
                                                               } else {
                                                                  ++var42;
                                                               }
                                                            }

                                                            var36 = 0;
                                                            var35 = 0;
                                                            class180 var43 = null;
                                                            int var44 = 0;
                                                            if (!var2) {
                                                               while(true) {
                                                                  if (~var44 <= -129) {
                                                                     var35 = 0;
                                                                     var36 = 0;
                                                                     int var45 = 0;
                                                                     int var46 = 0;
                                                                     if (!var2) {
                                                                        if (var2) {
                                                                           if (var35 == 0) {
                                                                              if (var36 >= var30.length) {
                                                                                 var35 = -1;
                                                                                 if (var2) {
                                                                                    var35 = var30[var36++];
                                                                                 }
                                                                              } else {
                                                                                 var35 = var30[var36++];
                                                                              }

                                                                              if (this.field5515[var46] > 0) {
                                                                                 var45 = 1 + var3.method640(255);
                                                                              }
                                                                           }

                                                                           --var35;
                                                                           this.field5514[var46] = (byte)var45;
                                                                           ++var46;
                                                                        }

                                                                        while(true) {
                                                                           while(var46 < 128) {
                                                                              if (var35 == 0) {
                                                                                 if (var36 >= var30.length) {
                                                                                    var35 = -1;
                                                                                    if (var2) {
                                                                                       var35 = var30[var36++];
                                                                                    }
                                                                                 } else {
                                                                                    var35 = var30[var36++];
                                                                                 }

                                                                                 if (this.field5515[var46] > 0) {
                                                                                    var45 = 1 + var3.method640(255);
                                                                                 }
                                                                              }

                                                                              --var35;
                                                                              this.field5514[var46] = (byte)var45;
                                                                              ++var46;
                                                                           }

                                                                           this.field5529 = var3.method640(255) - -1;
                                                                           int var47 = 0;
                                                                           if (!var2) {
                                                                              int var10000;
                                                                              int var51;
                                                                              int var52;
                                                                              class180 var53;
                                                                              int var54;
                                                                              int var55;
                                                                              int var56;
                                                                              class180 var57;
                                                                              int var58;
                                                                              int var59;
                                                                              int var60;
                                                                              int var61;
                                                                              int var62;
                                                                              byte var63;
                                                                              int var64;
                                                                              int var65;
                                                                              int var66;
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
                                                                              Object var85;
                                                                              int var86;
                                                                              int var87;
                                                                              class180 var88;
                                                                              int var89;
                                                                              int var90;
                                                                              class180 var91;
                                                                              int var92;
                                                                              class180 var93;
                                                                              if (!var2 && ~var17 >= ~var47) {
                                                                                 if (var26 != null) {
                                                                                    var51 = 1;
                                                                                    if (var2) {
                                                                                       var26[var51] = var3.method628((byte)-12);
                                                                                       var51 += 2;
                                                                                    }

                                                                                    while(~var26.length < ~var51) {
                                                                                       var26[var51] = var3.method628((byte)-12);
                                                                                       var51 += 2;
                                                                                    }
                                                                                 }

                                                                                 if (var28 != null) {
                                                                                    var52 = 1;
                                                                                    if (var2) {
                                                                                       var28[var52] = var3.method628((byte)-12);
                                                                                       var52 += 2;
                                                                                    }
                                                                                 } else {
                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || var52 < var17) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field2293 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && ~var55 <= ~var53.field2293.length) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 += var3.method640(255) + 1;
                                                                                                      var53.field2293[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(~var55 > ~var53.field2293.length);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(var52 < var17);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && var56 >= var17) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method640(255);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 += var3.method640(255) + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label2201:
                                                                                             while(true) {
                                                                                                while(var26.length > var61) {
                                                                                                   var60 += var3.method640(255) + 1;
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var62 > var64) {
                                                                                                         this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         label2254: {
                                                                                                            if (var2) {
                                                                                                               var66 = var26[var65];
                                                                                                            } else if (var26.length <= var65) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break label2254;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label2271: {
                                                                                                                  var67 = var26[var65 - -1];
                                                                                                                  var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  } else if (~var66 >= ~var62) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break label2271;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                                     ++var69;
                                                                                                                     if (~var66 >= ~var69) {
                                                                                                                        var63 = var67;
                                                                                                                        var65 += 2;
                                                                                                                        var10000 = var66;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var62 = var10000;
                                                                                                               if (var26.length <= var65) {
                                                                                                                  var66 = var62;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var66 = var26[var65];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2) {
                                                                                                            this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            while(var66 < 128) {
                                                                                                               this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                               ++var66;
                                                                                                            }

                                                                                                            if (!var2) {
                                                                                                               var71 = null;
                                                                                                               break label2201;
                                                                                                            }

                                                                                                            ++var66;
                                                                                                         }
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var72 = var3.method640(255);
                                                                                             var28[0] = (byte)var72;
                                                                                             var73 = 2;
                                                                                             if (var2) {
                                                                                                var72 += var3.method640(255) + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var28.length < ~var73) {
                                                                                                   var72 += var3.method640(255) + 1;
                                                                                                   var28[var73] = (byte)var72;
                                                                                                   var73 += 2;
                                                                                                }

                                                                                                var74 = var28[0];
                                                                                                var75 = var28[1] << 1;
                                                                                                var76 = 0;
                                                                                                if (!var2) {
                                                                                                   label2370: {
                                                                                                      if (var2) {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      } else if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break label2370;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var77 > -1) {
                                                                                                            var77 = 0;
                                                                                                         }

                                                                                                         if (var77 > 128) {
                                                                                                            var77 = 128;
                                                                                                         }

                                                                                                         this.field5517[var76] = (byte)var77;
                                                                                                         ++var76;
                                                                                                         if (var76 >= var74) {
                                                                                                            var77 = 2;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var77 = (255 & this.field5517[var76]) + var75;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label2409: {
                                                                                                      if (var2) {
                                                                                                         var78 = var28[var77];
                                                                                                      } else if (~var77 <= ~var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break label2409;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label2426: {
                                                                                                            var79 = var28[var77 + 1] << 1;
                                                                                                            var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                            var81 = var74;
                                                                                                            if (var2) {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            } else if (~var74 <= ~var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (!var2) {
                                                                                                                  break label2426;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var82 = var10000;
                                                                                                               var83 = (this.field5517[var81] & 255) + var82;
                                                                                                               if (~var83 > -1) {
                                                                                                                  var83 = 0;
                                                                                                               }

                                                                                                               if (~var83 < -129) {
                                                                                                                  var83 = 128;
                                                                                                               }

                                                                                                               this.field5517[var81] = (byte)var83;
                                                                                                               var80 += var79 - var75;
                                                                                                               ++var81;
                                                                                                               if (~var81 <= ~var78) {
                                                                                                                  var75 = var79;
                                                                                                                  var10000 = var78;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var74 = var10000;
                                                                                                         var77 += 2;
                                                                                                         if (~var77 <= ~var28.length) {
                                                                                                            var78 = var74;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = var28[var77];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 || ~var78 > -129) {
                                                                                                      do {
                                                                                                         var84 = (this.field5517[var78] & 255) + var75;
                                                                                                         if (~var84 > -1) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (~var84 < -129) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field5517[var78] = (byte)var84;
                                                                                                         ++var78;
                                                                                                      } while(~var78 > -129);
                                                                                                   }

                                                                                                   var85 = null;
                                                                                                   break;
                                                                                                }

                                                                                                var73 += 2;
                                                                                             }
                                                                                          }

                                                                                          var86 = 0;
                                                                                          if (var2) {
                                                                                             var20[var86].field2290 = var3.method640(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var86 < var17) {
                                                                                                var20[var86].field2290 = var3.method640(255);
                                                                                                ++var86;
                                                                                             }

                                                                                             var87 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var87 > ~var17) {
                                                                                                   do {
                                                                                                      var88 = var20[var87];
                                                                                                      if (var88.field2291 != null) {
                                                                                                         var88.field2292 = var3.method640(255);
                                                                                                      }

                                                                                                      if (var88.field2293 != null) {
                                                                                                         var88.field2288 = var3.method640(255);
                                                                                                      }

                                                                                                      if (var88.field2290 > 0) {
                                                                                                         var88.field2287 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var87;
                                                                                                   } while(~var87 > ~var17);
                                                                                                }

                                                                                                var89 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var89].field2294 = var3.method640(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var17 < ~var89) {
                                                                                                      var20[var89].field2294 = var3.method640(255);
                                                                                                      ++var89;
                                                                                                   }

                                                                                                   var90 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var90 > ~var17) {
                                                                                                         do {
                                                                                                            var91 = var20[var90];
                                                                                                            if (~var91.field2294 < -1) {
                                                                                                               var91.field2285 = var3.method640(255);
                                                                                                            }

                                                                                                            ++var90;
                                                                                                         } while(~var90 > ~var17);
                                                                                                      }

                                                                                                      var92 = 0;
                                                                                                      if (!var2 && ~var92 <= ~var17) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var93 = var20[var92];
                                                                                                         if (~var93.field2285 < -1) {
                                                                                                            var93.field2284 = var3.method640(255);
                                                                                                         }

                                                                                                         ++var92;
                                                                                                      } while(~var92 > ~var17);

                                                                                                      return;
                                                                                                   }

                                                                                                   ++var89;
                                                                                                }
                                                                                             }

                                                                                             ++var86;
                                                                                          }
                                                                                       }

                                                                                       do {
                                                                                          var57 = var20[var56];
                                                                                          if (var57.field2291 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var3.method640(255) + var58 - -1;
                                                                                                var57.field2291[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var57.field2291.length < ~var59) {
                                                                                                var58 = var3.method640(255) + var58 - -1;
                                                                                                var57.field2291[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(var56 < var17);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method640(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 += var3.method640(255) + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label2669:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 += var3.method640(255) + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label2722: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var26.length <= var65) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label2722;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label2739: {
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label2739;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            if (var26.length <= var65) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label2669;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method640(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 += var3.method640(255) + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var28.length < ~var73) {
                                                                                                var72 += var3.method640(255) + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label2838: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label2838;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5517[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label2877: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (~var77 <= ~var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label2877;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label2894: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (!var2) {
                                                                                                               break label2894;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field5517[var81] & 255) + var82;
                                                                                                            if (~var83 > -1) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5517[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (~var77 <= ~var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (this.field5517[var78] & 255) + var75;
                                                                                                      if (~var84 > -1) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5517[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(~var78 > -129);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field2290 = var3.method640(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var17) {
                                                                                             var20[var86].field2290 = var3.method640(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var87 > ~var17) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2291 != null) {
                                                                                                      var88.field2292 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2293 != null) {
                                                                                                      var88.field2288 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2290 > 0) {
                                                                                                      var88.field2287 = var3.method640(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var87 > ~var17);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field2294 = var3.method640(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var17 < ~var89) {
                                                                                                   var20[var89].field2294 = var3.method640(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var90 > ~var17) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2294 < -1) {
                                                                                                            var91.field2285 = var3.method640(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var90 > ~var17);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var92 <= ~var17) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field2285 < -1) {
                                                                                                         var93.field2284 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var92 > ~var17);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    var52 += 2;
                                                                                 }

                                                                                 while(true) {
                                                                                    while(var28.length > var52) {
                                                                                       var28[var52] = var3.method628((byte)-12);
                                                                                       var52 += 2;
                                                                                    }

                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || var52 < var17) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field2293 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && ~var55 <= ~var53.field2293.length) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 += var3.method640(255) + 1;
                                                                                                      var53.field2293[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(~var55 > ~var53.field2293.length);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(var52 < var17);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && var56 >= var17) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method640(255);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 += var3.method640(255) + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label3173:
                                                                                             while(true) {
                                                                                                while(var26.length > var61) {
                                                                                                   var60 += var3.method640(255) + 1;
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var62 > var64) {
                                                                                                         this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         label3226: {
                                                                                                            if (var2) {
                                                                                                               var66 = var26[var65];
                                                                                                            } else if (var26.length <= var65) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break label3226;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label3243: {
                                                                                                                  var67 = var26[var65 - -1];
                                                                                                                  var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  } else if (~var66 >= ~var62) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break label3243;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                                     ++var69;
                                                                                                                     if (~var66 >= ~var69) {
                                                                                                                        var63 = var67;
                                                                                                                        var65 += 2;
                                                                                                                        var10000 = var66;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var62 = var10000;
                                                                                                               if (var26.length <= var65) {
                                                                                                                  var66 = var62;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var66 = var26[var65];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2) {
                                                                                                            this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            while(var66 < 128) {
                                                                                                               this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                               ++var66;
                                                                                                            }

                                                                                                            if (!var2) {
                                                                                                               var71 = null;
                                                                                                               break label3173;
                                                                                                            }

                                                                                                            ++var66;
                                                                                                         }
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var72 = var3.method640(255);
                                                                                             var28[0] = (byte)var72;
                                                                                             var73 = 2;
                                                                                             if (var2) {
                                                                                                var72 += var3.method640(255) + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var28.length < ~var73) {
                                                                                                   var72 += var3.method640(255) + 1;
                                                                                                   var28[var73] = (byte)var72;
                                                                                                   var73 += 2;
                                                                                                }

                                                                                                var74 = var28[0];
                                                                                                var75 = var28[1] << 1;
                                                                                                var76 = 0;
                                                                                                if (!var2) {
                                                                                                   label3342: {
                                                                                                      if (var2) {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      } else if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break label3342;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var77 > -1) {
                                                                                                            var77 = 0;
                                                                                                         }

                                                                                                         if (var77 > 128) {
                                                                                                            var77 = 128;
                                                                                                         }

                                                                                                         this.field5517[var76] = (byte)var77;
                                                                                                         ++var76;
                                                                                                         if (var76 >= var74) {
                                                                                                            var77 = 2;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var77 = (255 & this.field5517[var76]) + var75;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label3381: {
                                                                                                      if (var2) {
                                                                                                         var78 = var28[var77];
                                                                                                      } else if (~var77 <= ~var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break label3381;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label3398: {
                                                                                                            var79 = var28[var77 + 1] << 1;
                                                                                                            var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                            var81 = var74;
                                                                                                            if (var2) {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            } else if (~var74 <= ~var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (!var2) {
                                                                                                                  break label3398;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var82 = var10000;
                                                                                                               var83 = (this.field5517[var81] & 255) + var82;
                                                                                                               if (~var83 > -1) {
                                                                                                                  var83 = 0;
                                                                                                               }

                                                                                                               if (~var83 < -129) {
                                                                                                                  var83 = 128;
                                                                                                               }

                                                                                                               this.field5517[var81] = (byte)var83;
                                                                                                               var80 += var79 - var75;
                                                                                                               ++var81;
                                                                                                               if (~var81 <= ~var78) {
                                                                                                                  var75 = var79;
                                                                                                                  var10000 = var78;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var74 = var10000;
                                                                                                         var77 += 2;
                                                                                                         if (~var77 <= ~var28.length) {
                                                                                                            var78 = var74;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = var28[var77];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 || ~var78 > -129) {
                                                                                                      do {
                                                                                                         var84 = (this.field5517[var78] & 255) + var75;
                                                                                                         if (~var84 > -1) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (~var84 < -129) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field5517[var78] = (byte)var84;
                                                                                                         ++var78;
                                                                                                      } while(~var78 > -129);
                                                                                                   }

                                                                                                   var85 = null;
                                                                                                   break;
                                                                                                }

                                                                                                var73 += 2;
                                                                                             }
                                                                                          }

                                                                                          var86 = 0;
                                                                                          if (var2) {
                                                                                             var20[var86].field2290 = var3.method640(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var86 < var17) {
                                                                                                var20[var86].field2290 = var3.method640(255);
                                                                                                ++var86;
                                                                                             }

                                                                                             var87 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var87 > ~var17) {
                                                                                                   do {
                                                                                                      var88 = var20[var87];
                                                                                                      if (var88.field2291 != null) {
                                                                                                         var88.field2292 = var3.method640(255);
                                                                                                      }

                                                                                                      if (var88.field2293 != null) {
                                                                                                         var88.field2288 = var3.method640(255);
                                                                                                      }

                                                                                                      if (var88.field2290 > 0) {
                                                                                                         var88.field2287 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var87;
                                                                                                   } while(~var87 > ~var17);
                                                                                                }

                                                                                                var89 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var89].field2294 = var3.method640(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var17 < ~var89) {
                                                                                                      var20[var89].field2294 = var3.method640(255);
                                                                                                      ++var89;
                                                                                                   }

                                                                                                   var90 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var90 > ~var17) {
                                                                                                         do {
                                                                                                            var91 = var20[var90];
                                                                                                            if (~var91.field2294 < -1) {
                                                                                                               var91.field2285 = var3.method640(255);
                                                                                                            }

                                                                                                            ++var90;
                                                                                                         } while(~var90 > ~var17);
                                                                                                      }

                                                                                                      var92 = 0;
                                                                                                      if (!var2 && ~var92 <= ~var17) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var93 = var20[var92];
                                                                                                         if (~var93.field2285 < -1) {
                                                                                                            var93.field2284 = var3.method640(255);
                                                                                                         }

                                                                                                         ++var92;
                                                                                                      } while(~var92 > ~var17);

                                                                                                      return;
                                                                                                   }

                                                                                                   ++var89;
                                                                                                }
                                                                                             }

                                                                                             ++var86;
                                                                                          }
                                                                                       }

                                                                                       do {
                                                                                          var57 = var20[var56];
                                                                                          if (var57.field2291 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var3.method640(255) + var58 - -1;
                                                                                                var57.field2291[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var57.field2291.length < ~var59) {
                                                                                                var58 = var3.method640(255) + var58 - -1;
                                                                                                var57.field2291[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(var56 < var17);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method640(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 += var3.method640(255) + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label3641:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 += var3.method640(255) + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label3694: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var26.length <= var65) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label3694;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label3711: {
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label3711;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            if (var26.length <= var65) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label3641;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method640(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 += var3.method640(255) + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var28.length < ~var73) {
                                                                                                var72 += var3.method640(255) + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label3810: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label3810;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5517[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label3849: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (~var77 <= ~var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label3849;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label3866: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (!var2) {
                                                                                                               break label3866;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field5517[var81] & 255) + var82;
                                                                                                            if (~var83 > -1) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5517[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (~var77 <= ~var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (this.field5517[var78] & 255) + var75;
                                                                                                      if (~var84 > -1) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5517[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(~var78 > -129);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field2290 = var3.method640(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var17) {
                                                                                             var20[var86].field2290 = var3.method640(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var87 > ~var17) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2291 != null) {
                                                                                                      var88.field2292 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2293 != null) {
                                                                                                      var88.field2288 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2290 > 0) {
                                                                                                      var88.field2287 = var3.method640(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var87 > ~var17);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field2294 = var3.method640(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var17 < ~var89) {
                                                                                                   var20[var89].field2294 = var3.method640(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var90 > ~var17) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2294 < -1) {
                                                                                                            var91.field2285 = var3.method640(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var90 > ~var17);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var92 <= ~var17) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field2285 < -1) {
                                                                                                         var93.field2284 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var92 > ~var17);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    var52 += 2;
                                                                                 }
                                                                              }

                                                                              do {
                                                                                 class180 var48 = var20[var47];
                                                                                 if (var48.field2291 != null) {
                                                                                    int var49 = 1;
                                                                                    if (var2) {
                                                                                       var48.field2291[var49] = var3.method628((byte)-12);
                                                                                       var49 += 2;
                                                                                    }

                                                                                    while(var49 < var48.field2291.length) {
                                                                                       var48.field2291[var49] = var3.method628((byte)-12);
                                                                                       var49 += 2;
                                                                                    }
                                                                                 }

                                                                                 if (var48.field2293 == null) {
                                                                                    ++var47;
                                                                                 } else {
                                                                                    int var50 = 3;
                                                                                    if (var2) {
                                                                                       var48.field2293[var50] = var3.method628((byte)-12);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    while(~(var48.field2293.length + -2) < ~var50) {
                                                                                       var48.field2293[var50] = var3.method628((byte)-12);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    ++var47;
                                                                                 }
                                                                              } while(~var17 < ~var47);

                                                                              if (var26 != null) {
                                                                                 var51 = 1;
                                                                                 if (var2) {
                                                                                    var26[var51] = var3.method628((byte)-12);
                                                                                    var51 += 2;
                                                                                 }

                                                                                 while(~var26.length < ~var51) {
                                                                                    var26[var51] = var3.method628((byte)-12);
                                                                                    var51 += 2;
                                                                                 }
                                                                              }

                                                                              if (var28 != null) {
                                                                                 var52 = 1;
                                                                                 if (var2) {
                                                                                    var28[var52] = var3.method628((byte)-12);
                                                                                    var52 += 2;
                                                                                 }
                                                                              } else {
                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || var52 < var17) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field2293 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && ~var55 <= ~var53.field2293.length) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 += var3.method640(255) + 1;
                                                                                                   var53.field2293[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(~var55 > ~var53.field2293.length);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(var52 < var17);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && var56 >= var17) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method640(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 += var3.method640(255) + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label1141:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 += var3.method640(255) + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label1194: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var26.length <= var65) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label1194;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label1211: {
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label1211;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            if (var26.length <= var65) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label1141;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method640(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 += var3.method640(255) + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var28.length < ~var73) {
                                                                                                var72 += var3.method640(255) + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label1310: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label1310;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5517[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label1349: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (~var77 <= ~var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label1349;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label1366: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (!var2) {
                                                                                                               break label1366;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field5517[var81] & 255) + var82;
                                                                                                            if (~var83 > -1) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5517[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (~var77 <= ~var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (this.field5517[var78] & 255) + var75;
                                                                                                      if (~var84 > -1) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5517[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(~var78 > -129);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field2290 = var3.method640(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var17) {
                                                                                             var20[var86].field2290 = var3.method640(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var87 > ~var17) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2291 != null) {
                                                                                                      var88.field2292 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2293 != null) {
                                                                                                      var88.field2288 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2290 > 0) {
                                                                                                      var88.field2287 = var3.method640(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var87 > ~var17);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field2294 = var3.method640(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var17 < ~var89) {
                                                                                                   var20[var89].field2294 = var3.method640(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var90 > ~var17) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2294 < -1) {
                                                                                                            var91.field2285 = var3.method640(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var90 > ~var17);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var92 <= ~var17) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field2285 < -1) {
                                                                                                         var93.field2284 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var92 > ~var17);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    do {
                                                                                       var57 = var20[var56];
                                                                                       if (var57.field2291 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var3.method640(255) + var58 - -1;
                                                                                             var57.field2291[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var57.field2291.length < ~var59) {
                                                                                             var58 = var3.method640(255) + var58 - -1;
                                                                                             var57.field2291[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(var56 < var17);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method640(255);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 += var3.method640(255) + 1;
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label1609:
                                                                                       while(true) {
                                                                                          while(var26.length > var61) {
                                                                                             var60 += var3.method640(255) + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var62 > var64) {
                                                                                                   this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   label1662: {
                                                                                                      if (var2) {
                                                                                                         var66 = var26[var65];
                                                                                                      } else if (var26.length <= var65) {
                                                                                                         var66 = var62;
                                                                                                         if (!var2) {
                                                                                                            break label1662;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var66 = var26[var65];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label1679: {
                                                                                                            var67 = var26[var65 - -1];
                                                                                                            var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                            } else if (~var66 >= ~var62) {
                                                                                                               var63 = var67;
                                                                                                               var65 += 2;
                                                                                                               var10000 = var66;
                                                                                                               if (!var2) {
                                                                                                                  break label1679;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               var68 += -var63 + var67;
                                                                                                               this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                               ++var69;
                                                                                                               if (~var66 >= ~var69) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var62 = var10000;
                                                                                                         if (var26.length <= var65) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2) {
                                                                                                      this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                      ++var66;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var66 < 128) {
                                                                                                         this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      if (!var2) {
                                                                                                         var71 = null;
                                                                                                         break label1609;
                                                                                                      }

                                                                                                      ++var66;
                                                                                                   }
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var72 = var3.method640(255);
                                                                                       var28[0] = (byte)var72;
                                                                                       var73 = 2;
                                                                                       if (var2) {
                                                                                          var72 += var3.method640(255) + 1;
                                                                                          var28[var73] = (byte)var72;
                                                                                          var73 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var28.length < ~var73) {
                                                                                             var72 += var3.method640(255) + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          var74 = var28[0];
                                                                                          var75 = var28[1] << 1;
                                                                                          var76 = 0;
                                                                                          if (!var2) {
                                                                                             label1778: {
                                                                                                if (var2) {
                                                                                                   var77 = (255 & this.field5517[var76]) + var75;
                                                                                                } else if (var76 >= var74) {
                                                                                                   var77 = 2;
                                                                                                   if (!var2) {
                                                                                                      break label1778;
                                                                                                   }
                                                                                                } else {
                                                                                                   var77 = (255 & this.field5517[var76]) + var75;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var77 > -1) {
                                                                                                      var77 = 0;
                                                                                                   }

                                                                                                   if (var77 > 128) {
                                                                                                      var77 = 128;
                                                                                                   }

                                                                                                   this.field5517[var76] = (byte)var77;
                                                                                                   ++var76;
                                                                                                   if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label1817: {
                                                                                                if (var2) {
                                                                                                   var78 = var28[var77];
                                                                                                } else if (~var77 <= ~var28.length) {
                                                                                                   var78 = var74;
                                                                                                   if (!var2) {
                                                                                                      break label1817;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = var28[var77];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label1834: {
                                                                                                      var79 = var28[var77 + 1] << 1;
                                                                                                      var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                      var81 = var74;
                                                                                                      if (var2) {
                                                                                                         var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                      } else if (~var74 <= ~var78) {
                                                                                                         var75 = var79;
                                                                                                         var10000 = var78;
                                                                                                         if (!var2) {
                                                                                                            break label1834;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var82 = var10000;
                                                                                                         var83 = (this.field5517[var81] & 255) + var82;
                                                                                                         if (~var83 > -1) {
                                                                                                            var83 = 0;
                                                                                                         }

                                                                                                         if (~var83 < -129) {
                                                                                                            var83 = 128;
                                                                                                         }

                                                                                                         this.field5517[var81] = (byte)var83;
                                                                                                         var80 += var79 - var75;
                                                                                                         ++var81;
                                                                                                         if (~var81 <= ~var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var74 = var10000;
                                                                                                   var77 += 2;
                                                                                                   if (~var77 <= ~var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             if (var2 || ~var78 > -129) {
                                                                                                do {
                                                                                                   var84 = (this.field5517[var78] & 255) + var75;
                                                                                                   if (~var84 > -1) {
                                                                                                      var84 = 0;
                                                                                                   }

                                                                                                   if (~var84 < -129) {
                                                                                                      var84 = 128;
                                                                                                   }

                                                                                                   this.field5517[var78] = (byte)var84;
                                                                                                   ++var78;
                                                                                                } while(~var78 > -129);
                                                                                             }

                                                                                             var85 = null;
                                                                                             break;
                                                                                          }

                                                                                          var73 += 2;
                                                                                       }
                                                                                    }

                                                                                    var86 = 0;
                                                                                    if (var2) {
                                                                                       var20[var86].field2290 = var3.method640(255);
                                                                                       ++var86;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(var86 < var17) {
                                                                                          var20[var86].field2290 = var3.method640(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || ~var87 > ~var17) {
                                                                                             do {
                                                                                                var88 = var20[var87];
                                                                                                if (var88.field2291 != null) {
                                                                                                   var88.field2292 = var3.method640(255);
                                                                                                }

                                                                                                if (var88.field2293 != null) {
                                                                                                   var88.field2288 = var3.method640(255);
                                                                                                }

                                                                                                if (var88.field2290 > 0) {
                                                                                                   var88.field2287 = var3.method640(255);
                                                                                                }

                                                                                                ++var87;
                                                                                             } while(~var87 > ~var17);
                                                                                          }

                                                                                          var89 = 0;
                                                                                          if (var2) {
                                                                                             var20[var89].field2294 = var3.method640(255);
                                                                                             ++var89;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var17 < ~var89) {
                                                                                                var20[var89].field2294 = var3.method640(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var90 > ~var17) {
                                                                                                   do {
                                                                                                      var91 = var20[var90];
                                                                                                      if (~var91.field2294 < -1) {
                                                                                                         var91.field2285 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var90;
                                                                                                   } while(~var90 > ~var17);
                                                                                                }

                                                                                                var92 = 0;
                                                                                                if (!var2 && ~var92 <= ~var17) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var93 = var20[var92];
                                                                                                   if (~var93.field2285 < -1) {
                                                                                                      var93.field2284 = var3.method640(255);
                                                                                                   }

                                                                                                   ++var92;
                                                                                                } while(~var92 > ~var17);

                                                                                                return;
                                                                                             }

                                                                                             ++var89;
                                                                                          }
                                                                                       }

                                                                                       ++var86;
                                                                                    }
                                                                                 }

                                                                                 var52 += 2;
                                                                              }

                                                                              while(true) {
                                                                                 while(var28.length > var52) {
                                                                                    var28[var52] = var3.method628((byte)-12);
                                                                                    var52 += 2;
                                                                                 }

                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || var52 < var17) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field2293 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && ~var55 <= ~var53.field2293.length) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 += var3.method640(255) + 1;
                                                                                                   var53.field2293[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(~var55 > ~var53.field2293.length);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(var52 < var17);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && var56 >= var17) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method640(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 += var3.method640(255) + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label612:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 += var3.method640(255) + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var62 > var64) {
                                                                                                      this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label665: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var26.length <= var65) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label665;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label682: {
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label682;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var63 = var67;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            if (var26.length <= var65) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label612;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method640(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 += var3.method640(255) + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var28.length < ~var73) {
                                                                                                var72 += var3.method640(255) + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label781: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label781;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5517[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field5517[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label820: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (~var77 <= ~var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label820;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label837: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (!var2) {
                                                                                                               break label837;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field5517[var81] & 255) + var82;
                                                                                                            if (~var83 > -1) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5517[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (~var77 <= ~var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (this.field5517[var78] & 255) + var75;
                                                                                                      if (~var84 > -1) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5517[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(~var78 > -129);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field2290 = var3.method640(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var17) {
                                                                                             var20[var86].field2290 = var3.method640(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var87 > ~var17) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2291 != null) {
                                                                                                      var88.field2292 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2293 != null) {
                                                                                                      var88.field2288 = var3.method640(255);
                                                                                                   }

                                                                                                   if (var88.field2290 > 0) {
                                                                                                      var88.field2287 = var3.method640(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var87 > ~var17);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field2294 = var3.method640(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var17 < ~var89) {
                                                                                                   var20[var89].field2294 = var3.method640(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var90 > ~var17) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2294 < -1) {
                                                                                                            var91.field2285 = var3.method640(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var90 > ~var17);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var92 <= ~var17) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field2285 < -1) {
                                                                                                         var93.field2284 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var92 > ~var17);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    do {
                                                                                       var57 = var20[var56];
                                                                                       if (var57.field2291 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var3.method640(255) + var58 - -1;
                                                                                             var57.field2291[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var57.field2291.length < ~var59) {
                                                                                             var58 = var3.method640(255) + var58 - -1;
                                                                                             var57.field2291[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(var56 < var17);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method640(255);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 += var3.method640(255) + 1;
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label562:
                                                                                       while(true) {
                                                                                          while(var26.length > var61) {
                                                                                             var60 += var3.method640(255) + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var62 > var64) {
                                                                                                   this.field5514[var64] = (byte)(this.field5514[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   label523: {
                                                                                                      if (var2) {
                                                                                                         var66 = var26[var65];
                                                                                                      } else if (var26.length <= var65) {
                                                                                                         var66 = var62;
                                                                                                         if (!var2) {
                                                                                                            break label523;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var66 = var26[var65];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label520: {
                                                                                                            var67 = var26[var65 - -1];
                                                                                                            var68 = (-var62 + var66) / 2 + (-var62 + var66) * var63;
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                            } else if (~var66 >= ~var62) {
                                                                                                               var63 = var67;
                                                                                                               var65 += 2;
                                                                                                               var10000 = var66;
                                                                                                               if (!var2) {
                                                                                                                  break label520;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               var68 += -var63 + var67;
                                                                                                               this.field5514[var69] = (byte)(this.field5514[var69] * var70 + 32 >> 6);
                                                                                                               ++var69;
                                                                                                               if (~var66 >= ~var69) {
                                                                                                                  var63 = var67;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class150.method1207(-var62 + var66, var68, -1191298817);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var62 = var10000;
                                                                                                         if (var26.length <= var65) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2) {
                                                                                                      this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                      ++var66;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var66 < 128) {
                                                                                                         this.field5514[var66] = (byte)(this.field5514[var66] * var63 - -32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      if (!var2) {
                                                                                                         var71 = null;
                                                                                                         break label562;
                                                                                                      }

                                                                                                      ++var66;
                                                                                                   }
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var72 = var3.method640(255);
                                                                                       var28[0] = (byte)var72;
                                                                                       var73 = 2;
                                                                                       if (var2) {
                                                                                          var72 += var3.method640(255) + 1;
                                                                                          var28[var73] = (byte)var72;
                                                                                          var73 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var28.length < ~var73) {
                                                                                             var72 += var3.method640(255) + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          var74 = var28[0];
                                                                                          var75 = var28[1] << 1;
                                                                                          var76 = 0;
                                                                                          if (!var2) {
                                                                                             label426: {
                                                                                                if (var2) {
                                                                                                   var77 = (255 & this.field5517[var76]) + var75;
                                                                                                } else if (var76 >= var74) {
                                                                                                   var77 = 2;
                                                                                                   if (!var2) {
                                                                                                      break label426;
                                                                                                   }
                                                                                                } else {
                                                                                                   var77 = (255 & this.field5517[var76]) + var75;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var77 > -1) {
                                                                                                      var77 = 0;
                                                                                                   }

                                                                                                   if (var77 > 128) {
                                                                                                      var77 = 128;
                                                                                                   }

                                                                                                   this.field5517[var76] = (byte)var77;
                                                                                                   ++var76;
                                                                                                   if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field5517[var76]) + var75;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label408: {
                                                                                                if (var2) {
                                                                                                   var78 = var28[var77];
                                                                                                } else if (~var77 <= ~var28.length) {
                                                                                                   var78 = var74;
                                                                                                   if (!var2) {
                                                                                                      break label408;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = var28[var77];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label405: {
                                                                                                      var79 = var28[var77 + 1] << 1;
                                                                                                      var80 = (-var74 + var78) / 2 + (-var74 + var78) * var75;
                                                                                                      var81 = var74;
                                                                                                      if (var2) {
                                                                                                         var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                      } else if (~var74 <= ~var78) {
                                                                                                         var75 = var79;
                                                                                                         var10000 = var78;
                                                                                                         if (!var2) {
                                                                                                            break label405;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var82 = var10000;
                                                                                                         var83 = (this.field5517[var81] & 255) + var82;
                                                                                                         if (~var83 > -1) {
                                                                                                            var83 = 0;
                                                                                                         }

                                                                                                         if (~var83 < -129) {
                                                                                                            var83 = 128;
                                                                                                         }

                                                                                                         this.field5517[var81] = (byte)var83;
                                                                                                         var80 += var79 - var75;
                                                                                                         ++var81;
                                                                                                         if (~var81 <= ~var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class150.method1207(-var74 + var78, var80, -1191298817);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var74 = var10000;
                                                                                                   var77 += 2;
                                                                                                   if (~var77 <= ~var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             if (var2 || ~var78 > -129) {
                                                                                                do {
                                                                                                   var84 = (this.field5517[var78] & 255) + var75;
                                                                                                   if (~var84 > -1) {
                                                                                                      var84 = 0;
                                                                                                   }

                                                                                                   if (~var84 < -129) {
                                                                                                      var84 = 128;
                                                                                                   }

                                                                                                   this.field5517[var78] = (byte)var84;
                                                                                                   ++var78;
                                                                                                } while(~var78 > -129);
                                                                                             }

                                                                                             var85 = null;
                                                                                             break;
                                                                                          }

                                                                                          var73 += 2;
                                                                                       }
                                                                                    }

                                                                                    var86 = 0;
                                                                                    if (var2) {
                                                                                       var20[var86].field2290 = var3.method640(255);
                                                                                       ++var86;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(var86 < var17) {
                                                                                          var20[var86].field2290 = var3.method640(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || ~var87 > ~var17) {
                                                                                             do {
                                                                                                var88 = var20[var87];
                                                                                                if (var88.field2291 != null) {
                                                                                                   var88.field2292 = var3.method640(255);
                                                                                                }

                                                                                                if (var88.field2293 != null) {
                                                                                                   var88.field2288 = var3.method640(255);
                                                                                                }

                                                                                                if (var88.field2290 > 0) {
                                                                                                   var88.field2287 = var3.method640(255);
                                                                                                }

                                                                                                ++var87;
                                                                                             } while(~var87 > ~var17);
                                                                                          }

                                                                                          var89 = 0;
                                                                                          if (var2) {
                                                                                             var20[var89].field2294 = var3.method640(255);
                                                                                             ++var89;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var17 < ~var89) {
                                                                                                var20[var89].field2294 = var3.method640(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var90 > ~var17) {
                                                                                                   do {
                                                                                                      var91 = var20[var90];
                                                                                                      if (~var91.field2294 < -1) {
                                                                                                         var91.field2285 = var3.method640(255);
                                                                                                      }

                                                                                                      ++var90;
                                                                                                   } while(~var90 > ~var17);
                                                                                                }

                                                                                                var92 = 0;
                                                                                                if (!var2 && ~var92 <= ~var17) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var93 = var20[var92];
                                                                                                   if (~var93.field2285 < -1) {
                                                                                                      var93.field2284 = var3.method640(255);
                                                                                                   }

                                                                                                   ++var92;
                                                                                                } while(~var92 > ~var17);

                                                                                                return;
                                                                                             }

                                                                                             ++var89;
                                                                                          }
                                                                                       }

                                                                                       ++var86;
                                                                                    }
                                                                                 }

                                                                                 var52 += 2;
                                                                              }
                                                                           }

                                                                           ++var46;
                                                                        }
                                                                     }
                                                                  } else if (this.field5515[var44] != 0) {
                                                                     if (~var35 == -1) {
                                                                        label4102: {
                                                                           var43 = var20[var15[var36]];
                                                                           if (var13.length > var36) {
                                                                              var35 = var13[var36++];
                                                                              if (!var2) {
                                                                                 break label4102;
                                                                              }
                                                                           }

                                                                           var35 = -1;
                                                                        }
                                                                     }

                                                                     --var35;
                                                                     this.field5520[var44] = var43;
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
      } catch (RuntimeException var95) {
         throw class93.method866(var95, field5530[8] + (arg0 != null ? field5530[0] : field5530[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
