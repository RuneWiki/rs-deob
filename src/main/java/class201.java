import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class201 extends class500 {
   @OriginalMember(
      owner = "client!op",
      name = "r",
      descriptor = "[S"
   )
   public short[] field2462;
   @OriginalMember(
      owner = "client!op",
      name = "v",
      descriptor = "[I"
   )
   private int[] field2472;
   @OriginalMember(
      owner = "client!op",
      name = "t",
      descriptor = "[Lin;"
   )
   public class98[] field2464;
   @OriginalMember(
      owner = "client!op",
      name = "k",
      descriptor = "[B"
   )
   public byte[] field2465;
   @OriginalMember(
      owner = "client!op",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field2474;
   @OriginalMember(
      owner = "client!op",
      name = "j",
      descriptor = "[B"
   )
   public byte[] field2467;
   @OriginalMember(
      owner = "client!op",
      name = "l",
      descriptor = "[Lmia;"
   )
   public class68[] field2468;
   @OriginalMember(
      owner = "client!op",
      name = "n",
      descriptor = "I"
   )
   public int field2469;
   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2475 = new String[]{method1519(method1518("iHa'\u0014")), method1519(method1518("}\u0016aKA")), method1519(method1518("|\u0013#e")), method1519(method1518("}\u0016a5\u0000|\u000f;7A")), method1519(method1518("}\u0016aHA")), method1519(method1518("}\u0016aJA")), method1519(method1518("}\u0016aMA")), method1519(method1518("}\u0016aLA"))};
   @OriginalMember(
      owner = "client!op",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field2473 = true;
   @OriginalMember(
      owner = "client!op",
      name = "o",
      descriptor = "I"
   )
   public static int field2463;
   @OriginalMember(
      owner = "client!op",
      name = "q",
      descriptor = "I"
   )
   public static int field2466;
   @OriginalMember(
      owner = "client!op",
      name = "s",
      descriptor = "I"
   )
   public static int field2470;
   @OriginalMember(
      owner = "client!op",
      name = "u",
      descriptor = "I"
   )
   public static int field2471;

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method1513(long arg0, long arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2475[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1514(int arg0) {
      try {
         this.field2472 = null;
         ++field2471;
         if (arg0 != -10872) {
            this.field2462 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2475[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method1515(boolean arg0, int arg1) {
      try {
         ++field2470;
         if (class154.field1994 != null) {
            if (~arg1 <= -1 && arg1 < class154.field1994.field11137) {
               class696 var2 = class154.field1994.field11132[arg1];
               if (~var2.field10170 == 0) {
                  class223 var3 = class355.method2790(13111);
                  if (arg0) {
                     class471 var4 = class133.method1118(var3.field2787, 2, class685.field10051);
                     var4.field6527.method4318(2 + class190.method1432(10524, var2.field10164), 0);
                     var4.field6527.method4284(arg1, -31429);
                     var4.field6527.method4332((byte)-126, var2.field10164);
                     var3.method1702((byte)-110, var4);
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2475[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method1516(int arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field2466;
         if (arg1 == null) {
            return false;
         } else {
            if (arg0 != 1) {
               field2473 = true;
            }

            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class710.field10421[var3])) {
                  return true;
               }

               if (arg1.equalsIgnoreCase(class370.field5211[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               boolean var10000;
               if (~class568.field7743 >= ~var3) {
                  var10000 = false;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = arg1.equalsIgnoreCase(class710.field10421[var3]);
               }

               if (var10000) {
                  return true;
               }

               if (arg1.equalsIgnoreCase(class370.field5211[var3])) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2475[5] + arg0 + ',' + (arg1 != null ? field2475[0] : field2475[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "([I[BLnt;I)Z"
   )
   public final boolean method1517(int[] arg0, byte[] arg1, class234 arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field2463;
         byte var6 = 1;
         int var7 = arg3;
         class98 var8 = null;
         int var9 = 0;

         while(true) {
            label68: {
               int var10000;
               if (~var9 <= -129) {
                  var10000 = var6;
                  if (!var5) {
                     return (boolean)var6;
                  }
               } else {
                  if (arg1 != null && ~arg1[var9] == -1) {
                     break label68;
                  }

                  var10000 = this.field2472[var9];
               }

               int var10 = var10000;
               if (~var10 != -1) {
                  if (var7 != var10) {
                     label58: {
                        var7 = var10--;
                        if ((var10 & 1) == 0) {
                           var8 = arg2.method1767(arg0, var10 >> 2, -73);
                           if (!var5) {
                              break label58;
                           }
                        }

                        var8 = arg2.method1765(arg0, (byte)-94, var10 >> 2);
                     }

                     if (var8 == null) {
                        var6 = 0;
                     }
                  }

                  if (var8 != null) {
                     this.field2464[var9] = var8;
                     this.field2472[var9] = 0;
                  }
               }
            }

            ++var9;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2475[1] + (arg0 != null ? field2475[0] : field2475[2]) + ',' + (arg1 != null ? field2475[0] : field2475[2]) + ',' + (arg2 != null ? field2475[0] : field2475[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "<init>",
      descriptor = "()V"
   )
   public class201() {
   }

   @OriginalMember(
      owner = "client!op",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class201(byte[] arg0) {
      boolean var2 = client.field4273;
      super();

      try {
         this.field2462 = new short[128];
         this.field2472 = new int[128];
         this.field2464 = new class98[128];
         this.field2465 = new byte[128];
         this.field2474 = new byte[128];
         this.field2467 = new byte[128];
         this.field2468 = new class68[128];
         class594 var3 = new class594(arg0);
         int var4 = 0;
         if (var2) {
            ++var4;
         }

         while(var3.field8227[var3.field8243 - -var4] != 0) {
            ++var4;
         }

         byte[] var5 = new byte[var4];
         int var6 = 0;
         if (var2) {
            var5[var6] = var3.method4340(409855200);
            ++var6;
         }

         while(true) {
            while(var4 > var6) {
               var5[var6] = var3.method4340(409855200);
               ++var6;
            }

            ++var3.field8243;
            ++var4;
            int var7 = var3.field8243;
            var3.field8243 += var4;
            int var8 = 0;
            if (!var2) {
               if (var2) {
                  ++var8;
               }

               while(var3.field8227[var3.field8243 + var8] != 0) {
                  ++var8;
               }

               byte[] var9 = new byte[var8];
               int var10 = 0;
               if (var2) {
                  var9[var10] = var3.method4340(409855200);
                  ++var10;
               }

               while(true) {
                  while(var8 > var10) {
                     var9[var10] = var3.method4340(409855200);
                     ++var10;
                  }

                  ++var8;
                  ++var3.field8243;
                  int var11 = var3.field8243;
                  var3.field8243 += var8;
                  int var12 = 0;
                  if (!var2) {
                     if (var2) {
                        ++var12;
                     }

                     while(var3.field8227[var3.field8243 + var12] != 0) {
                        ++var12;
                     }

                     byte[] var13 = new byte[var12];
                     int var14 = 0;
                     if (var2) {
                        var13[var14] = var3.method4340(409855200);
                        ++var14;
                     }

                     while(true) {
                        while(var12 > var14) {
                           var13[var14] = var3.method4340(409855200);
                           ++var14;
                        }

                        ++var12;
                        ++var3.field8243;
                        byte[] var15 = new byte[var12];
                        if (!var2) {
                           int var16;
                           label4122: {
                              if (var12 > 1) {
                                 var15[1] = 1;
                                 var16 = 2;
                                 int var17 = 1;
                                 int var18 = 2;
                                 if (var2 || var12 > var18) {
                                    do {
                                       label4244: {
                                          int var19 = var3.method4288((byte)88);
                                          if (~var19 == -1) {
                                             var17 = var16++;
                                             if (!var2) {
                                                break label4244;
                                             }
                                          }

                                          if (var17 >= var19) {
                                             --var19;
                                          }

                                          var17 = var19;
                                       }

                                       var15[var18] = (byte)var17;
                                       ++var18;
                                    } while(var12 > var18);
                                 }

                                 if (!var2) {
                                    break label4122;
                                 }
                              }

                              var16 = var12;
                           }

                           class68[] var20 = new class68[var16];
                           int var21 = 0;
                           class68 var22;
                           int var23;
                           int var24;
                           if (var2) {
                              var22 = var20[var21] = new class68();
                              var23 = var3.method4288((byte)59);
                              if (var23 > 0) {
                                 var22.field781 = new byte[var23 * 2];
                              }

                              var24 = var3.method4288((byte)80);
                              if (var24 > 0) {
                                 var22.field787 = new byte[var24 * 2 + 2];
                                 var22.field787[1] = 64;
                              }

                              ++var21;
                           }

                           while(~var21 > ~var20.length) {
                              var22 = var20[var21] = new class68();
                              var23 = var3.method4288((byte)59);
                              if (var23 > 0) {
                                 var22.field781 = new byte[var23 * 2];
                              }

                              var24 = var3.method4288((byte)80);
                              if (var24 > 0) {
                                 var22.field787 = new byte[var24 * 2 + 2];
                                 var22.field787[1] = 64;
                              }

                              ++var21;
                           }

                           int var25 = var3.method4288((byte)103);
                           byte[] var26 = var25 <= 0 ? null : new byte[var25 * 2];
                           int var27 = var3.method4288((byte)87);
                           byte[] var28 = ~var27 < -1 ? new byte[var27 * 2] : null;
                           int var29 = 0;
                           if (var2) {
                              ++var29;
                           }

                           while(var3.field8227[var3.field8243 - -var29] != 0) {
                              ++var29;
                           }

                           byte[] var30 = new byte[var29];
                           int var31 = 0;
                           if (var2) {
                              var30[var31] = var3.method4340(409855200);
                              ++var31;
                           }

                           while(true) {
                              while(~var31 > ~var29) {
                                 var30[var31] = var3.method4340(409855200);
                                 ++var31;
                              }

                              ++var29;
                              ++var3.field8243;
                              int var32 = 0;
                              int var33 = 0;
                              if (!var2) {
                                 if (var2) {
                                    var32 += var3.method4288((byte)111);
                                    this.field2462[var33] = (short)var32;
                                    ++var33;
                                 }

                                 while(true) {
                                    while(var33 < 128) {
                                       var32 += var3.method4288((byte)111);
                                       this.field2462[var33] = (short)var32;
                                       ++var33;
                                    }

                                    var32 = 0;
                                    int var34 = 0;
                                    if (!var2) {
                                       if (var2) {
                                          var32 += var3.method4288((byte)115);
                                          this.field2462[var34] = (short)(this.field2462[var34] + (var32 << 8));
                                          ++var34;
                                       }

                                       while(true) {
                                          while(~var34 > -129) {
                                             var32 += var3.method4288((byte)115);
                                             this.field2462[var34] = (short)(this.field2462[var34] + (var32 << 8));
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

                                                   var37 = var3.method4282(2057284936);
                                                }

                                                this.field2462[var38] = (short)(this.field2462[var38] + (class743.method5375(2, var37 + -1) << 14));
                                                --var35;
                                                this.field2472[var38] = var37;
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

                                                      var37 = var3.method4282(2057284936);
                                                   }

                                                   this.field2462[var38] = (short)(this.field2462[var38] + (class743.method5375(2, var37 + -1) << 14));
                                                   --var35;
                                                   this.field2472[var38] = var37;
                                                   ++var38;
                                                }

                                                var35 = 0;
                                                var36 = 0;
                                                int var39 = 0;
                                                int var40 = 0;
                                                if (!var2) {
                                                   if (var2) {
                                                      if (~this.field2472[var40] != -1) {
                                                         if (~var35 == -1) {
                                                            var39 = -1 + var3.field8227[var7++];
                                                            if (var36 >= var5.length) {
                                                               var35 = -1;
                                                               if (var2) {
                                                                  var35 = var5[var36++];
                                                               }
                                                            } else {
                                                               var35 = var5[var36++];
                                                            }
                                                         }

                                                         --var35;
                                                         this.field2474[var40] = (byte)var39;
                                                         ++var40;
                                                      } else {
                                                         ++var40;
                                                      }
                                                   }

                                                   while(true) {
                                                      while(var40 < 128) {
                                                         if (~this.field2472[var40] != -1) {
                                                            if (~var35 == -1) {
                                                               var39 = -1 + var3.field8227[var7++];
                                                               if (var36 >= var5.length) {
                                                                  var35 = -1;
                                                                  if (var2) {
                                                                     var35 = var5[var36++];
                                                                  }
                                                               } else {
                                                                  var35 = var5[var36++];
                                                               }
                                                            }

                                                            --var35;
                                                            this.field2474[var40] = (byte)var39;
                                                            ++var40;
                                                         } else {
                                                            ++var40;
                                                         }
                                                      }

                                                      var36 = 0;
                                                      var35 = 0;
                                                      int var41 = 0;
                                                      int var42 = 0;
                                                      if (!var2) {
                                                         if (var2) {
                                                            if (this.field2472[var42] != 0) {
                                                               if (var35 == 0) {
                                                                  if (var36 < var9.length) {
                                                                     var35 = var9[var36++];
                                                                     if (var2) {
                                                                        var35 = -1;
                                                                     }
                                                                  } else {
                                                                     var35 = -1;
                                                                  }

                                                                  var41 = 16 + var3.field8227[var11++] << 2;
                                                               }

                                                               --var35;
                                                               this.field2467[var42] = (byte)var41;
                                                            }

                                                            ++var42;
                                                         }

                                                         while(true) {
                                                            while(var42 < 128) {
                                                               if (this.field2472[var42] != 0) {
                                                                  if (var35 == 0) {
                                                                     if (var36 < var9.length) {
                                                                        var35 = var9[var36++];
                                                                        if (var2) {
                                                                           var35 = -1;
                                                                        }
                                                                     } else {
                                                                        var35 = -1;
                                                                     }

                                                                     var41 = 16 + var3.field8227[var11++] << 2;
                                                                  }

                                                                  --var35;
                                                                  this.field2467[var42] = (byte)var41;
                                                               }

                                                               ++var42;
                                                            }

                                                            var36 = 0;
                                                            var35 = 0;
                                                            class68 var43 = null;
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
                                                                           if (~var35 == -1) {
                                                                              if (var30.length <= var36) {
                                                                                 var35 = -1;
                                                                                 if (var2) {
                                                                                    var35 = var30[var36++];
                                                                                 }
                                                                              } else {
                                                                                 var35 = var30[var36++];
                                                                              }

                                                                              if (~this.field2472[var46] < -1) {
                                                                                 var45 = 1 + var3.method4288((byte)93);
                                                                              }
                                                                           }

                                                                           --var35;
                                                                           this.field2465[var46] = (byte)var45;
                                                                           ++var46;
                                                                        }

                                                                        while(true) {
                                                                           while(var46 < 128) {
                                                                              if (~var35 == -1) {
                                                                                 if (var30.length <= var36) {
                                                                                    var35 = -1;
                                                                                    if (var2) {
                                                                                       var35 = var30[var36++];
                                                                                    }
                                                                                 } else {
                                                                                    var35 = var30[var36++];
                                                                                 }

                                                                                 if (~this.field2472[var46] < -1) {
                                                                                    var45 = 1 + var3.method4288((byte)93);
                                                                                 }
                                                                              }

                                                                              --var35;
                                                                              this.field2465[var46] = (byte)var45;
                                                                              ++var46;
                                                                           }

                                                                           this.field2469 = var3.method4288((byte)66) - -1;
                                                                           int var47 = 0;
                                                                           if (!var2) {
                                                                              int var10000;
                                                                              int var51;
                                                                              int var52;
                                                                              class68 var53;
                                                                              int var54;
                                                                              int var55;
                                                                              int var56;
                                                                              class68 var57;
                                                                              int var58;
                                                                              int var59;
                                                                              int var60;
                                                                              int var61;
                                                                              byte var62;
                                                                              int var63;
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
                                                                              class68 var89;
                                                                              int var90;
                                                                              int var91;
                                                                              class68 var92;
                                                                              int var93;
                                                                              class68 var94;
                                                                              if (!var2 && ~var16 >= ~var47) {
                                                                                 if (var26 != null) {
                                                                                    var51 = 1;
                                                                                    if (var2 || var51 < var26.length) {
                                                                                       do {
                                                                                          var26[var51] = var3.method4340(409855200);
                                                                                          var51 += 2;
                                                                                       } while(var51 < var26.length);
                                                                                    }
                                                                                 }

                                                                                 if (var28 != null) {
                                                                                    var52 = 1;
                                                                                    if (var2) {
                                                                                       var28[var52] = var3.method4340(409855200);
                                                                                       var52 += 2;
                                                                                    }
                                                                                 } else {
                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || ~var16 < ~var52) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field787 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && var55 >= var53.field787.length) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 = var54 + 1 + var3.method4288((byte)94);
                                                                                                      var53.field787[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var55 < var53.field787.length);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var16 < ~var52);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && ~var56 <= ~var16) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method4288((byte)77);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label2096:
                                                                                             while(true) {
                                                                                                while(var61 < var26.length) {
                                                                                                   var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(~var62 < ~var64) {
                                                                                                         this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         if (var2 || var65 < var26.length) {
                                                                                                            do {
                                                                                                               label2159: {
                                                                                                                  var66 = var26[var65];
                                                                                                                  var67 = var26[var65 - -1];
                                                                                                                  var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  } else if (~var66 >= ~var62) {
                                                                                                                     var62 = var66;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var67;
                                                                                                                     if (!var2) {
                                                                                                                        break label2159;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                                     ++var69;
                                                                                                                     if (~var66 >= ~var69) {
                                                                                                                        var62 = var66;
                                                                                                                        var65 += 2;
                                                                                                                        var10000 = var67;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var63 = var10000;
                                                                                                            } while(var65 < var26.length);
                                                                                                         }

                                                                                                         var71 = null;
                                                                                                         var72 = var62;
                                                                                                         if (var2 || var62 < 128) {
                                                                                                            do {
                                                                                                               this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                               ++var72;
                                                                                                            } while(var72 < 128);
                                                                                                         }
                                                                                                         break label2096;
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var73 = var3.method4288((byte)113);
                                                                                             var28[0] = (byte)var73;
                                                                                             var74 = 2;
                                                                                             if (var2) {
                                                                                                var73 -= -1 - var3.method4288((byte)70);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var74 > ~var28.length) {
                                                                                                   var73 -= -1 - var3.method4288((byte)70);
                                                                                                   var28[var74] = (byte)var73;
                                                                                                   var74 += 2;
                                                                                                }

                                                                                                var75 = var28[0];
                                                                                                var76 = var28[1] << 1;
                                                                                                var77 = 0;
                                                                                                if (!var2) {
                                                                                                   label2237: {
                                                                                                      if (var2) {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      } else if (var75 <= var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            break label2237;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var78 > -1) {
                                                                                                            var78 = 0;
                                                                                                         }

                                                                                                         if (var78 > 128) {
                                                                                                            var78 = 128;
                                                                                                         }

                                                                                                         this.field2467[var77] = (byte)var78;
                                                                                                         ++var77;
                                                                                                         if (var75 <= var77) {
                                                                                                            var78 = 2;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = (this.field2467[var77] & 255) + var76;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label2276: {
                                                                                                      if (var2) {
                                                                                                         var79 = var28[var78];
                                                                                                      } else if (var28.length <= var78) {
                                                                                                         var79 = var75;
                                                                                                         if (!var2) {
                                                                                                            break label2276;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var79 = var28[var78];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label2293: {
                                                                                                            var80 = var28[var78 + 1] << 1;
                                                                                                            var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                            var82 = var75;
                                                                                                            if (var2) {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            } else if (~var79 >= ~var75) {
                                                                                                               var78 += 2;
                                                                                                               var76 = var80;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break label2293;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var83 = var10000;
                                                                                                               var84 = (this.field2467[var82] & 255) + var83;
                                                                                                               if (var84 < 0) {
                                                                                                                  var84 = 0;
                                                                                                               }

                                                                                                               if (~var84 < -129) {
                                                                                                                  var84 = 128;
                                                                                                               }

                                                                                                               this.field2467[var82] = (byte)var84;
                                                                                                               var81 += -var76 + var80;
                                                                                                               ++var82;
                                                                                                               if (~var79 >= ~var82) {
                                                                                                                  var78 += 2;
                                                                                                                  var76 = var80;
                                                                                                                  var10000 = var79;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var75 = var10000;
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
                                                                                                         var85 = (255 & this.field2467[var79]) + var76;
                                                                                                         if (var85 < 0) {
                                                                                                            var85 = 0;
                                                                                                         }

                                                                                                         if (var85 > 128) {
                                                                                                            var85 = 128;
                                                                                                         }

                                                                                                         this.field2467[var79] = (byte)var85;
                                                                                                         ++var79;
                                                                                                      } while(var79 < 128);
                                                                                                   }

                                                                                                   var86 = null;
                                                                                                   break;
                                                                                                }

                                                                                                var74 += 2;
                                                                                             }
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2) {
                                                                                             var20[var87].field780 = var3.method4288((byte)95);
                                                                                             ++var87;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var16 > var87) {
                                                                                                var20[var87].field780 = var3.method4288((byte)95);
                                                                                                ++var87;
                                                                                             }

                                                                                             var88 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var16 < ~var88) {
                                                                                                   do {
                                                                                                      var89 = var20[var88];
                                                                                                      if (var89.field781 != null) {
                                                                                                         var89.field779 = var3.method4288((byte)71);
                                                                                                      }

                                                                                                      if (var89.field787 != null) {
                                                                                                         var89.field790 = var3.method4288((byte)76);
                                                                                                      }

                                                                                                      if (var89.field780 > 0) {
                                                                                                         var89.field786 = var3.method4288((byte)102);
                                                                                                      }

                                                                                                      ++var88;
                                                                                                   } while(~var16 < ~var88);
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var90].field788 = var3.method4288((byte)99);
                                                                                                   ++var90;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var16 < ~var90) {
                                                                                                      var20[var90].field788 = var3.method4288((byte)99);
                                                                                                      ++var90;
                                                                                                   }

                                                                                                   var91 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var16 < ~var91) {
                                                                                                         do {
                                                                                                            var92 = var20[var91];
                                                                                                            if (var92.field788 > 0) {
                                                                                                               var92.field782 = var3.method4288((byte)113);
                                                                                                            }

                                                                                                            ++var91;
                                                                                                         } while(~var16 < ~var91);
                                                                                                      }

                                                                                                      var93 = 0;
                                                                                                      if (!var2 && ~var93 <= ~var16) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var94 = var20[var93];
                                                                                                         if (~var94.field782 < -1) {
                                                                                                            var94.field785 = var3.method4288((byte)73);
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
                                                                                          if (var57.field781 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                                var57.field781[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var57.field781.length < ~var59) {
                                                                                                var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                                var57.field781[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(~var56 > ~var16);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method4288((byte)77);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label2536:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var62 < ~var64) {
                                                                                                      this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var65 < var26.length) {
                                                                                                         do {
                                                                                                            label2599: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var62 = var66;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var67;
                                                                                                                  if (!var2) {
                                                                                                                     break label2599;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var62 = var66;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var67;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                         } while(var65 < var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || var62 < 128) {
                                                                                                         do {
                                                                                                            this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(var72 < 128);
                                                                                                      }
                                                                                                      break label2536;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method4288((byte)113);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 -= -1 - var3.method4288((byte)70);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var74 > ~var28.length) {
                                                                                                var73 -= -1 - var3.method4288((byte)70);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                label2677: {
                                                                                                   if (var2) {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   } else if (var75 <= var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label2677;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var78 > -1) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (var78 > 128) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field2467[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                      if (var75 <= var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label2716: {
                                                                                                   if (var2) {
                                                                                                      var79 = var28[var78];
                                                                                                   } else if (var28.length <= var78) {
                                                                                                      var79 = var75;
                                                                                                      if (!var2) {
                                                                                                         break label2716;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var79 = var28[var78];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label2733: {
                                                                                                         var80 = var28[var78 + 1] << 1;
                                                                                                         var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                         var82 = var75;
                                                                                                         if (var2) {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         } else if (~var79 >= ~var75) {
                                                                                                            var78 += 2;
                                                                                                            var76 = var80;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label2733;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var83 = var10000;
                                                                                                            var84 = (this.field2467[var82] & 255) + var83;
                                                                                                            if (var84 < 0) {
                                                                                                               var84 = 0;
                                                                                                            }

                                                                                                            if (~var84 < -129) {
                                                                                                               var84 = 128;
                                                                                                            }

                                                                                                            this.field2467[var82] = (byte)var84;
                                                                                                            var81 += -var76 + var80;
                                                                                                            ++var82;
                                                                                                            if (~var79 >= ~var82) {
                                                                                                               var78 += 2;
                                                                                                               var76 = var80;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
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
                                                                                                      var85 = (255 & this.field2467[var79]) + var76;
                                                                                                      if (var85 < 0) {
                                                                                                         var85 = 0;
                                                                                                      }

                                                                                                      if (var85 > 128) {
                                                                                                         var85 = 128;
                                                                                                      }

                                                                                                      this.field2467[var79] = (byte)var85;
                                                                                                      ++var79;
                                                                                                   } while(var79 < 128);
                                                                                                }

                                                                                                var86 = null;
                                                                                                break;
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field780 = var3.method4288((byte)95);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var16 > var87) {
                                                                                             var20[var87].field780 = var3.method4288((byte)95);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var16 < ~var88) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field781 != null) {
                                                                                                      var89.field779 = var3.method4288((byte)71);
                                                                                                   }

                                                                                                   if (var89.field787 != null) {
                                                                                                      var89.field790 = var3.method4288((byte)76);
                                                                                                   }

                                                                                                   if (var89.field780 > 0) {
                                                                                                      var89.field786 = var3.method4288((byte)102);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var16 < ~var88);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field788 = var3.method4288((byte)99);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var90) {
                                                                                                   var20[var90].field788 = var3.method4288((byte)99);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var16 < ~var91) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (var92.field788 > 0) {
                                                                                                            var92.field782 = var3.method4288((byte)113);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(~var16 < ~var91);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field782 < -1) {
                                                                                                         var94.field785 = var3.method4288((byte)73);
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
                                                                                    while(var52 < var28.length) {
                                                                                       var28[var52] = var3.method4340(409855200);
                                                                                       var52 += 2;
                                                                                    }

                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || ~var16 < ~var52) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field787 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && var55 >= var53.field787.length) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 = var54 + 1 + var3.method4288((byte)94);
                                                                                                      var53.field787[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var55 < var53.field787.length);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var16 < ~var52);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && ~var56 <= ~var16) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method4288((byte)77);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label3012:
                                                                                             while(true) {
                                                                                                while(var61 < var26.length) {
                                                                                                   var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(~var62 < ~var64) {
                                                                                                         this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         if (var2 || var65 < var26.length) {
                                                                                                            do {
                                                                                                               label3075: {
                                                                                                                  var66 = var26[var65];
                                                                                                                  var67 = var26[var65 - -1];
                                                                                                                  var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  } else if (~var66 >= ~var62) {
                                                                                                                     var62 = var66;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var67;
                                                                                                                     if (!var2) {
                                                                                                                        break label3075;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                                     ++var69;
                                                                                                                     if (~var66 >= ~var69) {
                                                                                                                        var62 = var66;
                                                                                                                        var65 += 2;
                                                                                                                        var10000 = var67;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var63 = var10000;
                                                                                                            } while(var65 < var26.length);
                                                                                                         }

                                                                                                         var71 = null;
                                                                                                         var72 = var62;
                                                                                                         if (var2 || var62 < 128) {
                                                                                                            do {
                                                                                                               this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                               ++var72;
                                                                                                            } while(var72 < 128);
                                                                                                         }
                                                                                                         break label3012;
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var73 = var3.method4288((byte)113);
                                                                                             var28[0] = (byte)var73;
                                                                                             var74 = 2;
                                                                                             if (var2) {
                                                                                                var73 -= -1 - var3.method4288((byte)70);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var74 > ~var28.length) {
                                                                                                   var73 -= -1 - var3.method4288((byte)70);
                                                                                                   var28[var74] = (byte)var73;
                                                                                                   var74 += 2;
                                                                                                }

                                                                                                var75 = var28[0];
                                                                                                var76 = var28[1] << 1;
                                                                                                var77 = 0;
                                                                                                if (!var2) {
                                                                                                   label3153: {
                                                                                                      if (var2) {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      } else if (var75 <= var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            break label3153;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var78 > -1) {
                                                                                                            var78 = 0;
                                                                                                         }

                                                                                                         if (var78 > 128) {
                                                                                                            var78 = 128;
                                                                                                         }

                                                                                                         this.field2467[var77] = (byte)var78;
                                                                                                         ++var77;
                                                                                                         if (var75 <= var77) {
                                                                                                            var78 = 2;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = (this.field2467[var77] & 255) + var76;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label3192: {
                                                                                                      if (var2) {
                                                                                                         var79 = var28[var78];
                                                                                                      } else if (var28.length <= var78) {
                                                                                                         var79 = var75;
                                                                                                         if (!var2) {
                                                                                                            break label3192;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var79 = var28[var78];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label3209: {
                                                                                                            var80 = var28[var78 + 1] << 1;
                                                                                                            var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                            var82 = var75;
                                                                                                            if (var2) {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            } else if (~var79 >= ~var75) {
                                                                                                               var78 += 2;
                                                                                                               var76 = var80;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break label3209;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var83 = var10000;
                                                                                                               var84 = (this.field2467[var82] & 255) + var83;
                                                                                                               if (var84 < 0) {
                                                                                                                  var84 = 0;
                                                                                                               }

                                                                                                               if (~var84 < -129) {
                                                                                                                  var84 = 128;
                                                                                                               }

                                                                                                               this.field2467[var82] = (byte)var84;
                                                                                                               var81 += -var76 + var80;
                                                                                                               ++var82;
                                                                                                               if (~var79 >= ~var82) {
                                                                                                                  var78 += 2;
                                                                                                                  var76 = var80;
                                                                                                                  var10000 = var79;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var75 = var10000;
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
                                                                                                         var85 = (255 & this.field2467[var79]) + var76;
                                                                                                         if (var85 < 0) {
                                                                                                            var85 = 0;
                                                                                                         }

                                                                                                         if (var85 > 128) {
                                                                                                            var85 = 128;
                                                                                                         }

                                                                                                         this.field2467[var79] = (byte)var85;
                                                                                                         ++var79;
                                                                                                      } while(var79 < 128);
                                                                                                   }

                                                                                                   var86 = null;
                                                                                                   break;
                                                                                                }

                                                                                                var74 += 2;
                                                                                             }
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2) {
                                                                                             var20[var87].field780 = var3.method4288((byte)95);
                                                                                             ++var87;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var16 > var87) {
                                                                                                var20[var87].field780 = var3.method4288((byte)95);
                                                                                                ++var87;
                                                                                             }

                                                                                             var88 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var16 < ~var88) {
                                                                                                   do {
                                                                                                      var89 = var20[var88];
                                                                                                      if (var89.field781 != null) {
                                                                                                         var89.field779 = var3.method4288((byte)71);
                                                                                                      }

                                                                                                      if (var89.field787 != null) {
                                                                                                         var89.field790 = var3.method4288((byte)76);
                                                                                                      }

                                                                                                      if (var89.field780 > 0) {
                                                                                                         var89.field786 = var3.method4288((byte)102);
                                                                                                      }

                                                                                                      ++var88;
                                                                                                   } while(~var16 < ~var88);
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var90].field788 = var3.method4288((byte)99);
                                                                                                   ++var90;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var16 < ~var90) {
                                                                                                      var20[var90].field788 = var3.method4288((byte)99);
                                                                                                      ++var90;
                                                                                                   }

                                                                                                   var91 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || ~var16 < ~var91) {
                                                                                                         do {
                                                                                                            var92 = var20[var91];
                                                                                                            if (var92.field788 > 0) {
                                                                                                               var92.field782 = var3.method4288((byte)113);
                                                                                                            }

                                                                                                            ++var91;
                                                                                                         } while(~var16 < ~var91);
                                                                                                      }

                                                                                                      var93 = 0;
                                                                                                      if (!var2 && ~var93 <= ~var16) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var94 = var20[var93];
                                                                                                         if (~var94.field782 < -1) {
                                                                                                            var94.field785 = var3.method4288((byte)73);
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
                                                                                          if (var57.field781 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                                var57.field781[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var57.field781.length < ~var59) {
                                                                                                var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                                var57.field781[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(~var56 > ~var16);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method4288((byte)77);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label3452:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var62 < ~var64) {
                                                                                                      this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var65 < var26.length) {
                                                                                                         do {
                                                                                                            label3515: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var62 = var66;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var67;
                                                                                                                  if (!var2) {
                                                                                                                     break label3515;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var62 = var66;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var67;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                         } while(var65 < var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || var62 < 128) {
                                                                                                         do {
                                                                                                            this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(var72 < 128);
                                                                                                      }
                                                                                                      break label3452;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method4288((byte)113);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 -= -1 - var3.method4288((byte)70);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var74 > ~var28.length) {
                                                                                                var73 -= -1 - var3.method4288((byte)70);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                label3593: {
                                                                                                   if (var2) {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   } else if (var75 <= var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label3593;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var78 > -1) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (var78 > 128) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field2467[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                      if (var75 <= var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label3632: {
                                                                                                   if (var2) {
                                                                                                      var79 = var28[var78];
                                                                                                   } else if (var28.length <= var78) {
                                                                                                      var79 = var75;
                                                                                                      if (!var2) {
                                                                                                         break label3632;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var79 = var28[var78];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label3649: {
                                                                                                         var80 = var28[var78 + 1] << 1;
                                                                                                         var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                         var82 = var75;
                                                                                                         if (var2) {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         } else if (~var79 >= ~var75) {
                                                                                                            var78 += 2;
                                                                                                            var76 = var80;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label3649;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var83 = var10000;
                                                                                                            var84 = (this.field2467[var82] & 255) + var83;
                                                                                                            if (var84 < 0) {
                                                                                                               var84 = 0;
                                                                                                            }

                                                                                                            if (~var84 < -129) {
                                                                                                               var84 = 128;
                                                                                                            }

                                                                                                            this.field2467[var82] = (byte)var84;
                                                                                                            var81 += -var76 + var80;
                                                                                                            ++var82;
                                                                                                            if (~var79 >= ~var82) {
                                                                                                               var78 += 2;
                                                                                                               var76 = var80;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
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
                                                                                                      var85 = (255 & this.field2467[var79]) + var76;
                                                                                                      if (var85 < 0) {
                                                                                                         var85 = 0;
                                                                                                      }

                                                                                                      if (var85 > 128) {
                                                                                                         var85 = 128;
                                                                                                      }

                                                                                                      this.field2467[var79] = (byte)var85;
                                                                                                      ++var79;
                                                                                                   } while(var79 < 128);
                                                                                                }

                                                                                                var86 = null;
                                                                                                break;
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field780 = var3.method4288((byte)95);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var16 > var87) {
                                                                                             var20[var87].field780 = var3.method4288((byte)95);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var16 < ~var88) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field781 != null) {
                                                                                                      var89.field779 = var3.method4288((byte)71);
                                                                                                   }

                                                                                                   if (var89.field787 != null) {
                                                                                                      var89.field790 = var3.method4288((byte)76);
                                                                                                   }

                                                                                                   if (var89.field780 > 0) {
                                                                                                      var89.field786 = var3.method4288((byte)102);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var16 < ~var88);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field788 = var3.method4288((byte)99);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var90) {
                                                                                                   var20[var90].field788 = var3.method4288((byte)99);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var16 < ~var91) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (var92.field788 > 0) {
                                                                                                            var92.field782 = var3.method4288((byte)113);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(~var16 < ~var91);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field782 < -1) {
                                                                                                         var94.field785 = var3.method4288((byte)73);
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
                                                                                 class68 var48 = var20[var47];
                                                                                 if (var48.field781 != null) {
                                                                                    int var49 = 1;
                                                                                    if (var2) {
                                                                                       var48.field781[var49] = var3.method4340(409855200);
                                                                                       var49 += 2;
                                                                                    }

                                                                                    while(var49 < var48.field781.length) {
                                                                                       var48.field781[var49] = var3.method4340(409855200);
                                                                                       var49 += 2;
                                                                                    }
                                                                                 }

                                                                                 if (var48.field787 == null) {
                                                                                    ++var47;
                                                                                 } else {
                                                                                    int var50 = 3;
                                                                                    if (var2) {
                                                                                       var48.field787[var50] = var3.method4340(409855200);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    while(var50 < var48.field787.length + -2) {
                                                                                       var48.field787[var50] = var3.method4340(409855200);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    ++var47;
                                                                                 }
                                                                              } while(~var16 < ~var47);

                                                                              if (var26 != null) {
                                                                                 var51 = 1;
                                                                                 if (var2 || var51 < var26.length) {
                                                                                    do {
                                                                                       var26[var51] = var3.method4340(409855200);
                                                                                       var51 += 2;
                                                                                    } while(var51 < var26.length);
                                                                                 }
                                                                              }

                                                                              if (var28 != null) {
                                                                                 var52 = 1;
                                                                                 if (var2) {
                                                                                    var28[var52] = var3.method4340(409855200);
                                                                                    var52 += 2;
                                                                                 }
                                                                              } else {
                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || ~var16 < ~var52) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field787 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && var55 >= var53.field787.length) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 = var54 + 1 + var3.method4288((byte)94);
                                                                                                   var53.field787[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var55 < var53.field787.length);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var16 < ~var52);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && ~var56 <= ~var16) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method4288((byte)77);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label1091:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var62 < ~var64) {
                                                                                                      this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var65 < var26.length) {
                                                                                                         do {
                                                                                                            label1154: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var62 = var66;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var67;
                                                                                                                  if (!var2) {
                                                                                                                     break label1154;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var62 = var66;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var67;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                         } while(var65 < var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || var62 < 128) {
                                                                                                         do {
                                                                                                            this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(var72 < 128);
                                                                                                      }
                                                                                                      break label1091;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method4288((byte)113);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 -= -1 - var3.method4288((byte)70);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var74 > ~var28.length) {
                                                                                                var73 -= -1 - var3.method4288((byte)70);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                label1232: {
                                                                                                   if (var2) {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   } else if (var75 <= var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label1232;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var78 > -1) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (var78 > 128) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field2467[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                      if (var75 <= var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label1271: {
                                                                                                   if (var2) {
                                                                                                      var79 = var28[var78];
                                                                                                   } else if (var28.length <= var78) {
                                                                                                      var79 = var75;
                                                                                                      if (!var2) {
                                                                                                         break label1271;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var79 = var28[var78];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label1288: {
                                                                                                         var80 = var28[var78 + 1] << 1;
                                                                                                         var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                         var82 = var75;
                                                                                                         if (var2) {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         } else if (~var79 >= ~var75) {
                                                                                                            var78 += 2;
                                                                                                            var76 = var80;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label1288;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var83 = var10000;
                                                                                                            var84 = (this.field2467[var82] & 255) + var83;
                                                                                                            if (var84 < 0) {
                                                                                                               var84 = 0;
                                                                                                            }

                                                                                                            if (~var84 < -129) {
                                                                                                               var84 = 128;
                                                                                                            }

                                                                                                            this.field2467[var82] = (byte)var84;
                                                                                                            var81 += -var76 + var80;
                                                                                                            ++var82;
                                                                                                            if (~var79 >= ~var82) {
                                                                                                               var78 += 2;
                                                                                                               var76 = var80;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
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
                                                                                                      var85 = (255 & this.field2467[var79]) + var76;
                                                                                                      if (var85 < 0) {
                                                                                                         var85 = 0;
                                                                                                      }

                                                                                                      if (var85 > 128) {
                                                                                                         var85 = 128;
                                                                                                      }

                                                                                                      this.field2467[var79] = (byte)var85;
                                                                                                      ++var79;
                                                                                                   } while(var79 < 128);
                                                                                                }

                                                                                                var86 = null;
                                                                                                break;
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field780 = var3.method4288((byte)95);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var16 > var87) {
                                                                                             var20[var87].field780 = var3.method4288((byte)95);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var16 < ~var88) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field781 != null) {
                                                                                                      var89.field779 = var3.method4288((byte)71);
                                                                                                   }

                                                                                                   if (var89.field787 != null) {
                                                                                                      var89.field790 = var3.method4288((byte)76);
                                                                                                   }

                                                                                                   if (var89.field780 > 0) {
                                                                                                      var89.field786 = var3.method4288((byte)102);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var16 < ~var88);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field788 = var3.method4288((byte)99);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var90) {
                                                                                                   var20[var90].field788 = var3.method4288((byte)99);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var16 < ~var91) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (var92.field788 > 0) {
                                                                                                            var92.field782 = var3.method4288((byte)113);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(~var16 < ~var91);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field782 < -1) {
                                                                                                         var94.field785 = var3.method4288((byte)73);
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
                                                                                       if (var57.field781 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                             var57.field781[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var57.field781.length < ~var59) {
                                                                                             var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                             var57.field781[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(~var56 > ~var16);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method4288((byte)77);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label1531:
                                                                                       while(true) {
                                                                                          while(var61 < var26.length) {
                                                                                             var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var62 < ~var64) {
                                                                                                   this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var65 < var26.length) {
                                                                                                      do {
                                                                                                         label1594: {
                                                                                                            var66 = var26[var65];
                                                                                                            var67 = var26[var65 - -1];
                                                                                                            var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                            } else if (~var66 >= ~var62) {
                                                                                                               var62 = var66;
                                                                                                               var65 += 2;
                                                                                                               var10000 = var67;
                                                                                                               if (!var2) {
                                                                                                                  break label1594;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               var68 += -var63 + var67;
                                                                                                               this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                               ++var69;
                                                                                                               if (~var66 >= ~var69) {
                                                                                                                  var62 = var66;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var67;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var63 = var10000;
                                                                                                      } while(var65 < var26.length);
                                                                                                   }

                                                                                                   var71 = null;
                                                                                                   var72 = var62;
                                                                                                   if (var2 || var62 < 128) {
                                                                                                      do {
                                                                                                         this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                         ++var72;
                                                                                                      } while(var72 < 128);
                                                                                                   }
                                                                                                   break label1531;
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var73 = var3.method4288((byte)113);
                                                                                       var28[0] = (byte)var73;
                                                                                       var74 = 2;
                                                                                       if (var2) {
                                                                                          var73 -= -1 - var3.method4288((byte)70);
                                                                                          var28[var74] = (byte)var73;
                                                                                          var74 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var74 > ~var28.length) {
                                                                                             var73 -= -1 - var3.method4288((byte)70);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          var75 = var28[0];
                                                                                          var76 = var28[1] << 1;
                                                                                          var77 = 0;
                                                                                          if (!var2) {
                                                                                             label1672: {
                                                                                                if (var2) {
                                                                                                   var78 = (this.field2467[var77] & 255) + var76;
                                                                                                } else if (var75 <= var77) {
                                                                                                   var78 = 2;
                                                                                                   if (!var2) {
                                                                                                      break label1672;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = (this.field2467[var77] & 255) + var76;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var78 > -1) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (var78 > 128) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field2467[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                   if (var75 <= var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label1711: {
                                                                                                if (var2) {
                                                                                                   var79 = var28[var78];
                                                                                                } else if (var28.length <= var78) {
                                                                                                   var79 = var75;
                                                                                                   if (!var2) {
                                                                                                      break label1711;
                                                                                                   }
                                                                                                } else {
                                                                                                   var79 = var28[var78];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label1728: {
                                                                                                      var80 = var28[var78 + 1] << 1;
                                                                                                      var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                      var82 = var75;
                                                                                                      if (var2) {
                                                                                                         var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                      } else if (~var79 >= ~var75) {
                                                                                                         var78 += 2;
                                                                                                         var76 = var80;
                                                                                                         var10000 = var79;
                                                                                                         if (!var2) {
                                                                                                            break label1728;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var83 = var10000;
                                                                                                         var84 = (this.field2467[var82] & 255) + var83;
                                                                                                         if (var84 < 0) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (~var84 < -129) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field2467[var82] = (byte)var84;
                                                                                                         var81 += -var76 + var80;
                                                                                                         ++var82;
                                                                                                         if (~var79 >= ~var82) {
                                                                                                            var78 += 2;
                                                                                                            var76 = var80;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var75 = var10000;
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
                                                                                                   var85 = (255 & this.field2467[var79]) + var76;
                                                                                                   if (var85 < 0) {
                                                                                                      var85 = 0;
                                                                                                   }

                                                                                                   if (var85 > 128) {
                                                                                                      var85 = 128;
                                                                                                   }

                                                                                                   this.field2467[var79] = (byte)var85;
                                                                                                   ++var79;
                                                                                                } while(var79 < 128);
                                                                                             }

                                                                                             var86 = null;
                                                                                             break;
                                                                                          }

                                                                                          var74 += 2;
                                                                                       }
                                                                                    }

                                                                                    var87 = 0;
                                                                                    if (var2) {
                                                                                       var20[var87].field780 = var3.method4288((byte)95);
                                                                                       ++var87;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(var16 > var87) {
                                                                                          var20[var87].field780 = var3.method4288((byte)95);
                                                                                          ++var87;
                                                                                       }

                                                                                       var88 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || ~var16 < ~var88) {
                                                                                             do {
                                                                                                var89 = var20[var88];
                                                                                                if (var89.field781 != null) {
                                                                                                   var89.field779 = var3.method4288((byte)71);
                                                                                                }

                                                                                                if (var89.field787 != null) {
                                                                                                   var89.field790 = var3.method4288((byte)76);
                                                                                                }

                                                                                                if (var89.field780 > 0) {
                                                                                                   var89.field786 = var3.method4288((byte)102);
                                                                                                }

                                                                                                ++var88;
                                                                                             } while(~var16 < ~var88);
                                                                                          }

                                                                                          var90 = 0;
                                                                                          if (var2) {
                                                                                             var20[var90].field788 = var3.method4288((byte)99);
                                                                                             ++var90;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var16 < ~var90) {
                                                                                                var20[var90].field788 = var3.method4288((byte)99);
                                                                                                ++var90;
                                                                                             }

                                                                                             var91 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var16 < ~var91) {
                                                                                                   do {
                                                                                                      var92 = var20[var91];
                                                                                                      if (var92.field788 > 0) {
                                                                                                         var92.field782 = var3.method4288((byte)113);
                                                                                                      }

                                                                                                      ++var91;
                                                                                                   } while(~var16 < ~var91);
                                                                                                }

                                                                                                var93 = 0;
                                                                                                if (!var2 && ~var93 <= ~var16) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var94 = var20[var93];
                                                                                                   if (~var94.field782 < -1) {
                                                                                                      var94.field785 = var3.method4288((byte)73);
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
                                                                                 while(var52 < var28.length) {
                                                                                    var28[var52] = var3.method4340(409855200);
                                                                                    var52 += 2;
                                                                                 }

                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || ~var16 < ~var52) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field787 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && var55 >= var53.field787.length) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 = var54 + 1 + var3.method4288((byte)94);
                                                                                                   var53.field787[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var55 < var53.field787.length);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var16 < ~var52);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && ~var56 <= ~var16) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method4288((byte)77);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label589:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var62 < ~var64) {
                                                                                                      this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var65 < var26.length) {
                                                                                                         do {
                                                                                                            label652: {
                                                                                                               var66 = var26[var65];
                                                                                                               var67 = var26[var65 - -1];
                                                                                                               var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var62 = var66;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var67;
                                                                                                                  if (!var2) {
                                                                                                                     break label652;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var62 = var66;
                                                                                                                     var65 += 2;
                                                                                                                     var10000 = var67;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                         } while(var65 < var26.length);
                                                                                                      }

                                                                                                      var71 = null;
                                                                                                      var72 = var62;
                                                                                                      if (var2 || var62 < 128) {
                                                                                                         do {
                                                                                                            this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                            ++var72;
                                                                                                         } while(var72 < 128);
                                                                                                      }
                                                                                                      break label589;
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var73 = var3.method4288((byte)113);
                                                                                          var28[0] = (byte)var73;
                                                                                          var74 = 2;
                                                                                          if (var2) {
                                                                                             var73 -= -1 - var3.method4288((byte)70);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var74 > ~var28.length) {
                                                                                                var73 -= -1 - var3.method4288((byte)70);
                                                                                                var28[var74] = (byte)var73;
                                                                                                var74 += 2;
                                                                                             }

                                                                                             var75 = var28[0];
                                                                                             var76 = var28[1] << 1;
                                                                                             var77 = 0;
                                                                                             if (!var2) {
                                                                                                label730: {
                                                                                                   if (var2) {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   } else if (var75 <= var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label730;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var78 > -1) {
                                                                                                         var78 = 0;
                                                                                                      }

                                                                                                      if (var78 > 128) {
                                                                                                         var78 = 128;
                                                                                                      }

                                                                                                      this.field2467[var77] = (byte)var78;
                                                                                                      ++var77;
                                                                                                      if (var75 <= var77) {
                                                                                                         var78 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = (this.field2467[var77] & 255) + var76;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label769: {
                                                                                                   if (var2) {
                                                                                                      var79 = var28[var78];
                                                                                                   } else if (var28.length <= var78) {
                                                                                                      var79 = var75;
                                                                                                      if (!var2) {
                                                                                                         break label769;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var79 = var28[var78];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label786: {
                                                                                                         var80 = var28[var78 + 1] << 1;
                                                                                                         var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                         var82 = var75;
                                                                                                         if (var2) {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         } else if (~var79 >= ~var75) {
                                                                                                            var78 += 2;
                                                                                                            var76 = var80;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label786;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var83 = var10000;
                                                                                                            var84 = (this.field2467[var82] & 255) + var83;
                                                                                                            if (var84 < 0) {
                                                                                                               var84 = 0;
                                                                                                            }

                                                                                                            if (~var84 < -129) {
                                                                                                               var84 = 128;
                                                                                                            }

                                                                                                            this.field2467[var82] = (byte)var84;
                                                                                                            var81 += -var76 + var80;
                                                                                                            ++var82;
                                                                                                            if (~var79 >= ~var82) {
                                                                                                               var78 += 2;
                                                                                                               var76 = var80;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
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
                                                                                                      var85 = (255 & this.field2467[var79]) + var76;
                                                                                                      if (var85 < 0) {
                                                                                                         var85 = 0;
                                                                                                      }

                                                                                                      if (var85 > 128) {
                                                                                                         var85 = 128;
                                                                                                      }

                                                                                                      this.field2467[var79] = (byte)var85;
                                                                                                      ++var79;
                                                                                                   } while(var79 < 128);
                                                                                                }

                                                                                                var86 = null;
                                                                                                break;
                                                                                             }

                                                                                             var74 += 2;
                                                                                          }
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2) {
                                                                                          var20[var87].field780 = var3.method4288((byte)95);
                                                                                          ++var87;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var16 > var87) {
                                                                                             var20[var87].field780 = var3.method4288((byte)95);
                                                                                             ++var87;
                                                                                          }

                                                                                          var88 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || ~var16 < ~var88) {
                                                                                                do {
                                                                                                   var89 = var20[var88];
                                                                                                   if (var89.field781 != null) {
                                                                                                      var89.field779 = var3.method4288((byte)71);
                                                                                                   }

                                                                                                   if (var89.field787 != null) {
                                                                                                      var89.field790 = var3.method4288((byte)76);
                                                                                                   }

                                                                                                   if (var89.field780 > 0) {
                                                                                                      var89.field786 = var3.method4288((byte)102);
                                                                                                   }

                                                                                                   ++var88;
                                                                                                } while(~var16 < ~var88);
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2) {
                                                                                                var20[var90].field788 = var3.method4288((byte)99);
                                                                                                ++var90;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var90) {
                                                                                                   var20[var90].field788 = var3.method4288((byte)99);
                                                                                                   ++var90;
                                                                                                }

                                                                                                var91 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || ~var16 < ~var91) {
                                                                                                      do {
                                                                                                         var92 = var20[var91];
                                                                                                         if (var92.field788 > 0) {
                                                                                                            var92.field782 = var3.method4288((byte)113);
                                                                                                         }

                                                                                                         ++var91;
                                                                                                      } while(~var16 < ~var91);
                                                                                                   }

                                                                                                   var93 = 0;
                                                                                                   if (!var2 && ~var93 <= ~var16) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var94 = var20[var93];
                                                                                                      if (~var94.field782 < -1) {
                                                                                                         var94.field785 = var3.method4288((byte)73);
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
                                                                                       if (var57.field781 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                             var57.field781[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var57.field781.length < ~var59) {
                                                                                             var58 = var3.method4288((byte)79) + var58 + 1;
                                                                                             var57.field781[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(~var56 > ~var16);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method4288((byte)77);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label539:
                                                                                       while(true) {
                                                                                          while(var61 < var26.length) {
                                                                                             var60 = 1 + (var60 - -var3.method4288((byte)80));
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var62 < ~var64) {
                                                                                                   this.field2465[var64] = (byte)(this.field2465[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var65 < var26.length) {
                                                                                                      do {
                                                                                                         label497: {
                                                                                                            var66 = var26[var65];
                                                                                                            var67 = var26[var65 - -1];
                                                                                                            var68 = (-var62 + var66) / 2 + (var66 - var62) * var63;
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                            } else if (~var66 >= ~var62) {
                                                                                                               var62 = var66;
                                                                                                               var65 += 2;
                                                                                                               var10000 = var67;
                                                                                                               if (!var2) {
                                                                                                                  break label497;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               var68 += -var63 + var67;
                                                                                                               this.field2465[var69] = (byte)(this.field2465[var69] * var70 + 32 >> 6);
                                                                                                               ++var69;
                                                                                                               if (~var66 >= ~var69) {
                                                                                                                  var62 = var66;
                                                                                                                  var65 += 2;
                                                                                                                  var10000 = var67;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class727.method5290(-var62 + var66, (byte)90, var68);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var63 = var10000;
                                                                                                      } while(var65 < var26.length);
                                                                                                   }

                                                                                                   var71 = null;
                                                                                                   var72 = var62;
                                                                                                   if (var2 || var62 < 128) {
                                                                                                      do {
                                                                                                         this.field2465[var72] = (byte)(this.field2465[var72] * var63 + 32 >> 6);
                                                                                                         ++var72;
                                                                                                      } while(var72 < 128);
                                                                                                   }
                                                                                                   break label539;
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var73 = var3.method4288((byte)113);
                                                                                       var28[0] = (byte)var73;
                                                                                       var74 = 2;
                                                                                       if (var2) {
                                                                                          var73 -= -1 - var3.method4288((byte)70);
                                                                                          var28[var74] = (byte)var73;
                                                                                          var74 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var74 > ~var28.length) {
                                                                                             var73 -= -1 - var3.method4288((byte)70);
                                                                                             var28[var74] = (byte)var73;
                                                                                             var74 += 2;
                                                                                          }

                                                                                          var75 = var28[0];
                                                                                          var76 = var28[1] << 1;
                                                                                          var77 = 0;
                                                                                          if (!var2) {
                                                                                             label422: {
                                                                                                if (var2) {
                                                                                                   var78 = (this.field2467[var77] & 255) + var76;
                                                                                                } else if (var75 <= var77) {
                                                                                                   var78 = 2;
                                                                                                   if (!var2) {
                                                                                                      break label422;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = (this.field2467[var77] & 255) + var76;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var78 > -1) {
                                                                                                      var78 = 0;
                                                                                                   }

                                                                                                   if (var78 > 128) {
                                                                                                      var78 = 128;
                                                                                                   }

                                                                                                   this.field2467[var77] = (byte)var78;
                                                                                                   ++var77;
                                                                                                   if (var75 <= var77) {
                                                                                                      var78 = 2;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = (this.field2467[var77] & 255) + var76;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label404: {
                                                                                                if (var2) {
                                                                                                   var79 = var28[var78];
                                                                                                } else if (var28.length <= var78) {
                                                                                                   var79 = var75;
                                                                                                   if (!var2) {
                                                                                                      break label404;
                                                                                                   }
                                                                                                } else {
                                                                                                   var79 = var28[var78];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label401: {
                                                                                                      var80 = var28[var78 + 1] << 1;
                                                                                                      var81 = (var79 - var75) * var76 - -((-var75 + var79) / 2);
                                                                                                      var82 = var75;
                                                                                                      if (var2) {
                                                                                                         var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                      } else if (~var79 >= ~var75) {
                                                                                                         var78 += 2;
                                                                                                         var76 = var80;
                                                                                                         var10000 = var79;
                                                                                                         if (!var2) {
                                                                                                            break label401;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var83 = var10000;
                                                                                                         var84 = (this.field2467[var82] & 255) + var83;
                                                                                                         if (var84 < 0) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (~var84 < -129) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field2467[var82] = (byte)var84;
                                                                                                         var81 += -var76 + var80;
                                                                                                         ++var82;
                                                                                                         if (~var79 >= ~var82) {
                                                                                                            var78 += 2;
                                                                                                            var76 = var80;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class727.method5290(var79 - var75, (byte)58, var81);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var75 = var10000;
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
                                                                                                   var85 = (255 & this.field2467[var79]) + var76;
                                                                                                   if (var85 < 0) {
                                                                                                      var85 = 0;
                                                                                                   }

                                                                                                   if (var85 > 128) {
                                                                                                      var85 = 128;
                                                                                                   }

                                                                                                   this.field2467[var79] = (byte)var85;
                                                                                                   ++var79;
                                                                                                } while(var79 < 128);
                                                                                             }

                                                                                             var86 = null;
                                                                                             break;
                                                                                          }

                                                                                          var74 += 2;
                                                                                       }
                                                                                    }

                                                                                    var87 = 0;
                                                                                    if (var2) {
                                                                                       var20[var87].field780 = var3.method4288((byte)95);
                                                                                       ++var87;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(var16 > var87) {
                                                                                          var20[var87].field780 = var3.method4288((byte)95);
                                                                                          ++var87;
                                                                                       }

                                                                                       var88 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || ~var16 < ~var88) {
                                                                                             do {
                                                                                                var89 = var20[var88];
                                                                                                if (var89.field781 != null) {
                                                                                                   var89.field779 = var3.method4288((byte)71);
                                                                                                }

                                                                                                if (var89.field787 != null) {
                                                                                                   var89.field790 = var3.method4288((byte)76);
                                                                                                }

                                                                                                if (var89.field780 > 0) {
                                                                                                   var89.field786 = var3.method4288((byte)102);
                                                                                                }

                                                                                                ++var88;
                                                                                             } while(~var16 < ~var88);
                                                                                          }

                                                                                          var90 = 0;
                                                                                          if (var2) {
                                                                                             var20[var90].field788 = var3.method4288((byte)99);
                                                                                             ++var90;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var16 < ~var90) {
                                                                                                var20[var90].field788 = var3.method4288((byte)99);
                                                                                                ++var90;
                                                                                             }

                                                                                             var91 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || ~var16 < ~var91) {
                                                                                                   do {
                                                                                                      var92 = var20[var91];
                                                                                                      if (var92.field788 > 0) {
                                                                                                         var92.field782 = var3.method4288((byte)113);
                                                                                                      }

                                                                                                      ++var91;
                                                                                                   } while(~var16 < ~var91);
                                                                                                }

                                                                                                var93 = 0;
                                                                                                if (!var2 && ~var93 <= ~var16) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var94 = var20[var93];
                                                                                                   if (~var94.field782 < -1) {
                                                                                                      var94.field785 = var3.method4288((byte)73);
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
                                                                  } else if (~this.field2472[var44] != -1) {
                                                                     if (~var35 == -1) {
                                                                        label3885: {
                                                                           var43 = var20[var15[var36]];
                                                                           if (var13.length <= var36) {
                                                                              var35 = -1;
                                                                              if (!var2) {
                                                                                 break label3885;
                                                                              }
                                                                           }

                                                                           var35 = var13[var36++];
                                                                        }
                                                                     }

                                                                     --var35;
                                                                     this.field2468[var44] = var43;
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
         throw class534.method3846(var96, field2475[3] + (arg0 != null ? field2475[0] : field2475[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1518(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1519(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
