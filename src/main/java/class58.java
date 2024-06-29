import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class58 {
   @OriginalMember(
      owner = "client!dm",
      name = "p",
      descriptor = "I"
   )
   public int field738;
   @OriginalMember(
      owner = "client!dm",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public String field734;
   @OriginalMember(
      owner = "client!dm",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field733;
   @OriginalMember(
      owner = "client!dm",
      name = "f",
      descriptor = "I"
   )
   public int field730;
   @OriginalMember(
      owner = "client!dm",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field740;
   @OriginalMember(
      owner = "client!dm",
      name = "c",
      descriptor = "I"
   )
   public int field731;
   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field732;
   @OriginalMember(
      owner = "client!dm",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field729;
   @OriginalMember(
      owner = "client!dm",
      name = "g",
      descriptor = "I"
   )
   public int field728;
   @OriginalMember(
      owner = "client!dm",
      name = "b",
      descriptor = "I"
   )
   public int field743;
   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field744 = new String[]{method491(method490("o\u0016n\u0013")), method491(method490("zM,Q@")), method491(method490("e\u000e,>\u0015")), method491(method490("e\u000e,:\u0015")), method491(method490("e\u000e,<\u0015")), method491(method490("e\u000e,CTo\nvA\u0015")), method491(method490("t\u000f")), method491(method490("e\u000e,=\u0015")), method491(method490("t\u000e")), method491(method490("e\u000e,9\u0015")), method491(method490("e\u000e,;\u0015"))};
   @OriginalMember(
      owner = "client!dm",
      name = "n",
      descriptor = "I"
   )
   public static int field735;
   @OriginalMember(
      owner = "client!dm",
      name = "j",
      descriptor = "I"
   )
   public static int field736;
   @OriginalMember(
      owner = "client!dm",
      name = "d",
      descriptor = "I"
   )
   public static int field737;
   @OriginalMember(
      owner = "client!dm",
      name = "k",
      descriptor = "I"
   )
   public static int field739;
   @OriginalMember(
      owner = "client!dm",
      name = "e",
      descriptor = "I"
   )
   public static int field741;
   @OriginalMember(
      owner = "client!dm",
      name = "m",
      descriptor = "I"
   )
   public static int field742;

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
      line = 7
   )
   public final void method484(int arg0, int arg1, int arg2, String arg3, String arg4, int arg5, String arg6, String arg7, String arg8) {
      try {
         this.field738 = class675.method4925(false);
         ++field742;
         this.field740 = arg3;
         this.field743 = class314.field4488;
         this.field730 = arg0;
         this.field734 = arg7;
         if (arg2 == -1766) {
            this.field729 = arg6;
            this.field732 = arg4;
            this.field731 = arg1;
            this.field733 = arg8;
            this.field728 = arg5;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field744[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field744[1] : field744[0]) + ',' + (arg4 != null ? field744[1] : field744[0]) + ',' + arg5 + ',' + (arg6 != null ? field744[1] : field744[0]) + ',' + (arg7 != null ? field744[1] : field744[0]) + ',' + (arg8 != null ? field744[1] : field744[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(ILhg;)[Lgl;",
      line = 28
   )
   public static final class625[] method485(int arg0, class719 arg1) {
      int var2 = client.field4530;

      try {
         ++field735;
         if (!arg1.method5197((byte)67)) {
            return new class625[0];
         } else {
            class12 var3 = arg1.method5203(false);
            if (var2 != 0) {
               class89.method817(10L, 2535);
            }

            while(~var3.field159 == -1) {
               class89.method817(10L, 2535);
            }

            if (var3.field159 == 2) {
               return new class625[0];
            } else {
               int[] var4 = (int[])var3.field160;
               class625[] var5 = new class625[var4.length >> 2];
               int var6 = -79 / ((arg0 - 24) / 56);
               int var7 = 0;
               if (var2 == 0 && ~var5.length >= ~var7) {
                  return var5;
               } else {
                  do {
                     class625 var8 = new class625();
                     var5[var7] = var8;
                     var8.field9098 = var4[var7 << 2];
                     var8.field9093 = var4[(var7 << 2) - -1];
                     var8.field9091 = var4[(var7 << 2) + 2];
                     var8.field9096 = var4[(var7 << 2) + 3];
                     ++var7;
                  } while(~var5.length < ~var7);

                  return var5;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field744[2] + arg0 + ',' + (arg1 != null ? field744[1] : field744[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "b",
      descriptor = "(B)V",
      line = 71
   )
   public static final void method486(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field737;
         int var2 = ~class401.field6163.method1076((byte)-123) != -2 ? 0 : 1;
         class643.field9369 = class401.field6163.method1074((byte)-115);
         int var3 = class401.field6163.method1043((byte)-127);
         int var4 = class401.field6163.method1053(false);
         int var5 = class401.field6163.method1054(-8779);
         class125.method1027((byte)-123);
         class111.method946(-1263464541, var3);
         class401.field6163.method3835(120);
         int var6 = 0;
         int var7;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var10000;
         int var16;
         int var17;
         int var10001;
         int var18;
         int var19;
         int var20;
         int var21;
         if (var1 != 0) {
            var7 = 0;
         } else if (var6 >= 4) {
            class401.field6163.method3840((byte)-72);
            var7 = (class61.field759 - class401.field6163.field1590) / 16;
            class219.field2790 = new int[var7][4];
            var10 = 0;
            if (var1 == 0) {
               label271: {
                  if (var1 != 0) {
                     var11 = 0;
                     if (var1 != 0) {
                        class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                        ++var11;
                     }
                  } else {
                     if (~var10 <= ~var7) {
                        class336.field4809 = new int[var7];
                        class447.field6796 = new int[var7];
                        class483.field7165 = new byte[var7][];
                        class357.field5408 = new int[var7];
                        class238.field3026 = new byte[var7][];
                        var11 = -113 / ((18 - arg0) / 43);
                        class37.field402 = null;
                        class164.field2057 = new int[var7];
                        class706.field10568 = new byte[var7][];
                        class467.field7002 = new byte[var7][];
                        class483.field7166 = new int[var7];
                        class433.field6613 = null;
                        var7 = 0;
                        var12 = 0;
                        if (var1 == 0) {
                           break label271;
                        }
                     } else {
                        var11 = 0;
                     }

                     if (var1 != 0) {
                        class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                        ++var11;
                     }
                  }

                  while(true) {
                     while(var11 < 4) {
                        class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                        ++var11;
                     }

                     if (var1 == 0) {
                        ++var10;
                        if (~var10 <= ~var7) {
                           class336.field4809 = new int[var7];
                           class447.field6796 = new int[var7];
                           class483.field7165 = new byte[var7][];
                           class357.field5408 = new int[var7];
                           class238.field3026 = new byte[var7][];
                           var11 = -113 / ((18 - arg0) / 43);
                           class37.field402 = null;
                           class164.field2057 = new int[var7];
                           class706.field10568 = new byte[var7][];
                           class467.field7002 = new byte[var7][];
                           class483.field7166 = new int[var7];
                           class433.field6613 = null;
                           var7 = 0;
                           var12 = 0;
                           if (var1 == 0) {
                              break;
                           }
                        } else {
                           var11 = 0;
                        }

                        if (var1 != 0) {
                           class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                           ++var11;
                        }
                     } else {
                        ++var11;
                     }
                  }
               }

               if (var1 != 0) {
                  var10000 = 0;
               } else if (~var12 <= -5) {
                  var10000 = var2;
                  if (var1 == 0) {
                     class153.method1263((boolean)var2, var5, -1, var4, 11);
                     return;
                  }
               } else {
                  var10000 = 0;
               }

               while(true) {
                  var13 = var10000;
                  if (var1 != 0 || class323.field4603 >> 3 > var13) {
                     do {
                        var14 = 0;
                        if (var1 != 0 || class178.field2197 >> 3 > var14) {
                           label371:
                           do {
                              var15 = class787.field11450[var12][var13][var14];
                              if (var15 == -1) {
                                 ++var14;
                              } else {
                                 var16 = 1023 & var15 >> 14;
                                 var17 = (16377 & var15) >> 3;
                                 var18 = (var16 / 8 << 8) - -(var17 / 8);
                                 var19 = 0;
                                 if (var1 != 0) {
                                    var10000 = ~var18;
                                    var10001 = ~class483.field7166[var19];
                                 } else if (~var7 >= ~var19) {
                                    var10000 = var18;
                                    var10001 = -1;
                                    if (var1 == 0) {
                                       if (var18 != -1) {
                                          class483.field7166[var7] = var18;
                                          var20 = (65429 & var18) >> 8;
                                          var21 = 255 & var18;
                                          class336.field4809[var7] = class614.field8980.method3902("m" + var20 + "_" + var21, 94);
                                          class447.field6796[var7] = class614.field8980.method3902("l" + var20 + "_" + var21, 81);
                                          class164.field2057[var7] = class614.field8980.method3902(field744[8] + var20 + "_" + var21, 87);
                                          class357.field5408[var7] = class614.field8980.method3902(field744[6] + var20 + "_" + var21, 113);
                                          ++var7;
                                       }

                                       ++var14;
                                       continue;
                                    }
                                 } else {
                                    var10000 = ~var18;
                                    var10001 = ~class483.field7166[var19];
                                 }

                                 do {
                                    while(true) {
                                       if (var10000 == var10001) {
                                          var18 = -1;
                                          if (var1 == 0) {
                                             var10000 = var18;
                                             var10001 = -1;
                                             break;
                                          }

                                          ++var19;
                                       } else {
                                          ++var19;
                                       }

                                       if (~var7 >= ~var19) {
                                          var10000 = var18;
                                          var10001 = -1;
                                          if (var1 == 0) {
                                             if (var18 != -1) {
                                                class483.field7166[var7] = var18;
                                                var20 = (65429 & var18) >> 8;
                                                var21 = 255 & var18;
                                                class336.field4809[var7] = class614.field8980.method3902("m" + var20 + "_" + var21, 94);
                                                class447.field6796[var7] = class614.field8980.method3902("l" + var20 + "_" + var21, 81);
                                                class164.field2057[var7] = class614.field8980.method3902(field744[8] + var20 + "_" + var21, 87);
                                                class357.field5408[var7] = class614.field8980.method3902(field744[6] + var20 + "_" + var21, 113);
                                                ++var7;
                                             }

                                             ++var14;
                                             continue label371;
                                          }
                                       } else {
                                          var10000 = ~var18;
                                          var10001 = ~class483.field7166[var19];
                                       }
                                    }
                                 } while(var1 != 0);

                                 if (var18 != -1) {
                                    class483.field7166[var7] = var18;
                                    var20 = (65429 & var18) >> 8;
                                    var21 = 255 & var18;
                                    class336.field4809[var7] = class614.field8980.method3902("m" + var20 + "_" + var21, 94);
                                    class447.field6796[var7] = class614.field8980.method3902("l" + var20 + "_" + var21, 81);
                                    class164.field2057[var7] = class614.field8980.method3902(field744[8] + var20 + "_" + var21, 87);
                                    class357.field5408[var7] = class614.field8980.method3902(field744[6] + var20 + "_" + var21, 113);
                                    ++var7;
                                 }

                                 ++var14;
                              }
                           } while(class178.field2197 >> 3 > var14);
                        }

                        ++var13;
                     } while(class323.field4603 >> 3 > var13);
                  }

                  ++var12;
                  if (~var12 <= -5) {
                     var10000 = var2;
                     if (var1 == 0) {
                        class153.method1263((boolean)var2, var5, -1, var4, 11);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }
               }
            }
         } else {
            var7 = 0;
         }

         while(true) {
            label506: {
               int var8;
               int var9;
               if (var1 != 0) {
                  var8 = 0;
                  if (var1 != 0) {
                     var9 = class401.field6163.method3829(-89, 1);
                     if (var9 == 1) {
                        class787.field11450[var6][var7][var8] = class401.field6163.method3829(-112, 26);
                        if (var1 != 0) {
                           class787.field11450[var6][var7][var8] = -1;
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class787.field11450[var6][var7][var8] = -1;
                        ++var8;
                     }
                  }
               } else {
                  if (~var7 <= ~(class323.field4603 >> 3)) {
                     break label506;
                  }

                  var8 = 0;
                  if (var1 != 0) {
                     var9 = class401.field6163.method3829(-89, 1);
                     if (var9 == 1) {
                        class787.field11450[var6][var7][var8] = class401.field6163.method3829(-112, 26);
                        if (var1 != 0) {
                           class787.field11450[var6][var7][var8] = -1;
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class787.field11450[var6][var7][var8] = -1;
                        ++var8;
                     }
                  }
               }

               while(true) {
                  while(~var8 > ~(class178.field2197 >> 3)) {
                     var9 = class401.field6163.method3829(-89, 1);
                     if (var9 == 1) {
                        class787.field11450[var6][var7][var8] = class401.field6163.method3829(-112, 26);
                        if (var1 != 0) {
                           class787.field11450[var6][var7][var8] = -1;
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class787.field11450[var6][var7][var8] = -1;
                        ++var8;
                     }
                  }

                  ++var7;
                  if (~var7 <= ~(class323.field4603 >> 3)) {
                     break;
                  }

                  var8 = 0;
                  if (var1 != 0) {
                     var9 = class401.field6163.method3829(-89, 1);
                     if (var9 == 1) {
                        class787.field11450[var6][var7][var8] = class401.field6163.method3829(-112, 26);
                        if (var1 != 0) {
                           class787.field11450[var6][var7][var8] = -1;
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class787.field11450[var6][var7][var8] = -1;
                        ++var8;
                     }
                  }
               }
            }

            ++var6;
            if (var6 >= 4) {
               class401.field6163.method3840((byte)-72);
               var7 = (class61.field759 - class401.field6163.field1590) / 16;
               class219.field2790 = new int[var7][4];
               var10 = 0;
               if (var1 == 0) {
                  label115: {
                     if (var1 != 0) {
                        var11 = 0;
                        if (var1 != 0) {
                           class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                           ++var11;
                        }
                     } else {
                        if (~var10 <= ~var7) {
                           class336.field4809 = new int[var7];
                           class447.field6796 = new int[var7];
                           class483.field7165 = new byte[var7][];
                           class357.field5408 = new int[var7];
                           class238.field3026 = new byte[var7][];
                           var11 = -113 / ((18 - arg0) / 43);
                           class37.field402 = null;
                           class164.field2057 = new int[var7];
                           class706.field10568 = new byte[var7][];
                           class467.field7002 = new byte[var7][];
                           class483.field7166 = new int[var7];
                           class433.field6613 = null;
                           var7 = 0;
                           var12 = 0;
                           if (var1 == 0) {
                              break label115;
                           }
                        } else {
                           var11 = 0;
                        }

                        if (var1 != 0) {
                           class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                           ++var11;
                        }
                     }

                     while(true) {
                        while(var11 < 4) {
                           class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                           ++var11;
                        }

                        if (var1 == 0) {
                           ++var10;
                           if (~var10 <= ~var7) {
                              class336.field4809 = new int[var7];
                              class447.field6796 = new int[var7];
                              class483.field7165 = new byte[var7][];
                              class357.field5408 = new int[var7];
                              class238.field3026 = new byte[var7][];
                              var11 = -113 / ((18 - arg0) / 43);
                              class37.field402 = null;
                              class164.field2057 = new int[var7];
                              class706.field10568 = new byte[var7][];
                              class467.field7002 = new byte[var7][];
                              class483.field7166 = new int[var7];
                              class433.field6613 = null;
                              var7 = 0;
                              var12 = 0;
                              if (var1 == 0) {
                                 break;
                              }
                           } else {
                              var11 = 0;
                           }

                           if (var1 != 0) {
                              class219.field2790[var10][var11] = class401.field6163.method1041(4758);
                              ++var11;
                           }
                        } else {
                           ++var11;
                        }
                     }
                  }

                  if (var1 != 0) {
                     var10000 = 0;
                  } else if (~var12 <= -5) {
                     var10000 = var2;
                     if (var1 == 0) {
                        class153.method1263((boolean)var2, var5, -1, var4, 11);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     var13 = var10000;
                     if (var1 != 0 || class323.field4603 >> 3 > var13) {
                        do {
                           var14 = 0;
                           if (var1 != 0 || class178.field2197 >> 3 > var14) {
                              label197:
                              do {
                                 var15 = class787.field11450[var12][var13][var14];
                                 if (var15 == -1) {
                                    ++var14;
                                 } else {
                                    var16 = 1023 & var15 >> 14;
                                    var17 = (16377 & var15) >> 3;
                                    var18 = (var16 / 8 << 8) - -(var17 / 8);
                                    var19 = 0;
                                    if (var1 != 0) {
                                       var10000 = ~var18;
                                       var10001 = ~class483.field7166[var19];
                                    } else if (~var7 >= ~var19) {
                                       var10000 = var18;
                                       var10001 = -1;
                                       if (var1 == 0) {
                                          if (var18 != -1) {
                                             class483.field7166[var7] = var18;
                                             var20 = (65429 & var18) >> 8;
                                             var21 = 255 & var18;
                                             class336.field4809[var7] = class614.field8980.method3902("m" + var20 + "_" + var21, 94);
                                             class447.field6796[var7] = class614.field8980.method3902("l" + var20 + "_" + var21, 81);
                                             class164.field2057[var7] = class614.field8980.method3902(field744[8] + var20 + "_" + var21, 87);
                                             class357.field5408[var7] = class614.field8980.method3902(field744[6] + var20 + "_" + var21, 113);
                                             ++var7;
                                          }

                                          ++var14;
                                          continue;
                                       }
                                    } else {
                                       var10000 = ~var18;
                                       var10001 = ~class483.field7166[var19];
                                    }

                                    do {
                                       while(true) {
                                          if (var10000 == var10001) {
                                             var18 = -1;
                                             if (var1 == 0) {
                                                var10000 = var18;
                                                var10001 = -1;
                                                break;
                                             }

                                             ++var19;
                                          } else {
                                             ++var19;
                                          }

                                          if (~var7 >= ~var19) {
                                             var10000 = var18;
                                             var10001 = -1;
                                             if (var1 == 0) {
                                                if (var18 != -1) {
                                                   class483.field7166[var7] = var18;
                                                   var20 = (65429 & var18) >> 8;
                                                   var21 = 255 & var18;
                                                   class336.field4809[var7] = class614.field8980.method3902("m" + var20 + "_" + var21, 94);
                                                   class447.field6796[var7] = class614.field8980.method3902("l" + var20 + "_" + var21, 81);
                                                   class164.field2057[var7] = class614.field8980.method3902(field744[8] + var20 + "_" + var21, 87);
                                                   class357.field5408[var7] = class614.field8980.method3902(field744[6] + var20 + "_" + var21, 113);
                                                   ++var7;
                                                }

                                                ++var14;
                                                continue label197;
                                             }
                                          } else {
                                             var10000 = ~var18;
                                             var10001 = ~class483.field7166[var19];
                                          }
                                       }
                                    } while(var1 != 0);

                                    if (var18 != -1) {
                                       class483.field7166[var7] = var18;
                                       var20 = (65429 & var18) >> 8;
                                       var21 = 255 & var18;
                                       class336.field4809[var7] = class614.field8980.method3902("m" + var20 + "_" + var21, 94);
                                       class447.field6796[var7] = class614.field8980.method3902("l" + var20 + "_" + var21, 81);
                                       class164.field2057[var7] = class614.field8980.method3902(field744[8] + var20 + "_" + var21, 87);
                                       class357.field5408[var7] = class614.field8980.method3902(field744[6] + var20 + "_" + var21, 113);
                                       ++var7;
                                    }

                                    ++var14;
                                 }
                              } while(class178.field2197 >> 3 > var14);
                           }

                           ++var13;
                        } while(class323.field4603 >> 3 > var13);
                     }

                     ++var12;
                     if (~var12 <= -5) {
                        var10000 = var2;
                        if (var1 == 0) {
                           class153.method1263((boolean)var2, var5, -1, var4, 11);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }
            } else {
               var7 = 0;
            }
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field744[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(ZLct;)V",
      line = 227
   )
   public static final void method487(boolean param0, class155 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(IB)V",
      line = 264
   )
   public static final void method488(int arg0, byte arg1) {
      try {
         ++field741;
         if (class261.field3566.field9460.method5464(106) == 0) {
            arg0 = -1;
         }

         if (arg1 == -109) {
            if (class109.field1331 != arg0) {
               if (~arg0 != 0) {
                  label31: {
                     class623 var2 = class299.field4267.method3948(arg0, arg1 ^ 50);
                     class671 var3 = var2.method4499((byte)-106);
                     if (var3 == null) {
                        arg0 = -1;
                        if (client.field4530 == 0) {
                           break label31;
                        }
                     }

                     class755.field11144.method5206(var3.method4893(), new Point(var2.field9076, var2.field9074), var3.method4887(), 0, class769.field11271, var3.method4885());
                     class109.field1331 = arg0;
                  }
               }

               if (arg0 == -1 && class109.field1331 != -1) {
                  class755.field11144.method5206((int[])null, new Point(), -1, arg1 + 109, class769.field11271, -1);
                  class109.field1331 = -1;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field744[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "<init>",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V",
      line = 303
   )
   public class58(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
      try {
         this.field738 = class675.method4925(false);
         this.field734 = arg3;
         this.field733 = arg5;
         this.field730 = arg1;
         this.field740 = arg7;
         this.field731 = arg0;
         this.field732 = arg4;
         this.field729 = arg2;
         this.field728 = arg6;
         this.field743 = class314.field4488;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field744[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field744[1] : field744[0]) + ',' + (arg3 != null ? field744[1] : field744[0]) + ',' + (arg4 != null ? field744[1] : field744[0]) + ',' + (arg5 != null ? field744[1] : field744[0]) + ',' + arg6 + ',' + (arg7 != null ? field744[1] : field744[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(B)I",
      line = 320
   )
   public static final int method489(byte arg0) {
      try {
         if (arg0 != 55) {
            return 106;
         } else {
            ++field736;
            return 16;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field744[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method490(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method491(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
