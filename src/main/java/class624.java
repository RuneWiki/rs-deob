import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class624 extends class70 {
   @OriginalMember(
      owner = "client!cn",
      name = "J",
      descriptor = "I"
   )
   private int field9225 = 4;
   @OriginalMember(
      owner = "client!cn",
      name = "K",
      descriptor = "I"
   )
   private int field9224 = 4;
   @OriginalMember(
      owner = "client!cn",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9232 = new String[]{method4620(method4619("w:\u007fUc")), method4620(method4619("z!=|")), method4620(method4619("oz\u007f>6")), method4620(method4619("w:\u007fSc")), method4620(method4619("w:\u007fRc")), method4620(method4619("w:\u007f_c")), method4620(method4619("w:\u007fTc"))};
   @OriginalMember(
      owner = "client!cn",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field9227 = false;
   @OriginalMember(
      owner = "client!cn",
      name = "P",
      descriptor = "I"
   )
   public static int field9223;
   @OriginalMember(
      owner = "client!cn",
      name = "M",
      descriptor = "I"
   )
   public static int field9226;
   @OriginalMember(
      owner = "client!cn",
      name = "N",
      descriptor = "I"
   )
   public static int field9228;
   @OriginalMember(
      owner = "client!cn",
      name = "O",
      descriptor = "I"
   )
   public static int field9229;
   @OriginalMember(
      owner = "client!cn",
      name = "I",
      descriptor = "I"
   )
   public static int field9230;
   @OriginalMember(
      owner = "client!cn",
      name = "Q",
      descriptor = "I"
   )
   public static int field9231;

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9226;
         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5;
            int[] var7;
            label45: {
               var5 = class262.field3328 / this.field9225;
               int var6 = class99.field1313 / this.field9224;
               if (var6 <= 0) {
                  var7 = this.method690(-56, 0, 0);
                  if (!var3) {
                     break label45;
                  }
               }

               int var8 = arg1 % var6;
               var7 = this.method690(-105, 0, class99.field1313 * var8 / var6);
            }

            int var9 = 0;
            if (var3 || class262.field3328 > var9) {
               do {
                  if (var5 <= 0) {
                     var4[var9] = var7[0];
                     if (!var3) {
                        ++var9;
                        continue;
                     }
                  }

                  int var10 = var9 % var5;
                  var4[var9] = var7[class262.field3328 * var10 / var5];
                  ++var9;
               } while(class262.field3328 > var9);
            }
         }

         if (arg0 != -63) {
            this.field9225 = -83;
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field9232[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(Lwn;Z)I"
   )
   public static final int method4617(class576 arg0, boolean arg1) {
      try {
         if (arg1) {
            return 83;
         } else {
            ++field9231;
            if (class576.field8537 != arg0) {
               if (class576.field8539 != arg0) {
                  if (class576.field8540 != arg0) {
                     if (class576.field8541 != arg0) {
                        if (class576.field8542 != arg0) {
                           if (class576.field8543 == arg0) {
                              return 5125;
                           } else if (class576.field8544 != arg0) {
                              if (class576.field8545 == arg0) {
                                 return 5126;
                              } else {
                                 throw new IllegalArgumentException("");
                              }
                           } else {
                              return 5131;
                           }
                        } else {
                           return 5123;
                        }
                     } else {
                        return 5121;
                     }
                  } else {
                     return 5124;
                  }
               } else {
                  return 5122;
               }
            } else {
               return 5120;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9232[6] + (arg0 != null ? field9232[2] : field9232[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label37: {
            label36: {
               ++field9228;
               if (arg2 != 0) {
                  if (arg2 != 1) {
                     break label37;
                  }

                  if (!var4) {
                     break label36;
                  }
               }

               this.field9225 = arg1.method640(255);
               if (!var4) {
                  break label37;
               }
            }

            this.field9224 = arg1.method640(255);
         }

         if (arg0 >= -34) {
            this.method547(113, -17);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field9232[3] + arg0 + ',' + (arg1 != null ? field9232[2] : field9232[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(ILmb;IILsa;)V"
   )
   public static final void method4618(int arg0, class431 arg1, int arg2, int arg3, class783 arg4) {
      boolean var5 = client.field1481;

      try {
         ++field9223;
         byte var6 = -1;
         if (~(4 & arg2) != -1) {
            int var7 = arg1.method661((byte)-105);
            int var8 = arg1.method634((byte)25);
            if (~var7 == -65536) {
               var7 = -1;
            }

            int var9 = arg1.method626(255);
            int var10 = var9 & 7;
            int var11 = (var9 & 126) >> 3;
            if (~var11 == -16) {
               var11 = -1;
            }

            arg4.method87(var10, 0, var7, var11, var8, 0);
         }

         if ((arg2 & 524288) != 0) {
            int var12 = arg1.method642(false);
            if (~var12 == -65536) {
               var12 = -1;
            }

            int var13 = arg1.method592(-1914126896);
            int var14 = arg1.method633((byte)-15);
            int var15 = 7 & var14;
            int var16 = 15 & var14 >> 3;
            if (var16 == 15) {
               var16 = -1;
            }

            arg4.method87(var15, 0, var12, var16, var13, 2);
         }

         if ((8192 & arg2) != 0) {
            int var17 = arg1.method627((byte)-116);
            arg4.field158 = arg1.method622((byte)102);
            arg4.field192 = arg1.method626(255);
            arg4.field144 = (var17 & 32768) != 0;
            arg4.field136 = var17 & 32767;
            arg4.field195 = class413.field5678 + arg4.field158 - -arg4.field136;
         }

         if ((arg2 & 2) != 0) {
            int var18 = arg1.method627((byte)-121);
            if (~var18 == -65536) {
               var18 = -1;
            }

            arg4.field110 = var18;
         }

         if (~(arg2 & 1) != -1) {
            arg4.field11409 = arg1.method661((byte)-74);
            if (~arg4.field208 == -1) {
               arg4.method82(arg3 ^ 128, arg4.field11409);
               arg4.field11409 = -1;
            }
         }

         if ((131072 & arg2) != 0) {
            arg4.field11406 = arg1.method626(255) == 1;
         }

         if (~(32 & arg2) != -1) {
            int var19 = arg1.method640(arg3 ^ 127);
            byte[] var20 = new byte[var19];
            class66 var21 = new class66(var20);
            arg1.method658(var20, -1, 0, var19);
            class485.field6773[arg0] = var21;
            arg4.method5647(var21, -18387);
         }

         if (~(262144 & arg2) != -1) {
            int var22 = arg1.method626(255);
            int[] var23 = new int[var22];
            int[] var24 = new int[var22];
            int var25 = 0;
            if (var5 || ~var25 > ~var22) {
               do {
                  int var26 = arg1.method627((byte)-114);
                  if (~(var26 & 49152) == -49153) {
                     int var27 = arg1.method661((byte)-124);
                     var23[var25] = class2.method15(var26 << 16, var27);
                     if (var5) {
                        var23[var25] = var26;
                     }
                  } else {
                     var23[var25] = var26;
                  }

                  var24[var25] = arg1.method603(-2);
                  ++var25;
               } while(~var25 > ~var22);
            }

            arg4.method88((byte)73, var24, var23);
         }

         if (~(arg2 & 1024) != -1) {
            arg4.field11450 = arg1.method626(255) == 1;
         }

         if ((256 & arg2) != 0) {
            var6 = arg1.method648(arg3 + -250);
         }

         if ((2048 & arg2) != 0) {
            label240: {
               arg4.field113 = arg1.method606(11856);
               if (~arg4.field113.charAt(0) == -127) {
                  arg4.field113 = arg4.field113.substring(1);
                  class702.method5107(2, 0, arg4.field113, arg4.field11438, -18224, arg4.method5656(-128, false), arg4.method5655(true, (byte)13));
                  if (!var5) {
                     break label240;
                  }
               }

               if (class204.field2593 == arg4) {
                  class702.method5107(2, 0, arg4.field113, arg4.field11438, arg3 + -18352, arg4.method5656(-128, false), arg4.method5655(true, (byte)13));
               }
            }

            arg4.field131 = 0;
            arg4.field173 = 0;
            arg4.field190 = 150;
         }

         if ((arg2 & arg3) != 0) {
            int var28 = arg1.method633((byte)-15);
            if (~var28 < -1) {
               int var29 = 0;
               if (var5 || var28 > var29) {
                  do {
                     int var30;
                     int var31;
                     int var32;
                     int var33;
                     label230: {
                        var30 = -1;
                        var31 = -1;
                        var32 = -1;
                        var33 = arg1.method653((byte)118);
                        if (~var33 != -32768) {
                           if (var33 != 32766) {
                              var31 = arg1.method653((byte)24);
                              if (!var5) {
                                 break label230;
                              }
                           }

                           var33 = -1;
                           if (!var5) {
                              break label230;
                           }
                        }

                        var33 = arg1.method653((byte)-102);
                        var31 = arg1.method653((byte)-122);
                        var30 = arg1.method653((byte)-116);
                        var32 = arg1.method653((byte)113);
                     }

                     int var34 = arg1.method653((byte)-98);
                     int var35 = arg1.method633((byte)-15);
                     arg4.method86(var34, var33, 121, class413.field5678, var35, var31, var30, var32);
                     ++var29;
                  } while(var28 > var29);
               }
            }
         }

         if (~(arg2 & 512) != -1) {
            label214: {
               arg4.field156 = arg1.method602(-105);
               arg4.field188 = arg1.method628((byte)-12);
               arg4.field172 = arg1.method628((byte)-12);
               arg4.field176 = arg1.method602(-107);
               arg4.field181 = arg1.method642(false) - -class413.field5678;
               arg4.field122 = arg1.method661((byte)-76) - -class413.field5678;
               arg4.field189 = arg1.method626(arg3 ^ 127);
               arg4.field211 = 0;
               if (!arg4.field11417) {
                  arg4.field188 += arg4.field205[0];
                  arg4.field156 += arg4.field210[0];
                  arg4.field172 += arg4.field210[0];
                  arg4.field176 += arg4.field205[0];
                  arg4.field208 = 1;
                  if (!var5) {
                     break label214;
                  }
               }

               arg4.field188 += arg4.field11431;
               arg4.field176 += arg4.field11431;
               arg4.field208 = 0;
               arg4.field156 += arg4.field11408;
               arg4.field172 += arg4.field11408;
            }
         }

         if (~(4096 & arg2) != -1) {
            int var36 = arg1.method661((byte)-93);
            if (var36 == 65535) {
               var36 = -1;
            }

            int var37 = arg1.method592(-1914126896);
            int var38 = arg1.method640(arg3 + 127);
            int var39 = var38 & 7;
            int var40 = (127 & var38) >> 3;
            if (var40 == 15) {
               var40 = -1;
            }

            arg4.method87(var39, 0, var36, var40, var37, 1);
         }

         if (~(arg2 & 16) != -1) {
            int[] var41 = new int[4];
            int var42 = 0;
            if (var5) {
               var41[var42] = arg1.method603(class379.method3007(arg3, -130));
               if (~var41[var42] == -65536) {
                  var41[var42] = -1;
               }

               ++var42;
            }

            while(true) {
               int[] var10000;
               int var10001;
               if (~var42 <= -5) {
                  int var43 = arg1.method626(255);
                  var10000 = var41;
                  var10001 = -22952;
                  if (!var5) {
                     class705.method5126(var41, -22952, arg4, var43);
                     break;
                  }
               } else {
                  var41[var42] = arg1.method603(class379.method3007(arg3, -130));
                  var10000 = var41;
                  var10001 = var42;
               }

               if (~var10000[var10001] == -65536) {
                  var41[var42] = -1;
               }

               ++var42;
            }
         }

         if (~(65536 & arg2) != -1) {
            arg4.field161 = arg1.method648(88);
            arg4.field183 = arg1.method602(arg3 ^ -228);
            arg4.field184 = arg1.method624(0);
            arg4.field111 = (byte)arg1.method622((byte)81);
            arg4.field196 = class413.field5678 + arg1.method627((byte)-119);
            arg4.field116 = class413.field5678 + arg1.method642(false);
         }

         if (~(32768 & arg2) != -1) {
            int var44 = arg1.method622((byte)-92);
            int[] var45 = new int[var44];
            int[] var46 = new int[var44];
            int[] var47 = new int[var44];
            int var48 = 0;
            if (var5 || var44 > var48) {
               do {
                  int var49 = arg1.method627((byte)-125);
                  if (~var49 == -65536) {
                     var49 = -1;
                  }

                  var45[var48] = var49;
                  var46[var48] = arg1.method633((byte)-15);
                  var47[var48] = arg1.method627((byte)-123);
                  ++var48;
               } while(var44 > var48);
            }

            class172.method1480(arg4, 1, var46, var47, var45);
         }

         if ((arg2 & 64) != 0) {
            class430.field5850[arg0] = arg1.method648(123);
         }

         if (arg4.field11417) {
            if (~var6 == -128) {
               arg4.method5651((byte)-114, arg4.field11408, arg4.field11431);
            } else {
               byte var50;
               label170: {
                  if (var6 == -1) {
                     var50 = class430.field5850[arg0];
                     if (!var5) {
                        break label170;
                     }
                  }

                  var50 = var6;
               }

               class149.method1201((byte)1, arg4, var50);
               arg4.method5654(arg4.field11408, var50, -1, arg4.field11431);
            }
         }
      } catch (RuntimeException var52) {
         throw class93.method866(var52, field9232[0] + arg0 + ',' + (arg1 != null ? field9232[2] : field9232[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9232[2] : field9232[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "<init>",
      descriptor = "()V"
   )
   public class624() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9230;
         if (arg0 != -6752) {
            return null;
         } else {
            int[][] var4 = super.field926.method2860(arg0 + 6752, arg1);
            if (super.field926.field5048) {
               int var5;
               int[][] var8;
               label40: {
                  var5 = class262.field3328 / this.field9225;
                  int var6 = class99.field1313 / this.field9224;
                  if (~var6 < -1) {
                     int var7 = arg1 % var6;
                     var8 = this.method696(class99.field1313 * var7 / var6, 0, 32767);
                     if (!var3) {
                        break label40;
                     }
                  }

                  var8 = this.method696(0, 0, arg0 + 39519);
               }

               int[] var9 = var8[0];
               int[] var10 = var8[1];
               int[] var11 = var8[2];
               int[] var12 = var4[0];
               int[] var13 = var4[1];
               int[] var14 = var4[2];
               int var15 = 0;
               if (var3 || ~class262.field3328 < ~var15) {
                  do {
                     int var17;
                     if (~var5 < -1) {
                        int var16 = var15 % var5;
                        var17 = class262.field3328 * var16 / var5;
                        if (var3) {
                           var17 = 0;
                        }
                     } else {
                        var17 = 0;
                     }

                     var12[var15] = var9[var17];
                     var13[var15] = var10[var17];
                     var14[var15] = var11[var17];
                     ++var15;
                  } while(~class262.field3328 < ~var15);
               }
            }

            return var4;
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field9232[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4619(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4620(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
