import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class738 {
   @OriginalMember(
      owner = "client!mf",
      name = "j",
      descriptor = "I"
   )
   public int field10534;
   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "[B"
   )
   private byte[] field10528;
   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10546 = new String[]{method5340(method5339("Q3\u001d-\u0001")), method5340(method5339("R _\u0003")), method5340(method5339("G{\u001dAT")), method5340(method5339("Q3\u001d.\u0001")), method5340(method5339("Q3\u001dS@R<GQ\u0001"))};
   @OriginalMember(
      owner = "client!mf",
      name = "t",
      descriptor = "Lfm;"
   )
   public static class164 field10540 = new class164(71, 0);
   @OriginalMember(
      owner = "client!mf",
      name = "p",
      descriptor = "Lfm;"
   )
   public static class164 field10545 = new class164(12, -1);
   @OriginalMember(
      owner = "client!mf",
      name = "k",
      descriptor = "I"
   )
   public int field10530;
   @OriginalMember(
      owner = "client!mf",
      name = "b",
      descriptor = "I"
   )
   public int field10536;
   @OriginalMember(
      owner = "client!mf",
      name = "d",
      descriptor = "I"
   )
   public int field10538;
   @OriginalMember(
      owner = "client!mf",
      name = "e",
      descriptor = "I"
   )
   public static int field10539;
   @OriginalMember(
      owner = "client!mf",
      name = "l",
      descriptor = "Lsa;"
   )
   public static class39 field10533;
   @OriginalMember(
      owner = "client!mf",
      name = "i",
      descriptor = "Lsl;"
   )
   public class746 field10535;
   @OriginalMember(
      owner = "client!mf",
      name = "g",
      descriptor = "[I"
   )
   public int[] field10526;
   @OriginalMember(
      owner = "client!mf",
      name = "r",
      descriptor = "[I"
   )
   public int[] field10529;
   @OriginalMember(
      owner = "client!mf",
      name = "m",
      descriptor = "[I"
   )
   public int[] field10531;
   @OriginalMember(
      owner = "client!mf",
      name = "s",
      descriptor = "[I"
   )
   public int[] field10542;
   @OriginalMember(
      owner = "client!mf",
      name = "o",
      descriptor = "[I"
   )
   public int[] field10543;
   @OriginalMember(
      owner = "client!mf",
      name = "f",
      descriptor = "[I"
   )
   public int[] field10544;
   @OriginalMember(
      owner = "client!mf",
      name = "n",
      descriptor = "[Lsl;"
   )
   public class746[] field10537;
   @OriginalMember(
      owner = "client!mf",
      name = "c",
      descriptor = "[[B"
   )
   public byte[][] field10527;
   @OriginalMember(
      owner = "client!mf",
      name = "q",
      descriptor = "[[I"
   )
   public int[][] field10532;
   @OriginalMember(
      owner = "client!mf",
      name = "h",
      descriptor = "[[I"
   )
   public int[][] field10541;

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5337(int arg0) {
      try {
         if (arg0 != 2) {
            method5337(-40);
         }

         field10545 = null;
         field10533 = null;
         field10540 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10546[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "([BI)V"
   )
   private final void method5338(byte[] arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field10539;
         class65 var4 = new class65(class721.method5219(arg0, 59));
         int var5 = var4.method665(false);
         if (~var5 <= -6 && ~var5 >= -7) {
            label506: {
               if (var5 >= 6) {
                  this.field10530 = var4.method701(255);
                  if (!var3) {
                     break label506;
                  }
               }

               this.field10530 = 0;
            }

            int var6 = var4.method665(false);
            int var7 = ~(var6 & 1) == -1 ? 0 : 1;
            this.field10538 = var4.method685(-2);
            int var8 = ~(var6 & 2) == -1 ? 0 : 1;
            int var9 = 0;
            this.field10529 = new int[this.field10538];
            int var10 = -1;
            int var11 = 0;
            if (var3) {
               this.field10529[var11] = var9 += var4.method685(-2);
               if (var10 < this.field10529[var11]) {
                  var10 = this.field10529[var11];
               }

               ++var11;
            }

            while(true) {
               while(~var11 > ~this.field10538) {
                  this.field10529[var11] = var9 += var4.method685(-2);
                  if (var10 < this.field10529[var11]) {
                     var10 = this.field10529[var11];
                  }

                  ++var11;
               }

               this.field10536 = var10 + 1;
               this.field10542 = new int[this.field10536];
               if (!var3) {
                  if (var8 != 0) {
                     this.field10527 = new byte[this.field10536][];
                  }

                  this.field10526 = new int[this.field10536];
                  this.field10532 = new int[this.field10536][];
                  this.field10543 = new int[this.field10536];
                  this.field10544 = new int[this.field10536];
                  if (var7 != 0) {
                     this.field10531 = new int[this.field10536];
                     int var12 = 0;
                     if (var3) {
                        this.field10531[var12] = -1;
                        ++var12;
                     }

                     label445:
                     while(true) {
                        while(~this.field10536 < ~var12) {
                           this.field10531[var12] = -1;
                           ++var12;
                        }

                        int var13 = 0;
                        if (!var3) {
                           if (var3) {
                              this.field10531[this.field10529[var13]] = var4.method701(255);
                              ++var13;
                           }

                           while(true) {
                              class738 var10000;
                              if (~this.field10538 >= ~var13) {
                                 var10000 = this;
                                 if (!var3) {
                                    this.field10535 = new class746(this.field10531);
                                    break label445;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              var10000.field10531[this.field10529[var13]] = var4.method701(255);
                              ++var13;
                           }
                        }

                        ++var12;
                     }
                  }

                  int var14 = 0;
                  if (var3) {
                     this.field10526[this.field10529[var14]] = var4.method701(255);
                     ++var14;
                  }

                  while(true) {
                     while(this.field10538 > var14) {
                        this.field10526[this.field10529[var14]] = var4.method701(255);
                        ++var14;
                     }

                     if (!var3) {
                        if (var8 != 0) {
                           int var15 = 0;
                           if (var3 || this.field10538 > var15) {
                              do {
                                 byte[] var16 = new byte[64];
                                 var4.method678(64, -32768, 0, var16);
                                 this.field10527[this.field10529[var15]] = var16;
                                 ++var15;
                              } while(this.field10538 > var15);
                           }
                        }

                        int var17 = -74 / ((arg1 - 13) / 58);
                        int var18 = 0;
                        if (var3) {
                           this.field10543[this.field10529[var18]] = var4.method701(255);
                           ++var18;
                        }

                        while(true) {
                           while(~this.field10538 < ~var18) {
                              this.field10543[this.field10529[var18]] = var4.method701(255);
                              ++var18;
                           }

                           int var19 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field10544[this.field10529[var19]] = var4.method685(-2);
                                 ++var19;
                              }

                              while(true) {
                                 while(this.field10538 > var19) {
                                    this.field10544[this.field10529[var19]] = var4.method685(-2);
                                    ++var19;
                                 }

                                 int var20 = 0;
                                 if (!var3) {
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
                                    int var32;
                                    int var35;
                                    if (var3) {
                                       var21 = this.field10529[var20];
                                       var22 = 0;
                                       var23 = this.field10544[var21];
                                       var24 = -1;
                                       this.field10532[var21] = new int[var23];
                                       var25 = 0;
                                       if (var3) {
                                          var26 = this.field10532[var21][var25] = var22 += var4.method685(-2);
                                          if (~var26 < ~var24) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }
                                    } else {
                                       if (~var20 <= ~this.field10538) {
                                          var35 = var7;
                                          if (!var3) {
                                             if (var7 == 0) {
                                                return;
                                             }

                                             this.field10541 = new int[var10 + 1][];
                                             this.field10537 = new class746[var10 + 1];
                                             var27 = 0;
                                             if (!var3 && ~var27 <= ~this.field10538) {
                                                return;
                                             }

                                             label268:
                                             do {
                                                var28 = this.field10529[var27];
                                                var29 = this.field10544[var28];
                                                this.field10541[var28] = new int[this.field10542[var28]];
                                                var30 = 0;
                                                if (var3) {
                                                   this.field10541[var28][var30] = -1;
                                                   ++var30;
                                                }

                                                while(true) {
                                                   while(~this.field10542[var28] < ~var30) {
                                                      this.field10541[var28][var30] = -1;
                                                      ++var30;
                                                   }

                                                   var31 = 0;
                                                   if (!var3) {
                                                      if (var3) {
                                                         if (this.field10532[var28] != null) {
                                                            var32 = this.field10532[var28][var31];
                                                            if (var3) {
                                                               var32 = var31;
                                                            }
                                                         } else {
                                                            var32 = var31;
                                                         }

                                                         this.field10541[var28][var32] = var4.method701(255);
                                                         ++var31;
                                                      }

                                                      while(true) {
                                                         while(~var29 < ~var31) {
                                                            if (this.field10532[var28] != null) {
                                                               var32 = this.field10532[var28][var31];
                                                               if (var3) {
                                                                  var32 = var31;
                                                               }
                                                            } else {
                                                               var32 = var31;
                                                            }

                                                            this.field10541[var28][var32] = var4.method701(255);
                                                            ++var31;
                                                         }

                                                         this.field10537[var28] = new class746(this.field10541[var28]);
                                                         if (!var3) {
                                                            ++var27;
                                                            continue label268;
                                                         }

                                                         this.field10541[var28][var31] = var4.method701(255);
                                                         ++var31;
                                                      }
                                                   }

                                                   ++var30;
                                                }
                                             } while(~var27 > ~this.field10538);

                                             return;
                                          }
                                       } else {
                                          var35 = this.field10529[var20];
                                       }

                                       var21 = var35;
                                       var22 = 0;
                                       var23 = this.field10544[var21];
                                       var24 = -1;
                                       this.field10532[var21] = new int[var23];
                                       var25 = 0;
                                       if (var3) {
                                          var26 = this.field10532[var21][var25] = var22 += var4.method685(-2);
                                          if (~var26 < ~var24) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }
                                    }

                                    while(true) {
                                       while(var25 < var23) {
                                          var26 = this.field10532[var21][var25] = var22 += var4.method685(-2);
                                          if (~var26 < ~var24) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }

                                       this.field10542[var21] = var24 + 1;
                                       var35 = var24 + 1;
                                       if (!var3) {
                                          if (var35 == var23) {
                                             this.field10532[var21] = null;
                                          }

                                          ++var20;
                                          if (~var20 <= ~this.field10538) {
                                             var35 = var7;
                                             if (!var3) {
                                                if (var7 == 0) {
                                                   return;
                                                }

                                                this.field10541 = new int[var10 + 1][];
                                                this.field10537 = new class746[var10 + 1];
                                                var27 = 0;
                                                if (!var3 && ~var27 <= ~this.field10538) {
                                                   return;
                                                }

                                                label185:
                                                do {
                                                   var28 = this.field10529[var27];
                                                   var29 = this.field10544[var28];
                                                   this.field10541[var28] = new int[this.field10542[var28]];
                                                   var30 = 0;
                                                   if (var3) {
                                                      this.field10541[var28][var30] = -1;
                                                      ++var30;
                                                   }

                                                   while(true) {
                                                      while(~this.field10542[var28] < ~var30) {
                                                         this.field10541[var28][var30] = -1;
                                                         ++var30;
                                                      }

                                                      var31 = 0;
                                                      if (!var3) {
                                                         if (var3) {
                                                            if (this.field10532[var28] != null) {
                                                               var32 = this.field10532[var28][var31];
                                                               if (var3) {
                                                                  var32 = var31;
                                                               }
                                                            } else {
                                                               var32 = var31;
                                                            }

                                                            this.field10541[var28][var32] = var4.method701(255);
                                                            ++var31;
                                                         }

                                                         while(true) {
                                                            while(~var29 < ~var31) {
                                                               if (this.field10532[var28] != null) {
                                                                  var32 = this.field10532[var28][var31];
                                                                  if (var3) {
                                                                     var32 = var31;
                                                                  }
                                                               } else {
                                                                  var32 = var31;
                                                               }

                                                               this.field10541[var28][var32] = var4.method701(255);
                                                               ++var31;
                                                            }

                                                            this.field10537[var28] = new class746(this.field10541[var28]);
                                                            if (!var3) {
                                                               ++var27;
                                                               continue label185;
                                                            }

                                                            this.field10541[var28][var31] = var4.method701(255);
                                                            ++var31;
                                                         }
                                                      }

                                                      ++var30;
                                                   }
                                                } while(~var27 > ~this.field10538);

                                                return;
                                             }
                                          } else {
                                             var35 = this.field10529[var20];
                                          }

                                          var21 = var35;
                                          var22 = 0;
                                          var23 = this.field10544[var21];
                                          var24 = -1;
                                          this.field10532[var21] = new int[var23];
                                          var25 = 0;
                                          if (var3) {
                                             var26 = this.field10532[var21][var25] = var22 += var4.method685(-2);
                                             if (~var26 < ~var24) {
                                                var24 = var26;
                                             }

                                             ++var25;
                                          }
                                       } else {
                                          var26 = var35;
                                          if (~var26 < ~var24) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }

                           ++var18;
                        }
                     }

                     ++var14;
                  }
               }

               if (var8 < this.field10529[var11]) {
                  var10 = this.field10529[var11];
               }

               ++var11;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var34) {
         throw class612.method4503(var34, field10546[0] + (arg0 != null ? field10546[2] : field10546[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "<init>",
      descriptor = "([BI[B)V"
   )
   public class738(byte[] arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field10022;
      super();

      try {
         this.field10534 = class359.method2821(8052, arg0.length, arg0);
         if (this.field10534 != arg1) {
            throw new RuntimeException();
         } else {
            if (arg2 != null) {
               if (arg2.length != 64) {
                  throw new RuntimeException();
               }

               this.field10528 = class36.method414(0, 0, arg0, arg0.length);
               int var5 = 0;
               if (var4 || var5 < 64) {
                  do {
                     if (~this.field10528[var5] != ~arg2[var5]) {
                        throw new RuntimeException();
                     }

                     ++var5;
                  } while(var5 < 64);
               }
            }

            this.method5338(arg0, 78);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10546[4] + (arg0 != null ? field10546[2] : field10546[1]) + ',' + arg1 + ',' + (arg2 != null ? field10546[2] : field10546[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5339(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5340(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
