import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class372 {
   @OriginalMember(
      owner = "client!jp",
      name = "l",
      descriptor = "I"
   )
   public int field5526 = -1;
   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5542 = new String[]{method2912(method2911("~Z:c")), method2912(method2911("k\u0001x!S")), method2912(method2911("z_xK\u0006")), method2912(method2911("z_xL\u0006")), method2912(method2911("z_xN\u0006")), method2912(method2911("z_xM\u0006"))};
   @OriginalMember(
      owner = "client!jp",
      name = "r",
      descriptor = "Liw;"
   )
   public static class332 field5536 = new class332();
   @OriginalMember(
      owner = "client!jp",
      name = "c",
      descriptor = "I"
   )
   public static int field5529;
   @OriginalMember(
      owner = "client!jp",
      name = "t",
      descriptor = "I"
   )
   public static int field5530;
   @OriginalMember(
      owner = "client!jp",
      name = "u",
      descriptor = "I"
   )
   public static int field5538;
   @OriginalMember(
      owner = "client!jp",
      name = "p",
      descriptor = "I"
   )
   public static int field5541;
   @OriginalMember(
      owner = "client!jp",
      name = "h",
      descriptor = "Lld;"
   )
   private class178 field5537;
   @OriginalMember(
      owner = "client!jp",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   private String field5531;
   @OriginalMember(
      owner = "client!jp",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   private String field5539;
   @OriginalMember(
      owner = "client!jp",
      name = "e",
      descriptor = "[I"
   )
   private int[] field5520;
   @OriginalMember(
      owner = "client!jp",
      name = "v",
      descriptor = "[I"
   )
   private int[] field5523;
   @OriginalMember(
      owner = "client!jp",
      name = "m",
      descriptor = "[I"
   )
   private int[] field5524;
   @OriginalMember(
      owner = "client!jp",
      name = "k",
      descriptor = "[I"
   )
   private int[] field5525;
   @OriginalMember(
      owner = "client!jp",
      name = "s",
      descriptor = "[I"
   )
   private int[] field5533;
   @OriginalMember(
      owner = "client!jp",
      name = "g",
      descriptor = "[I"
   )
   private int[] field5534;
   @OriginalMember(
      owner = "client!jp",
      name = "d",
      descriptor = "[I"
   )
   private int[] field5535;
   @OriginalMember(
      owner = "client!jp",
      name = "f",
      descriptor = "[I"
   )
   private int[] field5540;
   @OriginalMember(
      owner = "client!jp",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field5521;
   @OriginalMember(
      owner = "client!jp",
      name = "o",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field5532;
   @OriginalMember(
      owner = "client!jp",
      name = "i",
      descriptor = "[[I"
   )
   private int[][] field5522;
   @OriginalMember(
      owner = "client!jp",
      name = "n",
      descriptor = "[[I"
   )
   private int[][] field5527;
   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "[[I"
   )
   private int[][] field5528;

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2907(int arg0) {
      try {
         field5536 = null;
         if (arg0 != -15) {
            method2907(-10);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5542[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(Luda;B)V"
   )
   public final void method2908(class473 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg0.method3564((byte)-42);
            if (var4 != 0) {
               this.method2910(arg0, -21626, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != 14) {
               return;
            }

            ++field5529;
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5542[3] + (arg0 != null ? field5542[1] : field5542[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2909(int arg0) {
      try {
         if (arg0 <= 17) {
            method2907(98);
         }

         if (this.field5539 == null) {
            this.field5539 = this.field5531;
         }

         ++field5538;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5542[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   private final void method2910(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label382: {
            if (~arg2 != -2) {
               if (~arg2 != -3) {
                  if (arg2 == 3) {
                     int var5 = arg0.method3564((byte)-80);
                     this.field5522 = new int[var5][3];
                     int var6 = 0;
                     if (var4) {
                        this.field5522[var6][0] = arg0.method3565(true);
                        this.field5522[var6][1] = arg0.method3567(31871);
                        this.field5522[var6][2] = arg0.method3567(31871);
                        ++var6;
                     }

                     while(true) {
                        while(var5 > var6) {
                           this.field5522[var6][0] = arg0.method3565(true);
                           this.field5522[var6][1] = arg0.method3567(31871);
                           this.field5522[var6][2] = arg0.method3567(31871);
                           ++var6;
                        }

                        if (!var4) {
                           if (!var4) {
                              break label382;
                           }
                           break;
                        }

                        ++var6;
                     }
                  }

                  if (arg2 == 4) {
                     int var7 = arg0.method3564((byte)-106);
                     this.field5528 = new int[var7][3];
                     int var8 = 0;
                     if (var4) {
                        this.field5528[var8][0] = arg0.method3565(true);
                        this.field5528[var8][1] = arg0.method3567(31871);
                        this.field5528[var8][2] = arg0.method3567(31871);
                        ++var8;
                     }

                     while(true) {
                        while(var7 > var8) {
                           this.field5528[var8][0] = arg0.method3565(true);
                           this.field5528[var8][1] = arg0.method3567(31871);
                           this.field5528[var8][2] = arg0.method3567(31871);
                           ++var8;
                        }

                        if (!var4) {
                           if (!var4) {
                              break label382;
                           }
                           break;
                        }

                        ++var8;
                     }
                  }

                  if (arg2 == 5) {
                     arg0.method3565(true);
                     if (!var4) {
                        break label382;
                     }
                  }

                  if (~arg2 != -7) {
                     if (~arg2 != -8) {
                        if (arg2 == 8) {
                           break label382;
                        }

                        if (arg2 == 9) {
                           arg0.method3564((byte)-40);
                           if (!var4) {
                              break label382;
                           }
                        }

                        if (arg2 != 10) {
                           if (arg2 != 12) {
                              if (arg2 != 13) {
                                 if (~arg2 != -15) {
                                    if (~arg2 != -16) {
                                       if (arg2 != 17) {
                                          if (~arg2 != -19) {
                                             if (arg2 != 19) {
                                                label417: {
                                                   if (arg2 != 249) {
                                                      break label382;
                                                   }

                                                   int var9 = arg0.method3564((byte)-54);
                                                   if (this.field5537 == null) {
                                                      int var10 = class71.method752(var9, true);
                                                      this.field5537 = new class178(var10);
                                                   }

                                                   int var11 = 0;
                                                   boolean var10000;
                                                   if (var4) {
                                                      var10000 = ~arg0.method3564((byte)-85) == -2;
                                                   } else if (~var11 <= ~var9) {
                                                      if (!var4) {
                                                         if (!var4) {
                                                            break label382;
                                                         }
                                                         break label417;
                                                      }

                                                      var10000 = true;
                                                   } else {
                                                      var10000 = ~arg0.method3564((byte)-85) == -2;
                                                   }

                                                   while(true) {
                                                      boolean var12 = var10000;
                                                      int var13 = arg0.method3577(-2);
                                                      class22 var14;
                                                      if (var12) {
                                                         var14 = new class266(arg0.method3566(-16496688));
                                                         if (var4) {
                                                            var14 = new class459(arg0.method3567(31871));
                                                         }
                                                      } else {
                                                         var14 = new class459(arg0.method3567(31871));
                                                      }

                                                      this.field5537.method1566(var14, 24742, (long)var13);
                                                      ++var11;
                                                      if (~var11 <= ~var9) {
                                                         if (!var4) {
                                                            if (!var4) {
                                                               break label382;
                                                            }
                                                            break;
                                                         }

                                                         var10000 = true;
                                                      } else {
                                                         var10000 = ~arg0.method3564((byte)-85) == -2;
                                                      }
                                                   }
                                                }
                                             }

                                             int var15 = arg0.method3564((byte)-80);
                                             this.field5540 = new int[var15];
                                             this.field5535 = new int[var15];
                                             this.field5521 = new String[var15];
                                             this.field5533 = new int[var15];
                                             int var16 = 0;
                                             if (var4) {
                                                this.field5533[var16] = arg0.method3567(arg1 + 53497);
                                                this.field5540[var16] = arg0.method3567(arg1 + 53497);
                                                this.field5535[var16] = arg0.method3567(31871);
                                                this.field5521[var16] = arg0.method3566(class513.method3878(arg1, 16510038));
                                                ++var16;
                                             }

                                             while(true) {
                                                while(var16 < var15) {
                                                   this.field5533[var16] = arg0.method3567(arg1 + 53497);
                                                   this.field5540[var16] = arg0.method3567(arg1 + 53497);
                                                   this.field5535[var16] = arg0.method3567(31871);
                                                   this.field5521[var16] = arg0.method3566(class513.method3878(arg1, 16510038));
                                                   ++var16;
                                                }

                                                if (!var4) {
                                                   if (!var4) {
                                                      break label382;
                                                   }
                                                   break;
                                                }

                                                ++var16;
                                             }
                                          }

                                          int var17 = arg0.method3564((byte)-124);
                                          this.field5532 = new String[var17];
                                          this.field5525 = new int[var17];
                                          this.field5534 = new int[var17];
                                          this.field5523 = new int[var17];
                                          int var18 = 0;
                                          if (var4) {
                                             this.field5523[var18] = arg0.method3567(31871);
                                             this.field5534[var18] = arg0.method3567(arg1 + 53497);
                                             this.field5525[var18] = arg0.method3567(31871);
                                             this.field5532[var18] = arg0.method3566(-16496688);
                                             ++var18;
                                          }

                                          while(true) {
                                             while(var17 > var18) {
                                                this.field5523[var18] = arg0.method3567(31871);
                                                this.field5534[var18] = arg0.method3567(arg1 + 53497);
                                                this.field5525[var18] = arg0.method3567(31871);
                                                this.field5532[var18] = arg0.method3566(-16496688);
                                                ++var18;
                                             }

                                             if (!var4) {
                                                if (!var4) {
                                                   break label382;
                                                }
                                                break;
                                             }

                                             ++var18;
                                          }
                                       }

                                       this.field5526 = arg0.method3565(true);
                                       if (!var4) {
                                          break label382;
                                       }
                                    }

                                    arg0.method3565(true);
                                    if (!var4) {
                                       break label382;
                                    }
                                 }

                                 int var19 = arg0.method3564((byte)-88);
                                 this.field5527 = new int[var19][2];
                                 int var20 = 0;
                                 if (var4) {
                                    this.field5527[var20][0] = arg0.method3564((byte)-67);
                                    this.field5527[var20][1] = arg0.method3564((byte)-120);
                                    ++var20;
                                 }

                                 while(true) {
                                    while(~var19 < ~var20) {
                                       this.field5527[var20][0] = arg0.method3564((byte)-67);
                                       this.field5527[var20][1] = arg0.method3564((byte)-120);
                                       ++var20;
                                    }

                                    if (!var4) {
                                       if (!var4) {
                                          break label382;
                                       }
                                       break;
                                    }

                                    ++var20;
                                 }
                              }

                              int var21 = arg0.method3564((byte)-49);
                              this.field5520 = new int[var21];
                              int var22 = 0;
                              if (var4) {
                                 this.field5520[var22] = arg0.method3565(true);
                                 ++var22;
                              }

                              while(true) {
                                 while(~var22 > ~var21) {
                                    this.field5520[var22] = arg0.method3565(true);
                                    ++var22;
                                 }

                                 if (!var4) {
                                    if (!var4) {
                                       break label382;
                                    }
                                    break;
                                 }

                                 ++var22;
                              }
                           }

                           arg0.method3567(31871);
                           if (!var4) {
                              break label382;
                           }
                        }

                        int var23 = arg0.method3564((byte)-79);
                        this.field5524 = new int[var23];
                        int var24 = 0;
                        if (var4) {
                           this.field5524[var24] = arg0.method3567(class513.method3878(arg1, -10247));
                           ++var24;
                        }

                        while(true) {
                           while(var24 < var23) {
                              this.field5524[var24] = arg0.method3567(class513.method3878(arg1, -10247));
                              ++var24;
                           }

                           if (!var4) {
                              if (!var4) {
                                 break label382;
                              }
                              break;
                           }

                           ++var24;
                        }
                     }

                     arg0.method3564((byte)-80);
                     if (!var4) {
                        break label382;
                     }
                  }

                  arg0.method3564((byte)-107);
                  if (!var4) {
                     break label382;
                  }
               }

               this.field5539 = arg0.method3570(false);
               if (!var4) {
                  break label382;
               }
            }

            this.field5531 = arg0.method3570(false);
         }

         ++field5530;
         if (arg1 != -21626) {
            this.method2910((class473)null, 42, 64);
         }
      } catch (RuntimeException var26) {
         throw class608.method4462(var26, field5542[2] + (arg0 != null ? field5542[1] : field5542[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2911(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2912(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
