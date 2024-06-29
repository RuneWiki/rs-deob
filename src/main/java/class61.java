import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class61 {
   @OriginalMember(
      owner = "client!mk",
      name = "i",
      descriptor = "I"
   )
   public int field652 = -1;
   @OriginalMember(
      owner = "client!mk",
      name = "x",
      descriptor = "I"
   )
   public int field647 = -1;
   @OriginalMember(
      owner = "client!mk",
      name = "u",
      descriptor = "I"
   )
   public int field657 = -1;
   @OriginalMember(
      owner = "client!mk",
      name = "k",
      descriptor = "I"
   )
   public int field654 = 5;
   @OriginalMember(
      owner = "client!mk",
      name = "p",
      descriptor = "Z"
   )
   public boolean field665 = false;
   @OriginalMember(
      owner = "client!mk",
      name = "f",
      descriptor = "I"
   )
   public int field656 = 99;
   @OriginalMember(
      owner = "client!mk",
      name = "g",
      descriptor = "Z"
   )
   public boolean field645 = false;
   @OriginalMember(
      owner = "client!mk",
      name = "o",
      descriptor = "Z"
   )
   public boolean field669 = false;
   @OriginalMember(
      owner = "client!mk",
      name = "B",
      descriptor = "Z"
   )
   public boolean field664 = false;
   @OriginalMember(
      owner = "client!mk",
      name = "w",
      descriptor = "I"
   )
   public int field648 = 2;
   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "I"
   )
   public int field670 = -1;
   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "I"
   )
   public int field676 = -1;
   @OriginalMember(
      owner = "client!mk",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field678 = new String[]{method466(method465("r+\u001cT")), method466(method465("q5^yj")), method466(method465("gp^\u0016?")), method466(method465("q5^~j")), method466(method465("q5^}j")), method466(method465("q5^\u007fj")), method466(method465("q5^{j")), method466(method465("q5^|j")), method466(method465("q5^zj"))};
   @OriginalMember(
      owner = "client!mk",
      name = "A",
      descriptor = "Lbga;"
   )
   public static class378 field655 = new class378(42, 20);
   @OriginalMember(
      owner = "client!mk",
      name = "y",
      descriptor = "Lbga;"
   )
   public static class378 field666 = new class378(2, 0);
   @OriginalMember(
      owner = "client!mk",
      name = "E",
      descriptor = "I"
   )
   public static int field672 = 1400;
   @OriginalMember(
      owner = "client!mk",
      name = "r",
      descriptor = "I"
   )
   public static int field673 = 0;
   @OriginalMember(
      owner = "client!mk",
      name = "v",
      descriptor = "I"
   )
   public static int field646;
   @OriginalMember(
      owner = "client!mk",
      name = "m",
      descriptor = "I"
   )
   public static int field649;
   @OriginalMember(
      owner = "client!mk",
      name = "h",
      descriptor = "I"
   )
   public static int field650;
   @OriginalMember(
      owner = "client!mk",
      name = "D",
      descriptor = "I"
   )
   public int field653;
   @OriginalMember(
      owner = "client!mk",
      name = "s",
      descriptor = "I"
   )
   public static int field658;
   @OriginalMember(
      owner = "client!mk",
      name = "F",
      descriptor = "I"
   )
   public static int field660;
   @OriginalMember(
      owner = "client!mk",
      name = "d",
      descriptor = "I"
   )
   public static int field675;
   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "Lqga;"
   )
   public class196 field662;
   @OriginalMember(
      owner = "client!mk",
      name = "n",
      descriptor = "Lbj;"
   )
   public static class255 field671;
   @OriginalMember(
      owner = "client!mk",
      name = "q",
      descriptor = "[I"
   )
   public int[] field661;
   @OriginalMember(
      owner = "client!mk",
      name = "c",
      descriptor = "[I"
   )
   public int[] field663;
   @OriginalMember(
      owner = "client!mk",
      name = "l",
      descriptor = "[I"
   )
   public int[] field667;
   @OriginalMember(
      owner = "client!mk",
      name = "C",
      descriptor = "[I"
   )
   public int[] field668;
   @OriginalMember(
      owner = "client!mk",
      name = "G",
      descriptor = "[I"
   )
   public int[] field674;
   @OriginalMember(
      owner = "client!mk",
      name = "t",
      descriptor = "[I"
   )
   private int[] field677;
   @OriginalMember(
      owner = "client!mk",
      name = "e",
      descriptor = "[Z"
   )
   public boolean[] field651;
   @OriginalMember(
      owner = "client!mk",
      name = "j",
      descriptor = "[[I"
   )
   public int[][] field659;

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(IZII)I"
   )
   public final int method458(int arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field658;
         int var5 = 0;
         int var6 = 0;
         int var7 = this.field667[arg0];
         class477 var8 = null;
         class477 var9 = this.field662.method1478(73, var7 >> 16);
         int var10 = var7 & 65535;
         if (var9 == null) {
            return var5;
         } else {
            if ((this.field669 || class305.field4050) && arg3 != -1 && ~arg3 > ~this.field667.length) {
               int var11 = this.field667[arg3];
               var8 = this.field662.method1478(85, var11 >> 16);
               var6 = var11 & 65535;
            }

            if (this.field645) {
               var5 |= 512;
            }

            if (arg2 > -121) {
               this.field659 = null;
            }

            if (var9.method3482(-19443, var10)) {
               var5 |= 128;
            }

            if (var9.method3479(var10, 0)) {
               var5 |= 256;
            }

            if (var9.method3480(var10, 4)) {
               var5 |= 1024;
            }

            if (var8 != null) {
               if (var8.method3482(-19443, var6)) {
                  var5 |= 128;
               }

               if (var8.method3479(var6, 0)) {
                  var5 |= 256;
               }

               if (var8.method3480(var6, 4)) {
                  var5 |= 1024;
               }
            }

            if (this.field677 != null && arg1) {
               if (this.field677.length > arg0) {
                  int var12 = this.field677[arg0];
                  if (~var12 != -65536) {
                     class477 var13 = this.field662.method1478(122, var12 >> 16);
                     int var14 = var12 & 65535;
                     if (var13 != null) {
                        if (var13.method3482(-19443, var14)) {
                           var5 |= 128;
                        }

                        if (var13.method3479(var14, 0)) {
                           var5 |= 256;
                        }

                        if (var13.method3480(var14, 4)) {
                           var5 |= 1024;
                        }
                     }
                  }
               }

               if ((this.field669 || class305.field4050) && ~arg3 != 0 && ~arg3 > ~this.field677.length) {
                  int var15 = this.field677[arg3];
                  if (var15 != 65535) {
                     class477 var16 = this.field662.method1478(77, var15 >> 16);
                     int var17 = var15 & 65535;
                     if (var16 != null) {
                        if (var16.method3482(-19443, var17)) {
                           var5 |= 128;
                        }

                        if (var16.method3479(var17, 0)) {
                           var5 |= 256;
                        }

                        if (var16.method3480(var17, 4)) {
                           var5 |= 1024;
                        }
                     }
                  }
               }
            }

            return var5 | 32;
         }
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field678[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(IIBIILka;II)Lka;"
   )
   public final class501 method459(int arg0, int arg1, byte arg2, int arg3, int arg4, class501 arg5, int arg6, int arg7) {
      try {
         ++field649;
         if (arg1 <= 10) {
            this.method460(-37, -18, 115, 26, (class501)null, 43);
         }

         int var9 = this.field661[arg6];
         int var16 = this.field667[arg6];
         class477 var10 = this.field662.method1478(66, var16 >> 16);
         int var17 = var16 & 65535;
         if (var10 == null) {
            return arg5.method338(arg2, arg3, true);
         } else {
            class477 var11 = null;
            if ((this.field669 || class305.field4050) && ~arg4 != 0 && arg4 < this.field667.length) {
               int var15 = this.field667[arg4];
               var11 = this.field662.method1478(101, var15 >> 16);
               arg4 = var15 & 65535;
            }

            if (this.field645) {
               arg3 |= 512;
            }

            if (var10.method3482(-19443, var17)) {
               arg3 |= 128;
            }

            if (var10.method3479(var17, 0)) {
               arg3 |= 256;
            }

            if (var10.method3480(var17, 4)) {
               arg3 |= 1024;
            }

            if (var11 != null) {
               if (var11.method3482(-19443, arg4)) {
                  arg3 |= 128;
               }

               if (var11.method3479(arg4, 0)) {
                  arg3 |= 256;
               }

               if (var11.method3480(arg4, 4)) {
                  arg3 |= 1024;
               }
            }

            arg3 |= 32;
            class501 var12 = arg5.method338(arg2, arg3, true);
            var12.method3623(arg4, var17, arg7 + -1, 8353, arg0, var11, var10, var9, this.field645);
            return var12;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field678[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field678[2] : field678[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(IIIILka;I)Lka;"
   )
   public final class501 method460(int arg0, int arg1, int arg2, int arg3, class501 arg4, int arg5) {
      try {
         ++field650;
         int var7 = this.field661[arg3];
         int var8 = this.field667[arg3];
         class477 var9 = this.field662.method1478(arg2 + -11876, var8 >> 16);
         int var10 = var8 & 65535;
         if (var9 == null) {
            return arg4.method338((byte)1, arg0, true);
         } else {
            class477 var11 = null;
            if ((this.field669 || class305.field4050) && ~arg1 != 0 && ~this.field667.length < ~arg1) {
               int var19 = this.field667[arg1];
               var11 = this.field662.method1478(99, var19 >> 16);
               arg1 = var19 & 65535;
            }

            class477 var12 = null;
            class477 var13 = null;
            int var14 = 0;
            int var15 = 0;
            if (this.field677 != null) {
               if (~this.field677.length < ~arg3) {
                  var14 = this.field677[arg3];
                  if (~var14 != -65536) {
                     var12 = this.field662.method1478(116, var14 >> 16);
                     var14 &= 65535;
                  }
               }

               if ((this.field669 || class305.field4050) && arg1 != -1 && this.field677.length > arg1) {
                  var15 = this.field677[arg1];
                  if (~var15 != -65536) {
                     var13 = this.field662.method1478(108, var15 >> 16);
                     var15 &= 65535;
                  }
               }
            }

            if (this.field645) {
               arg0 |= 512;
            }

            if (var9.method3482(arg2 ^ -25912, var10)) {
               arg0 |= 128;
            }

            if (var9.method3479(var10, arg2 ^ arg2)) {
               arg0 |= 256;
            }

            if (var9.method3480(var10, 4)) {
               arg0 |= 1024;
            }

            if (var12 != null) {
               if (var12.method3482(-19443, var14)) {
                  arg0 |= 128;
               }

               if (var12.method3479(var14, arg2 + -11973)) {
                  arg0 |= 256;
               }

               if (var12.method3480(var14, arg2 + -11969)) {
                  arg0 |= 1024;
               }
            }

            if (var11 != null) {
               if (var11.method3482(arg2 ^ -25912, arg1)) {
                  arg0 |= 128;
               }

               if (var11.method3479(arg1, 0)) {
                  arg0 |= 256;
               }

               if (var11.method3480(arg1, 4)) {
                  arg0 |= 1024;
               }
            }

            if (var13 != null) {
               if (var13.method3482(-19443, var15)) {
                  arg0 |= 128;
               }

               if (var13.method3479(var15, arg2 + -11973)) {
                  arg0 |= 256;
               }

               if (var13.method3480(var15, arg2 ^ 11969)) {
                  arg0 |= 1024;
               }
            }

            arg0 |= 32;
            class501 var16 = arg4.method338((byte)1, arg0, true);
            var16.method3623(arg1, var10, arg5 + -1, 8353, 0, var11, var9, var7, this.field645);
            if (var12 != null) {
               var16.method3623(var15, var14, arg5 + -1, 8353, 0, var13, var12, var7, this.field645);
            }

            return var16;
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field678[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field678[2] : field678[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method461(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label384: {
            if (arg1 != 1) {
               if (~arg1 == -3) {
                  this.field652 = arg0.method4280(-19104);
                  if (!var4) {
                     break label384;
                  }
               }

               if (~arg1 != -4) {
                  if (arg1 != 5) {
                     if (arg1 != 6) {
                        if (~arg1 != -8) {
                           if (arg1 == 8) {
                              this.field656 = arg0.method4288((byte)111);
                              if (!var4) {
                                 break label384;
                              }
                           }

                           if (~arg1 == -10) {
                              this.field676 = arg0.method4288((byte)107);
                              if (!var4) {
                                 break label384;
                              }
                           }

                           if (arg1 != 10) {
                              if (~arg1 == -12) {
                                 this.field648 = arg0.method4288((byte)114);
                                 if (!var4) {
                                    break label384;
                                 }
                              }

                              if (~arg1 == -13) {
                                 int var5 = arg0.method4288((byte)117);
                                 this.field677 = new int[var5];
                                 int var6 = 0;
                                 if (var4) {
                                    this.field677[var6] = arg0.method4280(-19104);
                                    ++var6;
                                 }

                                 label359:
                                 while(true) {
                                    while(~var6 > ~var5) {
                                       this.field677[var6] = arg0.method4280(-19104);
                                       ++var6;
                                    }

                                    int var7 = 0;
                                    if (!var4) {
                                       if (var4) {
                                          this.field677[var7] = (arg0.method4280(class168.method1321(arg2, -19104)) << 16) - -this.field677[var7];
                                          ++var7;
                                       }

                                       while(true) {
                                          while(var7 < var5) {
                                             this.field677[var7] = (arg0.method4280(class168.method1321(arg2, -19104)) << 16) - -this.field677[var7];
                                             ++var7;
                                          }

                                          if (!var4) {
                                             if (!var4) {
                                                break label384;
                                             }
                                             break label359;
                                          }

                                          ++var7;
                                       }
                                    }

                                    ++var6;
                                 }
                              }

                              if (arg1 != 13) {
                                 if (~arg1 != -15) {
                                    if (arg1 != 15) {
                                       if (arg1 == 16) {
                                          this.field665 = true;
                                          if (!var4) {
                                             break label384;
                                          }
                                       }

                                       if (arg1 == 18) {
                                          this.field664 = true;
                                          if (!var4) {
                                             break label384;
                                          }
                                       }

                                       if (~arg1 == -20) {
                                          if (this.field668 == null) {
                                             this.field668 = new int[this.field659.length];
                                             int var8 = 0;
                                             if (var4 || var8 < this.field659.length) {
                                                do {
                                                   this.field668[var8] = 255;
                                                   ++var8;
                                                } while(var8 < this.field659.length);
                                             }
                                          }

                                          this.field668[arg0.method4288((byte)65)] = arg0.method4288((byte)60);
                                          if (!var4) {
                                             break label384;
                                          }
                                       }

                                       if (arg1 != 20) {
                                          break label384;
                                       }

                                       label422: {
                                          int var9;
                                          if (this.field663 != null && this.field674 != null) {
                                             var9 = arg0.method4288((byte)111);
                                             this.field663[var9] = arg0.method4280(class168.method1321(arg2, -19104));
                                             this.field674[var9] = arg0.method4280(arg2 + -19104);
                                             if (!var4) {
                                                break label422;
                                             }

                                             ++var9;
                                          } else {
                                             this.field663 = new int[this.field659.length];
                                             this.field674 = new int[this.field659.length];
                                             var9 = 0;
                                             if (var4) {
                                                this.field663[var9] = 256;
                                                this.field674[var9] = 256;
                                                ++var9;
                                             }
                                          }

                                          while(true) {
                                             while(this.field659.length > var9) {
                                                this.field663[var9] = 256;
                                                this.field674[var9] = 256;
                                                ++var9;
                                             }

                                             var9 = arg0.method4288((byte)111);
                                             this.field663[var9] = arg0.method4280(class168.method1321(arg2, -19104));
                                             this.field674[var9] = arg0.method4280(arg2 + -19104);
                                             if (!var4) {
                                                break;
                                             }

                                             ++var9;
                                          }
                                       }

                                       if (!var4) {
                                          break label384;
                                       }
                                    }

                                    this.field669 = true;
                                    if (!var4) {
                                       break label384;
                                    }
                                 }

                                 this.field645 = true;
                                 if (!var4) {
                                    break label384;
                                 }
                              }

                              int var10 = arg0.method4280(arg2 ^ -19104);
                              this.field659 = new int[var10][];
                              int var11 = 0;
                              if (!var4 && ~var11 <= ~var10) {
                                 if (!var4) {
                                    break label384;
                                 }
                              } else {
                                 while(true) {
                                    int var12 = arg0.method4288((byte)104);
                                    if (~var12 >= -1) {
                                       ++var11;
                                    } else {
                                       this.field659[var11] = new int[var12];
                                       this.field659[var11][0] = arg0.method4293(92);
                                       int var13 = 1;
                                       if (var4) {
                                          this.field659[var11][var13] = arg0.method4280(-19104);
                                          ++var13;
                                       }

                                       while(var13 < var12) {
                                          this.field659[var11][var13] = arg0.method4280(-19104);
                                          ++var13;
                                       }

                                       ++var11;
                                    }

                                    if (~var11 <= ~var10) {
                                       if (!var4) {
                                          break label384;
                                       }
                                       break;
                                    }
                                 }
                              }
                           }

                           this.field657 = arg0.method4288((byte)127);
                           if (!var4) {
                              break label384;
                           }
                        }

                        this.field670 = arg0.method4280(-19104);
                        if (!var4) {
                           break label384;
                        }
                     }

                     this.field647 = arg0.method4280(-19104);
                     if (!var4) {
                        break label384;
                     }
                  }

                  this.field654 = arg0.method4288((byte)124);
                  if (!var4) {
                     break label384;
                  }
               }

               this.field651 = new boolean[256];
               int var14 = arg0.method4288((byte)86);
               int var15 = 0;
               if (var4) {
                  this.field651[arg0.method4288((byte)69)] = true;
                  ++var15;
               }

               while(true) {
                  while(~var15 > ~var14) {
                     this.field651[arg0.method4288((byte)69)] = true;
                     ++var15;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label384;
                     }
                     break;
                  }

                  ++var15;
               }
            }

            int var16 = arg0.method4280(-19104);
            this.field661 = new int[var16];
            int var17 = 0;
            if (var4) {
               this.field661[var17] = arg0.method4280(-19104);
               ++var17;
            }

            label185:
            while(true) {
               while(~var17 > ~var16) {
                  this.field661[var17] = arg0.method4280(-19104);
                  ++var17;
               }

               this.field667 = new int[var16];
               int var18 = 0;
               if (!var4) {
                  if (var4) {
                     this.field667[var18] = arg0.method4280(-19104);
                     ++var18;
                  }

                  while(true) {
                     while(~var18 > ~var16) {
                        this.field667[var18] = arg0.method4280(-19104);
                        ++var18;
                     }

                     int var19 = 0;
                     if (!var4) {
                        if (var4 || ~var19 > ~var16) {
                           do {
                              this.field667[var19] = (arg0.method4280(-19104) << 16) - -this.field667[var19];
                              ++var19;
                           } while(~var19 > ~var16);
                        }
                        break label185;
                     }

                     ++var18;
                  }
               }

               ++var17;
            }
         }

         if (arg2 != 0) {
            field672 = -101;
         }

         ++field646;
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field678[1] + (arg0 != null ? field678[2] : field678[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method462(int arg0) {
      try {
         ++field660;
         if (arg0 != 128) {
            method463(-66);
         }

         if (this.field676 == -1) {
            label30: {
               if (this.field651 != null) {
                  this.field676 = 2;
                  if (!client.field4273) {
                     break label30;
                  }
               }

               this.field676 = 0;
            }
         }

         if (this.field657 == -1) {
            if (this.field651 != null) {
               this.field657 = 2;
            } else {
               this.field657 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field678[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method463(int arg0) {
      try {
         field666 = null;
         if (arg0 > -60) {
            method463(-3);
         }

         field655 = null;
         field671 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field678[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method464(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 < 92) {
            this.method461((class594)null, -34, 33);
         }

         while(true) {
            int var4 = arg1.method4288((byte)125);
            if (var4 != 0) {
               this.method461(arg1, var4, 0);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field675;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field678[6] + arg0 + ',' + (arg1 != null ? field678[2] : field678[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method465(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method466(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
