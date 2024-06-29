import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class567 extends class70 {
   @OriginalMember(
      owner = "client!aw",
      name = "O",
      descriptor = "I"
   )
   private int field8345 = 6;
   @OriginalMember(
      owner = "client!aw",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8352 = new String[]{method4265(method4264("<F[1i")), method4265(method4264("<F[7i")), method4265(method4264("<F[:i")), method4265(method4264("<F[=i")), method4265(method4264("<F[0i")), method4265(method4264("3D\u0019\u0019")), method4265(method4264("&\u001f[[<")), method4265(method4264("<F[6i")), method4265(method4264("<F[2i"))};
   @OriginalMember(
      owner = "client!aw",
      name = "Q",
      descriptor = "I"
   )
   public static int field8341 = 0;
   @OriginalMember(
      owner = "client!aw",
      name = "N",
      descriptor = "I"
   )
   public static int field8349 = 1;
   @OriginalMember(
      owner = "client!aw",
      name = "T",
      descriptor = "I"
   )
   public static int field8340;
   @OriginalMember(
      owner = "client!aw",
      name = "R",
      descriptor = "I"
   )
   public static int field8342;
   @OriginalMember(
      owner = "client!aw",
      name = "S",
      descriptor = "I"
   )
   public static int field8343;
   @OriginalMember(
      owner = "client!aw",
      name = "L",
      descriptor = "I"
   )
   public static int field8344;
   @OriginalMember(
      owner = "client!aw",
      name = "K",
      descriptor = "I"
   )
   public static int field8346;
   @OriginalMember(
      owner = "client!aw",
      name = "J",
      descriptor = "I"
   )
   public static int field8347;
   @OriginalMember(
      owner = "client!aw",
      name = "M",
      descriptor = "I"
   )
   public static int field8348;
   @OriginalMember(
      owner = "client!aw",
      name = "P",
      descriptor = "I"
   )
   public static int field8350;
   @OriginalMember(
      owner = "client!aw",
      name = "I",
      descriptor = "I"
   )
   public static int field8351;

   @OriginalMember(
      owner = "client!aw",
      name = "i",
      descriptor = "(I)I"
   )
   public static final int method4260(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field8343;
         if (arg0 != 23876) {
            method4263((byte)69, 46);
         }

         if (class584.field8627 == null) {
            if (!class652.field9742 && class213.field2705 != null) {
               return class213.field2705.field7911;
            }

            int var2 = class372.field5216.method1570(29658);
            int var3 = class372.field5216.method1566(0);
            if (!class341.field4710) {
               if (var2 <= class664.field9834 || ~var2 <= ~(class664.field9834 + class457.field6293)) {
                  return -1;
               }

               int var4 = -1;
               int var5 = 0;
               int var6;
               int var7;
               if (var1) {
                  if (class476.field6634) {
                     var6 = (-1 - var5 + class455.field6279) * 16 + 33 + class338.field4629;
                     if (~(var6 + -13) > ~var3) {
                        if (var6 + 3 >= var3) {
                           var4 = var5;
                           if (var1) {
                              var7 = (class455.field6279 - 1 + -var5) * 16 + 31 + class338.field4629;
                              if (var3 > var7 + -13 && ~var3 >= ~(var7 + 3)) {
                                 var4 = var5;
                              }

                              ++var5;
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     } else {
                        ++var5;
                     }
                  } else {
                     var7 = (class455.field6279 - 1 + -var5) * 16 + 31 + class338.field4629;
                     if (var3 > var7 + -13 && ~var3 >= ~(var7 + 3)) {
                        var4 = var5;
                     }

                     ++var5;
                  }
               }

               label443:
               while(true) {
                  while(~var5 > ~class455.field6279) {
                     if (class476.field6634) {
                        var6 = (-1 - var5 + class455.field6279) * 16 + 33 + class338.field4629;
                        if (~(var6 + -13) > ~var3) {
                           if (var6 + 3 >= var3) {
                              var4 = var5;
                              if (var1) {
                                 var7 = (class455.field6279 - 1 + -var5) * 16 + 31 + class338.field4629;
                                 if (var3 > var7 + -13 && ~var3 >= ~(var7 + 3)) {
                                    var4 = var5;
                                 }

                                 ++var5;
                              } else {
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     } else {
                        var7 = (class455.field6279 - 1 + -var5) * 16 + 31 + class338.field4629;
                        if (var3 > var7 + -13 && ~var3 >= ~(var7 + 3)) {
                           var4 = var5;
                        }

                        ++var5;
                     }
                  }

                  if (!var1) {
                     if (var4 == -1) {
                        return -1;
                     }

                     int var8 = 0;
                     class283 var9 = new class283(class500.field6967);
                     class541 var10 = (class541)var9.method2313(105);
                     if (var1) {
                        if (~(var8++) == ~var4) {
                           return var10.field7911;
                        }

                        var10 = (class541)var9.method2311((byte)123);
                     }

                     while(true) {
                        while(var10 != null) {
                           if (~(var8++) == ~var4) {
                              return var10.field7911;
                           }

                           var10 = (class541)var9.method2311((byte)123);
                        }

                        if (!var1) {
                           if (!var1) {
                              return -1;
                           }
                           break label443;
                        }

                        var10 = (class541)var9.method2311((byte)123);
                     }
                  }

                  var7 = var4 + -1;
                  if (var3 > var7 + -13 && ~var3 >= ~(var7 + 3)) {
                     var4 = var5;
                  }

                  ++var5;
               }
            }

            if (~class664.field9834 <= ~var2 || ~(class664.field9834 + class457.field6293) >= ~var2) {
               if (class641.field9433 == null || ~class288.field3984 <= ~var2 || ~(class387.field5356 + class288.field3984) >= ~var2) {
                  return -1;
               }

               int var11;
               int var10000;
               label225: {
                  var11 = -1;
                  int var12 = 0;
                  if (var1) {
                     var10000 = class476.field6634;
                  } else if (~var12 <= ~class641.field9433.field5970) {
                     var10000 = ~var11;
                     if (!var1) {
                        break label225;
                     }
                  } else {
                     var10000 = class476.field6634;
                  }

                  while(true) {
                     int var14;
                     if (var10000 == 0) {
                        int var13 = class169.field2203 - (-(var12 * 16) + -31);
                        if (var3 > var13 + -13) {
                           if (~(var13 - -3) <= ~var3) {
                              var11 = var12;
                              if (var1) {
                                 var14 = var12 * 16 + class169.field2203 + 33;
                                 if (~var3 < ~(var14 + -13) && ~(var14 + 3) <= ~var3) {
                                    var11 = var12;
                                 }

                                 ++var12;
                              } else {
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     } else {
                        var14 = var12 * 16 + class169.field2203 + 33;
                        if (~var3 < ~(var14 + -13) && ~(var14 + 3) <= ~var3) {
                           var11 = var12;
                        }

                        ++var12;
                     }

                     if (~var12 <= ~class641.field9433.field5970) {
                        var10000 = ~var11;
                        if (!var1) {
                           break;
                        }
                     } else {
                        var10000 = class476.field6634;
                     }
                  }
               }

               if (var10000 == 0) {
                  return -1;
               }

               int var15 = 0;
               class155 var16 = new class155(class641.field9433.field5971);
               class541 var17 = (class541)var16.method1315(arg0 + -23876);
               if (var1) {
                  if (var15++ == var11) {
                     return var17.field7911;
                  }

                  var17 = (class541)var16.method1314((byte)32);
               }

               while(true) {
                  while(var17 != null) {
                     if (var15++ == var11) {
                        return var17.field7911;
                     }

                     var17 = (class541)var16.method1314((byte)32);
                  }

                  if (!var1) {
                     if (!var1) {
                        return -1;
                     }
                     break;
                  }

                  var17 = (class541)var16.method1314((byte)32);
               }
            }

            int var18 = -1;
            int var19 = 0;
            int var20;
            int var21;
            if (var1) {
               if (!class476.field6634) {
                  var20 = var19 * 16 + 31 + class338.field4629;
                  if (var3 > var20 + -13) {
                     if (~var3 >= ~(var20 + 3)) {
                        var18 = var19;
                        if (var1) {
                           var21 = 33 + (class338.field4629 - -(var19 * 16));
                           if (~var3 < ~(var21 + -13) && ~(var21 + 3) <= ~var3) {
                              var18 = var19;
                           }

                           ++var19;
                        } else {
                           ++var19;
                        }
                     } else {
                        ++var19;
                     }
                  } else {
                     ++var19;
                  }
               } else {
                  var21 = 33 + (class338.field4629 - -(var19 * 16));
                  if (~var3 < ~(var21 + -13) && ~(var21 + 3) <= ~var3) {
                     var18 = var19;
                  }

                  ++var19;
               }
            }

            while(true) {
               while(~class254.field3207 < ~var19) {
                  if (!class476.field6634) {
                     var20 = var19 * 16 + 31 + class338.field4629;
                     if (var3 > var20 + -13) {
                        if (~var3 >= ~(var20 + 3)) {
                           var18 = var19;
                           if (var1) {
                              var21 = 33 + (class338.field4629 - -(var19 * 16));
                              if (~var3 < ~(var21 + -13) && ~(var21 + 3) <= ~var3) {
                                 var18 = var19;
                              }

                              ++var19;
                           } else {
                              ++var19;
                           }
                        } else {
                           ++var19;
                        }
                     } else {
                        ++var19;
                     }
                  } else {
                     var21 = 33 + (class338.field4629 - -(var19 * 16));
                     if (~var3 < ~(var21 + -13) && ~(var21 + 3) <= ~var3) {
                        var18 = var19;
                     }

                     ++var19;
                  }
               }

               if (!var1) {
                  if (var18 == -1) {
                     break;
                  }

                  int var22 = 0;
                  class155 var23 = new class155(class723.field10572);
                  class438 var24 = (class438)var23.method1315(0);
                  if (var1) {
                     if (var22++ == var18) {
                        return ((class541)var24.field5971.field10622.field272).field7911;
                     }

                     var24 = (class438)var23.method1314((byte)63);
                  }

                  while(true) {
                     while(var24 != null) {
                        if (var22++ == var18) {
                           return ((class541)var24.field5971.field10622.field272).field7911;
                        }

                        var24 = (class438)var23.method1314((byte)63);
                     }

                     if (!var1) {
                        if (var1) {
                           return class213.field2705.field7911;
                        }

                        return -1;
                     }

                     var24 = (class438)var23.method1314((byte)63);
                  }
               }

               var21 = var18 + -1;
               if (~var3 < ~(var21 + -13) && ~(var21 + 3) <= ~var3) {
                  var18 = var19;
               }

               ++var19;
            }
         }

         return -1;
      } catch (RuntimeException var26) {
         throw class93.method866(var26, field8352[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "<init>",
      descriptor = "()V"
   )
   public class567() {
      super(2, false);
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(II[Loca;)V"
   )
   public static final void method4261(int param0, int param1, class642[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(Lkw;ZI)V"
   )
   public static final void method4262(class9 arg0, boolean arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field8350;
         class516 var4 = arg0.method71(-12710);
         if (~arg0.field208 == -1) {
            class198.field2526 = -1;
            class363.field5047 = 0;
            arg0.field206 = 0;
         } else {
            if (arg0.field193 != -1 && arg0.field139 == 0) {
               class238 var5 = class532.field7812.method2473((byte)86, arg0.field193);
               if (arg0.field211 > 0 && var5.field3027 == 0) {
                  class198.field2526 = -1;
                  ++arg0.field206;
                  class363.field5047 = 0;
                  return;
               }

               if (~arg0.field211 >= -1 && var5.field3008 == 0) {
                  class198.field2526 = -1;
                  class363.field5047 = 0;
                  ++arg0.field206;
                  return;
               }
            }

            int var6 = 0;
            class775 var7;
            class238 var8;
            if (var3) {
               if (~arg0.field182[var6].field4576 != 0 && ~class413.field5678 <= ~arg0.field182[var6].field4575) {
                  var7 = class49.field688.method3862((byte)74, arg0.field182[var6].field4576);
                  if (var7.field11293 && var7.field11295 != -1) {
                     var8 = class532.field7812.method2473((byte)86, var7.field11295);
                     if (~arg0.field211 < -1 && ~var8.field3027 == -1) {
                        class363.field5047 = 0;
                        class198.field2526 = -1;
                        ++arg0.field206;
                        return;
                     }

                     if (arg0.field211 <= 0 && ~var8.field3008 == -1) {
                        ++arg0.field206;
                        class198.field2526 = -1;
                        class363.field5047 = 0;
                        return;
                     }
                  }
               }

               ++var6;
            }

            while(true) {
               int var10000;
               int var10001;
               if (~var6 <= ~arg0.field182.length) {
                  int var9 = arg0.field10467;
                  int var10 = arg0.field10468;
                  int var11 = arg0.field210[arg0.field208 + -1] * 512 - -(256 * arg0.method78(0));
                  int var12 = arg0.field205[arg0.field208 + -1] * 512 + 256 * arg0.method78(0);
                  var10000 = var11;
                  var10001 = var9;
                  if (!var3) {
                     label413: {
                        if (var11 <= var9) {
                           if (var9 <= var11) {
                              if (~var10 > ~var12) {
                                 arg0.method82(0, 8192);
                                 if (!var3) {
                                    break label413;
                                 }
                              }

                              if (var10 <= var12) {
                                 break label413;
                              }

                              arg0.method82(arg2, 0);
                              if (!var3) {
                                 break label413;
                              }
                           }

                           if (var10 >= var12) {
                              if (~var10 < ~var12) {
                                 arg0.method82(0, 2048);
                                 if (!var3) {
                                    break label413;
                                 }
                              }

                              arg0.method82(0, 4096);
                              if (!var3) {
                                 break label413;
                              }
                           }

                           arg0.method82(0, 6144);
                           if (!var3) {
                              break label413;
                           }
                        }

                        if (var10 < var12) {
                           arg0.method82(0, 10240);
                           if (!var3) {
                              break label413;
                           }
                        }

                        if (~var10 < ~var12) {
                           arg0.method82(0, 14336);
                           if (!var3) {
                              break label413;
                           }
                        }

                        arg0.method82(0, 12288);
                     }

                     byte var13 = arg0.field204[arg0.field208 + -1];
                     if (!arg1 && (-var9 + var11 > 1024 || -var9 + var11 < -1024 || ~(-var10 + var12) < -1025 || -var10 + var12 < -1024)) {
                        arg0.field10467 = var11;
                        arg0.field10468 = var12;
                        arg0.method79(false, 116, arg0.field107);
                        if (~arg0.field211 < -1) {
                           --arg0.field211;
                        }

                        --arg0.field208;
                        class198.field2526 = -1;
                        class363.field5047 = 0;
                        return;
                     }

                     int var14 = 16;
                     boolean var15 = true;
                     if (arg0 instanceof class81) {
                        var15 = ((class81)arg0).field1135.field6535;
                     }

                     label417: {
                        if (var15) {
                           int var16 = -arg0.field129.field5543 + arg0.field107;
                           if (var16 != 0 && arg0.field110 == -1 && arg0.field162 != 0) {
                              var14 = 8;
                           }

                           if (!arg1 && ~arg0.field208 < -3) {
                              var14 = 24;
                           }

                           if (arg1 || arg0.field208 <= 3) {
                              break label417;
                           }

                           var14 = 32;
                           if (!var3) {
                              break label417;
                           }
                        }

                        if (!arg1 && ~arg0.field208 < -2) {
                           var14 = 24;
                        }

                        if (!arg1 && arg0.field208 > 2) {
                           var14 = 32;
                        }
                     }

                     if (~arg0.field206 < -1 && ~arg0.field208 < -2) {
                        var14 = 32;
                        --arg0.field206;
                     }

                     label308: {
                        if (var13 != 2) {
                           if (~var13 != -1) {
                              break label308;
                           }

                           var14 >>= 1;
                           if (!var3) {
                              break label308;
                           }
                        }

                        var14 <<= 1;
                     }

                     class363.field5047 = arg2;
                     if (var4.field7205 != -1) {
                        label419: {
                           int var17 = var14 << 9;
                           if (arg0.field208 != 1) {
                              if (var17 > arg0.field207) {
                                 arg0.field207 += var4.field7205;
                                 if (var17 >= arg0.field207) {
                                    break label419;
                                 }

                                 arg0.field207 = var17;
                                 if (!var3) {
                                    break label419;
                                 }
                              }

                              if (arg0.field207 <= 0) {
                                 break label419;
                              }

                              arg0.field207 -= var4.field7205;
                              if (arg0.field207 >= 0) {
                                 break label419;
                              }

                              arg0.field207 = 0;
                              if (!var3) {
                                 break label419;
                              }
                           }

                           int var18 = arg0.field207 * arg0.field207;
                           int var19 = (~var11 > ~arg0.field10467 ? -var11 + arg0.field10467 : -arg0.field10467 + var11) << 9;
                           int var20 = (arg0.field10468 <= var12 ? -arg0.field10468 + var12 : -var12 + arg0.field10468) << 9;
                           int var21 = var19 <= var20 ? var20 : var19;
                           int var22 = var4.field7205 * var21 * 2;
                           if (~var18 >= ~var22) {
                              if (var18 / 2 <= var21) {
                                 if (arg0.field207 >= var17) {
                                    break label419;
                                 }

                                 arg0.field207 += var4.field7205;
                                 if (arg0.field207 <= var17) {
                                    break label419;
                                 }

                                 arg0.field207 = var17;
                                 if (!var3) {
                                    break label419;
                                 }
                              }

                              arg0.field207 -= var4.field7205;
                              if (~arg0.field207 <= -1) {
                                 break label419;
                              }

                              arg0.field207 = 0;
                              if (!var3) {
                                 break label419;
                              }
                           }

                           arg0.field207 /= 2;
                        }

                        var14 = arg0.field207 >> 9;
                        if (var14 < 1) {
                           var14 = 1;
                        }
                     }

                     label433: {
                        if (~var9 != ~var11 || var10 != var12) {
                           label266: {
                              if (var9 < var11) {
                                 arg0.field10467 += var14;
                                 class363.field5047 |= 4;
                                 if (~arg0.field10467 >= ~var11) {
                                    break label266;
                                 }

                                 arg0.field10467 = var11;
                                 if (!var3) {
                                    break label266;
                                 }
                              }

                              if (var9 > var11) {
                                 arg0.field10467 -= var14;
                                 class363.field5047 |= 8;
                                 if (arg0.field10467 < var11) {
                                    arg0.field10467 = var11;
                                 }
                              }
                           }

                           label259: {
                              if (~var14 > -33) {
                                 class198.field2526 = var13;
                                 if (!var3) {
                                    break label259;
                                 }
                              }

                              class198.field2526 = 2;
                           }

                           if (~var12 < ~var10) {
                              class363.field5047 |= 1;
                              arg0.field10468 += var14;
                              if (arg0.field10468 <= var12) {
                                 break label433;
                              }

                              arg0.field10468 = var12;
                              if (!var3) {
                                 break label433;
                              }
                           }

                           if (var12 >= var10) {
                              break label433;
                           }

                           arg0.field10468 -= var14;
                           class363.field5047 |= 2;
                           if (~var12 >= ~arg0.field10468) {
                              break label433;
                           }

                           arg0.field10468 = var12;
                           if (!var3) {
                              break label433;
                           }
                        }

                        class198.field2526 = -1;
                     }

                     if (arg0.field10467 == var11 && arg0.field10468 == var12) {
                        --arg0.field208;
                        if (~arg0.field211 < -1) {
                           --arg0.field211;
                           return;
                        }
                     }

                     return;
                  }
               } else {
                  var10000 = arg0.field182[var6].field4576;
                  var10001 = -1;
               }

               if ((var10000 ^ var10001) != 0 && ~class413.field5678 <= ~arg0.field182[var6].field4575) {
                  var7 = class49.field688.method3862((byte)74, arg0.field182[var6].field4576);
                  if (var7.field11293 && var7.field11295 != -1) {
                     var8 = class532.field7812.method2473((byte)86, var7.field11295);
                     if (~arg0.field211 < -1 && ~var8.field3027 == -1) {
                        class363.field5047 = 0;
                        class198.field2526 = -1;
                        ++arg0.field206;
                        return;
                     }

                     if (arg0.field211 <= 0 && ~var8.field3008 == -1) {
                        ++arg0.field206;
                        class198.field2526 = -1;
                        class363.field5047 = 0;
                        return;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var24) {
         throw class93.method866(var24, field8352[8] + (arg0 != null ? field8352[6] : field8352[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field8346;
         int[] var4 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            method4261(-37, 92, (class642[])null);
         }

         if (super.field940.field270) {
            int[] var5;
            int[] var6;
            label523: {
               int var26;
               int var27;
               int var28;
               label524: {
                  int var20;
                  int var21;
                  int var22;
                  label525: {
                     int var16;
                     int var17;
                     label526: {
                        int var13;
                        label527: {
                           int var10;
                           label528: {
                              var5 = this.method690(112, 0, arg1);
                              var6 = this.method690(-128, 1, arg1);
                              int var7 = this.field8345;
                              if (var7 != 1) {
                                 if (var7 == 2) {
                                    break label528;
                                 }

                                 if (var7 == 3) {
                                    var10 = 0;
                                    if (var3) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    while(true) {
                                       while(class262.field3328 > var10) {
                                          var4[var10] = var5[var10] * var6[var10] >> 12;
                                          ++var10;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return var4;
                                          }
                                          break label527;
                                       }

                                       ++var10;
                                    }
                                 }

                                 if (var7 == 4) {
                                    break label527;
                                 }

                                 if (~var7 == -6) {
                                    var13 = 0;
                                    if (var3) {
                                       var4[var13] = 4096 - ((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12);
                                       ++var13;
                                    }

                                    while(true) {
                                       while(~class262.field3328 < ~var13) {
                                          var4[var13] = 4096 - ((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12);
                                          ++var13;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return var4;
                                          }
                                          break label526;
                                       }

                                       ++var13;
                                    }
                                 }

                                 if (var7 == 6) {
                                    break label526;
                                 }

                                 if (~var7 == -8) {
                                    var16 = 0;
                                    if (var3 || ~var16 > ~class262.field3328) {
                                       do {
                                          var17 = var5[var16];
                                          var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                          ++var16;
                                       } while(~var16 > ~class262.field3328);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label525;
                                 }

                                 if (var7 == 8) {
                                    break label525;
                                 }

                                 if (~var7 == -10) {
                                    var20 = 0;
                                    if (var3 || var20 < class262.field3328) {
                                       do {
                                          var21 = var6[var20];
                                          var22 = var5[var20];
                                          var4[var20] = var22 < var21 ? var22 : var21;
                                          ++var20;
                                       } while(var20 < class262.field3328);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label524;
                                 }

                                 if (~var7 == -11) {
                                    break label524;
                                 }

                                 if (var7 == 11) {
                                    var26 = 0;
                                    if (var3 || var26 < class262.field3328) {
                                       do {
                                          var27 = var5[var26];
                                          var28 = var6[var26];
                                          var4[var26] = ~var28 <= ~var27 ? -var27 + var28 : -var28 + var27;
                                          ++var26;
                                       } while(var26 < class262.field3328);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label523;
                                 }

                                 if (~var7 != -13) {
                                    return var4;
                                 }

                                 if (!var3) {
                                    break label523;
                                 }
                              }

                              int var8 = 0;
                              if (var3) {
                                 var4[var8] = var5[var8] + var6[var8];
                                 ++var8;
                              }

                              while(true) {
                                 while(var8 < class262.field3328) {
                                    var4[var8] = var5[var8] + var6[var8];
                                    ++var8;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break;
                                 }

                                 ++var8;
                              }
                           }

                           int var9 = 0;
                           if (var3) {
                              var4[var9] = var5[var9] + -var6[var9];
                              ++var9;
                           }

                           label448:
                           while(true) {
                              while(~var9 > ~class262.field3328) {
                                 var4[var9] = var5[var9] + -var6[var9];
                                 ++var9;
                              }

                              if (!var3) {
                                 if (!var3) {
                                    return var4;
                                 }

                                 var10 = 0;
                                 if (var3) {
                                    var4[var10] = var5[var10] * var6[var10] >> 12;
                                    ++var10;
                                 }

                                 while(true) {
                                    while(class262.field3328 > var10) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    if (!var3) {
                                       if (!var3) {
                                          return var4;
                                       }
                                       break label448;
                                    }

                                    ++var10;
                                 }
                              }

                              ++var9;
                           }
                        }

                        int var11 = 0;
                        int var12;
                        if (var3) {
                           var12 = var6[var11];
                           var4[var11] = ~var12 == -1 ? 4096 : (var5[var11] << 12) / var12;
                           ++var11;
                        }

                        label463:
                        while(true) {
                           if (var11 >= class262.field3328) {
                              if (!var3) {
                                 return var4;
                              }

                              var13 = 0;
                              if (var3) {
                                 var4[var13] = 4096 - ((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12);
                                 ++var13;
                              }

                              while(true) {
                                 while(~class262.field3328 < ~var13) {
                                    var4[var13] = 4096 - ((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12);
                                    ++var13;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break label463;
                                 }

                                 ++var13;
                              }
                           }

                           var12 = var6[var11];
                           var4[var11] = ~var12 == -1 ? 4096 : (var5[var11] << 12) / var12;
                           ++var11;
                        }
                     }

                     int var14 = 0;
                     int var15;
                     if (var3) {
                        var15 = var6[var14];
                        var4[var14] = var15 >= 2048 ? -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096 : var5[var14] * var15 >> 11;
                        ++var14;
                     }

                     while(true) {
                        if (var14 >= class262.field3328) {
                           if (!var3) {
                              return var4;
                           }

                           var16 = 0;
                           if (var3 || ~var16 > ~class262.field3328) {
                              do {
                                 var17 = var5[var16];
                                 var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                 ++var16;
                              } while(~var16 > ~class262.field3328);
                           }

                           if (!var3) {
                              return var4;
                           }
                           break;
                        }

                        var15 = var6[var14];
                        var4[var14] = var15 >= 2048 ? -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096 : var5[var14] * var15 >> 11;
                        ++var14;
                     }
                  }

                  int var18 = 0;
                  int var19;
                  if (var3) {
                     var19 = var5[var18];
                     var4[var18] = var19 != 0 ? -((-var6[var18] + 4096 << 12) / var19) + 4096 : 0;
                     ++var18;
                  }

                  while(true) {
                     if (class262.field3328 <= var18) {
                        if (!var3) {
                           return var4;
                        }

                        var20 = 0;
                        if (var3 || var20 < class262.field3328) {
                           do {
                              var21 = var6[var20];
                              var22 = var5[var20];
                              var4[var20] = var22 < var21 ? var22 : var21;
                              ++var20;
                           } while(var20 < class262.field3328);
                        }

                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     var19 = var5[var18];
                     var4[var18] = var19 != 0 ? -((-var6[var18] + 4096 << 12) / var19) + 4096 : 0;
                     ++var18;
                  }
               }

               int var23 = 0;
               int var24;
               int var25;
               if (var3) {
                  var24 = var5[var23];
                  var25 = var6[var23];
                  var4[var23] = ~var24 >= ~var25 ? var25 : var24;
                  ++var23;
               }

               while(true) {
                  if (~var23 <= ~class262.field3328) {
                     if (!var3) {
                        return var4;
                     }

                     var26 = 0;
                     if (var3 || var26 < class262.field3328) {
                        do {
                           var27 = var5[var26];
                           var28 = var6[var26];
                           var4[var26] = ~var28 <= ~var27 ? -var27 + var28 : -var28 + var27;
                           ++var26;
                        } while(var26 < class262.field3328);
                     }

                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  var24 = var5[var23];
                  var25 = var6[var23];
                  var4[var23] = ~var24 >= ~var25 ? var25 : var24;
                  ++var23;
               }
            }

            int var29 = 0;
            if (var3 || ~class262.field3328 < ~var29) {
               do {
                  int var30 = var6[var29];
                  int var31 = var5[var29];
                  var4[var29] = var31 - ((var30 * var31 >> 11) + -var30);
                  ++var29;
               } while(~class262.field3328 < ~var29);
            }
         }

         return var4;
      } catch (RuntimeException var33) {
         throw class93.method866(var33, field8352[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != -6752) {
            field8349 = 3;
         }

         ++field8340;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (super.field926.field5048) {
            int[] var7;
            int[] var8;
            int[] var9;
            int[] var10;
            int[] var11;
            int[] var12;
            int[] var13;
            int[] var14;
            int[] var15;
            label728: {
               int var51;
               int var52;
               int var53;
               int var54;
               int var55;
               int var56;
               int var57;
               label729: {
                  int var37;
                  int var38;
                  int var39;
                  int var40;
                  int var41;
                  int var42;
                  int var43;
                  label730: {
                     int var29;
                     int var30;
                     int var31;
                     int var32;
                     label731: {
                        int var24;
                        label732: {
                           int var19;
                           label733: {
                              int[][] var5 = this.method696(arg1, 0, 32767);
                              int[][] var6 = this.method696(arg1, 1, 32767);
                              var7 = var4[0];
                              var8 = var4[1];
                              var9 = var4[2];
                              var10 = var5[0];
                              var11 = var5[1];
                              var12 = var5[2];
                              var13 = var6[0];
                              var14 = var6[1];
                              var15 = var6[2];
                              int var16 = this.field8345;
                              if (var16 != 1) {
                                 if (~var16 == -3) {
                                    break label733;
                                 }

                                 if (var16 == 3) {
                                    var19 = 0;
                                    if (var3) {
                                       var7[var19] = var10[var19] * var13[var19] >> 12;
                                       var8[var19] = var11[var19] * var14[var19] >> 12;
                                       var9[var19] = var12[var19] * var15[var19] >> 12;
                                       ++var19;
                                    }

                                    while(true) {
                                       while(class262.field3328 > var19) {
                                          var7[var19] = var10[var19] * var13[var19] >> 12;
                                          var8[var19] = var11[var19] * var14[var19] >> 12;
                                          var9[var19] = var12[var19] * var15[var19] >> 12;
                                          ++var19;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return var4;
                                          }
                                          break label732;
                                       }

                                       ++var19;
                                    }
                                 }

                                 if (var16 == 4) {
                                    break label732;
                                 }

                                 if (var16 == 5) {
                                    var24 = 0;
                                    if (var3) {
                                       var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                       var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                       var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                       ++var24;
                                    }

                                    while(true) {
                                       while(class262.field3328 > var24) {
                                          var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                          var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                          var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                          ++var24;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return var4;
                                          }
                                          break label731;
                                       }

                                       ++var24;
                                    }
                                 }

                                 if (var16 == 6) {
                                    break label731;
                                 }

                                 if (var16 == 7) {
                                    var29 = 0;
                                    if (var3 || ~class262.field3328 < ~var29) {
                                       do {
                                          var30 = var12[var29];
                                          var31 = var10[var29];
                                          var32 = var11[var29];
                                          var7[var29] = var31 != 4096 ? (var13[var29] << 12) / (-var31 + 4096) : 4096;
                                          var8[var29] = var32 != 4096 ? (var14[var29] << 12) / (-var32 + 4096) : 4096;
                                          var9[var29] = ~var30 != -4097 ? (var15[var29] << 12) / (-var30 + 4096) : 4096;
                                          ++var29;
                                       } while(~class262.field3328 < ~var29);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label730;
                                 }

                                 if (~var16 == -9) {
                                    break label730;
                                 }

                                 if (var16 == 9) {
                                    var37 = 0;
                                    if (var3 || class262.field3328 > var37) {
                                       do {
                                          var38 = var11[var37];
                                          var39 = var10[var37];
                                          var40 = var13[var37];
                                          var41 = var14[var37];
                                          var42 = var12[var37];
                                          var43 = var15[var37];
                                          var7[var37] = var40 > var39 ? var39 : var40;
                                          var8[var37] = ~var38 <= ~var41 ? var41 : var38;
                                          var9[var37] = ~var43 >= ~var42 ? var43 : var42;
                                          ++var37;
                                       } while(class262.field3328 > var37);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label729;
                                 }

                                 if (var16 == 10) {
                                    break label729;
                                 }

                                 if (~var16 == -12) {
                                    var51 = 0;
                                    if (var3 || class262.field3328 > var51) {
                                       do {
                                          var52 = var10[var51];
                                          var53 = var12[var51];
                                          var54 = var14[var51];
                                          var55 = var15[var51];
                                          var56 = var13[var51];
                                          var57 = var11[var51];
                                          var7[var51] = var56 < var52 ? -var56 + var52 : -var52 + var56;
                                          var8[var51] = var54 < var57 ? -var54 + var57 : var54 - var57;
                                          var9[var51] = var53 <= var55 ? var55 - var53 : -var55 + var53;
                                          ++var51;
                                       } while(class262.field3328 > var51);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label728;
                                 }

                                 if (var16 != 12) {
                                    return var4;
                                 }

                                 if (!var3) {
                                    break label728;
                                 }
                              }

                              int var17 = 0;
                              if (var3) {
                                 var7[var17] = var10[var17] + var13[var17];
                                 var8[var17] = var11[var17] + var14[var17];
                                 var9[var17] = var12[var17] + var15[var17];
                                 ++var17;
                              }

                              while(true) {
                                 while(~class262.field3328 < ~var17) {
                                    var7[var17] = var10[var17] + var13[var17];
                                    var8[var17] = var11[var17] + var14[var17];
                                    var9[var17] = var12[var17] + var15[var17];
                                    ++var17;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break;
                                 }

                                 ++var17;
                              }
                           }

                           int var18 = 0;
                           if (var3) {
                              var7[var18] = var10[var18] + -var13[var18];
                              var8[var18] = var11[var18] + -var14[var18];
                              var9[var18] = var12[var18] + -var15[var18];
                              ++var18;
                           }

                           label566:
                           while(true) {
                              while(class262.field3328 > var18) {
                                 var7[var18] = var10[var18] + -var13[var18];
                                 var8[var18] = var11[var18] + -var14[var18];
                                 var9[var18] = var12[var18] + -var15[var18];
                                 ++var18;
                              }

                              if (!var3) {
                                 if (!var3) {
                                    return var4;
                                 }

                                 var19 = 0;
                                 if (var3) {
                                    var7[var19] = var10[var19] * var13[var19] >> 12;
                                    var8[var19] = var11[var19] * var14[var19] >> 12;
                                    var9[var19] = var12[var19] * var15[var19] >> 12;
                                    ++var19;
                                 }

                                 while(true) {
                                    while(class262.field3328 > var19) {
                                       var7[var19] = var10[var19] * var13[var19] >> 12;
                                       var8[var19] = var11[var19] * var14[var19] >> 12;
                                       var9[var19] = var12[var19] * var15[var19] >> 12;
                                       ++var19;
                                    }

                                    if (!var3) {
                                       if (!var3) {
                                          return var4;
                                       }
                                       break label566;
                                    }

                                    ++var19;
                                 }
                              }

                              ++var18;
                           }
                        }

                        int var20 = 0;
                        int var21;
                        int var22;
                        int var23;
                        if (var3) {
                           var21 = var13[var20];
                           var22 = var15[var20];
                           var23 = var14[var20];
                           var7[var20] = var21 == 0 ? 4096 : (var10[var20] << 12) / var21;
                           var8[var20] = ~var23 != -1 ? (var11[var20] << 12) / var23 : 4096;
                           var9[var20] = ~var22 != -1 ? (var12[var20] << 12) / var22 : 4096;
                           ++var20;
                        }

                        label597:
                        while(true) {
                           if (~var20 <= ~class262.field3328) {
                              if (!var3) {
                                 return var4;
                              }

                              var24 = 0;
                              if (var3) {
                                 var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                 var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                 var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                 ++var24;
                              }

                              while(true) {
                                 while(class262.field3328 > var24) {
                                    var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                    var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                    var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                    ++var24;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break label597;
                                 }

                                 ++var24;
                              }
                           }

                           var21 = var13[var20];
                           var22 = var15[var20];
                           var23 = var14[var20];
                           var7[var20] = var21 == 0 ? 4096 : (var10[var20] << 12) / var21;
                           var8[var20] = ~var23 != -1 ? (var11[var20] << 12) / var23 : 4096;
                           var9[var20] = ~var22 != -1 ? (var12[var20] << 12) / var22 : 4096;
                           ++var20;
                        }
                     }

                     int var25 = 0;
                     if (!var3 && ~class262.field3328 >= ~var25) {
                        if (!var3) {
                           return var4;
                        }

                        var29 = 0;
                        if (var3 || ~class262.field3328 < ~var29) {
                           do {
                              var30 = var12[var29];
                              var31 = var10[var29];
                              var32 = var11[var29];
                              var7[var29] = var31 != 4096 ? (var13[var29] << 12) / (-var31 + 4096) : 4096;
                              var8[var29] = var32 != 4096 ? (var14[var29] << 12) / (-var32 + 4096) : 4096;
                              var9[var29] = ~var30 != -4097 ? (var15[var29] << 12) / (-var30 + 4096) : 4096;
                              ++var29;
                           } while(~class262.field3328 < ~var29);
                        }

                        if (!var3) {
                           return var4;
                        }
                     } else {
                        while(true) {
                           int var26 = var14[var25];
                           int var27 = var13[var25];
                           int var28 = var15[var25];
                           var7[var25] = var27 < 2048 ? var10[var25] * var27 >> 11 : -((-var10[var25] + 4096) * (-var27 + 4096) >> 11) + 4096;
                           var8[var25] = ~var26 <= -2049 ? -((4096 - var11[var25]) * (-var26 + 4096) >> 11) + 4096 : var11[var25] * var26 >> 11;
                           var9[var25] = ~var28 > -2049 ? var12[var25] * var28 >> 11 : 4096 - ((4096 - var12[var25]) * (4096 - var28) >> 11);
                           ++var25;
                           if (~class262.field3328 >= ~var25) {
                              if (!var3) {
                                 return var4;
                              }

                              var29 = 0;
                              if (var3 || ~class262.field3328 < ~var29) {
                                 do {
                                    var30 = var12[var29];
                                    var31 = var10[var29];
                                    var32 = var11[var29];
                                    var7[var29] = var31 != 4096 ? (var13[var29] << 12) / (-var31 + 4096) : 4096;
                                    var8[var29] = var32 != 4096 ? (var14[var29] << 12) / (-var32 + 4096) : 4096;
                                    var9[var29] = ~var30 != -4097 ? (var15[var29] << 12) / (-var30 + 4096) : 4096;
                                    ++var29;
                                 } while(~class262.field3328 < ~var29);
                              }

                              if (!var3) {
                                 return var4;
                              }
                              break;
                           }
                        }
                     }
                  }

                  int var33 = 0;
                  int var34;
                  int var35;
                  int var36;
                  if (var3) {
                     var34 = var11[var33];
                     var35 = var10[var33];
                     var36 = var12[var33];
                     var7[var33] = var35 != 0 ? 4096 - (4096 - var13[var33] << 12) / var35 : 0;
                     var8[var33] = ~var34 != -1 ? -((-var14[var33] + 4096 << 12) / var34) + 4096 : 0;
                     var9[var33] = ~var36 != -1 ? -((-var15[var33] + 4096 << 12) / var36) + 4096 : 0;
                     ++var33;
                  }

                  while(true) {
                     if (var33 >= class262.field3328) {
                        if (!var3) {
                           return var4;
                        }

                        var37 = 0;
                        if (var3 || class262.field3328 > var37) {
                           do {
                              var38 = var11[var37];
                              var39 = var10[var37];
                              var40 = var13[var37];
                              var41 = var14[var37];
                              var42 = var12[var37];
                              var43 = var15[var37];
                              var7[var37] = var40 > var39 ? var39 : var40;
                              var8[var37] = ~var38 <= ~var41 ? var41 : var38;
                              var9[var37] = ~var43 >= ~var42 ? var43 : var42;
                              ++var37;
                           } while(class262.field3328 > var37);
                        }

                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     var34 = var11[var33];
                     var35 = var10[var33];
                     var36 = var12[var33];
                     var7[var33] = var35 != 0 ? 4096 - (4096 - var13[var33] << 12) / var35 : 0;
                     var8[var33] = ~var34 != -1 ? -((-var14[var33] + 4096 << 12) / var34) + 4096 : 0;
                     var9[var33] = ~var36 != -1 ? -((-var15[var33] + 4096 << 12) / var36) + 4096 : 0;
                     ++var33;
                  }
               }

               int var44 = 0;
               int var45;
               int var46;
               int var47;
               int var48;
               int var49;
               int var50;
               if (var3) {
                  var45 = var11[var44];
                  var46 = var12[var44];
                  var47 = var14[var44];
                  var48 = var10[var44];
                  var49 = var13[var44];
                  var50 = var15[var44];
                  var7[var44] = var48 <= var49 ? var49 : var48;
                  var8[var44] = ~var47 > ~var45 ? var45 : var47;
                  var9[var44] = ~var46 < ~var50 ? var46 : var50;
                  ++var44;
               }

               while(true) {
                  if (var44 >= class262.field3328) {
                     if (!var3) {
                        return var4;
                     }

                     var51 = 0;
                     if (var3 || class262.field3328 > var51) {
                        do {
                           var52 = var10[var51];
                           var53 = var12[var51];
                           var54 = var14[var51];
                           var55 = var15[var51];
                           var56 = var13[var51];
                           var57 = var11[var51];
                           var7[var51] = var56 < var52 ? -var56 + var52 : -var52 + var56;
                           var8[var51] = var54 < var57 ? -var54 + var57 : var54 - var57;
                           var9[var51] = var53 <= var55 ? var55 - var53 : -var55 + var53;
                           ++var51;
                        } while(class262.field3328 > var51);
                     }

                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  var45 = var11[var44];
                  var46 = var12[var44];
                  var47 = var14[var44];
                  var48 = var10[var44];
                  var49 = var13[var44];
                  var50 = var15[var44];
                  var7[var44] = var48 <= var49 ? var49 : var48;
                  var8[var44] = ~var47 > ~var45 ? var45 : var47;
                  var9[var44] = ~var46 < ~var50 ? var46 : var50;
                  ++var44;
               }
            }

            int var58 = 0;
            if (var3 || var58 < class262.field3328) {
               do {
                  int var59 = var14[var58];
                  int var60 = var13[var58];
                  int var61 = var12[var58];
                  int var62 = var10[var58];
                  int var63 = var11[var58];
                  int var64 = var15[var58];
                  var7[var58] = var60 + var62 + -(var60 * var62 >> 11);
                  var8[var58] = var63 - -var59 + -(var59 * var63 >> 11);
                  var9[var58] = -(var61 * var64 >> 11) + var61 + var64;
                  ++var58;
               } while(var58 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var66) {
         throw class93.method866(var66, field8352[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg0 <= -34) {
            label48: {
               label41: {
                  if (~arg2 != -1) {
                     if (arg2 != 1) {
                        break label48;
                     }

                     if (!var4) {
                        break label41;
                     }
                  }

                  this.field8345 = arg1.method640(255);
                  if (!var4) {
                     break label48;
                  }
               }

               super.field930 = arg1.method640(255) == 1;
            }

            ++field8348;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8352[7] + arg0 + ',' + (arg1 != null ? field8352[6] : field8352[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(BI)I"
   )
   public static final int method4263(byte arg0, int arg1) {
      try {
         if (arg0 != 40) {
            field8349 = 90;
         }

         ++field8351;
         int var2 = arg1 & 63;
         int var3 = (arg1 & 207) >> 6;
         if (var2 != 18) {
            if (var2 == 19 || var2 == 21) {
               if (var3 == 0) {
                  return 16;
               }

               if (var3 == 1) {
                  return 32;
               }

               if (~var3 == -3) {
                  return 64;
               }

               if (var3 == 3) {
                  return 128;
               }
            }
         } else {
            if (var3 == 0) {
               return 1;
            }

            if (~var3 == -2) {
               return 2;
            }

            if (~var3 == -3) {
               return 4;
            }

            if (var3 == 3) {
               return 8;
            }
         }

         return 0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8352[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4264(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4265(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
