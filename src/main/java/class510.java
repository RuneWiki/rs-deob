import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class510 extends class721 {
   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7805 = new String[]{method3970(method3969("9 \u0016I+~")), method3970(method3969("9 \u0016I(~")), method3970(method3969("9 \u0016I-~")), method3970(method3969("9 \u0016I*~")), method3970(method3969("9 \u0016I/~")), method3970(method3969("83\u001b\u000b")), method3970(method3969("-hYI\u0013")), method3970(method3969("9 \u0016I,~"))};
   @OriginalMember(
      owner = "client!ofa",
      name = "n",
      descriptor = "Lgb;"
   )
   public static class29 field7800 = new class29();
   @OriginalMember(
      owner = "client!ofa",
      name = "l",
      descriptor = "Lgb;"
   )
   public static class29 field7801 = new class29();
   @OriginalMember(
      owner = "client!ofa",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field7802 = new int[5];
   @OriginalMember(
      owner = "client!ofa",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field7804 = false;
   @OriginalMember(
      owner = "client!ofa",
      name = "j",
      descriptor = "[Lgb;"
   )
   public static class29[] field7803 = new class29[]{field7801, field7800};
   @OriginalMember(
      owner = "client!ofa",
      name = "o",
      descriptor = "I"
   )
   public static int field7795;
   @OriginalMember(
      owner = "client!ofa",
      name = "f",
      descriptor = "I"
   )
   public static int field7796;
   @OriginalMember(
      owner = "client!ofa",
      name = "h",
      descriptor = "I"
   )
   public static int field7797;
   @OriginalMember(
      owner = "client!ofa",
      name = "k",
      descriptor = "I"
   )
   public static int field7798;
   @OriginalMember(
      owner = "client!ofa",
      name = "i",
      descriptor = "I"
   )
   public static int field7799;

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3963(byte arg0) {
      try {
         field7802 = null;
         field7800 = null;
         if (arg0 > -21) {
            method3964(-115, (byte)23);
         }

         field7801 = null;
         field7803 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7805[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "(IB)I"
   )
   public static final int method3964(int arg0, byte arg1) {
      try {
         ++field7799;
         int var4 = arg0 - 1;
         int var5 = var4 | var4 >>> 1;
         int var6 = var5 | var5 >>> 2;
         int var7 = var6 | var6 >>> 4;
         int var8 = var7 | var7 >>> 8;
         if (arg1 <= 95) {
            method3964(110, (byte)-26);
         }

         var4 = var8 | var8 >>> 16;
         return var4 + 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7805[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(ZIIIB)V"
   )
   public static final void method3965(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
      boolean var5 = client.field1786;

      try {
         ++field7798;
         if (arg0 || class335.field5146 != arg3 || ~class294.field4663 != ~arg1 || class464.field7054 != class426.field6582 && ~class687.field10213.field536.method5531(480102311) != -2) {
            class426.field6582 = class464.field7054;
            class294.field4663 = arg1;
            class335.field5146 = arg3;
            if (~class687.field10213.field536.method5531(480102311) == -2) {
               class426.field6582 = 0;
            }

            int var8;
            int var9;
            int var10000;
            label465: {
               class69.method532(1, arg2);
               class255.method2160(class577.field8538, 16, class351.field5356, true, class499.field7600.method3875(class493.field7455, 96), class564.field8381);
               int var6 = class120.field1694;
               class120.field1694 = (-(class513.field7828 >> 4) + class335.field5146) * 8;
               int var7 = class119.field1606;
               class119.field1606 = (-(class475.field7230 >> 4) + class294.field4663) * 8;
               class117.field1571 = class60.method452(class335.field5146 * 8, class294.field4663 * 8);
               class320.field4908 = null;
               var8 = class120.field1694 - var6;
               var9 = class119.field1606 - var7;
               if (arg2 == 12) {
                  int var10 = 0;
                  if (var5 || ~var10 > ~class522.field7961) {
                     do {
                        class795 var11 = class204.field3112[var10];
                        if (var11 == null) {
                           ++var10;
                        } else {
                           class466 var12 = var11.field11592;
                           int var13 = 0;
                           if (var5) {
                              var12.field1683[var13] -= var8;
                              var12.field1685[var13] -= var9;
                              ++var13;
                           }

                           while(true) {
                              while(var13 < 10) {
                                 var12.field1683[var13] -= var8;
                                 var12.field1685[var13] -= var9;
                                 ++var13;
                              }

                              var12.field1505 -= var8 * 512;
                              if (!var5) {
                                 var12.field1494 -= var9 * 512;
                                 ++var10;
                                 break;
                              }

                              var12.field1685[var13] -= var9;
                              ++var13;
                           }
                        }
                     } while(~var10 > ~class522.field7961);
                  }

                  if (!var5) {
                     break label465;
                  }
               }

               boolean var14 = false;
               class615.field8929 = 0;
               int var15 = (class513.field7828 - 1) * 512;
               int var16 = class475.field7230 * 512 + -512;
               int var17 = 0;
               if (var5 || class522.field7961 > var17) {
                  do {
                     class795 var18 = class204.field3112[var17];
                     if (var18 == null) {
                        ++var17;
                     } else {
                        class466 var19 = var18.field11592;
                        var19.field1494 -= var9 * 512;
                        var19.field1505 -= var8 * 512;
                        if (var19.field1505 >= 0 && var15 >= var19.field1505 && var19.field1494 >= 0 && var16 >= var19.field1494) {
                           label369: {
                              byte var20 = 1;
                              int var21 = 0;
                              if (var5) {
                                 var19.field1683[var21] -= var8;
                                 var19.field1685[var21] -= var9;
                                 var10000 = var19.field1683[var21];
                              } else if (var21 >= 10) {
                                 var10000 = var20;
                                 if (!var5) {
                                    break label369;
                                 }
                              } else {
                                 var19.field1683[var21] -= var8;
                                 var19.field1685[var21] -= var9;
                                 var10000 = var19.field1683[var21];
                              }

                              while(true) {
                                 if (var10000 >= 0) {
                                    if (var19.field1683[var21] < class513.field7828) {
                                       if (~var19.field1685[var21] <= -1) {
                                          if (~var19.field1685[var21] <= ~class475.field7230) {
                                             var20 = 0;
                                             ++var21;
                                          } else {
                                             ++var21;
                                          }
                                       } else {
                                          var20 = 0;
                                          ++var21;
                                       }
                                    } else {
                                       var20 = 0;
                                       ++var21;
                                    }
                                 } else {
                                    var20 = 0;
                                    ++var21;
                                 }

                                 if (var21 >= 10) {
                                    var10000 = var20;
                                    if (!var5) {
                                       break;
                                    }
                                 } else {
                                    var19.field1683[var21] -= var8;
                                    var19.field1685[var21] -= var9;
                                    var10000 = var19.field1683[var21];
                                 }
                              }
                           }

                           if (var10000 == 0) {
                              var19.method3618(-10000, (class344)null);
                              var14 = true;
                              var18.method2477(1976);
                              if (!var5) {
                                 ++var17;
                                 continue;
                              }
                           }

                           class334.field5139[class615.field8929++] = var19.field1640;
                           if (!var5) {
                              ++var17;
                              continue;
                           }
                        }

                        var19.method3618(-10000, (class344)null);
                        var14 = true;
                        var18.method2477(1976);
                        ++var17;
                     }
                  } while(class522.field7961 > var17);
               }

               if (var14) {
                  class522.field7961 = class501.field7665.method3146(true);
                  class501.field7665.method3145(class204.field3112, -92);
               }
            }

            int var22 = 0;
            if (var5 || ~var22 > -2049) {
               do {
                  class9 var23 = class484.field7370[var22];
                  if (var23 == null) {
                     ++var22;
                  } else {
                     int var24 = 0;
                     if (var5) {
                        var23.field1683[var24] -= var8;
                        var23.field1685[var24] -= var9;
                        ++var24;
                     }

                     while(true) {
                        while(var24 < 10) {
                           var23.field1683[var24] -= var8;
                           var23.field1685[var24] -= var9;
                           ++var24;
                        }

                        var23.field1494 -= var9 * 512;
                        if (!var5) {
                           var23.field1505 -= var8 * 512;
                           ++var22;
                           break;
                        }

                        var23.field1685[var24] -= var9;
                        ++var24;
                     }
                  }
               } while(~var22 > -2049);
            }

            class619[] var25 = class424.field6543;
            int var26 = 0;
            class619 var27;
            if (var5) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field9005 -= var9 * 512;
                  var27.field9010 -= var8 * 512;
               }

               ++var26;
            }

            while(~var26 > ~var25.length) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field9005 -= var9 * 512;
                  var27.field9010 -= var8 * 512;
               }

               ++var26;
            }

            class455 var28;
            label212: {
               var28 = (class455)class572.field8474.method4972((byte)-84);
               if (var5) {
                  var28.field6959 -= var9;
                  var28.field6970 -= var8;
               } else if (var28 == null) {
                  var28 = (class455)class91.field1317.method4972((byte)-84);
                  if (!var5) {
                     break label212;
                  }
               } else {
                  var28.field6959 -= var9;
                  var28.field6970 -= var8;
               }

               while(true) {
                  if (~class55.field683 != -5) {
                     if (var28.field6970 >= 0) {
                        if (var28.field6959 >= 0) {
                           if (~var28.field6970 > ~class513.field7828) {
                              if (~class475.field7230 >= ~var28.field6959) {
                                 var28.method2477(1976);
                              }
                           } else {
                              var28.method2477(1976);
                           }
                        } else {
                           var28.method2477(1976);
                        }
                     } else {
                        var28.method2477(1976);
                     }
                  }

                  var28 = (class455)class572.field8474.method4975((byte)126);
                  if (var28 == null) {
                     var28 = (class455)class91.field1317.method4972((byte)-84);
                     if (!var5) {
                        break;
                     }
                  } else {
                     var28.field6959 -= var9;
                     var28.field6970 -= var8;
                  }
               }
            }

            if (var5) {
               var28.field6970 -= var8;
               var28.field6959 -= var9;
               if (class55.field683 != 4) {
                  if (~var28.field6970 <= -1) {
                     if (var28.field6959 >= 0) {
                        if (var28.field6970 < class513.field7828) {
                           if (~class475.field7230 >= ~var28.field6959) {
                              var28.method2477(1976);
                           }
                        } else {
                           var28.method2477(1976);
                        }
                     } else {
                        var28.method2477(1976);
                     }
                  } else {
                     var28.method2477(1976);
                  }
               }

               var28 = (class455)class91.field1317.method4975((byte)108);
            }

            while(true) {
               byte var10001;
               if (var28 == null) {
                  var10000 = arg4;
                  var10001 = 7;
                  if (!var5) {
                     if (arg4 < 7) {
                        return;
                     }

                     if (class55.field683 != 4) {
                        class535 var29 = (class535)class429.field6620.method3139(121);
                        if (var5 || var29 != null) {
                           do {
                              int var30 = (int)(var29.field4655 & 16383L);
                              int var31 = -class120.field1694 + var30;
                              int var32 = (int)(var29.field4655 >> 14 & 16383L);
                              int var33 = var32 - class119.field1606;
                              if (~var31 > -1 || ~var33 > -1 || ~class513.field7828 >= ~var31 || class475.field7230 <= var33) {
                                 var29.method2477(1976);
                              }

                              var29 = (class535)class429.field6620.method3147(-21068);
                           } while(var29 != null);
                        }
                     }

                     if (class745.field11066 != 0) {
                        class581.field8579 -= var9;
                        class745.field11066 -= var8;
                     }

                     label454: {
                        class541.method4138(1000);
                        if (~arg2 == -13) {
                           if (~class648.field9340 == -5) {
                              class674.field10031 -= var8 * 512;
                              class149.field2262 -= var9 * 512;
                              class640.field9280 -= var8 * 512;
                              class520.field7902 -= var9 * 512;
                              if (!var5) {
                                 break label454;
                              }
                           }

                           class648.field9340 = 1;
                           class572.field8464 = -1;
                           class697.field10346 = -1;
                           if (!var5) {
                              break label454;
                           }
                        }

                        class103.field1437 -= var9;
                        class459.field7004 -= var8;
                        class691.field10259 -= var9 * 512;
                        class754.field11172 -= var8;
                        class621.field9036 -= var9;
                        class401.field6288 -= var8 * 512;
                        if (Math.abs(var8) > class513.field7828 || Math.abs(var9) > class475.field7230) {
                           class410.method3287(false);
                        }
                     }

                     class607.method4472(85);
                     class140.method1284((byte)71);
                     class777.field11405.method4981((byte)-74);
                     class425.field6557.method4981((byte)-115);
                     class346.field5304.method1814((byte)98);
                     class304.method2555((byte)63);
                     return;
                  }
               } else {
                  var28.field6970 -= var8;
                  var28.field6959 -= var9;
                  var10000 = class55.field683;
                  var10001 = 4;
               }

               if (var10000 != var10001) {
                  if (~var28.field6970 <= -1) {
                     if (var28.field6959 >= 0) {
                        if (var28.field6970 < class513.field7828) {
                           if (~class475.field7230 >= ~var28.field6959) {
                              var28.method2477(1976);
                           }
                        } else {
                           var28.method2477(1976);
                        }
                     } else {
                        var28.method2477(1976);
                     }
                  } else {
                     var28.method2477(1976);
                  }
               }

               var28 = (class455)class91.field1317.method4975((byte)108);
            }
         }
      } catch (RuntimeException var35) {
         throw class482.method3757(var35, field7805[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method3966(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field7795;
         if (arg0 >= -71) {
            method3963((byte)-100);
         }

         label42: {
            label41: {
               class425.method3371((byte)38);
               int var2 = class687.field10213.field512.method5524(480102311);
               if (var2 != 2) {
                  if (~var2 != -4) {
                     break label42;
                  }

                  if (!var1) {
                     break label41;
                  }
               }

               class559.method4229((byte)114, 100, class351.field5356, 100, class692.field10301, class316.field4878);
               if (!var1) {
                  break label42;
               }
            }

            class767.method5607(class316.field4878, class346.field5307, class351.field5356, class692.field10301, class314.field4860, 2, 2, 73);
         }

         if (class687.field10213.field512.method5525((byte)5)) {
            class404.method3250(class544.field8183, -2);
         }

         if (class351.field5356 != null) {
            class552.method4195((byte)-113);
         }

         class334.field5143 = class687.field10213.field512.method5524(480102311) != 0;
         class281.field4472 = class687.field10213.field512.method5525((byte)5);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7805[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(Lica;B)Ldu;"
   )
   public static final class370 method3967(class354 arg0, byte arg1) {
      try {
         if (arg1 > -48) {
            field7802 = null;
         }

         ++field7797;
         return new class370(arg0.method2869(false), arg0.method2869(false), arg0.method2869(false), arg0.method2869(false), arg0.method2872(2), arg0.method2855(-31007));
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7805[4] + (arg0 != null ? field7805[6] : field7805[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(IIZZB)I"
   )
   public static final int method3968(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
      boolean var5 = client.field1786;

      try {
         ++field7796;
         class503 var6 = class291.method2454(arg3, (byte)-26, arg0);
         if (var6 == null) {
            return 0;
         } else {
            int var7 = 0;
            if (arg4 > -33) {
               return -55;
            } else {
               int var8 = 0;
               int var10000;
               if (var5) {
                  var10000 = ~var6.field7680[var8];
               } else if (~var8 <= ~var6.field7680.length) {
                  var10000 = var7;
                  if (!var5) {
                     return var7;
                  }
               } else {
                  var10000 = ~var6.field7680[var8];
               }

               while(true) {
                  if (var10000 <= -1) {
                     if (~class247.field3763.field3661 < ~var6.field7680[var8]) {
                        class136 var9 = class247.field3763.method2058(-11, var6.field7680[var8]);
                        int var10 = var9.method1251(arg1, class610.field8879.method179(-1572, arg1).field710, 0);
                        if (arg2) {
                           var7 += var6.field7681[var8] * var10;
                           if (var5) {
                              var7 += var10;
                              ++var8;
                           } else {
                              ++var8;
                           }
                        } else {
                           var7 += var10;
                           ++var8;
                        }
                     } else {
                        ++var8;
                     }
                  } else {
                     ++var8;
                  }

                  if (~var8 <= ~var6.field7680.length) {
                     var10000 = var7;
                     if (!var5) {
                        return var7;
                     }
                  } else {
                     var10000 = ~var6.field7680[var8];
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field7805[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3969(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3970(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
