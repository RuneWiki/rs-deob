import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class358 {
   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5421 = new String[]{method2802(method2801("\n~\u0018w ")), method2802(method2801("\u0012#\u0018\u0018u")), method2802(method2801("\u0007xZZ")), method2802(method2801("\n~\u0018q ")), method2802(method2801("\n~\u0018r ")), method2802(method2801("\n~\u0018s ")), method2802(method2801("\n~\u0018u ")), method2802(method2801("\n~\u0018p ")), method2802(method2801("\n~\u0018t "))};
   @OriginalMember(
      owner = "client!cs",
      name = "h",
      descriptor = "Lcj;"
   )
   public static class721 field5413 = new class721(12, 0, 1, 0);
   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "Lce;"
   )
   public static class324 field5415 = new class324(method2802(method2801(">Df")), 2);
   @OriginalMember(
      owner = "client!cs",
      name = "f",
      descriptor = "I"
   )
   public static int field5414;
   @OriginalMember(
      owner = "client!cs",
      name = "g",
      descriptor = "I"
   )
   public static int field5416;
   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "I"
   )
   public static int field5417;
   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "I"
   )
   public static int field5418;
   @OriginalMember(
      owner = "client!cs",
      name = "e",
      descriptor = "I"
   )
   public static int field5419;
   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "I"
   )
   public static int field5420;

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IZIIII)V",
      line = 11
   )
   public static final void method2794(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field5417;
         if (class353.field5360 == null) {
            class786.field11439.method609(arg2 ^ -18250, arg3, arg5, arg0, arg4, -16777216);
         } else if (class693.field10418.field9003 >= 0 && ~class693.field10418.field9003 > ~(class323.field4603 * 512) && ~class693.field10418.field9007 <= -1 && class178.field2197 * 512 > class693.field10418.field9007) {
            ++class213.field2703;
            if (class693.field10418 != null && ~(class693.field10418.field9003 - (256 * class693.field10418.method3046(114) + -256) >> 9) == ~class637.field9260 && ~(class693.field10418.field9007 + 256 + -(256 * class693.field10418.method3046(-119)) >> 9) == ~class639.field9316) {
               class639.field9316 = -1;
               class637.field9260 = -1;
               class634.method4561((byte)-73);
            }

            class346.method2711(arg2 ^ -18250);
            if (!arg1) {
               class321.method2431(true);
            }

            int var22;
            int var23;
            int var24;
            int var25;
            label271: {
               class777.method5595((byte)127);
               class747.method5441(arg5, true, arg3, 9, arg4, arg0);
               var25 = class350.field5301;
               var24 = class569.field8485;
               class221.field2828 = class221.field2834;
               var22 = class62.field774;
               var23 = class753.field11129;
               if (class675.field10142 != 1) {
                  if (class675.field10142 != 4) {
                     if (class675.field10142 != 5) {
                        break label271;
                     }

                     class282.method2155(var23, 1);
                     if (var6 == 0) {
                        break label271;
                     }
                  }

                  int var7 = (int)class317.field4533;
                  if (~(class781.field11398 >> 8) < ~var7) {
                     var7 = class781.field11398 >> 8;
                  }

                  if (class258.field3498[4] && ~var7 > ~(class368.field5539[4] - -128)) {
                     var7 = class368.field5539[4] - -128;
                  }

                  int var8 = (int)class56.field706 & 16383;
                  class442.method3345(-200 + class368.method2858(class650.field9486, (byte)-11, class537.field7853, class551.field8158), var8, var7, class573.field8527, var23, (var7 >> 3) * 3 + 600 << 2, (byte)112, class747.field11068);
                  if (var6 == 0) {
                     break label271;
                  }
               }

               int var9 = (int)class317.field4533;
               if (var9 < class781.field11398 >> 8) {
                  var9 = class781.field11398 >> 8;
               }

               if (class258.field3498[4] && var9 < class368.field5539[4] + 128) {
                  var9 = class368.field5539[4] - -128;
               }

               int var10 = 16383 & (int)class56.field706 - -class231.field2937;
               class442.method3345(-200 + class368.method2858(class693.field10418.field9007, (byte)-11, class693.field10418.field9003, class551.field8158), var10, var9, class573.field8527, var23, (var9 >> 3) * 3 + 600 << 2, (byte)101, class747.field11068);
            }

            int var11 = class731.field10844;
            int var12 = class733.field10871;
            int var13 = class232.field2947;
            int var14 = class713.field10637;
            int var15 = class292.field4078;
            int var16 = 0;
            int var17;
            if (var6 != 0) {
               if (class258.field3498[var16]) {
                  var17 = (int)((double)(-class599.field8808[var16]) + (double)(class599.field8808[var16] * 2 + 1) * Math.random() + Math.sin((double)class147.field1848[var16] / 100.0D * (double)class607.field8923[var16]) * (double)class368.field5539[var16]);
                  if (~var16 == -5) {
                     class713.field10637 += var17;
                     if (class713.field10637 >= 1024) {
                        if (class713.field10637 > 3072) {
                           class713.field10637 = 3072;
                           if (var6 != 0) {
                              class713.field10637 = 1024;
                           }
                        }
                     } else {
                        class713.field10637 = 1024;
                     }
                  }

                  if (~var16 == -3) {
                     class232.field2947 += var17 << 2;
                  }

                  if (var16 == 0) {
                     class731.field10844 += var17 << 2;
                  }

                  if (var16 == 3) {
                     class292.field4078 = 16383 & class292.field4078 + var17;
                  }

                  if (var16 == 1) {
                     class733.field10871 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }

            while(true) {
               int var10000;
               if (var16 >= 5) {
                  var10000 = class731.field10844;
                  if (var6 == 0) {
                     if (var10000 < 0) {
                        class731.field10844 = 0;
                     }

                     if (~class232.field2947 > -1) {
                        class232.field2947 = 0;
                     }

                     if (class731.field10844 > (class239.field3036 << 9) + -1) {
                        class731.field10844 = (class239.field3036 << 9) + -1;
                     }

                     if ((class220.field2796 << 9) + -1 < class232.field2947) {
                        class232.field2947 = (class220.field2796 << 9) + -1;
                     }

                     label275: {
                        class289.method2199(false);
                        class511.method3801(2118461347);
                        class786.field11439.method554(var25, var24, var25 - -var22, var24 - -var23);
                        class746.method5436(true, (byte)35);
                        if (!class446.field6785) {
                           class786.field11439.method561();
                           int var18 = class472.field7060;
                           if (class264.field3610 == null) {
                              class786.field11439.method597(var18);
                              if (var6 == 0) {
                                 break label275;
                              }
                           }

                           class264.field3610.method2963(var18, var22, var25, class713.field10637, (byte)59, var23, class149.field1862 << 3, class292.field4078, class786.field11439, var24);
                           if (var6 == 0) {
                              break label275;
                           }
                        }

                        class547.method4050(false, class472.field7060);
                        if (class221.field2828 != class152.field1916) {
                           class321.field4583 = true;
                        }

                        class152.field1916 = class221.field2828;
                     }

                     label276: {
                        class351.method2741(8);
                        class332.field4754.method1518(class731.field10844, class733.field10871, class232.field2947, 16383 & -class713.field10637, 16383 & -class292.field4078, 16383 & -class503.field7464);
                        class786.field11439.method550(class332.field4754);
                        class786.field11439.method630(var22 / 2 + var25, var23 / 2 + var24, class431.field6592 << 1, class431.field6592 << 1);
                        class587.method4329(var22 / 2 + var25, var23 / 2 + var24, class431.field6592 << 1, 1, class431.field6592 << 1);
                        class724.method5256(class733.field10871, 16383 & -class713.field10637, true, class731.field10844, -class292.field4078 & 16383, class232.field2947, 16383 & -class503.field7464);
                        byte var19 = ~class261.field3566.field9442.method1403(89) == -3 ? (byte)class213.field2703 : 1;
                        if (class446.field6785) {
                           class150.method1231(16383 & -class292.field4078, 16383 & -class713.field10637, 16383 & -class503.field7464, true);
                           class495.method3671(var19, class221.field2828, class507.field7489, class36.field394, class393.field5962, class465.field6982, class314.field4488, class693.field10418.field9007 >> 9, class748.field11096, class232.field2947, true, class693.field10418.field9003 >> 9, class115.field1383, class261.field3566.field9450.method2526(100) == 0, class693.field10418.field9010 + 1, arg2 ^ -18249, class731.field10844, class733.field10871);
                           if (var6 == 0) {
                              break label276;
                           }
                        }

                        class98.method862(class314.field4488, class731.field10844, class733.field10871, class232.field2947, class393.field5962, class748.field11096, class507.field7489, class36.field394, class465.field6982, class115.field1383, class693.field10418.field9010 + 1, var19, class693.field10418.field9003 >> 9, class693.field10418.field9007 >> 9, ~class261.field3566.field9450.method2526(89) == -1, true, !class88.field1076 ? -1 : class221.field2828, 0, false);
                     }

                     class351.method2741(8);
                     if (~class672.field10112 == -11) {
                        class155.method1284(256, var24, var25, var22, 256, var23, -16777216);
                        class610.method4445(256, 256, 61, var22, var23, var25, var24);
                        class412.method3147(var24, 256, var22, var23, var25, 10, 256);
                        class140.method1186(var24, (byte)75, var22, var25, var23);
                     }

                     class392.method2994();
                     class292.field4078 = var15;
                     class713.field10637 = var14;
                     class733.field10871 = var12;
                     class232.field2947 = var13;
                     class731.field10844 = var11;
                     if (class112.field1362 && ~class481.field7144.method1924(-122) == -1) {
                        class112.field1362 = false;
                     }

                     if (class112.field1362) {
                        class786.field11439.method609(arg2 + 18250, var23, var25, var22, var24, -16777216);
                        class183.method1433(class288.field4045, class786.field11439, 0, false, class417.field6389, class204.field2576.method1562((byte)-114, class728.field10827));
                     }

                     class746.method5436(false, (byte)35);
                     if (arg2 != -18249) {
                        method2799((class72[][][])null, 38);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = class258.field3498[var16];
               }

               if (var10000 != 0) {
                  var17 = (int)((double)(-class599.field8808[var16]) + (double)(class599.field8808[var16] * 2 + 1) * Math.random() + Math.sin((double)class147.field1848[var16] / 100.0D * (double)class607.field8923[var16]) * (double)class368.field5539[var16]);
                  if (~var16 == -5) {
                     class713.field10637 += var17;
                     if (class713.field10637 >= 1024) {
                        if (class713.field10637 > 3072) {
                           class713.field10637 = 3072;
                           if (var6 != 0) {
                              class713.field10637 = 1024;
                           }
                        }
                     } else {
                        class713.field10637 = 1024;
                     }
                  }

                  if (~var16 == -3) {
                     class232.field2947 += var17 << 2;
                  }

                  if (var16 == 0) {
                     class731.field10844 += var17 << 2;
                  }

                  if (var16 == 3) {
                     class292.field4078 = 16383 & class292.field4078 + var17;
                  }

                  if (var16 == 1) {
                     class733.field10871 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }
         } else {
            class786.field11439.method609(1, arg3, arg5, arg0, arg4, -16777216);
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field5421[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(I)V",
      line = 232
   )
   public static void method2795(int arg0) {
      try {
         if (arg0 >= 32) {
            field5415 = null;
            field5413 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5421[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(I)V",
      line = 243
   )
   public static final void method2796(int arg0) {
      try {
         ++field5419;
         if (!class307.field4371) {
            class280.field3895 += (-24.0F - class280.field3895) / 2.0F;
            if (arg0 != -200) {
               method2799((class72[][][])null, -26);
            }

            class630.field9159 = true;
            class307.field4371 = true;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5421[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZI)V",
      line = 261
   )
   public static final void method2797(boolean arg0, int arg1) {
      try {
         ++field5414;
         if (!arg0) {
            field5413 = null;
         }

         class403 var2 = class453.method3410((long)arg1, arg0, 11);
         var2.method3096((byte)-86);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5421[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IILhv;I)V",
      line = 276
   )
   public static final void method2798(int arg0, int arg1, class544 arg2, int arg3) {
      int var4 = client.field4530;

      try {
         if (arg3 < 24) {
            field5413 = null;
         }

         label124: {
            if (arg2.field8030 != 0) {
               if (arg2.field8030 == 1) {
                  arg2.field7948 = (-arg2.field7986 + arg1) / 2 + arg2.field7979;
                  if (var4 == 0) {
                     break label124;
                  }
               }

               if (~arg2.field8030 != -3) {
                  if (~arg2.field8030 == -4) {
                     arg2.field7948 = arg2.field7979 * arg1 >> 14;
                     if (var4 == 0) {
                        break label124;
                     }
                  }

                  if (~arg2.field8030 == -5) {
                     arg2.field7948 = (-arg2.field7986 + arg1) / 2 - -(arg2.field7979 * arg1 >> 14);
                     if (var4 == 0) {
                        break label124;
                     }
                  }

                  arg2.field7948 = -(arg2.field7979 * arg1 >> 14) + -arg2.field7986 + arg1;
                  if (var4 == 0) {
                     break label124;
                  }
               }

               arg2.field7948 = -arg2.field7986 + -arg2.field7979 + arg1;
               if (var4 == 0) {
                  break label124;
               }
            }

            arg2.field7948 = arg2.field7979;
         }

         label107: {
            if (~arg2.field8027 != -1) {
               if (~arg2.field8027 == -2) {
                  arg2.field7963 = (-arg2.field7954 + arg0) / 2 + arg2.field8037;
                  if (var4 == 0) {
                     break label107;
                  }
               }

               if (~arg2.field8027 != -3) {
                  if (~arg2.field8027 == -4) {
                     arg2.field7963 = arg2.field8037 * arg0 >> 14;
                     if (var4 == 0) {
                        break label107;
                     }
                  }

                  if (~arg2.field8027 == -5) {
                     arg2.field7963 = (arg2.field8037 * arg0 >> 14) + (-arg2.field7954 + arg0) / 2;
                     if (var4 == 0) {
                        break label107;
                     }
                  }

                  arg2.field7963 = -arg2.field7954 + arg0 + -(arg2.field8037 * arg0 >> 14);
                  if (var4 == 0) {
                     break label107;
                  }
               }

               arg2.field7963 = -arg2.field8037 + arg0 - arg2.field7954;
               if (var4 == 0) {
                  break label107;
               }
            }

            arg2.field7963 = arg2.field8037;
         }

         ++field5420;
         if (class384.field5876) {
            if (~client.method2388(arg2).field7097 != -1 || ~arg2.field7920 == -1) {
               label84: {
                  if (~arg2.field7963 > -1) {
                     arg2.field7963 = 0;
                     if (var4 == 0) {
                        break label84;
                     }
                  }

                  if (arg0 < arg2.field7963 + arg2.field7954) {
                     arg2.field7963 = arg0 - arg2.field7954;
                  }
               }

               if (~arg2.field7948 <= -1) {
                  if (~(arg2.field7948 - -arg2.field7986) < ~arg1) {
                     arg2.field7948 = arg1 - arg2.field7986;
                     return;
                  }
               } else {
                  arg2.field7948 = 0;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5421[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5421[1] : field5421[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "([[[Lqr;I)V",
      line = 346
   )
   public static final void method2799(class72[][][] arg0, int arg1) {
      int var2 = client.field4530;

      try {
         int var3 = 0;
         int var4 = 57 % ((arg1 - 44) / 39);
         if (var2 == 0 && var3 >= arg0.length) {
            ++field5416;
         } else {
            do {
               class72[][] var5 = arg0[var3];
               int var6 = 0;
               if (var2 != 0 || var5.length > var6) {
                  do {
                     int var7 = 0;
                     if (var2 != 0 || var7 < var5[var6].length) {
                        do {
                           class72 var8 = var5[var6][var7];
                           if (var8 != null) {
                              if (var8.field919 instanceof class86) {
                                 ((class86)var8.field919).method352(23291);
                              }

                              if (var8.field922 instanceof class86) {
                                 ((class86)var8.field922).method352(23291);
                                 if (var8.field913 instanceof class86) {
                                    ((class86)var8.field913).method352(23291);
                                 }
                              } else if (var8.field913 instanceof class86) {
                                 ((class86)var8.field913).method352(23291);
                              }

                              if (var8.field907 instanceof class86) {
                                 ((class86)var8.field907).method352(23291);
                                 if (var8.field915 instanceof class86) {
                                    ((class86)var8.field915).method352(23291);
                                 }
                              } else if (var8.field915 instanceof class86) {
                                 ((class86)var8.field915).method352(23291);
                              }

                              class389 var9 = var8.field910;
                              if (var2 == 0 && var9 == null) {
                                 ++var7;
                              } else {
                                 do {
                                    class741 var10 = var9.field5943;
                                    if (var10 instanceof class86) {
                                       ((class86)var10).method352(23291);
                                    }

                                    var9 = var9.field5942;
                                 } while(var9 != null);

                                 ++var7;
                              }
                           } else {
                              ++var7;
                           }
                        } while(var7 < var5[var6].length);
                     }

                     ++var6;
                  } while(var5.length > var6);
               }

               ++var3;
            } while(var3 < arg0.length);

            ++field5416;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field5421[6] + (arg0 != null ? field5421[1] : field5421[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(III)Z",
      line = 422
   )
   public static final boolean method2800(int arg0, int arg1, int arg2) {
      try {
         ++field5418;
         int var3 = 6 % ((arg0 - -11) / 54);
         return (arg1 & 32) != 0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5421[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2801(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2802(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
