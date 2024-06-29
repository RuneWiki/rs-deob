import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class223 {
   @OriginalMember(
      owner = "client!ik",
      name = "r",
      descriptor = "I"
   )
   public int field3176;
   @OriginalMember(
      owner = "client!ik",
      name = "c",
      descriptor = "[B"
   )
   private byte[] field3180;
   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3187 = new String[]{method1753(method1752("L\bM_")), method1753(method1752("YS\u000f\u001dM")), method1753(method1752("K\u0016\u000f\u000fYL\u0014U\r\u0018")), method1753(method1752("K\u0016\u000fv\u0018")), method1753(method1752("K\u0016\u000fq\u0018")), method1753(method1752("K\u0016\u000fp\u0018")), method1753(method1752("K\u0016\u000fw\u0018"))};
   @OriginalMember(
      owner = "client!ik",
      name = "g",
      descriptor = "I"
   )
   public int field3166;
   @OriginalMember(
      owner = "client!ik",
      name = "m",
      descriptor = "I"
   )
   public int field3167;
   @OriginalMember(
      owner = "client!ik",
      name = "f",
      descriptor = "I"
   )
   public static int field3172;
   @OriginalMember(
      owner = "client!ik",
      name = "o",
      descriptor = "I"
   )
   public static int field3174;
   @OriginalMember(
      owner = "client!ik",
      name = "p",
      descriptor = "I"
   )
   public int field3177;
   @OriginalMember(
      owner = "client!ik",
      name = "i",
      descriptor = "I"
   )
   public static int field3179;
   @OriginalMember(
      owner = "client!ik",
      name = "n",
      descriptor = "I"
   )
   public static int field3181;
   @OriginalMember(
      owner = "client!ik",
      name = "q",
      descriptor = "Lkf;"
   )
   public static class266 field3171;
   @OriginalMember(
      owner = "client!ik",
      name = "u",
      descriptor = "Lk;"
   )
   public class592 field3175;
   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "[I"
   )
   public int[] field3169;
   @OriginalMember(
      owner = "client!ik",
      name = "t",
      descriptor = "[I"
   )
   public int[] field3170;
   @OriginalMember(
      owner = "client!ik",
      name = "j",
      descriptor = "[I"
   )
   public int[] field3173;
   @OriginalMember(
      owner = "client!ik",
      name = "h",
      descriptor = "[I"
   )
   public int[] field3178;
   @OriginalMember(
      owner = "client!ik",
      name = "e",
      descriptor = "[I"
   )
   public int[] field3183;
   @OriginalMember(
      owner = "client!ik",
      name = "k",
      descriptor = "[I"
   )
   public int[] field3184;
   @OriginalMember(
      owner = "client!ik",
      name = "b",
      descriptor = "[Lk;"
   )
   public class592[] field3185;
   @OriginalMember(
      owner = "client!ik",
      name = "l",
      descriptor = "[[B"
   )
   public byte[][] field3182;
   @OriginalMember(
      owner = "client!ik",
      name = "d",
      descriptor = "[[I"
   )
   public int[][] field3168;
   @OriginalMember(
      owner = "client!ik",
      name = "s",
      descriptor = "[[I"
   )
   public int[][] field3186;

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "([Lgn;II)V"
   )
   public static final void method1747(class731[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class731 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field10707;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field10707 > (var7 & 1) + var6) {
               class731 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method1747(arg0, arg1, var4 - 1);
         method1747(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "([BI)V"
   )
   private final void method1748(byte[] arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field3179;
         class147 var4 = new class147(class573.method4175(1, arg0));
         int var5 = var4.method1143(-15465);
         if (~var5 <= -6 && var5 <= 6) {
            label526: {
               if (~var5 > -7) {
                  this.field3167 = 0;
                  if (!var3) {
                     break label526;
                  }
               }

               this.field3167 = var4.method1164(19693);
            }

            int var6 = var4.method1143(-15465);
            int var7 = ~(var6 & 1) == -1 ? 0 : 1;
            this.field3166 = var4.method1211(-26166);
            int var8 = (var6 & 2) == 0 ? 0 : 1;
            int var9 = arg1;
            int var10 = -1;
            this.field3178 = new int[this.field3166];
            int var11 = 0;
            if (var3) {
               this.field3178[var11] = var9 = arg1 + var4.method1211(class544.method3910(arg1, -26166));
               if (this.field3178[var11] > var10) {
                  var10 = this.field3178[var11];
               }

               ++var11;
            }

            while(true) {
               while(~this.field3166 < ~var11) {
                  this.field3178[var11] = var9 += var4.method1211(class544.method3910(arg1, -26166));
                  if (this.field3178[var11] > var10) {
                     var10 = this.field3178[var11];
                  }

                  ++var11;
               }

               this.field3177 = var10 + 1;
               this.field3186 = new int[this.field3177][];
               if (!var3) {
                  if (var8 != 0) {
                     this.field3182 = new byte[this.field3177][];
                  }

                  this.field3184 = new int[this.field3177];
                  this.field3170 = new int[this.field3177];
                  this.field3173 = new int[this.field3177];
                  this.field3183 = new int[this.field3177];
                  if (var7 != 0) {
                     this.field3169 = new int[this.field3177];
                     int var12 = 0;
                     if (var3) {
                        this.field3169[var12] = -1;
                        ++var12;
                     }

                     label465:
                     while(true) {
                        while(~var12 > ~this.field3177) {
                           this.field3169[var12] = -1;
                           ++var12;
                        }

                        int var13 = 0;
                        if (!var3) {
                           if (var3) {
                              this.field3169[this.field3178[var13]] = var4.method1164(class544.method3910(arg1, 19693));
                              ++var13;
                           }

                           while(true) {
                              class223 var10000;
                              if (~var13 <= ~this.field3166) {
                                 var10000 = this;
                                 if (!var3) {
                                    this.field3175 = new class592(this.field3169);
                                    break label465;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              var10000.field3169[this.field3178[var13]] = var4.method1164(class544.method3910(arg1, 19693));
                              ++var13;
                           }
                        }

                        ++var12;
                     }
                  }

                  int var14 = 0;
                  if (var3) {
                     this.field3170[this.field3178[var14]] = var4.method1164(19693);
                     ++var14;
                  }

                  while(true) {
                     while(~this.field3166 < ~var14) {
                        this.field3170[this.field3178[var14]] = var4.method1164(19693);
                        ++var14;
                     }

                     if (!var3) {
                        if (var8 != 0) {
                           int var15 = 0;
                           if (var3 || this.field3166 > var15) {
                              do {
                                 byte[] var16 = new byte[64];
                                 var4.method1191(-5766, 64, var16, 0);
                                 this.field3182[this.field3178[var15]] = var16;
                                 ++var15;
                              } while(this.field3166 > var15);
                           }
                        }

                        int var17 = 0;
                        if (var3) {
                           this.field3173[this.field3178[var17]] = var4.method1164(19693);
                           ++var17;
                        }

                        while(true) {
                           while(this.field3166 > var17) {
                              this.field3173[this.field3178[var17]] = var4.method1164(19693);
                              ++var17;
                           }

                           int var18 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field3184[this.field3178[var18]] = var4.method1211(-26166);
                                 ++var18;
                              }

                              while(true) {
                                 while(var18 < this.field3166) {
                                    this.field3184[this.field3178[var18]] = var4.method1211(-26166);
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
                                       var20 = this.field3178[var19];
                                       var21 = this.field3184[var20];
                                       var22 = 0;
                                       var23 = -1;
                                       this.field3186[var20] = new int[var21];
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field3186[var20][var24] = var22 += var4.method1211(-26166);
                                          if (var25 > var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    } else {
                                       if (this.field3166 <= var19) {
                                          var34 = var7;
                                          if (!var3) {
                                             if (var7 == 0) {
                                                return;
                                             }

                                             this.field3168 = new int[var10 - -1][];
                                             this.field3185 = new class592[var10 + 1];
                                             var26 = 0;
                                             if (!var3 && var26 >= this.field3166) {
                                                return;
                                             }

                                             label278:
                                             do {
                                                var27 = this.field3178[var26];
                                                var28 = this.field3184[var27];
                                                this.field3168[var27] = new int[this.field3183[var27]];
                                                var29 = 0;
                                                if (var3) {
                                                   this.field3168[var27][var29] = -1;
                                                   ++var29;
                                                }

                                                while(true) {
                                                   while(~this.field3183[var27] < ~var29) {
                                                      this.field3168[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   var30 = 0;
                                                   if (!var3) {
                                                      if (var3) {
                                                         if (this.field3186[var27] == null) {
                                                            if (var3) {
                                                               var31 = this.field3186[var27][var30];
                                                               this.field3168[var27][var31] = var4.method1164(19693);
                                                               ++var30;
                                                            } else {
                                                               this.field3168[var27][var30] = var4.method1164(19693);
                                                               ++var30;
                                                            }
                                                         } else {
                                                            var31 = this.field3186[var27][var30];
                                                            this.field3168[var27][var31] = var4.method1164(19693);
                                                            ++var30;
                                                         }
                                                      }

                                                      while(true) {
                                                         while(var28 > var30) {
                                                            if (this.field3186[var27] == null) {
                                                               if (var3) {
                                                                  var31 = this.field3186[var27][var30];
                                                                  this.field3168[var27][var31] = var4.method1164(19693);
                                                                  ++var30;
                                                               } else {
                                                                  this.field3168[var27][var30] = var4.method1164(19693);
                                                                  ++var30;
                                                               }
                                                            } else {
                                                               var31 = this.field3186[var27][var30];
                                                               this.field3168[var27][var31] = var4.method1164(19693);
                                                               ++var30;
                                                            }
                                                         }

                                                         this.field3185[var27] = new class592(this.field3168[var27]);
                                                         if (!var3) {
                                                            ++var26;
                                                            continue label278;
                                                         }

                                                         var31 = this.field3186[var27][var30];
                                                         this.field3168[var27][var31] = var4.method1164(19693);
                                                         ++var30;
                                                      }
                                                   }

                                                   ++var29;
                                                }
                                             } while(var26 < this.field3166);

                                             return;
                                          }
                                       } else {
                                          var34 = this.field3178[var19];
                                       }

                                       var20 = var34;
                                       var21 = this.field3184[var20];
                                       var22 = 0;
                                       var23 = -1;
                                       this.field3186[var20] = new int[var21];
                                       var24 = 0;
                                       if (var3) {
                                          var25 = this.field3186[var20][var24] = var22 += var4.method1211(-26166);
                                          if (var25 > var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }
                                    }

                                    while(true) {
                                       while(var24 < var21) {
                                          var25 = this.field3186[var20][var24] = var22 += var4.method1211(-26166);
                                          if (var25 > var23) {
                                             var23 = var25;
                                          }

                                          ++var24;
                                       }

                                       this.field3183[var20] = var23 - -1;
                                       var34 = var23 + 1;
                                       if (!var3) {
                                          if (var34 == var21) {
                                             this.field3186[var20] = null;
                                          }

                                          ++var19;
                                          if (this.field3166 <= var19) {
                                             var34 = var7;
                                             if (!var3) {
                                                if (var7 == 0) {
                                                   return;
                                                }

                                                this.field3168 = new int[var10 - -1][];
                                                this.field3185 = new class592[var10 + 1];
                                                var26 = 0;
                                                if (!var3 && var26 >= this.field3166) {
                                                   return;
                                                }

                                                label195:
                                                do {
                                                   var27 = this.field3178[var26];
                                                   var28 = this.field3184[var27];
                                                   this.field3168[var27] = new int[this.field3183[var27]];
                                                   var29 = 0;
                                                   if (var3) {
                                                      this.field3168[var27][var29] = -1;
                                                      ++var29;
                                                   }

                                                   while(true) {
                                                      while(~this.field3183[var27] < ~var29) {
                                                         this.field3168[var27][var29] = -1;
                                                         ++var29;
                                                      }

                                                      var30 = 0;
                                                      if (!var3) {
                                                         if (var3) {
                                                            if (this.field3186[var27] == null) {
                                                               if (var3) {
                                                                  var31 = this.field3186[var27][var30];
                                                                  this.field3168[var27][var31] = var4.method1164(19693);
                                                                  ++var30;
                                                               } else {
                                                                  this.field3168[var27][var30] = var4.method1164(19693);
                                                                  ++var30;
                                                               }
                                                            } else {
                                                               var31 = this.field3186[var27][var30];
                                                               this.field3168[var27][var31] = var4.method1164(19693);
                                                               ++var30;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(var28 > var30) {
                                                               if (this.field3186[var27] == null) {
                                                                  if (var3) {
                                                                     var31 = this.field3186[var27][var30];
                                                                     this.field3168[var27][var31] = var4.method1164(19693);
                                                                     ++var30;
                                                                  } else {
                                                                     this.field3168[var27][var30] = var4.method1164(19693);
                                                                     ++var30;
                                                                  }
                                                               } else {
                                                                  var31 = this.field3186[var27][var30];
                                                                  this.field3168[var27][var31] = var4.method1164(19693);
                                                                  ++var30;
                                                               }
                                                            }

                                                            this.field3185[var27] = new class592(this.field3168[var27]);
                                                            if (!var3) {
                                                               ++var26;
                                                               continue label195;
                                                            }

                                                            var31 = this.field3186[var27][var30];
                                                            this.field3168[var27][var31] = var4.method1164(19693);
                                                            ++var30;
                                                         }
                                                      }

                                                      ++var29;
                                                   }
                                                } while(var26 < this.field3166);

                                                return;
                                             }
                                          } else {
                                             var34 = this.field3178[var19];
                                          }

                                          var20 = var34;
                                          var21 = this.field3184[var20];
                                          var22 = 0;
                                          var23 = -1;
                                          this.field3186[var20] = new int[var21];
                                          var24 = 0;
                                          if (var3) {
                                             var25 = this.field3186[var20][var24] = var22 += var4.method1211(-26166);
                                             if (var25 > var23) {
                                                var23 = var25;
                                             }

                                             ++var24;
                                          }
                                       } else {
                                          var25 = var34;
                                          if (var25 > var23) {
                                             var23 = var25;
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

               if (var8 > var10) {
                  var10 = this.field3178[var11];
               }

               ++var11;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var33) {
         throw class237.method1823(var33, field3187[5] + (arg0 != null ? field3187[1] : field3187[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1749(byte arg0) {
      try {
         if (arg0 == 83) {
            field3171 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3187[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(IIIIIZII)V"
   )
   public static final void method1750(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      boolean var8 = client.field4360;

      try {
         ++field3181;
         int var9 = arg7 - -arg1;
         int var10 = -arg1 + arg2;
         int var11 = arg7;
         if (var8) {
            class149.method1249(-7, arg0, arg3, class341.field4631[arg7], arg4);
            var11 = arg7 + 1;
         }

         while(true) {
            while(~var11 > ~var9) {
               class149.method1249(-7, arg0, arg3, class341.field4631[var11], arg4);
               ++var11;
            }

            int var12 = -arg1 + arg4;
            int var13 = arg0 + arg1;
            int var14 = arg2;
            if (!var8) {
               if (var8) {
                  class149.method1249(-7, arg0, arg3, class341.field4631[arg2], arg4);
                  var14 = arg2 - 1;
               }

               while(true) {
                  while(var10 < var14) {
                     class149.method1249(-7, arg0, arg3, class341.field4631[var14], arg4);
                     --var14;
                  }

                  int var15 = var9;
                  if (!var8) {
                     if (!var8 && ~var9 < ~var10) {
                        if (arg5) {
                           method1749((byte)84);
                           return;
                        }

                        return;
                     }

                     do {
                        int[] var16 = class341.field4631[var15];
                        class149.method1249(-7, arg0, arg3, var16, var13);
                        class149.method1249(-7, var13, arg6, var16, var12);
                        class149.method1249(-7, var12, arg3, var16, arg4);
                        ++var15;
                     } while(~var15 >= ~var10);

                     if (arg5) {
                        method1749((byte)84);
                        return;
                     }

                     return;
                  }

                  --var14;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field3187[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1751(int arg0) {
      try {
         ++field3174;

         try {
            if (~class4.field38 == -2) {
               label57: {
                  int var1 = class270.field3737.method4238((byte)25);
                  if (~var1 < -1 && class270.field3737.method4219((byte)-8)) {
                     int var2 = var1 - class648.field9463;
                     if (var2 < 0) {
                        var2 = 0;
                     }

                     class270.field3737.method4243(var2, (byte)-94);
                     return;
                  }

                  class270.field3737.method4215(false);
                  class270.field3737.method4226(109);
                  class457.field6537 = null;
                  class655.field9588 = null;
                  if (class672.field9747 == null) {
                     class4.field38 = 0;
                     if (!client.field4360) {
                        break label57;
                     }
                  }

                  class4.field38 = 2;
               }
            }

            if (~class4.field38 == -4) {
               int var3 = class270.field3737.method4238((byte)25);
               if (class57.field705 > var3 && class270.field3737.method4219((byte)-8)) {
                  int var4 = class175.field2409 + var3;
                  if (~var4 < ~class57.field705) {
                     var4 = class57.field705;
                  }

                  class270.field3737.method4243(var4, (byte)-94);
                  return;
               }

               class175.field2409 = 0;
               class4.field38 = 0;
            }

            if (arg0 != 0) {
               field3171 = null;
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class270.field3737.method4215(false);
            class655.field9588 = null;
            class4.field38 = 0;
            class80.field1029 = null;
            class672.field9747 = null;
            class457.field6537 = null;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3187[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "([BI[B)V"
   )
   public class223(byte[] arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field4360;
      super();

      try {
         this.field3176 = class135.method1066(arg0.length, 0, arg0);
         if (this.field3176 != arg1) {
            throw new RuntimeException();
         } else {
            if (arg2 != null) {
               if (~arg2.length != -65) {
                  throw new RuntimeException();
               }

               this.field3180 = class474.method3452(0, arg0, arg0.length, 0);
               int var5 = 0;
               if (var4 || ~var5 > -65) {
                  do {
                     if (this.field3180[var5] != arg2[var5]) {
                        throw new RuntimeException();
                     }

                     ++var5;
                  } while(~var5 > -65);
               }
            }

            this.method1748(arg0, 0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3187[2] + (arg0 != null ? field3187[1] : field3187[0]) + ',' + arg1 + ',' + (arg2 != null ? field3187[1] : field3187[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1752(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1753(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
