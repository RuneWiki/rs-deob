import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class504 {
   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7344 = new String[]{method3791(method3790("XhLo{")), method3791(method3790("XhLn{")), method3791(method3790("Yn\u000f\u0002 OoLA2T`\u0005I>_o\u0016\u0016'Cq\u0007\u0011\u001bUu1\\<NE\u000bM4Tn\u0011X:Y")), method3791(method3790("P`\u0014M}V`\fK}iu\u0010E=]")), method3791(method3790("Td\u0015|?[u\u0004C!WL:n6[o2^<Bx")), method3791(method3790("P`\u0014M+\u0014l\u0003B2]d\u000fI=N//n6[o1I!Ld\u0010o<To\u0007O'Sn\f")), method3791(method3790("rd\u0003\\\u0017Ol\u0012\f _u\u0017\\s_s\u0010C!\u0000")), method3791(method3790("P`\u0014M}V`\fK}ym\u0003_ ")), method3791(method3790("Yn\u000f\u0002 OoLA2T`\u0005I>_o\u0016\u0002\u001bUu1\\<NE\u000bM4Tn\u0011X:YL:n6[o")), method3791(method3790("]d\u0016|?[u\u0004C!WL I2TR\u0007^%_s")), method3791(method3790("P`\u0014M}V`\fK}W`\fM4_l\u0007B'\u0014L\u0003B2]d\u000fI=NG\u0003O'Us\u001b")), method3791(method3790("XhLm{")), method3791(method3790("Tt\u000e@")), method3791(method3790("A/L\u0002."))};
   @OriginalMember(
      owner = "client!bi",
      name = "d",
      descriptor = "D"
   )
   public static double field7337;
   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "I"
   )
   public static int field7338;
   @OriginalMember(
      owner = "client!bi",
      name = "f",
      descriptor = "I"
   )
   public static int field7339;
   @OriginalMember(
      owner = "client!bi",
      name = "g",
      descriptor = "I"
   )
   public static int field7340;
   @OriginalMember(
      owner = "client!bi",
      name = "c",
      descriptor = "I"
   )
   public static int field7341;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7342;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bi",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7343;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method3789(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(ZLoha;Z)V",
      line = 11
   )
   public static final void method3786(boolean arg0, class771 arg1, boolean arg2) {
      boolean var3 = client.field4564;

      try {
         ++field7340;
         class654 var4 = arg1.method5574(31482);
         if (~arg1.field11321 == -1) {
            arg1.field11315 = 0;
            class363.field5420 = 0;
            class551.field7957 = -1;
         } else {
            if (arg1.field11224 != -1 && ~arg1.field11295 == -1) {
               class295 var5 = class588.field8496.method3781(5, arg1.field11224);
               if (~arg1.field11316 < -1 && var5.field4107 == 0) {
                  ++arg1.field11315;
                  class551.field7957 = -1;
                  class363.field5420 = 0;
                  return;
               }

               if (arg1.field11316 <= 0 && ~var5.field4120 == -1) {
                  ++arg1.field11315;
                  class363.field5420 = 0;
                  class551.field7957 = -1;
                  return;
               }
            }

            int var6 = 0;
            class745 var7;
            class295 var8;
            if (var3) {
               if (arg1.field11279[var6].field9854 != -1 && arg1.field11279[var6].field9856 <= class29.field458) {
                  var7 = class760.field11030.method3423(arg1.field11279[var6].field9854, (byte)-14);
                  if (var7.field10745 && ~var7.field10740 != 0) {
                     var8 = class588.field8496.method3781(5, var7.field10740);
                     if (arg1.field11316 > 0 && ~var8.field4107 == -1) {
                        ++arg1.field11315;
                        class363.field5420 = 0;
                        class551.field7957 = -1;
                        return;
                     }

                     if (arg1.field11316 <= 0 && var8.field4120 == 0) {
                        class551.field7957 = -1;
                        ++arg1.field11315;
                        class363.field5420 = 0;
                        return;
                     }
                  }
               }

               ++var6;
            }

            while(true) {
               int var10000;
               int var10001;
               if (~arg1.field11279.length >= ~var6) {
                  int var9 = arg1.field4101;
                  int var10 = arg1.field4096;
                  int var11 = arg1.field11313[arg1.field11321 + -1] * 512 - -(256 * arg1.method3438(arg2));
                  int var12 = arg1.field11322[arg1.field11321 + -1] * 512 - -(arg1.method3438(false) * 256);
                  var10000 = ~var11;
                  var10001 = ~var9;
                  if (!var3) {
                     label409: {
                        if (var10000 < var10001) {
                           if (var10 >= var12) {
                              if (~var12 > ~var10) {
                                 arg1.method5578(-16384, 14336);
                                 if (!var3) {
                                    break label409;
                                 }
                              }

                              arg1.method5578(-16384, 12288);
                              if (!var3) {
                                 break label409;
                              }
                           }

                           arg1.method5578(-16384, 10240);
                           if (!var3) {
                              break label409;
                           }
                        }

                        if (~var11 > ~var9) {
                           if (~var10 > ~var12) {
                              arg1.method5578(-16384, 6144);
                              if (!var3) {
                                 break label409;
                              }
                           }

                           if (~var12 <= ~var10) {
                              arg1.method5578(-16384, 4096);
                              if (!var3) {
                                 break label409;
                              }
                           }

                           arg1.method5578(-16384, 2048);
                           if (!var3) {
                              break label409;
                           }
                        }

                        if (~var10 > ~var12) {
                           arg1.method5578(-16384, 8192);
                           if (!var3) {
                              break label409;
                           }
                        }

                        if (var10 > var12) {
                           arg1.method5578(-16384, 0);
                        }
                     }

                     byte var13 = arg1.field11318[arg1.field11321 + -1];
                     if (!arg0 && (~(var11 - var9) < -1025 || ~(-var9 + var11) > 1023 || ~(-var10 + var12) < -1025 || var12 - var10 < -1024)) {
                        arg1.field4101 = var11;
                        arg1.field4096 = var12;
                        arg1.method5577(-31308, arg1.field11293, false);
                        class363.field5420 = 0;
                        class551.field7957 = -1;
                        --arg1.field11321;
                        if (arg1.field11316 > 0) {
                           --arg1.field11316;
                        }

                        return;
                     }

                     int var14 = 16;
                     boolean var15 = true;
                     if (arg1 instanceof class451) {
                        var15 = ((class451)arg1).field6586.field270;
                     }

                     label412: {
                        if (!var15) {
                           if (!arg0 && arg1.field11321 > 1) {
                              var14 = 24;
                           }

                           if (arg0 || arg1.field11321 <= 2) {
                              break label412;
                           }

                           var14 = 32;
                           if (!var3) {
                              break label412;
                           }
                        }

                        int var16 = arg1.field11293 - arg1.field11236.field6800;
                        if (~var16 != -1 && arg1.field11263 == -1 && arg1.field11248 != 0) {
                           var14 = 8;
                        }

                        if (!arg0 && ~arg1.field11321 < -3) {
                           var14 = 24;
                        }

                        if (!arg0 && ~arg1.field11321 < -4) {
                           var14 = 32;
                        }
                     }

                     if (~arg1.field11315 < -1 && arg1.field11321 > 1) {
                        var14 = 32;
                        --arg1.field11315;
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

                     class363.field5420 = 0;
                     if (var4.field9540 != -1) {
                        label414: {
                           int var17 = var14 << 9;
                           if (arg1.field11321 != 1) {
                              if (arg1.field11317 < var17) {
                                 arg1.field11317 += var4.field9540;
                                 if (var17 >= arg1.field11317) {
                                    break label414;
                                 }

                                 arg1.field11317 = var17;
                                 if (!var3) {
                                    break label414;
                                 }
                              }

                              if (~arg1.field11317 >= -1) {
                                 break label414;
                              }

                              arg1.field11317 -= var4.field9540;
                              if (arg1.field11317 >= 0) {
                                 break label414;
                              }

                              arg1.field11317 = 0;
                              if (!var3) {
                                 break label414;
                              }
                           }

                           int var18 = arg1.field11317 * arg1.field11317;
                           int var19 = (~var11 <= ~arg1.field4101 ? -arg1.field4101 + var11 : -var11 + arg1.field4101) << 9;
                           int var20 = (var12 >= arg1.field4096 ? -arg1.field4096 + var12 : arg1.field4096 - var12) << 9;
                           int var21 = ~var20 > ~var19 ? var19 : var20;
                           int var22 = var4.field9540 * 2 * var21;
                           if (~var18 >= ~var22) {
                              if (var21 < var18 / 2) {
                                 arg1.field11317 -= var4.field9540;
                                 if (arg1.field11317 >= 0) {
                                    break label414;
                                 }

                                 arg1.field11317 = 0;
                                 if (!var3) {
                                    break label414;
                                 }
                              }

                              if (~var17 >= ~arg1.field11317) {
                                 break label414;
                              }

                              arg1.field11317 += var4.field9540;
                              if (var17 >= arg1.field11317) {
                                 break label414;
                              }

                              arg1.field11317 = var17;
                              if (!var3) {
                                 break label414;
                              }
                           }

                           arg1.field11317 /= 2;
                        }

                        var14 = arg1.field11317 >> 9;
                        if (var14 < 1) {
                           var14 = 1;
                        }
                     }

                     label417: {
                        if (~var9 == ~var11 && ~var10 == ~var12) {
                           class551.field7957 = -1;
                           if (!var3) {
                              break label417;
                           }
                        }

                        label266: {
                           if (~var11 < ~var9) {
                              class363.field5420 |= 4;
                              arg1.field4101 += var14;
                              if (~arg1.field4101 >= ~var11) {
                                 break label266;
                              }

                              arg1.field4101 = var11;
                              if (!var3) {
                                 break label266;
                              }
                           }

                           if (var9 > var11) {
                              class363.field5420 |= 8;
                              arg1.field4101 -= var14;
                              if (var11 > arg1.field4101) {
                                 arg1.field4101 = var11;
                              }
                           }
                        }

                        label259: {
                           if (~var14 > -33) {
                              class551.field7957 = var13;
                              if (!var3) {
                                 break label259;
                              }
                           }

                           class551.field7957 = 2;
                        }

                        if (~var10 > ~var12) {
                           arg1.field4096 += var14;
                           class363.field5420 |= 1;
                           if (arg1.field4096 <= var12) {
                              break label417;
                           }

                           arg1.field4096 = var12;
                           if (!var3) {
                              break label417;
                           }
                        }

                        if (~var12 > ~var10) {
                           arg1.field4096 -= var14;
                           class363.field5420 |= 2;
                           if (~var12 < ~arg1.field4096) {
                              arg1.field4096 = var12;
                           }
                        }
                     }

                     if (arg1.field4101 == var11 && ~arg1.field4096 == ~var12) {
                        --arg1.field11321;
                        if (~arg1.field11316 < -1) {
                           --arg1.field11316;
                           return;
                        }
                     }

                     return;
                  }
               } else {
                  var10000 = arg1.field11279[var6].field9854;
                  var10001 = -1;
               }

               if (var10000 != var10001 && arg1.field11279[var6].field9856 <= class29.field458) {
                  var7 = class760.field11030.method3423(arg1.field11279[var6].field9854, (byte)-14);
                  if (var7.field10745 && ~var7.field10740 != 0) {
                     var8 = class588.field8496.method3781(5, var7.field10740);
                     if (arg1.field11316 > 0 && ~var8.field4107 == -1) {
                        ++arg1.field11315;
                        class363.field5420 = 0;
                        class551.field7957 = -1;
                        return;
                     }

                     if (arg1.field11316 <= 0 && var8.field4120 == 0) {
                        class551.field7957 = -1;
                        ++arg1.field11315;
                        class363.field5420 = 0;
                        return;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var24) {
         throw class608.method4462(var24, field7344[11] + arg0 + ',' + (arg1 != null ? field7344[13] : field7344[12]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "(B)V",
      line = 326
   )
   public static final synchronized void method3787(byte arg0) {
      try {
         ++field7339;
         if (class70.field1255 == null) {
            try {
               if (arg0 != 104) {
                  method3787((byte)37);
               }

               Class var1 = Class.forName(field7344[10]);
               Method var2 = var1.getDeclaredMethod(field7344[9], (Class[])null);
               Object var3 = var2.invoke((Object)null, (Object[])null);
               Method var4 = var1.getMethod(field7344[4], Class.forName(field7344[5]), field7342 != null ? field7342 : (field7342 = method3789(field7344[3])), field7343 != null ? field7343 : (field7343 = method3789(field7344[7])));
               class70.field1255 = var4.invoke((Object)null, var3, field7344[2], Class.forName(field7344[8]));
            } catch (Exception var7) {
               System.out.println(field7344[6]);
               var7.printStackTrace();
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7344[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(B)V",
      line = 354
   )
   public static final void method3788(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3790(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3791(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
