import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class751 {
   @OriginalMember(
      owner = "client!wc",
      name = "g",
      descriptor = "I"
   )
   public int field11128;
   @OriginalMember(
      owner = "client!wc",
      name = "l",
      descriptor = "[B"
   )
   private byte[] field11133;
   @OriginalMember(
      owner = "client!wc",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11148 = new String[]{method5518(method5517(";|\"\u0007\\")), method5518(method5517("71\"k\t")), method5518(method5517(";|\"y\u001d\"vx{\\")), method5518(method5517("\"j`)")), method5518(method5517(";|\"\u0006\\")), method5518(method5517(";|\"\u0004\\"))};
   @OriginalMember(
      owner = "client!wc",
      name = "k",
      descriptor = "I"
   )
   public static int field11131 = 0;
   @OriginalMember(
      owner = "client!wc",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field11143 = new int[1];
   @OriginalMember(
      owner = "client!wc",
      name = "v",
      descriptor = "Lvv;"
   )
   public static class308 field11122 = new class308();
   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "Lbda;"
   )
   public static class783 field11145 = new class783(1, 2);
   @OriginalMember(
      owner = "client!wc",
      name = "w",
      descriptor = "Ljl;"
   )
   public static class133 field11146 = new class133();
   @OriginalMember(
      owner = "client!wc",
      name = "d",
      descriptor = "F"
   )
   public static float field11147;
   @OriginalMember(
      owner = "client!wc",
      name = "j",
      descriptor = "I"
   )
   public static int field11124;
   @OriginalMember(
      owner = "client!wc",
      name = "y",
      descriptor = "I"
   )
   public static int field11125;
   @OriginalMember(
      owner = "client!wc",
      name = "i",
      descriptor = "I"
   )
   public static int field11134;
   @OriginalMember(
      owner = "client!wc",
      name = "s",
      descriptor = "I"
   )
   public int field11135;
   @OriginalMember(
      owner = "client!wc",
      name = "q",
      descriptor = "I"
   )
   public int field11137;
   @OriginalMember(
      owner = "client!wc",
      name = "p",
      descriptor = "I"
   )
   public int field11139;
   @OriginalMember(
      owner = "client!wc",
      name = "r",
      descriptor = "Lmh;"
   )
   public class280 field11130;
   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field11144;
   @OriginalMember(
      owner = "client!wc",
      name = "b",
      descriptor = "[I"
   )
   public int[] field11123;
   @OriginalMember(
      owner = "client!wc",
      name = "c",
      descriptor = "[I"
   )
   public int[] field11127;
   @OriginalMember(
      owner = "client!wc",
      name = "x",
      descriptor = "[I"
   )
   public int[] field11132;
   @OriginalMember(
      owner = "client!wc",
      name = "n",
      descriptor = "[I"
   )
   public int[] field11138;
   @OriginalMember(
      owner = "client!wc",
      name = "u",
      descriptor = "[I"
   )
   public int[] field11140;
   @OriginalMember(
      owner = "client!wc",
      name = "t",
      descriptor = "[I"
   )
   public int[] field11141;
   @OriginalMember(
      owner = "client!wc",
      name = "m",
      descriptor = "[Lmh;"
   )
   public class280[] field11126;
   @OriginalMember(
      owner = "client!wc",
      name = "f",
      descriptor = "[[B"
   )
   public byte[][] field11142;
   @OriginalMember(
      owner = "client!wc",
      name = "h",
      descriptor = "[[I"
   )
   public int[][] field11129;
   @OriginalMember(
      owner = "client!wc",
      name = "e",
      descriptor = "[[I"
   )
   public int[][] field11136;

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "([BB)V",
      line = 4
   )
   private final void method5514(byte[] arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         ++field11134;
         class354 var4 = new class354(class514.method3983(arg0, 7));
         int var5 = var4.method2855(-31007);
         if (var5 >= 5 && var5 <= 6) {
            label535: {
               if (~var5 <= -7) {
                  this.field11139 = var4.method2894(123);
                  if (!var3) {
                     break label535;
                  }
               }

               this.field11139 = 0;
            }

            int var6 = var4.method2855(-31007);
            int var7 = (1 & var6) == 0 ? 0 : 1;
            int var8 = (2 & var6) == 0 ? 0 : 1;
            this.field11135 = var4.method2848(-114);
            int var9 = 0;
            this.field11140 = new int[this.field11135];
            int var10 = -1;
            int var11 = 0;
            if (var3) {
               this.field11140[var11] = var9 += var4.method2848(-117);
               if (~var10 > ~this.field11140[var11]) {
                  var10 = this.field11140[var11];
               }

               ++var11;
            }

            while(true) {
               while(~this.field11135 < ~var11) {
                  this.field11140[var11] = var9 += var4.method2848(-117);
                  if (~var10 > ~this.field11140[var11]) {
                     var10 = this.field11140[var11];
                  }

                  ++var11;
               }

               this.field11137 = var10 + 1;
               if (!var3) {
                  if (var8 != 0) {
                     this.field11142 = new byte[this.field11137][];
                  }

                  this.field11129 = new int[this.field11137][];
                  this.field11123 = new int[this.field11137];
                  this.field11138 = new int[this.field11137];
                  this.field11127 = new int[this.field11137];
                  this.field11132 = new int[this.field11137];
                  if (var7 != 0) {
                     this.field11141 = new int[this.field11137];
                     int var12 = 0;
                     if (var3) {
                        this.field11141[var12] = -1;
                        ++var12;
                     }

                     while(true) {
                        while(this.field11137 > var12) {
                           this.field11141[var12] = -1;
                           ++var12;
                        }

                        int var13 = 0;
                        if (!var3) {
                           class751 var10000;
                           label474: {
                              if (var3) {
                                 var10000 = this;
                              } else if (this.field11135 <= var13) {
                                 var10000 = this;
                                 if (!var3) {
                                    break label474;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              while(true) {
                                 var10000.field11141[this.field11140[var13]] = var4.method2894(115);
                                 ++var13;
                                 if (this.field11135 <= var13) {
                                    var10000 = this;
                                    if (!var3) {
                                       break;
                                    }
                                 } else {
                                    var10000 = this;
                                 }
                              }
                           }

                           var10000.field11130 = new class280(this.field11141);
                           break;
                        }

                        ++var12;
                     }
                  }

                  if (arg1 > -2) {
                     return;
                  }

                  int var14 = 0;
                  if (var3) {
                     this.field11132[this.field11140[var14]] = var4.method2894(113);
                     ++var14;
                  }

                  while(true) {
                     while(~var14 > ~this.field11135) {
                        this.field11132[this.field11140[var14]] = var4.method2894(113);
                        ++var14;
                     }

                     if (!var3) {
                        if (var8 != 0) {
                           int var15 = 0;
                           if (var3 || var15 < this.field11135) {
                              do {
                                 byte[] var16 = new byte[64];
                                 var4.method2859(var16, 0, false, 64);
                                 this.field11142[this.field11140[var15]] = var16;
                                 ++var15;
                              } while(var15 < this.field11135);
                           }
                        }

                        int var17 = 0;
                        if (var3) {
                           this.field11138[this.field11140[var17]] = var4.method2894(119);
                           ++var17;
                        }

                        while(true) {
                           while(this.field11135 > var17) {
                              this.field11138[this.field11140[var17]] = var4.method2894(119);
                              ++var17;
                           }

                           int var18 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field11123[this.field11140[var18]] = var4.method2848(-108);
                                 ++var18;
                              }

                              while(true) {
                                 while(this.field11135 > var18) {
                                    this.field11123[this.field11140[var18]] = var4.method2848(-108);
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
                                       var20 = this.field11140[var19];
                                       var21 = this.field11123[var20];
                                       var22 = 0;
                                       var23 = -1;
                                       this.field11129[var20] = new int[var21];
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field11129[var20][var24] = var22 += var4.method2848(-115);
                                          if (var23 < var25) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    } else {
                                       if (this.field11135 <= var19) {
                                          var34 = var7;
                                          if (!var3) {
                                             if (var7 == 0) {
                                                return;
                                             }

                                             this.field11136 = new int[var10 + 1][];
                                             this.field11126 = new class280[var10 + 1];
                                             var26 = 0;
                                             if (!var3 && this.field11135 <= var26) {
                                                return;
                                             }

                                             label281:
                                             do {
                                                var27 = this.field11140[var26];
                                                var28 = this.field11123[var27];
                                                this.field11136[var27] = new int[this.field11127[var27]];
                                                var29 = 0;
                                                if (var3) {
                                                   this.field11136[var27][var29] = -1;
                                                   ++var29;
                                                }

                                                while(true) {
                                                   while(~this.field11127[var27] < ~var29) {
                                                      this.field11136[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   var30 = 0;
                                                   if (!var3) {
                                                      if (var3) {
                                                         if (this.field11129[var27] == null) {
                                                            if (var3) {
                                                               var31 = this.field11129[var27][var30];
                                                               this.field11136[var27][var31] = var4.method2894(105);
                                                               ++var30;
                                                            } else {
                                                               this.field11136[var27][var30] = var4.method2894(105);
                                                               ++var30;
                                                            }
                                                         } else {
                                                            var31 = this.field11129[var27][var30];
                                                            this.field11136[var27][var31] = var4.method2894(105);
                                                            ++var30;
                                                         }
                                                      }

                                                      while(true) {
                                                         while(~var30 > ~var28) {
                                                            if (this.field11129[var27] == null) {
                                                               if (var3) {
                                                                  var31 = this.field11129[var27][var30];
                                                                  this.field11136[var27][var31] = var4.method2894(105);
                                                                  ++var30;
                                                               } else {
                                                                  this.field11136[var27][var30] = var4.method2894(105);
                                                                  ++var30;
                                                               }
                                                            } else {
                                                               var31 = this.field11129[var27][var30];
                                                               this.field11136[var27][var31] = var4.method2894(105);
                                                               ++var30;
                                                            }
                                                         }

                                                         this.field11126[var27] = new class280(this.field11136[var27]);
                                                         if (!var3) {
                                                            ++var26;
                                                            continue label281;
                                                         }

                                                         var31 = this.field11129[var27][var30];
                                                         this.field11136[var27][var31] = var4.method2894(105);
                                                         ++var30;
                                                      }
                                                   }

                                                   ++var29;
                                                }
                                             } while(this.field11135 > var26);

                                             return;
                                          }
                                       } else {
                                          var34 = this.field11140[var19];
                                       }

                                       var20 = var34;
                                       var21 = this.field11123[var20];
                                       var22 = 0;
                                       var23 = -1;
                                       this.field11129[var20] = new int[var21];
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field11129[var20][var24] = var22 += var4.method2848(-115);
                                          if (var23 < var25) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    }

                                    while(true) {
                                       while(var24 < var21) {
                                          var25 = this.field11129[var20][var24] = var22 += var4.method2848(-115);
                                          if (var23 < var25) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }

                                       this.field11127[var20] = var23 + 1;
                                       if (!var3) {
                                          if (var21 == var23 - -1) {
                                             this.field11129[var20] = null;
                                          }

                                          ++var19;
                                          if (this.field11135 <= var19) {
                                             var34 = var7;
                                             if (!var3) {
                                                if (var7 == 0) {
                                                   return;
                                                }

                                                this.field11136 = new int[var10 + 1][];
                                                this.field11126 = new class280[var10 + 1];
                                                var26 = 0;
                                                if (!var3 && this.field11135 <= var26) {
                                                   return;
                                                }

                                                label198:
                                                do {
                                                   var27 = this.field11140[var26];
                                                   var28 = this.field11123[var27];
                                                   this.field11136[var27] = new int[this.field11127[var27]];
                                                   var29 = 0;
                                                   if (var3) {
                                                      this.field11136[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   while(true) {
                                                      while(~this.field11127[var27] < ~var29) {
                                                         this.field11136[var27][var29] = -1;
                                                         ++var29;
                                                      }

                                                      var30 = 0;
                                                      if (!var3) {
                                                         if (var3) {
                                                            if (this.field11129[var27] == null) {
                                                               if (var3) {
                                                                  var31 = this.field11129[var27][var30];
                                                                  this.field11136[var27][var31] = var4.method2894(105);
                                                                  ++var30;
                                                               } else {
                                                                  this.field11136[var27][var30] = var4.method2894(105);
                                                                  ++var30;
                                                               }
                                                            } else {
                                                               var31 = this.field11129[var27][var30];
                                                               this.field11136[var27][var31] = var4.method2894(105);
                                                               ++var30;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(~var30 > ~var28) {
                                                               if (this.field11129[var27] == null) {
                                                                  if (var3) {
                                                                     var31 = this.field11129[var27][var30];
                                                                     this.field11136[var27][var31] = var4.method2894(105);
                                                                     ++var30;
                                                                  } else {
                                                                     this.field11136[var27][var30] = var4.method2894(105);
                                                                     ++var30;
                                                                  }
                                                               } else {
                                                                  var31 = this.field11129[var27][var30];
                                                                  this.field11136[var27][var31] = var4.method2894(105);
                                                                  ++var30;
                                                               }
                                                            }

                                                            this.field11126[var27] = new class280(this.field11136[var27]);
                                                            if (!var3) {
                                                               ++var26;
                                                               continue label198;
                                                            }

                                                            var31 = this.field11129[var27][var30];
                                                            this.field11136[var27][var31] = var4.method2894(105);
                                                            ++var30;
                                                         }
                                                      }

                                                      ++var29;
                                                   }
                                                } while(this.field11135 > var26);

                                                return;
                                             }
                                          } else {
                                             var34 = this.field11140[var19];
                                          }

                                          var20 = var34;
                                          var21 = this.field11123[var20];
                                          var22 = 0;
                                          var23 = -1;
                                          this.field11129[var20] = new int[var21];
                                          var24 = 0;
                                          if (var3) {
                                             var25 = this.field11129[var20][var24] = var22 += var4.method2848(-115);
                                             if (var23 < var25) {
                                                var23 = var25;
                                             }

                                             ++var24;
                                          }
                                       } else {
                                          if (var23 < var21) {
                                             var23 = var21;
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

               if (var8 > ~this.field11140[var11]) {
                  var10 = this.field11140[var11];
               }

               ++var11;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var33) {
         throw class482.method3757(var33, field11148[5] + (arg0 != null ? field11148[1] : field11148[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(Z)V",
      line = 216
   )
   public static void method5515(boolean arg0) {
      try {
         field11143 = null;
         field11144 = null;
         field11145 = null;
         field11122 = null;
         field11146 = null;
         if (arg0) {
            field11131 = 12;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11148[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(IIIIZ)V",
      line = 241
   )
   public static final void method5516(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field11124;
         class566 var5 = class146.method1321((long)arg2, 8, -1428737160);
         var5.method4269((byte)-106);
         var5.field8398 = arg0;
         if (!arg4) {
            field11146 = null;
         }

         var5.field8390 = arg1;
         var5.field8394 = arg3;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11148[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "<init>",
      descriptor = "([BI[B)V",
      line = 256
   )
   public class751(byte[] arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field1786;
      super();

      try {
         this.field11128 = class235.method2018(arg0.length, -63, arg0);
         if (~this.field11128 != ~arg1) {
            throw new RuntimeException();
         } else {
            if (arg2 != null) {
               if (arg2.length != 64) {
                  throw new RuntimeException();
               }

               this.field11133 = class738.method5423(arg0, arg0.length, -3436, 0);
               int var5 = 0;
               if (var4 || var5 < 64) {
                  do {
                     if (this.field11133[var5] != arg2[var5]) {
                        throw new RuntimeException();
                     }

                     ++var5;
                  } while(var5 < 64);
               }
            }

            this.method5514(arg0, (byte)-13);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11148[2] + (arg0 != null ? field11148[1] : field11148[3]) + ',' + arg1 + ',' + (arg2 != null ? field11148[1] : field11148[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5517(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5518(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
