import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class360 extends class347 {
   @OriginalMember(
      owner = "client!dj",
      name = "v",
      descriptor = "[Lfaa;"
   )
   public class164[] field5423;
   @OriginalMember(
      owner = "client!dj",
      name = "t",
      descriptor = "[S"
   )
   public short[] field5425;
   @OriginalMember(
      owner = "client!dj",
      name = "r",
      descriptor = "[Ljaa;"
   )
   public class640[] field5434;
   @OriginalMember(
      owner = "client!dj",
      name = "w",
      descriptor = "[B"
   )
   public byte[] field5427;
   @OriginalMember(
      owner = "client!dj",
      name = "l",
      descriptor = "[I"
   )
   private int[] field5429;
   @OriginalMember(
      owner = "client!dj",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field5430;
   @OriginalMember(
      owner = "client!dj",
      name = "q",
      descriptor = "[B"
   )
   public byte[] field5422;
   @OriginalMember(
      owner = "client!dj",
      name = "k",
      descriptor = "I"
   )
   public int field5431;
   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5437 = new String[]{method2810(method2809("qg/7\"")), method2810(method2809("n#/[w")), method2810(method2809("{xm\u0019")), method2810(method2809("qg/6\"")), method2810(method2809("qg/Ic{duK\"")), method2810(method2809("qg/4\""))};
   @OriginalMember(
      owner = "client!dj",
      name = "m",
      descriptor = "Lsd;"
   )
   public static class101 field5428 = new class101(118, -1);
   @OriginalMember(
      owner = "client!dj",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field5433 = new int[6];
   @OriginalMember(
      owner = "client!dj",
      name = "p",
      descriptor = "I"
   )
   public static int field5436 = 0;
   @OriginalMember(
      owner = "client!dj",
      name = "o",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field5435 = new Hashtable();
   @OriginalMember(
      owner = "client!dj",
      name = "i",
      descriptor = "I"
   )
   public static int field5424;
   @OriginalMember(
      owner = "client!dj",
      name = "u",
      descriptor = "I"
   )
   public static int field5426;
   @OriginalMember(
      owner = "client!dj",
      name = "s",
      descriptor = "I"
   )
   public static int field5432;

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "([BI[ILdu;)Z"
   )
   public final boolean method2806(byte[] arg0, int arg1, int[] arg2, class374 arg3) {
      int var5 = client.field4530;

      try {
         ++field5426;
         byte var6 = 1;
         int var7 = 0;
         class640 var8 = null;
         int var9 = 0;
         int var10 = 56 / ((17 - arg1) / 35);

         while(true) {
            label68: {
               int var10000;
               if (var9 >= 128) {
                  var10000 = var6;
                  if (var5 == 0) {
                     return (boolean)var6;
                  }
               } else {
                  if (arg0 != null && arg0[var9] == 0) {
                     break label68;
                  }

                  var10000 = this.field5429[var9];
               }

               int var11 = var10000;
               if (var11 != 0) {
                  if (var7 != var11) {
                     label58: {
                        var7 = var11--;
                        if (~(1 & var11) != -1) {
                           var8 = arg3.method2903(true, arg2, var11 >> 2);
                           if (var5 == 0) {
                              break label58;
                           }
                        }

                        var8 = arg3.method2902(true, arg2, var11 >> 2);
                     }

                     if (var8 == null) {
                        var6 = 0;
                     }
                  }

                  if (var8 != null) {
                     this.field5434[var9] = var8;
                     this.field5429[var9] = 0;
                  }
               }
            }

            ++var9;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5437[0] + (arg0 != null ? field5437[1] : field5437[2]) + ',' + arg1 + ',' + (arg2 != null ? field5437[1] : field5437[2]) + ',' + (arg3 != null ? field5437[1] : field5437[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2807(int arg0) {
      try {
         if (arg0 != 29698) {
            method2808((byte)15);
         }

         this.field5429 = null;
         ++field5424;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5437[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2808(byte arg0) {
      try {
         field5435 = null;
         field5428 = null;
         field5433 = null;
         if (arg0 != -83) {
            method2808((byte)35);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5437[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "<init>",
      descriptor = "()V"
   )
   public class360() {
   }

   @OriginalMember(
      owner = "client!dj",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class360(byte[] arg0) {
      int var2 = client.field4530;
      super();

      try {
         this.field5423 = new class164[128];
         this.field5425 = new short[128];
         this.field5434 = new class640[128];
         this.field5427 = new byte[128];
         this.field5429 = new int[128];
         this.field5430 = new byte[128];
         this.field5422 = new byte[128];
         class128 var3 = new class128(arg0);
         int var4 = 0;
         if (var2 != 0) {
            ++var4;
         }

         while(~var3.field1552[var3.field1590 + var4] != -1) {
            ++var4;
         }

         byte[] var5 = new byte[var4];
         int var6 = 0;
         if (var2 != 0) {
            var5[var6] = var3.method1047((byte)116);
            ++var6;
         }

         while(true) {
            while(var4 > var6) {
               var5[var6] = var3.method1047((byte)116);
               ++var6;
            }

            ++var3.field1590;
            ++var4;
            int var7 = var3.field1590;
            var3.field1590 += var4;
            int var8 = 0;
            if (var2 == 0) {
               if (var2 != 0) {
                  ++var8;
               }

               while(var3.field1552[var3.field1590 + var8] != 0) {
                  ++var8;
               }

               byte[] var9 = new byte[var8];
               int var10 = 0;
               if (var2 != 0) {
                  var9[var10] = var3.method1047((byte)21);
                  ++var10;
               }

               while(true) {
                  while(~var8 < ~var10) {
                     var9[var10] = var3.method1047((byte)21);
                     ++var10;
                  }

                  ++var8;
                  ++var3.field1590;
                  int var11 = var3.field1590;
                  var3.field1590 += var8;
                  int var12 = 0;
                  if (var2 == 0) {
                     if (var2 != 0) {
                        ++var12;
                     }

                     while(~var3.field1552[var3.field1590 - -var12] != -1) {
                        ++var12;
                     }

                     byte[] var13 = new byte[var12];
                     int var14 = 0;
                     if (var2 != 0) {
                        var13[var14] = var3.method1047((byte)78);
                        ++var14;
                     }

                     while(true) {
                        while(var12 > var14) {
                           var13[var14] = var3.method1047((byte)78);
                           ++var14;
                        }

                        ++var3.field1590;
                        ++var12;
                        byte[] var15 = new byte[var12];
                        if (var2 == 0) {
                           int var16;
                           label4352: {
                              if (~var12 < -2) {
                                 var15[1] = 1;
                                 var16 = 2;
                                 int var17 = 1;
                                 int var18 = 2;
                                 if (var2 != 0 || ~var12 < ~var18) {
                                    do {
                                       int var19 = var3.method1104(255);
                                       if (var19 != 0) {
                                          if (~var17 <= ~var19) {
                                             --var19;
                                          }

                                          var17 = var19;
                                          if (var2 != 0) {
                                             var17 = var16++;
                                          }
                                       } else {
                                          var17 = var16++;
                                       }

                                       var15[var18] = (byte)var17;
                                       ++var18;
                                    } while(~var12 < ~var18);
                                 }

                                 if (var2 == 0) {
                                    break label4352;
                                 }
                              }

                              var16 = var12;
                           }

                           class164[] var20 = new class164[var16];
                           int var21 = 0;
                           class164 var22;
                           int var23;
                           int var24;
                           if (var2 != 0) {
                              var22 = var20[var21] = new class164();
                              var23 = var3.method1104(255);
                              if (var23 > 0) {
                                 var22.field2060 = new byte[var23 * 2];
                              }

                              var24 = var3.method1104(255);
                              if (var24 > 0) {
                                 var22.field2061 = new byte[var24 * 2 + 2];
                                 var22.field2061[1] = 64;
                              }

                              ++var21;
                           }

                           while(var20.length > var21) {
                              var22 = var20[var21] = new class164();
                              var23 = var3.method1104(255);
                              if (var23 > 0) {
                                 var22.field2060 = new byte[var23 * 2];
                              }

                              var24 = var3.method1104(255);
                              if (var24 > 0) {
                                 var22.field2061 = new byte[var24 * 2 + 2];
                                 var22.field2061[1] = 64;
                              }

                              ++var21;
                           }

                           int var25 = var3.method1104(255);
                           byte[] var26 = var25 <= 0 ? null : new byte[var25 * 2];
                           int var27 = var3.method1104(255);
                           byte[] var28 = ~var27 >= -1 ? null : new byte[var27 * 2];
                           int var29 = 0;
                           if (var2 != 0) {
                              ++var29;
                           }

                           while(var3.field1552[var3.field1590 + var29] != 0) {
                              ++var29;
                           }

                           byte[] var30 = new byte[var29];
                           int var31 = 0;
                           if (var2 != 0) {
                              var30[var31] = var3.method1047((byte)5);
                              ++var31;
                           }

                           while(true) {
                              while(~var29 < ~var31) {
                                 var30[var31] = var3.method1047((byte)5);
                                 ++var31;
                              }

                              ++var3.field1590;
                              ++var29;
                              int var32 = 0;
                              int var33 = 0;
                              if (var2 == 0) {
                                 if (var2 != 0) {
                                    var32 += var3.method1104(255);
                                    this.field5425[var33] = (short)var32;
                                    ++var33;
                                 }

                                 while(true) {
                                    while(var33 < 128) {
                                       var32 += var3.method1104(255);
                                       this.field5425[var33] = (short)var32;
                                       ++var33;
                                    }

                                    var32 = 0;
                                    int var34 = 0;
                                    if (var2 == 0) {
                                       if (var2 != 0) {
                                          var32 += var3.method1104(255);
                                          this.field5425[var34] = (short)(this.field5425[var34] + (var32 << 8));
                                          ++var34;
                                       }

                                       while(true) {
                                          while(~var34 > -129) {
                                             var32 += var3.method1104(255);
                                             this.field5425[var34] = (short)(this.field5425[var34] + (var32 << 8));
                                             ++var34;
                                          }

                                          int var35 = 0;
                                          int var36 = 0;
                                          int var37 = 0;
                                          int var38 = 0;
                                          if (var2 == 0) {
                                             if (var2 != 0) {
                                                if (var35 == 0) {
                                                   if (var30.length > var36) {
                                                      var35 = var30[var36++];
                                                      if (var2 != 0) {
                                                         var35 = -1;
                                                      }
                                                   } else {
                                                      var35 = -1;
                                                   }

                                                   var37 = var3.method1065(false);
                                                }

                                                this.field5425[var38] = (short)(this.field5425[var38] + class153.method1262(var37 + -1 << 14, 32768));
                                                this.field5429[var38] = var37;
                                                --var35;
                                                ++var38;
                                             }

                                             while(true) {
                                                while(var38 < 128) {
                                                   if (var35 == 0) {
                                                      if (var30.length > var36) {
                                                         var35 = var30[var36++];
                                                         if (var2 != 0) {
                                                            var35 = -1;
                                                         }
                                                      } else {
                                                         var35 = -1;
                                                      }

                                                      var37 = var3.method1065(false);
                                                   }

                                                   this.field5425[var38] = (short)(this.field5425[var38] + class153.method1262(var37 + -1 << 14, 32768));
                                                   this.field5429[var38] = var37;
                                                   --var35;
                                                   ++var38;
                                                }

                                                var36 = 0;
                                                var35 = 0;
                                                int var39 = 0;
                                                int var40 = 0;
                                                if (var2 == 0) {
                                                   if (var2 != 0) {
                                                      if (~this.field5429[var40] != -1) {
                                                         if (var35 == 0) {
                                                            if (~var5.length < ~var36) {
                                                               var35 = var5[var36++];
                                                               if (var2 != 0) {
                                                                  var35 = -1;
                                                               }
                                                            } else {
                                                               var35 = -1;
                                                            }

                                                            var39 = -1 + var3.field1552[var7++];
                                                         }

                                                         this.field5422[var40] = (byte)var39;
                                                         --var35;
                                                         ++var40;
                                                      } else {
                                                         ++var40;
                                                      }
                                                   }

                                                   while(true) {
                                                      while(~var40 > -129) {
                                                         if (~this.field5429[var40] != -1) {
                                                            if (var35 == 0) {
                                                               if (~var5.length < ~var36) {
                                                                  var35 = var5[var36++];
                                                                  if (var2 != 0) {
                                                                     var35 = -1;
                                                                  }
                                                               } else {
                                                                  var35 = -1;
                                                               }

                                                               var39 = -1 + var3.field1552[var7++];
                                                            }

                                                            this.field5422[var40] = (byte)var39;
                                                            --var35;
                                                            ++var40;
                                                         } else {
                                                            ++var40;
                                                         }
                                                      }

                                                      var36 = 0;
                                                      var35 = 0;
                                                      int var41 = 0;
                                                      int var42 = 0;
                                                      if (var2 == 0) {
                                                         if (var2 != 0) {
                                                            if (this.field5429[var42] != 0) {
                                                               if (var35 == 0) {
                                                                  if (var36 >= var9.length) {
                                                                     var35 = -1;
                                                                     if (var2 != 0) {
                                                                        var35 = var9[var36++];
                                                                     }
                                                                  } else {
                                                                     var35 = var9[var36++];
                                                                  }

                                                                  var41 = var3.field1552[var11++] + 16 << 2;
                                                               }

                                                               this.field5430[var42] = (byte)var41;
                                                               --var35;
                                                               ++var42;
                                                            } else {
                                                               ++var42;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(var42 < 128) {
                                                               if (this.field5429[var42] != 0) {
                                                                  if (var35 == 0) {
                                                                     if (var36 >= var9.length) {
                                                                        var35 = -1;
                                                                        if (var2 != 0) {
                                                                           var35 = var9[var36++];
                                                                        }
                                                                     } else {
                                                                        var35 = var9[var36++];
                                                                     }

                                                                     var41 = var3.field1552[var11++] + 16 << 2;
                                                                  }

                                                                  this.field5430[var42] = (byte)var41;
                                                                  --var35;
                                                                  ++var42;
                                                               } else {
                                                                  ++var42;
                                                               }
                                                            }

                                                            var35 = 0;
                                                            var36 = 0;
                                                            class164 var43 = null;
                                                            int var44 = 0;
                                                            if (var2 == 0) {
                                                               while(true) {
                                                                  if (~var44 <= -129) {
                                                                     var35 = 0;
                                                                     var36 = 0;
                                                                     int var45 = 0;
                                                                     int var46 = 0;
                                                                     if (var2 == 0) {
                                                                        if (var2 != 0) {
                                                                           if (~var35 == -1) {
                                                                              if (var36 >= var30.length) {
                                                                                 var35 = -1;
                                                                                 if (var2 != 0) {
                                                                                    var35 = var30[var36++];
                                                                                 }
                                                                              } else {
                                                                                 var35 = var30[var36++];
                                                                              }

                                                                              if (~this.field5429[var46] < -1) {
                                                                                 var45 = 1 + var3.method1104(255);
                                                                              }
                                                                           }

                                                                           this.field5427[var46] = (byte)var45;
                                                                           --var35;
                                                                           ++var46;
                                                                        }

                                                                        while(true) {
                                                                           while(~var46 > -129) {
                                                                              if (~var35 == -1) {
                                                                                 if (var36 >= var30.length) {
                                                                                    var35 = -1;
                                                                                    if (var2 != 0) {
                                                                                       var35 = var30[var36++];
                                                                                    }
                                                                                 } else {
                                                                                    var35 = var30[var36++];
                                                                                 }

                                                                                 if (~this.field5429[var46] < -1) {
                                                                                    var45 = 1 + var3.method1104(255);
                                                                                 }
                                                                              }

                                                                              this.field5427[var46] = (byte)var45;
                                                                              --var35;
                                                                              ++var46;
                                                                           }

                                                                           this.field5431 = 1 + var3.method1104(255);
                                                                           int var47 = 0;
                                                                           if (var2 == 0) {
                                                                              int var10000;
                                                                              int var51;
                                                                              int var52;
                                                                              class164 var53;
                                                                              int var54;
                                                                              int var55;
                                                                              int var56;
                                                                              class164 var57;
                                                                              int var58;
                                                                              int var59;
                                                                              int var60;
                                                                              int var61;
                                                                              int var62;
                                                                              int var63;
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
                                                                              class164 var88;
                                                                              int var89;
                                                                              int var90;
                                                                              class164 var91;
                                                                              int var92;
                                                                              class164 var93;
                                                                              if (var2 == 0 && ~var47 <= ~var16) {
                                                                                 if (var26 != null) {
                                                                                    var51 = 1;
                                                                                    if (var2 != 0 || var51 < var26.length) {
                                                                                       do {
                                                                                          var26[var51] = var3.method1047((byte)121);
                                                                                          var51 += 2;
                                                                                       } while(var51 < var26.length);
                                                                                    }
                                                                                 }

                                                                                 if (var28 != null) {
                                                                                    var52 = 1;
                                                                                    if (var2 != 0) {
                                                                                       var28[var52] = var3.method1047((byte)71);
                                                                                       var52 += 2;
                                                                                    }
                                                                                 } else {
                                                                                    var52 = 0;
                                                                                    if (var2 == 0) {
                                                                                       if (var2 != 0 || ~var52 > ~var16) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field2061 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (var2 == 0 && var53.field2061.length <= var55) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 -= -1 + -var3.method1104(255);
                                                                                                      var53.field2061[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var53.field2061.length > var55);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var52 > ~var16);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (var2 == 0 && var16 <= var56) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method1104(255);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2 != 0) {
                                                                                                var60 = var60 + 1 + var3.method1104(255);
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label2205:
                                                                                             while(true) {
                                                                                                while(var61 < var26.length) {
                                                                                                   var60 = var60 + 1 + var3.method1104(255);
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   if (var2 != 0) {
                                                                                                      this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var64 < var62) {
                                                                                                         this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         label2258: {
                                                                                                            if (var2 != 0) {
                                                                                                               var66 = var26[var65];
                                                                                                            } else if (var65 >= var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (var2 == 0) {
                                                                                                                  break label2258;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label2275: {
                                                                                                                  var67 = var26[var65 + 1];
                                                                                                                  var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                                  var69 = var62;
                                                                                                                  if (var2 != 0) {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  } else if (~var66 >= ~var62) {
                                                                                                                     var65 += 2;
                                                                                                                     var62 = var66;
                                                                                                                     var10000 = var67;
                                                                                                                     if (var2 == 0) {
                                                                                                                        break label2275;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     ++var69;
                                                                                                                     if (~var66 >= ~var69) {
                                                                                                                        var65 += 2;
                                                                                                                        var62 = var66;
                                                                                                                        var10000 = var67;
                                                                                                                        if (var2 == 0) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var63 = var10000;
                                                                                                               if (var65 >= var26.length) {
                                                                                                                  var66 = var62;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var66 = var26[var65];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2 != 0) {
                                                                                                            this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            while(var66 < 128) {
                                                                                                               this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                               ++var66;
                                                                                                            }

                                                                                                            if (var2 == 0) {
                                                                                                               var71 = null;
                                                                                                               break label2205;
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
                                                                                             var72 = var3.method1104(255);
                                                                                             var28[0] = (byte)var72;
                                                                                             var73 = 2;
                                                                                             if (var2 != 0) {
                                                                                                var72 = var3.method1104(255) + var72 - -1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var73 < var28.length) {
                                                                                                   var72 = var3.method1104(255) + var72 - -1;
                                                                                                   var28[var73] = (byte)var72;
                                                                                                   var73 += 2;
                                                                                                }

                                                                                                var74 = var28[0];
                                                                                                var75 = var28[1] << 1;
                                                                                                var76 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   label2374: {
                                                                                                      if (var2 != 0) {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      } else if (~var74 >= ~var76) {
                                                                                                         var77 = 2;
                                                                                                         if (var2 == 0) {
                                                                                                            break label2374;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var77 > -1) {
                                                                                                            var77 = 0;
                                                                                                         }

                                                                                                         if (~var77 < -129) {
                                                                                                            var77 = 128;
                                                                                                         }

                                                                                                         this.field5430[var76] = (byte)var77;
                                                                                                         ++var76;
                                                                                                         if (~var74 >= ~var76) {
                                                                                                            var77 = 2;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var77 = (this.field5430[var76] & 255) + var75;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label2413: {
                                                                                                      if (var2 != 0) {
                                                                                                         var78 = var28[var77];
                                                                                                      } else if (var77 >= var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (var2 == 0) {
                                                                                                            break label2413;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label2430: {
                                                                                                            var79 = var28[var77 + 1] << 1;
                                                                                                            var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                            var81 = var74;
                                                                                                            if (var2 != 0) {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            } else if (var74 >= var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (var2 == 0) {
                                                                                                                  break label2430;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var82 = var10000;
                                                                                                               var83 = (255 & this.field5430[var81]) + var82;
                                                                                                               if (var83 < 0) {
                                                                                                                  var83 = 0;
                                                                                                               }

                                                                                                               if (var83 > 128) {
                                                                                                                  var83 = 128;
                                                                                                               }

                                                                                                               this.field5430[var81] = (byte)var83;
                                                                                                               var80 += var79 - var75;
                                                                                                               ++var81;
                                                                                                               if (var81 >= var78) {
                                                                                                                  var75 = var79;
                                                                                                                  var10000 = var78;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var74 = var10000;
                                                                                                         var77 += 2;
                                                                                                         if (var77 >= var28.length) {
                                                                                                            var78 = var74;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = var28[var77];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 != 0 || ~var78 > -129) {
                                                                                                      do {
                                                                                                         var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                         if (var84 < 0) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (var84 > 128) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field5430[var78] = (byte)var84;
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
                                                                                          if (var2 != 0) {
                                                                                             var20[var86].field2059 = var3.method1104(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var16 < ~var86) {
                                                                                                var20[var86].field2059 = var3.method1104(255);
                                                                                                ++var86;
                                                                                             }

                                                                                             var87 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0 || ~var16 < ~var87) {
                                                                                                   do {
                                                                                                      var88 = var20[var87];
                                                                                                      if (var88.field2060 != null) {
                                                                                                         var88.field2056 = var3.method1104(255);
                                                                                                      }

                                                                                                      if (var88.field2061 != null) {
                                                                                                         var88.field2053 = var3.method1104(255);
                                                                                                      }

                                                                                                      if (var88.field2059 > 0) {
                                                                                                         var88.field2054 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var87;
                                                                                                   } while(~var16 < ~var87);
                                                                                                }

                                                                                                var89 = 0;
                                                                                                if (var2 != 0) {
                                                                                                   var20[var89].field2065 = var3.method1104(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var16 < ~var89) {
                                                                                                      var20[var89].field2065 = var3.method1104(255);
                                                                                                      ++var89;
                                                                                                   }

                                                                                                   var90 = 0;
                                                                                                   if (var2 == 0) {
                                                                                                      if (var2 != 0 || ~var16 < ~var90) {
                                                                                                         do {
                                                                                                            var91 = var20[var90];
                                                                                                            if (~var91.field2065 < -1) {
                                                                                                               var91.field2055 = var3.method1104(255);
                                                                                                            }

                                                                                                            ++var90;
                                                                                                         } while(~var16 < ~var90);
                                                                                                      }

                                                                                                      var92 = 0;
                                                                                                      if (var2 == 0 && var16 <= var92) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var93 = var20[var92];
                                                                                                         if (var93.field2055 > 0) {
                                                                                                            var93.field2063 = var3.method1104(255);
                                                                                                         }

                                                                                                         ++var92;
                                                                                                      } while(var16 > var92);

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
                                                                                          if (var57.field2060 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2 != 0) {
                                                                                                var58 = var58 + 1 + var3.method1104(255);
                                                                                                var57.field2060[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var59 > ~var57.field2060.length) {
                                                                                                var58 = var58 + 1 + var3.method1104(255);
                                                                                                var57.field2060[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(var16 > var56);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1104(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var60 = var60 + 1 + var3.method1104(255);
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label2673:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = var60 + 1 + var3.method1104(255);
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0) {
                                                                                                   this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var64 < var62) {
                                                                                                      this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (var2 == 0) {
                                                                                                      label2726: {
                                                                                                         if (var2 != 0) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var65 >= var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (var2 == 0) {
                                                                                                               break label2726;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label2743: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2 != 0) {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var65 += 2;
                                                                                                                  var62 = var66;
                                                                                                                  var10000 = var67;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break label2743;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var65 += 2;
                                                                                                                     var62 = var66;
                                                                                                                     var10000 = var67;
                                                                                                                     if (var2 == 0) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                            if (var65 >= var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2 != 0) {
                                                                                                         this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (var2 == 0) {
                                                                                                            var71 = null;
                                                                                                            break label2673;
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
                                                                                          var72 = var3.method1104(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var72 = var3.method1104(255) + var72 - -1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1104(255) + var72 - -1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (var2 == 0) {
                                                                                                label2842: {
                                                                                                   if (var2 != 0) {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   } else if (~var74 >= ~var76) {
                                                                                                      var77 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         break label2842;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (~var77 < -129) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5430[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (~var74 >= ~var76) {
                                                                                                         var77 = 2;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label2881: {
                                                                                                   if (var2 != 0) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var77 >= var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (var2 == 0) {
                                                                                                         break label2881;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label2898: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                         var81 = var74;
                                                                                                         if (var2 != 0) {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         } else if (var74 >= var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (var2 == 0) {
                                                                                                               break label2898;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (255 & this.field5430[var81]) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (var83 > 128) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5430[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (var81 >= var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (var77 >= var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 != 0 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (var84 > 128) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5430[var78] = (byte)var84;
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
                                                                                       if (var2 != 0) {
                                                                                          var20[var86].field2059 = var3.method1104(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var16 < ~var86) {
                                                                                             var20[var86].field2059 = var3.method1104(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2 == 0) {
                                                                                             if (var2 != 0 || ~var16 < ~var87) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2060 != null) {
                                                                                                      var88.field2056 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2061 != null) {
                                                                                                      var88.field2053 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2059 > 0) {
                                                                                                      var88.field2054 = var3.method1104(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var16 < ~var87);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2 != 0) {
                                                                                                var20[var89].field2065 = var3.method1104(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var89) {
                                                                                                   var20[var89].field2065 = var3.method1104(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   if (var2 != 0 || ~var16 < ~var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2065 < -1) {
                                                                                                            var91.field2055 = var3.method1104(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var16 < ~var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (var2 == 0 && var16 <= var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (var93.field2055 > 0) {
                                                                                                         var93.field2063 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(var16 > var92);

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
                                                                                    while(var52 < var28.length) {
                                                                                       var28[var52] = var3.method1047((byte)71);
                                                                                       var52 += 2;
                                                                                    }

                                                                                    var52 = 0;
                                                                                    if (var2 == 0) {
                                                                                       if (var2 != 0 || ~var52 > ~var16) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field2061 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (var2 == 0 && var53.field2061.length <= var55) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 -= -1 + -var3.method1104(255);
                                                                                                      var53.field2061[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var53.field2061.length > var55);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var52 > ~var16);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (var2 == 0 && var16 <= var56) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method1104(255);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2 != 0) {
                                                                                                var60 = var60 + 1 + var3.method1104(255);
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label3177:
                                                                                             while(true) {
                                                                                                while(var61 < var26.length) {
                                                                                                   var60 = var60 + 1 + var3.method1104(255);
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   if (var2 != 0) {
                                                                                                      this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var64 < var62) {
                                                                                                         this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         label3230: {
                                                                                                            if (var2 != 0) {
                                                                                                               var66 = var26[var65];
                                                                                                            } else if (var65 >= var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (var2 == 0) {
                                                                                                                  break label3230;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label3247: {
                                                                                                                  var67 = var26[var65 + 1];
                                                                                                                  var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                                  var69 = var62;
                                                                                                                  if (var2 != 0) {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  } else if (~var66 >= ~var62) {
                                                                                                                     var65 += 2;
                                                                                                                     var62 = var66;
                                                                                                                     var10000 = var67;
                                                                                                                     if (var2 == 0) {
                                                                                                                        break label3247;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     ++var69;
                                                                                                                     if (~var66 >= ~var69) {
                                                                                                                        var65 += 2;
                                                                                                                        var62 = var66;
                                                                                                                        var10000 = var67;
                                                                                                                        if (var2 == 0) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var63 = var10000;
                                                                                                               if (var65 >= var26.length) {
                                                                                                                  var66 = var62;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var66 = var26[var65];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2 != 0) {
                                                                                                            this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            while(var66 < 128) {
                                                                                                               this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                               ++var66;
                                                                                                            }

                                                                                                            if (var2 == 0) {
                                                                                                               var71 = null;
                                                                                                               break label3177;
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
                                                                                             var72 = var3.method1104(255);
                                                                                             var28[0] = (byte)var72;
                                                                                             var73 = 2;
                                                                                             if (var2 != 0) {
                                                                                                var72 = var3.method1104(255) + var72 - -1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var73 < var28.length) {
                                                                                                   var72 = var3.method1104(255) + var72 - -1;
                                                                                                   var28[var73] = (byte)var72;
                                                                                                   var73 += 2;
                                                                                                }

                                                                                                var74 = var28[0];
                                                                                                var75 = var28[1] << 1;
                                                                                                var76 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   label3346: {
                                                                                                      if (var2 != 0) {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      } else if (~var74 >= ~var76) {
                                                                                                         var77 = 2;
                                                                                                         if (var2 == 0) {
                                                                                                            break label3346;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var77 > -1) {
                                                                                                            var77 = 0;
                                                                                                         }

                                                                                                         if (~var77 < -129) {
                                                                                                            var77 = 128;
                                                                                                         }

                                                                                                         this.field5430[var76] = (byte)var77;
                                                                                                         ++var76;
                                                                                                         if (~var74 >= ~var76) {
                                                                                                            var77 = 2;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var77 = (this.field5430[var76] & 255) + var75;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label3385: {
                                                                                                      if (var2 != 0) {
                                                                                                         var78 = var28[var77];
                                                                                                      } else if (var77 >= var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (var2 == 0) {
                                                                                                            break label3385;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label3402: {
                                                                                                            var79 = var28[var77 + 1] << 1;
                                                                                                            var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                            var81 = var74;
                                                                                                            if (var2 != 0) {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            } else if (var74 >= var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (var2 == 0) {
                                                                                                                  break label3402;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var82 = var10000;
                                                                                                               var83 = (255 & this.field5430[var81]) + var82;
                                                                                                               if (var83 < 0) {
                                                                                                                  var83 = 0;
                                                                                                               }

                                                                                                               if (var83 > 128) {
                                                                                                                  var83 = 128;
                                                                                                               }

                                                                                                               this.field5430[var81] = (byte)var83;
                                                                                                               var80 += var79 - var75;
                                                                                                               ++var81;
                                                                                                               if (var81 >= var78) {
                                                                                                                  var75 = var79;
                                                                                                                  var10000 = var78;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var74 = var10000;
                                                                                                         var77 += 2;
                                                                                                         if (var77 >= var28.length) {
                                                                                                            var78 = var74;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = var28[var77];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 != 0 || ~var78 > -129) {
                                                                                                      do {
                                                                                                         var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                         if (var84 < 0) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (var84 > 128) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field5430[var78] = (byte)var84;
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
                                                                                          if (var2 != 0) {
                                                                                             var20[var86].field2059 = var3.method1104(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var16 < ~var86) {
                                                                                                var20[var86].field2059 = var3.method1104(255);
                                                                                                ++var86;
                                                                                             }

                                                                                             var87 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0 || ~var16 < ~var87) {
                                                                                                   do {
                                                                                                      var88 = var20[var87];
                                                                                                      if (var88.field2060 != null) {
                                                                                                         var88.field2056 = var3.method1104(255);
                                                                                                      }

                                                                                                      if (var88.field2061 != null) {
                                                                                                         var88.field2053 = var3.method1104(255);
                                                                                                      }

                                                                                                      if (var88.field2059 > 0) {
                                                                                                         var88.field2054 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var87;
                                                                                                   } while(~var16 < ~var87);
                                                                                                }

                                                                                                var89 = 0;
                                                                                                if (var2 != 0) {
                                                                                                   var20[var89].field2065 = var3.method1104(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var16 < ~var89) {
                                                                                                      var20[var89].field2065 = var3.method1104(255);
                                                                                                      ++var89;
                                                                                                   }

                                                                                                   var90 = 0;
                                                                                                   if (var2 == 0) {
                                                                                                      if (var2 != 0 || ~var16 < ~var90) {
                                                                                                         do {
                                                                                                            var91 = var20[var90];
                                                                                                            if (~var91.field2065 < -1) {
                                                                                                               var91.field2055 = var3.method1104(255);
                                                                                                            }

                                                                                                            ++var90;
                                                                                                         } while(~var16 < ~var90);
                                                                                                      }

                                                                                                      var92 = 0;
                                                                                                      if (var2 == 0 && var16 <= var92) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var93 = var20[var92];
                                                                                                         if (var93.field2055 > 0) {
                                                                                                            var93.field2063 = var3.method1104(255);
                                                                                                         }

                                                                                                         ++var92;
                                                                                                      } while(var16 > var92);

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
                                                                                          if (var57.field2060 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2 != 0) {
                                                                                                var58 = var58 + 1 + var3.method1104(255);
                                                                                                var57.field2060[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(~var59 > ~var57.field2060.length) {
                                                                                                var58 = var58 + 1 + var3.method1104(255);
                                                                                                var57.field2060[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(var16 > var56);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1104(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var60 = var60 + 1 + var3.method1104(255);
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label3645:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = var60 + 1 + var3.method1104(255);
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0) {
                                                                                                   this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var64 < var62) {
                                                                                                      this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (var2 == 0) {
                                                                                                      label3698: {
                                                                                                         if (var2 != 0) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var65 >= var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (var2 == 0) {
                                                                                                               break label3698;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label3715: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2 != 0) {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var65 += 2;
                                                                                                                  var62 = var66;
                                                                                                                  var10000 = var67;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break label3715;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var65 += 2;
                                                                                                                     var62 = var66;
                                                                                                                     var10000 = var67;
                                                                                                                     if (var2 == 0) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                            if (var65 >= var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2 != 0) {
                                                                                                         this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (var2 == 0) {
                                                                                                            var71 = null;
                                                                                                            break label3645;
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
                                                                                          var72 = var3.method1104(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var72 = var3.method1104(255) + var72 - -1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1104(255) + var72 - -1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (var2 == 0) {
                                                                                                label3814: {
                                                                                                   if (var2 != 0) {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   } else if (~var74 >= ~var76) {
                                                                                                      var77 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         break label3814;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (~var77 < -129) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5430[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (~var74 >= ~var76) {
                                                                                                         var77 = 2;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label3853: {
                                                                                                   if (var2 != 0) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var77 >= var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (var2 == 0) {
                                                                                                         break label3853;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label3870: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                         var81 = var74;
                                                                                                         if (var2 != 0) {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         } else if (var74 >= var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (var2 == 0) {
                                                                                                               break label3870;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (255 & this.field5430[var81]) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (var83 > 128) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5430[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (var81 >= var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (var77 >= var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 != 0 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (var84 > 128) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5430[var78] = (byte)var84;
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
                                                                                       if (var2 != 0) {
                                                                                          var20[var86].field2059 = var3.method1104(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var16 < ~var86) {
                                                                                             var20[var86].field2059 = var3.method1104(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2 == 0) {
                                                                                             if (var2 != 0 || ~var16 < ~var87) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2060 != null) {
                                                                                                      var88.field2056 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2061 != null) {
                                                                                                      var88.field2053 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2059 > 0) {
                                                                                                      var88.field2054 = var3.method1104(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var16 < ~var87);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2 != 0) {
                                                                                                var20[var89].field2065 = var3.method1104(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var89) {
                                                                                                   var20[var89].field2065 = var3.method1104(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   if (var2 != 0 || ~var16 < ~var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2065 < -1) {
                                                                                                            var91.field2055 = var3.method1104(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var16 < ~var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (var2 == 0 && var16 <= var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (var93.field2055 > 0) {
                                                                                                         var93.field2063 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(var16 > var92);

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
                                                                                 class164 var48 = var20[var47];
                                                                                 if (var48.field2060 != null) {
                                                                                    int var49 = 1;
                                                                                    if (var2 != 0) {
                                                                                       var48.field2060[var49] = var3.method1047((byte)11);
                                                                                       var49 += 2;
                                                                                    }

                                                                                    while(var49 < var48.field2060.length) {
                                                                                       var48.field2060[var49] = var3.method1047((byte)11);
                                                                                       var49 += 2;
                                                                                    }
                                                                                 }

                                                                                 if (var48.field2061 == null) {
                                                                                    ++var47;
                                                                                 } else {
                                                                                    int var50 = 3;
                                                                                    if (var2 != 0) {
                                                                                       var48.field2061[var50] = var3.method1047((byte)-101);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    while(~(var48.field2061.length + -2) < ~var50) {
                                                                                       var48.field2061[var50] = var3.method1047((byte)-101);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    ++var47;
                                                                                 }
                                                                              } while(~var47 > ~var16);

                                                                              if (var26 != null) {
                                                                                 var51 = 1;
                                                                                 if (var2 != 0 || var51 < var26.length) {
                                                                                    do {
                                                                                       var26[var51] = var3.method1047((byte)121);
                                                                                       var51 += 2;
                                                                                    } while(var51 < var26.length);
                                                                                 }
                                                                              }

                                                                              if (var28 != null) {
                                                                                 var52 = 1;
                                                                                 if (var2 != 0) {
                                                                                    var28[var52] = var3.method1047((byte)71);
                                                                                    var52 += 2;
                                                                                 }
                                                                              } else {
                                                                                 var52 = 0;
                                                                                 if (var2 == 0) {
                                                                                    if (var2 != 0 || ~var52 > ~var16) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field2061 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (var2 == 0 && var53.field2061.length <= var55) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 -= -1 + -var3.method1104(255);
                                                                                                   var53.field2061[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var53.field2061.length > var55);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var52 > ~var16);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (var2 == 0 && var16 <= var56) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1104(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var60 = var60 + 1 + var3.method1104(255);
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label1144:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = var60 + 1 + var3.method1104(255);
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0) {
                                                                                                   this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var64 < var62) {
                                                                                                      this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (var2 == 0) {
                                                                                                      label1197: {
                                                                                                         if (var2 != 0) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var65 >= var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (var2 == 0) {
                                                                                                               break label1197;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label1214: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2 != 0) {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var65 += 2;
                                                                                                                  var62 = var66;
                                                                                                                  var10000 = var67;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break label1214;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var65 += 2;
                                                                                                                     var62 = var66;
                                                                                                                     var10000 = var67;
                                                                                                                     if (var2 == 0) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                            if (var65 >= var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2 != 0) {
                                                                                                         this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (var2 == 0) {
                                                                                                            var71 = null;
                                                                                                            break label1144;
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
                                                                                          var72 = var3.method1104(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var72 = var3.method1104(255) + var72 - -1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1104(255) + var72 - -1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (var2 == 0) {
                                                                                                label1313: {
                                                                                                   if (var2 != 0) {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   } else if (~var74 >= ~var76) {
                                                                                                      var77 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         break label1313;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (~var77 < -129) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5430[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (~var74 >= ~var76) {
                                                                                                         var77 = 2;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label1352: {
                                                                                                   if (var2 != 0) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var77 >= var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (var2 == 0) {
                                                                                                         break label1352;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label1369: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                         var81 = var74;
                                                                                                         if (var2 != 0) {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         } else if (var74 >= var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (var2 == 0) {
                                                                                                               break label1369;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (255 & this.field5430[var81]) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (var83 > 128) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5430[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (var81 >= var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (var77 >= var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 != 0 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (var84 > 128) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5430[var78] = (byte)var84;
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
                                                                                       if (var2 != 0) {
                                                                                          var20[var86].field2059 = var3.method1104(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var16 < ~var86) {
                                                                                             var20[var86].field2059 = var3.method1104(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2 == 0) {
                                                                                             if (var2 != 0 || ~var16 < ~var87) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2060 != null) {
                                                                                                      var88.field2056 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2061 != null) {
                                                                                                      var88.field2053 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2059 > 0) {
                                                                                                      var88.field2054 = var3.method1104(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var16 < ~var87);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2 != 0) {
                                                                                                var20[var89].field2065 = var3.method1104(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var89) {
                                                                                                   var20[var89].field2065 = var3.method1104(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   if (var2 != 0 || ~var16 < ~var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2065 < -1) {
                                                                                                            var91.field2055 = var3.method1104(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var16 < ~var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (var2 == 0 && var16 <= var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (var93.field2055 > 0) {
                                                                                                         var93.field2063 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(var16 > var92);

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
                                                                                       if (var57.field2060 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var58 = var58 + 1 + var3.method1104(255);
                                                                                             var57.field2060[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var59 > ~var57.field2060.length) {
                                                                                             var58 = var58 + 1 + var3.method1104(255);
                                                                                             var57.field2060[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(var16 > var56);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method1104(255);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2 != 0) {
                                                                                          var60 = var60 + 1 + var3.method1104(255);
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label1612:
                                                                                       while(true) {
                                                                                          while(var61 < var26.length) {
                                                                                             var60 = var60 + 1 + var3.method1104(255);
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (var2 == 0) {
                                                                                             if (var2 != 0) {
                                                                                                this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var64 < var62) {
                                                                                                   this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (var2 == 0) {
                                                                                                   label1665: {
                                                                                                      if (var2 != 0) {
                                                                                                         var66 = var26[var65];
                                                                                                      } else if (var65 >= var26.length) {
                                                                                                         var66 = var62;
                                                                                                         if (var2 == 0) {
                                                                                                            break label1665;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var66 = var26[var65];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label1682: {
                                                                                                            var67 = var26[var65 + 1];
                                                                                                            var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                            var69 = var62;
                                                                                                            if (var2 != 0) {
                                                                                                               var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                            } else if (~var66 >= ~var62) {
                                                                                                               var65 += 2;
                                                                                                               var62 = var66;
                                                                                                               var10000 = var67;
                                                                                                               if (var2 == 0) {
                                                                                                                  break label1682;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                               var68 += -var63 + var67;
                                                                                                               ++var69;
                                                                                                               if (~var66 >= ~var69) {
                                                                                                                  var65 += 2;
                                                                                                                  var62 = var66;
                                                                                                                  var10000 = var67;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var63 = var10000;
                                                                                                         if (var65 >= var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 != 0) {
                                                                                                      this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                      ++var66;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var66 < 128) {
                                                                                                         this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      if (var2 == 0) {
                                                                                                         var71 = null;
                                                                                                         break label1612;
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
                                                                                       var72 = var3.method1104(255);
                                                                                       var28[0] = (byte)var72;
                                                                                       var73 = 2;
                                                                                       if (var2 != 0) {
                                                                                          var72 = var3.method1104(255) + var72 - -1;
                                                                                          var28[var73] = (byte)var72;
                                                                                          var73 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var73 < var28.length) {
                                                                                             var72 = var3.method1104(255) + var72 - -1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          var74 = var28[0];
                                                                                          var75 = var28[1] << 1;
                                                                                          var76 = 0;
                                                                                          if (var2 == 0) {
                                                                                             label1781: {
                                                                                                if (var2 != 0) {
                                                                                                   var77 = (this.field5430[var76] & 255) + var75;
                                                                                                } else if (~var74 >= ~var76) {
                                                                                                   var77 = 2;
                                                                                                   if (var2 == 0) {
                                                                                                      break label1781;
                                                                                                   }
                                                                                                } else {
                                                                                                   var77 = (this.field5430[var76] & 255) + var75;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var77 > -1) {
                                                                                                      var77 = 0;
                                                                                                   }

                                                                                                   if (~var77 < -129) {
                                                                                                      var77 = 128;
                                                                                                   }

                                                                                                   this.field5430[var76] = (byte)var77;
                                                                                                   ++var76;
                                                                                                   if (~var74 >= ~var76) {
                                                                                                      var77 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label1820: {
                                                                                                if (var2 != 0) {
                                                                                                   var78 = var28[var77];
                                                                                                } else if (var77 >= var28.length) {
                                                                                                   var78 = var74;
                                                                                                   if (var2 == 0) {
                                                                                                      break label1820;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = var28[var77];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label1837: {
                                                                                                      var79 = var28[var77 + 1] << 1;
                                                                                                      var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                      var81 = var74;
                                                                                                      if (var2 != 0) {
                                                                                                         var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                      } else if (var74 >= var78) {
                                                                                                         var75 = var79;
                                                                                                         var10000 = var78;
                                                                                                         if (var2 == 0) {
                                                                                                            break label1837;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var82 = var10000;
                                                                                                         var83 = (255 & this.field5430[var81]) + var82;
                                                                                                         if (var83 < 0) {
                                                                                                            var83 = 0;
                                                                                                         }

                                                                                                         if (var83 > 128) {
                                                                                                            var83 = 128;
                                                                                                         }

                                                                                                         this.field5430[var81] = (byte)var83;
                                                                                                         var80 += var79 - var75;
                                                                                                         ++var81;
                                                                                                         if (var81 >= var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var74 = var10000;
                                                                                                   var77 += 2;
                                                                                                   if (var77 >= var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (var2 == 0) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             if (var2 != 0 || ~var78 > -129) {
                                                                                                do {
                                                                                                   var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                   if (var84 < 0) {
                                                                                                      var84 = 0;
                                                                                                   }

                                                                                                   if (var84 > 128) {
                                                                                                      var84 = 128;
                                                                                                   }

                                                                                                   this.field5430[var78] = (byte)var84;
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
                                                                                    if (var2 != 0) {
                                                                                       var20[var86].field2059 = var3.method1104(255);
                                                                                       ++var86;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(~var16 < ~var86) {
                                                                                          var20[var86].field2059 = var3.method1104(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2 == 0) {
                                                                                          if (var2 != 0 || ~var16 < ~var87) {
                                                                                             do {
                                                                                                var88 = var20[var87];
                                                                                                if (var88.field2060 != null) {
                                                                                                   var88.field2056 = var3.method1104(255);
                                                                                                }

                                                                                                if (var88.field2061 != null) {
                                                                                                   var88.field2053 = var3.method1104(255);
                                                                                                }

                                                                                                if (var88.field2059 > 0) {
                                                                                                   var88.field2054 = var3.method1104(255);
                                                                                                }

                                                                                                ++var87;
                                                                                             } while(~var16 < ~var87);
                                                                                          }

                                                                                          var89 = 0;
                                                                                          if (var2 != 0) {
                                                                                             var20[var89].field2065 = var3.method1104(255);
                                                                                             ++var89;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var16 < ~var89) {
                                                                                                var20[var89].field2065 = var3.method1104(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0 || ~var16 < ~var90) {
                                                                                                   do {
                                                                                                      var91 = var20[var90];
                                                                                                      if (~var91.field2065 < -1) {
                                                                                                         var91.field2055 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var90;
                                                                                                   } while(~var16 < ~var90);
                                                                                                }

                                                                                                var92 = 0;
                                                                                                if (var2 == 0 && var16 <= var92) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var93 = var20[var92];
                                                                                                   if (var93.field2055 > 0) {
                                                                                                      var93.field2063 = var3.method1104(255);
                                                                                                   }

                                                                                                   ++var92;
                                                                                                } while(var16 > var92);

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
                                                                                 while(var52 < var28.length) {
                                                                                    var28[var52] = var3.method1047((byte)71);
                                                                                    var52 += 2;
                                                                                 }

                                                                                 var52 = 0;
                                                                                 if (var2 == 0) {
                                                                                    if (var2 != 0 || ~var52 > ~var16) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field2061 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (var2 == 0 && var53.field2061.length <= var55) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 -= -1 + -var3.method1104(255);
                                                                                                   var53.field2061[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var53.field2061.length > var55);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var52 > ~var16);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (var2 == 0 && var16 <= var56) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1104(255);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var60 = var60 + 1 + var3.method1104(255);
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label614:
                                                                                          while(true) {
                                                                                             while(var61 < var26.length) {
                                                                                                var60 = var60 + 1 + var3.method1104(255);
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0) {
                                                                                                   this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(var64 < var62) {
                                                                                                      this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (var2 == 0) {
                                                                                                      label667: {
                                                                                                         if (var2 != 0) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (var65 >= var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (var2 == 0) {
                                                                                                               break label667;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label684: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                               var69 = var62;
                                                                                                               if (var2 != 0) {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               } else if (~var66 >= ~var62) {
                                                                                                                  var65 += 2;
                                                                                                                  var62 = var66;
                                                                                                                  var10000 = var67;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break label684;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var66 >= ~var69) {
                                                                                                                     var65 += 2;
                                                                                                                     var62 = var66;
                                                                                                                     var10000 = var67;
                                                                                                                     if (var2 == 0) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var63 = var10000;
                                                                                                            if (var65 >= var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2 != 0) {
                                                                                                         this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(var66 < 128) {
                                                                                                            this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (var2 == 0) {
                                                                                                            var71 = null;
                                                                                                            break label614;
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
                                                                                          var72 = var3.method1104(255);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var72 = var3.method1104(255) + var72 - -1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1104(255) + var72 - -1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (var2 == 0) {
                                                                                                label783: {
                                                                                                   if (var2 != 0) {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   } else if (~var74 >= ~var76) {
                                                                                                      var77 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         break label783;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (~var77 < -129) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field5430[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (~var74 >= ~var76) {
                                                                                                         var77 = 2;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (this.field5430[var76] & 255) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label822: {
                                                                                                   if (var2 != 0) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var77 >= var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (var2 == 0) {
                                                                                                         break label822;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label839: {
                                                                                                         var79 = var28[var77 + 1] << 1;
                                                                                                         var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                         var81 = var74;
                                                                                                         if (var2 != 0) {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         } else if (var74 >= var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (var2 == 0) {
                                                                                                               break label839;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (255 & this.field5430[var81]) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (var83 > 128) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            this.field5430[var81] = (byte)var83;
                                                                                                            var80 += var79 - var75;
                                                                                                            ++var81;
                                                                                                            if (var81 >= var78) {
                                                                                                               var75 = var79;
                                                                                                               var10000 = var78;
                                                                                                               if (var2 == 0) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var74 = var10000;
                                                                                                      var77 += 2;
                                                                                                      if (var77 >= var28.length) {
                                                                                                         var78 = var74;
                                                                                                         if (var2 == 0) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 != 0 || ~var78 > -129) {
                                                                                                   do {
                                                                                                      var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (var84 > 128) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field5430[var78] = (byte)var84;
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
                                                                                       if (var2 != 0) {
                                                                                          var20[var86].field2059 = var3.method1104(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(~var16 < ~var86) {
                                                                                             var20[var86].field2059 = var3.method1104(255);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (var2 == 0) {
                                                                                             if (var2 != 0 || ~var16 < ~var87) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field2060 != null) {
                                                                                                      var88.field2056 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2061 != null) {
                                                                                                      var88.field2053 = var3.method1104(255);
                                                                                                   }

                                                                                                   if (var88.field2059 > 0) {
                                                                                                      var88.field2054 = var3.method1104(255);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(~var16 < ~var87);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2 != 0) {
                                                                                                var20[var89].field2065 = var3.method1104(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var16 < ~var89) {
                                                                                                   var20[var89].field2065 = var3.method1104(255);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (var2 == 0) {
                                                                                                   if (var2 != 0 || ~var16 < ~var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field2065 < -1) {
                                                                                                            var91.field2055 = var3.method1104(255);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(~var16 < ~var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (var2 == 0 && var16 <= var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (var93.field2055 > 0) {
                                                                                                         var93.field2063 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(var16 > var92);

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
                                                                                       if (var57.field2060 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2 != 0) {
                                                                                             var58 = var58 + 1 + var3.method1104(255);
                                                                                             var57.field2060[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(~var59 > ~var57.field2060.length) {
                                                                                             var58 = var58 + 1 + var3.method1104(255);
                                                                                             var57.field2060[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(var16 > var56);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method1104(255);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2 != 0) {
                                                                                          var60 = var60 + 1 + var3.method1104(255);
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label564:
                                                                                       while(true) {
                                                                                          while(var61 < var26.length) {
                                                                                             var60 = var60 + 1 + var3.method1104(255);
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (var2 == 0) {
                                                                                             if (var2 != 0) {
                                                                                                this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var64 < var62) {
                                                                                                   this.field5427[var64] = (byte)(this.field5427[var64] * var63 - -32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (var2 == 0) {
                                                                                                   label525: {
                                                                                                      if (var2 != 0) {
                                                                                                         var66 = var26[var65];
                                                                                                      } else if (var65 >= var26.length) {
                                                                                                         var66 = var62;
                                                                                                         if (var2 == 0) {
                                                                                                            break label525;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var66 = var26[var65];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label522: {
                                                                                                            var67 = var26[var65 + 1];
                                                                                                            var68 = (var66 - var62) / 2 + (-var62 + var66) * var63;
                                                                                                            var69 = var62;
                                                                                                            if (var2 != 0) {
                                                                                                               var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                            } else if (~var66 >= ~var62) {
                                                                                                               var65 += 2;
                                                                                                               var62 = var66;
                                                                                                               var10000 = var67;
                                                                                                               if (var2 == 0) {
                                                                                                                  break label522;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               this.field5427[var69] = (byte)(this.field5427[var69] * var70 + 32 >> 6);
                                                                                                               var68 += -var63 + var67;
                                                                                                               ++var69;
                                                                                                               if (~var66 >= ~var69) {
                                                                                                                  var65 += 2;
                                                                                                                  var62 = var66;
                                                                                                                  var10000 = var67;
                                                                                                                  if (var2 == 0) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class506.method3755(var68, -var62 + var66, 27356);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var63 = var10000;
                                                                                                         if (var65 >= var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 != 0) {
                                                                                                      this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                      ++var66;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(var66 < 128) {
                                                                                                         this.field5427[var66] = (byte)(this.field5427[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      if (var2 == 0) {
                                                                                                         var71 = null;
                                                                                                         break label564;
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
                                                                                       var72 = var3.method1104(255);
                                                                                       var28[0] = (byte)var72;
                                                                                       var73 = 2;
                                                                                       if (var2 != 0) {
                                                                                          var72 = var3.method1104(255) + var72 - -1;
                                                                                          var28[var73] = (byte)var72;
                                                                                          var73 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var73 < var28.length) {
                                                                                             var72 = var3.method1104(255) + var72 - -1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          var74 = var28[0];
                                                                                          var75 = var28[1] << 1;
                                                                                          var76 = 0;
                                                                                          if (var2 == 0) {
                                                                                             label428: {
                                                                                                if (var2 != 0) {
                                                                                                   var77 = (this.field5430[var76] & 255) + var75;
                                                                                                } else if (~var74 >= ~var76) {
                                                                                                   var77 = 2;
                                                                                                   if (var2 == 0) {
                                                                                                      break label428;
                                                                                                   }
                                                                                                } else {
                                                                                                   var77 = (this.field5430[var76] & 255) + var75;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var77 > -1) {
                                                                                                      var77 = 0;
                                                                                                   }

                                                                                                   if (~var77 < -129) {
                                                                                                      var77 = 128;
                                                                                                   }

                                                                                                   this.field5430[var76] = (byte)var77;
                                                                                                   ++var76;
                                                                                                   if (~var74 >= ~var76) {
                                                                                                      var77 = 2;
                                                                                                      if (var2 == 0) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (this.field5430[var76] & 255) + var75;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label410: {
                                                                                                if (var2 != 0) {
                                                                                                   var78 = var28[var77];
                                                                                                } else if (var77 >= var28.length) {
                                                                                                   var78 = var74;
                                                                                                   if (var2 == 0) {
                                                                                                      break label410;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = var28[var77];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label407: {
                                                                                                      var79 = var28[var77 + 1] << 1;
                                                                                                      var80 = (var78 - var74) * var75 - -((-var74 + var78) / 2);
                                                                                                      var81 = var74;
                                                                                                      if (var2 != 0) {
                                                                                                         var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                      } else if (var74 >= var78) {
                                                                                                         var75 = var79;
                                                                                                         var10000 = var78;
                                                                                                         if (var2 == 0) {
                                                                                                            break label407;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var82 = var10000;
                                                                                                         var83 = (255 & this.field5430[var81]) + var82;
                                                                                                         if (var83 < 0) {
                                                                                                            var83 = 0;
                                                                                                         }

                                                                                                         if (var83 > 128) {
                                                                                                            var83 = 128;
                                                                                                         }

                                                                                                         this.field5430[var81] = (byte)var83;
                                                                                                         var80 += var79 - var75;
                                                                                                         ++var81;
                                                                                                         if (var81 >= var78) {
                                                                                                            var75 = var79;
                                                                                                            var10000 = var78;
                                                                                                            if (var2 == 0) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class506.method3755(var80, var78 - var74, 27356);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var74 = var10000;
                                                                                                   var77 += 2;
                                                                                                   if (var77 >= var28.length) {
                                                                                                      var78 = var74;
                                                                                                      if (var2 == 0) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             if (var2 != 0 || ~var78 > -129) {
                                                                                                do {
                                                                                                   var84 = (255 & this.field5430[var78]) - -var75;
                                                                                                   if (var84 < 0) {
                                                                                                      var84 = 0;
                                                                                                   }

                                                                                                   if (var84 > 128) {
                                                                                                      var84 = 128;
                                                                                                   }

                                                                                                   this.field5430[var78] = (byte)var84;
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
                                                                                    if (var2 != 0) {
                                                                                       var20[var86].field2059 = var3.method1104(255);
                                                                                       ++var86;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(~var16 < ~var86) {
                                                                                          var20[var86].field2059 = var3.method1104(255);
                                                                                          ++var86;
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (var2 == 0) {
                                                                                          if (var2 != 0 || ~var16 < ~var87) {
                                                                                             do {
                                                                                                var88 = var20[var87];
                                                                                                if (var88.field2060 != null) {
                                                                                                   var88.field2056 = var3.method1104(255);
                                                                                                }

                                                                                                if (var88.field2061 != null) {
                                                                                                   var88.field2053 = var3.method1104(255);
                                                                                                }

                                                                                                if (var88.field2059 > 0) {
                                                                                                   var88.field2054 = var3.method1104(255);
                                                                                                }

                                                                                                ++var87;
                                                                                             } while(~var16 < ~var87);
                                                                                          }

                                                                                          var89 = 0;
                                                                                          if (var2 != 0) {
                                                                                             var20[var89].field2065 = var3.method1104(255);
                                                                                             ++var89;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var16 < ~var89) {
                                                                                                var20[var89].field2065 = var3.method1104(255);
                                                                                                ++var89;
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (var2 == 0) {
                                                                                                if (var2 != 0 || ~var16 < ~var90) {
                                                                                                   do {
                                                                                                      var91 = var20[var90];
                                                                                                      if (~var91.field2065 < -1) {
                                                                                                         var91.field2055 = var3.method1104(255);
                                                                                                      }

                                                                                                      ++var90;
                                                                                                   } while(~var16 < ~var90);
                                                                                                }

                                                                                                var92 = 0;
                                                                                                if (var2 == 0 && var16 <= var92) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var93 = var20[var92];
                                                                                                   if (var93.field2055 > 0) {
                                                                                                      var93.field2063 = var3.method1104(255);
                                                                                                   }

                                                                                                   ++var92;
                                                                                                } while(var16 > var92);

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
                                                                  } else if (~this.field5429[var44] != -1) {
                                                                     if (~var35 == -1) {
                                                                        label4106: {
                                                                           var43 = var20[var15[var36]];
                                                                           if (~var36 <= ~var13.length) {
                                                                              var35 = -1;
                                                                              if (var2 == 0) {
                                                                                 break label4106;
                                                                              }
                                                                           }

                                                                           var35 = var13[var36++];
                                                                        }
                                                                     }

                                                                     this.field5423[var44] = var43;
                                                                     --var35;
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
         throw class670.method4877(var95, field5437[4] + (arg0 != null ? field5437[1] : field5437[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2809(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2810(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
