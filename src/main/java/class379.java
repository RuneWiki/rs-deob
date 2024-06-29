import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class379 extends class213 {
   @OriginalMember(
      owner = "client!ws",
      name = "D",
      descriptor = "I"
   )
   private int field5312 = 409;
   @OriginalMember(
      owner = "client!ws",
      name = "G",
      descriptor = "I"
   )
   private int field5308 = 4096;
   @OriginalMember(
      owner = "client!ws",
      name = "L",
      descriptor = "I"
   )
   private int field5311 = 4096;
   @OriginalMember(
      owner = "client!ws",
      name = "J",
      descriptor = "I"
   )
   private int field5309 = 4096;
   @OriginalMember(
      owner = "client!ws",
      name = "M",
      descriptor = "[I"
   )
   private int[] field5314 = new int[3];
   @OriginalMember(
      owner = "client!ws",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5315 = new String[]{method2922(method2921("Ul\u0015\u0011")), method2922(method2921("@7WS8")), method2922(method2921("LjW:m")), method2922(method2921("LjW7m")), method2922(method2921("LjW?m"))};
   @OriginalMember(
      owner = "client!ws",
      name = "I",
      descriptor = "I"
   )
   public static int field5307;
   @OriginalMember(
      owner = "client!ws",
      name = "F",
      descriptor = "I"
   )
   public static int field5310;
   @OriginalMember(
      owner = "client!ws",
      name = "K",
      descriptor = "I"
   )
   public static int field5313;

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 < 26) {
            return null;
         } else {
            ++field5313;
            int[][] var4 = super.field2644.method3543(-2, arg0);
            if (super.field2644.field6719) {
               int[][] var5 = this.method1615(true, arg0, 0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               int var13;
               int var14;
               if (var3) {
                  var13 = var6[var12];
                  var14 = -this.field5314[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }
               } else {
                  if (~class576.field7916 >= ~var12) {
                     return var4;
                  }

                  var13 = var6[var12];
                  var14 = -this.field5314[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }
               }

               while(true) {
                  label103: {
                     int var15;
                     int var16;
                     if (~var14 < ~this.field5312) {
                        var9[var12] = var13;
                        var10[var12] = var7[var12];
                        var11[var12] = var8[var12];
                        if (!var3) {
                           ++var12;
                           break label103;
                        }

                        var15 = var7[var12];
                        var16 = -this.field5314[1] + var15;
                        if (var16 < 0) {
                           var16 = -var16;
                        }
                     } else {
                        var15 = var7[var12];
                        var16 = -this.field5314[1] + var15;
                        if (var16 < 0) {
                           var16 = -var16;
                        }
                     }

                     int var17;
                     int var18;
                     if (~this.field5312 > ~var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                        if (var3) {
                           var17 = var8[var12];
                           var18 = -this.field5314[2] + var17;
                           if (~var18 > -1) {
                              var18 = -var18;
                           }

                           if (var18 > this.field5312) {
                              var9[var12] = var13;
                              var10[var12] = var15;
                              var11[var12] = var17;
                              if (var3) {
                                 var9[var12] = this.field5308 * var13 >> 12;
                                 var10[var12] = this.field5311 * var15 >> 12;
                                 var11[var12] = this.field5309 * var17 >> 12;
                                 ++var12;
                              } else {
                                 ++var12;
                              }
                           } else {
                              var9[var12] = this.field5308 * var13 >> 12;
                              var10[var12] = this.field5311 * var15 >> 12;
                              var11[var12] = this.field5309 * var17 >> 12;
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     } else {
                        var17 = var8[var12];
                        var18 = -this.field5314[2] + var17;
                        if (~var18 > -1) {
                           var18 = -var18;
                        }

                        if (var18 > this.field5312) {
                           var9[var12] = var13;
                           var10[var12] = var15;
                           var11[var12] = var17;
                           if (var3) {
                              var9[var12] = this.field5308 * var13 >> 12;
                              var10[var12] = this.field5311 * var15 >> 12;
                              var11[var12] = this.field5309 * var17 >> 12;
                              ++var12;
                           } else {
                              ++var12;
                           }
                        } else {
                           var9[var12] = this.field5308 * var13 >> 12;
                           var10[var12] = this.field5311 * var15 >> 12;
                           var11[var12] = this.field5309 * var17 >> 12;
                           ++var12;
                        }
                     }
                  }

                  if (~class576.field7916 >= ~var12) {
                     break;
                  }

                  var13 = var6[var12];
                  var14 = -this.field5314[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }
               }
            }

            return var4;
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field5315[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(Lvi;IIBI)V"
   )
   public static final void method2920(class569 arg0, int arg1, int arg2, byte arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         ++field5307;
         class120 var6 = arg0.method4086((byte)-123);
         int var7 = 16383 & -arg0.field7829.field4115 + arg0.field7755;
         if (arg3 <= -108) {
            if (arg2 != -1) {
               if (~arg0.field7780 != 0 && (var7 >= 10240 || ~var7 >= -2049)) {
                  label370: {
                     int var8 = 16383 & class777.field11302[arg1] - arg0.field7829.field4115;
                     if (arg2 == 2 && var6.field1457 != -1) {
                        if (var8 <= 2048 || var8 > 6144 || var6.field1505 == -1) {
                           if (var8 >= 10240 && ~var8 > -14337 && ~var6.field1483 != 0) {
                              arg0.field7822 = var6.field1483;
                              if (!var5) {
                                 break label370;
                              }
                           }

                           if (var8 <= 6144 || var8 >= 10240 || var6.field1485 == -1) {
                              arg0.field7822 = var6.field1457;
                              if (!var5) {
                                 break label370;
                              }
                           }

                           arg0.field7822 = var6.field1485;
                           if (!var5) {
                              break label370;
                           }
                        }

                        arg0.field7822 = var6.field1505;
                        if (!var5) {
                           break label370;
                        }
                     }

                     if (arg2 != 0 || ~var6.field1492 == 0) {
                        if (var8 > 2048 && ~var8 >= -6145 && var6.field1500 != -1) {
                           arg0.field7822 = var6.field1500;
                           if (!var5) {
                              break label370;
                           }
                        }

                        if (~var8 > -10241 || var8 >= 14336 || ~var6.field1482 == 0) {
                           if (~var8 < -6145 && var8 < 10240 && var6.field1474 != -1) {
                              arg0.field7822 = var6.field1474;
                              if (!var5) {
                                 break label370;
                              }
                           }

                           arg0.field7822 = var6.field1471;
                           if (!var5) {
                              break label370;
                           }
                        }

                        arg0.field7822 = var6.field1482;
                        if (!var5) {
                           break label370;
                        }
                     }

                     if (var8 <= 2048 || var8 > 6144 || ~var6.field1467 == 0) {
                        if (~var8 > -10241 || ~var8 <= -14337 || ~var6.field1496 == 0) {
                           if (var8 > 6144 && ~var8 > -10241 && ~var6.field1477 != 0) {
                              arg0.field7822 = var6.field1477;
                              if (!var5) {
                                 break label370;
                              }
                           }

                           arg0.field7822 = var6.field1492;
                           if (!var5) {
                              break label370;
                           }
                        }

                        arg0.field7822 = var6.field1496;
                        if (!var5) {
                           break label370;
                        }
                     }

                     arg0.field7822 = var6.field1467;
                  }

                  arg0.field7814 = false;
               } else if (var7 == 0 && arg0.field7793 <= 25) {
                  label374: {
                     if (arg2 == 2 && ~var6.field1457 != 0) {
                        arg0.field7822 = var6.field1457;
                        if (!var5) {
                           break label374;
                        }
                     }

                     if (arg2 != 0 || ~var6.field1492 == 0) {
                        arg0.field7822 = var6.field1471;
                        if (!var5) {
                           break label374;
                        }
                     }

                     arg0.field7822 = var6.field1492;
                  }

                  arg0.field7814 = false;
               } else {
                  arg0.field7814 = false;
                  if (~arg2 == -3 && ~var6.field1457 != 0) {
                     if (~arg4 > -1 && var6.field1464 != -1) {
                        arg0.field7822 = var6.field1464;
                     } else if (arg4 > 0 && ~var6.field1509 != 0) {
                        arg0.field7822 = var6.field1509;
                     } else {
                        arg0.field7822 = var6.field1457;
                     }
                  } else if (~arg2 == -1 && ~var6.field1492 != 0) {
                     if (~arg4 > -1 && ~var6.field1472 != 0) {
                        arg0.field7822 = var6.field1472;
                     } else if (~arg4 < -1 && var6.field1494 != -1) {
                        arg0.field7822 = var6.field1494;
                     } else {
                        arg0.field7822 = var6.field1492;
                     }
                  } else if (arg4 < 0 && ~var6.field1473 != 0) {
                     arg0.field7822 = var6.field1473;
                  } else if (~arg4 < -1 && ~var6.field1484 != 0) {
                     arg0.field7822 = var6.field1484;
                  } else {
                     arg0.field7822 = var6.field1471;
                  }
               }
            } else if (var7 == 0 && arg0.field7793 <= 25) {
               if (!arg0.field7814 || !var6.method1015(arg0.field7822, (byte)66)) {
                  arg0.field7822 = var6.method1014(25);
                  arg0.field7814 = ~arg0.field7822 != 0;
               }

            } else {
               label375: {
                  if (arg4 >= 0 || var6.field1462 == -1) {
                     if (arg4 <= 0 || ~var6.field1476 == 0) {
                        arg0.field7822 = var6.field1471;
                        if (!var5) {
                           break label375;
                        }
                     }

                     arg0.field7822 = var6.field1476;
                     if (!var5) {
                        break label375;
                     }
                  }

                  arg0.field7814 = false;
                  arg0.field7822 = var6.field1462;
               }

               arg0.field7814 = false;
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field5315[4] + (arg0 != null ? field5315[1] : field5315[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label60: {
            label59: {
               label58: {
                  label57: {
                     label56: {
                        if (arg2 != 0) {
                           if (~arg2 == -2) {
                              break label56;
                           }

                           if (arg2 == 2) {
                              break label57;
                           }

                           if (~arg2 == -4) {
                              break label58;
                           }

                           if (~arg2 != -5) {
                              break label60;
                           }

                           if (!var4) {
                              break label59;
                           }
                        }

                        this.field5312 = arg0.method4280(-19104);
                        if (!var4) {
                           break label60;
                        }
                     }

                     this.field5309 = arg0.method4280(-19104);
                     if (!var4) {
                        break label60;
                     }
                  }

                  this.field5311 = arg0.method4280(-19104);
                  if (!var4) {
                     break label60;
                  }
               }

               this.field5308 = arg0.method4280(-19104);
               if (!var4) {
                  break label60;
               }
            }

            int var6 = arg0.method4293(58);
            this.field5314[2] = class743.method5375(255, var6) >> 12;
            this.field5314[1] = class743.method5375(var6 >> 4, 4080);
            this.field5314[0] = class743.method5375(var6, 16711680) << 4;
         }

         ++field5310;
         int var7 = -102 % ((arg1 - 68) / 48);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5315[2] + (arg0 != null ? field5315[1] : field5315[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "<init>",
      descriptor = "()V"
   )
   public class379() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2922(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
