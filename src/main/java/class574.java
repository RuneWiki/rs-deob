import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class574 {
   @OriginalMember(
      owner = "client!gh",
      name = "c",
      descriptor = "Z"
   )
   public boolean field8543 = false;
   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8551 = new String[]{method4255(method4254("i$p|p")), method4255(method4254("i$pwp")), method4255(method4254("i$p}p")), method4255(method4254("`92Y")), method4255(method4254("ubp\u001b%")), method4255(method4254("i$ptp")), method4255(method4254("i$pvp")), method4255(method4254("{!")), method4255(method4254("{ ")), method4255(method4254("i$psp")), method4255(method4254("i$pqp")), method4255(method4254("i$ppp")), method4255(method4254("i$prp"))};
   @OriginalMember(
      owner = "client!gh",
      name = "j",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8547 = new String[]{method4255(method4254("k\"")), method4255(method4254("j)")), method4255(method4254("h>")), method4255(method4254("~8")), method4255(method4254("` "))};
   @OriginalMember(
      owner = "client!gh",
      name = "l",
      descriptor = "I"
   )
   public static int field8549 = 1;
   @OriginalMember(
      owner = "client!gh",
      name = "b",
      descriptor = "I"
   )
   public static int field8538;
   @OriginalMember(
      owner = "client!gh",
      name = "k",
      descriptor = "I"
   )
   public int field8539;
   @OriginalMember(
      owner = "client!gh",
      name = "m",
      descriptor = "I"
   )
   public static int field8540;
   @OriginalMember(
      owner = "client!gh",
      name = "g",
      descriptor = "I"
   )
   public int field8541;
   @OriginalMember(
      owner = "client!gh",
      name = "n",
      descriptor = "I"
   )
   public static int field8542;
   @OriginalMember(
      owner = "client!gh",
      name = "h",
      descriptor = "I"
   )
   public static int field8544;
   @OriginalMember(
      owner = "client!gh",
      name = "d",
      descriptor = "I"
   )
   public static int field8545;
   @OriginalMember(
      owner = "client!gh",
      name = "e",
      descriptor = "I"
   )
   public static int field8546;
   @OriginalMember(
      owner = "client!gh",
      name = "f",
      descriptor = "I"
   )
   public static int field8548;
   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "I"
   )
   public static int field8550;
   @OriginalMember(
      owner = "client!gh",
      name = "i",
      descriptor = "Lts;"
   )
   public class561 field8537;

   @OriginalMember(
      owner = "client!gh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4245(int arg0) {
      try {
         if (arg0 >= -100) {
            field8549 = -18;
         }

         field8547 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8551[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4246(boolean arg0) {
      int var1 = client.field4530;

      try {
         ++field8545;
         class643.field9369 = 0;
         int var2 = class401.field6163.method1038((byte)-102);
         int var3 = class401.field6163.method1054(-8779);
         int var4 = class401.field6163.method1076((byte)-85) != 1 ? 0 : 1;
         int var5 = class401.field6163.method1076((byte)-102);
         class125.method1027((byte)-72);
         class111.method946(-1263464541, var5);
         int var6 = (-class401.field6163.field1590 + class61.field759) / 16;
         class219.field2790 = new int[var6][4];
         int var7 = 0;
         int var8;
         int var9;
         int var10;
         int var11;
         int var14;
         byte var10000;
         int var10001;
         int var10002;
         if (var1 != 0) {
            var8 = 0;
            if (var1 != 0) {
               class219.field2790[var7][var8] = class401.field6163.method1041(4758);
               ++var8;
            }
         } else {
            if (var7 >= var6) {
               class164.field2057 = new int[var6];
               class433.field6613 = null;
               class706.field10568 = new byte[var6][];
               class483.field7166 = new int[var6];
               class37.field402 = null;
               class467.field7002 = new byte[var6][];
               class357.field5408 = new int[var6];
               class238.field3026 = new byte[var6][];
               var10000 = arg0;
               if (var1 == 0) {
                  if (arg0 != 0) {
                     field8547 = null;
                  }

                  class483.field7165 = new byte[var6][];
                  class336.field4809 = new int[var6];
                  class447.field6796 = new int[var6];
                  var9 = 0;
                  var10 = (-(class323.field4603 >> 4) + var2) / 8;
                  if (var1 != 0) {
                     var14 = var3;
                     var10001 = class178.field2197;
                     var10002 = -51415420;
                  } else if (var10 > ((class323.field4603 >> 4) + var2) / 8) {
                     var14 = var4;
                     var10001 = var2;
                     var10002 = -1;
                     if (var1 == 0) {
                        class153.method1263((boolean)var4, var2, -1, var3, 11);
                        return;
                     }
                  } else {
                     var14 = var3;
                     var10001 = class178.field2197;
                     var10002 = -51415420;
                  }

                  while(true) {
                     var11 = (var14 + -(var10001 >> var10002)) / 8;
                     if (var1 != 0) {
                        class483.field7166[var9] = (var10 << 8) + var11;
                        class336.field4809[var9] = class614.field8980.method3902("m" + var10 + "_" + var11, 112);
                        class447.field6796[var9] = class614.field8980.method3902("l" + var10 + "_" + var11, 120);
                        class164.field2057[var9] = class614.field8980.method3902(field8551[7] + var10 + "_" + var11, 116);
                        class357.field5408[var9] = class614.field8980.method3902(field8551[8] + var10 + "_" + var11, 68);
                        ++var9;
                        ++var11;
                     }

                     while(true) {
                        while(~(((class178.field2197 >> 4) + var3) / 8) <= ~var11) {
                           class483.field7166[var9] = (var10 << 8) + var11;
                           class336.field4809[var9] = class614.field8980.method3902("m" + var10 + "_" + var11, 112);
                           class447.field6796[var9] = class614.field8980.method3902("l" + var10 + "_" + var11, 120);
                           class164.field2057[var9] = class614.field8980.method3902(field8551[7] + var10 + "_" + var11, 116);
                           class357.field5408[var9] = class614.field8980.method3902(field8551[8] + var10 + "_" + var11, 68);
                           ++var9;
                           ++var11;
                        }

                        if (var1 == 0) {
                           ++var10;
                           if (var10 > ((class323.field4603 >> 4) + var2) / 8) {
                              var14 = var4;
                              var10001 = var2;
                              var10002 = -1;
                              if (var1 == 0) {
                                 class153.method1263((boolean)var4, var2, -1, var3, 11);
                                 return;
                              }
                           } else {
                              var14 = var3;
                              var10001 = class178.field2197;
                              var10002 = -51415420;
                           }
                           break;
                        }

                        ++var11;
                     }
                  }
               }
            } else {
               var10000 = 0;
            }

            var8 = var10000;
            if (var1 != 0) {
               class219.field2790[var7][var8] = class401.field6163.method1041(4758);
               ++var8;
            }
         }

         while(true) {
            while(~var8 > -5) {
               class219.field2790[var7][var8] = class401.field6163.method1041(4758);
               ++var8;
            }

            if (var1 == 0) {
               ++var7;
               if (var7 >= var6) {
                  class164.field2057 = new int[var6];
                  class433.field6613 = null;
                  class706.field10568 = new byte[var6][];
                  class483.field7166 = new int[var6];
                  class37.field402 = null;
                  class467.field7002 = new byte[var6][];
                  class357.field5408 = new int[var6];
                  class238.field3026 = new byte[var6][];
                  var10000 = arg0;
                  if (var1 == 0) {
                     if (arg0 != 0) {
                        field8547 = null;
                     }

                     class483.field7165 = new byte[var6][];
                     class336.field4809 = new int[var6];
                     class447.field6796 = new int[var6];
                     var9 = 0;
                     var10 = (-(class323.field4603 >> 4) + var2) / 8;
                     if (var1 != 0) {
                        var14 = var3;
                        var10001 = class178.field2197;
                        var10002 = -51415420;
                     } else if (var10 > ((class323.field4603 >> 4) + var2) / 8) {
                        var14 = var4;
                        var10001 = var2;
                        var10002 = -1;
                        if (var1 == 0) {
                           class153.method1263((boolean)var4, var2, -1, var3, 11);
                           return;
                        }
                     } else {
                        var14 = var3;
                        var10001 = class178.field2197;
                        var10002 = -51415420;
                     }

                     while(true) {
                        var11 = (var14 + -(var10001 >> var10002)) / 8;
                        if (var1 != 0) {
                           class483.field7166[var9] = (var10 << 8) + var11;
                           class336.field4809[var9] = class614.field8980.method3902("m" + var10 + "_" + var11, 112);
                           class447.field6796[var9] = class614.field8980.method3902("l" + var10 + "_" + var11, 120);
                           class164.field2057[var9] = class614.field8980.method3902(field8551[7] + var10 + "_" + var11, 116);
                           class357.field5408[var9] = class614.field8980.method3902(field8551[8] + var10 + "_" + var11, 68);
                           ++var9;
                           ++var11;
                        }

                        while(true) {
                           while(~(((class178.field2197 >> 4) + var3) / 8) <= ~var11) {
                              class483.field7166[var9] = (var10 << 8) + var11;
                              class336.field4809[var9] = class614.field8980.method3902("m" + var10 + "_" + var11, 112);
                              class447.field6796[var9] = class614.field8980.method3902("l" + var10 + "_" + var11, 120);
                              class164.field2057[var9] = class614.field8980.method3902(field8551[7] + var10 + "_" + var11, 116);
                              class357.field5408[var9] = class614.field8980.method3902(field8551[8] + var10 + "_" + var11, 68);
                              ++var9;
                              ++var11;
                           }

                           if (var1 == 0) {
                              ++var10;
                              if (var10 > ((class323.field4603 >> 4) + var2) / 8) {
                                 var14 = var4;
                                 var10001 = var2;
                                 var10002 = -1;
                                 if (var1 == 0) {
                                    class153.method1263((boolean)var4, var2, -1, var3, 11);
                                    return;
                                 }
                              } else {
                                 var14 = var3;
                                 var10001 = class178.field2197;
                                 var10002 = -51415420;
                              }
                              break;
                           }

                           ++var11;
                        }
                     }
                  }
               } else {
                  var10000 = 0;
               }

               var8 = var10000;
               if (var1 != 0) {
                  class219.field2790[var7][var8] = class401.field6163.method1041(4758);
                  ++var8;
               }
            } else {
               ++var8;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field8551[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(Ljj;B)V"
   )
   public final void method4247(class128 arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field8538;

         while(true) {
            int var4 = arg0.method1104(255);
            if (~var4 != -1) {
               this.method4249(var4, -26077, arg0);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            int var5 = 98 / ((58 - arg1) / 41);
            break;
         }

      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8551[11] + (arg0 != null ? field8551[4] : field8551[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(IBJI)V"
   )
   public static final void method4248(int arg0, byte arg1, long arg2, int arg3) {
      try {
         ++field8544;
         int var5 = (521939 & (int)arg2) >> 14;
         int var6 = 3 & (int)arg2 >> 20;
         int var7 = Integer.MAX_VALUE & (int)(arg2 >>> 32);
         if (arg1 >= 50) {
            if (var5 != 10 && var5 != 11 && ~var5 != -23) {
               class105.method899(0, 0, true, var5, arg0, 0, var6, 0, arg3);
            } else {
               class557 var8;
               int var9;
               int var10;
               label33: {
                  var8 = class151.field1896.method5072(30, var7);
                  if (~var6 != -1 && var6 != 2) {
                     var9 = var8.field8350;
                     var10 = var8.field8357;
                     if (client.field4530 == 0) {
                        break label33;
                     }
                  }

                  var10 = var8.field8350;
                  var9 = var8.field8357;
               }

               int var11 = var8.field8337;
               if (var6 != 0) {
                  var11 = (var11 >> -var6 + 4) + (var11 << var6 & 15);
               }

               class105.method899(var9, var11, true, 0, arg0, 0, 0, var10, arg3);
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field8551[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   private final void method4249(int arg0, int arg1, class128 arg2) {
      try {
         if (arg1 == -26077) {
            ++field8546;
            if (~arg0 != -2) {
               if (~arg0 == -3) {
                  this.field8541 = arg2.method1077(-33);
                  return;
               }

               if (arg0 == 3) {
                  this.field8543 = true;
                  return;
               }

               if (arg0 == 4) {
                  this.field8539 = -1;
                  return;
               }
            } else {
               this.field8539 = arg2.method1038((byte)-95);
            }

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8551[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8551[4] : field8551[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4250(int arg0) {
      try {
         if (arg0 != 168200068) {
            return false;
         } else {
            ++field8540;
            return this.field8537.field8392.method3884((byte)-99, this.field8539);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8551[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method4251(byte arg0, class66 arg1) {
      int var2 = client.field4530;

      try {
         ++field8548;
         if (class645.field9385.method4072(false) != 0) {
            class310 var5;
            label132: {
               Canvas var4;
               if (~class261.field3566.field9464.method4225(101) == -1) {
                  class310 var3 = (class310)class645.field9385.method4071((byte)127);
                  if (var2 != 0) {
                     class54.field616.method1688(!var3.field4415 ? null : class693.field10418.field10329, var3.field4407, var3.field4413, var3.field4411, var3.field4410, false, (byte)-57, arg1, false, var3.field4412, class57.field721, arg1);
                     var3.method2720(0);
                     var3 = (class310)class645.field9385.method4059((byte)106);
                  }

                  while(true) {
                     while(var3 != null) {
                        class54.field616.method1688(!var3.field4415 ? null : class693.field10418.field10329, var3.field4407, var3.field4413, var3.field4411, var3.field4410, false, (byte)-57, arg1, false, var3.field4412, class57.field721, arg1);
                        var3.method2720(0);
                        var3 = (class310)class645.field9385.method4059((byte)106);
                     }

                     class491.method3635((byte)-19);
                     if (var2 == 0) {
                        if (var2 == 0) {
                           if (var2 == 0) {
                              if (arg0 > -103) {
                                 field8549 = 77;
                                 return;
                              }

                              return;
                           }

                           var5 = (class310)class645.field9385.method4059((byte)-118);
                           break label132;
                        }

                        if (class490.field7240 == null) {
                           var4 = new Canvas();
                           var4.setSize(36, 32);
                           class490.field7240 = class745.method5429(class204.field2629, 0, class552.field8190, var4, 0, false);
                           class313.field4468 = class490.field7240.method570(class560.method4147(0, false, class712.field10625, class87.field1058), class671.method4881(class521.field7580, class87.field1058, 0), true);
                        }
                        break;
                     }

                     var3 = (class310)class645.field9385.method4059((byte)106);
                  }
               } else if (class490.field7240 == null) {
                  var4 = new Canvas();
                  var4.setSize(36, 32);
                  class490.field7240 = class745.method5429(class204.field2629, 0, class552.field8190, var4, 0, false);
                  class313.field4468 = class490.field7240.method570(class560.method4147(0, false, class712.field10625, class87.field1058), class671.method4881(class521.field7580, class87.field1058, 0), true);
               }

               var5 = (class310)class645.field9385.method4071((byte)127);
               if (var2 != 0) {
                  class54.field616.method1688(!var5.field4415 ? null : class693.field10418.field10329, var5.field4407, var5.field4413, var5.field4411, var5.field4410, false, (byte)-96, class490.field7240, false, var5.field4412, class313.field4468, arg1);
                  var5.method2720(0);
                  var5 = (class310)class645.field9385.method4059((byte)-118);
               }
            }

            while(true) {
               while(var5 != null) {
                  class54.field616.method1688(!var5.field4415 ? null : class693.field10418.field10329, var5.field4407, var5.field4413, var5.field4411, var5.field4410, false, (byte)-96, class490.field7240, false, var5.field4412, class313.field4468, arg1);
                  var5.method2720(0);
                  var5 = (class310)class645.field9385.method4059((byte)-118);
               }

               if (var2 == 0) {
                  if (arg0 > -103) {
                     field8549 = 77;
                     return;
                  }

                  return;
               }

               var5 = (class310)class645.field9385.method4059((byte)-118);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8551[12] + arg0 + ',' + (arg1 != null ? field8551[4] : field8551[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(IIIIBIIIIILha;Lch;)V"
   )
   public static final void method4252(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class66 arg10, class488 arg11) {
      try {
         int var12 = -77 / ((7 - arg4) / 47);
         ++field8550;
         if (arg1 < arg0 && ~arg0 > ~(arg1 + arg8) && arg2 - 13 < arg3 && ~arg3 > ~(arg2 - -3)) {
            arg6 = arg9;
         }

         String var13 = class417.method3193(-32167, arg11);
         class524.field7616.method676(class75.field966, class280.field3894, var13, arg2, arg6, arg1 + 3, 102, 0);
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field8551[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field8551[4] : field8551[3]) + ',' + (arg11 != null ? field8551[4] : field8551[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(Lha;IZB)Lat;"
   )
   public final class396 method4253(class66 arg0, int arg1, boolean arg2, byte arg3) {
      int var5 = client.field4530;

      try {
         ++field8542;
         long var6 = (long)(arg0.field815 << 19 | arg1 << 16 | this.field8539 | (arg2 ? 262144 : 0));
         class396 var8 = (class396)this.field8537.field8394.method5454(var6, 18261);
         if (var8 != null) {
            return var8;
         } else if (!this.field8537.field8392.method3884((byte)-99, this.field8539)) {
            return null;
         } else {
            class671 var9 = class671.method4894(this.field8537.field8392, this.field8539, 0);
            if (arg3 != 16) {
               field8549 = -49;
            }

            if (var9 != null) {
               var9.field10098 = var9.field10103 = var9.field10101 = var9.field10102 = 0;
               if (arg2) {
                  var9.method4889();
               }

               int var10 = 0;
               if (var5 != 0) {
                  var9.method4882();
                  ++var10;
               }

               while(arg1 > var10) {
                  var9.method4882();
                  ++var10;
               }
            }

            class396 var11 = arg0.method577(var9, true);
            if (var11 != null) {
               this.field8537.field8394.method5455(-2049, var11, var6);
            }

            return var11;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field8551[5] + (arg0 != null ? field8551[4] : field8551[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4254(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4255(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
