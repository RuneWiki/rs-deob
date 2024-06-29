import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 {
   @OriginalMember(
      owner = "client!wv",
      name = "l",
      descriptor = "I"
   )
   private int field538 = 0;
   @OriginalMember(
      owner = "client!wv",
      name = "j",
      descriptor = "[Loh;"
   )
   public class428[] field534;
   @OriginalMember(
      owner = "client!wv",
      name = "d",
      descriptor = "I"
   )
   public int field521;
   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field540 = new String[]{method338(method337("ct")), method338(method337("an6`g")), method338(method337("cu")), method338(method337("an6ig")), method338(method337("an6og")), method338(method337("an6dg")), method338(method337("an6mg")), method338(method337("an6eg")), method338(method337("xmt@")), method338(method337("m66\u00022")), method338(method337("an6hg")), method338(method337("an6\u0010&xql\u0012g")), method338(method337("an6fg")), method338(method337("an6kg")), method338(method337(";5&\f")), method338(method337("an6gg")), method338(method337("an6jg")), method338(method337("an6ng"))};
   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field523 = null;
   @OriginalMember(
      owner = "client!wv",
      name = "h",
      descriptor = "I"
   )
   public static int field537 = -50;
   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "I"
   )
   public static int field522;
   @OriginalMember(
      owner = "client!wv",
      name = "c",
      descriptor = "I"
   )
   public static int field526;
   @OriginalMember(
      owner = "client!wv",
      name = "s",
      descriptor = "I"
   )
   public static int field527;
   @OriginalMember(
      owner = "client!wv",
      name = "n",
      descriptor = "I"
   )
   public static int field528;
   @OriginalMember(
      owner = "client!wv",
      name = "m",
      descriptor = "I"
   )
   public static int field529;
   @OriginalMember(
      owner = "client!wv",
      name = "q",
      descriptor = "I"
   )
   public static int field530;
   @OriginalMember(
      owner = "client!wv",
      name = "f",
      descriptor = "I"
   )
   public static int field531;
   @OriginalMember(
      owner = "client!wv",
      name = "e",
      descriptor = "I"
   )
   public static int field532;
   @OriginalMember(
      owner = "client!wv",
      name = "g",
      descriptor = "I"
   )
   public static int field533;
   @OriginalMember(
      owner = "client!wv",
      name = "p",
      descriptor = "I"
   )
   public static int field536;
   @OriginalMember(
      owner = "client!wv",
      name = "o",
      descriptor = "I"
   )
   public static int field539;
   @OriginalMember(
      owner = "client!wv",
      name = "i",
      descriptor = "J"
   )
   private long field524;
   @OriginalMember(
      owner = "client!wv",
      name = "r",
      descriptor = "Loh;"
   )
   private class428 field525;
   @OriginalMember(
      owner = "client!wv",
      name = "k",
      descriptor = "Loh;"
   )
   private class428 field535;

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(I)Loh;"
   )
   public final class428 method325(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field532;
         if (arg0 != -4629) {
            return null;
         } else if (this.field538 > 0 && this.field534[this.field538 + -1] != this.field535) {
            class428 var3 = this.field535;
            this.field535 = var3.field6126;
            return var3;
         } else {
            while(this.field538 < this.field521) {
               class428 var4 = this.field534[this.field538++].field6126;
               class428 var10000 = var4;

               while(var10000 != this.field534[this.field538 + -1]) {
                  this.field535 = var4.field6126;
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field540[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method326(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field530;
         int var3 = 0;
         if (arg0 >= -97) {
            return -77;
         } else {
            int var4 = 0;
            if (!var2 && this.field521 <= var4) {
               return var3;
            } else {
               do {
                  class428 var5 = this.field534[var4];
                  class428 var6 = var5.field6126;
                  if (var2) {
                     var6 = var6.field6126;
                     ++var3;
                  }

                  while(true) {
                     while(var5 != var6) {
                        var6 = var6.field6126;
                        ++var3;
                     }

                     if (!var2) {
                        ++var4;
                        break;
                     }

                     ++var3;
                  }
               } while(this.field521 > var4);

               return var3;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field540[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method327(int arg0) {
      try {
         field523 = null;
         if (arg0 != -1) {
            method335(true);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field540[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "c",
      descriptor = "(I)Loh;"
   )
   public final class428 method328(int arg0) {
      try {
         this.field538 = 0;
         if (arg0 != 1745388291) {
            this.method326((byte)54);
         }

         ++field526;
         return this.method325(-4629);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field540[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(BJ)Loh;"
   )
   public final class428 method329(byte arg0, long arg1) {
      boolean var4 = client.field4360;

      try {
         this.field524 = arg1;
         ++field527;
         class428 var5 = this.field534[(int)((long)(this.field521 + -1) & arg1)];
         this.field525 = var5.field6126;
         class428 var6;
         if (var4) {
            if (~this.field525.field6137 == ~arg1) {
               var6 = this.field525;
               this.field525 = this.field525.field6126;
               return var6;
            }

            this.field525 = this.field525.field6126;
         }

         while(true) {
            while(this.field525 != var5) {
               if (~this.field525.field6137 == ~arg1) {
                  var6 = this.field525;
                  this.field525 = this.field525.field6126;
                  return var6;
               }

               this.field525 = this.field525.field6126;
            }

            int var7 = 43 / ((48 - arg0) / 50);
            this.field525 = null;
            if (!var4) {
               return null;
            }

            this.field525 = this.field525.field6126;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field540[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "([Loh;I)I"
   )
   public final int method330(class428[] arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field522;
         if (arg1 != 16764596) {
            this.field535 = null;
         }

         int var4 = 0;
         int var5 = 0;
         if (!var3 && ~var5 <= ~this.field521) {
            return var4;
         } else {
            do {
               class428 var6 = this.field534[var5];
               class428 var7 = var6.field6126;
               if (var3) {
                  arg0[var4++] = var7;
                  var7 = var7.field6126;
               }

               while(true) {
                  while(var6 != var7) {
                     arg0[var4++] = var7;
                     var7 = var7.field6126;
                  }

                  if (!var3) {
                     ++var5;
                     break;
                  }

                  var7 = var7.field6126;
               }
            } while(~var5 > ~this.field521);

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field540[10] + (arg0 != null ? field540[9] : field540[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method331(boolean arg0, int arg1) {
      try {
         ++field528;
         if (class96.field1242.length() != 0) {
            class756.method5492((byte)106, field540[14] + class96.field1242);
            if (arg1 < 56) {
               field523 = null;
            }

            class418.method3120(arg0, 0, false, class96.field1242);
            class295.field4072 = 0;
            if (!arg0) {
               class96.field1242 = "";
               class168.field2346 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field540[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method332(int arg0) {
      try {
         ++field531;
         if (arg0 != 0) {
            field537 = -21;
         }

         return this.field521;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field540[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "(Z)Loh;"
   )
   public final class428 method333(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field536;
         if (arg0) {
            this.method336(-118, -8L, (class428)null);
         }

         if (this.field525 == null) {
            return null;
         } else {
            class428 var3 = this.field534[(int)((long)(this.field521 - 1) & this.field524)];
            class428 var4;
            if (var2) {
               if (~this.field525.field6137 == ~this.field524) {
                  var4 = this.field525;
                  this.field525 = this.field525.field6126;
                  return var4;
               }

               this.field525 = this.field525.field6126;
            }

            while(true) {
               while(this.field525 != var3) {
                  if (~this.field525.field6137 == ~this.field524) {
                     var4 = this.field525;
                     this.field525 = this.field525.field6126;
                     return var4;
                  }

                  this.field525 = this.field525.field6126;
               }

               this.field525 = null;
               if (!var2) {
                  return null;
               }

               this.field525 = this.field525.field6126;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field540[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method334(byte arg0) {
      boolean var2 = client.field4360;

      try {
         int var3 = 0;
         class428 var4;
         if (var2) {
            var4 = this.field534[var3];
         } else {
            if (var3 >= this.field521) {
               ++field539;
               if (arg0 <= 103) {
                  return;
               }

               this.field525 = null;
               this.field535 = null;
               return;
            }

            var4 = this.field534[var3];
         }

         while(true) {
            while(true) {
               class428 var5 = var4.field6126;
               if (var4 != var5) {
                  var5.method3165(110);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }

                  ++var3;
                  break;
               }

               ++var3;
               break;
            }

            if (var3 >= this.field521) {
               ++field539;
               if (arg0 <= 103) {
                  return;
               }

               this.field525 = null;
               this.field535 = null;
               return;
            }

            var4 = this.field534[var3];
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field540[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method335(boolean arg0) {
      boolean var1 = client.field4360;

      try {
         class534 var2;
         int var3;
         int var4;
         int var5;
         int var8;
         int var11;
         label206: {
            ++field533;
            var2 = class430.field6150.field105;
            var3 = ~var2.method1194(14623) != -2 ? 0 : 1;
            var4 = var2.method1211(-26166);
            var5 = var2.method1176(-32768);
            class594.field8738 = var2.method1194(14623);
            int var6 = var2.method1189(0);
            class487.method3533((byte)21);
            class100.method839(-1697555133, var6);
            var2.method3841(8);
            int var7 = 0;
            if (var1) {
               var8 = 0;
            } else if (~var7 <= -5) {
               var2.method3843(90);
               var8 = (-var2.field1856 + class430.field6150.field110) / 16;
               class636.field9306 = new int[var8][4];
               var11 = 0;
               if (!var1) {
                  break label206;
               }
            } else {
               var8 = 0;
            }

            while(true) {
               if (var1 || var8 < class644.field9403 >> 3) {
                  do {
                     int var9 = 0;
                     if (var1 || ~var9 > ~(class337.field4594 >> 3)) {
                        do {
                           int var10 = var2.method3844(1, 0);
                           if (var10 != 1) {
                              class470.field6756[var7][var8][var9] = -1;
                              if (var1) {
                                 class470.field6756[var7][var8][var9] = var2.method3844(26, 0);
                                 ++var9;
                              } else {
                                 ++var9;
                              }
                           } else {
                              class470.field6756[var7][var8][var9] = var2.method3844(26, 0);
                              ++var9;
                           }
                        } while(~var9 > ~(class337.field4594 >> 3));
                     }

                     ++var8;
                  } while(var8 < class644.field9403 >> 3);
               }

               ++var7;
               if (~var7 <= -5) {
                  var2.method3843(90);
                  var8 = (-var2.field1856 + class430.field6150.field110) / 16;
                  class636.field9306 = new int[var8][4];
                  var11 = 0;
                  if (!var1) {
                     break;
                  }
               } else {
                  var8 = 0;
               }
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         byte var10000;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var26;
         if (var1) {
            var12 = 0;
            if (var1) {
               class636.field9306[var11][var12] = var2.method1164(19693);
               ++var12;
            }
         } else {
            if (var11 >= var8) {
               class371.field5388 = new byte[var8][];
               class78.field965 = new byte[var8][];
               class769.field11340 = new int[var8];
               class77.field962 = new int[var8];
               class464.field6705 = null;
               class436.field6245 = new int[var8];
               class784.field11482 = new int[var8];
               class212.field3029 = new byte[var8][];
               class668.field9714 = new byte[var8][];
               class356.field4787 = null;
               var10000 = arg0;
               if (!var1) {
                  if (arg0 != 0) {
                     return;
                  }

                  class474.field6824 = new int[var8];
                  var13 = 0;
                  var14 = 0;
                  if (var1) {
                     var26 = 0;
                  } else if (var14 >= 4) {
                     var26 = var3;
                     if (!var1) {
                        class564.method4023((boolean)var3, -1574872860, 12, var5, var4);
                        return;
                     }
                  } else {
                     var26 = 0;
                  }

                  while(true) {
                     var15 = var26;
                     if (var1 || class644.field9403 >> 3 > var15) {
                        do {
                           var16 = 0;
                           if (var1 || ~var16 > ~(class337.field4594 >> 3)) {
                              label279:
                              do {
                                 var17 = class470.field6756[var14][var15][var16];
                                 if (var17 == -1) {
                                    ++var16;
                                 } else {
                                    var18 = (16764596 & var17) >> 14;
                                    var19 = (16383 & var17) >> 3;
                                    var20 = (var18 / 8 << 8) - -(var19 / 8);
                                    var21 = 0;
                                    if (var1) {
                                       var26 = var20;
                                    } else if (var21 >= var13) {
                                       var26 = ~var20;
                                       if (!var1) {
                                          if (var26 != 0) {
                                             class436.field6245[var13] = var20;
                                             var22 = 255 & var20 >> 8;
                                             var23 = 255 & var20;
                                             class77.field962[var13] = class515.field7437.method2031(0, "m" + var22 + "_" + var23);
                                             class474.field6824[var13] = class515.field7437.method2031(0, "l" + var22 + "_" + var23);
                                             class784.field11482[var13] = class515.field7437.method2031(0, field540[2] + var22 + "_" + var23);
                                             class769.field11340[var13] = class515.field7437.method2031(0, field540[0] + var22 + "_" + var23);
                                             ++var13;
                                          }

                                          ++var16;
                                          continue;
                                       }
                                    } else {
                                       var26 = var20;
                                    }

                                    do {
                                       while(true) {
                                          if (var26 == class436.field6245[var21]) {
                                             var20 = -1;
                                             if (!var1) {
                                                var26 = ~var20;
                                                break;
                                             }

                                             ++var21;
                                          } else {
                                             ++var21;
                                          }

                                          if (var21 >= var13) {
                                             var26 = ~var20;
                                             if (!var1) {
                                                if (var26 != 0) {
                                                   class436.field6245[var13] = var20;
                                                   var22 = 255 & var20 >> 8;
                                                   var23 = 255 & var20;
                                                   class77.field962[var13] = class515.field7437.method2031(0, "m" + var22 + "_" + var23);
                                                   class474.field6824[var13] = class515.field7437.method2031(0, "l" + var22 + "_" + var23);
                                                   class784.field11482[var13] = class515.field7437.method2031(0, field540[2] + var22 + "_" + var23);
                                                   class769.field11340[var13] = class515.field7437.method2031(0, field540[0] + var22 + "_" + var23);
                                                   ++var13;
                                                }

                                                ++var16;
                                                continue label279;
                                             }
                                          } else {
                                             var26 = var20;
                                          }
                                       }
                                    } while(var1);

                                    if (var26 != 0) {
                                       class436.field6245[var13] = var20;
                                       var22 = 255 & var20 >> 8;
                                       var23 = 255 & var20;
                                       class77.field962[var13] = class515.field7437.method2031(0, "m" + var22 + "_" + var23);
                                       class474.field6824[var13] = class515.field7437.method2031(0, "l" + var22 + "_" + var23);
                                       class784.field11482[var13] = class515.field7437.method2031(0, field540[2] + var22 + "_" + var23);
                                       class769.field11340[var13] = class515.field7437.method2031(0, field540[0] + var22 + "_" + var23);
                                       ++var13;
                                    }

                                    ++var16;
                                 }
                              } while(~var16 > ~(class337.field4594 >> 3));
                           }

                           ++var15;
                        } while(class644.field9403 >> 3 > var15);
                     }

                     ++var14;
                     if (var14 >= 4) {
                        var26 = var3;
                        if (!var1) {
                           class564.method4023((boolean)var3, -1574872860, 12, var5, var4);
                           return;
                        }
                     } else {
                        var26 = 0;
                     }
                  }
               }
            } else {
               var10000 = 0;
            }

            var12 = var10000;
            if (var1) {
               class636.field9306[var11][var12] = var2.method1164(19693);
               ++var12;
            }
         }

         while(true) {
            while(var12 < 4) {
               class636.field9306[var11][var12] = var2.method1164(19693);
               ++var12;
            }

            if (!var1) {
               ++var11;
               if (var11 >= var8) {
                  class371.field5388 = new byte[var8][];
                  class78.field965 = new byte[var8][];
                  class769.field11340 = new int[var8];
                  class77.field962 = new int[var8];
                  class464.field6705 = null;
                  class436.field6245 = new int[var8];
                  class784.field11482 = new int[var8];
                  class212.field3029 = new byte[var8][];
                  class668.field9714 = new byte[var8][];
                  class356.field4787 = null;
                  var10000 = arg0;
                  if (!var1) {
                     if (arg0 != 0) {
                        return;
                     }

                     class474.field6824 = new int[var8];
                     var13 = 0;
                     var14 = 0;
                     if (var1) {
                        var26 = 0;
                     } else if (var14 >= 4) {
                        var26 = var3;
                        if (!var1) {
                           class564.method4023((boolean)var3, -1574872860, 12, var5, var4);
                           return;
                        }
                     } else {
                        var26 = 0;
                     }

                     while(true) {
                        var15 = var26;
                        if (var1 || class644.field9403 >> 3 > var15) {
                           do {
                              var16 = 0;
                              if (var1 || ~var16 > ~(class337.field4594 >> 3)) {
                                 label150:
                                 do {
                                    var17 = class470.field6756[var14][var15][var16];
                                    if (var17 == -1) {
                                       ++var16;
                                    } else {
                                       var18 = (16764596 & var17) >> 14;
                                       var19 = (16383 & var17) >> 3;
                                       var20 = (var18 / 8 << 8) - -(var19 / 8);
                                       var21 = 0;
                                       if (var1) {
                                          var26 = var20;
                                       } else if (var21 >= var13) {
                                          var26 = ~var20;
                                          if (!var1) {
                                             if (var26 != 0) {
                                                class436.field6245[var13] = var20;
                                                var22 = 255 & var20 >> 8;
                                                var23 = 255 & var20;
                                                class77.field962[var13] = class515.field7437.method2031(0, "m" + var22 + "_" + var23);
                                                class474.field6824[var13] = class515.field7437.method2031(0, "l" + var22 + "_" + var23);
                                                class784.field11482[var13] = class515.field7437.method2031(0, field540[2] + var22 + "_" + var23);
                                                class769.field11340[var13] = class515.field7437.method2031(0, field540[0] + var22 + "_" + var23);
                                                ++var13;
                                             }

                                             ++var16;
                                             continue;
                                          }
                                       } else {
                                          var26 = var20;
                                       }

                                       do {
                                          while(true) {
                                             if (var26 == class436.field6245[var21]) {
                                                var20 = -1;
                                                if (!var1) {
                                                   var26 = ~var20;
                                                   break;
                                                }

                                                ++var21;
                                             } else {
                                                ++var21;
                                             }

                                             if (var21 >= var13) {
                                                var26 = ~var20;
                                                if (!var1) {
                                                   if (var26 != 0) {
                                                      class436.field6245[var13] = var20;
                                                      var22 = 255 & var20 >> 8;
                                                      var23 = 255 & var20;
                                                      class77.field962[var13] = class515.field7437.method2031(0, "m" + var22 + "_" + var23);
                                                      class474.field6824[var13] = class515.field7437.method2031(0, "l" + var22 + "_" + var23);
                                                      class784.field11482[var13] = class515.field7437.method2031(0, field540[2] + var22 + "_" + var23);
                                                      class769.field11340[var13] = class515.field7437.method2031(0, field540[0] + var22 + "_" + var23);
                                                      ++var13;
                                                   }

                                                   ++var16;
                                                   continue label150;
                                                }
                                             } else {
                                                var26 = var20;
                                             }
                                          }
                                       } while(var1);

                                       if (var26 != 0) {
                                          class436.field6245[var13] = var20;
                                          var22 = 255 & var20 >> 8;
                                          var23 = 255 & var20;
                                          class77.field962[var13] = class515.field7437.method2031(0, "m" + var22 + "_" + var23);
                                          class474.field6824[var13] = class515.field7437.method2031(0, "l" + var22 + "_" + var23);
                                          class784.field11482[var13] = class515.field7437.method2031(0, field540[2] + var22 + "_" + var23);
                                          class769.field11340[var13] = class515.field7437.method2031(0, field540[0] + var22 + "_" + var23);
                                          ++var13;
                                       }

                                       ++var16;
                                    }
                                 } while(~var16 > ~(class337.field4594 >> 3));
                              }

                              ++var15;
                           } while(class644.field9403 >> 3 > var15);
                        }

                        ++var14;
                        if (var14 >= 4) {
                           var26 = var3;
                           if (!var1) {
                              class564.method4023((boolean)var3, -1574872860, 12, var5, var4);
                              return;
                           }
                        } else {
                           var26 = 0;
                        }
                     }
                  }
               } else {
                  var10000 = 0;
               }

               var12 = var10000;
               if (var1) {
                  class636.field9306[var11][var12] = var2.method1164(19693);
                  ++var12;
               }
            } else {
               ++var12;
            }
         }
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field540[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(IJLoh;)V"
   )
   public final void method336(int arg0, long arg1, class428 arg2) {
      try {
         if (arg2.field6130 != null) {
            arg2.method3165(arg0 + 125);
         }

         ++field529;
         class428 var5 = this.field534[(int)(arg1 & (long)(this.field521 + arg0))];
         arg2.field6126 = var5;
         arg2.field6130 = var5.field6130;
         arg2.field6130.field6126 = arg2;
         arg2.field6137 = arg1;
         arg2.field6126.field6130 = arg2;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field540[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field540[9] : field540[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class37(int arg0) {
      try {
         this.field534 = new class428[arg0];
         this.field521 = arg0;

         for(int var2 = 0; ~var2 > ~arg0; ++var2) {
            class428 var3 = this.field534[var2] = new class428();
            var3.field6130 = var3;
            var3.field6126 = var3;
         }

      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field540[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method337(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method338(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
