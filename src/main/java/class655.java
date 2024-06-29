import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class655 {
   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "I"
   )
   public int field9549;
   @OriginalMember(
      owner = "client!sn",
      name = "u",
      descriptor = "[B"
   )
   private byte[] field9566;
   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9567 = new String[]{method4819(method4818("`8;\u0005[")), method4819(method4818("ucyG")), method4819(method4818("hx;j\u000e")), method4819(method4818("hx;h\u000e")), method4819(method4818("hx;o\u000e")), method4819(method4818("hx;\u0017Ou\u007fa\u0015\u000e")), method4819(method4818("hx;i\u000e"))};
   @OriginalMember(
      owner = "client!sn",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field9559 = new int[32];
   @OriginalMember(
      owner = "client!sn",
      name = "g",
      descriptor = "I"
   )
   public int field9552;
   @OriginalMember(
      owner = "client!sn",
      name = "e",
      descriptor = "I"
   )
   public int field9554;
   @OriginalMember(
      owner = "client!sn",
      name = "r",
      descriptor = "I"
   )
   public static int field9555;
   @OriginalMember(
      owner = "client!sn",
      name = "h",
      descriptor = "I"
   )
   public int field9556;
   @OriginalMember(
      owner = "client!sn",
      name = "t",
      descriptor = "I"
   )
   public static int field9558;
   @OriginalMember(
      owner = "client!sn",
      name = "o",
      descriptor = "I"
   )
   public static int field9562;
   @OriginalMember(
      owner = "client!sn",
      name = "j",
      descriptor = "Lqfa;"
   )
   public class107 field9553;
   @OriginalMember(
      owner = "client!sn",
      name = "d",
      descriptor = "[I"
   )
   public int[] field9546;
   @OriginalMember(
      owner = "client!sn",
      name = "f",
      descriptor = "[I"
   )
   public int[] field9548;
   @OriginalMember(
      owner = "client!sn",
      name = "k",
      descriptor = "[I"
   )
   public int[] field9561;
   @OriginalMember(
      owner = "client!sn",
      name = "m",
      descriptor = "[I"
   )
   public int[] field9563;
   @OriginalMember(
      owner = "client!sn",
      name = "q",
      descriptor = "[I"
   )
   public int[] field9564;
   @OriginalMember(
      owner = "client!sn",
      name = "l",
      descriptor = "[I"
   )
   public int[] field9565;
   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "[Lqfa;"
   )
   public class107[] field9547;
   @OriginalMember(
      owner = "client!sn",
      name = "s",
      descriptor = "[[B"
   )
   public byte[][] field9557;
   @OriginalMember(
      owner = "client!sn",
      name = "p",
      descriptor = "[[I"
   )
   public static int[][] field9550;
   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "[[I"
   )
   public int[][] field9551;
   @OriginalMember(
      owner = "client!sn",
      name = "n",
      descriptor = "[[I"
   )
   public int[][] field9560;

   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method4814(int arg0) {
      try {
         ++field9562;
         return arg0 != 0 ? 13 : class445.field6487.method1069((byte)-54);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9567[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4815(int arg0) {
      try {
         field9559 = null;
         if (arg0 == 8775) {
            field9550 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9567[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4816(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         label36: {
            if (~arg0 < -244) {
               arg2 >>= 4;
               if (!var4) {
                  break label36;
               }
            }

            if (~arg0 >= -218) {
               if (~arg0 < -193) {
                  arg2 >>= 2;
                  if (!var4) {
                     break label36;
                  }
               }

               if (arg0 <= 179) {
                  break label36;
               }

               arg2 >>= 1;
               if (!var4) {
                  break label36;
               }
            }

            arg2 >>= 3;
         }

         ++field9555;
         int var5 = -33 / ((6 - arg1) / 51);
         return ((255 & arg3) >> 2 << 10) + ((arg2 >> 5 << 7) - -(arg0 >> 1));
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9567[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "([BI)V"
   )
   private final void method4817(byte[] arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field9558;
         class473 var4 = new class473(class51.method616(-83, arg0));
         int var5 = var4.method3564((byte)-75);
         if (~var5 <= -6 && ~var5 >= -7) {
            label535: {
               if (var5 < 6) {
                  this.field9554 = 0;
                  if (!var3) {
                     break label535;
                  }
               }

               this.field9554 = var4.method3567(31871);
            }

            int var6 = var4.method3564((byte)-114);
            int var7 = (var6 & 1) == 0 ? 0 : 1;
            boolean var8 = (var6 & 2) != 0;
            this.field9552 = var4.method3565(true);
            int var9 = 0;
            int var10 = -1;
            this.field9548 = new int[this.field9552];
            int var11 = 0;
            if (var3) {
               this.field9548[var11] = var9 += var4.method3565(true);
               if (~var10 > ~this.field9548[var11]) {
                  var10 = this.field9548[var11];
               }

               ++var11;
            }

            while(true) {
               while(~var11 > ~this.field9552) {
                  this.field9548[var11] = var9 += var4.method3565(true);
                  if (~var10 > ~this.field9548[var11]) {
                     var10 = this.field9548[var11];
                  }

                  ++var11;
               }

               this.field9556 = var10 + 1;
               this.field9561 = new int[this.field9556];
               this.field9551 = new int[this.field9556][];
               this.field9564 = new int[this.field9556];
               if (!var3) {
                  if (arg1 != 30786) {
                     return;
                  }

                  this.field9563 = new int[this.field9556];
                  if (var8) {
                     this.field9557 = new byte[this.field9556][];
                  }

                  this.field9565 = new int[this.field9556];
                  if (var7 != 0) {
                     this.field9546 = new int[this.field9556];
                     int var12 = 0;
                     if (var3) {
                        this.field9546[var12] = -1;
                        ++var12;
                     }

                     while(true) {
                        while(var12 < this.field9556) {
                           this.field9546[var12] = -1;
                           ++var12;
                        }

                        int var13 = 0;
                        if (!var3) {
                           class655 var10000;
                           label453: {
                              if (var3) {
                                 var10000 = this;
                              } else if (var13 >= this.field9552) {
                                 var10000 = this;
                                 if (!var3) {
                                    break label453;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              while(true) {
                                 var10000.field9546[this.field9548[var13]] = var4.method3567(31871);
                                 ++var13;
                                 if (var13 >= this.field9552) {
                                    var10000 = this;
                                    if (!var3) {
                                       break;
                                    }
                                 } else {
                                    var10000 = this;
                                 }
                              }
                           }

                           var10000.field9553 = new class107(this.field9546);
                           break;
                        }

                        ++var12;
                     }
                  }

                  int var14 = 0;
                  if (var3) {
                     this.field9564[this.field9548[var14]] = var4.method3567(class513.method3878(arg1, 1085));
                     ++var14;
                  }

                  while(true) {
                     while(~var14 > ~this.field9552) {
                        this.field9564[this.field9548[var14]] = var4.method3567(class513.method3878(arg1, 1085));
                        ++var14;
                     }

                     if (!var3) {
                        if (var8) {
                           int var15 = 0;
                           if (var3 || ~this.field9552 < ~var15) {
                              do {
                                 byte[] var16 = new byte[64];
                                 var4.method3562(0, var16, arg1 ^ -30774, 64);
                                 this.field9557[this.field9548[var15]] = var16;
                                 ++var15;
                              } while(~this.field9552 < ~var15);
                           }
                        }

                        int var17 = 0;
                        if (var3) {
                           this.field9563[this.field9548[var17]] = var4.method3567(31871);
                           ++var17;
                        }

                        while(true) {
                           while(this.field9552 > var17) {
                              this.field9563[this.field9548[var17]] = var4.method3567(31871);
                              ++var17;
                           }

                           int var18 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field9561[this.field9548[var18]] = var4.method3565(true);
                                 ++var18;
                              }

                              while(true) {
                                 while(~this.field9552 < ~var18) {
                                    this.field9561[this.field9548[var18]] = var4.method3565(true);
                                    ++var18;
                                 }

                                 int var19 = 0;
                                 if (!var3) {
                                    int var20;
                                    int var21;
                                    int var22;
                                    int var23;
                                    int var24;
                                    int var25;
                                    int var26;
                                    int var27;
                                    int var28;
                                    int var29;
                                    int var30;
                                    int var31;
                                    int var34;
                                    if (var3) {
                                       var20 = this.field9548[var19];
                                       var21 = 0;
                                       var22 = this.field9561[var20];
                                       var23 = -1;
                                       this.field9551[var20] = new int[var22];
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field9551[var20][var24] = var21 += var4.method3565(true);
                                          if (~var25 < ~var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    } else {
                                       if (this.field9552 <= var19) {
                                          var34 = var7;
                                          if (!var3) {
                                             if (var7 == 0) {
                                                return;
                                             }

                                             this.field9560 = new int[var10 + 1][];
                                             this.field9547 = new class107[var10 + 1];
                                             var26 = 0;
                                             if (!var3 && this.field9552 <= var26) {
                                                return;
                                             }

                                             label280:
                                             do {
                                                var27 = this.field9548[var26];
                                                var28 = this.field9561[var27];
                                                this.field9560[var27] = new int[this.field9565[var27]];
                                                var29 = 0;
                                                if (var3) {
                                                   this.field9560[var27][var29] = -1;
                                                   ++var29;
                                                }

                                                while(true) {
                                                   while(var29 < this.field9565[var27]) {
                                                      this.field9560[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   var30 = 0;
                                                   if (!var3) {
                                                      if (var3) {
                                                         if (this.field9551[var27] == null) {
                                                            if (var3) {
                                                               var31 = this.field9551[var27][var30];
                                                               this.field9560[var27][var31] = var4.method3567(31871);
                                                               ++var30;
                                                            } else {
                                                               this.field9560[var27][var30] = var4.method3567(31871);
                                                               ++var30;
                                                            }
                                                         } else {
                                                            var31 = this.field9551[var27][var30];
                                                            this.field9560[var27][var31] = var4.method3567(31871);
                                                            ++var30;
                                                         }
                                                      }

                                                      while(true) {
                                                         while(~var28 < ~var30) {
                                                            if (this.field9551[var27] == null) {
                                                               if (var3) {
                                                                  var31 = this.field9551[var27][var30];
                                                                  this.field9560[var27][var31] = var4.method3567(31871);
                                                                  ++var30;
                                                               } else {
                                                                  this.field9560[var27][var30] = var4.method3567(31871);
                                                                  ++var30;
                                                               }
                                                            } else {
                                                               var31 = this.field9551[var27][var30];
                                                               this.field9560[var27][var31] = var4.method3567(31871);
                                                               ++var30;
                                                            }
                                                         }

                                                         this.field9547[var27] = new class107(this.field9560[var27]);
                                                         if (!var3) {
                                                            ++var26;
                                                            continue label280;
                                                         }

                                                         var31 = this.field9551[var27][var30];
                                                         this.field9560[var27][var31] = var4.method3567(31871);
                                                         ++var30;
                                                      }
                                                   }

                                                   ++var29;
                                                }
                                             } while(this.field9552 > var26);

                                             return;
                                          }
                                       } else {
                                          var34 = this.field9548[var19];
                                       }

                                       var20 = var34;
                                       var21 = 0;
                                       var22 = this.field9561[var20];
                                       var23 = -1;
                                       this.field9551[var20] = new int[var22];
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field9551[var20][var24] = var21 += var4.method3565(true);
                                          if (~var25 < ~var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    }

                                    while(true) {
                                       while(~var24 > ~var22) {
                                          var25 = this.field9551[var20][var24] = var21 += var4.method3565(true);
                                          if (~var25 < ~var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }

                                       this.field9565[var20] = var23 + 1;
                                       if (!var3) {
                                          if (var22 == var23 + 1) {
                                             this.field9551[var20] = null;
                                          }

                                          ++var19;
                                          if (this.field9552 <= var19) {
                                             var34 = var7;
                                             if (!var3) {
                                                if (var7 == 0) {
                                                   return;
                                                }

                                                this.field9560 = new int[var10 + 1][];
                                                this.field9547 = new class107[var10 + 1];
                                                var26 = 0;
                                                if (!var3 && this.field9552 <= var26) {
                                                   return;
                                                }

                                                label197:
                                                do {
                                                   var27 = this.field9548[var26];
                                                   var28 = this.field9561[var27];
                                                   this.field9560[var27] = new int[this.field9565[var27]];
                                                   var29 = 0;
                                                   if (var3) {
                                                      this.field9560[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   while(true) {
                                                      while(var29 < this.field9565[var27]) {
                                                         this.field9560[var27][var29] = -1;
                                                         ++var29;
                                                      }

                                                      var30 = 0;
                                                      if (!var3) {
                                                         if (var3) {
                                                            if (this.field9551[var27] == null) {
                                                               if (var3) {
                                                                  var31 = this.field9551[var27][var30];
                                                                  this.field9560[var27][var31] = var4.method3567(31871);
                                                                  ++var30;
                                                               } else {
                                                                  this.field9560[var27][var30] = var4.method3567(31871);
                                                                  ++var30;
                                                               }
                                                            } else {
                                                               var31 = this.field9551[var27][var30];
                                                               this.field9560[var27][var31] = var4.method3567(31871);
                                                               ++var30;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(~var28 < ~var30) {
                                                               if (this.field9551[var27] == null) {
                                                                  if (var3) {
                                                                     var31 = this.field9551[var27][var30];
                                                                     this.field9560[var27][var31] = var4.method3567(31871);
                                                                     ++var30;
                                                                  } else {
                                                                     this.field9560[var27][var30] = var4.method3567(31871);
                                                                     ++var30;
                                                                  }
                                                               } else {
                                                                  var31 = this.field9551[var27][var30];
                                                                  this.field9560[var27][var31] = var4.method3567(31871);
                                                                  ++var30;
                                                               }
                                                            }

                                                            this.field9547[var27] = new class107(this.field9560[var27]);
                                                            if (!var3) {
                                                               ++var26;
                                                               continue label197;
                                                            }

                                                            var31 = this.field9551[var27][var30];
                                                            this.field9560[var27][var31] = var4.method3567(31871);
                                                            ++var30;
                                                         }
                                                      }

                                                      ++var29;
                                                   }
                                                } while(this.field9552 > var26);

                                                return;
                                             }
                                          } else {
                                             var34 = this.field9548[var19];
                                          }

                                          var20 = var34;
                                          var21 = 0;
                                          var22 = this.field9561[var20];
                                          var23 = -1;
                                          this.field9551[var20] = new int[var22];
                                          var24 = 0;
                                          if (var3) {
                                             var25 = this.field9551[var20][var24] = var21 += var4.method3565(true);
                                             if (~var25 < ~var23) {
                                                var23 = var25;
                                             }

                                             ++var24;
                                          }
                                       } else {
                                          if (~var22 < ~var23) {
                                             var23 = var22;
                                          }

                                          ++var24;
                                       }
                                    }
                                 }

                                 ++var18;
                              }
                           }

                           ++var17;
                        }
                     }

                     ++var14;
                  }
               }

               if (arg1 > 30786) {
                  var10 = this.field9548[var11];
               }

               ++var11;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var33) {
         throw class608.method4462(var33, field9567[2] + (arg0 != null ? field9567[0] : field9567[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "<init>",
      descriptor = "([BI[B)V"
   )
   public class655(byte[] arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field4564;
      super();

      try {
         this.field9549 = class637.method4668(false, arg0.length, arg0);
         if (~this.field9549 != ~arg1) {
            throw new RuntimeException();
         } else {
            if (arg2 != null) {
               if (~arg2.length != -65) {
                  throw new RuntimeException();
               }

               this.field9566 = class196.method1696(arg0.length, arg0, 0, 0);
               int var5 = 0;
               if (var4 || var5 < 64) {
                  do {
                     if (~this.field9566[var5] != ~arg2[var5]) {
                        throw new RuntimeException();
                     }

                     ++var5;
                  } while(var5 < 64);
               }
            }

            this.method4817(arg0, 30786);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9567[5] + (arg0 != null ? field9567[0] : field9567[1]) + ',' + arg1 + ',' + (arg2 != null ? field9567[0] : field9567[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4818(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4819(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
