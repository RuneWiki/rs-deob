import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class579 {
   @OriginalMember(
      owner = "client!lba",
      name = "i",
      descriptor = "[I"
   )
   private int[] field7937;
   @OriginalMember(
      owner = "client!lba",
      name = "f",
      descriptor = "I"
   )
   private int field7946;
   @OriginalMember(
      owner = "client!lba",
      name = "e",
      descriptor = "[[Lva;"
   )
   private class526[][] field7945;
   @OriginalMember(
      owner = "client!lba",
      name = "o",
      descriptor = "[I"
   )
   private int[] field7943;
   @OriginalMember(
      owner = "client!lba",
      name = "n",
      descriptor = "[I"
   )
   private int[] field7950;
   @OriginalMember(
      owner = "client!lba",
      name = "c",
      descriptor = "[[Lva;"
   )
   private class526[][] field7954;
   @OriginalMember(
      owner = "client!lba",
      name = "k",
      descriptor = "Loj;"
   )
   private class403 field7948;
   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "Lso;"
   )
   private class499 field7942;
   @OriginalMember(
      owner = "client!lba",
      name = "p",
      descriptor = "Lso;"
   )
   private class499 field7952;
   @OriginalMember(
      owner = "client!lba",
      name = "m",
      descriptor = "Loia;"
   )
   private class96 field7955;
   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7957 = new String[]{method4168(method4167(">n;e")), method4168(method4167("+5y']")), method4168(method4167("<y6'fx")), method4168(method4167("<y6'ax")), method4168(method4167("<y6'jx")), method4168(method4167("<y6'cx")), method4168(method4167("<y6'ix")), method4168(method4167("<y6'ex")), method4168(method4167("<y6'bx")), method4168(method4167("<y6'hx")), method4168(method4167("<y6'dx")), method4168(method4167("<y6'\u001c9u>}\u001ex")), method4168(method4167("<y6'gx"))};
   @OriginalMember(
      owner = "client!lba",
      name = "g",
      descriptor = "Lgka;"
   )
   public static class394 field7940 = new class394("", 18);
   @OriginalMember(
      owner = "client!lba",
      name = "r",
      descriptor = "I"
   )
   public static int field7938;
   @OriginalMember(
      owner = "client!lba",
      name = "j",
      descriptor = "I"
   )
   public static int field7939;
   @OriginalMember(
      owner = "client!lba",
      name = "s",
      descriptor = "I"
   )
   public static int field7941;
   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "I"
   )
   public static int field7944;
   @OriginalMember(
      owner = "client!lba",
      name = "h",
      descriptor = "I"
   )
   public static int field7947;
   @OriginalMember(
      owner = "client!lba",
      name = "l",
      descriptor = "I"
   )
   public static int field7949;
   @OriginalMember(
      owner = "client!lba",
      name = "q",
      descriptor = "I"
   )
   public static int field7951;
   @OriginalMember(
      owner = "client!lba",
      name = "d",
      descriptor = "I"
   )
   public static int field7953;
   @OriginalMember(
      owner = "client!lba",
      name = "t",
      descriptor = "I"
   )
   public static int field7956;

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(ILce;)V"
   )
   public final void method4157(int arg0, class327 arg1) {
      try {
         if (arg0 != -8409) {
            this.field7942 = null;
         }

         ++field7941;
         this.field7942.method789(-6222, 786336, 24);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7957[4] + arg0 + ',' + (arg1 != null ? field7957[1] : field7957[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(BLvi;)I"
   )
   public static final int method4158(byte arg0, class569 arg1) {
      try {
         ++field7944;
         if (arg1.field7783 == 0) {
            return 0;
         } else {
            if (~arg1.field7780 != 0) {
               class569 var2 = null;
               if (~arg1.field7780 <= -32769) {
                  if (~arg1.field7780 <= -32769) {
                     var2 = class136.field1773[arg1.field7780 + -32768];
                  }
               } else {
                  class243 var3 = (class243)class335.field4808.method1839(121, (long)arg1.field7780);
                  if (var3 != null) {
                     var2 = var3.field3043;
                  }
               }

               if (var2 != null) {
                  int var4 = -var2.field999 + arg1.field999;
                  int var5 = -var2.field1003 + arg1.field1003;
                  if (~var4 != -1 || ~var5 != -1) {
                     arg1.method4079(16383 & (int)(2607.5945876176133D * Math.atan2((double)var4, (double)var5)), -6541);
                  }
               }
            }

            if (arg0 > -73) {
               field7940 = null;
            }

            if (arg1 instanceof class404) {
               class404 var6 = (class404)arg1;
               if (var6.field5660 == -1 || var6.field7848 != 0 && ~var6.field7849 >= -1) {
                  return arg1.method4076(18545);
               }

               var6.method4079(var6.field5660, -6541);
               var6.field5660 = -1;
               if (!client.field4273) {
                  return arg1.method4076(18545);
               }
            }

            if (arg1 instanceof class680) {
               class680 var7 = (class680)arg1;
               if (~var7.field9987 != 0 && (var7.field7848 == 0 || var7.field7849 > 0)) {
                  int var8 = -((-class752.field10921 + var7.field9987 + -class752.field10921) * 256) + var7.field999;
                  int var9 = var7.field1003 - (var7.field9980 - class17.field237 + -class17.field237) * 256;
                  if (var8 != 0 || ~var9 != -1) {
                     var7.method4079((int)(2607.5945876176133D * Math.atan2((double)var8, (double)var9)) & 16383, -6541);
                  }

                  var7.field9987 = -1;
               }
            }

            return arg1.method4076(18545);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field7957[6] + arg0 + ',' + (arg1 != null ? field7957[1] : field7957[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(ILjea;Lce;I)V"
   )
   public final void method4159(int param1, class478 param2, class327 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(BLce;I)V"
   )
   private final void method4160(byte arg0, class327 arg1, int arg2) {
      try {
         ++field7949;
         class525.field7189 = arg1.field4571;
         if (arg0 != 77) {
            this.method4163((class327)null, -103);
         }

         arg1.method2542(25919, (float)arg2);
         arg1.method2545(-118);
         arg1.method2589(15, false);
         arg1.method2488(4, false);
         arg1.method2539(false);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7957[3] + arg0 + ',' + (arg1 != null ? field7957[1] : field7957[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(Lvi;ZB)V"
   )
   public static final void method4161(class569 arg0, boolean arg1, byte arg2) {
      boolean var3 = client.field4273;

      try {
         ++field7938;
         class120 var4 = arg0.method4086((byte)-127);
         if (arg0.field7848 == 0) {
            class343.field4911 = 0;
            arg0.field7849 = 0;
            class516.field7088 = -1;
         } else {
            if (~arg0.field7842 != 0 && arg0.field7758 == 0) {
               class61 var5 = class392.field5479.method1477(arg2 ^ 75, arg0.field7842);
               if (arg0.field7856 > 0 && var5.field676 == 0) {
                  class343.field4911 = 0;
                  class516.field7088 = -1;
                  ++arg0.field7849;
                  return;
               }

               if (arg0.field7856 <= 0 && var5.field657 == 0) {
                  class516.field7088 = -1;
                  class343.field4911 = 0;
                  ++arg0.field7849;
                  return;
               }
            }

            int var6 = 0;
            class130 var7;
            class61 var8;
            if (var3) {
               if (arg0.field7788[var6].field7439 != -1 && ~arg0.field7788[var6].field7440 >= ~class369.field5205) {
                  var7 = class516.field7085.method1486(arg0.field7788[var6].field7439, 87);
                  if (var7.field1635 && var7.field1642 != -1) {
                     var8 = class392.field5479.method1477(1, var7.field1642);
                     if (arg0.field7856 > 0 && var8.field676 == 0) {
                        ++arg0.field7849;
                        class343.field4911 = 0;
                        class516.field7088 = -1;
                        return;
                     }

                     if (arg0.field7856 <= 0 && ~var8.field657 == -1) {
                        ++arg0.field7849;
                        class516.field7088 = -1;
                        class343.field4911 = 0;
                        return;
                     }
                  }
               }

               ++var6;
            }

            while(true) {
               int var10000;
               byte var10001;
               if (~arg0.field7788.length >= ~var6) {
                  int var9 = arg0.field999;
                  var10000 = arg2;
                  var10001 = 74;
                  if (!var3) {
                     if (arg2 != 74) {
                        return;
                     }

                     int var10;
                     int var11;
                     int var12;
                     label417: {
                        var10 = arg0.field1003;
                        var11 = arg0.field7853[arg0.field7848 + -1] * 512 - -(arg0.method3060((byte)38) * 256);
                        var12 = arg0.field7855[arg0.field7848 + -1] * 512 + arg0.method3060((byte)38) * 256;
                        if (var11 <= var9) {
                           if (var9 > var11) {
                              if (~var10 > ~var12) {
                                 arg0.method4079(6144, -6541);
                                 if (!var3) {
                                    break label417;
                                 }
                              }

                              if (var10 <= var12) {
                                 arg0.method4079(4096, arg2 + -6615);
                                 if (!var3) {
                                    break label417;
                                 }
                              }

                              arg0.method4079(2048, -6541);
                              if (!var3) {
                                 break label417;
                              }
                           }

                           if (var10 < var12) {
                              arg0.method4079(8192, -6541);
                              if (!var3) {
                                 break label417;
                              }
                           }

                           if (~var10 >= ~var12) {
                              break label417;
                           }

                           arg0.method4079(0, -6541);
                           if (!var3) {
                              break label417;
                           }
                        }

                        if (~var10 > ~var12) {
                           arg0.method4079(10240, arg2 + -6615);
                           if (!var3) {
                              break label417;
                           }
                        }

                        if (var10 > var12) {
                           arg0.method4079(14336, arg2 ^ -6599);
                           if (!var3) {
                              break label417;
                           }
                        }

                        arg0.method4079(12288, -6541);
                     }

                     byte var13 = arg0.field7854[arg0.field7848 + -1];
                     if (!arg1 && (-var9 + var11 > 1024 || ~(-var9 + var11) > 1023 || ~(-var10 + var12) < -1025 || -var10 + var12 < -1024)) {
                        arg0.field1003 = var12;
                        arg0.field999 = var11;
                        arg0.method4077(arg0.field7755, 1, false);
                        class516.field7088 = -1;
                        --arg0.field7848;
                        class343.field4911 = 0;
                        if (~arg0.field7856 < -1) {
                           --arg0.field7856;
                        }

                        return;
                     }

                     int var14 = 16;
                     boolean var15 = true;
                     if (arg0 instanceof class680) {
                        var15 = ((class680)arg0).field9989.field5503;
                     }

                     label421: {
                        if (var15) {
                           int var16 = arg0.field7755 - arg0.field7829.field4115;
                           if (~var16 != -1 && ~arg0.field7780 == 0 && ~arg0.field7783 != -1) {
                              var14 = 8;
                           }

                           if (!arg1 && ~arg0.field7848 < -3) {
                              var14 = 24;
                           }

                           if (arg1 || arg0.field7848 <= 3) {
                              break label421;
                           }

                           var14 = 32;
                           if (!var3) {
                              break label421;
                           }
                        }

                        if (!arg1 && arg0.field7848 > 1) {
                           var14 = 24;
                        }

                        if (!arg1 && arg0.field7848 > 2) {
                           var14 = 32;
                        }
                     }

                     if (arg0.field7849 > 0 && arg0.field7848 > 1) {
                        --arg0.field7849;
                        var14 = 32;
                     }

                     label311: {
                        if (~var13 != -3) {
                           if (var13 != 0) {
                              break label311;
                           }

                           var14 >>= 1;
                           if (!var3) {
                              break label311;
                           }
                        }

                        var14 <<= 1;
                     }

                     if (~var4.field1488 != 0) {
                        label423: {
                           int var17 = var14 << 9;
                           if (arg0.field7848 == 1) {
                              int var18 = arg0.field7846 * arg0.field7846;
                              int var19 = (var11 < arg0.field999 ? arg0.field999 - var11 : var11 - arg0.field999) << 9;
                              int var20 = (arg0.field1003 <= var12 ? -arg0.field1003 + var12 : -var12 + arg0.field1003) << 9;
                              int var21 = var20 < var19 ? var19 : var20;
                              int var22 = var4.field1488 * var21 * 2;
                              if (~var18 < ~var22) {
                                 arg0.field7846 /= 2;
                                 if (!var3) {
                                    break label423;
                                 }
                              }

                              if (var21 >= var18 / 2) {
                                 if (var17 <= arg0.field7846) {
                                    break label423;
                                 }

                                 arg0.field7846 += var4.field1488;
                                 if (~var17 <= ~arg0.field7846) {
                                    break label423;
                                 }

                                 arg0.field7846 = var17;
                                 if (!var3) {
                                    break label423;
                                 }
                              }

                              arg0.field7846 -= var4.field1488;
                              if (~arg0.field7846 <= -1) {
                                 break label423;
                              }

                              arg0.field7846 = 0;
                              if (!var3) {
                                 break label423;
                              }
                           }

                           if (~var17 < ~arg0.field7846) {
                              arg0.field7846 += var4.field1488;
                              if (arg0.field7846 <= var17) {
                                 break label423;
                              }

                              arg0.field7846 = var17;
                              if (!var3) {
                                 break label423;
                              }
                           }

                           if (arg0.field7846 > 0) {
                              arg0.field7846 -= var4.field1488;
                              if (~arg0.field7846 > -1) {
                                 arg0.field7846 = 0;
                              }
                           }
                        }

                        var14 = arg0.field7846 >> 9;
                        if (~var14 > -2) {
                           var14 = 1;
                        }
                     }

                     label441: {
                        class343.field4911 = 0;
                        if (var9 != var11 || ~var10 != ~var12) {
                           label273: {
                              if (var11 > var9) {
                                 arg0.field999 += var14;
                                 class343.field4911 |= 4;
                                 if (~var11 <= ~arg0.field999) {
                                    break label273;
                                 }

                                 arg0.field999 = var11;
                                 if (!var3) {
                                    break label273;
                                 }
                              }

                              if (~var9 < ~var11) {
                                 arg0.field999 -= var14;
                                 class343.field4911 |= 8;
                                 if (var11 > arg0.field999) {
                                    arg0.field999 = var11;
                                 }
                              }
                           }

                           label266: {
                              if (~var14 <= -33) {
                                 class516.field7088 = 2;
                                 if (!var3) {
                                    break label266;
                                 }
                              }

                              class516.field7088 = var13;
                           }

                           if (~var10 <= ~var12) {
                              if (~var12 <= ~var10) {
                                 break label441;
                              }

                              arg0.field1003 -= var14;
                              class343.field4911 |= 2;
                              if (~var12 >= ~arg0.field1003) {
                                 break label441;
                              }

                              arg0.field1003 = var12;
                              if (!var3) {
                                 break label441;
                              }
                           }

                           class343.field4911 |= 1;
                           arg0.field1003 += var14;
                           if (arg0.field1003 <= var12) {
                              break label441;
                           }

                           arg0.field1003 = var12;
                           if (!var3) {
                              break label441;
                           }
                        }

                        class516.field7088 = -1;
                     }

                     if (arg0.field999 == var11 && ~arg0.field1003 == ~var12) {
                        if (arg0.field7856 > 0) {
                           --arg0.field7856;
                        }

                        --arg0.field7848;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg0.field7788[var6].field7439;
                  var10001 = -1;
               }

               if (var10000 != var10001 && ~arg0.field7788[var6].field7440 >= ~class369.field5205) {
                  var7 = class516.field7085.method1486(arg0.field7788[var6].field7439, 87);
                  if (var7.field1635 && var7.field1642 != -1) {
                     var8 = class392.field5479.method1477(1, var7.field1642);
                     if (arg0.field7856 > 0 && var8.field676 == 0) {
                        ++arg0.field7849;
                        class343.field4911 = 0;
                        class516.field7088 = -1;
                        return;
                     }

                     if (arg0.field7856 <= 0 && ~var8.field657 == -1) {
                        ++arg0.field7849;
                        class516.field7088 = -1;
                        class343.field4911 = 0;
                        return;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var24) {
         throw class534.method3846(var24, field7957[5] + (arg0 != null ? field7957[1] : field7957[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4162(int arg0) {
      try {
         this.field7942.method788((byte)44);
         ++field7953;
         if (arg0 != 18425) {
            this.field7937 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7957[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(Lce;I)V"
   )
   private final void method4163(class327 arg0, int arg1) {
      try {
         if (arg1 < 37) {
            field7940 = null;
         }

         arg0.method2488(4, true);
         ++field7951;
         arg0.method2589(15, true);
         if (class525.field7189 != arg0.field4571) {
            arg0.method557(class525.field7189);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7957[9] + (arg0 != null ? field7957[1] : field7957[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(ILce;)V"
   )
   private final void method4164(int arg0, class327 arg1) {
      try {
         ++field7947;
         class525.field7189 = arg1.field4571;
         arg1.method2576(28533);
         arg1.method2589(15, false);
         arg1.method2488(arg0 + 1387, false);
         if (arg0 == -1383) {
            arg1.method2539(false);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7957[12] + arg0 + ',' + (arg1 != null ? field7957[1] : field7957[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4165(int arg0) {
      try {
         if (arg0 != 0) {
            method4165(36);
         }

         field7940 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7957[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(Lce;IB)V"
   )
   private final void method4166(class327 param1, int param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lba",
      name = "<init>",
      descriptor = "(Lce;)V"
   )
   public class579(class327 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4167(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4168(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
