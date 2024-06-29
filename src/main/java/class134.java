import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class134 {
   @OriginalMember(
      owner = "client!eda",
      name = "c",
      descriptor = "I"
   )
   public int field1701;
   @OriginalMember(
      owner = "client!eda",
      name = "n",
      descriptor = "[B"
   )
   private byte[] field1698;
   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1708 = new String[]{method1129(method1128("Z\u001c3\t-\u0017")), method1129(method1128("Z\u001c3\tTV\u0016;SV\u0017")), method1129(method1128("DV|\t\u0015")), method1129(method1128("Q\r>K")), method1129(method1128("Z\u001c3\t*\u0017")), method1129(method1128("Z\u001c3\t,\u0017")), method1129(method1128("Z\u001c3\t+\u0017")), method1129(method1128("Z\u001c3\t)\u0017"))};
   @OriginalMember(
      owner = "client!eda",
      name = "o",
      descriptor = "I"
   )
   public static int field1686;
   @OriginalMember(
      owner = "client!eda",
      name = "s",
      descriptor = "I"
   )
   public static int field1688;
   @OriginalMember(
      owner = "client!eda",
      name = "h",
      descriptor = "I"
   )
   public static int field1689;
   @OriginalMember(
      owner = "client!eda",
      name = "f",
      descriptor = "I"
   )
   public static int field1690;
   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "I"
   )
   public static int field1692;
   @OriginalMember(
      owner = "client!eda",
      name = "d",
      descriptor = "I"
   )
   public static int field1693;
   @OriginalMember(
      owner = "client!eda",
      name = "p",
      descriptor = "I"
   )
   public int field1695;
   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "I"
   )
   public int field1699;
   @OriginalMember(
      owner = "client!eda",
      name = "e",
      descriptor = "I"
   )
   public int field1702;
   @OriginalMember(
      owner = "client!eda",
      name = "v",
      descriptor = "Lvp;"
   )
   public class692 field1703;
   @OriginalMember(
      owner = "client!eda",
      name = "t",
      descriptor = "[I"
   )
   public int[] field1684;
   @OriginalMember(
      owner = "client!eda",
      name = "r",
      descriptor = "[I"
   )
   public int[] field1687;
   @OriginalMember(
      owner = "client!eda",
      name = "j",
      descriptor = "[I"
   )
   public int[] field1691;
   @OriginalMember(
      owner = "client!eda",
      name = "i",
      descriptor = "[I"
   )
   public int[] field1694;
   @OriginalMember(
      owner = "client!eda",
      name = "l",
      descriptor = "[I"
   )
   public int[] field1697;
   @OriginalMember(
      owner = "client!eda",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field1704;
   @OriginalMember(
      owner = "client!eda",
      name = "g",
      descriptor = "[I"
   )
   public int[] field1706;
   @OriginalMember(
      owner = "client!eda",
      name = "x",
      descriptor = "[Lvp;"
   )
   public class692[] field1700;
   @OriginalMember(
      owner = "client!eda",
      name = "u",
      descriptor = "[[B"
   )
   public byte[][] field1705;
   @OriginalMember(
      owner = "client!eda",
      name = "k",
      descriptor = "[[I"
   )
   public int[][] field1696;
   @OriginalMember(
      owner = "client!eda",
      name = "q",
      descriptor = "[[I"
   )
   public int[][] field1707;
   @OriginalMember(
      owner = "client!eda",
      name = "m",
      descriptor = "[[Z"
   )
   public static boolean[][] field1685;

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1123(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "([BI)V"
   )
   private final void method1124(byte[] arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1690;
         class66 var4 = new class66(class635.method4677(arg0, false));
         int var5 = var4.method640(255);
         if (~var5 <= -6 && var5 <= 6) {
            label510: {
               if (var5 >= 6) {
                  this.field1702 = var4.method610(123);
                  if (!var3) {
                     break label510;
                  }
               }

               this.field1702 = 0;
            }

            if (arg1 >= -2) {
               this.field1691 = null;
            }

            int var6 = var4.method640(255);
            int var7 = (var6 & 1) == 0 ? 0 : 1;
            int var8 = (2 & var6) == 0 ? 0 : 1;
            this.field1699 = var4.method603(-2);
            int var9 = 0;
            this.field1691 = new int[this.field1699];
            int var10 = -1;
            int var11 = 0;
            if (var3) {
               this.field1691[var11] = var9 += var4.method603(-2);
               if (var10 < this.field1691[var11]) {
                  var10 = this.field1691[var11];
               }

               ++var11;
            }

            while(true) {
               while(this.field1699 > var11) {
                  this.field1691[var11] = var9 += var4.method603(-2);
                  if (var10 < this.field1691[var11]) {
                     var10 = this.field1691[var11];
                  }

                  ++var11;
               }

               this.field1695 = var10 + 1;
               this.field1694 = new int[this.field1695];
               this.field1707 = new int[this.field1695][];
               this.field1687 = new int[this.field1695];
               this.field1697 = new int[this.field1695];
               this.field1706 = new int[this.field1695];
               if (!var3) {
                  if (var8 != 0) {
                     this.field1705 = new byte[this.field1695][];
                  }

                  if (var7 != 0) {
                     this.field1684 = new int[this.field1695];
                     int var12 = 0;
                     if (var3) {
                        this.field1684[var12] = -1;
                        ++var12;
                     }

                     label447:
                     while(true) {
                        while(~this.field1695 < ~var12) {
                           this.field1684[var12] = -1;
                           ++var12;
                        }

                        int var13 = 0;
                        if (!var3) {
                           if (var3) {
                              this.field1684[this.field1691[var13]] = var4.method610(-85);
                              ++var13;
                           }

                           while(true) {
                              class134 var10000;
                              if (~var13 <= ~this.field1699) {
                                 var10000 = this;
                                 if (!var3) {
                                    this.field1703 = new class692(this.field1684);
                                    break label447;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              var10000.field1684[this.field1691[var13]] = var4.method610(-85);
                              ++var13;
                           }
                        }

                        ++var12;
                     }
                  }

                  int var14 = 0;
                  if (var3) {
                     this.field1687[this.field1691[var14]] = var4.method610(123);
                     ++var14;
                  }

                  while(true) {
                     while(~var14 > ~this.field1699) {
                        this.field1687[this.field1691[var14]] = var4.method610(123);
                        ++var14;
                     }

                     if (!var3) {
                        if (var8 != 0) {
                           int var15 = 0;
                           if (var3 || ~this.field1699 < ~var15) {
                              do {
                                 byte[] var16 = new byte[64];
                                 var4.method632(0, 64, (byte)35, var16);
                                 this.field1705[this.field1691[var15]] = var16;
                                 ++var15;
                              } while(~this.field1699 < ~var15);
                           }
                        }

                        int var17 = 0;
                        if (var3) {
                           this.field1706[this.field1691[var17]] = var4.method610(125);
                           ++var17;
                        }

                        while(true) {
                           while(this.field1699 > var17) {
                              this.field1706[this.field1691[var17]] = var4.method610(125);
                              ++var17;
                           }

                           int var18 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field1694[this.field1691[var18]] = var4.method603(-2);
                                 ++var18;
                              }

                              while(true) {
                                 while(~var18 > ~this.field1699) {
                                    this.field1694[this.field1691[var18]] = var4.method603(-2);
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
                                       var20 = this.field1691[var19];
                                       var21 = 0;
                                       var22 = this.field1694[var20];
                                       this.field1707[var20] = new int[var22];
                                       var23 = -1;
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field1707[var20][var24] = var21 += var4.method603(-2);
                                          if (~var25 < ~var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    } else {
                                       if (var19 >= this.field1699) {
                                          var34 = var7;
                                          if (!var3) {
                                             if (var7 == 0) {
                                                return;
                                             }

                                             this.field1696 = new int[var10 + 1][];
                                             this.field1700 = new class692[var10 + 1];
                                             var26 = 0;
                                             if (!var3 && ~this.field1699 >= ~var26) {
                                                return;
                                             }

                                             label270:
                                             do {
                                                var27 = this.field1691[var26];
                                                var28 = this.field1694[var27];
                                                this.field1696[var27] = new int[this.field1697[var27]];
                                                var29 = 0;
                                                if (var3) {
                                                   this.field1696[var27][var29] = -1;
                                                   ++var29;
                                                }

                                                while(true) {
                                                   while(this.field1697[var27] > var29) {
                                                      this.field1696[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   var30 = 0;
                                                   if (!var3) {
                                                      if (var3) {
                                                         if (this.field1707[var27] != null) {
                                                            var31 = this.field1707[var27][var30];
                                                            if (var3) {
                                                               var31 = var30;
                                                            }
                                                         } else {
                                                            var31 = var30;
                                                         }

                                                         this.field1696[var27][var31] = var4.method610(10);
                                                         ++var30;
                                                      }

                                                      while(true) {
                                                         while(var28 > var30) {
                                                            if (this.field1707[var27] != null) {
                                                               var31 = this.field1707[var27][var30];
                                                               if (var3) {
                                                                  var31 = var30;
                                                               }
                                                            } else {
                                                               var31 = var30;
                                                            }

                                                            this.field1696[var27][var31] = var4.method610(10);
                                                            ++var30;
                                                         }

                                                         this.field1700[var27] = new class692(this.field1696[var27]);
                                                         if (!var3) {
                                                            ++var26;
                                                            continue label270;
                                                         }

                                                         this.field1696[var27][var30] = var4.method610(10);
                                                         ++var30;
                                                      }
                                                   }

                                                   ++var29;
                                                }
                                             } while(~this.field1699 < ~var26);

                                             return;
                                          }
                                       } else {
                                          var34 = this.field1691[var19];
                                       }

                                       var20 = var34;
                                       var21 = 0;
                                       var22 = this.field1694[var20];
                                       this.field1707[var20] = new int[var22];
                                       var23 = -1;
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field1707[var20][var24] = var21 += var4.method603(-2);
                                          if (~var25 < ~var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    }

                                    while(true) {
                                       while(var24 < var22) {
                                          var25 = this.field1707[var20][var24] = var21 += var4.method603(-2);
                                          if (~var25 < ~var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }

                                       this.field1697[var20] = var23 + 1;
                                       if (!var3) {
                                          if (var22 == var23 + 1) {
                                             this.field1707[var20] = null;
                                          }

                                          ++var19;
                                          if (var19 >= this.field1699) {
                                             var34 = var7;
                                             if (!var3) {
                                                if (var7 == 0) {
                                                   return;
                                                }

                                                this.field1696 = new int[var10 + 1][];
                                                this.field1700 = new class692[var10 + 1];
                                                var26 = 0;
                                                if (!var3 && ~this.field1699 >= ~var26) {
                                                   return;
                                                }

                                                label187:
                                                do {
                                                   var27 = this.field1691[var26];
                                                   var28 = this.field1694[var27];
                                                   this.field1696[var27] = new int[this.field1697[var27]];
                                                   var29 = 0;
                                                   if (var3) {
                                                      this.field1696[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   while(true) {
                                                      while(this.field1697[var27] > var29) {
                                                         this.field1696[var27][var29] = -1;
                                                         ++var29;
                                                      }

                                                      var30 = 0;
                                                      if (!var3) {
                                                         if (var3) {
                                                            if (this.field1707[var27] != null) {
                                                               var31 = this.field1707[var27][var30];
                                                               if (var3) {
                                                                  var31 = var30;
                                                               }
                                                            } else {
                                                               var31 = var30;
                                                            }

                                                            this.field1696[var27][var31] = var4.method610(10);
                                                            ++var30;
                                                         }

                                                         while(true) {
                                                            while(var28 > var30) {
                                                               if (this.field1707[var27] != null) {
                                                                  var31 = this.field1707[var27][var30];
                                                                  if (var3) {
                                                                     var31 = var30;
                                                                  }
                                                               } else {
                                                                  var31 = var30;
                                                               }

                                                               this.field1696[var27][var31] = var4.method610(10);
                                                               ++var30;
                                                            }

                                                            this.field1700[var27] = new class692(this.field1696[var27]);
                                                            if (!var3) {
                                                               ++var26;
                                                               continue label187;
                                                            }

                                                            this.field1696[var27][var30] = var4.method610(10);
                                                            ++var30;
                                                         }
                                                      }

                                                      ++var29;
                                                   }
                                                } while(~this.field1699 < ~var26);

                                                return;
                                             }
                                          } else {
                                             var34 = this.field1691[var19];
                                          }

                                          var20 = var34;
                                          var21 = 0;
                                          var22 = this.field1694[var20];
                                          this.field1707[var20] = new int[var22];
                                          var23 = -1;
                                          var24 = 0;
                                          if (var3) {
                                             var25 = this.field1707[var20][var24] = var21 += var4.method603(-2);
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

               if (var8 < this.field1691[var11]) {
                  var10 = this.field1691[var11];
               }

               ++var11;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var33) {
         throw class93.method866(var33, field1708[6] + (arg0 != null ? field1708[2] : field1708[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1125(boolean arg0) {
      boolean var1 = client.field1481;

      try {
         ++field1693;
         class703.field10273 = 0;
         class539.field7889 = 0;
         class353.field4940 = 0;
         class751.field10959 = 0;
         class493.field6885 = 0;
         class178.field2279 = 0;
         int var2 = 0;
         if (var1) {
            class570.field8383[var2] = null;
            ++var2;
         }

         while(true) {
            while(~class570.field8383.length < ~var2) {
               class570.field8383[var2] = null;
               ++var2;
            }

            class308.method2463((byte)101);
            int var3 = 0;
            if (!var1) {
               if (var1) {
                  class59.field771[var3] = null;
                  ++var3;
               }

               while(true) {
                  while(~var3 > -2049) {
                     class59.field771[var3] = null;
                     ++var3;
                  }

                  class737.field10798 = 0;
                  if (!var1) {
                     class35.field493.method1809(!arg0);
                     class418.field5713 = 0;
                     class207.field2635.method1809(true);
                     class529.method3949(true);
                     class657.field9800 = 0;
                     class175.field2266.method5528((byte)44);
                     class757.field11084 = null;
                     class74.field984 = null;
                     if (arg0) {
                        field1704 = null;
                     }

                     class704.field10291 = null;
                     class631.field9307 = null;
                     class213.field2706 = null;
                     class723.field10573 = 0L;
                     return;
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1708[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method1126(byte arg0, String arg1) {
      boolean var2 = client.field1481;

      try {
         ++field1692;
         if (class597.field8823 && (class112.field1500 & 24) != 0) {
            if (arg0 < 48) {
               field1685 = null;
            }

            boolean var3 = false;
            int var4 = class304.field4255;
            int[] var5 = class710.field10421;
            int var6 = 0;
            if (var2 || var6 < var4) {
               do {
                  class783 var7 = class59.field771[var5[var6]];
                  if (var7.field11422 != null && var7.field11422.equalsIgnoreCase(arg1) && (class204.field2593 == var7 && ~(class112.field1500 & 16) != -1 || var7 != null && (8 & class112.field1500) != 0)) {
                     ++class145.field1821;
                     class702 var8 = class19.method142(class387.field5365.field8765, class666.field9868, (byte)-103);
                     var8.field10264.method598(0, 56);
                     var8.field10264.method611(class371.field5188, -1344798296);
                     var8.field10264.method609(-3, class226.field2826);
                     var8.field10264.method643(false, var5[var6]);
                     var8.field10264.method641(class26.field392, -112);
                     class387.field5365.method4423(var8, (byte)115);
                     var3 = true;
                     class412.method3236(true, -2, var7.method78(0), 0, var7.field210[0], var7.field205[0], 0, 0, var7.method78(0));
                     if (!var2) {
                        break;
                     }
                  }

                  ++var6;
               } while(var6 < var4);
            }

            if (!var3) {
               class632.method4663(class606.field8924.method4490(class782.field11389, -16777216) + arg1, 4, -115);
            }

            if (class597.field8823) {
               class321.method2526(27352);
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1708[5] + arg0 + ',' + (arg1 != null ? field1708[2] : field1708[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1127(byte arg0) {
      try {
         field1704 = null;
         field1685 = null;
         int var1 = -12 / ((arg0 - 77) / 49);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1708[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "<init>",
      descriptor = "([BI[B)V"
   )
   public class134(byte[] arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field1481;
      super();

      try {
         this.field1701 = class776.method5606(arg0, (byte)-70, arg0.length);
         if (this.field1701 != arg1) {
            throw new RuntimeException();
         } else {
            if (arg2 != null) {
               if (arg2.length != 64) {
                  throw new RuntimeException();
               }

               this.field1698 = class673.method4925(8, arg0, arg0.length, 0);
               int var5 = 0;
               if (var4 || var5 < 64) {
                  do {
                     if (~this.field1698[var5] != ~arg2[var5]) {
                        throw new RuntimeException();
                     }

                     ++var5;
                  } while(var5 < 64);
               }
            }

            this.method1124(arg0, -68);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1708[1] + (arg0 != null ? field1708[2] : field1708[3]) + ',' + arg1 + ',' + (arg2 != null ? field1708[2] : field1708[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
