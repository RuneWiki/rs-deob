import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class659 {
   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9615 = new String[]{method4821(method4820("\rqb1^")), method4821(method4820("\u0010j \u001c")), method4821(method4820("\u00051b^\u000b")), method4821(method4820("\rqb2^"))};
   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "I"
   )
   public static int field9612;
   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "I"
   )
   public static int field9613;
   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "I"
   )
   public static int field9614;

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "([IB[Ljava/lang/Object;)V",
      line = 5
   )
   public static final void method4818(int[] arg0, byte arg1, Object[] arg2) {
      try {
         ++field9612;
         class515.method3745(0, arg2, 32165, arg0.length + -1, arg0);
         if (arg1 <= 90) {
            method4818((int[])null, (byte)-89, (Object[])null);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9615[3] + (arg0 != null ? field9615[2] : field9615[1]) + ',' + arg1 + ',' + (arg2 != null ? field9615[2] : field9615[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(ILcl;Z)V",
      line = 22
   )
   public static final void method4819(int arg0, class279 arg1, boolean arg2) {
      boolean var3 = client.field4360;

      try {
         ++field9614;
         class425 var4 = arg1.method2119(false);
         if (~arg1.field3891 == -1) {
            class503.field7306 = 0;
            arg1.field3887 = 0;
            class230.field3235 = -1;
         } else {
            if (~arg1.field3866 != 0 && ~arg1.field3813 == -1) {
               class85 var5 = class190.field2702.method4411(arg1.field3866, 98);
               if (~arg1.field3886 < -1 && var5.field1112 == 0) {
                  class230.field3235 = -1;
                  class503.field7306 = 0;
                  ++arg1.field3887;
                  return;
               }

               if (~arg1.field3886 >= -1 && ~var5.field1128 == -1) {
                  class503.field7306 = 0;
                  ++arg1.field3887;
                  class230.field3235 = -1;
                  return;
               }
            }

            int var6 = 0;
            class686 var7;
            class85 var8;
            if (var3) {
               if (~arg1.field3843[var6].field9620 != 0 && ~class96.field1234 <= ~arg1.field3843[var6].field9623) {
                  var7 = class478.field6875.method1949(arg1.field3843[var6].field9620, 77);
                  if (var7.field10129 && var7.field10128 != -1) {
                     var8 = class190.field2702.method4411(var7.field10128, 108);
                     if (arg1.field3886 > 0 && ~var8.field1112 == -1) {
                        ++arg1.field3887;
                        class230.field3235 = -1;
                        class503.field7306 = 0;
                        return;
                     }

                     if (arg1.field3886 <= 0 && var8.field1128 == 0) {
                        ++arg1.field3887;
                        class503.field7306 = 0;
                        class230.field3235 = -1;
                        return;
                     }
                  }
               }

               ++var6;
            }

            while(true) {
               int var10000;
               int var10001;
               if (~arg1.field3843.length >= ~var6) {
                  int var9 = 127 / (arg0 / 49);
                  int var10 = arg1.field10694;
                  int var11 = arg1.field10693;
                  int var12 = arg1.field3888[arg1.field3891 + -1] * 512 - -(256 * arg1.method972(-1));
                  int var13 = arg1.field3884[arg1.field3891 - 1] * 512 - -(256 * arg1.method972(-1));
                  var10000 = var10;
                  var10001 = var12;
                  if (!var3) {
                     label410: {
                        if (var10 < var12) {
                           if (~var13 >= ~var11) {
                              if (var11 > var13) {
                                 arg1.method2114(-12281, 14336);
                                 if (!var3) {
                                    break label410;
                                 }
                              }

                              arg1.method2114(-12281, 12288);
                              if (!var3) {
                                 break label410;
                              }
                           }

                           arg1.method2114(-12281, 10240);
                           if (!var3) {
                              break label410;
                           }
                        }

                        if (~var12 <= ~var10) {
                           if (~var11 > ~var13) {
                              arg1.method2114(-12281, 8192);
                              if (!var3) {
                                 break label410;
                              }
                           }

                           if (var11 <= var13) {
                              break label410;
                           }

                           arg1.method2114(-12281, 0);
                           if (!var3) {
                              break label410;
                           }
                        }

                        if (var13 <= var11) {
                           if (var11 <= var13) {
                              arg1.method2114(-12281, 4096);
                              if (!var3) {
                                 break label410;
                              }
                           }

                           arg1.method2114(-12281, 2048);
                           if (!var3) {
                              break label410;
                           }
                        }

                        arg1.method2114(-12281, 6144);
                     }

                     byte var14 = arg1.field3889[arg1.field3891 + -1];
                     if (!arg2 && (~(var12 - var10) < -1025 || ~(var12 - var10) > 1023 || -var11 + var13 > 1024 || ~(-var11 + var13) > 1023)) {
                        arg1.field10694 = var12;
                        arg1.field10693 = var13;
                        arg1.method2122(-81, false, arg1.field3817);
                        --arg1.field3891;
                        class503.field7306 = 0;
                        if (arg1.field3886 > 0) {
                           --arg1.field3886;
                        }

                        class230.field3235 = -1;
                        return;
                     }

                     int var15 = 16;
                     boolean var16 = true;
                     if (arg1 instanceof class506) {
                        var16 = ((class506)arg1).field7333.field10934;
                     }

                     label413: {
                        if (var16) {
                           int var17 = -arg1.field3876.field5424 + arg1.field3817;
                           if (~var17 != -1 && ~arg1.field3857 == 0 && arg1.field3842 != 0) {
                              var15 = 8;
                           }

                           if (!arg2 && arg1.field3891 > 2) {
                              var15 = 24;
                           }

                           if (arg2 || arg1.field3891 <= 3) {
                              break label413;
                           }

                           var15 = 32;
                           if (!var3) {
                              break label413;
                           }
                        }

                        if (!arg2 && ~arg1.field3891 < -2) {
                           var15 = 24;
                        }

                        if (!arg2 && arg1.field3891 > 2) {
                           var15 = 32;
                        }
                     }

                     if (~arg1.field3887 < -1 && ~arg1.field3891 < -2) {
                        --arg1.field3887;
                        var15 = 32;
                     }

                     label305: {
                        if (~var14 == -3) {
                           var15 <<= 1;
                           if (!var3) {
                              break label305;
                           }
                        }

                        if (var14 == 0) {
                           var15 >>= 1;
                        }
                     }

                     if (var4.field6094 != -1) {
                        label415: {
                           int var18 = var15 << 9;
                           if (~arg1.field3891 != -2) {
                              if (var18 > arg1.field3890) {
                                 arg1.field3890 += var4.field6094;
                                 if (var18 >= arg1.field3890) {
                                    break label415;
                                 }

                                 arg1.field3890 = var18;
                                 if (!var3) {
                                    break label415;
                                 }
                              }

                              if (arg1.field3890 <= 0) {
                                 break label415;
                              }

                              arg1.field3890 -= var4.field6094;
                              if (arg1.field3890 >= 0) {
                                 break label415;
                              }

                              arg1.field3890 = 0;
                              if (!var3) {
                                 break label415;
                              }
                           }

                           int var19 = arg1.field3890 * arg1.field3890;
                           int var20 = (~arg1.field10694 >= ~var12 ? -arg1.field10694 + var12 : -var12 + arg1.field10694) << 9;
                           int var21 = (var13 < arg1.field10693 ? arg1.field10693 - var13 : -arg1.field10693 + var13) << 9;
                           int var22 = ~var20 >= ~var21 ? var21 : var20;
                           int var23 = var4.field6094 * 2 * var22;
                           if (~var23 <= ~var19) {
                              if (~var22 > ~(var19 / 2)) {
                                 arg1.field3890 -= var4.field6094;
                                 if (~arg1.field3890 <= -1) {
                                    break label415;
                                 }

                                 arg1.field3890 = 0;
                                 if (!var3) {
                                    break label415;
                                 }
                              }

                              if (var18 <= arg1.field3890) {
                                 break label415;
                              }

                              arg1.field3890 += var4.field6094;
                              if (var18 >= arg1.field3890) {
                                 break label415;
                              }

                              arg1.field3890 = var18;
                              if (!var3) {
                                 break label415;
                              }
                           }

                           arg1.field3890 /= 2;
                        }

                        var15 = arg1.field3890 >> 9;
                        if (~var15 > -2) {
                           var15 = 1;
                        }
                     }

                     label418: {
                        class503.field7306 = 0;
                        if (var10 == var12 && ~var11 == ~var13) {
                           class230.field3235 = -1;
                           if (!var3) {
                              break label418;
                           }
                        }

                        label265: {
                           if (~var10 <= ~var12) {
                              if (~var10 >= ~var12) {
                                 break label265;
                              }

                              arg1.field10694 -= var15;
                              class503.field7306 |= 8;
                              if (arg1.field10694 >= var12) {
                                 break label265;
                              }

                              arg1.field10694 = var12;
                              if (!var3) {
                                 break label265;
                              }
                           }

                           arg1.field10694 += var15;
                           class503.field7306 |= 4;
                           if (arg1.field10694 > var12) {
                              arg1.field10694 = var12;
                           }
                        }

                        label256: {
                           if (var15 < 32) {
                              class230.field3235 = var14;
                              if (!var3) {
                                 break label256;
                              }
                           }

                           class230.field3235 = 2;
                        }

                        if (var13 > var11) {
                           arg1.field10693 += var15;
                           class503.field7306 |= 1;
                           if (~var13 <= ~arg1.field10693) {
                              break label418;
                           }

                           arg1.field10693 = var13;
                           if (!var3) {
                              break label418;
                           }
                        }

                        if (~var11 < ~var13) {
                           arg1.field10693 -= var15;
                           class503.field7306 |= 2;
                           if (arg1.field10693 < var13) {
                              arg1.field10693 = var13;
                           }
                        }
                     }

                     if (arg1.field10694 == var12 && arg1.field10693 == var13) {
                        --arg1.field3891;
                        if (~arg1.field3886 < -1) {
                           --arg1.field3886;
                           return;
                        }
                     }

                     return;
                  }
               } else {
                  var10000 = arg1.field3843[var6].field9620;
                  var10001 = -1;
               }

               if ((var10000 ^ var10001) != 0 && ~class96.field1234 <= ~arg1.field3843[var6].field9623) {
                  var7 = class478.field6875.method1949(arg1.field3843[var6].field9620, 77);
                  if (var7.field10129 && var7.field10128 != -1) {
                     var8 = class190.field2702.method4411(var7.field10128, 108);
                     if (arg1.field3886 > 0 && ~var8.field1112 == -1) {
                        ++arg1.field3887;
                        class230.field3235 = -1;
                        class503.field7306 = 0;
                        return;
                     }

                     if (arg1.field3886 <= 0 && var8.field1128 == 0) {
                        ++arg1.field3887;
                        class503.field7306 = 0;
                        class230.field3235 = -1;
                        return;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field9615[0] + arg0 + ',' + (arg1 != null ? field9615[2] : field9615[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4820(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4821(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
