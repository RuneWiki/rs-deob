import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class45 extends class567 {
   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field516 = new String[]{method383(method382("7auvQ|")), method383(method382("!f")), method383(method382("!g")), method383(method382("7auvX|")), method383(method382("7auvZ|")), method383(method382("7auv_|")), method383(method382("/%:vd")), method383(method382(":~x4")), method383(method382("7auv[|")), method383(method382("7auv]|")), method383(method382("7auvS|")), method383(method382("7auv^|")), method383(method382("7auv\\|"))};
   @OriginalMember(
      owner = "client!cja",
      name = "x",
      descriptor = "Ldia;"
   )
   public static class245 field509 = new class245(512);
   @OriginalMember(
      owner = "client!cja",
      name = "r",
      descriptor = "I"
   )
   public static int field506;
   @OriginalMember(
      owner = "client!cja",
      name = "p",
      descriptor = "I"
   )
   public static int field507;
   @OriginalMember(
      owner = "client!cja",
      name = "v",
      descriptor = "I"
   )
   public static int field508;
   @OriginalMember(
      owner = "client!cja",
      name = "u",
      descriptor = "I"
   )
   public static int field510;
   @OriginalMember(
      owner = "client!cja",
      name = "t",
      descriptor = "I"
   )
   public static int field511;
   @OriginalMember(
      owner = "client!cja",
      name = "w",
      descriptor = "I"
   )
   public static int field512;
   @OriginalMember(
      owner = "client!cja",
      name = "o",
      descriptor = "I"
   )
   public static int field513;
   @OriginalMember(
      owner = "client!cja",
      name = "q",
      descriptor = "I"
   )
   public static int field514;
   @OriginalMember(
      owner = "client!cja",
      name = "s",
      descriptor = "I"
   )
   public static int field515;

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         if (arg0 != -1309) {
            this.method11((byte)3);
         }

         ++field513;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field516[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         ++field510;
         if (arg0 != 0) {
            this.method1(23, false);
         }

         super.field7728.method2508(false, (byte)109);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field516[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         super.field7728.method2581(arg1, -25);
         ++field507;
         super.field7728.method2593(0, arg2);
         if (!arg0) {
            this.method9(1, 105, 78);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field516[8] + arg0 + ',' + (arg1 != null ? field516[6] : field516[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(Lme;Laha;BII)V"
   )
   public static final void method379(class206 arg0, class404 arg1, byte arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         if (arg2 != 8) {
            field509 = null;
         }

         ++field511;
         if ((arg4 & 8) != 0) {
            class394.field5562[arg3] = arg0.method4341((byte)86);
         }

         byte var6 = -1;
         if ((arg4 & 2048) != 0) {
            arg1.field5689 = ~arg0.method4336((byte)126) == -2;
         }

         if (~(arg4 & 8192) != -1) {
            label283: {
               arg1.field7792 = arg0.method4290(108);
               arg1.field7797 = arg0.method4341((byte)86);
               arg1.field7756 = arg0.method4341((byte)86);
               arg1.field7834 = arg0.method4290(104);
               arg1.field7816 = arg0.method4299((byte)78) + class369.field5205;
               arg1.field7828 = arg0.method4299((byte)78) + class369.field5205;
               arg1.field7827 = arg0.method4286(128);
               if (arg1.field5659) {
                  arg1.field7834 += arg1.field5671;
                  arg1.field7848 = 0;
                  arg1.field7756 += arg1.field5685;
                  arg1.field7797 += arg1.field5671;
                  arg1.field7792 += arg1.field5685;
                  if (!var5) {
                     break label283;
                  }
               }

               arg1.field7756 += arg1.field7853[0];
               arg1.field7834 += arg1.field7855[0];
               arg1.field7792 += arg1.field7853[0];
               arg1.field7797 += arg1.field7855[0];
               arg1.field7848 = 1;
            }

            arg1.field7856 = 0;
         }

         if (~(131072 & arg4) != -1) {
            int var7 = arg0.method4275(-89);
            int var8 = arg0.method4311(arg2 ^ -103);
            if (~var7 == -65536) {
               var7 = -1;
            }

            int var9 = arg0.method4292(arg2 ^ 103);
            int var10 = 7 & var9;
            int var11 = (var9 & 122) >> 3;
            if (var11 == 15) {
               var11 = -1;
            }

            arg1.method4084(var7, var10, var8, false, 2, var11);
         }

         if (~(arg4 & 1024) != -1) {
            label275: {
               arg1.field7778 = arg0.method4291(-3);
               if (~arg1.field7778.charAt(0) == -127) {
                  arg1.field7778 = arg1.field7778.substring(1);
                  class127.method1069(2, arg1.field7778, arg1.method3059(false, -1), (byte)100, arg1.method3054(true, arg2 ^ 16712), arg1.field5664, 0);
                  if (!var5) {
                     break label275;
                  }
               }

               if (class278.field3709 == arg1) {
                  class127.method1069(2, arg1.field7778, arg1.method3059(false, -1), (byte)115, arg1.method3054(true, 16704), arg1.field5664, 0);
               }
            }

            arg1.field7807 = 0;
            arg1.field7774 = 0;
            arg1.field7767 = 150;
         }

         if ((1 & arg4) != 0) {
            arg1.field5660 = arg0.method4275(-119);
            if (~arg1.field7848 == -1) {
               arg1.method4079(arg1.field5660, arg2 ^ -6533);
               arg1.field5660 = -1;
            }
         }

         if ((arg4 & 128) != 0) {
            int var12 = arg0.method4280(arg2 + -19112);
            if (~var12 == -65536) {
               var12 = -1;
            }

            arg1.field7780 = var12;
         }

         if (~(arg4 & 512) != -1) {
            int[] var14;
            int[] var15;
            int[] var16;
            int var10000;
            label265: {
               int var13 = arg0.method4292(124);
               var14 = new int[var13];
               var15 = new int[var13];
               var16 = new int[var13];
               int var17 = 0;
               if (var5) {
                  var10000 = arg0.method4299((byte)78);
               } else if (var17 >= var13) {
                  var10000 = 24714;
                  if (!var5) {
                     break label265;
                  }
               } else {
                  var10000 = arg0.method4299((byte)78);
               }

               while(true) {
                  int var18 = var10000;
                  if (~var18 == -65536) {
                     var18 = -1;
                  }

                  var14[var17] = var18;
                  var15[var17] = arg0.method4286(128);
                  var16[var17] = arg0.method4310(2);
                  ++var17;
                  if (var17 >= var13) {
                     var10000 = 24714;
                     if (!var5) {
                        break;
                     }
                  } else {
                     var10000 = arg0.method4299((byte)78);
                  }
               }
            }

            class456.method3354(var10000, arg1, var14, var15, var16);
         }

         if ((arg4 & 262144) != 0) {
            arg1.field5691 = ~arg0.method4292(124) == -2;
         }

         if (~(4 & arg4) != -1) {
            int[] var19 = new int[4];
            int var20 = 0;
            if (var5) {
               var19[var20] = arg0.method4310(2);
               if (var19[var20] == 65535) {
                  var19[var20] = -1;
               }

               ++var20;
            }

            while(true) {
               if (~var20 <= -5) {
                  int var21 = arg0.method4286(128);
                  if (!var5) {
                     class186.method1416(arg1, arg2 + -7, var21, var19);
                     break;
                  }
               } else {
                  var19[var20] = arg0.method4310(2);
               }

               if (var19[var20] == 65535) {
                  var19[var20] = -1;
               }

               ++var20;
            }
         }

         if (~(65536 & arg4) != -1) {
            int var22 = arg0.method4286(128);
            int[] var23 = new int[var22];
            int[] var24 = new int[var22];
            int var25 = 0;
            if (var5 || var22 > var25) {
               do {
                  label220: {
                     int var26 = arg0.method4310(2);
                     if ((49152 & var26) == 49152) {
                        int var27 = arg0.method4310(2);
                        var23[var25] = class283.method2155(var26 << 16, var27);
                        if (!var5) {
                           break label220;
                        }
                     }

                     var23[var25] = var26;
                  }

                  var24[var25] = arg0.method4275(-99);
                  ++var25;
               } while(var22 > var25);
            }

            arg1.method4089(var23, var24, 0);
         }

         if ((arg4 & 32) != 0) {
            int var28 = arg0.method4288((byte)97);
            byte[] var29 = new byte[var28];
            class594 var30 = new class594(var29);
            arg0.method4328(var29, 0, var28, arg2 ^ -125);
            class731.field10708[arg3] = var30;
            arg1.method3055(var30, 47);
         }

         if ((16384 & arg4) != 0) {
            int var31 = arg0.method4299((byte)78);
            arg1.field7779 = arg0.method4336((byte)73);
            arg1.field7835 = arg0.method4286(arg2 + 120);
            arg1.field7826 = var31 & 32767;
            arg1.field7815 = (var31 & 32768) != 0;
            arg1.field7804 = class369.field5205 + arg1.field7826 - -arg1.field7779;
         }

         if (~(32768 & arg4) != -1) {
            var6 = arg0.method4340(409855200);
         }

         if (~(arg4 & 524288) != -1) {
            arg1.field7832 = arg0.method4340(409855200);
            arg1.field7790 = arg0.method4341((byte)86);
            arg1.field7811 = arg0.method4341((byte)86);
            arg1.field7803 = (byte)arg0.method4288((byte)119);
            arg1.field7806 = class369.field5205 - -arg0.method4299((byte)78);
            arg1.field7824 = class369.field5205 + arg0.method4310(arg2 ^ 10);
         }

         if (~(arg4 & 256) != -1) {
            int var32 = arg0.method4275(-67);
            int var33 = arg0.method4311(-106);
            if (~var32 == -65536) {
               var32 = -1;
            }

            int var34 = arg0.method4288((byte)72);
            int var35 = 7 & var34;
            int var36 = (123 & var34) >> 3;
            if (~var36 == -16) {
               var36 = -1;
            }

            arg1.method4084(var32, var35, var33, false, 1, var36);
         }

         if (~(64 & arg4) != -1) {
            int var37 = arg0.method4310(arg2 ^ 10);
            int var38 = arg0.method4311(77);
            if (~var37 == -65536) {
               var37 = -1;
            }

            int var39 = arg0.method4336((byte)-72);
            int var40 = var39 & 7;
            int var41 = var39 >> 3 & 15;
            if (var41 == 15) {
               var41 = -1;
            }

            arg1.method4084(var37, var40, var38, false, 0, var41);
         }

         if (~(arg4 & 16) != -1) {
            int var42 = arg0.method4292(113);
            if (~var42 < -1) {
               int var43 = 0;
               if (var5 || var43 < var42) {
                  do {
                     int var44;
                     int var45;
                     int var46;
                     int var47;
                     label194: {
                        var44 = -1;
                        var45 = -1;
                        var46 = -1;
                        var47 = arg0.method4338(false);
                        if (var47 != 32767) {
                           if (~var47 == -32767) {
                              var47 = -1;
                              if (!var5) {
                                 break label194;
                              }
                           }

                           var45 = arg0.method4338(false);
                           if (!var5) {
                              break label194;
                           }
                        }

                        var47 = arg0.method4338(false);
                        var45 = arg0.method4338(false);
                        var44 = arg0.method4338(false);
                        var46 = arg0.method4338(false);
                     }

                     int var48 = arg0.method4338(false);
                     int var49 = arg0.method4288((byte)60);
                     arg1.method4075(var44, var45, var46, class369.field5205, -43, var47, var49, var48);
                     ++var43;
                  } while(var43 < var42);
               }
            }
         }

         if (arg1.field5659) {
            if (~var6 == -128) {
               arg1.method3056(arg1.field5685, arg2 ^ 103, arg1.field5671);
            } else {
               byte var50;
               label176: {
                  if (var6 == -1) {
                     var50 = class394.field5562[arg3];
                     if (!var5) {
                        break label176;
                     }
                  }

                  var50 = var6;
               }

               class105.method935(arg1, arg2 ^ 16777207, var50);
               arg1.method3057(arg1.field5671, arg1.field5685, arg2 + -10, var50);
            }
         }
      } catch (RuntimeException var52) {
         throw class534.method3846(var52, field516[9] + (arg0 != null ? field516[6] : field516[7]) + ',' + (arg1 != null ? field516[6] : field516[7]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method380(int arg0) {
      try {
         if (arg0 == 23588) {
            field509 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field516[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method381(int arg0) {
      boolean var1 = client.field4273;

      try {
         int var4;
         int var5;
         boolean var6;
         int var7;
         int var9;
         label88: {
            ++field508;
            class677.field9944 = 0;
            class206 var2 = class605.field8474.field2788;
            int var3 = var2.method4288((byte)86);
            var4 = var2.method4280(-19104);
            var5 = var2.method4310(2);
            var6 = var2.method4286(arg0 + 120) == 1;
            class619.method4508((byte)90);
            class350.method2763((byte)40, var3);
            var7 = (-var2.field8243 + class605.field8474.field2798) / 16;
            class178.field2213 = new int[var7][4];
            int var8 = 0;
            if (var1) {
               var9 = 0;
               if (var1) {
                  class178.field2213[var8][var9] = var2.method4302(true);
                  ++var9;
               }
            } else {
               if (~var8 <= ~var7) {
                  class548.field7491 = new int[var7];
                  class125.field1565 = new byte[var7][];
                  class12.field142 = new int[var7];
                  class215.field2661 = new int[var7];
                  class325.field4367 = new byte[var7][];
                  class527.field7205 = new byte[var7][];
                  class794.field11597 = new int[var7];
                  class777.field11300 = new int[var7];
                  class239.field2982 = null;
                  class777.field11309 = new byte[var7][];
                  class740.field10786 = null;
                  var7 = 0;
                  var9 = (-(class507.field7030 >> 4) + var5) / arg0;
                  if (!var1) {
                     break label88;
                  }
               } else {
                  var9 = 0;
               }

               if (var1) {
                  class178.field2213[var8][var9] = var2.method4302(true);
                  ++var9;
               }
            }

            while(true) {
               while(var9 < 4) {
                  class178.field2213[var8][var9] = var2.method4302(true);
                  ++var9;
               }

               if (!var1) {
                  ++var8;
                  if (~var8 <= ~var7) {
                     class548.field7491 = new int[var7];
                     class125.field1565 = new byte[var7][];
                     class12.field142 = new int[var7];
                     class215.field2661 = new int[var7];
                     class325.field4367 = new byte[var7][];
                     class527.field7205 = new byte[var7][];
                     class794.field11597 = new int[var7];
                     class777.field11300 = new int[var7];
                     class239.field2982 = null;
                     class777.field11309 = new byte[var7][];
                     class740.field10786 = null;
                     var7 = 0;
                     var9 = (-(class507.field7030 >> 4) + var5) / arg0;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var9 = 0;
                  }

                  if (var1) {
                     class178.field2213[var8][var9] = var2.method4302(true);
                     ++var9;
                  }
               } else {
                  ++var9;
               }
            }
         }

         int var10000;
         byte var10001;
         if (var1) {
            var10000 = -(class215.field2667 >> 4) + var4;
            var10001 = 8;
         } else if (~(((class507.field7030 >> 4) + var5) / 8) > ~var9) {
            var10000 = var4;
            var10001 = 0;
            if (!var1) {
               class778.method5571(var4, false, 12, var5, var6);
               return;
            }
         } else {
            var10000 = -(class215.field2667 >> 4) + var4;
            var10001 = 8;
         }

         while(true) {
            int var10 = var10000 / var10001;
            if (var1) {
               class794.field11597[var7] = (var9 << 8) + var10;
               class777.field11300[var7] = class95.field1264.method740(-1, "m" + var9 + "_" + var10);
               class548.field7491[var7] = class95.field1264.method740(-1, "l" + var9 + "_" + var10);
               class12.field142[var7] = class95.field1264.method740(-1, field516[1] + var9 + "_" + var10);
               class215.field2661[var7] = class95.field1264.method740(-1, field516[2] + var9 + "_" + var10);
               ++var7;
               ++var10;
            }

            while(true) {
               while(~var10 >= ~((var4 - -(class215.field2667 >> 4)) / 8)) {
                  class794.field11597[var7] = (var9 << 8) + var10;
                  class777.field11300[var7] = class95.field1264.method740(-1, "m" + var9 + "_" + var10);
                  class548.field7491[var7] = class95.field1264.method740(-1, "l" + var9 + "_" + var10);
                  class12.field142[var7] = class95.field1264.method740(-1, field516[1] + var9 + "_" + var10);
                  class215.field2661[var7] = class95.field1264.method740(-1, field516[2] + var9 + "_" + var10);
                  ++var7;
                  ++var10;
               }

               if (!var1) {
                  ++var9;
                  if (~(((class507.field7030 >> 4) + var5) / 8) > ~var9) {
                     var10000 = var4;
                     var10001 = 0;
                     if (!var1) {
                        class778.method5571(var4, false, 12, var5, var6);
                        return;
                     }
                  } else {
                     var10000 = -(class215.field2667 >> 4) + var4;
                     var10001 = 8;
                  }
                  break;
               }

               ++var10;
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field516[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      try {
         ++field515;
         int var4 = 5 % ((63 - arg1) / 58);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field516[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         if (arg0 >= -64) {
            return true;
         } else {
            ++field506;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field516[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      try {
         ++field514;
         if (arg1 == 10286) {
            super.field7728.method2508(true, (byte)103);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field516[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "<init>",
      descriptor = "(Lce;)V"
   )
   public class45(class327 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method382(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method383(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
