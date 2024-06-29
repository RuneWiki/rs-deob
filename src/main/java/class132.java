import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class132 extends class194 {
   @OriginalMember(
      owner = "client!ej",
      name = "H",
      descriptor = "[B"
   )
   public byte[] field1683;
   @OriginalMember(
      owner = "client!ej",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1695 = new String[]{method1117(method1116("Hk:uM")), method1117(method1116("Hk:rM")), method1117(method1116("Hk:pM")), method1117(method1116("\r=}Z\u0002\u0010")), method1117(method1116("Ctx[")), method1117(method1116("Hk:vM")), method1117(method1116("V/:\u0019\u0018")), method1117(method1116("Hk:tM")), method1117(method1116("`dy\r")), method1117(method1116("Hk:~M")), method1117(method1116("kqg\r")), method1117(method1116("Hk:sM")), method1117(method1116("Hk:\u000b\fCh`\tM")), method1117(method1116("Hk:\u007fM")), method1117(method1116("Hk:qM"))};
   @OriginalMember(
      owner = "client!ej",
      name = "G",
      descriptor = "Lrfa;"
   )
   public static class211 field1689 = new class211();
   @OriginalMember(
      owner = "client!ej",
      name = "C",
      descriptor = "I"
   )
   public static int field1681;
   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "I"
   )
   public static int field1682;
   @OriginalMember(
      owner = "client!ej",
      name = "D",
      descriptor = "I"
   )
   public int field1684;
   @OriginalMember(
      owner = "client!ej",
      name = "K",
      descriptor = "I"
   )
   public static int field1685;
   @OriginalMember(
      owner = "client!ej",
      name = "L",
      descriptor = "I"
   )
   public int field1686;
   @OriginalMember(
      owner = "client!ej",
      name = "J",
      descriptor = "I"
   )
   public static int field1687;
   @OriginalMember(
      owner = "client!ej",
      name = "F",
      descriptor = "I"
   )
   public static int field1688;
   @OriginalMember(
      owner = "client!ej",
      name = "E",
      descriptor = "I"
   )
   public int field1690;
   @OriginalMember(
      owner = "client!ej",
      name = "I",
      descriptor = "I"
   )
   public static int field1691;
   @OriginalMember(
      owner = "client!ej",
      name = "M",
      descriptor = "I"
   )
   public static int field1692;
   @OriginalMember(
      owner = "client!ej",
      name = "A",
      descriptor = "I"
   )
   public int field1693;
   @OriginalMember(
      owner = "client!ej",
      name = "B",
      descriptor = "I"
   )
   public static int field1694;

   @OriginalMember(
      owner = "client!ej",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method1107(byte arg0) {
      boolean var1 = client.field4273;

      try {
         class770.field11094.method1466(arg0 + 4104);
         ++field1692;
         int var2 = 0;
         if (var1) {
            class480.field6637[var2] = 0L;
            ++var2;
         }

         while(true) {
            while(~var2 > -33) {
               class480.field6637[var2] = 0L;
               ++var2;
            }

            int var3 = 0;
            if (!var1) {
               if (var1) {
                  class125.field1562[var3] = 0L;
                  ++var3;
               }

               while(true) {
                  while(var3 < 32) {
                     class125.field1562[var3] = 0L;
                     ++var3;
                  }

                  if (!var1) {
                     if (arg0 != -8) {
                        field1689 = null;
                     }

                     class342.field4899 = 0;
                     return;
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1695[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1108(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field1694;
         if (arg0 != 93) {
            this.method1115(-102, 116, -68, 110, 62, -20, -20);
         }

         int var3 = -1;
         int var4 = this.field1683.length + -8;
         if (var2) {
            ++var3;
            this.field1683[var3] = 0;
            ++var3;
            this.field1683[var3] = 0;
            ++var3;
            this.field1683[var3] = 0;
            ++var3;
            this.field1683[var3] = 0;
            ++var3;
            this.field1683[var3] = 0;
            ++var3;
            this.field1683[var3] = 0;
            ++var3;
            this.field1683[var3] = 0;
            ++var3;
            this.field1683[var3] = 0;
         }

         while(true) {
            while(var3 < var4) {
               ++var3;
               this.field1683[var3] = 0;
               ++var3;
               this.field1683[var3] = 0;
               ++var3;
               this.field1683[var3] = 0;
               ++var3;
               this.field1683[var3] = 0;
               ++var3;
               this.field1683[var3] = 0;
               ++var3;
               this.field1683[var3] = 0;
               ++var3;
               this.field1683[var3] = 0;
               ++var3;
               this.field1683[var3] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var3;
                  this.field1683[var3] = 0;
               }

               while(this.field1683.length + -1 > var3) {
                  ++var3;
                  this.field1683[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field1683[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1695[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method1109(byte arg0) {
      try {
         field1689 = null;
         if (arg0 > -87) {
            field1689 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1695[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(Lha;IIBILd;I)V"
   )
   public static final void method1110(class65 arg0, int arg1, int arg2, byte arg3, int arg4, class160 arg5, int arg6) {
      try {
         ++field1681;
         if (~class93.field1236 > -101) {
            class393.method2996(~arg3, arg5, arg0);
         }

         arg0.method577(arg2, arg1, arg2 - -arg4, arg1 - -arg6);
         if (~class93.field1236 > -101) {
            byte var7 = 20;
            int var8 = arg2 - -(arg4 / 2);
            arg0.method508(arg2, arg1, arg4, arg6, -16777216, 0);
            int var9 = arg6 / 2 + -18 + arg1 + -var7;
            arg0.method523(var8 - 152, var9, 304, 34, class419.field5888[class600.field8375].getRGB(), 0);
            arg0.method508(var8 + -150, var9 + 2, class93.field1236 * 3, 30, class497.field6835[class600.field8375].getRGB(), 0);
            class101.field1310.method617(var7 + var9, class470.field6510[class600.field8375].getRGB(), class551.field7539.method3980(class494.field6787, true), -13760, -1, var8);
         } else {
            int var10 = -((int)((float)arg4 / class618.field8619)) + class791.field11574;
            int var11 = (int)((float)arg6 / class618.field8619) + class231.field2870;
            if (arg3 == 0) {
               int var12 = class791.field11574 - -((int)((float)arg4 / class618.field8619));
               class528.field7243 = class791.field11574 - (int)((float)arg4 / class618.field8619);
               int var13 = class231.field2870 - (int)((float)arg6 / class618.field8619);
               class493.field6782 = -((int)((float)arg6 / class618.field8619)) + class231.field2870;
               class572.field7869 = (int)((float)(arg6 * 2) / class618.field8619);
               class90.field1154 = (int)((float)(arg4 * 2) / class618.field8619);
               class618.method4484(class618.field8644 + var10, var11 - -class618.field8627, class618.field8644 + var12, class618.field8627 + var13, arg2, arg1, arg2 + arg4, arg1 + arg6 - -1);
               class618.method4480(arg0);
               class536 var14 = class618.method4491(arg0);
               class665.method4814(arg3 + 269287172, 0, arg0, var14, 0);
               if (class595.field8288 > 0) {
                  --class730.field10685;
                  if (~class730.field10685 == -1) {
                     --class595.field8288;
                     class730.field10685 = 20;
                  }
               }

               if (class419.field5887) {
                  int var15 = arg4 + -5 + arg2;
                  int var16 = arg1 + arg6 - 8;
                  class163.field2095.method624(-1, field1695[10] + class118.field1444, var16, 16776960, var15, -126);
                  int var22 = var16 - 15;
                  Runtime var17 = Runtime.getRuntime();
                  int var18 = (int)((var17.totalMemory() - var17.freeMemory()) / 1024L);
                  int var19 = 16776960;
                  if (~var18 < -65537) {
                     var19 = 16711680;
                  }

                  class163.field2095.method624(-1, field1695[8] + var18 + "k", var22, var19, var15, arg3 + -125);
                  var16 = var22 - 15;
               }
            }
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field1695[9] + (arg0 != null ? field1695[6] : field1695[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1695[6] : field1695[4]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(I[I)Ljava/lang/String;"
   )
   public static final String method1111(int arg0, int[] arg1) {
      boolean var2 = client.field4273;

      try {
         ++field1685;
         StringBuffer var3 = new StringBuffer();
         int var4 = class686.field10067;
         if (arg0 != -21996) {
            return null;
         } else {
            int var5 = 0;
            if (!var2 && arg1.length <= var5) {
               return var3.toString();
            } else {
               do {
                  class547 var6 = class716.field10503.method2224(arg1[var5], 22200);
                  if (~var6.field7473 != 0) {
                     class763 var7 = (class763)class679.field9963.method4239((long)var6.field7473, arg0 ^ -21996);
                     if (var7 == null) {
                        class267 var8 = class267.method2050(class354.field5051, var6.field7473, 0);
                        if (var8 != null) {
                           var7 = class338.field4832.method549(var8, true);
                           class679.field9963.method4238(42, var7, (long)var6.field7473);
                        }
                     }

                     if (var7 != null) {
                        class768.field11077[var4] = var7;
                        var3.append(field1695[3]).append(var4).append(">");
                        ++var4;
                     }
                  }

                  ++var5;
               } while(arg1.length > var5);

               return var3.toString();
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1695[5] + arg0 + ',' + (arg1 != null ? field1695[6] : field1695[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public final boolean method1112(int arg0, int arg1, byte arg2) {
      try {
         ++field1682;
         if (arg2 <= 12) {
            return true;
         } else {
            return ~(arg0 * arg1) >= ~this.field1683.length;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1695[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1113(int arg0, int arg1, int arg2) {
      try {
         ++field1687;
         ++class634.field8961;
         if (arg0 != 243040912) {
            method1113(123, -54, -22);
         }

         class471 var3 = class133.method1118(class605.field8474.field2787, arg0 + -243040910, class125.field1563);
         var3.field6527.method4278(arg0 ^ -243040973, arg1);
         var3.field6527.method4314(-26, arg2);
         class605.field8474.method1702((byte)-127, var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1695[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1114(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field1686 = -arg1 + arg0;
         if (arg2 != 32409) {
            this.field1690 = 119;
         }

         this.field1693 = arg3 - arg4;
         this.field1690 = arg1;
         this.field1684 = arg4;
         ++field1688;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1695[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method1115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         ++field1691;
         if (arg1 != -1) {
            this.field1683 = null;
         }

         int var9 = 0;
         if (arg3 != arg5) {
            var9 = (-arg4 + arg2 << 16) / (-arg5 + arg3);
         }

         int var10 = 0;
         if (~arg0 != ~arg3) {
            var10 = (arg6 - arg2 << 16) / (-arg3 + arg0);
         }

         int var11 = 0;
         if (arg0 != arg5) {
            var11 = (-arg6 + arg4 << 16) / (arg5 - arg0);
         }

         if (~arg3 <= ~arg5 && arg5 <= arg0) {
            if (arg0 <= arg3) {
               arg2 = arg4 <<= 16;
               arg6 <<= 16;
               if (~arg5 > -1) {
                  arg4 -= arg5 * var9;
                  arg2 -= arg5 * var11;
                  arg5 = 0;
               }

               if (~arg0 > -1) {
                  arg6 -= arg0 * var10;
                  arg0 = 0;
               }

               if (~arg0 != ~arg5 && var9 > var11 || ~arg0 == ~arg5 && var10 > var9) {
                  arg3 -= arg0;
                  arg0 -= arg5;
                  arg5 = this.field1693 * arg5;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-100, arg5);
                     arg2 += var11;
                     arg4 += var9;
                     arg5 += this.field1693;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-109, arg5);
                                 arg5 += this.field1693;
                                 arg6 += var10;
                                 arg4 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var9;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-109, arg5);
                                       arg5 += this.field1693;
                                       arg6 += var10;
                                       arg4 += var9;
                                    }
                                 }
                              }
                           }

                           arg5 += this.field1693;
                        } else {
                           class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-100, arg5);
                           arg2 += var11;
                           arg4 += var9;
                           arg5 += this.field1693;
                        }
                     }
                  }
               } else {
                  arg3 -= arg0;
                  arg0 -= arg5;
                  arg5 = this.field1693 * arg5;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-100, arg5);
                     arg5 += this.field1693;
                     arg2 += var11;
                     arg4 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-101, arg5);
                                 arg6 += var10;
                                 arg4 += var9;
                                 arg5 += this.field1693;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += this.field1693;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-101, arg5);
                                       arg6 += var10;
                                       arg4 += var9;
                                       arg5 += this.field1693;
                                    }
                                 }
                              }
                           }

                           arg4 += var9;
                        } else {
                           class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-100, arg5);
                           arg5 += this.field1693;
                           arg2 += var11;
                           arg4 += var9;
                        }
                     }
                  }
               }
            } else {
               arg6 = arg4 <<= 16;
               if (arg5 < 0) {
                  arg6 -= arg5 * var11;
                  arg4 -= arg5 * var9;
                  arg5 = 0;
               }

               arg2 <<= 16;
               if (arg3 < 0) {
                  arg2 -= arg3 * var10;
                  arg3 = 0;
               }

               if (arg3 != arg5 && ~var11 > ~var9 || ~arg3 == ~arg5 && ~var11 < ~var10) {
                  arg0 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field1693 * arg5;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-99, arg5);
                     arg5 += this.field1693;
                     arg6 += var11;
                     arg4 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (~arg3 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-122, arg5);
                                 arg6 += var11;
                                 arg5 += this.field1693;
                                 arg2 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (~arg0 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += var10;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-122, arg5);
                                       arg6 += var11;
                                       arg5 += this.field1693;
                                       arg2 += var10;
                                    }
                                 }
                              }
                           }

                           arg4 += var9;
                        } else {
                           class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-99, arg5);
                           arg5 += this.field1693;
                           arg6 += var11;
                           arg4 += var9;
                        }
                     }
                  }
               } else {
                  arg0 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field1693 * arg5;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-86, arg5);
                     arg6 += var11;
                     arg5 += this.field1693;
                     arg4 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-104, arg5);
                                 arg6 += var11;
                                 arg2 += var10;
                                 arg5 += this.field1693;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (arg0 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += this.field1693;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-104, arg5);
                                       arg6 += var11;
                                       arg2 += var10;
                                       arg5 += this.field1693;
                                    }
                                 }
                              }
                           }

                           arg4 += var9;
                        } else {
                           class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-86, arg5);
                           arg6 += var11;
                           arg5 += this.field1693;
                           arg4 += var9;
                        }
                     }
                  }
               }
            }
         } else if (arg0 >= arg3) {
            if (arg5 > arg0) {
               arg4 = arg2 <<= 16;
               arg6 <<= 16;
               if (~arg3 > -1) {
                  arg4 -= arg3 * var9;
                  arg2 -= arg3 * var10;
                  arg3 = 0;
               }

               if (~arg0 > -1) {
                  arg6 -= arg0 * var11;
                  arg0 = 0;
               }

               if (~arg0 != ~arg3 && ~var9 > ~var10 || arg0 == arg3 && var11 < var9) {
                  arg5 -= arg0;
                  arg0 -= arg3;
                  arg3 = this.field1693 * arg3;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-123, arg3);
                     arg4 += var9;
                     arg2 += var10;
                     arg3 += this.field1693;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-112, arg3);
                                 arg6 += var11;
                                 arg4 += var9;
                                 arg3 += this.field1693;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (arg5 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg3 += this.field1693;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-112, arg3);
                                       arg6 += var11;
                                       arg4 += var9;
                                       arg3 += this.field1693;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field1693;
                        } else {
                           class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-123, arg3);
                           arg4 += var9;
                           arg2 += var10;
                           arg3 += this.field1693;
                        }
                     }
                  }
               } else {
                  arg5 -= arg0;
                  arg0 -= arg3;
                  arg3 = this.field1693 * arg3;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-121, arg3);
                     arg3 += this.field1693;
                     arg4 += var9;
                     arg2 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-123, arg3);
                                 arg6 += var11;
                                 arg3 += this.field1693;
                                 arg4 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (arg5 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var9;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-123, arg3);
                                       arg6 += var11;
                                       arg3 += this.field1693;
                                       arg4 += var9;
                                    }
                                 }
                              }
                           }

                           arg2 += var10;
                        } else {
                           class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-121, arg3);
                           arg3 += this.field1693;
                           arg4 += var9;
                           arg2 += var10;
                        }
                     }
                  }
               }
            } else {
               arg6 = arg2 <<= 16;
               arg4 <<= 16;
               if (arg3 < 0) {
                  arg6 -= arg3 * var9;
                  arg2 -= arg3 * var10;
                  arg3 = 0;
               }

               if (~arg5 > -1) {
                  arg4 -= arg5 * var11;
                  arg5 = 0;
               }

               if (var9 >= var10) {
                  arg0 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field1693 * arg3;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-112, arg3);
                     arg3 += this.field1693;
                     arg2 += var10;
                     arg6 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (arg5 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-84, arg3);
                                 arg3 += this.field1693;
                                 arg2 += var10;
                                 arg4 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (arg0 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var11;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-84, arg3);
                                       arg3 += this.field1693;
                                       arg2 += var10;
                                       arg4 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var9;
                        } else {
                           class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-112, arg3);
                           arg3 += this.field1693;
                           arg2 += var10;
                           arg6 += var9;
                        }
                     }
                  }
               } else {
                  arg0 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field1693 * arg3;
                  if (var8) {
                     class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-85, arg3);
                     arg6 += var9;
                     arg2 += var10;
                     arg3 += this.field1693;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (arg5 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-98, arg3);
                                 arg3 += this.field1693;
                                 arg4 += var11;
                                 arg2 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (arg0 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += var10;
                                    } else {
                                       class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-98, arg3);
                                       arg3 += this.field1693;
                                       arg4 += var11;
                                       arg2 += var10;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field1693;
                        } else {
                           class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-85, arg3);
                           arg6 += var9;
                           arg2 += var10;
                           arg3 += this.field1693;
                        }
                     }
                  }
               }
            }
         } else if (~arg5 <= ~arg3) {
            arg4 = arg6 <<= 16;
            if (arg0 < 0) {
               arg4 -= arg0 * var10;
               arg6 -= arg0 * var11;
               arg0 = 0;
            }

            arg2 <<= 16;
            if (arg3 < 0) {
               arg2 -= arg3 * var9;
               arg3 = 0;
            }

            if (var11 <= var10) {
               arg5 -= arg3;
               arg3 -= arg0;
               arg0 = this.field1693 * arg0;
               if (var8) {
                  class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-110, arg0);
                  arg6 += var11;
                  arg4 += var10;
                  arg0 += this.field1693;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-110, arg0);
                              arg6 += var11;
                              arg0 += this.field1693;
                              arg2 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (~arg5 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += var9;
                                 } else {
                                    class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-110, arg0);
                                    arg6 += var11;
                                    arg0 += this.field1693;
                                    arg2 += var9;
                                 }
                              }
                           }
                        }

                        arg0 += this.field1693;
                     } else {
                        class315.method2366(this.field1683, 0, arg4 >> 16, arg6 >> 16, (byte)-110, arg0);
                        arg6 += var11;
                        arg4 += var10;
                        arg0 += this.field1693;
                     }
                  }
               }
            } else {
               arg5 -= arg3;
               arg3 -= arg0;
               arg0 = this.field1693 * arg0;
               if (var8) {
                  class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-109, arg0);
                  arg4 += var10;
                  arg6 += var11;
                  arg0 += this.field1693;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-110, arg0);
                              arg0 += this.field1693;
                              arg6 += var11;
                              arg2 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (~arg5 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += var9;
                                 } else {
                                    class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-110, arg0);
                                    arg0 += this.field1693;
                                    arg6 += var11;
                                    arg2 += var9;
                                 }
                              }
                           }
                        }

                        arg0 += this.field1693;
                     } else {
                        class315.method2366(this.field1683, 0, arg6 >> 16, arg4 >> 16, (byte)-109, arg0);
                        arg4 += var10;
                        arg6 += var11;
                        arg0 += this.field1693;
                     }
                  }
               }
            }
         } else {
            arg2 = arg6 <<= 16;
            arg4 <<= 16;
            if (~arg0 > -1) {
               arg2 -= arg0 * var10;
               arg6 -= arg0 * var11;
               arg0 = 0;
            }

            if (arg5 < 0) {
               arg4 -= arg5 * var9;
               arg5 = 0;
            }

            if (~var11 >= ~var10) {
               arg3 -= arg5;
               arg5 -= arg0;
               arg0 = this.field1693 * arg0;
               if (var8) {
                  class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-95, arg0);
                  arg2 += var10;
                  arg6 += var11;
                  arg0 += this.field1693;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (~arg5 > -1) {
                        if (!var8) {
                           if (var8) {
                              class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-105, arg0);
                              arg4 += var9;
                              arg0 += this.field1693;
                              arg2 += var10;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += var10;
                                 } else {
                                    class315.method2366(this.field1683, 0, arg2 >> 16, arg4 >> 16, (byte)-105, arg0);
                                    arg4 += var9;
                                    arg0 += this.field1693;
                                    arg2 += var10;
                                 }
                              }
                           }
                        }

                        arg0 += this.field1693;
                     } else {
                        class315.method2366(this.field1683, 0, arg2 >> 16, arg6 >> 16, (byte)-95, arg0);
                        arg2 += var10;
                        arg6 += var11;
                        arg0 += this.field1693;
                     }
                  }
               }
            } else {
               arg3 -= arg5;
               arg5 -= arg0;
               arg0 = this.field1693 * arg0;
               if (var8) {
                  class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-126, arg0);
                  arg2 += var10;
                  arg6 += var11;
                  arg0 += this.field1693;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (~arg5 > -1) {
                        if (!var8) {
                           if (var8) {
                              class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-121, arg0);
                              arg2 += var10;
                              arg4 += var9;
                              arg0 += this.field1693;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (arg3 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg0 += this.field1693;
                                 } else {
                                    class315.method2366(this.field1683, 0, arg4 >> 16, arg2 >> 16, (byte)-121, arg0);
                                    arg2 += var10;
                                    arg4 += var9;
                                    arg0 += this.field1693;
                                 }
                              }
                           }
                        }

                        arg0 += this.field1693;
                     } else {
                        class315.method2366(this.field1683, 0, arg6 >> 16, arg2 >> 16, (byte)-126, arg0);
                        arg2 += var10;
                        arg6 += var11;
                        arg0 += this.field1693;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field1695[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "<init>",
      descriptor = "(Lor;II)V"
   )
   public class132(class670 arg0, int arg1, int arg2) {
      try {
         this.field1683 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1695[12] + (arg0 != null ? field1695[6] : field1695[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1116(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1117(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
