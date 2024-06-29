import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class683 {
   @OriginalMember(
      owner = "client!fk",
      name = "n",
      descriptor = "I"
   )
   public int field10012;
   @OriginalMember(
      owner = "client!fk",
      name = "g",
      descriptor = "[B"
   )
   private byte[] field10031;
   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10035 = new String[]{method4995(method4994("=\n\u0012eL")), method4995(method4994("=\n\u0012gL")), method4995(method4994(" O\u0012\n\u0019")), method4995(method4994("5\u0014PH")), method4995(method4994("=\n\u0012`L")), method4995(method4994("=\n\u0012\u0018\r5\bH\u001aL")), method4995(method4994("=\n\u0012fL"))};
   @OriginalMember(
      owner = "client!fk",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field10013 = false;
   @OriginalMember(
      owner = "client!fk",
      name = "r",
      descriptor = "I"
   )
   public static int field10025 = 0;
   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "[[F"
   )
   public static float[][] field10024 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   @OriginalMember(
      owner = "client!fk",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10028 = false;
   @OriginalMember(
      owner = "client!fk",
      name = "j",
      descriptor = "I"
   )
   public static int field10015;
   @OriginalMember(
      owner = "client!fk",
      name = "t",
      descriptor = "I"
   )
   public int field10019;
   @OriginalMember(
      owner = "client!fk",
      name = "b",
      descriptor = "I"
   )
   public static int field10023;
   @OriginalMember(
      owner = "client!fk",
      name = "p",
      descriptor = "I"
   )
   public int field10026;
   @OriginalMember(
      owner = "client!fk",
      name = "i",
      descriptor = "I"
   )
   public static int field10027;
   @OriginalMember(
      owner = "client!fk",
      name = "f",
      descriptor = "I"
   )
   public int field10029;
   @OriginalMember(
      owner = "client!fk",
      name = "m",
      descriptor = "Lcha;"
   )
   public class229 field10021;
   @OriginalMember(
      owner = "client!fk",
      name = "e",
      descriptor = "[I"
   )
   public int[] field10014;
   @OriginalMember(
      owner = "client!fk",
      name = "o",
      descriptor = "[I"
   )
   public int[] field10018;
   @OriginalMember(
      owner = "client!fk",
      name = "v",
      descriptor = "[I"
   )
   public int[] field10020;
   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "[I"
   )
   public int[] field10022;
   @OriginalMember(
      owner = "client!fk",
      name = "h",
      descriptor = "[I"
   )
   public int[] field10033;
   @OriginalMember(
      owner = "client!fk",
      name = "s",
      descriptor = "[I"
   )
   public int[] field10034;
   @OriginalMember(
      owner = "client!fk",
      name = "w",
      descriptor = "[Lcha;"
   )
   public class229[] field10016;
   @OriginalMember(
      owner = "client!fk",
      name = "q",
      descriptor = "[[B"
   )
   public byte[][] field10030;
   @OriginalMember(
      owner = "client!fk",
      name = "l",
      descriptor = "[[I"
   )
   public int[][] field10017;
   @OriginalMember(
      owner = "client!fk",
      name = "k",
      descriptor = "[[I"
   )
   public int[][] field10032;

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method4990(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4991(byte arg0) {
      try {
         if (arg0 != -125) {
            method4992(47, -43, -123);
         }

         field10024 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10035[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method4992(int arg0, int arg1, int arg2) {
      try {
         ++field10023;
         if (arg0 <= 73) {
            field10013 = true;
         }

         class446 var3 = class635.method4607(114, (long)arg1, 5);
         var3.method3311(true);
         var3.field6167 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10035[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "([BZ)V"
   )
   private final void method4993(byte[] arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10015;
         class594 var4 = new class594(class637.method4623(arg0, 9258));
         int var5 = var4.method4288((byte)127);
         if (~var5 <= -6 && var5 <= 6) {
            label530: {
               if (var5 < 6) {
                  this.field10026 = 0;
                  if (!var3) {
                     break label530;
                  }
               }

               this.field10026 = var4.method4302(true);
            }

            int var6 = var4.method4288((byte)94);
            int var7 = ~(1 & var6) == -1 ? 0 : 1;
            if (!arg1) {
               this.field10029 = var4.method4280(-19104);
               int var8 = (2 & var6) == 0 ? 0 : 1;
               int var9 = 0;
               this.field10034 = new int[this.field10029];
               int var10 = -1;
               int var11 = 0;
               if (var3) {
                  this.field10034[var11] = var9 += var4.method4280(-19104);
                  if (~this.field10034[var11] < ~var10) {
                     var10 = this.field10034[var11];
                  }

                  ++var11;
               }

               while(true) {
                  while(this.field10029 > var11) {
                     this.field10034[var11] = var9 += var4.method4280(-19104);
                     if (~this.field10034[var11] < ~var10) {
                        var10 = this.field10034[var11];
                     }

                     ++var11;
                  }

                  this.field10019 = var10 + 1;
                  if (!var3) {
                     if (var8 != 0) {
                        this.field10030 = new byte[this.field10019][];
                     }

                     this.field10017 = new int[this.field10019][];
                     this.field10018 = new int[this.field10019];
                     this.field10020 = new int[this.field10019];
                     this.field10014 = new int[this.field10019];
                     this.field10022 = new int[this.field10019];
                     if (var7 != 0) {
                        this.field10033 = new int[this.field10019];
                        int var12 = 0;
                        if (var3) {
                           this.field10033[var12] = -1;
                           ++var12;
                        }

                        label466:
                        while(true) {
                           while(~var12 > ~this.field10019) {
                              this.field10033[var12] = -1;
                              ++var12;
                           }

                           int var13 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field10033[this.field10034[var13]] = var4.method4302(true);
                                 ++var13;
                              }

                              while(true) {
                                 class683 var10000;
                                 if (~var13 <= ~this.field10029) {
                                    var10000 = this;
                                    if (!var3) {
                                       this.field10021 = new class229(this.field10033);
                                       break label466;
                                    }
                                 } else {
                                    var10000 = this;
                                 }

                                 var10000.field10033[this.field10034[var13]] = var4.method4302(true);
                                 ++var13;
                              }
                           }

                           ++var12;
                        }
                     }

                     int var14 = 0;
                     if (var3) {
                        this.field10018[this.field10034[var14]] = var4.method4302(true);
                        ++var14;
                     }

                     while(true) {
                        while(~var14 > ~this.field10029) {
                           this.field10018[this.field10034[var14]] = var4.method4302(true);
                           ++var14;
                        }

                        if (!var3) {
                           if (var8 != 0) {
                              int var15 = 0;
                              if (var3 || ~this.field10029 < ~var15) {
                                 do {
                                    byte[] var16 = new byte[64];
                                    var4.method4276(var16, 64, 0, 0);
                                    this.field10030[this.field10034[var15]] = var16;
                                    ++var15;
                                 } while(~this.field10029 < ~var15);
                              }
                           }

                           int var17 = 0;
                           if (var3) {
                              this.field10020[this.field10034[var17]] = var4.method4302(true);
                              ++var17;
                           }

                           while(true) {
                              while(~var17 > ~this.field10029) {
                                 this.field10020[this.field10034[var17]] = var4.method4302(true);
                                 ++var17;
                              }

                              int var18 = 0;
                              if (!var3) {
                                 if (var3) {
                                    this.field10014[this.field10034[var18]] = var4.method4280(-19104);
                                    ++var18;
                                 }

                                 while(true) {
                                    while(this.field10029 > var18) {
                                       this.field10014[this.field10034[var18]] = var4.method4280(-19104);
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
                                          var20 = this.field10034[var19];
                                          var21 = 0;
                                          var22 = this.field10014[var20];
                                          var23 = -1;
                                          this.field10017[var20] = new int[var22];
                                          var24 = 0;
                                          if (var3) {
                                             var25 = this.field10017[var20][var24] = var21 += var4.method4280(-19104);
                                             if (~var23 > ~var25) {
                                                var23 = var25;
                                             }

                                             ++var24;
                                          }
                                       } else {
                                          if (~var19 <= ~this.field10029) {
                                             var34 = var7;
                                             if (!var3) {
                                                if (var7 == 0) {
                                                   return;
                                                }

                                                this.field10016 = new class229[var10 + 1];
                                                this.field10032 = new int[var10 + 1][];
                                                var26 = 0;
                                                if (!var3 && var26 >= this.field10029) {
                                                   return;
                                                }

                                                label279:
                                                do {
                                                   var27 = this.field10034[var26];
                                                   var28 = this.field10014[var27];
                                                   this.field10032[var27] = new int[this.field10022[var27]];
                                                   var29 = 0;
                                                   if (var3) {
                                                      this.field10032[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   while(true) {
                                                      while(~this.field10022[var27] < ~var29) {
                                                         this.field10032[var27][var29] = -1;
                                                         ++var29;
                                                      }

                                                      var30 = 0;
                                                      if (!var3) {
                                                         if (var3) {
                                                            if (this.field10017[var27] == null) {
                                                               if (var3) {
                                                                  var31 = this.field10017[var27][var30];
                                                                  this.field10032[var27][var31] = var4.method4302(true);
                                                                  ++var30;
                                                               } else {
                                                                  this.field10032[var27][var30] = var4.method4302(true);
                                                                  ++var30;
                                                               }
                                                            } else {
                                                               var31 = this.field10017[var27][var30];
                                                               this.field10032[var27][var31] = var4.method4302(true);
                                                               ++var30;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(var28 > var30) {
                                                               if (this.field10017[var27] == null) {
                                                                  if (var3) {
                                                                     var31 = this.field10017[var27][var30];
                                                                     this.field10032[var27][var31] = var4.method4302(true);
                                                                     ++var30;
                                                                  } else {
                                                                     this.field10032[var27][var30] = var4.method4302(true);
                                                                     ++var30;
                                                                  }
                                                               } else {
                                                                  var31 = this.field10017[var27][var30];
                                                                  this.field10032[var27][var31] = var4.method4302(true);
                                                                  ++var30;
                                                               }
                                                            }

                                                            this.field10016[var27] = new class229(this.field10032[var27]);
                                                            if (!var3) {
                                                               ++var26;
                                                               continue label279;
                                                            }

                                                            var31 = this.field10017[var27][var30];
                                                            this.field10032[var27][var31] = var4.method4302(true);
                                                            ++var30;
                                                         }
                                                      }

                                                      ++var29;
                                                   }
                                                } while(var26 < this.field10029);

                                                return;
                                             }
                                          } else {
                                             var34 = this.field10034[var19];
                                          }

                                          var20 = var34;
                                          var21 = 0;
                                          var22 = this.field10014[var20];
                                          var23 = -1;
                                          this.field10017[var20] = new int[var22];
                                          var24 = 0;
                                          if (var3) {
                                             var25 = this.field10017[var20][var24] = var21 += var4.method4280(-19104);
                                             if (~var23 > ~var25) {
                                                var23 = var25;
                                             }

                                             ++var24;
                                          }
                                       }

                                       while(true) {
                                          while(~var22 < ~var24) {
                                             var25 = this.field10017[var20][var24] = var21 += var4.method4280(-19104);
                                             if (~var23 > ~var25) {
                                                var23 = var25;
                                             }

                                             ++var24;
                                          }

                                          this.field10022[var20] = var23 + 1;
                                          if (!var3) {
                                             if (var22 == var23 + 1) {
                                                this.field10017[var20] = null;
                                             }

                                             ++var19;
                                             if (~var19 <= ~this.field10029) {
                                                var34 = var7;
                                                if (!var3) {
                                                   if (var7 == 0) {
                                                      return;
                                                   }

                                                   this.field10016 = new class229[var10 + 1];
                                                   this.field10032 = new int[var10 + 1][];
                                                   var26 = 0;
                                                   if (!var3 && var26 >= this.field10029) {
                                                      return;
                                                   }

                                                   label196:
                                                   do {
                                                      var27 = this.field10034[var26];
                                                      var28 = this.field10014[var27];
                                                      this.field10032[var27] = new int[this.field10022[var27]];
                                                      var29 = 0;
                                                      if (var3) {
                                                         this.field10032[var27][var29] = -1;
                                                         ++var29;
                                                      }

                                                      while(true) {
                                                         while(~this.field10022[var27] < ~var29) {
                                                            this.field10032[var27][var29] = -1;
                                                            ++var29;
                                                         }

                                                         var30 = 0;
                                                         if (!var3) {
                                                            if (var3) {
                                                               if (this.field10017[var27] == null) {
                                                                  if (var3) {
                                                                     var31 = this.field10017[var27][var30];
                                                                     this.field10032[var27][var31] = var4.method4302(true);
                                                                     ++var30;
                                                                  } else {
                                                                     this.field10032[var27][var30] = var4.method4302(true);
                                                                     ++var30;
                                                                  }
                                                               } else {
                                                                  var31 = this.field10017[var27][var30];
                                                                  this.field10032[var27][var31] = var4.method4302(true);
                                                                  ++var30;
                                                               }
                                                            }

                                                            while(true) {
                                                               while(var28 > var30) {
                                                                  if (this.field10017[var27] == null) {
                                                                     if (var3) {
                                                                        var31 = this.field10017[var27][var30];
                                                                        this.field10032[var27][var31] = var4.method4302(true);
                                                                        ++var30;
                                                                     } else {
                                                                        this.field10032[var27][var30] = var4.method4302(true);
                                                                        ++var30;
                                                                     }
                                                                  } else {
                                                                     var31 = this.field10017[var27][var30];
                                                                     this.field10032[var27][var31] = var4.method4302(true);
                                                                     ++var30;
                                                                  }
                                                               }

                                                               this.field10016[var27] = new class229(this.field10032[var27]);
                                                               if (!var3) {
                                                                  ++var26;
                                                                  continue label196;
                                                               }

                                                               var31 = this.field10017[var27][var30];
                                                               this.field10032[var27][var31] = var4.method4302(true);
                                                               ++var30;
                                                            }
                                                         }

                                                         ++var29;
                                                      }
                                                   } while(var26 < this.field10029);

                                                   return;
                                                }
                                             } else {
                                                var34 = this.field10034[var19];
                                             }

                                             var20 = var34;
                                             var21 = 0;
                                             var22 = this.field10014[var20];
                                             var23 = -1;
                                             this.field10017[var20] = new int[var22];
                                             var24 = 0;
                                             if (var3) {
                                                var25 = this.field10017[var20][var24] = var21 += var4.method4280(-19104);
                                                if (~var23 > ~var25) {
                                                   var23 = var25;
                                                }

                                                ++var24;
                                             }
                                          } else {
                                             if (~var23 > ~var22) {
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

                  if (var8 < ~var10) {
                     var10 = this.field10034[var11];
                  }

                  ++var11;
               }
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var33) {
         throw class534.method3846(var33, field10035[4] + (arg0 != null ? field10035[2] : field10035[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "<init>",
      descriptor = "([BI[B)V"
   )
   public class683(byte[] arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field4273;
      super();

      try {
         this.field10012 = class458.method3365(arg0.length, true, arg0);
         if (~this.field10012 != ~arg1) {
            throw new RuntimeException();
         } else {
            if (arg2 != null) {
               if (arg2.length != 64) {
                  throw new RuntimeException();
               }

               this.field10031 = class32.method259(arg0.length, 255, 0, arg0);
               int var5 = 0;
               if (var4 || var5 < 64) {
                  do {
                     if (this.field10031[var5] != arg2[var5]) {
                        throw new RuntimeException();
                     }

                     ++var5;
                  } while(var5 < 64);
               }
            }

            this.method4993(arg0, false);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10035[5] + (arg0 != null ? field10035[2] : field10035[3]) + ',' + arg1 + ',' + (arg2 != null ? field10035[2] : field10035[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4994(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4995(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
