import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class447 {
   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "Lha;"
   )
   private class479 field6046;
   @OriginalMember(
      owner = "client!da",
      name = "r",
      descriptor = "Lkv;"
   )
   private class19 field6038;
   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6057 = new String[]{method3437(method3436("\bwchV")), method3437(method3436("\u00106!{")), method3437(method3436("\u00001,\"")), method3437(method3436("\\*94")), method3437(method3436("\u0011+")), method3437(method3436("\\*%'O")), method3437(method3436("\u00001,\"\u0016^h")), method3437(method3436("\u0000-?{")), method3437(method3436("\u00178c\f\u0003")), method3437(method3436("\u00001,\"\u0016")), method3437(method3436("\\:\"*")), method3437(method3436("\u0012+*$\u0016")), method3437(method3436("\\8?!I")), method3437(method3436("\u0000-?")), method3437(method3436("\\,")), method3437(method3436("\u001d,!*")), method3437(method3436("\u0006d")), method3437(method3436("\u00178c\u000f\u0003")), method3437(method3436("\u00178c\u0014\u0003")), method3437(method3436("\u00178c\r\u0003")), method3437(method3436("\u00178czB\u001d09x\u0003")), method3437(method3436("\u00178c\t\u0003")), method3437(method3436("\u00178c\n\u0003")), method3437(method3436("\u0016,?)")), method3437(method3436("\u000014")), method3437(method3436("\u001d;>6")), method3437(method3436("\u00070 #X")), method3437(method3436("\u00106=?")), method3437(method3436("\u0001<*")), method3437(method3436("\u0014-")), method3437(method3436("\u001f-")), method3437(method3436("\u00178c\u0002\u0003")), method3437(method3436("\u001a4*{")), method3437(method3436("\u00178c\u0016\u0003")), method3437(method3436("\u00178c\u0017\u0003")), method3437(method3436("\u00178c\u0000\u0003")), method3437(method3436("\u00178c\b\u0003")), method3437(method3436("\u00178c\u0005\u0003")), method3437(method3436("\u00178c\u0004\u0003")), method3437(method3436("\u00178c\u0003\u0003")), method3437(method3436("\u00178c\u0001\u0003")), method3437(method3436("\u00178c\u000b\u0003")), method3437(method3436("\u00178c\u000e\u0003"))};
   @OriginalMember(
      owner = "client!da",
      name = "h",
      descriptor = "Ldp;"
   )
   public static class499 field6053 = new class499(7, 2);
   @OriginalMember(
      owner = "client!da",
      name = "b",
      descriptor = "I"
   )
   public static int field6039;
   @OriginalMember(
      owner = "client!da",
      name = "i",
      descriptor = "I"
   )
   public static int field6040;
   @OriginalMember(
      owner = "client!da",
      name = "p",
      descriptor = "I"
   )
   public static int field6041;
   @OriginalMember(
      owner = "client!da",
      name = "e",
      descriptor = "I"
   )
   public static int field6042;
   @OriginalMember(
      owner = "client!da",
      name = "d",
      descriptor = "I"
   )
   public static int field6043;
   @OriginalMember(
      owner = "client!da",
      name = "c",
      descriptor = "I"
   )
   public static int field6044;
   @OriginalMember(
      owner = "client!da",
      name = "m",
      descriptor = "I"
   )
   public static int field6045;
   @OriginalMember(
      owner = "client!da",
      name = "n",
      descriptor = "I"
   )
   public static int field6047;
   @OriginalMember(
      owner = "client!da",
      name = "o",
      descriptor = "I"
   )
   public static int field6048;
   @OriginalMember(
      owner = "client!da",
      name = "q",
      descriptor = "I"
   )
   public static int field6049;
   @OriginalMember(
      owner = "client!da",
      name = "l",
      descriptor = "I"
   )
   public static int field6050;
   @OriginalMember(
      owner = "client!da",
      name = "g",
      descriptor = "I"
   )
   public static int field6051;
   @OriginalMember(
      owner = "client!da",
      name = "j",
      descriptor = "I"
   )
   public static int field6052;
   @OriginalMember(
      owner = "client!da",
      name = "s",
      descriptor = "I"
   )
   public static int field6054;
   @OriginalMember(
      owner = "client!da",
      name = "f",
      descriptor = "I"
   )
   public static int field6055;
   @OriginalMember(
      owner = "client!da",
      name = "k",
      descriptor = "I"
   )
   public static int field6056;

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([ILjava/util/Random;IIIIII[Lpd;II[IIILjava/lang/String;)I"
   )
   public final int method3419(int[] arg0, Random arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class648[] arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, String arg14) {
      boolean var16 = client.field1481;

      try {
         ++field6049;
         if (arg14 == null) {
            return 0;
         } else {
            arg1.setSeed((long)arg7);
            if (arg4 != 3) {
               this.method3419((int[])null, (Random)null, -85, 108, -80, -104, -7, 22, (class648[])null, -112, 5, (int[])null, -85, 64, (String)null);
            }

            int var17 = 192 + (arg1.nextInt() & 31);
            this.method3423(arg6 & 16777215 | var17 << 24, -23883, var17 << 24 | arg13 & 16777215);
            int var18 = arg14.length();
            int[] var19 = new int[var18];
            int var20 = 0;
            int var21 = 0;
            if (var16) {
               var19[var21] = var20;
               if ((3 & arg1.nextInt()) == 0) {
                  ++var20;
               }

               ++var21;
            }

            while(true) {
               while(~var18 < ~var21) {
                  var19[var21] = var20;
                  if ((3 & arg1.nextInt()) == 0) {
                     ++var20;
                  }

                  ++var21;
               }

               int var22 = arg9;
               int var23 = this.field6038.field311 + arg3;
               int var24 = -1;
               if (!var16) {
                  label80: {
                     if (arg10 != 1) {
                        if (arg10 != 2) {
                           break label80;
                        }

                        var23 = -this.field6038.field300 + arg2 + arg3;
                        if (!var16) {
                           break label80;
                        }
                     }

                     var23 += (-this.field6038.field311 + arg2 + -this.field6038.field300) / 2;
                  }

                  label73: {
                     if (arg12 == 1) {
                        var24 = this.field6038.method139(46, arg14) + var20;
                        var22 = (-var24 + arg5) / 2 + arg9;
                        if (!var16) {
                           break label73;
                        }
                     }

                     if (~arg12 == -3) {
                        var24 = var20 + this.field6038.method139(46, arg14);
                        var22 += -var24 + arg5;
                     }
                  }

                  this.method3424(arg8, arg14, arg0, (int[])null, var23, (byte)31, var19, var22);
                  if (arg11 != null) {
                     if (var24 == -1) {
                        var24 = this.field6038.method139(46, arg14) - -var20;
                     }

                     arg11[3] = this.field6038.field311 - -this.field6038.field300;
                     arg11[1] = var23 - this.field6038.field311;
                     arg11[0] = var22;
                     arg11[2] = var24;
                  }

                  return var20;
               }

               if ((arg10 & 1) == 0) {
                  ++var20;
               }

               ++var21;
            }
         }
      } catch (RuntimeException var26) {
         throw class93.method866(var26, field6057[33] + (arg0 != null ? field6057[0] : field6057[15]) + ',' + (arg1 != null ? field6057[0] : field6057[15]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field6057[0] : field6057[15]) + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field6057[0] : field6057[15]) + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field6057[0] : field6057[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIII[Lpd;Ljava/lang/String;I[IIIIIILaa;I)I"
   )
   public final int method3420(int arg0, int arg1, int arg2, int arg3, int arg4, class648[] arg5, String arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class87 arg14, int arg15) {
      try {
         if (arg2 != 11520) {
            this.field6038 = null;
         }

         ++field6056;
         return this.method3427(true, arg5, arg14, arg7, arg12, 0, arg13, arg6, arg4, arg15, arg3, arg11, arg8, arg9, arg0, arg1, arg10);
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field6057[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6057[0] : field6057[15]) + ',' + (arg6 != null ? field6057[0] : field6057[15]) + ',' + arg7 + ',' + (arg8 != null ? field6057[0] : field6057[15]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field6057[0] : field6057[15]) + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIILjava/lang/String;I)V"
   )
   public final void method3421(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
      try {
         ++field6054;
         if (arg4 != null) {
            if (arg3 != 8364) {
               this.method3423(46, 41, -66);
            }

            this.method3423(arg0, -23883, arg5);
            this.method3432((class648[])null, 0, arg4, arg1, (byte)124, (class87)null, arg2 - this.field6038.method139(46, arg4) / 2, 0, (int[])null);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6057[42] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6057[0] : field6057[15]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([IIIIILjava/util/Random;[Lpd;IILjava/lang/String;)I"
   )
   public final int method3422(int[] arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, class648[] arg6, int arg7, int arg8, String arg9) {
      boolean var11 = client.field1481;

      try {
         ++field6042;
         if (arg1 <= 105) {
            return -120;
         } else if (arg9 == null) {
            return 0;
         } else {
            arg5.setSeed((long)arg8);
            int var12 = (arg5.nextInt() & 31) + 192;
            this.method3423(16777215 & arg2 | var12 << 24, -23883, 16777215 & arg4 | var12 << 24);
            int var13 = arg9.length();
            int[] var14 = new int[var13];
            int var15 = 0;
            int var16 = 0;
            if (var11) {
               var14[var16] = var15;
               if (~(3 & arg5.nextInt()) == -1) {
                  ++var15;
               }

               ++var16;
            }

            while(true) {
               while(~var13 < ~var16) {
                  var14[var16] = var15;
                  if (~(3 & arg5.nextInt()) == -1) {
                     ++var15;
                  }

                  ++var16;
               }

               this.method3424(arg6, arg9, arg0, (int[])null, arg7, (byte)31, var14, arg3);
               if (!var11) {
                  return var15;
               }

               if (var15 == -1) {
                  ++var15;
               }

               ++var16;
            }
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field6057[41] + (arg0 != null ? field6057[0] : field6057[15]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6057[0] : field6057[15]) + ',' + (arg6 != null ? field6057[0] : field6057[15]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field6057[0] : field6057[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(III)V"
   )
   private final void method3423(int arg0, int arg1, int arg2) {
      try {
         class786.field11487 = -1;
         if (~arg0 == 0) {
            arg0 = 0;
         }

         class37.field526 = 0;
         class32.field474 = -1;
         class359.field5011 = 0;
         ++field6050;
         if (arg1 != -23883) {
            this.field6046 = null;
         }

         class573.field8401 = arg2;
         class620.field9174 = arg2;
         class594.field8751 = arg0;
         class331.field4570 = arg0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6057[21] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([Lpd;Ljava/lang/String;[I[IIB[II)V"
   )
   private final void method3424(class648[] param1, String param2, int[] param3, int[] param4, int param5, byte param6, int[] param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   private final void method3425(int arg0, String arg1) {
      boolean var3 = client.field1481;

      try {
         try {
            label131: {
               label124: {
                  if (!arg1.startsWith(field6057[1])) {
                     if (!arg1.equals(field6057[10])) {
                        break label124;
                     }

                     class620.field9174 = class620.field9174 & -16777216 | 16777215 & class573.field8401;
                     if (!var3) {
                        break label124;
                     }
                  }

                  class620.field9174 = -16777216 & class620.field9174 | class694.method5060(arg1.substring(4), (byte)-118, 16) & 16777215;
               }

               if (!arg1.startsWith(field6057[11])) {
                  if (!arg1.equals(field6057[12])) {
                     if (arg1.startsWith(field6057[7])) {
                        class786.field11487 = -16777216 & class620.field9174 | class694.method5060(arg1.substring(4), (byte)-118, 16);
                        if (!var3) {
                           break label131;
                        }
                     }

                     if (!arg1.equals(field6057[13])) {
                        if (!arg1.equals(field6057[3])) {
                           if (!arg1.startsWith(field6057[16])) {
                              if (!arg1.equals("u")) {
                                 if (!arg1.equals(field6057[14])) {
                                    if (!arg1.equalsIgnoreCase(field6057[6])) {
                                       if (!arg1.startsWith(field6057[9])) {
                                          if (!arg1.equals(field6057[2])) {
                                             if (arg1.equals(field6057[5])) {
                                                class331.field4570 = class594.field8751;
                                                if (!var3) {
                                                   break label131;
                                                }
                                             }

                                             if (!arg1.equals(field6057[4])) {
                                                break label131;
                                             }

                                             this.method3423(class594.field8751, -23883, class573.field8401);
                                             if (!var3) {
                                                break label131;
                                             }
                                          }

                                          class331.field4570 = class620.field9174 & -16777216;
                                          if (!var3) {
                                             break label131;
                                          }
                                       }

                                       class331.field4570 = class620.field9174 & -16777216 | class694.method5060(arg1.substring(5), (byte)-118, 16);
                                       if (!var3) {
                                          break label131;
                                       }
                                    }

                                    class331.field4570 = 0;
                                    if (!var3) {
                                       break label131;
                                    }
                                 }

                                 class32.field474 = -1;
                                 if (!var3) {
                                    break label131;
                                 }
                              }

                              class32.field474 = class620.field9174 & -16777216;
                              if (!var3) {
                                 break label131;
                              }
                           }

                           class32.field474 = class620.field9174 & -16777216 | class694.method5060(arg1.substring(2), (byte)-118, 16);
                           if (!var3) {
                              break label131;
                           }
                        }

                        class786.field11487 = -1;
                        if (!var3) {
                           break label131;
                        }
                     }

                     class786.field11487 = 8388608 | class620.field9174 & -16777216;
                     if (!var3) {
                        break label131;
                     }
                  }

                  class620.field9174 = class573.field8401;
                  if (!var3) {
                     break label131;
                  }
               }

               class620.field9174 = class694.method5060(arg1.substring(5), (byte)-118, 16);
            }
         } catch (Exception var5) {
         }

         ++field6047;
         if (arg0 != -1) {
            this.field6038 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6057[8] + arg0 + ',' + (arg1 != null ? field6057[0] : field6057[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/lang/String;IIIII)V"
   )
   public final void method3426(int param1, String param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public abstract void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Z[Lpd;Laa;IIIILjava/lang/String;IIII[IIIII)I"
   )
   public final int method3427(boolean arg0, class648[] arg1, class87 arg2, int arg3, int arg4, int arg5, int arg6, String arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14, int arg15, int arg16) {
      boolean var18 = client.field1481;

      try {
         ++field6043;
         if (arg7 == null) {
            return 0;
         } else {
            this.method3423(arg4, -23883, arg10);
            if (arg11 == 0) {
               arg11 = this.field6038.field304;
            }

            int[] var19;
            label151: {
               if (arg9 < this.field6038.field311 - (-this.field6038.field300 - arg11) && ~arg9 > ~(arg11 + arg11)) {
                  var19 = null;
                  if (!var18) {
                     break label151;
                  }
               }

               var19 = new int[]{arg8};
            }

            if (arg5 == -1) {
               arg5 = arg9 / arg11;
               if (arg5 <= 0) {
                  arg5 = 1;
               }
            }

            int var20 = this.field6038.method149(arg7, arg1, client.field1470, var19, 112);
            if (arg5 > 0 && arg5 <= var20) {
               var20 = arg5;
               client.field1470[arg5 + -1] = this.field6038.method150(client.field1470[arg5 + -1], arg1, (byte)-92, arg8);
            }

            if (!arg0) {
               method3428(32);
            }

            if (~arg13 == -4 && ~var20 == -2) {
               arg13 = 1;
            }

            int var21;
            label159: {
               if (~arg13 == -1) {
                  var21 = arg6 - -this.field6038.field311;
                  if (!var18) {
                     break label159;
                  }
               }

               if (arg13 == 1) {
                  var21 = (-((var20 + -1) * arg11) + arg9 - this.field6038.field311 - this.field6038.field300) / 2 + arg6 + this.field6038.field311;
                  if (!var18) {
                     break label159;
                  }
               }

               if (~arg13 == -3) {
                  var21 = -((var20 - 1) * arg11) + -this.field6038.field300 + arg6 + arg9;
                  if (!var18) {
                     break label159;
                  }
               }

               int var22 = (-this.field6038.field311 + arg9 + -((var20 + -1) * arg11) + -this.field6038.field300) / (var20 - -1);
               if (var22 < 0) {
                  var22 = 0;
               }

               arg11 += var22;
               var21 = this.field6038.field311 + arg6 + var22;
            }

            int var23 = 0;
            int var10000;
            if (var18) {
               var10000 = arg16;
            } else if (var20 <= var23) {
               var10000 = var20;
               if (!var18) {
                  return var20;
               }
            } else {
               var10000 = arg16;
            }

            while(true) {
               label161: {
                  if (var10000 == 0) {
                     this.method3432(arg1, arg3, client.field1470[var23], var21, (byte)123, arg2, arg14, arg15, arg12);
                     if (!var18) {
                        break label161;
                     }
                  }

                  if (~arg16 != -2) {
                     if (~arg16 == -3) {
                        this.method3432(arg1, arg3, client.field1470[var23], var21, (byte)88, arg2, -this.field6038.method139(46, client.field1470[var23]) + arg8 + arg14, arg15, arg12);
                        if (!var18) {
                           break label161;
                        }
                     }

                     if (~(var20 + -1) == ~var23) {
                        this.method3432(arg1, arg3, client.field1470[var23], var21, (byte)79, arg2, arg14, arg15, arg12);
                        if (!var18) {
                           break label161;
                        }
                     }

                     this.method3429(arg8, client.field1470[var23], 62);
                     this.method3432(arg1, arg3, client.field1470[var23], var21, (byte)121, arg2, arg14, arg15, arg12);
                     class37.field526 = 0;
                     if (!var18) {
                        break label161;
                     }
                  }

                  this.method3432(arg1, arg3, client.field1470[var23], var21, (byte)76, arg2, arg14 + (-this.field6038.method139(46, client.field1470[var23]) + arg8) / 2, arg15, arg12);
               }

               var21 += arg11;
               ++var23;
               if (var20 <= var23) {
                  var10000 = var20;
                  if (!var18) {
                     return var20;
                  }
               } else {
                  var10000 = arg16;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class93.method866(var25, field6057[36] + arg0 + ',' + (arg1 != null ? field6057[0] : field6057[15]) + ',' + (arg2 != null ? field6057[0] : field6057[15]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field6057[0] : field6057[15]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field6057[0] : field6057[15]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3428(int arg0) {
      try {
         if (arg0 > 120) {
            field6053 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6057[39] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public abstract void method294(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   private final void method3429(int arg0, String arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field6044;
         if (arg2 != 62) {
            this.field6046 = null;
         }

         int var5 = 0;
         boolean var6 = false;
         int var7 = 0;
         int var10000;
         if (var4) {
            var10000 = arg1.charAt(var7);
         } else if (var7 >= arg1.length()) {
            var10000 = ~var5;
            if (!var4) {
               if (var10000 < -1) {
                  class37.field526 = (arg0 + -this.field6038.method139(46, arg1) << 8) / var5;
                  return;
               }

               return;
            }
         } else {
            var10000 = arg1.charAt(var7);
         }

         while(true) {
            int var8 = var10000;
            if (var8 == 60) {
               var6 = true;
               if (var4) {
                  if (var8 == 62) {
                     var6 = false;
                     if (var4) {
                        if (!var6 && ~var8 == -33) {
                           ++var5;
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }
                  } else {
                     if (!var6 && ~var8 == -33) {
                        ++var5;
                     }

                     ++var7;
                  }
               } else {
                  ++var7;
               }
            } else if (var8 == 62) {
               var6 = false;
               if (var4) {
                  if (!var6 && ~var8 == -33) {
                     ++var5;
                  }

                  ++var7;
               } else {
                  ++var7;
               }
            } else {
               if (!var6 && ~var8 == -33) {
                  ++var5;
               }

               ++var7;
            }

            if (var7 >= arg1.length()) {
               var10000 = ~var5;
               if (!var4) {
                  if (var10000 < -1) {
                     class37.field526 = (arg0 + -this.field6038.method139(46, arg1) << 8) / var5;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg1.charAt(var7);
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6057[35] + arg0 + ',' + (arg1 != null ? field6057[0] : field6057[15]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "<init>",
      descriptor = "(Lha;Lkv;)V"
   )
   public class447(class479 arg0, class19 arg1) {
      try {
         this.field6046 = arg0;
         this.field6038 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6057[20] + (arg0 != null ? field6057[0] : field6057[15]) + ',' + (arg1 != null ? field6057[0] : field6057[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIILjava/lang/String;BI)V"
   )
   public final void method3430(int param1, int param2, int param3, int param4, String param5, byte param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IILjava/lang/String;BII)V"
   )
   public final void method3431(int arg0, int arg1, String arg2, byte arg3, int arg4, int arg5) {
      try {
         ++field6039;
         if (arg2 != null) {
            if (arg3 > -109) {
               field6053 = null;
            }

            this.method3423(arg5, -23883, arg0);
            this.method3432((class648[])null, 0, arg2, arg1, (byte)-102, (class87)null, arg4 + -this.field6038.method139(46, arg2), 0, (int[])null);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6057[37] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6057[0] : field6057[15]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([Lpd;ILjava/lang/String;IBLaa;II[I)V"
   )
   private final void method3432(class648[] param1, int param2, String param3, int param4, byte param5, class87 param6, int param7, int param8, int[] param9) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Ljava/lang/String;IIIII)V"
   )
   public final void method3433(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field6048;
         int var7 = -32 % ((arg2 - 77) / 32);
         if (arg0 != null) {
            this.method3423(arg3, -23883, arg5);
            this.method3432((class648[])null, 0, arg0, arg1, (byte)104, (class87)null, arg4, 0, (int[])null);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field6057[19] + (arg0 != null ? field6057[0] : field6057[15]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([Lpd;IIIII[ILjava/lang/String;)V"
   )
   public final void method3434(class648[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, String arg7) {
      try {
         int var9 = -87 / ((6 - arg3) / 43);
         ++field6040;
         if (arg7 != null) {
            this.method3423(arg1, -23883, arg5);
            this.method3432(arg0, 0, arg7, arg4, (byte)74, (class87)null, arg2, 0, arg6);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field6057[22] + (arg0 != null ? field6057[0] : field6057[15]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6057[0] : field6057[15]) + ',' + (arg7 != null ? field6057[0] : field6057[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIILjava/lang/String;BIII)V"
   )
   public final void method3435(int param1, int param2, int param3, String param4, byte param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3436(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3437(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
